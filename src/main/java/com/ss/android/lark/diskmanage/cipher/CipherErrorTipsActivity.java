package com.ss.android.lark.diskmanage.cipher;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;

public class CipherErrorTipsActivity extends Activity {

    /* renamed from: a */
    private int f94584a;

    /* renamed from: b */
    private Dialog f94585b;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m145193a(DialogInterface dialogInterface, int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m145195b(DialogInterface dialogInterface) {
    }

    /* renamed from: b */
    public void mo135580b() {
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        m145194a(this);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        Dialog dialog = this.f94585b;
        if (dialog != null && dialog.isShowing()) {
            this.f94585b.dismiss();
        }
    }

    /* renamed from: a */
    public Dialog mo135579a() {
        String str = getString(R.string.Lark_Disk_Manage_DecryptError) + this.f94584a;
        Log.m165389i("CipherErrorTipsActivity", "showCipherErrorDialog");
        return new C25639g(this).mo89242c(str).mo89253l(8388611).mo89245d(0.3f).mo89224a(R.id.lkui_dialog_btn_left, 17039370, $$Lambda$CipherErrorTipsActivity$g7JsPsnPXovJ7wNB4_9i3s5SPBc.INSTANCE).mo89227a(new DialogInterface.OnDismissListener() {
            /* class com.ss.android.lark.diskmanage.cipher.$$Lambda$CipherErrorTipsActivity$0xEKszDIlkgkcQRTZlCrv88rtw */

            public final void onDismiss(DialogInterface dialogInterface) {
                CipherErrorTipsActivity.this.m145192a((CipherErrorTipsActivity) dialogInterface);
            }
        }).mo89239c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m145192a(DialogInterface dialogInterface) {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.cipher_activity_main);
        this.f94584a = getIntent().getIntExtra("cipher_error", 0);
        this.f94585b = mo135579a();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        int i = this.f94584a;
        int intExtra = intent.getIntExtra("cipher_error", 0);
        this.f94584a = intExtra;
        if (i != intExtra) {
            Dialog dialog = this.f94585b;
            if (dialog != null && dialog.isShowing()) {
                this.f94585b.setOnDismissListener($$Lambda$CipherErrorTipsActivity$iKjKKIw6zYc2B77aes4nsJDng9I.INSTANCE);
                this.f94585b.dismiss();
            }
            mo135579a();
        }
        setIntent(intent);
    }

    /* renamed from: a */
    public static void m145194a(CipherErrorTipsActivity cipherErrorTipsActivity) {
        cipherErrorTipsActivity.mo135580b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CipherErrorTipsActivity cipherErrorTipsActivity2 = cipherErrorTipsActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    cipherErrorTipsActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m145191a(Context context, int i) {
        Intent intent = new Intent(context, CipherErrorTipsActivity.class);
        intent.putExtra("cipher_error", i);
        if (context instanceof Application) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
        if (context instanceof Activity) {
            ((Activity) context).overridePendingTransition(0, 0);
        }
    }
}
