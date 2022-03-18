package com.ss.android.bytedcert.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.suite.R;
import com.ss.android.bytedcert.callback.AbstractC28335f;
import com.ss.android.bytedcert.manager.BytedCertManager;
import com.ss.android.bytedcert.p1315h.RunnableC28384a;
import com.ss.android.bytedcert.utils.C28435d;
import com.ss.android.bytedcert.utils.C28440f;
import com.ss.android.bytedcert.utils.C28441g;
import com.ss.android.bytedcert.view.camera.MyPreview;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class OCRTakePhotoActivity extends AppCompatActivity {

    /* renamed from: a */
    Resources f71098a;

    /* renamed from: b */
    public MyPreview f71099b;

    /* renamed from: c */
    public ImageView f71100c;

    /* renamed from: d */
    public BytedCertManager f71101d;

    /* renamed from: e */
    public int f71102e = -1;

    /* renamed from: f */
    public int f71103f;

    /* renamed from: g */
    private ImageView f71104g;

    /* renamed from: h */
    private ImageView f71105h;

    /* renamed from: i */
    private TextView f71106i;

    /* renamed from: j */
    private Button f71107j;

    /* renamed from: k */
    private String f71108k;

    /* renamed from: l */
    private String f71109l;

    /* renamed from: a */
    public Context mo100882a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo100884a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m103868a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m103866a(this, configuration);
    }

    /* renamed from: f */
    public Resources mo100892f() {
        return super.getResources();
    }

    /* renamed from: g */
    public AssetManager mo100893g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m103870c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public Resources getResources() {
        return m103869b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m103867a(this);
    }

    /* renamed from: e */
    public void mo100891e() {
        super.onStop();
        this.f71102e = -1;
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        mo100886a(false);
        super.onBackPressed();
    }

    /* renamed from: b */
    public void mo100887b() {
        runOnUiThread(new Runnable() {
            /* class com.ss.android.bytedcert.activities.OCRTakePhotoActivity.RunnableC283125 */

            public void run() {
                OCRTakePhotoActivity.this.f71099b.mo101245a();
            }
        });
    }

    /* renamed from: c */
    public void mo100888c() {
        runOnUiThread(new Runnable() {
            /* class com.ss.android.bytedcert.activities.OCRTakePhotoActivity.RunnableC283136 */

            public void run() {
                OCRTakePhotoActivity.this.f71099b.mo101247b();
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo100890d() {
        int a = C28441g.m104235a((Context) this);
        this.f71106i = (TextView) findViewById(R.id.ocr_take_photo_ver_text);
        this.f71106i.setTranslationX((float) (-((int) (((((double) a) / 10.0d) * 3.0d) + ((double) C28441g.m104234a((Context) this, 19.0f))))));
        String str = this.f71109l;
        if (str != null) {
            this.f71106i.setText(str);
        } else {
            this.f71106i.setText("");
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        mo100890d();
        this.f71103f = 0;
        int i = this.f71102e;
        if (i == 1) {
            this.f71099b.mo101247b();
        } else if (i == 0) {
            this.f71099b.mo101245a();
        }
        int i2 = this.f71102e;
        if (i2 != 1) {
            this.f71100c.setImageDrawable(getResources().getDrawable(R.mipmap.byted_poweroff));
        } else if (i2 == 1) {
            this.f71100c.setImageDrawable(getResources().getDrawable(R.mipmap.byted_poweron));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo100883a() {
        this.f71099b = (MyPreview) findViewById(R.id.ocr_take_photo_surface);
        ImageView imageView = (ImageView) findViewById(R.id.ocr_take_photo_take);
        this.f71104g = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.bytedcert.activities.OCRTakePhotoActivity.View$OnClickListenerC283082 */

            public void onClick(View view) {
                OCRTakePhotoActivity.this.runOnUiThread(new Runnable() {
                    /* class com.ss.android.bytedcert.activities.OCRTakePhotoActivity.View$OnClickListenerC283082.RunnableC283091 */

                    public void run() {
                        if (OCRTakePhotoActivity.this.f71103f == 0) {
                            OCRTakePhotoActivity.this.f71103f = 1;
                            if (OCRTakePhotoActivity.this.f71099b != null) {
                                OCRTakePhotoActivity.this.f71099b.mo101248c();
                            }
                        }
                    }
                });
            }
        });
        this.f71107j = (Button) findViewById(R.id.ocr_take_photo_cancle);
        this.f71100c.setImageDrawable(getResources().getDrawable(R.mipmap.byted_poweroff));
        String stringExtra = getIntent().getStringExtra(ShareHitPoint.f121869d);
        this.f71108k = stringExtra;
        stringExtra.hashCode();
        char c = 65535;
        switch (stringExtra.hashCode()) {
            case 3015911:
                if (stringExtra.equals("back")) {
                    c = 0;
                    break;
                }
                break;
            case 3208383:
                if (stringExtra.equals("hold")) {
                    c = 1;
                    break;
                }
                break;
            case 97705513:
                if (stringExtra.equals("front")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f71105h.setImageDrawable(this.f71098a.getDrawable(R.mipmap.byted_back));
                this.f71109l = getString(R.string.byted_ocr_take_back);
                break;
            case 1:
                this.f71105h.setImageDrawable(this.f71098a.getDrawable(R.mipmap.byted_hold));
                this.f71109l = getString(R.string.byted_ocr_handheld);
                break;
            case 2:
                this.f71105h.setImageDrawable(this.f71098a.getDrawable(R.mipmap.byted_front));
                this.f71109l = getString(R.string.byted_ocr_take_front);
                break;
        }
        this.f71100c.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.bytedcert.activities.OCRTakePhotoActivity.View$OnClickListenerC283103 */

            public void onClick(View view) {
                if (OCRTakePhotoActivity.this.f71102e != 1) {
                    OCRTakePhotoActivity.this.f71102e = 1;
                    OCRTakePhotoActivity.this.f71100c.setImageDrawable(OCRTakePhotoActivity.this.f71098a.getDrawable(R.mipmap.byted_poweron));
                    OCRTakePhotoActivity.this.mo100888c();
                } else if (OCRTakePhotoActivity.this.f71102e == 1) {
                    OCRTakePhotoActivity.this.f71102e = 0;
                    OCRTakePhotoActivity.this.f71100c.setImageDrawable(OCRTakePhotoActivity.this.f71098a.getDrawable(R.mipmap.byted_poweroff));
                    OCRTakePhotoActivity.this.mo100887b();
                }
            }
        });
        this.f71107j.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.bytedcert.activities.OCRTakePhotoActivity.View$OnClickListenerC283114 */

            public void onClick(View view) {
                if (OCRTakePhotoActivity.this.f71102e == 1) {
                    OCRTakePhotoActivity.this.f71102e = 0;
                    OCRTakePhotoActivity.this.mo100887b();
                }
                OCRTakePhotoActivity.this.mo100886a(false);
                OCRTakePhotoActivity.this.finish();
            }
        });
    }

    /* renamed from: b */
    public static Resources m103869b(OCRTakePhotoActivity oCRTakePhotoActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(oCRTakePhotoActivity);
        }
        return oCRTakePhotoActivity.mo100892f();
    }

    /* renamed from: c */
    public static AssetManager m103870c(OCRTakePhotoActivity oCRTakePhotoActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(oCRTakePhotoActivity);
        }
        return oCRTakePhotoActivity.mo100893g();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C28441g.m104236a((Activity) this);
        setContentView(R.layout.byted_activity_ocr_take_photo);
        BytedCertManager instance = BytedCertManager.getInstance();
        this.f71101d = instance;
        instance.mImgTime1 = C28440f.m104231a();
        this.f71105h = (ImageView) findViewById(R.id.ocr_take_photo_mask);
        this.f71100c = (ImageView) findViewById(R.id.ocr_take_photo_led);
        this.f71098a = getResources();
        C28435d.m104222a(this, new AbstractC28335f() {
            /* class com.ss.android.bytedcert.activities.OCRTakePhotoActivity.C283071 */

            @Override // com.ss.android.bytedcert.callback.AbstractC28335f
            /* renamed from: a */
            public void mo100837a() {
                OCRTakePhotoActivity.this.mo100883a();
            }

            @Override // com.ss.android.bytedcert.callback.AbstractC28335f
            /* renamed from: b */
            public void mo100838b() {
                OCRTakePhotoActivity.this.mo100886a(false);
                OCRTakePhotoActivity.this.finish();
            }
        });
    }

    /* renamed from: a */
    public static void m103867a(OCRTakePhotoActivity oCRTakePhotoActivity) {
        oCRTakePhotoActivity.mo100891e();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            OCRTakePhotoActivity oCRTakePhotoActivity2 = oCRTakePhotoActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    oCRTakePhotoActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public void mo100886a(boolean z) {
        Intent intent = new Intent();
        if (z) {
            intent.putExtra(UpdateKey.STATUS, 0);
            setResult(-1, intent);
            return;
        }
        intent.putExtra(UpdateKey.STATUS, 1);
        setResult(0, intent);
    }

    /* renamed from: a */
    public static void m103868a(OCRTakePhotoActivity oCRTakePhotoActivity, Context context) {
        oCRTakePhotoActivity.mo100884a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(oCRTakePhotoActivity);
        }
    }

    /* renamed from: a */
    public void mo100885a(String str, final byte[] bArr) {
        new RunnableC28384a(new Runnable() {
            /* class com.ss.android.bytedcert.activities.OCRTakePhotoActivity.RunnableC283147 */

            /* JADX WARNING: Removed duplicated region for block: B:14:0x006f  */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x008b  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                // Method dump skipped, instructions count: 150
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.bytedcert.activities.OCRTakePhotoActivity.RunnableC283147.run():void");
            }
        }).mo101095a();
    }

    /* renamed from: a */
    public static Context m103866a(OCRTakePhotoActivity oCRTakePhotoActivity, Configuration configuration) {
        Context a = oCRTakePhotoActivity.mo100882a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback, androidx.fragment.app.FragmentActivity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C28435d.m104221a(this, i, strArr, iArr);
    }
}
