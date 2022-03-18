package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentActivity;
import androidx.loader.content.C1198c;
import androidx.loader.p045a.AbstractC1181a;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.api.Status;

public class SignInHubActivity extends FragmentActivity {

    /* renamed from: a */
    private static boolean f52512a;

    /* renamed from: b */
    private boolean f52513b;

    /* renamed from: c */
    private SignInConfiguration f52514c;

    /* renamed from: d */
    private boolean f52515d;

    /* renamed from: e */
    private int f52516e;

    /* renamed from: f */
    private Intent f52517f;

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.gms.auth.api.signin.internal.SignInHubActivity$a */
    public class C21588a implements AbstractC1181a.AbstractC1182a<Void> {
        private C21588a() {
        }

        @Override // androidx.loader.p045a.AbstractC1181a.AbstractC1182a
        /* renamed from: a */
        public final void mo6054a(C1198c<Void> cVar) {
        }

        @Override // androidx.loader.p045a.AbstractC1181a.AbstractC1182a
        /* renamed from: a */
        public final C1198c<Void> mo6053a(int i, Bundle bundle) {
            return new C21593e(SignInHubActivity.this, AbstractC21631d.m78282a());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.loader.content.c, java.lang.Object] */
        @Override // androidx.loader.p045a.AbstractC1181a.AbstractC1182a
        /* renamed from: a */
        public final /* synthetic */ void mo6055a(C1198c<Void> cVar, Void r3) {
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.f52516e, SignInHubActivity.this.f52517f);
            SignInHubActivity.this.finish();
        }
    }

    /* renamed from: a */
    public void mo73081a() {
        super.onStop();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onStop() {
        m78175c(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            m78172a(12500);
        } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            SignInConfiguration signInConfiguration = (SignInConfiguration) m78171a(intent, "config").getParcelable("config");
            this.f52514c = signInConfiguration;
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            if (!(bundle == null)) {
                boolean z = bundle.getBoolean("signingInGoogleApiClients");
                this.f52515d = z;
                if (z) {
                    this.f52516e = bundle.getInt("signInResultCode");
                    this.f52517f = (Intent) bundle.getParcelable("signInResultData");
                    m78174b();
                }
            } else if (f52512a) {
                setResult(0);
                m78172a(12502);
            } else {
                f52512a = true;
                Intent intent2 = new Intent(action);
                if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    intent2.setPackage("com.google.android.gms");
                } else {
                    intent2.setPackage(getPackageName());
                }
                intent2.putExtra("config", this.f52514c);
                try {
                    startActivityForResult(intent2, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.f52513b = true;
                    Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                    m78172a(17);
                }
            }
        } else {
            String valueOf = String.valueOf(intent.getAction());
            Log.e("AuthSignInClient", valueOf.length() != 0 ? "Unknown action: ".concat(valueOf) : new String("Unknown action: "));
            finish();
        }
    }

    /* renamed from: a */
    public static Bundle m78171a(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra(str);
        Context context = BadParcelableCrashOptimizer.getContext();
        if (!(bundleExtra == null || context == null)) {
            bundleExtra.setClassLoader(context.getClassLoader());
        }
        return bundleExtra;
    }

    /* renamed from: c */
    public static void m78175c(SignInHubActivity signInHubActivity) {
        signInHubActivity.mo73081a();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SignInHubActivity signInHubActivity2 = signInHubActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    signInHubActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f52515d);
        if (this.f52515d) {
            bundle.putInt("signInResultCode", this.f52516e);
            bundle.putParcelable("signInResultData", this.f52517f);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f52513b) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && signInAccount.mo73061a() != null) {
                        GoogleSignInAccount a = signInAccount.mo73061a();
                        C21601m.m78217a(this).mo73106a(this.f52514c.mo73077a(), a);
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", a);
                        this.f52515d = true;
                        this.f52516e = i2;
                        this.f52517f = intent;
                        m78174b();
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        m78172a(intExtra);
                        return;
                    }
                }
                m78172a(8);
            }
        }
    }

    /* renamed from: b */
    private final void m78174b() {
        getSupportLoaderManager().mo6046a(0, null, new C21588a());
        f52512a = false;
    }

    /* renamed from: a */
    private final void m78172a(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f52512a = false;
    }
}
