package com.bytedance.ee.falcon.inspector.protocol.module;

import com.bytedance.ee.falcon.inspector.json.JsonValue;
import com.bytedance.ee.falcon.inspector.protocol.AbstractC12688a;

public class Page implements AbstractC12688a {

    public enum ResourceType {
        DOCUMENT("Document"),
        STYLESHEET("Stylesheet"),
        IMAGE("Image"),
        FONT("Font"),
        SCRIPT("Script"),
        XHR("XHR"),
        WEBSOCKET("WebSocket"),
        OTHER("Other");
        
        private final String mProtocolValue;

        @JsonValue
        public String getProtocolValue() {
            return this.mProtocolValue;
        }

        private ResourceType(String str) {
            this.mProtocolValue = str;
        }
    }
}
