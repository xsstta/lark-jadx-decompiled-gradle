package com.ss.android.lark.todo.api;

import android.app.Activity;
import android.content.Context;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.entity.BlockExtra;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.chat.entity.message.content.TodoContent;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\"\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\bH&J\u0016\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0014\u0018\u00010\u0013H&J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001a\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\bH&J\u0018\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0005H&J,\u0010!\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\u00052\b\u0010$\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'H&¨\u0006("}, d2 = {"Lcom/ss/android/lark/todo/api/ITodoModule;", "Lcom/ss/android/lark/todo/api/ITodoLifeCycle;", "checkChatHasDraft", "", "chatId", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "createTodo", "context", "Landroid/content/Context;", "blockEntity", "Lcom/larksuite/component/blockit/entity/BlockEntity;", "blockExtra", "Lcom/larksuite/component/blockit/entity/BlockExtra;", "createTodoFromAppLink", "isHorizontalAnimation", "getAbTestExperiments", "", "Lcom/ss/android/lark/abtest/api/experiment/LarkExperimentConfig;", "getPageName", "getTodoCardMessageTitle", "", "todoContent", "Lcom/ss/android/lark/chat/entity/message/content/TodoContent;", "getTodoService", "Lcom/ss/android/lark/todo/api/ITodoService;", "isChatInlineCreateTodoEnabled", "sendCreateTodoCard", "todoId", "showTodoGuideDialog", "createdTodoGuid", "startTodoDetailFromAppLink", "guid", "authScene", "authId", "startTodoSettingActivity", "activity", "Landroid/app/Activity;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.a.b */
public interface ITodoModule extends ITodoLifeCycle {
    /* renamed from: a */
    CharSequence mo191651a(TodoContent todoContent);

    /* renamed from: a */
    void mo191653a(Activity activity);

    /* renamed from: a */
    void mo191654a(Context context, BlockEntity blockEntity, BlockExtra blockExtra);

    /* renamed from: a */
    void mo191655a(Context context, String str);

    /* renamed from: a */
    void mo191658a(String str, String str2);

    /* renamed from: b */
    String mo191659b();

    /* renamed from: c */
    ITodoService mo191660c();

    /* renamed from: d */
    List<AbstractC28490a<?>> mo191661d();

    /* renamed from: e */
    boolean mo191662e();
}
