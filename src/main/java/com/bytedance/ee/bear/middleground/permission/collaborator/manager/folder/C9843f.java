package com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalytic;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.collaborator.InviteMembersUtils;
import com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity;
import com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b;
import com.bytedance.ee.bear.middleground.permission.util.NotNotifyOperator;
import com.bytedance.ee.bear.middleground_permission_export.model.MemberChangeListener;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.FolderPermSetInfo;
import com.bytedance.ee.bear.share.export.AbstractC11003a;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.f */
public class C9843f extends BasePresenter<C9830b.AbstractC9831a, C9830b.AbstractC9833b, C9830b.AbstractC9833b.AbstractC9834a> implements C9830b.AbstractC9833b.AbstractC9834a, MemberChangeListener {

    /* renamed from: a */
    public final Context f26515a;

    /* renamed from: b */
    public final FragmentActivity f26516b;

    /* renamed from: c */
    public final FolderPermSetInfo f26517c;

    /* renamed from: d */
    public final ArrayList<UserInfo> f26518d;

    /* renamed from: e */
    private AbstractC9848a f26519e;

    /* renamed from: f */
    private final String f26520f;

    /* renamed from: g */
    private ShareUserInfoResult f26521g;

    /* renamed from: h */
    private final C68289a f26522h = new C68289a();

    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.f$a */
    public interface AbstractC9848a {
        /* renamed from: a */
        void mo37426a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C9830b.AbstractC9833b.AbstractC9834a createViewDelegate() {
        return this;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9833b.AbstractC9834a
    /* renamed from: a */
    public void mo37415a(int i, UserInfo userInfo) {
        C13479a.m54764b("FolderCollaboratorManagePresenter", "onSetUserFaClick()....pos = " + i);
        if (userInfo.getPermission() == 3) {
            C13479a.m54764b("FolderCollaboratorManagePresenter", "onSetUserFaClick()...permission is same");
        } else {
            m40703b(3, i, userInfo);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9833b.AbstractC9834a
    /* renamed from: a */
    public void mo37416a(final int i, UserInfo userInfo, final boolean z, final boolean z2) {
        C13479a.m54764b("FolderCollaboratorManagePresenter", "onTransferOwnerClick()...position = " + i);
        PermissionAnalyticV2.m39664d(userInfo);
        ((C9830b.AbstractC9831a) getModel()).mo37400a(this.f26517c.mo38871h(), userInfo, new C9830b.AbstractC9831a.AbstractC9832a<NotNotifyUserResult>() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9843f.C98452 */

            /* renamed from: a */
            public void mo37403a(NotNotifyUserResult notNotifyUserResult) {
                boolean z;
                C13479a.m54764b("FolderCollaboratorManagePresenter", "onTransferOwnerClick()...success, position = " + i);
                C9843f.this.mo37429a("");
                List<NotNotifyUserEntity> notNotifyUsers = notNotifyUserResult.getNotNotifyUsers();
                if (notNotifyUsers == null || notNotifyUsers.isEmpty() || C9843f.this.f26516b == null) {
                    z = false;
                } else {
                    z = true;
                }
                C13479a.m54764b("FolderCollaboratorManagePresenter", "showNotNotifyTip = " + z);
                if (z) {
                    NotNotifyOperator.m41293a(C9843f.this.f26516b, notNotifyUsers);
                } else if (!z || !z2) {
                    Toast.showSuccessText(C9843f.this.f26515a, (int) R.string.Doc_Facade_Success);
                } else {
                    Toast.showText(C9843f.this.f26515a, C9843f.this.f26515a.getString(R.string.CreationMobile_transfer_my_inProgress), 1);
                }
            }

            @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9831a.AbstractC9832a
            /* renamed from: a */
            public void mo37404a(Throwable th) {
                C13479a.m54758a("FolderCollaboratorManagePresenter", "onTransferOwnerClick()...throwable = " + th);
                if (C5203d.m21235a(th, 151211001)) {
                    new BearUDDialogBuilder(C9843f.this.f26515a).mo45362d(R.string.CreationMobile_transfer_my_tooMany).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_Confirm, (DialogInterface.OnClickListener) null).mo45359b();
                } else {
                    Toast.showFailureText(C9843f.this.f26515a, (int) R.string.Doc_Share_ModifyFailed);
                }
            }
        }, this.f26517c, z, z2);
    }

    /* renamed from: a */
    public void mo37428a(UserInfo userInfo) {
        if (this.f26517c.mo38883s()) {
            AccountService.Account f = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
            if ((f != null && !TextUtils.isEmpty(f.f14584a) && TextUtils.equals(userInfo.getId(), f.f14584a)) || userInfo.getOwnerType() != 0 || userInfo.getOwnerType() != 1) {
                C13479a.m54764b("FolderCollaboratorManagePresenter", "checkFolderUserPerm()...");
                this.f26522h.mo237937a(((C9830b.AbstractC9831a) getModel()).mo37395a(this.f26517c.mo38864c(), this.f26517c.mo38873i(), this.f26517c.mo38886u()).mo238001b(new Consumer() {
                    /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$f$Z5Jz_szCubPTLx10teL3HBizt4 */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C9843f.this.m40700a((C9843f) ((ShareFolderUserPermission) obj));
                    }
                }, new Consumer() {
                    /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$f$bveU3WY3B5MFh6PWUjPTWfr1YOw */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C9843f.this.m40702a((C9843f) ((Throwable) obj));
                    }
                }));
            }
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9833b.AbstractC9834a
    /* renamed from: a */
    public void mo37417a(AbstractC27129h hVar) {
        ShareUserInfoResult shareUserInfoResult = this.f26521g;
        if (shareUserInfoResult == null || !shareUserInfoResult.isHasMore()) {
            C13479a.m54764b("FolderCollaboratorManagePresenter", "onLoadMore()...no more");
        } else {
            mo37429a(m40714i());
        }
    }

    /* renamed from: a */
    public void mo37429a(final String str) {
        C13479a.m54764b("FolderCollaboratorManagePresenter", "refreshUsers()...");
        ((C9830b.AbstractC9831a) getModel()).mo37401a(this.f26517c.mo38871h(), this.f26517c.mo38864c(), new C9830b.AbstractC9831a.AbstractC9832a<ShareUserInfoResult>() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9843f.C98474 */

            @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9831a.AbstractC9832a
            /* renamed from: a */
            public void mo37404a(Throwable th) {
                ((C9830b.AbstractC9833b) C9843f.this.getView()).mo37413c();
                C13479a.m54758a("FolderCollaboratorManagePresenter", "refreshUsers()...failed, throwable = " + th);
                Toast.showFailureText(C9843f.this.f26515a, C9843f.this.f26515a.getResources().getString(R.string.Doc_Share_LoadFailed), 0);
            }

            /* renamed from: a */
            public void mo37403a(ShareUserInfoResult shareUserInfoResult) {
                boolean z;
                C13479a.m54764b("FolderCollaboratorManagePresenter", "refreshUsers()...success");
                ((C9830b.AbstractC9833b) C9843f.this.getView()).mo37413c();
                if (TextUtils.isEmpty(str)) {
                    C9843f.this.f26518d.clear();
                }
                if (shareUserInfoResult != null && shareUserInfoResult.getUserInfoList().size() > 0) {
                    C9843f.this.f26518d.addAll(shareUserInfoResult.getUserInfoList());
                }
                ((C9830b.AbstractC9833b) C9843f.this.getView()).mo37408a(C9843f.this.f26518d);
                C9830b.AbstractC9833b bVar = (C9830b.AbstractC9833b) C9843f.this.getView();
                if (!C9843f.this.f26517c.mo38883s() || shareUserInfoResult == null || !shareUserInfoResult.isHasMore()) {
                    z = false;
                } else {
                    z = true;
                }
                bVar.mo37409a(z);
            }
        }, this.f26517c, str);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9833b.AbstractC9834a
    /* renamed from: a */
    public void mo37414a() {
        PermissionAnalyticV2.m39687k();
        m40711g();
    }

    /* renamed from: g */
    private void m40711g() {
        C13479a.m54764b("FolderCollaboratorManagePresenter", "finish()...");
        AbstractC9848a aVar = this.f26519e;
        if (aVar != null) {
            aVar.mo37426a();
        }
    }

    /* renamed from: h */
    private void m40713h() {
        ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31521d(this.f26517c.mo38864c());
        ((AbstractC11003a) KoinJavaComponent.m268610a(AbstractC11003a.class)).mo41768d();
        m40711g();
    }

    /* renamed from: i */
    private String m40714i() {
        if (this.f26517c.mo38883s()) {
            return this.f26521g.getLastLabel();
        }
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m40718m() {
        ((C9830b.AbstractC9833b) getView()).mo37405a();
        m40709f();
        PermissionAnalyticV2.m39681h(true);
    }

    /* renamed from: e */
    private void m40707e() {
        if (!this.f26517c.mo38883s() || !this.f26517c.mo38881q()) {
            ((C9830b.AbstractC9833b) getView()).mo37405a();
        } else {
            ((C9830b.AbstractC9833b) getView()).mo37410a(this.f26517c.mo38882r(), new Runnable() {
                /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$f$X19RzqgoUM0E_oMNRPlqg4V1PW4 */

                public final void run() {
                    C9843f.this.m40718m();
                }
            }, $$Lambda$f$zYUo2uhs4JQ6Svq1Gb73_KqxWpA.INSTANCE);
        }
    }

    /* renamed from: f */
    private void m40709f() {
        C13479a.m54764b("FolderCollaboratorManagePresenter", "unLock()...");
        this.f26522h.mo237937a(((C9830b.AbstractC9831a) getModel()).mo37393a(this.f26517c.mo38864c()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$f$N1nxGzA4ObNcXwBhiUuVDXvZmBg */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9843f.this.m40701a((C9843f) ((Boolean) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$f$dApMwUgNzasqneiN2tN6BBaiuw */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9843f.this.m40706c((Throwable) obj);
            }
        }));
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9833b.AbstractC9834a
    /* renamed from: b */
    public void mo37418b() {
        ShareUserInfoResult shareUserInfoResult = this.f26521g;
        if (shareUserInfoResult == null || shareUserInfoResult.getUserInfoList() == null) {
            C13479a.m54758a("FolderCollaboratorManagePresenter", "onInviteMemberClick error because userInfo is null...");
            return;
        }
        InviteMembersUtils.m39848a(this.f26516b, this.f26517c, this.f26521g, this.f26520f, false);
        PermissionAnalyticV2.m39689l();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C13479a.m54764b("FolderCollaboratorManagePresenter", "create()...");
        ((C9830b.AbstractC9833b) getView()).mo37408a(((C9830b.AbstractC9831a) getModel()).mo37398a());
        ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36638a().mo36648a(this);
        m40707e();
    }

    /* renamed from: d */
    public void mo37431d() {
        this.f26522h.mo237937a(((C9830b.AbstractC9831a) getModel()).mo37394a(this.f26517c.mo38864c(), this.f26517c.mo38873i()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$f$FQN3Wp98bg51qctwPLcorkdtiyM */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9843f.this.m40699a((C9843f) ((ShareFolderPublicPermission) obj));
            }
        }, $$Lambda$f$BBpsn0tbTUzeJySesbtoOvAw1E.INSTANCE));
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        C13479a.m54764b("FolderCollaboratorManagePresenter", "destroy()...");
        this.f26519e = null;
        this.f26522h.mo237935a();
        ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36638a().mo36651b(this);
        ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36638a().mo36646a(1);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.MemberChangeListener
    /* renamed from: b */
    public void mo18937b(int i) {
        if (i != 1) {
            mo37429a("");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m40706c(Throwable th) throws Exception {
        C13479a.m54759a("FolderCollaboratorManagePresenter", "unLock()....failed", th);
        ((C9830b.AbstractC9833b) getView()).mo37411b();
        Toast.showFailureText(this.f26515a, (int) R.string.CreationMobile_Wiki_CannotRestore_Toast);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m40699a(ShareFolderPublicPermission shareFolderPublicPermission) throws Exception {
        this.f26517c.mo38859a(shareFolderPublicPermission);
        m40707e();
        PermissionAnalyticV2.m39607a(shareFolderPublicPermission.getReportPublicPermJson());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m40700a(ShareFolderUserPermission shareFolderUserPermission) throws Exception {
        this.f26517c.mo38860a(shareFolderUserPermission);
        if (!shareFolderUserPermission.canManagerCollaborator()) {
            C13479a.m54764b("FolderCollaboratorManagePresenter", "checkFolderUserPermIfNeed().. canManagerCollaborator = false");
            m40713h();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m40701a(Boolean bool) throws Exception {
        C13479a.m54764b("FolderCollaboratorManagePresenter", "unLock()...success");
        mo37431d();
        ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36638a().mo36646a(2);
        Toast.showSuccessText(this.f26515a, (int) R.string.CreationMobile_Wiki_Restored_Toast);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m40702a(Throwable th) throws Exception {
        if (C5203d.m21235a(th, 4)) {
            m40713h();
        }
        C13479a.m54759a("FolderCollaboratorManagePresenter", "checkFolderUserPerm()...failed", th);
    }

    /* renamed from: e */
    private void m40708e(final int i, final UserInfo userInfo) {
        ((C9830b.AbstractC9831a) getModel()).mo37399a(this.f26517c.mo38871h(), userInfo, new C9830b.AbstractC9831a.AbstractC9832a<NetService.Result>() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9843f.C98463 */

            @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9831a.AbstractC9832a
            /* renamed from: a */
            public void mo37403a(NetService.Result result) {
                C13479a.m54764b("FolderCollaboratorManagePresenter", "onRemoveUserClick()...success");
                ((C9830b.AbstractC9833b) C9843f.this.getView()).mo37406a(i, userInfo);
                Toast.showSuccessText(C9843f.this.f26515a, C9843f.this.f26515a.getResources().getString(R.string.Doc_Facade_Success), 0);
                C9843f.this.mo37431d();
                C9843f.this.mo37428a(userInfo);
            }

            @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9831a.AbstractC9832a
            /* renamed from: a */
            public void mo37404a(Throwable th) {
                C13479a.m54764b("FolderCollaboratorManagePresenter", "onRemoveUserClick()...failed, throwable = " + th);
                Toast.showFailureText(C9843f.this.f26515a, C9843f.this.f26515a.getResources().getString(R.string.Doc_Share_EditFailed), 0);
            }
        }, this.f26517c);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m40712g(int i, UserInfo userInfo) {
        m40708e(i, userInfo);
        PermissionAnalyticV2.m39627a("reduce_collaborators", true, userInfo);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9833b.AbstractC9834a
    /* renamed from: d */
    public void mo37421d(int i, UserInfo userInfo) {
        if (userInfo.getPermission() == 2) {
            C13479a.m54764b("FolderCollaboratorManagePresenter", "onSetUserEditClick()...permission is same");
        } else if (!this.f26517c.mo38883s()) {
            m40703b(2, i, userInfo);
        } else {
            m40694a(2, i, userInfo);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9833b.AbstractC9834a
    /* renamed from: c */
    public void mo37420c(int i, UserInfo userInfo) {
        if (userInfo.getPermission() == 1) {
            C13479a.m54764b("FolderCollaboratorManagePresenter", "onSetUserReadClick()...permission is same");
        } else if (!this.f26517c.mo38883s()) {
            m40703b(1, i, userInfo);
        } else {
            m40694a(1, i, userInfo);
        }
    }

    /* renamed from: f */
    private void m40710f(int i, UserInfo userInfo) {
        this.f26522h.mo237937a(((C9830b.AbstractC9831a) getModel()).mo37396a(this.f26517c.mo38864c(), userInfo).mo238001b(new Consumer(i, userInfo) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$f$ypgeDSSn2PvdH1uEOkERM1tsjAc */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ UserInfo f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9843f.this.m40697a((C9843f) this.f$1, (int) this.f$2, (UserInfo) ((Boolean) obj));
            }
        }, new Consumer(i, userInfo) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$f$hRxADAz8_8QR8WeVG36iiA7Gg78 */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ UserInfo f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9843f.this.m40698a((C9843f) this.f$1, (int) this.f$2, (UserInfo) ((Throwable) obj));
            }
        }));
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9833b.AbstractC9834a
    /* renamed from: b */
    public void mo37419b(int i, UserInfo userInfo) {
        C13479a.m54764b("FolderCollaboratorManagePresenter", "onRemoveUserClick()...position = " + i);
        PermissionAnalytic.m39404a(userInfo, "confirm_remove");
        if (!this.f26517c.mo38883s()) {
            m40708e(i, userInfo);
        } else {
            m40710f(i, userInfo);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m40705c(int i, int i2, UserInfo userInfo) {
        m40703b(i, i2, userInfo);
        PermissionAnalyticV2.m39627a("reduce_permissions", true, userInfo);
    }

    /* renamed from: a */
    private void m40694a(int i, int i2, UserInfo userInfo) {
        this.f26522h.mo237937a(((C9830b.AbstractC9831a) getModel()).mo37397a(this.f26517c.mo38864c(), userInfo, i).mo238001b(new Consumer(i, i2, userInfo) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$f$sICa9eNuDm19hOxSP7PA_j5_hJc */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ UserInfo f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9843f.this.m40695a((C9843f) this.f$1, this.f$2, (int) this.f$3, (UserInfo) ((Boolean) obj));
            }
        }, new Consumer(i, i2, userInfo) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$f$1gCXxH7f2cQtHcWnk2M6hWvBN7I */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ UserInfo f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9843f.this.m40696a((C9843f) this.f$1, this.f$2, (int) this.f$3, (UserInfo) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m40697a(int i, UserInfo userInfo, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            ((C9830b.AbstractC9833b) getView()).mo37407a(new Runnable(i, userInfo) {
                /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$f$LXKKLF51UJPueR9mBoGDS2tCzdQ */
                public final /* synthetic */ int f$1;
                public final /* synthetic */ UserInfo f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C9843f.this.m40712g(this.f$1, this.f$2);
                }
            }, $$Lambda$f$p061ocxReMrLBzJeRfZpdPU6k0.INSTANCE);
            PermissionAnalyticV2.m39621a("reduce_collaborators", userInfo);
            return;
        }
        m40708e(i, userInfo);
    }

    /* renamed from: b */
    private void m40703b(final int i, final int i2, final UserInfo userInfo) {
        C13479a.m54764b("FolderCollaboratorManagePresenter", "modifyUser()...newPermission = " + i + ", position = " + i2);
        PermissionAnalyticV2.m39600a(userInfo, i);
        final int permission = userInfo.getPermission();
        userInfo.setPermission(i);
        if (permission > i) {
            userInfo.setPermSource("");
        }
        ((C9830b.AbstractC9831a) getModel()).mo37402b(this.f26517c.mo38871h(), userInfo, new C9830b.AbstractC9831a.AbstractC9832a<NetService.Result>() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9843f.C98441 */

            @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9831a.AbstractC9832a
            /* renamed from: a */
            public void mo37403a(NetService.Result result) {
                C13479a.m54764b("FolderCollaboratorManagePresenter", "modifyUser() success...newPermission = " + i + ", position = " + i2);
                ((C9830b.AbstractC9833b) C9843f.this.getView()).mo37412b(i2, userInfo);
                Toast.showSuccessText(C9843f.this.f26515a, C9843f.this.f26515a.getResources().getString(R.string.Doc_Facade_Success), 0);
                if (!C9843f.this.f26517c.mo38881q() && i != 3) {
                    C9843f.this.mo37431d();
                }
                C9843f.this.mo37428a(userInfo);
            }

            @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9831a.AbstractC9832a
            /* renamed from: a */
            public void mo37404a(Throwable th) {
                C13479a.m54758a("FolderCollaboratorManagePresenter", "modifyUser() failed...throwable = " + th);
                userInfo.setPermission(permission);
                if (C5203d.m21235a(th, 10040)) {
                    Toast.showFailureText(C9843f.this.f26515a, (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
                } else {
                    Toast.showFailureText(C9843f.this.f26515a, C9843f.this.f26515a.getResources().getString(R.string.Doc_Share_EditFailed), 0);
                }
            }
        }, this.f26517c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m40698a(int i, UserInfo userInfo, Throwable th) throws Exception {
        C13479a.m54759a("FolderCollaboratorManagePresenter", "checkRemoveUserLock()...failed", th);
        m40708e(i, userInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m40696a(int i, int i2, UserInfo userInfo, Throwable th) throws Exception {
        C13479a.m54759a("FolderCollaboratorManagePresenter", "checkModifyUserLock()...failed", th);
        m40703b(i, i2, userInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m40695a(int i, int i2, UserInfo userInfo, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            ((C9830b.AbstractC9833b) getView()).mo37407a(new Runnable(i, i2, userInfo) {
                /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$f$gwVQ2j32kuzJQJoy90HZL5fUfkU */
                public final /* synthetic */ int f$1;
                public final /* synthetic */ int f$2;
                public final /* synthetic */ UserInfo f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void run() {
                    C9843f.this.m40705c(this.f$1, this.f$2, this.f$3);
                }
            }, $$Lambda$f$_Nut4BF3ohKPpGLJ5VCrcmIWw0.INSTANCE);
            PermissionAnalyticV2.m39621a("reduce_permissions", userInfo);
            return;
        }
        m40703b(i, i2, userInfo);
    }

    C9843f(Context context, FragmentActivity fragmentActivity, C9830b.AbstractC9833b bVar, C9830b.AbstractC9831a aVar, AbstractC9848a aVar2, FolderPermSetInfo folderPermSetInfo, ShareUserInfoResult shareUserInfoResult, String str) {
        super(aVar, bVar);
        this.f26515a = context;
        this.f26516b = fragmentActivity;
        this.f26519e = aVar2;
        this.f26517c = folderPermSetInfo;
        this.f26521g = shareUserInfoResult;
        this.f26518d = shareUserInfoResult.getUserInfoList();
        this.f26520f = str;
    }
}
