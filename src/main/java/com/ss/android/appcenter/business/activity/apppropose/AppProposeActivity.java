package com.ss.android.appcenter.business.activity.apppropose;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.appcenter.C27528a;
import com.ss.android.appcenter.business.activity.apppropose.AppProposeActivity;
import com.ss.android.appcenter.business.dto.C27698e;
import com.ss.android.appcenter.business.monitor.statistics.C27709a;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.net.C27724c;
import com.ss.android.appcenter.common.base.FunctionActivity;
import com.ss.android.appcenter.common.util.C28181e;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28207o;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27547l;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.io.IOException;
import java.util.HashMap;

public class AppProposeActivity extends FunctionActivity {

    /* renamed from: a */
    public TextView f69041a;

    /* renamed from: b */
    public TextView f69042b;

    /* renamed from: c */
    public C28207o.C28208a f69043c;

    /* renamed from: d */
    private TextView f69044d;

    /* renamed from: e */
    private TextView f69045e;

    /* renamed from: f */
    private ImageView f69046f;

    /* renamed from: g */
    private EditText f69047g;

    /* renamed from: h */
    private LinearLayout f69048h;

    /* renamed from: i */
    private String f69049i;

    /* renamed from: j */
    private String f69050j;

    /* renamed from: k */
    private String f69051k;

    /* renamed from: l */
    private Context f69052l;

    /* renamed from: m */
    private FrameLayout f69053m;

    /* renamed from: a */
    public Context mo98508a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo98268a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo98509a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m101009a(this, context);
    }

    /* renamed from: b */
    public void mo98510b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo98511c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m101004a(this, configuration);
    }

    public AssetManager getAssets() {
        return m101012c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m101005a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m101011b(this);
    }

    /* renamed from: e */
    private void m101014e() {
        this.f69046f.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.activity.apppropose.$$Lambda$AppProposeActivity$um6_E38rl7OyjSUa8WWx39D55AI */

            public final void onClick(View view) {
                AppProposeActivity.this.m101010b((AppProposeActivity) view);
            }
        });
        this.f69042b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.activity.apppropose.$$Lambda$AppProposeActivity$046jFF_OIGLBY5_BCunIjofM7E */

            public final void onClick(View view) {
                AppProposeActivity.this.m101008a((AppProposeActivity) view);
            }
        });
        this.f69042b.setEnabled(false);
        this.f69047g.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.appcenter.business.activity.apppropose.AppProposeActivity.C276561 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                if (!TextUtils.isEmpty(editable)) {
                    AppProposeActivity.this.f69042b.setEnabled(true);
                } else {
                    AppProposeActivity.this.f69042b.setEnabled(false);
                }
            }
        });
    }

    /* renamed from: f */
    private void m101015f() {
        this.f69044d.setText(this.f69049i);
        if (C27548m.m100547m().mo98221e() != null) {
            AbstractC27547l e = C27548m.m100547m().mo98221e();
            this.f69045e.setText(e.mo98214c());
            e.mo98212a(new IGetDataCallback<String>() {
                /* class com.ss.android.appcenter.business.activity.apppropose.AppProposeActivity.C276572 */

                /* access modifiers changed from: private */
                /* renamed from: b */
                public /* synthetic */ void m101022b(String str) {
                    AppProposeActivity.this.f69041a.setText(str);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C28184h.m103248b("AppProposeActivity", "department error: " + errorResult.getErrorMsg());
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    AppProposeActivity.this.f69041a.post(new Runnable(str) {
                        /* class com.ss.android.appcenter.business.activity.apppropose.$$Lambda$AppProposeActivity$2$3mvXnCh8ix1u6ItBHXZS8xT4zMM */
                        public final /* synthetic */ String f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            AppProposeActivity.C276572.this.m101022b(this.f$1);
                        }
                    });
                    C28184h.m103250d("AppProposeActivity", "department: " + str);
                }
            });
        }
    }

    /* renamed from: d */
    private void m101013d() {
        this.f69044d = (TextView) findViewById(R.id.app_name);
        this.f69045e = (TextView) findViewById(R.id.proposer_name);
        this.f69041a = (TextView) findViewById(R.id.proposer_dep);
        this.f69047g = (EditText) findViewById(R.id.reason_edit);
        this.f69042b = (TextView) findViewById(R.id.submit);
        this.f69046f = (ImageView) findViewById(R.id.cancel);
        this.f69048h = (LinearLayout) findViewById(R.id.content);
        this.f69053m = (FrameLayout) findViewById(R.id.root);
    }

    /* renamed from: g */
    private void m101016g() {
        this.f69043c = C28207o.m103285a(this, this.f69053m, getResources().getString(R.string.AppDetail_Application_Mechanism_Submit_loading));
        String obj = this.f69047g.getText().toString();
        JsonObject jsonObject = new JsonObject();
        if (C27548m.m100547m().mo98221e() != null) {
            jsonObject.addProperty("user_id", C27548m.m100547m().mo98221e().mo98213b());
        }
        jsonObject.addProperty("cli_id", this.f69050j);
        jsonObject.addProperty("bot_id", this.f69051k);
        jsonObject.addProperty("proposer_comment", obj);
        HashMap hashMap = new HashMap();
        if (C27548m.m100547m().mo98221e() != null) {
            hashMap.put("Cookie", "session=" + C27548m.m100547m().mo98221e().mo98211a());
        }
        String i = C27724c.m101390i();
        SendHttpRequest.C15253a a = new SendHttpRequest.C15253a().mo55528a(i).mo55526a(SendHttpRequest.Method.POST).mo55533c(jsonObject.toString()).mo55529a(hashMap);
        C28184h.m103250d("AppProposeActivity", "propose post url:" + i + " params:" + jsonObject + " header:" + hashMap);
        final long currentTimeMillis = System.currentTimeMillis();
        SdkSender.asynSendRequestNonWrap(Command.SEND_HTTP, a, new IGetDataCallback<C27698e>() {
            /* class com.ss.android.appcenter.business.activity.apppropose.AppProposeActivity.C276583 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                AppProposeActivity.this.runOnUiThread(new Runnable() {
                    /* class com.ss.android.appcenter.business.activity.apppropose.AppProposeActivity.C276583.RunnableC276602 */

                    public void run() {
                        C28207o.m103287a(AppProposeActivity.this.f69043c);
                    }
                });
                C28184h.m103250d("AppProposeActivity", "propose onError:" + errorResult.getErrorMsg() + " error code: " + errorResult.getErrorCode());
                C27710b.m101271b(-1);
                new C27709a("appcenter_unavailable_apply").mo98866a(System.currentTimeMillis() - currentTimeMillis).mo98865a(-1).mo98867a(errorResult.getMessage()).mo98869b("fail").mo98868a();
                AppProposeActivity appProposeActivity = AppProposeActivity.this;
                LKUIToast.show(appProposeActivity, appProposeActivity.getResources().getString(R.string.AppDetail_Application_Mechanism_Submit_fail));
            }

            /* renamed from: a */
            public void onSuccess(C27698e eVar) {
                AppProposeActivity.this.runOnUiThread(new Runnable() {
                    /* class com.ss.android.appcenter.business.activity.apppropose.AppProposeActivity.C276583.RunnableC276591 */

                    public void run() {
                        C28207o.m103287a(AppProposeActivity.this.f69043c);
                    }
                });
                if (eVar.mo98853a() == 0) {
                    C27710b.m101271b(0);
                    new C27709a("appcenter_unavailable_apply").mo98866a(System.currentTimeMillis() - currentTimeMillis).mo98869b("success").mo98868a();
                    C28181e.m103232a(AppProposeActivity.this);
                    AppProposeActivity.this.finish();
                    AppProposeActivity appProposeActivity = AppProposeActivity.this;
                    if (appProposeActivity != null) {
                        LKUIToast.show(appProposeActivity, (int) R.drawable.appcenter_ok_img, appProposeActivity.getResources().getString(R.string.AppDetail_Application_Mechanism_Submitted));
                        return;
                    }
                    return;
                }
                C28184h.m103250d("AppProposeActivity", "propose error response:" + eVar);
                C27710b.m101271b(eVar.mo98853a());
                new C27709a("appcenter_unavailable_apply").mo98866a(System.currentTimeMillis() - currentTimeMillis).mo98865a(eVar.mo98853a()).mo98867a(eVar.mo98854b()).mo98869b("fail").mo98868a();
                AppProposeActivity appProposeActivity2 = AppProposeActivity.this;
                LKUIToast.show(appProposeActivity2, appProposeActivity2.getResources().getString(R.string.AppDetail_Application_Mechanism_Submit_fail));
            }
        }, new SdkSender.IParser<C27698e>() {
            /* class com.ss.android.appcenter.business.activity.apppropose.AppProposeActivity.C276614 */

            /* renamed from: a */
            public C27698e parse(byte[] bArr) throws IOException {
                return (C27698e) new Gson().fromJson(SendHttpResponse.ADAPTER.decode(bArr).json_body, C27698e.class);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m101008a(View view) {
        m101016g();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m101010b(View view) {
        C28181e.m103232a(this);
        finish();
    }

    /* renamed from: a */
    public static Resources m101005a(AppProposeActivity appProposeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appProposeActivity);
        }
        return appProposeActivity.mo98268a();
    }

    /* renamed from: c */
    public static AssetManager m101012c(AppProposeActivity appProposeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appProposeActivity);
        }
        return appProposeActivity.mo98511c();
    }

    /* renamed from: b */
    public static void m101011b(AppProposeActivity appProposeActivity) {
        appProposeActivity.mo98510b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AppProposeActivity appProposeActivity2 = appProposeActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    appProposeActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.appcenter.common.base.BaseActivity, com.ss.android.appcenter.common.base.FunctionActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.appcenter_apppropose_layout);
        if (getIntent() != null) {
            this.f69049i = getIntent().getStringExtra("app_name");
            this.f69050j = getIntent().getStringExtra("app_id");
            this.f69051k = getIntent().getStringExtra("bot_id");
        }
        this.f69052l = C27528a.m100471a().mo98143b();
        C27710b.m101270b();
        C28184h.m103250d("AppProposeActivity", "onCreate() appname:" + this.f69049i + " appid:" + this.f69050j + " botid:" + this.f69051k);
        m101013d();
        m101014e();
        m101015f();
    }

    /* renamed from: a */
    public static void m101009a(AppProposeActivity appProposeActivity, Context context) {
        appProposeActivity.mo98509a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appProposeActivity);
        }
    }

    /* renamed from: a */
    public static Context m101004a(AppProposeActivity appProposeActivity, Configuration configuration) {
        Context a = appProposeActivity.mo98508a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m101006a(Context context, String str, String str2) {
        m101007a(context, str, "", str2);
    }

    /* renamed from: a */
    public static void m101007a(Context context, String str, String str2, String str3) {
        if (context == null) {
            C28184h.m103248b("AppProposeActivity", "start AppProposeActivity error. context is null");
            return;
        }
        Intent intent = new Intent(context, AppProposeActivity.class);
        intent.putExtra("app_id", str);
        intent.putExtra("bot_id", str2);
        intent.putExtra("app_name", str3);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }
}
