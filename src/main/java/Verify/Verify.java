package Verify;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Verify {
    private static final String VERIFICATION_PREFIX = "[Verification] ";

    public static void log(String msg, Object... args) {
        log.info(VERIFICATION_PREFIX + String.format(msg, args));
    }
}
