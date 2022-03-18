package com.ss.android.lark.multitask;

import android.app.Application;
import android.content.Context;
import android.database.ContentObserver;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.StateSet;
import android.view.View;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import androidx.core.p028b.C0745a;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.multitask.floating.FloatingManager;
import com.ss.android.lark.multitask.p2373a.C48276a;
import com.ss.android.lark.multitask.p2373a.C48277b;
import com.ss.android.lark.multitask.p2373a.C48278c;
import com.ss.android.lark.multitask.task.AbstractC48369g;
import com.ss.android.lark.multitask.task.AbstractC48375n;
import com.ss.android.lark.multitask.task.AbstractC48378t;
import com.ss.android.lark.multitask.task.AbstractC48379u;
import com.ss.android.lark.multitask.task.C48376q;
import com.ss.android.lark.multitask.task.EventTracker;
import com.ss.android.lark.multitask.task.GlobalTaskContainer;
import com.ss.android.lark.multitask.task.GlobalTaskContainerImpl;
import com.ss.android.lark.multitask.task.MultitaskStartTaskEventContentProvider;
import com.ss.android.lark.multitask.task.RemoteFloatingWindowInterface;
import com.ss.android.lark.multitask.task.RemoteTaskContainer;
import com.ss.android.lark.multitask.task.RemoteTaskContainerImpl;
import com.ss.android.lark.multitask.task.Task;
import com.ss.android.lark.multitask.task.TaskFinishHandler;
import com.ss.android.lark.multitask.task.TaskIdGenerator;
import com.ss.android.lark.multitask.task.TaskSnapshotStorage;
import com.ss.android.lark.multitask.task.TaskWrapperHolder;
import com.ss.android.lark.slideback.SlideBack;
import com.ss.android.lark.slideback.SlideFrameLayout;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.p3466b.C69029a;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002?@B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015H\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010%\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015H\u0016J@\u0010&\u001a\u00020'2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020*2\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020'\u0018\u00010,H\u0007J\u0006\u0010.\u001a\u00020\u0015J\u0018\u0010/\u001a\u00020'2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010(\u001a\u00020$H\u0002J\u0016\u00100\u001a\u00020'2\f\u00101\u001a\b\u0012\u0004\u0012\u00020'02H\u0002J:\u00103\u001a\u00020'2\u0006\u00104\u001a\u00020\u001f2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020\u00152\u0010\b\u0002\u0010:\u001a\n\u0012\u0004\u0012\u00020'\u0018\u000102J$\u0010;\u001a\u00020'*\u00020\u001f2\u0006\u0010<\u001a\u00020\u00152\u0006\u0010=\u001a\u00020$2\u0006\u00109\u001a\u00020\u0015H\u0002J\f\u0010>\u001a\u00020'*\u00020\u001fH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006A"}, d2 = {"Lcom/ss/android/lark/multitask/TaskBasketManagerImpl;", "Lcom/ss/android/lark/multitask/TaskBasketManager;", "()V", "application", "Landroid/app/Application;", "getApplication$base_multitask_impl_release", "()Landroid/app/Application;", "setApplication$base_multitask_impl_release", "(Landroid/app/Application;)V", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "layoutToTaskMap", "Landroidx/collection/ArrayMap;", "Lcom/ss/android/lark/slideback/SlideFrameLayout;", "Lcom/ss/android/lark/multitask/TaskBasketManagerImpl$RestoredTaskWrapper;", "getLayoutToTaskMap$base_multitask_impl_release", "()Landroidx/collection/ArrayMap;", "listenerMap", "Lcom/ss/android/lark/multitask/slideback/SlideFrameLayoutBasketListener;", "getListenerMap", "mainProcess", "", "getMainProcess$base_multitask_impl_release", "()Z", "setMainProcess$base_multitask_impl_release", "(Z)V", "bindLayoutToTask", "Lcom/ss/android/lark/multitask/task/TaskFinishHandler;", "layout", "Landroid/view/View;", "taskWrapper", "Lcom/ss/android/lark/multitask/task/TaskWrapper;", "isRestored", "generateTaskIdGeneratorByProcessName", "Lcom/ss/android/lark/multitask/task/TaskIdGenerator;", "processName", "", "getTaskFinishHandler", "init", "", "processNamePort", "taskSnapshotStorage", "Lcom/ss/android/lark/multitask/task/TaskSnapshotStorage;", "doInitializationBeforeStartTask", "Lkotlin/Function1;", "Lcom/ss/android/lark/multitask/task/TaskSnapshot;", "isInitialized", "registerTaskChangeObserver", "showTaskListAndDoActionIfTaskDeletedByUser", "action", "Lkotlin/Function0;", "tryNotifyTaskWillEnterBackground", "task", "wrapped", "Lcom/ss/android/lark/multitask/task/Task;", "context", "Landroid/content/Context;", "bySlide", "finishAction", "trackEventAddTask", "success", "taskType", "trackEventTaskListFilled", "RestoredTaskWrapper", "UIElementDelegateImpl", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.multitask.o */
public final class TaskBasketManagerImpl implements TaskBasketManager {

    /* renamed from: a */
    public static Application f121742a;

    /* renamed from: b */
    public static final TaskBasketManagerImpl f121743b = new TaskBasketManagerImpl();

    /* renamed from: c */
    private static final ArrayMap<SlideFrameLayout, C48278c> f121744c = new ArrayMap<>();

    /* renamed from: d */
    private static final ArrayMap<SlideFrameLayout, RestoredTaskWrapper> f121745d = new ArrayMap<>();

    /* renamed from: e */
    private static boolean f121746e;

    /* renamed from: f */
    private static final AtomicBoolean f121747f = new AtomicBoolean();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/multitask/TaskBasketManagerImpl$UIElementDelegateImpl;", "Lcom/ss/android/lark/multitask/slideback/SlideFrameLayoutBasketListener$UIElementDelegate;", "context", "Landroid/content/Context;", "task", "Lcom/ss/android/lark/multitask/task/Task;", "taskContainer", "Lcom/ss/android/lark/multitask/task/TaskContainer;", "(Landroid/content/Context;Lcom/ss/android/lark/multitask/task/Task;Lcom/ss/android/lark/multitask/task/TaskContainer;)V", "adjustAlpha", "", "color", "factor", "", "createDrawable", "Landroid/graphics/drawable/Drawable;", "createDroppedInText", "createIconDrawable", "createNormalText", "createTextColor", "makeSelector", "Landroid/graphics/drawable/StateListDrawable;", "normalColor", "normalAlpha", "selectedColor", "selectedAlpha", "Companion", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.o$b */
    public static final class UIElementDelegateImpl implements C48278c.AbstractC48280b {

        /* renamed from: a */
        public static final Integer[] f121753a;

        /* renamed from: b */
        public static final Integer[] f121754b = {Integer.valueOf((int) R.drawable.ic_icon_task_1), Integer.valueOf((int) R.drawable.ic_icon_task_2), Integer.valueOf((int) R.drawable.ic_icon_task_3), Integer.valueOf((int) R.drawable.ic_icon_task_4), Integer.valueOf((int) R.drawable.ic_icon_task_5), Integer.valueOf((int) R.drawable.ic_icon_task_6), Integer.valueOf((int) R.drawable.ic_icon_task_7), Integer.valueOf((int) R.drawable.ic_icon_task_8), Integer.valueOf((int) R.drawable.ic_icon_task_9)};

        /* renamed from: c */
        public static final Companion f121755c = new Companion(null);

        /* renamed from: d */
        private final Context f121756d;

        /* renamed from: e */
        private final Task f121757e;

        /* renamed from: f */
        private final AbstractC48375n f121758f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/multitask/TaskBasketManagerImpl$UIElementDelegateImpl$Companion;", "", "()V", "COLOR_RES_IDS", "", "", "getCOLOR_RES_IDS", "()[Ljava/lang/Integer;", "[Ljava/lang/Integer;", "ICON_RES_IDS", "getICON_RES_IDS", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.multitask.o$b$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // com.ss.android.lark.multitask.p2373a.C48278c.AbstractC48280b
        /* renamed from: a */
        public int mo168892a() {
            if (this.f121758f.mo169159a(this.f121757e)) {
                return R.string.Lark_Core_MovedAgain;
            }
            if (this.f121758f.mo169157a()) {
                return R.string.Lark_Core_FloatingLimit;
            }
            return R.string.Lark_Core_PutIntoFloating;
        }

        @Override // com.ss.android.lark.multitask.p2373a.C48278c.AbstractC48280b
        /* renamed from: b */
        public int mo168893b() {
            if (this.f121758f.mo169159a(this.f121757e)) {
                return R.string.Lark_Core_MovedAgain;
            }
            if (this.f121758f.mo169157a()) {
                return R.string.Lark_Core_FloatingLimit;
            }
            return R.string.Lark_Core_FloatedSuccessfully;
        }

        @Override // com.ss.android.lark.multitask.p2373a.C48278c.AbstractC48280b
        /* renamed from: d */
        public int mo168895d() {
            return f121754b[C0745a.m3627a(this.f121758f.mo169160b(), 0, 8)].intValue();
        }

        @Override // com.ss.android.lark.multitask.p2373a.C48278c.AbstractC48280b
        /* renamed from: e */
        public int mo168896e() {
            if (this.f121758f.mo169159a(this.f121757e) || this.f121758f.mo169157a()) {
                return R.color.lkui_N600;
            }
            return R.color.lkui_N00;
        }

        @Override // com.ss.android.lark.multitask.p2373a.C48278c.AbstractC48280b
        /* renamed from: c */
        public Drawable mo168894c() {
            if (this.f121758f.mo169159a(this.f121757e) || this.f121758f.mo169157a()) {
                return new C48276a(mo169082a(ContextCompat.getColor(this.f121756d, R.color.lkui_N400), 0.9f));
            }
            return mo169083a(ContextCompat.getColor(this.f121756d, R.color.bg_mask), 0.8f, ContextCompat.getColor(this.f121756d, f121753a[C0745a.m3627a(this.f121758f.mo169160b(), 0, 8)].intValue()), 0.85f);
        }

        static {
            Integer valueOf = Integer.valueOf((int) R.color.ud_W500);
            Integer valueOf2 = Integer.valueOf((int) R.color.ud_T500);
            Integer valueOf3 = Integer.valueOf((int) R.color.ud_P500);
            Integer valueOf4 = Integer.valueOf((int) R.color.ud_B500);
            f121753a = new Integer[]{valueOf, valueOf2, valueOf3, valueOf4, Integer.valueOf((int) R.color.ud_I500), valueOf, valueOf2, valueOf3, valueOf4};
        }

        /* renamed from: a */
        public final int mo169082a(int i, float f) {
            return Color.argb(C69029a.m265653a((float) Math.rint((double) (((float) Color.alpha(i)) * f))), Color.red(i), Color.green(i), Color.blue(i));
        }

        public UIElementDelegateImpl(Context context, Task task, AbstractC48375n nVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(task, "task");
            Intrinsics.checkParameterIsNotNull(nVar, "taskContainer");
            this.f121756d = context;
            this.f121757e = task;
            this.f121758f = nVar;
        }

        /* renamed from: a */
        public final StateListDrawable mo169083a(int i, float f, int i2, float f2) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842913}, new C48277b(new Drawable[]{new ColorDrawable(mo169082a(i, f)), new ColorDrawable(mo169082a(i2, f2))}));
            stateListDrawable.addState(StateSet.WILD_CARD, new C48276a(mo169082a(i, f)));
            return stateListDrawable;
        }
    }

    /* renamed from: a */
    public final void mo169075a(Application application, boolean z, String str, TaskSnapshotStorage sVar) {
        m190678a(this, application, z, str, sVar, (Function1) null, 16, (Object) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/multitask/TaskBasketManagerImpl$RestoredTaskWrapper;", "Lcom/ss/android/lark/multitask/task/TaskWrapper;", "wrapped", "Lcom/ss/android/lark/multitask/task/Task;", "starter", "Lcom/ss/android/lark/multitask/task/TaskStarter;", "container", "Lcom/ss/android/lark/multitask/task/TaskContainer;", "eventTracker", "Lcom/ss/android/lark/multitask/task/EventTracker;", "isRestored", "", "(Lcom/ss/android/lark/multitask/task/Task;Lcom/ss/android/lark/multitask/task/TaskStarter;Lcom/ss/android/lark/multitask/task/TaskContainer;Lcom/ss/android/lark/multitask/task/EventTracker;Z)V", "()Z", "finish", "", "getContainer", "getEventTracker", "getStarter", "getWrapped", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.o$a */
    public static final class RestoredTaskWrapper implements AbstractC48379u {

        /* renamed from: a */
        private final Task f121748a;

        /* renamed from: b */
        private final AbstractC48378t f121749b;

        /* renamed from: c */
        private final AbstractC48375n f121750c;

        /* renamed from: d */
        private final EventTracker f121751d;

        /* renamed from: e */
        private final boolean f121752e;

        @Override // com.ss.android.lark.multitask.task.AbstractC48379u
        public EventTracker O_() {
            return this.f121751d;
        }

        @Override // com.ss.android.lark.multitask.task.AbstractC48379u
        /* renamed from: a */
        public Task mo23782a() {
            return this.f121748a;
        }

        @Override // com.ss.android.lark.multitask.task.AbstractC48379u
        /* renamed from: b */
        public AbstractC48378t mo23783b() {
            return this.f121749b;
        }

        @Override // com.ss.android.lark.multitask.task.AbstractC48379u
        /* renamed from: e */
        public AbstractC48375n mo23786e() {
            return this.f121750c;
        }

        public RestoredTaskWrapper(Task task, AbstractC48378t tVar, AbstractC48375n nVar, EventTracker hVar, boolean z) {
            Intrinsics.checkParameterIsNotNull(task, "wrapped");
            Intrinsics.checkParameterIsNotNull(tVar, "starter");
            Intrinsics.checkParameterIsNotNull(nVar, "container");
            Intrinsics.checkParameterIsNotNull(hVar, "eventTracker");
            this.f121748a = task;
            this.f121749b = tVar;
            this.f121750c = nVar;
            this.f121751d = hVar;
            this.f121752e = z;
        }
    }

    private TaskBasketManagerImpl() {
    }

    /* renamed from: a */
    public final ArrayMap<SlideFrameLayout, C48278c> mo169074a() {
        return f121744c;
    }

    /* renamed from: b */
    public final ArrayMap<SlideFrameLayout, RestoredTaskWrapper> mo169079b() {
        return f121745d;
    }

    /* renamed from: c */
    public final boolean mo169080c() {
        return f121746e;
    }

    /* renamed from: a */
    public final void mo169076a(Application application, boolean z, String str, TaskSnapshotStorage sVar, Function1<? super C48376q, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(application, "application");
        Intrinsics.checkParameterIsNotNull(str, "processNamePort");
        Intrinsics.checkParameterIsNotNull(sVar, "taskSnapshotStorage");
        if (f121747f.compareAndSet(false, true)) {
            f121742a = application;
            f121746e = z;
            if (!SlideBack.f135613b.mo187292b()) {
                SlideBack.f135613b.mo187288a(application);
            }
            SlideBack.f135613b.mo187289a(false);
            if (z) {
                GlobalTaskContainerImpl.m190796a(application, sVar);
                GlobalTaskContainer.f121801b.mo169220a(GlobalTaskContainerImpl.f121803b);
                GlobalTaskContainerImpl.m190798a((GlobalTaskContainerImpl.OnTaskChangeListener) FloatingManager.f121676a);
                GlobalTaskContainerImpl.f121803b.mo169222a((GlobalTaskContainerImpl.OnCustomViewChangeListener) FloatingManager.f121676a);
                GlobalTaskContainerImpl.f121803b.mo169225a(function1);
            } else {
                RemoteTaskContainerImpl remoteTaskContainerImpl = new RemoteTaskContainerImpl(application);
                RemoteTaskContainer.f121815b.mo169232a(remoteTaskContainerImpl);
                remoteTaskContainerImpl.mo169162c();
                m190677a(application, str);
            }
            MultitaskHelper.f121712f.mo169053a(m190676a(str));
            TaskBasketManagerHolder.f121740a.mo169073a(f121743b);
        }
    }

    /* renamed from: a */
    public final void mo169077a(AbstractC48379u uVar, Task task, Context context, boolean z, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(uVar, "task");
        Intrinsics.checkParameterIsNotNull(task, "wrapped");
        Intrinsics.checkParameterIsNotNull(context, "context");
        AbstractC48375n e = uVar.mo23786e();
        Intrinsics.checkExpressionValueIsNotNull(e, "task.container");
        String c = task.mo23791c();
        if (e.mo169159a(task)) {
            Intrinsics.checkExpressionValueIsNotNull(c, ShareHitPoint.f121869d);
            m190681a(uVar, false, c, z);
        } else if (!e.mo169157a()) {
            Intrinsics.checkExpressionValueIsNotNull(c, ShareHitPoint.f121869d);
            m190681a(uVar, true, c, z);
            e.mo169152a(task, e, uVar.mo23783b());
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            Intrinsics.checkExpressionValueIsNotNull(c, ShareHitPoint.f121869d);
            m190681a(uVar, false, c, z);
            m190680a(uVar);
            new C48330g(context).mo169040a(task, new CallableC48344e(e, task, uVar, function0));
        }
    }

    /* renamed from: a */
    public final void mo169078a(Function0<Unit> function0) {
        if (f121746e) {
            FloatingManager.f121676a.mo169014a(function0);
            return;
        }
        AbstractC48375n a = RemoteTaskContainer.f121815b.mo169231a();
        if (a != null) {
            ((RemoteTaskContainerImpl) a).mo169150a((RemoteFloatingWindowInterface) new TaskBasketManagerImpl$showTaskListAndDoActionIfTaskDeletedByUser$1(function0));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.multitask.task.RemoteTaskContainerImpl");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.o$e */
    public static final class CallableC48344e<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ AbstractC48375n f121762a;

        /* renamed from: b */
        final /* synthetic */ Task f121763b;

        /* renamed from: c */
        final /* synthetic */ AbstractC48379u f121764c;

        /* renamed from: d */
        final /* synthetic */ Function0 f121765d;

        CallableC48344e(AbstractC48375n nVar, Task task, AbstractC48379u uVar, Function0 function0) {
            this.f121762a = nVar;
            this.f121763b = task;
            this.f121764c = uVar;
            this.f121765d = function0;
        }

        @Override // java.util.concurrent.Callable
        public /* synthetic */ Object call() {
            mo169086a();
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo169086a() {
            TaskBasketManagerImpl.f121743b.mo169078a(new Function0<Unit>(this) {
                /* class com.ss.android.lark.multitask.TaskBasketManagerImpl.CallableC48344e.C483451 */
                final /* synthetic */ CallableC48344e this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final void invoke() {
                    this.this$0.f121762a.mo169152a(this.this$0.f121763b, this.this$0.f121762a, this.this$0.f121764c.mo23783b());
                    Function0 function0 = this.this$0.f121765d;
                    if (function0 != null) {
                        Unit unit = (Unit) function0.invoke();
                    }
                }
            });
        }
    }

    /* renamed from: d */
    public final boolean mo169081d() {
        return f121747f.get();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/multitask/TaskBasketManagerImpl$getTaskFinishHandler$1", "Lcom/ss/android/lark/multitask/task/TaskFinishHandler;", "finish", "", "actionAfterFinish", "Lkotlin/Function0;", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.o$c */
    public static final class C48341c implements TaskFinishHandler {

        /* renamed from: a */
        final /* synthetic */ AbstractC48379u f121759a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.multitask.o$c$a */
        static final class C48342a extends Lambda implements Function0<Unit> {
            final /* synthetic */ Function0 $actionAfterFinish;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C48342a(Function0 function0) {
                super(0);
                this.$actionAfterFinish = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                Function0 function0 = this.$actionAfterFinish;
                if (function0 != null) {
                    Unit unit = (Unit) function0.invoke();
                }
            }
        }

        C48341c(AbstractC48379u uVar) {
            this.f121759a = uVar;
        }

        @Override // com.ss.android.lark.multitask.task.TaskFinishHandler
        /* renamed from: a */
        public void mo169084a(Function0<Unit> function0) {
            TaskBasketManagerImpl oVar = TaskBasketManagerImpl.f121743b;
            AbstractC48379u uVar = this.f121759a;
            Task a = ((AbstractC48369g) uVar).mo23782a();
            Intrinsics.checkExpressionValueIsNotNull(a, "taskWrapper.wrapped");
            FragmentActivity d = ((AbstractC48369g) this.f121759a).mo23785d();
            Intrinsics.checkExpressionValueIsNotNull(d, "taskWrapper.activity");
            oVar.mo169077a(uVar, a, (Context) d, false, (Function0<Unit>) new C48342a(function0));
        }
    }

    /* renamed from: a */
    private final void m190680a(AbstractC48379u uVar) {
        EventTracker.C48370a.m190784a(uVar.O_(), "tasklist_filled", null, 2, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/multitask/TaskBasketManagerImpl$registerTaskChangeObserver$1", "Landroid/database/ContentObserver;", "onChange", "", "selfChange", "", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.o$d */
    public static final class C48343d extends ContentObserver {

        /* renamed from: a */
        final /* synthetic */ Application f121760a;

        /* renamed from: b */
        final /* synthetic */ String f121761b;

        public void onChange(boolean z) {
            if (!Intrinsics.areEqual(this.f121761b, MultitaskStartTaskEventContentProvider.f121778b.mo169130b(this.f121760a))) {
                TaskWrapperHolder.f121828a.mo169249a((AbstractC48369g) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48343d(Application application, String str, Handler handler) {
            super(handler);
            this.f121760a = application;
            this.f121761b = str;
        }
    }

    /* renamed from: a */
    private final TaskIdGenerator m190676a(String str) {
        long hashCode = ((long) str.hashCode()) << 16;
        return new TaskIdGenerator(hashCode, ((long) 65535) + hashCode);
    }

    /* renamed from: a */
    private final void m190677a(Application application, String str) {
        MultitaskStartTaskEventContentProvider.f121778b.mo169128a(application, new C48343d(application, str, new Handler(Looper.getMainLooper())));
    }

    @Override // com.ss.android.lark.multitask.TaskBasketManager
    /* renamed from: a */
    public TaskFinishHandler mo169070a(AbstractC48379u uVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(uVar, "taskWrapper");
        if (uVar instanceof AbstractC48369g) {
            return new C48341c(uVar);
        }
        throw new AssertionError("taskWrapper is not ActivityTaskWrapper");
    }

    @Override // com.ss.android.lark.multitask.TaskBasketManager
    /* renamed from: a */
    public TaskFinishHandler mo169069a(View view, AbstractC48379u uVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "layout");
        Intrinsics.checkParameterIsNotNull(uVar, "taskWrapper");
        Task a = uVar.mo23782a();
        Intrinsics.checkExpressionValueIsNotNull(a, "taskWrapper.wrapped");
        AbstractC48378t b = uVar.mo23783b();
        Intrinsics.checkExpressionValueIsNotNull(b, "taskWrapper.starter");
        AbstractC48375n e = uVar.mo23786e();
        Intrinsics.checkExpressionValueIsNotNull(e, "taskWrapper.container");
        EventTracker O_ = uVar.O_();
        Intrinsics.checkExpressionValueIsNotNull(O_, "taskWrapper.eventTracker");
        f121745d.put((SlideFrameLayout) view, new RestoredTaskWrapper(a, b, e, O_, z));
        a.getLifecycle().addObserver(new TaskBasketManagerImpl$bindLayoutToTask$1(view, a));
        return mo169070a(uVar, z);
    }

    /* renamed from: a */
    private final void m190681a(AbstractC48379u uVar, boolean z, String str, boolean z2) {
        String str2;
        String str3;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str2 = "success";
        } else {
            str2 = "failure";
        }
        jSONObject.put("add_result", str2);
        jSONObject.put("task_type", str);
        EventTracker O_ = uVar.O_();
        if (z2) {
            str3 = "tasklist_add_by_slide";
        } else {
            str3 = "tasklist_add_by_fix";
        }
        O_.mo169219a(str3, jSONObject);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.ss.android.lark.multitask.o */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m190678a(TaskBasketManagerImpl oVar, Application application, boolean z, String str, TaskSnapshotStorage sVar, Function1 function1, int i, Object obj) {
        if ((i & 16) != 0) {
            function1 = null;
        }
        oVar.mo169076a(application, z, str, sVar, function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.ss.android.lark.multitask.o */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m190679a(TaskBasketManagerImpl oVar, AbstractC48379u uVar, Task task, Context context, boolean z, Function0 function0, int i, Object obj) {
        boolean z2;
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i & 16) != 0) {
            function0 = null;
        }
        oVar.mo169077a(uVar, task, context, z2, function0);
    }
}
