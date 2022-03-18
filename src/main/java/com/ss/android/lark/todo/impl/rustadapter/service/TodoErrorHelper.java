package com.ss.android.lark.todo.impl.rustadapter.service;

import com.larksuite.suite.R;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.todo.impl.framework.config.TodoConfig;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/todo/impl/rustadapter/service/TodoErrorHelper;", "", "()V", "ERROR_CODE_ASSIGNEE_MAX_LIMIT", "", "ERROR_CODE_FOLLOWER_MAX_LIMIT", "todoConfig", "Lcom/ss/android/lark/todo/impl/framework/config/TodoConfig;", "getTodoConfig", "()Lcom/ss/android/lark/todo/impl/framework/config/TodoConfig;", "todoConfig$delegate", "Lkotlin/Lazy;", "getAssigneeMaxLimitMsg", "", "getFollowerMaxLimitMsg", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.d */
public final class TodoErrorHelper {

    /* renamed from: a */
    public static final TodoErrorHelper f141112a = new TodoErrorHelper();

    /* renamed from: b */
    private static final Lazy f141113b = LazyKt.lazy(C57233a.INSTANCE);

    /* renamed from: c */
    private final TodoConfig m221839c() {
        return (TodoConfig) f141113b.getValue();
    }

    private TodoErrorHelper() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/framework/config/TodoConfig;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.rustadapter.a.d$a */
    static final class C57233a extends Lambda implements Function0<TodoConfig> {
        public static final C57233a INSTANCE = new C57233a();

        C57233a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoConfig invoke() {
            return (TodoConfig) SettingManager.getInstance().get(TodoConfig.class);
        }
    }

    /* renamed from: a */
    public final String mo194283a() {
        return ResUtil.f139261a.mo191778a(R.string.Todo_Task_MemberLimitToast, "num", String.valueOf(m221839c().mo194247a()));
    }

    /* renamed from: b */
    public final String mo194284b() {
        return ResUtil.f139261a.mo191778a(R.string.Todo_Task_FollowerLimitToast, "num", String.valueOf(m221839c().mo194248b()));
    }
}
