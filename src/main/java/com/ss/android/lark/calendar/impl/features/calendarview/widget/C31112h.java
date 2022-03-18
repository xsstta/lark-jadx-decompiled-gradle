package com.ss.android.lark.calendar.impl.features.calendarview.widget;

import android.widget.ScrollView;
import com.ss.android.lark.calendar.impl.features.common.widget.scrollview.MutableScrollView;
import com.ss.android.lark.calendar.impl.features.common.widget.scrollview.OverScrollView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.widget.h */
public class C31112h {

    /* renamed from: a */
    public List<OverScrollView> f78580a = new ArrayList();

    /* renamed from: b */
    private MutableScrollView.AbstractC31234a f78581b = new MutableScrollView.AbstractC31234a() {
        /* class com.ss.android.lark.calendar.impl.features.calendarview.widget.C31112h.C311131 */

        /* renamed from: b */
        private ScrollView f78583b;

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.scrollview.MutableScrollView.AbstractC31234a
        /* renamed from: a */
        public boolean mo112684a() {
            if (this.f78583b != null) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.scrollview.MutableScrollView.AbstractC31234a
        /* renamed from: b */
        public void mo112685b() {
            C31112h.this.mo112680a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.scrollview.MutableScrollView.AbstractC31234a
        /* renamed from: a */
        public void mo112683a(ScrollView scrollView) {
            this.f78583b = scrollView;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.scrollview.MutableScrollView.AbstractC31234a
        /* renamed from: a */
        public void mo112682a(int i, int i2) {
            for (OverScrollView overScrollView : C31112h.this.f78580a) {
                if (overScrollView != this.f78583b) {
                    overScrollView.scrollTo(i, i2);
                }
            }
        }
    };

    /* renamed from: a */
    public void mo112680a() {
        for (OverScrollView overScrollView : this.f78580a) {
            overScrollView.mo113352c();
        }
    }

    /* renamed from: a */
    public void mo112681a(OverScrollView overScrollView) {
        if (!this.f78580a.contains(overScrollView)) {
            this.f78580a.add(overScrollView);
            overScrollView.setOnScrollChangedListener(this.f78581b);
        }
    }
}
