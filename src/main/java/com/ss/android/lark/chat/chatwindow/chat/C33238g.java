package com.ss.android.lark.chat.chatwindow.chat;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.g */
public class C33238g extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private int f85543a;

    /* renamed from: b */
    private AbstractC33239a f85544b;

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.g$a */
    public interface AbstractC33239a {
        /* renamed from: a */
        boolean mo122572a();
    }

    public C33238g(int i, AbstractC33239a aVar) {
        this.f85543a = i;
        this.f85544b = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (((RecyclerView.LayoutParams) view.getLayoutParams()).getViewAdapterPosition() != 0 || this.f85544b.mo122572a()) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(0, this.f85543a, 0, 0);
        }
    }
}
