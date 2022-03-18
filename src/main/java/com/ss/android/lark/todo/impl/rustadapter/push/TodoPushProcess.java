package com.ss.android.lark.todo.impl.rustadapter.push;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.todo.v1.ChangedTodoCollection;
import com.bytedance.lark.pb.todo.v1.PushTodoBadgeChangedNotification;
import com.bytedance.lark.pb.todo.v1.PushTodoComment;
import com.bytedance.lark.pb.todo.v1.PushTodoCommentReaction;
import com.bytedance.lark.pb.todo.v1.PushTodoReminder;
import com.bytedance.lark.pb.todo.v1.PushTodoSettingChangeNotification;
import com.bytedance.lark.pb.todo.v1.PushTodoViewsChangedNotification;
import com.bytedance.lark.pb.todo.v1.PushTodosChangedNotification;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.todo.impl.rustadapter.push.entity.TodoChangeNotificationUnit;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushProcess;", "", "()V", "command2PushListenerMap", "", "Lcom/bytedance/lark/pb/basic/v1/Command;", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushProcess$TodoPushHandler;", "parsePush", "Lcom/alibaba/fastjson/JSONObject;", "cmd", "request", "", "pushTodoBadgeNotification", "pushTodoChangeNotification", "pushTodoCommentNotification", "pushTodoCommentReactionNotification", "pushTodoReminderNotification", "pushTodoSettingNotification", "pushTodoViewsChangeNotification", "registerPushServiceListener", "", "command", "listener", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushHandleCallBack;", "unRegisterPushServiceListener", "TodoPushHandler", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.rustadapter.push.c */
public final class TodoPushProcess {

    /* renamed from: a */
    public static final TodoPushProcess f141135a = new TodoPushProcess();

    /* renamed from: b */
    private static Map<Command, TodoPushHandler> f141136b = new EnumMap(Command.class);

    private TodoPushProcess() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\b\u0010\f\u001a\u00020\nH\u0002J(\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushProcess$TodoPushHandler;", "Lcom/ss/android/lark/sdk/PushDispatcher$ISdkPushListener;", "cmd", "Lcom/bytedance/lark/pb/basic/v1/Command;", "(Lcom/bytedance/lark/pb/basic/v1/Command;)V", "listeners", "", "Ljava/lang/ref/WeakReference;", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushHandleCallBack;", "addListener", "", "listener", "checkListeners", "onPush", "request", "", "sid", "", "fromServerPipe", "", "offlinePush", "removeListener", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.push.c$a */
    public static final class TodoPushHandler implements C53248k.AbstractC53250a {

        /* renamed from: a */
        public List<WeakReference<TodoPushHandleCallBack>> f141137a = new ArrayList();

        /* renamed from: b */
        private final Command f141138b;

        /* renamed from: a */
        private final void m221986a() {
            if (this.f141137a.size() == 0) {
                C53248k.m205912a().mo181696a(this.f141138b);
                TodoPushProcess cVar = TodoPushProcess.f141135a;
                TodoPushProcess.f141136b.remove(this.f141138b);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.rustadapter.push.c$a$a */
        static final class RunnableC57289a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ TodoPushHandler f141139a;

            /* renamed from: b */
            final /* synthetic */ JSONObject f141140b;

            RunnableC57289a(TodoPushHandler aVar, JSONObject jSONObject) {
                this.f141139a = aVar;
                this.f141140b = jSONObject;
            }

            public final void run() {
                for (WeakReference<TodoPushHandleCallBack> weakReference : this.f141139a.f141137a) {
                    TodoPushHandleCallBack bVar = weakReference.get();
                    if (bVar != null) {
                        bVar.mo191795a(this.f141140b);
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo194373a(TodoPushHandleCallBack bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "listener");
            this.f141137a.add(new WeakReference<>(bVar));
        }

        public TodoPushHandler(Command command) {
            Intrinsics.checkParameterIsNotNull(command, "cmd");
            this.f141138b = command;
        }

        /* renamed from: b */
        public final void mo194374b(TodoPushHandleCallBack bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "listener");
            ArrayList arrayList = new ArrayList();
            for (T t : this.f141137a) {
                T t2 = t;
                boolean z = true;
                if (t2.get() == null || !(!Intrinsics.areEqual((TodoPushHandleCallBack) t2.get(), bVar))) {
                    z = false;
                }
                if (z) {
                    arrayList.add(t);
                }
            }
            this.f141137a = CollectionsKt.toMutableList((Collection) arrayList);
            m221986a();
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            Intrinsics.checkParameterIsNotNull(bArr, "request");
            Intrinsics.checkParameterIsNotNull(str, "sid");
            JSONObject a = TodoPushProcess.f141135a.mo194370a(this.f141138b, bArr);
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getUIExecutor().execute(new RunnableC57289a(this, a));
        }
    }

    /* renamed from: a */
    private final JSONObject m221975a(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            PushTodosChangedNotification decode = PushTodosChangedNotification.ADAPTER.decode(bArr);
            if (decode == null) {
                return jSONObject;
            }
            ChangedTodoCollection changedTodoCollection = decode.changed_todos;
            Boolean bool = decode.refresh_all;
            Intrinsics.checkExpressionValueIsNotNull(bool, "response.refresh_all");
            jSONObject.put((Object) "todo_change_notification", (Object) new TodoChangeNotificationUnit(changedTodoCollection, bool.booleanValue()));
            return jSONObject;
        } catch (IOException e) {
            Log.m165386e(e.getMessage(), e);
        }
    }

    /* renamed from: b */
    private final JSONObject m221977b(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            PushTodoViewsChangedNotification decode = PushTodoViewsChangedNotification.ADAPTER.decode(bArr);
            if (decode != null && CollectionUtils.isNotEmpty(decode.changed_todo_views)) {
                jSONObject.put((Object) "todo_views_change_notification", (Object) decode.changed_todo_views);
            }
        } catch (IOException e) {
            Log.m165386e(e.getMessage(), e);
        }
        return jSONObject;
    }

    /* renamed from: c */
    private final JSONObject m221978c(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            PushTodoReminder decode = PushTodoReminder.ADAPTER.decode(bArr);
            if (decode == null) {
                return jSONObject;
            }
            jSONObject.put((Object) "todo_overall_reminder", (Object) decode);
            return jSONObject;
        } catch (IOException e) {
            Log.m165386e(e.getMessage(), e);
        }
    }

    /* renamed from: d */
    private final JSONObject m221979d(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            PushTodoSettingChangeNotification decode = PushTodoSettingChangeNotification.ADAPTER.decode(bArr);
            if (decode == null) {
                return jSONObject;
            }
            jSONObject.put((Object) "todo_setting_push", (Object) decode.setting);
            return jSONObject;
        } catch (IOException e) {
            Log.m165386e(e.getMessage(), e);
        }
    }

    /* renamed from: e */
    private final JSONObject m221980e(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            PushTodoComment decode = PushTodoComment.ADAPTER.decode(bArr);
            if (decode == null) {
                return jSONObject;
            }
            jSONObject.put((Object) "todo_comment_notification", (Object) decode);
            return jSONObject;
        } catch (IOException e) {
            Log.m165386e(e.getMessage(), e);
        }
    }

    /* renamed from: f */
    private final JSONObject m221981f(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            PushTodoCommentReaction decode = PushTodoCommentReaction.ADAPTER.decode(bArr);
            if (decode == null) {
                return jSONObject;
            }
            jSONObject.put((Object) "todo_comment_reaction_notification", (Object) decode);
            return jSONObject;
        } catch (IOException e) {
            Log.m165386e(e.getMessage(), e);
        }
    }

    /* renamed from: g */
    private final JSONObject m221982g(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            PushTodoBadgeChangedNotification decode = PushTodoBadgeChangedNotification.ADAPTER.decode(bArr);
            if (decode == null) {
                return jSONObject;
            }
            jSONObject.put((Object) "todo_badge_changed", (Object) decode.count);
            return jSONObject;
        } catch (IOException e) {
            Log.m165386e(e.getMessage(), e);
        }
    }

    /* renamed from: b */
    public final synchronized void mo194372b(Command command, TodoPushHandleCallBack bVar) {
        TodoPushHandler aVar;
        Intrinsics.checkParameterIsNotNull(command, "command");
        if (!(bVar == null || (aVar = f141136b.get(command)) == null)) {
            aVar.mo194374b(bVar);
        }
    }

    /* renamed from: a */
    public final JSONObject mo194370a(Command command, byte[] bArr) {
        switch (C57290d.f141141a[command.ordinal()]) {
            case 1:
                return m221975a(bArr);
            case 2:
                return m221977b(bArr);
            case 3:
                return m221978c(bArr);
            case 4:
                return m221979d(bArr);
            case 5:
                return m221980e(bArr);
            case 6:
                return m221981f(bArr);
            case 7:
                return m221982g(bArr);
            default:
                return new JSONObject();
        }
    }

    /* renamed from: a */
    public final synchronized void mo194371a(Command command, TodoPushHandleCallBack bVar) {
        Intrinsics.checkParameterIsNotNull(command, "command");
        if (bVar != null) {
            TodoPushHandler aVar = f141136b.get(command);
            if (aVar != null) {
                aVar.mo194373a(bVar);
            } else {
                TodoPushHandler aVar2 = new TodoPushHandler(command);
                aVar2.mo194373a(bVar);
                f141136b.put(command, aVar2);
                C53248k.m205912a().mo181697a(command, aVar2);
            }
        }
    }
}
