package com.ss.android.lark.setting.service.impl;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.passport.v1.GetUserSidebarRequest;
import com.bytedance.lark.pb.passport.v1.GetUserSidebarResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.dto.SidebarInfo;
import com.ss.android.lark.setting.service.ISidebarService;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007*\u0001\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\u001e\u0010\u0019\u001a\u00020\u00162\u0014\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u0011H\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u0011H\u0016J\b\u0010\"\u001a\u00020\u0016H\u0016J\u0018\u0010#\u001a\u00020\u00162\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/lark/setting/service/impl/SidebarServiceImpl;", "Lcom/ss/android/lark/setting/service/ISidebarService;", "()V", "TAG", "", "mCachedData", "", "Lcom/ss/android/lark/setting/dto/SidebarInfo;", "mDelegateDataCallback", "com/ss/android/lark/setting/service/impl/SidebarServiceImpl$mDelegateDataCallback$1", "Lcom/ss/android/lark/setting/service/impl/SidebarServiceImpl$mDelegateDataCallback$1;", "mInited", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "mObservers", "Ljava/util/LinkedHashSet;", "Lcom/ss/android/lark/setting/SettingModule$ISidebarDataObserver;", "Lkotlin/collections/LinkedHashSet;", "pushHandler", "Lcom/ss/android/lark/sdk/PushDispatcher$ISdkPushListener;", "create", "", "destroy", "forceGetAdditionalMineData", "getAdditionalMineData", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "handleRawData", "byteArray", "", "registerDataObserver", "listener", "removeDataObserver", "reset", "updateCache", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.service.impl.e */
public final class SidebarServiceImpl implements ISidebarService {

    /* renamed from: a */
    public static final SidebarServiceImpl f134962a = new SidebarServiceImpl();

    /* renamed from: b */
    private static List<SidebarInfo> f134963b;

    /* renamed from: c */
    private static final ReentrantReadWriteLock f134964c = new ReentrantReadWriteLock();

    /* renamed from: d */
    private static LinkedHashSet<C54115c.AbstractC54120c> f134965d = new LinkedHashSet<>();

    /* renamed from: e */
    private static final AtomicBoolean f134966e = new AtomicBoolean(false);

    /* renamed from: f */
    private static final C54630c f134967f = new C54630c();

    /* renamed from: g */
    private static final C53248k.AbstractC53250a f134968g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/setting/service/impl/SidebarServiceImpl$mDelegateDataCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/setting/dto/SidebarInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.service.impl.e$c */
    public static final class C54630c implements IGetDataCallback<List<? extends SidebarInfo>> {
        C54630c() {
        }

        /* renamed from: a */
        public void onSuccess(List<SidebarInfo> list) {
            SidebarServiceImpl.f134962a.mo186614a(list);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            C53241h.m205894a("SidebarServiceImpl", errorResult.toString());
        }
    }

    private SidebarServiceImpl() {
    }

    static {
        C54631d dVar = C54631d.f134969a;
        f134968g = dVar;
        C53248k.m205912a().mo181697a(Command.PUSH_USER_SIDEBAR, dVar);
    }

    /* renamed from: c */
    private final void m211981c() {
        GetUserSidebarRequest.C18727a aVar = new GetUserSidebarRequest.C18727a();
        aVar.mo64405a(SyncDataStrategy.FORCE_SERVER);
        C53241h.m205898b("SidebarServiceImpl", "fetch side bar from net");
        SdkSender.asynSendRequestNonWrap(Command.GET_USER_SIDEBAR, aVar, f134967f, new C54632f(new C54628a(this)));
    }

    @Override // com.ss.android.lark.setting.service.ISidebarService
    /* renamed from: a */
    public synchronized void mo186534a() {
        AtomicBoolean atomicBoolean = f134966e;
        if (!atomicBoolean.get()) {
            atomicBoolean.compareAndSet(false, true);
            m211981c();
        }
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.instructions.InvokeNode.isSame(InvokeNode.java:77)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    /* renamed from: b */
    public void mo186615b() {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = com.ss.android.lark.setting.service.impl.SidebarServiceImpl.f134964c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0012
            int r2 = r0.getReadHoldCount()
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r4 = 0
        L_0x0014:
            if (r4 >= r2) goto L_0x001c
            r1.unlock()
            int r4 = r4 + 1
            goto L_0x0014
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            r4 = 0
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x0039 }
            com.ss.android.lark.setting.service.impl.SidebarServiceImpl.f134963b = r4     // Catch:{ all -> 0x0039 }
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0039 }
        L_0x002a:
            if (r3 >= r2) goto L_0x0032
            r1.lock()
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0032:
            r0.unlock()
            r5.m211981c()
            return
        L_0x0039:
            r4 = move-exception
        L_0x003a:
            if (r3 >= r2) goto L_0x0042
            r1.lock()
            int r3 = r3 + 1
            goto L_0x003a
        L_0x0042:
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.setting.service.impl.SidebarServiceImpl.mo186615b():void");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0017\u0010\u0003\u001a\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/setting/dto/SidebarInfo;", "p1", "", "Lkotlin/ParameterName;", "name", "byteArray", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.service.impl.e$a */
    public static final /* synthetic */ class C54628a extends FunctionReference implements Function1<byte[], List<? extends SidebarInfo>> {
        C54628a(SidebarServiceImpl eVar) {
            super(1, eVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "handleRawData";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(SidebarServiceImpl.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "handleRawData([B)Ljava/util/List;";
        }

        public final List<SidebarInfo> invoke(byte[] bArr) {
            return ((SidebarServiceImpl) this.receiver).mo186613a(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0017\u0010\u0003\u001a\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/setting/dto/SidebarInfo;", "p1", "", "Lkotlin/ParameterName;", "name", "byteArray", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.service.impl.e$b */
    static final /* synthetic */ class C54629b extends FunctionReference implements Function1<byte[], List<? extends SidebarInfo>> {
        C54629b(SidebarServiceImpl eVar) {
            super(1, eVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "handleRawData";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(SidebarServiceImpl.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "handleRawData([B)Ljava/util/List;";
        }

        public final List<SidebarInfo> invoke(byte[] bArr) {
            return ((SidebarServiceImpl) this.receiver).mo186613a(bArr);
        }
    }

    @Override // com.ss.android.lark.setting.service.ISidebarService
    /* renamed from: a */
    public void mo186536a(C54115c.AbstractC54120c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        f134965d.add(cVar);
    }

    @Override // com.ss.android.lark.setting.service.ISidebarService
    /* renamed from: b */
    public void mo186537b(C54115c.AbstractC54120c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        f134965d.remove(cVar);
    }

    /* renamed from: a */
    public final List<SidebarInfo> mo186613a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        GetUserSidebarResponse decode = GetUserSidebarResponse.ADAPTER.decode(bArr);
        Intrinsics.checkExpressionValueIsNotNull(decode, "remoteResponse");
        return SidebarSettingParser.m211990a(decode);
    }

    @Override // com.ss.android.lark.setting.service.ISidebarService
    /* renamed from: a */
    public void mo186535a(IGetDataCallback<List<SidebarInfo>> iGetDataCallback) {
        if (f134966e.get()) {
            ReentrantReadWriteLock.ReadLock readLock = f134964c.readLock();
            readLock.lock();
            try {
                if (f134963b != null) {
                    C53241h.m205898b("SidebarServiceImpl", "fetch side bar from cache");
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(f134963b);
                    }
                    return;
                }
                Unit unit = Unit.INSTANCE;
                readLock.unlock();
                GetUserSidebarRequest.C18727a aVar = new GetUserSidebarRequest.C18727a();
                aVar.mo64405a(SyncDataStrategy.TRY_LOCAL);
                C53241h.m205898b("SidebarServiceImpl", "fetch side bar from local");
                SdkSender.asynSendRequestNonWrap(Command.GET_USER_SIDEBAR, aVar, f134967f, new C54632f(new C54629b(this)));
            } finally {
                readLock.unlock();
            }
        }
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.instructions.InvokeNode.isSame(InvokeNode.java:77)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    /* renamed from: a */
    public final void mo186614a(java.util.List<com.ss.android.lark.setting.dto.SidebarInfo> r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = com.ss.android.lark.setting.service.impl.SidebarServiceImpl.f134964c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0015
            int r2 = r0.getReadHoldCount()
            goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            r4 = 0
        L_0x0017:
            if (r4 >= r2) goto L_0x001f
            r1.unlock()
            int r4 = r4 + 1
            goto L_0x0017
        L_0x001f:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            com.ss.android.lark.setting.service.impl.SidebarServiceImpl.f134963b = r6     // Catch:{ all -> 0x0050 }
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0050 }
        L_0x002a:
            if (r3 >= r2) goto L_0x0032
            r1.lock()
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0032:
            r0.unlock()
            java.util.LinkedHashSet<com.ss.android.lark.setting.c$c> r0 = com.ss.android.lark.setting.service.impl.SidebarServiceImpl.f134965d
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x003d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x004f
            java.lang.Object r1 = r0.next()
            com.ss.android.lark.setting.c$c r1 = (com.ss.android.lark.setting.C54115c.AbstractC54120c) r1
            java.util.List<com.ss.android.lark.setting.dto.d> r2 = com.ss.android.lark.setting.service.impl.SidebarServiceImpl.f134963b
            r1.onDataChange(r2, r6)
            goto L_0x003d
        L_0x004f:
            return
        L_0x0050:
            r6 = move-exception
        L_0x0051:
            if (r3 >= r2) goto L_0x0059
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0051
        L_0x0059:
            r0.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.setting.service.impl.SidebarServiceImpl.mo186614a(java.util.List):void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "request", "", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "", "<anonymous parameter 3>", "onPush"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.service.impl.e$d */
    static final class C54631d implements C53248k.AbstractC53250a {

        /* renamed from: a */
        public static final C54631d f134969a = new C54631d();

        C54631d() {
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            SidebarServiceImpl eVar = SidebarServiceImpl.f134962a;
            if (SidebarServiceImpl.f134966e.get()) {
                SidebarServiceImpl.f134962a.mo186614a(SidebarServiceImpl.f134962a.mo186613a(bArr));
            }
        }
    }
}
