package com.ss.android.lark.calendar.impl.features.events.detail.share.entity;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006&"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/share/entity/ShareItemViewData;", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/entity/ShareType;", "targetName", "", "avatarResId", "", "tintColorResId", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/share/entity/ShareType;Ljava/lang/String;ILjava/lang/Integer;)V", "getAvatarResId", "()I", "setAvatarResId", "(I)V", "getTargetName", "()Ljava/lang/String;", "setTargetName", "(Ljava/lang/String;)V", "getTintColorResId", "()Ljava/lang/Integer;", "setTintColorResId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getType", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/share/entity/ShareType;", "setType", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/share/entity/ShareType;)V", "component1", "component2", "component3", "component4", "copy", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/share/entity/ShareType;Ljava/lang/String;ILjava/lang/Integer;)Lcom/ss/android/lark/calendar/impl/features/events/detail/share/entity/ShareItemViewData;", "equals", "", "other", "hashCode", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.entity.a */
public final class ShareItemViewData {

    /* renamed from: a */
    private ShareType f79538a;

    /* renamed from: b */
    private String f79539b;

    /* renamed from: c */
    private int f79540c;

    /* renamed from: d */
    private Integer f79541d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareItemViewData)) {
            return false;
        }
        ShareItemViewData aVar = (ShareItemViewData) obj;
        return Intrinsics.areEqual(this.f79538a, aVar.f79538a) && Intrinsics.areEqual(this.f79539b, aVar.f79539b) && this.f79540c == aVar.f79540c && Intrinsics.areEqual(this.f79541d, aVar.f79541d);
    }

    public int hashCode() {
        ShareType shareType = this.f79538a;
        int i = 0;
        int hashCode = (shareType != null ? shareType.hashCode() : 0) * 31;
        String str = this.f79539b;
        int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f79540c) * 31;
        Integer num = this.f79541d;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "ShareItemViewData(type=" + this.f79538a + ", targetName=" + this.f79539b + ", avatarResId=" + this.f79540c + ", tintColorResId=" + this.f79541d + ")";
    }

    /* renamed from: a */
    public final ShareType mo113980a() {
        return this.f79538a;
    }

    /* renamed from: b */
    public final String mo113981b() {
        return this.f79539b;
    }

    /* renamed from: c */
    public final int mo113982c() {
        return this.f79540c;
    }

    /* renamed from: d */
    public final Integer mo113983d() {
        return this.f79541d;
    }

    public ShareItemViewData(ShareType shareType, String str, int i, Integer num) {
        Intrinsics.checkParameterIsNotNull(shareType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(str, "targetName");
        this.f79538a = shareType;
        this.f79539b = str;
        this.f79540c = i;
        this.f79541d = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShareItemViewData(ShareType shareType, String str, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(shareType, str, i, (i2 & 8) != 0 ? null : num);
    }
}
