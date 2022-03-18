package com.ss.android.lark.todo.impl.features.mainview.entity;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0001\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoSceneType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "TODO_UNDEFINED", "SINGLE_MESSAGE", "MULTIPLE_MESSAGES", "MESSAGE_AFTER_FORWARDING", "MESSAGE_TOOLBAR", "INPUT_BOX", "CHAT_TODO_LIST", "TODO_ALL", "TODO_ASSIGIN_FROM_ME", "TODO_ASSIGN_TO_ME", "TODO_COMPLETED", "TODO_FOLLOWED", "TODO_FROM_DOCS", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum TodoSceneType {
    TODO_UNDEFINED(0),
    SINGLE_MESSAGE(1),
    MULTIPLE_MESSAGES(2),
    MESSAGE_AFTER_FORWARDING(3),
    MESSAGE_TOOLBAR(4),
    INPUT_BOX(5),
    CHAT_TODO_LIST(6),
    TODO_ALL(15),
    TODO_ASSIGIN_FROM_ME(16),
    TODO_ASSIGN_TO_ME(17),
    TODO_COMPLETED(18),
    TODO_FOLLOWED(19),
    TODO_FROM_DOCS(20);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    @JvmStatic
    public static final TodoSceneType valueOf(int i) {
        return Companion.mo193197a(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoSceneType$Companion;", "", "()V", "valueOf", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoSceneType;", "value", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.entity.TodoSceneType$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final TodoSceneType mo193197a(int i) {
            switch (i) {
                case 1:
                    return TodoSceneType.SINGLE_MESSAGE;
                case 2:
                    return TodoSceneType.MULTIPLE_MESSAGES;
                case 3:
                    return TodoSceneType.MESSAGE_AFTER_FORWARDING;
                case 4:
                    return TodoSceneType.MESSAGE_TOOLBAR;
                case 5:
                    return TodoSceneType.INPUT_BOX;
                case 6:
                    return TodoSceneType.CHAT_TODO_LIST;
                default:
                    switch (i) {
                        case 15:
                            return TodoSceneType.TODO_ALL;
                        case 16:
                            return TodoSceneType.TODO_ASSIGIN_FROM_ME;
                        case 17:
                            return TodoSceneType.TODO_ASSIGN_TO_ME;
                        case 18:
                            return TodoSceneType.TODO_COMPLETED;
                        case 19:
                            return TodoSceneType.TODO_FOLLOWED;
                        case 20:
                            return TodoSceneType.TODO_FROM_DOCS;
                        default:
                            return TodoSceneType.TODO_UNDEFINED;
                    }
            }
        }
    }

    public final int getValue() {
        return this.value;
    }

    private TodoSceneType(int i) {
        this.value = i;
    }
}
