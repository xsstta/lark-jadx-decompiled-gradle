package com.ss.android.lark.create.groupchat.impl.f2f.model;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.LocationContent;
import com.bytedance.lark.pb.im.v1.CreateFaceToFaceApplicationResponse;
import com.bytedance.lark.pb.im.v1.JoinFaceToFaceChatResponse;
import com.bytedance.lark.pb.im.v1.PushFaceToFaceApplicants;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.create.groupchat.CreateGroupChatModule;
import com.ss.android.lark.create.groupchat.dto.ApplicantsResponse;
import com.ss.android.lark.create.groupchat.impl.f2f.IF2FCreateGroupContract;
import com.ss.android.lark.create.groupchat.impl.f2f.service.F2FGroupApplicantsService;
import com.ss.android.lark.create.groupchat.impl.p1779b.C36275a;
import com.ss.android.lark.create.groupchat.impl.statistics.F2FCreateGroupHitPoint;
import com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\u001a\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u0007H\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0007H\u0002J\u001c\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020!2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u00020!H\u0002J\u0010\u00100\u001a\u00020!2\u0006\u0010/\u001a\u00020\u0007H\u0002J\b\u00101\u001a\u00020\u001dH\u0002J\b\u00102\u001a\u00020\u001dH\u0002J\b\u00103\u001a\u00020\u001dH\u0016J\u0010\u00104\u001a\u00020\u001d2\u0006\u00105\u001a\u00020\u0007H\u0002J\u0010\u00106\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u00107\u001a\u00020!2\u0006\u0010)\u001a\u00020!H\u0002J\b\u00108\u001a\u00020\u001dH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \r*\u0004\u0018\u00010\u00130\u0013X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00170\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/model/F2FCreateGroupModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/create/groupchat/impl/f2f/IF2FCreateGroupContract$IModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "applicationId", "", "cachedLocation", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/bytedance/lark/pb/basic/v1/LocationContent;", "chatDependency", "Lcom/ss/android/lark/create/groupchat/dependency/ICreateGroupChatModuleDependency$IChatDependency;", "kotlin.jvm.PlatformType", "executorService", "Ljava/util/concurrent/ExecutorService;", "isRequesting", "Ljava/util/concurrent/atomic/AtomicBoolean;", "locationDependency", "Lcom/ss/android/lark/create/groupchat/dependency/ICreateGroupChatModuleDependency$IMapDependency;", "modelDelegate", "Lcom/ss/android/lark/create/groupchat/impl/f2f/IF2FCreateGroupContract$IModel$ModelDelegate;", "pendingCallBack", "Lcom/larksuite/framework/callback/IGetDataCallback;", "preLoadingLocation", "service", "Lcom/ss/android/lark/create/groupchat/impl/f2f/service/F2FGroupApplicantsService;", "userToken", "create", "", "destroy", "fetchJoinGroupApplicants", "matchCode", "", "location", "fetchJoinGroupByCode", "code", "filterSimpleCode", "", "value", "handleErrorResult", "errCode", "errorMsg", "handleFaceToFaceGroupResponse", "result", "Lcom/ss/android/lark/create/groupchat/dto/ApplicantsResponse;", "maskError", "origin", "parseRequestCode", "preloadLocationData", "registerPushListener", "requestJoinFaceToFaceChat", "scheduleEnterChat", "chatId", "setDelegate", "unMaskError", "unRegisterPushListener", "Companion", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.a.a */
public final class F2FCreateGroupModel extends BaseModel implements IF2FCreateGroupContract.IModel {

    /* renamed from: h */
    public static final int f93579h = (((int) ((float) Math.pow((double) 10.0f, (double) 4))) - 1);

    /* renamed from: i */
    public static final Companion f93580i = new Companion(null);

    /* renamed from: a */
    public IF2FCreateGroupContract.IModel.ModelDelegate f93581a;

    /* renamed from: b */
    public final AbstractC36248c.AbstractC36257i f93582b;

    /* renamed from: c */
    public final AtomicBoolean f93583c;

    /* renamed from: d */
    public final AtomicBoolean f93584d;

    /* renamed from: e */
    public final AtomicReference<LocationContent> f93585e;

    /* renamed from: f */
    public final AtomicReference<IGetDataCallback<LocationContent>> f93586f;

    /* renamed from: g */
    public final Context f93587g;

    /* renamed from: j */
    private F2FGroupApplicantsService f93588j;

    /* renamed from: k */
    private String f93589k = "";

    /* renamed from: l */
    private String f93590l = "";

    /* renamed from: m */
    private final AbstractC36248c.AbstractC36252d f93591m;

    /* renamed from: n */
    private final ExecutorService f93592n;

    /* renamed from: b */
    private final int m142865b(int i) {
        return i | Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public final int mo133856a(int i) {
        return i & Integer.MAX_VALUE;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/model/F2FCreateGroupModel$Companion;", "", "()V", "LOG_TAG", "", "MAX_REQ_CODE", "", "getMAX_REQ_CODE", "()I", "MIN_REQ_CODE", "getMIN_REQ_CODE", "NUMBER_CODE_LEN", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    private final void m142868d() {
        F2FGroupApplicantsService aVar = this.f93588j;
        if (aVar != null) {
            aVar.mo133891a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.a.a$c */
    public static final class RunnableC36283c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ F2FCreateGroupModel f93597a;

        /* renamed from: b */
        final /* synthetic */ int f93598b;

        /* renamed from: c */
        final /* synthetic */ String f93599c;

        RunnableC36283c(F2FCreateGroupModel aVar, int i, String str) {
            this.f93597a = aVar;
            this.f93598b = i;
            this.f93599c = str;
        }

        public final void run() {
            IF2FCreateGroupContract.IModel.ModelDelegate aVar = this.f93597a.f93581a;
            if (aVar != null) {
                aVar.mo133898a(this.f93598b, this.f93599c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.a.a$d */
    public static final class RunnableC36284d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ F2FCreateGroupModel f93600a;

        /* renamed from: b */
        final /* synthetic */ ApplicantsResponse f93601b;

        RunnableC36284d(F2FCreateGroupModel aVar, ApplicantsResponse bVar) {
            this.f93600a = aVar;
            this.f93601b = bVar;
        }

        public final void run() {
            IF2FCreateGroupContract.IModel.ModelDelegate aVar = this.f93600a.f93581a;
            if (aVar != null) {
                aVar.mo133900a(this.f93601b.mo133795c());
            }
        }
    }

    /* renamed from: b */
    private final void m142866b() {
        this.f93592n.execute(new RunnableC36285e(this));
    }

    /* renamed from: c */
    private final void m142867c() {
        F2FGroupApplicantsService aVar = this.f93588j;
        if (aVar != null) {
            aVar.mo133893a(new C36287f(this));
        }
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f93588j = F2FGroupApplicantsService.f93616a;
        m142866b();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.a.a$e */
    public static final class RunnableC36285e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ F2FCreateGroupModel f93602a;

        RunnableC36285e(F2FCreateGroupModel aVar) {
            this.f93602a = aVar;
        }

        public final void run() {
            this.f93602a.f93584d.compareAndSet(false, true);
            this.f93602a.f93582b.getLocation(this.f93602a.f93587g, new IGetDataCallback<LocationContent>(this) {
                /* class com.ss.android.lark.create.groupchat.impl.f2f.model.F2FCreateGroupModel.RunnableC36285e.C362861 */

                /* renamed from: a */
                final /* synthetic */ RunnableC36285e f93603a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f93603a = r1;
                }

                /* renamed from: a */
                public void onSuccess(LocationContent locationContent) {
                    if (locationContent != null) {
                        this.f93603a.f93602a.f93585e.compareAndSet(null, locationContent);
                    }
                    this.f93603a.f93602a.f93584d.compareAndSet(true, false);
                    IGetDataCallback<LocationContent> iGetDataCallback = this.f93603a.f93602a.f93586f.get();
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(locationContent);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Intrinsics.checkParameterIsNotNull(errorResult, "err");
                    this.f93603a.f93602a.f93584d.compareAndSet(true, false);
                    IGetDataCallback<LocationContent> iGetDataCallback = this.f93603a.f93602a.f93586f.get();
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }
            });
        }
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f93581a = null;
        this.f93588j = null;
        this.f93589k = null;
        m142868d();
    }

    @Override // com.ss.android.lark.create.groupchat.impl.f2f.IF2FCreateGroupContract.IModel
    /* renamed from: a */
    public void mo133857a() {
        if (TextUtils.isEmpty(this.f93589k)) {
            m142864a(this, 5651, null, 2, null);
            return;
        }
        C36288g gVar = new C36288g(this);
        F2FGroupApplicantsService aVar = F2FGroupApplicantsService.f93616a;
        String str = this.f93589k;
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(gVar);
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…ataCallback(dataCallback)");
        aVar.mo133892a(str, wrapAndAddGetDataCallback);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.a.a$b */
    public static final class RunnableC36281b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ F2FCreateGroupModel f93593a;

        /* renamed from: b */
        final /* synthetic */ String f93594b;

        RunnableC36281b(F2FCreateGroupModel aVar, String str) {
            this.f93593a = aVar;
            this.f93594b = str;
        }

        public final void run() {
            int c = this.f93593a.mo133864c(this.f93594b);
            if ((c & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                F2FCreateGroupModel aVar = this.f93593a;
                F2FCreateGroupModel.m142864a(aVar, aVar.mo133856a(c), null, 2, null);
                return;
            }
            this.f93593a.f93583c.compareAndSet(false, true);
            C36282a aVar2 = new C36282a(this, c);
            if (this.f93593a.f93585e.get() != null) {
                aVar2.onSuccess(this.f93593a.f93585e.get());
            } else if (this.f93593a.f93584d.get()) {
                this.f93593a.f93586f.compareAndSet(null, aVar2);
            } else {
                this.f93593a.f93582b.getLocation(this.f93593a.f93587g, aVar2);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/create/groupchat/impl/f2f/model/F2FCreateGroupModel$fetchJoinGroupByCode$1$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/basic/v1/LocationContent;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.a.a$b$a */
        public static final class C36282a implements IGetDataCallback<LocationContent> {

            /* renamed from: a */
            final /* synthetic */ RunnableC36281b f93595a;

            /* renamed from: b */
            final /* synthetic */ int f93596b;

            /* renamed from: a */
            public void onSuccess(LocationContent locationContent) {
                this.f93595a.f93593a.mo133858a(this.f93596b, locationContent);
                this.f93595a.f93593a.f93583c.compareAndSet(true, false);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                this.f93595a.f93593a.mo133859a(errorResult.getErrorCode(), errorResult.getDisplayMsg());
                this.f93595a.f93593a.f93583c.compareAndSet(true, false);
            }

            C36282a(RunnableC36281b bVar, int i) {
                this.f93595a = bVar;
                this.f93596b = i;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/lark/pb/im/v1/PushFaceToFaceApplicants;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.a.a$f */
    public static final class C36287f extends Lambda implements Function1<PushFaceToFaceApplicants, Unit> {
        final /* synthetic */ F2FCreateGroupModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36287f(F2FCreateGroupModel aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PushFaceToFaceApplicants pushFaceToFaceApplicants) {
            invoke(pushFaceToFaceApplicants);
            return Unit.INSTANCE;
        }

        public final void invoke(PushFaceToFaceApplicants pushFaceToFaceApplicants) {
            Intrinsics.checkParameterIsNotNull(pushFaceToFaceApplicants, "it");
            this.this$0.mo133860a(ApplicantsResponse.f93536a.mo133800a(pushFaceToFaceApplicants));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/create/groupchat/impl/f2f/model/F2FCreateGroupModel$requestJoinFaceToFaceChat$dataCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/im/v1/JoinFaceToFaceChatResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.a.a$g */
    public static final class C36288g implements IGetDataCallback<JoinFaceToFaceChatResponse> {

        /* renamed from: a */
        final /* synthetic */ F2FCreateGroupModel f93604a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36288g(F2FCreateGroupModel aVar) {
            this.f93604a = aVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f93604a.mo133859a(errorResult.getErrorCode(), errorResult.getDisplayMsg());
        }

        /* renamed from: a */
        public void onSuccess(JoinFaceToFaceChatResponse joinFaceToFaceChatResponse) {
            String str;
            Boolean bool = null;
            if (joinFaceToFaceChatResponse != null) {
                str = joinFaceToFaceChatResponse.chat_id;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                if (joinFaceToFaceChatResponse != null) {
                    bool = joinFaceToFaceChatResponse.is_create_chat;
                }
                if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                    F2FCreateGroupHitPoint aVar = F2FCreateGroupHitPoint.f93888a;
                    if (str == null) {
                        Intrinsics.throwNpe();
                    }
                    aVar.mo134203a(str);
                }
                F2FCreateGroupModel aVar2 = this.f93604a;
                if (str == null) {
                    Intrinsics.throwNpe();
                }
                aVar2.mo133863b(str);
                C36275a.m142816a();
                IF2FCreateGroupContract.IModel.ModelDelegate aVar3 = this.f93604a.f93581a;
                if (aVar3 != null) {
                    aVar3.mo133903c();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo133863b(String str) {
        this.f93591m.mo133733b(str);
        this.f93591m.mo133729a(this.f93587g, str);
    }

    /* renamed from: c */
    public final int mo133864c(String str) {
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (str.length() != 4 || intOrNull == null || intOrNull.intValue() > f93579h) {
            return m142865b(1);
        }
        if (m142869d(str)) {
            return m142865b(2);
        }
        return intOrNull.intValue();
    }

    public F2FCreateGroupModel(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f93587g = context;
        AbstractC36248c dependency = CreateGroupChatModule.getDependency();
        Intrinsics.checkExpressionValueIsNotNull(dependency, "CreateGroupChatModule.getDependency()");
        this.f93591m = dependency.getChatDependency();
        AbstractC36248c dependency2 = CreateGroupChatModule.getDependency();
        Intrinsics.checkExpressionValueIsNotNull(dependency2, "CreateGroupChatModule.getDependency()");
        this.f93582b = dependency2.getMapDependency();
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        this.f93592n = coreThreadPool.getCachedThreadPool();
        this.f93583c = new AtomicBoolean(false);
        this.f93584d = new AtomicBoolean(false);
        this.f93585e = new AtomicReference<>();
        this.f93586f = new AtomicReference<>();
    }

    /* renamed from: d */
    private final boolean m142869d(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        List listOf = CollectionsKt.listOf("2580");
        Integer[] numArr = new Integer[4];
        for (int i = 0; i < 4; i++) {
            numArr[i] = 0;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            numArr[i2] = Integer.valueOf(str.charAt(i2) - '0');
        }
        Log.m165379d("F2FCreateGroupModel", "Code Array is " + numArr);
        int i3 = 1;
        while (true) {
            if (i3 >= 4) {
                z = true;
                break;
            } else if (numArr[i3].intValue() - numArr[i3 - 1].intValue() != 1) {
                z = false;
                break;
            } else {
                i3++;
            }
        }
        int i4 = 1;
        while (true) {
            if (i4 >= 4) {
                z2 = true;
                break;
            } else if (numArr[i4].intValue() - numArr[i4 - 1].intValue() != -1) {
                z2 = false;
                break;
            } else {
                i4++;
            }
        }
        int i5 = 1;
        while (true) {
            if (i5 >= 4) {
                z3 = true;
                break;
            } else if (numArr[i5].intValue() != numArr[i5 - 1].intValue()) {
                z3 = false;
                break;
            } else {
                i5++;
            }
        }
        if (z2 || z || z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 || listOf.contains(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo133860a(ApplicantsResponse bVar) {
        if (TextUtils.isEmpty(this.f93589k) && !TextUtils.isEmpty(bVar.mo133794b()) && TextUtils.isEmpty(this.f93590l)) {
            this.f93589k = bVar.mo133794b();
            this.f93590l = bVar.mo133793a();
            m142867c();
        }
        if (!Intrinsics.areEqual(bVar.mo133793a(), this.f93590l)) {
            Log.m165379d("F2FCreateGroupModel", "Handle applicants with other application Id, just return.");
        } else {
            UICallbackExecutor.execute(new RunnableC36284d(this, bVar));
        }
    }

    @Override // com.ss.android.lark.create.groupchat.impl.f2f.IF2FCreateGroupContract.IModel
    /* renamed from: a */
    public void mo133861a(IF2FCreateGroupContract.IModel.ModelDelegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "modelDelegate");
        this.f93581a = aVar;
    }

    @Override // com.ss.android.lark.create.groupchat.impl.f2f.IF2FCreateGroupContract.IModel
    /* renamed from: a */
    public void mo133862a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "code");
        if (!this.f93583c.get()) {
            this.f93592n.execute(new RunnableC36281b(this, str));
        }
    }

    /* renamed from: a */
    public final void mo133859a(int i, String str) {
        UICallbackExecutor.execute(new RunnableC36283c(this, i, str));
    }

    /* renamed from: a */
    public final void mo133858a(int i, LocationContent locationContent) {
        String str;
        String str2;
        SdkSender.C53233d<CreateFaceToFaceApplicationResponse> dVar;
        ErrorResult errorResult;
        ErrorResult errorResult2;
        if (locationContent == null) {
            Log.m165379d("F2FCreateGroupModel", "Location is Null !!");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Location is {");
        String str3 = null;
        if (locationContent != null) {
            str = locationContent.latitude;
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(", ");
        if (locationContent != null) {
            str2 = locationContent.longitude;
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append("}}");
        Log.m165379d("F2FCreateGroupModel", sb.toString());
        F2FGroupApplicantsService aVar = this.f93588j;
        if (aVar != null) {
            dVar = aVar.mo133890a(i, locationContent);
        } else {
            dVar = null;
        }
        int i2 = 0;
        this.f93583c.compareAndSet(true, false);
        if (dVar == null || dVar.f131573b != null) {
            if (!(dVar == null || (errorResult2 = dVar.f131573b) == null)) {
                i2 = errorResult2.getErrorCode();
            }
            if (!(dVar == null || (errorResult = dVar.f131573b) == null)) {
                str3 = errorResult.getDisplayMsg();
            }
            if (str3 == null) {
                str3 = "";
            }
            mo133859a(i2, str3);
            return;
        }
        ApplicantsResponse.Companion aVar2 = ApplicantsResponse.f93536a;
        T t = dVar.f131572a;
        Intrinsics.checkExpressionValueIsNotNull(t, "result.result");
        mo133860a(aVar2.mo133799a((CreateFaceToFaceApplicationResponse) t));
    }

    /* renamed from: a */
    static /* synthetic */ void m142864a(F2FCreateGroupModel aVar, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        aVar.mo133859a(i, str);
    }
}
