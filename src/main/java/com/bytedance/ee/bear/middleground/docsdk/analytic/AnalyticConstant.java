package com.bytedance.ee.bear.middleground.docsdk.analytic;

public interface AnalyticConstant {

    public enum LinkLocation {
        EVENT_DESCRIPTION("event_description"),
        EMAIL_BODY("email_body"),
        OP_GADGET("op_gadget");
        
        String location;

        public String getLocation() {
            return this.location;
        }

        private LinkLocation(String str) {
            this.location = str;
        }
    }

    public enum LinkScene {
        CCM("ccm"),
        EMAIL("email"),
        GADGET("gadget"),
        CALENDAR("calendar"),
        MESSENGER("messenger");
        
        String scene;

        public String getScene() {
            return this.scene;
        }

        private LinkScene(String str) {
            this.scene = str;
        }
    }
}
