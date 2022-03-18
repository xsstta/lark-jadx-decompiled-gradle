package com.huawei.updatesdk.service.otaupdate;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.text.style.TextAppearanceSpan;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.huawei.hms.common.PackageConstants;
import com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a;
import com.huawei.updatesdk.p1029a.p1030a.p1035c.p1036h.C23845b;
import com.huawei.updatesdk.p1029a.p1030a.p1035c.p1037i.C23848b;
import com.huawei.updatesdk.p1029a.p1039b.p1040a.C23854a;
import com.huawei.updatesdk.p1029a.p1039b.p1041b.AsyncTaskC23856b;
import com.huawei.updatesdk.p1029a.p1039b.p1041b.C23855a;
import com.huawei.updatesdk.p1029a.p1039b.p1041b.p1042d.C23860a;
import com.huawei.updatesdk.p1029a.p1039b.p1043c.AbstractC23861a;
import com.huawei.updatesdk.p1029a.p1039b.p1043c.C23862b;
import com.huawei.updatesdk.p1046b.p1051c.AbstractC23883b;
import com.huawei.updatesdk.p1046b.p1051c.C23884c;
import com.huawei.updatesdk.p1046b.p1055f.C23890a;
import com.huawei.updatesdk.p1046b.p1055f.C23891b;
import com.huawei.updatesdk.p1046b.p1056g.AbstractC23902b;
import com.huawei.updatesdk.p1046b.p1056g.C23895a;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.C23927c;
import java.io.Serializable;
import java.util.concurrent.Executors;

public class AppUpdateActivity extends Activity implements AbstractC23883b, AbstractC23926b {

    /* renamed from: a */
    private String f59161a = PackageConstants.SERVICES_PACKAGE_APPMARKET;

    /* renamed from: b */
    private AlertDialog f59162b;

    /* renamed from: c */
    private C23895a f59163c;

    /* renamed from: d */
    private C23895a f59164d;

    /* renamed from: e */
    private ProgressBar f59165e;

    /* renamed from: f */
    private TextView f59166f;

    /* renamed from: g */
    private boolean f59167g = false;

    /* renamed from: h */
    private boolean f59168h = false;

    /* renamed from: i */
    private ApkUpgradeInfo f59169i = null;

    /* renamed from: j */
    private boolean f59170j = false;

    /* renamed from: k */
    private boolean f59171k = false;

    /* renamed from: l */
    private AsyncTaskC23856b f59172l;

    /* renamed from: m */
    private int f59173m = -99;

    /* renamed from: n */
    private int f59174n = -99;

    /* renamed from: o */
    private int f59175o = -99;

    /* renamed from: p */
    private Intent f59176p = null;

    /* renamed from: q */
    private C23923n f59177q;

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.updatesdk.service.otaupdate.AppUpdateActivity$a */
    public class DialogInterface$OnKeyListenerC23910a implements DialogInterface.OnKeyListener {
        DialogInterface$OnKeyListenerC23910a() {
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            AppUpdateActivity.this.f59173m = 4;
            AppUpdateActivity.this.finish();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.updatesdk.service.otaupdate.AppUpdateActivity$b */
    public class RunnableC23911b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C23862b f59179a;

        RunnableC23911b(C23862b bVar) {
            this.f59179a = bVar;
        }

        public void run() {
            Bundle b = this.f59179a.mo85607b();
            if (b != null) {
                int i = b.getInt("INSTALL_STATE");
                C23930d.m87479a().mo85865a(AppUpdateActivity.this.m87413a((AppUpdateActivity) i, b.getInt("INSTALL_TYPE"), -1));
                AppUpdateActivity.this.m87437c((AppUpdateActivity) i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.updatesdk.service.otaupdate.AppUpdateActivity$c */
    public class C23912c implements AbstractC23902b {
        C23912c() {
        }

        @Override // com.huawei.updatesdk.p1046b.p1056g.AbstractC23902b
        /* renamed from: a */
        public void mo85705a() {
            AppUpdateActivity.this.f59165e.setProgress(0);
            AppUpdateActivity.this.f59165e.setMax(0);
            AppUpdateActivity.this.f59166f.setText("");
            AppUpdateActivity.this.m87415a();
            if (AppUpdateActivity.this.f59172l != null) {
                AppUpdateActivity.this.f59172l.mo85593a();
            }
            AppUpdateActivity.this.f59163c.mo85688a();
            if (AppUpdateActivity.this.f59170j) {
                AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                appUpdateActivity.m87443d((AppUpdateActivity) appUpdateActivity.f59169i);
                return;
            }
            AppUpdateActivity.this.f59173m = 4;
            AppUpdateActivity.this.finish();
        }

        @Override // com.huawei.updatesdk.p1046b.p1056g.AbstractC23902b
        /* renamed from: b */
        public void mo85706b() {
            AppUpdateActivity.this.f59163c.mo85688a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.updatesdk.service.otaupdate.AppUpdateActivity$d */
    public class C23913d implements C23895a.AbstractC23901d {
        C23913d() {
        }

        @Override // com.huawei.updatesdk.p1046b.p1056g.C23895a.AbstractC23901d
        /* renamed from: a */
        public void mo85704a() {
            AppUpdateActivity.this.finish();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.updatesdk.service.otaupdate.AppUpdateActivity$e */
    public class View$OnClickListenerC23914e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f59183a;

        View$OnClickListenerC23914e(String str) {
            this.f59183a = str;
        }

        public void onClick(View view) {
            AppUpdateActivity.this.m87440c((AppUpdateActivity) this.f59183a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.updatesdk.service.otaupdate.AppUpdateActivity$f */
    public class C23915f implements AbstractC23902b {

        /* renamed from: a */
        final /* synthetic */ ApkUpgradeInfo f59185a;

        /* renamed from: b */
        final /* synthetic */ C23895a f59186b;

        C23915f(ApkUpgradeInfo apkUpgradeInfo, C23895a aVar) {
            this.f59185a = apkUpgradeInfo;
            this.f59186b = aVar;
        }

        @Override // com.huawei.updatesdk.p1046b.p1056g.AbstractC23902b
        /* renamed from: a */
        public void mo85705a() {
            if (!C23848b.m87195d(AppUpdateActivity.this)) {
                AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                Toast.makeText(appUpdateActivity, C23935g.m87507e(appUpdateActivity, "upsdk_no_available_network_prompt_toast"), 0).show();
                AppUpdateActivity.this.finish();
                return;
            }
            AppUpdateActivity.this.m87446e((AppUpdateActivity) this.f59185a);
            this.f59186b.mo85688a();
        }

        @Override // com.huawei.updatesdk.p1046b.p1056g.AbstractC23902b
        /* renamed from: b */
        public void mo85706b() {
            this.f59186b.mo85688a();
            if (AppUpdateActivity.this.f59170j) {
                AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                appUpdateActivity.m87443d((AppUpdateActivity) appUpdateActivity.f59169i);
                return;
            }
            AppUpdateActivity.this.f59173m = 4;
            AppUpdateActivity.this.finish();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.updatesdk.service.otaupdate.AppUpdateActivity$g */
    public class C23916g implements C23895a.AbstractC23901d {
        C23916g() {
        }

        @Override // com.huawei.updatesdk.p1046b.p1056g.C23895a.AbstractC23901d
        /* renamed from: a */
        public void mo85704a() {
            AppUpdateActivity.this.finish();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.updatesdk.service.otaupdate.AppUpdateActivity$h */
    public class DialogInterface$OnKeyListenerC23917h implements DialogInterface.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ C23895a f59189a;

        DialogInterface$OnKeyListenerC23917h(C23895a aVar) {
            this.f59189a = aVar;
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            if (AppUpdateActivity.this.f59170j) {
                this.f59189a.mo85688a();
                AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                appUpdateActivity.m87443d((AppUpdateActivity) appUpdateActivity.f59169i);
                return true;
            }
            AppUpdateActivity.this.f59173m = 4;
            AppUpdateActivity.this.finish();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.updatesdk.service.otaupdate.AppUpdateActivity$i */
    public class C23918i implements AbstractC23902b {
        C23918i() {
        }

        @Override // com.huawei.updatesdk.p1046b.p1056g.AbstractC23902b
        /* renamed from: a */
        public void mo85705a() {
            AppUpdateActivity.this.f59175o = 101;
            if (!C23848b.m87195d(AppUpdateActivity.this)) {
                AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                Toast.makeText(appUpdateActivity, C23935g.m87507e(appUpdateActivity, "upsdk_no_available_network_prompt_toast"), 0).show();
                AppUpdateActivity.this.f59173m = 2;
                AppUpdateActivity.this.finish();
                return;
            }
            AppUpdateActivity.this.m87447f();
        }

        @Override // com.huawei.updatesdk.p1046b.p1056g.AbstractC23902b
        /* renamed from: b */
        public void mo85706b() {
            AppUpdateActivity.this.f59164d.mo85688a();
            AppUpdateActivity.this.f59173m = 4;
            AppUpdateActivity.this.f59175o = 100;
            if (!AppUpdateActivity.this.f59170j) {
                C23927c cVar = new C23927c();
                AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                cVar.mo85859a(appUpdateActivity, appUpdateActivity.f59161a, new C23920k());
                return;
            }
            AppUpdateActivity.this.finish();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.updatesdk.service.otaupdate.AppUpdateActivity$j */
    public class C23919j implements C23895a.AbstractC23901d {
        C23919j() {
        }

        @Override // com.huawei.updatesdk.p1046b.p1056g.C23895a.AbstractC23901d
        /* renamed from: a */
        public void mo85704a() {
            AppUpdateActivity.this.finish();
        }
    }

    /* renamed from: com.huawei.updatesdk.service.otaupdate.AppUpdateActivity$k */
    public class C23920k implements C23927c.AbstractC23928a {
        public C23920k() {
        }

        @Override // com.huawei.updatesdk.service.otaupdate.C23927c.AbstractC23928a
        /* renamed from: a */
        public void mo85840a(Boolean bool) {
            if (bool.booleanValue()) {
                try {
                    Intent intent = new Intent("com.huawei.appmarket.intent.action.ThirdUpdateRemindAction");
                    intent.setPackage(AppUpdateActivity.this.f59161a);
                    AppUpdateActivity.this.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    C23834a.m87118b("AppUpdateActivity", "goHiappUpgrade error: " + e.toString());
                }
            }
            AppUpdateActivity.this.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.huawei.updatesdk.service.otaupdate.AppUpdateActivity$l */
    public static class DialogInterface$OnDismissListenerC23921l implements DialogInterface.OnDismissListener {
        private DialogInterface$OnDismissListenerC23921l() {
        }

        /* synthetic */ DialogInterface$OnDismissListenerC23921l(RunnableC23911b bVar) {
            this();
        }

        public void onDismiss(DialogInterface dialogInterface) {
            Intent intent = new Intent();
            intent.putExtra(UpdateKey.DIALOG_STATUS, UpdateDialogStatusCode.DISMISS);
            C23930d.m87479a().mo85867b(intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.huawei.updatesdk.service.otaupdate.AppUpdateActivity$m */
    public static class DialogInterface$OnShowListenerC23922m implements DialogInterface.OnShowListener {
        private DialogInterface$OnShowListenerC23922m() {
        }

        /* synthetic */ DialogInterface$OnShowListenerC23922m(RunnableC23911b bVar) {
            this();
        }

        public void onShow(DialogInterface dialogInterface) {
            Intent intent = new Intent();
            intent.putExtra(UpdateKey.DIALOG_STATUS, UpdateDialogStatusCode.SHOW);
            C23930d.m87479a().mo85867b(intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.huawei.updatesdk.service.otaupdate.AppUpdateActivity$n */
    public class C23923n extends AbstractC23861a {
        private C23923n() {
        }

        /* synthetic */ C23923n(AppUpdateActivity appUpdateActivity, RunnableC23911b bVar) {
            this();
        }

        @Override // com.huawei.updatesdk.p1029a.p1039b.p1043c.AbstractC23861a
        /* renamed from: a */
        public void mo85600a(Context context, C23862b bVar) {
            if (bVar.mo85609d()) {
                if (AppUpdateActivity.this.f59163c != null) {
                    AppUpdateActivity.this.f59163c.mo85688a();
                }
                AppUpdateActivity.this.m87415a();
                String a = bVar.mo85603a();
                String dataString = bVar.mo85608c().getDataString();
                if (dataString != null && dataString.length() >= 9) {
                    String substring = dataString.substring(8);
                    if ("android.intent.action.PACKAGE_ADDED".equals(a) && AppUpdateActivity.this.f59161a.equals(substring)) {
                        C23930d.m87479a().mo85865a(AppUpdateActivity.this.m87413a((AppUpdateActivity) 6, 0, -1));
                        C23891b.m87359a();
                        AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                        appUpdateActivity.m87425a((AppUpdateActivity) appUpdateActivity.f59169i.getPackage_(), AppUpdateActivity.this.f59169i.getDetailId_());
                        if (AppUpdateActivity.this.f59170j) {
                            AppUpdateActivity appUpdateActivity2 = AppUpdateActivity.this;
                            appUpdateActivity2.m87443d((AppUpdateActivity) appUpdateActivity2.f59169i);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private Intent m87413a(int i, int i2, int i3) {
        Intent intent = new Intent();
        intent.putExtra(UpdateKey.MARKET_DLD_STATUS, i3);
        intent.putExtra(UpdateKey.MARKET_INSTALL_STATE, i);
        intent.putExtra(UpdateKey.MARKET_INSTALL_TYPE, i2);
        return intent;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m87415a() {
        try {
            AlertDialog alertDialog = this.f59162b;
            if (alertDialog != null && alertDialog.isShowing()) {
                this.f59162b.dismiss();
                this.f59162b = null;
            }
        } catch (IllegalArgumentException unused) {
            C23834a.m87116a("AppUpdateActivity", "progressDialog dismiss IllegalArgumentException");
        }
    }

    /* renamed from: a */
    private void m87416a(View view) {
        if (C23845b.m87170g()) {
            try {
                ScrollView scrollView = (ScrollView) view.findViewById(C23935g.m87505c(this, "scroll_layout"));
                if (Build.VERSION.SDK_INT >= 22) {
                    TypedValue typedValue = new TypedValue();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    getTheme().resolveAttribute(16843987, typedValue, true);
                    ((WindowManager) getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                    int complexToDimensionPixelSize = TypedValue.complexToDimensionPixelSize(typedValue.data, displayMetrics);
                    scrollView.setPadding(complexToDimensionPixelSize, 0, complexToDimensionPixelSize, 0);
                }
            } catch (Exception e) {
                C23834a.m87118b("AppUpdateActivity", e.toString());
            }
        }
    }

    /* renamed from: a */
    private void m87417a(C23862b bVar) {
        Bundle b = bVar.mo85607b();
        if (b != null) {
            int i = b.getInt("download_status_param", -1);
            C23930d.m87479a().mo85865a(m87413a(-1, -1, i));
            if (!C23860a.m87237a(i)) {
                m87415a();
                if (C23860a.m87238b(i)) {
                    Toast.makeText(this, getString(C23935g.m87507e(this, "upsdk_third_app_dl_install_failed")), 0).show();
                    finish();
                }
            }
        }
    }

    /* renamed from: a */
    private void m87418a(ApkUpgradeInfo apkUpgradeInfo, TextView textView) {
        if (textView != null) {
            if (apkUpgradeInfo.getDiffSize_() > 0) {
                String a = C23939i.m87524a(this, (apkUpgradeInfo.getPackingType_() != 3 || apkUpgradeInfo.getObbSize_() <= 0) ? apkUpgradeInfo.getLongSize_() : apkUpgradeInfo.getLongSize_() + apkUpgradeInfo.getObbSize_());
                SpannableString spannableString = new SpannableString(a);
                spannableString.setSpan(new StrikethroughSpan(), 0, a.length(), 33);
                spannableString.setSpan(new TextAppearanceSpan("HwChinese-medium", 0, (int) textView.getTextSize(), null, null), 0, spannableString.length(), 33);
                textView.setText(spannableString);
                return;
            }
            textView.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m87424a(String str) {
        Intent intent = new Intent("com.huawei.appmarket.intent.action.ThirdUpdateAction");
        intent.setPackage(this.f59161a);
        intent.putExtra("APP_PACKAGENAME", str);
        intent.putExtra("APP_MUST_UPDATE_BTN", this.f59171k);
        try {
            this.f59168h = false;
            startActivityForResult(intent, 1002);
        } catch (ActivityNotFoundException e) {
            C23834a.m87118b("AppUpdateActivity", "goHiappUpgrade error: " + e.toString());
            this.f59168h = true;
            Intent intent2 = new Intent();
            intent2.putExtra(UpdateKey.STATUS, 8);
            C23930d.m87479a().mo85867b(intent2);
            m87443d(this.f59169i);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m87425a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            this.f59173m = 1;
            finish();
            return;
        }
        Intent intent = new Intent("com.huawei.appmarket.appmarket.intent.action.AppDetail.withdetailId");
        intent.setPackage(this.f59161a);
        intent.putExtra("appDetailId", str2);
        intent.putExtra("thirdId", str);
        intent.addFlags(268468224);
        try {
            startActivity(intent);
            if (!this.f59170j) {
                finish();
            }
        } catch (ActivityNotFoundException unused) {
            C23932f.m87496a(this);
            C23932f.m87497a(this.f59161a);
            Intent intent2 = new Intent();
            intent2.putExtra(UpdateKey.STATUS, 8);
            C23930d.m87479a().mo85867b(intent2);
            C23895a aVar = this.f59164d;
            if (aVar != null) {
                aVar.mo85688a();
            }
        }
    }

    /* renamed from: b */
    private long m87427b(ApkUpgradeInfo apkUpgradeInfo) {
        long longSize_ = apkUpgradeInfo.getLongSize_();
        if (apkUpgradeInfo.getPackingType_() == 1 && apkUpgradeInfo.getBundleSize_() > 0) {
            return apkUpgradeInfo.getBundleSize_();
        }
        if (apkUpgradeInfo.getPackingType_() == 3 && apkUpgradeInfo.getObbSize_() > 0) {
            longSize_ += apkUpgradeInfo.getObbSize_();
        }
        if (apkUpgradeInfo.getDiffSize_() <= 0) {
            return longSize_;
        }
        long diffSize_ = (long) apkUpgradeInfo.getDiffSize_();
        return (apkUpgradeInfo.getPackingType_() != 3 || apkUpgradeInfo.getObbSize_() <= 0) ? diffSize_ : diffSize_ + apkUpgradeInfo.getObbSize_();
    }

    /* renamed from: b */
    private void m87429b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C23923n nVar = new C23923n(this, null);
        this.f59177q = nVar;
        AbstractC23925a.m87469a(this, intentFilter, nVar);
    }

    /* renamed from: b */
    private void m87430b(C23862b bVar) {
        if (this.f59165e != null) {
            this.f59165e.setProgress(C23939i.m87522a(bVar.mo85606b("download_apk_already", 0), bVar.mo85606b("download_apk_size", 0)));
            this.f59166f.setText(C23939i.m87523a((int) ((((float) this.f59165e.getProgress()) / ((float) this.f59165e.getMax())) * 100.0f)));
        }
    }

    /* renamed from: b */
    private void m87432b(String str) {
        View inflate = LayoutInflater.from(this).inflate(C23935g.m87506d(this, "upsdk_ota_update_view"), (ViewGroup) null);
        ((TextView) inflate.findViewById(C23935g.m87505c(this, "content_textview"))).setText(TextUtils.isEmpty(this.f59169i.getNewFeatures_()) ? getString(C23935g.m87507e(this, "upsdk_choice_update")) : this.f59169i.getNewFeatures_());
        ((TextView) inflate.findViewById(C23935g.m87505c(this, "version_textview"))).setText(this.f59169i.getVersion_());
        ((TextView) inflate.findViewById(C23935g.m87505c(this, "appsize_textview"))).setText(C23939i.m87524a(this, m87427b(this.f59169i)));
        ((TextView) inflate.findViewById(C23935g.m87505c(this, "name_textview"))).setText(this.f59169i.getName_());
        m87418a(this.f59169i, (TextView) inflate.findViewById(C23935g.m87505c(this, "allsize_textview")));
        m87416a(inflate);
        C23895a a = C23895a.m87367a(this, str, null);
        this.f59164d = a;
        a.mo85693a(inflate);
    }

    /* renamed from: b */
    private void m87433b(String str, String str2) {
        AlertDialog alertDialog = this.f59162b;
        if (alertDialog == null || !alertDialog.isShowing()) {
            this.f59162b = (C23845b.m87170g() ? new AlertDialog.Builder(this) : ((getResources().getConfiguration().uiMode & 48) != 32 || Build.VERSION.SDK_INT < 29) ? new AlertDialog.Builder(this, 16974546) : new AlertDialog.Builder(this, 16974545)).create();
            View inflate = LayoutInflater.from(this).inflate(C23935g.m87506d(this, "upsdk_app_dl_progress_dialog"), (ViewGroup) null);
            ((TextView) inflate.findViewById(C23935g.m87505c(this, "third_app_warn_text"))).setText(getString(C23935g.m87507e(this, "upsdk_app_download_installing"), new Object[]{str2}));
            ProgressBar progressBar = (ProgressBar) inflate.findViewById(C23935g.m87505c(this, "third_app_dl_progressbar"));
            this.f59165e = progressBar;
            progressBar.setMax(100);
            this.f59166f = (TextView) inflate.findViewById(C23935g.m87505c(this, "third_app_dl_progress_text"));
            inflate.findViewById(C23935g.m87505c(this, "cancel_bg")).setOnClickListener(new View$OnClickListenerC23914e(str));
            this.f59162b.setView(inflate);
            this.f59162b.setCancelable(false);
            this.f59162b.setCanceledOnTouchOutside(false);
            if (!AbstractC23925a.m87470a(this)) {
                this.f59162b.show();
            }
            this.f59166f.setText(C23939i.m87523a(0));
        }
    }

    /* renamed from: c */
    private void m87436c() {
        int a = C23890a.m87353d().mo85685a();
        if (a >= 11 && a < 17) {
            this.f59164d.mo85689a(C23935g.m87504b(this, "upsdk_update_all_button"), C23935g.m87501a(this, "upsdk_white"));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private void m87437c(int i) {
        if (i == 5 || i == 4) {
            Toast.makeText(this, getString(C23935g.m87507e(this, "upsdk_third_app_dl_install_failed")), 0).show();
            C23891b.m87359a();
            finish();
        }
        if (i == 7) {
            C23891b.m87359a();
            if (this.f59167g) {
                m87443d(this.f59169i);
            } else {
                finish();
            }
        }
    }

    /* renamed from: c */
    private void m87438c(C23862b bVar) {
        new Handler(Looper.getMainLooper()).post(new RunnableC23911b(bVar));
    }

    /* renamed from: c */
    private void m87439c(ApkUpgradeInfo apkUpgradeInfo) {
        C23895a a = C23895a.m87367a(this, null, getString(C23935g.m87507e(this, "upsdk_appstore_install"), new Object[]{apkUpgradeInfo.getName_()}));
        a.mo85696a(new C23915f(apkUpgradeInfo, a));
        String string = getString(C23935g.m87507e(this, "upsdk_app_download_info_new"));
        a.mo85695a(new C23916g());
        a.mo85694a(C23895a.EnumC23900c.CONFIRM, string);
        a.mo85691a(new DialogInterface$OnKeyListenerC23917h(a));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private void m87440c(String str) {
        C23895a a = C23895a.m87367a(this, null, getString(C23935g.m87507e(this, "upsdk_third_app_dl_cancel_download_prompt_ex")));
        this.f59163c = a;
        a.mo85696a(new C23912c());
        String string = getString(C23935g.m87507e(this, "upsdk_third_app_dl_sure_cancel_download"));
        this.f59163c.mo85695a(new C23913d());
        this.f59163c.mo85694a(C23895a.EnumC23900c.CONFIRM, string);
    }

    /* renamed from: d */
    private void m87442d() {
        C23895a aVar = this.f59164d;
        if (aVar != null) {
            aVar.mo85690a(new DialogInterface$OnDismissListenerC23921l(null));
            this.f59164d.mo85692a(new DialogInterface$OnShowListenerC23922m(null));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private void m87443d(ApkUpgradeInfo apkUpgradeInfo) {
        if (apkUpgradeInfo == null) {
            finish();
            return;
        }
        String string = getString(C23935g.m87507e(this, "upsdk_ota_title"));
        String string2 = getString(C23935g.m87507e(this, "upsdk_ota_notify_updatebtn"));
        String string3 = getString(C23935g.m87507e(this, "upsdk_ota_cancel"));
        m87432b(string);
        if (1 == apkUpgradeInfo.getIsCompulsoryUpdate_()) {
            string3 = getString(C23935g.m87507e(this, "upsdk_ota_force_cancel_new"));
            if (this.f59171k) {
                this.f59164d.mo85699c();
            }
            this.f59167g = true;
        }
        this.f59164d.mo85696a(new C23918i());
        m87442d();
        this.f59164d.mo85695a(new C23919j());
        if (this.f59167g) {
            this.f59164d.mo85697a(false);
        } else {
            this.f59164d.mo85691a(new DialogInterface$OnKeyListenerC23910a());
        }
        this.f59164d.mo85694a(C23895a.EnumC23900c.CONFIRM, string2);
        this.f59164d.mo85694a(C23895a.EnumC23900c.CANCEL, string3);
        m87436c();
    }

    /* renamed from: e */
    private void m87445e() {
        AbstractC23925a.m87468a(this, this.f59177q);
        C23884c.m87334a().mo85680b(this);
        AsyncTaskC23856b bVar = this.f59172l;
        if (bVar != null) {
            bVar.mo85594b();
        }
        C23932f.m87496a((AbstractC23926b) null);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private void m87446e(ApkUpgradeInfo apkUpgradeInfo) {
        m87429b();
        m87433b(apkUpgradeInfo.getPackage_(), apkUpgradeInfo.getName_());
        C23855a aVar = new C23855a(apkUpgradeInfo.getDownurl_(), apkUpgradeInfo.getLongSize_(), apkUpgradeInfo.getSha256_());
        aVar.mo85587a(apkUpgradeInfo.getPackage_());
        AsyncTaskC23856b bVar = new AsyncTaskC23856b(aVar);
        this.f59172l = bVar;
        bVar.executeOnExecutor(Executors.newSingleThreadExecutor(), new Void[0]);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f */
    private void m87447f() {
        if (!C23891b.m87364c(this, this.f59161a)) {
            if (C23854a.m87210c() == null) {
                C23854a.m87209a(this);
            }
            C23932f.m87496a(this);
            C23932f.m87497a(this.f59161a);
            this.f59164d.mo85688a();
            return;
        }
        m87425a(this.f59169i.getPackage_(), this.f59169i.getDetailId_());
    }

    public void AppUpdateActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // com.huawei.updatesdk.service.otaupdate.AbstractC23926b
    /* renamed from: a */
    public void mo85828a(int i) {
        Toast.makeText(this, getString(C23935g.m87507e(this, "upsdk_getting_message_fail_prompt_toast")), 0).show();
        C23930d.m87479a().mo85864a(i);
        finish();
    }

    @Override // com.huawei.updatesdk.p1046b.p1051c.AbstractC23883b
    /* renamed from: a */
    public void mo85681a(int i, C23862b bVar) {
        if (bVar != null) {
            if (i == 0) {
                m87417a(bVar);
            } else if (1 == i) {
                m87430b(bVar);
            } else if (2 == i) {
                m87438c(bVar);
            }
        }
    }

    @Override // com.huawei.updatesdk.service.otaupdate.AbstractC23926b
    /* renamed from: a */
    public void mo85829a(ApkUpgradeInfo apkUpgradeInfo) {
        if (apkUpgradeInfo != null) {
            C23884c.m87334a().mo85679a(this);
            m87439c(apkUpgradeInfo);
            return;
        }
        Toast.makeText(this, getString(C23935g.m87507e(this, "upsdk_getting_message_fail_prompt_toast")), 0).show();
        finish();
    }

    @Override // com.huawei.updatesdk.service.otaupdate.AbstractC23926b
    /* renamed from: b */
    public void mo85830b(int i) {
        Toast.makeText(this, getString(C23935g.m87507e(this, "upsdk_connect_server_fail_prompt_toast")), 0).show();
        C23930d.m87479a().mo85864a(i);
        finish();
    }

    public void finish() {
        if (this.f59167g) {
            overridePendingTransition(0, 0);
        }
        Intent intent = new Intent();
        this.f59176p = intent;
        intent.putExtra(UpdateKey.STATUS, this.f59173m);
        this.f59176p.putExtra(UpdateKey.FAIL_CODE, this.f59174n);
        this.f59176p.putExtra(UpdateKey.MUST_UPDATE, this.f59167g);
        this.f59176p.putExtra(UpdateKey.BUTTON_STATUS, this.f59175o);
        C23930d.m87479a().mo85867b(this.f59176p);
        super.finish();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1002) {
            if (intent != null) {
                C23862b a = C23862b.m87240a(intent);
                this.f59173m = i2;
                this.f59174n = a.mo85602a("installResultCode", -99);
                this.f59167g = a.mo85605a(UpdateKey.MUST_UPDATE, false);
            }
            this.f59175o = i2 == 4 ? 100 : 101;
            if (!this.f59168h) {
                finish();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        C23845b.m87163d().mo85574a(getWindow());
        super.onCreate(bundle);
        Bundle b = C23862b.m87240a(getIntent()).mo85607b();
        if (b == null) {
            super.finish();
            return;
        }
        Serializable serializable = null;
        try {
            serializable = b.getSerializable("app_update_parm");
        } catch (Exception unused) {
            Log.e("AppUpdateActivity", "Type Conversion Error");
        }
        if (serializable instanceof ApkUpgradeInfo) {
            this.f59169i = (ApkUpgradeInfo) serializable;
            this.f59171k = b.getBoolean("app_must_btn", false);
            if (this.f59169i.getIsCompulsoryUpdate_() == 1) {
                this.f59170j = true;
            }
            if (!TextUtils.isEmpty(C23936h.m87510g().mo85880c())) {
                this.f59161a = C23936h.m87510g().mo85880c();
            }
            if (this.f59169i.getDevType_() == 1 && C23891b.m87358a(this, this.f59161a) == C23891b.EnumC23893b.INSTALLED) {
                m87424a(this.f59169i.getPackage_());
            } else {
                m87443d(this.f59169i);
            }
        } else {
            this.f59173m = 3;
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C23895a aVar = this.f59163c;
        if (aVar != null) {
            aVar.mo85688a();
            this.f59163c = null;
        }
        C23895a aVar2 = this.f59164d;
        if (aVar2 != null) {
            aVar2.mo85688a();
            this.f59164d = null;
        }
        m87415a();
        m87445e();
        super.onDestroy();
        finishActivity(1002);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        com_huawei_updatesdk_service_otaupdate_AppUpdateActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(this);
    }

    public static void com_huawei_updatesdk_service_otaupdate_AppUpdateActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(AppUpdateActivity appUpdateActivity) {
        appUpdateActivity.AppUpdateActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AppUpdateActivity appUpdateActivity2 = appUpdateActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    appUpdateActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
