package com.bytedance.ee.bear.reminder.p527a;

import android.content.Context;
import com.bytedance.ee.bear.reminder.model.EAlertTimeEvent;
import com.bytedance.ee.bear.widgets.wheelview.p572a.AbstractC11878a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.reminder.a.a */
public class C10613a implements AbstractC11878a {

    /* renamed from: a */
    private final List<EAlertTimeEvent> f28522a = new ArrayList();

    /* renamed from: b */
    private Context f28523b;

    @Override // com.bytedance.ee.bear.widgets.wheelview.p572a.AbstractC11878a
    /* renamed from: a */
    public int mo40121a() {
        return this.f28522a.size();
    }

    public C10613a(Context context) {
        this.f28523b = context;
    }

    /* renamed from: a */
    public int mo40122a(Object obj) {
        return this.f28522a.indexOf(obj);
    }

    /* renamed from: a */
    public void mo40124a(List<EAlertTimeEvent> list) {
        this.f28522a.clear();
        this.f28522a.addAll(list);
    }

    /* renamed from: a */
    public String mo40125b(int i) {
        if (i < 0 || i >= this.f28522a.size()) {
            return "";
        }
        return this.f28523b.getString(this.f28522a.get(i).getRes());
    }
}
