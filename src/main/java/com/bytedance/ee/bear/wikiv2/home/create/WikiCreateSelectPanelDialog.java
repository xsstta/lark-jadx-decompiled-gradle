package com.bytedance.ee.bear.wikiv2.home.create;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.wikiv2.home.create.WikiCreateSelectView;
import com.google.android.material.bottomsheet.C22184b;
import com.google.android.material.bottomsheet.DialogC22179a;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 #2\u00020\u0001:\u0003#$%B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u000e\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006&"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectPanelDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "mTag", "", "getMTag", "()Ljava/lang/String;", "setMTag", "(Ljava/lang/String;)V", "viewModel", "Lcom/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectPanelDialog$_ViewModel;", "getViewModel", "()Lcom/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectPanelDialog$_ViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindListener", "", "bindView", "initView", "isShowing", "", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setCanCreate", "canCreate", "Companion", "ViewDelegate", "_ViewModel", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.home.create.b */
public final class WikiCreateSelectPanelDialog extends C22184b {

    /* renamed from: c */
    static final /* synthetic */ KProperty[] f32985c = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(WikiCreateSelectPanelDialog.class), "viewModel", "getViewModel()Lcom/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectPanelDialog$_ViewModel;"))};

    /* renamed from: d */
    public static final Companion f32986d = new Companion(null);

    /* renamed from: e */
    private final Lazy f32987e = LazyKt.lazy(new C12285f(this));

    /* renamed from: f */
    private String f32988f;

    /* renamed from: g */
    private HashMap f32989g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectPanelDialog$ViewDelegate;", "", "onSelected", "", "indexId", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.create.b$b */
    public interface ViewDelegate {
        void onSelected(int i);
    }

    @JvmStatic
    /* renamed from: a */
    public static final WikiCreateSelectPanelDialog m51145a(FragmentActivity fragmentActivity, ViewDelegate bVar) {
        return Companion.m51157a(f32986d, fragmentActivity, bVar, false, 4, null);
    }

    /* renamed from: j */
    private final void m51146j() {
    }

    /* renamed from: a */
    public View mo46863a(int i) {
        if (this.f32989g == null) {
            this.f32989g = new HashMap();
        }
        View view = (View) this.f32989g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f32989g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: f */
    public final _ViewModel mo46865f() {
        Lazy lazy = this.f32987e;
        KProperty kProperty = f32985c[0];
        return (_ViewModel) lazy.getValue();
    }

    /* renamed from: i */
    public void mo46868i() {
        HashMap hashMap = this.f32989g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo46868i();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectPanelDialog$Companion;", "", "()V", "TAG", "", "show", "Lcom/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectPanelDialog;", "context", "Landroidx/fragment/app/FragmentActivity;", "delegate", "Lcom/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectPanelDialog$ViewDelegate;", "canCreate", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.create.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final WikiCreateSelectPanelDialog mo46869a(FragmentActivity fragmentActivity, ViewDelegate bVar, boolean z) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "context");
            _ViewModel cVar = (_ViewModel) aj.m5366a(fragmentActivity).mo6005a(_ViewModel.class);
            cVar.setDelegate(bVar);
            cVar.getCanCreateDoc().mo5929b(Boolean.valueOf(z));
            Fragment instantiate = Fragment.instantiate(fragmentActivity, WikiCreateSelectPanelDialog.class.getName());
            if (instantiate != null) {
                WikiCreateSelectPanelDialog bVar2 = (WikiCreateSelectPanelDialog) instantiate;
                bVar2.mo5511a(fragmentActivity.getSupportFragmentManager(), WikiCreateSelectPanelDialog.class.getName());
                return bVar2;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.wikiv2.home.create.WikiCreateSelectPanelDialog");
        }

        /* renamed from: a */
        public static /* synthetic */ WikiCreateSelectPanelDialog m51157a(Companion aVar, FragmentActivity fragmentActivity, ViewDelegate bVar, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = true;
            }
            return aVar.mo46869a(fragmentActivity, bVar, z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectPanelDialog$_ViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "canCreateDoc", "Landroidx/lifecycle/MutableLiveData;", "", "getCanCreateDoc", "()Landroidx/lifecycle/MutableLiveData;", "setCanCreateDoc", "(Landroidx/lifecycle/MutableLiveData;)V", "delegate", "Lcom/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectPanelDialog$ViewDelegate;", "getDelegate", "()Lcom/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectPanelDialog$ViewDelegate;", "setDelegate", "(Lcom/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectPanelDialog$ViewDelegate;)V", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.create.b$c */
    public static final class _ViewModel extends AbstractC1142af {
        private C1177w<Boolean> canCreateDoc = new C1177w<>();
        private ViewDelegate delegate;

        public final C1177w<Boolean> getCanCreateDoc() {
            return this.canCreateDoc;
        }

        public final ViewDelegate getDelegate() {
            return this.delegate;
        }

        public final void setDelegate(ViewDelegate bVar) {
            this.delegate = bVar;
        }

        public final void setCanCreateDoc(C1177w<Boolean> wVar) {
            Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
            this.canCreateDoc = wVar;
        }
    }

    /* renamed from: h */
    public final String mo46867h() {
        return this.f32988f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectPanelDialog$bindListener$1", "Lcom/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectView$ViewDelegate;", "onCancelClick", "", "onSelected", "indexId", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.create.b$d */
    public static final class C12283d implements WikiCreateSelectView.ViewDelegate {

        /* renamed from: a */
        final /* synthetic */ WikiCreateSelectPanelDialog f32990a;

        @Override // com.bytedance.ee.bear.wikiv2.home.create.WikiCreateSelectView.ViewDelegate
        /* renamed from: a */
        public void mo46861a() {
            this.f32990a.mo5513b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12283d(WikiCreateSelectPanelDialog bVar) {
            this.f32990a = bVar;
        }

        @Override // com.bytedance.ee.bear.wikiv2.home.create.WikiCreateSelectView.ViewDelegate
        /* renamed from: a */
        public void mo46862a(int i) {
            ViewDelegate delegate;
            this.f32990a.mo5513b();
            _ViewModel f = this.f32990a.mo46865f();
            if (f != null && (delegate = f.getDelegate()) != null) {
                delegate.onSelected(i);
            }
        }
    }

    /* renamed from: g */
    public final boolean mo46866g() {
        Dialog v_ = v_();
        if (v_ == null || !v_.isShowing()) {
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectPanelDialog$_ViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.create.b$f */
    static final class C12285f extends Lambda implements Function0<_ViewModel> {
        final /* synthetic */ WikiCreateSelectPanelDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12285f(WikiCreateSelectPanelDialog bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final _ViewModel invoke() {
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null) {
                return (_ViewModel) aj.m5366a(activity).mo6005a(_ViewModel.class);
            }
            return null;
        }
    }

    /* renamed from: k */
    private final void m51147k() {
        C1177w<Boolean> canCreateDoc;
        _ViewModel f = mo46865f();
        if (f != null && (canCreateDoc = f.getCanCreateDoc()) != null) {
            canCreateDoc.mo5923a(this, new C12284e(this));
        }
    }

    /* renamed from: l */
    private final void m51148l() {
        ((WikiCreateSelectView) mo46863a(R.id.create_select_view)).setDelegate(new C12283d(this));
    }

    /* renamed from: a */
    public final void mo46864a(String str) {
        this.f32988f = str;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "canCreate", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.create.b$e */
    public static final class C12284e<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ WikiCreateSelectPanelDialog f32991a;

        C12284e(WikiCreateSelectPanelDialog bVar) {
            this.f32991a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "canCreate");
            ((WikiCreateSelectView) this.f32991a.mo46863a(R.id.create_select_view)).setEnable(bool.booleanValue());
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.appcompat.app.C0261c, com.google.android.material.bottomsheet.C22184b
    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        if (getContext() != null) {
            return new DialogC22179a(requireContext(), R.style.WikiTransparentBottomSheetStyleV2);
        }
        Dialog a = super.mo946a(bundle);
        Intrinsics.checkExpressionValueIsNotNull(a, "super.onCreateDialog(savedInstanceState)");
        return a;
    }

    /* renamed from: c */
    public final void mo38116c(boolean z) {
        _ViewModel f;
        C1177w<Boolean> canCreateDoc;
        if (mo46866g() && (f = mo46865f()) != null && (canCreateDoc = f.getCanCreateDoc()) != null) {
            canCreateDoc.mo5929b(Boolean.valueOf(z));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m51146j();
        m51147k();
        m51148l();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.wiki_create_select_layout_v2, viewGroup, false);
    }
}
