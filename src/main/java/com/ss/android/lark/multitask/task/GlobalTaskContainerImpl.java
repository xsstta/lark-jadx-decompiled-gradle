package com.ss.android.lark.multitask.task;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.ss.android.lark.multitask.C48338l;
import com.ss.android.lark.multitask.task.MultitaskStartTaskEventContentProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002^_B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u0014H\u0007J\b\u0010/\u001a\u00020\u0012H\u0016J\u0018\u00100\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u000e2\u0006\u00102\u001a\u000203H\u0016J\u0018\u00104\u001a\u00020\u00122\u0006\u00102\u001a\u0002032\u0006\u00105\u001a\u000206H\u0016J\u001a\u00107\u001a\u00020\u00122\u0006\u00102\u001a\u0002032\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0018\u0010:\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u00042\b\u00108\u001a\u0004\u0018\u000109J\u0018\u0010<\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0007J\u0010\u0010=\u001a\u00020>2\u0006\u00102\u001a\u000203H\u0016J\b\u0010?\u001a\u00020>H\u0016J\u0010\u0010@\u001a\u00020>2\u0006\u00101\u001a\u00020AH\u0007J\u0010\u0010B\u001a\u00020>2\u0006\u00101\u001a\u00020AH\u0007J\u0015\u0010C\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u000eH\u0000¢\u0006\u0002\bDJ\u000e\u0010E\u001a\u00020\u00122\u0006\u0010F\u001a\u00020AJ\u0016\u0010G\u001a\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H\u0002J \u0010H\u001a\u00020\u00122\u0006\u00102\u001a\u0002032\u0006\u0010I\u001a\u00020\u00012\u0006\u0010J\u001a\u00020KH\u0016J\u0010\u0010L\u001a\u00020\u00122\u0006\u0010M\u001a\u00020\u0004H\u0016J\u0010\u0010N\u001a\u00020\u00122\u0006\u0010F\u001a\u00020\u000eH\u0002J\u0010\u0010O\u001a\u00020\u00122\u0006\u0010F\u001a\u00020\u000eH\u0002J\u001a\u0010P\u001a\u00020\u00122\u0006\u0010F\u001a\u00020\u000e2\b\b\u0002\u0010Q\u001a\u00020>H\u0002J\b\u0010R\u001a\u00020\u0012H\u0007J\u000e\u0010S\u001a\u00020\u00122\u0006\u0010T\u001a\u00020\u0014J\b\u0010U\u001a\u00020\u0012H\u0007J\b\u0010V\u001a\u00020\u0006H\u0016J\u0010\u0010W\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u000eH\u0016J\b\u0010X\u001a\u00020\u0012H\u0007J\b\u0010Y\u001a\u00020\u0012H\u0002J\u0006\u0010Z\u001a\u00020\u0012J\u0010\u0010[\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u000eH\u0007J\u0010\u0010[\u001a\u00020\u00122\u0006\u0010M\u001a\u00020\u0004H\u0016J\u0010\u0010\\\u001a\u00020\u00122\u0006\u00108\u001a\u00020]H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R&\u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0011\u0012\u0004\u0012\u00020\u00120\u00100\rX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\rX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R(\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118FX\u0004¢\u0006\f\u0012\u0004\b*\u0010\u0002\u001a\u0004\b+\u0010,¨\u0006`"}, d2 = {"Lcom/ss/android/lark/multitask/task/GlobalTaskContainerImpl;", "Lcom/ss/android/lark/multitask/task/TaskContainer;", "()V", "MAIN_PROCESS_NAME_PORT", "", "MAX_SNAPSHOT_COUNT", "", "MINI_APP_IDENTIFIER_PREFIX", "MINI_APP_PROCESS_NAME_PORT", "P0_PROCESS_NAME_PORT", "TAG", "WEB_IDENTIFIER_PREFIX", "_activeTaskSnapshots", "", "Lcom/ss/android/lark/multitask/task/TaskSnapshot;", "_internalTaskChangeListeners", "Lkotlin/Function1;", "", "", "_onTaskChangeListeners", "Lcom/ss/android/lark/multitask/task/GlobalTaskContainerImpl$OnTaskChangeListener;", "_taskSnapshots", "context", "Landroid/content/Context;", "doInitializationBeforeStartTask", "getDoInitializationBeforeStartTask", "()Lkotlin/jvm/functions/Function1;", "setDoInitializationBeforeStartTask", "(Lkotlin/jvm/functions/Function1;)V", "onCustomViewChangeListener", "Lcom/ss/android/lark/multitask/task/GlobalTaskContainerImpl$OnCustomViewChangeListener;", "getOnCustomViewChangeListener", "()Lcom/ss/android/lark/multitask/task/GlobalTaskContainerImpl$OnCustomViewChangeListener;", "setOnCustomViewChangeListener", "(Lcom/ss/android/lark/multitask/task/GlobalTaskContainerImpl$OnCustomViewChangeListener;)V", "taskSnapshotStorage", "Lcom/ss/android/lark/multitask/task/TaskSnapshotStorage;", "getTaskSnapshotStorage", "()Lcom/ss/android/lark/multitask/task/TaskSnapshotStorage;", "setTaskSnapshotStorage", "(Lcom/ss/android/lark/multitask/task/TaskSnapshotStorage;)V", "taskSnapshots", "taskSnapshots$annotations", "getTaskSnapshots", "()Ljava/util/List;", "addOnTaskChangeListener", "listener", "clearTasks", "dispatchRestoreInstanceState", "taskSnapshot", "task", "Lcom/ss/android/lark/multitask/task/Task;", "dispatchSaveInstanceState", "outState", "Landroid/os/Bundle;", "getTaskSnapshotForTask", "callback", "Lcom/ss/android/lark/multitask/task/TaskSnapshotCallback;", "getTaskSnapshotForTaskIdentifier", "identifier", "init", "isDuplicatedTask", "", "isFull", "isMiniApp", "Lcom/ss/android/lark/multitask/task/RemoteTaskSnapshot;", "isWeb", "moveTaskToForeground", "moveTaskToForeground$base_multitask_impl_release", "notifyRemoteTaskWillEnterBackground", "snapshot", "notifyTaskListChanges", "notifyTaskWillEnterBackground", "container", "starter", "Lcom/ss/android/lark/multitask/task/TaskStarter;", "notifyTaskWillEnterForeground", "taskIdentifier", "onTaskEnterBackground", "onTaskRemovedFromBackground", "putSnapshotToBackgroundInternal", "writeToStorage", "removeAllCustomView", "removeOnTaskChangeListener", "taskChangeListener", "restoreTasks", "size", "startTask", "temporarilyTerminateAllTasks", "temporarilyTerminateAllTasksInternal", "terminateAllTasks", "terminateTask", "watchTaskSnapshots", "Lcom/ss/android/lark/multitask/task/MainTaskChangeCallback;", "OnCustomViewChangeListener", "OnTaskChangeListener", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.multitask.task.j */
public final class GlobalTaskContainerImpl implements AbstractC48375n {

    /* renamed from: a */
    public static TaskSnapshotStorage f121802a;

    /* renamed from: b */
    public static final GlobalTaskContainerImpl f121803b = new GlobalTaskContainerImpl();

    /* renamed from: c */
    private static Context f121804c;

    /* renamed from: d */
    private static final List<C48376q> f121805d = new ArrayList();

    /* renamed from: e */
    private static final List<C48376q> f121806e = new ArrayList();

    /* renamed from: f */
    private static List<OnTaskChangeListener> f121807f = new ArrayList();

    /* renamed from: g */
    private static List<Function1<List<String>, Unit>> f121808g;

    /* renamed from: h */
    private static Function1<? super C48376q, Unit> f121809h;

    /* renamed from: i */
    private static OnCustomViewChangeListener f121810i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/multitask/task/GlobalTaskContainerImpl$OnCustomViewChangeListener;", "", "onTenantChange", "", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.task.j$a */
    public interface OnCustomViewChangeListener {
        /* renamed from: b */
        void mo169015b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0006H&J\u001e\u0010\b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/multitask/task/GlobalTaskContainerImpl$OnTaskChangeListener;", "", "onBackgroundTaskRemoved", "", "taskSnapshots", "", "Lcom/ss/android/lark/multitask/task/TaskSnapshot;", "newRemovedTaskSnapshot", "onTaskEnterBackground", "newAddedTaskSnapshot", "onTasksClear", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.task.j$b */
    public interface OnTaskChangeListener {
        /* renamed from: a */
        void mo169004a();

        /* renamed from: a */
        void mo169013a(List<? extends C48376q> list, C48376q qVar);

        /* renamed from: b */
        void mo169018b(List<? extends C48376q> list, C48376q qVar);
    }

    private GlobalTaskContainerImpl() {
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: a */
    public void mo169152a(Task task, AbstractC48375n nVar, AbstractC48378t tVar) {
        Intrinsics.checkParameterIsNotNull(task, "task");
        Intrinsics.checkParameterIsNotNull(nVar, "container");
        Intrinsics.checkParameterIsNotNull(tVar, "starter");
        Bundle bundle = new Bundle();
        mo169151a(task, bundle);
        m190799a(this, new C48376q(task.mo169194e(), task.mo23792d(), task.mo23791c(), task.mo23790b(), task.mo23788a(), nVar, tVar, bundle), false, 2, null);
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: a */
    public boolean mo169159a(Task task) {
        Intrinsics.checkParameterIsNotNull(task, "task");
        List<C48376q> list = f121805d;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo169241c());
        }
        return arrayList.contains(task.mo23792d());
    }

    /* renamed from: a */
    public final void mo169223a(C48376q qVar) {
        Intrinsics.checkParameterIsNotNull(qVar, "taskSnapshot");
        f121806e.add(qVar);
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: a */
    public void mo169155a(String str) {
        T t;
        Intrinsics.checkParameterIsNotNull(str, "taskIdentifier");
        Iterator<T> it = f121805d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (Intrinsics.areEqual(t.mo169241c(), str)) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            m190804c(t2);
        }
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: a */
    public void mo169153a(Task task, AbstractC48377r rVar) {
        T t;
        Intrinsics.checkParameterIsNotNull(task, "task");
        if (rVar != null) {
            Iterator<T> it = f121805d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (Intrinsics.areEqual(t.mo169241c(), task.mo23792d())) {
                    break;
                }
            }
            rVar.mo168851a(t);
        }
    }

    /* renamed from: a */
    public final void mo169224a(String str, AbstractC48377r rVar) {
        T t;
        Intrinsics.checkParameterIsNotNull(str, "identifier");
        Iterator<T> it = f121805d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (Intrinsics.areEqual(t.mo169241c(), str)) {
                break;
            }
        }
        T t2 = t;
        if (rVar != null) {
            rVar.mo168851a(t2);
        }
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: a */
    public void mo169154a(C48376q qVar, Task task) {
        Intrinsics.checkParameterIsNotNull(qVar, "taskSnapshot");
        Intrinsics.checkParameterIsNotNull(task, "task");
        mo169153a(task, new C48371c(task, qVar.mo169246g()));
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: a */
    public boolean mo169157a() {
        return f121805d.size() >= 100;
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m190808g() {
        OnCustomViewChangeListener aVar = f121810i;
        if (aVar != null) {
            aVar.mo169015b();
        }
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: b */
    public int mo169160b() {
        return f121805d.size();
    }

    /* renamed from: c */
    public static final List<C48376q> m190803c() {
        return CollectionsKt.toList(f121805d);
    }

    /* renamed from: i */
    private final void m190810i() {
        List<C48376q> list = f121805d;
        CollectionsKt.toList(list);
        list.clear();
    }

    static {
        List<Function1<List<String>, Unit>> synchronizedList = Collections.synchronizedList(new ArrayList());
        Intrinsics.checkExpressionValueIsNotNull(synchronizedList, "Collections.synchronizedList(mutableListOf())");
        f121808g = synchronizedList;
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m190807f() {
        List<C48376q> list = f121805d;
        List<C48376q> list2 = CollectionsKt.toList(list);
        list.clear();
        for (C48376q qVar : list2) {
            f121803b.m190806e(qVar);
        }
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m190809h() {
        if (C48338l.m190663b()) {
            f121803b.m190810i();
            TaskSnapshotStorage sVar = f121802a;
            if (sVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("taskSnapshotStorage");
            }
            for (C48376q qVar : sVar.mo169089a()) {
                f121803b.m190800a(qVar, false);
            }
        }
    }

    /* renamed from: d */
    public void mo169228d() {
        f121805d.clear();
        f121806e.clear();
        for (OnTaskChangeListener bVar : CollectionsKt.asReversedMutable(f121807f)) {
            bVar.mo169004a();
        }
        m190801a(f121805d);
    }

    /* renamed from: e */
    public final void mo169229e() {
        for (C48376q qVar : CollectionsKt.toList(f121805d)) {
            f121805d.remove(qVar);
            f121806e.remove(qVar);
            TaskSnapshotStorage sVar = f121802a;
            if (sVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("taskSnapshotStorage");
            }
            sVar.mo169091b(qVar);
            f121803b.m190806e(qVar);
        }
    }

    /* renamed from: a */
    public final void mo169222a(OnCustomViewChangeListener aVar) {
        f121810i = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "snapshot", "Lcom/ss/android/lark/multitask/task/TaskSnapshot;", "kotlin.jvm.PlatformType", "actionPerformed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.task.j$c */
    static final class C48371c implements AbstractC48377r {

        /* renamed from: a */
        final /* synthetic */ Task f121811a;

        /* renamed from: b */
        final /* synthetic */ Bundle f121812b;

        C48371c(Task task, Bundle bundle) {
            this.f121811a = task;
            this.f121812b = bundle;
        }

        @Override // com.ss.android.lark.multitask.task.AbstractC48377r
        /* renamed from: a */
        public final void mo168851a(C48376q qVar) {
            this.f121811a.mo169193b(this.f121812b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "taskSnapshot", "Lcom/ss/android/lark/multitask/task/TaskSnapshot;", "kotlin.jvm.PlatformType", "actionPerformed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.task.j$d */
    static final class C48372d implements AbstractC48377r {

        /* renamed from: a */
        public static final C48372d f121813a = new C48372d();

        C48372d() {
        }

        @Override // com.ss.android.lark.multitask.task.AbstractC48377r
        /* renamed from: a */
        public final void mo168851a(C48376q qVar) {
            if (qVar != null) {
                GlobalTaskContainerImpl.f121803b.mo169223a(qVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "snapshotIdentifiers", "", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.task.j$e */
    static final class C48373e extends Lambda implements Function1<List<? extends String>, Unit> {
        final /* synthetic */ MainTaskChangeCallback $callback;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48373e(MainTaskChangeCallback mainTaskChangeCallback) {
            super(1);
            this.$callback = mainTaskChangeCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
            invoke((List<String>) list);
            return Unit.INSTANCE;
        }

        public final void invoke(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "snapshotIdentifiers");
            this.$callback.onTaskListChanged(list);
        }
    }

    /* renamed from: a */
    public final void mo169225a(Function1<? super C48376q, Unit> function1) {
        f121809h = function1;
    }

    /* renamed from: b */
    public final void mo169226b(RemoteTaskSnapshot remoteTaskSnapshot) {
        Intrinsics.checkParameterIsNotNull(remoteTaskSnapshot, "snapshot");
        m190799a(this, remoteTaskSnapshot, false, 2, null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m190798a(OnTaskChangeListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        f121807f.add(bVar);
    }

    /* renamed from: d */
    private final void m190805d(C48376q qVar) {
        Iterator<T> it = f121807f.iterator();
        while (it.hasNext()) {
            it.next().mo169013a(f121805d, qVar);
        }
        m190801a(f121805d);
    }

    /* renamed from: e */
    private final void m190806e(C48376q qVar) {
        Iterator<T> it = f121807f.iterator();
        while (it.hasNext()) {
            it.next().mo169018b(f121805d, qVar);
        }
        m190801a(f121805d);
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: b */
    public void mo169161b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "taskIdentifier");
        mo169224a(str, C48372d.f121813a);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m190797a(MainTaskChangeCallback mainTaskChangeCallback) {
        Intrinsics.checkParameterIsNotNull(mainTaskChangeCallback, "callback");
        C48373e eVar = new C48373e(mainTaskChangeCallback);
        List<C48376q> list = f121805d;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo169241c());
        }
        eVar.invoke((Object) arrayList);
        f121808g.add(eVar);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m190804c(C48376q qVar) {
        Intrinsics.checkParameterIsNotNull(qVar, "taskSnapshot");
        List<C48376q> list = f121805d;
        if (list.contains(qVar)) {
            list.remove(qVar);
            f121806e.remove(qVar);
            TaskSnapshotStorage sVar = f121802a;
            if (sVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("taskSnapshotStorage");
            }
            sVar.mo169091b(qVar);
            f121803b.m190806e(qVar);
        }
    }

    /* renamed from: b */
    public void mo169227b(C48376q qVar) {
        String str;
        Intrinsics.checkParameterIsNotNull(qVar, "taskSnapshot");
        if (f121805d.contains(qVar)) {
            Function1<? super C48376q, Unit> function1 = f121809h;
            if (function1 != null) {
                function1.invoke(qVar);
            }
            MultitaskStartTaskEventContentProvider.Companion aVar = MultitaskStartTaskEventContentProvider.f121778b;
            Context context = f121804c;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            }
            if (!(qVar instanceof RemoteTaskSnapshot)) {
                str = "";
            } else if (m190802a((RemoteTaskSnapshot) qVar)) {
                str = "miniapp";
            } else {
                str = "p0";
            }
            aVar.mo169129a(context, str);
            qVar.mo169245f().a_(qVar, this);
        }
    }

    /* renamed from: a */
    private final void m190801a(List<? extends C48376q> list) {
        List<? extends C48376q> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo169241c());
        }
        ArrayList arrayList2 = arrayList;
        for (Function1 function1 : CollectionsKt.toList(f121808g)) {
            try {
                function1.invoke(arrayList2);
            } catch (RemoteException e) {
                if (e instanceof DeadObjectException) {
                    f121808g.remove(function1);
                }
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m190802a(RemoteTaskSnapshot remoteTaskSnapshot) {
        Intrinsics.checkParameterIsNotNull(remoteTaskSnapshot, "taskSnapshot");
        String c = remoteTaskSnapshot.mo169241c();
        Intrinsics.checkExpressionValueIsNotNull(c, "taskSnapshot.identifier");
        return StringsKt.startsWith$default(c, "miniapp:", false, 2, (Object) null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m190796a(Context context, TaskSnapshotStorage sVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(sVar, "taskSnapshotStorage");
        f121804c = context;
        f121802a = sVar;
    }

    /* renamed from: a */
    private final void m190800a(C48376q qVar, boolean z) {
        Bundle g = qVar.mo169246g();
        List<C48376q> list = f121805d;
        int indexOf = list.indexOf(qVar);
        if (!g.getBoolean("lark.multitask.task.restored") || indexOf < 0) {
            list.add(qVar);
            if (z) {
                TaskSnapshotStorage sVar = f121802a;
                if (sVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("taskSnapshotStorage");
                }
                sVar.mo169090a(qVar);
            }
            m190805d(qVar);
            return;
        }
        f121806e.remove(qVar);
        C48376q qVar2 = list.get(indexOf);
        list.set(indexOf, qVar);
        TaskSnapshotStorage sVar2 = f121802a;
        if (sVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskSnapshotStorage");
        }
        sVar2.mo169091b(qVar2);
        sVar2.mo169090a(qVar);
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: a */
    public void mo169151a(Task task, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(task, "task");
        Intrinsics.checkParameterIsNotNull(bundle, "outState");
        task.mo23789a(bundle);
    }

    /* renamed from: a */
    static /* synthetic */ void m190799a(GlobalTaskContainerImpl jVar, C48376q qVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        jVar.m190800a(qVar, z);
    }
}
