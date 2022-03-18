package com.bytedance.ee.bear.middleground.permission.setting.doc.v2.comment;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.DocPermissionSetViewModel;
import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.DocPermissionSetViewModelFactory;
import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.DocPublicPermErrorHandler;
import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.comment.IDocPermCommentContract;
import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.util.p718t.C13726a;
import com.larksuite.framework.mvp.BasePresenter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0004B%\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u0015H\u0016J\u0012\u0010\u001d\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\b\u0010 \u001a\u00020\u0015H\u0002R\u000e\u0010\f\u001a\u00020\rXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006!"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/comment/DocPermCommentPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/comment/IDocPermCommentContract$IModel;", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/comment/IDocPermCommentContract$IView;", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/comment/IDocPermCommentContract$IView$IViewDelegate;", "model", "view", "fragment", "Landroidx/fragment/app/Fragment;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "(Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/comment/IDocPermCommentContract$IModel;Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/comment/IDocPermCommentContract$IView;Landroidx/fragment/app/Fragment;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;)V", "TAG", "", "viewModel", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetViewModel;", "getViewModel", "()Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "create", "", "createViewDelegate", "getCallback", "Lcom/bytedance/ee/bear/middleground_permission_export/model/SimpleRequestCallback;", "isActive", "", "onClickEditItem", "onClickReadItem", "onRequestFailed", "throwable", "", "onRequestSucceed", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.a.c */
public final class DocPermCommentPresenter extends BasePresenter<IDocPermCommentContract.IModel, IDocPermCommentContract.IView, IDocPermCommentContract.IView.IViewDelegate> implements IDocPermCommentContract.IView.IViewDelegate {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f26940a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DocPermCommentPresenter.class), "viewModel", "getViewModel()Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetViewModel;"))};

    /* renamed from: b */
    public final IDocPermCommentContract.IView f26941b;

    /* renamed from: c */
    public final Fragment f26942c;

    /* renamed from: d */
    public DocPermSetInfo f26943d;

    /* renamed from: e */
    private final String f26944e = "DocPermCommentPresenter";

    /* renamed from: f */
    private final Lazy f26945f = LazyKt.lazy(new C9965c(this));

    /* renamed from: g */
    private final IDocPermCommentContract.IModel f26946g;

    /* renamed from: f */
    private final DocPermissionSetViewModel m41465f() {
        Lazy lazy = this.f26945f;
        KProperty kProperty = f26940a[0];
        return (DocPermissionSetViewModel) lazy.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IDocPermCommentContract.IView.IViewDelegate createViewDelegate() {
        return this;
    }

    /* renamed from: g */
    private final AbstractC10169g m41466g() {
        return new C9964b(this);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.comment.IDocPermCommentContract.IView.IViewDelegate
    /* renamed from: b */
    public void mo38166b() {
        this.f26946g.mo38162a(m41466g());
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.comment.IDocPermCommentContract.IView.IViewDelegate
    /* renamed from: c */
    public void mo38167c() {
        this.f26946g.mo38163b(m41466g());
    }

    /* renamed from: e */
    public final void mo38169e() {
        Log.i(this.f26944e, "onRequestSucceed()...");
        m41465f().fetchPublicPermission();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/doc/v2/comment/DocPermCommentPresenter$getCallback$1", "Lcom/bytedance/ee/bear/middleground_permission_export/model/SimpleRequestCallback;", "onRequestFail", "", "throwable", "", "onRequestStart", "onRequestSuccess", "permission", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.a.c$b */
    public static final class C9964b implements AbstractC10169g {

        /* renamed from: a */
        final /* synthetic */ DocPermCommentPresenter f26948a;

        @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
        /* renamed from: a */
        public void mo17110a() {
            if (this.f26948a.mo38168d()) {
                this.f26948a.f26941b.mo38173a(true);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9964b(DocPermCommentPresenter cVar) {
            this.f26948a = cVar;
        }

        @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
        /* renamed from: a */
        public void mo17111a(int i) {
            if (this.f26948a.mo38168d()) {
                this.f26948a.mo38169e();
            }
        }

        @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
        /* renamed from: a */
        public void mo17112a(Throwable th) {
            if (this.f26948a.mo38168d()) {
                this.f26948a.mo38165a(th);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.a.c$c */
    static final class C9965c extends Lambda implements Function0<DocPermissionSetViewModel> {
        final /* synthetic */ DocPermCommentPresenter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9965c(DocPermCommentPresenter cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final DocPermissionSetViewModel invoke() {
            return (DocPermissionSetViewModel) aj.m5367a(this.this$0.f26942c.requireActivity(), DocPermissionSetViewModelFactory.f27058a.mo38255a(this.this$0.f26943d)).mo6005a(DocPermissionSetViewModel.class);
        }
    }

    /* renamed from: d */
    public final boolean mo38168d() {
        if (!C13726a.m55674a(this.f26942c.getContext()) || !this.f26942c.isAdded()) {
            return false;
        }
        return true;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f26941b.mo38172a(this.f26943d);
        m41465f().getPermSetInfoLiveData().mo5923a(this.f26942c, new C9963a(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.a.c$a */
    public static final class C9963a<T> implements AbstractC1178x<DocPermSetInfo> {

        /* renamed from: a */
        final /* synthetic */ DocPermCommentPresenter f26947a;

        C9963a(DocPermCommentPresenter cVar) {
            this.f26947a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(DocPermSetInfo docPermSetInfo) {
            DocPermCommentPresenter cVar = this.f26947a;
            Intrinsics.checkExpressionValueIsNotNull(docPermSetInfo, "it");
            cVar.f26943d = docPermSetInfo;
            this.f26947a.f26941b.mo38173a(false);
            this.f26947a.f26941b.mo38172a(docPermSetInfo);
        }
    }

    /* renamed from: a */
    public final void mo38165a(Throwable th) {
        Log.e(this.f26944e, "onRequestFailed()...", th);
        this.f26941b.mo38173a(false);
        this.f26941b.mo38172a(this.f26943d);
        DocPublicPermErrorHandler gVar = DocPublicPermErrorHandler.f27060a;
        Context requireContext = this.f26942c.requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "fragment.requireContext()");
        gVar.mo38256a(requireContext, th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DocPermCommentPresenter(IDocPermCommentContract.IModel aVar, IDocPermCommentContract.IView bVar, Fragment fragment, DocPermSetInfo docPermSetInfo) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        this.f26946g = aVar;
        this.f26941b = bVar;
        this.f26942c = fragment;
        this.f26943d = docPermSetInfo;
    }
}
