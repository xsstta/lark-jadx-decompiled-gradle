package com.tt.miniapp.map;

import android.app.Dialog;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.tt.miniapp.C66205j;
import com.tt.miniapp.map.p3305a.C66481a;
import com.tt.miniapp.map.p3306b.C66482a;
import com.tt.miniapp.permission.AbstractC66590i;
import com.tt.miniapp.permission.C66588h;
import com.tt.miniapp.view.swipeback.SwipeBackActivity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.util.C67590h;
import com.tt.option.p3388i.AbstractC67636a;
import com.tt.option.p3388i.C67641b;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class AppbrandMapActivity extends SwipeBackActivity implements AbstractC67636a.AbstractC67637a, AbstractC67636a.AbstractC67639c {

    /* renamed from: a */
    public ImageView f167785a;

    /* renamed from: b */
    public TextView f167786b;

    /* renamed from: c */
    public Dialog f167787c;

    /* renamed from: d */
    public boolean f167788d;

    /* renamed from: e */
    public C67641b f167789e;

    /* renamed from: f */
    public C67641b f167790f;

    /* renamed from: g */
    public C66481a f167791g;

    /* renamed from: h */
    public C66481a f167792h;

    /* renamed from: i */
    public Location f167793i;

    /* renamed from: j */
    public int f167794j = 18;

    /* renamed from: k */
    public AbstractC67636a f167795k;

    /* renamed from: n */
    private C66205j f167796n;

    /* renamed from: o */
    private View f167797o;

    /* renamed from: p */
    private ImageView f167798p;

    /* renamed from: q */
    private TextView f167799q;

    /* renamed from: r */
    private TextView f167800r;

    /* renamed from: s */
    private TextView f167801s;

    /* renamed from: t */
    private View f167802t;

    /* renamed from: u */
    private String f167803u;

    /* renamed from: v */
    private String f167804v;

    /* renamed from: w */
    private Double f167805w;

    /* renamed from: x */
    private Double f167806x;

    /* renamed from: y */
    private View.OnTouchListener f167807y = new View.OnTouchListener() {
        /* class com.tt.miniapp.map.AppbrandMapActivity.AnonymousClass11 */

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                view.setAlpha(0.5f);
                return false;
            } else if (action != 1 && action != 3) {
                return false;
            } else {
                view.setAlpha(1.0f);
                return false;
            }
        }
    };

    /* renamed from: a */
    public Context mo232008a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo232010a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m259800a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m259798a(this, configuration);
    }

    /* renamed from: g */
    public Resources mo232020g() {
        return super.getResources();
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m259803c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m259799a(this);
    }

    /* renamed from: h */
    public void mo232021h() {
        super.onStop();
    }

    /* renamed from: i */
    public AssetManager mo232022i() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m259802b(this);
    }

    /* renamed from: f */
    public void mo232019f() {
        this.f167795k.mo49005d();
    }

    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onPause() {
        super.onPause();
        this.f167795k.mo49002b();
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tt.miniapp.view.swipeback.SwipeBackActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onResume() {
        super.onResume();
        this.f167795k.mo48992a();
    }

    /* renamed from: l */
    private void m259804l() {
        HashSet hashSet = new HashSet();
        hashSet.add("android.permission.ACCESS_COARSE_LOCATION");
        hashSet.add("android.permission.ACCESS_FINE_LOCATION");
        C66588h.m260183a().mo232189a(this, hashSet, new AbstractC66590i() {
            /* class com.tt.miniapp.map.AppbrandMapActivity.C664787 */

            @Override // com.tt.miniapp.permission.AbstractC66590i
            /* renamed from: a */
            public void mo48890a() {
                try {
                    AppbrandMapActivity.this.mo232009a();
                    AppbrandMapActivity.this.mo232014b();
                } catch (Exception e) {
                    AppBrandLogger.m52829e("tma_AppbrandMapActivity", "", e);
                }
            }

            @Override // com.tt.miniapp.permission.AbstractC66590i
            /* renamed from: a */
            public void mo48891a(String str) {
                AppbrandMapActivity.this.mo232009a();
                AppbrandMapActivity.this.mo232014b();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C66205j.C66206a mo232018e() {
        return new C66205j.C66206a().mo231551a(true).mo231550a(Color.parseColor("#717171"));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tt.miniapp.view.swipeback.SwipeBackActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void onDestroy() {
        super.onDestroy();
        this.f167795k.mo49004c();
        AbstractC67636a aVar = this.f167795k;
        if (aVar != null) {
            aVar.mo49006e();
            this.f167795k = null;
        }
    }

    /* renamed from: c */
    public void mo232015c() {
        C67590h.m263079a(this.f167799q, 0);
        C67590h.m263079a(this.f167800r, 0);
        C67590h.m263079a(this.f167801s, 8);
    }

    /* renamed from: m */
    private void m259805m() {
        this.f167797o = findViewById(R.id.microapp_m_map_close);
        this.f167785a = (ImageView) findViewById(R.id.microapp_m_map_location);
        this.f167798p = (ImageView) findViewById(R.id.microapp_m_map_nav);
        this.f167799q = (TextView) findViewById(R.id.microapp_m_map_name);
        this.f167800r = (TextView) findViewById(R.id.microapp_m_map_address);
        this.f167801s = (TextView) findViewById(R.id.microapp_m_map_position);
        C67590h.m263079a(this.f167799q, 8);
        C67590h.m263079a(this.f167800r, 8);
        C67590h.m263079a(this.f167801s, 0);
        this.f167801s.setText(getResources().getString(R.string.microapp_m_location));
        this.f167797o.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.map.AppbrandMapActivity.View$OnClickListenerC664798 */

            public void onClick(View view) {
                AppbrandMapActivity.this.finish();
            }
        });
        this.f167785a.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.map.AppbrandMapActivity.View$OnClickListenerC664809 */

            public void onClick(View view) {
                AppbrandMapActivity.this.f167788d = true;
                if (AppbrandMapActivity.this.f167789e != null) {
                    if (AppbrandMapActivity.this.f167793i != null) {
                        AppbrandMapActivity.this.f167795k.mo48994a(AppbrandMapActivity.this.f167793i);
                    }
                    AppbrandMapActivity.this.f167795k.mo48997a(AppbrandMapActivity.this.f167789e);
                    AppbrandMapActivity.this.f167795k.mo48993a(AppbrandMapActivity.this.f167794j);
                    if (!Objects.equals(AppbrandMapActivity.this.f167785a.getDrawable().getCurrent().getConstantState(), ContextCompat.getDrawable(AppbrandMapActivity.this, 2131234605).getConstantState())) {
                        AppbrandMapActivity.this.f167785a.setImageResource(2131234605);
                    }
                }
                AppbrandMapActivity.this.mo232019f();
            }
        });
        this.f167785a.setOnTouchListener(this.f167807y);
        this.f167798p.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.map.AppbrandMapActivity.AnonymousClass10 */

            public void onClick(View view) {
                AppbrandMapActivity.this.mo232017d();
            }
        });
    }

    /* renamed from: a */
    public void mo232009a() {
        this.f167795k.mo48993a(this.f167794j);
    }

    /* renamed from: b */
    public void mo232014b() {
        if (this.f167805w.doubleValue() != 0.0d || this.f167806x.doubleValue() != 0.0d) {
            C67641b bVar = new C67641b(this.f167806x.doubleValue(), this.f167805w.doubleValue());
            C67641b bVar2 = this.f167790f;
            if (bVar2 == null) {
                this.f167790f = new C67641b(this.f167806x.doubleValue(), this.f167805w.doubleValue());
            } else {
                bVar2.mo234902a(this.f167806x.doubleValue());
                this.f167790f.mo234904b(this.f167805w.doubleValue());
            }
            this.f167795k.mo48997a(new C67641b(this.f167806x.doubleValue(), this.f167805w.doubleValue()));
            m259801a(bVar);
        } else if (!TextUtils.isEmpty(this.f167804v)) {
            this.f167795k.mo49001a(this.f167804v, this);
        } else {
            mo232012a(getString(R.string.microapp_m_location_params_error));
        }
        if (!TextUtils.isEmpty(this.f167804v) && !TextUtils.isEmpty(this.f167803u)) {
            this.f167799q.setText(this.f167804v);
            this.f167800r.setText(this.f167803u);
            mo232015c();
        } else if (this.f167805w.doubleValue() == 0.0d || this.f167806x.doubleValue() == 0.0d) {
            mo232012a(getResources().getString(R.string.microapp_m_location_params_error));
        } else {
            this.f167795k.mo48999a(new C67641b(this.f167806x.doubleValue(), this.f167805w.doubleValue()), this);
        }
        this.f167795k.mo48993a(this.f167794j);
    }

    /* renamed from: d */
    public void mo232017d() {
        C67641b bVar = this.f167790f;
        if (bVar != null) {
            this.f167792h = new C66481a(this.f167804v, bVar);
        }
        if (this.f167787c == null) {
            List<String> a = C66482a.m259824a(this);
            Dialog dialog = new Dialog(this, R.style.microapp_m_BottomOptionsDialogTheme);
            this.f167787c = dialog;
            dialog.setCancelable(true);
            this.f167787c.setCanceledOnTouchOutside(true);
            this.f167787c.requestWindowFeature(1);
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this).inflate(R.layout.microapp_m_map_dialog, (ViewGroup) null);
            View findViewById = linearLayout.findViewById(R.id.appbrand_map_dialg_root);
            this.f167786b = (TextView) linearLayout.findViewById(R.id.microapp_m_map_dialg_show_lines);
            View findViewById2 = linearLayout.findViewById(R.id.microapp_m_map_dialog_show_lines_divider);
            TextView textView = (TextView) linearLayout.findViewById(R.id.microapp_m_map_dialog_tencent);
            View findViewById3 = linearLayout.findViewById(R.id.microapp_m_map_dialog_tencent_divider);
            TextView textView2 = (TextView) linearLayout.findViewById(R.id.microapp_m_map_dialg_gaode);
            View findViewById4 = linearLayout.findViewById(R.id.microapp_m_map_dialg_gaode_divider);
            TextView textView3 = (TextView) linearLayout.findViewById(R.id.microapp_m_map_dialg_baidu);
            TextView textView4 = (TextView) linearLayout.findViewById(R.id.microapp_m_map_dialg_cancel);
            if (a.contains(getResources().getString(R.string.microapp_m_map_dialog_tencent))) {
                C67590h.m263079a(textView, 0);
            } else {
                C67590h.m263079a(textView, 8);
                C67590h.m263079a(findViewById3, 8);
            }
            if (a.contains(getResources().getString(R.string.microapp_m_map_dialog_gaode))) {
                C67590h.m263079a(textView2, 0);
            } else {
                C67590h.m263079a(textView2, 8);
                C67590h.m263079a(findViewById4, 8);
            }
            if (a.contains(getResources().getString(R.string.microapp_m_map_dialog_baidu))) {
                C67590h.m263079a(textView3, 0);
            } else {
                C67590h.m263079a(textView3, 8);
            }
            if (a.isEmpty()) {
                C67590h.m263079a(findViewById2, 8);
            }
            this.f167787c.setContentView(linearLayout);
            Window window = this.f167787c.getWindow();
            if (window != null) {
                window.setGravity(80);
                window.setDimAmount(BitmapDescriptorFactory.HUE_RED);
                window.setBackgroundDrawableResource(R.color.microapp_m_transparent_30);
                if (!isFinishing()) {
                    this.f167787c.show();
                }
                findViewById.setOnClickListener(new View.OnClickListener() {
                    /* class com.tt.miniapp.map.AppbrandMapActivity.AnonymousClass12 */

                    public void onClick(View view) {
                        if (AppbrandMapActivity.this.f167787c.isShowing()) {
                            AppbrandMapActivity.this.f167787c.dismiss();
                        }
                    }
                });
                textView.setOnClickListener(new View.OnClickListener() {
                    /* class com.tt.miniapp.map.AppbrandMapActivity.AnonymousClass13 */

                    public void onClick(View view) {
                        AppbrandMapActivity appbrandMapActivity = AppbrandMapActivity.this;
                        C66482a.m259829c(appbrandMapActivity, appbrandMapActivity.f167791g, AppbrandMapActivity.this.f167792h);
                        if (AppbrandMapActivity.this.f167787c.isShowing()) {
                            AppbrandMapActivity.this.f167787c.dismiss();
                        }
                    }
                });
                textView2.setOnClickListener(new View.OnClickListener() {
                    /* class com.tt.miniapp.map.AppbrandMapActivity.View$OnClickListenerC664722 */

                    public void onClick(View view) {
                        AppbrandMapActivity appbrandMapActivity = AppbrandMapActivity.this;
                        C66482a.m259825a(appbrandMapActivity, appbrandMapActivity.f167791g, AppbrandMapActivity.this.f167792h);
                        if (AppbrandMapActivity.this.f167787c.isShowing()) {
                            AppbrandMapActivity.this.f167787c.dismiss();
                        }
                    }
                });
                textView3.setOnClickListener(new View.OnClickListener() {
                    /* class com.tt.miniapp.map.AppbrandMapActivity.View$OnClickListenerC664733 */

                    public void onClick(View view) {
                        AppbrandMapActivity appbrandMapActivity = AppbrandMapActivity.this;
                        C66482a.m259828b(appbrandMapActivity, appbrandMapActivity.f167791g, AppbrandMapActivity.this.f167792h);
                        if (AppbrandMapActivity.this.f167787c.isShowing()) {
                            AppbrandMapActivity.this.f167787c.dismiss();
                        }
                    }
                });
                textView4.setOnClickListener(new View.OnClickListener() {
                    /* class com.tt.miniapp.map.AppbrandMapActivity.View$OnClickListenerC664744 */

                    public void onClick(View view) {
                        if (AppbrandMapActivity.this.f167787c.isShowing()) {
                            AppbrandMapActivity.this.f167787c.dismiss();
                        }
                    }
                });
            } else {
                return;
            }
        } else if (!isFinishing()) {
            this.f167787c.show();
        }
        this.f167786b.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.map.AppbrandMapActivity.View$OnClickListenerC664755 */

            public void onClick(View view) {
                if (TextUtils.equals(AppbrandMapActivity.this.f167786b.getText(), AppbrandMapActivity.this.getResources().getString(R.string.microapp_m_map_dialog_show_lines))) {
                    if (!(AppbrandMapActivity.this.f167790f == null || AppbrandMapActivity.this.f167789e == null)) {
                        AppbrandMapActivity.this.f167795k.mo49000a(AppbrandMapActivity.this.f167789e, AppbrandMapActivity.this.f167790f, new AbstractC67636a.AbstractC67640d() {
                            /* class com.tt.miniapp.map.AppbrandMapActivity.View$OnClickListenerC664755.C664761 */
                        });
                    }
                    if (!Objects.equals(AppbrandMapActivity.this.f167785a.getDrawable().getCurrent().getConstantState(), ContextCompat.getDrawable(AppbrandMapActivity.this, 2131234604).getConstantState())) {
                        AppbrandMapActivity.this.f167785a.setImageResource(2131234604);
                    }
                } else {
                    if (AppbrandMapActivity.this.f167795k.mo49007f()) {
                        AppbrandMapActivity.this.f167795k.mo49008g();
                        AppbrandMapActivity.this.f167786b.setText(AppbrandMapActivity.this.getResources().getString(R.string.microapp_m_map_dialog_show_lines));
                    }
                    if (!Objects.equals(AppbrandMapActivity.this.f167785a.getDrawable().getCurrent().getConstantState(), ContextCompat.getDrawable(AppbrandMapActivity.this, 2131234605).getConstantState())) {
                        AppbrandMapActivity.this.f167785a.setImageResource(2131234604);
                    }
                }
                if (AppbrandMapActivity.this.f167787c.isShowing()) {
                    AppbrandMapActivity.this.f167787c.dismiss();
                }
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f167795k.mo49003b(bundle);
    }

    /* renamed from: a */
    public static Resources m259799a(AppbrandMapActivity appbrandMapActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appbrandMapActivity);
        }
        return appbrandMapActivity.mo232020g();
    }

    /* renamed from: c */
    public static AssetManager m259803c(AppbrandMapActivity appbrandMapActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appbrandMapActivity);
        }
        return appbrandMapActivity.mo232022i();
    }

    /* renamed from: b */
    public static void m259802b(AppbrandMapActivity appbrandMapActivity) {
        appbrandMapActivity.mo232021h();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AppbrandMapActivity appbrandMapActivity2 = appbrandMapActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    appbrandMapActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private void m259801a(C67641b bVar) {
        this.f167795k.mo48997a(bVar);
        this.f167795k.mo48998a(bVar, 2131234601);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tt.miniapp.view.swipeback.SwipeBackActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.microapp_m_map_activity);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.microapp_m_parent_view_map);
        AbstractC67636a createMapInstance = HostDependManager.getInst().createMapInstance();
        this.f167795k = createMapInstance;
        if (createMapInstance == null) {
            finish();
            return;
        }
        createMapInstance.mo48996a(new AbstractC67636a.AbstractC67638b() {
            /* class com.tt.miniapp.map.AppbrandMapActivity.C664711 */
        });
        View a = this.f167795k.mo48991a(this);
        this.f167802t = a;
        this.f167795k.mo48995a(bundle);
        viewGroup.addView(a, 0, new RelativeLayout.LayoutParams(-1, -1));
        viewGroup.setOnTouchListener(new View.OnTouchListener() {
            /* class com.tt.miniapp.map.AppbrandMapActivity.View$OnTouchListenerC664776 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                AppbrandMapActivity.this.mo232011a(motionEvent);
                return false;
            }
        });
        C66205j jVar = new C66205j(this, mo232018e());
        this.f167796n = jVar;
        jVar.mo231547a(false);
        if (getIntent() != null) {
            this.f167804v = getIntent().getStringExtra("name");
            this.f167803u = getIntent().getStringExtra("address");
            this.f167806x = Double.valueOf(getIntent().getDoubleExtra("latitude", 0.0d));
            this.f167805w = Double.valueOf(getIntent().getDoubleExtra("longitude", 0.0d));
            int intExtra = getIntent().getIntExtra("scale", 18);
            this.f167794j = intExtra;
            if (intExtra >= 19) {
                this.f167794j = 19;
            } else if (intExtra <= 3) {
                this.f167794j = 3;
            }
        }
        m259805m();
        m259804l();
    }

    /* renamed from: a */
    public void mo232011a(MotionEvent motionEvent) {
        AppBrandLogger.m52828d("tma_AppbrandMapActivity", "onTouch ", Integer.valueOf(motionEvent.getAction()));
        if (motionEvent.getAction() == 2 && !Objects.equals(this.f167785a.getDrawable().getCurrent().getConstantState(), ContextCompat.getDrawable(this, 2131234604).getConstantState())) {
            this.f167785a.setImageResource(2131234604);
        }
    }

    /* renamed from: a */
    public void mo232012a(String str) {
        C67590h.m263079a(this.f167799q, 8);
        C67590h.m263079a(this.f167800r, 8);
        C67590h.m263079a(this.f167801s, 0);
        if (str != null) {
            this.f167801s.setText(str);
        }
    }

    /* renamed from: a */
    public static void m259800a(AppbrandMapActivity appbrandMapActivity, Context context) {
        appbrandMapActivity.mo232010a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appbrandMapActivity);
        }
    }

    /* renamed from: a */
    public static Context m259798a(AppbrandMapActivity appbrandMapActivity, Configuration configuration) {
        Context a = appbrandMapActivity.mo232008a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public boolean mo232013a(float f, float f2) {
        if (f <= ((float) this.f167797o.getLeft()) || f >= ((float) this.f167797o.getRight()) || f2 <= ((float) this.f167797o.getTop()) || f2 >= ((float) this.f167797o.getBottom())) {
            return false;
        }
        return true;
    }
}
