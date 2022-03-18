package com.ss.android.lark.todo.api;

import android.app.PendingIntent;
import android.content.Intent;
import com.ss.android.lark.todo.dependency.entity.TodoNotice;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u000bH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/todo/api/ITodoLifeCycle;", "", "getEventPendingIntent", "Landroid/app/PendingIntent;", "todoNotice", "Lcom/ss/android/lark/todo/dependency/entity/TodoNotice;", "getIntentForWsChannelOfflinePush", "Landroid/content/Intent;", "bizExtra", "", "todoModuleInit", "", "todoModuleUnInit", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.a.a */
public interface ITodoLifeCycle {
    /* renamed from: a */
    PendingIntent mo191649a(TodoNotice todoNotice);

    /* renamed from: a */
    Intent mo191650a(String str);
}
