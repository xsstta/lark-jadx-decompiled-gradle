package com.ss.android.lark.dto.translate;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.MessageSource;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.translate.TranslateInfo;
import java.io.Serializable;

public class TranslateState implements Serializable {
    private int errorCode;
    private String errorMsg;
    private Message message;
    private String messageId;
    private MessageSource messageSource;
    private TranslateInfo translateInfo;

    public TranslateState() {
    }

    public String getError() {
        return this.errorMsg;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public Message getMessage() {
        return this.message;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public MessageSource getMessageSource() {
        return this.messageSource;
    }

    public TranslateInfo getTranslateInfo() {
        return this.translateInfo;
    }

    public boolean isError() {
        return TextUtils.isEmpty(this.errorMsg);
    }

    public void setError(String str) {
        this.errorMsg = str;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public void setMessage(Message message2) {
        this.message = message2;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setMessageSource(MessageSource messageSource2) {
        this.messageSource = messageSource2;
    }

    public void setTranslateInfo(TranslateInfo translateInfo2) {
        this.translateInfo = translateInfo2;
    }

    public TranslateState(String str) {
        this.messageId = str;
    }
}
