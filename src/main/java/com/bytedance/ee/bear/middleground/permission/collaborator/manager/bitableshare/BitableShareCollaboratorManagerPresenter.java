package com.bytedance.ee.bear.middleground.permission.collaborator.manager.bitableshare;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.middleground.permission.PermBitableShareAnalytic;
import com.bytedance.ee.bear.middleground.permission.collaborator.InviteMembersUtils;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.bitableshare.IFormCollaboratorManagerContract;
import com.bytedance.ee.bear.middleground_permission_export.model.MemberChangeListener;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.BitableSharePermSetInfo;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 32\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00042\u00020\u0005:\u00013B5\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0004H\u0014J\b\u0010$\u001a\u00020\"H\u0016J\b\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020\"H\u0016J\b\u0010(\u001a\u00020\"H\u0016J\b\u0010)\u001a\u00020\"H\u0016J\b\u0010*\u001a\u00020\"H\u0002J\u0010\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020\u000fH\u0002J\u0010\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020\"2\u0006\u00101\u001a\u000202H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00064"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/BitableShareCollaboratorManagerPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/IFormCollaboratorManagerContract$IModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/IFormCollaboratorManagerContract$IView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/IFormCollaboratorManagerContract$IView$IViewDelegate;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/MemberChangeListener;", "activity", "Landroidx/fragment/app/FragmentActivity;", "fragment", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/BitableShareCollaboratorManagerFragment;", "model", "view", "info", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;", "shareUserInfoResult", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "(Landroidx/fragment/app/FragmentActivity;Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/BitableShareCollaboratorManagerFragment;Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/IFormCollaboratorManagerContract$IModel;Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/IFormCollaboratorManagerContract$IView;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getFragment", "()Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/BitableShareCollaboratorManagerFragment;", "getInfo", "()Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;", "getModel", "()Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/IFormCollaboratorManagerContract$IModel;", "getShareUserInfoResult", "()Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "setShareUserInfoResult", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;)V", "getView", "()Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/IFormCollaboratorManagerContract$IView;", "create", "", "createViewDelegate", "destroy", "isConnected", "", "loadMore", "onBackClicked", "onInviteMemberClicked", "onLoadFailed", "onLoadSucceed", "it", "onMemberChange", "from", "", "onRemoveUserClicked", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.d */
public final class BitableShareCollaboratorManagerPresenter extends BasePresenter<IFormCollaboratorManagerContract.IModel, IFormCollaboratorManagerContract.IView, IFormCollaboratorManagerContract.IView.IViewDelegate> implements IFormCollaboratorManagerContract.IView.IViewDelegate, MemberChangeListener {

    /* renamed from: a */
    public static final Companion f26279a = new Companion(null);

    /* renamed from: b */
    private final C68289a f26280b = new C68289a();

    /* renamed from: c */
    private final FragmentActivity f26281c;

    /* renamed from: d */
    private final BitableShareCollaboratorManagerFragment f26282d;

    /* renamed from: e */
    private final IFormCollaboratorManagerContract.IModel f26283e;

    /* renamed from: f */
    private final IFormCollaboratorManagerContract.IView f26284f;

    /* renamed from: g */
    private final BitableSharePermSetInfo f26285g;

    /* renamed from: h */
    private ShareUserInfoResult f26286h;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IFormCollaboratorManagerContract.IView.IViewDelegate createViewDelegate() {
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/BitableShareCollaboratorManagerPresenter$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: f */
    public final FragmentActivity mo37166f() {
        return this.f26281c;
    }

    /* renamed from: g */
    public final IFormCollaboratorManagerContract.IView mo37167g() {
        return this.f26284f;
    }

    /* renamed from: h */
    public final ShareUserInfoResult mo37168h() {
        return this.f26286h;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.bitableshare.IFormCollaboratorManagerContract.IView.IViewDelegate
    /* renamed from: d */
    public void mo37164d() {
        this.f26281c.finish();
        PermBitableShareAnalytic.f25618a.mo36533g();
    }

    /* renamed from: e */
    public final void mo37165e() {
        this.f26284f.mo37176a();
        Toast.showFailureText(this.f26281c, (int) R.string.Doc_Share_LoadFailed);
    }

    /* renamed from: i */
    private final boolean m40307i() {
        ConnectionService d = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ConnectionServiceImp.getInstance()");
        ConnectionService.NetworkState b = d.mo20038b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ConnectionServiceImp.get…            .networkState");
        return b.mo20041b();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.bitableshare.IFormCollaboratorManagerContract.IView.IViewDelegate
    /* renamed from: b */
    public void mo37162b() {
        FragmentActivity fragmentActivity = this.f26281c;
        BitableSharePermSetInfo bitableSharePermSetInfo = this.f26285g;
        ArrayList<UserInfo> userInfoList = this.f26286h.getUserInfoList();
        Intrinsics.checkExpressionValueIsNotNull(userInfoList, "shareUserInfoResult.userInfoList");
        InviteMembersUtils.m39846a(fragmentActivity, bitableSharePermSetInfo, userInfoList, false);
        PermBitableShareAnalytic.f25618a.mo36535i();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f26280b.dispose();
        ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36638a().mo36651b(this);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.bitableshare.IFormCollaboratorManagerContract.IView.IViewDelegate
    /* renamed from: c */
    public void mo37163c() {
        C13479a.m54764b("BitableShareCollaboratorManagerPresenter", "loadMore()...");
        this.f26280b.mo237937a(this.f26283e.mo37156a(this.f26286h).mo238001b(new C9736c(this), new C9737d(this)));
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        boolean z;
        super.create();
        this.f26284f.mo37177a(this.f26286h.getTotalNum());
        IFormCollaboratorManagerContract.IView bVar = this.f26284f;
        ArrayList<UserInfo> userInfoList = this.f26286h.getUserInfoList();
        Intrinsics.checkExpressionValueIsNotNull(userInfoList, "shareUserInfoResult.userInfoList");
        bVar.mo37180a(userInfoList);
        ConnectionService d = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d, "connectionService");
        ConnectionService.NetworkState b = d.mo20038b();
        Intrinsics.checkExpressionValueIsNotNull(b, "connectionService.networkState");
        boolean b2 = b.mo20041b();
        IFormCollaboratorManagerContract.IView bVar2 = this.f26284f;
        if (!this.f26286h.isHasMore() || !b2) {
            z = false;
        } else {
            z = true;
        }
        bVar2.mo37181a(z);
        d.mo20037a().mo5923a(this.f26282d, new C9735b(this));
        ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36638a().mo36648a(this);
        PermBitableShareAnalytic.f25618a.mo36532f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.d$d */
    static final class C9737d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BitableShareCollaboratorManagerPresenter f26289a;

        C9737d(BitableShareCollaboratorManagerPresenter dVar) {
            this.f26289a = dVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54765b("BitableShareCollaboratorManagerPresenter", "loadMore()...failed", th);
            this.f26289a.mo37165e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.d$f */
    static final class C9739f<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BitableShareCollaboratorManagerPresenter f26291a;

        C9739f(BitableShareCollaboratorManagerPresenter dVar) {
            this.f26291a = dVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54765b("BitableShareCollaboratorManagerPresenter", "onMemberChange()...failed", th);
            this.f26291a.mo37165e();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.d$b */
    public static final class C9735b<T> implements AbstractC1178x<ConnectionService.NetworkState> {

        /* renamed from: a */
        final /* synthetic */ BitableShareCollaboratorManagerPresenter f26287a;

        C9735b(BitableShareCollaboratorManagerPresenter dVar) {
            this.f26287a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(ConnectionService.NetworkState networkState) {
            Intrinsics.checkExpressionValueIsNotNull(networkState, "it");
            if (!networkState.mo20041b()) {
                this.f26287a.mo37167g().mo37181a(false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.d$c */
    static final class C9736c<T> implements Consumer<ShareUserInfoResult> {

        /* renamed from: a */
        final /* synthetic */ BitableShareCollaboratorManagerPresenter f26288a;

        C9736c(BitableShareCollaboratorManagerPresenter dVar) {
            this.f26288a = dVar;
        }

        /* renamed from: a */
        public final void accept(ShareUserInfoResult shareUserInfoResult) {
            C13479a.m54764b("BitableShareCollaboratorManagerPresenter", "loadMore()...succeed");
            BitableShareCollaboratorManagerPresenter dVar = this.f26288a;
            Intrinsics.checkExpressionValueIsNotNull(shareUserInfoResult, "it");
            dVar.mo37160a(shareUserInfoResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.d$e */
    static final class C9738e<T> implements Consumer<ShareUserInfoResult> {

        /* renamed from: a */
        final /* synthetic */ BitableShareCollaboratorManagerPresenter f26290a;

        C9738e(BitableShareCollaboratorManagerPresenter dVar) {
            this.f26290a = dVar;
        }

        /* renamed from: a */
        public final void accept(ShareUserInfoResult shareUserInfoResult) {
            C13479a.m54764b("BitableShareCollaboratorManagerPresenter", "onMemberChange()...succeed");
            BitableShareCollaboratorManagerPresenter dVar = this.f26290a;
            Intrinsics.checkExpressionValueIsNotNull(shareUserInfoResult, "it");
            dVar.mo37160a(shareUserInfoResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.d$h */
    static final class C9741h<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BitableShareCollaboratorManagerPresenter f26294a;

        C9741h(BitableShareCollaboratorManagerPresenter dVar) {
            this.f26294a = dVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54765b("BitableShareCollaboratorManagerPresenter", "onRemoveUserClicked()...failed", th);
            this.f26294a.mo37167g().mo37183c();
            Toast.showFailureText(this.f26294a.mo37166f(), (int) R.string.Doc_Share_EditFailed);
        }
    }

    /* renamed from: a */
    public final void mo37160a(ShareUserInfoResult shareUserInfoResult) {
        boolean z;
        this.f26286h = shareUserInfoResult;
        this.f26284f.mo37176a();
        IFormCollaboratorManagerContract.IView bVar = this.f26284f;
        ArrayList<UserInfo> userInfoList = shareUserInfoResult.getUserInfoList();
        Intrinsics.checkExpressionValueIsNotNull(userInfoList, "it.userInfoList");
        bVar.mo37180a(userInfoList);
        IFormCollaboratorManagerContract.IView bVar2 = this.f26284f;
        if (!shareUserInfoResult.isHasMore() || !m40307i()) {
            z = false;
        } else {
            z = true;
        }
        bVar2.mo37181a(z);
        this.f26284f.mo37177a(this.f26286h.getTotalNum());
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.MemberChangeListener
    /* renamed from: b */
    public void mo18937b(int i) {
        C13479a.m54764b("BitableShareCollaboratorManagerPresenter", "onMemberChange()...");
        if (i != 1) {
            this.f26280b.mo237937a(this.f26283e.mo37155a().mo238001b(new C9738e(this), new C9739f(this)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.d$g */
    static final class C9740g<T> implements Consumer<SimpleRequestResult> {

        /* renamed from: a */
        final /* synthetic */ BitableShareCollaboratorManagerPresenter f26292a;

        /* renamed from: b */
        final /* synthetic */ UserInfo f26293b;

        C9740g(BitableShareCollaboratorManagerPresenter dVar, UserInfo userInfo) {
            this.f26292a = dVar;
            this.f26293b = userInfo;
        }

        /* renamed from: a */
        public final void accept(SimpleRequestResult simpleRequestResult) {
            C13479a.m54764b("BitableShareCollaboratorManagerPresenter", "onRemoveUserClicked()...succeed");
            this.f26292a.mo37167g().mo37183c();
            this.f26292a.mo37168h().getUserInfoList().remove(this.f26293b);
            IFormCollaboratorManagerContract.IView g = this.f26292a.mo37167g();
            ArrayList<UserInfo> userInfoList = this.f26292a.mo37168h().getUserInfoList();
            Intrinsics.checkExpressionValueIsNotNull(userInfoList, "shareUserInfoResult.userInfoList");
            g.mo37180a(userInfoList);
            this.f26292a.mo37168h().setTotalNum(this.f26292a.mo37168h().getTotalNum() - 1);
            this.f26292a.mo37167g().mo37177a(this.f26292a.mo37168h().getTotalNum());
            Toast.showSuccessText(this.f26292a.mo37166f(), (int) R.string.Doc_Facade_Success);
            ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36638a().mo36646a(1);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.bitableshare.IFormCollaboratorManagerContract.IView.IViewDelegate
    /* renamed from: a */
    public void mo37161a(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        C13479a.m54764b("BitableShareCollaboratorManagerPresenter", "onRemoveUserClicked()...");
        this.f26284f.mo37182b();
        this.f26280b.mo237937a(this.f26283e.mo37157a(userInfo).mo238001b(new C9740g(this, userInfo), new C9741h(this)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BitableShareCollaboratorManagerPresenter(FragmentActivity fragmentActivity, BitableShareCollaboratorManagerFragment bVar, IFormCollaboratorManagerContract.IModel aVar, IFormCollaboratorManagerContract.IView bVar2, BitableSharePermSetInfo bitableSharePermSetInfo, ShareUserInfoResult shareUserInfoResult) {
        super(aVar, bVar2);
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(bVar, "fragment");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar2, "view");
        Intrinsics.checkParameterIsNotNull(bitableSharePermSetInfo, "info");
        Intrinsics.checkParameterIsNotNull(shareUserInfoResult, "shareUserInfoResult");
        this.f26281c = fragmentActivity;
        this.f26282d = bVar;
        this.f26283e = aVar;
        this.f26284f = bVar2;
        this.f26285g = bitableSharePermSetInfo;
        this.f26286h = shareUserInfoResult;
    }
}
