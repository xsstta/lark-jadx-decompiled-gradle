package com.bytedance.ee.bear.middleground.permission.setting.doc.v2;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.IDocPermissionSetContract;
import com.bytedance.ee.bear.middleground.permission.util.ToCUtil;
import com.bytedance.ee.bear.middleground.permission.widget.DividerTextView;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.C11824c;
import com.larksuite.component.universe_design.p1166switch.UDSwitch;
import com.larksuite.suite.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0017\u001a\u00020\bH\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0004J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\b\u0010\u001f\u001a\u00020\u0019H\u0002J\b\u0010 \u001a\u00020\u0019H\u0002J\b\u0010!\u001a\u00020\bH\u0002J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\bH\u0016J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\bH\u0016J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\bH\u0016J\u0012\u0010&\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010'\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\bH\u0016J\b\u0010(\u001a\u00020\u0019H\u0002J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0005H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetView;", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/IDocPermissionSetContract$IView;", "rootView", "Landroid/view/View;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "(Landroid/view/View;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;)V", "hideOrganization", "", "loadingDialog", "Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "getLoadingDialog", "()Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "loadingDialog$delegate", "Lkotlin/Lazy;", "getPermSetInfo", "()Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "setPermSetInfo", "(Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;)V", "getRootView", "()Landroid/view/View;", "viewDelegate", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/IDocPermissionSetContract$IView$IViewDelegate;", "canShowShareLayout", "create", "", "destroy", "initCommentPart", "initData", "initExternalSharePart", "initManagerCollaboratorPart", "initSecurityPart", "initTitleBar", "isAdminCanCross", "setCollaboratorVisible", "visible", "setExternalShareVisible", "setLoadingVisible", "setViewDelegate", "updateShareLayoutVisible", "updateView", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.d */
public class DocPermissionSetView implements IDocPermissionSetContract.IView {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f27043a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DocPermissionSetView.class), "loadingDialog", "getLoadingDialog()Lcom/bytedance/ee/bear/widgets/LoadingDialog;"))};

    /* renamed from: b */
    public IDocPermissionSetContract.IView.IViewDelegate f27044b;

    /* renamed from: c */
    private boolean f27045c;

    /* renamed from: d */
    private final Lazy f27046d = LazyKt.lazy(new C10010h(this));

    /* renamed from: e */
    private final View f27047e;

    /* renamed from: f */
    private DocPermSetInfo f27048f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.d$a */
    static final class View$OnClickListenerC10003a implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC10003a f27049a = new View$OnClickListenerC10003a();

        View$OnClickListenerC10003a() {
        }

        public final void onClick(View view) {
        }
    }

    /* renamed from: d */
    private final C11824c m41600d() {
        Lazy lazy = this.f27046d;
        KProperty kProperty = f27043a[0];
        return (C11824c) lazy.getValue();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: b */
    public View mo38241b() {
        return this.f27047e;
    }

    /* renamed from: c */
    public DocPermSetInfo mo38244c() {
        return this.f27048f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.d$h */
    static final class C10010h extends Lambda implements Function0<C11824c> {
        final /* synthetic */ DocPermissionSetView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10010h(DocPermissionSetView dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11824c invoke() {
            return new C11824c(this.this$0.mo38241b().getContext());
        }
    }

    /* renamed from: f */
    private final void m41602f() {
        ((BaseTitleBar) mo38241b().findViewById(R.id.titleBar)).setLeftClickListener(new C10009g(this));
    }

    /* renamed from: h */
    private final void m41604h() {
        mo38245c(true);
        ((LinearLayout) mo38241b().findViewById(R.id.managerCollaboratorLayout)).setOnClickListener(new C10007e(this));
    }

    /* renamed from: i */
    private final void m41605i() {
        ((LinearLayout) mo38241b().findViewById(R.id.securityLayout)).setOnClickListener(new C10008f(this));
    }

    /* renamed from: j */
    private final void m41606j() {
        ((LinearLayout) mo38241b().findViewById(R.id.commentLayout)).setOnClickListener(new C10004b(this));
    }

    /* renamed from: l */
    private final boolean m41608l() {
        if (!mo38244c().mo38794C() || !m41603g() || this.f27045c) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private final void m41601e() {
        boolean z;
        boolean b = ToCUtil.f26828a.mo37760b(((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f());
        boolean a = ((AbstractC5586d) KoinJavaComponent.m268613a(AbstractC5586d.class, null, null, 6, null)).mo22259a();
        if (b || a) {
            z = true;
        } else {
            z = false;
        }
        this.f27045c = z;
    }

    /* renamed from: g */
    private final boolean m41603g() {
        boolean f = ((IAdminPermissionProxy) KoinJavaComponent.m268613a(IAdminPermissionProxy.class, null, null, 6, null)).mo36547f(mo38244c().mo38825b(), mo38244c().mo38827c());
        if (!mo38244c().mo38793B() || !f) {
            return false;
        }
        return true;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m41601e();
        m41602f();
        mo38237a();
        m41604h();
        m41605i();
        m41606j();
        m41607k();
        mo38241b().setOnClickListener(View$OnClickListenerC10003a.f27049a);
        PermissionAnalyticV2.m39668d(true);
    }

    /* renamed from: k */
    private final void m41607k() {
        UDSwitch uDSwitch = (UDSwitch) mo38241b().findViewById(R.id.externalAccessSwitch);
        Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "rootView.externalAccessSwitch");
        uDSwitch.setChecked(mo38244c().mo38794C());
        UDSwitch uDSwitch2 = (UDSwitch) mo38241b().findViewById(R.id.shareSwitch);
        Intrinsics.checkExpressionValueIsNotNull(uDSwitch2, "rootView.shareSwitch");
        uDSwitch2.setChecked(mo38244c().mo38803L());
        mo38243b(mo38244c().mo38794C());
        Context context = mo38241b().getContext();
        TextView textView = (TextView) mo38241b().findViewById(R.id.managerCollaboratorText);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.managerCollaboratorText");
        PublicPermDescHelper jVar = PublicPermDescHelper.f27061a;
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        textView.setText(jVar.mo38261b(context, mo38244c()));
        TextView textView2 = (TextView) mo38241b().findViewById(R.id.securityText);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "rootView.securityText");
        textView2.setText(PublicPermDescHelper.f27061a.mo38264c(context, mo38244c()));
        TextView textView3 = (TextView) mo38241b().findViewById(R.id.commentText);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "rootView.commentText");
        textView3.setText(PublicPermDescHelper.f27061a.mo38266d(context, mo38244c()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo38237a() {
        if (!m41603g() || this.f27045c) {
            mo38240a(false);
            return;
        }
        Context context = mo38241b().getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
        ((TextView) mo38241b().findViewById(R.id.externalAccessText)).setTextColor(context.getResources().getColor(R.color.text_title));
        ((TextView) mo38241b().findViewById(R.id.externalAccessText)).setText(R.string.CreationDoc_Minutes_permissions_settings_ExternalShare_toggle);
        UDSwitch uDSwitch = (UDSwitch) mo38241b().findViewById(R.id.externalAccessSwitch);
        Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "rootView.externalAccessSwitch");
        uDSwitch.setEnabled(true);
        ((UDSwitch) mo38241b().findViewById(R.id.externalAccessSwitch)).setOnCheckedChangeListener(new C10005c(this));
        PublicPermDescHelper jVar = PublicPermDescHelper.f27061a;
        Context context2 = mo38241b().getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "rootView.context");
        String a = jVar.mo38258a(context2, mo38244c());
        TextView textView = (TextView) mo38241b().findViewById(R.id.shareText);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.shareText");
        textView.setText(a);
        ((UDSwitch) mo38241b().findViewById(R.id.shareSwitch)).setOnCheckedChangeListener(new C10006d(this));
    }

    /* renamed from: a */
    public void setViewDelegate(IDocPermissionSetContract.IView.IViewDelegate aVar) {
        this.f27044b = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetView$initCommentPart$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.d$b */
    public static final class C10004b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ DocPermissionSetView f27050a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10004b(DocPermissionSetView dVar) {
            this.f27050a = dVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            IDocPermissionSetContract.IView.IViewDelegate aVar = this.f27050a.f27044b;
            if (aVar != null) {
                aVar.mo38208e();
            }
            PermissionAnalyticV2.f25731a.mo36696v();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetView$initManagerCollaboratorPart$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.d$e */
    public static final class C10007e extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ DocPermissionSetView f27053a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10007e(DocPermissionSetView dVar) {
            this.f27053a = dVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            IDocPermissionSetContract.IView.IViewDelegate aVar = this.f27053a.f27044b;
            if (aVar != null) {
                aVar.mo38206c();
            }
            PermissionAnalyticV2.f25731a.mo36694t();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetView$initSecurityPart$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.d$f */
    public static final class C10008f extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ DocPermissionSetView f27054a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10008f(DocPermissionSetView dVar) {
            this.f27054a = dVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            IDocPermissionSetContract.IView.IViewDelegate aVar = this.f27054a.f27044b;
            if (aVar != null) {
                aVar.mo38207d();
            }
            PermissionAnalyticV2.f25731a.mo36695u();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetView$initTitleBar$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.d$g */
    public static final class C10009g extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ DocPermissionSetView f27055a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10009g(DocPermissionSetView dVar) {
            this.f27055a = dVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            IDocPermissionSetContract.IView.IViewDelegate aVar = this.f27055a.f27044b;
            if (aVar != null) {
                aVar.mo38210g();
            }
            PermissionAnalyticV2.m39698s();
        }
    }

    /* renamed from: b */
    public void mo38242b(DocPermSetInfo docPermSetInfo) {
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "<set-?>");
        this.f27048f = docPermSetInfo;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.IDocPermissionSetContract.IView
    /* renamed from: a */
    public void mo38239a(DocPermSetInfo docPermSetInfo) {
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        mo38242b(docPermSetInfo);
        m41607k();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.IDocPermissionSetContract.IView
    /* renamed from: d */
    public void mo38246d(boolean z) {
        if (z) {
            m41600d().mo45304d();
        } else {
            m41600d().mo45303c();
        }
    }

    /* renamed from: a */
    public void mo38240a(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        DividerTextView dividerTextView = (DividerTextView) mo38241b().findViewById(R.id.externalShareTitle);
        Intrinsics.checkExpressionValueIsNotNull(dividerTextView, "rootView.externalShareTitle");
        dividerTextView.setVisibility(i);
        LinearLayout linearLayout = (LinearLayout) mo38241b().findViewById(R.id.externalAccessLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.externalAccessLayout");
        linearLayout.setVisibility(i);
        mo38243b(z);
    }

    /* renamed from: b */
    public void mo38243b(boolean z) {
        if (!m41608l() || !z) {
            LinearLayout linearLayout = (LinearLayout) mo38241b().findViewById(R.id.shareLayout);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.shareLayout");
            linearLayout.setVisibility(8);
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) mo38241b().findViewById(R.id.shareLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "rootView.shareLayout");
        linearLayout2.setVisibility(0);
    }

    /* renamed from: c */
    public void mo38245c(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        DividerTextView dividerTextView = (DividerTextView) mo38241b().findViewById(R.id.managerCollaboratorTitle);
        Intrinsics.checkExpressionValueIsNotNull(dividerTextView, "rootView.managerCollaboratorTitle");
        dividerTextView.setVisibility(i);
        LinearLayout linearLayout = (LinearLayout) mo38241b().findViewById(R.id.managerCollaboratorLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.managerCollaboratorLayout");
        linearLayout.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "buttonView", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.d$c */
    public static final class C10005c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ DocPermissionSetView f27051a;

        C10005c(DocPermissionSetView dVar) {
            this.f27051a = dVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            IDocPermissionSetContract.IView.IViewDelegate aVar;
            Intrinsics.checkExpressionValueIsNotNull(compoundButton, "buttonView");
            if (compoundButton.isPressed() && (aVar = this.f27051a.f27044b) != null) {
                aVar.mo38201a(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "buttonView", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.d$d */
    public static final class C10006d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ DocPermissionSetView f27052a;

        C10006d(DocPermissionSetView dVar) {
            this.f27052a = dVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Intrinsics.checkExpressionValueIsNotNull(compoundButton, "buttonView");
            if (compoundButton.isPressed()) {
                IDocPermissionSetContract.IView.IViewDelegate aVar = this.f27052a.f27044b;
                if (aVar != null) {
                    aVar.mo38204b(z);
                }
                PermissionAnalyticV2.f25731a.mo36690f(z);
            }
        }
    }

    public DocPermissionSetView(View view, DocPermSetInfo docPermSetInfo) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        this.f27047e = view;
        this.f27048f = docPermSetInfo;
    }
}
