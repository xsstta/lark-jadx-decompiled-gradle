package com.ss.android.lark.pin.impl.v3;

import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.ICallback;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.pin.dto.ChatPinMessageEntity;
import com.ss.android.lark.pin.impl.service.PinService;
import com.ss.android.lark.pin.impl.v3.PinMessageInfoBaseDataHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 '2\u00020\u0001:\u0001'B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J&\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014¨\u0006("}, d2 = {"Lcom/ss/android/lark/pin/impl/v3/PinMessageInfoLoadDataHandler;", "Lcom/ss/android/lark/pin/impl/v3/PinMessageInfoBaseDataHandler;", "chatId", "", "callbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "handlerCallback", "Lcom/ss/android/lark/pin/impl/v3/PinMessageInfoBaseDataHandler$IDataHandleCallback;", "(Ljava/lang/String;Lcom/larksuite/framework/callback/CallbackManager;Lcom/ss/android/lark/pin/impl/v3/PinMessageInfoBaseDataHandler$IDataHandleCallback;)V", "hasLoadMessage", "", "getHasLoadMessage", "()Z", "setHasLoadMessage", "(Z)V", "lastPinReadTimeStamp", "", "getLastPinReadTimeStamp", "()J", "setLastPinReadTimeStamp", "(J)V", "latestTimeStamp", "getLatestTimeStamp", "setLatestTimeStamp", "nextTimeStampCursor", "getNextTimeStampCursor", "setNextTimeStampCursor", "compareInfo", "", "info1", "Lcom/ss/android/lark/pin/impl/entity/PinInfo;", "info2", "loadImpl", "", "offset", "count", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pin/dto/ChatPinMessageEntity;", "Companion", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.pin.impl.v3.e */
public final class PinMessageInfoLoadDataHandler extends PinMessageInfoBaseDataHandler {

    /* renamed from: a */
    public static final Companion f128470a = new Companion(null);

    /* renamed from: b */
    private long f128471b;

    /* renamed from: c */
    private boolean f128472c;

    /* renamed from: d */
    private long f128473d;

    /* renamed from: e */
    private long f128474e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/pin/impl/v3/PinMessageInfoLoadDataHandler$Companion;", "", "()V", "DEFAULT_PIN_COUNT", "", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.v3.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: k */
    public final boolean mo177650k() {
        return this.f128472c;
    }

    /* renamed from: l */
    public final long mo177651l() {
        return this.f128473d;
    }

    /* renamed from: m */
    public final long mo177652m() {
        return this.f128474e;
    }

    /* renamed from: b */
    public final void mo177646b(long j) {
        this.f128471b = j;
    }

    /* renamed from: c */
    public final void mo177647c(long j) {
        this.f128473d = j;
    }

    /* renamed from: d */
    public final void mo177648d(long j) {
        this.f128474e = j;
    }

    /* renamed from: d */
    public final void mo177649d(boolean z) {
        this.f128472c = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @Override // com.ss.android.lark.pin.impl.v3.PinMessageInfoBaseDataHandler
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo177619a(com.ss.android.lark.pin.impl.entity.PinInfo r9, com.ss.android.lark.pin.impl.entity.PinInfo r10) {
        /*
            r8 = this;
            java.lang.String r0 = "info1"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
            java.lang.String r0 = "info2"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            com.ss.android.lark.pin.impl.entity.Pin r9 = r9.mo177397h()
            com.ss.android.lark.pin.impl.entity.Pin r10 = r10.mo177397h()
            r0 = 1
            r1 = -1
            r2 = 0
            if (r9 == 0) goto L_0x0033
            if (r10 == 0) goto L_0x0033
            long r3 = r9.getTimeStamp()
            long r5 = r10.getTimeStamp()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0026
            goto L_0x0037
        L_0x0026:
            long r3 = r9.getTimeStamp()
            long r9 = r10.getTimeStamp()
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r1 >= 0) goto L_0x003e
            goto L_0x003f
        L_0x0033:
            if (r9 == 0) goto L_0x0039
            if (r10 != 0) goto L_0x0039
        L_0x0037:
            r0 = -1
            goto L_0x003f
        L_0x0039:
            if (r9 != 0) goto L_0x003e
            if (r10 == 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.pin.impl.v3.PinMessageInfoLoadDataHandler.mo177619a(com.ss.android.lark.pin.impl.entity.b, com.ss.android.lark.pin.impl.entity.b):int");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PinMessageInfoLoadDataHandler(String str, CallbackManager callbackManager, PinMessageInfoBaseDataHandler.IDataHandleCallback aVar) {
        super(str, callbackManager, aVar);
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(callbackManager, "callbackManager");
        Intrinsics.checkParameterIsNotNull(aVar, "handlerCallback");
    }

    @Override // com.ss.android.lark.pin.impl.v3.PinMessageInfoBaseDataHandler
    /* renamed from: a */
    public void mo177621a(int i, int i2, IGetDataCallback<ChatPinMessageEntity> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        PinService aVar = PinService.f128155a;
        boolean a = mo177627a();
        String h = mo177640h();
        long j = this.f128471b;
        ICallback wrapAndAddCallback = mo177641i().wrapAndAddCallback(iGetDataCallback);
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddCallback, "callbackManager.wrapAndAddCallback(callback)");
        aVar.mo177340a(a, h, j, 30, (IGetDataCallback) wrapAndAddCallback);
    }
}
