package com.bytedance.ee.bear.middleground.permission.collaborator.manager.bitableshare;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LinearLayoutManagerWrapper;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LoadMoreFooter;
import com.bytedance.ee.bear.middleground.permission.PermBitableShareAnalytic;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShadowRecycleView;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.bitableshare.IFormCollaboratorManagerContract;
import com.bytedance.ee.bear.middleground.permission.lock.LockBannerView;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.C11824c;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27125d;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27137a;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J \u0010\u001e\u001a\u00020\u00152\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020!0 j\b\u0012\u0004\u0012\u00020!`\"H\u0016J\b\u0010#\u001a\u00020\u0015H\u0016J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020!H\u0002J\u0010\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020(H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/BitableShareCollaboratorManagerView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/IFormCollaboratorManagerContract$IView;", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "loadingDialog", "Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "getLoadingDialog", "()Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "loadingDialog$delegate", "Lkotlin/Lazy;", "mAdapter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/BitableShareCollaboratorManagerAdapter;", "getMAdapter", "()Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/BitableShareCollaboratorManagerAdapter;", "mAdapter$delegate", "getRootView", "()Landroid/view/View;", "viewDelegate", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/IFormCollaboratorManagerContract$IView$IViewDelegate;", "create", "", "destroy", "finishLoadMore", "hideLoading", "initView", "setLoadMoreEnable", "enable", "", "setViewDelegate", "showCollaborators", "collaborators", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "showLoading", "showRemoveTipsDialog", "userInfo", "updateTitle", "num", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.e */
public final class BitableShareCollaboratorManagerView implements IFormCollaboratorManagerContract.IView {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f26295a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BitableShareCollaboratorManagerView.class), "mAdapter", "getMAdapter()Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/BitableShareCollaboratorManagerAdapter;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BitableShareCollaboratorManagerView.class), "loadingDialog", "getLoadingDialog()Lcom/bytedance/ee/bear/widgets/LoadingDialog;"))};

    /* renamed from: b */
    public IFormCollaboratorManagerContract.IView.IViewDelegate f26296b;

    /* renamed from: c */
    private final Lazy f26297c = LazyKt.lazy(new C9746e(this));

    /* renamed from: d */
    private final Lazy f26298d = LazyKt.lazy(new C9745d(this));

    /* renamed from: e */
    private final View f26299e;

    /* renamed from: e */
    private final BitableShareCollaboratorManagerAdapter m40326e() {
        Lazy lazy = this.f26297c;
        KProperty kProperty = f26295a[0];
        return (BitableShareCollaboratorManagerAdapter) lazy.getValue();
    }

    /* renamed from: f */
    private final C11824c m40327f() {
        Lazy lazy = this.f26298d;
        KProperty kProperty = f26295a[1];
        return (C11824c) lazy.getValue();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m40328g();
    }

    /* renamed from: d */
    public final View mo37184d() {
        return this.f26299e;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.bitableshare.IFormCollaboratorManagerContract.IView
    /* renamed from: b */
    public void mo37182b() {
        m40327f().mo45304d();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.bitableshare.IFormCollaboratorManagerContract.IView
    /* renamed from: c */
    public void mo37183c() {
        m40327f().mo45303c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.e$d */
    static final class C9745d extends Lambda implements Function0<C11824c> {
        final /* synthetic */ BitableShareCollaboratorManagerView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9745d(BitableShareCollaboratorManagerView eVar) {
            super(0);
            this.this$0 = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11824c invoke() {
            return new C11824c(this.this$0.mo37184d().getContext());
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.bitableshare.IFormCollaboratorManagerContract.IView
    /* renamed from: a */
    public void mo37176a() {
        ((SmartRefreshLayout) this.f26299e.findViewById(R.id.share_collaborator_refresh_layout)).mo96416n();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/BitableShareCollaboratorManagerAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.e$e */
    public static final class C9746e extends Lambda implements Function0<BitableShareCollaboratorManagerAdapter> {
        final /* synthetic */ BitableShareCollaboratorManagerView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9746e(BitableShareCollaboratorManagerView eVar) {
            super(0);
            this.this$0 = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final BitableShareCollaboratorManagerAdapter invoke() {
            return new BitableShareCollaboratorManagerAdapter(C97471.INSTANCE, new Function1<UserInfo, Unit>(this) {
                /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.bitableshare.BitableShareCollaboratorManagerView.C9746e.C97482 */
                final /* synthetic */ C9746e this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(UserInfo userInfo) {
                    invoke(userInfo);
                    return Unit.INSTANCE;
                }

                public final void invoke(UserInfo userInfo) {
                    Intrinsics.checkParameterIsNotNull(userInfo, "it");
                    this.this$0.this$0.mo37179a(userInfo);
                }
            });
        }
    }

    /* renamed from: g */
    private final void m40328g() {
        BaseTitleBar baseTitleBar = (BaseTitleBar) this.f26299e.findViewById(R.id.doc_permission_manage_title_bar);
        baseTitleBar.setActionIconTint(R.color.icon_n1);
        baseTitleBar.mo45070a(new C9742a(this, R.drawable.ud_icon_member_add_outlined));
        baseTitleBar.setLeftClickListener(new C9743b(this));
        ((LockBannerView) this.f26299e.findViewById(R.id.lockBanner)).mo37767a();
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) this.f26299e.findViewById(R.id.share_collaborator_refresh_layout);
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "smartRefreshLayout");
        Context context = this.f26299e.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
        smartRefreshLayout.mo96367b((AbstractC27125d) new LoadMoreFooter(context));
        smartRefreshLayout.mo96368b(new C9744c(this));
        ShadowRecycleView shadowRecycleView = (ShadowRecycleView) this.f26299e.findViewById(R.id.doc_permission_collaborator_recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(shadowRecycleView, "recyclerView");
        shadowRecycleView.setLayoutManager(new LinearLayoutManagerWrapper(this.f26299e.getContext()));
        shadowRecycleView.setAdapter(m40326e());
    }

    /* renamed from: a */
    public void setViewDelegate(IFormCollaboratorManagerContract.IView.IViewDelegate aVar) {
        this.f26296b = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/BitableShareCollaboratorManagerView$initView$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.e$b */
    public static final class C9743b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ BitableShareCollaboratorManagerView f26301a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9743b(BitableShareCollaboratorManagerView eVar) {
            this.f26301a = eVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            IFormCollaboratorManagerContract.IView.IViewDelegate aVar = this.f26301a.f26296b;
            if (aVar != null) {
                aVar.mo37164d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/scwang/smartrefresh/layout/api/RefreshLayout;", "kotlin.jvm.PlatformType", "onLoadmore"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.e$c */
    public static final class C9744c implements AbstractC27137a {

        /* renamed from: a */
        final /* synthetic */ BitableShareCollaboratorManagerView f26302a;

        C9744c(BitableShareCollaboratorManagerView eVar) {
            this.f26302a = eVar;
        }

        @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27137a
        public final void onLoadmore(AbstractC27129h hVar) {
            IFormCollaboratorManagerContract.IView.IViewDelegate aVar = this.f26302a.f26296b;
            if (aVar != null) {
                aVar.mo37163c();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/BitableShareCollaboratorManagerView$initView$1", "Lcom/bytedance/ee/bear/widgets/BaseTitleBar$ImageAction;", "performAction", "", "view", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.e$a */
    public static final class C9742a extends BaseTitleBar.C11803d {

        /* renamed from: a */
        final /* synthetic */ BitableShareCollaboratorManagerView f26300a;

        @Override // com.bytedance.ee.bear.widgets.BaseTitleBar.AbstractC11800a, com.bytedance.ee.bear.widgets.BaseTitleBar.C11801b
        /* renamed from: a */
        public void mo16854a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            super.mo16854a(view);
            IFormCollaboratorManagerContract.IView.IViewDelegate aVar = this.f26300a.f26296b;
            if (aVar != null) {
                aVar.mo37162b();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9742a(BitableShareCollaboratorManagerView eVar, int i) {
            super(i);
            this.f26300a = eVar;
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.bitableshare.IFormCollaboratorManagerContract.IView
    /* renamed from: a */
    public void mo37180a(ArrayList<UserInfo> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "collaborators");
        m40326e().mo70690f(arrayList);
    }

    public BitableShareCollaboratorManagerView(View view) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f26299e = view;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.bitableshare.IFormCollaboratorManagerContract.IView
    /* renamed from: a */
    public void mo37181a(boolean z) {
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) this.f26299e.findViewById(R.id.share_collaborator_refresh_layout);
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "rootView.share_collaborator_refresh_layout");
        smartRefreshLayout.mo96415m(z);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.bitableshare.IFormCollaboratorManagerContract.IView
    /* renamed from: a */
    public void mo37177a(int i) {
        String str;
        if (i == 0) {
            str = this.f26299e.getContext().getString(R.string.Bitable_Form_ManageCollaborator);
        } else {
            str = this.f26299e.getContext().getString(R.string.Bitable_Form_ManageCollaborator) + " (" + i + ')';
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "if (num == 0) {\n        …or) + \" ($num)\"\n        }");
        ((BaseTitleBar) this.f26299e.findViewById(R.id.doc_permission_manage_title_bar)).setTitle(str);
    }

    /* renamed from: a */
    public final void mo37179a(UserInfo userInfo) {
        PermBitableShareAnalytic.f25618a.mo36534h();
        PermBitableShareAnalytic.f25618a.mo36536j();
        Context context = this.f26299e.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
        new BearUDDialogBuilder(context).mo45344a(R.string.Bitable_Form_RemovePermissionPopupTitle).mo45362d(R.string.Bitable_Form_RemovePermissionPopupDesc).mo45345a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_Remove, R.color.function_danger_500, new DialogInterface$OnClickListenerC9749f(this, userInfo)).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, DialogInterface$OnClickListenerC9750g.f26305a).mo45359b();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.e$g */
    public static final class DialogInterface$OnClickListenerC9750g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC9750g f26305a = new DialogInterface$OnClickListenerC9750g();

        DialogInterface$OnClickListenerC9750g() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            PermBitableShareAnalytic.f25618a.mo36526a(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.e$f */
    public static final class DialogInterface$OnClickListenerC9749f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BitableShareCollaboratorManagerView f26303a;

        /* renamed from: b */
        final /* synthetic */ UserInfo f26304b;

        DialogInterface$OnClickListenerC9749f(BitableShareCollaboratorManagerView eVar, UserInfo userInfo) {
            this.f26303a = eVar;
            this.f26304b = userInfo;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            IFormCollaboratorManagerContract.IView.IViewDelegate aVar = this.f26303a.f26296b;
            if (aVar != null) {
                aVar.mo37161a(this.f26304b);
            }
            PermBitableShareAnalytic.f25618a.mo36526a(true);
        }
    }
}
