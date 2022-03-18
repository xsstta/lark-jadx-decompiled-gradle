package com.ss.android.lark.team.p2737f;

import android.content.Context;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.C55356a;
import com.ss.android.lark.team.entity.Team;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"selfIsOwner", "", "Lcom/ss/android/lark/team/entity/Team;", "getSelfIsOwner", "(Lcom/ss/android/lark/team/entity/Team;)Z", "toast", "", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "context", "Landroid/content/Context;", "im_team_team_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.f.e */
public final class C55443e {
    /* renamed from: a */
    public static final boolean m215116a(Team team) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(team, "$this$selfIsOwner");
        String a = C55356a.m214819a().mo144123b().mo144130a();
        if (a.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return Intrinsics.areEqual(String.valueOf(team.getOwnerId()), a);
    }

    /* renamed from: a */
    public static final void m215115a(ErrorResult errorResult, Context context) {
        Intrinsics.checkParameterIsNotNull(errorResult, "$this$toast");
        Intrinsics.checkParameterIsNotNull(context, "context");
        String displayMsg = errorResult.getDisplayMsg();
        if (displayMsg == null) {
            displayMsg = C51468a.m199493c(R.string.Lark_Legacy_NetworkErrorRetry, context);
        }
        UDToast.show(context, displayMsg);
    }
}
