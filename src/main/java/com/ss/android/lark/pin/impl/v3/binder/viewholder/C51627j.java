package com.ss.android.lark.pin.impl.v3.binder.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.viewholder.j */
public class C51627j extends AbstractC51540b.C51541a {

    /* renamed from: m */
    public TextView f128454m;

    /* renamed from: n */
    public RecyclerView f128455n;

    /* renamed from: o */
    public ViewGroup f128456o;

    /* renamed from: p */
    public ImageView f128457p;

    public C51627j(View view) {
        super(view);
        this.f128454m = (TextView) view.findViewById(R.id.vote_title_tv);
        this.f128455n = (RecyclerView) view.findViewById(R.id.vote_option_rv);
        this.f128456o = (ViewGroup) view.findViewById(R.id.vote_card);
        this.f128457p = (ImageView) view.findViewById(R.id.vote_icon);
    }

    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.viewholder.j$a */
    public static class C51628a {
        /* renamed from: a */
        public static C51627j m200251a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return new C51627j(layoutInflater.inflate(R.layout.chatpin_item_vote2, viewGroup, false));
        }
    }
}
