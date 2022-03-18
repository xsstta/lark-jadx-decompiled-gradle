package com.by.p098a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.C0178a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.C0942e;
import androidx.drawerlayout.widget.DrawerLayout;
import com.by.inflate_lib.AbstractC2604b;
import com.by.inflate_lib.p099a.C2600a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.badge.UDBadgeView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.p2197k.C42712a;
import com.ss.android.lark.mail.impl.p2197k.C42713b;

/* renamed from: com.by.a.p */
public class C2588p implements AbstractC2604b {
    @Override // com.by.inflate_lib.AbstractC2604b
    /* renamed from: a */
    public View mo11274a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Resources resources = context.getResources();
        if (viewGroup == null || !z) {
            throw new IllegalStateException("merge tag container should not be null attach should not be false");
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.mail_home_item_layout);
        relativeLayout.setBackgroundResource(R.drawable.mail_threadlist_item_unread_selector);
        ViewGroup.LayoutParams a = C0178a.m579a(viewGroup, -1, (int) resources.getDimension(R.dimen.mail_home_thread_list_item_height));
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        relativeLayout2.setId(R.id.mail_home_item_badge_checkbox_position);
        if (TextView.class.isInstance(relativeLayout2)) {
            C0178a.m581a(relativeLayout2, (int) resources.getDimension(R.dimen.mail_thread_item_front_min_width));
        } else {
            relativeLayout2.setMinimumWidth((int) resources.getDimension(R.dimen.mail_thread_item_front_min_width));
        }
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(9, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(10, -1);
        }
        UDBadgeView uDBadgeView = new UDBadgeView(context);
        uDBadgeView.setBadgeColor(resources.getColor(R.color.function_danger_500));
        uDBadgeView.setBadgeSize(TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        uDBadgeView.setBadgeColor(resources.getColor(R.color.function_info_500));
        uDBadgeView.setId(R.id.mail_home_item_read_rea_dot);
        uDBadgeView.setPadding((int) TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, resources.getDisplayMetrics()));
        uDBadgeView.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        C42712a aVar = new C42712a();
        aVar.mo153391a("ud_badge_type", new C2600a.C2602b("dot"), uDBadgeView, layoutParams2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            i = -1;
            layoutParams2.addRule(9, -1);
        } else {
            i = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(10, i);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        aVar.mo153390a(uDBadgeView, layoutParams2);
        C0178a.m580a(uDBadgeView);
        if (uDBadgeView.getParent() == null) {
            relativeLayout2.addView(uDBadgeView, layoutParams2);
        }
        UDCheckBox uDCheckBox = new UDCheckBox(context);
        uDCheckBox.setId(R.id.thread_checkbox);
        uDCheckBox.setPadding((int) TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, resources.getDisplayMetrics()));
        uDCheckBox.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) resources.getDimension(R.dimen.mail_thread_item_front_checkbox_size), (int) resources.getDimension(R.dimen.mail_thread_item_front_checkbox_size));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            i2 = -1;
            layoutParams3.addRule(9, -1);
        } else {
            i2 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(10, i2);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = (int) resources.getDimension(R.dimen.mail_thread_item_front_checkbox_margin_left);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = (int) resources.getDimension(R.dimen.mail_thread_item_front_checkbox_margin_right);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics());
        }
        C42713b bVar = new C42713b();
        bVar.mo153393a("app:ud_checkbox_type", new C2600a.C2602b("check_box"), uDCheckBox, layoutParams3);
        bVar.mo153392a(uDCheckBox, layoutParams3);
        C0178a.m580a(uDCheckBox);
        if (uDCheckBox.getParent() == null) {
            relativeLayout2.addView(uDCheckBox, layoutParams3);
        }
        C0178a.m580a(relativeLayout2);
        if (relativeLayout2.getParent() == null) {
            relativeLayout.addView(relativeLayout2, layoutParams);
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.mail_home_container);
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), (int) resources.getDimension(R.dimen.mail_thread_container_padding_right), constraintLayout.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((RelativeLayout.LayoutParams) layoutParams4).addRule(1, R.id.mail_home_item_badge_checkbox_position);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.mailUserNameLv);
        linearLayout.setOrientation(0);
        ViewGroup.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()));
        linearLayout.setGravity(16);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((ConstraintLayout.LayoutParams) layoutParams5).f2812d = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((ConstraintLayout.LayoutParams) layoutParams5).f2816h = 0;
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setTypeface(Typeface.defaultFromStyle(0));
        appCompatTextView.setTextSize(0, resources.getDimension(R.dimen.ud_text_body0));
        appCompatTextView.setId(R.id.mail_home_item_draft_tag);
        if (appCompatTextView instanceof TextView) {
            appCompatTextView.setIncludeFontPadding(false);
        }
        appCompatTextView.setLines(1);
        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), appCompatTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), appCompatTextView.getPaddingBottom());
        appCompatTextView.setText(R.string.Mail_Drafts_DraftsItem);
        appCompatTextView.setTextColor(resources.getColorStateList(R.color.function_danger_500));
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -1);
        appCompatTextView.setGravity(16);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((RelativeLayout.LayoutParams) layoutParams6).addRule(9, -1);
        }
        C0178a.m580a(appCompatTextView);
        if (appCompatTextView.getParent() == null) {
            linearLayout.addView(appCompatTextView, layoutParams6);
        }
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setTypeface(Typeface.defaultFromStyle(1));
        appCompatTextView2.setTextSize(0, resources.getDimension(R.dimen.ud_text_headline));
        appCompatTextView2.setId(R.id.mail_home_item_user_name);
        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
        if (appCompatTextView2 instanceof TextView) {
            appCompatTextView2.setIncludeFontPadding(false);
        }
        appCompatTextView2.setLines(1);
        appCompatTextView2.setTextColor(resources.getColorStateList(R.color.text_title));
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, resources.getDisplayMetrics()), -1);
        appCompatTextView2.setGravity(16);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.weight = (float) 1;
        }
        C0178a.m580a(appCompatTextView2);
        if (appCompatTextView2.getParent() == null) {
            linearLayout.addView(appCompatTextView2, layoutParams7);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.mail_home_item_schedule_label);
        appCompatImageView.setNextFocusLeftId(R.id.mail_home_item_user_name);
        appCompatImageView.setImageResource(R.drawable.ud_icon_sent_scheduled_outlined);
        C0942e.m4551a(appCompatImageView, resources.getColorStateList(R.color.icon_n3));
        appCompatImageView.setVisibility(8);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams((int) resources.getDimension(R.dimen.mail_thread_label_size), (int) resources.getDimension(R.dimen.mail_thread_label_size));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((RelativeLayout.LayoutParams) layoutParams8).addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).leftMargin = (int) resources.getDimension(R.dimen.mail_thread_label_margin);
        }
        C0178a.m580a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            linearLayout.addView(appCompatImageView, layoutParams8);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setId(R.id.mail_home_item_time_schedule_label);
        appCompatImageView2.setImageResource(R.drawable.ud_icon_sent_scheduled_outlined);
        C0942e.m4551a(appCompatImageView2, resources.getColorStateList(R.color.primary_pri_500));
        appCompatImageView2.setVisibility(8);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams((int) resources.getDimension(R.dimen.mail_thread_label_size), (int) resources.getDimension(R.dimen.mail_thread_label_size));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams9)) {
            ((RelativeLayout.LayoutParams) layoutParams9).addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            ((ViewGroup.MarginLayoutParams) layoutParams9).leftMargin = (int) resources.getDimension(R.dimen.mail_thread_label_margin);
        }
        C0178a.m580a(appCompatImageView2);
        if (appCompatImageView2.getParent() == null) {
            linearLayout.addView(appCompatImageView2, layoutParams9);
        }
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context);
        appCompatImageView3.setId(R.id.mail_home_item_attac_label);
        appCompatImageView3.setImageResource(R.drawable.ud_icon_attachment_outlined);
        C0942e.m4551a(appCompatImageView3, resources.getColorStateList(R.color.icon_n3));
        appCompatImageView3.setVisibility(8);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams((int) resources.getDimension(R.dimen.mail_thread_label_size), (int) resources.getDimension(R.dimen.mail_thread_label_size));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            ((ViewGroup.MarginLayoutParams) layoutParams10).leftMargin = (int) resources.getDimension(R.dimen.mail_thread_label_margin);
        }
        C0178a.m580a(appCompatImageView3);
        if (appCompatImageView3.getParent() == null) {
            linearLayout.addView(appCompatImageView3, layoutParams10);
        }
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context);
        appCompatTextView3.setTypeface(Typeface.defaultFromStyle(0));
        appCompatTextView3.setTextSize(0, resources.getDimension(R.dimen.ud_text_caption1));
        appCompatTextView3.setId(R.id.mail_home_item_time);
        appCompatTextView3.setLines(1);
        appCompatTextView3.setTextColor(resources.getColorStateList(R.color.text_placeholder));
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
            ((ViewGroup.MarginLayoutParams) layoutParams11).leftMargin = (int) resources.getDimension(R.dimen.mail_thread_label_margin);
        }
        C0178a.m580a(appCompatTextView3);
        if (appCompatTextView3.getParent() == null) {
            linearLayout.addView(appCompatTextView3, layoutParams11);
        }
        C0178a.m580a(linearLayout);
        if (linearLayout.getParent() == null) {
            constraintLayout.addView(linearLayout, layoutParams5);
        }
        AppCompatImageView appCompatImageView4 = new AppCompatImageView(context);
        appCompatImageView4.setId(R.id.mail_home_item_flagged);
        appCompatImageView4.setImageResource(R.drawable.ud_icon_flag_outlined);
        C0942e.m4551a(appCompatImageView4, resources.getColorStateList(R.color.icon_n3));
        ViewGroup.LayoutParams layoutParams12 = new ConstraintLayout.LayoutParams((int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams12)) {
            ((LinearLayout.LayoutParams) layoutParams12).gravity = 5;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams12)) {
            ((FrameLayout.LayoutParams) layoutParams12).gravity = 5;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(layoutParams12)) {
            ((DrawerLayout.LayoutParams) layoutParams12).f3665a = 5;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            i3 = 1;
            ((ViewGroup.MarginLayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams12)).bottomMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        } else {
            i3 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            ((ViewGroup.MarginLayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams12)).leftMargin = (int) TypedValue.applyDimension(i3, 8.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams12)) {
            ((ConstraintLayout.LayoutParams) layoutParams12).f2815g = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams12)) {
            ((ConstraintLayout.LayoutParams) layoutParams12).f2813e = R.id.mail_home_item_content;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams12)) {
            ((ConstraintLayout.LayoutParams) layoutParams12).f2819k = 0;
        }
        C0178a.m580a(appCompatImageView4);
        if (appCompatImageView4.getParent() == null) {
            constraintLayout.addView(appCompatImageView4, layoutParams12);
        }
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(context);
        appCompatTextView4.setTypeface(Typeface.defaultFromStyle(1));
        appCompatTextView4.setTextSize(0, resources.getDimension(R.dimen.ud_text_caption2));
        appCompatTextView4.setId(R.id.mail_home_item_message_count);
        appCompatTextView4.setPadding((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), appCompatTextView4.getPaddingTop(), appCompatTextView4.getPaddingRight(), appCompatTextView4.getPaddingBottom());
        appCompatTextView4.setPadding(appCompatTextView4.getPaddingLeft(), appCompatTextView4.getPaddingTop(), (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), appCompatTextView4.getPaddingBottom());
        appCompatTextView4.setPadding(appCompatTextView4.getPaddingLeft(), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), appCompatTextView4.getPaddingRight(), appCompatTextView4.getPaddingBottom());
        appCompatTextView4.setPadding(appCompatTextView4.getPaddingLeft(), appCompatTextView4.getPaddingTop(), appCompatTextView4.getPaddingRight(), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        appCompatTextView4.setTextColor(resources.getColorStateList(R.color.udtoken_tag_neutral_text_normal));
        if (appCompatTextView4 instanceof TextView) {
            appCompatTextView4.setIncludeFontPadding(false);
        }
        appCompatTextView4.setBackgroundResource(R.drawable.mail_bg_home_item_message_count);
        ViewGroup.LayoutParams layoutParams13 = new ConstraintLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13)) {
            i4 = 1;
            ((ViewGroup.MarginLayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams13)).rightMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        } else {
            i4 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13)) {
            ((ViewGroup.MarginLayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams13)).leftMargin = (int) TypedValue.applyDimension(i4, 4.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams13)) {
            ((ConstraintLayout.LayoutParams) layoutParams13).f2815g = R.id.mail_home_item_flagged;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams13)) {
            ((ConstraintLayout.LayoutParams) layoutParams13).f2813e = R.id.mail_home_item_subject;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams13)) {
            ((ConstraintLayout.LayoutParams) layoutParams13).f2816h = R.id.mail_home_item_subject;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams13)) {
            ((ConstraintLayout.LayoutParams) layoutParams13).f2819k = R.id.mail_home_item_subject;
        }
        C0178a.m580a(appCompatTextView4);
        if (appCompatTextView4.getParent() == null) {
            constraintLayout.addView(appCompatTextView4, layoutParams13);
        }
        AppCompatTextView appCompatTextView5 = new AppCompatTextView(context);
        appCompatTextView5.setId(R.id.mail_home_item_folder);
        if (appCompatTextView5 instanceof TextView) {
            appCompatTextView5.setIncludeFontPadding(false);
        }
        appCompatTextView5.setTextSize(1, 14.0f);
        appCompatTextView5.setTextColor(resources.getColorStateList(R.color.text_title));
        appCompatTextView5.setVisibility(8);
        ViewGroup.LayoutParams layoutParams14 = new ConstraintLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams14)) {
            ((ViewGroup.MarginLayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams14)).rightMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams14)) {
            ((ConstraintLayout.LayoutParams) layoutParams14).f2816h = R.id.mail_home_item_subject;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams14)) {
            ((ConstraintLayout.LayoutParams) layoutParams14).f2819k = R.id.mail_home_item_subject;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams14)) {
            ((ConstraintLayout.LayoutParams) layoutParams14).f2812d = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams14)) {
            ((ConstraintLayout.LayoutParams) layoutParams14).f2814f = R.id.mail_home_item_subject;
        }
        appCompatTextView5.setGravity(16);
        C0178a.m580a(appCompatTextView5);
        if (appCompatTextView5.getParent() == null) {
            constraintLayout.addView(appCompatTextView5, layoutParams14);
        }
        AppCompatTextView appCompatTextView6 = new AppCompatTextView(context);
        appCompatTextView6.setTypeface(Typeface.defaultFromStyle(1));
        appCompatTextView6.setTextSize(0, resources.getDimension(R.dimen.ud_text_body1));
        appCompatTextView6.setId(R.id.mail_home_item_subject);
        appCompatTextView6.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView6.setLines(1);
        appCompatTextView6.setTextColor(resources.getColorStateList(R.color.text_title));
        if (appCompatTextView6 instanceof TextView) {
            appCompatTextView6.setIncludeFontPadding(false);
        }
        ViewGroup.LayoutParams layoutParams15 = new ConstraintLayout.LayoutParams((int) TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams15)) {
            ((ViewGroup.MarginLayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams15)).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams15)) {
            ((ConstraintLayout.LayoutParams) layoutParams15).f2813e = R.id.mail_home_item_folder;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams15)) {
            ((ConstraintLayout.LayoutParams) layoutParams15).f2814f = R.id.mail_home_item_message_count;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams15)) {
            ((ConstraintLayout.LayoutParams) layoutParams15).f2817i = R.id.mailUserNameLv;
        }
        C0178a.m580a(appCompatTextView6);
        if (appCompatTextView6.getParent() == null) {
            constraintLayout.addView(appCompatTextView6, layoutParams15);
        }
        AppCompatTextView appCompatTextView7 = new AppCompatTextView(context);
        appCompatTextView7.setTypeface(Typeface.defaultFromStyle(0));
        appCompatTextView7.setTextSize(0, resources.getDimension(R.dimen.ud_text_body2));
        appCompatTextView7.setId(R.id.mail_home_item_content);
        appCompatTextView7.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView7.setSingleLine(true);
        appCompatTextView7.setTextColor(resources.getColorStateList(R.color.text_placeholder));
        if (appCompatTextView7 instanceof TextView) {
            appCompatTextView7.setIncludeFontPadding(false);
        }
        ViewGroup.LayoutParams layoutParams16 = new ConstraintLayout.LayoutParams((int) TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams16)) {
            ((ViewGroup.MarginLayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams16)).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        appCompatTextView7.setGravity(16);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams16)) {
            ((ConstraintLayout.LayoutParams) layoutParams16).f2819k = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams16)) {
            ((ConstraintLayout.LayoutParams) layoutParams16).f2817i = R.id.mail_home_item_subject;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams16)) {
            ((ConstraintLayout.LayoutParams) layoutParams16).f2789G = 2;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams16)) {
            ((ConstraintLayout.LayoutParams) layoutParams16).f2814f = R.id.mail_home_item_flagged;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams16)) {
            ((ConstraintLayout.LayoutParams) layoutParams16).f2812d = 0;
        }
        C0178a.m580a(appCompatTextView7);
        if (appCompatTextView7.getParent() == null) {
            constraintLayout.addView(appCompatTextView7, layoutParams16);
        }
        C0178a.m580a(constraintLayout);
        if (constraintLayout.getParent() == null) {
            relativeLayout.addView(constraintLayout, layoutParams4);
        }
        View view = new View(context);
        view.setId(R.id.mail_flag_click);
        ViewGroup.LayoutParams layoutParams17 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams17)) {
            i5 = -1;
            ((RelativeLayout.LayoutParams) layoutParams17).addRule(12, -1);
        } else {
            i5 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams17)) {
            ((RelativeLayout.LayoutParams) layoutParams17).addRule(11, i5);
        }
        C0178a.m580a(view);
        if (view.getParent() == null) {
            relativeLayout.addView(view, layoutParams17);
        }
        View view2 = new View(context);
        view2.setId(R.id.mail_home_item_bottom_divider);
        ViewGroup.LayoutParams layoutParams18 = new RelativeLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.mail_divider_height));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams18)) {
            ((RelativeLayout.LayoutParams) layoutParams18).addRule(12, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams18)) {
            ((RelativeLayout.LayoutParams) layoutParams18).addRule(11, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams18)) {
            ((RelativeLayout.LayoutParams) layoutParams18).addRule(1, R.id.mail_home_item_badge_checkbox_position);
        }
        C0178a.m580a(view2);
        if (view2.getParent() == null) {
            relativeLayout.addView(view2, layoutParams18);
        }
        C0178a.m580a(relativeLayout);
        if (relativeLayout.getParent() == null) {
            viewGroup.addView(relativeLayout, a);
        }
        return viewGroup;
    }
}
