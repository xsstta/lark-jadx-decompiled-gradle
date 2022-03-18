package com.ss.android.vc.common.lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.AbstractC60908v;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.lark.rvc.RvcManager;
import com.ss.android.vc.meeting.module.prompt.VCPromptManager;
import com.ss.android.vc.meeting.utils.C63532r;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XProcess;
import com.ss.android.vcxp.annotation.XSingleton;

@XClass(isSingleton = true, runOnProcess = XProcess.VC)
public class VCAppLifeCycle implements AbstractC60908v.AbstractC60909a {

    /* renamed from: a */
    private boolean f151994a;

    /* renamed from: com.ss.android.vc.common.lifecycle.VCAppLifeCycle$a */
    private static class C60789a {

        /* renamed from: a */
        public static VCAppLifeCycle f151995a = new VCAppLifeCycle();
    }

    @Override // com.ss.android.vc.dependency.AbstractC60908v.AbstractC60909a
    /* renamed from: b */
    public void mo208384b(Activity activity) {
    }

    @Override // com.ss.android.vc.dependency.AbstractC60908v.AbstractC60909a
    /* renamed from: b */
    public void mo208385b(Activity activity, Bundle bundle) {
    }

    @Override // com.ss.android.vc.dependency.AbstractC60908v.AbstractC60909a
    /* renamed from: c */
    public void mo208386c(Activity activity) {
    }

    @Override // com.ss.android.vc.dependency.AbstractC60908v.AbstractC60909a
    /* renamed from: d */
    public void mo208387d(Activity activity) {
    }

    @XSingleton
    /* renamed from: a */
    public static VCAppLifeCycle m236253a() {
        return C60789a.f151995a;
    }

    /* renamed from: d */
    public boolean mo208388d() {
        return this.f151994a;
    }

    /* renamed from: b */
    public static boolean m236255b() {
        return VideoChatModuleDependency.getLifeCycleDependency().mo196415c();
    }

    /* renamed from: c */
    public static Activity m236256c() {
        return VideoChatModuleDependency.getLifeCycleDependency().mo196414b();
    }

    /* renamed from: a */
    public static void m236254a(IGetDataCallback<Activity> iGetDataCallback) {
        VideoChatModuleDependency.getLifeCycleDependency().mo196411a(iGetDataCallback);
    }

    @Override // com.ss.android.vc.dependency.AbstractC60908v.AbstractC60909a
    /* renamed from: e */
    public void mo208389e(Activity activity) {
        if (activity.getClass().getSimpleName().equalsIgnoreCase("MainActivity")) {
            this.f151994a = false;
        }
    }

    @Override // com.ss.android.vc.dependency.AbstractC60908v.AbstractC60909a
    /* renamed from: a */
    public void mo208382a(Activity activity) {
        ar.m236695a(activity);
        if (C63532r.m248974b() != null) {
            activity.startActivity(C63532r.m248974b());
            C63532r.m248971a();
        }
        Intent intent = activity.getIntent();
        if (intent != null) {
            try {
                if (intent.getBooleanExtra("EXTRA_CALENDAR_PROMPT_PUSH", false)) {
                    intent.removeExtra("EXTRA_CALENDAR_PROMPT_PUSH");
                    VCPromptManager.m245671a().mo216815b(intent.getStringExtra("EXTRA_CALENDAR_PROMPT_ID"));
                }
            } catch (Exception e) {
                C60700b.m235846a("VCAppLifeCycle", "notifyCalendarDetailShow error", e);
            }
        }
        String simpleName = activity.getClass().getSimpleName();
        if ("ChatWindowActivity".equalsIgnoreCase(simpleName) || "EventDetailActivity".equalsIgnoreCase(simpleName)) {
            RvcManager.f153240a.mo211550a(activity.getApplicationContext());
        }
    }

    @Override // com.ss.android.vc.dependency.AbstractC60908v.AbstractC60909a
    /* renamed from: a */
    public void mo208383a(Activity activity, Bundle bundle) {
        ar.m236695a(activity);
        if (activity.getClass().getSimpleName().equalsIgnoreCase("MainActivity")) {
            this.f151994a = true;
        }
    }
}
