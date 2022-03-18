package com.ss.lark.android.passport.biz.feature.login;

import android.app.Activity;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.passport.infra.base.p2423a.C49011b;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ILoginInitService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.lark.android.passport.biz.afterlogin.AbstractC64339a;
import com.ss.ttm.player.MediaPlayer;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002)*B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0007J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u001d\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0016J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0019J\r\u0010\u001a\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u001bJ2\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000e2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007J\u001c\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0002J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\r\u0010&\u001a\u00020\u000bH\u0000¢\u0006\u0002\b'J\u0010\u0010(\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/login/LoginInitializer;", "", "()V", "callbackLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "callbacks", "", "Lcom/ss/lark/android/passport/biz/afterlogin/IAfterLoginCallback;", "tasks", "Lcom/ss/lark/android/passport/biz/feature/login/ILoginInitTask;", "addCallback", "", "callback", "collectCallbacks", "", "clear", "", "dispatchError", "code", "", "msg", "", "dispatchError$passport_biz_release", "dispatchStep", "step", "dispatchStep$passport_biz_release", "dispatchSuccess", "dispatchSuccess$passport_biz_release", "initialize", "activity", "Landroid/app/Activity;", "user", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "users", "loge", "throwable", "", "logi", "removeCanceledCallbacks", "removeCanceledCallbacks$passport_biz_release", "throwInvalidParams", "LoginInitParams", "UICallback", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.login.g */
public final class LoginInitializer {

    /* renamed from: a */
    public static final LoginInitializer f163463a = new LoginInitializer();

    /* renamed from: b */
    private static final Set<ILoginInitTask> f163464b;

    /* renamed from: c */
    private static final ReentrantReadWriteLock f163465c = new ReentrantReadWriteLock();

    /* renamed from: d */
    private static final Set<AbstractC64339a> f163466d = new LinkedHashSet();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/login/LoginInitializer$LoginInitParams;", "", "activity", "Landroid/app/Activity;", "user", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "users", "", "service", "Lcom/ss/android/lark/passport/infra/service/ILoginInitService;", "initializer", "Lcom/ss/lark/android/passport/biz/feature/login/LoginInitializer;", "(Landroid/app/Activity;Lcom/ss/android/lark/passport/signinsdk_api/account/User;Ljava/util/List;Lcom/ss/android/lark/passport/infra/service/ILoginInitService;Lcom/ss/lark/android/passport/biz/feature/login/LoginInitializer;)V", "getActivity", "()Landroid/app/Activity;", "getInitializer", "()Lcom/ss/lark/android/passport/biz/feature/login/LoginInitializer;", "getService", "()Lcom/ss/android/lark/passport/infra/service/ILoginInitService;", "getUser", "()Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "getUsers", "()Ljava/util/List;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.g$a */
    public static final class LoginInitParams {

        /* renamed from: a */
        private final Activity f163467a;

        /* renamed from: b */
        private final User f163468b;

        /* renamed from: c */
        private final List<User> f163469c;

        /* renamed from: d */
        private final ILoginInitService f163470d;

        /* renamed from: e */
        private final LoginInitializer f163471e;

        /* renamed from: a */
        public final Activity mo223767a() {
            return this.f163467a;
        }

        /* renamed from: b */
        public final User mo223768b() {
            return this.f163468b;
        }

        /* renamed from: c */
        public final List<User> mo223769c() {
            return this.f163469c;
        }

        /* renamed from: d */
        public final ILoginInitService mo223770d() {
            return this.f163470d;
        }

        /* renamed from: e */
        public final LoginInitializer mo223771e() {
            return this.f163471e;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.lark.passport.signinsdk_api.account.User> */
        /* JADX WARN: Multi-variable type inference failed */
        public LoginInitParams(Activity activity, User user, List<? extends User> list, ILoginInitService gVar, LoginInitializer gVar2) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(user, "user");
            Intrinsics.checkParameterIsNotNull(list, "users");
            Intrinsics.checkParameterIsNotNull(gVar, "service");
            Intrinsics.checkParameterIsNotNull(gVar2, "initializer");
            this.f163467a = activity;
            this.f163468b = user;
            this.f163469c = list;
            this.f163470d = gVar;
            this.f163471e = gVar2;
        }
    }

    private LoginInitializer() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/login/LoginInitializer$UICallback;", "Lcom/ss/android/lark/passport/infra/base/callback/CancelableCallback;", "Lcom/ss/lark/android/passport/biz/afterlogin/IAfterLoginCallback;", "callback", "(Lcom/ss/lark/android/passport/biz/afterlogin/IAfterLoginCallback;)V", "onResult", "", "success", "", "code", "", "msg", "", "onStep", "stepType", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.g$b */
    public static final class UICallback extends C49011b<AbstractC64339a> implements AbstractC64339a {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.feature.login.g$b$a */
        static final class RunnableC64849a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ UICallback f163472a;

            /* renamed from: b */
            final /* synthetic */ boolean f163473b;

            /* renamed from: c */
            final /* synthetic */ int f163474c;

            /* renamed from: d */
            final /* synthetic */ String f163475d;

            RunnableC64849a(UICallback bVar, boolean z, int i, String str) {
                this.f163472a = bVar;
                this.f163473b = z;
                this.f163474c = i;
                this.f163475d = str;
            }

            public final void run() {
                if (!this.f163472a.mo171124b()) {
                    ((AbstractC64339a) this.f163472a.f123044a).mo222858a(this.f163473b, this.f163474c, this.f163475d);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UICallback(AbstractC64339a aVar) {
            super(aVar);
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
        }

        @Override // com.ss.lark.android.passport.biz.afterlogin.AbstractC64339a
        /* renamed from: a */
        public void mo222858a(boolean z, int i, String str) {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getUIExecutor().execute(new RunnableC64849a(this, z, i, str));
        }
    }

    /* renamed from: a */
    public final void mo223762a() {
        m254661a("login initialize success");
        Iterator<T> it = m254660a(true).iterator();
        while (it.hasNext()) {
            it.next().mo222858a(true, 0, "ok");
        }
    }

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f163464b = linkedHashSet;
        linkedHashSet.add(new InitTask());
        linkedHashSet.add(new GetChatterTask());
        linkedHashSet.add(new AfterGetChatterTask());
        linkedHashSet.add(new CheckUserProtocolTask());
        linkedHashSet.add(new LoadConfigTask());
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
    public final void mo223766b() {
        /*
        // Method dump skipped, instructions count: 147
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.lark.android.passport.biz.feature.login.LoginInitializer.mo223766b():void");
    }

    /* renamed from: a */
    private final void m254661a(String str) {
        PassportLog.f123351c.mo171474a().mo171465b("n_action_after_login", str);
    }

    /* renamed from: b */
    private final void m254663b(String str) {
        mo223763a(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, "error params, msg: " + str);
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
    private final java.util.List<com.ss.lark.android.passport.biz.afterlogin.AbstractC64339a> m254660a(boolean r8) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = com.ss.lark.android.passport.biz.feature.login.LoginInitializer.f163465c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.readLock()
            int r3 = r1.getWriteHoldCount()
            r4 = 0
            if (r3 != 0) goto L_0x0019
            int r3 = r1.getReadHoldCount()
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            r5 = 0
        L_0x001b:
            if (r5 >= r3) goto L_0x0023
            r2.unlock()
            int r5 = r5 + 1
            goto L_0x001b
        L_0x0023:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            java.util.Set<com.ss.lark.android.passport.biz.afterlogin.a> r5 = com.ss.lark.android.passport.biz.feature.login.LoginInitializer.f163466d     // Catch:{ all -> 0x0045 }
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ all -> 0x0045 }
            r0.addAll(r6)     // Catch:{ all -> 0x0045 }
            if (r8 == 0) goto L_0x0037
            r5.clear()     // Catch:{ all -> 0x0045 }
        L_0x0037:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0045 }
        L_0x0039:
            if (r4 >= r3) goto L_0x0041
            r2.lock()
            int r4 = r4 + 1
            goto L_0x0039
        L_0x0041:
            r1.unlock()
            return r0
        L_0x0045:
            r8 = move-exception
        L_0x0046:
            if (r4 >= r3) goto L_0x004e
            r2.lock()
            int r4 = r4 + 1
            goto L_0x0046
        L_0x004e:
            r1.unlock()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.lark.android.passport.biz.feature.login.LoginInitializer.m254660a(boolean):java.util.List");
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
    public final void mo223765a(com.ss.lark.android.passport.biz.afterlogin.AbstractC64339a r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x0048
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = com.ss.lark.android.passport.biz.feature.login.LoginInitializer.f163465c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0014
            int r2 = r0.getReadHoldCount()
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            r4 = 0
        L_0x0016:
            if (r4 >= r2) goto L_0x001e
            r1.unlock()
            int r4 = r4 + 1
            goto L_0x0016
        L_0x001e:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.Set<com.ss.lark.android.passport.biz.afterlogin.a> r4 = com.ss.lark.android.passport.biz.feature.login.LoginInitializer.f163466d     // Catch:{ all -> 0x003b }
            com.ss.lark.android.passport.biz.feature.login.g$b r5 = new com.ss.lark.android.passport.biz.feature.login.g$b     // Catch:{ all -> 0x003b }
            r5.<init>(r7)     // Catch:{ all -> 0x003b }
            r4.add(r5)     // Catch:{ all -> 0x003b }
        L_0x002f:
            if (r3 >= r2) goto L_0x0037
            r1.lock()
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0037:
            r0.unlock()
            return
        L_0x003b:
            r7 = move-exception
        L_0x003c:
            if (r3 >= r2) goto L_0x0044
            r1.lock()
            int r3 = r3 + 1
            goto L_0x003c
        L_0x0044:
            r0.unlock()
            throw r7
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.lark.android.passport.biz.feature.login.LoginInitializer.mo223765a(com.ss.lark.android.passport.biz.afterlogin.a):void");
    }

    /* renamed from: a */
    private final void m254662a(String str, Throwable th) {
        PassportLog.f123351c.mo171474a().mo171462a("n_action_after_login", str, th);
    }

    /* renamed from: a */
    public final void mo223763a(int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        m254661a("login initialize failed, code: " + i + ", msg: " + str);
        Iterator<T> it = m254660a(true).iterator();
        while (it.hasNext()) {
            it.next().mo222858a(false, i, str);
        }
    }

    /* renamed from: a */
    public final void mo223764a(Activity activity, User user, List<? extends User> list, AbstractC64339a aVar) {
        Boolean bool;
        boolean z;
        Intrinsics.checkParameterIsNotNull(user, "user");
        Intrinsics.checkParameterIsNotNull(list, "users");
        mo223765a(aVar);
        ServiceFinder rVar = ServiceFinder.f123386a;
        ILoginInitService gVar = (ILoginInitService) ServiceFinder.m193746a(ILoginInitService.class);
        if (activity == null) {
            m254663b("activity:" + activity + ", user: " + user);
            return;
        }
        LoginInitParams aVar2 = new LoginInitParams(activity, user, list, gVar, this);
        for (T t : f163464b) {
            try {
                Result.Companion aVar3 = Result.Companion;
                if (!((Boolean) t.invoke(aVar2)).booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                bool = Result.m271569constructorimpl(Boolean.valueOf(z));
            } catch (Throwable th) {
                Result.Companion aVar4 = Result.Companion;
                bool = Result.m271569constructorimpl(C69097g.m265890a(th));
            }
            Throwable r1 = Result.m271572exceptionOrNullimpl(bool);
            if (r1 != null) {
                r1.printStackTrace();
                f163463a.m254662a("task: " + t.mo223750a() + " error: " + r1.getMessage(), r1);
            }
            if (Result.m271575isFailureimpl(bool)) {
                bool = true;
            }
            if (((Boolean) bool).booleanValue()) {
                f163463a.m254663b("error found");
                return;
            }
        }
    }
}
