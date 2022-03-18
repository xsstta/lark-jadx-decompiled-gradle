package com.ss.android.lark.pin.impl.v3.binder.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.viewholder.d */
public class C51612d extends AbstractC51540b.C51541a {

    /* renamed from: m */
    public ImageView f128431m;

    /* renamed from: n */
    public ImageView f128432n;

    private C51612d(View view) {
        super(view);
        this.f128431m = (ImageView) view.findViewById(R.id.image_iv);
        this.f128432n = (ImageView) view.findViewById(R.id.play_label);
    }

    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.viewholder.d$a */
    public static final class C51614a {
        /* renamed from: a */
        public static C51612d m200245a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return new C51612d(layoutInflater.inflate(R.layout.chatpin_item_media2, viewGroup, false));
        }
    }
}
