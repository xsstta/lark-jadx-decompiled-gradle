package com.ss.android.lark.todo.impl.features.badge;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\bJ\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/badge/ITodoBadgeManager;", "", "register", "", "listener", "Lcom/ss/android/lark/todo/impl/features/badge/ITodoBadgeManager$TodoBadgeChangeListener;", "reload", "unRegister", "TodoBadgeChangeListener", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.a.a */
public interface ITodoBadgeManager {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/badge/ITodoBadgeManager$TodoBadgeChangeListener;", "", "onTodoBadgeCountChanged", "", "badgeCount", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.a.a$a */
    public interface TodoBadgeChangeListener {
        /* renamed from: a */
        void mo191786a(int i);
    }
}
