package Verify;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import page.GmailPage;

public class GmailPageVerify extends Verify {
    private GmailPage gmailPage = new GmailPage();

    public GmailPageVerify verifyTableIsDisplayed(){
        log("Table is displayed");
        gmailPage.getTableMsgContainer().shouldBe(Condition.visible);
        return this;
    }

    public GmailPageVerify verifyMsgListIsNotEmpty(){
        log("Msg list is not empty");
        gmailPage.getTrMsgList().shouldHave(CollectionCondition.sizeGreaterThan(0));
        return this;
    }

    public GmailPageVerify verifyMsgListIsEmpty(){
        log("Msg list is not empty");
        gmailPage.getTrMsgList().shouldHaveSize(0);
        return this;
    }
}
