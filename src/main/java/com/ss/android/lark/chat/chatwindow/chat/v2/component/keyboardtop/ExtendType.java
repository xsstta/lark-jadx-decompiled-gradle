package com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/ExtendType;", "", "value", "", "desc", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "getValue", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "ON_CALL", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public enum ExtendType {
    UNKNOWN(0, "Unknown"),
    ON_CALL(1, "OnCall");
    
    private final String desc;
    private final int value;

    public final String getDesc() {
        return this.desc;
    }

    public final int getValue() {
        return this.value;
    }

    private ExtendType(int i, String str) {
        this.value = i;
        this.desc = str;
    }
}
