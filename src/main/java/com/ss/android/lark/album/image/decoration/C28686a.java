package com.ss.android.lark.album.image.decoration;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.ss.android.lark.album.image.decoration.a */
public class C28686a extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private int f72180a;

    public C28686a(int i) {
        this.f72180a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.right = this.f72180a;
    }
}
