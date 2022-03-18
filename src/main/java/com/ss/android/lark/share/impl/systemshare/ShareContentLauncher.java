package com.ss.android.lark.share.impl.systemshare;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.base.StandAloneParam;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.share.C54713a;
import com.ss.android.lark.share.dto.SystemShareData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ShareContentLauncher {

    @Retention(RetentionPolicy.SOURCE)
    public @interface LKP_Launch_Mode {
    }

    /* renamed from: a */
    public static void m212463a(Context context, SystemShareData systemShareData) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_outside_share", systemShareData);
        if (!DesktopUtil.m144301a(context)) {
            Intent intent = new Intent(context, ShareContentActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.putExtras(bundle);
            context.startActivity(intent);
        } else if (C54713a.m212321a().mo178393f().mo178410a(context)) {
            C54756a aVar = new C54756a();
            aVar.setArguments(bundle);
            bundle.putInt("launch_mode", 1);
            FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b();
            aVar.setFragmentParams(a);
            C36512a.m144041a().mo134762a(aVar, a);
        } else {
            Intent intent2 = new Intent(context, ShareContentActivity.class);
            intent2.addFlags(134742016);
            bundle.putInt("launch_mode", 0);
            intent2.putExtras(bundle);
            StandAloneParam a2 = new StandAloneParam.C36572a(intent2).mo134967a();
            if (context instanceof Activity) {
                C36512a.m144041a().mo134756a((Activity) context, a2);
            }
        }
    }
}
