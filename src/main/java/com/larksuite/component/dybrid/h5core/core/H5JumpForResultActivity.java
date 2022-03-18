package com.larksuite.component.dybrid.h5core.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.larksuite.component.dybrid.router.C24258a;
import org.json.JSONException;
import org.json.JSONObject;

public class H5JumpForResultActivity extends Activity {

    /* renamed from: a */
    private static AbstractC24196a f59807a;

    /* renamed from: b */
    private boolean f59808b;

    /* renamed from: com.larksuite.component.dybrid.h5core.core.H5JumpForResultActivity$a */
    public interface AbstractC24196a {
        /* renamed from: a */
        void mo86806a(String str);
    }

    /* renamed from: a */
    public void mo86801a() {
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        m88359a(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (!this.f59808b) {
            this.f59808b = true;
        } else if (!isFinishing()) {
            C24174b.m88296a("H5JumpActivityTag", "onResume");
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C24258a.m88594a().mo86895a(this, getIntent().getStringExtra("paramRouterPath"), new Bundle(), 100);
    }

    /* renamed from: a */
    public static void m88359a(H5JumpForResultActivity h5JumpForResultActivity) {
        h5JumpForResultActivity.mo86801a();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            H5JumpForResultActivity h5JumpForResultActivity2 = h5JumpForResultActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    h5JumpForResultActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m88358a(Context context, String str, AbstractC24196a aVar) {
        f59807a = aVar;
        Intent intent = new Intent(context, H5JumpForResultActivity.class);
        intent.setFlags(268435456);
        Bundle bundle = new Bundle();
        bundle.putString("paramRouterPath", str);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C24174b.m88296a("H5JumpActivityTag", "onActivityResult");
        if (!(f59807a == null || intent == null || intent.getExtras() == null)) {
            Bundle extras = intent.getExtras();
            try {
                JSONObject jSONObject = new JSONObject();
                for (String str : extras.keySet()) {
                    C24174b.m88296a("H5JumpActivityTag", "key:" + str);
                    jSONObject.put(str, JSONObject.wrap(extras.get(str)));
                }
                f59807a.mo86806a(jSONObject.toString());
            } catch (JSONException e) {
                C24174b.m88297a("H5JumpActivityTag", "onActivityResult", e);
            }
        }
        finish();
    }
}
