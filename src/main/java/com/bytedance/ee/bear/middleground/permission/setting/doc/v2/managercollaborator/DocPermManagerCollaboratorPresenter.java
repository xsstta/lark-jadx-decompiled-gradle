package com.bytedance.ee.bear.middleground.permission.setting.doc.v2.managercollaborator;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.DocPermissionSetViewModel;
import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.DocPermissionSetViewModelFactory;
import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.DocPublicPermErrorHandler;
import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.managercollaborator.IDocPermManagerCollaboratorContract;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0004B%\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u0015H\u0016J\b\u0010\u001d\u001a\u00020\u0015H\u0016J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\u0012\u0010 \u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\b\u0010#\u001a\u00020\u0015H\u0002R\u000e\u0010\f\u001a\u00020\rXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006$"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/managercollaborator/DocPermManagerCollaboratorPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/managercollaborator/IDocPermManagerCollaboratorContract$IModel;", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/managercollaborator/IDocPermManagerCollaboratorContract$IView;", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/managercollaborator/IDocPermManagerCollaboratorContract$IView$IViewDelegate;", "model", "view", "fragment", "Landroidx/fragment/app/Fragment;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "(Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/managercollaborator/IDocPermManagerCollaboratorContract$IModel;Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/managercollaborator/IDocPermManagerCollaboratorContract$IView;Landroidx/fragment/app/Fragment;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;)V", "TAG", "", "viewModel", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetViewModel;", "getViewModel", "()Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "create", "", "createViewDelegate", "getCallback", "Lcom/bytedance/ee/bear/middleground_permission_export/model/SimpleRequestCallback;", "isActive", "", "onClickEditItem", "onClickFaItem", "onClickReadItem", "onInternalSwitch", "isChecked", "onRequestFailed", "throwable", "", "onRequestSucceed", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.b.c */
public final class DocPermManagerCollaboratorPresenter extends BasePresenter<IDocPermManagerCollaboratorContract.IModel, IDocPermManagerCollaboratorContract.IView, IDocPermManagerCollaboratorContract.IView.IViewDelegate> implements IDocPermManagerCollaboratorContract.IView.IViewDelegate {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f26970a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DocPermManagerCollaboratorPresenter.class), "viewModel", "getViewModel()Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetViewModel;"))};

    /* renamed from: b */
    public final IDocPermManagerCollaboratorContract.IView f26971b;

    /* renamed from: c */
    public final Fragment f26972c;

    /* renamed from: d */
    public DocPermSetInfo f26973d;

    /* renamed from: e */
    private final String f26974e = "DocPermManagerCollaboratorPresenter";

    /* renamed from: f */
    private final Lazy f26975f = LazyKt.lazy(new C9974c(this));

    /* renamed from: g */
    private final IDocPermManagerCollaboratorContract.IModel f26976g;

    /* renamed from: g */
    private final DocPermissionSetViewModel m41504g() {
        Lazy lazy = this.f26975f;
        KProperty kProperty = f26970a[0];
        return (DocPermissionSetViewModel) lazy.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IDocPermManagerCollaboratorContract.IView.IViewDelegate createViewDelegate() {
        return this;
    }

    /* renamed from: h */
    private final AbstractC10169g m41505h() {
        return new C9973b(this);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.managercollaborator.IDocPermManagerCollaboratorContract.IView.IViewDelegate
    /* renamed from: b */
    public void mo38188b() {
        this.f26976g.mo38180a(m41505h());
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.managercollaborator.IDocPermManagerCollaboratorContract.IView.IViewDelegate
    /* renamed from: c */
    public void mo38189c() {
        this.f26976g.mo38181b(m41505h());
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.managercollaborator.IDocPermManagerCollaboratorContract.IView.IViewDelegate
    /* renamed from: d */
    public void mo38190d() {
        this.f26976g.mo38182c(m41505h());
    }

    /* renamed from: f */
    public final void mo38192f() {
        Log.i(this.f26974e, "onRequestSucceed()...");
        m41504g().fetchPublicPermission();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/doc/v2/managercollaborator/DocPermManagerCollaboratorPresenter$getCallback$1", "Lcom/bytedance/ee/bear/middleground_permission_export/model/SimpleRequestCallback;", "onRequestFail", "", "throwable", "", "onRequestStart", "onRequestSuccess", "permission", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.b.c$b */
    public static final class C9973b implements AbstractC10169g {

        /* renamed from: a */
        final /* synthetic */ DocPermManagerCollaboratorPresenter f26978a;

        @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
        /* renamed from: a */
        public void mo17110a() {
            if (this.f26978a.mo38191e()) {
                this.f26978a.f26971b.mo38196a(true);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9973b(DocPermManagerCollaboratorPresenter cVar) {
            this.f26978a = cVar;
        }

        @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
        /* renamed from: a */
        public void mo17111a(int i) {
            if (this.f26978a.mo38191e()) {
                this.f26978a.mo38192f();
            }
        }

        @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
        /* renamed from: a */
        public void mo17112a(Throwable th) {
            if (this.f26978a.mo38191e()) {
                this.f26978a.mo38186a(th);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.b.c$c */
    static final class C9974c extends Lambda implements Function0<DocPermissionSetViewModel> {
        final /* synthetic */ DocPermManagerCollaboratorPresenter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9974c(DocPermManagerCollaboratorPresenter cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final DocPermissionSetViewModel invoke() {
            return (DocPermissionSetViewModel) aj.m5367a(this.this$0.f26972c.requireActivity(), DocPermissionSetViewModelFactory.f27058a.mo38255a(this.this$0.f26973d)).mo6005a(DocPermissionSetViewModel.class);
        }
    }

    /* renamed from: e */
    public final boolean mo38191e() {
        if (!C13726a.m55674a(this.f26972c.getContext()) || !this.f26972c.isAdded()) {
            return false;
        }
        return true;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f26971b.mo38195a(this.f26973d);
        m41504g().getPermSetInfoLiveData().mo5923a(this.f26972c, new C9972a(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.b.c$a */
    public static final class C9972a<T> implements AbstractC1178x<DocPermSetInfo> {

        /* renamed from: a */
        final /* synthetic */ DocPermManagerCollaboratorPresenter f26977a;

        C9972a(DocPermManagerCollaboratorPresenter cVar) {
            this.f26977a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(DocPermSetInfo docPermSetInfo) {
            DocPermManagerCollaboratorPresenter cVar = this.f26977a;
            Intrinsics.checkExpressionValueIsNotNull(docPermSetInfo, "it");
            cVar.f26973d = docPermSetInfo;
            this.f26977a.f26971b.mo38196a(false);
            this.f26977a.f26971b.mo38195a(docPermSetInfo);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.managercollaborator.IDocPermManagerCollaboratorContract.IView.IViewDelegate
    /* renamed from: a */
    public void mo38187a(boolean z) {
        if (z) {
            this.f26976g.mo38183d(m41505h());
        } else {
            this.f26976g.mo38184e(m41505h());
        }
    }

    /* renamed from: a */
    public final void mo38186a(Throwable th) {
        Log.e(this.f26974e, "onRequestFailed()...", th);
        this.f26971b.mo38196a(false);
        this.f26971b.mo38195a(this.f26973d);
        DocPublicPermErrorHandler gVar = DocPublicPermErrorHandler.f27060a;
        Context requireContext = this.f26972c.requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "fragment.requireContext()");
        gVar.mo38256a(requireContext, th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DocPermManagerCollaboratorPresenter(IDocPermManagerCollaboratorContract.IModel aVar, IDocPermManagerCollaboratorContract.IView bVar, Fragment fragment, DocPermSetInfo docPermSetInfo) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        this.f26976g = aVar;
        this.f26971b = bVar;
        this.f26972c = fragment;
        this.f26973d = docPermSetInfo;
    }
}
