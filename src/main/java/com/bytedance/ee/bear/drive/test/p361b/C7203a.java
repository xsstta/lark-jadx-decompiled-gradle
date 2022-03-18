package com.bytedance.ee.bear.drive.test.p361b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.util.p701d.C13616d;
import com.larksuite.suite.R;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.test.b.a */
public class C7203a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public List<AbstractC7206b> f19325a;

    /* renamed from: b */
    private Context f19326b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f19325a.size();
    }

    /* renamed from: com.bytedance.ee.bear.drive.test.b.a$a */
    public static class C7205a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f19329a;

        /* renamed from: b */
        public View f19330b;

        public C7205a(View view) {
            super(view);
            this.f19330b = view;
            this.f19329a = (TextView) view.findViewById(R.id.btn_test_business);
        }
    }

    public C7203a(Context context, List<AbstractC7206b> list) {
        this.f19326b = context;
        this.f19325a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        m28856a((C7205a) viewHolder, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C7205a(LayoutInflater.from(this.f19326b).inflate(R.layout.drive_test_item, viewGroup, false));
    }

    /* renamed from: a */
    private void m28856a(C7205a aVar, final int i) {
        aVar.f19329a.setText(this.f19325a.get(i).mo28199a());
        if (!C13616d.m55262a(this.f19326b)) {
            aVar.f19329a.setAlpha(0.5f);
            aVar.f19330b.setOnClickListener(null);
            return;
        }
        aVar.f19329a.setAlpha(1.0f);
        aVar.f19330b.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.test.p361b.C7203a.View$OnClickListenerC72041 */

            public void onClick(View view) {
                C7203a.this.f19325a.get(i).mo28200b().onClick(view);
            }
        });
    }
}
