package com.ss.android.lark.p2567s.p2568a.p2569a;

import com.ss.android.lark.integrator.calendar.CalendarModuleProvider;
import com.ss.android.lark.integrator.moments.MomentsModuleProvider;
import com.ss.android.lark.integrator.todo.TodoModuleProvider;

/* renamed from: com.ss.android.lark.s.a.a.b */
public final class C53196b {
    /* renamed from: a */
    public static void m205838a(String str) {
        if (str != null) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -895956893:
                    if (str.equals("com.ss.android.lark.moments.api.MomentsModuleWrapper")) {
                        c = 0;
                        break;
                    }
                    break;
                case -886677250:
                    if (str.equals("com.ss.android.lark.calendar.wrapper.CalendarModuleWrapper")) {
                        c = 1;
                        break;
                    }
                    break;
                case -669424002:
                    if (str.equals("com.ss.android.lark.todo.wrapper.TodoModuleWrapper")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    MomentsModuleProvider.f101577b.mo144687b();
                    return;
                case 1:
                    CalendarModuleProvider.f100461b.mo143023b();
                    return;
                case 2:
                    TodoModuleProvider.f101780b.mo145355b();
                    return;
                default:
                    return;
            }
        }
    }
}
