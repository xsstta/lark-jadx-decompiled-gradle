package com.ss.android.lark.locationmessage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.lark.biz.im.api.LocationInfo;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.locationmessage.p2149b.C41594e;
import com.ss.android.lark.locationmessage.ui.navigation.C41638d;
import com.ss.android.lark.locationmessage.ui.navigation.NavigateActivity;

/* renamed from: com.ss.android.lark.locationmessage.b */
public class C41589b {
    /* renamed from: a */
    public static void m165051a(Context context, LocationInfo locationInfo) {
        m165052a(context, locationInfo, null);
    }

    /* renamed from: b */
    public static void m165053b(Context context, LocationInfo locationInfo) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra_location", C41594e.m165059a(locationInfo));
        Intent intent = new Intent(context, NavigateActivity.class);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m165052a(Context context, LocationInfo locationInfo, String str) {
        int i;
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra_location", C41594e.m165059a(locationInfo));
        bundle.putString("extra_favorite_id", str);
        if (!DesktopUtil.m144301a(context)) {
            Intent intent = new Intent(context, NavigateActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.putExtras(bundle);
            Activity activity = (Activity) context;
            if (str != null) {
                i = 1;
            } else {
                i = -1;
            }
            activity.startActivityForResult(intent, i);
            return;
        }
        C41638d dVar = new C41638d();
        dVar.setArguments(bundle);
        FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b();
        dVar.setFragmentParams(a);
        C36512a.m144041a().mo134762a(dVar, a);
    }
}
