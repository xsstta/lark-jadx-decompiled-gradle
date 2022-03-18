package com.ss.android.vc.meeting.module.meetingdialog.labs;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.b */
public class C62215b extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private int f156328a;

    /* renamed from: b */
    private int f156329b;

    /* renamed from: c */
    private int f156330c;

    /* renamed from: d */
    private int f156331d;

    public C62215b(int i, int i2, int i3, int i4) {
        this.f156328a = i;
        this.f156329b = i2;
        this.f156330c = i3;
        this.f156331d = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        super.getItemOffsets(rect, view, recyclerView, state);
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        int itemCount = recyclerView.getAdapter().getItemCount();
        int i2 = itemCount / 5;
        if (itemCount % 5 == 0) {
            i = 0;
        } else {
            i = 1;
        }
        int i3 = i2 + i;
        if (childLayoutPosition < 5) {
            rect.top = this.f156328a;
        } else {
            rect.top = this.f156330c;
        }
        if (childLayoutPosition >= (i3 - 1) * 5) {
            rect.bottom = this.f156329b;
        } else {
            rect.bottom = this.f156331d;
        }
    }
}
