package com.bytedance.ee.bear.edit.component.toolbar2.insertblock;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.model.toolbar.insertblock.InsertNewBlock;
import com.bytedance.ee.bear.document.toolbar.C6218f;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7624i;
import com.bytedance.ee.bear.edit.component.toolbar2.insertblock.C7628a;
import com.bytedance.ee.bear.edit.component.toolbar2.insertblock.C7640d;
import com.bytedance.ee.bear.facade.common.AbstractC7665c;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.facade.common.AbstractC7710h;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 82\u00020\u00012\u00020\u00022\u00020\u0003:\u00018B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016H\u0002J\u0006\u0010\"\u001a\u00020#J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020#H\u0002J\b\u0010'\u001a\u00020(H\u0016J\u0012\u0010)\u001a\u00020%2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0012\u0010,\u001a\u00020-2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010.\u001a\u00020%H\u0016J\u0010\u0010/\u001a\u00020%2\u0006\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020(H\u0016J\u0018\u00103\u001a\u00020%2\u0006\u00104\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u001a\u00105\u001a\u00020%2\b\u00106\u001a\u0004\u0018\u0001072\u0006\u0010!\u001a\u00020\u0016H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/bytedance/ee/bear/edit/component/toolbar2/insertblock/InsertNewBlockFragment;", "Landroidx/fragment/app/DialogFragment;", "Lcom/bytedance/ee/bear/facade/common/BackPressHandler;", "Lcom/bytedance/ee/bear/edit/component/toolbar2/IDocToolbarV2Compat$ToolbarV2DialogDismissHandler;", "()V", "allTitle", "Lcom/bytedance/ee/bear/widgets/BaseTitleBar;", "backPressDispatcher", "Lcom/bytedance/ee/bear/facade/common/BackPressDispatcher;", "clickData", "", "container", "Landroid/view/ViewGroup;", "dragView", "Lcom/bytedance/ee/bear/edit/component/toolbar2/insertblock/InsertNewBlockDragView;", "insertNewBlockRegistry", "Lcom/bytedance/ee/bear/edit/component/toolbar2/insertblock/InsertNewBlockRegistry;", "getInsertNewBlockRegistry", "()Lcom/bytedance/ee/bear/edit/component/toolbar2/insertblock/InsertNewBlockRegistry;", "insertNewBlockRegistry$delegate", "Lkotlin/Lazy;", "onItemClick", "Landroid/view/View$OnClickListener;", "viewModel", "Lcom/bytedance/ee/bear/edit/component/toolbar2/insertblock/InsertNewBlockViewModel;", "generateItemLayoutParams", "Landroid/widget/RelativeLayout$LayoutParams;", "scrollView", "Landroid/widget/HorizontalScrollView;", "generateItemView", "Lcom/bytedance/ee/bear/edit/component/toolbar2/insertblock/InsertNewBlockItemView;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/document/model/toolbar/insertblock/InsertNewBlock$ChildData;", "onClickListener", "getContentView", "Landroid/view/View;", "initDragView", "", "contentView", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onDestroy", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "shouldHandleKeyboard", "updateItemTint", "itemView", "updateView", "insertNewBlock", "Lcom/bytedance/ee/bear/document/model/toolbar/insertblock/InsertNewBlock;", "Companion", "edit-component_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.insertblock.b */
public final class InsertNewBlockFragment extends DialogInterface$OnCancelListenerC1021b implements AbstractC7624i.AbstractC7626b, AbstractC7666d {

    /* renamed from: c */
    static final /* synthetic */ KProperty[] f20713c = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(InsertNewBlockFragment.class), "insertNewBlockRegistry", "getInsertNewBlockRegistry()Lcom/bytedance/ee/bear/edit/component/toolbar2/insertblock/InsertNewBlockRegistry;"))};

    /* renamed from: h */
    public static final Companion f20714h = new Companion(null);

    /* renamed from: d */
    public C7628a f20715d;

    /* renamed from: e */
    public C7640d f20716e;

    /* renamed from: f */
    public String f20717f;

    /* renamed from: g */
    public final View.OnClickListener f20718g = new View$OnClickListenerC7639i(this);

    /* renamed from: i */
    private ViewGroup f20719i;

    /* renamed from: j */
    private BaseTitleBar f20720j;

    /* renamed from: k */
    private AbstractC7665c f20721k;

    /* renamed from: l */
    private final Lazy f20722l = LazyKt.lazy(C7637g.INSTANCE);

    /* renamed from: m */
    private HashMap f20723m;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.insertblock.b$e */
    public static final class View$OnClickListenerC7634e implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC7634e f20727a = new View$OnClickListenerC7634e();

        View$OnClickListenerC7634e() {
        }

        public final void onClick(View view) {
        }
    }

    /* renamed from: h */
    private final InsertNewBlockRegistry m30614h() {
        Lazy lazy = this.f20722l;
        KProperty kProperty = f20713c[0];
        return (InsertNewBlockRegistry) lazy.getValue();
    }

    /* renamed from: g */
    public void mo30020g() {
        HashMap hashMap = this.f20723m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo30020g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/edit/component/toolbar2/insertblock/InsertNewBlockFragment$Companion;", "", "()V", "SET_PANEL_HEIGHT_ID", "", "TAG", "edit-component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.insertblock.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/edit/component/toolbar2/insertblock/InsertNewBlockRegistry;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.insertblock.b$g */
    static final class C7637g extends Lambda implements Function0<InsertNewBlockRegistry> {
        public static final C7637g INSTANCE = new C7637g();

        C7637g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final InsertNewBlockRegistry invoke() {
            return new InsertNewBlockRegistry();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        C13479a.m54764b("InsertNewBlockFragment", "back press dismissAllowingStateLoss");
        mo5513b();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        AbstractC7665c cVar = this.f20721k;
        if (cVar != null) {
            cVar.mo30122b(this);
        }
        super.onDestroy();
        C7640d dVar = this.f20716e;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        C7640d.AbstractC7641a delegate = dVar.getDelegate();
        if (delegate != null) {
            delegate.onItemClick("close", "");
        }
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7624i.AbstractC7626b
    public boolean s_() {
        C13479a.m54764b("InsertNewBlockFragment", "onDismiss: " + this.f20717f);
        InsertNewBlockData a = m30614h().mo30027a(this.f20717f);
        if (a == null || a.getShouldShowInputMethodAfterClick()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.insertblock.b$f */
    public static final class RunnableC7635f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InsertNewBlockFragment f20728a;

        /* renamed from: b */
        final /* synthetic */ View f20729b;

        /* renamed from: c */
        final /* synthetic */ View f20730c;

        RunnableC7635f(InsertNewBlockFragment bVar, View view, View view2) {
            this.f20728a = bVar;
            this.f20729b = view;
            this.f20730c = view2;
        }

        public final void run() {
            if (this.f20728a.getActivity() != null) {
                InsertNewBlockFragment bVar = this.f20728a;
                View view = this.f20729b;
                bVar.f20715d = new C7628a(bVar.getActivity(), view, (float) view.getHeight());
                InsertNewBlockFragment.m30610a(this.f20728a).mo30012a(false);
                InsertNewBlockFragment.m30610a(this.f20728a).mo30014c();
                InsertNewBlockFragment.m30610a(this.f20728a).mo30010a(this.f20730c.findViewById(R.id.inb_drag));
                InsertNewBlockFragment.m30610a(this.f20728a).mo30011a(new C7628a.AbstractC7630a(this) {
                    /* class com.bytedance.ee.bear.edit.component.toolbar2.insertblock.InsertNewBlockFragment.RunnableC7635f.C76361 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC7635f f20731a;

                    {
                        this.f20731a = r1;
                    }

                    @Override // com.bytedance.ee.bear.edit.component.toolbar2.insertblock.C7628a.AbstractC7630a
                    /* renamed from: a */
                    public final void mo30017a(int i) {
                        if (i <= 0) {
                            this.f20731a.f20728a.mo5513b();
                        }
                    }
                });
                C7640d.AbstractC7641a delegate = InsertNewBlockFragment.m30613b(this.f20728a).getDelegate();
                if (delegate != null) {
                    delegate.onItemClick("setPanelHeight", String.valueOf(C13749l.m55749b(this.f20729b.getHeight())));
                    return;
                }
                return;
            }
            C13479a.m54758a("InsertNewBlockFragment", "view.post : activity is null!");
        }
    }

    /* renamed from: f */
    public final View mo30019f() {
        View inflate = View.inflate(getActivity(), R.layout.doc_insert_new_block_fragment, null);
        View findViewById = inflate.findViewById(R.id.container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.container)");
        this.f20719i = (ViewGroup) findViewById;
        View findViewById2 = inflate.findViewById(R.id.inb_all_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.inb_all_title)");
        BaseTitleBar baseTitleBar = (BaseTitleBar) findViewById2;
        this.f20720j = baseTitleBar;
        if (baseTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allTitle");
        }
        baseTitleBar.setLeftClickListener(new C7631b(this));
        AbstractC1142af a = C4950k.m20474a(this, C7640d.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "PluginViewModelProviders…ockViewModel::class.java)");
        C7640d dVar = (C7640d) a;
        this.f20716e = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        dVar.getInsertNewBlockLiveData().mo5923a(this, new C7632c(this));
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        ViewParent parent = inflate.getParent();
        if (parent != null) {
            if (parent != null) {
                ((ViewGroup) parent).removeAllViews();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        inflate.setOnClickListener(new View$OnClickListenerC7633d(this));
        View a2 = C6218f.m25065a().mo25151a(inflate);
        Intrinsics.checkExpressionValueIsNotNull(a2, "NavBarBottomInsetCompat.…nstance().doCompat2(view)");
        return a2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/edit/component/toolbar2/insertblock/InsertNewBlockFragment$getContentView$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "edit-component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.insertblock.b$b */
    public static final class C7631b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ InsertNewBlockFragment f20724a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C7631b(InsertNewBlockFragment bVar) {
            this.f20724a = bVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            this.f20724a.mo5513b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.insertblock.b$d */
    public static final class View$OnClickListenerC7633d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InsertNewBlockFragment f20726a;

        View$OnClickListenerC7633d(InsertNewBlockFragment bVar) {
            this.f20726a = bVar;
        }

        public final void onClick(View view) {
            this.f20726a.mo5513b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onCancel"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.insertblock.b$h */
    static final class DialogInterface$OnCancelListenerC7638h implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ InsertNewBlockFragment f20732a;

        DialogInterface$OnCancelListenerC7638h(InsertNewBlockFragment bVar) {
            this.f20732a = bVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f20732a.mo5513b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/document/model/toolbar/insertblock/InsertNewBlock;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.insertblock.b$c */
    public static final class C7632c<T> implements AbstractC1178x<InsertNewBlock> {

        /* renamed from: a */
        final /* synthetic */ InsertNewBlockFragment f20725a;

        C7632c(InsertNewBlockFragment bVar) {
            this.f20725a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(InsertNewBlock insertNewBlock) {
            if (insertNewBlock != null) {
                InsertNewBlockFragment bVar = this.f20725a;
                bVar.mo30018a(insertNewBlock, bVar.f20718g);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C7628a m30610a(InsertNewBlockFragment bVar) {
        C7628a aVar = bVar.f20715d;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragView");
        }
        return aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ C7640d m30613b(InsertNewBlockFragment bVar) {
        C7640d dVar = bVar.f20716e;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return dVar;
    }

    /* renamed from: a */
    private final void m30611a(View view) {
        View findViewById = view.findViewById(R.id.inb_bg);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "contentView.findViewById(R.id.inb_bg)");
        findViewById.setOnClickListener(View$OnClickListenerC7634e.f20727a);
        findViewById.post(new RunnableC7635f(this, findViewById, view));
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC7665c cVar = (AbstractC7665c) AbstractC7710h.C7711a.m30833a(getActivity(), AbstractC7665c.class);
        this.f20721k = cVar;
        if (cVar != null) {
            cVar.mo30121a(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.insertblock.b$i */
    static final class View$OnClickListenerC7639i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InsertNewBlockFragment f20733a;

        View$OnClickListenerC7639i(InsertNewBlockFragment bVar) {
            this.f20733a = bVar;
        }

        public final void onClick(View view) {
            InsertNewBlockFragment bVar = this.f20733a;
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            bVar.f20717f = view.getTag().toString();
            this.f20733a.mo5513b();
            C7640d.AbstractC7641a delegate = InsertNewBlockFragment.m30613b(this.f20733a).getDelegate();
            if (delegate != null) {
                delegate.onItemClick(view.getTag().toString(), "");
            }
        }
    }

    /* renamed from: a */
    private final RelativeLayout.LayoutParams m30608a(HorizontalScrollView horizontalScrollView) {
        int i;
        int a = (int) (((float) C13749l.m55736a()) / 5.5f);
        int a2 = C13749l.m55738a(16) - ((a - C13749l.m55738a(49)) / 2);
        if (a2 > 0) {
            i = a - ((int) (((float) a2) / 5.5f));
            horizontalScrollView.setPadding(a2, 0, a2, 0);
        } else {
            i = a - ((int) (((float) Math.abs(a2)) / 5.5f));
            horizontalScrollView.setPadding(0, 0, 0, 0);
        }
        return new RelativeLayout.LayoutParams(i, -2);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    public void onDismiss(DialogInterface dialogInterface) {
        Intrinsics.checkParameterIsNotNull(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        C13479a.m54764b("InsertNewBlockFragment", "onDismiss: " + this.f20717f);
        C7640d dVar = this.f20716e;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        dVar.clearInsertNewBlockData();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        mo5510a(0, R.style.InsertNewBlockDialogStyle);
        if (bundle == null) {
            bundle = new Bundle();
        }
        Dialog a = super.mo946a(bundle);
        Intrinsics.checkExpressionValueIsNotNull(a, "super.onCreateDialog(sav…nstanceState ?: Bundle())");
        View f = mo30019f();
        a.setContentView(f);
        Window window = a.getWindow();
        if (window != null) {
            Intrinsics.checkExpressionValueIsNotNull(window, "it");
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = C13749l.m55748b();
            attributes.flags = attributes.flags | 8 | DynamicModule.f58006b;
            attributes.gravity = 80;
        }
        a.setOnCancelListener(new DialogInterface$OnCancelListenerC7638h(this));
        m30611a(f);
        return a;
    }

    /* renamed from: a */
    private final InsertNewBlockItemView m30609a(InsertNewBlock.ChildData childData, View.OnClickListener onClickListener) {
        float f;
        InsertNewBlockItemView insertNewBlockItemView = new InsertNewBlockItemView(getActivity());
        insertNewBlockItemView.setTag(childData.getId());
        InsertNewBlockData a = m30614h().mo30027a(childData.getId());
        if (a != null) {
            insertNewBlockItemView.setIcon(a.getIconId());
        }
        insertNewBlockItemView.setText(childData.getName());
        insertNewBlockItemView.setBadge(childData.isShowBadge());
        insertNewBlockItemView.setOnClickListener(onClickListener);
        if (childData.isAdminLimit()) {
            f = 0.5f;
        } else {
            f = 1.0f;
        }
        insertNewBlockItemView.setAlpha(f);
        return insertNewBlockItemView;
    }

    /* renamed from: a */
    private final void m30612a(InsertNewBlockItemView insertNewBlockItemView, InsertNewBlock.ChildData childData) {
        InsertNewBlockData a = m30614h().mo30027a(childData.getId());
        if (a != null) {
            if (a.getBackgroundColorId() != 0) {
                insertNewBlockItemView.setIconBackgroundTint(a.getBackgroundColorId());
            }
            if (a.getIconColorId() != 0) {
                insertNewBlockItemView.setIconImageTint(a.getIconColorId());
            }
        }
    }

    /* renamed from: a */
    public final void mo30018a(InsertNewBlock insertNewBlock, View.OnClickListener onClickListener) {
        boolean z;
        boolean z2;
        if (insertNewBlock != null) {
            BaseTitleBar baseTitleBar = this.f20720j;
            if (baseTitleBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allTitle");
            }
            baseTitleBar.setTitle(insertNewBlock.getTitle());
            InsertNewBlock.Children[] children = insertNewBlock.getChildren();
            Intrinsics.checkExpressionValueIsNotNull(children, "insertNewBlock.children");
            if (children.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C13479a.m54764b("InsertNewBlockFragment", " insertNewBlock.children size < 2");
                return;
            }
            InsertNewBlock.Children[] children2 = insertNewBlock.getChildren();
            Intrinsics.checkExpressionValueIsNotNull(children2, "insertNewBlock.children");
            for (InsertNewBlock.Children children3 : children2) {
                View inflate = View.inflate(getActivity(), R.layout.doc_toolbar_insert_new_block_container, null);
                Intrinsics.checkExpressionValueIsNotNull(inflate, "View.inflate(activity, R…                    null)");
                View findViewById = inflate.findViewById(R.id.scroll_view);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.scroll_view)");
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) findViewById;
                View findViewById2 = inflate.findViewById(R.id.inb_title);
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.inb_title)");
                TextView textView = (TextView) findViewById2;
                View findViewById3 = inflate.findViewById(R.id.inb_container);
                Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.inb_container)");
                LinearLayout linearLayout = (LinearLayout) findViewById3;
                Intrinsics.checkExpressionValueIsNotNull(children3, "children");
                String subTitle = children3.getSubTitle();
                if (subTitle == null || subTitle.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    textView.setText(children3.getSubTitle());
                }
                InsertNewBlock.ChildData[] childDataArr = children3.data;
                Intrinsics.checkExpressionValueIsNotNull(childDataArr, "children.data");
                for (InsertNewBlock.ChildData childData : childDataArr) {
                    Intrinsics.checkExpressionValueIsNotNull(childData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    InsertNewBlockItemView a = m30609a(childData, onClickListener);
                    linearLayout.addView(a, m30608a(horizontalScrollView));
                    m30612a(a, childData);
                }
                ViewGroup viewGroup = this.f20719i;
                if (viewGroup == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("container");
                }
                viewGroup.addView(inflate);
            }
        } else if (v_() != null) {
            Dialog v_ = v_();
            if (v_ == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(v_, "dialog!!");
            if (v_.isShowing()) {
                mo5513b();
            }
        }
    }
}
