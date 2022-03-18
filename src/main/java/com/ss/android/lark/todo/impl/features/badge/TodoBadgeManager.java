package com.ss.android.lark.todo.impl.features.badge;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.badge.ITodoBadgeManager;
import com.ss.android.lark.todo.impl.rustadapter.push.TodoPushHandleCallBack;
import com.ss.android.lark.todo.impl.rustadapter.push.TodoPushProcess;
import com.ss.android.lark.todo.impl.rustadapter.service.TodoRustCRUD;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u000b*\u0001\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\nH\u0002J\u0006\u0010\u0014\u001a\u00020\u001aJ\u0012\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010 \u001a\u00020\u001aH\u0016J\u0006\u0010!\u001a\u00020\u001aJ\b\u0010\"\u001a\u00020\u001aH\u0002J\u0012\u0010#\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u0016J\u000e\u0010$\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/badge/TodoBadgeManager;", "Lcom/ss/android/lark/todo/impl/features/badge/ITodoBadgeManager;", "()V", "TAG", "", "isInit", "", "listeners", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/ss/android/lark/todo/impl/features/badge/ITodoBadgeManager$TodoBadgeChangeListener;", "", "getListeners", "()Ljava/util/concurrent/ConcurrentHashMap;", "setListeners", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "mLastLoginUserId", "mPushListener", "com/ss/android/lark/todo/impl/features/badge/TodoBadgeManager$mPushListener$1", "Lcom/ss/android/lark/todo/impl/features/badge/TodoBadgeManager$mPushListener$1;", "mTodoBadgeCount", "pausePush", "getPausePush", "()Z", "setPausePush", "(Z)V", "getTodoBadge", "", "init", "notifyBadgeChanged", "badgeCount", "register", "listener", "reload", "resumePush", "unInit", "unRegister", "updateBadgeCount", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.a.b */
public final class TodoBadgeManager implements ITodoBadgeManager {

    /* renamed from: a */
    public static final TodoBadgeManager f139264a = new TodoBadgeManager();

    /* renamed from: b */
    private static ConcurrentHashMap<ITodoBadgeManager.TodoBadgeChangeListener, Integer> f139265b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static volatile boolean f139266c;

    /* renamed from: d */
    private static int f139267d;

    /* renamed from: e */
    private static String f139268e;

    /* renamed from: f */
    private static final C56269b f139269f = new C56269b();

    /* renamed from: g */
    private static boolean f139270g;

    /* renamed from: b */
    public final void mo191790b() {
        f139270g = false;
    }

    /* renamed from: c */
    public final void mo191793c() {
        f139270g = true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/badge/TodoBadgeManager$mPushListener$1", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushHandleCallBack;", "onPush", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.a.b$b */
    public static final class C56269b implements TodoPushHandleCallBack {
        C56269b() {
        }

        @Override // com.ss.android.lark.todo.impl.rustadapter.push.TodoPushHandleCallBack
        /* renamed from: a */
        public void mo191795a(JSONObject jSONObject) {
            Object obj;
            Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (!TodoBadgeManager.f139264a.mo191789a() && (obj = jSONObject.get("todo_badge_changed")) != null) {
                Intrinsics.checkExpressionValueIsNotNull(obj, "data[TodoPushConstants.K…_BADGE_CHANGED] ?: return");
                if (obj instanceof Integer) {
                    TodoBadgeManager.f139264a.mo191791b(((Number) obj).intValue());
                }
            }
        }
    }

    private TodoBadgeManager() {
    }

    /* renamed from: a */
    public final boolean mo191789a() {
        return f139270g;
    }

    /* renamed from: d */
    public void mo191794d() {
        m219620f();
    }

    /* renamed from: e */
    private final void m219619e() {
        if (!f139266c) {
            f139266c = true;
            TodoPushProcess.f141135a.mo194371a(Command.PUSH_TODO_BADGE_NOTIFICATION, f139269f);
        }
    }

    /* renamed from: f */
    private final void m219620f() {
        Job unused = C69553g.m266944a(GlobalScope.f173453a, Dispatchers.m266324b(), null, new C56268a(null), 2, null);
    }

    /* renamed from: a */
    public final void mo191787a(int i) {
        if (f139270g) {
            mo191791b(i);
        }
    }

    /* renamed from: b */
    public void mo191792b(ITodoBadgeManager.TodoBadgeChangeListener aVar) {
        ConcurrentHashMap<ITodoBadgeManager.TodoBadgeChangeListener, Integer> concurrentHashMap = f139265b;
        if (concurrentHashMap != null) {
            C69121n.m265993j(concurrentHashMap).remove(aVar);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
    }

    /* renamed from: a */
    public void mo191788a(ITodoBadgeManager.TodoBadgeChangeListener aVar) {
        if (aVar != null) {
            f139265b.put(aVar, 0);
        }
        String a = TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a();
        if (!TextUtils.equals(f139268e, a)) {
            f139268e = a;
            mo191794d();
        }
        if (f139266c) {
            mo191791b(f139267d);
        } else {
            m219619e();
        }
    }

    /* renamed from: b */
    public final void mo191791b(int i) {
        if (i < 0) {
            i = 0;
        }
        f139267d = i;
        for (ITodoBadgeManager.TodoBadgeChangeListener aVar : f139265b.keySet()) {
            if (aVar != null) {
                aVar.mo191786a(f139267d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.badge.TodoBadgeManager$getTodoBadge$1", mo239173f = "TodoBadgeManager.kt", mo239174i = {0}, mo239175l = {96}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.a.b$a */
    public static final class C56268a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;

        C56268a(Continuation cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56268a aVar = new C56268a(cVar);
            aVar.p$ = (CoroutineScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56268a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i;
            Object a = C69086a.m265828a();
            int i2 = this.label;
            if (i2 == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TodoRustCRUD fVar = TodoRustCRUD.f141115a;
                this.L$0 = ahVar;
                this.label = 1;
                obj = fVar.mo194312a(this);
                if (obj == a) {
                    return a;
                }
            } else if (i2 == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Integer num = (Integer) obj;
            Log.m165389i("TodoBadgeManager", "getTodoBadge = " + num);
            TodoBadgeManager bVar = TodoBadgeManager.f139264a;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            bVar.mo191791b(i);
            return Unit.INSTANCE;
        }
    }
}
