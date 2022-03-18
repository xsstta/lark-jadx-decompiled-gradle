package com.ss.android.lark.featuregating.service.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.featuregating.p1844a.AbstractC37242a;
import com.ss.android.lark.featuregating.p1844a.AbstractC37244b;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.featuregating.service.impl.a */
public class C37252a implements AbstractC37244b {

    /* renamed from: a */
    private volatile boolean f95646a;

    /* renamed from: b */
    private volatile Map<String, Boolean> f95647b;

    /* renamed from: a */
    private void m146684a() {
        if (!this.f95646a) {
            Context a = C37239a.m146644a().mo136942a();
            synchronized (this) {
                if (!this.f95646a) {
                    m146685a(a);
                    this.f95646a = true;
                }
            }
        }
    }

    /* renamed from: a */
    private void m146685a(Context context) {
        String str = "";
        try {
            str = context.getPackageManager().getApplicationInfo(context.getPackageName(), SmActions.ACTION_ONTHECALL_EXIT).metaData.getString("BUILD_ENV_FEATURE_GATING", str);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        Log.m165389i("BuildEnvFeatureGating", "BuildEnvFeatureString:" + str);
        if (!TextUtils.isEmpty(str)) {
            m146686b(str);
        }
    }

    /* renamed from: b */
    private void m146686b(String str) {
        ArrayList<String> arrayList = new ArrayList(Arrays.asList(str.split(";")));
        List<String> b = new AbstractC37242a.C37243a().mo136939a().mo136940b();
        this.f95647b = new HashMap(b.size());
        for (String str2 : arrayList) {
            String[] split = str2.split(":");
            String str3 = split[0];
            String str4 = split[1];
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4) && b.contains(str3)) {
                this.f95647b.put(str3, Boolean.valueOf(str4.equals("1")));
            }
        }
    }

    @Override // com.ss.android.lark.featuregating.p1844a.AbstractC37244b
    /* renamed from: a */
    public boolean mo136941a(String str) {
        Boolean bool;
        m146684a();
        boolean a = AbstractC37242a.C37243a.m146656a(str);
        if (this.f95647b == null || this.f95647b.isEmpty() || (bool = this.f95647b.get(str)) == null) {
            return a;
        }
        return bool.booleanValue();
    }
}
