package com.ss.ugc.effectplatform.task;

import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.ugc.effectplatform.bridge.jsonconverter.IJsonConverter;
import com.ss.ugc.effectplatform.bridge.network.INetworkClient;
import com.ss.ugc.effectplatform.bridge.network.NetRequest;
import com.ss.ugc.effectplatform.listener.CallbackManager;
import com.ss.ugc.effectplatform.listener.IEffectPlatformBaseListener;
import com.ss.ugc.effectplatform.model.ExceptionResult;
import com.ss.ugc.effectplatform.model.NetResponseChecker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B+\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH$J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0013H\u0014J\b\u0010\u0015\u001a\u00020\u0011H\u0014J(\u0010\u0016\u001a\u00020\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J-\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00028\u0001H\u0014¢\u0006\u0002\u0010!J\u001f\u0010\"\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010#\u001a\u00020\fH$¢\u0006\u0002\u0010$R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/ugc/effectplatform/task/BaseNetworkTask;", "T", "R", "Lcom/ss/ugc/effectplatform/model/NetResponseChecker;", "Lcom/ss/ugc/effectplatform/task/BaseTask;", "netWorker", "Lcom/ss/ugc/effectplatform/bridge/network/INetworkClient;", "jsonConverter", "Lcom/ss/ugc/effectplatform/bridge/jsonconverter/IJsonConverter;", "callbackManager", "Lcom/ss/ugc/effectplatform/listener/CallbackManager;", "taskId", "", "(Lcom/ss/ugc/effectplatform/bridge/network/INetworkClient;Lcom/ss/ugc/effectplatform/bridge/jsonconverter/IJsonConverter;Lcom/ss/ugc/effectplatform/listener/CallbackManager;Ljava/lang/String;)V", "buildRequest", "Lcom/ss/ugc/effectplatform/bridge/network/NetRequest;", "execute", "", "getFailCode", "", "getRetryCount", "onCancel", "onFailure", "requestedUrl", "remoteIp", "exceptionResult", "Lcom/ss/ugc/effectplatform/model/ExceptionResult;", "onSuccess", "startTime", "", "netTime", "jsonTime", "result", "(JJJLcom/ss/ugc/effectplatform/model/NetResponseChecker;)V", "parseResponse", "responseString", "(Lcom/ss/ugc/effectplatform/bridge/jsonconverter/IJsonConverter;Ljava/lang/String;)Lcom/ss/ugc/effectplatform/model/NetResponseChecker;", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.task.a */
public abstract class BaseNetworkTask<T, R extends NetResponseChecker<T>> extends BaseTask {

    /* renamed from: a */
    public final CallbackManager f164981a;

    /* renamed from: b */
    public final String f164982b;

    /* renamed from: c */
    private final INetworkClient f164983c;

    /* renamed from: d */
    private final IJsonConverter f164984d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract R mo228212a(IJsonConverter bVar, String str);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract NetRequest mo228217c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo228218d() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo228219e() {
        return UpdateDialogStatusCode.SHOW;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "R", "Lcom/ss/ugc/effectplatform/model/NetResponseChecker;", "invoke", "com/ss/ugc/effectplatform/task/BaseNetworkTask$onFailure$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.task.a$a */
    public static final class C65521a extends Lambda implements Function0<Unit> {
        final /* synthetic */ ExceptionResult $exceptionResult$inlined;
        final /* synthetic */ BaseNetworkTask this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65521a(BaseNetworkTask aVar, ExceptionResult cVar) {
            super(0);
            this.this$0 = aVar;
            this.$exceptionResult$inlined = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            IEffectPlatformBaseListener<T> a = this.this$0.f164981a.mo227753a(this.this$0.f164982b);
            if (a != null) {
                a.mo207371a(null, this.$exceptionResult$inlined);
            }
            this.this$0.f164981a.mo227755b(this.this$0.f164982b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "R", "Lcom/ss/ugc/effectplatform/model/NetResponseChecker;", "invoke", "com/ss/ugc/effectplatform/task/BaseNetworkTask$onSuccess$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.task.a$b */
    public static final class C65522b extends Lambda implements Function0<Unit> {
        final /* synthetic */ Object $data$inlined;
        final /* synthetic */ BaseNetworkTask this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65522b(BaseNetworkTask aVar, Object obj) {
            super(0);
            this.this$0 = aVar;
            this.$data$inlined = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            IEffectPlatformBaseListener<T> a = this.this$0.f164981a.mo227753a(this.this$0.f164982b);
            if (a != null) {
                a.mo207370a((T) this.$data$inlined);
            }
            this.this$0.f164981a.mo227755b(this.this$0.f164982b);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a2, code lost:
        throw new com.ss.ugc.effectplatform.exception.NetException(-2, "net response returned null!");
     */
    @Override // com.ss.ugc.effectplatform.task.BaseTask
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo228248f() {
        /*
        // Method dump skipped, instructions count: 222
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.task.BaseNetworkTask.mo228248f():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo228215a(String str, String str2, ExceptionResult cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "exceptionResult");
        if (this.f164982b != null) {
            mo228259a(new C65521a(this, cVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseNetworkTask(INetworkClient cVar, IJsonConverter bVar, CallbackManager aVar, String str) {
        super(str, aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "callbackManager");
        this.f164983c = cVar;
        this.f164984d = bVar;
        this.f164981a = aVar;
        this.f164982b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo228213a(long j, long j2, long j3, R r) {
        Intrinsics.checkParameterIsNotNull(r, "result");
        Object responseData = r.getResponseData();
        if (responseData != null && this.f164982b != null) {
            mo228259a(new C65522b(this, responseData));
        }
    }
}
