package com.ss.android.lark.todo.p2774b.p2776b.p2777a.p2778a.p2780b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.todo.b.b.a.a.b.e */
public class C56239e extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public final TextView f139182a;

    /* renamed from: b */
    public final TextView f139183b;

    /* renamed from: c */
    public final TextView f139184c;

    /* renamed from: d */
    public final LKUIRoundedImageView f139185d;

    /* renamed from: e */
    public final TextView f139186e;

    /* renamed from: f */
    public final TextView f139187f;

    /* renamed from: g */
    public final ViewGroup f139188g;

    /* renamed from: h */
    public final ViewGroup f139189h;

    /* renamed from: i */
    public final ViewGroup f139190i;

    /* renamed from: j */
    public final ImageView f139191j;

    /* renamed from: k */
    public final TextView f139192k;

    /* renamed from: l */
    public final ImageView f139193l;

    /* renamed from: m */
    public final ImageView f139194m;

    /* renamed from: n */
    public final ImageView f139195n;

    /* renamed from: o */
    public final ImageView f139196o;

    private C56239e(View view) {
        super(view);
        this.f139182a = (TextView) view.findViewById(R.id.tv_title);
        this.f139186e = (TextView) view.findViewById(R.id.todo_assignee_content);
        this.f139183b = (TextView) view.findViewById(R.id.tv_name);
        this.f139184c = (TextView) view.findViewById(R.id.tv_time);
        this.f139185d = (LKUIRoundedImageView) view.findViewById(R.id.avatar);
        this.f139187f = (TextView) view.findViewById(R.id.tv_name_time);
        this.f139188g = (ViewGroup) view.findViewById(R.id.item_root_layout);
        this.f139189h = (ViewGroup) view.findViewById(R.id.sender_layout);
        this.f139190i = (ViewGroup) view.findViewById(R.id.todo_container_layout);
        this.f139191j = (ImageView) view.findViewById(R.id.item_menu_btn);
        this.f139192k = (TextView) view.findViewById(R.id.tv_footer);
        this.f139193l = (ImageView) view.findViewById(R.id.item_unpin_btn);
        this.f139194m = (ImageView) view.findViewById(R.id.item_view_in_chat_btn);
        this.f139195n = (ImageView) view.findViewById(R.id.item_forward_btn);
        this.f139196o = (ImageView) view.findViewById(R.id.todo_ic);
    }

    /* renamed from: com.ss.android.lark.todo.b.b.a.a.b.e$a */
    public static final class C56241a {
        /* renamed from: a */
        public static C56239e m219399a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return new C56239e(layoutInflater.inflate(R.layout.todo_wrapper_chatpin_item, viewGroup, false));
        }
    }
}
