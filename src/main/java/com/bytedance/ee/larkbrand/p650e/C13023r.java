package com.bytedance.ee.larkbrand.p650e;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.ss.android.lark.littleapp.C41300b;
import com.tt.miniapphost.entity.C67525e;
import com.tt.option.p3393n.C67659a;

/* renamed from: com.bytedance.ee.larkbrand.e.r */
public class C13023r extends C67659a {
    @Override // com.tt.option.p3393n.AbstractC67660b, com.tt.option.p3393n.C67659a
    public boolean chooseLocationActivity(IAppContext iAppContext, String str, int i) {
        return C41300b.m163751a(iAppContext, str, i);
    }

    @Override // com.tt.option.p3393n.AbstractC67660b, com.tt.option.p3393n.C67659a
    public C67525e handleChooseLocationResult(int i, int i2, Intent intent) {
        if (i == 13) {
            if (i2 == -1) {
                AppBrandLogger.m52830i("LarkOptionOthersDepend", "chooseLocation handle activity result ok");
                if (intent != null) {
                    double doubleExtra = intent.getDoubleExtra("extra_latitude", -1.0d);
                    double doubleExtra2 = intent.getDoubleExtra("extra_longitude", -1.0d);
                    AppBrandLogger.m52830i("LarkOptionOthersDepend", "chooseLocation location is not right, latitude:" + doubleExtra + "longitude:" + doubleExtra2);
                    if (!(doubleExtra == -1.0d || doubleExtra2 == -1.0d)) {
                        return new C67525e(false, doubleExtra, doubleExtra2, intent.getStringExtra("extra_name"), intent.getStringExtra("extra_address"));
                    }
                } else {
                    AppBrandLogger.m52829e("LarkOptionOthersDepend", "chooseLocation data is null");
                }
            } else if (i2 == 0) {
                AppBrandLogger.m52830i("LarkOptionOthersDepend", "chooseLocation handle activity result cancel");
                return new C67525e(true, -1.0d, -1.0d, null, null);
            }
        }
        return super.handleChooseLocationResult(i, i2, intent);
    }

    @Override // com.tt.option.p3393n.AbstractC67660b, com.tt.option.p3393n.C67659a
    public boolean openLocation(Activity activity, String str, String str2, double d, double d2, int i, String str3, String str4) {
        LarkExtensionManager.getInstance().getExtension().mo49593a(activity, str, str2, d, d2, i, str3);
        return true;
    }
}
