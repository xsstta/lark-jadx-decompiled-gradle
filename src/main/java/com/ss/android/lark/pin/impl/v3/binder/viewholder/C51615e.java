package com.ss.android.lark.pin.impl.v3.binder.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.component.ui.layout.LKUIRoundableLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.viewholder.e */
public class C51615e extends AbstractC51540b.C51541a {

    /* renamed from: m */
    public final LKUIRoundableLayout f128433m;

    /* renamed from: n */
    public final TextView f128434n;

    /* renamed from: o */
    public final TextView f128435o;

    /* renamed from: p */
    public final ImageView f128436p;

    /* renamed from: q */
    public final View f128437q;

    public C51615e(View view) {
        super(view);
        this.f128434n = (TextView) view.findViewById(R.id.pin_location_title);
        this.f128435o = (TextView) view.findViewById(R.id.pin_location_desc);
        this.f128436p = (ImageView) view.findViewById(R.id.pin_location_image);
        this.f128433m = (LKUIRoundableLayout) view.findViewById(R.id.pin_location_bubble);
        this.f128437q = view.findViewById(R.id.pin_location_image_loading);
    }

    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.viewholder.e$a */
    public static final class C51616a {
        /* renamed from: a */
        public static C51615e m200246a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return new C51615e(layoutInflater.inflate(R.layout.chatpin_item_location2, viewGroup, false));
        }
    }
}
