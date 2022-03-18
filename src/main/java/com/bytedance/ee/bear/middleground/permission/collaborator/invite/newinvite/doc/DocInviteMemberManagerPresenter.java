package com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.doc;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.net.AbstractC5204e;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalytic;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.panel.AskOwnerPanel;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract;
import com.bytedance.ee.bear.middleground.permission.util.NotNotifyOperator;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.share.export.AbstractC11003a;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.mvp.BasePresenter;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 *2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0003*+,BQ\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0014J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\u0018\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u001bj\b\u0012\u0004\u0012\u00020\u0012`\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\b\u0010\u001e\u001a\u00020\u0017H\u0002J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0003J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010&\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0002J \u0010'\u001a\u00020\u00172\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u001bj\b\u0012\u0004\u0012\u00020\u0012`\u001cH\u0002J\b\u0010)\u001a\u00020\u0017H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/doc/DocInviteMemberManagerPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IView$IViewDelegate;", "context", "Landroidx/fragment/app/FragmentActivity;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "model", "view", "dependency", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/doc/DocInviteMemberManagerPresenter$Dependency;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "module", "", "ownerInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "fromSharePanel", "", "(Landroidx/fragment/app/FragmentActivity;Lcom/bytedance/ee/bear/service/ServiceContext;Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IModel;Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IView;Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/doc/DocInviteMemberManagerPresenter$Dependency;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;Ljava/lang/String;Lcom/bytedance/ee/bear/share/export/UserInfo;Z)V", "create", "", "createViewDelegate", "dismissShareFragment", "filterExternalInvited", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "needShowAskOwnerPanel", "notifyMemberChange", "onInviteFailed", "throwable", "", "onInviteSuccess", "result", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteResult;", "reportInviteFailed", "reportInviteSuccess", "showAskOwner", "externalUsers", "sure", "Companion", "Dependency", "ViewDelegate", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c.c */
public final class DocInviteMemberManagerPresenter extends BasePresenter<IInviteMemberManagerContract.IModel, IInviteMemberManagerContract.IView, IInviteMemberManagerContract.IView.IViewDelegate> {

    /* renamed from: d */
    public static final Companion f26001d = new Companion(null);

    /* renamed from: a */
    public final IInviteMemberManagerContract.IModel f26002a;

    /* renamed from: b */
    public final IInviteMemberManagerContract.IView f26003b;

    /* renamed from: c */
    public final Dependency f26004c;

    /* renamed from: e */
    private final FragmentActivity f26005e;

    /* renamed from: f */
    private final C10917c f26006f;

    /* renamed from: g */
    private final DocPermSetInfo f26007g;

    /* renamed from: h */
    private final String f26008h;

    /* renamed from: i */
    private final UserInfo f26009i;

    /* renamed from: j */
    private final boolean f26010j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/doc/DocInviteMemberManagerPresenter$Dependency;", "", "back", "", "finish", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c.c$b */
    public interface Dependency {
        /* renamed from: a */
        void mo36928a();

        /* renamed from: b */
        void mo36929b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/doc/DocInviteMemberManagerPresenter$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/doc/DocInviteMemberManagerPresenter$ViewDelegate;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IView$IViewDelegate;", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/doc/DocInviteMemberManagerPresenter;)V", "getSelectedUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "onBack", "", "onInviteBtnClick", "onOperateToastDismiss", "notificationId", "", "onRemoveSelectedUser", "userInfo", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c.c$c */
    public final class ViewDelegate implements IInviteMemberManagerContract.IView.IViewDelegate {
        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView.IViewDelegate
        /* renamed from: b */
        public void mo36878b() {
            DocInviteMemberManagerPresenter.this.mo36940b();
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView.IViewDelegate
        /* renamed from: a */
        public void mo36875a() {
            Dependency bVar = DocInviteMemberManagerPresenter.this.f26004c;
            if (bVar != null) {
                bVar.mo36928a();
            }
            PermissionAnalyticV2.m39677g();
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView.IViewDelegate
        /* renamed from: c */
        public ArrayList<UserInfo> mo36879c() {
            return DocInviteMemberManagerPresenter.this.f26002a.mo36861a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegate() {
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView.IViewDelegate
        /* renamed from: a */
        public void mo36877a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "notificationId");
            DocInviteMemberManagerPresenter.this.f26002a.mo36867a(str);
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView.IViewDelegate
        /* renamed from: a */
        public void mo36876a(UserInfo userInfo) {
            Dependency bVar;
            Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
            DocInviteMemberManagerPresenter.this.f26002a.mo36862a(userInfo);
            DocInviteMemberManagerPresenter.this.f26003b.mo36883n();
            if (DocInviteMemberManagerPresenter.this.f26002a.mo36861a().size() == 0 && (bVar = DocInviteMemberManagerPresenter.this.f26004c) != null) {
                bVar.mo36928a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IInviteMemberManagerContract.IView.IViewDelegate createViewDelegate() {
        return new ViewDelegate();
    }

    /* renamed from: e */
    private final void m40027e() {
        ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36638a().mo36646a(0);
    }

    /* renamed from: f */
    private final void m40028f() {
        if (this.f26010j) {
            ((AbstractC11003a) KoinJavaComponent.m268613a(AbstractC11003a.class, null, null, 6, null)).mo41768d();
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f26003b.mo36889a(this.f26002a.mo36861a());
        this.f26003b.mo36883n();
        PermissionAnalyticV2.m39629a(this.f26002a.mo36861a());
    }

    /* renamed from: d */
    private final ArrayList<UserInfo> m40026d() {
        ArrayList<UserInfo> arrayList = new ArrayList<>();
        for (T t : this.f26002a.mo36861a()) {
            if (t.isExternal()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo36940b() {
        boolean z;
        ArrayList<UserInfo> a = this.f26002a.mo36861a();
        if (this.f26003b.mo36899j().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        PermissionAnalyticV2.m39632a(a, z, this.f26003b.mo36897h(), this.f26003b.mo36898i());
        this.f26003b.mo36900k();
        this.f26002a.mo36868a(this.f26003b.mo36897h(), this.f26003b.mo36898i(), this.f26003b.mo36899j(), new C9669d(this));
    }

    /* renamed from: c */
    private final boolean m40025c() {
        boolean z;
        if (!this.f26007g.mo38844q() || !this.f26007g.ab()) {
            z = false;
        } else {
            z = true;
        }
        C13479a.m54764b("InviteMemberManagerPresenter", "adminCanCross=" + this.f26007g.mo38793B() + ", " + "isOwner=" + this.f26007g.mo38845r() + ',' + "externalAccess=" + this.f26007g.mo38794C() + ',' + "inviteExternal = " + this.f26007g.mo38795D() + ", " + "isWiki2 = " + z);
        if (!this.f26007g.mo38793B() || this.f26007g.mo38845r() || ((this.f26007g.mo38794C() && this.f26007g.mo38795D()) || z)) {
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/doc/DocInviteMemberManagerPresenter$sure$1", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestCallback;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteResult;", "onFailed", "", "throwable", "", "onSuccess", "result", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c.c$d */
    public static final class C9669d implements AbstractC5204e<InviteResult> {

        /* renamed from: a */
        final /* synthetic */ DocInviteMemberManagerPresenter f26012a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9669d(DocInviteMemberManagerPresenter cVar) {
            this.f26012a = cVar;
        }

        /* renamed from: a */
        public void mo20806a(InviteResult inviteResult) {
            Intrinsics.checkParameterIsNotNull(inviteResult, "result");
            this.f26012a.mo36938a(inviteResult);
        }

        @Override // com.bytedance.ee.bear.contract.net.AbstractC5204e
        /* renamed from: a */
        public void mo20807a(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            this.f26012a.mo36939a(th);
        }
    }

    /* renamed from: b */
    private final void m40024b(Throwable th) {
        PermissionAnalytic.m39416a(this.f26002a.mo36861a(), this.f26007g.mo38827c(), this.f26007g.mo38825b(), this.f26003b.mo36897h(), th);
    }

    /* renamed from: b */
    private final void m40023b(InviteResult inviteResult) {
        PermissionAnalytic.m39415a(this.f26002a.mo36861a(), this.f26007g.mo38827c(), this.f26007g.mo38825b(), this.f26003b.mo36897h(), String.valueOf(inviteResult.getCode()), inviteResult.getMsg());
    }

    /* renamed from: a */
    private final void m40022a(ArrayList<UserInfo> arrayList) {
        String str;
        String str2;
        String displayName;
        String id;
        C13479a.m54764b("InviteMemberManagerPresenter", "showAskOwner()...");
        UserInfo userInfo = this.f26009i;
        if (userInfo == null || (id = userInfo.getId()) == null) {
            str = "";
        } else {
            str = id;
        }
        Locale d = C4484g.m18494b().mo17253d();
        UserInfo userInfo2 = this.f26009i;
        if (userInfo2 == null || (displayName = userInfo2.getDisplayName(d)) == null) {
            str2 = "";
        } else {
            str2 = displayName;
        }
        AskOwnerPanel.f26086c.mo36991a(this.f26005e, this.f26007g.mo38827c(), this.f26007g.mo38825b(), str, str2, arrayList, 1, this.f26008h, this.f26007g.mo38830e(), this.f26007g.mo38844q());
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36938a(com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteResult r5) {
        /*
        // Method dump skipped, instructions count: 133
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.doc.DocInviteMemberManagerPresenter.mo36938a(com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteResult):void");
    }

    /* renamed from: a */
    public final void mo36939a(Throwable th) {
        this.f26003b.mo36901l();
        ArrayList<UserInfo> d = m40026d();
        if (!NotNotifyOperator.f26826a.mo37758a(th) || !m40025c() || !(!d.isEmpty())) {
            this.f26003b.mo36888a(th, this.f26007g.mo38827c(), this.f26008h);
        } else {
            m40027e();
            Dependency bVar = this.f26004c;
            if (bVar != null) {
                bVar.mo36929b();
            }
            m40028f();
            m40022a(d);
        }
        m40024b(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DocInviteMemberManagerPresenter(FragmentActivity fragmentActivity, C10917c cVar, IInviteMemberManagerContract.IModel aVar, IInviteMemberManagerContract.IView bVar, Dependency bVar2, DocPermSetInfo docPermSetInfo, String str, UserInfo userInfo, boolean z) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        Intrinsics.checkParameterIsNotNull(str, "module");
        this.f26005e = fragmentActivity;
        this.f26006f = cVar;
        this.f26002a = aVar;
        this.f26003b = bVar;
        this.f26004c = bVar2;
        this.f26007g = docPermSetInfo;
        this.f26008h = str;
        this.f26009i = userInfo;
        this.f26010j = z;
    }
}
