package com.ss.android.lark.widget.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.ss.android.lark.widget.recyclerview.AbstractView$OnClickListenerC58987e;

/* renamed from: com.ss.android.lark.widget.recyclerview.f */
public abstract class AbstractC58992f<Value, VH extends RecyclerView.ViewHolder> {

    /* renamed from: a */
    private AbstractView$OnClickListenerC58987e.AbstractC58991d<Value> f146178a;

    /* renamed from: b */
    private AbstractView$OnClickListenerC58987e.AbstractC58990c<Value> f146179b;

    /* renamed from: c */
    private AbstractC58993a<Value> f146180c;

    /* renamed from: d */
    public Context f146181d;

    /* renamed from: e */
    protected LayoutInflater f146182e;

    /* renamed from: f */
    protected View f146183f;

    /* renamed from: g */
    protected ViewGroup f146184g;

    /* renamed from: com.ss.android.lark.widget.recyclerview.f$a */
    public interface AbstractC58993a<Value> {
    }

    /* renamed from: a */
    public abstract void mo31174a(VH vh, int i, Value value);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract VH mo31176b(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* renamed from: a */
    public void mo200114a(AbstractView$OnClickListenerC58987e.AbstractC58991d<Value> dVar) {
        this.f146178a = dVar;
    }

    public AbstractC58992f(Context context) {
        this.f146181d = context;
        this.f146182e = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public final VH mo200113a(ViewGroup viewGroup) {
        VH b = mo31176b(this.f146182e, viewGroup);
        this.f146183f = b.itemView;
        this.f146184g = viewGroup;
        return b;
    }

    /* renamed from: a */
    public void mo200115a(AbstractC58993a<Value> aVar) {
        this.f146180c = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo200117b(View view, int i, Value value) {
        AbstractView$OnClickListenerC58987e.AbstractC58990c<Value> cVar = this.f146179b;
        if (cVar != null) {
            cVar.onItemClicked(view, i, value);
        }
    }

    /* renamed from: a */
    public final boolean mo200116a(View view, int i, Value value) {
        AbstractView$OnClickListenerC58987e.AbstractC58991d<Value> dVar = this.f146178a;
        if (dVar != null) {
            return dVar.onItemLongClicked(view, i, value);
        }
        return false;
    }
}
