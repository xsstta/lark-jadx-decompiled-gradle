package com.ss.android.pushmanager.setting;

import com.bytedance.push.interfaze.AbstractC20451n;
import com.bytedance.push.settings.AliveOnlineSettings;
import com.bytedance.push.settings.C20520j;
import com.bytedance.push.settings.LocalFrequencySettings;
import com.bytedance.push.settings.LocalSettings;
import com.bytedance.push.settings.PushOnlineSettings;
import com.ss.android.message.AppProvider;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import java.util.Map;

/* renamed from: com.ss.android.pushmanager.setting.b */
public class C59971b implements AbstractC20451n {

    /* renamed from: a */
    private static C59971b f149503a;

    /* renamed from: b */
    private PushMultiProcessSharedProvider.C59969b f149504b = PushMultiProcessSharedProvider.m232710a(AppProvider.getApp());

    private C59971b() {
    }

    /* renamed from: n */
    private AliveOnlineSettings m232729n() {
        return (AliveOnlineSettings) C20520j.m74724a(AppProvider.getApp(), AliveOnlineSettings.class);
    }

    /* renamed from: o */
    private PushOnlineSettings m232730o() {
        return (PushOnlineSettings) C20520j.m74724a(AppProvider.getApp(), PushOnlineSettings.class);
    }

    /* renamed from: p */
    private LocalSettings m232731p() {
        return (LocalSettings) C20520j.m74724a(AppProvider.getApp(), LocalSettings.class);
    }

    @Override // com.bytedance.push.interfaze.AbstractC20451n
    /* renamed from: a */
    public String mo68922a() {
        return m232731p().mo69046c();
    }

    /* renamed from: c */
    public boolean mo204207c() {
        return m232730o().mo69054e();
    }

    /* renamed from: e */
    public boolean mo204209e() {
        return m232731p().mo69043a();
    }

    /* renamed from: f */
    public String mo204210f() {
        return m232731p().mo69044b();
    }

    /* renamed from: g */
    public boolean mo204211g() {
        if (mo204208d() || !mo204207c()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public String mo204212h() {
        return C59970a.m232723a().mo204201c();
    }

    /* renamed from: j */
    public int mo204214j() {
        return m232731p().mo69047d();
    }

    /* renamed from: k */
    public boolean mo204215k() {
        return m232730o().mo69050a();
    }

    /* renamed from: l */
    public boolean mo204216l() {
        return m232730o().mo69055f();
    }

    /* renamed from: m */
    public int mo204217m() {
        return m232730o().mo69056g();
    }

    /* renamed from: b */
    public static C59971b m232728b() {
        if (f149503a == null) {
            synchronized (C59971b.class) {
                if (f149503a == null) {
                    f149503a = new C59971b();
                }
            }
        }
        return f149503a;
    }

    /* renamed from: d */
    public boolean mo204208d() {
        if (!m232731p().mo69048e() || !mo204215k()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public String mo204213i() {
        return ((LocalFrequencySettings) C20520j.m74724a(AppProvider.getApp(), LocalFrequencySettings.class)).mo69024c();
    }

    /* renamed from: a */
    public void mo204202a(int i) {
        m232731p().mo69040a(i);
    }

    /* renamed from: b */
    public void mo204205b(String str) {
        m232731p().mo69045b(str);
    }

    @Override // com.bytedance.push.interfaze.AbstractC20451n
    /* renamed from: c */
    public void mo68925c(boolean z) {
        m232729n().mo69004b(z);
    }

    @Override // com.bytedance.push.interfaze.AbstractC20451n
    /* renamed from: d */
    public void mo68926d(boolean z) {
        m232729n().mo69005c(z);
    }

    @Override // com.bytedance.push.interfaze.AbstractC20451n
    /* renamed from: e */
    public void mo68927e(boolean z) {
        m232729n().mo69003a(z);
    }

    @Override // com.bytedance.push.interfaze.AbstractC20451n
    /* renamed from: f */
    public void mo68928f(boolean z) {
        m232729n().mo69007e(z);
    }

    /* renamed from: b */
    public void mo204206b(Map<String, String> map) {
        C59970a.m232723a().mo204200b(map);
    }

    /* renamed from: a */
    public void mo204203a(String str) {
        m232731p().mo69041a(str);
    }

    /* renamed from: a */
    public void mo204204a(Map<String, String> map) {
        C59970a.m232723a().mo204198a(map);
    }

    @Override // com.bytedance.push.interfaze.AbstractC20451n
    /* renamed from: b */
    public void mo68924b(boolean z) {
        m232731p().mo69042a(z);
    }

    @Override // com.bytedance.push.interfaze.AbstractC20451n
    /* renamed from: a */
    public void mo68923a(boolean z) {
        m232730o().mo69049a(z);
    }
}
