package com.ss.android.lark.appcenter.wrapper.impl.p1362a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27533a;
import com.ss.android.lark.appcenter.wrapper.AppCenterModule;
import com.ss.android.lark.statistics.Statistics;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.appcenter.wrapper.impl.a.a */
public class C29145a implements AbstractC27533a {

    /* renamed from: a */
    public static volatile boolean f72965a;

    /* renamed from: b */
    private Context f72966b;

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27533a
    /* renamed from: b */
    public void mo98161b() {
        AppCenterModule.m107044a().notifyMainTabFragmentContentDraw();
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27533a
    /* renamed from: a */
    public boolean mo98160a() {
        return AppCenterModule.m107044a().isReportFeatureOn();
    }

    public C29145a(Context context) {
        this.f72966b = context;
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27533a
    /* renamed from: a */
    public void mo98154a(Context context) {
        AppCenterModule.m107044a().openLarkAboutPage(context);
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27533a
    /* renamed from: a */
    public String mo98153a(DomainSettings.Alias alias) {
        return AppCenterModule.m107044a().getDynamicDomain(alias);
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27533a
    /* renamed from: c */
    public void mo98163c(String str) {
        AppCenterModule.m107044a().launchMainWindow(this.f72966b, str);
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27533a
    /* renamed from: d */
    public void mo98164d(String str) {
        AppCenterModule.m107044a().getGuideDependency().mo103377a(str);
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27533a
    /* renamed from: e */
    public boolean mo98165e(String str) {
        return AppCenterModule.m107044a().getGuideDependency().mo103378b(str);
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27533a
    /* renamed from: b */
    public boolean mo98162b(String str) {
        if (!AppCenterModule.m107044a().getFeatureGatingDependency().mo103376a("lark.appcenter.native.app") || !AppCenterModule.m107044a().isTabEnable(str)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27533a
    /* renamed from: a */
    public void mo98156a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Statistics.sendEvent(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27533a
    /* renamed from: a */
    public void mo98157a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && str2 != null) {
            try {
                Statistics.sendEvent(str, new JSONObject(str2));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27533a
    /* renamed from: a */
    public void mo98158a(String str, String str2, int i) {
        AppCenterModule.m107044a().openSearchMainPageFromAppCenter(this.f72966b, str, str2, i);
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27533a
    /* renamed from: a */
    public void mo98159a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        try {
            MonitorUtils.monitorEvent(str, jSONObject, jSONObject2, jSONObject3);
        } catch (Exception e) {
            C28184h.m103248b("ApiInvokeProvider", e.getMessage());
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27533a
    /* renamed from: a */
    public void mo98155a(Context context, String str, String str2, String str3, String str4, String str5) {
        AppCenterModule.m107044a().showShareComponent(context, str, str2, str3, str4, str5);
    }
}
