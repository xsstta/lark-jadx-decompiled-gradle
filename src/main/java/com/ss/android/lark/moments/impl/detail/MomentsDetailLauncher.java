package com.ss.android.lark.moments.impl.detail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.moments.impl.common.utils.C47282k;
import com.ss.android.lark.moments.impl.hitpoint.MomentsAppreciableHitPoint;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ss.android.lark.moments.impl.detail.e */
public final class MomentsDetailLauncher {

    /* renamed from: a */
    public static final MomentsDetailLauncher f119660a = new MomentsDetailLauncher();

    private MomentsDetailLauncher() {
    }

    /* renamed from: a */
    public final void mo166654a(Fragment fragment, Context context, String str, boolean z, String str2, String str3, boolean z2, boolean z3) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "postId");
        Intrinsics.checkParameterIsNotNull(str2, "jumpCommentId");
        Intrinsics.checkParameterIsNotNull(str3, ShareHitPoint.f121868c);
        C47282k.m187260a(fragment, m187943a(context, str, z, str2, z2, z3), 996);
        MomentsHitPoint.f119720a.mo166845c(str, str3);
        MomentsAppreciableHitPoint.f119684a.mo166719D();
    }

    /* renamed from: a */
    private final Intent m187943a(Context context, String str, boolean z, String str2, boolean z2, boolean z3) {
        Intent intent = new Intent(context, MomentsDetailActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("post_id", str);
        bundle.putBoolean("show_comment", z);
        bundle.putString("jump_comment_id", str2);
        bundle.putBoolean("need_show_jump_title", z2);
        bundle.putBoolean("post_deleted", z3);
        Intent putExtras = intent.putExtras(bundle);
        Intrinsics.checkExpressionValueIsNotNull(putExtras, "Intent(context, MomentsD…, postDeleted)\n        })");
        return putExtras;
    }

    /* renamed from: a */
    public final void mo166652a(Activity activity, String str, boolean z, String str2, String str3, boolean z2, boolean z3) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(str, "postId");
        Intrinsics.checkParameterIsNotNull(str2, "jumpCommentId");
        Intrinsics.checkParameterIsNotNull(str3, ShareHitPoint.f121868c);
        activity.startActivityForResult(m187943a(activity, str, z, str2, z2, z3), 996);
        MomentsHitPoint.f119720a.mo166845c(str, str3);
        MomentsAppreciableHitPoint.f119684a.mo166719D();
    }

    /* renamed from: a */
    public final void mo166653a(Context context, String str, boolean z, String str2, String str3, boolean z2, boolean z3) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "postId");
        Intrinsics.checkParameterIsNotNull(str2, "jumpCommentId");
        Intrinsics.checkParameterIsNotNull(str3, ShareHitPoint.f121868c);
        C47282k.m187257a(context, m187943a(context, str, z, str2, z2, z3));
        MomentsHitPoint.f119720a.mo166845c(str, str3);
        MomentsAppreciableHitPoint.f119684a.mo166719D();
    }

    /* renamed from: a */
    public static /* synthetic */ void m187944a(MomentsDetailLauncher eVar, Activity activity, String str, boolean z, String str2, String str3, boolean z2, boolean z3, int i, Object obj) {
        boolean z4;
        String str4;
        String str5;
        boolean z5;
        boolean z6;
        if ((i & 4) != 0) {
            z4 = false;
        } else {
            z4 = z;
        }
        if ((i & 8) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i & 16) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i & 32) != 0) {
            z5 = false;
        } else {
            z5 = z2;
        }
        if ((i & 64) != 0) {
            z6 = false;
        } else {
            z6 = z3;
        }
        eVar.mo166652a(activity, str, z4, str4, str5, z5, z6);
    }

    /* renamed from: a */
    public static /* synthetic */ void m187945a(MomentsDetailLauncher eVar, Context context, String str, boolean z, String str2, String str3, boolean z2, boolean z3, int i, Object obj) {
        boolean z4;
        String str4;
        String str5;
        boolean z5;
        boolean z6;
        if ((i & 4) != 0) {
            z4 = false;
        } else {
            z4 = z;
        }
        if ((i & 8) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i & 16) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i & 32) != 0) {
            z5 = false;
        } else {
            z5 = z2;
        }
        if ((i & 64) != 0) {
            z6 = false;
        } else {
            z6 = z3;
        }
        eVar.mo166653a(context, str, z4, str4, str5, z5, z6);
    }

    /* renamed from: a */
    public static /* synthetic */ void m187946a(MomentsDetailLauncher eVar, Fragment fragment, Context context, String str, boolean z, String str2, String str3, boolean z2, boolean z3, int i, Object obj) {
        boolean z4;
        String str4;
        String str5;
        boolean z5;
        boolean z6;
        if ((i & 8) != 0) {
            z4 = false;
        } else {
            z4 = z;
        }
        if ((i & 16) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i & 32) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i & 64) != 0) {
            z5 = false;
        } else {
            z5 = z2;
        }
        if ((i & SmActions.ACTION_ONTHECALL_EXIT) != 0) {
            z6 = false;
        } else {
            z6 = z3;
        }
        eVar.mo166654a(fragment, context, str, z4, str4, str5, z5, z6);
    }
}
