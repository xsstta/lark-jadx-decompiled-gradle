package com.ss.android.lark.todo.dependency.idependency;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/todo/dependency/idependency/IAppLifeCycleDependency;", "", "addAppStateChangeListener", "", "listener", "Lcom/ss/android/lark/todo/dependency/idependency/IAppLifeCycleDependency$IAppStateChangeListener;", "removeAppStateChangeListener", "IAppStateChangeListener", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.dependency.a.c */
public interface IAppLifeCycleDependency {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/todo/dependency/idependency/IAppLifeCycleDependency$IAppStateChangeListener;", "", "onAppStateChange", "", "isAppFronted", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.dependency.a.c$a */
    public interface IAppStateChangeListener {
        /* renamed from: a */
        void mo191728a(boolean z);
    }

    /* renamed from: a */
    void mo145365a(IAppStateChangeListener aVar);

    /* renamed from: b */
    void mo145366b(IAppStateChangeListener aVar);
}
