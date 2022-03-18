package com.ss.android.lark.integrator.passport.serviceimpl;

import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.IInitializeTaskManagerService;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@ClaymoreImpl(IInitializeTaskManagerService.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u0017H\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\r\u0010\u0007R!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/integrator/passport/serviceimpl/InitializeTaskManagerServiceImpl;", "Lcom/ss/android/lark/passport/infra/service/IInitializeTaskManagerService;", "()V", "commonTasks", "", "Lcom/ss/android/lark/integrator/passport/serviceimpl/IInitializeTask;", "getCommonTasks", "()Ljava/util/List;", "commonTasks$delegate", "Lkotlin/Lazy;", "log", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "loginTasks", "getLoginTasks", "loginTasks$delegate", "switchTasks", "getSwitchTasks", "switchTasks$delegate", "executeLoadAllConfigTask", "", "user", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "callback", "Lkotlin/Function1;", "", "executeLoginInitTasks", "executeSwitchInitTasks", "executeTasks", "tasks", "Companion", "passport_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class InitializeTaskManagerServiceImpl implements IInitializeTaskManagerService {
    public static final Companion Companion = new Companion(null);
    private final Lazy commonTasks$delegate = LazyKt.lazy(C39993b.INSTANCE);
    private final PassportLog log = PassportLog.f123351c.mo171474a();
    private final Lazy loginTasks$delegate = LazyKt.lazy(new C39994c(this));
    private final Lazy switchTasks$delegate = LazyKt.lazy(new C39995d(this));

    private final List<IInitializeTask> getLoginTasks() {
        return (List) this.loginTasks$delegate.getValue();
    }

    private final List<IInitializeTask> getSwitchTasks() {
        return (List) this.switchTasks$delegate.getValue();
    }

    public final List<IInitializeTask> getCommonTasks() {
        return (List) this.commonTasks$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/integrator/passport/serviceimpl/InitializeTaskManagerServiceImpl$Companion;", "", "()V", "TAG", "", "passport_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.passport.serviceimpl.InitializeTaskManagerServiceImpl$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/integrator/passport/serviceimpl/IInitializeTask;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.passport.serviceimpl.InitializeTaskManagerServiceImpl$b */
    static final class C39993b extends Lambda implements Function0<List<? extends IInitializeTask>> {
        public static final C39993b INSTANCE = new C39993b();

        C39993b() {
            super(0);
        }

        /* Return type fixed from 'java.util.List<com.ss.android.lark.integrator.passport.serviceimpl.b>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends IInitializeTask> invoke() {
            return CollectionsKt.listOf((Object[]) new IInitializeTask[]{UpdateDeviceIdTask.f101768a, SaveCookieTask.f101766a, UpdateSettingsTask.f101770a});
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/integrator/passport/serviceimpl/IInitializeTask;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.passport.serviceimpl.InitializeTaskManagerServiceImpl$c */
    static final class C39994c extends Lambda implements Function0<List<? extends IInitializeTask>> {
        final /* synthetic */ InitializeTaskManagerServiceImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39994c(InitializeTaskManagerServiceImpl initializeTaskManagerServiceImpl) {
            super(0);
            this.this$0 = initializeTaskManagerServiceImpl;
        }

        /* Return type fixed from 'java.util.List<com.ss.android.lark.integrator.passport.serviceimpl.b>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends IInitializeTask> invoke() {
            return CollectionsKt.plus((Collection) this.this$0.getCommonTasks(), (Iterable) CollectionsKt.listOf((Object[]) new IInitializeTask[]{InitIMSDKTask.f101758a, InitFGTask.f101756a}));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/integrator/passport/serviceimpl/IInitializeTask;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.passport.serviceimpl.InitializeTaskManagerServiceImpl$d */
    static final class C39995d extends Lambda implements Function0<List<? extends IInitializeTask>> {
        final /* synthetic */ InitializeTaskManagerServiceImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39995d(InitializeTaskManagerServiceImpl initializeTaskManagerServiceImpl) {
            super(0);
            this.this$0 = initializeTaskManagerServiceImpl;
        }

        /* Return type fixed from 'java.util.List<com.ss.android.lark.integrator.passport.serviceimpl.b>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends IInitializeTask> invoke() {
            return CollectionsKt.plus((Collection) this.this$0.getCommonTasks(), (Iterable) CollectionsKt.listOf((Object[]) new IInitializeTask[]{UpdateTimeZoneTask.f101773a, ReloadFGTask.f101764a}));
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.IInitializeTaskManagerService
    public void executeLoginInitTasks(User user) {
        Intrinsics.checkParameterIsNotNull(user, "user");
        this.log.mo171465b("n_action_after_login_outer_task", "executeLoginInitTasks start");
        executeTasks(user, getLoginTasks());
        this.log.mo171465b("n_action_after_login_outer_task", "executeLoginInitTasks end");
    }

    @Override // com.ss.android.lark.passport.infra.service.IInitializeTaskManagerService
    public void executeSwitchInitTasks(User user) {
        Intrinsics.checkParameterIsNotNull(user, "user");
        this.log.mo171465b("n_action_after_login_outer_task", "executeSwitchInitTasks start");
        executeTasks(user, getSwitchTasks());
        this.log.mo171465b("n_action_after_login_outer_task", "executeSwitchInitTasks end");
    }

    @Override // com.ss.android.lark.passport.infra.service.IInitializeTaskManagerService
    public void executeLoadAllConfigTask(User user, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(user, "user");
        Intrinsics.checkParameterIsNotNull(function1, "callback");
        LoadAllConfigTask.f101760a.mo145312a(user, function1);
    }

    private final void executeTasks(User user, List<? extends IInitializeTask> list) {
        this.log.mo171465b("n_action_after_login_outer_task", "executeTasks start");
        for (T t : list) {
            PassportLog passportLog = this.log;
            passportLog.mo171465b("n_action_after_login_outer_task", "executeTasks, task: " + t.mo145307a() + " start");
            t.invoke(user);
            PassportLog passportLog2 = this.log;
            passportLog2.mo171465b("n_action_after_login_outer_task", "executeTasks, task: " + t.mo145307a() + " end");
        }
    }
}
