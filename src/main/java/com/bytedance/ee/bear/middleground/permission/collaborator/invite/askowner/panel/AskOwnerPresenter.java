package com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.panel;

import android.content.Context;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalytic;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.panel.IAskOwnerContract;
import com.bytedance.ee.bear.middleground.permission.util.NotNotifyOperator;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 #2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002#$Bu\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0014J\b\u0010 \u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020\u001eH\u0002J\b\u0010\"\u001a\u00020\u001eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/AskOwnerPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/IAskOwnerContract$IModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/IAskOwnerContract$IView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/IAskOwnerContract$IView$IViewDelegate;", "context", "Landroid/content/Context;", "model", "view", "dependency", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/AskOwnerPresenter$Dependency;", "ownerName", "", "token", ShareHitPoint.f121869d, "", "module", "from", "invitedUserList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "subType", "isWiki", "", "(Landroid/content/Context;Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/IAskOwnerContract$IModel;Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/IAskOwnerContract$IView;Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/AskOwnerPresenter$Dependency;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/util/ArrayList;Ljava/lang/String;Z)V", "disposable", "Lio/reactivex/disposables/Disposable;", "fromChat", "create", "", "createViewDelegate", "destroy", "reportSendAskOwner", "reportShowAskOwner", "Companion", "Dependency", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.a.d */
public final class AskOwnerPresenter extends BasePresenter<IAskOwnerContract.IModel, IAskOwnerContract.IView, IAskOwnerContract.IView.IViewDelegate> {

    /* renamed from: i */
    public static final Companion f26098i = new Companion(null);

    /* renamed from: a */
    public Disposable f26099a;

    /* renamed from: b */
    public final Context f26100b;

    /* renamed from: c */
    public Dependency f26101c;

    /* renamed from: d */
    public String f26102d;

    /* renamed from: e */
    public String f26103e;

    /* renamed from: f */
    public final int f26104f;

    /* renamed from: g */
    public String f26105g;

    /* renamed from: h */
    public final ArrayList<UserInfo> f26106h;

    /* renamed from: j */
    private final boolean f26107j;

    /* renamed from: k */
    private final int f26108k;

    /* renamed from: l */
    private final String f26109l;

    /* renamed from: m */
    private final boolean f26110m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/AskOwnerPresenter$Dependency;", "", "close", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.a.d$b */
    public interface Dependency {
        /* renamed from: f */
        void mo36989f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/AskOwnerPresenter$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IAskOwnerContract.IView.IViewDelegate createViewDelegate() {
        return new C9684c(this);
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m40099c();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        Disposable disposable;
        super.destroy();
        Disposable disposable2 = this.f26099a;
        if ((disposable2 == null || !disposable2.isDisposed()) && (disposable = this.f26099a) != null) {
            disposable.dispose();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/AskOwnerPresenter$createViewDelegate$1", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/IAskOwnerContract$IView$IViewDelegate;", "onOwnerNameClicked", "", "ownerId", "", "onRequestBtnClicked", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.a.d$c */
    public static final class C9684c implements IAskOwnerContract.IView.IViewDelegate {

        /* renamed from: a */
        final /* synthetic */ AskOwnerPresenter f26111a;

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.panel.IAskOwnerContract.IView.IViewDelegate
        /* renamed from: a */
        public void mo36994a() {
            this.f26111a.mo36993b();
            AskOwnerPresenter dVar = this.f26111a;
            dVar.f26099a = ((IAskOwnerContract.IModel) dVar.getModel()).mo36988a(((IAskOwnerContract.IView) this.f26111a.getView()).mo37002c(), ((IAskOwnerContract.IView) this.f26111a.getView()).mo37001b()).mo238001b(new C9685a(this), new C9686b(this));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9684c(AskOwnerPresenter dVar) {
            this.f26111a = dVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.a.d$c$a */
        static final class C9685a<T> implements Consumer<SimpleRequestResult> {

            /* renamed from: a */
            final /* synthetic */ C9684c f26112a;

            C9685a(C9684c cVar) {
                this.f26112a = cVar;
            }

            /* renamed from: a */
            public final void accept(SimpleRequestResult simpleRequestResult) {
                Toast.showSuccessText(this.f26112a.f26111a.f26100b, (int) R.string.Doc_Permission_SendApplySuccess);
                this.f26112a.f26111a.f26101c.mo36989f();
            }
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.panel.IAskOwnerContract.IView.IViewDelegate
        /* renamed from: a */
        public void mo36995a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "ownerId");
            ((AbstractC5586d) KoinJavaComponent.m268613a(AbstractC5586d.class, null, null, 6, null)).mo22257a(str, "");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.a.d$c$b */
        static final class C9686b<T> implements Consumer<Throwable> {

            /* renamed from: a */
            final /* synthetic */ C9684c f26113a;

            C9686b(C9684c cVar) {
                this.f26113a = cVar;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                C13479a.m54758a("AskOwnerPresenter", "ask owner error: " + th.getMessage());
                Locale d = C4484g.m18494b().mo17253d();
                Context context = this.f26113a.f26111a.f26100b;
                String str = this.f26113a.f26111a.f26102d;
                Intrinsics.checkExpressionValueIsNotNull(d, "locale");
                Intrinsics.checkExpressionValueIsNotNull(th, "it");
                NotNotifyOperator.m41296a(context, str, d, th, this.f26113a.f26111a.f26103e, this.f26113a.f26111a.f26104f, this.f26113a.f26111a.f26105g, this.f26113a.f26111a.f26106h);
            }
        }
    }

    /* renamed from: c */
    private final void m40099c() {
        String str;
        if (this.f26108k == 2) {
            str = "IM_card";
        } else {
            str = "add_cooperator";
        }
        PermissionAnalytic.m39414a(str, "share", this.f26105g, this.f26103e, this.f26104f);
        PermissionAnalyticV2.m39615a(this.f26103e, this.f26104f, this.f26109l, this.f26110m, this.f26105g, this.f26107j, this.f26106h);
    }

    /* renamed from: b */
    public final void mo36993b() {
        String str;
        if (this.f26107j) {
            str = "IM_card";
        } else {
            str = "add_cooperator";
        }
        PermissionAnalytic.m39424b(str, "share", this.f26105g, this.f26103e, this.f26104f);
        PermissionAnalyticV2.m39610a(this.f26103e, this.f26104f, this.f26109l, this.f26110m, this.f26105g, ((IAskOwnerContract.IView) getView()).mo37002c(), ((IAskOwnerContract.IView) getView()).mo37001b(), this.f26107j, this.f26106h);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AskOwnerPresenter(Context context, IAskOwnerContract.IModel aVar, IAskOwnerContract.IView bVar, Dependency bVar2, String str, String str2, int i, String str3, int i2, ArrayList<UserInfo> arrayList, String str4, boolean z) {
        super(aVar, bVar);
        boolean z2;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(bVar2, "dependency");
        Intrinsics.checkParameterIsNotNull(str, "ownerName");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        Intrinsics.checkParameterIsNotNull(str3, "module");
        Intrinsics.checkParameterIsNotNull(arrayList, "invitedUserList");
        Intrinsics.checkParameterIsNotNull(str4, "subType");
        this.f26100b = context;
        this.f26101c = bVar2;
        this.f26102d = str;
        this.f26103e = str2;
        this.f26104f = i;
        this.f26105g = str3;
        this.f26108k = i2;
        this.f26106h = arrayList;
        this.f26109l = str4;
        this.f26110m = z;
        if (i2 == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f26107j = z2;
    }
}
