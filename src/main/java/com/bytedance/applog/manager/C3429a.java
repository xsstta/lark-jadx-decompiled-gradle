package com.bytedance.applog.manager;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.applog.manager.a */
public class C3429a extends AbstractC3431c {

    /* renamed from: e */
    private Context f10902e;

    C3429a(Context context) {
        super(true, false);
        this.f10902e = context;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.manager.AbstractC3431c
    /* renamed from: a */
    public boolean mo13788a(JSONObject jSONObject) throws JSONException, SecurityException {
        try {
            Bundle bundle = this.f10902e.getPackageManager().getApplicationInfo(this.f10902e.getPackageName(), SmActions.ACTION_ONTHECALL_EXIT).metaData;
            if (bundle == null || TextUtils.isEmpty("")) {
                return true;
            }
            jSONObject.put("appkey", bundle.getString(""));
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return true;
        }
    }
}
