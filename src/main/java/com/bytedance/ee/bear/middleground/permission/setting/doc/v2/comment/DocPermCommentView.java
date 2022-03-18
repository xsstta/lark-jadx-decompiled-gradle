package com.bytedance.ee.bear.middleground.permission.setting.doc.v2.comment;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.setting.SelectItemView;
import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.PublicPermDescHelper;
import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.comment.IDocPermCommentContract;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.C11824c;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0005H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/comment/DocPermCommentView;", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/comment/IDocPermCommentContract$IView;", "rootView", "Landroid/view/View;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "(Landroid/view/View;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;)V", "delegate", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/comment/IDocPermCommentContract$IView$IViewDelegate;", "loadingDialog", "Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "getLoadingDialog", "()Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "loadingDialog$delegate", "Lkotlin/Lazy;", "create", "", "destroy", "setLoading", "visible", "", "setViewDelegate", "viewDelegate", "updateView", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.a.d */
public class DocPermCommentView implements IDocPermCommentContract.IView {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f26949a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DocPermCommentView.class), "loadingDialog", "getLoadingDialog()Lcom/bytedance/ee/bear/widgets/LoadingDialog;"))};

    /* renamed from: b */
    public IDocPermCommentContract.IView.IViewDelegate f26950b;

    /* renamed from: c */
    public final View f26951c;

    /* renamed from: d */
    public DocPermSetInfo f26952d;

    /* renamed from: e */
    private final Lazy f26953e = LazyKt.lazy(new C9970e(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.a.d$c */
    static final class View$OnClickListenerC9968c implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC9968c f26956a = new View$OnClickListenerC9968c();

        View$OnClickListenerC9968c() {
        }

        public final void onClick(View view) {
        }
    }

    /* renamed from: a */
    private final C11824c m41477a() {
        Lazy lazy = this.f26953e;
        KProperty kProperty = f26949a[0];
        return (C11824c) lazy.getValue();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.a.d$e */
    static final class C9970e extends Lambda implements Function0<C11824c> {
        final /* synthetic */ DocPermCommentView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9970e(DocPermCommentView dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11824c invoke() {
            return new C11824c(this.this$0.f26951c.getContext());
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        PublicPermDescHelper jVar = PublicPermDescHelper.f27061a;
        Context context = this.f26951c.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
        ((SelectItemView) this.f26951c.findViewById(R.id.commentReadItem)).setText(jVar.mo38267e(context));
        ((SelectItemView) this.f26951c.findViewById(R.id.commentReadItem)).setOnClickListener(new C9966a(this));
        PublicPermDescHelper jVar2 = PublicPermDescHelper.f27061a;
        Context context2 = this.f26951c.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "rootView.context");
        ((SelectItemView) this.f26951c.findViewById(R.id.commentEditItem)).setText(jVar2.mo38268f(context2));
        ((SelectItemView) this.f26951c.findViewById(R.id.commentEditItem)).setOnClickListener(new C9967b(this));
        this.f26951c.setOnClickListener(View$OnClickListenerC9968c.f26956a);
        ((BaseTitleBar) this.f26951c.findViewById(R.id.titleBar)).setLeftClickListener(new C9969d(this));
        PermissionAnalyticV2.f25731a.mo36679A();
    }

    /* renamed from: a */
    public void setViewDelegate(IDocPermCommentContract.IView.IViewDelegate aVar) {
        this.f26950b = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/doc/v2/comment/DocPermCommentView$create$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.a.d$a */
    public static final class C9966a extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ DocPermCommentView f26954a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9966a(DocPermCommentView dVar) {
            this.f26954a = dVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            if (!this.f26954a.f26952d.mo38807P()) {
                IDocPermCommentContract.IView.IViewDelegate aVar = this.f26954a.f26950b;
                if (aVar != null) {
                    aVar.mo38167c();
                }
                PermissionAnalyticV2.f25731a.mo36682D();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/doc/v2/comment/DocPermCommentView$create$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.a.d$b */
    public static final class C9967b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ DocPermCommentView f26955a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9967b(DocPermCommentView dVar) {
            this.f26955a = dVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            if (!this.f26955a.f26952d.mo38808Q()) {
                IDocPermCommentContract.IView.IViewDelegate aVar = this.f26955a.f26950b;
                if (aVar != null) {
                    aVar.mo38166b();
                }
                PermissionAnalyticV2.f25731a.mo36681C();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/doc/v2/comment/DocPermCommentView$create$4", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.a.d$d */
    public static final class C9969d extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ DocPermCommentView f26957a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9969d(DocPermCommentView dVar) {
            this.f26957a = dVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            if (this.f26957a.f26951c.getContext() instanceof Activity) {
                Context context = this.f26957a.f26951c.getContext();
                if (context != null) {
                    ((Activity) context).onBackPressed();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                }
            }
            PermissionAnalyticV2.f25731a.mo36680B();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.comment.IDocPermCommentContract.IView
    /* renamed from: a */
    public void mo38173a(boolean z) {
        if (z) {
            m41477a().mo45304d();
        } else {
            m41477a().mo45303c();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.comment.IDocPermCommentContract.IView
    /* renamed from: a */
    public void mo38172a(DocPermSetInfo docPermSetInfo) {
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        this.f26952d = docPermSetInfo;
        IDocPublicPermission j = docPermSetInfo.mo38837j();
        SelectItemView selectItemView = (SelectItemView) this.f26951c.findViewById(R.id.commentReadItem);
        Intrinsics.checkExpressionValueIsNotNull(selectItemView, "rootView.commentReadItem");
        selectItemView.setSelected(j.isCommentWithRead());
        SelectItemView selectItemView2 = (SelectItemView) this.f26951c.findViewById(R.id.commentEditItem);
        Intrinsics.checkExpressionValueIsNotNull(selectItemView2, "rootView.commentEditItem");
        selectItemView2.setSelected(j.isCommentWithEdit());
    }

    public DocPermCommentView(View view, DocPermSetInfo docPermSetInfo) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        this.f26951c = view;
        this.f26952d = docPermSetInfo;
    }
}
