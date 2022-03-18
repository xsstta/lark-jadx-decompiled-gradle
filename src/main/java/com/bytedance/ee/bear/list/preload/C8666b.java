package com.bytedance.ee.bear.list.preload;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ee.bear.list.docstate.SyncStateView;
import com.bytedance.ee.util.p718t.C13747j;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.ee.bear.list.preload.b */
public class C8666b {

    /* renamed from: a */
    CopyOnWriteArrayList<View> f23464a = new CopyOnWriteArrayList<>();

    /* renamed from: com.bytedance.ee.bear.list.preload.b$a */
    public static class C8667a {

        /* renamed from: a */
        public static final C8666b f23465a = new C8666b();
    }

    /* renamed from: a */
    public static C8666b m36220a() {
        return C8667a.f23465a;
    }

    /* renamed from: a */
    public View mo33672a(Context context) {
        if (this.f23464a.isEmpty()) {
            return m36221b(context);
        }
        CopyOnWriteArrayList<View> copyOnWriteArrayList = this.f23464a;
        return copyOnWriteArrayList.remove(copyOnWriteArrayList.size() - 1);
    }

    /* renamed from: b */
    private View m36221b(Context context) {
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.grid_item);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, C13749l.m55750b(context, R.dimen.list_grid_item_height));
        constraintLayout.setBackgroundResource(R.drawable.list_grid_item_bg);
        constraintLayout.setLayoutParams(layoutParams);
        View view = new View(context);
        view.setBackgroundResource(R.drawable.list_grid_item_shadow);
        C13747j.m55726a(view, (int) R.color.bg_body);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-1, -1);
        int a = C13749l.m55738a(4);
        layoutParams2.setMargins(a, a, a, a);
        constraintLayout.addView(view, layoutParams2);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.list_grid_thumbnail);
        appCompatImageView.setBackgroundResource(R.drawable.list_grid_item_shadow);
        C13747j.m55726a((View) appCompatImageView, (int) R.color.bg_body);
        appCompatImageView.setImageResource(R.drawable.list_grid_placeholder);
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-1, -1);
        int a2 = C13749l.m55738a(4);
        layoutParams3.setMargins(a2, a2, a2, a2);
        constraintLayout.addView(appCompatImageView, layoutParams3);
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setId(R.id.list_grid_folder_thumbnail);
        appCompatImageView2.setImageResource(R.drawable.ud_icon_file_sharefolder_colorful);
        appCompatImageView2.setVisibility(8);
        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(C13749l.m55738a(41), C13749l.m55738a(32));
        layoutParams4.topMargin = C13749l.m55738a(26);
        layoutParams4.f2812d = 0;
        layoutParams4.f2815g = 0;
        layoutParams4.f2816h = 0;
        constraintLayout.addView(appCompatImageView2, layoutParams4);
        int a3 = C13749l.m55738a(20);
        int a4 = C13749l.m55738a(9);
        int a5 = C13749l.m55738a(2);
        int a6 = C13749l.m55738a(3);
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context);
        appCompatImageView3.setId(R.id.list_grid_pin);
        appCompatImageView3.setBackgroundResource(R.drawable.ic_icon_notification_shape);
        appCompatImageView3.setImageResource(R.drawable.ud_icon_collect_filled);
        C13747j.m55728a((ImageView) appCompatImageView3, (int) R.color.ud_Y500);
        appCompatImageView3.setPadding(a6, a6, a6, a6);
        ConstraintLayout.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams(a3, a3);
        layoutParams5.topMargin = a4;
        layoutParams5.setMarginEnd(a4);
        layoutParams5.f2816h = 0;
        layoutParams5.f2814f = R.id.list_external_notice;
        constraintLayout.addView(appCompatImageView3, layoutParams5);
        AppCompatImageView appCompatImageView4 = new AppCompatImageView(context);
        appCompatImageView4.setId(R.id.list_external_notice);
        ConstraintLayout.LayoutParams layoutParams6 = new ConstraintLayout.LayoutParams(a3, a3);
        layoutParams6.f2815g = 0;
        layoutParams6.f2816h = 0;
        layoutParams6.topMargin = a4;
        layoutParams6.setMarginEnd(a4);
        appCompatImageView3.setPadding(a5, a5, a5, a5);
        appCompatImageView4.setVisibility(8);
        appCompatImageView4.setBackgroundResource(R.drawable.ic_icon_notification_shape);
        appCompatImageView4.setImageResource(R.drawable.ud_icon_warning_outlined);
        C13747j.m55728a((ImageView) appCompatImageView4, (int) R.color.icon_disable);
        constraintLayout.addView(appCompatImageView4, layoutParams6);
        View view2 = new View(context);
        view2.setBackgroundResource(R.color.line_border_card);
        ConstraintLayout.LayoutParams layoutParams7 = new ConstraintLayout.LayoutParams(-1, C13749l.m55737a(0.5f));
        layoutParams7.f2818j = R.id.list_grid_item_container;
        constraintLayout.addView(view2, layoutParams7);
        ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.setId(R.id.list_grid_item_container);
        ConstraintLayout.LayoutParams layoutParams8 = new ConstraintLayout.LayoutParams(-1, C13749l.m55738a(60));
        int a7 = C13749l.m55738a(1);
        layoutParams8.setMargins(a7, a7, a7, a7);
        layoutParams8.f2819k = 0;
        constraintLayout2.setPadding(0, C13749l.m55737a(10.0f), 0, C13749l.m55737a(9.5f));
        constraintLayout2.setBackgroundResource(R.drawable.list_pin_item_container_bg);
        constraintLayout.addView(constraintLayout2, layoutParams8);
        AppCompatImageView appCompatImageView5 = new AppCompatImageView(context);
        appCompatImageView5.setId(R.id.list_grid_item_type);
        ConstraintLayout.LayoutParams layoutParams9 = new ConstraintLayout.LayoutParams(C13749l.m55738a(24), C13749l.m55738a(24));
        layoutParams9.setMarginStart(C13749l.m55738a(8));
        layoutParams9.f2816h = 0;
        layoutParams9.f2819k = 0;
        layoutParams9.f2812d = 0;
        appCompatImageView5.setImageResource(R.drawable.ud_icon_file_round_doc_colorful);
        constraintLayout2.addView(appCompatImageView5, layoutParams9);
        AppCompatImageView appCompatImageView6 = new AppCompatImageView(context);
        appCompatImageView6.setId(R.id.list_grid_item_shortcut);
        appCompatImageView6.setVisibility(8);
        ConstraintLayout.LayoutParams layoutParams10 = new ConstraintLayout.LayoutParams(C57582a.m223600a(8), C57582a.m223600a(8));
        layoutParams10.f2819k = R.id.list_grid_item_type;
        layoutParams10.f2812d = R.id.list_grid_item_type;
        appCompatImageView6.setImageResource(R.drawable.ic_shortcut);
        constraintLayout2.addView(appCompatImageView6, layoutParams10);
        SyncStateView syncStateView = new SyncStateView(context);
        syncStateView.setId(R.id.list_grid_item_sync_state);
        syncStateView.setVisibility(8);
        ConstraintLayout.LayoutParams layoutParams11 = new ConstraintLayout.LayoutParams(C13749l.m55738a(14), C13749l.m55738a(14));
        layoutParams11.bottomMargin = C13749l.m55738a(3);
        layoutParams11.f2819k = 0;
        layoutParams11.f2814f = R.id.list_grid_item_title;
        constraintLayout2.addView(syncStateView, layoutParams11);
        ListTitleView listTitleView = new ListTitleView(context);
        listTitleView.setId(R.id.list_grid_item_title);
        ConstraintLayout.LayoutParams layoutParams12 = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams12.setMarginStart(C13749l.m55738a(8));
        layoutParams12.setMarginEnd(C13749l.m55738a(4));
        listTitleView.setTitleSize(14.0f);
        listTitleView.setTitleColor(C13749l.m55755c(context, R.color.text_title));
        listTitleView.setTitleMaxLines(2);
        layoutParams12.f2813e = R.id.list_grid_item_type;
        layoutParams12.f2814f = R.id.list_grid_more;
        layoutParams12.f2816h = 0;
        layoutParams12.f2819k = 0;
        constraintLayout2.addView(listTitleView, layoutParams12);
        AppCompatImageView appCompatImageView7 = new AppCompatImageView(context);
        appCompatImageView7.setId(R.id.list_grid_more);
        ConstraintLayout.LayoutParams layoutParams13 = new ConstraintLayout.LayoutParams(C13749l.m55738a(24), C13749l.m55738a(24));
        layoutParams13.setMarginEnd(C13749l.m55738a(4));
        layoutParams13.f2815g = 0;
        layoutParams13.f2816h = 0;
        layoutParams13.f2819k = 0;
        appCompatImageView7.setImageResource(R.drawable.list_grid_more_dot);
        C13747j.m55728a((ImageView) appCompatImageView7, (int) R.color.icon_n3);
        constraintLayout2.addView(appCompatImageView7, layoutParams13);
        return constraintLayout;
    }
}
