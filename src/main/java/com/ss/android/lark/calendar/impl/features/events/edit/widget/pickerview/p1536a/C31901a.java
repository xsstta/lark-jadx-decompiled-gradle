package com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a;

import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;

/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.a.a */
public class C31901a implements AbstractC31902b<String> {

    /* renamed from: a */
    private String[] f81482a = {C32634ae.m125182b(R.string.Calendar_StandardTime_AM), C32634ae.m125182b(R.string.Calendar_StandardTime_PM)};

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.AbstractC31902b
    /* renamed from: a */
    public int mo116503a() {
        return 2;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.AbstractC31902b
    /* renamed from: b */
    public String mo116508b() {
        return C32634ae.m125182b(R.string.Calendar_StandardTime_AM);
    }

    /* renamed from: a */
    public String mo116507b(int i) {
        if (i < 0 || i > 1) {
            return null;
        }
        return this.f81482a[i];
    }

    /* renamed from: a */
    public int mo116504a(String str) {
        if (str.equals(C32634ae.m125182b(R.string.Calendar_StandardTime_AM))) {
            return 0;
        }
        return 1;
    }
}
