package com.bytedance.ee.larkbrand;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import com.bytedance.ee.larkbrand.service.ExtensionWrapper;
import com.bytedance.ee.larkbrand.utils.C13346h;
import com.bytedance.ee.larkbrand.utils.C13370p;
import com.bytedance.ee.larkbrand.utils.DebugHelper;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.littleapp.C41343f;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.tt.miniapp.C66205j;
import com.tt.miniapp.jsbridge.C66240d;
import com.tt.miniapp.util.C67032f;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.util.C67586c;
import com.tt.miniapphost.view.BaseActivity;
import java.io.File;
import java.io.Serializable;
import java.util.Map;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

public class AboutDebugActivity extends BaseActivity implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public static boolean f34421a;

    /* renamed from: b */
    public static boolean f34422b;

    /* renamed from: A */
    TextView f34423A;

    /* renamed from: B */
    LinearLayout f34424B;

    /* renamed from: C */
    TextView f34425C;

    /* renamed from: D */
    ImageView f34426D;

    /* renamed from: E */
    TextView f34427E;

    /* renamed from: F */
    TextView f34428F;

    /* renamed from: G */
    Switch f34429G;

    /* renamed from: H */
    Switch f34430H;

    /* renamed from: I */
    TextView f34431I;

    /* renamed from: J */
    TextView f34432J;

    /* renamed from: K */
    Switch f34433K;

    /* renamed from: L */
    TextView f34434L;

    /* renamed from: M */
    Switch f34435M;

    /* renamed from: N */
    LinearLayout f34436N;

    /* renamed from: O */
    TextView f34437O;

    /* renamed from: P */
    Switch f34438P;

    /* renamed from: Q */
    Switch f34439Q;

    /* renamed from: R */
    TextView f34440R;

    /* renamed from: S */
    RadioGroup f34441S;

    /* renamed from: T */
    RadioButton f34442T;

    /* renamed from: U */
    RadioButton f34443U;

    /* renamed from: V */
    RadioButton f34444V;

    /* renamed from: W */
    View f34445W;

    /* renamed from: X */
    SharedPreferences f34446X;

    /* renamed from: Y */
    private C66205j f34447Y;

    /* renamed from: c */
    TextView f34448c;

    /* renamed from: d */
    TextView f34449d;

    /* renamed from: e */
    TextView f34450e;

    /* renamed from: f */
    TextView f34451f;

    /* renamed from: g */
    TextView f34452g;

    /* renamed from: h */
    TextView f34453h;

    /* renamed from: i */
    Switch f34454i;

    /* renamed from: j */
    TextView f34455j;

    /* renamed from: k */
    Switch f34456k;

    /* renamed from: l */
    TextView f34457l;

    /* renamed from: m */
    Switch f34458m;

    /* renamed from: n */
    TextView f34459n;

    /* renamed from: o */
    Switch f34460o;

    /* renamed from: p */
    TextView f34461p;

    /* renamed from: q */
    Switch f34462q;

    /* renamed from: r */
    LinearLayout f34463r;

    /* renamed from: s */
    TextView f34464s;

    /* renamed from: t */
    LinearLayout f34465t;

    /* renamed from: u */
    TextView f34466u;

    /* renamed from: v */
    LinearLayout f34467v;

    /* renamed from: w */
    TextView f34468w;

    /* renamed from: x */
    LinearLayout f34469x;

    /* renamed from: y */
    TextView f34470y;

    /* renamed from: z */
    LinearLayout f34471z;

    /* renamed from: a */
    public Context mo48797a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo48799a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m53280a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m53277a(this, configuration);
    }

    /* renamed from: d */
    public Resources mo48806d() {
        return super.getResources();
    }

    /* renamed from: e */
    public void mo48808e() {
        super.onStop();
    }

    /* renamed from: f */
    public AssetManager mo48809f() {
        return super.getAssets();
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m53282c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m53279a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m53281b(this);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.microapp_i_slide_out_right);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0, R.anim.microapp_i_slide_out_right);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C66205j.C66206a mo48801b() {
        return new C66205j.C66206a().mo231551a(true).mo231550a(getResources().getColor(R.color.microapp_m_status_bar_color2));
    }

    /* renamed from: c */
    public void mo48803c() {
        String str;
        File externalFilesDir = getApplicationContext().getExternalFilesDir(null);
        if (externalFilesDir == null) {
            externalFilesDir = getApplicationContext().getFilesDir();
        }
        if (externalFilesDir != null) {
            str = externalFilesDir.getPath();
        } else {
            str = "";
        }
        File file = new File(str + "/snapshot/");
        File[] fileArr = {file, new File(str + "/standard_snapshot/"), new File(str + "/jsi_snapshot/")};
        for (int i = 0; i < 3; i++) {
            File file2 = fileArr[i];
            if (file2.exists()) {
                C67586c.m263051b(file2);
            }
        }
    }

    /* renamed from: a */
    public void mo48798a() {
        String b = LarkExtensionManager.getInstance().getExtension().mo49565b();
        if (!TextUtils.isEmpty(b)) {
            try {
                C67032f.m261249a(b, AppbrandContext.getInst().getApplicationContext());
                this.f34425C.setText(b);
                LKUIToast.show(this, "复制成功");
            } catch (Exception e) {
                LKUIToast.show(this, e.toString());
            }
        }
    }

    /* renamed from: g */
    private void m53283g() {
        this.f34436N = (LinearLayout) findViewById(R.id.container_layout);
        this.f34437O = (TextView) findViewById(R.id.debug_text);
        this.f34426D = (ImageView) findViewById(R.id.page_close);
        this.f34427E = (TextView) findViewById(R.id.page_title);
        this.f34448c = (TextView) findViewById(R.id.show_js_version);
        this.f34449d = (TextView) findViewById(R.id.show_miniapp_version);
        this.f34450e = (TextView) findViewById(R.id.is_ssb_model);
        this.f34451f = (TextView) findViewById(R.id.is_falcon_js_engine);
        this.f34452g = (TextView) findViewById(R.id.show_component_version);
        this.f34453h = (TextView) findViewById(R.id.forceUpdateJssdk);
        this.f34454i = (Switch) findViewById(R.id.update_Jssdk_switch);
        this.f34455j = (TextView) findViewById(R.id.forceUpdateAppbrand);
        this.f34456k = (Switch) findViewById(R.id.update_Appbrand_switch);
        this.f34457l = (TextView) findViewById(R.id.useStableJssdk);
        this.f34458m = (Switch) findViewById(R.id.needstable_Jssdk_switch);
        this.f34459n = (TextView) findViewById(R.id.noCompressJssdk);
        this.f34460o = (Switch) findViewById(R.id.nocompress_Jssdk_switch);
        this.f34461p = (TextView) findViewById(R.id.current_version);
        this.f34462q = (Switch) findViewById(R.id.current_version_switch);
        this.f34465t = (LinearLayout) findViewById(R.id.open_shema_ly);
        this.f34466u = (TextView) findViewById(R.id.schema_url);
        this.f34467v = (LinearLayout) findViewById(R.id.open_appid_ly);
        this.f34468w = (TextView) findViewById(R.id.appid_tv);
        this.f34469x = (LinearLayout) findViewById(R.id.editor_url_ly);
        this.f34470y = (TextView) findViewById(R.id.editorUrl);
        this.f34471z = (LinearLayout) findViewById(R.id.assign_jssdk);
        this.f34423A = (TextView) findViewById(R.id.jssdk_url);
        this.f34463r = (LinearLayout) findViewById(R.id.replace_zip_ly);
        this.f34464s = (TextView) findViewById(R.id.zip_url);
        this.f34424B = (LinearLayout) findViewById(R.id.copy_lark_session);
        this.f34425C = (TextView) findViewById(R.id.lark_session);
        this.f34429G = (Switch) findViewById(R.id.use_ok_http_switch);
        this.f34428F = (TextView) findViewById(R.id.use_ok_http);
        this.f34430H = (Switch) findViewById(R.id.enable_launch_tracing);
        this.f34431I = (TextView) findViewById(R.id.currentDeviceId);
        this.f34433K = (Switch) findViewById(R.id.open_debug_log_sw);
        this.f34432J = (TextView) findViewById(R.id.open_debug_log_tv);
        this.f34435M = (Switch) findViewById(R.id.open_debug_sw);
        this.f34434L = (TextView) findViewById(R.id.open_debug_tv);
        this.f34438P = (Switch) findViewById(R.id.enable_snapshot);
        this.f34439Q = (Switch) findViewById(R.id.enable_standard_snapshot);
        this.f34445W = findViewById(R.id.clean_snapshot);
        this.f34471z.setVisibility(8);
        this.f34440R = (TextView) findViewById(R.id.force_falcon_engine);
        this.f34441S = (RadioGroup) findViewById(R.id.falcon_config);
        this.f34442T = (RadioButton) findViewById(R.id.use_falcon_fg);
        this.f34443U = (RadioButton) findViewById(R.id.force_open_falcon);
        this.f34444V = (RadioButton) findViewById(R.id.force_close_falcon);
        int i = AppbrandContext.getInst().getApplicationContext().getSharedPreferences("sp_debug", 0).getInt("force_falcon_debug_config", DebugHelper.FalconDebugConfig.USE_FG.ordinal());
        if (i == DebugHelper.FalconDebugConfig.USE_FG.ordinal()) {
            this.f34441S.check(this.f34442T.getId());
        } else if (i == DebugHelper.FalconDebugConfig.OPEN_FALCON.ordinal()) {
            this.f34441S.check(this.f34443U.getId());
        } else if (i == DebugHelper.FalconDebugConfig.CLOSE_FALCON.ordinal()) {
            this.f34441S.check(this.f34444V.getId());
        }
        if (!C12941a.m53326b()) {
            this.f34424B.setVisibility(8);
            this.f34425C.setVisibility(0);
        }
    }

    /* renamed from: h */
    private void m53284h() {
        boolean z;
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        this.f34446X = getSharedPreferences("about_debug", 0);
        this.f34424B.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.larkbrand.AboutDebugActivity.View$OnClickListenerC129261 */

            public void onClick(View view) {
                AboutDebugActivity.this.mo48798a();
            }
        });
        this.f34463r.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.larkbrand.AboutDebugActivity.View$OnClickListenerC129272 */

            public void onClick(View view) {
                String string = AboutDebugActivity.this.f34446X.getString("replace_zip_url", "http://10.94.92.xxx/__dist__.zip");
                AboutDebugActivity aboutDebugActivity = AboutDebugActivity.this;
                C13346h.m54343a(aboutDebugActivity, "zip", string, aboutDebugActivity.getString(R.string.lark_brand_confirm), AboutDebugActivity.this.getString(R.string.lark_brand_cancel), "replace_zip_url", new C13346h.AbstractC13350a() {
                    /* class com.bytedance.ee.larkbrand.AboutDebugActivity.View$OnClickListenerC129272.C129281 */

                    @Override // com.bytedance.ee.larkbrand.utils.C13346h.AbstractC13350a
                    /* renamed from: a */
                    public void mo48814a(String str) {
                        AboutDebugActivity.this.mo48800a(str);
                    }
                });
            }
        });
        this.f34471z.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.larkbrand.AboutDebugActivity.View$OnClickListenerC129293 */

            public void onClick(View view) {
                String string = AboutDebugActivity.this.f34446X.getString("assign_js_sdk", "http://10.94.92.xxx/__dev__.zip");
                AboutDebugActivity aboutDebugActivity = AboutDebugActivity.this;
                C13346h.m54343a(aboutDebugActivity, "jssdk URL", string, aboutDebugActivity.getString(R.string.lark_brand_confirm), AboutDebugActivity.this.getString(R.string.lark_brand_cancel), "assign_js_sdk", new C13346h.AbstractC13350a() {
                    /* class com.bytedance.ee.larkbrand.AboutDebugActivity.View$OnClickListenerC129293.C129301 */

                    @Override // com.bytedance.ee.larkbrand.utils.C13346h.AbstractC13350a
                    /* renamed from: a */
                    public void mo48814a(String str) {
                        AboutDebugActivity.this.mo48804c(str);
                    }
                });
            }
        });
        this.f34465t.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.larkbrand.AboutDebugActivity.View$OnClickListenerC129314 */

            public void onClick(View view) {
                String string = AboutDebugActivity.this.f34446X.getString("open_schema_url", "sslocal://microapp?app_id=xxx");
                AboutDebugActivity aboutDebugActivity = AboutDebugActivity.this;
                C13346h.m54343a(aboutDebugActivity, "openschema", string, aboutDebugActivity.getString(R.string.lark_brand_confirm), AboutDebugActivity.this.getString(R.string.lark_brand_cancel), "open_schema_url", new C13346h.AbstractC13350a() {
                    /* class com.bytedance.ee.larkbrand.AboutDebugActivity.View$OnClickListenerC129314.C129321 */

                    @Override // com.bytedance.ee.larkbrand.utils.C13346h.AbstractC13350a
                    /* renamed from: a */
                    public void mo48814a(String str) {
                        AboutDebugActivity.this.f34466u.setText(str);
                        AboutDebugActivity.this.mo48802b(str);
                    }
                });
            }
        });
        this.f34467v.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.larkbrand.AboutDebugActivity.View$OnClickListenerC129335 */

            public void onClick(View view) {
                String string = AboutDebugActivity.this.f34446X.getString("open_appid", HiAnalyticsConstant.HaKey.BI_KEY_APPID);
                AboutDebugActivity aboutDebugActivity = AboutDebugActivity.this;
                C13346h.m54343a(aboutDebugActivity, HiAnalyticsConstant.HaKey.BI_KEY_APPID, string, aboutDebugActivity.getString(R.string.lark_brand_confirm), AboutDebugActivity.this.getString(R.string.lark_brand_cancel), "open_appid", new C13346h.AbstractC13350a() {
                    /* class com.bytedance.ee.larkbrand.AboutDebugActivity.View$OnClickListenerC129335.C129341 */

                    @Override // com.bytedance.ee.larkbrand.utils.C13346h.AbstractC13350a
                    /* renamed from: a */
                    public void mo48814a(String str) {
                        AboutDebugActivity.this.f34468w.setText(str);
                        AboutDebugActivity aboutDebugActivity = AboutDebugActivity.this;
                        aboutDebugActivity.mo48802b("sslocal://microapp?app_id=" + str);
                    }
                });
            }
        });
        this.f34469x.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.larkbrand.AboutDebugActivity.View$OnClickListenerC129356 */

            public void onClick(View view) {
                String string = AboutDebugActivity.this.f34446X.getString("editorUrl", "");
                AboutDebugActivity aboutDebugActivity = AboutDebugActivity.this;
                C13346h.m54343a(aboutDebugActivity, "editorUrl", string, aboutDebugActivity.getString(R.string.lark_brand_confirm), AboutDebugActivity.this.getString(R.string.lark_brand_cancel), "open_appid", new C13346h.AbstractC13350a() {
                    /* class com.bytedance.ee.larkbrand.AboutDebugActivity.View$OnClickListenerC129356.C129361 */

                    @Override // com.bytedance.ee.larkbrand.utils.C13346h.AbstractC13350a
                    /* renamed from: a */
                    public void mo48814a(String str) {
                        AboutDebugActivity.this.mo48807d(str);
                    }
                });
            }
        });
        this.f34445W.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.larkbrand.AboutDebugActivity.View$OnClickListenerC129377 */

            public void onClick(View view) {
                AboutDebugActivity.this.mo48803c();
                LKUIToast.show(AboutDebugActivity.this, "clean success");
            }
        });
        this.f34426D.setImageResource(R.drawable.microapp_m_lefterbackicon_titlebar_light);
        this.f34426D.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.larkbrand.AboutDebugActivity.View$OnClickListenerC129388 */

            public void onClick(View view) {
                AboutDebugActivity.this.finish();
            }
        });
        this.f34427E.setText(getString(R.string.lark_brand_debug));
        this.f34453h.setText(getString(R.string.lark_brand_forceupdate_jssdk));
        boolean b = C12782a.m52839b("force_to_update_js_sdk", false);
        this.f34454i.setOnCheckedChangeListener(this);
        this.f34454i.setChecked(b);
        this.f34455j.setText(getString(R.string.lark_brand_forceupdate_appbrand));
        boolean b2 = C12782a.m52839b("force_to_update_appbrand", false);
        this.f34456k.setOnCheckedChangeListener(this);
        this.f34456k.setChecked(b2);
        this.f34457l.setText(getString(R.string.lark_brand_usestable_jssdk));
        boolean z2 = true;
        if (C12782a.m52836b("need_stable_js_sdk", 0) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f34458m.setOnCheckedChangeListener(this);
        this.f34458m.setChecked(z);
        this.f34459n.setText(getString(R.string.lark_brand_nocompress_jssdk));
        if (C12782a.m52836b("no_compress_js_sdk", 0) == 0) {
            z2 = false;
        }
        this.f34460o.setOnCheckedChangeListener(this);
        this.f34460o.setChecked(z2);
        this.f34461p.setText(getString(R.string.lark_brand_current_version));
        boolean b3 = C12782a.m52839b("force_to_current_version", false);
        this.f34462q.setOnCheckedChangeListener(this);
        this.f34462q.setChecked(b3);
        boolean b4 = C12782a.m52839b("force_net_okhttp", false);
        this.f34428F.setText(getString(R.string.lark_brand_net_switch));
        this.f34429G.setOnCheckedChangeListener(this);
        this.f34429G.setChecked(b4);
        boolean b5 = C12782a.m52839b("enable_launch_tracing", false);
        this.f34430H.setOnCheckedChangeListener(this);
        this.f34430H.setChecked(b5);
        LarkExtensionManager.getInstance().getExtension().getDeviceId(new ExtensionWrapper.AbstractC13303a() {
            /* class com.bytedance.ee.larkbrand.AboutDebugActivity.C129399 */

            @Override // com.bytedance.ee.larkbrand.service.ExtensionWrapper.AbstractC13303a
            /* renamed from: b */
            public void mo48822b(String str) {
            }

            @Override // com.bytedance.ee.larkbrand.service.ExtensionWrapper.AbstractC13303a
            /* renamed from: a */
            public void mo48821a(final String str) {
                AboutDebugActivity.this.f34431I.post(new Runnable() {
                    /* class com.bytedance.ee.larkbrand.AboutDebugActivity.C129399.RunnableC129401 */

                    public void run() {
                        TextView textView = AboutDebugActivity.this.f34431I;
                        textView.setText("CurrentDeviceId:" + str);
                    }
                });
            }
        });
        this.f34432J.setText(getString(R.string.lark_brand_log_switch));
        this.f34433K.setOnCheckedChangeListener(this);
        this.f34433K.setChecked(f34421a);
        this.f34438P.setOnCheckedChangeListener(this);
        this.f34439Q.setOnCheckedChangeListener(this);
        this.f34438P.setChecked(this.f34446X.getBoolean("use_snapshot", false));
        this.f34439Q.setChecked(this.f34446X.getBoolean("use_standard_snapshot", false));
        boolean z3 = AppbrandContext.getInst().getApplicationContext().getSharedPreferences("sp_debug", 0).getBoolean("webview_remote_debug", false);
        this.f34434L.setText(getString(R.string.lark_brand_debug_switch));
        this.f34435M.setOnCheckedChangeListener(this);
        this.f34435M.setChecked(z3);
        this.f34423A.setText(DebugHelper.m54238g(applicationContext));
        String stringExtra = getIntent().getStringExtra("js_version_in_use");
        String stringExtra2 = getIntent().getStringExtra("grey_hash_in_use");
        Map map = (Map) getIntent().getSerializableExtra("component_version");
        StringBuilder sb = new StringBuilder("jsInUseVersion:" + stringExtra);
        if (!TextUtils.isEmpty(stringExtra2)) {
            sb.append("\ngreyHash:" + stringExtra2);
        }
        this.f34448c.setText(sb);
        String stringExtra3 = getIntent().getStringExtra("mini_app_version");
        TextView textView = this.f34449d;
        textView.setText("miniappversion:" + stringExtra3);
        boolean booleanExtra = getIntent().getBooleanExtra("is_ssb", false);
        TextView textView2 = this.f34450e;
        textView2.setText("isSSBModel:" + booleanExtra);
        TextView textView3 = this.f34451f;
        textView3.setText("isFalconJsEngine: " + C66240d.m259242a());
        this.f34440R.setText("Falcon JS Engine Config");
        this.f34442T.setText("Use FG");
        this.f34443U.setText("Force Open");
        this.f34444V.setText("Force Close");
        StringBuilder sb2 = new StringBuilder("componentVersion:");
        if (!CollectionUtils.isEmpty(map)) {
            for (String str : map.keySet()) {
                sb2.append("\n\t" + str + ": " + ((String) map.get(str)));
            }
        }
        this.f34452g.setText(sb2);
    }

    /* renamed from: b */
    public void mo48802b(String str) {
        C12941a.m53318a(AppbrandContext.getInst().getApplicationContext(), str, 1000);
    }

    /* renamed from: c */
    public void mo48804c(String str) {
        this.f34423A.setText(str);
        C12782a.m52834a("assign_jssdk_url", str);
        C13370p.m54374a(this, str);
    }

    /* renamed from: d */
    public void mo48807d(String str) {
        this.f34470y.setText(str);
        C12782a.m52834a("editorUrl", str);
    }

    /* renamed from: a */
    public static Resources m53279a(AboutDebugActivity aboutDebugActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(aboutDebugActivity);
        }
        return aboutDebugActivity.mo48806d();
    }

    /* renamed from: c */
    public static AssetManager m53282c(AboutDebugActivity aboutDebugActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(aboutDebugActivity);
        }
        return aboutDebugActivity.mo48809f();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.lark_brand_activity_about_debug);
        C66205j jVar = new C66205j(this, mo48801b());
        this.f34447Y = jVar;
        jVar.mo231547a(false);
        m53283g();
        m53284h();
    }

    /* renamed from: b */
    public static void m53281b(AboutDebugActivity aboutDebugActivity) {
        aboutDebugActivity.mo48808e();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AboutDebugActivity aboutDebugActivity2 = aboutDebugActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    aboutDebugActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void onRadioButtonClicked(View view) {
        if (((RadioButton) view).isChecked()) {
            int id = view.getId();
            SharedPreferences sharedPreferences = AppbrandContext.getInst().getApplicationContext().getSharedPreferences("sp_debug", 0);
            if (R.id.use_falcon_fg == id) {
                sharedPreferences.edit().putInt("force_falcon_debug_config", DebugHelper.FalconDebugConfig.USE_FG.ordinal()).apply();
            } else if (R.id.force_open_falcon == id) {
                sharedPreferences.edit().putInt("force_falcon_debug_config", DebugHelper.FalconDebugConfig.OPEN_FALCON.ordinal()).apply();
            } else if (R.id.force_close_falcon == id) {
                sharedPreferences.edit().putInt("force_falcon_debug_config", DebugHelper.FalconDebugConfig.CLOSE_FALCON.ordinal()).apply();
            }
            new C41343f().mo148927c();
        }
    }

    /* renamed from: a */
    public void mo48800a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f34464s.setText(str);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, new Random().nextInt());
                jSONObject.put("name", "小程序test");
                jSONObject.put("url", str);
                jSONObject.put("id", "test_zip");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            Application applicationContext = AppbrandContext.getInst().getApplicationContext();
            if (applicationContext != null) {
                C12941a.m53318a(applicationContext, "sslocal://microapp?url=" + jSONObject.toString(), 1000);
            }
        }
    }

    /* renamed from: a */
    public static void m53280a(AboutDebugActivity aboutDebugActivity, Context context) {
        aboutDebugActivity.mo48799a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(aboutDebugActivity);
        }
    }

    /* renamed from: a */
    public static Context m53277a(AboutDebugActivity aboutDebugActivity, Configuration configuration) {
        Context a = aboutDebugActivity.mo48797a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int id = compoundButton.getId();
        int i = 0;
        if (id == R.id.update_Jssdk_switch) {
            LinearLayout linearLayout = this.f34471z;
            if (z == 0) {
                i = 8;
            }
            linearLayout.setVisibility(i);
            if (z == 0) {
                mo48804c("");
            }
            C12782a.m52835a("force_to_update_js_sdk", z);
        } else if (id == R.id.update_Appbrand_switch) {
            C12782a.m52835a("force_to_update_appbrand", z);
        } else if (id == R.id.needstable_Jssdk_switch) {
            C12782a.m52832a("need_stable_js_sdk", (int) z);
        } else if (id == R.id.nocompress_Jssdk_switch) {
            C12782a.m52832a("no_compress_js_sdk", z ? 1 : 0);
        } else if (id == R.id.current_version_switch) {
            C12782a.m52835a("force_to_current_version", z);
        } else if (id == R.id.use_ok_http_switch) {
            C12782a.m52835a("force_net_okhttp", z);
        } else if (id == R.id.open_debug_log_sw) {
            f34421a = z;
        } else if (id == R.id.enable_launch_tracing) {
            C12782a.m52835a("enable_launch_tracing", z);
        } else if (id == R.id.open_debug_sw) {
            f34422b = z;
            AppbrandContext.getInst().getApplicationContext().getSharedPreferences("sp_debug", 0).edit().putBoolean("webview_remote_debug", z).commit();
        } else if (id == R.id.enable_snapshot) {
            this.f34446X.edit().putBoolean("use_snapshot", z).commit();
        } else if (id == R.id.enable_standard_snapshot) {
            this.f34446X.edit().putBoolean("use_standard_snapshot", z).commit();
        }
    }

    /* renamed from: a */
    public static Intent m53278a(Context context, String str, String str2, String str3, boolean z, Map<String, String> map) {
        Intent intent = new Intent(context, AboutDebugActivity.class);
        intent.putExtra("mini_app_version", str);
        intent.putExtra("js_version_in_use", str2);
        intent.putExtra("grey_hash_in_use", str3);
        intent.putExtra("is_ssb", z);
        intent.putExtra("component_version", (Serializable) map);
        return intent;
    }
}
