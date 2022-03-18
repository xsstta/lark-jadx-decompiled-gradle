package com.ss.android.lark.reaction.widget.detailwindow.scroller;

/* renamed from: com.ss.android.lark.reaction.widget.detailwindow.scroller.e */
public class C53035e implements AbstractC53032b {
    @Override // com.ss.android.lark.reaction.widget.detailwindow.scroller.AbstractC53032b
    /* renamed from: a */
    public int mo181088a(ScrollableLayout scrollableLayout, boolean z, int i, int i2, int i3) {
        if (z) {
            return 0;
        }
        return i3;
    }

    @Override // com.ss.android.lark.reaction.widget.detailwindow.scroller.AbstractC53032b
    /* renamed from: a */
    public int mo181087a(ScrollableLayout scrollableLayout, int i, int i2) {
        boolean z;
        if (i < i2 / 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0;
        }
        return i2;
    }
}
