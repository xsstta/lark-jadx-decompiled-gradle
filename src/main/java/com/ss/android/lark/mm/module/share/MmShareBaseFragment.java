package com.ss.android.lark.mm.module.share;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.base.BaseFragment;
import com.ss.android.lark.mm.base.IFragmentManager;
import com.ss.android.lark.mm.module.share.invite.BaseAction;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0015\u001a\u00020\u0007H\u0014J\b\u0010\u0016\u001a\u00020\u0017H\u0014J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0017H\u0016J\u001a\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lcom/ss/android/lark/mm/module/share/MmShareBaseFragment;", "Lcom/ss/android/lark/mm/base/BaseFragment;", "repoId", "", "manager", "Lcom/ss/android/lark/mm/base/IFragmentManager;", "fromSource", "", "(Ljava/lang/String;Lcom/ss/android/lark/mm/base/IFragmentManager;I)V", "action", "Lcom/ss/android/lark/mm/module/share/invite/BaseAction;", "getAction", "()Lcom/ss/android/lark/mm/module/share/invite/BaseAction;", "setAction", "(Lcom/ss/android/lark/mm/module/share/invite/BaseAction;)V", "getFromSource", "()I", "getManager", "()Lcom/ss/android/lark/mm/base/IFragmentManager;", "getRepoId", "()Ljava/lang/String;", "getLayoutRes", "init", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.share.a */
public class MmShareBaseFragment extends BaseFragment {

    /* renamed from: a */
    private BaseAction f118249a;

    /* renamed from: b */
    private final String f118250b;

    /* renamed from: c */
    private final IFragmentManager f118251c;

    /* renamed from: d */
    private final int f118252d;

    /* renamed from: e */
    private HashMap f118253e;

    @Override // com.ss.android.lark.mm.base.BaseFragment
    /* renamed from: a */
    public View mo161166a(int i) {
        if (this.f118253e == null) {
            this.f118253e = new HashMap();
        }
        View view = (View) this.f118253e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f118253e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.base.BaseFragment
    /* renamed from: c */
    public void mo161170c() {
        HashMap hashMap = this.f118253e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo163507d() {
        return R.layout.mm_fragment_base;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo163508e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final BaseAction mo164951h() {
        return this.f118249a;
    }

    /* renamed from: i */
    public final String mo164952i() {
        return this.f118250b;
    }

    /* renamed from: j */
    public final IFragmentManager mo164953j() {
        return this.f118251c;
    }

    /* renamed from: k */
    public final int mo164954k() {
        return this.f118252d;
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment
    public void onDestroyView() {
        super.onDestroyView();
        mo161170c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo164950a(BaseAction baseAction) {
        this.f118249a = baseAction;
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        view.setOnClickListener(null);
        mo163508e();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(mo163507d(), viewGroup, false);
    }

    public MmShareBaseFragment(String str, IFragmentManager bVar, int i) {
        Intrinsics.checkParameterIsNotNull(str, "repoId");
        Intrinsics.checkParameterIsNotNull(bVar, "manager");
        this.f118250b = str;
        this.f118251c = bVar;
        this.f118252d = i;
    }
}
