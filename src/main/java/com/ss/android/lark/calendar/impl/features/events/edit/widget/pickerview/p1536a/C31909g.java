package com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a;

import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.a.g */
public class C31909g implements AbstractC31902b<String> {

    /* renamed from: a */
    List<String> f81507a;

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.AbstractC31902b
    /* renamed from: a */
    public int mo116503a() {
        return this.f81507a.size();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.AbstractC31902b
    /* renamed from: b */
    public String mo116508b() {
        return C32634ae.m125182b(R.string.Calendar_TimeFormat_DaysMobile);
    }

    public C31909g(List<String> list) {
        this.f81507a = list;
    }

    /* renamed from: a */
    public int mo116504a(String str) {
        return this.f81507a.indexOf(str);
    }

    /* renamed from: a */
    public String mo116507b(int i) {
        if (!CollectionUtils.isNotEmpty(this.f81507a) || i >= mo116503a()) {
            return "";
        }
        return this.f81507a.get(i);
    }
}
