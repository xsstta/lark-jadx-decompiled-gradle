package com.ss.lark.android.passport.biz.feature.session;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.listenermanage.LogoutListenerManager;
import com.ss.android.lark.passport.infra.listenermanage.UserSwitchListenerManager;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.EmptyActivityLifecycleCallbacks;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.AbstractC49377c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.C49375a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.C49376b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.utils.LarkContext;
import com.ss.lark.android.passport.biz.feature.account_center.AccountCenterActivity;
import com.ss.lark.android.passport.biz.feature.create_team.CreateTeamActivity;
import com.ss.lark.android.passport.biz.feature.join_team.join_way.TenantJoinWayActivity;
import com.ss.lark.android.passport.biz.feature.login_input.LoginInputActivity;
import com.ss.lark.android.passport.biz.feature.setname.SetNameActivity;
import com.ss.lark.android.passport.biz.feature.switch_user.SwitchNextValidFlagActivity;
import com.ss.lark.android.passport.biz.feature.user_info.SetUserInfoActivity;
import com.ss.lark.android.passport.biz.router.ShowDialogAction;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002!\"B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\tH\u0002J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\tH\u0002J\b\u0010\u001f\u001a\u00020\u0017H\u0002J\b\u0010 \u001a\u00020\u0017H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R7\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006#"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessBlocker;", "", "()V", "DELAY_DISABLE_BLOCK", "", "blocking", "", "blockingInfo", "Lkotlin/Pair;", "Lcom/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessBlocker$BlockReason;", "getBlockingInfo", "()Lkotlin/Pair;", "blockingReason", "flagHelper", "Lcom/ss/lark/android/passport/biz/feature/session/BitFlagHelper;", "handler", "Landroid/os/Handler;", "logger", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "onBlockChangeListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "getOnBlockChangeListener$passport_biz_release", "()Lkotlin/jvm/functions/Function1;", "setOnBlockChangeListener$passport_biz_release", "(Lkotlin/jvm/functions/Function1;)V", "disableBlock", "reason", "enableBlock", "registerActivityBlockFlag", "registerListenersForBlock", "ActivityBlockFlagHelper", "BlockReason", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.session.b */
public final class SessionInvalidProcessBlocker {

    /* renamed from: a */
    public static final SessionInvalidProcessBlocker f163656a;

    /* renamed from: b */
    private static volatile boolean f163657b;

    /* renamed from: c */
    private static volatile BlockReason f163658c;

    /* renamed from: d */
    private static final Handler f163659d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private static final BitFlagHelper f163660e;

    /* renamed from: f */
    private static final PassportLog f163661f = PassportLog.f123351c.mo171474a();

    /* renamed from: g */
    private static Function1<? super Boolean, Unit> f163662g;

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005H\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0006H\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0006H\u0016J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0006H\u0016J\u0016\u0010\u0016\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005R.\u0010\u0003\u001a\"\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u0004j\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005`\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessBlocker$ActivityBlockFlagHelper;", "Lcom/ss/android/lark/passport/infra/util/EmptyActivityLifecycleCallbacks;", "()V", "registeredActivities", "Ljava/util/LinkedHashSet;", "Ljava/lang/Class;", "Landroid/app/Activity;", "Lkotlin/collections/LinkedHashSet;", "bitOff", "", "clazz", "reason", "", "bitOn", "isRegisteredKey", "", "key", "", "onActivityDestroyed", "activity", "onActivityStarted", "onActivityStopped", "register", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.session.b$a */
    public static final class ActivityBlockFlagHelper extends EmptyActivityLifecycleCallbacks {

        /* renamed from: a */
        public static final ActivityBlockFlagHelper f163663a;

        /* renamed from: b */
        private static final LinkedHashSet<Class<? extends Activity>> f163664b = new LinkedHashSet<>();

        private ActivityBlockFlagHelper() {
        }

        static {
            ActivityBlockFlagHelper aVar = new ActivityBlockFlagHelper();
            f163663a = aVar;
            LarkContext.getApplication().registerActivityLifecycleCallbacks(aVar);
        }

        /* renamed from: a */
        public final void mo223968a(Class<? extends Activity> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "clazz");
            f163664b.add(cls);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.lark.android.passport.biz.feature.session.b$a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ss.android.lark.passport.infra.util.EmptyActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            super.onActivityStarted(activity);
            m255019b(activity.getClass());
        }

        /* renamed from: a */
        public final boolean mo223969a(Object obj) {
            Intrinsics.checkParameterIsNotNull(obj, "key");
            return CollectionsKt.contains(f163664b, obj);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.lark.android.passport.biz.feature.session.b$a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ss.android.lark.passport.infra.util.EmptyActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            super.onActivityDestroyed(activity);
            if (activity.isFinishing()) {
                m255018a(activity.getClass(), "destroyed");
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.lark.android.passport.biz.feature.session.b$a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ss.android.lark.passport.infra.util.EmptyActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            super.onActivityStopped(activity);
            if (activity.isFinishing()) {
                m255018a(activity.getClass(), "stopped");
            }
        }

        /* renamed from: b */
        private final void m255019b(Class<? extends Activity> cls) {
            if (f163664b.contains(cls)) {
                SessionInvalidProcessBlocker bVar = SessionInvalidProcessBlocker.f163656a;
                SessionInvalidProcessBlocker.f163660e.mo223961a(cls);
                Log.m165389i("n_action_session_invalid_blocker", "bits on, " + cls.getSimpleName());
            }
        }

        /* renamed from: a */
        private final void m255018a(Class<? extends Activity> cls, String str) {
            if (f163664b.contains(cls)) {
                SessionInvalidProcessBlocker bVar = SessionInvalidProcessBlocker.f163656a;
                SessionInvalidProcessBlocker.f163660e.mo223962b(cls);
                Log.m165389i("n_action_session_invalid_blocker", "bits off, " + cls.getSimpleName() + ": " + str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u001b\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\u0003H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u0001\u0005\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessBlocker$BlockReason;", "", "value", "", "extra", "(Ljava/lang/String;Ljava/lang/String;)V", "getExtra", "()Ljava/lang/String;", "getValue", "toString", "Activity", "DialogShowing", "Logout", "Switch", "Unknown", "Lcom/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessBlocker$BlockReason$Switch;", "Lcom/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessBlocker$BlockReason$DialogShowing;", "Lcom/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessBlocker$BlockReason$Logout;", "Lcom/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessBlocker$BlockReason$Activity;", "Lcom/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessBlocker$BlockReason$Unknown;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.session.b$b */
    public static abstract class BlockReason {

        /* renamed from: a */
        private final String f163665a;

        /* renamed from: b */
        private final String f163666b;

        /* renamed from: a */
        public final String mo223970a() {
            return this.f163665a;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessBlocker$BlockReason$Logout;", "Lcom/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessBlocker$BlockReason;", "()V", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.feature.session.b$b$c */
        public static final class Logout extends BlockReason {

            /* renamed from: a */
            public static final Logout f163668a = new Logout();

            private Logout() {
                super("logout", null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessBlocker$BlockReason$DialogShowing;", "Lcom/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessBlocker$BlockReason;", "()V", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.feature.session.b$b$b */
        public static final class DialogShowing extends BlockReason {

            /* renamed from: a */
            public static final DialogShowing f163667a = new DialogShowing();

            private DialogShowing() {
                super("switch", "dialog showing", null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessBlocker$BlockReason$Switch;", "Lcom/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessBlocker$BlockReason;", "()V", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.feature.session.b$b$d */
        public static final class Switch extends BlockReason {

            /* renamed from: a */
            public static final Switch f163669a = new Switch();

            private Switch() {
                super("switch", "user", null);
            }
        }

        public String toString() {
            boolean z;
            String str = this.f163666b;
            if (str == null || StringsKt.isBlank(str)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return this.f163665a;
            }
            return this.f163665a + '_' + this.f163666b;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessBlocker$BlockReason$Activity;", "Lcom/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessBlocker$BlockReason;", "key", "", "(Ljava/lang/String;)V", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.feature.session.b$b$a */
        public static final class Activity extends BlockReason {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Activity(String str) {
                super("view", str, null);
                Intrinsics.checkParameterIsNotNull(str, "key");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessBlocker$BlockReason$Unknown;", "Lcom/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessBlocker$BlockReason;", "key", "", "(Ljava/lang/String;)V", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.feature.session.b$b$e */
        public static final class Unknown extends BlockReason {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Unknown(String str) {
                super("unknown", str, null);
                Intrinsics.checkParameterIsNotNull(str, "key");
            }
        }

        private BlockReason(String str, String str2) {
            this.f163665a = str;
            this.f163666b = str2;
        }

        public /* synthetic */ BlockReason(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ BlockReason(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessBlocker$registerListenersForBlock$1", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/OnUserSwitchListener;", "onUserSwitchBegin", "", "context", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/UserSwitchBeginContext;", "onUserSwitchFailed", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/UserSwitchFailedContext;", "onUserSwitchSuccess", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/UserSwitchSuccessContext;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.session.b$c */
    public static final class C64938c implements AbstractC49379a {
        C64938c() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.feature.session.b$c$a */
        static final class RunnableC64939a implements Runnable {

            /* renamed from: a */
            public static final RunnableC64939a f163670a = new RunnableC64939a();

            RunnableC64939a() {
            }

            public final void run() {
                SessionInvalidProcessBlocker bVar = SessionInvalidProcessBlocker.f163656a;
                SessionInvalidProcessBlocker.f163660e.mo223962b(BlockReason.Switch.f163669a);
            }
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
        /* renamed from: a */
        public void mo102549a(C49380b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "context");
            SessionInvalidProcessBlocker bVar2 = SessionInvalidProcessBlocker.f163656a;
            SessionInvalidProcessBlocker.f163660e.mo223961a(BlockReason.Switch.f163669a);
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
        public void onUserSwitchSuccess(C49382d dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "context");
            SessionInvalidProcessBlocker bVar = SessionInvalidProcessBlocker.f163656a;
            SessionInvalidProcessBlocker.f163660e.mo223962b(BlockReason.Switch.f163669a);
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
        /* renamed from: a */
        public void mo102550a(C49381c cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "context");
            ErrorResult errorResult = cVar.f123934b;
            if (errorResult == null || errorResult.getErrorCode() != -100) {
                SessionInvalidProcessBlocker bVar = SessionInvalidProcessBlocker.f163656a;
                SessionInvalidProcessBlocker.f163659d.postDelayed(RunnableC64939a.f163670a, 2000);
                return;
            }
            SessionInvalidProcessBlocker bVar2 = SessionInvalidProcessBlocker.f163656a;
            SessionInvalidProcessBlocker.f163660e.mo223962b(BlockReason.Switch.f163669a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/lark/android/passport/biz/feature/session/SessionInvalidProcessBlocker$registerListenersForBlock$3", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/logout/OnLogoutListener;", "onLogoutBegin", "", "context", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/logout/LogoutBeginContext;", "onLogoutEnd", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/logout/LogoutEndContext;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.session.b$e */
    public static final class C64941e implements AbstractC49377c {
        C64941e() {
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.AbstractC49377c
        /* renamed from: a */
        public void mo171424a(C49375a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "context");
            SessionInvalidProcessBlocker bVar = SessionInvalidProcessBlocker.f163656a;
            SessionInvalidProcessBlocker.f163660e.mo223961a(BlockReason.Logout.f163668a);
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.AbstractC49377c
        /* renamed from: a */
        public void mo171425a(C49376b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "context");
            SessionInvalidProcessBlocker bVar2 = SessionInvalidProcessBlocker.f163656a;
            SessionInvalidProcessBlocker.f163660e.mo223962b(BlockReason.Logout.f163668a);
        }
    }

    private SessionInvalidProcessBlocker() {
    }

    /* renamed from: c */
    private final void m255013c() {
        UserSwitchListenerManager.m193648a(new C64938c());
        ShowDialogAction.m255992a(C64940d.INSTANCE);
        LogoutListenerManager.m193633a(new C64941e());
    }

    /* renamed from: a */
    public final synchronized Pair<Boolean, BlockReason> mo223963a() {
        return TuplesKt.to(Boolean.valueOf(f163657b), f163658c);
    }

    static {
        SessionInvalidProcessBlocker bVar = new SessionInvalidProcessBlocker();
        f163656a = bVar;
        BitFlagHelper aVar = new BitFlagHelper();
        f163660e = aVar;
        bVar.m255012b();
        bVar.m255013c();
        aVar.mo223959a((Function2<? super Boolean, Object, Unit>) C649371.INSTANCE);
    }

    /* renamed from: b */
    private final void m255012b() {
        ActivityBlockFlagHelper.f163663a.mo223968a(AccountCenterActivity.class);
        ActivityBlockFlagHelper.f163663a.mo223968a(TenantJoinWayActivity.class);
        ActivityBlockFlagHelper.f163663a.mo223968a(CreateTeamActivity.class);
        ActivityBlockFlagHelper.f163663a.mo223968a(SetUserInfoActivity.class);
        ActivityBlockFlagHelper.f163663a.mo223968a(LoginInputActivity.class);
        ActivityBlockFlagHelper.f163663a.mo223968a(SetNameActivity.class);
        ActivityBlockFlagHelper.f163663a.mo223968a(SwitchNextValidFlagActivity.class);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.session.b$d */
    public static final class C64940d extends Lambda implements Function1<Boolean, Unit> {
        public static final C64940d INSTANCE = new C64940d();

        C64940d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool);
            return Unit.INSTANCE;
        }

        public final void invoke(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                SessionInvalidProcessBlocker bVar = SessionInvalidProcessBlocker.f163656a;
                SessionInvalidProcessBlocker.f163660e.mo223961a(BlockReason.DialogShowing.f163667a);
                return;
            }
            SessionInvalidProcessBlocker bVar2 = SessionInvalidProcessBlocker.f163656a;
            SessionInvalidProcessBlocker.f163660e.mo223962b(BlockReason.DialogShowing.f163667a);
        }
    }

    /* renamed from: a */
    public final void mo223965a(Function1<? super Boolean, Unit> function1) {
        f163662g = function1;
    }

    /* renamed from: a */
    public final void mo223964a(BlockReason bVar) {
        f163659d.removeCallbacksAndMessages(null);
        synchronized (this) {
            if (!f163657b) {
                f163657b = true;
                f163658c = bVar;
                f163661f.mo171467b("n_action_session_invalid_blocker", "enable block", MapsKt.mutableMapOf(TuplesKt.to("reason", bVar.mo223970a())));
                Function1<? super Boolean, Unit> function1 = f163662g;
                if (function1 != null) {
                    function1.invoke(true);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: b */
    public final void mo223966b(BlockReason bVar) {
        f163659d.removeCallbacksAndMessages(null);
        synchronized (this) {
            if (f163657b) {
                f163657b = false;
                f163658c = null;
                f163661f.mo171467b("n_action_session_invalid_blocker", "disable block", MapsKt.mutableMapOf(TuplesKt.to("reason", bVar.mo223970a())));
                Function1<? super Boolean, Unit> function1 = f163662g;
                if (function1 != null) {
                    function1.invoke(false);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
