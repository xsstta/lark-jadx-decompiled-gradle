package com.ss.android.bytedcert.activities;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.DialogInterfaceC0257a;
import com.bytedance.common.utility.Logger;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.bytedcert.callback.AbstractC28340i;
import com.ss.android.bytedcert.callback.SDKCallBack;
import com.ss.android.bytedcert.config.AbstractC28346e;
import com.ss.android.bytedcert.manager.BytedCertManager;
import com.ss.android.bytedcert.manager.C28399b;
import com.ss.android.bytedcert.manager.C28418c;
import com.ss.android.bytedcert.net.BDResponse;
import com.ss.android.bytedcert.p1304b.C28317a;
import com.ss.android.bytedcert.p1304b.C28320c;
import com.ss.android.bytedcert.p1305c.AbstractC28321a;
import com.ss.android.bytedcert.p1305c.C28325d;
import com.ss.android.bytedcert.p1308f.p1309a.p1311b.C28362a;
import com.ss.android.bytedcert.p1308f.p1309a.p1313d.C28374a;
import com.ss.android.bytedcert.p1314g.C28379a;
import com.ss.android.bytedcert.p1314g.C28380b;
import com.ss.android.bytedcert.p1314g.C28382d;
import com.ss.android.bytedcert.utils.Accelerometer;
import com.ss.android.bytedcert.utils.C28432b;
import com.ss.android.bytedcert.utils.C28441g;
import com.ss.android.bytedcert.view.AbstractC28443a;
import com.ss.android.bytedcert.view.CountDownButton;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class FaceLiveSDKActivity extends AppCompatActivity implements AbstractC28321a, AbstractC28340i, AbstractC28443a {

    /* renamed from: a */
    public FrameLayout f71065a;

    /* renamed from: b */
    public BytedCertManager f71066b;

    /* renamed from: c */
    Resources f71067c;

    /* renamed from: d */
    FrameLayout f71068d;

    /* renamed from: e */
    public SDKCallBack.FaceLiveCallback f71069e;

    /* renamed from: f */
    public C28382d f71070f;

    /* renamed from: g */
    public C28325d f71071g = null;

    /* renamed from: h */
    private Accelerometer f71072h;

    /* renamed from: i */
    private C28362a f71073i;

    /* renamed from: j */
    private CountDownButton f71074j;

    /* renamed from: k */
    private ImageView f71075k;

    /* renamed from: l */
    private AbstractC28346e f71076l = BytedCertManager.getInstance().getThemeConfig();

    /* renamed from: m */
    private boolean f71077m = false;

    /* renamed from: n */
    private C28362a.AbstractC28367a f71078n = new C28362a.AbstractC28367a() {
        /* class com.ss.android.bytedcert.activities.FaceLiveSDKActivity.C282972 */

        @Override // com.ss.android.bytedcert.p1308f.p1309a.p1311b.C28362a.AbstractC28367a
        /* renamed from: a */
        public void mo100859a(int i, int i2) {
            FaceLiveSDKActivity.this.runOnUiThread(new Runnable() {
                /* class com.ss.android.bytedcert.activities.FaceLiveSDKActivity.C282972.RunnableC282981 */

                public void run() {
                    FaceLiveSDKActivity.this.f71065a.requestLayout();
                }
            });
        }
    };

    /* renamed from: o */
    private Handler f71079o = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public Context mo100839a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo100844a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m103812a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m103810a(this, configuration);
    }

    /* renamed from: f */
    public Resources mo100854f() {
        return super.getResources();
    }

    /* renamed from: g */
    public AssetManager mo100856g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m103814c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public Resources getResources() {
        return m103813b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m103811a(this);
    }

    /* renamed from: b */
    public void mo100848b() {
        super.onStop();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onPause() {
        super.onPause();
    }

    /* renamed from: a */
    public void mo100847a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", z ? 1 : 2);
            C28432b.m104209a("face_detection_image_result", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: k */
    private void m103818k() {
        m103820m();
        mo100841a();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onDestroy() {
        m103819l();
        super.onDestroy();
    }

    /* renamed from: h */
    private boolean m103815h() {
        return getPackageManager().hasSystemFeature("android.hardware.camera");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onResume() {
        Accelerometer accelerometer = this.f71072h;
        if (accelerometer != null) {
            accelerometer.mo101229a();
        }
        super.onResume();
    }

    /* renamed from: i */
    private void m103816i() {
        FrameLayout frameLayout = this.f71068d;
        if (frameLayout == null) {
            Logger.m15170e("face sdk activity", "setFaceBackGround null");
        } else {
            frameLayout.setBackgroundColor(this.f71076l.mo100958e());
        }
    }

    /* renamed from: j */
    private void m103817j() {
        BytedCertManager instance = BytedCertManager.getInstance();
        this.f71066b = instance;
        this.f71069e = instance.getFaceLiveCallback();
        C28382d liveInfo = this.f71066b.getLiveInfo();
        this.f71070f = liveInfo;
        if (liveInfo == null) {
            finish();
        }
        this.f71067c = getResources();
    }

    /* renamed from: e */
    public void mo100853e() {
        HashMap hashMap = new HashMap();
        hashMap.put("back_position", "detection");
        C28432b.m104208a("return_previous_page", hashMap);
    }

    public void finish() {
        C28325d dVar = this.f71071g;
        if (dVar != null) {
            dVar.mo100922b();
        }
        BytedCertManager.getInstance().resetStatus();
        m103819l();
        super.finish();
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        mo100853e();
        SDKCallBack.FaceLiveCallback faceLiveCallback = this.f71069e;
        if (faceLiveCallback != null) {
            faceLiveCallback.onFaceLiveFinish(mo100840a(C28317a.C28318a.f71143g));
        }
        super.onBackPressed();
    }

    /* renamed from: l */
    private void m103819l() {
        Accelerometer accelerometer = this.f71072h;
        if (accelerometer != null) {
            accelerometer.mo101230b();
        }
        C28362a aVar = this.f71073i;
        if (aVar != null) {
            aVar.mo101053e();
        }
        C28362a aVar2 = this.f71073i;
        if (aVar2 != null && !this.f71077m) {
            aVar2.mo101054f();
            this.f71073i.mo101046a();
            this.f71077m = true;
            Logger.m15170e("FaceLiveSDKActivity", "camera release");
        }
        BytedCertManager.setSDKRunningFlag(0);
        BytedCertManager.setGLPause(true);
        BytedCertManager.setHttpAllow(false);
    }

    /* renamed from: n */
    private JSONObject m103821n() {
        String a = BytedCertManager.getInstance().getLiveInfo().mo101087a(C28418c.m104143c().f71469a);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_data", a);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: o */
    private void m103822o() {
        String str;
        String str2 = "0";
        long currentTimeMillis = System.currentTimeMillis() - BytedCertManager.getInstance().mFaceStartTime;
        try {
            JSONObject jSONObject = new JSONObject();
            if (!BytedCertManager.getInstance().mIsFaceFromInternal) {
                jSONObject.put("during_query_init", BytedCertManager.getInstance().mFaceInitTime);
            }
            jSONObject.put("result", "1");
            jSONObject.put("error_code", str2);
            jSONObject.put("error_msg", "success");
            jSONObject.put("during_query_live", BytedCertManager.getInstance().mFaceLiveTime);
            jSONObject.put("during_start_activity", currentTimeMillis);
            if (getIntent() != null) {
                if (getIntent().getBooleanExtra("already_has_permission", false)) {
                    str2 = "1";
                }
                jSONObject.put("already_has_permission", str2);
            }
            if (BytedCertManager.getInstance().mIsFaceFromInternal) {
                str = "cert_start_face_live_internal";
            } else {
                str = "cert_start_face_live";
            }
            C28432b.m104206a(str, null, null, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
        C28432b.m104208a("face_detection_enter", new HashMap());
    }

    /* renamed from: c */
    public void mo100850c() {
        BytedCertManager.setGLPause(true);
        int a = this.f71073i.mo101047a(this.f71070f.f71361b, this.f71070f.f71362c, this.f71070f.f71362c.length);
        if (a == 0) {
            this.f71074j.mo101241c(this.f71070f.f71361b);
            this.f71074j.mo101240b(this.f71070f.f71361b);
            this.f71073i.mo101050b();
            BytedCertManager.setSDKRunningFlag(1);
            BytedCertManager.setGLPause(false);
        } else if (this.f71069e != null) {
            BDResponse a2 = mo100840a(C28317a.C28318a.f71142f);
            a2.detailErrorCode = a;
            this.f71069e.onFaceLiveFinish(a2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo100841a() {
        this.f71074j.setVisibility(0);
        this.f71066b.setCameraStartType(1);
        this.f71073i.mo101052d();
        this.f71077m = false;
    }

    @Override // com.ss.android.bytedcert.callback.AbstractC28340i
    /* renamed from: d */
    public void mo100852d() {
        if (this.f71070f.f71364e) {
            if (C28418c.m104143c().f71477i) {
                this.f71069e.onFaceLiveFinish(new BDResponse(true, m103821n()));
            } else {
                this.f71069e.onFaceLiveFinish(new BDResponse(C28418c.m104143c().f71478j));
            }
            finish();
        } else if (TextUtils.isEmpty(C28418c.m104143c().f71469a)) {
            Logger.m15170e("face liveness", "sdkData from jni failed");
            this.f71069e.onFaceLiveFinish(mo100840a(C28317a.C28318a.f71145i));
        } else {
            this.f71079o.post(new Runnable() {
                /* class com.ss.android.bytedcert.activities.FaceLiveSDKActivity.RunnableC283034 */

                public void run() {
                    try {
                        FaceLiveSDKActivity faceLiveSDKActivity = FaceLiveSDKActivity.this;
                        faceLiveSDKActivity.f71071g = C28325d.m103926a(faceLiveSDKActivity, faceLiveSDKActivity.getApplication().getString(R.string.byted_loading_text));
                        FaceLiveSDKActivity.this.f71071g.mo100921a();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            C28379a actionInfo = this.f71066b.getActionInfo();
            C28380b certInfo = BytedCertManager.getInstance().getCertInfo();
            C283045 r3 = new SDKCallBack.AbstractC28328a() {
                /* class com.ss.android.bytedcert.activities.FaceLiveSDKActivity.C283045 */

                @Override // com.ss.android.bytedcert.callback.SDKCallBack.AbstractC28328a
                /* renamed from: a */
                public void mo100863a(BDResponse bDResponse) {
                    FaceLiveSDKActivity.this.mo100847a(bDResponse.success);
                    FaceLiveSDKActivity.this.f71069e.onFaceLiveFinish(bDResponse);
                    FaceLiveSDKActivity.this.finish();
                }
            };
            if (certInfo == null || Integer.parseInt(certInfo.f71353c) != 1) {
                if (actionInfo.f71346e) {
                    this.f71066b.doFaceCompareVerification(null, r3);
                    return;
                }
                this.f71069e.onFaceLiveFinish(new BDResponse(true, m103821n()));
                finish();
            } else if (actionInfo.f71350i) {
                this.f71066b.doFaceCompareAuthentication(null, r3);
            } else {
                this.f71069e.onFaceLiveFinish(new BDResponse(true, m103821n()));
                finish();
            }
        }
    }

    /* renamed from: m */
    private void m103820m() {
        CountDownButton countDownButton = (CountDownButton) findViewById(R.id.countdown2);
        this.f71074j = countDownButton;
        countDownButton.mo101241c(this.f71070f.f71361b);
        this.f71074j.mo101240b(this.f71070f.f71361b);
        this.f71072h = new Accelerometer(getApplicationContext());
        this.f71065a = (FrameLayout) findViewById(R.id.id_preview_layout);
        Bundle extras = getIntent().getExtras();
        C28362a aVar = new C28362a(this, this.f71078n, (GLSurfaceView) findViewById(R.id.id_gl_sv), extras);
        this.f71073i = aVar;
        if (aVar.f71274l != 0) {
            Logger.m15170e("FaceLiveSDKActivity", "init failed");
            if (this.f71069e != null) {
                BDResponse a = mo100840a(C28317a.C28318a.f71141e);
                a.detailErrorCode = this.f71073i.f71274l;
                this.f71069e.onFaceLiveFinish(a);
            }
            finish();
            return;
        }
        Logger.m15167d("debug1 FaceLiveSDKActivity", "SetParam");
        int a2 = this.f71073i.mo101047a(this.f71070f.f71361b, this.f71070f.f71362c, this.f71070f.f71362c.length);
        if (a2 != 0) {
            Logger.m15167d("FaceLiveSDKActivity", "init params failed");
            if (this.f71069e != null) {
                BDResponse a3 = mo100840a(C28317a.C28318a.f71142f);
                a3.detailErrorCode = a2;
                this.f71069e.onFaceLiveFinish(a3);
            }
            finish();
            return;
        }
        Logger.m15167d("debug1 FaceLiveSDKActivity", "SetConfig");
        int a4 = this.f71073i.mo101048a(this.f71070f.f71363d.mo101093a(), this.f71070f.f71363d.mo101094b());
        if (a4 != 0) {
            Logger.m15167d("FaceLiveSDKActivity", "init config failed");
            if (this.f71069e != null) {
                BDResponse a5 = mo100840a(C28317a.C28318a.f71142f);
                a5.detailErrorCode = a4;
                this.f71069e.onFaceLiveFinish(a5);
            }
            finish();
        } else if (this.f71073i.mo101050b() != 0) {
            Logger.m15167d("FaceLiveSDKActivity", "reset failed");
            SDKCallBack.FaceLiveCallback faceLiveCallback = this.f71069e;
            if (faceLiveCallback != null) {
                faceLiveCallback.onFaceLiveFinish(mo100840a(C28317a.C28318a.f71151o));
            }
            finish();
        } else {
            BytedCertManager.setHttpAllow(true);
            this.f71072h.mo101229a();
        }
    }

    @Override // com.ss.android.bytedcert.view.AbstractC28443a
    /* renamed from: b */
    public void mo100849b(int i) {
        this.f71074j.mo101239a(i);
    }

    /* renamed from: b */
    public static Resources m103813b(FaceLiveSDKActivity faceLiveSDKActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(faceLiveSDKActivity);
        }
        return faceLiveSDKActivity.mo100854f();
    }

    /* renamed from: c */
    public static AssetManager m103814c(FaceLiveSDKActivity faceLiveSDKActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(faceLiveSDKActivity);
        }
        return faceLiveSDKActivity.mo100856g();
    }

    /* renamed from: a */
    public BDResponse mo100840a(Pair<Integer, String> pair) {
        return new BDResponse(pair);
    }

    /* renamed from: a */
    public static void m103811a(FaceLiveSDKActivity faceLiveSDKActivity) {
        faceLiveSDKActivity.mo100848b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            FaceLiveSDKActivity faceLiveSDKActivity2 = faceLiveSDKActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    faceLiveSDKActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C28441g.m104237a((Activity) this, this.f71076l.mo100958e());
        C28441g.m104240b(this, this.f71076l.mo100960g());
        setContentView(R.layout.byted_activity_main_sdk);
        C28382d liveInfo = BytedCertManager.getInstance().getLiveInfo();
        this.f71070f = liveInfo;
        if (liveInfo == null) {
            finish();
            return;
        }
        m103817j();
        this.f71067c = getResources();
        this.f71068d = (FrameLayout) findViewById(R.id.bar);
        m103816i();
        if (Build.VERSION.SDK_INT >= 24 && isInMultiWindowMode()) {
            SDKCallBack.FaceLiveCallback faceLiveCallback = this.f71069e;
            if (faceLiveCallback != null) {
                faceLiveCallback.onFaceLiveFinish(mo100840a(C28317a.C28318a.f71149m));
            }
            finish();
        }
        if (!m103815h()) {
            SDKCallBack.FaceLiveCallback faceLiveCallback2 = this.f71069e;
            if (faceLiveCallback2 != null) {
                faceLiveCallback2.onFaceLiveFinish(mo100840a(C28317a.C28318a.f71150n));
            }
            finish();
        }
        this.f71075k = (ImageView) findViewById(R.id.face_return_back);
        if (this.f71076l.mo100961h()) {
            Drawable i = this.f71076l.mo100962i();
            if (i == null) {
                i = this.f71067c.getDrawable(R.mipmap.byted_return);
            }
            this.f71075k.setImageDrawable(i);
        }
        this.f71075k.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.bytedcert.activities.FaceLiveSDKActivity.View$OnClickListenerC282961 */

            public void onClick(View view) {
                FaceLiveSDKActivity.this.mo100853e();
                if (FaceLiveSDKActivity.this.f71069e != null) {
                    FaceLiveSDKActivity.this.f71069e.onFaceLiveFinish(FaceLiveSDKActivity.this.mo100840a(C28317a.C28318a.f71143g));
                }
                FaceLiveSDKActivity.this.finish();
            }
        });
        m103818k();
        m103822o();
    }

    @Override // com.ss.android.bytedcert.view.AbstractC28443a
    /* renamed from: a */
    public void mo100842a(int i) {
        this.f71074j.mo101241c(i);
    }

    /* renamed from: a */
    public void mo100845a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("back_result", str);
        C28432b.m104208a("confirm_back_popup", hashMap);
    }

    /* renamed from: a */
    public static void m103812a(FaceLiveSDKActivity faceLiveSDKActivity, Context context) {
        faceLiveSDKActivity.mo100844a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(faceLiveSDKActivity);
        }
    }

    /* renamed from: a */
    public static Context m103810a(FaceLiveSDKActivity faceLiveSDKActivity, Configuration configuration) {
        Context a = faceLiveSDKActivity.mo100839a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public void mo100846a(String str, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", str);
        hashMap.put("fail_reason", C28374a.f71311i);
        hashMap.put("error_code", String.valueOf(i));
        C28432b.m104208a("face_detection_fail_popup", hashMap);
    }

    @Override // com.ss.android.bytedcert.p1305c.AbstractC28321a
    /* renamed from: a */
    public void mo100843a(Activity activity, final String str, final String str2, final int i) {
        this.f71074j.mo101238a();
        runOnUiThread(new Runnable() {
            /* class com.ss.android.bytedcert.activities.FaceLiveSDKActivity.RunnableC282993 */

            public void run() {
                try {
                    DialogInterfaceC0257a.C0258a aVar = new DialogInterfaceC0257a.C0258a(FaceLiveSDKActivity.this, R.style.byted_alert_dialog);
                    aVar.mo923a(str);
                    aVar.mo927b(str2);
                    aVar.mo925a(false);
                    String string = FaceLiveSDKActivity.this.f71067c.getString(R.string.byted_face_live_try_more);
                    String string2 = FaceLiveSDKActivity.this.f71067c.getString(R.string.byted_face_live_out);
                    aVar.mo924a(string, new DialogInterface.OnClickListener() {
                        /* class com.ss.android.bytedcert.activities.FaceLiveSDKActivity.RunnableC282993.DialogInterface$OnClickListenerC283001 */

                        public void onClick(DialogInterface dialogInterface, int i) {
                            String str;
                            FaceLiveSDKActivity.this.mo100846a("retry", i);
                            FaceLiveSDKActivity.this.mo100845a("back_cancel");
                            if (BytedCertManager.getHttpAllow()) {
                                if (FaceLiveSDKActivity.this.f71070f.f71364e) {
                                    C28382d dVar = FaceLiveSDKActivity.this.f71070f;
                                    dVar.f71365f--;
                                    if (FaceLiveSDKActivity.this.f71070f.f71365f >= 0) {
                                        FaceLiveSDKActivity.this.mo100850c();
                                    } else {
                                        if (FaceLiveSDKActivity.this.f71069e != null) {
                                            FaceLiveSDKActivity.this.f71069e.onFaceLiveFinish(new BDResponse(C28317a.C28318a.f71146j));
                                        }
                                        FaceLiveSDKActivity.this.finish();
                                    }
                                    dialogInterface.dismiss();
                                    return;
                                }
                                C28380b certInfo = FaceLiveSDKActivity.this.f71066b.getCertInfo();
                                String str2 = "";
                                if (certInfo != null) {
                                    str = certInfo.f71354d;
                                } else {
                                    str = str2;
                                }
                                if (certInfo != null) {
                                    str2 = certInfo.f71355e;
                                }
                                HashMap hashMap = new HashMap();
                                if (!TextUtils.isEmpty(str)) {
                                    hashMap.put("identity_code", str);
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    hashMap.put("identity_name", str2);
                                }
                                C28399b.m104133a().mo101180a(new SDKCallBack.AbstractC28328a() {
                                    /* class com.ss.android.bytedcert.activities.FaceLiveSDKActivity.RunnableC282993.DialogInterface$OnClickListenerC283001.C283011 */

                                    @Override // com.ss.android.bytedcert.callback.SDKCallBack.AbstractC28328a
                                    /* renamed from: a */
                                    public void mo100863a(BDResponse bDResponse) {
                                        if (bDResponse.success) {
                                            FaceLiveSDKActivity.this.f71070f = new C28382d(bDResponse);
                                            FaceLiveSDKActivity.this.f71066b.setLiveInfo(FaceLiveSDKActivity.this.f71070f);
                                            FaceLiveSDKActivity.this.mo100850c();
                                            return;
                                        }
                                        if (FaceLiveSDKActivity.this.f71069e != null) {
                                            FaceLiveSDKActivity.this.f71069e.onFaceLiveFinish(bDResponse);
                                        }
                                        FaceLiveSDKActivity.this.finish();
                                    }
                                }, "GET", C28320c.m103917f(), hashMap);
                                dialogInterface.dismiss();
                            }
                        }
                    });
                    aVar.mo928b(string2, new DialogInterface.OnClickListener() {
                        /* class com.ss.android.bytedcert.activities.FaceLiveSDKActivity.RunnableC282993.DialogInterface$OnClickListenerC283022 */

                        public void onClick(DialogInterface dialogInterface, int i) {
                            FaceLiveSDKActivity.this.mo100846a("quit", i);
                            FaceLiveSDKActivity.this.mo100845a("back_confirm");
                            if (FaceLiveSDKActivity.this.f71069e != null) {
                                FaceLiveSDKActivity.this.f71069e.onFaceLiveFinish(FaceLiveSDKActivity.this.mo100840a(C28317a.C28318a.f71140d));
                            }
                            FaceLiveSDKActivity.this.finish();
                        }
                    });
                    aVar.mo929b().show();
                    FaceLiveSDKActivity.this.mo100846a("alert_show", i);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
