package com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.appcenter.common.adapter.p1288a.C28112d;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category.c */
public class C28023c extends LarkRecyclerViewBaseAdapter {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C28112d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.workplace_fragment_adapter_app_skeleton_item, viewGroup, false));
    }
}
