package com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget;

import android.content.Context;
import java.util.Arrays;

/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.f */
public class C31822f extends AbstractC31820d {

    /* renamed from: d */
    private final int f81051d = 31;

    /* renamed from: e */
    private String[] f81052e;

    /* renamed from: f */
    private Boolean f81053f = false;

    /* renamed from: d */
    public Boolean mo116037d() {
        return this.f81053f;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.AbstractC31820d
    public int getCount() {
        if (this.f81052e == null) {
            this.f81052e = new String[35];
            int i = 0;
            while (i < 31) {
                int i2 = i + 1;
                this.f81052e[i] = String.valueOf(i2);
                i = i2;
            }
        }
        return this.f81052e.length;
    }

    /* renamed from: a */
    public void mo116036a(Boolean bool) {
        this.f81053f = bool;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.AbstractC31820d
    /* renamed from: a */
    public String getItem(int i) {
        if (i < 0 || i >= 31) {
            return "";
        }
        return this.f81052e[i];
    }

    /* renamed from: e */
    private void m120789e(int i) {
        for (int i2 = 0; i2 < this.f81046a.length; i2++) {
            if (this.f81046a[i2] && i2 != i) {
                this.f81046a[i2] = !this.f81046a[i2];
                return;
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.AbstractC31820d
    /* renamed from: b */
    public void mo116028b(int i) {
        if (i >= 0 && i < 31) {
            if (this.f81053f.booleanValue()) {
                this.f81046a[i] = true;
                m120789e(i);
            } else {
                this.f81046a[i] = true ^ this.f81046a[i];
                mo116029c();
            }
            notifyDataSetChanged();
        }
    }

    public C31822f(Context context, int i, int i2) {
        super(context, i, i2);
        this.f81046a = new boolean[this.f81052e.length];
        Arrays.fill(this.f81046a, false);
    }
}
