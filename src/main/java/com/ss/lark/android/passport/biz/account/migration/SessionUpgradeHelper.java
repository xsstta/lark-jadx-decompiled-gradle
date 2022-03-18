package com.ss.lark.android.passport.biz.account.migration;

import android.os.Handler;
import android.os.Looper;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.p2069j.p2070a.C40659z;
import com.ss.android.lark.passport.infra.listenermanage.LoginListenerManager;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49148ac;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.infra.watcher.WatcherUniContext;
import com.ss.android.lark.passport.signinsdk_api.account.ResponseUser;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.utils.LarkContext;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.EnterAppStep;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import com.ss.lark.android.passport.biz.service.impl.OffLineLogoutService;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u00011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010&\u001a\u00020\u00132\b\u0010'\u001a\u0004\u0018\u00010\tH\u0002J\u0006\u0010(\u001a\u00020\u0013J\u0012\u0010)\u001a\u00020\u00132\b\u0010*\u001a\u0004\u0018\u00010+H\u0002J \u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020!2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0002J\b\u0010/\u001a\u00020\u0013H\u0002J\u0006\u00100\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R4\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R4\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R4\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u000e\u0010\u001f\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/lark/android/passport/biz/account/migration/SessionUpgradeHelper;", "", "()V", "REDIRECT_UPGRADE_TIMEOUT", "", "RETRY_COUNT_LIMIT", "", "RETRY_REMAIN_TIME_THRESHOLD", "TAG", "", "UPGRADE_TIMEOUT", "cancelable", "Lcom/ss/android/lark/passport/signinsdk_api/base/ICancelable;", "handler", "Landroid/os/Handler;", "logger", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "value", "Lkotlin/Function0;", "", "onCancel", "getOnCancel$passport_biz_release", "()Lkotlin/jvm/functions/Function0;", "setOnCancel$passport_biz_release", "(Lkotlin/jvm/functions/Function0;)V", "onError", "getOnError$passport_biz_release", "setOnError$passport_biz_release", "onSuccess", "getOnSuccess$passport_biz_release", "setOnSuccess$passport_biz_release", "retryCount", "state", "Lcom/ss/lark/android/passport/biz/account/migration/SessionUpgradeHelper$State;", "timeout", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "upgradeStartTimestamp", "addUserIntoOfflineLogoutTask", "logoutToken", "clearListener", "doLogout", "user", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "invokeIfAtState", "targetState", "callback", "realUpgrade", "upgrade", "State", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SessionUpgradeHelper {

    /* renamed from: a */
    public static final SessionUpgradeHelper f162547a = new SessionUpgradeHelper();

    /* renamed from: b */
    private static Function0<Unit> f162548b;

    /* renamed from: c */
    private static Function0<Unit> f162549c;

    /* renamed from: d */
    private static Function0<Unit> f162550d;

    /* renamed from: e */
    private static final PassportLog f162551e = PassportLog.f123351c.mo171474a();

    /* renamed from: f */
    private static AbstractC49347c f162552f;

    /* renamed from: g */
    private static final Handler f162553g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    private static State f162554h = State.Initialized;

    /* renamed from: i */
    private static int f162555i;

    /* renamed from: j */
    private static long f162556j;

    /* renamed from: k */
    private static final UniContext f162557k = WatcherUniContext.f123348l.mo171433a();

    /* renamed from: l */
    private static final long f162558l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ss/lark/android/passport/biz/account/migration/SessionUpgradeHelper$State;", "", "(Ljava/lang/String;I)V", "Initialized", "Upgrading", "Succeed", "Failed", "Cancelled", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum State {
        Initialized,
        Upgrading,
        Succeed,
        Failed,
        Cancelled
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/lark/android/passport/biz/account/migration/SessionUpgradeHelper$realUpgrade$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/lark/android/passport/biz/compat/v2/featurec/network/responese/EnterAppStep;", "getConvertType", "Ljava/lang/reflect/Type;", "onError", "", "networkErrorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.account.migration.SessionUpgradeHelper$a */
    public static final class C64321a implements ICallback<EnterAppStep> {
        C64321a() {
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public Type mo101474a() {
            return EnterAppStep.class;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.account.migration.SessionUpgradeHelper$a$a */
        static final class RunnableC64322a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ List f162559a;

            /* renamed from: b */
            final /* synthetic */ User f162560b;

            RunnableC64322a(List list, User user) {
                this.f162559a = list;
                this.f162560b = user;
            }

            public final void run() {
                LoginListenerManager.m193627a(false, this.f162559a, this.f162560b);
                ServiceFinder.m193748c().clearCookies();
                ServiceFinder.m193748c().saveSessionToCookies(this.f162560b.getSession(), this.f162560b.getSessionWithDomainMap());
                C49148ac.m193806a(RunnableC643231.f162561a);
            }
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101475a(NetworkErrorResult networkErrorResult) {
            Intrinsics.checkParameterIsNotNull(networkErrorResult, "networkErrorResult");
            SessionUpgradeHelper sessionUpgradeHelper = SessionUpgradeHelper.f162547a;
            long j = SessionUpgradeHelper.f162556j;
            SessionUpgradeHelper sessionUpgradeHelper2 = SessionUpgradeHelper.f162547a;
            long currentTimeMillis = (j + SessionUpgradeHelper.f162558l) - System.currentTimeMillis();
            SessionUpgradeHelper sessionUpgradeHelper3 = SessionUpgradeHelper.f162547a;
            PassportLog passportLog = SessionUpgradeHelper.f162551e;
            StringBuilder sb = new StringBuilder();
            sb.append("upgrade failed, retry remain time: ");
            sb.append(currentTimeMillis);
            sb.append(", retry count: ");
            SessionUpgradeHelper sessionUpgradeHelper4 = SessionUpgradeHelper.f162547a;
            sb.append(SessionUpgradeHelper.f162555i);
            passportLog.mo171471d("n_action_upgrade_session", sb.toString());
            if (currentTimeMillis >= 0) {
                SessionUpgradeHelper sessionUpgradeHelper5 = SessionUpgradeHelper.f162547a;
                if (SessionUpgradeHelper.f162555i < 1) {
                    SessionUpgradeHelper sessionUpgradeHelper6 = SessionUpgradeHelper.f162547a;
                    SessionUpgradeHelper.f162551e.mo171465b("n_action_upgrade_session", "upgrade failed, retry");
                    SessionUpgradeHelper sessionUpgradeHelper7 = SessionUpgradeHelper.f162547a;
                    SessionUpgradeHelper.f162555i++;
                    SessionUpgradeHelper.f162547a.mo222795f();
                    return;
                }
            }
            SessionUpgradeHelper sessionUpgradeHelper8 = SessionUpgradeHelper.f162547a;
            SessionUpgradeHelper.f162551e.mo171471d("n_action_upgrade_session", "upgrade failed");
            SessionUpgradeHelper sessionUpgradeHelper9 = SessionUpgradeHelper.f162547a;
            SessionUpgradeHelper.f162554h = State.Failed;
            SessionUpgradeHelper sessionUpgradeHelper10 = SessionUpgradeHelper.f162547a;
            SessionUpgradeHelper.f162553g.removeCallbacksAndMessages(null);
            SessionUpgradeHelper sessionUpgradeHelper11 = SessionUpgradeHelper.f162547a;
            UniContext uniContext = SessionUpgradeHelper.f162557k;
            C40659z zVar = C40659z.f103254d;
            Intrinsics.checkExpressionValueIsNotNull(zVar, "EPMClientPassportMonitor….UPGRADE_SESSION_END_FAIL");
            SessionUpgradeHelper sessionUpgradeHelper12 = SessionUpgradeHelper.f162547a;
            WatcherHelper.m193665a(uniContext, zVar, MapsKt.mutableMapOf(TuplesKt.to("retry_count", String.valueOf(SessionUpgradeHelper.f162555i))));
            SessionUpgradeHelper.f162547a.mo222787a(ServiceFinder.m193744a().getForegroundUser());
            Function0<Unit> b = SessionUpgradeHelper.f162547a.mo222789b();
            if (b != null) {
                b.invoke();
            }
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101476a(ResponseModel<EnterAppStep> responseModel) {
            ArrayList arrayList;
            boolean z;
            boolean z2;
            Object obj;
            List<ResponseUser> list;
            User user;
            Intrinsics.checkParameterIsNotNull(responseModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            EnterAppStep data = responseModel.getData();
            if (data == null || (list = data.userList) == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (T t : list) {
                    if (t == null || (user = t.getUser()) == null) {
                        user = null;
                    } else {
                        user.mergeWithResponseUser(t);
                    }
                    if (user != null) {
                        arrayList2.add(user);
                    }
                }
                arrayList = arrayList2;
            }
            User foregroundUser = ServiceFinder.m193744a().getForegroundUser();
            List list2 = arrayList;
            boolean z3 = false;
            if (list2 == null || list2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z || foregroundUser == null) {
                SessionUpgradeHelper sessionUpgradeHelper = SessionUpgradeHelper.f162547a;
                PassportLog passportLog = SessionUpgradeHelper.f162551e;
                StringBuilder sb = new StringBuilder();
                sb.append("resp users is empty? ");
                if (list2 == null || list2.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sb.append(z2);
                sb.append(", old foreground user is null? ");
                if (foregroundUser == null) {
                    z3 = true;
                }
                sb.append(z3);
                passportLog.mo171471d("n_action_upgrade_session", sb.toString());
            } else {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual(((User) obj).userId, foregroundUser.userId)) {
                        break;
                    }
                }
                User user2 = (User) obj;
                if (user2 != null) {
                    SessionUpgradeHelper sessionUpgradeHelper2 = SessionUpgradeHelper.f162547a;
                    SessionUpgradeHelper.f162551e.mo171465b("n_action_upgrade_session", "upgrade success, current foreground user: " + user2.userId);
                    SessionUpgradeHelper sessionUpgradeHelper3 = SessionUpgradeHelper.f162547a;
                    SessionUpgradeHelper.f162553g.removeCallbacksAndMessages(null);
                    SessionUpgradeHelper.f162547a.mo222787a(foregroundUser);
                    C49148ac.m193808b(new RunnableC64322a(arrayList, user2));
                    SessionUpgradeHelper sessionUpgradeHelper4 = SessionUpgradeHelper.f162547a;
                    UniContext uniContext = SessionUpgradeHelper.f162557k;
                    C40659z zVar = C40659z.f103253c;
                    Intrinsics.checkExpressionValueIsNotNull(zVar, "EPMClientPassportMonitor….UPGRADE_SESSION_END_SUCC");
                    SessionUpgradeHelper sessionUpgradeHelper5 = SessionUpgradeHelper.f162547a;
                    WatcherHelper.m193665a(uniContext, zVar, MapsKt.mutableMapOf(TuplesKt.to("retry_count", String.valueOf(SessionUpgradeHelper.f162555i))));
                    return;
                }
                SessionUpgradeHelper sessionUpgradeHelper6 = SessionUpgradeHelper.f162547a;
                SessionUpgradeHelper.f162551e.mo171471d("n_action_upgrade_session", "resp doesn't contain foreground user");
            }
            mo101475a(new NetworkErrorResult(-1, "upgrade session request success, but biz failed"));
        }
    }

    private SessionUpgradeHelper() {
    }

    /* renamed from: b */
    public final Function0<Unit> mo222789b() {
        return f162549c;
    }

    /* renamed from: c */
    public final Function0<Unit> mo222791c() {
        return f162550d;
    }

    /* renamed from: d */
    public final void mo222793d() {
        Function0<Unit> function0 = null;
        mo222788a(function0);
        mo222790b(function0);
        mo222792c(function0);
    }

    /* renamed from: f */
    public final void mo222795f() {
        f162552f = FeatureCApi.Upgrade.m253729a(new C64321a());
    }

    static {
        long j;
        if (ServiceFinder.m193749d().isBuildinEnv()) {
            j = 5000;
        } else {
            j = 8000;
        }
        f162558l = j;
    }

    /* renamed from: a */
    public final Function0<Unit> mo222786a() {
        return f162548b;
    }

    /* renamed from: e */
    public final void mo222794e() {
        if (f162554h != State.Initialized) {
            PassportLog passportLog = f162551e;
            passportLog.mo171471d("n_action_upgrade_session", "in state: " + f162554h + ", skip");
            return;
        }
        f162553g.postDelayed(RunnableC64324b.f162562a, f162558l);
        f162554h = State.Upgrading;
        f162556j = System.currentTimeMillis();
        PassportLog passportLog2 = f162551e;
        passportLog2.mo171465b("n_action_upgrade_session", "begin upgrade, at: " + f162556j);
        mo222795f();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.account.migration.SessionUpgradeHelper$b */
    public static final class RunnableC64324b implements Runnable {

        /* renamed from: a */
        public static final RunnableC64324b f162562a = new RunnableC64324b();

        RunnableC64324b() {
        }

        public final void run() {
            SessionUpgradeHelper sessionUpgradeHelper = SessionUpgradeHelper.f162547a;
            if (SessionUpgradeHelper.f162554h == State.Upgrading) {
                SessionUpgradeHelper sessionUpgradeHelper2 = SessionUpgradeHelper.f162547a;
                AbstractC49347c cVar = SessionUpgradeHelper.f162552f;
                if (cVar != null) {
                    cVar.mo171123a();
                }
                SessionUpgradeHelper.f162547a.mo222787a(ServiceFinder.m193744a().getForegroundUser());
                SessionUpgradeHelper sessionUpgradeHelper3 = SessionUpgradeHelper.f162547a;
                SessionUpgradeHelper.f162554h = State.Cancelled;
                SessionUpgradeHelper sessionUpgradeHelper4 = SessionUpgradeHelper.f162547a;
                UniContext uniContext = SessionUpgradeHelper.f162557k;
                C40659z zVar = C40659z.f103254d;
                Intrinsics.checkExpressionValueIsNotNull(zVar, "EPMClientPassportMonitor….UPGRADE_SESSION_END_FAIL");
                SessionUpgradeHelper sessionUpgradeHelper5 = SessionUpgradeHelper.f162547a;
                WatcherHelper.m193665a(uniContext, zVar, MapsKt.mutableMapOf(TuplesKt.to("retry_count", String.valueOf(SessionUpgradeHelper.f162555i))));
                Function0<Unit> c = SessionUpgradeHelper.f162547a.mo222791c();
                if (c != null) {
                    c.invoke();
                }
                SessionUpgradeHelper sessionUpgradeHelper6 = SessionUpgradeHelper.f162547a;
                SessionUpgradeHelper.f162551e.mo171468c("n_action_upgrade_session", "upgrade timeout, cancel");
                return;
            }
            SessionUpgradeHelper sessionUpgradeHelper7 = SessionUpgradeHelper.f162547a;
            PassportLog passportLog = SessionUpgradeHelper.f162551e;
            StringBuilder sb = new StringBuilder();
            sb.append("upgrade timeout, illegal state: ");
            SessionUpgradeHelper sessionUpgradeHelper8 = SessionUpgradeHelper.f162547a;
            sb.append(SessionUpgradeHelper.f162554h);
            sb.append(", expect: ");
            sb.append(State.Upgrading);
            passportLog.mo171471d("n_action_upgrade_session", sb.toString());
            if (C26284k.m95186b(LarkContext.getApplication())) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("upgrade timeout, illegal state: ");
                SessionUpgradeHelper sessionUpgradeHelper9 = SessionUpgradeHelper.f162547a;
                sb2.append(SessionUpgradeHelper.f162554h);
                sb2.append(", expect: ");
                sb2.append(State.Upgrading);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    /* renamed from: b */
    public final void mo222790b(Function0<Unit> function0) {
        f162549c = function0;
        m252882a(State.Failed, function0);
    }

    /* renamed from: c */
    public final void mo222792c(Function0<Unit> function0) {
        f162550d = function0;
        m252882a(State.Cancelled, function0);
    }

    /* renamed from: a */
    private final void m252885a(String str) {
        boolean z;
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            f162551e.mo171465b("n_action_upgrade_session", "append logout token to task");
            OffLineLogoutService.f164281a.mo224473a(CollectionsKt.listOf(str));
            return;
        }
        f162551e.mo171471d("n_action_upgrade_session", "append logout token to task, but token is empty");
    }

    /* renamed from: a */
    public final void mo222787a(User user) {
        if (user != null) {
            m252885a(user.getLogoutToken());
        } else {
            f162551e.mo171471d("n_action_upgrade_session", "do logout, but user is null");
        }
    }

    /* renamed from: a */
    public final void mo222788a(Function0<Unit> function0) {
        f162548b = function0;
        m252882a(State.Succeed, function0);
    }

    /* renamed from: a */
    private final void m252882a(State state, Function0<Unit> function0) {
        if (f162554h == state && function0 != null) {
            function0.invoke();
        }
    }
}
