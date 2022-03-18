package com.bytedance.geckox.debug;

public class GeckoDebugConfig {

    public enum AccessKeyType {
        ONLINE(1, "online"),
        LOCAL_TEST(0, "local test");
        
        int type;
        String value;

        public String getValue() {
            return this.value;
        }

        private AccessKeyType(int i, String str) {
            this.type = i;
            this.value = str;
        }
    }
}
