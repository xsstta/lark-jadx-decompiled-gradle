package com.bytedance.ee.bear.middleground.permission.setting.linkshare.form;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.middleground.permission.PermBitableShareAnalytic;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.LinkShareItem;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.form.IBitableShareLinkShareSettingContract;
import com.bytedance.ee.bear.middleground.permission.util.ToCUtil;
import com.bytedance.ee.bear.middleground_permission_export.model.form.IBitableSharePublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.BitableSharePermSetInfo;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 #2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0004:\u0001#B%\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0014J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\u001a\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001dH\u0002J\u0018\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001dH\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/form/BitableShareLinkShareSettingPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/form/IBitableShareLinkShareSettingContract$IModel;", "Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/form/IBitableShareLinkShareSettingContract$IView;", "Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/form/IBitableShareLinkShareSettingContract$IView$IViewDelegate;", "activity", "Landroid/app/Activity;", "model", "view", "info", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;", "(Landroid/app/Activity;Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/form/IBitableShareLinkShareSettingContract$IModel;Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/form/IBitableShareLinkShareSettingContract$IView;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;)V", "getActivity", "()Landroid/app/Activity;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getInfo", "()Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;", "isConsumer", "", "isOverSea", "create", "", "createViewDelegate", "destroy", "onShareItemClick", "linkShareItem", "Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/LinkShareItem;", "currentItemType", "", "showSafeTipsDialog", "selectType", "updateLinkShareEntity", "newLinkShareEntity", "updatePublicPermission", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.a.c */
public final class BitableShareLinkShareSettingPresenter extends BasePresenter<IBitableShareLinkShareSettingContract.IModel, IBitableShareLinkShareSettingContract.IView, IBitableShareLinkShareSettingContract.IView.IViewDelegate> implements IBitableShareLinkShareSettingContract.IView.IViewDelegate {

    /* renamed from: a */
    public static final Companion f27074a = new Companion(null);

    /* renamed from: b */
    private boolean f27075b;

    /* renamed from: c */
    private boolean f27076c;

    /* renamed from: d */
    private final C68289a f27077d = new C68289a();

    /* renamed from: e */
    private final Activity f27078e;

    /* renamed from: f */
    private final BitableSharePermSetInfo f27079f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IBitableShareLinkShareSettingContract.IView.IViewDelegate createViewDelegate() {
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/form/BitableShareLinkShareSettingPresenter$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final Activity mo38316b() {
        return this.f27078e;
    }

    /* renamed from: c */
    public final BitableSharePermSetInfo mo38317c() {
        return this.f27079f;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f27077d.dispose();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        boolean z;
        super.create();
        al d = C4511g.m18594d();
        Intrinsics.checkExpressionValueIsNotNull(d, "InfoProvideServiceImp.getInstance()");
        this.f27075b = d.mo17345F();
        AccountService.Account f = ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
        boolean a = ((AbstractC5586d) KoinJavaComponent.m268613a(AbstractC5586d.class, null, null, 6, null)).mo22259a();
        if (ToCUtil.f26828a.mo37760b(f) || a) {
            z = true;
        } else {
            z = false;
        }
        this.f27076c = z;
        PermBitableShareAnalytic.f25618a.mo36530d();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.a.c$c */
    public static final class C10018c<T> implements Consumer<SimpleRequestResult> {

        /* renamed from: a */
        final /* synthetic */ BitableShareLinkShareSettingPresenter f27082a;

        /* renamed from: b */
        final /* synthetic */ int f27083b;

        C10018c(BitableShareLinkShareSettingPresenter cVar, int i) {
            this.f27082a = cVar;
            this.f27083b = i;
        }

        /* renamed from: a */
        public final void accept(SimpleRequestResult simpleRequestResult) {
            this.f27082a.mo38313a(this.f27083b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.a.c$f */
    public static final class C10021f<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BitableShareLinkShareSettingPresenter f27087a;

        C10021f(BitableShareLinkShareSettingPresenter cVar) {
            this.f27087a = cVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("BitableShareLinkShareSettingPresenter", "updatePublicPermission()...", th);
            ((IBitableShareLinkShareSettingContract.IView) this.f27087a.getView()).mo38326b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.a.c$d */
    public static final class C10019d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BitableShareLinkShareSettingPresenter f27084a;

        C10019d(BitableShareLinkShareSettingPresenter cVar) {
            this.f27084a = cVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("BitableShareLinkShareSettingPresenter", "updateLinkShareEntity()...", th);
            ((IBitableShareLinkShareSettingContract.IView) this.f27084a.getView()).mo38326b();
            Toast.showFailureText(this.f27084a.mo38316b(), (int) R.string.Doc_Facade_SaveFailed);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground_permission_export/model/form/IBitableSharePublicPermission;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.a.c$e */
    public static final class C10020e<T> implements Consumer<IBitableSharePublicPermission> {

        /* renamed from: a */
        final /* synthetic */ BitableShareLinkShareSettingPresenter f27085a;

        /* renamed from: b */
        final /* synthetic */ int f27086b;

        C10020e(BitableShareLinkShareSettingPresenter cVar, int i) {
            this.f27085a = cVar;
            this.f27086b = i;
        }

        /* renamed from: a */
        public final void accept(IBitableSharePublicPermission iBitableSharePublicPermission) {
            ((IBitableShareLinkShareSettingContract.IView) this.f27085a.getView()).mo38326b();
            ((IBitableShareLinkShareSettingContract.IView) this.f27085a.getView()).mo38324a(this.f27086b);
            BitableSharePermSetInfo c = this.f27085a.mo38317c();
            Intrinsics.checkExpressionValueIsNotNull(iBitableSharePublicPermission, "it");
            c.mo38780a(iBitableSharePublicPermission);
            PermBitableShareAnalytic.f25618a.mo36525a(iBitableSharePublicPermission.getReportJson());
        }
    }

    /* renamed from: b */
    private final void m41691b(int i) {
        new BearUDDialogBuilder(this.f27078e).mo45344a(R.string.Bitable_Form_NoticeForFormSharingTitle).mo45362d(R.string.Bitable_Form_NoticeForFormSharingDesc).mo45360c(8388611).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_Confirm, new DialogInterface$OnClickListenerC10017b(this, i)).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, (DialogInterface.OnClickListener) null).mo45359b();
    }

    /* renamed from: a */
    public final void mo38313a(int i) {
        this.f27077d.mo237937a(((IBitableShareLinkShareSettingContract.IModel) getModel()).mo38310a().mo237985a(C11678b.m48481e()).mo238001b(new C10020e(this, i), new C10021f(this)));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.a.c$b */
    public static final class DialogInterface$OnClickListenerC10017b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BitableShareLinkShareSettingPresenter f27080a;

        /* renamed from: b */
        final /* synthetic */ int f27081b;

        DialogInterface$OnClickListenerC10017b(BitableShareLinkShareSettingPresenter cVar, int i) {
            this.f27080a = cVar;
            this.f27081b = i;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f27080a.mo38314a(4, this.f27081b);
        }
    }

    /* renamed from: a */
    public final void mo38314a(int i, int i2) {
        ((IBitableShareLinkShareSettingContract.IView) getView()).mo38323a();
        this.f27077d.mo237937a(((IBitableShareLinkShareSettingContract.IModel) getModel()).mo38311a(i).mo237985a(C11678b.m48481e()).mo238001b(new C10018c(this, i2), new C10019d(this)));
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.form.IBitableShareLinkShareSettingContract.IView.IViewDelegate
    /* renamed from: a */
    public void mo38315a(LinkShareItem linkShareItem, int i) {
        int i2;
        if (linkShareItem == null) {
            C13479a.m54758a("BitableShareLinkShareSettingPresenter", "onShareItemClick()...linkShareItem is null");
        } else if (linkShareItem.getType() == i) {
            C13479a.m54764b("BitableShareLinkShareSettingPresenter", "onShareItemClick()...linkShareItem is current");
        } else {
            int type = linkShareItem.getType();
            if (type == 10) {
                i2 = 2;
                mo38314a(2, linkShareItem.getType());
            } else if (type != 11) {
                i2 = 0;
                mo38314a(0, linkShareItem.getType());
            } else {
                i2 = 4;
                if (!this.f27076c || !this.f27075b) {
                    m41691b(linkShareItem.getType());
                } else {
                    mo38314a(4, linkShareItem.getType());
                }
            }
            PermBitableShareAnalytic.f25618a.mo36524a(i2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BitableShareLinkShareSettingPresenter(Activity activity, IBitableShareLinkShareSettingContract.IModel aVar, IBitableShareLinkShareSettingContract.IView bVar, BitableSharePermSetInfo bitableSharePermSetInfo) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(bitableSharePermSetInfo, "info");
        this.f27078e = activity;
        this.f27079f = bitableSharePermSetInfo;
    }
}
