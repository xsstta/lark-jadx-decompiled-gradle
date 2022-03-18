package com.ss.android.lark.album.image;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.ss.android.lark.album.image.d */
public class C28682d {
    /* renamed from: a */
    public static void m105156a(RecyclerView recyclerView, final RecyclerView.Adapter adapter, final int i) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            final GridLayoutManager.AbstractC1297b a = gridLayoutManager.mo6499a();
            gridLayoutManager.mo6501a(new GridLayoutManager.AbstractC1297b() {
                /* class com.ss.android.lark.album.image.C28682d.C286831 */

                @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1297b
                /* renamed from: a */
                public int mo6533a(int i) {
                    if (adapter.getItemViewType(i) == i) {
                        return gridLayoutManager.mo6502b();
                    }
                    GridLayoutManager.AbstractC1297b bVar = a;
                    if (bVar != null) {
                        return bVar.mo6533a(i);
                    }
                    return 1;
                }
            });
        }
    }
}
