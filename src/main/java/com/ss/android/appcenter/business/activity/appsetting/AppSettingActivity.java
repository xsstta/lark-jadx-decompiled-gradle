package com.ss.android.appcenter.business.activity.appsetting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.ee.larkbrand.permission.AbstractC13298i;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.gson.Gson;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.openplatform.plugins.utils.C25613c;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.activity.appdetail.C27646d;
import com.ss.android.appcenter.business.activity.appsetting.AppSettingActivity;
import com.ss.android.appcenter.business.activity.appsetting.GadgetUpdateControl;
import com.ss.android.appcenter.business.dto.AppDetailInfo;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.net.C27724c;
import com.ss.android.appcenter.business.p1265a.C27568a;
import com.ss.android.appcenter.business.p1265a.C27569b;
import com.ss.android.appcenter.business.p1265a.C27582j;
import com.ss.android.appcenter.business.p1268b.C27688a;
import com.ss.android.appcenter.common.base.BaseActivity;
import com.ss.android.appcenter.common.util.C28176a;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27543h;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.p3362a.p3367e.C67460f;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.refer.common.base.AppType;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AppSettingActivity extends BaseActivity {

    /* renamed from: A */
    private UDSwitch f69061A;

    /* renamed from: B */
    private Scene f69062B;

    /* renamed from: C */
    private String f69063C;

    /* renamed from: D */
    private boolean f69064D;

    /* renamed from: E */
    private boolean[] f69065E;

    /* renamed from: F */
    private LittleAppPermissionData f69066F;

    /* renamed from: G */
    private Map<Integer, Boolean> f69067G = new HashMap();

    /* renamed from: H */
    private String f69068H = "";

    /* renamed from: I */
    private String f69069I = "";

    /* renamed from: J */
    private Map<String, String> f69070J;

    /* renamed from: K */
    private boolean f69071K = false;

    /* renamed from: L */
    private C27646d f69072L;

    /* renamed from: M */
    private boolean f69073M;

    /* renamed from: N */
    private boolean f69074N;

    /* renamed from: O */
    private boolean f69075O;

    /* renamed from: P */
    private boolean f69076P = false;

    /* renamed from: a */
    public GadgetVersionUpdateView f69077a;

    /* renamed from: b */
    List<LittleAppPermissionData> f69078b;

    /* renamed from: c */
    public String f69079c = "";

    /* renamed from: d */
    public String f69080d = "";

    /* renamed from: e */
    private RecyclerView f69081e;

    /* renamed from: f */
    private TextView f69082f;

    /* renamed from: g */
    private View f69083g;

    /* renamed from: h */
    private LinearLayout f69084h;

    /* renamed from: i */
    private LottieAnimationView f69085i;

    /* renamed from: j */
    private ImageView f69086j;

    /* renamed from: k */
    private ImageView f69087k;

    /* renamed from: l */
    private TextView f69088l;

    /* renamed from: m */
    private TextView f69089m;

    /* renamed from: n */
    private TextView f69090n;

    /* renamed from: o */
    private TextView f69091o;

    /* renamed from: p */
    private ImageView f69092p;

    /* renamed from: q */
    private RelativeLayout f69093q;

    /* renamed from: r */
    private RelativeLayout f69094r;

    /* renamed from: s */
    private ImageView f69095s;

    /* renamed from: t */
    private RelativeLayout f69096t;

    /* renamed from: u */
    private RelativeLayout f69097u;

    /* renamed from: v */
    private RelativeLayout f69098v;

    /* renamed from: w */
    private TextView f69099w;

    /* renamed from: x */
    private UDSwitch f69100x;

    /* renamed from: y */
    private RelativeLayout f69101y;

    /* renamed from: z */
    private View f69102z;

    /* renamed from: a */
    public Context mo98534a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo98268a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo98535a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m101034a(this, context);
    }

    /* renamed from: b */
    public void mo98538b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo98539c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m101026a(this, configuration);
    }

    public AssetManager getAssets() {
        return m101046c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m101027a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m101042b(this);
    }

    /* renamed from: a */
    public void mo98537a(String str, String str2, boolean z) {
        if ((this.f69062B == Scene.MINI_APP || this.f69062B == Scene.H5) && C27548m.m100547m().mo98224h() != null) {
            List<LittleAppPermissionData> a = C27548m.m100547m().mo98224h().mo98191a(this, str, this.f69062B == Scene.MINI_APP ? AppType.GadgetAPP : AppType.WebAPP);
            this.f69078b = a;
            if (z) {
                C27568a.m100611a(str, a, true, null, null);
            }
            this.f69066F = m101028a(this.f69078b);
            if (!CollectionUtils.isEmpty(this.f69078b)) {
                int size = this.f69078b.size();
                this.f69065E = new boolean[size];
                for (int i = 0; i < size; i++) {
                    this.f69065E[i] = this.f69078b.get(i).isGranted();
                }
                this.f69082f.setVisibility(0);
                this.f69081e.setVisibility(0);
                this.f69082f.setText(C28209p.m103298a(this, (int) R.string.AppDetail_Setting_PermissionTitle, "app_name", str2));
                this.f69081e.setLayoutManager(new LinearLayoutManager(this));
                this.f69081e.setAdapter(new C27668a(this, this.f69078b, this.f69065E, new CompoundButton.OnCheckedChangeListener() {
                    /* class com.ss.android.appcenter.business.activity.appsetting.AppSettingActivity.C276621 */

                    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        LittleAppPermissionData littleAppPermissionData = (LittleAppPermissionData) compoundButton.getTag();
                        littleAppPermissionData.setGranted(z);
                        AppSettingActivity.this.mo98536a(littleAppPermissionData);
                    }
                }));
            } else {
                this.f69065E = null;
                m101064q();
            }
            if (this.f69066F == null) {
                m101065r();
            } else {
                m101066s();
            }
        } else {
            m101064q();
            m101065r();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m101035a(AppDetailInfo appDetailInfo) {
        if (appDetailInfo == null) {
            m101063p();
        } else if ((!this.f69064D || TextUtils.equals(appDetailInfo.getAppId(), this.f69063C)) && (this.f69064D || TextUtils.equals(appDetailInfo.getBotId(), this.f69063C))) {
            m101043b(appDetailInfo);
            if (C27569b.m100618a()) {
                m101060m();
            }
        } else {
            m101062o();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m101038a(String str, View view) {
        if (!TextUtils.isEmpty(str)) {
            m101039a(str, getString(R.string.AppDetail_Setting_PrivacyPolicy));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m101037a(AppDetailInfo appDetailInfo, CompoundButton compoundButton, boolean z) {
        appDetailInfo.setmNotificationType(z ? 1 : 2);
        this.f69073M = z;
        this.f69074N = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m101036a(AppDetailInfo appDetailInfo, View view) {
        StringBuilder sb = new StringBuilder(C27724c.m101392k());
        sb.append("?type=app");
        sb.append("&params=");
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", appDetailInfo.getAppId());
        try {
            sb.append(URLEncoder.encode(new Gson().toJson(hashMap), StandardCharsets.UTF_8.name()));
        } catch (UnsupportedEncodingException unused) {
            C28184h.m103248b("AppSettingActivity", "UnsupportedEncodingException");
        }
        if (C27548m.m100547m().mo98222f() != null) {
            C27548m.m100547m().mo98222f().mo98202a(this, sb.toString(), null, false, null, null);
        }
    }

    /* renamed from: a */
    private void m101040a(boolean z) {
        if (z) {
            this.f69090n.setTextColor(ContextCompat.getColor(this, R.color.primary_pri_500));
        } else {
            this.f69090n.setTextColor(ContextCompat.getColor(this, R.color.text_caption));
        }
    }

    /* renamed from: a */
    public void mo98536a(LittleAppPermissionData littleAppPermissionData) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(littleAppPermissionData);
        AppType appType = this.f69062B == Scene.H5 ? AppType.WebAPP : AppType.GadgetAPP;
        String str = this.f69070J.get("update");
        AbstractC27543h h = C27548m.m100547m().mo98224h();
        String str2 = this.f69079c;
        if (str == null) {
            str = "";
        }
        h.mo98195a(this, str2, str, arrayList, appType, this.f69069I, 2);
    }

    /* renamed from: a */
    private void m101039a(String str, String str2) {
        if (C27548m.m100547m().mo98222f() != null) {
            C27548m.m100547m().mo98222f().mo98202a(this, str, "", false, str2, null);
        } else {
            C28184h.m103248b("AppSettingActivity", "RouterProvider null!");
        }
    }

    /* renamed from: e */
    private void m101052e() {
        this.f69086j.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.activity.appsetting.$$Lambda$AppSettingActivity$iMcqvIsFQ1l8Yk6gE9XSwh_YeM */

            public final void onClick(View view) {
                AppSettingActivity.this.m101041b((AppSettingActivity) view);
            }
        });
    }

    /* renamed from: n */
    private void m101061n() {
        m101068u().getAppDetailInfoMediatorLiveData(this.f69063C, this.f69064D, this.f69068H);
    }

    /* renamed from: q */
    private void m101064q() {
        this.f69082f.setVisibility(8);
        this.f69081e.setVisibility(8);
    }

    /* renamed from: r */
    private void m101065r() {
        this.f69102z.setVisibility(8);
        this.f69101y.setVisibility(8);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void finish() {
        m101056i();
        super.finish();
        m101054f();
        GadgetUpdateControl.f69118a.mo98583h();
    }

    /* renamed from: k */
    private void m101058k() {
        m101068u().getAppDetailInfoMediatorLiveData().mo5923a(this, new AbstractC1178x() {
            /* class com.ss.android.appcenter.business.activity.appsetting.$$Lambda$AppSettingActivity$gsrEtxEsBSxOvhimMCDyCag2NrE */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                AppSettingActivity.this.m101035a((AppSettingActivity) ((AppDetailInfo) obj));
            }
        });
    }

    /* renamed from: o */
    private void m101062o() {
        this.f69084h.setVisibility(8);
        this.f69083g.setVisibility(8);
        this.f69091o.setVisibility(8);
        C27582j.m100671a(true, this.f69085i);
    }

    /* renamed from: u */
    private C27646d m101068u() {
        if (this.f69072L == null) {
            this.f69072L = (C27646d) aj.m5366a(this).mo6005a(C27646d.class);
        }
        return this.f69072L;
    }

    /* renamed from: f */
    private void m101054f() {
        int i;
        if (this.f69074N) {
            if (this.f69073M) {
                i = 1;
            } else {
                i = 2;
            }
            m101068u().sendNotificationSetChangeRequest(this.f69063C, m101068u().getAppDetailInfoMediatorLiveData().mo5927b(), this.f69079c, i);
        }
    }

    /* renamed from: l */
    private void m101059l() {
        if (TextUtils.isEmpty(this.f69063C)) {
            m101063p();
            return;
        }
        m101068u().getAppDetailInfoMediatorLiveData(this.f69063C, this.f69064D, this.f69068H);
        if (C27548m.m100547m().mo98225i() != null && this.f69062B == Scene.MINI_APP) {
            GadgetUpdateControl.f69118a.mo98574a(new GadgetUpdateControl.UpdateCheckCallback() {
                /* class com.ss.android.appcenter.business.activity.appsetting.AppSettingActivity.C276632 */

                @Override // com.ss.android.appcenter.business.activity.appsetting.GadgetUpdateControl.UpdateCheckCallback
                /* renamed from: a */
                public void mo98543a(boolean z) {
                    C28184h.m103250d("AppSettingActivity", "gadget check update done: " + z);
                    if (z) {
                        AppSettingActivity.this.f69077a.mo98544a(1);
                    } else {
                        AppSettingActivity.this.f69077a.mo98544a(0);
                    }
                }
            });
        }
    }

    /* renamed from: m */
    private void m101060m() {
        AppType appType;
        if (!this.f69071K) {
            C28184h.m103250d("AppSettingActivity", "sync auth data start");
            if (this.f69062B == Scene.H5) {
                appType = AppType.WebAPP;
            } else {
                appType = AppType.GadgetAPP;
            }
            C27548m.m100547m().mo98224h().mo98194a(this, this.f69063C, "", appType, new AbstractC13298i() {
                /* class com.ss.android.appcenter.business.activity.appsetting.AppSettingActivity.C276643 */

                /* access modifiers changed from: private */
                /* renamed from: c */
                public /* synthetic */ void m101077c() {
                    AppSettingActivity appSettingActivity = AppSettingActivity.this;
                    appSettingActivity.mo98537a(appSettingActivity.f69079c, AppSettingActivity.this.f69080d, true);
                }

                @Override // com.bytedance.ee.larkbrand.permission.AbstractC13298i
                /* renamed from: a */
                public void mo49531a() {
                    C28184h.m103250d("AppSettingActivity", "sync auth data success");
                    C25613c.m91382a(new Runnable() {
                        /* class com.ss.android.appcenter.business.activity.appsetting.$$Lambda$AppSettingActivity$3$JGka43dEGUkduhTed388xV19eAU */

                        public final void run() {
                            AppSettingActivity.C276643.this.m101077c();
                        }
                    });
                }

                @Override // com.bytedance.ee.larkbrand.permission.AbstractC13298i
                /* renamed from: b */
                public void mo49532b() {
                    C28184h.m103250d("AppSettingActivity", "sync auth data failed");
                    C27568a.m100611a(AppSettingActivity.this.f69079c, null, false, String.valueOf(ApiCode.GENERAL_UNKONW_ERROR.code), ApiCode.GENERAL_UNKONW_ERROR.msg);
                }
            });
            this.f69071K = true;
        }
    }

    /* renamed from: p */
    private void m101063p() {
        this.f69091o.setVisibility(8);
        this.f69084h.setVisibility(0);
        this.f69083g.setVisibility(8);
        C27582j.m100671a(false, this.f69085i);
        this.f69084h.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.activity.appsetting.$$Lambda$AppSettingActivity$fBGEvOylBrowDIV2TPbWXC3a6wQ */

            public final void onClick(View view) {
                AppSettingActivity.this.m101032a((AppSettingActivity) view);
            }
        });
    }

    /* renamed from: s */
    private void m101066s() {
        this.f69099w.setVisibility(0);
        if (this.f69075O) {
            this.f69101y.setVisibility(0);
            this.f69102z.setVisibility(0);
        } else {
            this.f69101y.setVisibility(0);
            this.f69102z.setVisibility(8);
        }
        this.f69061A.setChecked(this.f69066F.isGranted());
        this.f69061A.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.appcenter.business.activity.appsetting.$$Lambda$AppSettingActivity$34gG5JmZn4fx_L8TkmEqIrYKnk */

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AppSettingActivity.this.m101033a((AppSettingActivity) compoundButton, (CompoundButton) z);
            }
        });
    }

    /* renamed from: i */
    private void m101056i() {
        AppType appType;
        List<LittleAppPermissionData> g = m101055g();
        if (!CollectionUtils.isEmpty(this.f69067G)) {
            if (this.f69062B == Scene.H5) {
                Intent intent = new Intent();
                intent.putExtra("extra_change_permission_map", (Serializable) this.f69067G);
                setResult(51, intent);
            } else if (C27548m.m100547m().mo98224h() != null) {
                C28184h.m103250d("AppSettingActivity", "update permission");
                if (this.f69062B == Scene.H5) {
                    appType = AppType.WebAPP;
                } else {
                    appType = AppType.GadgetAPP;
                }
                String str = this.f69070J.get("update");
                AbstractC27543h h = C27548m.m100547m().mo98224h();
                String str2 = this.f69079c;
                if (str == null) {
                    str = "";
                }
                h.mo98195a(this, str2, str, g, appType, this.f69069I, 2);
            }
        }
    }

    /* renamed from: t */
    private void m101067t() {
        if (TextUtils.isEmpty(this.f69089m.getText())) {
            this.f69089m.setVisibility(8);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f69088l.getLayoutParams();
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = C28209p.m103293a((Context) this, 33.0f);
                this.f69088l.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        this.f69089m.setVisibility(0);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f69088l.getLayoutParams();
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.bottomMargin = 0;
            this.f69088l.setLayoutParams(marginLayoutParams2);
        }
    }

    /* renamed from: g */
    private List<LittleAppPermissionData> m101055g() {
        List<LittleAppPermissionData> list;
        boolean z;
        LittleAppPermissionData littleAppPermissionData;
        C28184h.m103250d("AppSettingActivity", "buildPermissionChangeMap");
        ArrayList arrayList = new ArrayList();
        if (this.f69067G.containsKey(20) && (littleAppPermissionData = this.f69066F) != null) {
            arrayList.add(new LittleAppPermissionData(littleAppPermissionData.getPermission(), this.f69066F.getName(), this.f69066F.isGranted()));
        }
        if (!(this.f69065E == null || (list = this.f69078b) == null || list.size() == 0)) {
            int size = this.f69078b.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                } else if (this.f69065E[i] != this.f69078b.get(i).isGranted()) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                for (int i2 = 0; i2 < size; i2++) {
                    LittleAppPermissionData littleAppPermissionData2 = this.f69078b.get(i2);
                    if (this.f69065E[i2] != littleAppPermissionData2.isGranted()) {
                        arrayList.add(new LittleAppPermissionData(littleAppPermissionData2.getPermission(), littleAppPermissionData2.getName(), littleAppPermissionData2.isGranted()));
                        this.f69067G.put(Integer.valueOf(littleAppPermissionData2.getPermission()), Boolean.valueOf(littleAppPermissionData2.isGranted()));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    private void m101057j() {
        if (getIntent() != null) {
            if (getIntent().hasExtra("scene")) {
                this.f69062B = Scene.getScene(getIntent().getIntExtra("scene", 0));
            } else {
                this.f69062B = null;
            }
            if (!TextUtils.isEmpty(getIntent().getStringExtra("app_id"))) {
                this.f69063C = getIntent().getStringExtra("app_id");
                this.f69064D = true;
            } else {
                this.f69063C = getIntent().getStringExtra("bot_id");
                this.f69064D = false;
            }
            this.f69068H = getIntent().getStringExtra(HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
            if (getIntent().getSerializableExtra("callback_json") != null) {
                this.f69070J = (Map) getIntent().getSerializableExtra("callback_json");
            } else {
                this.f69070J = new HashMap();
            }
            this.f69069I = getIntent().getStringExtra("session");
        }
    }

    /* renamed from: d */
    private void m101049d() {
        this.f69081e = (RecyclerView) findViewById(R.id.permission_list);
        this.f69082f = (TextView) findViewById(R.id.permission_list_desc);
        this.f69083g = findViewById(R.id.contentView);
        this.f69084h = (LinearLayout) findViewById(R.id.error_view);
        this.f69085i = (LottieAnimationView) findViewById(R.id.lottie_loading_anim);
        this.f69086j = (ImageView) findViewById(R.id.image_back);
        this.f69087k = (ImageView) findViewById(R.id.app_image);
        this.f69088l = (TextView) findViewById(R.id.app_name);
        this.f69089m = (TextView) findViewById(R.id.app_version);
        this.f69090n = (TextView) findViewById(R.id.app_developer);
        this.f69094r = (RelativeLayout) findViewById(R.id.app_feedback_wrapper);
        this.f69095s = (ImageView) findViewById(R.id.iv_share);
        this.f69093q = (RelativeLayout) findViewById(R.id.app_developer_wrapper);
        this.f69097u = (RelativeLayout) findViewById(R.id.user_agreement_wrapper);
        this.f69096t = (RelativeLayout) findViewById(R.id.user_privacy_wrapper);
        this.f69092p = (ImageView) findViewById(R.id.app_developer_icon);
        this.f69091o = (TextView) findViewById(R.id.report);
        this.f69098v = (RelativeLayout) findViewById(R.id.app_notification_ly);
        this.f69099w = (TextView) findViewById(R.id.app_setting_tv);
        this.f69100x = (UDSwitch) findViewById(R.id.app_notification_switch);
        this.f69077a = (GadgetVersionUpdateView) findViewById(R.id.app_version_new);
        this.f69101y = (RelativeLayout) findViewById(R.id.app_badge_ly);
        this.f69102z = findViewById(R.id.divider_badge);
        this.f69061A = (UDSwitch) findViewById(R.id.app_permission_badge_switch);
        if (this.f69062B == Scene.MINI_APP && C27548m.m100547m().mo98225i() != null) {
            GadgetUpdateControl.f69118a.mo98572a(this, this.f69077a, this.f69063C);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m101041b(View view) {
        finish();
    }

    /* renamed from: a */
    public static Resources m101027a(AppSettingActivity appSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appSettingActivity);
        }
        return appSettingActivity.mo98268a();
    }

    /* renamed from: c */
    public static AssetManager m101046c(AppSettingActivity appSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appSettingActivity);
        }
        return appSettingActivity.mo98539c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.appcenter.common.base.BaseActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.appcenter_appsetting_layout);
        m101057j();
        m101049d();
        m101052e();
        m101058k();
        m101062o();
        m101059l();
    }

    /* renamed from: b */
    public static void m101042b(AppSettingActivity appSettingActivity) {
        appSettingActivity.mo98538b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AppSettingActivity appSettingActivity2 = appSettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    appSettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: c */
    private void m101047c(AppDetailInfo appDetailInfo) {
        if (!TextUtils.isEmpty(appDetailInfo.getAppId())) {
            this.f69095s.setVisibility(0);
            this.f69095s.setOnClickListener(new View.OnClickListener(appDetailInfo) {
                /* class com.ss.android.appcenter.business.activity.appsetting.$$Lambda$AppSettingActivity$4vt_l0XHcEOWBrEyNrxKKXZKbVE */
                public final /* synthetic */ AppDetailInfo f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    AppSettingActivity.this.m101044b((AppSettingActivity) this.f$1, (AppDetailInfo) view);
                }
            });
            return;
        }
        this.f69095s.setVisibility(8);
    }

    /* renamed from: e */
    private void m101053e(AppDetailInfo appDetailInfo) {
        if (!C28176a.m103222a(appDetailInfo.getAppId())) {
            this.f69091o.setVisibility(8);
            return;
        }
        this.f69091o.setVisibility(0);
        this.f69091o.setOnClickListener(new View.OnClickListener(appDetailInfo) {
            /* class com.ss.android.appcenter.business.activity.appsetting.$$Lambda$AppSettingActivity$RNkNlWI13XtnFuGO_O0PaKLTW54 */
            public final /* synthetic */ AppDetailInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                AppSettingActivity.this.m101036a((AppSettingActivity) this.f$1, (AppDetailInfo) view);
            }
        });
    }

    /* renamed from: a */
    private LittleAppPermissionData m101028a(List<LittleAppPermissionData> list) {
        LittleAppPermissionData littleAppPermissionData = null;
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        Iterator<LittleAppPermissionData> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            LittleAppPermissionData next = it.next();
            if (next.getPermission() == 20) {
                LittleAppPermissionData littleAppPermissionData2 = this.f69066F;
                if (!(littleAppPermissionData2 == null || littleAppPermissionData2.isGranted() == next.isGranted())) {
                    this.f69067G.put(Integer.valueOf(next.getPermission()), Boolean.valueOf(next.isGranted()));
                }
                littleAppPermissionData = next;
            }
        }
        if (littleAppPermissionData != null) {
            list.remove(littleAppPermissionData);
        }
        return littleAppPermissionData;
    }

    /* renamed from: d */
    private void m101050d(AppDetailInfo appDetailInfo) {
        boolean z = false;
        if (TextUtils.isEmpty(appDetailInfo.getAppId()) || appDetailInfo.getmNotificationType() == AppDetailInfo.NotificationType.UNSUPPORT) {
            this.f69098v.setVisibility(8);
            this.f69099w.setVisibility(8);
            this.f69075O = false;
            return;
        }
        this.f69098v.setVisibility(0);
        this.f69099w.setVisibility(0);
        UDSwitch uDSwitch = this.f69100x;
        if (appDetailInfo.getmNotificationType() == AppDetailInfo.NotificationType.ON) {
            z = true;
        }
        uDSwitch.setChecked(z);
        this.f69100x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(appDetailInfo) {
            /* class com.ss.android.appcenter.business.activity.appsetting.$$Lambda$AppSettingActivity$zxNuY4ZcLDCPZLBIrzj6TJMkFPw */
            public final /* synthetic */ AppDetailInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AppSettingActivity.this.m101037a((AppSettingActivity) this.f$1, (AppDetailInfo) compoundButton, (CompoundButton) z);
            }
        });
        this.f69075O = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m101032a(View view) {
        m101062o();
        m101061n();
    }

    /* renamed from: b */
    private void m101043b(AppDetailInfo appDetailInfo) {
        String str;
        C28184h.m103250d("AppSettingActivity", "show content view");
        this.f69079c = appDetailInfo.getAppId();
        this.f69080d = appDetailInfo.getAppName();
        C27688a.m101207a(this, appDetailInfo, this.f69087k);
        this.f69088l.setText(appDetailInfo.getAppName());
        this.f69090n.setText(appDetailInfo.getDeveloperName());
        if (C27548m.m100547m().mo98225i() != null) {
            this.f69089m.setVisibility(8);
            this.f69077a.setVisibility(0);
            String a = C28209p.m103297a((Context) this, (int) R.string.AppDetail_Setting_CurrentVer);
            GadgetVersionUpdateView gadgetVersionUpdateView = this.f69077a;
            gadgetVersionUpdateView.setVersion(a + " V" + appDetailInfo.getAppVersion());
        } else {
            this.f69089m.setVisibility(0);
            this.f69077a.setVisibility(8);
            this.f69089m.setText(appDetailInfo.getAppVersion());
        }
        m101047c(appDetailInfo);
        m101050d(appDetailInfo);
        mo98537a(this.f69079c, this.f69080d, false);
        if (appDetailInfo.getAppSceneType() == AppDetailInfo.AppSceneType.OWN) {
            this.f69096t.setVisibility(8);
            this.f69097u.setVisibility(8);
            this.f69092p.setVisibility(8);
        } else {
            this.f69092p.setVisibility(0);
            String clauseUrl = appDetailInfo.getClauseUrl();
            if (!TextUtils.isEmpty(clauseUrl)) {
                this.f69097u.setVisibility(0);
                this.f69097u.setOnClickListener(new View.OnClickListener(clauseUrl) {
                    /* class com.ss.android.appcenter.business.activity.appsetting.$$Lambda$AppSettingActivity$j7vITU_pF8td2HMC5KYWZxRoqEU */
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(View view) {
                        AppSettingActivity.this.m101045b((AppSettingActivity) this.f$1, (String) view);
                    }
                });
            } else {
                this.f69097u.setVisibility(8);
            }
            String privacyUrl = appDetailInfo.getPrivacyUrl();
            if (!TextUtils.isEmpty(privacyUrl)) {
                this.f69096t.setVisibility(0);
                this.f69096t.setOnClickListener(new View.OnClickListener(privacyUrl) {
                    /* class com.ss.android.appcenter.business.activity.appsetting.$$Lambda$AppSettingActivity$WIqbgAn8C7wFmkUzNROtmC7rWpk */
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(View view) {
                        AppSettingActivity.this.m101038a((AppSettingActivity) this.f$1, (String) view);
                    }
                });
            } else {
                this.f69096t.setVisibility(8);
            }
        }
        if (TextUtils.isEmpty(appDetailInfo.getDeveloperId()) || C27548m.m100547m().mo98222f() == null) {
            m101040a(false);
            this.f69093q.setOnClickListener(null);
            this.f69093q.setClickable(false);
        } else {
            m101040a(true);
            this.f69093q.setClickable(true);
            this.f69093q.setOnClickListener(new View.OnClickListener(appDetailInfo) {
                /* class com.ss.android.appcenter.business.activity.appsetting.$$Lambda$AppSettingActivity$afYhdDNIFShpEHIYeRCZKQ2W2Zk */
                public final /* synthetic */ AppDetailInfo f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    AppSettingActivity.this.m101051d(this.f$1, view);
                }
            });
        }
        if (TextUtils.isEmpty(appDetailInfo.getOnCallId())) {
            this.f69094r.setVisibility(8);
        } else {
            this.f69094r.setVisibility(0);
            this.f69094r.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.appcenter.business.activity.appsetting.$$Lambda$AppSettingActivity$Rp85vcBmniF26439EuHnyM6gWrY */

                public final void onClick(View view) {
                    AppSettingActivity.m101048c(AppDetailInfo.this, view);
                }
            });
        }
        m101067t();
        m101053e(appDetailInfo);
        this.f69084h.setVisibility(8);
        this.f69083g.setVisibility(0);
        C27582j.m100671a(false, this.f69085i);
        if (!this.f69076P) {
            if (this.f69062B == Scene.MINI_APP) {
                str = "mp";
            } else {
                str = "web_app";
            }
            new C67500a("openplatform_application_about_view", new C67460f(getBaseContext())).addCategoryValue("app_type", str).addCategoryValue("appId", this.f69079c).addCategoryValue("application_id", this.f69079c).reportPlatform(4).flush();
            this.f69076P = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m101045b(String str, View view) {
        if (!TextUtils.isEmpty(str)) {
            m101039a(str, getString(R.string.AppDetail_Setting_UserAgreement));
        }
    }

    /* renamed from: a */
    public static Context m101026a(AppSettingActivity appSettingActivity, Configuration configuration) {
        Context a = appSettingActivity.mo98534a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m101051d(AppDetailInfo appDetailInfo, View view) {
        if (Scene.MINI_APP == this.f69062B) {
            C27548m.m100547m().mo98222f().mo98201a(this, appDetailInfo.getDeveloperId(), appDetailInfo.getAppId());
        } else {
            C27548m.m100547m().mo98222f().mo98207d(this, appDetailInfo.getDeveloperId());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m101044b(AppDetailInfo appDetailInfo, View view) {
        String str;
        String str2;
        if (this.f69062B == Scene.MINI_APP) {
            str = "opshare_gadget_about";
        } else {
            str = "opshare_web_app_about";
        }
        C27548m.m100547m().mo98216a().mo98155a(this, str, appDetailInfo.getAppId(), appDetailInfo.getAvatarKey(), appDetailInfo.getAppName(), appDetailInfo.getAppDescription());
        if (this.f69062B == Scene.MINI_APP) {
            str2 = "mp";
        } else {
            str2 = "web_app";
        }
        new C67500a("openplatform_application_about_click", new C67460f(getBaseContext())).addCategoryValue("click", "app_share").addCategoryValue("app_type", str2).addCategoryValue("target", "openplatform_application_share_view").addCategoryValue("appId", this.f69079c).addCategoryValue("application_id", this.f69079c).reportPlatform(4).flush();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m101048c(AppDetailInfo appDetailInfo, View view) {
        if (C27548m.m100547m().mo98222f() != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("BotID", appDetailInfo.getOnCallId());
                C27548m.m100547m().mo98222f().mo98203a(jSONObject.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m101033a(CompoundButton compoundButton, boolean z) {
        String str;
        String str2;
        this.f69066F.setGranted(z);
        this.f69067G.put(Integer.valueOf(this.f69066F.getPermission()), Boolean.valueOf(z));
        String str3 = this.f69080d;
        String str4 = this.f69079c;
        if (this.f69062B == Scene.H5) {
            str = "H5";
        } else {
            str = "MP";
        }
        if (z) {
            str2 = "open";
        } else {
            str2 = "close";
        }
        C27710b.m101263a(str3, str4, str, "about", str2);
        mo98536a(this.f69066F);
    }

    /* renamed from: a */
    public static void m101034a(AppSettingActivity appSettingActivity, Context context) {
        appSettingActivity.mo98535a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appSettingActivity);
        }
    }

    /* renamed from: a */
    public static void m101030a(Context context, String str, boolean z, int i) {
        m101031a(context, str, z, i, "");
    }

    /* renamed from: a */
    public static void m101031a(Context context, String str, boolean z, int i, String str2) {
        m101029a(context, str, new HashMap(), z, i, str2, "");
    }

    /* renamed from: a */
    public static void m101029a(Context context, String str, Map<String, String> map, boolean z, int i, String str2, String str3) {
        if (context != null) {
            Intent intent = new Intent(context, AppSettingActivity.class);
            if (z) {
                intent.putExtra("app_id", str);
            } else {
                intent.putExtra("bot_id", str);
            }
            intent.putExtra(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, str2);
            intent.putExtra("callback_json", (Serializable) map);
            intent.putExtra("scene", i);
            intent.putExtra("session", str3);
            boolean z2 = context instanceof Activity;
            if (!z2) {
                intent.addFlags(268435456);
            }
            if (i != Scene.H5.getValue() || !z2) {
                context.startActivity(intent);
            } else {
                ((Activity) context).startActivityForResult(intent, 5);
            }
        }
    }
}
