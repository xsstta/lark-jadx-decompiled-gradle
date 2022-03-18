package com.bytedance.ee.bear.list.p426d;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.d.l */
public class C8268l extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private boolean f22308a;

    /* renamed from: a */
    public void mo32363a(boolean z) {
        C13479a.m54764b("ListStyleItemDecoration", "setHasMore()...hasMore = " + z);
        this.f22308a = z;
    }

    /* renamed from: a */
    private void m33915a(Rect rect, RecyclerView recyclerView, int i) {
        Resources resources = recyclerView.getResources();
        boolean z = true;
        int i2 = 0;
        if (i != recyclerView.getAdapter().getItemCount() - 1) {
            z = false;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.list_edit_sort_dialog_menu_height);
        if (z && !this.f22308a) {
            i2 = dimensionPixelSize;
        }
        rect.bottom = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (recyclerView.getAdapter().getItemViewType(childAdapterPosition) != 273) {
            m33915a(rect, recyclerView, childAdapterPosition);
        }
    }
}
