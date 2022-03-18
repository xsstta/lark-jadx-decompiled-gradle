package com.tt.miniapp.feedback;

import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12791h;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.refer.common.util.C67866g;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.feedback.e */
public class C66100e {

    /* renamed from: a */
    public static final String f166842a = (C12791h.m52861a(AppbrandContext.getInst().getApplicationContext()) + "/TT/feedback/");

    /* renamed from: b */
    public Context f166843b;

    /* renamed from: c */
    public IAppContext f166844c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo231265a() {
        mo231269e();
    }

    /* renamed from: c */
    public void mo231267c() {
        C67866g.m264027a(new Runnable() {
            /* class com.tt.miniapp.feedback.C66100e.RunnableC661033 */

            public void run() {
                HostDependManager.getInst().showModal(C66100e.this.f166843b, null, "", C66100e.this.f166843b.getString(R.string.microapp_m_upload_success_thanks), false, "", "", C66100e.this.f166843b.getString(R.string.microapp_m_confirm), "", new AbstractC67550j.AbstractC67551a<Integer>() {
                    /* class com.tt.miniapp.feedback.C66100e.RunnableC661033.C661041 */

                    /* renamed from: a */
                    public void onNativeModuleCall(Integer num) {
                        HostDependManager.getInst().hideToast();
                        C66100e.this.mo231270f();
                    }
                }, C66100e.this.f166844c.getCurrentActivity());
            }
        });
    }

    /* renamed from: d */
    public void mo231268d() {
        C67866g.m264027a(new Runnable() {
            /* class com.tt.miniapp.feedback.C66100e.RunnableC661054 */

            public void run() {
                HostDependManager.getInst().showModal(C66100e.this.f166843b, null, "", C66100e.this.f166843b.getString(R.string.microapp_m_upload_failed_retry), true, C66100e.this.f166843b.getString(R.string.microapp_m_map_dialog_cancel), "", C66100e.this.f166843b.getString(R.string.microapp_m_confirm), "", new AbstractC67550j.AbstractC67551a<Integer>() {
                    /* class com.tt.miniapp.feedback.C66100e.RunnableC661054.C661061 */

                    /* renamed from: a */
                    public void onNativeModuleCall(Integer num) {
                        HostDependManager.getInst().hideToast();
                        if (num.intValue() == 1) {
                            C66100e.this.mo231266b();
                        } else {
                            C66100e.this.mo231270f();
                        }
                    }
                }, C66100e.this.f166844c.getCurrentActivity());
            }
        });
    }

    /* renamed from: e */
    public void mo231269e() {
        if (this.f166843b != null) {
            C67866g.m264027a(new Runnable() {
                /* class com.tt.miniapp.feedback.C66100e.RunnableC661075 */

                public void run() {
                    HostDependManager.getInst().showModal(C66100e.this.f166843b, null, "", C66100e.this.f166843b.getString(R.string.microapp_m_confirm_upload), false, C66100e.this.f166843b.getString(R.string.microapp_m_map_dialog_cancel), "", C66100e.this.f166843b.getString(R.string.microapp_m_confirm), "", new AbstractC67550j.AbstractC67551a<Integer>() {
                        /* class com.tt.miniapp.feedback.C66100e.RunnableC661075.C661081 */

                        /* renamed from: a */
                        public void onNativeModuleCall(Integer num) {
                            if (C66094d.m258853a(C66100e.this.f166844c) != null) {
                                C66094d.m258853a(C66100e.this.f166844c).mo231257a(AppbrandContext.getInst().getApplicationContext(), false);
                            }
                            HostDependManager.getInst().hideToast();
                            if (num.intValue() == 1) {
                                C66100e.this.mo231266b();
                            } else {
                                C66100e.this.mo231270f();
                            }
                        }
                    }, C66100e.this.f166844c.getCurrentActivity());
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo231270f() {
        m258868a(new File(f166842a));
    }

    /* renamed from: b */
    public void mo231266b() {
        HostDependManager.getInst().showToast(this.f166843b, null, "", 30000, "loading");
        m258869g();
        m258870h();
    }

    /* renamed from: g */
    private void m258869g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("console", C66088a.f166821a);
            jSONObject.put("alog", C66092c.f166830a);
            jSONObject.put("performance", C66159h.f167015b);
            jSONObject.put("event", C66090b.f166826a);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C67556a.m262938a("log", jSONObject, new AbstractC67565b() {
            /* class com.tt.miniapp.feedback.C66100e.C661011 */

            @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
            /* renamed from: a */
            public void mo48980a(CrossProcessDataEntity crossProcessDataEntity) {
                if (crossProcessDataEntity != null) {
                    String b = crossProcessDataEntity.mo234744b("errorMsg");
                    if (b == null || !b.equals("ok")) {
                        AppBrandLogger.m52828d("tma_FeedbackUploadHandler", "upLoad feedback fail:" + b);
                        return;
                    }
                    AppBrandLogger.m52828d("tma_FeedbackUploadHandler", "upLoad feedback success");
                }
            }
        });
    }

    /* renamed from: h */
    private void m258870h() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("video", f166842a + "ScreenCapture.mp4");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C67556a.m262938a("video", jSONObject, new AbstractC67565b() {
            /* class com.tt.miniapp.feedback.C66100e.C661022 */

            @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
            /* renamed from: a */
            public void mo48980a(CrossProcessDataEntity crossProcessDataEntity) {
                if (crossProcessDataEntity != null) {
                    HostDependManager.getInst().hideToast();
                    String b = crossProcessDataEntity.mo234744b("errorMsg");
                    if (b == null || !b.equals("ok")) {
                        C66100e.this.mo231268d();
                    } else {
                        C66100e.this.mo231267c();
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static C66100e m258867a(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234297r();
    }

    public C66100e(IAppContext iAppContext) {
        this.f166844c = iAppContext;
        Context currentActivity = iAppContext.getCurrentActivity();
        this.f166843b = currentActivity == null ? AppbrandContext.getInst().getApplicationContext() : currentActivity;
    }

    /* renamed from: a */
    private boolean m258868a(File file) {
        String[] list;
        if (file.isDirectory()) {
            for (String str : file.list()) {
                if (!m258868a(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }
}
