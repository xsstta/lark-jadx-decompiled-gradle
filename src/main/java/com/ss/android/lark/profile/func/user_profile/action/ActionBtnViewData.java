package com.ss.android.lark.profile.func.user_profile.action;

import com.ss.android.lark.profile.func.user_profile.base.BaseViewData;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\f\"\u0004\b\u000f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/action/ActionBtnViewData;", "Lcom/ss/android/lark/profile/func/user_profile/base/BaseViewData;", "friendStatus", "", "isBlock", "", "isNameCard", "(IZZ)V", "getFriendStatus", "()I", "setFriendStatus", "(I)V", "()Z", "setBlock", "(Z)V", "setNameCard", "Companion", "FriendStatus", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ActionBtnViewData extends BaseViewData {

    /* renamed from: a */
    public static final Companion f130042a = new Companion(null);

    /* renamed from: b */
    private int f130043b;

    /* renamed from: c */
    private boolean f130044c;

    /* renamed from: d */
    private boolean f130045d;

    @Target({ElementType.FIELD, ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/action/ActionBtnViewData$FriendStatus;", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface FriendStatus {
    }

    public ActionBtnViewData() {
        this(0, false, false, 7, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/action/ActionBtnViewData$Companion;", "", "()V", "FRIEND_STATUS_DOUBLE", "", "FRIEND_STATUS_FORWARD", "FRIEND_STATUS_NONE", "FRIEND_STATUS_REVERSE", "FRIEND_STATUS_UNKNOWN", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.action.ActionBtnViewData$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo179599a() {
        return this.f130043b;
    }

    /* renamed from: c */
    public final boolean mo179604c() {
        return this.f130045d;
    }

    /* renamed from: b */
    public final boolean mo179603b() {
        return this.f130044c;
    }

    /* renamed from: b */
    public final void mo179602b(boolean z) {
        this.f130045d = z;
    }

    /* renamed from: a */
    public final void mo179600a(int i) {
        this.f130043b = i;
    }

    /* renamed from: a */
    public final void mo179601a(boolean z) {
        this.f130044c = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionBtnViewData(int r3, boolean r4, boolean r5) {
        /*
            r2 = this;
            java.lang.Class<com.ss.android.lark.profile.func.user_profile.action.ActionBtnViewData> r0 = com.ss.android.lark.profile.func.user_profile.action.ActionBtnViewData.class
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = "ActionBtnViewData::class.java.simpleName"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r2.<init>(r0)
            r2.f130043b = r3
            r2.f130044c = r4
            r2.f130045d = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.profile.func.user_profile.action.ActionBtnViewData.<init>(int, boolean, boolean):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ActionBtnViewData(int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2);
    }
}
