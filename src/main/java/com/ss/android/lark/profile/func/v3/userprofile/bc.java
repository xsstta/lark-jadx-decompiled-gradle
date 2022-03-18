package com.ss.android.lark.profile.func.v3.userprofile;

import com.larksuite.arch.jack.Event;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
public final class bc extends Lambda implements Function1<UserProfileState, UserProfileState> {
    public static final bc INSTANCE = new bc();

    bc() {
        super(1);
    }

    public final UserProfileState invoke(UserProfileState azVar) {
        Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
        return UserProfileState.m204146a(azVar, null, null, null, new Event(UIHelper.getString(R.string.Lark_Contacts_DeletedToast)), null, null, new Event(Unit.INSTANCE), false, false, false, null, null, null, null, 16311, null);
    }
}
