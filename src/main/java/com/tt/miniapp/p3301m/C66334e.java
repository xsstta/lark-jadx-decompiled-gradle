package com.tt.miniapp.p3301m;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.map.AppbrandMapActivity;
import com.tt.miniapphost.entity.C67525e;
import com.tt.option.p3393n.AbstractC67660b;

/* renamed from: com.tt.miniapp.m.e */
public class C66334e implements AbstractC67660b {
    @Override // com.tt.option.p3393n.AbstractC67660b
    public boolean chooseLocationActivity(IAppContext iAppContext, String str, int i) {
        return false;
    }

    @Override // com.tt.option.p3393n.AbstractC67660b
    public C67525e handleChooseLocationResult(int i, int i2, Intent intent) {
        return null;
    }

    @Override // com.tt.option.p3393n.AbstractC67660b
    public boolean openLocation(Activity activity, String str, String str2, double d, double d2, int i, String str3, String str4) {
        Intent intent = new Intent(activity, AppbrandMapActivity.class);
        intent.putExtra("name", str);
        intent.putExtra("address", str2);
        intent.putExtra("latitude", d);
        intent.putExtra("longitude", d2);
        intent.putExtra("scale", i);
        activity.startActivity(intent);
        return true;
    }
}
