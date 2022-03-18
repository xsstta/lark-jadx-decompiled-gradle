package com.ss.android.lark.calendar.dependency.idependency;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/dependency/idependency/IAccountChangeDependency;", "", "registerAccountChangeListner", "", "listner", "Lcom/ss/android/lark/calendar/dependency/idependency/IAccountChangeDependency$IAccountChangeListner;", "IAccountChangeListner", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.a.a.a */
public interface IAccountChangeDependency {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/dependency/idependency/IAccountChangeDependency$IAccountChangeListner;", "", "onAccountChange", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.a.a.a$a */
    public interface IAccountChangeListner {
        void onAccountChange();
    }

    /* renamed from: a */
    void mo108149a(IAccountChangeListner aVar);
}
