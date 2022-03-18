package com.bytedance.ee.bear.list.list;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.ee.bear.list.docstate.SyncStateView;
import com.bytedance.ee.bear.list.preload.ListTitleView;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.list.f */
public class C8537f extends C20923c {

    /* renamed from: a */
    public ViewGroup f23148a;

    /* renamed from: b */
    public AppCompatImageView f23149b;

    /* renamed from: c */
    public AppCompatImageView f23150c;

    /* renamed from: d */
    public View f23151d;

    /* renamed from: e */
    public AppCompatImageView f23152e;

    /* renamed from: f */
    public AppCompatImageView f23153f;

    /* renamed from: g */
    public ListTitleView f23154g;

    /* renamed from: h */
    public View f23155h;

    /* renamed from: i */
    public SyncStateView f23156i;

    /* renamed from: j */
    public AppCompatImageView f23157j = ((AppCompatImageView) this.f23148a.findViewById(R.id.list_external_notice));

    public C8537f(View view) {
        super(view);
        this.f23148a = (ViewGroup) view.findViewById(R.id.grid_item);
        this.f23149b = (AppCompatImageView) view.findViewById(R.id.list_grid_thumbnail);
        this.f23150c = (AppCompatImageView) view.findViewById(R.id.list_grid_folder_thumbnail);
        this.f23151d = view.findViewById(R.id.list_grid_pin);
        this.f23152e = (AppCompatImageView) view.findViewById(R.id.list_grid_item_type);
        this.f23153f = (AppCompatImageView) view.findViewById(R.id.list_grid_item_shortcut);
        this.f23154g = (ListTitleView) view.findViewById(R.id.list_grid_item_title);
        this.f23155h = view.findViewById(R.id.list_grid_more);
        this.f23156i = (SyncStateView) view.findViewById(R.id.list_grid_item_sync_state);
    }
}
