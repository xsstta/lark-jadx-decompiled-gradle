package com.bytedance.ee.bear.basesdk.business.comment;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ee.bear.bean.C4517a;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.document.comment.C5711a;
import com.bytedance.ee.bear.document.comment.C5713b;
import com.bytedance.ee.bear.document.comment.adapter.Js2NativeComment;
import com.bytedance.ee.bear.document.comment.bean.C5714Entity;
import com.bytedance.ee.bear.document.comment.bean.CommentJsRequestBean;
import com.bytedance.ee.bear.document.comment.bean.JSEventListener;
import com.bytedance.ee.bear.document.comment.bean.Per;
import com.bytedance.ee.bear.document.comment.bean.ShowCardsJsData;
import com.bytedance.ee.bear.document.frontendlog.JSLoggerHandler;
import com.bytedance.ee.bear.document.offline.base.C5909f;
import com.bytedance.ee.bear.document.statistics.ReportEventHandler;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.jsbridge.C7939a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.comment.C9185d;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.ee.bear.middleground.comment.control.DataControl;
import com.bytedance.ee.bear.middleground.comment.export.AbstractC9224g;
import com.bytedance.ee.bear.middleground.comment.export.Action;
import com.bytedance.ee.bear.middleground.comment.export.ICommentPermission;
import com.bytedance.ee.bear.middleground.comment.export.IDataTransformer;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentInputRequest;
import com.bytedance.ee.bear.middleground.comment.export.bean.SwitchCardBean;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.rn.RnManager;
import com.bytedance.ee.bear.rn.handler.CommentHandleMessageHandler;
import com.bytedance.ee.bear.rn.handler.RNSyncWebService;
import com.bytedance.ee.bear.rn.handler.SendMessageHandler;
import com.bytedance.ee.util.C13655e;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p701d.C13616d;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13749l;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.apiplugin.AbstractC25937e;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25896g;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.disposables.C68289a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 +2\u00020\u0001:\f*+,-./012345B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0006\u0010!\u001a\u00020\"J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u001eH\u0002J\u0016\u0010'\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010(\u001a\u00020\u001eJ\b\u0010)\u001a\u00020\u001eH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u0010X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/bytedance/ee/bear/basesdk/business/comment/BaseCommentPlugin;", "Lcom/larksuite/framework/apiplugin/LKPlugin;", "()V", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", Comment.f24093e, "Lcom/bytedance/ee/bear/middleground/comment/Comment;", "commentListenerCb", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "dispose", "Lio/reactivex/disposables/CompositeDisposable;", "jsHandlers", "", "", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "showCardsJsData", "Lcom/bytedance/ee/bear/document/comment/bean/ShowCardsJsData;", "viewModel", "Lcom/bytedance/ee/bear/document/comment/CommentPanelViewModel;", "addEvents", "", "filter", "Lcom/larksuite/framework/apiplugin/api/LKEventFilter;", "getCommentPer", "Lcom/bytedance/ee/bear/middleground/comment/export/ICommentPermission;", "handleEvent", "Lcom/larksuite/framework/apiplugin/entity/LKPluginHandleResult;", "event", "Lcom/larksuite/framework/apiplugin/LKEvent;", "init", "onDestroy", "onRelease", "CloseCardsHandler", "Companion", "HideInputHandler", "JSAddEventListener", "JSCommentRequestNative", "RemoveEntityHandler", "SetCurrentUserHandler", "SetEntityHandler", "ShowCardsHandler", "ShowInputHandler", "SwitchCardHandler", "UpdateMinaSessionHandler", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.basesdk.business.comment.a */
public final class BaseCommentPlugin extends AbstractC25937e {

    /* renamed from: h */
    public static final Companion f13102h = new Companion(null);

    /* renamed from: a */
    public C5711a f13103a;

    /* renamed from: b */
    public Comment f13104b;

    /* renamed from: c */
    public AbstractC7947h f13105c;

    /* renamed from: d */
    public final Map<String, AbstractC7945d<?>> f13106d;

    /* renamed from: e */
    public LifecycleOwner f13107e;

    /* renamed from: f */
    public Activity f13108f;

    /* renamed from: g */
    public ShowCardsJsData f13109g;

    /* renamed from: i */
    private final C68289a f13110i = new C68289a();

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/basesdk/business/comment/BaseCommentPlugin$Companion;", "", "()V", "TAG", "", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.a$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final ICommentPermission mo17169b() {
        return new C4444m(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/basesdk/business/comment/BaseCommentPlugin$getCommentPer$1", "Lcom/bytedance/ee/bear/middleground/comment/export/ICommentPermission;", "getComment", "", "getCopy", "getDelete", "getResolve", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.a$m */
    public static final class C4444m implements ICommentPermission {

        /* renamed from: a */
        final /* synthetic */ BaseCommentPlugin f13122a;

        @Override // com.bytedance.ee.bear.middleground.comment.export.ICommentPermission
        /* renamed from: a */
        public boolean mo17183a() {
            Per per;
            ShowCardsJsData showCardsJsData = this.f13122a.f13109g;
            if (showCardsJsData == null || (per = showCardsJsData.permission) == null || !per.copy) {
                return false;
            }
            return true;
        }

        @Override // com.bytedance.ee.bear.middleground.comment.export.ICommentPermission
        /* renamed from: b */
        public boolean mo17184b() {
            Per per;
            ShowCardsJsData showCardsJsData = this.f13122a.f13109g;
            if (showCardsJsData == null || (per = showCardsJsData.permission) == null || !per.comment) {
                return false;
            }
            return true;
        }

        @Override // com.bytedance.ee.bear.middleground.comment.export.ICommentPermission
        /* renamed from: c */
        public boolean mo17185c() {
            Per per;
            ShowCardsJsData showCardsJsData = this.f13122a.f13109g;
            if (showCardsJsData == null || (per = showCardsJsData.permission) == null || !per.resolve) {
                return false;
            }
            return true;
        }

        @Override // com.bytedance.ee.bear.middleground.comment.export.ICommentPermission
        /* renamed from: d */
        public boolean mo17186d() {
            Per per;
            ShowCardsJsData showCardsJsData = this.f13122a.f13109g;
            if (showCardsJsData == null || (per = showCardsJsData.permission) == null || !per.delete) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4444m(BaseCommentPlugin aVar) {
            this.f13122a = aVar;
        }
    }

    /* renamed from: a */
    public final Activity mo17166a() {
        Activity activity = this.f13108f;
        if (activity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activity");
        }
        return activity;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.a$n */
    static final class RunnableC4445n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BaseCommentPlugin f13123a;

        /* renamed from: b */
        final /* synthetic */ LKEvent f13124b;

        RunnableC4445n(BaseCommentPlugin aVar, LKEvent lKEvent) {
            this.f13123a = aVar;
            this.f13124b = lKEvent;
        }

        public final void run() {
            String str;
            AbstractC7945d<?> dVar = this.f13123a.f13106d.get(this.f13124b.mo92146m());
            if (dVar != null) {
                JSONObject n = this.f13124b.mo92147n();
                if (n != null) {
                    str = n.toString();
                } else {
                    str = null;
                }
                C7939a.m31736a(str, (AbstractC7945d) dVar, (AbstractC7947h) new AbstractC7947h(this) {
                    /* class com.bytedance.ee.bear.basesdk.business.comment.BaseCommentPlugin.RunnableC4445n.C44461 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC4445n f13125a;

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f13125a = r1;
                    }

                    @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
                    /* renamed from: a */
                    public void mo17189a(NonProguard nonProguard) {
                        this.f13125a.f13124b.mo92132b(nonProguard);
                    }

                    @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
                    /* renamed from: a */
                    public void mo17188a(com.alibaba.fastjson.JSONObject jSONObject) {
                        String str;
                        LKEvent lKEvent = this.f13125a.f13124b;
                        if (jSONObject != null) {
                            str = jSONObject.toJSONString();
                        } else {
                            str = null;
                        }
                        lKEvent.mo92132b(str);
                    }

                    @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
                    /* renamed from: a */
                    public void mo17190a(String str) {
                        this.f13125a.f13124b.mo92132b(str);
                    }
                });
            }
        }
    }

    public BaseCommentPlugin() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("biz.comment.showInput", new ShowInputHandler());
        linkedHashMap.put("biz.comment.hideInput", new HideInputHandler());
        linkedHashMap.put("biz.comment.showCards", new ShowCardsHandler());
        linkedHashMap.put("biz.comment.closePanel", new CloseCardsHandler());
        linkedHashMap.put("biz.comment.activeCards", new SwitchCardHandler());
        linkedHashMap.put("biz.comment.requestNative", new JSCommentRequestNative());
        linkedHashMap.put("biz.comment.commonEventListener", new JSAddEventListener());
        linkedHashMap.put("onAppSessionChanged", new UpdateMinaSessionHandler());
        linkedHashMap.put("biz.comment.setEntity", new SetEntityHandler());
        linkedHashMap.put("biz.comment.currentUser", new SetCurrentUserHandler());
        linkedHashMap.put("biz.comment.removeEntity", new RemoveEntityHandler());
        String a = RNSyncWebService.f28565e.mo40357a();
        SendMessageHandler hVar = new SendMessageHandler();
        hVar.mo40368a(true);
        linkedHashMap.put(a, hVar);
        linkedHashMap.put(RNSyncWebService.f28565e.mo40358b(), new CommentHandleMessageHandler());
        AbstractC5233x b = C5234y.m21391b();
        Intrinsics.checkExpressionValueIsNotNull(b, "AnalyticServiceImp.getInstance()");
        linkedHashMap.put("biz.statistics.reportEvent", new ReportEventHandler(b));
        linkedHashMap.put("biz.util.logger", new JSLoggerHandler());
        this.f13106d = linkedHashMap;
    }

    /* renamed from: c */
    private final void m18376c() {
        C5711a aVar = this.f13103a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        LiveData<CommentInputRequest> commentInputRequest = aVar.getCommentInputRequest();
        LifecycleOwner lifecycleOwner = this.f13107e;
        if (lifecycleOwner == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lifecycleOwner");
        }
        commentInputRequest.mo5923a(lifecycleOwner, new C4447o(this));
        C5711a aVar2 = this.f13103a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        LiveData<ShowCardsJsData> commentCardsRequest = aVar2.getCommentCardsRequest();
        LifecycleOwner lifecycleOwner2 = this.f13107e;
        if (lifecycleOwner2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lifecycleOwner");
        }
        commentCardsRequest.mo5923a(lifecycleOwner2, new C4448p(this));
        Comment aVar3 = this.f13104b;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Comment.f24093e);
        }
        aVar3.mo34309a(new C4449q(this));
        Comment aVar4 = this.f13104b;
        if (aVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Comment.f24093e);
        }
        aVar4.mo34356w().add(new C4450r(this));
        Comment aVar5 = this.f13104b;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Comment.f24093e);
        }
        aVar5.mo34308a(new C4451s(this));
        Comment aVar6 = this.f13104b;
        if (aVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Comment.f24093e);
        }
        aVar6.mo34335g(new C4452t(this));
        Comment aVar7 = this.f13104b;
        if (aVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Comment.f24093e);
        }
        aVar7.mo34331e(new C4453u(this));
        Comment aVar8 = this.f13104b;
        if (aVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Comment.f24093e);
        }
        aVar8.mo34310a(new C4454v(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/basesdk/business/comment/BaseCommentPlugin$CloseCardsHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "", "(Lcom/bytedance/ee/bear/basesdk/business/comment/BaseCommentPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.a$a */
    private final class CloseCardsHandler implements AbstractC7945d<Object> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public CloseCardsHandler() {
        }

        @Override // com.bytedance.ee.bear.jsbridge.AbstractC7948j
        public void handle(Object obj, AbstractC7947h hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "callback");
            Log.i("BaseCommentPlugin", "CloseCardsHandler invoke");
            BaseCommentPlugin.m18375b(BaseCommentPlugin.this).mo34311a(false, true);
            hVar.mo17190a((String) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/basesdk/business/comment/BaseCommentPlugin$HideInputHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/document/comment/bean/ShowCardsJsData;", "(Lcom/bytedance/ee/bear/basesdk/business/comment/BaseCommentPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.a$c */
    private final class HideInputHandler implements AbstractC7945d<ShowCardsJsData> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public HideInputHandler() {
        }

        /* renamed from: a */
        public void handle(ShowCardsJsData showCardsJsData, AbstractC7947h hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "callback");
            Log.i("BaseCommentPlugin", "hideInputHandler invoke");
            BaseCommentPlugin.m18374a(BaseCommentPlugin.this).updateCommentCardsRequest(null);
            hVar.mo17190a((String) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/basesdk/business/comment/BaseCommentPlugin$JSAddEventListener;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/document/comment/bean/JSEventListener;", "(Lcom/bytedance/ee/bear/basesdk/business/comment/BaseCommentPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.a$d */
    private final class JSAddEventListener implements AbstractC7945d<JSEventListener> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public JSAddEventListener() {
        }

        /* renamed from: a */
        public void handle(JSEventListener jSEventListener, AbstractC7947h hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "callback");
            BaseCommentPlugin.this.f13105c = hVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/basesdk/business/comment/BaseCommentPlugin$JSCommentRequestNative;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/document/comment/bean/CommentJsRequestBean;", "(Lcom/bytedance/ee/bear/basesdk/business/comment/BaseCommentPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.a$e */
    private final class JSCommentRequestNative implements AbstractC7945d<CommentJsRequestBean> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public JSCommentRequestNative() {
        }

        /* renamed from: a */
        public void handle(CommentJsRequestBean commentJsRequestBean, AbstractC7947h hVar) {
            String str;
            String action;
            Intrinsics.checkParameterIsNotNull(hVar, "callback");
            StringBuilder sb = new StringBuilder();
            sb.append("JSCommentRequestNative invoke action ");
            if (commentJsRequestBean != null) {
                str = commentJsRequestBean.getAction();
            } else {
                str = null;
            }
            sb.append(str);
            Log.i("BaseCommentPlugin", sb.toString());
            if (commentJsRequestBean != null && !TextUtils.isEmpty(commentJsRequestBean.getAction()) && (action = commentJsRequestBean.getAction()) != null) {
                switch (action.hashCode()) {
                    case -1607257578:
                        if (action.equals("endSync")) {
                            BaseCommentPlugin.m18375b(BaseCommentPlugin.this).mo34332f().mo34704a(commentJsRequestBean.getToken());
                            return;
                        }
                        return;
                    case -961740095:
                        if (action.equals("addTranslateComments")) {
                            BaseCommentPlugin.m18375b(BaseCommentPlugin.this).mo34332f().mo34716d();
                            return;
                        }
                        return;
                    case 114381373:
                        if (action.equals("setTranslateEnableLang")) {
                            BaseCommentPlugin.m18375b(BaseCommentPlugin.this).mo34332f().mo34717e();
                            return;
                        }
                        return;
                    case 1955572130:
                        if (action.equals("showRnDebugDialog") && C13616d.m55262a(BaseCommentPlugin.this.mo17166a())) {
                            ((RnManager) KoinJavaComponent.m268613a(RnManager.class, null, null, 6, null)).mo40260c();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/basesdk/business/comment/BaseCommentPlugin$RemoveEntityHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/document/comment/bean/Entity;", "(Lcom/bytedance/ee/bear/basesdk/business/comment/BaseCommentPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.a$f */
    private final class RemoveEntityHandler implements AbstractC7945d<C5714Entity> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public RemoveEntityHandler() {
        }

        /* renamed from: a */
        public void handle(C5714Entity entity, AbstractC7947h hVar) {
            String str;
            Intrinsics.checkParameterIsNotNull(hVar, "callback");
            DataControl e = BaseCommentPlugin.m18375b(BaseCommentPlugin.this).mo34332f();
            if (entity != null) {
                str = entity.token;
            } else {
                str = null;
            }
            e.mo34704a(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/basesdk/business/comment/BaseCommentPlugin$SetCurrentUserHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "", "(Lcom/bytedance/ee/bear/basesdk/business/comment/BaseCommentPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.a$g */
    private final class SetCurrentUserHandler implements AbstractC7945d<String> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public SetCurrentUserHandler() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            com.alibaba.fastjson.JSONObject jSONObject;
            com.alibaba.fastjson.JSONObject parseObject = com.alibaba.fastjson.JSONObject.parseObject(str);
            String str2 = null;
            if (parseObject != null) {
                jSONObject = parseObject.getJSONObject("user");
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                str2 = jSONObject.getString("id");
            }
            int i = 0;
            if (jSONObject != null) {
                try {
                    Integer integer = jSONObject.getInteger("user_id_type");
                    if (integer != null) {
                        i = integer.intValue();
                    }
                } catch (Exception e) {
                    Log.e("BaseCommentPlugin", "parse user_id_type error!", e);
                }
            }
            Log.i("BaseCommentPlugin", "userId = " + str2 + ", userIdType = " + i);
            C9185d.f24685b = str2;
            C9185d.f24686c = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/basesdk/business/comment/BaseCommentPlugin$SetEntityHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/document/comment/bean/Entity;", "(Lcom/bytedance/ee/bear/basesdk/business/comment/BaseCommentPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.a$h */
    private final class SetEntityHandler implements AbstractC7945d<C5714Entity> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public SetEntityHandler() {
        }

        /* renamed from: a */
        public void handle(C5714Entity entity, AbstractC7947h hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "callback");
            if (entity != null) {
                Comment b = BaseCommentPlugin.m18375b(BaseCommentPlugin.this);
                String token = entity.getToken();
                Intrinsics.checkExpressionValueIsNotNull(token, "data.getToken()");
                b.mo34304a(token);
                BaseCommentPlugin.m18375b(BaseCommentPlugin.this).mo34301a(new C8275a(entity.type, "", ""));
                BaseCommentPlugin.m18375b(BaseCommentPlugin.this).mo34317b(entity.appId);
                hVar.mo17188a(new com.alibaba.fastjson.JSONObject());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/basesdk/business/comment/BaseCommentPlugin$ShowCardsHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/document/comment/bean/ShowCardsJsData;", "(Lcom/bytedance/ee/bear/basesdk/business/comment/BaseCommentPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.a$i */
    private final class ShowCardsHandler implements AbstractC7945d<ShowCardsJsData> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ShowCardsHandler() {
        }

        /* renamed from: a */
        public void handle(ShowCardsJsData showCardsJsData, AbstractC7947h hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "callback");
            if (showCardsJsData != null) {
                Log.i("BaseCommentPlugin", "showCardHandler invoke");
                BaseCommentPlugin.m18374a(BaseCommentPlugin.this).updateCommentCardsRequest(showCardsJsData);
                hVar.mo17190a((String) null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/basesdk/business/comment/BaseCommentPlugin$ShowInputHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentInputRequest;", "(Lcom/bytedance/ee/bear/basesdk/business/comment/BaseCommentPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.a$j */
    private final class ShowInputHandler implements AbstractC7945d<CommentInputRequest> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ShowInputHandler() {
        }

        /* renamed from: a */
        public void handle(CommentInputRequest commentInputRequest, AbstractC7947h hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "callback");
            Log.i("BaseCommentPlugin", "ShowInputHandler invoke");
            BaseCommentPlugin.m18374a(BaseCommentPlugin.this).updateCommentInputRequest(commentInputRequest);
            hVar.mo17190a((String) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/basesdk/business/comment/BaseCommentPlugin$SwitchCardHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/SwitchCardBean;", "(Lcom/bytedance/ee/bear/basesdk/business/comment/BaseCommentPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.a$k */
    private final class SwitchCardHandler implements AbstractC7945d<SwitchCardBean> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public SwitchCardHandler() {
        }

        /* renamed from: a */
        public void handle(SwitchCardBean switchCardBean, AbstractC7947h hVar) {
            Intrinsics.checkParameterIsNotNull(switchCardBean, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Intrinsics.checkParameterIsNotNull(hVar, "callback");
            Log.i("BaseCommentPlugin", "SwitchCardHandler invoke");
            Function1<String, Unit> q = BaseCommentPlugin.m18375b(BaseCommentPlugin.this).mo34350q();
            String commentId = switchCardBean.getCommentId();
            Intrinsics.checkExpressionValueIsNotNull(commentId, "data.commentId");
            q.invoke(commentId);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/basesdk/business/comment/BaseCommentPlugin$UpdateMinaSessionHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "", "(Lcom/bytedance/ee/bear/basesdk/business/comment/BaseCommentPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.a$l */
    private final class UpdateMinaSessionHandler implements AbstractC7945d<String> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public UpdateMinaSessionHandler() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "callback");
            C5909f.f16543b = com.alibaba.fastjson.JSONObject.parseObject(str).getString("session");
            Log.i("BaseCommentPlugin", "mina session = " + str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/bean/At;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.a$s */
    public static final class C4451s extends Lambda implements Function1<C4517a, Unit> {
        final /* synthetic */ BaseCommentPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4451s(BaseCommentPlugin aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4517a aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(C4517a aVar) {
            boolean z;
            StringBuilder sb = new StringBuilder();
            sb.append("mention select invoke, result is null? ");
            if (aVar == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            Log.i("BaseCommentPlugin", sb.toString());
            if (aVar != null) {
                com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
                jSONObject.put("action", (Object) "onMention");
                jSONObject.put("id", (Object) aVar.f13215d);
                jSONObject.put("avatar_url", (Object) aVar.f13216e);
                jSONObject.put("name", (Object) aVar.f13218g);
                jSONObject.put("en_name", (Object) aVar.f13219h);
                jSONObject.put("cn_name", (Object) aVar.f13220i);
                jSONObject.put("union_id", (Object) aVar.f13229r);
                jSONObject.put("department", (Object) aVar.f13230s);
                AbstractC7947h hVar = this.this$0.f13105c;
                if (hVar != null) {
                    hVar.mo17188a(jSONObject);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "s", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.a$t */
    public static final class C4452t extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ BaseCommentPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4452t(BaseCommentPlugin aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Log.i("BaseCommentPlugin", "switch " + str);
            AbstractC7947h hVar = this.this$0.f13105c;
            if (hVar != null) {
                hVar.mo17188a(new C5713b().mo22806a(str, ""));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "hasAnim", "", "invoke", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.a$u */
    public static final class C4453u extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ BaseCommentPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4453u(BaseCommentPlugin aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool);
            return Unit.INSTANCE;
        }

        public final void invoke(Boolean bool) {
            Log.i("BaseCommentPlugin", "clost comment listener invoke");
            AbstractC7947h hVar = this.this$0.f13105c;
            if (hVar != null) {
                com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
                jSONObject.put(ShareHitPoint.f121869d, (Object) "show_cards");
                jSONObject.put("action", (Object) "cancel");
                hVar.mo17188a(jSONObject);
            }
            BaseCommentPlugin.m18374a(this.this$0).isShowingComment().mo5929b((Boolean) false);
            BaseCommentPlugin.m18375b(this.this$0).mo34327c(true);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C5711a m18374a(BaseCommentPlugin aVar) {
        C5711a aVar2 = aVar.f13103a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return aVar2;
    }

    /* renamed from: b */
    public static final /* synthetic */ Comment m18375b(BaseCommentPlugin aVar) {
        Comment aVar2 = aVar.f13104b;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Comment.f24093e);
        }
        return aVar2;
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void addEvents(AbstractC25896g gVar) {
        for (String str : this.f13106d.keySet()) {
            if (gVar != null) {
                gVar.mo92192a(str);
            }
        }
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e, com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
    public LKPluginHandleResult handleEvent(LKEvent lKEvent) {
        Intrinsics.checkParameterIsNotNull(lKEvent, "event");
        C13742g.m55705a(new RunnableC4445n(this, lKEvent));
        LKPluginHandleResult handleEvent = super.handleEvent(lKEvent);
        Intrinsics.checkExpressionValueIsNotNull(handleEvent, "super.handleEvent(event)");
        return handleEvent;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "inputRequest", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentInputRequest;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.a$o */
    public static final class C4447o<T> implements AbstractC1178x<CommentInputRequest> {

        /* renamed from: a */
        final /* synthetic */ BaseCommentPlugin f13126a;

        C4447o(BaseCommentPlugin aVar) {
            this.f13126a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(CommentInputRequest commentInputRequest) {
            if (commentInputRequest != null) {
                Log.i("BaseCommentPlugin", "inputRequest != null");
                BaseCommentPlugin.m18375b(this.f13126a).mo34302a(commentInputRequest);
                return;
            }
            Log.i("BaseCommentPlugin", "inputRequest == null");
            if (BaseCommentPlugin.m18375b(this.f13126a).mo34313a(true)) {
                BaseCommentPlugin.m18375b(this.f13126a).mo34311a(true, true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "cards", "Lcom/bytedance/ee/bear/document/comment/bean/ShowCardsJsData;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.a$p */
    public static final class C4448p<T> implements AbstractC1178x<ShowCardsJsData> {

        /* renamed from: a */
        final /* synthetic */ BaseCommentPlugin f13127a;

        C4448p(BaseCommentPlugin aVar) {
            this.f13127a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(ShowCardsJsData showCardsJsData) {
            String str;
            Intrinsics.checkParameterIsNotNull(showCardsJsData, "cards");
            Log.i("BaseCommentPlugin", "webview showcards");
            this.f13127a.f13109g = showCardsJsData;
            if (this.f13127a.f13109g != null) {
                ShowCardsJsData showCardsJsData2 = this.f13127a.f13109g;
                if (showCardsJsData2 != null) {
                    str = showCardsJsData2.getCur_comment_id();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                Js2NativeComment aVar = Js2NativeComment.f16092a;
                ShowCardsJsData showCardsJsData3 = this.f13127a.f13109g;
                if (showCardsJsData3 == null) {
                    Intrinsics.throwNpe();
                }
                List<CommentBean> a = aVar.mo22805a(showCardsJsData3);
                if (BaseCommentPlugin.m18375b(this.f13127a).mo34313a(false)) {
                    C10548d.m43696a((Context) this.f13127a.mo17166a());
                }
                Log.i("BaseCommentPlugin", "card size = " + a.size());
                if (!a.isEmpty() || BaseCommentPlugin.m18375b(this.f13127a).mo34313a(false)) {
                    if (!BaseCommentPlugin.m18375b(this.f13127a).mo34313a(false)) {
                        Log.i("BaseCommentPlugin", "comment show");
                        BaseCommentPlugin.m18375b(this.f13127a).mo34327c(!((AbstractC9224g) KoinJavaComponent.m268613a(AbstractC9224g.class, null, null, 6, null)).mo34614c().mo34622c());
                        BaseCommentPlugin.m18375b(this.f13127a).mo34305a(str, (Integer) null);
                        BaseCommentPlugin.m18374a(this.f13127a).isShowingComment().mo5929b((Boolean) true);
                    } else {
                        BaseCommentPlugin.m18375b(this.f13127a).mo34324c(str);
                    }
                    BaseCommentPlugin.m18375b(this.f13127a).mo34306a(a);
                    int b = C13749l.m55749b(C13655e.m55413b() - ((C13749l.m55748b() * 2) / 5));
                    com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
                    com.alibaba.fastjson.JSONObject jSONObject2 = jSONObject;
                    jSONObject2.put((Object) "height", (Object) Integer.valueOf(b));
                    jSONObject2.put((Object) "action", (Object) "panelHeightUpdate");
                    AbstractC7947h hVar = this.f13127a.f13105c;
                    if (hVar != null) {
                        hVar.mo17188a(jSONObject);
                    }
                    BaseCommentPlugin.m18374a(this.f13127a).setPanelHeight(b);
                    return;
                }
                BaseCommentPlugin.m18374a(this.f13127a).closeCard();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "action", "Lcom/bytedance/ee/bear/middleground/comment/export/Action;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.a$q */
    public static final class C4449q extends Lambda implements Function2<String, Action, Unit> {
        final /* synthetic */ BaseCommentPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4449q(BaseCommentPlugin aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Action action) {
            invoke(str, action);
            return Unit.INSTANCE;
        }

        public final void invoke(String str, Action action) {
            Intrinsics.checkParameterIsNotNull(action, "action");
            Log.i("BaseCommentPlugin", "filterdata action = " + action);
            AbstractC7947h hVar = this.this$0.f13105c;
            if (hVar != null) {
                com.alibaba.fastjson.JSONObject jSONObject = null;
                IDataTransformer b = ((AbstractC9224g) KoinJavaComponent.m268613a(AbstractC9224g.class, null, null, 6, null)).mo34613b();
                if (str == null) {
                    Intrinsics.throwNpe();
                }
                com.alibaba.fastjson.JSONObject c = b.mo34618c(str);
                if (c != null) {
                    String name = action.name();
                    if (name != null) {
                        String lowerCase = name.toLowerCase();
                        Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                        c.put("action", (Object) lowerCase);
                        jSONObject = c;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                hVar.mo17188a(jSONObject);
            }
        }
    }

    /* renamed from: a */
    public final void mo17167a(Activity activity, Comment aVar) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(aVar, Comment.f24093e);
        Log.i("BaseCommentPlugin", "init");
        this.f13104b = aVar;
        this.f13108f = activity;
        AbstractC1142af a = new C1144ai((ViewModelStoreOwner) activity).mo6005a(C5711a.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProvider(activi…nelViewModel::class.java)");
        this.f13103a = (C5711a) a;
        this.f13107e = (LifecycleOwner) activity;
        m18376c();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "commentId", "", "replyId", "index", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.a$v */
    public static final class C4454v extends Lambda implements Function3<String, String, Integer, Unit> {
        final /* synthetic */ BaseCommentPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4454v(BaseCommentPlugin aVar) {
            super(3);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ Unit invoke(String str, String str2, Integer num) {
            invoke(str, str2, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(String str, String str2, int i) {
            Intrinsics.checkParameterIsNotNull(str, "commentId");
            Intrinsics.checkParameterIsNotNull(str2, "replyId");
            com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
            com.alibaba.fastjson.JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((Object) "commentId", (Object) str);
            jSONObject2.put((Object) "replyId", (Object) str2);
            jSONObject2.put((Object) "index", (Object) Integer.valueOf(i));
            jSONObject2.put((Object) "action", (Object) "translate");
            AbstractC7947h hVar = this.this$0.f13105c;
            if (hVar != null) {
                hVar.mo17188a(jSONObject);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"<anonymous>", "", "content", "", "imageEntities", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "bySend", "", "tmpId", "invoke", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.basesdk.business.comment.a$r */
    public static final class C4450r extends Lambda implements Function4<String, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity>, Boolean, String, Unit> {
        final /* synthetic */ BaseCommentPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4450r(BaseCommentPlugin aVar) {
            super(4);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list, Boolean bool, String str2) {
            invoke(str, list, bool, str2);
            return Unit.INSTANCE;
        }

        public final void invoke(String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list, Boolean bool, String str2) {
            AbstractC7947h hVar;
            if (bool == null) {
                Intrinsics.throwNpe();
            }
            boolean z = !bool.booleanValue();
            com.alibaba.fastjson.JSONObject inputCancelParam = BaseCommentPlugin.m18374a(this.this$0).getInputCancelParam(z, str2);
            Intrinsics.checkExpressionValueIsNotNull(inputCancelParam, "viewModel.getInputCancelParam(byCancel, tmpId)");
            Log.i("BaseCommentPlugin", "input close byCancel = " + z);
            if (z && (hVar = this.this$0.f13105c) != null) {
                hVar.mo17188a(inputCancelParam);
            }
        }
    }
}
