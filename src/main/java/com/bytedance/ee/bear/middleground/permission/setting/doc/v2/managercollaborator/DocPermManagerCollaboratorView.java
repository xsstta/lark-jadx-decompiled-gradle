package com.bytedance.ee.bear.middleground.permission.setting.doc.v2.managercollaborator;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.setting.SelectItemView;
import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.PublicPermDescHelper;
import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.managercollaborator.IDocPermManagerCollaboratorContract;
import com.bytedance.ee.bear.middleground.permission.util.ToCUtil;
import com.bytedance.ee.bear.middleground.permission.widget.DividerTextView;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.C11824c;
import com.larksuite.component.universe_design.p1166switch.UDSwitch;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0012\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0005H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/managercollaborator/DocPermManagerCollaboratorView;", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/managercollaborator/IDocPermManagerCollaboratorContract$IView;", "rootView", "Landroid/view/View;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "(Landroid/view/View;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;)V", "delegate", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/managercollaborator/IDocPermManagerCollaboratorContract$IView$IViewDelegate;", "hideOrg", "", "loadingDialog", "Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "getLoadingDialog", "()Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "loadingDialog$delegate", "Lkotlin/Lazy;", "create", "", "destroy", "setLoading", "visible", "setViewDelegate", "viewDelegate", "updateSwitchVisible", "updateView", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.b.d */
public final class DocPermManagerCollaboratorView implements IDocPermManagerCollaboratorContract.IView {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f26979a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DocPermManagerCollaboratorView.class), "loadingDialog", "getLoadingDialog()Lcom/bytedance/ee/bear/widgets/LoadingDialog;"))};

    /* renamed from: b */
    public IDocPermManagerCollaboratorContract.IView.IViewDelegate f26980b;

    /* renamed from: c */
    public final View f26981c;

    /* renamed from: d */
    public DocPermSetInfo f26982d;

    /* renamed from: e */
    private final Lazy f26983e = LazyKt.lazy(new C9981g(this));

    /* renamed from: f */
    private boolean f26984f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.b.d$e */
    static final class View$OnClickListenerC9979e implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC9979e f26989a = new View$OnClickListenerC9979e();

        View$OnClickListenerC9979e() {
        }

        public final void onClick(View view) {
        }
    }

    /* renamed from: a */
    private final C11824c m41518a() {
        Lazy lazy = this.f26983e;
        KProperty kProperty = f26979a[0];
        return (C11824c) lazy.getValue();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.b.d$g */
    static final class C9981g extends Lambda implements Function0<C11824c> {
        final /* synthetic */ DocPermManagerCollaboratorView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9981g(DocPermManagerCollaboratorView dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11824c invoke() {
            return new C11824c(this.this$0.f26981c.getContext());
        }
    }

    /* renamed from: b */
    private final void m41519b() {
        boolean z;
        if (this.f26982d.mo38816Y() || !this.f26982d.mo38837j().isManagerCollaboratorWithFA()) {
            z = false;
        } else {
            z = true;
        }
        if (this.f26984f || !this.f26982d.mo38793B() || !this.f26982d.mo38794C() || z) {
            DividerTextView dividerTextView = (DividerTextView) this.f26981c.findViewById(R.id.divider);
            Intrinsics.checkExpressionValueIsNotNull(dividerTextView, "rootView.divider");
            dividerTextView.setVisibility(8);
            LinearLayout linearLayout = (LinearLayout) this.f26981c.findViewById(R.id.managerCollaboratorInternalLayout);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.managerCollaboratorInternalLayout");
            linearLayout.setVisibility(8);
            return;
        }
        DividerTextView dividerTextView2 = (DividerTextView) this.f26981c.findViewById(R.id.divider);
        Intrinsics.checkExpressionValueIsNotNull(dividerTextView2, "rootView.divider");
        dividerTextView2.setVisibility(0);
        LinearLayout linearLayout2 = (LinearLayout) this.f26981c.findViewById(R.id.managerCollaboratorInternalLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "rootView.managerCollaboratorInternalLayout");
        linearLayout2.setVisibility(0);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        boolean z;
        boolean b = ToCUtil.f26828a.mo37760b(((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f());
        boolean a = ((AbstractC5586d) KoinJavaComponent.m268613a(AbstractC5586d.class, null, null, 6, null)).mo22259a();
        if (b || a) {
            z = true;
        } else {
            z = false;
        }
        this.f26984f = z;
        m41519b();
        PublicPermDescHelper jVar = PublicPermDescHelper.f27061a;
        Context context = this.f26981c.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
        ((SelectItemView) this.f26981c.findViewById(R.id.managerCollaboratorFaItem)).setText(jVar.mo38259a(context, this.f26982d.mo38816Y()));
        ((SelectItemView) this.f26981c.findViewById(R.id.managerCollaboratorFaItem)).setOnClickListener(new C9975a(this));
        PublicPermDescHelper jVar2 = PublicPermDescHelper.f27061a;
        Context context2 = this.f26981c.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "rootView.context");
        ((SelectItemView) this.f26981c.findViewById(R.id.managerCollaboratorEditItem)).setText(jVar2.mo38260b(context2));
        ((SelectItemView) this.f26981c.findViewById(R.id.managerCollaboratorEditItem)).setOnClickListener(new C9976b(this));
        PublicPermDescHelper jVar3 = PublicPermDescHelper.f27061a;
        Context context3 = this.f26981c.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context3, "rootView.context");
        ((SelectItemView) this.f26981c.findViewById(R.id.managerCollaboratorReadItem)).setText(jVar3.mo38257a(context3));
        ((SelectItemView) this.f26981c.findViewById(R.id.managerCollaboratorReadItem)).setOnClickListener(new C9977c(this));
        ((UDSwitch) this.f26981c.findViewById(R.id.managerCollaboratorInternalSwitch)).setOnCheckedChangeListener(new C9978d(this));
        this.f26981c.setOnClickListener(View$OnClickListenerC9979e.f26989a);
        ((BaseTitleBar) this.f26981c.findViewById(R.id.titleBar)).setLeftClickListener(new C9980f(this));
        PermissionAnalyticV2.f25731a.mo36697w();
    }

    /* renamed from: a */
    public void setViewDelegate(IDocPermManagerCollaboratorContract.IView.IViewDelegate aVar) {
        this.f26980b = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/doc/v2/managercollaborator/DocPermManagerCollaboratorView$create$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.b.d$a */
    public static final class C9975a extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ DocPermManagerCollaboratorView f26985a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9975a(DocPermManagerCollaboratorView dVar) {
            this.f26985a = dVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            if (!this.f26985a.f26982d.mo38806O()) {
                IDocPermManagerCollaboratorContract.IView.IViewDelegate aVar = this.f26985a.f26980b;
                if (aVar != null) {
                    aVar.mo38188b();
                }
                PermissionAnalyticV2.f25731a.mo36686b(this.f26985a.f26982d.mo38805N(), this.f26985a.f26982d.mo38804M());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/doc/v2/managercollaborator/DocPermManagerCollaboratorView$create$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.b.d$b */
    public static final class C9976b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ DocPermManagerCollaboratorView f26986a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9976b(DocPermManagerCollaboratorView dVar) {
            this.f26986a = dVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            if (!this.f26986a.f26982d.mo38805N()) {
                IDocPermManagerCollaboratorContract.IView.IViewDelegate aVar = this.f26986a.f26980b;
                if (aVar != null) {
                    aVar.mo38189c();
                }
                PermissionAnalyticV2.f25731a.mo36687c(this.f26986a.f26982d.mo38806O(), this.f26986a.f26982d.mo38804M());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/doc/v2/managercollaborator/DocPermManagerCollaboratorView$create$3", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.b.d$c */
    public static final class C9977c extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ DocPermManagerCollaboratorView f26987a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9977c(DocPermManagerCollaboratorView dVar) {
            this.f26987a = dVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            if (!this.f26987a.f26982d.mo38804M()) {
                IDocPermManagerCollaboratorContract.IView.IViewDelegate aVar = this.f26987a.f26980b;
                if (aVar != null) {
                    aVar.mo38190d();
                }
                PermissionAnalyticV2.f25731a.mo36688d(this.f26987a.f26982d.mo38806O(), this.f26987a.f26982d.mo38805N());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/doc/v2/managercollaborator/DocPermManagerCollaboratorView$create$6", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.b.d$f */
    public static final class C9980f extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ DocPermManagerCollaboratorView f26990a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9980f(DocPermManagerCollaboratorView dVar) {
            this.f26990a = dVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            if (this.f26990a.f26981c.getContext() instanceof Activity) {
                Context context = this.f26990a.f26981c.getContext();
                if (context != null) {
                    ((Activity) context).onBackPressed();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                }
            }
            PermissionAnalyticV2.f25731a.mo36698x();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.managercollaborator.IDocPermManagerCollaboratorContract.IView
    /* renamed from: a */
    public void mo38196a(boolean z) {
        if (z) {
            m41518a().mo45304d();
        } else {
            m41518a().mo45303c();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.managercollaborator.IDocPermManagerCollaboratorContract.IView
    /* renamed from: a */
    public void mo38195a(DocPermSetInfo docPermSetInfo) {
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        this.f26982d = docPermSetInfo;
        IDocPublicPermission j = docPermSetInfo.mo38837j();
        SelectItemView selectItemView = (SelectItemView) this.f26981c.findViewById(R.id.managerCollaboratorFaItem);
        Intrinsics.checkExpressionValueIsNotNull(selectItemView, "rootView.managerCollaboratorFaItem");
        selectItemView.setSelected(j.isManagerCollaboratorWithFA());
        SelectItemView selectItemView2 = (SelectItemView) this.f26981c.findViewById(R.id.managerCollaboratorEditItem);
        Intrinsics.checkExpressionValueIsNotNull(selectItemView2, "rootView.managerCollaboratorEditItem");
        selectItemView2.setSelected(j.isManagerCollaboratorWithEdit());
        SelectItemView selectItemView3 = (SelectItemView) this.f26981c.findViewById(R.id.managerCollaboratorReadItem);
        Intrinsics.checkExpressionValueIsNotNull(selectItemView3, "rootView.managerCollaboratorReadItem");
        selectItemView3.setSelected(j.isManagerCollaboratorWithRead());
        UDSwitch uDSwitch = (UDSwitch) this.f26981c.findViewById(R.id.managerCollaboratorInternalSwitch);
        Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "rootView.managerCollaboratorInternalSwitch");
        uDSwitch.setChecked(j.isManagerCollaboratorTenant());
        m41519b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "buttonView", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.b.d$d */
    static final class C9978d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ DocPermManagerCollaboratorView f26988a;

        C9978d(DocPermManagerCollaboratorView dVar) {
            this.f26988a = dVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Intrinsics.checkExpressionValueIsNotNull(compoundButton, "buttonView");
            if (compoundButton.isPressed()) {
                IDocPermManagerCollaboratorContract.IView.IViewDelegate aVar = this.f26988a.f26980b;
                if (aVar != null) {
                    aVar.mo38187a(z);
                }
                PermissionAnalyticV2.f25731a.mo36692g(z);
            }
        }
    }

    public DocPermManagerCollaboratorView(View view, DocPermSetInfo docPermSetInfo) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        this.f26981c = view;
        this.f26982d = docPermSetInfo;
    }
}
