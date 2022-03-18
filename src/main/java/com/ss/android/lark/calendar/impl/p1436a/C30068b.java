package com.ss.android.lark.calendar.impl.p1436a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.widget.SubscribeButton;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.EditSelectStateView;

/* renamed from: com.ss.android.lark.calendar.impl.a.b */
public final class C30068b {

    /* renamed from: a */
    public final SubscribeButton f74930a;

    /* renamed from: b */
    public final View f74931b;

    /* renamed from: c */
    public final ImageView f74932c;

    /* renamed from: d */
    public final ImageView f74933d;

    /* renamed from: e */
    public final ImageView f74934e;

    /* renamed from: f */
    public final ImageView f74935f;

    /* renamed from: g */
    public final RelativeLayout f74936g;

    /* renamed from: h */
    public final EditSelectStateView f74937h;

    /* renamed from: i */
    public final View f74938i;

    /* renamed from: j */
    public final LinearLayout f74939j;

    /* renamed from: k */
    public final TextView f74940k;

    /* renamed from: l */
    public final TextView f74941l;

    /* renamed from: m */
    public final TextView f74942m;

    /* renamed from: n */
    public final TextView f74943n;

    /* renamed from: o */
    public final TextView f74944o;

    /* renamed from: p */
    private final RelativeLayout f74945p;

    /* renamed from: a */
    public RelativeLayout mo108414a() {
        return this.f74945p;
    }

    /* renamed from: a */
    public static C30068b m111268a(View view) {
        int i = R.id.btSubscribe;
        SubscribeButton subscribeButton = (SubscribeButton) view.findViewById(R.id.btSubscribe);
        if (subscribeButton != null) {
            i = R.id.divider_capacity_desc;
            View findViewById = view.findViewById(R.id.divider_capacity_desc);
            if (findViewById != null) {
                i = R.id.iv_close_icon;
                ImageView imageView = (ImageView) view.findViewById(R.id.iv_close_icon);
                if (imageView != null) {
                    i = R.id.iv_meeting_icon;
                    ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_meeting_icon);
                    if (imageView2 != null) {
                        i = R.id.iv_meeting_room_capacity;
                        ImageView imageView3 = (ImageView) view.findViewById(R.id.iv_meeting_room_capacity);
                        if (imageView3 != null) {
                            i = R.id.meetingRoomInfoIcon;
                            ImageView imageView4 = (ImageView) view.findViewById(R.id.meetingRoomInfoIcon);
                            if (imageView4 != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) view;
                                i = R.id.multipleSelectBt;
                                EditSelectStateView editSelectStateView = (EditSelectStateView) view.findViewById(R.id.multipleSelectBt);
                                if (editSelectStateView != null) {
                                    i = R.id.split_line;
                                    View findViewById2 = view.findViewById(R.id.split_line);
                                    if (findViewById2 != null) {
                                        i = R.id.text_group;
                                        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.text_group);
                                        if (linearLayout != null) {
                                            i = R.id.tv_disabled_icon;
                                            TextView textView = (TextView) view.findViewById(R.id.tv_disabled_icon);
                                            if (textView != null) {
                                                i = R.id.tv_meeting_room_capacity;
                                                TextView textView2 = (TextView) view.findViewById(R.id.tv_meeting_room_capacity);
                                                if (textView2 != null) {
                                                    i = R.id.tv_meeting_room_desc;
                                                    TextView textView3 = (TextView) view.findViewById(R.id.tv_meeting_room_desc);
                                                    if (textView3 != null) {
                                                        i = R.id.tv_meeting_room_name;
                                                        TextView textView4 = (TextView) view.findViewById(R.id.tv_meeting_room_name);
                                                        if (textView4 != null) {
                                                            i = R.id.tv_need_approval;
                                                            TextView textView5 = (TextView) view.findViewById(R.id.tv_need_approval);
                                                            if (textView5 != null) {
                                                                return new C30068b(relativeLayout, subscribeButton, findViewById, imageView, imageView2, imageView3, imageView4, relativeLayout, editSelectStateView, findViewById2, linearLayout, textView, textView2, textView3, textView4, textView5);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
    public static C30068b m111267a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_event_meeting_room, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111268a(inflate);
    }

    private C30068b(RelativeLayout relativeLayout, SubscribeButton subscribeButton, View view, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, RelativeLayout relativeLayout2, EditSelectStateView editSelectStateView, View view2, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f74945p = relativeLayout;
        this.f74930a = subscribeButton;
        this.f74931b = view;
        this.f74932c = imageView;
        this.f74933d = imageView2;
        this.f74934e = imageView3;
        this.f74935f = imageView4;
        this.f74936g = relativeLayout2;
        this.f74937h = editSelectStateView;
        this.f74938i = view2;
        this.f74939j = linearLayout;
        this.f74940k = textView;
        this.f74941l = textView2;
        this.f74942m = textView3;
        this.f74943n = textView4;
        this.f74944o = textView5;
    }
}
