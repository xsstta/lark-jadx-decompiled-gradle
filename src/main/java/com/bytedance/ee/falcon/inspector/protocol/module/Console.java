package com.bytedance.ee.falcon.inspector.protocol.module;

import com.bytedance.ee.falcon.inspector.json.JsonProperty;
import com.bytedance.ee.falcon.inspector.json.JsonValue;

public class Console {

    /* renamed from: com.bytedance.ee.falcon.inspector.protocol.module.Console$b */
    public static class C12690b {
        @JsonProperty(required = true)

        /* renamed from: a */
        public MessageSource f33954a;
        @JsonProperty(required = true)

        /* renamed from: b */
        public MessageLevel f33955b;
        @JsonProperty(required = true)

        /* renamed from: c */
        public String f33956c;
    }

    /* renamed from: com.bytedance.ee.falcon.inspector.protocol.module.Console$c */
    public static class C12691c {
        @JsonProperty(required = true)

        /* renamed from: a */
        public C12690b f33957a;
    }

    public enum MessageLevel {
        LOG("log"),
        WARNING("warning"),
        ERROR("error"),
        DEBUG("debug");
        
        private final String mProtocolValue;

        @JsonValue
        public String getProtocolValue() {
            return this.mProtocolValue;
        }

        private MessageLevel(String str) {
            this.mProtocolValue = str;
        }
    }

    public enum MessageSource {
        XML("xml"),
        JAVASCRIPT("javascript"),
        NETWORK("network"),
        CONSOLE_API("console-api"),
        STORAGE("storage"),
        APPCACHE("appcache"),
        RENDERING("rendering"),
        CSS("css"),
        SECURITY("security"),
        OTHER("other");
        
        private final String mProtocolValue;

        @JsonValue
        public String getProtocolValue() {
            return this.mProtocolValue;
        }

        private MessageSource(String str) {
            this.mProtocolValue = str;
        }
    }

    /* renamed from: com.bytedance.ee.falcon.inspector.protocol.module.Console$a */
    public static class C12689a {
        @JsonProperty(required = true)

        /* renamed from: a */
        public String f33950a;
        @JsonProperty(required = true)

        /* renamed from: b */
        public String f33951b;
        @JsonProperty(required = true)

        /* renamed from: c */
        public int f33952c;
        @JsonProperty(required = true)

        /* renamed from: d */
        public int f33953d;

        public C12689a() {
        }

        public C12689a(String str, String str2, int i, int i2) {
            this.f33950a = str;
            this.f33951b = str2;
            this.f33952c = i;
            this.f33953d = i2;
        }
    }
}
