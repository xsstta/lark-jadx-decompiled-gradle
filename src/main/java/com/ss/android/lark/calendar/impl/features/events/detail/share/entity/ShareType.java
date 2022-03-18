package com.ss.android.lark.calendar.impl.features.events.detail.share.entity;

import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/share/entity/ShareType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "isThirdShareType", "", "value2ShareActionType", "Lcom/ss/android/lark/thirdshare/base/export/ShareActionType;", "LARK", "COPY", "CREATE_IMAGE", "WX", "WX_TIMELINE", "QQ", "WEIBO", "SYS", "SAVE_IMAGE", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum ShareType {
    LARK(0),
    COPY(1),
    CREATE_IMAGE(2),
    WX(3),
    WX_TIMELINE(4),
    QQ(5),
    WEIBO(6),
    SYS(7),
    SAVE_IMAGE(8);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    public final boolean isThirdShareType() {
        ShareType shareType = this;
        if (shareType == WX || shareType == WX_TIMELINE || shareType == QQ || shareType == WEIBO) {
            return true;
        }
        return false;
    }

    public final ShareActionType value2ShareActionType() {
        switch (this.value) {
            case 1:
                ShareActionType shareActionType = ShareActionType.COPY;
                Intrinsics.checkExpressionValueIsNotNull(shareActionType, "ShareActionType.COPY");
                return shareActionType;
            case 2:
            default:
                ShareActionType shareActionType2 = ShareActionType.SYS;
                Intrinsics.checkExpressionValueIsNotNull(shareActionType2, "ShareActionType.SYS");
                return shareActionType2;
            case 3:
                ShareActionType shareActionType3 = ShareActionType.WX;
                Intrinsics.checkExpressionValueIsNotNull(shareActionType3, "ShareActionType.WX");
                return shareActionType3;
            case 4:
                ShareActionType shareActionType4 = ShareActionType.WX_TIMELINE;
                Intrinsics.checkExpressionValueIsNotNull(shareActionType4, "ShareActionType.WX_TIMELINE");
                return shareActionType4;
            case 5:
                ShareActionType shareActionType5 = ShareActionType.QQ;
                Intrinsics.checkExpressionValueIsNotNull(shareActionType5, "ShareActionType.QQ");
                return shareActionType5;
            case 6:
                ShareActionType shareActionType6 = ShareActionType.WB;
                Intrinsics.checkExpressionValueIsNotNull(shareActionType6, "ShareActionType.WB");
                return shareActionType6;
            case 7:
                ShareActionType shareActionType7 = ShareActionType.SYS;
                Intrinsics.checkExpressionValueIsNotNull(shareActionType7, "ShareActionType.SYS");
                return shareActionType7;
            case 8:
                ShareActionType shareActionType8 = ShareActionType.SAVE;
                Intrinsics.checkExpressionValueIsNotNull(shareActionType8, "ShareActionType.SAVE");
                return shareActionType8;
        }
    }

    private ShareType(int i) {
        this.value = i;
    }
}
