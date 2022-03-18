package com.bytedance.ee.bear.quoto;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.bizwidget.p271a.C4860a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.quoto.c */
public class C10564c extends C4860a {

    /* renamed from: c */
    private static long f28339c;

    /* renamed from: d */
    private View f28340d;

    /* renamed from: e */
    private C10567f f28341e;

    /* renamed from: f */
    private String f28342f;

    /* renamed from: g */
    private String f28343g;

    /* renamed from: h */
    private Boolean f28344h;

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C10567f fVar = this.f28341e;
        if (fVar != null) {
            fVar.destroy();
        }
    }

    /* renamed from: f */
    private void m43772f() {
        C10567f fVar = new C10567f(new C10566e(), new C10568g(this.f28340d, this, getContext(), this.f28344h.booleanValue()), this.f28342f, this.f28343g);
        this.f28341e = fVar;
        fVar.create();
    }

    /* renamed from: g */
    private void m43773g() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f28342f = arguments.getString("key_mount_node_token");
            this.f28343g = arguments.getString("key_mount_point");
            this.f28344h = Boolean.valueOf(arguments.getBoolean("key_is_folder"));
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m43773g();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m43772f();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_quota_layout, viewGroup, false);
        this.f28340d = inflate;
        return inflate;
    }

    /* renamed from: a */
    public static /* synthetic */ void m43771a(String str, String str2, boolean z, FragmentActivity fragmentActivity) {
        Bundle bundle = new Bundle();
        bundle.putString("key_mount_node_token", str);
        bundle.putString("key_mount_point", str2);
        bundle.putBoolean("key_is_folder", z);
        ((C10564c) Fragment.instantiate(fragmentActivity, C10564c.class.getName(), bundle)).mo5511a(fragmentActivity.getSupportFragmentManager(), "QuotaFragment");
    }

    /* renamed from: a */
    public static void m43770a(FragmentActivity fragmentActivity, String str, String str2, boolean z) {
        Lifecycle.State currentState = fragmentActivity.getLifecycle().getCurrentState();
        if (!currentState.isAtLeast(Lifecycle.State.RESUMED)) {
            C13479a.m54764b("QuotaFragment", "show()...illegal state = " + currentState.name());
        } else if (System.currentTimeMillis() - f28339c <= 2000) {
            C13479a.m54764b("QuotaFragment", "show()...has showed just now");
        } else if (fragmentActivity.getSupportFragmentManager().findFragmentByTag("QuotaFragment") != null) {
            C13479a.m54764b("QuotaFragment", "show()...fragment already added");
        } else {
            boolean a = C4211a.m17514a().mo16536a("ccm.space.userstorage.limited.enable", false);
            C13479a.m54764b("QuotaFragment", "show()...enable = " + a);
            if (a) {
                f28339c = System.currentTimeMillis();
                C13742g.m55711d(new Runnable(str, str2, z, fragmentActivity) {
                    /* class com.bytedance.ee.bear.quoto.$$Lambda$c$QHGH27IQ4iyGAKHfa2wdjb313g */
                    public final /* synthetic */ String f$0;
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ boolean f$2;
                    public final /* synthetic */ FragmentActivity f$3;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void run() {
                        C10564c.m269893lambda$QHGH27IQ4iyGAKHfa2wdjb313g(this.f$0, this.f$1, this.f$2, this.f$3);
                    }
                });
            }
        }
    }
}
