package com.ss.android.lark.profile.func.user_profile.mvp;

import com.ss.android.lark.profile.func.user_profile.action.ActionBtnViewData;
import com.ss.android.lark.profile.func.user_profile.header.HeaderViewData;
import com.ss.android.lark.profile.func.user_profile.infos.BaseInfoViewData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u001bB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0014\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfileViewData;", "", "headerViewData", "Lcom/ss/android/lark/profile/func/user_profile/header/HeaderViewData;", "infoViewDataList", "", "Lcom/ss/android/lark/profile/func/user_profile/infos/BaseInfoViewData;", "actionBtnViewData", "Lcom/ss/android/lark/profile/func/user_profile/action/ActionBtnViewData;", "titleBarViewData", "Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfileViewData$TitleBarViewData;", "isNameCard", "", "(Lcom/ss/android/lark/profile/func/user_profile/header/HeaderViewData;Ljava/util/List;Lcom/ss/android/lark/profile/func/user_profile/action/ActionBtnViewData;Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfileViewData$TitleBarViewData;Z)V", "getActionBtnViewData", "()Lcom/ss/android/lark/profile/func/user_profile/action/ActionBtnViewData;", "getHeaderViewData", "()Lcom/ss/android/lark/profile/func/user_profile/header/HeaderViewData;", "getInfoViewDataList", "()Ljava/util/List;", "()Z", "showHolderPage", "getShowHolderPage", "setShowHolderPage", "(Z)V", "getTitleBarViewData", "()Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfileViewData$TitleBarViewData;", "TitleBarViewData", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.b.e */
public final class UserProfileViewData {

    /* renamed from: a */
    private boolean f130138a;

    /* renamed from: b */
    private final HeaderViewData f130139b;

    /* renamed from: c */
    private final List<BaseInfoViewData> f130140c;

    /* renamed from: d */
    private final ActionBtnViewData f130141d;

    /* renamed from: e */
    private final TitleBarViewData f130142e;

    /* renamed from: f */
    private final boolean f130143f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfileViewData$TitleBarViewData;", "", "isShowTitleBarRightBtn", "", "mShowTitleBarLeftBtn", "(ZZ)V", "()Z", "getMShowTitleBarLeftBtn", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.e$a */
    public static final class TitleBarViewData {

        /* renamed from: a */
        private final boolean f130144a;

        /* renamed from: b */
        private final boolean f130145b;

        /* renamed from: a */
        public final boolean mo179788a() {
            return this.f130144a;
        }

        /* renamed from: b */
        public final boolean mo179789b() {
            return this.f130145b;
        }

        public TitleBarViewData(boolean z, boolean z2) {
            this.f130144a = z;
            this.f130145b = z2;
        }
    }

    /* renamed from: b */
    public final HeaderViewData mo179784b() {
        return this.f130139b;
    }

    /* renamed from: c */
    public final List<BaseInfoViewData> mo179785c() {
        return this.f130140c;
    }

    /* renamed from: d */
    public final ActionBtnViewData mo179786d() {
        return this.f130141d;
    }

    /* renamed from: e */
    public final TitleBarViewData mo179787e() {
        return this.f130142e;
    }

    /* renamed from: a */
    public final boolean mo179783a() {
        return this.f130138a;
    }

    /* renamed from: a */
    public final void mo179782a(boolean z) {
        this.f130138a = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.lark.profile.func.user_profile.infos.b> */
    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileViewData(HeaderViewData headerViewData, List<? extends BaseInfoViewData> list, ActionBtnViewData actionBtnViewData, TitleBarViewData aVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(headerViewData, "headerViewData");
        Intrinsics.checkParameterIsNotNull(list, "infoViewDataList");
        Intrinsics.checkParameterIsNotNull(actionBtnViewData, "actionBtnViewData");
        Intrinsics.checkParameterIsNotNull(aVar, "titleBarViewData");
        this.f130139b = headerViewData;
        this.f130140c = list;
        this.f130141d = actionBtnViewData;
        this.f130142e = aVar;
        this.f130143f = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UserProfileViewData(com.ss.android.lark.profile.func.user_profile.header.HeaderViewData r7, java.util.List r8, com.ss.android.lark.profile.func.user_profile.action.ActionBtnViewData r9, com.ss.android.lark.profile.func.user_profile.mvp.UserProfileViewData.TitleBarViewData r10, boolean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r12 = r12 & 16
            if (r12 == 0) goto L_0x0007
            r11 = 0
            r5 = 0
            goto L_0x0008
        L_0x0007:
            r5 = r11
        L_0x0008:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.profile.func.user_profile.mvp.UserProfileViewData.<init>(com.ss.android.lark.profile.func.user_profile.header.HeaderViewData, java.util.List, com.ss.android.lark.profile.func.user_profile.action.ActionBtnViewData, com.ss.android.lark.profile.func.user_profile.b.e$a, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
