package com.bytedance.ee.bear.wiki.homepage.spacelist.p584b.p585a;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.SwipeMenuLayout;
import com.bytedance.ee.bear.list.preload.ListTitleView;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.wiki.homepage.spacelist.b.a.b */
public class C12000b extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public SwipeMenuLayout f32392a;

    /* renamed from: b */
    public ConstraintLayout f32393b;

    /* renamed from: c */
    public ListTitleView f32394c = ((ListTitleView) this.f32393b.findViewById(R.id.item_name));

    /* renamed from: d */
    public AppCompatImageView f32395d;

    /* renamed from: e */
    public TextView f32396e = ((TextView) this.f32393b.findViewById(R.id.update_time));

    /* renamed from: f */
    public AppCompatImageView f32397f = ((AppCompatImageView) this.f32393b.findViewById(R.id.item_external_notice));

    public C12000b(View view) {
        super(view);
        this.f32392a = (SwipeMenuLayout) view.findViewById(R.id.list_item);
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.item_content);
        this.f32393b = constraintLayout;
        this.f32395d = (AppCompatImageView) constraintLayout.findViewById(R.id.item_icon);
    }
}
