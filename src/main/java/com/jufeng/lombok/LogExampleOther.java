package com.jufeng.lombok;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogExampleOther {
    public static void main(String... args) {
        log.error("Something else is wrong here");
    }
}

/**
 *
 * 等同于
 * public class LogExampleOther {
 *   private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(LogExampleOther.class);
 *
 *   public static void main(String... args) {
 *     log.error("Something else is wrong here");
 *   }
 * }
 */
