package com.bytedance.ee.bear.lark.selector;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.recyclerview.AbstractC58992f;

/* renamed from: com.bytedance.ee.bear.lark.selector.a */
public class C8072a extends AbstractC58992f<DocSelectorViewData, C8073a> {

    /* renamed from: com.bytedance.ee.bear.lark.selector.a$a */
    public static class C8073a extends RecyclerView.ViewHolder {
        public C8073a(View view) {
            super(view);
        }

        /* renamed from: a */
        public static C8073a m32315a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return new C8073a(LayoutInflater.from(layoutInflater.getContext()).inflate(R.layout.doc_footer_item, viewGroup, false));
        }
    }

    public C8072a(Context context) {
        super(context);
    }

    /* renamed from: a */
    public C8073a mo31176b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C8073a.m32315a(layoutInflater, viewGroup);
    }

    /* renamed from: a */
    public void mo31174a(C8073a aVar, int i, DocSelectorViewData docSelectorViewData) {
        aVar.itemView.setEnabled(false);
    }
}
