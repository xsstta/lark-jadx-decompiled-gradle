package com.ss.android.lark.calendar.impl.p1436a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.EditSelectStateView;

/* renamed from: com.ss.android.lark.calendar.impl.a.g */
public final class C30073g {

    /* renamed from: a */
    public final View f74966a;

    /* renamed from: b */
    public final ImageView f74967b;

    /* renamed from: c */
    public final ImageView f74968c;

    /* renamed from: d */
    public final ImageView f74969d;

    /* renamed from: e */
    public final RelativeLayout f74970e;

    /* renamed from: f */
    public final EditSelectStateView f74971f;

    /* renamed from: g */
    public final View f74972g;

    /* renamed from: h */
    public final LinearLayout f74973h;

    /* renamed from: i */
    public final TextView f74974i;

    /* renamed from: j */
    public final TextView f74975j;

    /* renamed from: k */
    public final TextView f74976k;

    /* renamed from: l */
    public final TextView f74977l;

    /* renamed from: m */
    public final TextView f74978m;

    /* renamed from: n */
    private final RelativeLayout f74979n;

    /* renamed from: a */
    public RelativeLayout mo108419a() {
        return this.f74979n;
    }

    /* renamed from: a */
    public static C30073g m111283a(View view) {
        int i = R.id.divider_capacity_desc;
        View findViewById = view.findViewById(R.id.divider_capacity_desc);
        if (findViewById != null) {
            i = R.id.iv_meeting_icon;
            ImageView imageView = (ImageView) view.findViewById(R.id.iv_meeting_icon);
            if (imageView != null) {
                i = R.id.iv_meeting_room_capacity;
                ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_meeting_room_capacity);
                if (imageView2 != null) {
                    i = R.id.meetingRoomInfoIcon;
                    ImageView imageView3 = (ImageView) view.findViewById(R.id.meetingRoomInfoIcon);
                    if (imageView3 != null) {
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
                                                        return new C30073g(relativeLayout, findViewById, imageView, imageView2, imageView3, relativeLayout, editSelectStateView, findViewById2, linearLayout, textView, textView2, textView3, textView4, textView5);
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
    public static C30073g m111282a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_event_multi_meeting_room, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111283a(inflate);
    }

    private C30073g(RelativeLayout relativeLayout, View view, ImageView imageView, ImageView imageView2, ImageView imageView3, RelativeLayout relativeLayout2, EditSelectStateView editSelectStateView, View view2, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f74979n = relativeLayout;
        this.f74966a = view;
        this.f74967b = imageView;
        this.f74968c = imageView2;
        this.f74969d = imageView3;
        this.f74970e = relativeLayout2;
        this.f74971f = editSelectStateView;
        this.f74972g = view2;
        this.f74973h = linearLayout;
        this.f74974i = textView;
        this.f74975j = textView2;
        this.f74976k = textView3;
        this.f74977l = textView4;
        this.f74978m = textView5;
    }
}
