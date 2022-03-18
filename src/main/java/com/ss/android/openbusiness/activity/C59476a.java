package com.ss.android.openbusiness.activity;

import android.graphics.Canvas;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.log.Log;
import com.ss.android.openbusiness.data.netdata.C59572d;
import com.ss.android.openbusiness.event.p3008a.C59596d;
import com.ss.android.openbusiness.p3003a.C59457d;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.openbusiness.activity.a */
public class C59476a extends ItemTouchHelper.AbstractC1303a {
    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public int mo6569a(RecyclerView recyclerView, int i, int i2, int i3, long j) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public void mo6575a(RecyclerView.ViewHolder viewHolder, int i) {
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public boolean mo6577a() {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: b */
    public boolean mo6585b() {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public int mo6570a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return m5979b(15, 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: b */
    public void mo6584b(RecyclerView.ViewHolder viewHolder, int i) {
        super.mo6584b(viewHolder, i);
        Log.m165389i("Opb_DragCallback", "onSelectedChanged, state: " + i);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: e */
    public void mo6591e(final RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        super.mo6591e(recyclerView, viewHolder);
        EventBus.getDefault().trigger(new C59596d());
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
            /* class com.ss.android.openbusiness.activity.C59476a.RunnableC594771 */

            public void run() {
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().notifyDataSetChanged();
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: b */
    public boolean mo6586b(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        C59457d dVar = (C59457d) recyclerView.getAdapter();
        if (dVar == null) {
            return false;
        }
        int adapterPosition = viewHolder.getAdapterPosition();
        int adapterPosition2 = viewHolder2.getAdapterPosition();
        int d = dVar.mo202739d(adapterPosition);
        int d2 = dVar.mo202739d(adapterPosition2);
        int c = dVar.mo202737c(adapterPosition);
        int c2 = dVar.mo202737c(adapterPosition2);
        if (d != d2 || c != c2) {
            return false;
        }
        int b = dVar.mo202735b(d, adapterPosition);
        int b2 = dVar.mo202735b(d2, adapterPosition2);
        CopyOnWriteArrayList<C59572d> c3 = dVar.mo202754c();
        if (b < b2) {
            while (b < b2) {
                int i = b + 1;
                Collections.swap(c3, b, i);
                b = i;
            }
        } else {
            while (b > b2) {
                Collections.swap(c3, b, b - 1);
                b--;
            }
        }
        recyclerView.getAdapter().notifyItemMoved(adapterPosition, adapterPosition2);
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public void mo6573a(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        super.mo6573a(canvas, recyclerView, viewHolder, f, f2, i, z);
        ((CardView) viewHolder.itemView).setCardElevation((float) UIUtils.dp2px(recyclerView.getContext(), 10.0f));
    }
}
