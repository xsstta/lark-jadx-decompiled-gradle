package com.tt.miniapp.permission;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.permission.AbstractC13298i;
import com.bytedance.ee.larkbrand.permission.C13290f;
import com.bytedance.ee.larkbrand.permission.C13301k;
import com.bytedance.ee.larkbrand.utils.C13374s;
import com.bytedance.ee.webapp.p720a.C13757d;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.openplatform.core.plugin.messenger.appbadge.C25103a;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.littleapp.entity.LittleAppPermissionData;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapp.process.p3316a.C66613b;
import com.tt.miniapp.view.swipeback.SwipeBackActivity;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3370d.AbstractC67477a;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.miniapphost.util.C67590h;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.util.C67866g;
import com.tt.refer.impl.business.meta.GadgetMonitorCreator;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PermissionSettingActivity extends SwipeBackActivity implements CompoundButton.OnCheckedChangeListener, AbstractC67477a {

    /* renamed from: a */
    public TextView f168097a;

    /* renamed from: b */
    public String f168098b;

    /* renamed from: c */
    public AppType f168099c;

    /* renamed from: d */
    public IMonitorCreator f168100d;

    /* renamed from: e */
    private Map<Integer, Boolean> f168101e = new HashMap();

    /* renamed from: f */
    private View f168102f;

    /* renamed from: g */
    private TextView f168103g;

    /* renamed from: h */
    private View f168104h;

    /* renamed from: i */
    private String f168105i;

    /* renamed from: j */
    private String f168106j;

    /* renamed from: k */
    private IAppContext f168107k;

    /* renamed from: n */
    private List<C66575a> f168108n;

    /* renamed from: a */
    public Context mo232160a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo232163a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m260084a(this, context);
    }

    /* renamed from: c */
    public Resources mo232166c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m260079a(this, configuration);
    }

    /* renamed from: d */
    public void mo232171d() {
        super.onStop();
    }

    /* renamed from: e */
    public AssetManager mo232172e() {
        return super.getAssets();
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m260086c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m260081a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m260085b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.tt.miniapp.view.swipeback.SwipeBackActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        finish();
    }

    @Override // com.tt.miniapphost.view.BaseActivity, com.tt.miniapphost.p3370d.AbstractC67477a
    public void onLanguageChange() {
        m260087f();
    }

    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tt.miniapp.view.swipeback.SwipeBackActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onResume() {
        super.onResume();
    }

    /* renamed from: a */
    public void mo232164a(final List<C66575a> list) {
        if (!CollectionUtils.isEmpty(list)) {
            C67866g.m264027a(new Runnable() {
                /* class com.tt.miniapp.permission.PermissionSettingActivity.RunnableC665722 */

                public void run() {
                    LinearLayout linearLayout = (LinearLayout) PermissionSettingActivity.this.findViewById(R.id.microapp_m_layout);
                    linearLayout.removeAllViews();
                    linearLayout.addView(PermissionSettingActivity.this.f168097a);
                    LayoutInflater from = LayoutInflater.from(PermissionSettingActivity.this);
                    int i = 0;
                    while (true) {
                        List list = list;
                        if (list != null && i < list.size()) {
                            if (i != 0) {
                                linearLayout.addView(PermissionSettingActivity.this.mo232161a());
                            }
                            linearLayout.addView(PermissionSettingActivity.this.mo232162a(from, linearLayout, (C66575a) list.get(i)));
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            });
        }
    }

    @Override // com.tt.miniapp.view.swipeback.SwipeBackActivity
    public boolean cD_() {
        return super.cD_();
    }

    /* renamed from: g */
    private void m260088g() {
        C13290f.m54128a(this, this.f168098b, "", this.f168099c, new AbstractC13298i() {
            /* class com.tt.miniapp.permission.PermissionSettingActivity.C665733 */

            @Override // com.bytedance.ee.larkbrand.permission.AbstractC13298i
            /* renamed from: a */
            public void mo49531a() {
                PermissionSettingActivity permissionSettingActivity = PermissionSettingActivity.this;
                List<LittleAppPermissionData> a = C13290f.m54127a(permissionSettingActivity, permissionSettingActivity.f168098b, PermissionSettingActivity.this.f168099c);
                String b = PermissionSettingActivity.this.mo232165b(a);
                if (PermissionSettingActivity.this.f168100d != null) {
                    LarkInnerEventHelper.mpAppAuthSetting(PermissionSettingActivity.this.f168100d, PermissionSettingActivity.this.f168098b, b, true, null, null);
                }
                List<C66575a> d = PermissionSettingActivity.this.mo232170d(a);
                PermissionSettingActivity.this.mo232167c(d);
                PermissionSettingActivity.this.mo232164a(d);
            }

            @Override // com.bytedance.ee.larkbrand.permission.AbstractC13298i
            /* renamed from: b */
            public void mo49532b() {
                JsonArray jsonArray = new JsonArray();
                if (PermissionSettingActivity.this.f168100d != null) {
                    LarkInnerEventHelper.mpAppAuthSetting(PermissionSettingActivity.this.f168100d, PermissionSettingActivity.this.f168098b, jsonArray.toString(), false, String.valueOf(ApiCode.GENERAL_UNKONW_ERROR.code), ApiCode.GENERAL_UNKONW_ERROR.msg);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void onStart() {
        super.onStart();
        if (LarkExtensionManager.getInstance().getExtension().getFeatureGating("gadget.open_app.badge")) {
            m260088g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.permission.PermissionSettingActivity$4 */
    public static /* synthetic */ class C665744 {

        /* renamed from: a */
        static final /* synthetic */ int[] f168113a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tt.refer.common.base.AppType[] r0 = com.tt.refer.common.base.AppType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.tt.miniapp.permission.PermissionSettingActivity.C665744.f168113a = r0
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.GadgetAPP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.tt.miniapp.permission.PermissionSettingActivity.C665744.f168113a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.WebGadgetAPP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.tt.miniapp.permission.PermissionSettingActivity.C665744.f168113a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.WebAPP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.permission.PermissionSettingActivity.C665744.<clinit>():void");
        }
    }

    @Override // com.tt.miniapp.view.swipeback.SwipeBackActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void finish() {
        if (!this.f168101e.isEmpty()) {
            Intent intent = new Intent();
            intent.putExtra("extra_change_permission_map", (Serializable) this.f168101e);
            setResult(51, intent);
        }
        super.finish();
        overridePendingTransition(R.anim.microapp_i_slide_in_no, R.anim.microapp_i_slide_out_right);
    }

    /* renamed from: f */
    private void m260087f() {
        ((ImageView) findViewById(R.id.microapp_m_page_close)).setImageResource(R.drawable.microapp_m_lefterbackicon_titlebar_light);
        findViewById(R.id.microapp_m_titlebar_capsule).setVisibility(8);
        findViewById(R.id.microapp_m_titleBar_content).setBackgroundColor(getResources().getColor(R.color.bg_body));
        findViewById(R.id.microapp_m_page_close).setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.permission.PermissionSettingActivity.View$OnClickListenerC665711 */

            public void onClick(View view) {
                PermissionSettingActivity.this.finish();
            }
        });
        View findViewById = findViewById(R.id.microapp_m_titlebar_layout);
        this.f168102f = findViewById;
        C67590h.m263079a(findViewById, 8);
        ((TextView) findViewById(R.id.microapp_m_page_title)).setText(getString(R.string.microapp_m_settings));
    }

    /* renamed from: a */
    public View mo232161a() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
        linearLayout.setBackgroundResource(R.color.bg_body);
        View view = new View(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.leftMargin = (int) C67590h.m263065a(this, 15.0f);
        view.setBackgroundResource(R.color.line_divider_default);
        view.setLayoutParams(layoutParams);
        linearLayout.addView(view);
        return linearLayout;
    }

    /* renamed from: a */
    public static Resources m260081a(PermissionSettingActivity permissionSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(permissionSettingActivity);
        }
        return permissionSettingActivity.mo232166c();
    }

    /* renamed from: c */
    public static AssetManager m260086c(PermissionSettingActivity permissionSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(permissionSettingActivity);
        }
        return permissionSettingActivity.mo232172e();
    }

    /* renamed from: b */
    public static void m260085b(PermissionSettingActivity permissionSettingActivity) {
        permissionSettingActivity.mo232171d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PermissionSettingActivity permissionSettingActivity2 = permissionSettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    permissionSettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: d */
    public List<C66575a> mo232170d(List<LittleAppPermissionData> list) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        for (LittleAppPermissionData littleAppPermissionData : list) {
            arrayList.add(new C66575a(littleAppPermissionData.getPermission(), littleAppPermissionData.getName(), littleAppPermissionData.isGranted()));
        }
        return arrayList;
    }

    /* renamed from: a */
    private IMonitorCreator m260082a(IAppContext iAppContext) {
        IMonitorCreator iMonitorCreator;
        int i = C665744.f168113a[this.f168099c.ordinal()];
        if (i == 1 || i == 2) {
            iMonitorCreator = new GadgetMonitorCreator(iAppContext);
        } else if (i != 3) {
            return null;
        } else {
            iMonitorCreator = new C13757d(iAppContext);
        }
        return iMonitorCreator;
    }

    /* renamed from: b */
    public String mo232165b(List<LittleAppPermissionData> list) {
        JsonArray jsonArray = new JsonArray();
        if (!CollectionUtils.isEmpty(list)) {
            for (LittleAppPermissionData littleAppPermissionData : list) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("scope", littleAppPermissionData.getName());
                jsonObject.addProperty(UpdateKey.STATUS, Boolean.valueOf(littleAppPermissionData.isGranted()));
                jsonArray.add(jsonObject);
            }
        }
        return jsonArray.toString();
    }

    /* renamed from: c */
    public void mo232167c(List<C66575a> list) {
        HashMap hashMap = new HashMap();
        if (CollectionUtils.isNotEmpty(this.f168108n)) {
            for (C66575a aVar : this.f168108n) {
                hashMap.put(Integer.valueOf(aVar.permission), Boolean.valueOf(aVar.isGranted));
            }
        }
        if (!CollectionUtils.isEmpty(list)) {
            for (C66575a aVar2 : list) {
                int i = aVar2.permission;
                if (!hashMap.containsKey(Integer.valueOf(i))) {
                    this.f168101e.put(Integer.valueOf(i), Boolean.valueOf(aVar2.isGranted));
                } else if (aVar2.isGranted != ((Boolean) hashMap.get(Integer.valueOf(i))).booleanValue()) {
                    this.f168101e.put(Integer.valueOf(i), Boolean.valueOf(aVar2.isGranted));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tt.miniapp.view.swipeback.SwipeBackActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 414
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.permission.PermissionSettingActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    public static void m260084a(PermissionSettingActivity permissionSettingActivity, Context context) {
        permissionSettingActivity.mo232163a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(permissionSettingActivity);
        }
    }

    /* renamed from: a */
    public static Context m260079a(PermissionSettingActivity permissionSettingActivity, Configuration configuration) {
        Context a = permissionSettingActivity.mo232160a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        String str;
        C66575a aVar = (C66575a) compoundButton.getTag();
        int i = aVar.permission;
        this.f168101e.put(Integer.valueOf(i), Boolean.valueOf(z));
        if (!LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.scope.add_user_info") && i == 11) {
            C66613b.m260244a(getIntent().getStringExtra("ma_callerProcessIdentify"), i, z);
        }
        if (i == 20) {
            String str2 = this.f168098b;
            String str3 = this.f168105i;
            AppType appType = this.f168099c;
            if (z) {
                str = "open";
            } else {
                str = "close";
            }
            C25103a.m90434b(str2, str3, appType, "mp_setting", str);
        }
        m260083a(aVar, z);
    }

    /* renamed from: a */
    public static Intent m260080a(Context context, IAppContext iAppContext) {
        Intent intent = new Intent(context, PermissionSettingActivity.class);
        ArrayList arrayList = new ArrayList();
        AbstractC67733a aVar = (AbstractC67733a) iAppContext.findServiceByInterface(AbstractC67733a.class);
        for (C66578b.C66579a aVar2 : HostDependManager.getInst().getUserDefinableHostPermissionList(iAppContext)) {
            if (aVar.mo50184b(aVar2.mo232177a())) {
                arrayList.add(new C66575a(aVar2.mo232177a(), aVar2.mo232178b(), aVar.mo50179a(aVar2.mo232177a(), false)));
            }
        }
        if (C67432a.m262319a(iAppContext).getAppInfo().isGame()) {
            C66578b.C66579a i = C66578b.C66579a.m260124i(iAppContext);
            intent.putExtra("extra_screen_record", new C66575a(i.mo232177a(), i.mo232178b(), aVar.mo50179a(i.mo232177a(), true)));
        }
        String appId = iAppContext.getAppId();
        String str = AppbrandApplicationImpl.getInst(iAppContext).getAppInfo().appName;
        String g = ((AbstractC67709b.AbstractC67710a) ((AbstractC67709b) iAppContext.findServiceByInterface(AbstractC67709b.class)).mo235130i()).mo235054g(appId);
        intent.putExtra("extra_brand_name", C67432a.m262319a(iAppContext).getAppInfo().appName);
        intent.putExtra("EXTRA_APP_ID", appId);
        intent.putExtra("EXTRA_APP_NAME", str);
        intent.putExtra("EXTRA_APP_TYPE", iAppContext.getAppType());
        intent.putExtra("extra_permission_list", arrayList);
        intent.putExtra("extra_session", g);
        intent.putExtra("ma_callerProcessIdentify", ProcessUtil.getProcessIdentify());
        return intent;
    }

    /* renamed from: a */
    private void m260083a(C66575a aVar, boolean z) {
        String str;
        LittleAppPermissionData littleAppPermissionData = new LittleAppPermissionData(aVar.permission, aVar.name, z);
        ArrayList arrayList = new ArrayList();
        arrayList.add(littleAppPermissionData);
        AbstractC67565b d = C13301k.m54149a().mo49536d(this.f168107k);
        if (d == null) {
            str = "";
        } else {
            str = C13374s.m54383a(d);
        }
        C13290f.m54129a(this, this.f168098b, str, arrayList, this.f168099c, this.f168106j, 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.permission.PermissionSettingActivity$a */
    public static final class C66575a implements Serializable {
        public boolean isGranted;
        public String name;
        public int permission;

        private C66575a(int i, String str, boolean z) {
            this.permission = i;
            this.name = str;
            this.isGranted = z;
        }
    }

    /* renamed from: a */
    public View mo232162a(LayoutInflater layoutInflater, LinearLayout linearLayout, C66575a aVar) {
        View inflate = layoutInflater.inflate(R.layout.microapp_m_layout_permmsion_item, (ViewGroup) linearLayout, false);
        ((TextView) inflate.findViewById(R.id.microapp_m_name)).setText(aVar.name);
        UDSwitch uDSwitch = (UDSwitch) inflate.findViewById(R.id.microapp_m_permission_switch);
        uDSwitch.setTag(aVar);
        uDSwitch.setChecked(aVar.isGranted);
        uDSwitch.setOnCheckedChangeListener(this);
        return inflate;
    }
}
