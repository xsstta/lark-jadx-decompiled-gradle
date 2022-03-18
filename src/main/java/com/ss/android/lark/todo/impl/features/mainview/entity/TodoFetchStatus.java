package com.ss.android.lark.todo.impl.features.mainview.entity;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFetchStatus;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NONE", "LOADING", "FIRST_PAGE_FAILED", "NEXT_PAGE_FAILED", "SUCCESS", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum TodoFetchStatus {
    NONE(1),
    LOADING(2),
    FIRST_PAGE_FAILED(3),
    NEXT_PAGE_FAILED(4),
    SUCCESS(5);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    @JvmStatic
    public static final TodoFetchStatus valueOf(int i) {
        return Companion.mo193193a(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFetchStatus$Companion;", "", "()V", "valueOf", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFetchStatus;", "value", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.entity.TodoFetchStatus$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final TodoFetchStatus mo193193a(int i) {
            if (i == 1) {
                return TodoFetchStatus.NONE;
            }
            if (i == 2) {
                return TodoFetchStatus.LOADING;
            }
            if (i == 3) {
                return TodoFetchStatus.FIRST_PAGE_FAILED;
            }
            if (i == 4) {
                return TodoFetchStatus.NEXT_PAGE_FAILED;
            }
            if (i != 5) {
                return TodoFetchStatus.NONE;
            }
            return TodoFetchStatus.SUCCESS;
        }
    }

    public final int getValue() {
        return this.value;
    }

    private TodoFetchStatus(int i) {
        this.value = i;
    }
}
