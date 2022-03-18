package com.ss.android.appcenter.business.activity.appfeedback;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.gson.Gson;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.dto.C27698e;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.net.C27724c;
import com.ss.android.appcenter.common.base.FunctionActivity;
import com.ss.android.appcenter.common.util.C28181e;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28207o;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57767ae;
import com.ss.android.lark.utils.C57824f;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppFeedbackActivity extends FunctionActivity {

    /* renamed from: a */
    public String f69006a = "";

    /* renamed from: b */
    public String f69007b = "";

    /* renamed from: c */
    public String f69008c = "";

    /* renamed from: d */
    private FrameLayout f69009d;

    /* renamed from: e */
    private TextView f69010e;

    /* renamed from: f */
    private EditText f69011f;

    /* renamed from: g */
    private TextView f69012g;

    /* renamed from: h */
    private RecyclerView f69013h;

    /* renamed from: i */
    private View f69014i;

    /* renamed from: j */
    private View f69015j;

    /* renamed from: k */
    private String f69016k = new String();

    /* renamed from: l */
    private String f69017l;

    /* renamed from: m */
    private List<C27651b> f69018m;

    /* renamed from: n */
    private C27652c f69019n;

    /* renamed from: o */
    private JSONObject f69020o = new JSONObject();

    /* renamed from: p */
    private C28207o.C28208a f69021p;

    /* renamed from: a */
    public Context mo98448a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo98450a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m100940a(this, context);
    }

    /* renamed from: c */
    public Resources mo98454c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m100935a(this, configuration);
    }

    /* renamed from: d */
    public void mo98456d() {
        super.onStop();
    }

    /* renamed from: e */
    public AssetManager mo98457e() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m100943c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m100936a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m100942b(this);
    }

    /* renamed from: a */
    public void mo98451a(Editable editable) {
        if (!TextUtils.isEmpty(editable)) {
            if (editable.toString().length() > 1000) {
                this.f69011f.setActivated(false);
                this.f69012g.setText(R.string.OpenPlatform_AppCenter_FeedbackWarn);
                this.f69012g.setVisibility(0);
                return;
            }
            this.f69011f.setActivated(true);
            this.f69012g.setVisibility(4);
        }
    }

    /* renamed from: a */
    public void mo98452a(boolean z) {
        finish();
        if (!z) {
            return;
        }
        if (!TextUtils.isEmpty(this.f69011f.getText().toString()) || this.f69019n.mo100070d().size() > 1) {
            C27650a aVar = new C27650a();
            aVar.mo98480a(this.f69011f.getText().toString());
            ArrayList arrayList = new ArrayList();
            for (C27651b bVar : this.f69019n.mo100070d()) {
                if (bVar.mo98487b()) {
                    arrayList.add(bVar);
                }
            }
            aVar.mo98481a(arrayList);
            aVar.mo98479a(System.currentTimeMillis());
            C27654d.m100985a().mo98496a(this.f69006a, aVar);
        }
    }

    /* renamed from: f */
    private void m100944f() {
        C28181e.m103232a(this);
        mo98452a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m100951n() {
        C28207o.m103287a(this.f69021p);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m100952o() {
        C28207o.m103287a(this.f69021p);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        mo98452a(true);
    }

    /* renamed from: b */
    public void mo98453b() {
        runOnUiThread(new Runnable() {
            /* class com.ss.android.appcenter.business.activity.appfeedback.$$Lambda$AppFeedbackActivity$L_h19Rm2zoGSq2efalPdBjkNbcY */

            public final void run() {
                AppFeedbackActivity.this.m100951n();
            }
        });
        LKUIToast.show(this, getString(R.string.OpenPlatform_AppCenter_FeedbackFail));
    }

    /* renamed from: g */
    private void m100945g() {
        String obj = this.f69011f.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            this.f69011f.setActivated(false);
            this.f69012g.setText(R.string.OpenPlatform_AppCenter_ProblemPlaceholder);
            this.f69012g.setVisibility(0);
        } else if (obj.length() <= 1000) {
            m100949l();
        }
    }

    /* renamed from: j */
    private void m100947j() {
        C27650a a = C27654d.m100985a().mo98495a(this.f69006a);
        if (a != null && System.currentTimeMillis() - a.mo98478a() <= 7200000) {
            this.f69017l = a.mo98482b();
            List<C27651b> c = a.mo98483c();
            if (c != null) {
                for (C27651b bVar : c) {
                    if (bVar.mo98488c() != null && !TextUtils.isEmpty(bVar.mo98488c().getPath()) && new File(bVar.mo98488c().getPath()).exists()) {
                        this.f69018m.add(bVar);
                    }
                }
            }
        }
    }

    /* renamed from: m */
    private void m100950m() {
        this.f69009d = (FrameLayout) findViewById(R.id.root);
        this.f69010e = (TextView) findViewById(R.id.title);
        this.f69011f = (EditText) findViewById(R.id.edit);
        this.f69012g = (TextView) findViewById(R.id.warn);
        this.f69013h = (RecyclerView) findViewById(R.id.recycler);
        this.f69014i = findViewById(R.id.back);
        this.f69015j = findViewById(R.id.submit);
        this.f69014i.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.activity.appfeedback.$$Lambda$AppFeedbackActivity$0UlC_QbNp8KU37EdpbZTxRFL4no */

            public final void onClick(View view) {
                AppFeedbackActivity.this.m100941b((AppFeedbackActivity) view);
            }
        });
        this.f69015j.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.activity.appfeedback.$$Lambda$AppFeedbackActivity$UxgpCP26FqESzLGMKjHtNo4DyS4 */

            public final void onClick(View view) {
                AppFeedbackActivity.this.m100938a((AppFeedbackActivity) view);
            }
        });
        this.f69011f.addTextChangedListener(new C57767ae() {
            /* class com.ss.android.appcenter.business.activity.appfeedback.AppFeedbackActivity.C276493 */

            @Override // com.ss.android.lark.utils.C57767ae
            public void afterTextChanged(Editable editable) {
                AppFeedbackActivity.this.mo98451a(editable);
            }
        });
        this.f69011f.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.android.appcenter.business.activity.appfeedback.$$Lambda$AppFeedbackActivity$AA0F_9cH_Anx13S8H6wJbVvp9pw */

            public final void onFocusChange(View view, boolean z) {
                AppFeedbackActivity.this.m100939a((AppFeedbackActivity) view, (View) z);
            }
        });
    }

    /* renamed from: i */
    private void m100946i() {
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("app_name");
            this.f69008c = stringExtra;
            if (!TextUtils.isEmpty(stringExtra)) {
                this.f69016k = this.f69008c + ' ';
            }
            this.f69016k += getResources().getString(R.string.OpenPlatform_AppCenter_Feedback);
            this.f69006a = intent.getStringExtra("app_id");
            this.f69007b = intent.getStringExtra(ShareHitPoint.f121868c);
            try {
                this.f69020o.put("mp_version", intent.getStringExtra("mp_version"));
                this.f69020o.put("url", intent.getStringExtra("url"));
            } catch (JSONException e) {
                C28184h.m103248b("AppFeedbackActivity", "json error:" + e);
            }
            C28184h.m103250d("AppFeedbackActivity", "path feedback enterparam: appId:" + this.f69006a + " appName:" + this.f69008c + " source:" + this.f69007b + " scene:" + this.f69020o.toString());
            C27710b.m101260a(mo98449a(this.f69007b), this.f69006a, this.f69008c);
        }
    }

    /* renamed from: k */
    private List<String> m100948k() {
        List d = this.f69019n.mo100070d();
        if (!((C27651b) d.get(0)).mo98487b()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < d.size(); i++) {
            if (((C27651b) d.get(i)).mo98487b()) {
                String path = ((C27651b) d.get(i)).mo98488c().getPath();
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (((C27651b) d.get(i)).mo98488c().getSize() > 1048576) {
                    options.inSampleSize = 8;
                }
                Bitmap decodeFile = BitmapFactory.decodeFile(path, options);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                decodeFile.compress(Bitmap.CompressFormat.JPEG, 40, byteArrayOutputStream);
                String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                arrayList.add("data:image/png;base64," + encodeToString);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    private void m100949l() {
        this.f69021p = C28207o.m103285a(this, this.f69009d, getString(R.string.OpenPlatform_AppCenter_FeedbackLoading));
        String a = C27724c.m101380a();
        HashMap hashMap = new HashMap();
        if (C27548m.m100547m().mo98221e() != null) {
            hashMap.put("Cookie", "session=" + C27548m.m100547m().mo98221e().mo98211a());
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("detail", this.f69011f.getText().toString());
            jSONObject.put("cli_id", this.f69006a);
            jSONObject.put(ShareHitPoint.f121868c, this.f69007b);
            this.f69020o.put("device_version", Build.MODEL);
            this.f69020o.put("os_version", Build.VERSION.RELEASE);
            this.f69020o.put("lark_version", C27548m.m100547m().mo98218b().mo98171b());
            jSONObject.put("scene", this.f69020o);
            List<String> k = m100948k();
            if (k != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : k) {
                    jSONArray.put(str);
                }
                jSONObject.put("images_base64", jSONArray);
            }
        } catch (JSONException e) {
            C28184h.m103248b("AppFeedbackActivity", "feedback json error:" + e);
        }
        C28184h.m103250d("AppFeedbackActivity", "path feedback requestdata: " + jSONObject.toString());
        SdkSender.asynSendRequestNonWrap(Command.SEND_HTTP, new SendHttpRequest.C15253a().mo55528a(a).mo55526a(SendHttpRequest.Method.POST).mo55529a(hashMap).mo55533c(jSONObject.toString()), new IGetDataCallback<C27698e>() {
            /* class com.ss.android.appcenter.business.activity.appfeedback.AppFeedbackActivity.C276471 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C28184h.m103250d("AppFeedbackActivity", "path feedback onError:" + errorResult);
                AppFeedbackActivity.this.mo98453b();
                AppFeedbackActivity appFeedbackActivity = AppFeedbackActivity.this;
                C27710b.m101261a(appFeedbackActivity.mo98449a(appFeedbackActivity.f69007b), AppFeedbackActivity.this.f69006a, AppFeedbackActivity.this.f69008c, errorResult.getErrorCode(), errorResult.getErrorMsg());
            }

            /* renamed from: a */
            public void onSuccess(C27698e eVar) {
                C28184h.m103250d("AppFeedbackActivity", "path feedback onSuccess:" + eVar);
                if (eVar.mo98853a() == 0) {
                    C28181e.m103232a(AppFeedbackActivity.this);
                    AppFeedbackActivity.this.mo98452a(false);
                    AppFeedbackActivity.this.mo98268a();
                    AppFeedbackActivity appFeedbackActivity = AppFeedbackActivity.this;
                    C27710b.m101275b(appFeedbackActivity.mo98449a(appFeedbackActivity.f69007b), AppFeedbackActivity.this.f69006a, AppFeedbackActivity.this.f69008c);
                    return;
                }
                AppFeedbackActivity.this.mo98453b();
            }
        }, new SdkSender.IParser<C27698e>() {
            /* class com.ss.android.appcenter.business.activity.appfeedback.AppFeedbackActivity.C276482 */

            /* renamed from: a */
            public C27698e parse(byte[] bArr) throws IOException {
                return (C27698e) new Gson().fromJson(SendHttpResponse.ADAPTER.decode(bArr).json_body, C27698e.class);
            }
        });
    }

    /* renamed from: a */
    public void mo98268a() {
        runOnUiThread(new Runnable() {
            /* class com.ss.android.appcenter.business.activity.appfeedback.$$Lambda$AppFeedbackActivity$3SYM4ZF_IMUImibOIxDztqikMmc */

            public final void run() {
                AppFeedbackActivity.this.m100952o();
            }
        });
        LKUIToast.show(this, (int) R.drawable.appcenter_ok_img, getString(R.string.OpenPlatform_AppCenter_FeedbackSuccess));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m100938a(View view) {
        m100945g();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m100941b(View view) {
        m100944f();
    }

    /* renamed from: a */
    public static Resources m100936a(AppFeedbackActivity appFeedbackActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appFeedbackActivity);
        }
        return appFeedbackActivity.mo98454c();
    }

    /* renamed from: c */
    public static AssetManager m100943c(AppFeedbackActivity appFeedbackActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appFeedbackActivity);
        }
        return appFeedbackActivity.mo98457e();
    }

    /* renamed from: b */
    public static void m100942b(AppFeedbackActivity appFeedbackActivity) {
        appFeedbackActivity.mo98456d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AppFeedbackActivity appFeedbackActivity2 = appFeedbackActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    appFeedbackActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.appcenter.common.base.BaseActivity, com.ss.android.appcenter.common.base.FunctionActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.appcenter_feedback_activity);
        m100950m();
        m100946i();
        this.f69010e.setText(this.f69016k);
        this.f69017l = new String();
        this.f69018m = new ArrayList();
        m100947j();
        boolean z = false;
        if (this.f69018m.size() < 4) {
            this.f69018m.add(new C27651b(false));
        }
        if (!TextUtils.isEmpty(this.f69017l)) {
            this.f69011f.setText(this.f69017l);
            EditText editText = this.f69011f;
            if (this.f69017l.length() <= 1000) {
                z = true;
            }
            editText.setActivated(z);
        } else {
            this.f69011f.setActivated(true);
        }
        C27652c cVar = new C27652c(this, this.f69018m);
        this.f69019n = cVar;
        this.f69013h.setAdapter(cVar);
        this.f69013h.setLayoutManager(new GridLayoutManager(this, 4));
    }

    /* renamed from: a */
    public String mo98449a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -607953617:
                if (str.equals("MobileH5")) {
                    c = 0;
                    break;
                }
                break;
            case -607953435:
                if (str.equals("MobileMP")) {
                    c = 1;
                    break;
                }
                break;
            case 1410367280:
                if (str.equals("MobileAppDetail")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "h5";
            case 1:
                return "miniprogram";
            case 2:
                return "app_detail";
            default:
                return str;
        }
    }

    /* renamed from: a */
    public static void m100940a(AppFeedbackActivity appFeedbackActivity, Context context) {
        appFeedbackActivity.mo98450a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appFeedbackActivity);
        }
    }

    /* renamed from: a */
    public static Context m100935a(AppFeedbackActivity appFeedbackActivity, Configuration configuration) {
        Context a = appFeedbackActivity.mo98448a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m100939a(View view, boolean z) {
        if (z && TextUtils.isEmpty(this.f69011f.getText())) {
            this.f69011f.setActivated(true);
            this.f69012g.setVisibility(4);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 233 && C27548m.m100547m().mo98226j() != null) {
            List<Photo> a = C27548m.m100547m().mo98226j().mo98197a(intent);
            if (this.f69019n != null) {
                int size = a.size();
                ArrayList arrayList = new ArrayList();
                for (Photo photo : a) {
                    C27651b bVar = new C27651b();
                    bVar.mo98486a(true);
                    bVar.mo98485a(photo);
                    arrayList.add(bVar);
                }
                if (size < 4) {
                    C27651b bVar2 = new C27651b();
                    bVar2.mo98486a(false);
                    arrayList.add(bVar2);
                }
                this.f69019n.mo100069c(arrayList);
            }
        }
    }

    /* renamed from: a */
    public static void m100937a(Context context, String str, String str2, String str3, String str4, String str5) {
        if (context == null) {
            C28184h.m103250d("AppFeedbackActivity", "path feedback context is null");
            return;
        }
        Intent intent = new Intent(context, AppFeedbackActivity.class);
        intent.putExtra("app_name", str);
        intent.putExtra("app_id", str2);
        intent.putExtra(ShareHitPoint.f121868c, str3);
        intent.putExtra("mp_version", str4);
        intent.putExtra("url", str5);
        context.startActivity(intent);
    }
}
