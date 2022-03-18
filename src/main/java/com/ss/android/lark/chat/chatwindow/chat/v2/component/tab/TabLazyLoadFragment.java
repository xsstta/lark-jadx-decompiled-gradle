package com.ss.android.lark.chat.chatwindow.chat.v2.component.tab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.lark.base.fragment.BaseFragment;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000fH&J\u0006\u0010\u001a\u001a\u00020\u0004J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\u0012\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017H\u0014J$\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0015H\u0016J\b\u0010\"\u001a\u00020\u0015H\u0014J\b\u0010#\u001a\u00020\u0015H\u0014J\b\u0010$\u001a\u00020\u0015H\u0016J\b\u0010%\u001a\u00020\u0015H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006'"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/TabLazyLoadFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mIsContentViewCreated", "", "mIsDestroyed", "mIsNeedLazyLoad", "getMIsNeedLazyLoad", "()Z", "setMIsNeedLazyLoad", "(Z)V", "mIsPageShowing", "mLayoutInflater", "Landroid/view/LayoutInflater;", "mRootView", "Landroid/view/ViewGroup;", "getMRootView", "()Landroid/view/ViewGroup;", "setMRootView", "(Landroid/view/ViewGroup;)V", "destroy", "", "getContentView", "Landroid/view/View;", "inflater", "container", "isPageShow", "loadContentView", "onContentViewCreated", "root", "onCreateView", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onPageHide", "onPageShow", "onPause", "onResume", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.i */
public abstract class TabLazyLoadFragment extends BaseFragment {

    /* renamed from: a */
    public static final Companion f86803a = new Companion(null);

    /* renamed from: b */
    private boolean f86804b = true;

    /* renamed from: c */
    private boolean f86805c;

    /* renamed from: d */
    private boolean f86806d;

    /* renamed from: e */
    private boolean f86807e;

    /* renamed from: f */
    private LayoutInflater f86808f;

    /* renamed from: g */
    private ViewGroup f86809g;

    /* renamed from: h */
    private HashMap f86810h;

    /* renamed from: a */
    public abstract View mo123584a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo123609a(View view) {
    }

    /* renamed from: f */
    public void mo123585f() {
        HashMap hashMap = this.f86810h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo123586m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo123587n() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo123631o() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/TabLazyLoadFragment$Companion;", "", "()V", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g */
    public boolean mo123629g() {
        return this.f86804b;
    }

    /* renamed from: i */
    public final ViewGroup mo123630i() {
        return this.f86809g;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (mo123629g()) {
            this.f86805c = false;
            mo123587n();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (!this.f86807e && this.f86806d) {
            mo123631o();
            this.f86806d = false;
            this.f86807e = true;
        }
        super.onDestroyView();
        mo123585f();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (mo123629g()) {
            if (!this.f86806d || this.f86807e) {
                mo123601a();
            }
            this.f86805c = true;
            mo123586m();
        }
    }

    /* renamed from: a */
    private final void mo123601a() {
        LayoutInflater layoutInflater = this.f86808f;
        if (layoutInflater == null) {
            Intrinsics.throwNpe();
        }
        View a = mo123584a(layoutInflater, this.f86809g);
        if (a != null) {
            ViewGroup viewGroup = this.f86809g;
            if (viewGroup == null) {
                Intrinsics.throwNpe();
            }
            viewGroup.addView(a, new FrameLayout.LayoutParams(-1, -1));
            mo123609a(this.f86809g);
            this.f86806d = true;
            this.f86807e = false;
            return;
        }
        throw new RuntimeException("getContentView can't be null");
    }

    /* renamed from: a */
    public void mo123628a(boolean z) {
        this.f86804b = z;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        this.f86808f = layoutInflater;
        this.f86809g = new FrameLayout(requireContext());
        if (!mo123629g()) {
            mo123601a();
        }
        ViewGroup viewGroup2 = this.f86809g;
        if (viewGroup2 == null) {
            Intrinsics.throwNpe();
        }
        return viewGroup2;
    }
}
