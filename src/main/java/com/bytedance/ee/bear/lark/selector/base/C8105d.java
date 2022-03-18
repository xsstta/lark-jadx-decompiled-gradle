package com.bytedance.ee.bear.lark.selector.base;

import com.ss.android.lark.widget.recyclerview.AbstractView$OnClickListenerC58987e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.lark.selector.base.d */
public class C8105d<Value> extends AbstractView$OnClickListenerC58987e<Value> {

    /* renamed from: a */
    private List<Value> f21667a = new ArrayList();

    @Override // com.ss.android.lark.widget.recyclerview.AbstractC58983c, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f21667a.size();
    }

    @Override // com.ss.android.lark.widget.recyclerview.AbstractC58983c, com.ss.android.lark.widget.recyclerview.AbstractView$OnClickListenerC58987e
    /* renamed from: a */
    public Value mo31276a(int i) {
        return this.f21667a.get(i);
    }

    /* renamed from: a */
    public void mo31277a(List<Value> list) {
        this.f21667a.clear();
        this.f21667a.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public void mo31278b(List<Value> list) {
        this.f21667a.addAll(list);
        notifyDataSetChanged();
    }
}
