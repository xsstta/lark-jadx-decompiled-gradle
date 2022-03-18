package com.ss.android.lark.mail.impl.search.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.search.view.a */
public class C43258a extends RecyclerView.Adapter {

    /* renamed from: a */
    public AbstractC43260a f110063a;

    /* renamed from: b */
    public List<String> f110064b;

    /* renamed from: c */
    private final String f110065c = "SearchResultAdapter";

    /* renamed from: d */
    private Context f110066d;

    /* renamed from: e */
    private LayoutInflater f110067e;

    /* renamed from: com.ss.android.lark.mail.impl.search.view.a$a */
    interface AbstractC43260a {
        /* renamed from: a */
        void mo154873a(String str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<String> list = this.f110064b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo154871a(List<String> list) {
        this.f110064b = list;
        notifyDataSetChanged();
    }

    C43258a(Context context, AbstractC43260a aVar) {
        this.f110066d = context;
        this.f110063a = aVar;
        this.f110067e = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C43261b(this.f110067e.inflate(R.layout.mail_search_history_item_layout, (ViewGroup) null), this.f110066d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (i >= this.f110064b.size()) {
            Log.m165389i("SearchResultAdapter", "onBindViewHolder illegal index");
            return;
        }
        if (viewHolder instanceof C43261b) {
            ((C43261b) viewHolder).mo154874a(this.f110064b.get(i));
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener(i) {
            /* class com.ss.android.lark.mail.impl.search.view.C43258a.View$OnClickListenerC432591 */

            /* renamed from: a */
            String f110068a;

            /* renamed from: b */
            final /* synthetic */ int f110069b;

            public void onClick(View view) {
                if (C43258a.this.f110063a != null) {
                    C43258a.this.f110063a.mo154873a(this.f110068a);
                }
            }

            {
                this.f110069b = r2;
                this.f110068a = C43258a.this.f110064b.get(r2);
            }
        });
    }
}
