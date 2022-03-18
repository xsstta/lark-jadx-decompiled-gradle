package com.ss.android.lark.base.p1400a;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import java.lang.ref.WeakReference;
import java.util.Stack;

/* renamed from: com.ss.android.lark.base.a.b */
public class C29521b {

    /* renamed from: a */
    public AbstractC29524c f73806a;

    /* renamed from: b */
    public Stack<AbstractC29524c> f73807b = new Stack<>();

    /* renamed from: c */
    private FragmentActivity f73808c;

    /* renamed from: d */
    private AbstractC29523a f73809d;

    /* renamed from: e */
    private SparseArray<AbstractC29524c> f73810e;

    /* renamed from: f */
    private WeakReference<C29520a> f73811f;

    /* renamed from: com.ss.android.lark.base.a.b$a */
    public interface AbstractC29523a {
        void onShowPageChanged(AbstractC29524c cVar);
    }

    /* renamed from: a */
    public boolean mo104608a() {
        return mo104609a(true);
    }

    /* renamed from: b */
    public Fragment mo104610b() {
        FragmentManager supportFragmentManager = this.f73808c.getSupportFragmentManager();
        int size = this.f73807b.size();
        if (size > 1) {
            return supportFragmentManager.findFragmentByTag(this.f73807b.get(size - 2).mo104616b());
        }
        return null;
    }

    /* renamed from: a */
    public void mo104605a(final Intent intent) {
        final AbstractC29524c cVar;
        try {
            final AbstractC29524c cVar2 = this.f73810e.get(intent.getIntExtra("open_fragment_id", this.f73806a.mo104613a()));
            if (this.f73807b.size() > 0) {
                cVar = this.f73807b.peek();
            } else {
                cVar = null;
            }
            if (cVar2 == this.f73806a) {
                this.f73807b.clear();
            }
            cVar2.mo104615a(intent, new IGetDataCallback<Bundle>() {
                /* class com.ss.android.lark.base.p1400a.C29521b.C295221 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("routePage", errorResult.toString());
                    intent.putExtra("open_fragment_id", C29521b.this.f73806a.mo104613a());
                    C29521b.this.mo104605a(intent);
                }

                /* renamed from: a */
                public void onSuccess(Bundle bundle) {
                    boolean z;
                    boolean z2 = true;
                    if (bundle != null) {
                        intent.putExtras(bundle);
                        z = bundle.getBoolean("key_need_redirect", true);
                        Log.m165389i("FrameManager", "routePage needRedirect: " + z);
                    } else {
                        z = true;
                    }
                    if (!C29521b.this.f73807b.isEmpty() && C29521b.this.f73807b.peek() == C29521b.this.f73806a) {
                        z2 = false;
                    } else if (cVar2 != C29521b.this.f73806a) {
                        intent.putExtra("open_fragment_id", C29521b.this.f73806a.mo104613a());
                        C29521b.this.mo104605a(intent);
                        Log.m165389i("FrameManager", "routePage default: " + C29521b.this.f73806a.mo104616b());
                        return;
                    } else {
                        Log.m165389i("FrameManager", "routePage needRefresh");
                    }
                    if (!z && !z2) {
                        return;
                    }
                    if (cVar != cVar2) {
                        Log.m165389i("FrameManager", "routePage next: " + cVar2.mo104616b());
                        C29521b.this.mo104607a(intent, cVar, cVar2);
                        C29521b.this.f73807b.push(cVar2);
                        return;
                    }
                    Log.m165389i("FrameManager", "routePage refresh: " + cVar2.mo104616b());
                    C29521b.this.mo104606a(intent, cVar);
                    if (C29521b.this.f73807b.isEmpty()) {
                        C29521b.this.f73807b.push(cVar);
                    }
                }
            });
        } catch (Exception e) {
            Log.m165383e("FrameManager", "routePage" + e.getMessage());
        }
    }

    /* renamed from: a */
    public boolean mo104609a(boolean z) {
        FragmentManager supportFragmentManager = this.f73808c.getSupportFragmentManager();
        AbstractC29524c peek = this.f73807b.peek();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(peek.mo104616b());
        if (findFragmentByTag == null || !findFragmentByTag.isVisible()) {
            this.f73807b.pop();
            return true;
        } else if (((C29520a) findFragmentByTag).mo104599a()) {
            return true;
        } else {
            if (this.f73807b.size() <= 1 && this.f73807b.peek() == this.f73806a) {
                return false;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("switch_fragment_with_anim", z);
            this.f73807b.pop();
            AbstractC29524c cVar = this.f73806a;
            if (!this.f73807b.isEmpty()) {
                cVar = this.f73807b.peek();
            }
            m108744a(bundle, peek, cVar);
            return true;
        }
    }

    /* renamed from: a */
    public void mo104606a(Intent intent, AbstractC29524c cVar) {
        String str;
        FragmentManager supportFragmentManager = this.f73808c.getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        if (cVar == null) {
            str = "";
        } else {
            str = cVar.mo104616b();
        }
        C29520a aVar = (C29520a) supportFragmentManager.findFragmentByTag(str);
        if (intent != null && intent.getBooleanExtra("switch_fragment_with_anim", false)) {
            intent.removeExtra("switch_fragment_with_anim");
        }
        if (aVar != null) {
            aVar.onPause();
            aVar.onStop();
            aVar.mo104601b();
            aVar.setArguments(intent.getExtras());
            aVar.mo104596a(intent);
            aVar.onStart();
            aVar.onResume();
        } else {
            WeakReference<C29520a> weakReference = this.f73811f;
            if (!(weakReference == null || weakReference.get() == null)) {
                aVar = this.f73811f.get();
                aVar.setArguments(intent.getExtras());
            }
            if (aVar == null) {
                aVar = cVar.mo104614a(intent.getExtras(), this);
                beginTransaction.add(16908290, aVar, cVar.mo104616b());
                beginTransaction.commitAllowingStateLoss();
            }
        }
        Bundle arguments = aVar.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            aVar.setArguments(arguments);
        }
        arguments.putString("fragment_switch_from", str);
        AbstractC29523a aVar2 = this.f73809d;
        if (aVar2 != null) {
            aVar2.onShowPageChanged(cVar);
        }
    }

    /* renamed from: a */
    private void m108745a(FragmentTransaction fragmentTransaction, AbstractC29524c cVar, AbstractC29524c cVar2) {
        if (cVar != null && cVar2 != null) {
            fragmentTransaction.setCustomAnimations(cVar.mo104617c(), cVar2.mo104618d());
        }
    }

    /* renamed from: a */
    public void mo104604a(int i, int i2, Intent intent) {
        FragmentManager supportFragmentManager = this.f73808c.getSupportFragmentManager();
        for (int i3 = 0; i3 < this.f73810e.size(); i3++) {
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(this.f73810e.valueAt(i3).mo104616b());
            if (findFragmentByTag != null && findFragmentByTag.isVisible()) {
                findFragmentByTag.onActivityResult(i, i2, intent);
            }
        }
    }

    /* renamed from: a */
    private void m108744a(Bundle bundle, AbstractC29524c cVar, AbstractC29524c cVar2) {
        boolean z = false;
        if (bundle != null && bundle.getBoolean("switch_fragment_with_anim", false)) {
            z = true;
        }
        FragmentManager supportFragmentManager = this.f73808c.getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        if (z) {
            m108745a(beginTransaction, cVar, cVar2);
        }
        C29520a aVar = (C29520a) supportFragmentManager.findFragmentByTag(cVar.mo104616b());
        if (aVar != null) {
            beginTransaction.hide(aVar);
        }
        C29520a aVar2 = (C29520a) supportFragmentManager.findFragmentByTag(cVar2.mo104616b());
        if (aVar2 != null) {
            beginTransaction.show(aVar2);
        } else {
            aVar2 = cVar2.mo104614a(bundle, this);
            beginTransaction.add(16908290, aVar2, cVar2.mo104616b());
        }
        Bundle arguments = aVar2.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            aVar2.setArguments(arguments);
        }
        arguments.putString("fragment_switch_from", cVar.mo104616b());
        if (cVar2 != null && (this.f73807b.isEmpty() || this.f73807b.peek() != cVar2)) {
            this.f73807b.push(cVar2);
        }
        AbstractC29523a aVar3 = this.f73809d;
        if (aVar3 != null) {
            aVar3.onShowPageChanged(cVar2);
        }
        beginTransaction.commitAllowingStateLoss();
    }

    /* renamed from: a */
    public void mo104607a(Intent intent, AbstractC29524c cVar, AbstractC29524c cVar2) {
        String str;
        boolean z = true;
        boolean z2 = false;
        if (intent != null) {
            z2 = intent.getBooleanExtra("switch_fragment_with_anim", false);
            z = intent.getBooleanExtra("fragment_hide_pre_page", true);
        }
        FragmentManager supportFragmentManager = this.f73808c.getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        C29520a aVar = (C29520a) supportFragmentManager.findFragmentByTag(cVar2.mo104616b());
        if (aVar != null) {
            try {
                aVar.setArguments(intent.getExtras());
            } catch (Exception unused) {
                return;
            }
        }
        if (z2) {
            m108745a(beginTransaction, cVar, cVar2);
        }
        if (cVar == null) {
            str = "";
        } else {
            str = cVar.mo104616b();
        }
        C29520a aVar2 = (C29520a) supportFragmentManager.findFragmentByTag(str);
        if (aVar2 != null && z) {
            beginTransaction.hide(aVar2);
        }
        if (aVar != null) {
            aVar.setArguments(intent.getExtras());
            aVar.mo104596a(intent);
            beginTransaction.show(aVar);
        } else {
            aVar = cVar2.mo104614a(intent.getExtras(), this);
            beginTransaction.add(16908290, aVar, cVar2.mo104616b());
        }
        this.f73811f = new WeakReference<>(aVar);
        Bundle arguments = aVar.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            aVar.setArguments(arguments);
        }
        arguments.putString("fragment_switch_from", str);
        AbstractC29523a aVar3 = this.f73809d;
        if (aVar3 != null) {
            aVar3.onShowPageChanged(cVar2);
        }
        beginTransaction.commitAllowingStateLoss();
    }

    public C29521b(FragmentActivity fragmentActivity, AbstractC29523a aVar, SparseArray<AbstractC29524c> sparseArray, int i) {
        this.f73808c = fragmentActivity;
        this.f73810e = sparseArray;
        this.f73809d = aVar;
        this.f73806a = sparseArray.get(i);
    }
}
