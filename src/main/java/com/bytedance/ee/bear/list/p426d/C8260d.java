package com.bytedance.ee.bear.list.p426d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.deviceinfo.C13653a;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.d.d */
public class C8260d extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private int f22283a;

    /* renamed from: b */
    private int f22284b;

    /* renamed from: c */
    private int f22285c;

    /* renamed from: d */
    private boolean f22286d;

    /* renamed from: e */
    private boolean f22287e;

    /* renamed from: f */
    private final int f22288f;

    /* renamed from: g */
    private final int f22289g;

    /* renamed from: h */
    private final int f22290h;

    /* renamed from: i */
    private final int f22291i;

    /* renamed from: a */
    public void mo32359a(boolean z) {
        C13479a.m54764b("ListGridItemDecoration", "setHasMore()...hasMore = " + z);
        this.f22286d = z;
    }

    public C8260d(Context context) {
        this.f22287e = C13653a.m55399c(context);
        Resources resources = context.getResources();
        this.f22288f = resources.getDimensionPixelSize(R.dimen.list_grid_horizontal_edge_padding);
        this.f22289g = resources.getDimensionPixelSize(R.dimen.list_grid_horizontal_space_padding);
        this.f22290h = resources.getDimensionPixelSize(R.dimen.list_grid_vertical_padding);
        this.f22291i = resources.getDimensionPixelSize(R.dimen.list_edit_sort_dialog_menu_height);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (recyclerView.getAdapter() instanceof BaseQuickAdapter) {
            int c = ((BaseQuickAdapter) recyclerView.getAdapter()).mo70678c();
            this.f22285c = c;
            this.f22283a = c;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (recyclerView.getAdapter().getItemViewType(childAdapterPosition) == 22) {
            this.f22284b = childAdapterPosition;
        } else if (recyclerView.getAdapter().getItemViewType(childAdapterPosition) != 273 && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            if (this.f22287e) {
                m33905b(rect, recyclerView, gridLayoutManager, childAdapterPosition);
            } else {
                m33904a(rect, recyclerView, gridLayoutManager, childAdapterPosition);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (((r11 + r10) - (((r9 - r0) - 1) % r10)) >= r9) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005c, code lost:
        if ((r11 - r0) >= ((r9 - r10) + (r9 % r10))) goto L_0x005e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m33904a(android.graphics.Rect r8, androidx.recyclerview.widget.RecyclerView r9, androidx.recyclerview.widget.GridLayoutManager r10, int r11) {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.list.p426d.C8260d.m33904a(android.graphics.Rect, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.GridLayoutManager, int):void");
    }

    /* renamed from: b */
    private void m33905b(Rect rect, RecyclerView recyclerView, GridLayoutManager gridLayoutManager, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        int i4;
        boolean z4;
        boolean z5;
        boolean z6;
        int b = gridLayoutManager.mo6502b();
        int itemCount = recyclerView.getAdapter().getItemCount() - this.f22285c;
        int i5 = this.f22284b;
        int i6 = 0;
        boolean z7 = true;
        if (i5 == 0 || i <= i5) {
            int i7 = this.f22283a;
            if ((i - i7) % b == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (((i + 1) - i7) % b == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (i < i7 + b) {
                z6 = true;
            } else {
                z6 = false;
            }
            int i8 = itemCount % b;
            if (i5 == 0) {
                int i9 = i - i7;
                if (i8 == 0) {
                }
            }
            z7 = false;
            z3 = z4;
            z2 = z5;
            z = z6;
        } else {
            if (((i - i5) - 1) % b == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i - i5) % b == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i - 1 < i5 + b) {
                z = true;
            } else {
                z = false;
            }
            int i10 = ((itemCount - i5) - 1) % b;
            if (i10 == 0 ? i < itemCount - b : i < itemCount - i10) {
                z7 = false;
            }
        }
        if (z3) {
            i2 = this.f22288f;
        } else {
            i2 = this.f22289g / 2;
        }
        if (z) {
            i6 = this.f22290h;
        }
        if (z2) {
            i3 = this.f22288f;
        } else {
            i3 = this.f22289g / 2;
        }
        if (!z7 || this.f22286d) {
            i4 = this.f22290h;
        } else {
            i4 = this.f22291i;
        }
        rect.set(i2, i6, i3, i4);
    }
}
