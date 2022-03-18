package com.ss.lark.android.passport.biz.feature.session;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.ding.helper.C36644b;
import com.ss.android.lark.p2069j.p2070a.C40657x;
import com.ss.android.lark.passport.infra.listenermanage.LoginListenerManager;
import com.ss.android.lark.passport.infra.listenermanage.LogoutListenerManager;
import com.ss.android.lark.passport.infra.listenermanage.UserSwitchListenerManager;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ILogoutUserService;
import com.ss.android.lark.passport.infra.service.IUserListService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.AppActivityManager;
import com.ss.android.lark.passport.infra.util.coroutines.LarkDispatchers;
import com.ss.android.lark.passport.infra.util.p2439a.C49144c;
import com.ss.android.lark.passport.infra.util.p2440b.C49160a;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.infra.watcher.WatcherUniContext;
import com.ss.android.lark.passport.infra.widget.p2450d.C49266a;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.entity.C49369d;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.AbstractC49377c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.C49375a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.C49376b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.p2458a.AbstractC49374b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.p2458a.C49373a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.UserSwitchReason;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.C57849k;
import com.ss.android.lark.utils.LarkContext;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.CheckStatusResp;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import com.ss.lark.android.passport.biz.feature.constants.LogoutReason;
import com.ss.lark.android.passport.biz.feature.session.SessionInvalidProcessBlocker;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.C69388e;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J#\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ(\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00132\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001dH\u0007J0\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u001f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\"0\u001dH\u0002J:\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u001f2\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010%0\u001dH\u0002J\n\u0010&\u001a\u0004\u0018\u00010'H\u0002J\u0012\u0010(\u001a\u00020\"2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010)\u001a\u00020\u0015H\u0007J\b\u0010*\u001a\u00020\u0015H\u0002J$\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00132\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/H\u0002J0\u00100\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00132\u0016\b\u0002\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u000102H\u0002J\b\u00103\u001a\u00020\u0015H\u0002J\u0010\u00104\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u0013H\u0002J&\u00105\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u00132\u0014\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010807H\u0002J\u001a\u00109\u001a\u00020\u00152\u0006\u0010:\u001a\u00020;2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0010\u0010<\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0007JG\u0010=\u001a\u00020\u00152\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010?2\u001a\u0010@\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0019070?2\b\u0010A\u001a\u0004\u0018\u00010BH@ø\u0001\u0000¢\u0006\u0002\u0010CJQ\u0010D\u001a\u00020\u00152\b\u0010A\u001a\u0004\u0018\u00010B2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u001f2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020%0\u001d2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\"0\u001dH@ø\u0001\u0000¢\u0006\u0002\u0010EJ7\u0010F\u001a\u00020\u00112\u001a\u0010@\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0019070?2\b\u0010A\u001a\u0004\u0018\u00010BH@ø\u0001\u0000¢\u0006\u0002\u0010GJ5\u0010H\u001a\u00020\u00152\u0006\u0010I\u001a\u00020'2\u0006\u0010J\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010A\u001a\u0004\u0018\u00010BH@ø\u0001\u0000¢\u0006\u0002\u0010KJG\u0010L\u001a\u00020\u00152\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010?2\u001a\u0010@\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0019070?2\b\u0010A\u001a\u0004\u0018\u00010BH@ø\u0001\u0000¢\u0006\u0002\u0010CJ\b\u0010M\u001a\u00020\u0015H\u0002J\b\u0010N\u001a\u00020\u0015H\u0002J\b\u0010O\u001a\u00020\u0015H\u0002J\b\u0010P\u001a\u00020\u0015H\u0002J\u0012\u0010Q\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006R"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessor;", "", "()V", "RETRY_DELAY", "", "handler", "Landroid/os/Handler;", "logger", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "processing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "retryRunnable", "Ljava/lang/Runnable;", "shouldRetry", "canProcess", "", "reason", "", "cleanCacheIfResign", "", "user", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "logoutReason", "Lcom/ss/lark/android/passport/biz/feature/constants/LogoutReason;", "(Lcom/ss/android/lark/passport/signinsdk_api/account/User;Lcom/ss/lark/android/passport/biz/feature/constants/LogoutReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "done", "extra", "", "filterRegisteredUsers", "", "checkedUsers", "userStatusMap", "", "filterSessionInvalidUsers", "sessionStatusMap", "Lcom/ss/lark/android/passport/biz/compat/v2/featurec/network/responese/CheckStatusResp$SessionStatus;", "findActiveTopActivity", "Landroid/app/Activity;", "findToastResByLogoutReason", "init", "killSomeService", "loge", "event", "msg", "throwable", "", "logi", "params", "", "logoutAll", "markRetry", "markRetryBecauseOfBlock", "blockingInfo", "Lkotlin/Pair;", "Lcom/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessBlocker$BlockReason;", "onSwitchToNextValidUserFinished", "context", "Landroid/content/Context;", "process", "processBackgroundInvalidUsers", "unregisteredUsers", "", "invalidUsers", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "(Ljava/util/Collection;Ljava/util/Collection;Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processCheckStatusResp", "(Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processForegroundUser", "(Ljava/util/Collection;Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processForegroundUserInvalid", "activity", "userId", "(Landroid/app/Activity;Ljava/lang/String;Lcom/ss/lark/android/passport/biz/feature/constants/LogoutReason;Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processInvalidUsers", "registerListenersForDone", "registerLogoutAllListener", "registerNetworkChangeListener", "registerPushListener", "shouldSilenceProcess", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.session.c */
public final class SessionInvalidProcessor {

    /* renamed from: a */
    public static final SessionInvalidProcessor f163671a = new SessionInvalidProcessor();

    /* renamed from: b */
    private static final AtomicBoolean f163672b = new AtomicBoolean(false);

    /* renamed from: c */
    private static final AtomicBoolean f163673c = new AtomicBoolean(false);

    /* renamed from: d */
    private static final Runnable f163674d = RunnableC64963t.f163693a;

    /* renamed from: e */
    private static final Handler f163675e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private static final CoroutineScope f163676f = C49144c.m193791a();

    /* renamed from: g */
    private static final PassportLog f163677g = PassportLog.f123351c.mo171474a();

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u001a\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u00032\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH@"}, d2 = {"processBackgroundInvalidUsers", "", "unregisteredUsers", "", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "invalidUsers", "Lkotlin/Pair;", "Lcom/ss/lark/android/passport/biz/feature/constants/LogoutReason;", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.lark.android.passport.biz.feature.session.SessionInvalidProcessor", mo239173f = "SessionInvalidProcessor.kt", mo239174i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, mo239175l = {738}, mo239176m = "processBackgroundInvalidUsers", mo239177n = {"this", "unregisteredUsers", "invalidUsers", "uniContext", "foregroundUser", "backgroundInvalidUsers", "silenceInvalidUsers", "normalInvalidUsers", "$this$forEach$iv", "element$iv", "it"}, mo239178s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$10", "L$11"})
    /* renamed from: com.ss.lark.android.passport.biz.feature.session.c$d */
    public static final class C64946d extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SessionInvalidProcessor this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64946d(SessionInvalidProcessor cVar, Continuation cVar2) {
            super(cVar2);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo223980b(null, null, null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH@"}, d2 = {"processCheckStatusResp", "", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "checkedUsers", "", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "sessionStatusMap", "", "", "Lcom/ss/lark/android/passport/biz/compat/v2/featurec/network/responese/CheckStatusResp$SessionStatus;", "userStatusMap", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.lark.android.passport.biz.feature.session.SessionInvalidProcessor", mo239173f = "SessionInvalidProcessor.kt", mo239174i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, mo239175l = {316}, mo239176m = "processCheckStatusResp", mo239177n = {"this", "uniContext", "checkedUsers", "sessionStatusMap", "userStatusMap", "requestKvs", "unregisteredUsers", "invalidUserWithReasonMap", "reasonList", "reasonGroup", "params", "invalidUserWithSessionMap"}, mo239178s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11"})
    /* renamed from: com.ss.lark.android.passport.biz.feature.session.c$e */
    public static final class C64947e extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SessionInvalidProcessor this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64947e(SessionInvalidProcessor cVar, Continuation cVar2) {
            super(cVar2);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo223976a((UniContext) null, (List<? extends User>) null, (Map<String, ? extends CheckStatusResp.SessionStatus>) null, (Map<String, Integer>) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH@"}, d2 = {"processForegroundUser", "", "invalidUsers", "", "Lkotlin/Pair;", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "Lcom/ss/lark/android/passport/biz/feature/constants/LogoutReason;", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.lark.android.passport.biz.feature.session.SessionInvalidProcessor", mo239173f = "SessionInvalidProcessor.kt", mo239174i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, mo239175l = {443, 455}, mo239176m = "processForegroundUser", mo239177n = {"this", "invalidUsers", "uniContext", "foregroundUser", "resolved", "pair", "service", "blockingInfo", "it", "this", "invalidUsers", "uniContext", "foregroundUser", "pair", "service", "blockingInfo", "topActivity"}, mo239178s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"})
    /* renamed from: com.ss.lark.android.passport.biz.feature.session.c$g */
    public static final class C64949g extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SessionInvalidProcessor this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64949g(SessionInvalidProcessor cVar, Continuation cVar2) {
            super(cVar2);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo223977a((Collection<? extends Pair<? extends User, ? extends LogoutReason>>) null, (UniContext) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH@"}, d2 = {"processForegroundUserInvalid", "", "activity", "Landroid/app/Activity;", "userId", "", "logoutReason", "Lcom/ss/lark/android/passport/biz/feature/constants/LogoutReason;", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.lark.android.passport.biz.feature.session.SessionInvalidProcessor", mo239173f = "SessionInvalidProcessor.kt", mo239174i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, mo239175l = {577, 613}, mo239176m = "processForegroundUserInvalid", mo239177n = {"this", "activity", "userId", "logoutReason", "uniContext", "service", "foregroundUser", "params", "user", "it", "this", "activity", "userId", "logoutReason", "uniContext", "service", "foregroundUser", "switchListener"}, mo239178s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"})
    /* renamed from: com.ss.lark.android.passport.biz.feature.session.c$h */
    public static final class C64950h extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SessionInvalidProcessor this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64950h(SessionInvalidProcessor cVar, Continuation cVar2) {
            super(cVar2);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo223974a((Activity) null, (String) null, (LogoutReason) null, (UniContext) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u001a\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u00032\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH@"}, d2 = {"processInvalidUsers", "", "unregisteredUsers", "", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "invalidUsers", "Lkotlin/Pair;", "Lcom/ss/lark/android/passport/biz/feature/constants/LogoutReason;", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.lark.android.passport.biz.feature.session.SessionInvalidProcessor", mo239173f = "SessionInvalidProcessor.kt", mo239174i = {0, 0, 0, 0, 1, 1, 1, 1}, mo239175l = {392, 394}, mo239176m = "processInvalidUsers", mo239177n = {"this", "unregisteredUsers", "invalidUsers", "uniContext", "this", "unregisteredUsers", "invalidUsers", "uniContext"}, mo239178s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: com.ss.lark.android.passport.biz.feature.session.c$m */
    public static final class C64956m extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SessionInvalidProcessor this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64956m(SessionInvalidProcessor cVar, Continuation cVar2) {
            super(cVar2);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo223978a((Collection<? extends User>) null, (Collection<? extends Pair<? extends User, ? extends LogoutReason>>) null, (UniContext) null, this);
        }
    }

    private SessionInvalidProcessor() {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo223976a(com.ss.android.lark.passport.signinsdk_api.base.log.UniContext r21, java.util.List<? extends com.ss.android.lark.passport.signinsdk_api.account.User> r22, java.util.Map<java.lang.String, ? extends com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.CheckStatusResp.SessionStatus> r23, java.util.Map<java.lang.String, java.lang.Integer> r24, kotlin.coroutines.Continuation<? super kotlin.Unit> r25) {
        /*
        // Method dump skipped, instructions count: 795
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.lark.android.passport.biz.feature.session.SessionInvalidProcessor.mo223976a(com.ss.android.lark.passport.signinsdk_api.base.log.UniContext, java.util.List, java.util.Map, java.util.Map, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0080 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo223978a(java.util.Collection<? extends com.ss.android.lark.passport.signinsdk_api.account.User> r6, java.util.Collection<? extends kotlin.Pair<? extends com.ss.android.lark.passport.signinsdk_api.account.User, ? extends com.ss.lark.android.passport.biz.feature.constants.LogoutReason>> r7, com.ss.android.lark.passport.signinsdk_api.base.log.UniContext r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.lark.android.passport.biz.feature.session.SessionInvalidProcessor.mo223978a(java.util.Collection, java.util.Collection, com.ss.android.lark.passport.signinsdk_api.base.log.UniContext, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0035  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo223977a(java.util.Collection<? extends kotlin.Pair<? extends com.ss.android.lark.passport.signinsdk_api.account.User, ? extends com.ss.lark.android.passport.biz.feature.constants.LogoutReason>> r24, com.ss.android.lark.passport.signinsdk_api.base.log.UniContext r25, kotlin.coroutines.Continuation<? super java.lang.Boolean> r26) {
        /*
        // Method dump skipped, instructions count: 594
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.lark.android.passport.biz.feature.session.SessionInvalidProcessor.mo223977a(java.util.Collection, com.ss.android.lark.passport.signinsdk_api.base.log.UniContext, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: a */
    private final void m255038a(String str, Pair<Boolean, ? extends SessionInvalidProcessBlocker.BlockReason> pair) {
        SessionInvalidProcessBlocker.BlockReason bVar = (SessionInvalidProcessBlocker.BlockReason) pair.getSecond();
        if (bVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("intercepted_");
            SessionInvalidProcessBlocker.BlockReason bVar2 = (SessionInvalidProcessBlocker.BlockReason) pair.getSecond();
            sb.append(bVar2 != null ? bVar2.mo223970a() : null);
            m255035a(str, "blocked", MapsKt.mutableMapOf(TuplesKt.to("reason", sb.toString())));
            m255045c(bVar.toString());
            return;
        }
        f163677g.mo171471d("n_action_session_invalid", "mark retry, but no reason");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo223975a(User user, LogoutReason logoutReason, Continuation<? super Unit> cVar) {
        if (logoutReason != LogoutReason.RESIGN) {
            return Unit.INSTANCE;
        }
        Object a = C69388e.m266829a(Dispatchers.m266326d(), new C64942a(user, null), cVar);
        return a == C69086a.m265828a() ? a : Unit.INSTANCE;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0034  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo223974a(android.app.Activity r19, java.lang.String r20, com.ss.lark.android.passport.biz.feature.constants.LogoutReason r21, com.ss.android.lark.passport.signinsdk_api.base.log.UniContext r22, kotlin.coroutines.Continuation<? super kotlin.Unit> r23) {
        /*
        // Method dump skipped, instructions count: 476
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.lark.android.passport.biz.feature.session.SessionInvalidProcessor.mo223974a(android.app.Activity, java.lang.String, com.ss.lark.android.passport.biz.feature.constants.LogoutReason, com.ss.android.lark.passport.signinsdk_api.base.log.UniContext, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: a */
    public final void mo223979a(Context context, LogoutReason logoutReason) {
        List<User> allUserList = ServiceFinder.m193744a().getAllUserList();
        Intrinsics.checkExpressionValueIsNotNull(allUserList, "ServiceFinder.userListService.allUserList");
        StringBuilder sb = new StringBuilder();
        sb.append("switch to next valid user finished, local users: ");
        List<User> list = allUserList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().userId);
        }
        sb.append(arrayList);
        m255032a(this, "n_action_session_invalid_process_foreground_silence", sb.toString(), (Map) null, 4, (Object) null);
        if (!allUserList.isEmpty()) {
            m255032a(this, "n_action_session_invalid_process_foreground_silence", "local users not empty, skip toast", (Map) null, 4, (Object) null);
            return;
        }
        int a = m255027a(logoutReason);
        if (a != 0) {
            m255032a(this, "n_action_session_invalid_process_foreground_silence", "toast res found", (Map) null, 4, (Object) null);
            C49266a.m194146a(context, a);
            return;
        }
        m255031a(this, "n_action_session_invalid_process_foreground_silence", "toast res not found, logout reason: " + logoutReason, (Throwable) null, 4, (Object) null);
    }

    /* renamed from: a */
    public static /* synthetic */ void m255037a(String str, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        m255036a(str, map);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessor$process$4", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/lark/android/passport/biz/compat/v2/featurec/network/responese/CheckStatusResp;", "getConvertType", "Ljava/lang/reflect/Type;", "onError", "", "networkErrorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.session.c$c */
    public static final class C64944c implements ICallback<CheckStatusResp> {

        /* renamed from: a */
        final /* synthetic */ UniContext f163678a;

        /* renamed from: b */
        final /* synthetic */ List f163679b;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public Type mo101474a() {
            return CheckStatusResp.class;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101475a(NetworkErrorResult networkErrorResult) {
            Intrinsics.checkParameterIsNotNull(networkErrorResult, "networkErrorResult");
            SessionInvalidProcessor cVar = SessionInvalidProcessor.f163671a;
            SessionInvalidProcessor.m255031a(cVar, "n_action_session_invalid_check_failed", "check status failed: " + networkErrorResult, (Throwable) null, 4, (Object) null);
            UniContext uniContext = this.f163678a;
            C40657x xVar = C40657x.f103225d;
            Intrinsics.checkExpressionValueIsNotNull(xVar, "EPMClientPassportMonitor…CHECK_STATUS_REQUEST_FAIL");
            WatcherHelper.m193666a(uniContext, xVar, null, 4, null);
            SessionInvalidProcessor.m255037a("check_session_failed", (Map) null, 2, (Object) null);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
        @DebugMetadata(mo239172c = "com.ss.lark.android.passport.biz.feature.session.SessionInvalidProcessor$process$4$onSuccess$1", mo239173f = "SessionInvalidProcessor.kt", mo239174i = {0}, mo239175l = {244}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
        /* renamed from: com.ss.lark.android.passport.biz.feature.session.c$c$a */
        static final class C64945a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ ResponseModel $data;
            final /* synthetic */ Map $sessionStatusMap;
            Object L$0;
            int label;
            private CoroutineScope p$;
            final /* synthetic */ C64944c this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C64945a(C64944c cVar, Map map, ResponseModel responseModel, Continuation cVar2) {
                super(2, cVar2);
                this.this$0 = cVar;
                this.$sessionStatusMap = map;
                this.$data = responseModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                C64945a aVar = new C64945a(this.this$0, this.$sessionStatusMap, this.$data, cVar);
                aVar.p$ = (CoroutineScope) obj;
                return aVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                return ((C64945a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Map<String, Integer> map;
                Object a = C69086a.m265828a();
                int i = this.label;
                if (i == 0) {
                    C69097g.m265891a(obj);
                    CoroutineScope ahVar = this.p$;
                    SessionInvalidProcessor cVar = SessionInvalidProcessor.f163671a;
                    UniContext uniContext = this.this$0.f163678a;
                    List<? extends User> list = this.this$0.f163679b;
                    Map<String, ? extends CheckStatusResp.SessionStatus> map2 = this.$sessionStatusMap;
                    CheckStatusResp checkStatusResp = (CheckStatusResp) this.$data.getData();
                    if (checkStatusResp == null || (map = checkStatusResp.userStatusMap) == null) {
                        map = MapsKt.emptyMap();
                    }
                    this.L$0 = ahVar;
                    this.label = 1;
                    if (cVar.mo223976a(uniContext, list, map2, map, this) == a) {
                        return a;
                    }
                } else if (i == 1) {
                    CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                    C69097g.m265891a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return Unit.INSTANCE;
            }
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101476a(ResponseModel<CheckStatusResp> responseModel) {
            Map<String, CheckStatusResp.SessionStatus> map;
            boolean z;
            Intrinsics.checkParameterIsNotNull(responseModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            CheckStatusResp data = responseModel.getData();
            if (data != null) {
                map = data.sessionStatusMap;
            } else {
                map = null;
            }
            if (map == null || map.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                SessionInvalidProcessor cVar = SessionInvalidProcessor.f163671a;
                SessionInvalidProcessor.f163677g.mo171468c("n_action_session_invalid_check_result", "session status map is empty, logout all");
                SessionInvalidProcessor.f163671a.mo223981b();
                SessionInvalidProcessor.m255037a("none_session_status_map", (Map) null, 2, (Object) null);
                linkedHashMap.put("server_count", 0);
                UniContext uniContext = this.f163678a;
                C40657x xVar = C40657x.f103224c;
                Intrinsics.checkExpressionValueIsNotNull(xVar, "EPMClientPassportMonitor…CHECK_STATUS_REQUEST_SUCC");
                WatcherHelper.m193665a(uniContext, xVar, linkedHashMap);
                return;
            }
            SessionInvalidProcessor cVar2 = SessionInvalidProcessor.f163671a;
            Job unused = C69553g.m266944a(SessionInvalidProcessor.f163676f, LarkDispatchers.f123416a.mo171626a(), null, new C64945a(this, map, responseModel, null), 2, null);
        }

        C64944c(UniContext uniContext, List list) {
            this.f163678a = uniContext;
            this.f163679b = list;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.session.c$t */
    static final class RunnableC64963t implements Runnable {

        /* renamed from: a */
        public static final RunnableC64963t f163693a = new RunnableC64963t();

        RunnableC64963t() {
        }

        public final void run() {
            SessionInvalidProcessor.m255033a("retry");
        }
    }

    /* renamed from: c */
    private final void m255044c() {
        LogoutListenerManager.m193633a(C64960q.f163692a);
    }

    /* renamed from: d */
    private final void m255047d() {
        ServiceFinder.m193748c().registerPushValidatingEvent(C64962s.INSTANCE);
    }

    /* renamed from: e */
    private final void m255049e() {
        ServiceFinder.m193748c().registerNetworkChangeListener(C64961r.INSTANCE);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m255030a() {
        SessionInvalidProcessor cVar = f163671a;
        cVar.m255047d();
        cVar.m255049e();
        cVar.m255050f();
        cVar.m255044c();
        SessionInvalidProcessBlocker.f163656a.mo223965a(C64943b.INSTANCE);
    }

    /* renamed from: f */
    private final void m255050f() {
        LoginListenerManager.m193626a(C64957n.f163689a);
        LogoutListenerManager.m193633a(C64958o.f163690a);
        UserSwitchListenerManager.m193648a(C64959p.f163691a);
    }

    /* renamed from: g */
    private final void m255051g() {
        ServiceFinder.m193752g().killAllLittleApps();
        ServiceFinder.m193752g().killVoIp("foreground user's session invalid");
        C36644b.m144618a().mo135225h();
    }

    /* renamed from: h */
    private final Activity m255052h() {
        Activity a = AppActivityManager.m193861a();
        if (a == null) {
            return a;
        }
        if (a.isFinishing() || a.isDestroyed()) {
            return null;
        }
        return a;
    }

    /* renamed from: b */
    public final void mo223981b() {
        Application application = LarkContext.getApplication();
        ServiceFinder rVar = ServiceFinder.f123386a;
        Intrinsics.checkExpressionValueIsNotNull(application, "context");
        ((ILogoutUserService) ServiceFinder.m193746a(ILogoutUserService.class)).logoutAll(application, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessor$processForegroundUserInvalid$5", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/UserSwitchSuccessContext;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.session.c$k */
    public static final class C64953k implements IGetDataCallback<C49382d> {

        /* renamed from: a */
        final /* synthetic */ String f163684a;

        C64953k(String str) {
            this.f163684a = str;
        }

        /* renamed from: a */
        public void onSuccess(C49382d dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            SessionInvalidProcessor cVar = SessionInvalidProcessor.f163671a;
            SessionInvalidProcessor.m255031a(cVar, "n_action_session_invalid", "switch to invalid user: " + this.f163684a + ", but success?", (Throwable) null, 4, (Object) null);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            SessionInvalidProcessor cVar = SessionInvalidProcessor.f163671a;
            SessionInvalidProcessor.m255032a(cVar, "n_action_session_invalid", "switch to invalid user: " + this.f163684a + ", expected error: " + errorResult, (Map) null, 4, (Object) null);
            SessionInvalidProcessor.m255036a("switch_user_failed", MapsKt.mapOf(TuplesKt.to("error", errorResult.toString())));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/passport/signinsdk_api/entity/PushSessionValidating;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.session.c$s */
    public static final class C64962s extends Lambda implements Function1<C49369d, Unit> {
        public static final C64962s INSTANCE = new C64962s();

        C64962s() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C49369d dVar) {
            invoke(dVar);
            return Unit.INSTANCE;
        }

        public final void invoke(C49369d dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "it");
            SessionInvalidProcessor cVar = SessionInvalidProcessor.f163671a;
            SessionInvalidProcessor.m255032a(cVar, "n_action_session_invalid", "receive validating event: " + dVar, (Map) null, 4, (Object) null);
            SessionInvalidProcessor.m255033a("push");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "blocking", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.session.c$b */
    public static final class C64943b extends Lambda implements Function1<Boolean, Unit> {
        public static final C64943b INSTANCE = new C64943b();

        C64943b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (!z) {
                SessionInvalidProcessor cVar = SessionInvalidProcessor.f163671a;
                if (SessionInvalidProcessor.f163673c.compareAndSet(true, false)) {
                    SessionInvalidProcessor.m255032a(SessionInvalidProcessor.f163671a, "n_action_session_invalid", "disable block, retry", (Map) null, 4, (Object) null);
                    SessionInvalidProcessor cVar2 = SessionInvalidProcessor.f163671a;
                    Handler handler = SessionInvalidProcessor.f163675e;
                    SessionInvalidProcessor cVar3 = SessionInvalidProcessor.f163671a;
                    handler.removeCallbacks(SessionInvalidProcessor.f163674d);
                    SessionInvalidProcessor cVar4 = SessionInvalidProcessor.f163671a;
                    Handler handler2 = SessionInvalidProcessor.f163675e;
                    SessionInvalidProcessor cVar5 = SessionInvalidProcessor.f163671a;
                    handler2.postDelayed(SessionInvalidProcessor.f163674d, 100);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/login/LoginEndContext;", "onLoginEnd"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.session.c$n */
    public static final class C64957n implements AbstractC49374b {

        /* renamed from: a */
        public static final C64957n f163689a = new C64957n();

        C64957n() {
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.p2458a.AbstractC49374b
        /* renamed from: a */
        public final void mo171423a(C49373a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "it");
            SessionInvalidProcessor.m255037a("resolved", (Map) null, 2, (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/UserSwitchSuccessContext;", "onUserSwitchSuccess"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.session.c$p */
    public static final class C64959p implements AbstractC49379a {

        /* renamed from: a */
        public static final C64959p f163691a = new C64959p();

        C64959p() {
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
        /* renamed from: a */
        public /* synthetic */ void mo102549a(C49380b bVar) {
            AbstractC49379a.CC.$default$a(this, bVar);
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
        /* renamed from: a */
        public /* synthetic */ void mo102550a(C49381c cVar) {
            AbstractC49379a.CC.$default$a(this, cVar);
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
        public final void onUserSwitchSuccess(C49382d dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "it");
            SessionInvalidProcessor.m255037a("resolved", (Map) null, 2, (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.session.c$r */
    public static final class C64961r extends Lambda implements Function1<Boolean, Unit> {
        public static final C64961r INSTANCE = new C64961r();

        C64961r() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (z) {
                SessionInvalidProcessor cVar = SessionInvalidProcessor.f163671a;
                if (SessionInvalidProcessor.f163673c.compareAndSet(true, false)) {
                    SessionInvalidProcessor.m255033a("connection_available");
                }
            }
        }
    }

    /* renamed from: b */
    private final boolean m255041b(LogoutReason logoutReason) {
        return CollectionsKt.contains(LogoutReason.Companion.mo223521a(), logoutReason);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessor$processForegroundUserInvalid$4", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.session.c$j */
    public static final class C64952j implements IGetDataCallback<User> {

        /* renamed from: a */
        final /* synthetic */ Activity f163682a;

        /* renamed from: b */
        final /* synthetic */ LogoutReason f163683b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            SessionInvalidProcessor.m255032a(SessionInvalidProcessor.f163671a, "n_action_session_invalid", "next valid user not found", (Map) null, 4, (Object) null);
            SessionInvalidProcessor.f163671a.mo223979a(this.f163682a, this.f163683b);
        }

        /* renamed from: a */
        public void onSuccess(User user) {
            if (user == null) {
                SessionInvalidProcessor.m255032a(SessionInvalidProcessor.f163671a, "n_action_session_invalid", "next valid user not found", (Map) null, 4, (Object) null);
                SessionInvalidProcessor.f163671a.mo223979a(this.f163682a, this.f163683b);
                return;
            }
            SessionInvalidProcessor cVar = SessionInvalidProcessor.f163671a;
            SessionInvalidProcessor.m255032a(cVar, "n_action_session_invalid_process_foreground_silence", "end, switch to " + user.userId, (Map) null, 4, (Object) null);
        }

        C64952j(Activity activity, LogoutReason logoutReason) {
            this.f163682a = activity;
            this.f163683b = logoutReason;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/logout/LogoutEndContext;", "onLogoutEnd"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.session.c$o */
    public static final class C64958o implements AbstractC49377c {

        /* renamed from: a */
        public static final C64958o f163690a = new C64958o();

        C64958o() {
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.AbstractC49377c
        /* renamed from: a */
        public /* synthetic */ void mo171424a(C49375a aVar) {
            AbstractC49377c.CC.$default$a(this, aVar);
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.AbstractC49377c
        /* renamed from: a */
        public final void mo171425a(C49376b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "it");
            if (bVar.f123927d.isEmpty()) {
                SessionInvalidProcessor.m255037a("none_user", (Map) null, 2, (Object) null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessor$processForegroundUserInvalid$3", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/logout/OnLogoutListener;", "onLogoutEnd", "", "context", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/logout/LogoutEndContext;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.session.c$i */
    public static final class C64951i implements AbstractC49377c {

        /* renamed from: a */
        final /* synthetic */ C64954l f163680a;

        /* renamed from: b */
        final /* synthetic */ UniContext f163681b;

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.AbstractC49377c
        /* renamed from: a */
        public /* synthetic */ void mo171424a(C49375a aVar) {
            AbstractC49377c.CC.$default$a(this, aVar);
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.AbstractC49377c
        /* renamed from: a */
        public void mo171425a(C49376b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "context");
            if (bVar.f123927d.isEmpty()) {
                UserSwitchListenerManager.m193650b(this.f163680a);
            }
            LogoutListenerManager.m193635b(this);
            UniContext uniContext = this.f163681b;
            C40657x xVar = C40657x.f103230i;
            Intrinsics.checkExpressionValueIsNotNull(xVar, "EPMClientPassportMonitor…FRONT_USER_END_LOGOUT_ALL");
            WatcherHelper.m193666a(uniContext, xVar, null, 4, null);
        }

        C64951i(C64954l lVar, UniContext uniContext) {
            this.f163680a = lVar;
            this.f163681b = uniContext;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/logout/LogoutEndContext;", "onLogoutEnd"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.session.c$q */
    public static final class C64960q implements AbstractC49377c {

        /* renamed from: a */
        public static final C64960q f163692a = new C64960q();

        C64960q() {
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.AbstractC49377c
        /* renamed from: a */
        public /* synthetic */ void mo171424a(C49375a aVar) {
            AbstractC49377c.CC.$default$a(this, aVar);
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.AbstractC49377c
        /* renamed from: a */
        public final void mo171425a(C49376b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "it");
            if (bVar.f123927d.isEmpty()) {
                SessionInvalidProcessor cVar = SessionInvalidProcessor.f163671a;
                Handler handler = SessionInvalidProcessor.f163675e;
                SessionInvalidProcessor cVar2 = SessionInvalidProcessor.f163671a;
                handler.removeCallbacks(SessionInvalidProcessor.f163674d);
                SessionInvalidProcessor cVar3 = SessionInvalidProcessor.f163671a;
                SessionInvalidProcessor.f163673c.set(false);
                SessionInvalidProcessor.m255037a("resolved", (Map) null, 2, (Object) null);
                SessionInvalidProcessor.m255032a(SessionInvalidProcessor.f163671a, "n_action_session_invalid", "no more users, reset", (Map) null, 4, (Object) null);
            }
        }
    }

    /* renamed from: a */
    private final int m255027a(LogoutReason logoutReason) {
        if (logoutReason != null) {
            int i = C64964d.f163694a[logoutReason.ordinal()];
            if (i == 1 || i == 2) {
                return R.string.Lark_Passport_DeleteAccount_AutoLogOutToast;
            }
            if (i == 3) {
                return R.string.Lark_Passport_DeleteAccount_TeamDisbandLogOutToast;
            }
            if (i != 4) {
                return 0;
            }
            return R.string.Lark_Passport_DeleteAccount_DeleteByTerminateToast;
        }
        return 0;
    }

    /* renamed from: c */
    private final void m255045c(String str) {
        if (f163673c.compareAndSet(false, true)) {
            m255032a(this, "n_action_session_invalid", "mark retry, msg: " + str, (Map) null, 4, (Object) null);
            return;
        }
        m255032a(this, "n_action_session_invalid", "mark retry already set, msg: " + str, (Map) null, 4, (Object) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessor$processForegroundUserInvalid$switchListener$1", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/OnUserSwitchListener;", "onUserSwitchSuccess", "", "context", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/UserSwitchSuccessContext;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.session.c$l */
    public static final class C64954l implements AbstractC49379a {

        /* renamed from: a */
        final /* synthetic */ String f163685a;

        /* renamed from: b */
        final /* synthetic */ User f163686b;

        /* renamed from: c */
        final /* synthetic */ LogoutReason f163687c;

        /* renamed from: d */
        final /* synthetic */ UniContext f163688d;

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
        /* renamed from: a */
        public /* synthetic */ void mo102549a(C49380b bVar) {
            AbstractC49379a.CC.$default$a(this, bVar);
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
        /* renamed from: a */
        public /* synthetic */ void mo102550a(C49381c cVar) {
            AbstractC49379a.CC.$default$a(this, cVar);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
        @DebugMetadata(mo239172c = "com.ss.lark.android.passport.biz.feature.session.SessionInvalidProcessor$processForegroundUserInvalid$switchListener$1$onUserSwitchSuccess$1", mo239173f = "SessionInvalidProcessor.kt", mo239174i = {0}, mo239175l = {589}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
        /* renamed from: com.ss.lark.android.passport.biz.feature.session.c$l$a */
        static final class C64955a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            private CoroutineScope p$;
            final /* synthetic */ C64954l this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C64955a(C64954l lVar, Continuation cVar) {
                super(2, cVar);
                this.this$0 = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                C64955a aVar = new C64955a(this.this$0, cVar);
                aVar.p$ = (CoroutineScope) obj;
                return aVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                return ((C64955a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object a = C69086a.m265828a();
                int i = this.label;
                if (i == 0) {
                    C69097g.m265891a(obj);
                    CoroutineScope ahVar = this.p$;
                    UniContext uniContext = this.this$0.f163688d;
                    this.L$0 = ahVar;
                    this.label = 1;
                    if (SessionInvalidProcessor.f163671a.mo223980b(null, CollectionsKt.listOf(TuplesKt.to(this.this$0.f163686b, this.this$0.f163687c)), uniContext, this) == a) {
                        return a;
                    }
                } else if (i == 1) {
                    CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                    C69097g.m265891a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return Unit.INSTANCE;
            }
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
        public void onUserSwitchSuccess(C49382d dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "context");
            if (!Intrinsics.areEqual(dVar.f123937c.userId, this.f163685a)) {
                SessionInvalidProcessor cVar = SessionInvalidProcessor.f163671a;
                Job unused = C69553g.m266944a(SessionInvalidProcessor.f163676f, null, null, new C64955a(this, null), 3, null);
            }
            UserSwitchListenerManager.m193650b(this);
            UserSwitchReason userSwitchReason = dVar.f123935a;
            Intrinsics.checkExpressionValueIsNotNull(userSwitchReason, "context.reason");
            Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("switch_reason", userSwitchReason.getDesc()));
            UniContext uniContext = this.f163688d;
            C40657x xVar = C40657x.f103231j;
            Intrinsics.checkExpressionValueIsNotNull(xVar, "EPMClientPassportMonitor…RONT_USER_END_SWITCH_SUCC");
            WatcherHelper.m193665a(uniContext, xVar, mutableMapOf);
        }

        C64954l(String str, User user, LogoutReason logoutReason, UniContext uniContext) {
            this.f163685a = str;
            this.f163686b = user;
            this.f163687c = logoutReason;
            this.f163688d = uniContext;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.lark.android.passport.biz.feature.session.SessionInvalidProcessor$processCheckStatusResp$5", mo239173f = "SessionInvalidProcessor.kt", mo239174i = {0}, mo239175l = {318}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.lark.android.passport.biz.feature.session.c$f */
    public static final class C64948f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Map $invalidUserWithReasonMap;
        final /* synthetic */ UniContext $uniContext;
        final /* synthetic */ List $unregisteredUsers;
        Object L$0;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64948f(List list, Map map, UniContext uniContext, Continuation cVar) {
            super(2, cVar);
            this.$unregisteredUsers = list;
            this.$invalidUserWithReasonMap = map;
            this.$uniContext = uniContext;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C64948f fVar = new C64948f(this.$unregisteredUsers, this.$invalidUserWithReasonMap, this.$uniContext, cVar);
            fVar.p$ = (CoroutineScope) obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C64948f) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                SessionInvalidProcessor.m255032a(SessionInvalidProcessor.f163671a, "n_action_session_invalid", "start process invalid users", (Map) null, 4, (Object) null);
                UniContext uniContext = this.$uniContext;
                this.L$0 = ahVar;
                this.label = 1;
                if (SessionInvalidProcessor.f163671a.mo223978a(this.$unregisteredUsers, MapsKt.toList(this.$invalidUserWithReasonMap), uniContext, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.lark.android.passport.biz.feature.session.SessionInvalidProcessor$cleanCacheIfResign$2", mo239173f = "SessionInvalidProcessor.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.lark.android.passport.biz.feature.session.c$a */
    public static final class C64942a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ User $user;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64942a(User user, Continuation cVar) {
            super(2, cVar);
            this.$user = user;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C64942a aVar = new C64942a(this.$user, cVar);
            aVar.p$ = (CoroutineScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C64942a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            String str;
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                long currentTimeMillis = System.currentTimeMillis();
                SessionInvalidProcessor.m255032a(SessionInvalidProcessor.f163671a, "n_action_session_invalid_resign_clean_cache", "clean cache start", (Map) null, 4, (Object) null);
                try {
                    Result.Companion aVar = Result.Companion;
                    UserSP userSPById = UserSP.getUserSPById(this.$user.userId);
                    if (userSPById != null) {
                        userSPById.cleanSharedPreference();
                    }
                    String str2 = this.$user.userId;
                    User foregroundUser = ServiceFinder.m193744a().getForegroundUser();
                    if (foregroundUser != null) {
                        str = foregroundUser.userId;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.areEqual(str2, str)) {
                        ServiceFinder.m193752g().cleanIMLoginUser();
                        ServiceFinder.m193752g().cleanDataOnResign();
                    }
                    C57849k.m224531d(LarkContext.getApplication());
                    C57849k.m224523a(LarkContext.getApplication());
                    C57849k.m224534g(LarkContext.getApplication());
                    obj2 = Result.m271569constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion aVar2 = Result.Companion;
                    obj2 = Result.m271569constructorimpl(C69097g.m265890a(th));
                }
                Throwable r11 = Result.m271572exceptionOrNullimpl(obj2);
                if (r11 != null) {
                    r11.printStackTrace();
                    SessionInvalidProcessor cVar = SessionInvalidProcessor.f163671a;
                    SessionInvalidProcessor.m255032a(cVar, "n_action_session_invalid_resign_clean_cache", "found exception while cleaning cache: " + r11, (Map) null, 4, (Object) null);
                }
                SessionInvalidProcessor cVar2 = SessionInvalidProcessor.f163671a;
                SessionInvalidProcessor.m255032a(cVar2, "n_action_session_invalid_resign_clean_cache", "clean cache finished, cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms", (Map) null, 4, (Object) null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: b */
    private final boolean m255042b(String str) {
        m255035a("n_action_session_invalid_invoked", "start", MapsKt.mutableMapOf(TuplesKt.to("reason", str)));
        if (ServiceFinder.m193744a().getAllValidUserList().isEmpty()) {
            m255035a("n_action_session_invalid_skip", "skip", MapsKt.mutableMapOf(TuplesKt.to("reason", "none_user")));
            return false;
        } else if (!ServiceFinder.m193748c().isNetworkAvailable()) {
            m255045c("network unavailable");
            m255035a("n_action_session_invalid_skip", "skip", MapsKt.mutableMapOf(TuplesKt.to("reason", "none_connect")));
            return false;
        } else if (f163672b.compareAndSet(false, true)) {
            return true;
        } else {
            m255035a("n_action_session_invalid_skip", "skip", MapsKt.mutableMapOf(TuplesKt.to("reason", "processing")));
            return false;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m255033a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "reason");
        UniContext f = WatcherUniContext.f123348l.mo171438f();
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("invoke_reason", str));
        C40657x xVar = C40657x.f103222a;
        Intrinsics.checkExpressionValueIsNotNull(xVar, "EPMClientPassportMonitor…ode.PROCESS_INVALID_START");
        WatcherHelper.m193665a(f, xVar, mutableMapOf);
        SessionInvalidProcessor cVar = f163671a;
        if (cVar.m255042b(str)) {
            m255032a(cVar, "n_action_session_invalid_start", "start", (Map) null, 4, (Object) null);
            IUserListService a = ServiceFinder.m193744a();
            List<User> allUserList = a.getAllUserList();
            Intrinsics.checkExpressionValueIsNotNull(allUserList, "service.allUserList");
            StringBuilder sb = new StringBuilder();
            sb.append("local users: ");
            List<User> list = allUserList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().userId);
            }
            sb.append(arrayList);
            m255032a(cVar, "n_action_session_invalid", sb.toString(), (Map) null, 4, (Object) null);
            SessionInvalidProcessor cVar2 = f163671a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("local valid users: ");
            List<User> allValidUserList = a.getAllValidUserList();
            Intrinsics.checkExpressionValueIsNotNull(allValidUserList, "service.allValidUserList");
            List<User> list2 = allValidUserList;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().userId);
            }
            sb2.append(arrayList2);
            m255032a(cVar2, "n_action_session_invalid", sb2.toString(), (Map) null, 4, (Object) null);
            m255032a(f163671a, "n_action_session_invalid_check_session", "start", (Map) null, 4, (Object) null);
            C40657x xVar2 = C40657x.f103223b;
            Intrinsics.checkExpressionValueIsNotNull(xVar2, "EPMClientPassportMonitor…HECK_STATUS_REQUEST_START");
            WatcherHelper.m193666a(f, xVar2, null, 4, null);
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList3.add(it3.next().userId);
            }
            FeatureCApi.m253704a((List<String>) arrayList3, false, (ICallback<CheckStatusResp>) new C64944c(f, allUserList));
        }
    }

    /* renamed from: b */
    private final List<User> m255040b(List<? extends User> list, Map<String, Integer> map) {
        String str;
        User foregroundUser = ServiceFinder.m193744a().getForegroundUser();
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            String str2 = t.userId;
            if (foregroundUser != null) {
                str = foregroundUser.userId;
            } else {
                str = null;
            }
            if (!Intrinsics.areEqual(str2, str)) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!map.containsKey(((User) obj).userId)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    private final Map<User, LogoutReason> m255028a(List<? extends User> list, Map<String, ? extends CheckStatusResp.SessionStatus> map) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            String session = next.getSession();
            if (session == null || StringsKt.isBlank(session)) {
                z2 = true;
            }
            if (!z2) {
                arrayList.add(next);
            }
        }
        ArrayList<User> arrayList2 = arrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
        for (User user : arrayList2) {
            linkedHashMap.put(user, (CheckStatusResp.SessionStatus) map.get(user.getSession()));
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (entry.getValue() == null) {
                m255031a(f163671a, "n_action_session_invalid_check_result", "user: " + ((User) entry.getKey()).userId + ", session: " + C49160a.m193857b(((User) entry.getKey()).getSession()) + " not in session map", (Throwable) null, 4, (Object) null);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            CheckStatusResp.SessionStatus sessionStatus = (CheckStatusResp.SessionStatus) entry2.getValue();
            if (sessionStatus == null || sessionStatus.isLogged()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap3 = linkedHashMap2;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap3.size()));
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            Object key = entry3.getKey();
            CheckStatusResp.SessionStatus sessionStatus2 = (CheckStatusResp.SessionStatus) entry3.getValue();
            Integer num = null;
            LogoutReason logoutReasonEnum = sessionStatus2 != null ? sessionStatus2.getLogoutReasonEnum() : null;
            if (logoutReasonEnum == null) {
                SessionInvalidProcessor cVar = f163671a;
                StringBuilder sb = new StringBuilder();
                sb.append("user: ");
                sb.append(((User) entry3.getKey()).userId);
                sb.append(", logout reason: ");
                if (sessionStatus2 != null) {
                    num = Integer.valueOf(sessionStatus2.getLogoutReason());
                }
                sb.append(num);
                sb.append(" not recorded");
                m255031a(cVar, "n_action_session_invalid_check_result", sb.toString(), (Throwable) null, 4, (Object) null);
            }
            linkedHashMap4.put(key, logoutReasonEnum);
        }
        return linkedHashMap4;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m255036a(String str, Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(str, "reason");
        if (f163672b.compareAndSet(true, false)) {
            Map<String, String> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("reason", str));
            if (map != null) {
                mutableMapOf.putAll(map);
            }
            f163671a.m255035a("n_action_session_invalid_end", "session invalid process end", mutableMapOf);
        }
    }

    /* renamed from: a */
    private final void m255034a(String str, String str2, Throwable th) {
        f163677g.mo171462a(str, str2, th);
    }

    /* renamed from: a */
    private final void m255035a(String str, String str2, Map<String, String> map) {
        f163677g.mo171467b(str, str2, C69121n.m265993j(map));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.ss.android.lark.passport.infra.service.IUserListService */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x020c A[LOOP:4: B:54:0x0206->B:56:0x020c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo223980b(java.util.Collection<? extends com.ss.android.lark.passport.signinsdk_api.account.User> r21, java.util.Collection<? extends kotlin.Pair<? extends com.ss.android.lark.passport.signinsdk_api.account.User, ? extends com.ss.lark.android.passport.biz.feature.constants.LogoutReason>> r22, com.ss.android.lark.passport.signinsdk_api.base.log.UniContext r23, kotlin.coroutines.Continuation<? super kotlin.Unit> r24) {
        /*
        // Method dump skipped, instructions count: 573
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.lark.android.passport.biz.feature.session.SessionInvalidProcessor.mo223980b(java.util.Collection, java.util.Collection, com.ss.android.lark.passport.signinsdk_api.base.log.UniContext, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: a */
    static /* synthetic */ void m255031a(SessionInvalidProcessor cVar, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        cVar.m255034a(str, str2, th);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.lark.android.passport.biz.feature.session.c */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static /* synthetic */ void m255032a(SessionInvalidProcessor cVar, String str, String str2, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        cVar.m255035a(str, str2, map);
    }
}
