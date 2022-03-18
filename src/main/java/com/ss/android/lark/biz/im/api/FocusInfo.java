package com.ss.android.lark.biz.im.api;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/biz/im/api/FocusInfo;", "", "messageId", "", "(J)V", "getMessageId", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "im_api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.biz.im.api.f */
public final class FocusInfo {

    /* renamed from: a */
    private final long f74244a;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FocusInfo) && this.f74244a == ((FocusInfo) obj).f74244a;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f74244a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return "FocusInfo(messageId=" + this.f74244a + ")";
    }

    public FocusInfo(long j) {
        this.f74244a = j;
    }
}
