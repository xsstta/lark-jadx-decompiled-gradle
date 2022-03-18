package com.ss.android.lark.mail.impl.p2165d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.widget.HeaderFooterRecyclerView;

/* renamed from: com.ss.android.lark.mail.impl.d.j */
public final class C42049j {

    /* renamed from: a */
    public final View f106704a;

    /* renamed from: b */
    public final HeaderFooterRecyclerView f106705b;

    /* renamed from: c */
    public final ConstraintLayout f106706c;

    /* renamed from: d */
    public final FrameLayout f106707d;

    /* renamed from: e */
    public final ImageView f106708e;

    /* renamed from: f */
    public final TextView f106709f;

    /* renamed from: g */
    public final View f106710g;

    /* renamed from: h */
    public final RelativeLayout f106711h;

    /* renamed from: i */
    private final FrameLayout f106712i;

    /* renamed from: a */
    public FrameLayout mo151064a() {
        return this.f106712i;
    }

    /* renamed from: a */
    public static C42049j m167243a(LayoutInflater layoutInflater) {
        return m167244a(layoutInflater, null, false);
    }

    /* renamed from: a */
    public static C42049j m167245a(View view) {
        int i = R.id.gray_layer;
        View findViewById = view.findViewById(R.id.gray_layer);
        if (findViewById != null) {
            i = R.id.mail_label_list;
            HeaderFooterRecyclerView headerFooterRecyclerView = (HeaderFooterRecyclerView) view.findViewById(R.id.mail_label_list);
            if (headerFooterRecyclerView != null) {
                i = R.id.mail_menu_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.mail_menu_container);
                if (constraintLayout != null) {
                    i = R.id.mail_menu_loading_tips_layout;
                    FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.mail_menu_loading_tips_layout);
                    if (frameLayout != null) {
                        i = R.id.manage_entrance_iv;
                        ImageView imageView = (ImageView) view.findViewById(R.id.manage_entrance_iv);
                        if (imageView != null) {
                            i = R.id.manage_entrance_tv;
                            TextView textView = (TextView) view.findViewById(R.id.manage_entrance_tv);
                            if (textView != null) {
                                i = R.id.manage_label_divider;
                                View findViewById2 = view.findViewById(R.id.manage_label_divider);
                                if (findViewById2 != null) {
                                    i = R.id.manage_label_layout;
                                    RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.manage_label_layout);
                                    if (relativeLayout != null) {
                                        return new C42049j((FrameLayout) view, findViewById, headerFooterRecyclerView, constraintLayout, frameLayout, imageView, textView, findViewById2, relativeLayout);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: a */
    public static C42049j m167244a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.mail_menu_container_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m167245a(inflate);
    }

    private C42049j(FrameLayout frameLayout, View view, HeaderFooterRecyclerView headerFooterRecyclerView, ConstraintLayout constraintLayout, FrameLayout frameLayout2, ImageView imageView, TextView textView, View view2, RelativeLayout relativeLayout) {
        this.f106712i = frameLayout;
        this.f106704a = view;
        this.f106705b = headerFooterRecyclerView;
        this.f106706c = constraintLayout;
        this.f106707d = frameLayout2;
        this.f106708e = imageView;
        this.f106709f = textView;
        this.f106710g = view2;
        this.f106711h = relativeLayout;
    }
}
