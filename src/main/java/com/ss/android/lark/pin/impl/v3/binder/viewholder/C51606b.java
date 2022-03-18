package com.ss.android.lark.pin.impl.v3.binder.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;
import pl.droidsonroids.gif.GifImageView;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.viewholder.b */
public class C51606b extends AbstractC51540b.C51541a {

    /* renamed from: m */
    public GifImageView f128424m;

    private C51606b(View view) {
        super(view);
        this.f128424m = (GifImageView) view.findViewById(R.id.gif_iv);
    }

    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.viewholder.b$a */
    public static final class C51608a {
        /* renamed from: a */
        public static C51606b m200243a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return new C51606b(layoutInflater.inflate(R.layout.chatpin_item_sticker2, viewGroup, false));
        }
    }
}
