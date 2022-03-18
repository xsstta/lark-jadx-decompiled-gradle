package com.ss.android.lark.main.app.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.base.p1400a.C29520a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.C44321g;
import com.ss.android.lark.main.app.fragment.C44274f;
import com.ss.android.lark.main.app.fragment.phone.C44302c;
import com.ss.android.lark.main.app.fragment.phone.C44313d;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.main.router.C44508c;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.lark.main.app.fragment.a */
public abstract class AbstractC44239a extends C29520a {

    /* renamed from: f */
    private static SparseArray<Animation> f112222f = new SparseArray<>(3);

    /* renamed from: b */
    public final String f112223b = ("MainModule_" + getClass().getSimpleName());

    /* renamed from: c */
    final AbstractC44136a f112224c = C44134a.m174959a();

    /* renamed from: d */
    public View f112225d;

    /* renamed from: e */
    protected AbstractC44241b f112226e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AbstractC44241b mo157269a(C44302c cVar, C44274f.AbstractC44277b bVar);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C44274f.AbstractC44277b mo157272e();

    /* renamed from: f */
    private void m175469f() {
        UICallbackExecutor.executeDelayed(new RunnableC44240a(this), 300);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Log.m165389i(this.f112223b, "onDestroy");
        super.onDestroy();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Log.m165389i(this.f112223b, "onStop");
    }

    /* renamed from: g */
    private void m175471g() {
        Intent intent = getActivity().getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("extra_tips_toast_text");
            if (!TextUtils.isEmpty(stringExtra)) {
                LKUIToast.show(this.mContext, stringExtra);
            }
        }
    }

    @Override // com.ss.android.lark.base.p1400a.C29520a
    /* renamed from: d */
    public Bundle mo104603d() {
        AbstractC44241b bVar = this.f112226e;
        if (bVar == null) {
            return null;
        }
        return bVar.mo157281d();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Log.m165389i(this.f112223b, "onDestroyView");
        super.onDestroyView();
        AbstractC44241b bVar = this.f112226e;
        if (bVar != null) {
            bVar.destroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Log.m165389i(this.f112223b, "onResume");
        super.onResume();
        AbstractC44241b bVar = this.f112226e;
        if (bVar != null) {
            bVar.mo157279b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.main.app.fragment.a$a */
    public class RunnableC44240a implements Runnable {

        /* renamed from: b */
        private WeakReference<AbstractC44239a> f112228b;

        public void run() {
            AbstractC44239a aVar = this.f112228b.get();
            if (aVar == null || aVar.getActivity() == null || aVar.getActivity().isFinishing()) {
                Log.m165397w(AbstractC44239a.this.TAG, "BaseMainFragment route delay invalid context");
                return;
            }
            AbstractC44239a.this.mo157271a(aVar.getArguments());
        }

        public RunnableC44240a(AbstractC44239a aVar) {
            this.f112228b = new WeakReference<>(aVar);
        }
    }

    @Override // com.ss.android.lark.base.p1400a.C29520a
    /* renamed from: a */
    public boolean mo104599a() {
        AbstractC44241b bVar = this.f112226e;
        if (bVar == null) {
            return false;
        }
        boolean e = bVar.mo157282e();
        String str = this.f112223b;
        Log.m165389i(str, "handleBack isHanded = " + e);
        return e;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
    }

    /* renamed from: c */
    private boolean m175466c(Bundle bundle) {
        return this.f112224c.mo133226a(this.mContext, bundle);
    }

    /* renamed from: d */
    private boolean m175467d(Bundle bundle) {
        return this.f112224c.mo133239b(this.mContext, bundle);
    }

    /* renamed from: k */
    private void m175476k(Bundle bundle) {
        AbstractC44241b bVar = this.f112226e;
        if (bVar != null && bundle != null) {
            bVar.mo157276a(bundle);
        }
    }

    /* renamed from: a */
    public void mo157270a(boolean z) {
        AbstractC44241b bVar = this.f112226e;
        if (bVar != null && (bVar instanceof C44313d)) {
            bVar.mo157277a(z);
        }
    }

    /* renamed from: b */
    private boolean m175465b(Bundle bundle) {
        if (!m175466c(bundle) && !m175467d(bundle)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private boolean m175470f(Bundle bundle) {
        return this.f112224c.mo133244c(this.mContext, bundle);
    }

    /* renamed from: h */
    private boolean m175473h(Bundle bundle) {
        if (!bundle.getBoolean(this.f112224c.mo133264t(), false)) {
            return false;
        }
        m175476k(bundle);
        return true;
    }

    /* renamed from: i */
    private boolean m175474i(Bundle bundle) {
        if (!bundle.getBoolean(this.f112224c.mo133265u(), false)) {
            return false;
        }
        m175476k(bundle);
        return true;
    }

    /* renamed from: j */
    private void m175475j(Bundle bundle) {
        C44274f.AbstractC44277b e = mo157272e();
        e.mo157307a(bundle);
        AbstractC44241b a = mo157269a(new C44302c(), e);
        this.f112226e = a;
        a.create();
    }

    @Override // com.ss.android.lark.base.p1400a.C29520a
    /* renamed from: a */
    public void mo104596a(Intent intent) {
        Log.m165389i(this.f112223b, "onNewIntent");
        Bundle extras = intent.getExtras();
        if (!mo157271a(extras)) {
            m175471g();
            m175476k(extras);
        }
    }

    /* renamed from: e */
    private boolean m175468e(Bundle bundle) {
        boolean z = bundle.getBoolean(this.f112224c.mo133262r(), false);
        String str = this.TAG;
        Log.m165389i(str, "openMail jump:" + z);
        if (!z) {
            return false;
        }
        m175476k(bundle);
        return true;
    }

    /* renamed from: g */
    private boolean m175472g(Bundle bundle) {
        Bundle bundle2;
        if (!bundle.containsKey("bundle_lkp") || (bundle2 = bundle.getBundle("bundle_lkp")) == null) {
            return false;
        }
        C44508c.m176577d(this.mContext, (Uri) bundle2.getParcelable("uri_lkp"), bundle2.getBoolean("internal_lkp"), bundle2);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        if (z) {
            onPause();
            onStop();
        } else {
            Bundle arguments = getArguments();
            String str = null;
            if (arguments != null) {
                str = arguments.getString("fragment_switch_from", null);
            }
            if (str != null && !TextUtils.equals(str, AbstractC44239a.class.getName())) {
                onStart();
                onResume();
            }
        }
        super.onHiddenChanged(z);
    }

    /* renamed from: a */
    public boolean mo157271a(Bundle bundle) {
        if (bundle == null) {
            Log.m165389i(this.TAG, "BaseMainFragment route bundle is null");
            return true;
        } else if (m175465b(bundle)) {
            Log.m165389i(this.TAG, "BaseMainFragment route doc success");
            return true;
        } else if (m175470f(bundle)) {
            Log.m165389i(this.TAG, "BaseMainFragment route mini app success");
            return true;
        } else if (m175472g(bundle)) {
            Log.m165389i(this.TAG, "BaseMainFragment route base success");
            return true;
        } else if (m175468e(bundle)) {
            Log.m165389i(this.TAG, "BaseMainFragment route mail success");
            return true;
        } else if (m175473h(bundle)) {
            Log.m165389i(this.TAG, "BaseMainFragment route calendar success");
            return true;
        } else if (!m175474i(bundle)) {
            return false;
        } else {
            Log.m165389i(this.TAG, "BaseMainFragment route todo success");
            return true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        if (i2 == 0) {
            return null;
        }
        Animation animation = f112222f.get(i2);
        if (animation == null) {
            Animation loadAnimation = AnimationUtils.loadAnimation(getActivity(), i2);
            f112222f.put(i2, loadAnimation);
            return loadAnimation;
        }
        animation.reset();
        return animation;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f112224c.mo133182B().mo133364b("main_view_create", null);
        Log.m165389i(this.f112223b, "onCreateView");
        this.f112225d = C44321g.m175828a().mo157434a(getActivity(), true);
        m175475j(getArguments());
        m175469f();
        this.f112224c.mo133182B().mo133362a();
        return this.f112225d;
    }
}
