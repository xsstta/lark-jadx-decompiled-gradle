package com.larksuite.component.dybrid.h5core.core;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.larksuite.component.dybrid.h5core.p1076d.C24214b;
import com.ss.android.lark.base.watermark.IWatermarkable;

public class H5TranslateProxyActivity extends Activity implements IWatermarkable {

    /* renamed from: a */
    public static AbstractC24197a f59809a;

    /* renamed from: c */
    private static H5TranslateProxyActivity f59810c;

    /* renamed from: b */
    private boolean f59811b;

    /* renamed from: com.larksuite.component.dybrid.h5core.core.H5TranslateProxyActivity$a */
    public interface AbstractC24197a {
        /* renamed from: a */
        void mo86815a(Activity activity);
    }

    /* renamed from: b */
    public void mo86808b() {
        super.onStop();
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable
    public boolean enableGlobalWatermark() {
        return false;
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable
    public int getWatermarkMode() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        m88364a(this);
    }

    /* renamed from: c */
    private void m88365c() {
        this.f59811b = false;
        AbstractC24197a aVar = f59809a;
        if (aVar != null) {
            aVar.mo86815a(this);
        }
    }

    /* renamed from: a */
    public static void m88362a() {
        C24174b.m88296a("H5TranslateActivityTag", "finish activity intent");
        H5TranslateProxyActivity h5TranslateProxyActivity = f59810c;
        if (h5TranslateProxyActivity != null && !h5TranslateProxyActivity.isFinishing()) {
            f59810c.finish();
        }
        f59809a = null;
        f59810c = null;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (!this.f59811b) {
            this.f59811b = true;
        } else if (!isFinishing()) {
            C24174b.m88296a("H5TranslateActivityTag", "onResume Finish");
            f59809a = null;
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C24174b.m88296a("H5TranslateActivityTag", "onNewIntent");
        m88365c();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(-1);
        C24174b.m88296a("H5TranslateActivityTag", "onCreate");
        m88365c();
        mo86807a((Activity) this);
        f59810c = this;
    }

    /* renamed from: a */
    public static void m88363a(AbstractC24197a aVar) {
        f59809a = aVar;
        Intent intent = new Intent(C24214b.m88460a(), H5TranslateProxyActivity.class);
        intent.addFlags(268435456);
        C24214b.m88460a().startActivity(intent);
    }

    /* renamed from: a */
    public static void m88364a(H5TranslateProxyActivity h5TranslateProxyActivity) {
        h5TranslateProxyActivity.mo86808b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            H5TranslateProxyActivity h5TranslateProxyActivity2 = h5TranslateProxyActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    h5TranslateProxyActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public void mo86807a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 19) {
            Window window = activity.getWindow();
            if (Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(0);
                return;
            }
            window.addFlags(67108864);
        }
    }
}
