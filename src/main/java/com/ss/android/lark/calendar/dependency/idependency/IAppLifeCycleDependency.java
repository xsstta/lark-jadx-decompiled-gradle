package com.ss.android.lark.calendar.dependency.idependency;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/dependency/idependency/IAppLifeCycleDependency;", "", "addAppStateChangeListener", "", "listener", "Lcom/ss/android/lark/calendar/dependency/idependency/IAppLifeCycleDependency$IAppStateChangeListener;", "removeAppStateChangeListener", "IAppStateChangeListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.a.a.b */
public interface IAppLifeCycleDependency {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/dependency/idependency/IAppLifeCycleDependency$IAppStateChangeListener;", "", "onAppStateChange", "", "isAppFronted", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.a.a.b$a */
    public interface IAppStateChangeListener {
        /* renamed from: a */
        void mo108207a(boolean z);
    }

    /* renamed from: a */
    void mo108205a(IAppStateChangeListener aVar);

    /* renamed from: b */
    void mo108206b(IAppStateChangeListener aVar);
}
