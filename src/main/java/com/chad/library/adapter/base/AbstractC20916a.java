package com.chad.library.adapter.base;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.C0908j;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.C20923c;
import com.chad.library.adapter.base.p936c.AbstractC20924a;
import com.chad.library.adapter.base.p936c.AbstractC20925b;
import com.larksuite.suite.R;
import java.util.Collections;
import java.util.List;

/* renamed from: com.chad.library.adapter.base.a */
public abstract class AbstractC20916a<T, K extends C20923c> extends BaseQuickAdapter<T, K> {

    /* renamed from: d */
    protected int f51229d;

    /* renamed from: e */
    protected ItemTouchHelper f51230e;

    /* renamed from: f */
    protected boolean f51231f;

    /* renamed from: g */
    protected boolean f51232g;

    /* renamed from: h */
    protected AbstractC20924a f51233h;

    /* renamed from: i */
    protected AbstractC20925b f51234i;

    /* renamed from: j */
    protected boolean f51235j = true;

    /* renamed from: k */
    protected View.OnTouchListener f51236k;

    /* renamed from: l */
    protected View.OnLongClickListener f51237l;

    /* renamed from: a */
    public boolean mo18916a() {
        return this.f51232g;
    }

    /* renamed from: a */
    public void mo70716a(AbstractC20924a aVar) {
        this.f51233h = aVar;
    }

    /* renamed from: b */
    public void mo33373b(int i) {
        this.f51229d = i;
    }

    /* renamed from: h */
    private boolean m76211h(int i) {
        if (i < 0 || i >= this.f51214t.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public int mo70717b(RecyclerView.ViewHolder viewHolder) {
        return viewHolder.getAdapterPosition() - mo70678c();
    }

    /* renamed from: c */
    public void mo70719c(RecyclerView.ViewHolder viewHolder) {
        AbstractC20924a aVar = this.f51233h;
        if (aVar != null && this.f51231f) {
            aVar.mo32607a(viewHolder, mo70717b(viewHolder));
        }
    }

    /* renamed from: d */
    public void mo70720d(RecyclerView.ViewHolder viewHolder) {
        AbstractC20925b bVar = this.f51234i;
        if (bVar != null && this.f51232g) {
            bVar.mo70747a(viewHolder, mo70717b(viewHolder));
        }
    }

    /* renamed from: e */
    public void mo70721e(RecyclerView.ViewHolder viewHolder) {
        AbstractC20925b bVar = this.f51234i;
        if (bVar != null && this.f51232g) {
            bVar.mo70748b(viewHolder, mo70717b(viewHolder));
        }
    }

    /* renamed from: b */
    public void mo70718b(boolean z) {
        this.f51235j = z;
        if (z) {
            this.f51236k = null;
            this.f51237l = new View.OnLongClickListener() {
                /* class com.chad.library.adapter.base.AbstractC20916a.View$OnLongClickListenerC209171 */

                public boolean onLongClick(View view) {
                    if (AbstractC20916a.this.f51230e == null || !AbstractC20916a.this.f51231f) {
                        return true;
                    }
                    AbstractC20916a.this.f51230e.startDrag((RecyclerView.ViewHolder) view.getTag(R.id.BaseQuickAdapter_viewholder_support));
                    return true;
                }
            };
            return;
        }
        this.f51236k = new View.OnTouchListener() {
            /* class com.chad.library.adapter.base.AbstractC20916a.View$OnTouchListenerC209182 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (C0908j.m4366a(motionEvent) != 0 || AbstractC20916a.this.f51235j) {
                    return false;
                }
                if (AbstractC20916a.this.f51230e == null || !AbstractC20916a.this.f51231f) {
                    return true;
                }
                AbstractC20916a.this.f51230e.startDrag((RecyclerView.ViewHolder) view.getTag(R.id.BaseQuickAdapter_viewholder_support));
                return true;
            }
        };
        this.f51237l = null;
    }

    /* renamed from: a */
    public void mo43415a(RecyclerView.ViewHolder viewHolder) {
        AbstractC20924a aVar = this.f51233h;
        if (aVar != null && this.f51231f) {
            aVar.mo32611b(viewHolder, mo70717b(viewHolder));
        }
    }

    /* renamed from: f */
    public void mo70722f(RecyclerView.ViewHolder viewHolder) {
        int b = mo70717b(viewHolder);
        if (m76211h(b)) {
            this.f51214t.remove(b);
            notifyItemRemoved(viewHolder.getAdapterPosition());
        }
        AbstractC20925b bVar = this.f51234i;
        if (bVar != null && this.f51232g) {
            bVar.mo70749c(viewHolder, mo70717b(viewHolder));
        }
    }

    public AbstractC20916a(int i, List<T> list) {
        super(i, list);
    }

    /* renamed from: a */
    public void mo70715a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        int b = mo70717b(viewHolder);
        int b2 = mo70717b(viewHolder2);
        if (m76211h(b) && m76211h(b2)) {
            if (b < b2) {
                int i = b;
                while (i < b2) {
                    int i2 = i + 1;
                    Collections.swap(this.f51214t, i, i2);
                    i = i2;
                }
            } else {
                for (int i3 = b; i3 > b2; i3--) {
                    Collections.swap(this.f51214t, i3, i3 - 1);
                }
            }
            notifyItemMoved(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
        }
        AbstractC20924a aVar = this.f51233h;
        if (aVar != null && this.f51231f) {
            aVar.mo32608a(viewHolder, b, viewHolder2, b2);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: a */
    public void onBindViewHolder(K k, int i) {
        super.onBindViewHolder(k, i);
        int itemViewType = k.getItemViewType();
        if (this.f51230e != null && this.f51231f && itemViewType != 546 && itemViewType != 273 && itemViewType != 1365 && itemViewType != 819) {
            int i2 = this.f51229d;
            if (i2 != 0) {
                View b = k.mo70740b(i2);
                if (b != null) {
                    b.setTag(R.id.BaseQuickAdapter_viewholder_support, k);
                    if (this.f51235j) {
                        b.setOnLongClickListener(this.f51237l);
                    } else {
                        b.setOnTouchListener(this.f51236k);
                    }
                }
            } else {
                ((C20923c) k).itemView.setTag(R.id.BaseQuickAdapter_viewholder_support, k);
                ((C20923c) k).itemView.setOnLongClickListener(this.f51237l);
            }
        }
    }

    /* renamed from: a */
    public void mo70714a(ItemTouchHelper itemTouchHelper, int i, boolean z) {
        this.f51231f = true;
        this.f51230e = itemTouchHelper;
        mo33373b(i);
        mo70718b(z);
    }

    /* renamed from: a */
    public void mo70713a(Canvas canvas, RecyclerView.ViewHolder viewHolder, float f, float f2, boolean z) {
        AbstractC20925b bVar = this.f51234i;
        if (bVar != null && this.f51232g) {
            bVar.mo70746a(canvas, viewHolder, f, f2, z);
        }
    }
}
