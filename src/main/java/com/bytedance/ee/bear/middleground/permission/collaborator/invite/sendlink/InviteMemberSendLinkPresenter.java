package com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink;

import android.content.Context;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalytic;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.IInviteMemberSendLinkContract;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.SelectedUserChangeListener;
import com.bytedance.ee.bear.middleground.permission.util.NotNotifyOperator;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0003\u001b\u001c\u001dB7\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0014J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/InviteMemberSendLinkPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/IInviteMemberSendLinkContract$IModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/IInviteMemberSendLinkContract$IView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/IInviteMemberSendLinkContract$IView$IViewDelegate;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/SelectedUserChangeListener;", "view", "model", "context", "Landroid/content/Context;", "dependency", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/InviteMemberSendLinkPresenter$Dependency;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "module", "", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/IInviteMemberSendLinkContract$IView;Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/IInviteMemberSendLinkContract$IModel;Landroid/content/Context;Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/InviteMemberSendLinkPresenter$Dependency;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;Ljava/lang/String;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "create", "", "createViewDelegate", "destroy", "onAddUser", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "onRemoveUser", "Companion", "Dependency", "ViewDelegate", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.f */
public final class InviteMemberSendLinkPresenter extends BasePresenter<IInviteMemberSendLinkContract.IModel, IInviteMemberSendLinkContract.IView, IInviteMemberSendLinkContract.IView.IViewDelegate> implements SelectedUserChangeListener {

    /* renamed from: h */
    public static final Companion f26221h = new Companion(null);

    /* renamed from: a */
    public C68289a f26222a = new C68289a();

    /* renamed from: b */
    public final IInviteMemberSendLinkContract.IView f26223b;

    /* renamed from: c */
    public final IInviteMemberSendLinkContract.IModel f26224c;

    /* renamed from: d */
    public final Context f26225d;

    /* renamed from: e */
    public final Dependency f26226e;

    /* renamed from: f */
    public final DocPermSetInfo f26227f;

    /* renamed from: g */
    public final String f26228g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/InviteMemberSendLinkPresenter$Dependency;", "", "askOwner", "", "back", "finish", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.f$b */
    public interface Dependency {
        /* renamed from: a */
        void mo37120a();

        /* renamed from: b */
        void mo37121b();

        /* renamed from: c */
        void mo37122c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/InviteMemberSendLinkPresenter$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IInviteMemberSendLinkContract.IView.IViewDelegate createViewDelegate() {
        return new ViewDelegate();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/InviteMemberSendLinkPresenter$ViewDelegate;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/IInviteMemberSendLinkContract$IView$IViewDelegate;", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/InviteMemberSendLinkPresenter;)V", "onAskOwnerClick", "", "onBack", "onRemoveUser", "position", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "onSendLinkClick", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.f$c */
    public final class ViewDelegate implements IInviteMemberSendLinkContract.IView.IViewDelegate {
        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.IInviteMemberSendLinkContract.IView.IViewDelegate
        /* renamed from: a */
        public void mo37115a() {
            Dependency bVar = InviteMemberSendLinkPresenter.this.f26226e;
            if (bVar != null) {
                bVar.mo37120a();
            }
            PermissionAnalyticV2.m39586H();
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.IInviteMemberSendLinkContract.IView.IViewDelegate
        /* renamed from: c */
        public void mo37118c() {
            Dependency bVar = InviteMemberSendLinkPresenter.this.f26226e;
            if (bVar != null) {
                bVar.mo37122c();
            }
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.IInviteMemberSendLinkContract.IView.IViewDelegate
        /* renamed from: b */
        public void mo37117b() {
            InviteMemberSendLinkPresenter.this.f26223b.mo37114a(true);
            InviteMemberSendLinkPresenter.this.f26222a.mo237937a(InviteMemberSendLinkPresenter.this.f26224c.mo37107a(InviteMemberSendLinkPresenter.this.f26223b.mo37112a()).mo238001b(new C9719a(this), new C9720b(this)));
            PermissionAnalytic.m39411a("send_link_no_perm", InviteMemberSendLinkPresenter.this.f26228g, InviteMemberSendLinkPresenter.this.f26227f.mo38825b(), InviteMemberSendLinkPresenter.this.f26227f.mo38827c());
            PermissionAnalyticV2.m39630a(InviteMemberSendLinkPresenter.this.f26224c.mo37108a(), InviteMemberSendLinkPresenter.this.f26223b.mo37112a());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegate() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.f$c$a */
        static final class C9719a<T> implements Consumer<SimpleRequestResult> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f26230a;

            C9719a(ViewDelegate cVar) {
                this.f26230a = cVar;
            }

            /* renamed from: a */
            public final void accept(SimpleRequestResult simpleRequestResult) {
                InviteMemberSendLinkPresenter.this.f26223b.mo37114a(false);
                Toast.showSuccessText(InviteMemberSendLinkPresenter.this.f26225d, InviteMemberSendLinkPresenter.this.f26225d.getString(R.string.Doc_Permission_SendSuccess), 0);
                Dependency bVar = InviteMemberSendLinkPresenter.this.f26226e;
                if (bVar != null) {
                    bVar.mo37121b();
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.f$c$b */
        static final class C9720b<T> implements Consumer<Throwable> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f26231a;

            C9720b(ViewDelegate cVar) {
                this.f26231a = cVar;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                C13479a.m54758a("InviteMemberSendLinkPresenter", "onSendLinkClick()...error = " + th.getMessage());
                InviteMemberSendLinkPresenter.this.f26223b.mo37114a(false);
                Context context = InviteMemberSendLinkPresenter.this.f26225d;
                Intrinsics.checkExpressionValueIsNotNull(th, "it");
                NotNotifyOperator.m41299a(context, th, InviteMemberSendLinkPresenter.this.f26227f.mo38827c(), InviteMemberSendLinkPresenter.this.f26228g, InviteMemberSendLinkPresenter.this.f26224c.mo37108a());
            }
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.IInviteMemberSendLinkContract.IView.IViewDelegate
        /* renamed from: a */
        public void mo37116a(int i, UserInfo userInfo) {
            Dependency bVar;
            Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
            InviteMemberSendLinkPresenter.this.f26224c.mo37109a(i, userInfo);
            if (InviteMemberSendLinkPresenter.this.f26224c.mo37108a().size() == 0 && (bVar = InviteMemberSendLinkPresenter.this.f26226e) != null) {
                bVar.mo37120a();
            }
            PermissionAnalyticV2.m39587I();
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f26224c.mo37111b(this);
        this.f26222a.mo237935a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f26224c.mo37110a(this);
        this.f26223b.mo37113a(this.f26224c.mo37108a());
        PermissionAnalytic.m39411a("show_send_link", this.f26228g, this.f26227f.mo38825b(), this.f26227f.mo38827c());
        PermissionAnalyticV2.m39659c(this.f26224c.mo37108a());
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.SelectedUserChangeListener
    /* renamed from: a */
    public void mo37126a(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        this.f26223b.mo37113a(this.f26224c.mo37108a());
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.SelectedUserChangeListener
    /* renamed from: b */
    public void mo37127b(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        if (C13657b.m55421a(this.f26224c.mo37108a())) {
            Dependency bVar = this.f26226e;
            if (bVar != null) {
                bVar.mo37120a();
                return;
            }
            return;
        }
        this.f26223b.mo37113a(this.f26224c.mo37108a());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteMemberSendLinkPresenter(IInviteMemberSendLinkContract.IView bVar, IInviteMemberSendLinkContract.IModel aVar, Context context, Dependency bVar2, DocPermSetInfo docPermSetInfo, String str) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        Intrinsics.checkParameterIsNotNull(str, "module");
        this.f26223b = bVar;
        this.f26224c = aVar;
        this.f26225d = context;
        this.f26226e = bVar2;
        this.f26227f = docPermSetInfo;
        this.f26228g = str;
    }
}
