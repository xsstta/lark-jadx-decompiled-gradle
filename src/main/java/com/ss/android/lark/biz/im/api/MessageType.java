package com.ss.android.lark.biz.im.api;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/biz/im/api/MessageType;", "", "intType", "", "(Ljava/lang/String;II)V", "getIntType", "()I", "getValue", GrsBaseInfo.CountryCodeSource.UNKNOWN, "AT", "URGENT", "FOCUS", "Companion", "im_api_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum MessageType {
    UNKNOWN(0),
    AT(1),
    URGENT(2),
    FOCUS(3);
    
    public static final Companion Companion = new Companion(null);
    private final int intType;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/biz/im/api/MessageType$Companion;", "", "()V", "valueOf", "Lcom/ss/android/lark/biz/im/api/MessageType;", ShareHitPoint.f121869d, "", "im_api_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.biz.im.api.MessageType$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getIntType() {
        return this.intType;
    }

    public final int getValue() {
        return this.intType;
    }

    private MessageType(int i) {
        this.intType = i;
    }
}
