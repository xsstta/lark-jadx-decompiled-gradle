package com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage;

import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.collaborator.InviteMembersUtils;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorManagerContract;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0004B%\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0000H\u0014J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0006\u0010\u001a\u001a\u00020\u0011J\b\u0010\u001b\u001a\u00020\u0014H\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\u000e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0011J\u0006\u0010 \u001a\u00020\u0014R\u000e\u0010\f\u001a\u00020\rXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorManagerPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorManagerContract$IModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorManagerContract$IView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorManagerContract$IView$IViewDelegate;", "model", "view", "activity", "Landroidx/fragment/app/FragmentActivity;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorManagerContract$IModel;Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorManagerContract$IView;Landroidx/fragment/app/FragmentActivity;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;)V", "TAG", "", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "hasReportViewEvent", "", "showSinglePageTab", "checkLockState", "", "create", "createViewDelegate", "destroy", "doUnlock", "initLockBanner", "isShowSinglePageTab", "onBackClicked", "onInviteMemberClicked", "onUnLockClicked", "setSinglePageTabVisible", "show", "updateTitleNum", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.d */
public final class DocCollaboratorManagerPresenter extends BasePresenter<DocCollaboratorManagerContract.IModel, DocCollaboratorManagerContract.IView, DocCollaboratorManagerContract.IView.IViewDelegate> implements DocCollaboratorManagerContract.IView.IViewDelegate {

    /* renamed from: a */
    public final String f26318a = "DocCollaboratorManagerPresenter";

    /* renamed from: b */
    public final DocCollaboratorManagerContract.IView f26319b;

    /* renamed from: c */
    public final FragmentActivity f26320c;

    /* renamed from: d */
    public final DocPermSetInfo f26321d;

    /* renamed from: e */
    private final C68289a f26322e = new C68289a();

    /* renamed from: f */
    private boolean f26323f;

    /* renamed from: g */
    private boolean f26324g;

    /* renamed from: h */
    private final DocCollaboratorManagerContract.IModel f26325h;

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public DocCollaboratorManagerPresenter createViewDelegate() {
        return this;
    }

    /* renamed from: h */
    public final boolean mo37242h() {
        return this.f26323f;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        mo37237c();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f26322e.mo237935a();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorManagerContract.IView.IViewDelegate
    /* renamed from: a */
    public void mo37228a() {
        PermissionAnalyticV2.m39651b(this.f26323f, this.f26319b.mo37227e());
        this.f26320c.finish();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorManagerContract.IView.IViewDelegate
    /* renamed from: b */
    public void mo37229b() {
        InviteMembersUtils.m39847a(this.f26320c, this.f26321d, (ArrayList<UserInfo>) new ArrayList(), "", false);
        PermissionAnalyticV2.m39661c(this.f26323f, this.f26319b.mo37227e());
    }

    /* renamed from: f */
    public final void mo37240f() {
        this.f26322e.mo237937a(this.f26325h.mo37218a().mo238001b(new C9755a(this), new C9756b(this)));
    }

    /* renamed from: g */
    public final void mo37241g() {
        this.f26322e.mo237937a(this.f26325h.mo37220c().mo238001b(new C9762h(this), new C9763i(this)));
    }

    /* renamed from: c */
    public final void mo37237c() {
        int i;
        if (this.f26321d.mo38799H()) {
            if (this.f26321d.mo38844q()) {
                i = R.string.CreationMobile_Wiki_Permission_NoLongerInherit_Placeholder;
            } else {
                i = R.string.CreationMobile_ECM_PermissionRestrictionDesc;
            }
            DocCollaboratorManagerContract.IView bVar = this.f26319b;
            String string = this.f26320c.getString(i);
            Intrinsics.checkExpressionValueIsNotNull(string, "activity.getString(tipsId)");
            bVar.mo37223a(string, this.f26321d.mo38800I(), new C9759e(this));
            return;
        }
        this.f26319b.mo37224b();
    }

    /* renamed from: e */
    public final void mo37239e() {
        this.f26319b.mo37224b();
        this.f26322e.mo237937a(this.f26325h.mo37219b().mo238001b(new C9757c(this), new C9758d(this)));
        PermissionAnalyticV2.m39681h(true);
    }

    /* renamed from: d */
    public final void mo37238d() {
        int i;
        PermissionAnalyticV2.m39636a(this.f26323f, this.f26319b.mo37227e());
        if (this.f26321d.mo38844q()) {
            i = R.string.CreationMobile_Wiki_Permission_RestoreInherit_Placeholder;
        } else {
            i = R.string.CreationMobile_ECM_PermissionChangeDesc;
        }
        ((IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null)).mo40651a(this.f26321d.mo38827c(), String.valueOf(this.f26321d.mo38825b()), new BearUDDialogBuilder(this.f26320c).mo45344a(R.string.CreationMobile_Wiki_Permission_ChangePermission_Title).mo45362d(i).mo45360c(8388611).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_Confirm, new DialogInterface$OnClickListenerC9760f(this)).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, DialogInterface$OnClickListenerC9761g.f26332a).mo45359b());
        PermissionAnalyticV2.m39583E();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorManagerPresenter$initLockBanner$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.d$e */
    public static final class C9759e extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorManagerPresenter f26330a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9759e(DocCollaboratorManagerPresenter dVar) {
            this.f26330a = dVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            this.f26330a.mo37238d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.d$b */
    public static final class C9756b<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorManagerPresenter f26327a;

        C9756b(DocCollaboratorManagerPresenter dVar) {
            this.f26327a = dVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a(this.f26327a.f26318a, "checkLockState()...", th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocPublicPermission;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.d$a */
    public static final class C9755a<T> implements Consumer<IDocPublicPermission> {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorManagerPresenter f26326a;

        C9755a(DocCollaboratorManagerPresenter dVar) {
            this.f26326a = dVar;
        }

        /* renamed from: a */
        public final void accept(IDocPublicPermission iDocPublicPermission) {
            DocPermSetInfo docPermSetInfo = this.f26326a.f26321d;
            Intrinsics.checkExpressionValueIsNotNull(iDocPublicPermission, "it");
            docPermSetInfo.mo38819a(iDocPublicPermission);
            this.f26326a.mo37237c();
            PermissionAnalyticV2.m39607a(iDocPublicPermission.getReportJson());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.d$c */
    public static final class C9757c<T> implements Consumer<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorManagerPresenter f26328a;

        C9757c(DocCollaboratorManagerPresenter dVar) {
            this.f26328a = dVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            Toast.showSuccessText(this.f26328a.f26320c, (int) R.string.CreationMobile_Wiki_Restored_Toast);
            ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36638a().mo36646a(2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.d$h */
    public static final class C9762h<T> implements Consumer<Integer> {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorManagerPresenter f26333a;

        C9762h(DocCollaboratorManagerPresenter dVar) {
            this.f26333a = dVar;
        }

        /* renamed from: a */
        public final void accept(Integer num) {
            DocCollaboratorManagerContract.IView bVar = this.f26333a.f26319b;
            Intrinsics.checkExpressionValueIsNotNull(num, "it");
            bVar.mo37222a(num.intValue());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.d$i */
    public static final class C9763i<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorManagerPresenter f26334a;

        C9763i(DocCollaboratorManagerPresenter dVar) {
            this.f26334a = dVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a(this.f26334a.f26318a, "updateTitleNum()...error", th);
            this.f26334a.f26319b.mo37222a(0);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.d$d */
    public static final class C9758d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorManagerPresenter f26329a;

        C9758d(DocCollaboratorManagerPresenter dVar) {
            this.f26329a = dVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a(this.f26329a.f26318a, "onUnLockClicked()...", th);
            ((DocCollaboratorManagerContract.IView) this.f26329a.getView()).mo37221a();
            Toast.showFailureText(this.f26329a.f26320c, (int) R.string.CreationMobile_Wiki_CannotRestore_Toast);
        }
    }

    /* renamed from: a */
    public final void mo37236a(boolean z) {
        this.f26323f = z;
        if (z) {
            this.f26319b.mo37226d();
        } else {
            this.f26319b.mo37225c();
        }
        if (!this.f26324g) {
            this.f26324g = true;
            PermissionAnalyticV2.m39635a(z);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.d$f */
    public static final class DialogInterface$OnClickListenerC9760f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorManagerPresenter f26331a;

        DialogInterface$OnClickListenerC9760f(DocCollaboratorManagerPresenter dVar) {
            this.f26331a = dVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f26331a.mo37239e();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.d$g */
    public static final class DialogInterface$OnClickListenerC9761g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC9761g f26332a = new DialogInterface$OnClickListenerC9761g();

        DialogInterface$OnClickListenerC9761g() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            PermissionAnalyticV2.m39681h(false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DocCollaboratorManagerPresenter(DocCollaboratorManagerContract.IModel aVar, DocCollaboratorManagerContract.IView bVar, FragmentActivity fragmentActivity, DocPermSetInfo docPermSetInfo) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        this.f26325h = aVar;
        this.f26319b = bVar;
        this.f26320c = fragmentActivity;
        this.f26321d = docPermSetInfo;
    }
}
