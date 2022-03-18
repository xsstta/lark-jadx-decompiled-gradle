package com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.p1583d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.d.b */
public class C32692b extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public final TextView f83854a;

    /* renamed from: b */
    public final TextView f83855b;

    /* renamed from: c */
    public final TextView f83856c;

    /* renamed from: d */
    public final LKUIRoundedImageView f83857d;

    /* renamed from: e */
    public final TextView f83858e;

    /* renamed from: f */
    public final TextView f83859f;

    /* renamed from: g */
    public final ViewGroup f83860g;

    /* renamed from: h */
    public final ViewGroup f83861h;

    /* renamed from: i */
    public final ViewGroup f83862i;

    /* renamed from: j */
    public final ImageView f83863j;

    /* renamed from: k */
    public final TextView f83864k;

    /* renamed from: l */
    public final ImageView f83865l;

    /* renamed from: m */
    public final ImageView f83866m;

    /* renamed from: n */
    public final ImageView f83867n;

    /* renamed from: o */
    public final ImageView f83868o;

    private C32692b(View view) {
        super(view);
        this.f83854a = (TextView) view.findViewById(R.id.tv_title);
        this.f83858e = (TextView) view.findViewById(R.id.cal_time_content);
        this.f83855b = (TextView) view.findViewById(R.id.tv_name);
        this.f83856c = (TextView) view.findViewById(R.id.tv_time);
        this.f83857d = (LKUIRoundedImageView) view.findViewById(R.id.avatar);
        this.f83859f = (TextView) view.findViewById(R.id.tv_name_time);
        this.f83860g = (ViewGroup) view.findViewById(R.id.item_root_layout);
        this.f83861h = (ViewGroup) view.findViewById(R.id.sender_layout);
        this.f83862i = (ViewGroup) view.findViewById(R.id.calendar_layout);
        this.f83863j = (ImageView) view.findViewById(R.id.item_menu_btn);
        this.f83864k = (TextView) view.findViewById(R.id.tv_footer);
        this.f83865l = (ImageView) view.findViewById(R.id.item_unpin_btn);
        this.f83866m = (ImageView) view.findViewById(R.id.item_view_in_chat_btn);
        this.f83867n = (ImageView) view.findViewById(R.id.item_forward_btn);
        this.f83868o = (ImageView) view.findViewById(R.id.calendar_ic);
    }

    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.d.b$a */
    public static final class C32694a {
        /* renamed from: a */
        public static C32692b m125523a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return new C32692b(layoutInflater.inflate(R.layout.chatpin_item_calendar2, viewGroup, false));
        }
    }
}
