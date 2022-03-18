package com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner;

import android.content.Context;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalytic;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.IInviteMemberAskOwnerContract;
import com.bytedance.ee.bear.middleground.permission.util.NotNotifyOperator;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u001b2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0003\u001b\u001c\u001dBO\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0014J\b\u0010\u001a\u001a\u00020\u0018H\u0016R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/InviteMemberAskOwnerPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/IInviteMemberAskOwnerContract$IModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/IInviteMemberAskOwnerContract$IView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/IInviteMemberAskOwnerContract$IView$IViewDelegate;", "view", "model", "context", "Landroid/content/Context;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "dependency", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/InviteMemberAskOwnerPresenter$Dependency;", "module", "", ShareHitPoint.f121868c, "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "ownerInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/IInviteMemberAskOwnerContract$IView;Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/IInviteMemberAskOwnerContract$IModel;Landroid/content/Context;Lcom/bytedance/ee/bear/service/ServiceContext;Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/InviteMemberAskOwnerPresenter$Dependency;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;Lcom/bytedance/ee/bear/share/export/UserInfo;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "create", "", "createViewDelegate", "destroy", "Companion", "Dependency", "ViewDelegate", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.e */
public final class InviteMemberAskOwnerPresenter extends BasePresenter<IInviteMemberAskOwnerContract.IModel, IInviteMemberAskOwnerContract.IView, IInviteMemberAskOwnerContract.IView.IViewDelegate> {

    /* renamed from: j */
    public static final Companion f26154j = new Companion(null);

    /* renamed from: a */
    public C68289a f26155a = new C68289a();

    /* renamed from: b */
    public final IInviteMemberAskOwnerContract.IView f26156b;

    /* renamed from: c */
    public final IInviteMemberAskOwnerContract.IModel f26157c;

    /* renamed from: d */
    public final Context f26158d;

    /* renamed from: e */
    public final Dependency f26159e;

    /* renamed from: f */
    public final String f26160f;

    /* renamed from: g */
    public final String f26161g;

    /* renamed from: h */
    public final DocPermSetInfo f26162h;

    /* renamed from: i */
    public final UserInfo f26163i;

    /* renamed from: k */
    private final C10917c f26164k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/InviteMemberAskOwnerPresenter$Dependency;", "", "back", "", "finish", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.e$b */
    public interface Dependency {
        /* renamed from: a */
        void mo37024a();

        /* renamed from: b */
        void mo37025b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/InviteMemberAskOwnerPresenter$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IInviteMemberAskOwnerContract.IView.IViewDelegate createViewDelegate() {
        return new ViewDelegate();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/InviteMemberAskOwnerPresenter$ViewDelegate;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/IInviteMemberAskOwnerContract$IView$IViewDelegate;", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/InviteMemberAskOwnerPresenter;)V", "onAskOwnerClick", "", "onBack", "onRemoveUser", "position", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.e$c */
    public final class ViewDelegate implements IInviteMemberAskOwnerContract.IView.IViewDelegate {
        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.IInviteMemberAskOwnerContract.IView.IViewDelegate
        /* renamed from: a */
        public void mo37021a() {
            Dependency bVar = InviteMemberAskOwnerPresenter.this.f26159e;
            if (bVar != null) {
                bVar.mo37024a();
            }
            PermissionAnalyticV2.m39585G();
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.IInviteMemberAskOwnerContract.IView.IViewDelegate
        /* renamed from: b */
        public void mo37023b() {
            InviteMemberAskOwnerPresenter.this.f26156b.mo37020a(true);
            InviteMemberAskOwnerPresenter.this.f26155a.mo237937a(InviteMemberAskOwnerPresenter.this.f26157c.mo37015a(InviteMemberAskOwnerPresenter.this.f26156b.mo37018a()).mo238001b(new C9695a(this), new C9696b(this)));
            PermissionAnalytic.m39412a("send_ask_owner", InviteMemberAskOwnerPresenter.this.f26161g, InviteMemberAskOwnerPresenter.this.f26160f, InviteMemberAskOwnerPresenter.this.f26162h.mo38825b(), InviteMemberAskOwnerPresenter.this.f26162h.mo38827c());
            PermissionAnalyticV2.m39624a(InviteMemberAskOwnerPresenter.this.f26156b.mo37018a(), InviteMemberAskOwnerPresenter.this.f26157c.mo37016a());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegate() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.e$c$a */
        static final class C9695a<T> implements Consumer<SimpleRequestResult> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f26166a;

            C9695a(ViewDelegate cVar) {
                this.f26166a = cVar;
            }

            /* renamed from: a */
            public final void accept(SimpleRequestResult simpleRequestResult) {
                InviteMemberAskOwnerPresenter.this.f26156b.mo37020a(false);
                Toast.showSuccessText(InviteMemberAskOwnerPresenter.this.f26158d, InviteMemberAskOwnerPresenter.this.f26158d.getString(R.string.Doc_Permission_SendApplySuccess), 0);
                Dependency bVar = InviteMemberAskOwnerPresenter.this.f26159e;
                if (bVar != null) {
                    bVar.mo37025b();
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.e$c$b */
        static final class C9696b<T> implements Consumer<Throwable> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f26167a;

            C9696b(ViewDelegate cVar) {
                this.f26167a = cVar;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                C13479a.m54758a("InviteMemberAskOwnerPresenter", "onAskOwnerClick()...error = " + th.getMessage());
                InviteMemberAskOwnerPresenter.this.f26156b.mo37020a(false);
                Locale d = C4484g.m18494b().mo17253d();
                Context context = InviteMemberAskOwnerPresenter.this.f26158d;
                UserInfo userInfo = InviteMemberAskOwnerPresenter.this.f26163i;
                Intrinsics.checkExpressionValueIsNotNull(d, "locale");
                Intrinsics.checkExpressionValueIsNotNull(th, "it");
                NotNotifyOperator.m41295a(context, userInfo, d, th, InviteMemberAskOwnerPresenter.this.f26162h.mo38827c(), InviteMemberAskOwnerPresenter.this.f26162h.mo38825b(), InviteMemberAskOwnerPresenter.this.f26160f, InviteMemberAskOwnerPresenter.this.f26157c.mo37016a());
            }
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.IInviteMemberAskOwnerContract.IView.IViewDelegate
        /* renamed from: a */
        public void mo37022a(int i, UserInfo userInfo) {
            Dependency bVar;
            Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
            InviteMemberAskOwnerPresenter.this.f26157c.mo37017a(i, userInfo);
            if (InviteMemberAskOwnerPresenter.this.f26157c.mo37016a().size() == 0 && (bVar = InviteMemberAskOwnerPresenter.this.f26159e) != null) {
                bVar.mo37024a();
            }
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f26155a.mo237935a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f26156b.mo37019a(this.f26157c.mo37016a());
        PermissionAnalytic.m39412a("show_ask_owner", this.f26161g, this.f26160f, this.f26162h.mo38825b(), this.f26162h.mo38827c());
        PermissionAnalyticV2.m39649b(this.f26157c.mo37016a());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteMemberAskOwnerPresenter(IInviteMemberAskOwnerContract.IView bVar, IInviteMemberAskOwnerContract.IModel aVar, Context context, C10917c cVar, Dependency bVar2, String str, String str2, DocPermSetInfo docPermSetInfo, UserInfo userInfo) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        Intrinsics.checkParameterIsNotNull(str, "module");
        Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        Intrinsics.checkParameterIsNotNull(userInfo, "ownerInfo");
        this.f26156b = bVar;
        this.f26157c = aVar;
        this.f26158d = context;
        this.f26164k = cVar;
        this.f26159e = bVar2;
        this.f26160f = str;
        this.f26161g = str2;
        this.f26162h = docPermSetInfo;
        this.f26163i = userInfo;
    }
}
