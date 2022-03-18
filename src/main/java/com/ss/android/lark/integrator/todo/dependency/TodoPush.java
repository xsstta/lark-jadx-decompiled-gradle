package com.ss.android.lark.integrator.todo.dependency;

import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.todo.dependency.entity.TodoNotice;
import com.ss.android.lark.todo.dependency.idependency.IPushDependency;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/integrator/todo/dependency/TodoPush;", "Lcom/ss/android/lark/todo/dependency/idependency/IPushDependency;", "()V", "onPushNotice", "", "notice", "Lcom/ss/android/lark/todo/dependency/entity/TodoNotice;", "messageId", "", "content", "title", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.todo.a.q */
public final class TodoPush implements IPushDependency {
    @Override // com.ss.android.lark.todo.dependency.idependency.IPushDependency
    /* renamed from: a */
    public void mo145423a(TodoNotice todoNotice, String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(todoNotice, "notice");
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        Intrinsics.checkParameterIsNotNull(str2, "content");
        Intrinsics.checkParameterIsNotNull(str3, "title");
        todoNotice.messageId = str;
        todoNotice.content = str2;
        todoNotice.title = str3;
        todoNotice.type = 10006;
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).pushNotice(todoNotice);
    }
}
