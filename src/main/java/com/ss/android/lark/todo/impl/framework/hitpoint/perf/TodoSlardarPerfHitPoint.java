package com.ss.android.lark.todo.impl.framework.hitpoint.perf;

import com.bytedance.apm.ApmAgent;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000fJ\u0006\u0010\u0019\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0017J\u0006\u0010\u001b\u001a\u00020\u0017J\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000fJ\u0006\u0010\u001d\u001a\u00020\u0017J\u0006\u0010\u001e\u001a\u00020\u0017J\u0006\u0010\u001f\u001a\u00020\u0017J\u0006\u0010 \u001a\u00020\u0017J\u0006\u0010!\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/todo/impl/framework/hitpoint/perf/TodoSlardarPerfHitPoint;", "", "()V", "EVENT_TODO_COLD_LAUNCH", "", "KEY_TODO_COLD_LAUNCH_COST", "KEY_TODO_COLD_LAUNCH_LIST_IS_EMPTY", "KEY_TODO_CREATE_VIEW_COST", "KEY_TODO_FRAGMENT_INITIAL_COST", "KEY_TODO_INIT_VIEW_COST", "KEY_TODO_SDK_DATA_COST", "MAX_DIFF_TIME_LIMIT", "", "TAG", "isColdLaunchFinish", "", "todoCreateViewStartTime", "", "todoFetchSDKDataStartTime", "todoInitViewStartTime", "todoInitialStartTime", "todoLauncherStartTime", "todoColdLaunchEnd", "", "isTodoListEmpty", "todoColdLaunchStart", "todoFragmentCreateViewEnd", "todoFragmentCreateViewStart", "todoFragmentFetchSDKDataEnd", "todoFragmentFetchSDKDataStart", "todoFragmentInitViewEnd", "todoFragmentInitViewStart", "todoFragmentInitialEnd", "todoFragmentInitialStart", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.framework.c.c.a */
public final class TodoSlardarPerfHitPoint {

    /* renamed from: a */
    public static final TodoSlardarPerfHitPoint f141078a = new TodoSlardarPerfHitPoint();

    /* renamed from: b */
    private static volatile boolean f141079b;

    /* renamed from: c */
    private static long f141080c = -1;

    /* renamed from: d */
    private static long f141081d = -1;

    /* renamed from: e */
    private static long f141082e = -1;

    /* renamed from: f */
    private static long f141083f = -1;

    /* renamed from: g */
    private static long f141084g = -1;

    private TodoSlardarPerfHitPoint() {
    }

    /* renamed from: f */
    public final void mo194239f() {
        f141083f = System.currentTimeMillis();
    }

    /* renamed from: g */
    public final void mo194240g() {
        f141084g = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void mo194232a() {
        if (!f141079b) {
            f141080c = System.currentTimeMillis();
        }
    }

    /* renamed from: b */
    public final void mo194234b() {
        f141081d = System.currentTimeMillis();
    }

    /* renamed from: d */
    public final void mo194237d() {
        f141082e = System.currentTimeMillis();
    }

    /* renamed from: c */
    public final void mo194236c() {
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().execute(RunnableC57211b.f141086a);
    }

    /* renamed from: e */
    public final void mo194238e() {
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().execute(RunnableC57213d.f141088a);
    }

    /* renamed from: h */
    public final void mo194241h() {
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().execute(RunnableC57214e.f141089a);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.framework.c.c.a$a */
    public static final class RunnableC57210a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f141085a;

        RunnableC57210a(boolean z) {
            this.f141085a = z;
        }

        public final void run() {
            TodoSlardarPerfHitPoint aVar = TodoSlardarPerfHitPoint.f141078a;
            if (TodoSlardarPerfHitPoint.f141080c == -1) {
                Log.m165383e("TodoSlardarPerfHitPoint", "Failed to get todoLauncherStartTime!");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("key_todo_cold_launch_list_is_empty", this.f141085a);
            long currentTimeMillis = System.currentTimeMillis();
            TodoSlardarPerfHitPoint aVar2 = TodoSlardarPerfHitPoint.f141078a;
            long j = currentTimeMillis - TodoSlardarPerfHitPoint.f141080c;
            if (j > ((long) 120000)) {
                Log.m165383e("TodoSlardarPerfHitPoint", "cold launch more than max limit");
                TodoSlardarPerfHitPoint aVar3 = TodoSlardarPerfHitPoint.f141078a;
                TodoSlardarPerfHitPoint.f141080c = -1;
                return;
            }
            jSONObject2.put("key_todo_cold_launch_cost", j);
            TodoSlardarPerfHitPoint aVar4 = TodoSlardarPerfHitPoint.f141078a;
            TodoSlardarPerfHitPoint.f141080c = -1;
            Log.m165389i("TodoSlardarPerfHitPoint", "Start report cold launch data!");
            ApmAgent.monitorEvent("todo_cold_launch", jSONObject, jSONObject2, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.framework.c.c.a$b */
    public static final class RunnableC57211b implements Runnable {

        /* renamed from: a */
        public static final RunnableC57211b f141086a = new RunnableC57211b();

        RunnableC57211b() {
        }

        public final void run() {
            TodoSlardarPerfHitPoint aVar = TodoSlardarPerfHitPoint.f141078a;
            if (TodoSlardarPerfHitPoint.f141081d == -1) {
                Log.m165383e("TodoSlardarPerfHitPoint", "Failed to get todoCreateViewStartTime!");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            long currentTimeMillis = System.currentTimeMillis();
            TodoSlardarPerfHitPoint aVar2 = TodoSlardarPerfHitPoint.f141078a;
            long j = currentTimeMillis - TodoSlardarPerfHitPoint.f141081d;
            if (j > ((long) 120000)) {
                Log.m165383e("TodoSlardarPerfHitPoint", "create view more than max limit");
                TodoSlardarPerfHitPoint aVar3 = TodoSlardarPerfHitPoint.f141078a;
                TodoSlardarPerfHitPoint.f141081d = -1;
                return;
            }
            jSONObject.put("key_todo_create_view_cost", j);
            TodoSlardarPerfHitPoint aVar4 = TodoSlardarPerfHitPoint.f141078a;
            TodoSlardarPerfHitPoint.f141081d = -1;
            Log.m165389i("TodoSlardarPerfHitPoint", "Start report create view data!");
            ApmAgent.monitorEvent("todo_cold_launch", null, jSONObject, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.framework.c.c.a$c */
    static final class RunnableC57212c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f141087a;

        RunnableC57212c(boolean z) {
            this.f141087a = z;
        }

        public final void run() {
            TodoSlardarPerfHitPoint aVar = TodoSlardarPerfHitPoint.f141078a;
            if (TodoSlardarPerfHitPoint.f141083f == -1) {
                Log.m165383e("TodoSlardarPerfHitPoint", "Failed to get todoFetchSDKDataStartTime!");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("key_todo_cold_launch_list_is_empty", this.f141087a);
            long currentTimeMillis = System.currentTimeMillis();
            TodoSlardarPerfHitPoint aVar2 = TodoSlardarPerfHitPoint.f141078a;
            long j = currentTimeMillis - TodoSlardarPerfHitPoint.f141083f;
            if (j > ((long) 120000)) {
                Log.m165383e("TodoSlardarPerfHitPoint", "fetch sdk more than max limit");
                TodoSlardarPerfHitPoint aVar3 = TodoSlardarPerfHitPoint.f141078a;
                TodoSlardarPerfHitPoint.f141083f = -1;
                return;
            }
            jSONObject.put("key_todo_sdk_data_cost", j);
            TodoSlardarPerfHitPoint aVar4 = TodoSlardarPerfHitPoint.f141078a;
            TodoSlardarPerfHitPoint.f141083f = -1;
            Log.m165389i("TodoSlardarPerfHitPoint", "Start report fetch SDK data!");
            ApmAgent.monitorEvent("todo_cold_launch", jSONObject2, jSONObject, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.framework.c.c.a$d */
    public static final class RunnableC57213d implements Runnable {

        /* renamed from: a */
        public static final RunnableC57213d f141088a = new RunnableC57213d();

        RunnableC57213d() {
        }

        public final void run() {
            TodoSlardarPerfHitPoint aVar = TodoSlardarPerfHitPoint.f141078a;
            if (TodoSlardarPerfHitPoint.f141082e == -1) {
                Log.m165383e("TodoSlardarPerfHitPoint", "Failed to get todoInitViewStartTime!");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            long currentTimeMillis = System.currentTimeMillis();
            TodoSlardarPerfHitPoint aVar2 = TodoSlardarPerfHitPoint.f141078a;
            long j = currentTimeMillis - TodoSlardarPerfHitPoint.f141082e;
            if (j > ((long) 120000)) {
                Log.m165383e("TodoSlardarPerfHitPoint", "init view more than max limit");
                TodoSlardarPerfHitPoint aVar3 = TodoSlardarPerfHitPoint.f141078a;
                TodoSlardarPerfHitPoint.f141082e = -1;
                return;
            }
            jSONObject.put("key_todo_init_view_cost", j);
            TodoSlardarPerfHitPoint aVar4 = TodoSlardarPerfHitPoint.f141078a;
            TodoSlardarPerfHitPoint.f141082e = -1;
            Log.m165389i("TodoSlardarPerfHitPoint", "Start report init view data!");
            ApmAgent.monitorEvent("todo_cold_launch", null, jSONObject, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.framework.c.c.a$e */
    public static final class RunnableC57214e implements Runnable {

        /* renamed from: a */
        public static final RunnableC57214e f141089a = new RunnableC57214e();

        RunnableC57214e() {
        }

        public final void run() {
            TodoSlardarPerfHitPoint aVar = TodoSlardarPerfHitPoint.f141078a;
            if (TodoSlardarPerfHitPoint.f141084g == -1) {
                Log.m165383e("TodoSlardarPerfHitPoint", "Failed to get todoInitialStartTime!");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            long currentTimeMillis = System.currentTimeMillis();
            TodoSlardarPerfHitPoint aVar2 = TodoSlardarPerfHitPoint.f141078a;
            long j = currentTimeMillis - TodoSlardarPerfHitPoint.f141084g;
            if (j > ((long) 120000)) {
                Log.m165383e("TodoSlardarPerfHitPoint", "fragment initial more than max limit");
                TodoSlardarPerfHitPoint aVar3 = TodoSlardarPerfHitPoint.f141078a;
                TodoSlardarPerfHitPoint.f141084g = -1;
                return;
            }
            jSONObject.put("key_todo_initial_fragment_cost", j);
            TodoSlardarPerfHitPoint aVar4 = TodoSlardarPerfHitPoint.f141078a;
            TodoSlardarPerfHitPoint.f141084g = -1;
            Log.m165389i("TodoSlardarPerfHitPoint", "Start report initial data!");
            ApmAgent.monitorEvent("todo_cold_launch", null, jSONObject, null);
        }
    }

    /* renamed from: a */
    public final void mo194233a(boolean z) {
        if (!f141079b) {
            f141079b = true;
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getCachedThreadPool().execute(new RunnableC57210a(z));
        }
    }

    /* renamed from: b */
    public final void mo194235b(boolean z) {
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().execute(new RunnableC57212c(z));
    }
}
