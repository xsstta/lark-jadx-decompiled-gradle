package com.bytedance.ee.bear.list.preload;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.SwipeMenuLayout;
import com.bytedance.ee.bear.list.docstate.SyncStateView;
import com.bytedance.ee.util.p718t.C13747j;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.ee.bear.list.preload.c */
public class C8668c {

    /* renamed from: a */
    CopyOnWriteArrayList<View> f23466a = new CopyOnWriteArrayList<>();

    /* renamed from: com.bytedance.ee.bear.list.preload.c$a */
    public static class C8669a {

        /* renamed from: a */
        public static final C8668c f23467a = new C8668c();
    }

    /* renamed from: a */
    public static C8668c m36224a() {
        return C8669a.f23467a;
    }

    /* renamed from: b */
    public View mo33674b(Context context) {
        if (this.f23466a.isEmpty()) {
            return mo33673a(context);
        }
        CopyOnWriteArrayList<View> copyOnWriteArrayList = this.f23466a;
        return copyOnWriteArrayList.remove(copyOnWriteArrayList.size() - 1);
    }

    /* renamed from: c */
    private View m36225c(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(C13749l.m55738a(198), -1));
        linearLayout.setId(R.id.item_menu);
        linearLayout.addView(m36223a(context, R.id.swipe_menu_more, R.color.fill_disable));
        linearLayout.addView(m36223a(context, R.id.swipe_menu_share, R.color.fill_disable));
        linearLayout.addView(m36223a(context, R.id.swipe_menu_delete, R.color.function_danger_500));
        return linearLayout;
    }

    /* renamed from: a */
    public View mo33673a(Context context) {
        SwipeMenuLayout swipeMenuLayout = new SwipeMenuLayout(context);
        swipeMenuLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, C13749l.m55738a(66)));
        swipeMenuLayout.setId(R.id.list_item);
        swipeMenuLayout.addView(m36226d(context));
        swipeMenuLayout.addView(m36225c(context));
        return swipeMenuLayout;
    }

    /* renamed from: d */
    private View m36226d(Context context) {
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, C13749l.m55738a(68)));
        constraintLayout.setBackgroundResource(R.drawable.list_item_bg_selector);
        constraintLayout.setId(R.id.item_content);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageResource(R.drawable.ud_icon_file_round_doc_colorful);
        appCompatImageView.setId(R.id.item_icon);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(C13749l.m55738a(40), C13749l.m55738a(40));
        layoutParams.f2819k = 0;
        layoutParams.f2816h = 0;
        layoutParams.f2812d = 0;
        layoutParams.f2814f = R.id.item_name;
        layoutParams.setMarginStart(C13749l.m55738a(16));
        constraintLayout.addView(appCompatImageView, layoutParams);
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setImageResource(R.drawable.ic_shortcut);
        appCompatImageView2.setId(R.id.item_shortcut);
        appCompatImageView2.setVisibility(8);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(C13749l.m55738a(12), C13749l.m55738a(12));
        layoutParams2.f2819k = R.id.item_icon;
        layoutParams2.f2812d = R.id.item_icon;
        constraintLayout.addView(appCompatImageView2, layoutParams2);
        SyncStateView syncStateView = new SyncStateView(context);
        syncStateView.setVisibility(8);
        syncStateView.setId(R.id.item_sync_state);
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(C13749l.m55738a(14), C13749l.m55738a(14));
        layoutParams3.f2819k = 0;
        layoutParams3.f2812d = R.id.item_name;
        layoutParams3.f2817i = R.id.item_name;
        layoutParams3.bottomMargin = C13749l.m55738a(12);
        constraintLayout.addView(syncStateView, layoutParams3);
        ListTitleView listTitleView = new ListTitleView(context);
        listTitleView.setId(R.id.item_name);
        listTitleView.setTitleSize(16.0f);
        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(C13749l.m55738a(0), C13749l.m55738a(24));
        layoutParams4.f2787E = 1.0f;
        layoutParams4.f2813e = R.id.item_icon;
        layoutParams4.f2814f = R.id.item_external_notice;
        layoutParams4.f2816h = 0;
        layoutParams4.setMarginStart(C13749l.m55738a(12));
        layoutParams4.setMarginEnd(C13749l.m55738a(16));
        layoutParams4.topMargin = C13749l.m55738a(12);
        constraintLayout.addView(listTitleView, layoutParams4);
        TextView textView = new TextView(context);
        textView.setId(R.id.update_time);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setSingleLine();
        textView.setText(R.string.Doc_List_LastUpdateWithSpace);
        textView.setTextColor(C13749l.m55755c(context, R.color.text_placeholder));
        textView.setTextSize(14.0f);
        ConstraintLayout.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams(C13749l.m55738a(0), -2);
        layoutParams5.bottomMargin = C13749l.m55738a(12);
        layoutParams5.f2819k = 0;
        layoutParams5.f2834z = BitmapDescriptorFactory.HUE_RED;
        layoutParams5.f2813e = R.id.item_sync_state;
        layoutParams5.f2814f = R.id.item_external_notice;
        layoutParams5.f2817i = R.id.item_name;
        constraintLayout.addView(textView, layoutParams5);
        TextView textView2 = new TextView(context);
        textView2.setId(R.id.list_item_sync_state_desc);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(1);
        textView2.setSingleLine();
        textView2.setText(R.string.Doc_List_WaitingForSync);
        textView2.setTextColor(C13749l.m55755c(context, R.color.text_placeholder));
        textView2.setTextSize(14.0f);
        textView2.setVisibility(8);
        ConstraintLayout.LayoutParams layoutParams6 = new ConstraintLayout.LayoutParams(C13749l.m55738a(0), -2);
        layoutParams6.bottomMargin = C13749l.m55738a(12);
        layoutParams6.setMarginEnd(16);
        layoutParams6.f2819k = 0;
        layoutParams6.f2813e = R.id.item_sync_state;
        layoutParams6.f2815g = 0;
        layoutParams6.f2817i = R.id.item_name;
        constraintLayout.addView(textView2, layoutParams6);
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context);
        appCompatImageView3.setId(R.id.item_external_notice);
        appCompatImageView3.setVisibility(8);
        C13747j.m55728a((ImageView) appCompatImageView3, (int) R.color.icon_n3);
        int a = C13749l.m55738a(20);
        ConstraintLayout.LayoutParams layoutParams7 = new ConstraintLayout.LayoutParams(a, a);
        layoutParams7.f2816h = 0;
        layoutParams7.f2819k = 0;
        layoutParams7.f2815g = 0;
        layoutParams7.rightMargin = C13749l.m55738a(22);
        constraintLayout.addView(appCompatImageView3, layoutParams7);
        return constraintLayout;
    }

    /* renamed from: a */
    private ImageView m36223a(Context context, int i, int i2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(i);
        appCompatImageView.setBackgroundColor(C13749l.m55755c(context, i2));
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        appCompatImageView.setLayoutParams(layoutParams);
        return appCompatImageView;
    }
}
