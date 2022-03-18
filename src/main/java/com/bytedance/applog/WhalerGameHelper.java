package com.bytedance.applog;

public class WhalerGameHelper {

    public enum Result {
        UNCOMPLETED("uncompleted"),
        SUCCESS("success"),
        FAIL("fail");
        
        final String gameResult;

        private Result(String str) {
            this.gameResult = str;
        }
    }
}
