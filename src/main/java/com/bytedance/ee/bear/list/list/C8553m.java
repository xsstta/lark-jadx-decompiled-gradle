package com.bytedance.ee.bear.list.list;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.list.m */
public class C8553m extends C20923c {

    /* renamed from: a */
    public ViewGroup f23199a;

    /* renamed from: b */
    public AppCompatImageView f23200b;

    /* renamed from: c */
    public TextView f23201c;

    public C8553m(View view) {
        super(view);
        this.f23199a = (ViewGroup) view.findViewById(R.id.item_content);
        this.f23200b = (AppCompatImageView) view.findViewById(R.id.item_icon);
        this.f23201c = (TextView) view.findViewById(R.id.item_name);
    }
}
