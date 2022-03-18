package com.bytedance.ee.bear.lark.selector;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.widget.recyclerview.AbstractC58992f;
import com.ss.android.lark.widget.recyclerview.AbstractView$OnClickListenerC58987e;
import com.ss.android.lark.widget.recyclerview.C58984d;

/* renamed from: com.bytedance.ee.bear.lark.selector.g */
public class C8126g implements AbstractView$OnClickListenerC58987e.AbstractC58989b<DocSelectorViewData> {

    /* renamed from: a */
    private Context f21702a;

    /* renamed from: b */
    private C58984d f21703b;

    /* renamed from: a */
    public int mo31301a(DocSelectorViewData docSelectorViewData) {
        if (docSelectorViewData.isFooter) {
            return 1;
        }
        return 0;
    }

    /* Return type fixed from 'com.ss.android.lark.widget.recyclerview.f<com.bytedance.ee.bear.lark.selector.DocSelectorViewData, ? extends androidx.recyclerview.widget.RecyclerView$ViewHolder>' to match base method */
    @Override // com.ss.android.lark.widget.recyclerview.AbstractView$OnClickListenerC58987e.AbstractC58989b
    /* renamed from: a */
    public AbstractC58992f<? extends DocSelectorViewData, ? extends RecyclerView.ViewHolder> mo31302a(int i) {
        if (i == 1) {
            return new C8072a(this.f21702a);
        }
        return new DocSearchItemHolderView(this.f21702a, this.f21703b);
    }

    public C8126g(Context context, C58984d dVar) {
        this.f21702a = context;
        this.f21703b = dVar;
    }
}
