package com.bytedance.ee.log;

class TimeCollector {

    private static class TimeTable {

        public static class ExceedLimitException extends Exception {
            public ExceedLimitException() {
                super("Lines exceed limit");
            }
        }
    }
}
