package com.ss.android.lark.pin.impl.v3.binder.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.viewholder.i */
public class C51624i extends AbstractC51540b.C51541a {

    /* renamed from: m */
    public TextView f128452m;

    /* renamed from: n */
    public TextView f128453n;

    private C51624i(View view) {
        super(view);
        this.f128452m = (TextView) view.findViewById(R.id.tv_title);
        this.f128453n = (TextView) view.findViewById(R.id.tv_content);
    }

    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.viewholder.i$a */
    public static final class C51626a {
        /* renamed from: a */
        public static C51624i m200250a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return new C51624i(layoutInflater.inflate(R.layout.chatpin_item_calendar, viewGroup, false));
        }
    }
}
