package com.ss.android.lark.pin.impl.v3.binder.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;
import com.ss.android.lark.widget.EllipsizedEmojiconTextView;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.viewholder.g */
public class C51620g extends AbstractC51540b.C51541a {

    /* renamed from: m */
    public LKUIRoundedImageView f128442m;

    /* renamed from: n */
    public TextView f128443n;

    /* renamed from: o */
    public TextView f128444o;

    /* renamed from: p */
    public EllipsizedEmojiconTextView f128445p;

    public C51620g(View view) {
        super(view);
        this.f128442m = (LKUIRoundedImageView) view.findViewById(R.id.group_avatar);
        this.f128443n = (TextView) view.findViewById(R.id.group_name);
        this.f128444o = (TextView) view.findViewById(R.id.message_time);
        this.f128445p = (EllipsizedEmojiconTextView) view.findViewById(R.id.message_content);
    }

    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.viewholder.g$a */
    public static class C51621a {
        /* renamed from: a */
        public static C51620g m200248a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return new C51620g(layoutInflater.inflate(R.layout.chatpin_item_search_result, viewGroup, false));
        }
    }
}
