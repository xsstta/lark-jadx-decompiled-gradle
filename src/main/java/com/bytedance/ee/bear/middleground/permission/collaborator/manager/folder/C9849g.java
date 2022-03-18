package com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LoadMoreFooter;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalytic;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShadowRecycleView;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9835c;
import com.bytedance.ee.bear.middleground.permission.lock.LockBannerView;
import com.bytedance.ee.bear.middleground.permission.util.PermissionUtils;
import com.bytedance.ee.bear.middleground.permission.widget.editpermdialog.EditPermDialog;
import com.bytedance.ee.bear.middleground.permission.widget.editpermdialog.EditPermItemModel;
import com.bytedance.ee.bear.middleground.permission.widget.editpermdialog.EditPermItemModelHelper;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.FolderPermSetInfo;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.C11824c;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.bear.widgets.dialog.checkboxdialog.BearUDCheckBoxDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27125d;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27137a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.g */
public class C9849g implements C9830b.AbstractC9833b {

    /* renamed from: a */
    public final Context f26537a;

    /* renamed from: b */
    public C9830b.AbstractC9833b.AbstractC9834a f26538b;

    /* renamed from: c */
    private final FragmentActivity f26539c;

    /* renamed from: d */
    private final C10917c f26540d;

    /* renamed from: e */
    private AccountService.Account f26541e;

    /* renamed from: f */
    private Locale f26542f;

    /* renamed from: g */
    private boolean f26543g;

    /* renamed from: h */
    private boolean f26544h;

    /* renamed from: i */
    private C9835c f26545i;

    /* renamed from: j */
    private FolderPermSetInfo f26546j;

    /* renamed from: k */
    private SmartRefreshLayout f26547k;

    /* renamed from: l */
    private final View f26548l;

    /* renamed from: m */
    private BaseTitleBar f26549m;

    /* renamed from: n */
    private LockBannerView f26550n;

    /* renamed from: o */
    private EditPermDialog f26551o;

    /* renamed from: p */
    private C11824c f26552p;

    /* renamed from: q */
    private ConnectionService.NetworkState f26553q;

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9833b
    /* renamed from: a */
    public void mo37410a(boolean z, final Runnable runnable, final Runnable runnable2) {
        this.f26550n.mo37768a(this.f26537a.getString(R.string.CreationMobile_ECM_PermissionRestrictionDesc), z, new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9849g.C98523 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                PermissionAnalyticV2.m39685j();
                C9849g gVar = C9849g.this;
                gVar.mo37435a(gVar.f26537a.getString(R.string.CreationMobile_Wiki_Permission_ChangePermission_Title), C9849g.this.f26537a.getString(R.string.CreationMobile_ECM_PermissionChangeDesc), runnable, runnable2);
                PermissionAnalyticV2.m39583E();
            }
        });
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9833b
    /* renamed from: a */
    public void mo37407a(Runnable runnable, Runnable runnable2) {
        mo37435a(this.f26537a.getString(R.string.CreationMobile_Wiki_Permission_ChangePermission_Title), this.f26537a.getString(R.string.CreationMobile_ECM_InheritDesc), runnable, runnable2);
    }

    /* renamed from: a */
    public void mo37435a(String str, String str2, Runnable runnable, Runnable runnable2) {
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40651a(this.f26546j.mo38864c(), String.valueOf(this.f26546j.mo38863b()), new BearUDDialogBuilder(this.f26537a).mo45353a(str).mo45357b(str2).mo45360c(8388611).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_Confirm, new DialogInterface.OnClickListener(runnable) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$g$XSSdtfneqNsbD_M8KPmVw5BmvU */
            public final /* synthetic */ Runnable f$0;

            {
                this.f$0 = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f$0.run();
            }
        }).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, new DialogInterface.OnClickListener(runnable2) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$g$OCYVgAuRSGmAYshgHQcSpigMFwQ */
            public final /* synthetic */ Runnable f$0;

            {
                this.f$0 = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f$0.run();
            }
        }).mo45359b());
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9833b
    /* renamed from: a */
    public void mo37408a(List<UserInfo> list) {
        C13479a.m54764b("ShareFolderCollaboratorManageView", "showUsers()...users = " + C13657b.m55424c(list));
        this.f26545i.mo70690f(list);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9833b
    /* renamed from: a */
    public void mo37406a(int i, UserInfo userInfo) {
        this.f26545i.mo70673b().remove(i);
        this.f26545i.notifyItemRemoved(i);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9833b
    /* renamed from: a */
    public void mo37409a(boolean z) {
        C13479a.m54764b("ShareFolderCollaboratorManageView", "setHasMore()...hasMore = " + z);
        this.f26543g = z;
        m40771h();
    }

    /* renamed from: a */
    public void setViewDelegate(C9830b.AbstractC9833b.AbstractC9834a aVar) {
        this.f26538b = aVar;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9833b
    /* renamed from: c */
    public void mo37413c() {
        SmartRefreshLayout smartRefreshLayout = this.f26547k;
        if (smartRefreshLayout != null) {
            smartRefreshLayout.mo96416n();
        } else {
            C13479a.m54764b("ShareFolderCollaboratorManageView", "finishLoadMore()...mSmartRefreshLayout is null");
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        C13479a.m54764b("ShareFolderCollaboratorManageView", "create()...");
        m40764e();
        m40767f();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C13479a.m54764b("ShareFolderCollaboratorManageView", "destroy()...");
        this.f26538b = null;
    }

    /* renamed from: d */
    private void m40761d() {
        C5084ad.m20847d().mo20037a().mo5923a(this.f26539c, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$g$YYiPh_tKSofuJ8rJsE372ykwlA */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C9849g.this.m40745a((C9849g) ((ConnectionService.NetworkState) obj));
            }
        });
    }

    /* renamed from: e */
    private void m40764e() {
        this.f26541e = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        this.f26542f = C4484g.m18494b().mo17253d();
    }

    /* renamed from: g */
    private void m40769g() {
        this.f26549m.setLeftClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9849g.C98512 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C9849g.this.f26538b != null) {
                    C9849g.this.f26538b.mo37414a();
                }
            }
        });
        this.f26545i.mo37423a((C9835c.AbstractC9838a) $$Lambda$g$6EYVV0_gDXbcsza054m7MWfrtxo.INSTANCE);
        this.f26545i.mo37424a((C9835c.AbstractC9839b) new C9835c.AbstractC9839b() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$g$PmkGUJH1EJB0uw6U15fTE61Tpdw */

            @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9835c.AbstractC9839b
            public final void onItemPermissionClick(UserInfo userInfo, int i) {
                C9849g.this.m40746a((C9849g) userInfo, (UserInfo) i);
            }
        });
    }

    /* renamed from: h */
    private void m40771h() {
        boolean z;
        ConnectionService.NetworkState networkState;
        if (this.f26544h) {
            SmartRefreshLayout smartRefreshLayout = this.f26547k;
            if (smartRefreshLayout != null) {
                smartRefreshLayout.mo96434w();
                SmartRefreshLayout smartRefreshLayout2 = this.f26547k;
                if (!this.f26543g || (networkState = this.f26553q) == null || !networkState.mo20041b()) {
                    z = false;
                } else {
                    z = true;
                }
                smartRefreshLayout2.mo96415m(z);
                return;
            }
            C13479a.m54764b("ShareFolderCollaboratorManageView", "setEnableLoadMore()...mSmartRefreshLayout is null");
        }
    }

    /* renamed from: i */
    private boolean m40774i() {
        for (UserInfo userInfo : this.f26545i.mo70673b()) {
            if (userInfo.isOwner()) {
                AccountService.Account account = this.f26541e;
                if (account == null || !account.mo19680b(userInfo.getId())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private void m40767f() {
        BaseTitleBar baseTitleBar = (BaseTitleBar) this.f26548l.findViewById(R.id.titleBar);
        this.f26549m = baseTitleBar;
        baseTitleBar.setActionIconTint(R.color.icon_n1);
        this.f26549m.mo45070a(new BaseTitleBar.C11803d(R.drawable.ud_icon_member_add_outlined) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9849g.C98501 */

            @Override // com.bytedance.ee.bear.widgets.BaseTitleBar.AbstractC11800a, com.bytedance.ee.bear.widgets.BaseTitleBar.C11801b
            /* renamed from: a */
            public void mo16854a(View view) {
                super.mo16854a(view);
                if (C9849g.this.f26538b != null) {
                    C9849g.this.f26538b.mo37418b();
                }
            }
        });
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) this.f26548l.findViewById(R.id.share_folder_collaborator_refresh_layout);
        this.f26547k = smartRefreshLayout;
        if (this.f26544h) {
            smartRefreshLayout.mo96367b((AbstractC27125d) new LoadMoreFooter(this.f26537a));
            this.f26547k.mo96368b(new AbstractC27137a() {
                /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$g$Pau19p7EQKjSQ8Rf04UjUTylpj0 */

                @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27137a
                public final void onLoadmore(AbstractC27129h hVar) {
                    C9849g.this.m40748a((C9849g) hVar);
                }
            });
        }
        ShadowRecycleView shadowRecycleView = (ShadowRecycleView) this.f26548l.findViewById(R.id.share_users_list);
        shadowRecycleView.setLayoutManager(new LinearLayoutManager(this.f26537a));
        C9835c cVar = new C9835c(this.f26542f, this.f26541e, this.f26544h);
        this.f26545i = cVar;
        shadowRecycleView.setAdapter(cVar);
        this.f26552p = new C11824c(this.f26537a);
        m40769g();
        this.f26550n = (LockBannerView) this.f26548l.findViewById(R.id.lockBanner);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9833b
    /* renamed from: b */
    public void mo37411b() {
        this.f26550n.mo37769b();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9833b
    /* renamed from: a */
    public void mo37405a() {
        this.f26550n.mo37767a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m40745a(ConnectionService.NetworkState networkState) {
        C13479a.m54764b("ShareFolderCollaboratorManageView", "observeNetwork()...networkState = " + networkState);
        this.f26553q = networkState;
        if (this.f26544h) {
            m40771h();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m40755b(UserInfo userInfo) {
        if (userInfo.getOwnerType() == 0 || userInfo.getOwnerType() == 1) {
            ((AbstractC5586d) KoinJavaComponent.m268610a(AbstractC5586d.class)).mo22257a(userInfo.getId(), "");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m40748a(AbstractC27129h hVar) {
        C9830b.AbstractC9833b.AbstractC9834a aVar = this.f26538b;
        if (aVar != null) {
            aVar.mo37417a(hVar);
        }
    }

    /* renamed from: a */
    private boolean m40752a(UserInfo userInfo) {
        AccountService.Account account = this.f26541e;
        if (account == null || TextUtils.isEmpty(account.f14584a) || !TextUtils.equals(userInfo.getId(), this.f26541e.f14584a)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private void m40762d(int i, UserInfo userInfo) {
        this.f26538b.mo37415a(i, userInfo);
        this.f26551o.mo38493a();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m40773i(int i, UserInfo userInfo) {
        this.f26538b.mo37421d(i, userInfo);
        PermissionAnalyticV2.m39650b(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m40776j(int i, UserInfo userInfo) {
        this.f26538b.mo37420c(i, userInfo);
        PermissionAnalyticV2.m39650b(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m40778k(int i, UserInfo userInfo) {
        this.f26538b.mo37419b(i, userInfo);
        PermissionAnalyticV2.m39650b(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m40746a(UserInfo userInfo, int i) {
        if (this.f26551o == null) {
            this.f26551o = new EditPermDialog(this.f26537a);
        }
        this.f26551o.mo38494a(userInfo, this.f26546j.mo38864c(), this.f26546j.mo38863b(), m40759c(i, userInfo));
        PermissionAnalytic.m39402a(this.f26546j, userInfo);
        PermissionAnalyticV2.m39599a(userInfo);
        PermissionAnalyticV2.m39641b(userInfo);
    }

    /* renamed from: e */
    private void m40765e(int i, UserInfo userInfo) {
        PermissionAnalyticV2.m39654c(userInfo);
        this.f26551o.mo38493a();
        if (!m40752a(userInfo) || !this.f26546j.mo38883s()) {
            PermissionUtils.m41302a(this.f26539c, R.string.Doc_Share_RemoveUesrPermissionConfirm, new DialogInterface.OnClickListener(i, userInfo) {
                /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$g$uudNG21Jh37yZrwIkkrhKDtt1vE */
                public final /* synthetic */ int f$1;
                public final /* synthetic */ UserInfo f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C9849g.this.m40753b(this.f$1, this.f$2, dialogInterface, i);
                }
            });
            return;
        }
        m40758b(new Runnable(i, userInfo) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$g$7WV718QC8_PtQAvtYZ2BlZzbk2c */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ UserInfo f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C9849g.this.m40778k(this.f$1, this.f$2);
            }
        }, $$Lambda$g$dd4wAMlgGk8F2GNqdscXSyRm4FM.INSTANCE);
        PermissionAnalyticV2.m39691m();
    }

    /* renamed from: f */
    private void m40768f(int i, UserInfo userInfo) {
        this.f26551o.mo38493a();
        if (!m40752a(userInfo) || !this.f26546j.mo38883s()) {
            this.f26538b.mo37420c(i, userInfo);
            return;
        }
        m40758b(new Runnable(i, userInfo) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$g$VehLLkPlBxicNJvIBa3Yo47x9hs */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ UserInfo f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C9849g.this.m40776j(this.f$1, this.f$2);
            }
        }, $$Lambda$g$P74EXoyAUhj7clUFc9eVjO_OMyE.INSTANCE);
        PermissionAnalyticV2.m39691m();
    }

    /* renamed from: g */
    private void m40770g(int i, UserInfo userInfo) {
        this.f26551o.mo38493a();
        if (!m40752a(userInfo) || !this.f26546j.mo38883s()) {
            this.f26538b.mo37421d(i, userInfo);
            return;
        }
        m40758b(new Runnable(i, userInfo) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$g$dE3y7vG4vTApg7bfAq6BdhINs5s */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ UserInfo f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C9849g.this.m40773i(this.f$1, this.f$2);
            }
        }, $$Lambda$g$Ui64XR2axlhIMdDqsFUBM0gMyN8.INSTANCE);
        PermissionAnalyticV2.m39691m();
    }

    /* renamed from: b */
    private void m40758b(Runnable runnable, Runnable runnable2) {
        mo37435a(this.f26537a.getString(R.string.CreationMobile_Wiki_Permission_ChangePermission_Title), this.f26537a.getString(R.string.CreationMobile_ECM_PermissionUpdatedDesc), runnable, runnable2);
    }

    /* renamed from: c */
    private ArrayList<EditPermItemModel> m40759c(int i, UserInfo userInfo) {
        boolean z;
        boolean z2;
        boolean z3;
        AccountService.Account account;
        boolean z4 = false;
        if (!m40774i() || (!(userInfo.getOwnerType() == 0 || userInfo.getOwnerType() == 1) || (account = this.f26541e) == null || !account.mo19678a(userInfo.getTenantId()))) {
            z = false;
        } else {
            z = true;
        }
        boolean v = this.f26546j.mo38887v();
        boolean w = this.f26546j.mo38888w();
        boolean x = this.f26546j.mo38890x();
        if (userInfo.getPermission() == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (userInfo.getPermission() == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (userInfo.getPermission() == 1) {
            z4 = true;
        }
        C13479a.m54764b("ShareFolderCollaboratorManageView", "canInviteFa:" + v + ", canInviteEdit:" + w + ", canInviteView:" + x + ", isMemberFa:" + z2 + ", isMemberEdit：" + z3 + ", isMemberRead:" + z4 + ", transferEnable:" + z);
        return new EditPermItemModelHelper(this.f26537a).mo38518a(this.f26546j.mo38883s(), v, z2, false, new View.OnClickListener(i, userInfo) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$g$lLCpHSLb6qXF3nazRqTskg1XJlQ */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ UserInfo f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                C9849g.this.m40766e(this.f$1, this.f$2, view);
            }
        }).mo38521b(z3, w, new View.OnClickListener(i, userInfo) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$g$lc6N43QA8rDF9cq1acQu6AzArMk */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ UserInfo f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                C9849g.this.m40763d(this.f$1, this.f$2, view);
            }
        }).mo38517a(z4, x, new View.OnClickListener(i, userInfo) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$g$QQD2C3SveYJVSPPFBi1NDUCCZc */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ UserInfo f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                C9849g.this.m40760c(this.f$1, this.f$2, view);
            }
        }).mo38522c(z, new View.OnClickListener(i, userInfo) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$g$uymkdWeBHVYM27R6_HFwspZnGYY */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ UserInfo f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                C9849g.this.m40754b((C9849g) this.f$1, (int) this.f$2, (UserInfo) view);
            }
        }).mo38516a(!z, new View.OnClickListener(i, userInfo) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$g$dpqzdJaOCgPwR0Am5gBbpV5Hgs */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ UserInfo f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                C9849g.this.m40744a((C9849g) this.f$1, (int) this.f$2, (UserInfo) view);
            }
        }).mo38519a();
    }

    /* renamed from: h */
    private void m40772h(int i, UserInfo userInfo) {
        int i2;
        boolean a = C4211a.m17514a().mo16536a("ccm.permission.mobile.batch_transfer_owner", false);
        boolean z = !this.f26546j.mo38883s();
        C13479a.m54764b("ShareFolderCollaboratorManageView", "folderTransferOwner = " + a + ", isV1 = " + z);
        String a2 = C10539a.m43639a(this.f26539c, R.string.Doc_Share_ConfirmTransferOwner, "who", userInfo.getDisplayName(this.f26542f));
        String a3 = C10539a.m43639a(this.f26539c, R.string.Doc_Share_TransferFolderOwnerExplain, "who", userInfo.getDisplayName(this.f26542f));
        if (a || z) {
            if (a && this.f26546j.mo38883s()) {
                a2 = this.f26539c.getString(R.string.CreationMobile_ECM_Transfer_DocTitle);
                a3 = C10539a.m43639a(this.f26539c, R.string.CreationMobile_ECM_Transfer_ConfirmDialog, "username", userInfo.getDisplayName(this.f26542f));
            }
            if (z) {
                i2 = R.string.CreationMobile_transfer_my_FileAndFolders_option;
            } else {
                i2 = R.string.CreationMobile_ECM_Transfer_FolderDocCheckBox;
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) new BearUDCheckBoxDialogBuilder(this.f26539c).title(a2)).message(a3)).mo45379a(this.f26537a.getString(i2)).mo45378a(new CompoundButton.OnCheckedChangeListener(atomicBoolean) {
                /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$g$69c2P_P6lXshqqhyBVVu6t0hw4 */
                public final /* synthetic */ AtomicBoolean f$0;

                {
                    this.f$0 = r1;
                }

                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.f$0.set(z);
                }
            }).cancelable(true)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Doc_Share_Transfer, new DialogInterface.OnClickListener(atomicBoolean, i, userInfo) {
                /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$g$OfWaNrKCm2af08MoZJ80bBKfhqs */
                public final /* synthetic */ AtomicBoolean f$1;
                public final /* synthetic */ int f$2;
                public final /* synthetic */ UserInfo f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C9849g.this.m40750a(this.f$1, this.f$2, this.f$3, dialogInterface, i);
                }
            })).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, new DialogInterface.OnClickListener() {
                /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$g$guTLW1SwutvaRATJU6w31iCxE3M */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    PermissionAnalyticV2.m39602a(UserInfo.this, (DialogInterface) false);
                }
            })).build().show();
        } else {
            new BearUDDialogBuilder(this.f26539c).mo45353a(a2).mo45357b(a3).mo45361c(true).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Share_Transfer, new DialogInterface.OnClickListener(i, userInfo) {
                /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$g$2pA27QdJ06GG8Q8n4lC7g0NeP0 */
                public final /* synthetic */ int f$1;
                public final /* synthetic */ UserInfo f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C9849g.this.m40743a((C9849g) this.f$1, (int) this.f$2, (UserInfo) dialogInterface, (DialogInterface) i);
                }
            }).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, new DialogInterface.OnClickListener() {
                /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.$$Lambda$g$QTCPKSlKV83_w16AwHCnt15dCsY */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    PermissionAnalyticV2.m39602a(UserInfo.this, (DialogInterface) false);
                }
            }).mo45355a().show();
        }
        this.f26551o.mo38493a();
        PermissionAnalyticV2.m39670e(userInfo);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9830b.AbstractC9833b
    /* renamed from: b */
    public void mo37412b(int i, UserInfo userInfo) {
        this.f26545i.mo70664a(i, userInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m40744a(int i, UserInfo userInfo, View view) {
        m40765e(i, userInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m40754b(int i, UserInfo userInfo, View view) {
        m40772h(i, userInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m40760c(int i, UserInfo userInfo, View view) {
        m40768f(i, userInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m40763d(int i, UserInfo userInfo, View view) {
        m40770g(i, userInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m40766e(int i, UserInfo userInfo, View view) {
        m40762d(i, userInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m40753b(int i, UserInfo userInfo, DialogInterface dialogInterface, int i2) {
        this.f26538b.mo37419b(i, userInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m40743a(int i, UserInfo userInfo, DialogInterface dialogInterface, int i2) {
        this.f26538b.mo37416a(i, userInfo, false, false);
        PermissionAnalyticV2.m39602a(userInfo, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m40750a(AtomicBoolean atomicBoolean, int i, UserInfo userInfo, DialogInterface dialogInterface, int i2) {
        C13479a.m54764b("ShareFolderCollaboratorManageView", "recursiveTransfer = " + atomicBoolean.get());
        this.f26538b.mo37416a(i, userInfo, true, atomicBoolean.get());
        PermissionAnalyticV2.m39605a(userInfo, true, atomicBoolean.get());
    }

    C9849g(Context context, FragmentActivity fragmentActivity, C10917c cVar, View view, FolderPermSetInfo folderPermSetInfo, boolean z) {
        boolean z2;
        this.f26537a = context;
        this.f26539c = fragmentActivity;
        this.f26540d = cVar;
        this.f26548l = view;
        if (folderPermSetInfo != null) {
            z2 = folderPermSetInfo.mo38883s();
        } else {
            z2 = false;
        }
        this.f26544h = z2;
        this.f26546j = folderPermSetInfo;
        this.f26543g = z;
        m40761d();
    }
}
