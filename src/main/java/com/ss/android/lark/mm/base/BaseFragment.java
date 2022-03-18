package com.ss.android.lark.mm.base;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.mm.utils.p2335a.C47096b;
import io.reactivex.disposables.C68289a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\tH\u0016J\b\u0010\u0019\u001a\u00020\u000fH\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0016J\u0012\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010$\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\tH\u0014J\u0010\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006)"}, d2 = {"Lcom/ss/android/lark/mm/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnAttachStateChangeListener;", "()V", "comDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getComDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "currentVisible", "", "timerExecutor", "Lcom/ss/android/lark/mm/utils/timer/MmTimerExecutor;", "getTimerExecutor", "()Lcom/ss/android/lark/mm/utils/timer/MmTimerExecutor;", "checkVisibility", "", "expected", "onAttach", "context", "Landroid/content/Context;", "onDestroy", "onDestroyView", "onDetach", "onHiddenChanged", "hidden", "onPause", "onResume", "onStart", "onStop", "onViewAttachedToWindow", "v", "Landroid/view/View;", "onViewCreated", "view", "savedInstanceState", "Landroid/os/Bundle;", "onViewDetachedFromWindow", "onVisibilityChanged", "visible", "setUserVisibleHint", "isVisibleToUser", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.base.a */
public class BaseFragment extends Fragment implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    private boolean f115686a;

    /* renamed from: b */
    private final C68289a f115687b = new C68289a();

    /* renamed from: c */
    private final C47096b f115688c = new C47096b();

    /* renamed from: d */
    private HashMap f115689d;

    /* renamed from: a */
    public View mo161166a(int i) {
        if (this.f115689d == null) {
            this.f115689d = new HashMap();
        }
        View view = (View) this.f115689d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f115689d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo161168a(boolean z) {
    }

    /* renamed from: c */
    public void mo161170c() {
        HashMap hashMap = this.f115689d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C68289a mo161167a() {
        return this.f115687b;
    }

    /* renamed from: b */
    public final C47096b mo161169b() {
        return this.f115688c;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        mo162053b(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        mo162053b(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        mo162053b(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f115688c.mo165476c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f115687b.dispose();
        super.onDestroyView();
        mo161170c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f115688c.mo165478d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f115688c.mo165480e();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        mo162053b(z);
    }

    public void onViewAttachedToWindow(View view) {
        mo162053b(true);
    }

    public void onViewDetachedFromWindow(View view) {
        mo162053b(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        mo162053b(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        super.onAttach(context);
        mo162053b(true);
    }

    /* renamed from: b */
    private final void mo162053b(boolean z) {
        boolean z2;
        if (z != this.f115686a) {
            if (!isVisible() || !getUserVisibleHint()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 != this.f115686a) {
                this.f115686a = z2;
                mo161168a(z2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        view.addOnAttachStateChangeListener(this);
    }
}
