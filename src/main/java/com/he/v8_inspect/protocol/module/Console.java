package com.he.v8_inspect.protocol.module;

import com.he.v8_inspect.json.JsonProperty;
import com.he.v8_inspect.json.JsonValue;

public class Console {

    public static class ConsoleMessage {
        @JsonProperty(required = true)
        public MessageLevel level;
        @JsonProperty(required = true)
        public MessageSource source;
        @JsonProperty(required = true)
        public String text;
    }

    public static class MessageAddedRequest {
        @JsonProperty(required = true)
        public ConsoleMessage message;
    }

    public static class CallFrame {
        @JsonProperty(required = true)
        public int columnNumber;
        @JsonProperty(required = true)
        public String functionName;
        @JsonProperty(required = true)
        public int lineNumber;
        @JsonProperty(required = true)
        public String url;

        public CallFrame() {
        }

        public CallFrame(String str, String str2, int i, int i2) {
            this.functionName = str;
            this.url = str2;
            this.lineNumber = i;
            this.columnNumber = i2;
        }
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
}
