package com.ss.android.lark.mm.module.list.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.list.data.MmOwnerType;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.mm.widget.BaseDialog;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/mm/module/list/home/MmHomeFilterDialog;", "Lcom/ss/android/lark/mm/widget/BaseDialog;", "currentOwnerType", "Lcom/ss/android/lark/mm/module/list/data/MmOwnerType;", "(Lcom/ss/android/lark/mm/module/list/data/MmOwnerType;)V", "filterCallback", "Lkotlin/Function1;", "", "getFilterCallback", "()Lkotlin/jvm/functions/Function1;", "setFilterCallback", "(Lkotlin/jvm/functions/Function1;)V", "ownerType", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.list.a.a */
public final class MmHomeFilterDialog extends BaseDialog {

    /* renamed from: c */
    public MmOwnerType f116711c;

    /* renamed from: d */
    private Function1<? super MmOwnerType, Unit> f116712d;

    /* renamed from: e */
    private final MmOwnerType f116713e;

    /* renamed from: f */
    private HashMap f116714f;

    @Override // com.ss.android.lark.mm.widget.BaseDialog
    /* renamed from: a */
    public View mo142944a(int i) {
        if (this.f116714f == null) {
            this.f116714f = new HashMap();
        }
        View view = (View) this.f116714f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f116714f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.widget.BaseDialog
    /* renamed from: f */
    public void mo142945f() {
        HashMap hashMap = this.f116714f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.ss.android.lark.mm.widget.BaseDialog, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo142945f();
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.ss.android.lark.mm.module.list.data.MmOwnerType, kotlin.Unit>, kotlin.jvm.functions.Function1<com.ss.android.lark.mm.module.list.data.MmOwnerType, kotlin.Unit> */
    /* renamed from: g */
    public final Function1<MmOwnerType, Unit> mo162873g() {
        return this.f116712d;
    }

    /* renamed from: a */
    public final void mo162872a(Function1<? super MmOwnerType, Unit> function1) {
        this.f116712d = function1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.a.a$a */
    static final class C46326a extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MmHomeFilterDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46326a(MmHomeFilterDialog aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            C45855f.m181664c("MmHomeFilterDialog", "click cross icon");
            this.this$0.mo5513b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.a.a$b */
    static final class C46327b extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MmHomeFilterDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46327b(MmHomeFilterDialog aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            C45855f.m181664c("MmHomeFilterDialog", "click ownedByAnyoneTv");
            this.this$0.f116711c = MmOwnerType.OWNED_BY_ANYONE;
            TextView textView = (TextView) this.this$0.mo142944a(R.id.ownedByAnyoneTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "ownedByAnyoneTv");
            textView.setSelected(true);
            TextView textView2 = (TextView) this.this$0.mo142944a(R.id.myListTv);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "myListTv");
            textView2.setSelected(false);
            TextView textView3 = (TextView) this.this$0.mo142944a(R.id.sharedListTv);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "sharedListTv");
            textView3.setSelected(false);
            TextView textView4 = (TextView) this.this$0.mo142944a(R.id.resetBtn);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "resetBtn");
            textView4.setEnabled(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.a.a$c */
    static final class C46328c extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MmHomeFilterDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46328c(MmHomeFilterDialog aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            C45855f.m181664c("MmHomeFilterDialog", "click myListTv");
            this.this$0.f116711c = MmOwnerType.OWNED_BY_ME;
            TextView textView = (TextView) this.this$0.mo142944a(R.id.ownedByAnyoneTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "ownedByAnyoneTv");
            textView.setSelected(false);
            TextView textView2 = (TextView) this.this$0.mo142944a(R.id.myListTv);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "myListTv");
            textView2.setSelected(true);
            TextView textView3 = (TextView) this.this$0.mo142944a(R.id.sharedListTv);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "sharedListTv");
            textView3.setSelected(false);
            TextView textView4 = (TextView) this.this$0.mo142944a(R.id.resetBtn);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "resetBtn");
            textView4.setEnabled(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.a.a$d */
    static final class C46329d extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MmHomeFilterDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46329d(MmHomeFilterDialog aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            C45855f.m181664c("MmHomeFilterDialog", "click sharedListTv");
            this.this$0.f116711c = MmOwnerType.SHARED_WITH_ME;
            TextView textView = (TextView) this.this$0.mo142944a(R.id.ownedByAnyoneTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "ownedByAnyoneTv");
            textView.setSelected(false);
            TextView textView2 = (TextView) this.this$0.mo142944a(R.id.myListTv);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "myListTv");
            textView2.setSelected(false);
            TextView textView3 = (TextView) this.this$0.mo142944a(R.id.sharedListTv);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "sharedListTv");
            textView3.setSelected(true);
            TextView textView4 = (TextView) this.this$0.mo142944a(R.id.resetBtn);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "resetBtn");
            textView4.setEnabled(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.a.a$e */
    static final class C46330e extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MmHomeFilterDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46330e(MmHomeFilterDialog aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            C45855f.m181664c("MmHomeFilterDialog", "click resetBtn");
            ((TextView) this.this$0.mo142944a(R.id.ownedByAnyoneTv)).performClick();
            Function1<MmOwnerType, Unit> g = this.this$0.mo162873g();
            if (g != null) {
                g.invoke(this.this$0.f116711c);
            }
            this.this$0.mo5513b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.a.a$f */
    static final class C46331f extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MmHomeFilterDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46331f(MmHomeFilterDialog aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            C45855f.m181664c("MmHomeFilterDialog", "click confirmBtn");
            Function1<MmOwnerType, Unit> g = this.this$0.mo162873g();
            if (g != null) {
                g.invoke(this.this$0.f116711c);
            }
            this.this$0.mo5513b();
        }
    }

    public MmHomeFilterDialog(MmOwnerType mmOwnerType) {
        Intrinsics.checkParameterIsNotNull(mmOwnerType, "currentOwnerType");
        this.f116713e = mmOwnerType;
        this.f116711c = mmOwnerType;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) mo142944a(R.id.ownedByAnyoneTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "ownedByAnyoneTv");
        textView.setSelected(true);
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo142944a(R.id.crossIcon);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "crossIcon");
        C47110e.m186573a(appCompatImageView, new C46326a(this));
        TextView textView2 = (TextView) mo142944a(R.id.ownedByAnyoneTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "ownedByAnyoneTv");
        C47110e.m186573a(textView2, new C46327b(this));
        TextView textView3 = (TextView) mo142944a(R.id.myListTv);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "myListTv");
        C47110e.m186573a(textView3, new C46328c(this));
        TextView textView4 = (TextView) mo142944a(R.id.sharedListTv);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "sharedListTv");
        C47110e.m186573a(textView4, new C46329d(this));
        TextView textView5 = (TextView) mo142944a(R.id.resetBtn);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "resetBtn");
        C47110e.m186573a(textView5, new C46330e(this));
        TextView textView6 = (TextView) mo142944a(R.id.confirmBtn);
        Intrinsics.checkExpressionValueIsNotNull(textView6, "confirmBtn");
        C47110e.m186573a(textView6, new C46331f(this));
        int i = C46332b.f116715a[this.f116711c.ordinal()];
        if (i == 1) {
            ((TextView) mo142944a(R.id.ownedByAnyoneTv)).performClick();
        } else if (i == 2) {
            ((TextView) mo142944a(R.id.myListTv)).performClick();
        } else if (i == 3) {
            ((TextView) mo142944a(R.id.sharedListTv)).performClick();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.mm_home_list_filter_dialog, viewGroup, false);
    }
}
