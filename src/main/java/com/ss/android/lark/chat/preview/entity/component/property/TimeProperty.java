package com.ss.android.lark.chat.preview.entity.component.property;

import com.ss.android.lark.chat.entity.preview.BaseProperty;
import com.ss.android.lark.chat.entity.preview.Type;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0004\u0010\u000eR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\b\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/property/TimeProperty;", "Lcom/ss/android/lark/chat/entity/preview/BaseProperty;", "startTimeStamp", "", "isCountDown", "", "ntpActionId", "", "isEnd", "endTimeStamp", "(Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)V", "getEndTimeStamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNtpActionId", "()Ljava/lang/String;", "getStartTimeStamp", "equals", "other", "", "hashCode", "", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TimeProperty extends BaseProperty {
    private final Long endTimeStamp;
    private final Boolean isCountDown;
    private final Boolean isEnd;
    private final String ntpActionId;
    private final Long startTimeStamp;

    public final Long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    public final String getNtpActionId() {
        return this.ntpActionId;
    }

    public final Long getStartTimeStamp() {
        return this.startTimeStamp;
    }

    public final Boolean isCountDown() {
        return this.isCountDown;
    }

    public final Boolean isEnd() {
        return this.isEnd;
    }

    @Override // com.ss.android.lark.chat.entity.preview.BaseProperty, com.ss.android.lark.tangram.base.props.Props
    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = super.hashCode() * 31;
        Long l = this.startTimeStamp;
        int i5 = 0;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 31;
        Boolean bool = this.isCountDown;
        if (bool != null) {
            i2 = bool.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str = this.ntpActionId;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        Boolean bool2 = this.isEnd;
        if (bool2 != null) {
            i4 = bool2.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        Long l2 = this.endTimeStamp;
        if (l2 != null) {
            i5 = l2.hashCode();
        }
        return i9 + i5;
    }

    @Override // com.ss.android.lark.chat.entity.preview.BaseProperty, com.ss.android.lark.tangram.base.props.Props
    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if ((!Intrinsics.areEqual(cls2, cls)) || !super.equals(obj)) {
            return false;
        }
        if (obj != null) {
            TimeProperty timeProperty = (TimeProperty) obj;
            if (!(!Intrinsics.areEqual(this.startTimeStamp, timeProperty.startTimeStamp)) && !(!Intrinsics.areEqual(this.isCountDown, timeProperty.isCountDown)) && !(!Intrinsics.areEqual(this.ntpActionId, timeProperty.ntpActionId)) && !(!Intrinsics.areEqual(this.isEnd, timeProperty.isEnd)) && !(!Intrinsics.areEqual(this.endTimeStamp, timeProperty.endTimeStamp))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.preview.entity.component.property.TimeProperty");
    }

    public TimeProperty(Long l, Boolean bool, String str, Boolean bool2, Long l2) {
        super(Type.TIME);
        this.startTimeStamp = l;
        this.isCountDown = bool;
        this.ntpActionId = str;
        this.isEnd = bool2;
        this.endTimeStamp = l2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TimeProperty(Long l, Boolean bool, String str, Boolean bool2, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, (i & 2) != 0 ? false : bool, str, bool2, l2);
    }
}
