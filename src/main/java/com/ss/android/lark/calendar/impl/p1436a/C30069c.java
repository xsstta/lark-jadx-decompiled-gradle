package com.ss.android.lark.calendar.impl.p1436a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.EditSelectStateView;

/* renamed from: com.ss.android.lark.calendar.impl.a.c */
public final class C30069c {

    /* renamed from: a */
    public final RelativeLayout f74946a;

    /* renamed from: b */
    public final ImageView f74947b;

    /* renamed from: c */
    public final ImageView f74948c;

    /* renamed from: d */
    public final EditSelectStateView f74949d;

    /* renamed from: e */
    public final TextView f74950e;

    /* renamed from: f */
    private final RelativeLayout f74951f;

    /* renamed from: a */
    public RelativeLayout mo108415a() {
        return this.f74951f;
    }

    /* renamed from: a */
    public static C30069c m111271a(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i = R.id.enter_meeting_room_arrow;
        ImageView imageView = (ImageView) view.findViewById(R.id.enter_meeting_room_arrow);
        if (imageView != null) {
            i = R.id.icon;
            ImageView imageView2 = (ImageView) view.findViewById(R.id.icon);
            if (imageView2 != null) {
                i = R.id.multipleSelectBt;
                EditSelectStateView editSelectStateView = (EditSelectStateView) view.findViewById(R.id.multipleSelectBt);
                if (editSelectStateView != null) {
                    i = R.id.tv_building_name;
                    TextView textView = (TextView) view.findViewById(R.id.tv_building_name);
                    if (textView != null) {
                        return new C30069c(relativeLayout, relativeLayout, imageView, imageView2, editSelectStateView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: a */
    public static C30069c m111270a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_event_meeting_room_building, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111271a(inflate);
    }

    private C30069c(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ImageView imageView, ImageView imageView2, EditSelectStateView editSelectStateView, TextView textView) {
        this.f74951f = relativeLayout;
        this.f74946a = relativeLayout2;
        this.f74947b = imageView;
        this.f74948c = imageView2;
        this.f74949d = editSelectStateView;
        this.f74950e = textView;
    }
}
