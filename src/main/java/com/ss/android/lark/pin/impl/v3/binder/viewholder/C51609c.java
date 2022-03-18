package com.ss.android.lark.pin.impl.v3.binder.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.viewholder.c */
public class C51609c extends AbstractC51540b.C51541a {

    /* renamed from: m */
    public LKUIRoundedImageView f128425m;

    /* renamed from: n */
    public TextView f128426n;

    /* renamed from: o */
    public TextView f128427o;

    /* renamed from: p */
    public TextView f128428p;

    /* renamed from: q */
    public View f128429q;

    /* renamed from: r */
    public View f128430r;

    private C51609c(View view) {
        super(view);
        this.f128425m = (LKUIRoundedImageView) view.findViewById(R.id.iv_avator);
        this.f128426n = (TextView) view.findViewById(R.id.tv_group_chat_title);
        this.f128427o = (TextView) view.findViewById(R.id.tv_group_chat_description);
        this.f128428p = (TextView) view.findViewById(R.id.bt_group_chat_join);
        this.f128430r = view.findViewById(R.id.group_chat_content_up);
        this.f128429q = view.findViewById(R.id.group_chat_content_root);
    }

    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.viewholder.c$a */
    public static class C51611a {
        /* renamed from: a */
        public static C51609c m200244a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return new C51609c(layoutInflater.inflate(R.layout.chatpin_item_group_card2, viewGroup, false));
        }
    }
}
