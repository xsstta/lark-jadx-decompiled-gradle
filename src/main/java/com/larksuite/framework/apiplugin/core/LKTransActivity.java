package com.larksuite.framework.apiplugin.core;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.jaeger.library.StatusBarUtil;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25891b;
import com.larksuite.framework.utils.RomUtils;
import com.ss.android.lark.log.Log;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class LKTransActivity extends Activity {

    /* renamed from: a */
    private static final Map<Integer, AbstractC25891b> f64212a = new HashMap();

    /* renamed from: b */
    private final Map<LKTransActivity, LKCallProxyActivityCallback> f64213b = new HashMap();

    /* renamed from: a */
    public void mo92237a() {
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        m93851a(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f64213b.remove(this) != null) {
            Log.m165389i("LKTransActivity", "remove callback");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo92238a(int i) {
        if (RomUtils.m94934a(this, getWindow())) {
            StatusBarUtil.setColorNoTranslucent(this, i);
        }
    }

    /* renamed from: a */
    public static void m93851a(LKTransActivity lKTransActivity) {
        lKTransActivity.mo92237a();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            LKTransActivity lKTransActivity2 = lKTransActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    lKTransActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo92238a(0);
        Serializable serializableExtra = getIntent().getSerializableExtra("callbackParams");
        if (!(serializableExtra instanceof LKCallProxyActivityCallback)) {
            Log.m165383e("LKTransActivity", "invalid callback");
            finish();
            return;
        }
        Window window = getWindow();
        window.setGravity(51);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.x = 0;
        attributes.y = 0;
        attributes.width = 1;
        attributes.height = 1;
        attributes.type = 2002;
        attributes.flags = 32;
        window.setAttributes(attributes);
        LKCallProxyActivityCallback lKCallProxyActivityCallback = (LKCallProxyActivityCallback) serializableExtra;
        this.f64213b.put(this, lKCallProxyActivityCallback);
        lKCallProxyActivityCallback.onCreated(this);
    }

    /* renamed from: a */
    public static void m93850a(LKCallProxyActivityCallback lKCallProxyActivityCallback, AbstractC25891b bVar) {
        if (lKCallProxyActivityCallback == null) {
            Log.m165383e("LKTransActivity", "callback is null");
            return;
        }
        try {
            int w = bVar.mo92185w();
            f64212a.put(Integer.valueOf(w), bVar);
            Bundle bundle = new Bundle();
            bundle.putSerializable("callbackParams", lKCallProxyActivityCallback);
            bundle.putInt("nodeIdParams", w);
            Log.m165389i("LKTransActivity", "send event start");
            bVar.mo92179b(new LKEvent.C25888a().mo92168a("callProxyTranslateActivity").mo92163a(bundle).mo92171a());
        } catch (Throwable th) {
            Log.m165384e("LKTransActivity", "Throwable", th);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        int intExtra = getIntent().getIntExtra("nodeIdParams", -1);
        if (intExtra != -1) {
            AbstractC25891b remove = f64212a.remove(Integer.valueOf(intExtra));
            Log.m165389i("LKTransActivity", "request code:" + i + " result code:" + i2);
            if (remove instanceof AbstractC25922a) {
                ((AbstractC25922a) remove).mo87111a(i, i2, intent);
                remove.mo92186x();
            }
        }
        finish();
    }
}
