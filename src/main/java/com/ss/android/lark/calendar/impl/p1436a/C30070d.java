package com.ss.android.lark.calendar.impl.p1436a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.calendar.impl.a.d */
public final class C30070d {

    /* renamed from: a */
    public final ImageView f74952a;

    /* renamed from: b */
    public final ImageView f74953b;

    /* renamed from: c */
    public final LinearLayout f74954c;

    /* renamed from: d */
    public final TextView f74955d;

    /* renamed from: e */
    public final TextView f74956e;

    /* renamed from: f */
    private final RelativeLayout f74957f;

    /* renamed from: a */
    public RelativeLayout mo108416a() {
        return this.f74957f;
    }

    /* renamed from: a */
    public static C30070d m111274a(View view) {
        int i = R.id.iv_boardroom_delete_icon;
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_boardroom_delete_icon);
        if (imageView != null) {
            i = R.id.iv_meeting_icon;
            ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_meeting_icon);
            if (imageView2 != null) {
                i = R.id.ll_delete_container;
                LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ll_delete_container);
                if (linearLayout != null) {
                    i = R.id.tv_disabled_icon;
                    TextView textView = (TextView) view.findViewById(R.id.tv_disabled_icon);
                    if (textView != null) {
                        i = R.id.tv_event_boardroom_name;
                        TextView textView2 = (TextView) view.findViewById(R.id.tv_event_boardroom_name);
                        if (textView2 != null) {
                            return new C30070d((RelativeLayout) view, imageView, imageView2, linearLayout, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: a */
    public static C30070d m111273a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_event_meeting_room_chosen, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111274a(inflate);
    }

    private C30070d(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f74957f = relativeLayout;
        this.f74952a = imageView;
        this.f74953b = imageView2;
        this.f74954c = linearLayout;
        this.f74955d = textView;
        this.f74956e = textView2;
    }
}
