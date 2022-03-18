package com.bytedance.ee.bear.middleground.permission.setting.doc.v2.security;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.DocPermissionSetViewModel;
import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.DocPermissionSetViewModelFactory;
import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.DocPublicPermErrorHandler;
import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.security.IDocPermSecurityContract;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0004B%\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u0015H\u0016J\b\u0010\u001d\u001a\u00020\u0015H\u0016J\u0012\u0010\u001e\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\b\u0010!\u001a\u00020\u0015H\u0002R\u000e\u0010\f\u001a\u00020\rXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/security/DocPermSecurityPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/security/IDocPermSecurityContract$IModel;", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/security/IDocPermSecurityContract$IView;", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/security/IDocPermSecurityContract$IView$IViewDelegate;", "model", "view", "fragment", "Landroidx/fragment/app/Fragment;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "(Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/security/IDocPermSecurityContract$IModel;Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/security/IDocPermSecurityContract$IView;Landroidx/fragment/app/Fragment;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;)V", "TAG", "", "viewModel", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetViewModel;", "getViewModel", "()Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "create", "", "createViewDelegate", "getCallback", "Lcom/bytedance/ee/bear/middleground_permission_export/model/SimpleRequestCallback;", "isActive", "", "onClickEditItem", "onClickFaItem", "onClickReadItem", "onRequestFailed", "throwable", "", "onRequestSucceed", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c.c */
public final class DocPermSecurityPresenter extends BasePresenter<IDocPermSecurityContract.IModel, IDocPermSecurityContract.IView, IDocPermSecurityContract.IView.IViewDelegate> implements IDocPermSecurityContract.IView.IViewDelegate {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f27019a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DocPermSecurityPresenter.class), "viewModel", "getViewModel()Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetViewModel;"))};

    /* renamed from: b */
    public final IDocPermSecurityContract.IView f27020b;

    /* renamed from: c */
    public final Fragment f27021c;

    /* renamed from: d */
    public DocPermSetInfo f27022d;

    /* renamed from: e */
    private final String f27023e = "DocPermSecurityPresenter";

    /* renamed from: f */
    private final Lazy f27024f = LazyKt.lazy(new C9994c(this));

    /* renamed from: g */
    private final IDocPermSecurityContract.IModel f27025g;

    /* renamed from: g */
    private final DocPermissionSetViewModel m41567g() {
        Lazy lazy = this.f27024f;
        KProperty kProperty = f27019a[0];
        return (DocPermissionSetViewModel) lazy.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IDocPermSecurityContract.IView.IViewDelegate createViewDelegate() {
        return this;
    }

    /* renamed from: h */
    private final AbstractC10169g m41568h() {
        return new C9993b(this);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.security.IDocPermSecurityContract.IView.IViewDelegate
    /* renamed from: b */
    public void mo38225b() {
        this.f27025g.mo38220a(m41568h());
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.security.IDocPermSecurityContract.IView.IViewDelegate
    /* renamed from: c */
    public void mo38226c() {
        this.f27025g.mo38221b(m41568h());
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.security.IDocPermSecurityContract.IView.IViewDelegate
    /* renamed from: d */
    public void mo38227d() {
        this.f27025g.mo38222c(m41568h());
    }

    /* renamed from: f */
    public final void mo38229f() {
        Log.i(this.f27023e, "onRequestSucceed()...");
        m41567g().fetchPublicPermission();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/doc/v2/security/DocPermSecurityPresenter$getCallback$1", "Lcom/bytedance/ee/bear/middleground_permission_export/model/SimpleRequestCallback;", "onRequestFail", "", "throwable", "", "onRequestStart", "onRequestSuccess", "permission", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c.c$b */
    public static final class C9993b implements AbstractC10169g {

        /* renamed from: a */
        final /* synthetic */ DocPermSecurityPresenter f27027a;

        @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
        /* renamed from: a */
        public void mo17110a() {
            if (this.f27027a.mo38228e()) {
                this.f27027a.f27020b.mo38234a(true);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9993b(DocPermSecurityPresenter cVar) {
            this.f27027a = cVar;
        }

        @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
        /* renamed from: a */
        public void mo17111a(int i) {
            if (this.f27027a.mo38228e()) {
                this.f27027a.mo38229f();
            }
        }

        @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
        /* renamed from: a */
        public void mo17112a(Throwable th) {
            if (this.f27027a.mo38228e()) {
                this.f27027a.mo38224a(th);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c.c$c */
    static final class C9994c extends Lambda implements Function0<DocPermissionSetViewModel> {
        final /* synthetic */ DocPermSecurityPresenter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9994c(DocPermSecurityPresenter cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final DocPermissionSetViewModel invoke() {
            return (DocPermissionSetViewModel) aj.m5367a(this.this$0.f27021c.requireActivity(), DocPermissionSetViewModelFactory.f27058a.mo38255a(this.this$0.f27022d)).mo6005a(DocPermissionSetViewModel.class);
        }
    }

    /* renamed from: e */
    public final boolean mo38228e() {
        if (!C13726a.m55674a(this.f27021c.getContext()) || !this.f27021c.isAdded()) {
            return false;
        }
        return true;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f27020b.mo38233a(this.f27022d);
        m41567g().getPermSetInfoLiveData().mo5923a(this.f27021c, new C9992a(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c.c$a */
    public static final class C9992a<T> implements AbstractC1178x<DocPermSetInfo> {

        /* renamed from: a */
        final /* synthetic */ DocPermSecurityPresenter f27026a;

        C9992a(DocPermSecurityPresenter cVar) {
            this.f27026a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(DocPermSetInfo docPermSetInfo) {
            DocPermSecurityPresenter cVar = this.f27026a;
            Intrinsics.checkExpressionValueIsNotNull(docPermSetInfo, "it");
            cVar.f27022d = docPermSetInfo;
            this.f27026a.f27020b.mo38234a(false);
            this.f27026a.f27020b.mo38233a(docPermSetInfo);
        }
    }

    /* renamed from: a */
    public final void mo38224a(Throwable th) {
        Log.e(this.f27023e, "onRequestFailed()...", th);
        this.f27020b.mo38234a(false);
        this.f27020b.mo38233a(this.f27022d);
        DocPublicPermErrorHandler gVar = DocPublicPermErrorHandler.f27060a;
        Context requireContext = this.f27021c.requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "fragment.requireContext()");
        gVar.mo38256a(requireContext, th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DocPermSecurityPresenter(IDocPermSecurityContract.IModel aVar, IDocPermSecurityContract.IView bVar, Fragment fragment, DocPermSetInfo docPermSetInfo) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        this.f27025g = aVar;
        this.f27020b = bVar;
        this.f27021c = fragment;
        this.f27022d = docPermSetInfo;
    }
}
