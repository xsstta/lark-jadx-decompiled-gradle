package com.ss.android.lark.calendar.impl.p1436a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.EditSelectStateView;

/* renamed from: com.ss.android.lark.calendar.impl.a.f */
public final class C30072f {

    /* renamed from: a */
    public final ImageView f74961a;

    /* renamed from: b */
    public final RelativeLayout f74962b;

    /* renamed from: c */
    public final EditSelectStateView f74963c;

    /* renamed from: d */
    public final TextView f74964d;

    /* renamed from: e */
    private final RelativeLayout f74965e;

    /* renamed from: a */
    public RelativeLayout mo108418a() {
        return this.f74965e;
    }

    /* renamed from: a */
    public static C30072f m111280a(View view) {
        int i = R.id.enter_next_level_arrow;
        ImageView imageView = (ImageView) view.findViewById(R.id.enter_next_level_arrow);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i = R.id.multipleSelectBt;
            EditSelectStateView editSelectStateView = (EditSelectStateView) view.findViewById(R.id.multipleSelectBt);
            if (editSelectStateView != null) {
                i = R.id.tv_multi_level_name;
                TextView textView = (TextView) view.findViewById(R.id.tv_multi_level_name);
                if (textView != null) {
                    return new C30072f(relativeLayout, imageView, relativeLayout, editSelectStateView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: a */
    public static C30072f m111279a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_event_multi_level, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111280a(inflate);
    }

    private C30072f(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, EditSelectStateView editSelectStateView, TextView textView) {
        this.f74965e = relativeLayout;
        this.f74961a = imageView;
        this.f74962b = relativeLayout2;
        this.f74963c = editSelectStateView;
        this.f74964d = textView;
    }
}
