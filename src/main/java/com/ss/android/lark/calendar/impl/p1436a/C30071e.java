package com.ss.android.lark.calendar.impl.p1436a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.calendar.impl.a.e */
public final class C30071e {

    /* renamed from: a */
    public final ImageView f74958a;

    /* renamed from: b */
    public final TextView f74959b;

    /* renamed from: c */
    private final LinearLayout f74960c;

    /* renamed from: a */
    public LinearLayout mo108417a() {
        return this.f74960c;
    }

    /* renamed from: a */
    public static C30071e m111277a(View view) {
        int i = R.id.icon;
        ImageView imageView = (ImageView) view.findViewById(R.id.icon);
        if (imageView != null) {
            i = R.id.meeting_room_type_title;
            TextView textView = (TextView) view.findViewById(R.id.meeting_room_type_title);
            if (textView != null) {
                return new C30071e((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    private C30071e(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.f74960c = linearLayout;
        this.f74958a = imageView;
        this.f74959b = textView;
    }

    /* renamed from: a */
    public static C30071e m111276a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_event_meeting_room_title, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111277a(inflate);
    }
}
