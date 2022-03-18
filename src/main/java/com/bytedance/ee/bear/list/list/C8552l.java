package com.bytedance.ee.bear.list.list;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.list.l */
public class C8552l extends C20923c {

    /* renamed from: a */
    public ViewGroup f23195a;

    /* renamed from: b */
    public AppCompatImageView f23196b;

    /* renamed from: c */
    public AppCompatImageView f23197c;

    /* renamed from: d */
    public TextView f23198d;

    public C8552l(View view) {
        super(view);
        this.f23195a = (ViewGroup) view.findViewById(R.id.grid_item);
        this.f23196b = (AppCompatImageView) view.findViewById(R.id.list_grid_thumbnail);
        this.f23197c = (AppCompatImageView) view.findViewById(R.id.list_grid_item_type);
        this.f23198d = (TextView) view.findViewById(R.id.list_grid_item_title);
    }
}
