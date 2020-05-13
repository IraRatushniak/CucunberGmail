package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;

public class GmailPage {
    SelenideElement tableMsgContainer = $$("table[role='grid']>tbody").findBy(Condition.visible);
    ElementsCollection trMsgList = tableMsgContainer.$$("tr");

    public SelenideElement getTableMsgContainer() {
        return tableMsgContainer;
    }

    public ElementsCollection getTrMsgList() {
        return trMsgList;
    }
}
