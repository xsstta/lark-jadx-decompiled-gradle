package com.by.p098a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import android.view.C0178a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.C0942e;
import androidx.drawerlayout.widget.DrawerLayout;
import com.by.inflate_lib.AbstractC2604b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.vc.common.widget.avatarlist.VcCrescentAvatarListView;

/* renamed from: com.by.a.ab */
public class C2572ab implements AbstractC2604b {
    @Override // com.by.inflate_lib.AbstractC2604b
    /* renamed from: a */
    public View mo11274a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.meeting_card_message_container);
        ViewGroup.LayoutParams a = C0178a.m579a(viewGroup, (int) resources.getDimension(R.dimen.imdimen_message_card_width), -2);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.video_meeting_card_container);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.video_meeting_card_header);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), (int) resources.getDimension(R.dimen.dp_12), linearLayout2.getPaddingRight(), linearLayout2.getPaddingBottom());
        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), linearLayout2.getPaddingTop(), linearLayout2.getPaddingRight(), (int) resources.getDimension(R.dimen.dp_12));
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        ViewGroup.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.video_meeting_card_video_icon);
        appCompatImageView.setImageResource(R.drawable.ud_icon_video_filled);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        C0942e.m4551a(appCompatImageView, resources.getColorStateList(R.color.udtoken_message_card_text_green));
        ViewGroup.LayoutParams layoutParams5 = new LinearLayout.LayoutParams((int) resources.getDimension(R.dimen.dp_16), (int) resources.getDimension(R.dimen.dp_12));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5) && Build.VERSION.SDK_INT >= 17) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).setMarginStart((int) resources.getDimension(R.dimen.dp_12));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((FrameLayout.LayoutParams) layoutParams5).gravity = 16;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((DrawerLayout.LayoutParams) layoutParams5).f3665a = 16;
        }
        C0178a.m580a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            linearLayout3.addView(appCompatImageView, layoutParams5);
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R.id.video_meeting_card_meeting_title_line1);
        appCompatTextView.setTextColor(resources.getColorStateList(R.color.udtoken_message_card_text_green));
        appCompatTextView.setTextSize(0, resources.getDimension(R.dimen.dp_16));
        appCompatTextView.setTypeface(Typeface.defaultFromStyle(1));
        if (appCompatTextView instanceof TextView) {
            appCompatTextView.setIncludeFontPadding(false);
        }
        ViewGroup.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6) && Build.VERSION.SDK_INT >= 17) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).setMarginStart((int) resources.getDimension(R.dimen.dp_8));
        }
        appCompatTextView.setGravity(16);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((LinearLayout.LayoutParams) layoutParams6).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((FrameLayout.LayoutParams) layoutParams6).gravity = 16;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((DrawerLayout.LayoutParams) layoutParams6).f3665a = 16;
        }
        C0178a.m580a(appCompatTextView);
        if (appCompatTextView.getParent() == null) {
            linearLayout3.addView(appCompatTextView, layoutParams6);
        }
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setId(R.id.externalTagView1);
        appCompatTextView2.setBackgroundResource(R.drawable.bg_tag_external_meetingcard);
        appCompatTextView2.setPadding(appCompatTextView2.getPaddingLeft(), appCompatTextView2.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), appCompatTextView2.getPaddingBottom());
        appCompatTextView2.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), appCompatTextView2.getPaddingTop(), appCompatTextView2.getPaddingRight(), appCompatTextView2.getPaddingBottom());
        appCompatTextView2.setText(R.string.View_G_ExternalLabel);
        appCompatTextView2.setTextColor(resources.getColorStateList(R.color.udtoken_tag_text_s_green));
        appCompatTextView2.setTextSize(1, 12.0f);
        appCompatTextView2.setTypeface(Typeface.defaultFromStyle(1));
        appCompatTextView2.setVisibility(8);
        ViewGroup.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            i = 16;
            ((LinearLayout.LayoutParams) layoutParams7).gravity = 16;
        } else {
            i = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((FrameLayout.LayoutParams) layoutParams7).gravity = i;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((DrawerLayout.LayoutParams) layoutParams7).f3665a = i;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7) && Build.VERSION.SDK_INT >= 17) {
            ((ViewGroup.MarginLayoutParams) layoutParams7).setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        appCompatTextView2.setGravity(17);
        C0178a.m580a(appCompatTextView2);
        if (appCompatTextView2.getParent() == null) {
            linearLayout3.addView(appCompatTextView2, layoutParams7);
        }
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        ViewGroup.LayoutParams layoutParams8 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, resources.getDisplayMetrics()), -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((LinearLayout.LayoutParams) layoutParams8).weight = (float) 1;
        }
        linearLayout4.setGravity(8388613);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            i2 = 16;
            ((LinearLayout.LayoutParams) layoutParams8).gravity = 16;
        } else {
            i2 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((FrameLayout.LayoutParams) layoutParams8).gravity = i2;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((DrawerLayout.LayoutParams) layoutParams8).f3665a = i2;
        }
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context);
        appCompatTextView3.setId(R.id.video_meeting_card_time);
        appCompatTextView3.setTextSize(0, resources.getDimension(R.dimen.dp_14));
        appCompatTextView3.setTextColor(resources.getColorStateList(R.color.udtoken_message_card_text_green));
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        appCompatTextView3.setGravity(8388613);
        if (!ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9) || Build.VERSION.SDK_INT < 17) {
            layoutParams = a;
        } else {
            layoutParams = a;
            layoutParams9.setMarginEnd((int) resources.getDimension(R.dimen.dp_12));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams9)) {
            i3 = 16;
            layoutParams9.gravity = 16;
        } else {
            i3 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams9)) {
            ((FrameLayout.LayoutParams) layoutParams9).gravity = i3;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(layoutParams9)) {
            ((DrawerLayout.LayoutParams) layoutParams9).f3665a = i3;
        }
        C0178a.m580a(appCompatTextView3);
        if (appCompatTextView3.getParent() == null) {
            linearLayout4.addView(appCompatTextView3, layoutParams9);
        }
        C0178a.m580a(linearLayout4);
        if (linearLayout4.getParent() == null) {
            linearLayout3.addView(linearLayout4, layoutParams8);
        }
        C0178a.m580a(linearLayout3);
        if (linearLayout3.getParent() == null) {
            linearLayout2.addView(linearLayout3, layoutParams4);
        }
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setOrientation(0);
        linearLayout5.setVisibility(8);
        linearLayout5.setId(R.id.video_meeting_card_title_container_line2);
        ViewGroup.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10) && Build.VERSION.SDK_INT >= 17) {
            ((ViewGroup.MarginLayoutParams) layoutParams10).setMarginStart((int) resources.getDimension(R.dimen.dp_36));
        }
        linearLayout5.setGravity(16);
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(context);
        appCompatTextView4.setId(R.id.video_meeting_card_meeting_title_line2);
        appCompatTextView4.setTextColor(resources.getColorStateList(R.color.udtoken_message_card_text_green));
        appCompatTextView4.setTextSize(0, resources.getDimension(R.dimen.dp_16));
        appCompatTextView4.setTypeface(Typeface.defaultFromStyle(1));
        appCompatTextView4.setVisibility(8);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
        appCompatTextView4.setGravity(16);
        C0178a.m580a(appCompatTextView4);
        if (appCompatTextView4.getParent() == null) {
            linearLayout5.addView(appCompatTextView4, layoutParams11);
        }
        AppCompatTextView appCompatTextView5 = new AppCompatTextView(context);
        appCompatTextView5.setId(R.id.externalTagView2);
        appCompatTextView5.setBackgroundResource(R.drawable.bg_tag_external_meetingcard);
        appCompatTextView5.setTextSize(1, 12.0f);
        appCompatTextView5.setTypeface(Typeface.defaultFromStyle(1));
        appCompatTextView5.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), appCompatTextView5.getPaddingTop(), appCompatTextView5.getPaddingRight(), appCompatTextView5.getPaddingBottom());
        appCompatTextView5.setPadding(appCompatTextView5.getPaddingLeft(), appCompatTextView5.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), appCompatTextView5.getPaddingBottom());
        appCompatTextView5.setVisibility(8);
        appCompatTextView5.setTextColor(resources.getColorStateList(R.color.udtoken_tag_text_s_green));
        appCompatTextView5.setText(R.string.View_G_ExternalLabel);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams12)) {
            i4 = 16;
            layoutParams12.gravity = 16;
        } else {
            i4 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams12)) {
            ((FrameLayout.LayoutParams) layoutParams12).gravity = i4;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(layoutParams12)) {
            ((DrawerLayout.LayoutParams) layoutParams12).f3665a = i4;
        }
        appCompatTextView5.setGravity(17);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12) && Build.VERSION.SDK_INT >= 17) {
            layoutParams12.setMarginStart((int) resources.getDimension(R.dimen.dp_6));
        }
        C0178a.m580a(appCompatTextView5);
        if (appCompatTextView5.getParent() == null) {
            linearLayout5.addView(appCompatTextView5, layoutParams12);
        }
        C0178a.m580a(linearLayout5);
        if (linearLayout5.getParent() == null) {
            linearLayout2.addView(linearLayout5, layoutParams10);
        }
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setId(R.id.short_card_title_name_container);
        linearLayout6.setOrientation(0);
        linearLayout6.setVisibility(8);
        ViewGroup.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13) && Build.VERSION.SDK_INT >= 17) {
            ((ViewGroup.MarginLayoutParams) layoutParams13).setMarginStart((int) resources.getDimension(R.dimen.dp_12));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13) && Build.VERSION.SDK_INT >= 17) {
            ((ViewGroup.MarginLayoutParams) layoutParams13).setMarginEnd((int) resources.getDimension(R.dimen.dp_12));
        }
        AppCompatTextView appCompatTextView6 = new AppCompatTextView(context);
        appCompatTextView6.setId(R.id.video_meeting_short_card_meeting_title_line);
        appCompatTextView6.setTextColor(resources.getColorStateList(R.color.udtoken_message_card_text_green));
        appCompatTextView6.setTextSize(0, resources.getDimension(R.dimen.dp_16));
        appCompatTextView6.setTypeface(Typeface.defaultFromStyle(1));
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-2, -2);
        appCompatTextView6.setGravity(16);
        C0178a.m580a(appCompatTextView6);
        if (appCompatTextView6.getParent() == null) {
            linearLayout6.addView(appCompatTextView6, layoutParams14);
        }
        AppCompatTextView appCompatTextView7 = new AppCompatTextView(context);
        appCompatTextView7.setId(R.id.externalTagView3);
        appCompatTextView7.setBackgroundResource(R.drawable.bg_tag_external_meetingcard);
        appCompatTextView7.setTextSize(1, 12.0f);
        appCompatTextView7.setTypeface(Typeface.defaultFromStyle(1));
        appCompatTextView7.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), appCompatTextView7.getPaddingTop(), appCompatTextView7.getPaddingRight(), appCompatTextView7.getPaddingBottom());
        appCompatTextView7.setPadding(appCompatTextView7.getPaddingLeft(), appCompatTextView7.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), appCompatTextView7.getPaddingBottom());
        appCompatTextView7.setVisibility(8);
        appCompatTextView7.setTextColor(resources.getColorStateList(R.color.udtoken_tag_text_s_green));
        appCompatTextView7.setText(R.string.View_G_ExternalLabel);
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams15)) {
            i5 = 16;
            layoutParams15.gravity = 16;
        } else {
            i5 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams15)) {
            ((FrameLayout.LayoutParams) layoutParams15).gravity = i5;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(layoutParams15)) {
            ((DrawerLayout.LayoutParams) layoutParams15).f3665a = i5;
        }
        appCompatTextView7.setGravity(17);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams15) && Build.VERSION.SDK_INT >= 17) {
            layoutParams15.setMarginStart((int) resources.getDimension(R.dimen.dp_6));
        }
        C0178a.m580a(appCompatTextView7);
        if (appCompatTextView7.getParent() == null) {
            linearLayout6.addView(appCompatTextView7, layoutParams15);
        }
        C0178a.m580a(linearLayout6);
        if (linearLayout6.getParent() == null) {
            linearLayout2.addView(linearLayout6, layoutParams13);
        }
        C0178a.m580a(linearLayout2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2, layoutParams3);
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.video_meeting_card_content);
        ViewGroup.LayoutParams layoutParams16 = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout7 = new LinearLayout(context);
        linearLayout7.setId(R.id.ll_card_meeting_id);
        linearLayout7.setOrientation(0);
        ViewGroup.LayoutParams layoutParams17 = new ConstraintLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams17)) {
            ((ViewGroup.MarginLayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams17)).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams17) && Build.VERSION.SDK_INT >= 17) {
            ((ViewGroup.MarginLayoutParams) layoutParams17).setMarginStart((int) resources.getDimension(R.dimen.dp_12));
        }
        linearLayout7.setGravity(16);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams17)) {
            i6 = 0;
            ((ConstraintLayout.LayoutParams) layoutParams17).f2816h = 0;
        } else {
            i6 = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams17)) {
            ((ConstraintLayout.LayoutParams) layoutParams17).f2825q = i6;
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setId(R.id.icon_card_id);
        appCompatImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        appCompatImageView2.setImageResource(R.drawable.ud_icon_info_outlined);
        C0942e.m4551a(appCompatImageView2, resources.getColorStateList(R.color.icon_n2));
        LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams((int) resources.getDimension(R.dimen.dp_16), (int) resources.getDimension(R.dimen.dp_16));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams18)) {
            i7 = 16;
            layoutParams18.gravity = 16;
        } else {
            i7 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams18)) {
            ((FrameLayout.LayoutParams) layoutParams18).gravity = i7;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(layoutParams18)) {
            ((DrawerLayout.LayoutParams) layoutParams18).f3665a = i7;
        }
        C0178a.m580a(appCompatImageView2);
        if (appCompatImageView2.getParent() == null) {
            linearLayout7.addView(appCompatImageView2, layoutParams18);
        }
        AppCompatTextView appCompatTextView8 = new AppCompatTextView(context);
        appCompatTextView8.setId(R.id.video_meeting_meet_number);
        appCompatTextView8.setTextColor(resources.getColorStateList(R.color.text_title));
        appCompatTextView8.setTextSize(0, resources.getDimension(R.dimen.dp_14));
        appCompatTextView8.setText(R.string.View_M_MeetingIdColon);
        LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams(-2, -2);
        appCompatTextView8.setGravity(16);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams19)) {
            layoutParams19.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams19)) {
            ((FrameLayout.LayoutParams) layoutParams19).gravity = 16;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(layoutParams19)) {
            ((DrawerLayout.LayoutParams) layoutParams19).f3665a = 16;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19) && Build.VERSION.SDK_INT >= 17) {
            layoutParams19.setMarginStart((int) resources.getDimension(R.dimen.dp_8));
        }
        C0178a.m580a(appCompatTextView8);
        if (appCompatTextView8.getParent() == null) {
            linearLayout7.addView(appCompatTextView8, layoutParams19);
        }
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context);
        appCompatImageView3.setId(R.id.video_meeting_card_copy_meetinginfo);
        appCompatImageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
        appCompatImageView3.setImageResource(R.drawable.ud_icon_copy_outlined);
        C0942e.m4551a(appCompatImageView3, resources.getColorStateList(R.color.icon_n2));
        appCompatImageView3.setVisibility(8);
        LinearLayout.LayoutParams layoutParams20 = new LinearLayout.LayoutParams((int) resources.getDimension(R.dimen.dp_16), (int) resources.getDimension(R.dimen.dp_16));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams20) && Build.VERSION.SDK_INT >= 17) {
            layoutParams20.setMarginStart((int) resources.getDimension(R.dimen.dp_8));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams20)) {
            i8 = 16;
            layoutParams20.gravity = 16;
        } else {
            i8 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams20)) {
            ((FrameLayout.LayoutParams) layoutParams20).gravity = i8;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(layoutParams20)) {
            ((DrawerLayout.LayoutParams) layoutParams20).f3665a = i8;
        }
        C0178a.m580a(appCompatImageView3);
        if (appCompatImageView3.getParent() == null) {
            linearLayout7.addView(appCompatImageView3, layoutParams20);
        }
        C0178a.m580a(linearLayout7);
        if (linearLayout7.getParent() == null) {
            constraintLayout.addView(linearLayout7, layoutParams17);
        }
        AppCompatImageView appCompatImageView4 = new AppCompatImageView(context);
        appCompatImageView4.setId(R.id.icon_card_avatar);
        appCompatImageView4.setImageResource(R.drawable.ud_icon_group_outlined);
        C0942e.m4551a(appCompatImageView4, resources.getColorStateList(R.color.icon_n2));
        appCompatImageView4.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ViewGroup.LayoutParams layoutParams21 = new ConstraintLayout.LayoutParams((int) resources.getDimension(R.dimen.dp_16), (int) resources.getDimension(R.dimen.dp_16));
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams21)) {
            ((ConstraintLayout.LayoutParams) layoutParams21).f2817i = R.id.ll_card_meeting_id;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams21)) {
            ((ConstraintLayout.LayoutParams) layoutParams21).f2825q = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams21)) {
            ((ConstraintLayout.LayoutParams) layoutParams21).f2818j = R.id.video_meeting_card_join_info_button_short_card;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams21)) {
            ((ViewGroup.MarginLayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams21)).bottomMargin = (int) resources.getDimension(R.dimen.dp_20);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams21)) {
            ((ViewGroup.MarginLayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams21)).topMargin = (int) resources.getDimension(R.dimen.dp_16);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams21) && Build.VERSION.SDK_INT >= 17) {
            ((ViewGroup.MarginLayoutParams) layoutParams21).setMarginStart((int) resources.getDimension(R.dimen.dp_12));
        }
        C0178a.m580a(appCompatImageView4);
        if (appCompatImageView4.getParent() == null) {
            constraintLayout.addView(appCompatImageView4, layoutParams21);
        }
        View vcCrescentAvatarListView = new VcCrescentAvatarListView(context);
        vcCrescentAvatarListView.setId(R.id.video_meeting_card_crescent_avatar_list);
        ViewGroup.LayoutParams layoutParams22 = new ConstraintLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams22) && Build.VERSION.SDK_INT >= 17) {
            ((ViewGroup.MarginLayoutParams) layoutParams22).setMarginStart((int) resources.getDimension(R.dimen.dp_8));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams22)) {
            ((ViewGroup.MarginLayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams22)).topMargin = (int) resources.getDimension(R.dimen.dp_12);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams22)) {
            ((ViewGroup.MarginLayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams22)).bottomMargin = (int) resources.getDimension(R.dimen.dp_16);
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams22)) {
            ((ConstraintLayout.LayoutParams) layoutParams22).f2824p = R.id.icon_card_avatar;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams22)) {
            ((ConstraintLayout.LayoutParams) layoutParams22).f2817i = R.id.ll_card_meeting_id;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams22)) {
            ((ConstraintLayout.LayoutParams) layoutParams22).f2818j = R.id.video_meeting_card_join_info_button_short_card;
        }
        C0178a.m580a(vcCrescentAvatarListView);
        if (vcCrescentAvatarListView.getParent() == null) {
            constraintLayout.addView(vcCrescentAvatarListView, layoutParams22);
        }
        AppCompatTextView appCompatTextView9 = new AppCompatTextView(context);
        appCompatTextView9.setId(R.id.video_meeting_card_join_info_button);
        appCompatTextView9.setText(R.string.View_M_JoinButton);
        appCompatTextView9.setTextColor(resources.getColorStateList(R.color.ud_G600));
        appCompatTextView9.setPadding(appCompatTextView9.getPaddingLeft(), (int) resources.getDimension(R.dimen.dp_6), appCompatTextView9.getPaddingRight(), appCompatTextView9.getPaddingBottom());
        appCompatTextView9.setPadding(appCompatTextView9.getPaddingLeft(), appCompatTextView9.getPaddingTop(), appCompatTextView9.getPaddingRight(), (int) resources.getDimension(R.dimen.dp_6));
        appCompatTextView9.setPadding((int) resources.getDimension(R.dimen.dp_16), appCompatTextView9.getPaddingTop(), appCompatTextView9.getPaddingRight(), appCompatTextView9.getPaddingBottom());
        appCompatTextView9.setPadding(appCompatTextView9.getPaddingLeft(), appCompatTextView9.getPaddingTop(), (int) resources.getDimension(R.dimen.dp_16), appCompatTextView9.getPaddingBottom());
        if (TextView.class.isInstance(appCompatTextView9)) {
            C0178a.m581a(appCompatTextView9, (int) resources.getDimension(R.dimen.dp_80));
        } else {
            appCompatTextView9.setMinimumWidth((int) resources.getDimension(R.dimen.dp_80));
        }
        appCompatTextView9.setTextSize(0, resources.getDimension(R.dimen.dp_14));
        appCompatTextView9.setBackgroundResource(R.drawable.vc_bg_meeting_card_join_button);
        ViewGroup.LayoutParams layoutParams23 = new ConstraintLayout.LayoutParams(-2, (int) resources.getDimension(R.dimen.dp_32));
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams23)) {
            i9 = 0;
            ((ConstraintLayout.LayoutParams) layoutParams23).f2827s = 0;
        } else {
            i9 = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams23)) {
            ((ConstraintLayout.LayoutParams) layoutParams23).f2819k = i9;
        }
        if (!ViewGroup.MarginLayoutParams.class.isInstance(layoutParams23) || Build.VERSION.SDK_INT < 17) {
            i10 = R.dimen.dp_12;
        } else {
            i10 = R.dimen.dp_12;
            ((ViewGroup.MarginLayoutParams) layoutParams23).setMarginEnd((int) resources.getDimension(R.dimen.dp_12));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams23)) {
            ((ViewGroup.MarginLayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams23)).bottomMargin = (int) resources.getDimension(i10);
        }
        appCompatTextView9.setGravity(17);
        C0178a.m580a(appCompatTextView9);
        if (appCompatTextView9.getParent() == null) {
            constraintLayout.addView(appCompatTextView9, layoutParams23);
        }
        AppCompatTextView appCompatTextView10 = new AppCompatTextView(context);
        appCompatTextView10.setId(R.id.video_meeting_card_join_info_button_short_card);
        appCompatTextView10.setBackgroundResource(R.drawable.vc_bg_meeting_card_join_button);
        appCompatTextView10.setTextSize(0, resources.getDimension(R.dimen.dp_14));
        appCompatTextView10.setTextColor(resources.getColorStateList(R.color.static_white));
        appCompatTextView10.setText(R.string.View_M_JoinButton);
        appCompatTextView10.setVisibility(8);
        ViewGroup.LayoutParams layoutParams24 = new ConstraintLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams24)) {
            ((ViewGroup.MarginLayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams24)).bottomMargin = (int) resources.getDimension(R.dimen.dp_12);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams24) && Build.VERSION.SDK_INT >= 17) {
            ((ViewGroup.MarginLayoutParams) layoutParams24).setMarginStart((int) resources.getDimension(R.dimen.dp_12));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams24) && Build.VERSION.SDK_INT >= 17) {
            ((ViewGroup.MarginLayoutParams) layoutParams24).setMarginEnd((int) resources.getDimension(R.dimen.dp_12));
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams24)) {
            i11 = 0;
            ((ConstraintLayout.LayoutParams) layoutParams24).f2825q = 0;
        } else {
            i11 = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams24)) {
            ((ConstraintLayout.LayoutParams) layoutParams24).f2827s = i11;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams24)) {
            ((ConstraintLayout.LayoutParams) layoutParams24).f2819k = i11;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams24)) {
            ((ViewGroup.MarginLayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams24)).topMargin = (int) resources.getDimension(R.dimen.dp_16);
        }
        appCompatTextView10.setGravity(17);
        C0178a.m580a(appCompatTextView10);
        if (appCompatTextView10.getParent() == null) {
            constraintLayout.addView(appCompatTextView10, layoutParams24);
        }
        C0178a.m580a(constraintLayout);
        if (constraintLayout.getParent() == null) {
            linearLayout.addView(constraintLayout, layoutParams16);
        }
        C0178a.m580a(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout.addView(linearLayout, layoutParams2);
        }
        AppCompatTextView appCompatTextView11 = new AppCompatTextView(context);
        appCompatTextView11.setId(R.id.video_meeting_card_chat_room_textview);
        appCompatTextView11.setTextColor(resources.getColorStateList(R.color.ud_N500));
        appCompatTextView11.setTextSize(2, 17.0f);
        appCompatTextView11.setText(R.string.View_C_InvitedToVirtualOffice);
        appCompatTextView11.setVisibility(8);
        ViewGroup.LayoutParams layoutParams25 = new FrameLayout.LayoutParams(-2, -2);
        C0178a.m580a(appCompatTextView11);
        if (appCompatTextView11.getParent() == null) {
            frameLayout.addView(appCompatTextView11, layoutParams25);
        }
        C0178a.m580a(frameLayout);
        frameLayout.setLayoutParams(layoutParams);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
