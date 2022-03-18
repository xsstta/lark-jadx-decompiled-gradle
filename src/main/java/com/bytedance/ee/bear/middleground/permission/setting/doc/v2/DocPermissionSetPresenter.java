package com.bytedance.ee.bear.middleground.permission.setting.doc.v2;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.middleground.permission.PermFGUtils;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.IDocPermissionSetContract;
import com.bytedance.ee.bear.middleground.permission.setting.permselect.SelectPermTypeFragment;
import com.bytedance.ee.bear.middleground.permission.setting.permselect.SelectPermTypeViewModel;
import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0004B-\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0014J\b\u0010#\u001a\u00020!H\u0016J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020!H\u0016J\b\u0010(\u001a\u00020)H\u0002J\u0006\u0010*\u001a\u00020&J\b\u0010+\u001a\u00020!H\u0016J\b\u0010,\u001a\u00020!H\u0016J\u0012\u0010-\u001a\u00020!2\b\u0010.\u001a\u0004\u0018\u00010/H\u0002J\b\u00100\u001a\u00020!H\u0002J\b\u00101\u001a\u00020!H\u0016J\u0010\u00102\u001a\u00020!2\u0006\u00103\u001a\u00020&H\u0016J\u0018\u00104\u001a\u00020!2\u0006\u00103\u001a\u00020&2\u0006\u00105\u001a\u000206H\u0002J\u0018\u00107\u001a\u00020!2\u0006\u00103\u001a\u00020&2\u0006\u00105\u001a\u000206H\u0002R\u000e\u0010\u000e\u001a\u00020\u000fXD¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u001d\u0010\u001e¨\u00068"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/IDocPermissionSetContract$IModel;", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/IDocPermissionSetContract$IView;", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/IDocPermissionSetContract$IView$IViewDelegate;", "fragment", "Landroidx/fragment/app/Fragment;", "model", "view", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "pageTrigger", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/IDocPermissionSetPageTrigger;", "(Landroidx/fragment/app/Fragment;Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/IDocPermissionSetContract$IModel;Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/IDocPermissionSetContract$IView;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/IDocPermissionSetPageTrigger;)V", "TAG", "", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "compositeDisposable$delegate", "Lkotlin/Lazy;", "selectPermTypeViewModel", "Lcom/bytedance/ee/bear/middleground/permission/setting/permselect/SelectPermTypeViewModel;", "getSelectPermTypeViewModel", "()Lcom/bytedance/ee/bear/middleground/permission/setting/permselect/SelectPermTypeViewModel;", "selectPermTypeViewModel$delegate", "viewModel", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetViewModel;", "getViewModel", "()Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetViewModel;", "viewModel$delegate", "create", "", "createViewDelegate", "destroy", "externalAccessSwitch", "externalAccess", "", "finish", "getSimpleRequestCallback", "Lcom/bytedance/ee/bear/middleground_permission_export/model/SimpleRequestCallback;", "isActive", "onCommentClicked", "onManagerCollaboratorClicked", "onRequestFailed", "throwable", "", "onRequestSucceed", "onSecurityClicked", "shareExternalSwitch", "isChecked", "showLockTips", "permType", "", "updateExternalAccess", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c */
public final class DocPermissionSetPresenter extends BasePresenter<IDocPermissionSetContract.IModel, IDocPermissionSetContract.IView, IDocPermissionSetContract.IView.IViewDelegate> implements IDocPermissionSetContract.IView.IViewDelegate {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f26991a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DocPermissionSetPresenter.class), "compositeDisposable", "getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DocPermissionSetPresenter.class), "viewModel", "getViewModel()Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetViewModel;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DocPermissionSetPresenter.class), "selectPermTypeViewModel", "getSelectPermTypeViewModel()Lcom/bytedance/ee/bear/middleground/permission/setting/permselect/SelectPermTypeViewModel;"))};

    /* renamed from: b */
    public final String f26992b = "DocPermissionSetPresenter";

    /* renamed from: c */
    public final Fragment f26993c;

    /* renamed from: d */
    public final IDocPermissionSetContract.IView f26994d;

    /* renamed from: e */
    public DocPermSetInfo f26995e;

    /* renamed from: f */
    private final Lazy f26996f = LazyKt.lazy(C9982a.INSTANCE);

    /* renamed from: g */
    private final Lazy f26997g = LazyKt.lazy(new C9991j(this));

    /* renamed from: h */
    private final Lazy f26998h = LazyKt.lazy(new C9988g(this));

    /* renamed from: i */
    private final IDocPermissionSetContract.IModel f26999i;

    /* renamed from: j */
    private final IDocPermissionSetPageTrigger f27000j;

    /* renamed from: i */
    private final C68289a m41538i() {
        Lazy lazy = this.f26996f;
        KProperty kProperty = f26991a[0];
        return (C68289a) lazy.getValue();
    }

    /* renamed from: j */
    private final DocPermissionSetViewModel m41539j() {
        Lazy lazy = this.f26997g;
        KProperty kProperty = f26991a[1];
        return (DocPermissionSetViewModel) lazy.getValue();
    }

    /* renamed from: a */
    public final SelectPermTypeViewModel mo38199a() {
        Lazy lazy = this.f26998h;
        KProperty kProperty = f26991a[2];
        return (SelectPermTypeViewModel) lazy.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public IDocPermissionSetContract.IView.IViewDelegate createViewDelegate() {
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lio/reactivex/disposables/CompositeDisposable;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c$a */
    static final class C9982a extends Lambda implements Function0<C68289a> {
        public static final C9982a INSTANCE = new C9982a();

        C9982a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C68289a invoke() {
            return new C68289a();
        }
    }

    /* renamed from: k */
    private final AbstractC10169g m41540k() {
        return new C9987f(this);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.IDocPermissionSetContract.IView.IViewDelegate
    /* renamed from: c */
    public void mo38206c() {
        this.f27000j.mo38125a();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.IDocPermissionSetContract.IView.IViewDelegate
    /* renamed from: d */
    public void mo38207d() {
        this.f27000j.mo38127b();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.IDocPermissionSetContract.IView.IViewDelegate
    /* renamed from: e */
    public void mo38208e() {
        this.f27000j.mo38128c();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        m41538i().mo237935a();
    }

    /* renamed from: f */
    public final void mo38209f() {
        C13479a.m54764b(this.f26992b, "onRequestSucceed()...");
        m41539j().fetchPublicPermission();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.IDocPermissionSetContract.IView.IViewDelegate
    /* renamed from: g */
    public void mo38210g() {
        FragmentActivity activity = this.f26993c.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetPresenter$getSimpleRequestCallback$1", "Lcom/bytedance/ee/bear/middleground_permission_export/model/SimpleRequestCallback;", "onRequestFail", "", "throwable", "", "onRequestStart", "onRequestSuccess", "permission", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c$f */
    public static final class C9987f implements AbstractC10169g {

        /* renamed from: a */
        final /* synthetic */ DocPermissionSetPresenter f27008a;

        @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
        /* renamed from: a */
        public void mo17110a() {
            if (this.f27008a.mo38211h()) {
                this.f27008a.f26994d.mo38246d(true);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9987f(DocPermissionSetPresenter cVar) {
            this.f27008a = cVar;
        }

        @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
        /* renamed from: a */
        public void mo17111a(int i) {
            if (this.f27008a.mo38211h()) {
                this.f27008a.mo38209f();
            }
        }

        @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
        /* renamed from: a */
        public void mo17112a(Throwable th) {
            if (this.f27008a.mo38211h()) {
                this.f27008a.mo38200a(th);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground/permission/setting/permselect/SelectPermTypeViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c$g */
    static final class C9988g extends Lambda implements Function0<SelectPermTypeViewModel> {
        final /* synthetic */ DocPermissionSetPresenter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9988g(DocPermissionSetPresenter cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SelectPermTypeViewModel invoke() {
            return (SelectPermTypeViewModel) aj.m5366a(this.this$0.f26993c.requireActivity()).mo6005a(SelectPermTypeViewModel.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c$j */
    static final class C9991j extends Lambda implements Function0<DocPermissionSetViewModel> {
        final /* synthetic */ DocPermissionSetPresenter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9991j(DocPermissionSetPresenter cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final DocPermissionSetViewModel invoke() {
            return (DocPermissionSetViewModel) aj.m5367a(this.this$0.f26993c.requireActivity(), DocPermissionSetViewModelFactory.f27058a.mo38255a(this.this$0.f26995e)).mo6005a(DocPermissionSetViewModel.class);
        }
    }

    /* renamed from: h */
    public final boolean mo38211h() {
        if (!C13726a.m55674a(this.f26993c.getContext()) || !this.f26993c.isAdded()) {
            return false;
        }
        return true;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m41539j().fetchPublicPermission();
        m41539j().getPermSetInfoLiveData().mo5923a(this.f26993c, new C9983b(this));
        mo38199a().getDismissLiveData().mo5923a(this.f26993c, new C9984c(this));
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.IDocPermissionSetContract.IView.IViewDelegate
    /* renamed from: b */
    public void mo38204b(boolean z) {
        this.f26999i.mo38177a(z, m41540k());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c$b */
    public static final class C9983b<T> implements AbstractC1178x<DocPermSetInfo> {

        /* renamed from: a */
        final /* synthetic */ DocPermissionSetPresenter f27001a;

        C9983b(DocPermissionSetPresenter cVar) {
            this.f27001a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(DocPermSetInfo docPermSetInfo) {
            DocPermissionSetPresenter cVar = this.f27001a;
            Intrinsics.checkExpressionValueIsNotNull(docPermSetInfo, "it");
            cVar.f26995e = docPermSetInfo;
            this.f27001a.f26994d.mo38246d(false);
            this.f27001a.f26994d.mo38239a(docPermSetInfo);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c$e */
    static final class C9986e<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ DocPermissionSetPresenter f27006a;

        /* renamed from: b */
        final /* synthetic */ boolean f27007b;

        C9986e(DocPermissionSetPresenter cVar, boolean z) {
            this.f27006a = cVar;
            this.f27007b = z;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a(this.f27006a.f26992b, "externalAccessSwitch()...check lock error", th);
            this.f27006a.mo38205b(this.f27007b, 1);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c$c */
    public static final class C9984c<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DocPermissionSetPresenter f27002a;

        C9984c(DocPermissionSetPresenter cVar) {
            this.f27002a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                int permTypeValue = this.f27002a.mo38199a().getPermTypeValue();
                if (permTypeValue == 1 || permTypeValue == 2) {
                    this.f27002a.mo38205b(true, permTypeValue);
                } else {
                    ((IDocPermissionSetContract.IView) this.f27002a.getView()).mo38239a(this.f27002a.f26995e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo38200a(Throwable th) {
        C13479a.m54759a(this.f26992b, "onRequestFailed()...", th);
        this.f26994d.mo38246d(false);
        this.f26994d.mo38239a(this.f26995e);
        DocPublicPermErrorHandler gVar = DocPublicPermErrorHandler.f27060a;
        Context requireContext = this.f26993c.requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "fragment.requireContext()");
        gVar.mo38256a(requireContext, th);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c$d */
    static final class C9985d<T> implements Consumer<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DocPermissionSetPresenter f27003a;

        /* renamed from: b */
        final /* synthetic */ boolean f27004b;

        /* renamed from: c */
        final /* synthetic */ boolean f27005c;

        C9985d(DocPermissionSetPresenter cVar, boolean z, boolean z2) {
            this.f27003a = cVar;
            this.f27004b = z;
            this.f27005c = z2;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            if (!this.f27004b || !this.f27005c || !this.f27003a.f26995e.mo38847t()) {
                PermissionAnalyticV2.m39598a(PermissionAnalyticV2.f25731a, this.f27005c, false, 2, (Object) null);
                Intrinsics.checkExpressionValueIsNotNull(bool, "it");
                if (bool.booleanValue()) {
                    this.f27003a.mo38202a(this.f27005c, 1);
                } else {
                    this.f27003a.mo38205b(this.f27005c, 1);
                }
            } else {
                SelectPermTypeFragment.Companion aVar = SelectPermTypeFragment.f26874f;
                FragmentActivity requireActivity = this.f27003a.f26993c.requireActivity();
                Intrinsics.checkExpressionValueIsNotNull(requireActivity, "fragment.requireActivity()");
                Intrinsics.checkExpressionValueIsNotNull(bool, "it");
                aVar.mo38118a(requireActivity, bool.booleanValue(), "permission_set");
                PermissionAnalyticV2.f25731a.mo36685a(this.f27005c, true);
            }
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.IDocPermissionSetContract.IView.IViewDelegate
    /* renamed from: a */
    public void mo38201a(boolean z) {
        boolean z2;
        if (!this.f26995e.mo38844q() || !this.f26995e.ab() || !PermFGUtils.m39534c()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 || this.f26995e.mo38847t() || !this.f26995e.mo38849u()) {
            m41538i().mo237937a(this.f26999i.mo38175a(z).mo238001b(new C9985d(this, z2, z), new C9986e(this, z)));
            return;
        }
        if (z) {
            mo38205b(z, 2);
        } else {
            mo38205b(z, 1);
        }
        PermissionAnalyticV2.m39598a(PermissionAnalyticV2.f25731a, z, false, 2, (Object) null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c$h */
    public static final class DialogInterface$OnClickListenerC9989h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DocPermissionSetPresenter f27009a;

        /* renamed from: b */
        final /* synthetic */ boolean f27010b;

        /* renamed from: c */
        final /* synthetic */ int f27011c;

        DialogInterface$OnClickListenerC9989h(DocPermissionSetPresenter cVar, boolean z, int i) {
            this.f27009a = cVar;
            this.f27010b = z;
            this.f27011c = i;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f27009a.mo38205b(this.f27010b, this.f27011c);
            PermissionAnalyticV2.m39626a("external_switch", true);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c$i */
    public static final class DialogInterface$OnClickListenerC9990i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DocPermissionSetPresenter f27012a;

        DialogInterface$OnClickListenerC9990i(DocPermissionSetPresenter cVar) {
            this.f27012a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ((IDocPermissionSetContract.IView) this.f27012a.getView()).mo38239a(this.f27012a.f26995e);
            PermissionAnalyticV2.m39626a("external_switch", true);
        }
    }

    /* renamed from: b */
    public final void mo38205b(boolean z, int i) {
        this.f26999i.mo38176a(z, i, m41540k());
    }

    /* renamed from: a */
    public final void mo38202a(boolean z, int i) {
        int i2;
        if (this.f26995e.mo38844q()) {
            i2 = R.string.CreationMobile_Wiki_Permission_SettingsDivision_Placeholder;
        } else {
            i2 = R.string.CreationMobile_ECM_PermissionChangedDesc;
        }
        Context requireContext = this.f26993c.requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "fragment.requireContext()");
        ((IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null)).mo40651a(this.f26995e.mo38827c(), String.valueOf(this.f26995e.mo38825b()), new BearUDDialogBuilder(requireContext).mo45344a(R.string.CreationMobile_Wiki_Permission_ChangePermission_Title).mo45362d(i2).mo45360c(8388611).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_Confirm, new DialogInterface$OnClickListenerC9989h(this, z, i)).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, new DialogInterface$OnClickListenerC9990i(this)).mo45359b());
        PermissionAnalyticV2.m39643b("external_switch");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DocPermissionSetPresenter(Fragment fragment, IDocPermissionSetContract.IModel aVar, IDocPermissionSetContract.IView bVar, DocPermSetInfo docPermSetInfo, IDocPermissionSetPageTrigger iVar) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        Intrinsics.checkParameterIsNotNull(iVar, "pageTrigger");
        this.f26993c = fragment;
        this.f26999i = aVar;
        this.f26994d = bVar;
        this.f26995e = docPermSetInfo;
        this.f27000j = iVar;
    }
}
