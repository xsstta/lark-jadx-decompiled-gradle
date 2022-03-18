package com.ss.android.lark.profile.func.user_profile.action;

import android.text.TextUtils;
import com.ss.android.lark.profile.v2.entity.Profile;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/action/ActionBtnViewDataParser;", "", "()V", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.action.b */
public final class ActionBtnViewDataParser {

    /* renamed from: a */
    public static final Companion f130049a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/action/ActionBtnViewDataParser$Companion;", "", "()V", "parseProfile2ActionBtnViewData", "Lcom/ss/android/lark/profile/func/user_profile/action/ActionBtnViewData;", "profile", "Lcom/ss/android/lark/profile/v2/entity/Profile;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.action.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ActionBtnViewData mo179609a(Profile profile) {
            Intrinsics.checkParameterIsNotNull(profile, "profile");
            ActionBtnViewData actionBtnViewData = new ActionBtnViewData(0, false, false, 7, null);
            actionBtnViewData.mo179600a(profile.getUserInfo().getFriendStatus());
            actionBtnViewData.mo179601a(profile.getUserInfo().isBlocked());
            actionBtnViewData.mo179602b(!TextUtils.isEmpty(profile.getUserInfo().getNameCardId()));
            return actionBtnViewData;
        }
    }
}
