package com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.adapter;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/pickerview/adapter/TwelveHourWheelAdapter;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/pickerview/adapter/BaseWheelAdapter;", "", "()V", "getItem", "index", "(I)Ljava/lang/Integer;", "getItemsCount", "getMaxTextExample", "", "indexOf", "item", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.a.h */
public final class TwelveHourWheelAdapter implements AbstractC31902b<Integer> {
    @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.AbstractC31902b
    /* renamed from: a */
    public int mo116503a() {
        return 12;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.AbstractC31902b
    /* renamed from: b */
    public String mo116508b() {
        return "12";
    }

    /* renamed from: c */
    public int mo116520c(int i) {
        if (i != 12) {
            return i;
        }
        return 0;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.AbstractC31902b
    /* renamed from: a */
    public /* synthetic */ int mo116504a(Integer num) {
        return mo116520c(num.intValue());
    }

    /* renamed from: a */
    public Integer mo116507b(int i) {
        if (i == 0) {
            i = 12;
        } else {
            int a = mo116503a();
            if (i < 0 || a <= i) {
                i = 0;
            }
        }
        return Integer.valueOf(i);
    }
}
