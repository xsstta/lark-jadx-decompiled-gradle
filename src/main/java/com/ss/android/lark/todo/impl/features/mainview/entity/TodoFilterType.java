package com.ss.android.lark.todo.impl.features.mainview.entity;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "ALL", "ASSIGN_FROM_ME", "ASSIGN_TO_ME", "COMPLETED", "FOLLOWED", "FROM_DOCS", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum TodoFilterType {
    ALL(1),
    ASSIGN_FROM_ME(2),
    ASSIGN_TO_ME(3),
    COMPLETED(4),
    FOLLOWED(5),
    FROM_DOCS(6);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    @JvmStatic
    public static final TodoFilterType valueOf(int i) {
        return Companion.mo193195a(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType$Companion;", "", "()V", "valueOf", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;", "value", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final TodoFilterType mo193195a(int i) {
            switch (i) {
                case 1:
                    return TodoFilterType.ALL;
                case 2:
                    return TodoFilterType.ASSIGN_FROM_ME;
                case 3:
                    return TodoFilterType.ASSIGN_TO_ME;
                case 4:
                    return TodoFilterType.COMPLETED;
                case 5:
                    return TodoFilterType.FOLLOWED;
                case 6:
                    return TodoFilterType.FROM_DOCS;
                default:
                    return TodoFilterType.ALL;
            }
        }
    }

    public final int getValue() {
        return this.value;
    }

    private TodoFilterType(int i) {
        this.value = i;
    }
}
