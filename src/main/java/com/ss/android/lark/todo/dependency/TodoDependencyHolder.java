package com.ss.android.lark.todo.dependency;

import com.ss.android.lark.todo.impl.features.common.featuregating.TodoFeatureGating;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8FX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/todo/dependency/TodoDependencyHolder;", "", "()V", "dependency", "Lcom/ss/android/lark/todo/dependency/ITodoDependency;", "getDependency", "()Lcom/ss/android/lark/todo/dependency/ITodoDependency;", "dependency$delegate", "Lkotlin/Lazy;", "featureGating", "Lcom/ss/android/lark/todo/impl/features/common/featuregating/TodoFeatureGating;", "getFeatureGating", "()Lcom/ss/android/lark/todo/impl/features/common/featuregating/TodoFeatureGating;", "featureGating$delegate", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.dependency.c */
public final class TodoDependencyHolder {

    /* renamed from: a */
    public static final TodoDependencyHolder f139242a = new TodoDependencyHolder();

    /* renamed from: b */
    private static final Lazy f139243b = LazyKt.lazy(C56261a.INSTANCE);

    /* renamed from: c */
    private static final Lazy f139244c = LazyKt.lazy(C56262b.INSTANCE);

    /* renamed from: a */
    public final ITodoDependency mo191730a() {
        return (ITodoDependency) f139243b.getValue();
    }

    /* renamed from: b */
    public final TodoFeatureGating mo191731b() {
        return (TodoFeatureGating) f139244c.getValue();
    }

    private TodoDependencyHolder() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/common/featuregating/TodoFeatureGating;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.dependency.c$b */
    static final class C56262b extends Lambda implements Function0<TodoFeatureGating> {
        public static final C56262b INSTANCE = new C56262b();

        C56262b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoFeatureGating invoke() {
            return new TodoFeatureGating();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/dependency/ITodoDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.dependency.c$a */
    static final class C56261a extends Lambda implements Function0<ITodoDependency> {
        public static final C56261a INSTANCE = new C56261a();

        C56261a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ITodoDependency invoke() {
            return (ITodoDependency) ApiUtils.getApi(ITodoDependency.class);
        }
    }
}
