package com.bytedance.ee.bear.sheet.toolbar2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.document.model.toolbar.ItemV2;
import com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.toolbar2.d */
public class C11338d extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private ItemV2[] f30469a;

    /* renamed from: b */
    private ColorDrawable f30470b;

    /* renamed from: c */
    private final Rect f30471c = new Rect();

    /* renamed from: a */
    public void mo43461a(ItemV2[] itemV2Arr) {
        this.f30469a = itemV2Arr;
    }

    /* renamed from: a */
    private boolean m47079a(int i) {
        ItemV2[] itemV2Arr = this.f30469a;
        if (i == itemV2Arr.length - 1) {
            return false;
        }
        return SheetBlockPrimaryItemId.EnumC11325b.separator.name().equals(itemV2Arr[i + 1].getId());
    }

    public C11338d(Context context, ItemV2[] itemV2Arr) {
        this.f30469a = itemV2Arr;
        this.f30470b = new ColorDrawable(context.getResources().getColor(R.color.line_divider_default));
    }

    /* renamed from: a */
    private void m47078a(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingLeft();
            i = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i = recyclerView.getWidth();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            if (m47079a(i3)) {
                View childAt = recyclerView.getChildAt(i3);
                recyclerView.getDecoratedBoundsWithMargins(childAt, this.f30471c);
                int round = this.f30471c.bottom + Math.round(childAt.getTranslationY());
                this.f30470b.setBounds(i2, round - this.f30470b.getIntrinsicHeight(), i, round);
                this.f30470b.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (recyclerView.getLayoutManager() != null && this.f30470b != null) {
            m47078a(canvas, recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.set(0, 0, this.f30470b.getIntrinsicWidth(), view.getResources().getDimensionPixelOffset(R.dimen.space_kit_len_divider));
    }
}
