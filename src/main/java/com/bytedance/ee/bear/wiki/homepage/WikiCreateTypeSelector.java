package com.bytedance.ee.bear.wiki.homepage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.C13655e;
import com.google.android.material.bottomsheet.C22184b;
import com.google.android.material.bottomsheet.DialogC22179a;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001d\u001e\u001fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u001c\u001a\u00020\nH\u0002R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006 "}, d2 = {"Lcom/bytedance/ee/bear/wiki/homepage/WikiCreateTypeSelector;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "viewModel", "Lcom/bytedance/ee/bear/wiki/homepage/WikiCreateTypeSelector$_ViewModel;", "getViewModel", "()Lcom/bytedance/ee/bear/wiki/homepage/WikiCreateTypeSelector$_ViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindListener", "", "bindView", "callbackResultHandle", "documentType", "", "getVisibleCount", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "resetViewWidth", "Companion", "SelectorResultHandler", "_ViewModel", "wiki-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wiki.homepage.a */
public final class WikiCreateTypeSelector extends C22184b {

    /* renamed from: c */
    static final /* synthetic */ KProperty[] f32332c = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(WikiCreateTypeSelector.class), "viewModel", "getViewModel()Lcom/bytedance/ee/bear/wiki/homepage/WikiCreateTypeSelector$_ViewModel;"))};

    /* renamed from: d */
    public static final Companion f32333d = new Companion(null);

    /* renamed from: e */
    private final Lazy f32334e = LazyKt.lazy(new C11966j(this));

    /* renamed from: f */
    private HashMap f32335f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/wiki/homepage/WikiCreateTypeSelector$SelectorResultHandler;", "", "onCreateTypeSelected", "", "documentType", "", ShareHitPoint.f121868c, "", "wiki-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wiki.homepage.a$b */
    public interface SelectorResultHandler {
        void onCreateTypeSelected(int i, String str);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m49553a(C10917c cVar, FragmentActivity fragmentActivity, SelectorResultHandler bVar) {
        f32333d.mo45907a(cVar, fragmentActivity, bVar);
    }

    /* renamed from: g */
    private final _ViewModel m49554g() {
        Lazy lazy = this.f32334e;
        KProperty kProperty = f32332c[0];
        return (_ViewModel) lazy.getValue();
    }

    /* renamed from: b */
    public View mo45905b(int i) {
        if (this.f32335f == null) {
            this.f32335f = new HashMap();
        }
        View view = (View) this.f32335f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f32335f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: f */
    public void mo45906f() {
        HashMap hashMap = this.f32335f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo45906f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/wiki/homepage/WikiCreateTypeSelector$Companion;", "", "()V", "TAG", "", "selectCreateType", "", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "context", "Landroidx/fragment/app/FragmentActivity;", "resultHandler", "Lcom/bytedance/ee/bear/wiki/homepage/WikiCreateTypeSelector$SelectorResultHandler;", "wiki-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wiki.homepage.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo45907a(C10917c cVar, FragmentActivity fragmentActivity, SelectorResultHandler bVar) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "context");
            ((_ViewModel) aj.m5366a(fragmentActivity).mo6005a(_ViewModel.class)).setResultHandler(bVar);
            Fragment instantiate = Fragment.instantiate(fragmentActivity, WikiCreateTypeSelector.class.getName());
            if (instantiate != null) {
                ((WikiCreateTypeSelector) instantiate).mo5511a(fragmentActivity.getSupportFragmentManager(), WikiCreateTypeSelector.class.getName());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.wiki.homepage.WikiCreateTypeSelector");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/wiki/homepage/WikiCreateTypeSelector$_ViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "resultHandler", "Lcom/bytedance/ee/bear/wiki/homepage/WikiCreateTypeSelector$SelectorResultHandler;", "getResultHandler", "()Lcom/bytedance/ee/bear/wiki/homepage/WikiCreateTypeSelector$SelectorResultHandler;", "setResultHandler", "(Lcom/bytedance/ee/bear/wiki/homepage/WikiCreateTypeSelector$SelectorResultHandler;)V", "wiki-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wiki.homepage.a$c */
    public static final class _ViewModel extends AbstractC1142af {
        private SelectorResultHandler resultHandler;

        public final SelectorResultHandler getResultHandler() {
            return this.resultHandler;
        }

        public final void setResultHandler(SelectorResultHandler bVar) {
            this.resultHandler = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/wiki/homepage/WikiCreateTypeSelector$_ViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wiki.homepage.a$j */
    static final class C11966j extends Lambda implements Function0<_ViewModel> {
        final /* synthetic */ WikiCreateTypeSelector this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11966j(WikiCreateTypeSelector aVar) {
            super(0);
            this.this$0 = aVar;
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

    /* renamed from: j */
    private final int m49557j() {
        LinearLayout linearLayout = (LinearLayout) mo45905b(R.id.content_layout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "content_layout");
        int childCount = linearLayout.getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = ((LinearLayout) mo45905b(R.id.content_layout)).getChildAt(i2);
            if (childAt != null && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: i */
    private final void m49556i() {
        int b = C13655e.m55415b(getContext());
        int a = (b - C13655e.m55411a(32)) / 4;
        if (b > 0 && a > 0) {
            TextView textView = (TextView) mo45905b(R.id.select_sheet);
            Intrinsics.checkExpressionValueIsNotNull(textView, "select_sheet");
            textView.getLayoutParams().width = a;
            TextView textView2 = (TextView) mo45905b(R.id.select_mindnote);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "select_mindnote");
            textView2.getLayoutParams().width = a;
            TextView textView3 = (TextView) mo45905b(R.id.select_doc);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "select_doc");
            textView3.getLayoutParams().width = a;
            TextView textView4 = (TextView) mo45905b(R.id.select_docx);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "select_docx");
            textView4.getLayoutParams().width = a;
            TextView textView5 = (TextView) mo45905b(R.id.select_doc_sec);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "select_doc_sec");
            textView5.getLayoutParams().width = a;
        }
    }

    /* renamed from: h */
    private final void m49555h() {
        int i;
        int i2;
        int i3;
        TextView textView = (TextView) mo45905b(R.id.select_sheet);
        Intrinsics.checkExpressionValueIsNotNull(textView, "select_sheet");
        int i4 = 0;
        textView.setVisibility(0);
        TextView textView2 = (TextView) mo45905b(R.id.select_mindnote);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "select_mindnote");
        if (C11970b.m49572a()) {
            i = 0;
        } else {
            i = 8;
        }
        textView2.setVisibility(i);
        TextView textView3 = (TextView) mo45905b(R.id.select_docx);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "select_docx");
        if (C11970b.m49575c()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView3.setVisibility(i2);
        TextView textView4 = (TextView) mo45905b(R.id.select_doc);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "select_doc");
        if (C11970b.m49575c() || C11970b.m49576d()) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        textView4.setVisibility(i3);
        TextView textView5 = (TextView) mo45905b(R.id.select_doc_sec);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "select_doc_sec");
        if (!C11970b.m49575c() || C11970b.m49576d()) {
            i4 = 8;
        }
        textView5.setVisibility(i4);
        if (m49557j() > 3) {
            m49556i();
        }
    }

    /* renamed from: k */
    private final void m49558k() {
        TextView textView = (TextView) mo45905b(R.id.select_docx);
        Intrinsics.checkExpressionValueIsNotNull(textView, "select_docx");
        if (textView.getVisibility() == 0) {
            ((TextView) mo45905b(R.id.select_docx)).setOnClickListener(new C11960d(this));
        }
        TextView textView2 = (TextView) mo45905b(R.id.select_doc);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "select_doc");
        if (textView2.getVisibility() == 0) {
            ((TextView) mo45905b(R.id.select_doc)).setOnClickListener(new C11961e(this));
        }
        TextView textView3 = (TextView) mo45905b(R.id.select_doc_sec);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "select_doc_sec");
        if (textView3.getVisibility() == 0) {
            ((TextView) mo45905b(R.id.select_doc_sec)).setOnClickListener(new C11962f(this));
        }
        TextView textView4 = (TextView) mo45905b(R.id.select_sheet);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "select_sheet");
        if (textView4.getVisibility() == 0) {
            ((TextView) mo45905b(R.id.select_sheet)).setOnClickListener(new C11963g(this));
        }
        TextView textView5 = (TextView) mo45905b(R.id.select_mindnote);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "select_mindnote");
        if (textView5.getVisibility() == 0) {
            ((TextView) mo45905b(R.id.select_mindnote)).setOnClickListener(new C11964h(this));
        }
        ((TextView) mo45905b(R.id.cancel)).setOnClickListener(new C11965i(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/wiki/homepage/WikiCreateTypeSelector$bindListener$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "wiki-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wiki.homepage.a$d */
    public static final class C11960d extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ WikiCreateTypeSelector f32336a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11960d(WikiCreateTypeSelector aVar) {
            this.f32336a = aVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            this.f32336a.mo45904a(22);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/wiki/homepage/WikiCreateTypeSelector$bindListener$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "wiki-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wiki.homepage.a$e */
    public static final class C11961e extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ WikiCreateTypeSelector f32337a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11961e(WikiCreateTypeSelector aVar) {
            this.f32337a = aVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            this.f32337a.mo45904a(2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/wiki/homepage/WikiCreateTypeSelector$bindListener$3", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "wiki-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wiki.homepage.a$f */
    public static final class C11962f extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ WikiCreateTypeSelector f32338a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11962f(WikiCreateTypeSelector aVar) {
            this.f32338a = aVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            this.f32338a.mo45904a(2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/wiki/homepage/WikiCreateTypeSelector$bindListener$4", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "wiki-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wiki.homepage.a$g */
    public static final class C11963g extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ WikiCreateTypeSelector f32339a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11963g(WikiCreateTypeSelector aVar) {
            this.f32339a = aVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            this.f32339a.mo45904a(3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/wiki/homepage/WikiCreateTypeSelector$bindListener$5", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "wiki-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wiki.homepage.a$h */
    public static final class C11964h extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ WikiCreateTypeSelector f32340a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11964h(WikiCreateTypeSelector aVar) {
            this.f32340a = aVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            this.f32340a.mo45904a(11);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/wiki/homepage/WikiCreateTypeSelector$bindListener$6", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "wiki-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wiki.homepage.a$i */
    public static final class C11965i extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ WikiCreateTypeSelector f32341a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11965i(WikiCreateTypeSelector aVar) {
            this.f32341a = aVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            this.f32341a.mo5513b();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.appcompat.app.C0261c, com.google.android.material.bottomsheet.C22184b
    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        if (getContext() != null) {
            return new DialogC22179a(requireContext(), R.style.WikiTransparentBottomSheetStyle);
        }
        Dialog a = super.mo946a(bundle);
        Intrinsics.checkExpressionValueIsNotNull(a, "super.onCreateDialog(savedInstanceState)");
        return a;
    }

    /* renamed from: a */
    public final void mo45904a(int i) {
        SelectorResultHandler resultHandler;
        mo5513b();
        _ViewModel g = m49554g();
        if (g != null && (resultHandler = g.getResultHandler()) != null) {
            resultHandler.onCreateTypeSelected(i, "wiki_recent");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m49555h();
        m49558k();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.wiki_create_select_layout, viewGroup, false);
    }
}
