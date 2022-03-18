package com.ss.android.vc.service;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ss/android/vc/service/VideoChatCalleeType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/Integer;)V", "getValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "OPEN_CHATTER", "RESERVATION_PSTN_SIP", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public enum VideoChatCalleeType {
    OPEN_CHATTER(0),
    RESERVATION_PSTN_SIP(1);
    
    private final Integer value;

    public final Integer getValue() {
        return this.value;
    }

    private VideoChatCalleeType(Integer num) {
        this.value = num;
    }
}
