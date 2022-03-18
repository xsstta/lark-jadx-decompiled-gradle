package com.ss.android.lark.appcenter.scancode;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.lark.appcenter.scancode.C29114a;
import com.ss.android.lark.appcenter.scancode.ScanCodeActivity;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.fastqrcode.C37040a;
import com.ss.android.lark.fastqrcode.p1832b.C37054a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.permission.C51326e;
import com.ss.android.lark.permission.rxPermission.C51331a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.widget.photo_picker.C58557a;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;

public class ScanCodeActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public CommonTitleBar f72915a;

    /* renamed from: b */
    public TextView f72916b;

    /* renamed from: c */
    public TextView f72917c;

    /* renamed from: d */
    public C29121c f72918d;

    /* renamed from: a */
    public Context mo103253a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo103255a(Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m107004a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m106998a(this, configuration);
    }

    /* renamed from: e */
    public Resources mo103260e() {
        return super.getResources();
    }

    /* renamed from: f */
    public AssetManager mo103261f() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m107006c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m107005b(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m107003a(this);
    }

    /* renamed from: a */
    public void mo103254a() {
        C37040a.m146123c();
    }

    /* renamed from: d */
    public void mo103259d() {
        C37040a.m146124d();
        super.onStop();
    }

    /* renamed from: g */
    private void m107007g() {
        this.f72918d.getInitTask().mo5925a((AbstractC1178x<? super Object>) new AbstractC1178x<Object>() {
            /* class com.ss.android.lark.appcenter.scancode.ScanCodeActivity.C291021 */

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m107021a(View view) {
                ScanCodeActivity.this.f72918d.handleQRCodeResultInfo(CharacterUtils.empty(), 1);
            }

            @Override // androidx.lifecycle.AbstractC1178x
            public void onChanged(Object obj) {
                ScanCodeActivity scanCodeActivity = ScanCodeActivity.this;
                StatusBarUtil.setTranslucentForImageView(scanCodeActivity, 80, scanCodeActivity.f72915a);
                if (ScanCodeActivity.this.getIntent().getBooleanExtra("is_callback_cancel", false)) {
                    ScanCodeActivity.this.f72915a.setLeftClickListener(new View.OnClickListener() {
                        /* class com.ss.android.lark.appcenter.scancode.$$Lambda$ScanCodeActivity$1$RHX2NRj9TCl4u5b5_aFnJ2g2S8 */

                        public final void onClick(View view) {
                            ScanCodeActivity.C291021.m270268lambda$RHX2NRj9TCl4u5b5_aFnJ2g2S8(ScanCodeActivity.C291021.this, view);
                        }
                    });
                }
                ScanCodeActivity.this.f72915a.getLeftDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
                ScanCodeActivity.this.f72915a.addAction(new IActionTitlebar.TextAction(C28209p.m103297a((Context) ScanCodeActivity.this, (int) R.string.Lark_Legacy_Album)) {
                    /* class com.ss.android.lark.appcenter.scancode.ScanCodeActivity.C291021.C291031 */

                    @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                    public void performAction(View view) {
                        ScanCodeActivity.this.mo103256b();
                    }
                });
                ScanCodeActivity.this.f72915a.getRightText().setTextColor(-1);
                ScanCodeActivity scanCodeActivity2 = ScanCodeActivity.this;
                C37040a.m146120a(scanCodeActivity2, R.id.qrcodeview, scanCodeActivity2.f72918d.getFormats(), new C37040a.AbstractC37045a() {
                    /* class com.ss.android.lark.appcenter.scancode.ScanCodeActivity.C291021.C291042 */

                    @Override // com.ss.android.lark.fastqrcode.C37040a.AbstractC37045a
                    /* renamed from: a */
                    public void mo103263a(C37054a aVar) {
                        if (aVar != null) {
                            ScanCodeActivity.this.f72918d.handleQRCodeResultInfo(aVar.f95196a, 1);
                        }
                    }
                });
                ScanCodeActivity.this.f72918d.getInitTask().mo5928b((AbstractC1178x<? super Object>) this);
            }
        });
    }

    /* renamed from: h */
    private void m107008h() {
        this.f72918d.getToastText().mo5923a(this, new AbstractC1178x<String>() {
            /* class com.ss.android.lark.appcenter.scancode.ScanCodeActivity.C291052 */

            /* renamed from: a */
            public void onChanged(String str) {
                LKUIToast.show(ScanCodeActivity.this, str);
            }
        });
    }

    /* renamed from: i */
    private void m107009i() {
        this.f72918d.getParseQRCodeErrorTask().mo5923a(this, new AbstractC1178x<Object>() {
            /* class com.ss.android.lark.appcenter.scancode.ScanCodeActivity.C291063 */

            @Override // androidx.lifecycle.AbstractC1178x
            public void onChanged(Object obj) {
                ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(ScanCodeActivity.this).message(R.string.Lark_Legacy_QrCodeQrCodeError)).messageTextSize(17)).messageTextColor(R.color.text_title)).autoDismiss(true)).messagePadding(-1, 20, -1, 20)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Legacy_DialogOk, new DialogInterface.OnClickListener() {
                    /* class com.ss.android.lark.appcenter.scancode.$$Lambda$ScanCodeActivity$3$9_PukzxqMc5Ou3qOtFE7m_sGH8 */

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ScanCodeActivity.C291063.m270269lambda$9_PukzxqMc5Ou3qOtFE7m_sGH8(ScanCodeActivity.C291063.this, dialogInterface, i);
                    }
                })).show();
            }

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m107024a(DialogInterface dialogInterface, int i) {
                ScanCodeActivity.this.mo103254a();
            }
        });
    }

    /* renamed from: j */
    private void m107010j() {
        this.f72918d.getFinishTask().mo5923a(this, new AbstractC1178x<Object>() {
            /* class com.ss.android.lark.appcenter.scancode.ScanCodeActivity.C291074 */

            @Override // androidx.lifecycle.AbstractC1178x
            public void onChanged(Object obj) {
                ScanCodeActivity.this.finish();
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStart() {
        super.onStart();
        C57805b.m224331b(this, new C57805b.AbstractC57809a() {
            /* class com.ss.android.lark.appcenter.scancode.ScanCodeActivity.C291118 */

            @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
            public void permissionGranted(boolean z) {
                if (z) {
                    C37040a.m146122b();
                }
            }
        });
    }

    /* renamed from: k */
    private void m107011k() {
        this.f72917c.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.appcenter.scancode.$$Lambda$ScanCodeActivity$VeqkdGw8Dep6K7osfgiK1MxLBE */

            public final void onClick(View view) {
                ScanCodeActivity.m270267lambda$VeqkdGw8Dep6K7osfgiK1MxLBE(ScanCodeActivity.this, view);
            }
        });
        this.f72918d.getShowBarCodeInput().mo5923a(this, new AbstractC1178x<Boolean>() {
            /* class com.ss.android.lark.appcenter.scancode.ScanCodeActivity.C291096 */

            /* renamed from: a */
            public void onChanged(Boolean bool) {
                boolean z;
                int i;
                int i2 = 0;
                if (bool == null || !bool.booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                TextView textView = ScanCodeActivity.this.f72916b;
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                textView.setVisibility(i);
                TextView textView2 = ScanCodeActivity.this.f72917c;
                if (!z) {
                    i2 = 8;
                }
                textView2.setVisibility(i2);
            }
        });
    }

    /* renamed from: l */
    private void m107012l() {
        this.f72915a = (CommonTitleBar) findViewById(R.id.titlebar);
        this.f72916b = (TextView) findViewById(R.id.input_hint);
        this.f72917c = (TextView) findViewById(R.id.input_btn);
    }

    /* renamed from: b */
    public void mo103256b() {
        C51331a aVar = new C51331a(this);
        boolean z = false;
        if (aVar.mo176921a(C51326e.f127824e[0]) && aVar.mo176921a(C51326e.f127824e[1])) {
            z = true;
        }
        if (!z) {
            aVar.mo176924c(C51326e.f127824e).subscribe(new Consumer<Boolean>() {
                /* class com.ss.android.lark.appcenter.scancode.ScanCodeActivity.C291107 */

                /* renamed from: a */
                public void accept(Boolean bool) {
                    if (bool.booleanValue()) {
                        ScanCodeActivity.this.mo103257c();
                    }
                }
            });
        } else {
            mo103257c();
        }
    }

    /* renamed from: c */
    public void mo103257c() {
        C58557a.m227127a().mo198506a(1).mo198526i(false).mo198524g(false).mo198525h(false).mo198529l(false).mo198528k(false).mo198517c(false).mo198522f(3).mo198510a(this, 233);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        C37040a.m146125e();
        this.f72915a.getLeftDrawable().setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
        super.onDestroy();
        C29118b.m107036a().mo103282c();
        C29118b.m107036a().mo103281b();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m107002a(View view) {
        C29114a.m107031a(this, C28209p.m103297a((Context) this, (int) R.string.OpenPlatform_AppCenter_PleaseEnterBarcode), C28209p.m103297a((Context) this, (int) R.string.OpenPlatform_AppCenter_Cancel), C28209p.m103297a((Context) this, (int) R.string.OpenPlatform_AppCenter_Confirm), new C29114a.AbstractC29117a() {
            /* class com.ss.android.lark.appcenter.scancode.ScanCodeActivity.C291085 */

            @Override // com.ss.android.lark.appcenter.scancode.C29114a.AbstractC29117a
            /* renamed from: a */
            public void mo103265a(String str) {
                if (!TextUtils.isEmpty(str)) {
                    ScanCodeActivity.this.f72918d.handleQRCodeResultInfo(str, 4);
                }
            }
        });
    }

    /* renamed from: b */
    public static Resources m107005b(ScanCodeActivity scanCodeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(scanCodeActivity);
        }
        return scanCodeActivity.mo103260e();
    }

    /* renamed from: c */
    public static AssetManager m107006c(ScanCodeActivity scanCodeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(scanCodeActivity);
        }
        return scanCodeActivity.mo103261f();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        disableBlackStatusBarBeforeOnCreate();
        super.onCreate(bundle);
        setContentView(R.layout.scancode_activity);
        m107012l();
        C29118b.m107036a().mo103277a(this);
        this.f72918d = (C29121c) aj.m5366a(this).mo6005a(C29121c.class);
        m107007g();
        m107008h();
        m107009i();
        m107010j();
        m107011k();
        if (getIntent() != null) {
            this.f72918d.onCreate(getIntent().getIntArrayExtra("key_code_format"), getIntent().getBooleanExtra("key_barcode_input", false));
        } else {
            this.f72918d.onCreate(null, false);
        }
    }

    /* renamed from: a */
    private void m107001a(Intent intent) {
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("SELECTED_PHOTOS");
        if (CollectionUtils.isEmpty(stringArrayListExtra)) {
            Log.m165389i(this.TAG, "onActivityResult photos is empty");
            return;
        }
        String str = stringArrayListExtra.get(0);
        if (!TextUtils.isEmpty(str)) {
            this.f72918d.scanQRCodeInPhoto(str);
        }
    }

    /* renamed from: a */
    public static void m107003a(ScanCodeActivity scanCodeActivity) {
        scanCodeActivity.mo103259d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ScanCodeActivity scanCodeActivity2 = scanCodeActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    scanCodeActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m107004a(ScanCodeActivity scanCodeActivity, Context context) {
        scanCodeActivity.mo103255a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(scanCodeActivity);
        }
    }

    /* renamed from: a */
    public static Context m106998a(ScanCodeActivity scanCodeActivity, Configuration configuration) {
        Context a = scanCodeActivity.mo103253a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m106999a(Context context, int[] iArr, boolean z) {
        m107000a(context, iArr, z, false);
    }

    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null && i2 == -1 && i == 233) {
            m107001a(intent);
        }
    }

    /* renamed from: a */
    public static void m107000a(Context context, int[] iArr, boolean z, boolean z2) {
        Intent intent = new Intent(context, ScanCodeActivity.class);
        intent.putExtra("key_code_format", iArr);
        intent.putExtra("key_barcode_input", z);
        intent.putExtra("is_callback_cancel", z2);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }
}
