package com.larksuite.component.openplatform.core.plugin.messenger.sendmsg;

public enum ApiSendMsgCardError {
    NO_PARAMS(-1, "triggerCode or openChatIDs is required"),
    EXCEED_IDS(-2, "openChatIDs count exceed 10"),
    CARD_CONTENT_NULL(-3, "cardContent is null"),
    CARD_CONTENT_PARSE_FAILED(-4, "card json convert to pb error"),
    SEND_FAILED(-5, "System Error"),
    USER_CANCEL(-6, "user cancel send"),
    TRIGGER_CODE_INVALID(-7, "triggerCode is invalid"),
    NOT_SUPPORT_SCENE(-7, "need open app from chat keyborad"),
    SOME_IDS_INVALID(-8, "some part of openChatIDs are invalid"),
    UNKNOWN_ERROR(-9, "Unknown Error"),
    CHOOSE_CHAT_ERROR(-10, "choose chat error"),
    SEND_LEAVE_MESSAGE_FAILED(42406, "send additional message failed");
    
    private int code;
    private String msg;

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    private ApiSendMsgCardError(int i, String str) {
        this.code = i;
        this.msg = str;
    }
}
