package com.ss.android.lark.todo.impl.rustadapter.push;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.bytedance.lark.pb.todo.v1.TodoSetting;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.p2789a.AbstractC56259u;
import com.ss.android.lark.todo.impl.rustadapter.push.entity.TodoChangeNotificationUnit;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u0000  2\u00020\u0001:\u0002 !B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0006J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0004J\u0006\u0010\u001b\u001a\u00020\u0012J\b\u0010\u001c\u001a\u00020\u0012H\u0002J\b\u0010\u001d\u001a\u00020\u0012H\u0002J\b\u0010\u001e\u001a\u00020\u0012H\u0002J\b\u0010\u001f\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoListPushManager;", "", "()V", "mIsOnTodoTab", "", "mPushListener", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoListPushManager$IPushListener;", "mTimeFormatChangeListener", "Lcom/ss/android/lark/todo/dependency/idependency/ITimeFormatDependency$ITimeFormatChangeListener;", "mTimeFormatPushDirty", "mTodoChangeNotification", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushHandleCallBack;", "mTodoPushDirty", "mTodoSettingNotification", "mTodoSettingPushDirty", "mTodoViewsChangeNotification", "mTodoViewsPushDirty", "registerPush", "", "registerTimeFormatChangePush", "registerTodoChangeNotificationPush", "registerTodoSettingPush", "registerTodoViewsChangeNotificationPush", "setPushListener", "pushListener", "switchTab", "isTodoTab", "unRegisterPush", "unRegisterTimeFormatChangePush", "unRegisterTodoChangeNotificationPush", "unRegisterTodoSettingPush", "unRegisterTodoViewsChangeNotificationPush", "Companion", "IPushListener", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.rustadapter.push.a */
public final class TodoListPushManager {

    /* renamed from: g */
    public static final Companion f141120g = new Companion(null);

    /* renamed from: a */
    public IPushListener f141121a;

    /* renamed from: b */
    public boolean f141122b = true;

    /* renamed from: c */
    public boolean f141123c;

    /* renamed from: d */
    public boolean f141124d;

    /* renamed from: e */
    public boolean f141125e;

    /* renamed from: f */
    public boolean f141126f;

    /* renamed from: h */
    private TodoPushHandleCallBack f141127h;

    /* renamed from: i */
    private TodoPushHandleCallBack f141128i;

    /* renamed from: j */
    private AbstractC56259u.AbstractC56260a f141129j;

    /* renamed from: k */
    private TodoPushHandleCallBack f141130k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoListPushManager$IPushListener;", "", "onLoadAllTodo", "", "onLoadTodoViews", "onRefreshTimeFormat", "onRefreshTodoByPush", "pushData", "Lcom/ss/android/lark/todo/impl/rustadapter/push/entity/TodoChangeNotificationUnit;", "onRefreshTodoSetting", "todoSetting", "Lcom/bytedance/lark/pb/todo/v1/TodoSetting;", "onRefreshTodoViewsByPush", "list", "", "Lcom/bytedance/lark/pb/todo/v1/TodoListView;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.push.a$b */
    public interface IPushListener {
        /* renamed from: a */
        void mo193283a();

        /* renamed from: a */
        void mo193284a(TodoSetting todoSetting);

        /* renamed from: a */
        void mo193285a(TodoChangeNotificationUnit todoChangeNotificationUnit);

        /* renamed from: a */
        void mo193286a(List<TodoListView> list);

        /* renamed from: b */
        void mo193287b();

        /* renamed from: c */
        void mo193288c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoListPushManager$Companion;", "", "()V", "TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.push.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g */
    private final void m221956g() {
        if (this.f141130k != null) {
            TodoPushProcess.f141135a.mo194372b(Command.PUSH_TODO_SETTING_CHANGE_NOTIFICATION, this.f141130k);
        }
    }

    /* renamed from: i */
    private final void m221958i() {
        if (this.f141127h != null) {
            TodoPushProcess.f141135a.mo194372b(Command.PUSH_TODOS_CHANGED_NOTIFICATION, this.f141127h);
        }
    }

    /* renamed from: j */
    private final void m221959j() {
        if (this.f141128i != null) {
            TodoPushProcess.f141135a.mo194372b(Command.PUSH_TODO_VIEWS_CHANGED_NOTIFICATION, this.f141128i);
        }
    }

    /* renamed from: a */
    public final void mo194366a() {
        m221952c();
        m221953d();
        m221954e();
        m221955f();
    }

    /* renamed from: b */
    public final void mo194369b() {
        m221958i();
        m221959j();
        m221957h();
        m221956g();
    }

    /* renamed from: c */
    private final void m221952c() {
        this.f141127h = new C57286d(this);
        TodoPushProcess.f141135a.mo194371a(Command.PUSH_TODOS_CHANGED_NOTIFICATION, this.f141127h);
    }

    /* renamed from: d */
    private final void m221953d() {
        this.f141128i = new C57288f(this);
        TodoPushProcess.f141135a.mo194371a(Command.PUSH_TODO_VIEWS_CHANGED_NOTIFICATION, this.f141128i);
    }

    /* renamed from: e */
    private final void m221954e() {
        this.f141129j = new C57285c(this);
        TodoDependencyHolder.f139242a.mo191730a().timeFormatDependency().mo145432a(this.f141129j);
    }

    /* renamed from: f */
    private final void m221955f() {
        this.f141130k = new C57287e(this);
        TodoPushProcess.f141135a.mo194371a(Command.PUSH_TODO_SETTING_CHANGE_NOTIFICATION, this.f141130k);
    }

    /* renamed from: h */
    private final void m221957h() {
        if (this.f141129j != null) {
            TodoDependencyHolder.f139242a.mo191730a().timeFormatDependency().mo145433b(this.f141129j);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onTimeFormatChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.push.a$c */
    public static final class C57285c implements AbstractC56259u.AbstractC56260a {

        /* renamed from: a */
        final /* synthetic */ TodoListPushManager f141131a;

        C57285c(TodoListPushManager aVar) {
            this.f141131a = aVar;
        }

        @Override // com.ss.android.lark.todo.dependency.p2789a.AbstractC56259u.AbstractC56260a
        /* renamed from: a */
        public final void mo191729a() {
            if (!this.f141131a.f141122b) {
                Log.m165389i("TodoListPushManager", LogMessageUtil.f139260a.mo191769b("dirty_pushTimeFormatChange"));
                this.f141131a.f141125e = true;
                return;
            }
            Log.m165389i("TodoListPushManager", LogMessageUtil.f139260a.mo191769b("pushTimeFormatChange"));
            IPushListener bVar = this.f141131a.f141121a;
            if (bVar != null) {
                bVar.mo193283a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/push/TodoListPushManager$registerTodoChangeNotificationPush$1", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushHandleCallBack;", "onPush", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.push.a$d */
    public static final class C57286d implements TodoPushHandleCallBack {

        /* renamed from: a */
        final /* synthetic */ TodoListPushManager f141132a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57286d(TodoListPushManager aVar) {
            this.f141132a = aVar;
        }

        @Override // com.ss.android.lark.todo.impl.rustadapter.push.TodoPushHandleCallBack
        /* renamed from: a */
        public void mo191795a(JSONObject jSONObject) {
            IPushListener bVar;
            Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (!this.f141132a.f141122b) {
                Log.m165389i("TodoListPushManager", LogMessageUtil.f139260a.mo191769b("dirty_pushTodoChangeNotification"));
                this.f141132a.f141123c = true;
                return;
            }
            Log.m165389i("TodoListPushManager", LogMessageUtil.f139260a.mo191769b("pushTodoChangeNotification"));
            Object obj = jSONObject.get("todo_change_notification");
            if (obj != null) {
                Intrinsics.checkExpressionValueIsNotNull(obj, "data[TodoPushConstants.K…E_NOTIFICATION] ?: return");
                if ((obj instanceof TodoChangeNotificationUnit) && (bVar = this.f141132a.f141121a) != null) {
                    bVar.mo193285a((TodoChangeNotificationUnit) obj);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/push/TodoListPushManager$registerTodoSettingPush$1", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushHandleCallBack;", "onPush", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.push.a$e */
    public static final class C57287e implements TodoPushHandleCallBack {

        /* renamed from: a */
        final /* synthetic */ TodoListPushManager f141133a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57287e(TodoListPushManager aVar) {
            this.f141133a = aVar;
        }

        @Override // com.ss.android.lark.todo.impl.rustadapter.push.TodoPushHandleCallBack
        /* renamed from: a */
        public void mo191795a(JSONObject jSONObject) {
            IPushListener bVar;
            Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (!this.f141133a.f141122b) {
                Log.m165389i("TodoListPushManager", LogMessageUtil.f139260a.mo191769b("dirty_todo_setting_push"));
                this.f141133a.f141126f = true;
                return;
            }
            Log.m165389i("TodoListPushManager", LogMessageUtil.f139260a.mo191769b("todo_setting_push"));
            Object obj = jSONObject.get("todo_setting_push");
            if (obj != null) {
                Intrinsics.checkExpressionValueIsNotNull(obj, "data[TodoPushConstants.K…S_TODO_SETTING] ?: return");
                if ((obj instanceof TodoSetting) && (bVar = this.f141133a.f141121a) != null) {
                    bVar.mo193284a((TodoSetting) obj);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/rustadapter/push/TodoListPushManager$registerTodoViewsChangeNotificationPush$1", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushHandleCallBack;", "onPush", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.push.a$f */
    public static final class C57288f implements TodoPushHandleCallBack {

        /* renamed from: a */
        final /* synthetic */ TodoListPushManager f141134a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57288f(TodoListPushManager aVar) {
            this.f141134a = aVar;
        }

        @Override // com.ss.android.lark.todo.impl.rustadapter.push.TodoPushHandleCallBack
        /* renamed from: a */
        public void mo191795a(JSONObject jSONObject) {
            IPushListener bVar;
            Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (!this.f141134a.f141122b) {
                Log.m165389i("TodoListPushManager", LogMessageUtil.f139260a.mo191769b("dirty_pushTodoViewsChangeNotification"));
                this.f141134a.f141124d = true;
                return;
            }
            Log.m165389i("TodoListPushManager", LogMessageUtil.f139260a.mo191769b("pushTodoViewsChangeNotification"));
            Object obj = jSONObject.get("todo_views_change_notification");
            if (obj != null) {
                Intrinsics.checkExpressionValueIsNotNull(obj, "data[TodoPushConstants.K…                ?: return");
                if ((obj instanceof List) && (bVar = this.f141134a.f141121a) != null) {
                    bVar.mo193286a((List) obj);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo194367a(IPushListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "pushListener");
        this.f141121a = bVar;
    }

    /* renamed from: a */
    public final void mo194368a(boolean z) {
        this.f141122b = z;
        if (z) {
            if (this.f141123c) {
                Log.m165389i("TodoListPushManager", LogMessageUtil.f139260a.mo191769b("todoPush"));
                IPushListener bVar = this.f141121a;
                if (bVar != null) {
                    bVar.mo193287b();
                }
            }
            if (this.f141124d) {
                Log.m165389i("TodoListPushManager", LogMessageUtil.f139260a.mo191769b("todoViewsPush"));
                IPushListener bVar2 = this.f141121a;
                if (bVar2 != null) {
                    bVar2.mo193288c();
                }
            }
            if (this.f141125e) {
                Log.m165389i("TodoListPushManager", LogMessageUtil.f139260a.mo191769b("timeFormatPush"));
                IPushListener bVar3 = this.f141121a;
                if (bVar3 != null) {
                    bVar3.mo193283a();
                }
            }
            if (this.f141126f) {
                Log.m165389i("TodoListPushManager", LogMessageUtil.f139260a.mo191769b("todoSettingPush"));
                IPushListener bVar4 = this.f141121a;
                if (bVar4 != null) {
                    bVar4.mo193288c();
                }
            }
            this.f141123c = false;
            this.f141124d = false;
            this.f141125e = false;
            this.f141126f = false;
        }
    }
}
