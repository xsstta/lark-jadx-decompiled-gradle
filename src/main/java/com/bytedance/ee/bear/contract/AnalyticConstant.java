package com.bytedance.ee.bear.contract;

public interface AnalyticConstant {

    public enum LinkLocation {
        CCM_DOCS("ccm_docs"),
        CCM_SHEET("ccm_sheet"),
        CCM_SLIDE("ccm_slide"),
        CCM_BITABLE("ccm_bitable"),
        CCM_MINDNOTE("ccm_mindnote"),
        CCM_DRIVE("ccm_drive"),
        CCM_WIKI("ccm_wiki"),
        DRIVESDK_CREATION("drivesdk_creation"),
        EMAIL_ATTACHMENT_PREVIEW("email_attachment_preview"),
        EVENT_ATTACHMENT_PREVIEW("event_attachment_preview"),
        EVENT_DESCRIPTION("event_description"),
        EMAIL_BODY("email_body"),
        OP_GADGET("op_gadget"),
        DOCS_SDK_COMMENT("docs_sdk_comment"),
        BITABLE_SDK_APPBUILDER("bitable_sdk_appbuilder"),
        MESSENGER_GROUP_ANNOUNCEMENT("messenger_group_announcement"),
        OPENDOC_CONFERENCE_RECORDS("opendoc_conference_records"),
        MESSENGER_LARK_FEED("messenger_lark_feed");
        
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
