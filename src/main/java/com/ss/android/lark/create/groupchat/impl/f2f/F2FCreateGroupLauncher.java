package com.ss.android.lark.create.groupchat.impl.f2f;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.lark.create.groupchat.impl.p1779b.C36275a;
import com.ss.android.lark.create.groupchat.impl.statistics.F2FCreateGroupHitPoint;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/F2FCreateGroupLauncher;", "", "()V", "KEY_SOURCE_TYPE", "", "TYPE_CREATE_GROUP", "", "TYPE_EXTERNAL_CONTACTS", "openCreateF2FGroupPage", "", "activity", "Landroid/app/Activity;", "sourceType", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.b */
public final class F2FCreateGroupLauncher {

    /* renamed from: a */
    public static final F2FCreateGroupLauncher f93615a = new F2FCreateGroupLauncher();

    private F2FCreateGroupLauncher() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m142891a(Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        if (i == 1) {
            F2FCreateGroupHitPoint.f93888a.mo134205c();
        } else if (i == 2) {
            F2FCreateGroupHitPoint.f93888a.mo134202a();
        }
        Bundle bundle = new Bundle();
        bundle.putInt("source_type", i);
        if (DesktopUtil.m144307b()) {
            F2FCreateGroupFragment aVar = new F2FCreateGroupFragment();
            FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_WIDE_M1).mo134930b();
            aVar.setArguments(bundle);
            C36512a.m144041a().mo134762a(aVar, a);
            return;
        }
        Intent intent = new Intent(activity, F2FCreateGroupActivity.class);
        intent.putExtras(bundle);
        activity.startActivity(intent);
        C36275a.m142819a(activity.getClass().getSimpleName(), activity);
    }
}
