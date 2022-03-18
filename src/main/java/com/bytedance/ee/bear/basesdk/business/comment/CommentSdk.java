package com.bytedance.ee.bear.basesdk.business.comment;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.bear.basesdk.api.AbstractC4379e;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.doc.resupdate.AbstractC5469i;
import com.bytedance.ee.bear.doc.resupdate.C5486o;
import com.bytedance.ee.bear.document.frontendlog.JSLoggerHandler;
import com.bytedance.ee.bear.document.offline.p318e.C5929f;
import com.bytedance.ee.bear.document.statistics.ReportEventHandler;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.comment.C9185d;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.ee.bear.middleground.comment.export.ICommentPermission;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.rn.RnManager;
import com.bytedance.ee.bear.rn.RnSyncManager;
import com.bytedance.ee.bear.util.keyboard.SharePopupWindowKeyboardHeightProvider;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.openplatform.plugins.p1144c.AbstractC25562e;
import com.larksuite.framework.apiplugin.common.Messenger;
import com.larksuite.framework.apiplugin.common.OpenPlatform;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 *2\u00020\u0001:\u0001*B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\rH\u0016J0\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0002J\b\u0010 \u001a\u00020\u0016H\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u001dH\u0016J\u0012\u0010#\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010\u000fH\u0016J \u0010%\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0004R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006+"}, d2 = {"Lcom/bytedance/ee/bear/basesdk/business/comment/CommentSdk;", "Lcom/bytedance/ee/bear/basesdk/api/ICommentSdk$IComment;", "dependency", "Lcom/bytedance/ee/bear/basesdk/business/comment/ICommentDependency;", "(Lcom/bytedance/ee/bear/basesdk/business/comment/ICommentDependency;)V", "activity", "Landroid/app/Activity;", Comment.f24093e, "Lcom/bytedance/ee/bear/middleground/comment/Comment;", "getDependency", "()Lcom/bytedance/ee/bear/basesdk/business/comment/ICommentDependency;", "setDependency", "plugin", "Lcom/bytedance/ee/bear/basesdk/business/comment/BaseCommentPlugin;", "rnConnectListener", "Ljava/lang/Runnable;", "getRnConnectListener", "()Ljava/lang/Runnable;", "setRnConnectListener", "(Ljava/lang/Runnable;)V", "getCommentPlugin", "init", "", "Landroidx/fragment/app/FragmentActivity;", "vg", "Landroid/widget/FrameLayout;", "token", "", ShareHitPoint.f121869d, "", "bitType", "initRn", "onDestroy", "orientationChange", "newOrientation", "setRNConnectListener", "cb", "setSharedKeyboardHeightProvider", "sharedPopupWindow", "Landroid/widget/PopupWindow;", "sharedPopupWindowContentView", "Landroid/view/ViewGroup;", "Companion", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.basesdk.business.comment.b */
public final class CommentSdk implements AbstractC4379e.AbstractC4380a {

    /* renamed from: a */
    public static final Companion f13128a = new Companion(null);

    /* renamed from: b */
    private Comment f13129b;

    /* renamed from: c */
    private Activity f13130c;

    /* renamed from: d */
    private BaseCommentPlugin f13131d;

    /* renamed from: e */
    private Runnable f13132e;

    /* renamed from: f */
    private ICommentDependency f13133f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/basesdk/business/comment/CommentSdk$Companion;", "", "()V", "TAG", "", "getJSSdkFileName", "getJSSdkVersion", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.b$a */
    public static final class Companion {
        /* renamed from: a */
        public final String mo17202a() {
            return "comment_for_gadget.js";
        }

        /* renamed from: b */
        public final String mo17203b() {
            return "1.0.1.71";
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final Runnable mo17199b() {
        return this.f13132e;
    }

    /* renamed from: d */
    public final ICommentDependency mo17201d() {
        return this.f13133f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/basesdk/business/comment/CommentSdk$init$3", "Lcom/bytedance/ee/bear/middleground/comment/CommentServiceImpl$CommentDependence;", "getAppid", "", "getUid", "isGuest", "", "route", "", "url", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.b$d */
    public static final class C4459d implements C9185d.AbstractC9188a {

        /* renamed from: a */
        final /* synthetic */ CommentSdk f13136a;

        /* renamed from: c */
        public boolean mo17212c() {
            return false;
        }

        @Override // com.bytedance.ee.bear.middleground.comment.C9185d.AbstractC9188a
        /* renamed from: a */
        public String mo17209a() {
            return this.f13136a.mo17201d().mo17216a();
        }

        @Override // com.bytedance.ee.bear.middleground.comment.C9185d.AbstractC9188a
        /* renamed from: b */
        public String mo17211b() {
            return this.f13136a.mo17201d().mo17217b();
        }

        @Override // com.bytedance.ee.bear.middleground.comment.C9185d.AbstractC9188a
        /* renamed from: d */
        public /* synthetic */ Boolean mo17213d() {
            return Boolean.valueOf(mo17212c());
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "result", "Lcom/larksuite/framework/apiplugin/common/OpenPlatform$OpenSchemaAsyncHandlerResponse;", "kotlin.jvm.PlatformType", "callback"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.b$d$a */
        static final class C4460a<T> implements AbstractC25897h<OpenPlatform.OpenSchemaAsyncHandlerResponse> {

            /* renamed from: a */
            public static final C4460a f13137a = new C4460a();

            C4460a() {
            }

            /* renamed from: a */
            public final void callback(OpenPlatform.OpenSchemaAsyncHandlerResponse openSchemaAsyncHandlerResponse) {
                int i = openSchemaAsyncHandlerResponse.mErrorCode;
                String str = openSchemaAsyncHandlerResponse.mErrorMessage;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4459d(CommentSdk bVar) {
            this.f13136a = bVar;
        }

        @Override // com.bytedance.ee.bear.middleground.comment.C9185d.AbstractC9188a
        /* renamed from: a */
        public void mo17210a(String str) {
            C13479a.m54764b("CommentSdk", "route url = " + str);
            if (str != null) {
                OpenPlatform.OpenSchemaAsyncHandlerRequest openSchemaAsyncHandlerRequest = new OpenPlatform.OpenSchemaAsyncHandlerRequest();
                openSchemaAsyncHandlerRequest.mSchema = str;
                AbstractC25562e i = this.f13136a.mo17201d().mo17218c().mo85962i();
                Intrinsics.checkExpressionValueIsNotNull(i, "dependency.jsWork().workerBridge");
                i.getBridgeContext().mo92209a("openSchema", openSchemaAsyncHandlerRequest, C4460a.f13137a, OpenPlatform.OpenSchemaAsyncHandlerResponse.class);
            }
        }
    }

    /* renamed from: c */
    public BaseCommentPlugin mo17032a() {
        BaseCommentPlugin aVar = this.f13131d;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("plugin");
        }
        return aVar;
    }

    /* renamed from: e */
    private final void m18399e() {
        C13479a.m54764b("CommentSdk", "initRN");
        C5486o a = ((AbstractC5469i) KoinJavaComponent.m268613a(AbstractC5469i.class, null, null, 6, null)).mo21869a("DOC_CHANNEL");
        Intrinsics.checkExpressionValueIsNotNull(a, "resourceService");
        File a2 = new C5929f(a.mo21913a(), a.mo21914b(), a.mo21915c()).mo23915a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "file");
        ((RnManager) KoinJavaComponent.m268613a(RnManager.class, null, null, 6, null)).mo40251a(a2.getAbsolutePath());
        ((RnManager) KoinJavaComponent.m268613a(RnManager.class, null, null, 6, null)).mo40253a(((RnManager) KoinJavaComponent.m268613a(RnManager.class, null, null, 6, null)).mo40254a());
        ((RnManager) KoinJavaComponent.m268613a(RnManager.class, null, null, 6, null)).mo40252a("biz.util.logger", new JSLoggerHandler());
        AbstractC5233x b = C5234y.m21391b();
        Intrinsics.checkExpressionValueIsNotNull(b, "AnalyticServiceImp.getInstance()");
        ((RnManager) KoinJavaComponent.m268613a(RnManager.class, null, null, 6, null)).mo40252a("biz.statistics.reportEvent", new ReportEventHandler(b));
        RnSyncManager.f28587a.mo40377a(new CommentSdk$initRn$1(this));
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4379e.AbstractC4380a
    /* renamed from: a */
    public void mo17035a(Runnable runnable) {
        this.f13132e = runnable;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.b$b */
    static final class C4455b extends Lambda implements Function1<List<? extends String>, Unit> {
        public static final C4455b INSTANCE = new C4455b();

        C4455b() {
            super(1);
        }

        public final void invoke(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "it");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
            invoke((List<String>) list);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.b$c */
    static final class C4456c extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ CommentSdk this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4456c(CommentSdk bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            C13479a.m54764b("CommentSdk", "goto profile uid = " + str + ", user_id_type = " + C9185d.f24686c);
            if (str != null) {
                if (C9185d.f24686c == 1) {
                    Messenger.EnterProfileAsyncHandlerRequest enterProfileAsyncHandlerRequest = new Messenger.EnterProfileAsyncHandlerRequest();
                    enterProfileAsyncHandlerRequest.mOpenId = str;
                    AbstractC25562e i = this.this$0.mo17201d().mo17218c().mo85962i();
                    Intrinsics.checkExpressionValueIsNotNull(i, "dependency.jsWork().workerBridge");
                    i.getBridgeContext().mo92209a("enterProfile", enterProfileAsyncHandlerRequest, C44571.f13134a, Messenger.EnterProfileAsyncHandlerResponse.class);
                    return;
                }
                Messenger.EnterProfileByUserRequest enterProfileByUserRequest = new Messenger.EnterProfileByUserRequest();
                enterProfileByUserRequest.mUserId = str;
                AbstractC25562e i2 = this.this$0.mo17201d().mo17218c().mo85962i();
                Intrinsics.checkExpressionValueIsNotNull(i2, "dependency.jsWork().workerBridge");
                i2.getBridgeContext().mo92209a("enterProfileByUserId", enterProfileByUserRequest, C44582.f13135a, Messenger.EnterProfileByUserResponse.class);
            }
        }
    }

    public CommentSdk(ICommentDependency cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "dependency");
        this.f13133f = cVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/basesdk/business/comment/CommentSdk$setSharedKeyboardHeightProvider$1", "Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightProvider$Factory;", "createKeyboardHeightProvider", "Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightProvider;", "activity", "Landroid/app/Activity;", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.b$e */
    public static final class C4461e extends AbstractC10550f.AbstractC10551a {

        /* renamed from: a */
        final /* synthetic */ PopupWindow f13138a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f13139b;

        @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10550f.AbstractC10551a
        /* renamed from: a */
        public AbstractC10550f mo17215a(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            return new SharePopupWindowKeyboardHeightProvider(activity, this.f13138a, this.f13139b);
        }

        C4461e(PopupWindow popupWindow, ViewGroup viewGroup) {
            this.f13138a = popupWindow;
            this.f13139b = viewGroup;
        }
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4379e.AbstractC4380a
    /* renamed from: a */
    public void mo17033a(Activity activity, PopupWindow popupWindow, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(popupWindow, "sharedPopupWindow");
        Intrinsics.checkParameterIsNotNull(viewGroup, "sharedPopupWindowContentView");
        AbstractC10550f.AbstractC10551a.m43716a(activity, new C4461e(popupWindow, viewGroup));
        AbstractC10550f.AbstractC10551a.m43717b(activity);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4379e.AbstractC4380a
    /* renamed from: a */
    public void mo17034a(FragmentActivity fragmentActivity, FrameLayout frameLayout, String str, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(frameLayout, "vg");
        Intrinsics.checkParameterIsNotNull(str, "token");
        C13479a.m54764b("CommentSdk", "init");
        m18399e();
        FragmentActivity fragmentActivity2 = fragmentActivity;
        this.f13130c = fragmentActivity2;
        AbstractC10550f b = AbstractC10550f.AbstractC10551a.m43717b(fragmentActivity2);
        this.f13131d = new BaseCommentPlugin();
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "activity.supportFragmentManager");
        C8275a aVar = new C8275a(i, "", "");
        BaseCommentPlugin aVar2 = this.f13131d;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("plugin");
        }
        ICommentPermission b2 = aVar2.mo17169b();
        Intrinsics.checkExpressionValueIsNotNull(b, "keyboardHeightProvider");
        this.f13129b = new Comment(fragmentActivity, frameLayout, frameLayout, supportFragmentManager, str, "not support", aVar, false, "", 1, 0, b2, false, false, false, b, true, false, false, null, C4455b.INSTANCE);
        BaseCommentPlugin aVar3 = this.f13131d;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("plugin");
        }
        Comment aVar4 = this.f13129b;
        if (aVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Comment.f24093e);
        }
        aVar3.mo17167a(fragmentActivity2, aVar4);
        Comment aVar5 = this.f13129b;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Comment.f24093e);
        }
        aVar5.mo34343k(new C4456c(this));
        Comment aVar6 = this.f13129b;
        if (aVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Comment.f24093e);
        }
        aVar6.mo34314b().mo35323c(false);
        Comment aVar7 = this.f13129b;
        if (aVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Comment.f24093e);
        }
        aVar7.mo34300a(this.f13133f.mo17219d());
        C9185d.f24684a = new C4459d(this);
    }
}
