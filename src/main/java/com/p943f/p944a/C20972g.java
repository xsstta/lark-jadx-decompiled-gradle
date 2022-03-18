package com.p943f.p944a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.f.a.g */
public class C20972g extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private AbstractC20975h f51340a;

    /* renamed from: b */
    private View.OnClickListener f51341b = new View.OnClickListener() {
        /* class com.p943f.p944a.C20972g.View$OnClickListenerC209731 */

        public void onClick(View view) {
            if (C20972g.this.f51343d != null && C20972g.this.getAdapterPosition() != -1) {
                C20972g.this.f51343d.mo71073a(C20972g.this.mo71035l(), view);
            }
        }
    };

    /* renamed from: c */
    private View.OnLongClickListener f51342c = new View.OnLongClickListener() {
        /* class com.p943f.p944a.C20972g.View$OnLongClickListenerC209742 */

        public boolean onLongClick(View view) {
            if (C20972g.this.f51344e == null || C20972g.this.getAdapterPosition() == -1) {
                return false;
            }
            return C20972g.this.f51344e.mo71074a(C20972g.this.mo71035l(), view);
        }
    };

    /* renamed from: d */
    public AbstractC20979j f51343d;

    /* renamed from: e */
    public AbstractC20980k f51344e;

    /* renamed from: l */
    public AbstractC20975h mo71035l() {
        return this.f51340a;
    }

    /* renamed from: j */
    public int mo71033j() {
        return this.f51340a.mo71052w();
    }

    /* renamed from: k */
    public int mo71034k() {
        return this.f51340a.mo71045b();
    }

    /* renamed from: h */
    public void mo71032h() {
        if (this.f51343d != null && this.f51340a.mo71049c()) {
            this.itemView.setOnClickListener(null);
        }
        if (this.f51344e != null && this.f51340a.mo71054y()) {
            this.itemView.setOnLongClickListener(null);
        }
        this.f51340a = null;
        this.f51343d = null;
        this.f51344e = null;
    }

    public C20972g(View view) {
        super(view);
    }

    /* renamed from: a */
    public void mo71031a(AbstractC20975h hVar, AbstractC20979j jVar, AbstractC20980k kVar) {
        this.f51340a = hVar;
        if (jVar != null && hVar.mo71049c()) {
            this.itemView.setOnClickListener(this.f51341b);
            this.f51343d = jVar;
        }
        if (kVar != null && hVar.mo71054y()) {
            this.itemView.setOnLongClickListener(this.f51342c);
            this.f51344e = kVar;
        }
    }
}
