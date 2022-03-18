package com.ss.android.lark.pin.impl.v3.binder.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.viewholder.h */
public class C51622h extends AbstractC51540b.C51541a {

    /* renamed from: m */
    public View f128446m;

    /* renamed from: n */
    public TextView f128447n;

    /* renamed from: o */
    public TextView f128448o;

    /* renamed from: p */
    public ImageView f128449p;

    /* renamed from: q */
    public TextView f128450q;

    /* renamed from: r */
    public ImageView f128451r;

    public C51622h(View view) {
        super(view);
        this.f128446m = view.findViewById(R.id.root);
        this.f128447n = (TextView) view.findViewById(R.id.merge_forward_title);
        this.f128448o = (TextView) view.findViewById(R.id.merge_forward_content);
        this.f128449p = (ImageView) view.findViewById(R.id.merge_forward_image);
        this.f128450q = (TextView) view.findViewById(R.id.merge_forward_from);
        this.f128451r = (ImageView) view.findViewById(R.id.merge_forward_from_iv);
    }

    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.viewholder.h$a */
    public static class C51623a {
        /* renamed from: a */
        public static C51622h m200249a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return new C51622h(layoutInflater.inflate(R.layout.chatpin_item_threadmergeforward, viewGroup, false));
        }
    }
}
