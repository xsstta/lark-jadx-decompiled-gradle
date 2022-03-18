package com.bytedance.ee.bear.middleground.permission.setting.doc.v2.security;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.setting.SelectItemView;
import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.PublicPermDescHelper;
import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.security.IDocPermSecurityContract;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.C11824c;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.larksuite.suite.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0005H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/security/DocPermSecurityView;", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/security/IDocPermSecurityContract$IView;", "rootView", "Landroid/view/View;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "(Landroid/view/View;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;)V", "delegate", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/security/IDocPermSecurityContract$IView$IViewDelegate;", "loadingDialog", "Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "getLoadingDialog", "()Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "loadingDialog$delegate", "Lkotlin/Lazy;", "create", "", "destroy", "setLoading", "visible", "", "setViewDelegate", "viewDelegate", "showFaConfirmDialog", "updateView", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c.d */
public class DocPermSecurityView implements IDocPermSecurityContract.IView {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f27028a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DocPermSecurityView.class), "loadingDialog", "getLoadingDialog()Lcom/bytedance/ee/bear/widgets/LoadingDialog;"))};

    /* renamed from: b */
    public IDocPermSecurityContract.IView.IViewDelegate f27029b;

    /* renamed from: c */
    public final View f27030c;

    /* renamed from: d */
    public DocPermSetInfo f27031d;

    /* renamed from: e */
    private final Lazy f27032e = LazyKt.lazy(new C10000f(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c.d$d */
    static final class View$OnClickListenerC9998d implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC9998d f27036a = new View$OnClickListenerC9998d();

        View$OnClickListenerC9998d() {
        }

        public final void onClick(View view) {
        }
    }

    /* renamed from: b */
    private final C11824c m41580b() {
        Lazy lazy = this.f27032e;
        KProperty kProperty = f27028a[0];
        return (C11824c) lazy.getValue();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c.d$f */
    static final class C10000f extends Lambda implements Function0<C11824c> {
        final /* synthetic */ DocPermSecurityView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10000f(DocPermSecurityView dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11824c invoke() {
            return new C11824c(this.this$0.f27030c.getContext());
        }
    }

    /* renamed from: a */
    public final void mo38231a() {
        int i;
        if (this.f27031d.mo38816Y()) {
            i = R.string.CreationMobile_ECM_Permission_External_FullAccess_confirm;
        } else {
            i = R.string.CreationMobile_ECM_Permission_External_OnlyMe_confirm;
        }
        Context context = this.f27030c.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
        ((IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null)).mo40651a(this.f27031d.mo38827c(), String.valueOf(this.f27031d.mo38825b()), new BearUDDialogBuilder(context).mo45344a(i).mo45362d(R.string.CreationMobile_ECM_Permission_Paste_off).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_Confirm, new DialogInterface$OnClickListenerC10001g(this)).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, (DialogInterface.OnClickListener) null).mo45359b());
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        PublicPermDescHelper jVar = PublicPermDescHelper.f27061a;
        Context context = this.f27030c.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
        ((SelectItemView) this.f27030c.findViewById(R.id.securityReadItem)).setText(jVar.mo38263c(context));
        ((SelectItemView) this.f27030c.findViewById(R.id.securityReadItem)).setOnClickListener(new C9995a(this));
        PublicPermDescHelper jVar2 = PublicPermDescHelper.f27061a;
        Context context2 = this.f27030c.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "rootView.context");
        ((SelectItemView) this.f27030c.findViewById(R.id.securityEditItem)).setText(jVar2.mo38265d(context2));
        ((SelectItemView) this.f27030c.findViewById(R.id.securityEditItem)).setOnClickListener(new C9996b(this));
        PublicPermDescHelper jVar3 = PublicPermDescHelper.f27061a;
        Context context3 = this.f27030c.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context3, "rootView.context");
        ((SelectItemView) this.f27030c.findViewById(R.id.securityFaItem)).setText(jVar3.mo38262b(context3, this.f27031d.mo38816Y()));
        ((SelectItemView) this.f27030c.findViewById(R.id.securityFaItem)).setOnClickListener(new C9997c(this));
        this.f27030c.setOnClickListener(View$OnClickListenerC9998d.f27036a);
        ((BaseTitleBar) this.f27030c.findViewById(R.id.titleBar)).setLeftClickListener(new C9999e(this));
        PermissionAnalyticV2.f25731a.mo36699y();
    }

    /* renamed from: a */
    public void setViewDelegate(IDocPermSecurityContract.IView.IViewDelegate aVar) {
        this.f27029b = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/doc/v2/security/DocPermSecurityView$create$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c.d$a */
    public static final class C9995a extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ DocPermSecurityView f27033a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9995a(DocPermSecurityView dVar) {
            this.f27033a = dVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            if (!this.f27033a.f27031d.mo38809R()) {
                IDocPermSecurityContract.IView.IViewDelegate aVar = this.f27033a.f27029b;
                if (aVar != null) {
                    aVar.mo38227d();
                }
                PermissionAnalyticV2.f25731a.mo36693g(this.f27033a.f27031d.mo38811T(), this.f27033a.f27031d.mo38810S());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/doc/v2/security/DocPermSecurityView$create$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c.d$b */
    public static final class C9996b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ DocPermSecurityView f27034a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9996b(DocPermSecurityView dVar) {
            this.f27034a = dVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            if (!this.f27034a.f27031d.mo38810S()) {
                IDocPermSecurityContract.IView.IViewDelegate aVar = this.f27034a.f27029b;
                if (aVar != null) {
                    aVar.mo38226c();
                }
                PermissionAnalyticV2.f25731a.mo36691f(this.f27034a.f27031d.mo38811T(), this.f27034a.f27031d.mo38809R());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/doc/v2/security/DocPermSecurityView$create$3", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c.d$c */
    public static final class C9997c extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ DocPermSecurityView f27035a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9997c(DocPermSecurityView dVar) {
            this.f27035a = dVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            if (!this.f27035a.f27031d.mo38811T()) {
                this.f27035a.mo38231a();
                PermissionAnalyticV2.f25731a.mo36689e(this.f27035a.f27031d.mo38810S(), this.f27035a.f27031d.mo38809R());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/doc/v2/security/DocPermSecurityView$create$5", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c.d$e */
    public static final class C9999e extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ DocPermSecurityView f27037a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9999e(DocPermSecurityView dVar) {
            this.f27037a = dVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            if (this.f27037a.f27030c.getContext() instanceof Activity) {
                Context context = this.f27037a.f27030c.getContext();
                if (context != null) {
                    ((Activity) context).onBackPressed();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                }
            }
            PermissionAnalyticV2.f25731a.mo36700z();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.security.IDocPermSecurityContract.IView
    /* renamed from: a */
    public void mo38234a(boolean z) {
        if (z) {
            m41580b().mo45304d();
        } else {
            m41580b().mo45303c();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.security.IDocPermSecurityContract.IView
    /* renamed from: a */
    public void mo38233a(DocPermSetInfo docPermSetInfo) {
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        this.f27031d = docPermSetInfo;
        IDocPublicPermission j = docPermSetInfo.mo38837j();
        SelectItemView selectItemView = (SelectItemView) this.f27030c.findViewById(R.id.securityReadItem);
        Intrinsics.checkExpressionValueIsNotNull(selectItemView, "rootView.securityReadItem");
        selectItemView.setSelected(j.isSecurityWithRead());
        SelectItemView selectItemView2 = (SelectItemView) this.f27030c.findViewById(R.id.securityEditItem);
        Intrinsics.checkExpressionValueIsNotNull(selectItemView2, "rootView.securityEditItem");
        selectItemView2.setSelected(j.isSecurityWithEdit());
        SelectItemView selectItemView3 = (SelectItemView) this.f27030c.findViewById(R.id.securityFaItem);
        Intrinsics.checkExpressionValueIsNotNull(selectItemView3, "rootView.securityFaItem");
        selectItemView3.setSelected(j.isSecurityWithFA());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c.d$g */
    public static final class DialogInterface$OnClickListenerC10001g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DocPermSecurityView f27038a;

        DialogInterface$OnClickListenerC10001g(DocPermSecurityView dVar) {
            this.f27038a = dVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            IDocPermSecurityContract.IView.IViewDelegate aVar = this.f27038a.f27029b;
            if (aVar != null) {
                aVar.mo38225b();
            }
        }
    }

    public DocPermSecurityView(View view, DocPermSetInfo docPermSetInfo) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        this.f27030c = view;
        this.f27031d = docPermSetInfo;
    }
}
