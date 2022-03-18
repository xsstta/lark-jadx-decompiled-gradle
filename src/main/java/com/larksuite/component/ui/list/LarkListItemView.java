package com.larksuite.component.ui.list;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public abstract class LarkListItemView extends LinearLayout {

    /* renamed from: a */
    private C25676a f62728a = new C25676a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo89811a(ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo89812a();

    /* renamed from: b */
    private void m92057b() {
        addView(mo89811a(this));
        mo89812a();
    }

    public LarkListItemView(Context context) {
        super(context);
        m92057b();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.larksuite.component.ui.list.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo89813a(View view, Object obj) {
        this.f62728a.mo89817a((Class<? extends Object>) getClass(), view, obj);
    }

    public LarkListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m92057b();
    }

    /* renamed from: a */
    public <M, V extends View> void mo89814a(Class<M> cls, Class<V> cls2, IComponentBinder<? super V, ? super M> bVar) {
        this.f62728a.mo89818a(cls, cls2, bVar);
    }

    public LarkListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m92057b();
    }
}
