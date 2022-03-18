package com.by.p098a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.C0178a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.by.inflate_lib.AbstractC2604b;
import com.larksuite.component.ui.layout.LKUIRoundableLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.DonutProgress;

/* renamed from: com.by.a.q */
public class C2589q implements AbstractC2604b {
    @Override // com.by.inflate_lib.AbstractC2604b
    /* renamed from: a */
    public View mo11274a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        int i;
        Resources resources = context.getResources();
        LKUIRoundableLayout lKUIRoundableLayout = new LKUIRoundableLayout(context);
        lKUIRoundableLayout.setBorderColor(resources.getColor(R.color.line_border_card));
        lKUIRoundableLayout.setBorderWidthInPx(TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        lKUIRoundableLayout.setRadiusInPx((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        lKUIRoundableLayout.setId(R.id.media_content);
        ViewGroup.LayoutParams a = C0178a.m579a(viewGroup, -1, -1);
        View appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.media_cover);
        ViewGroup.LayoutParams a2 = C0178a.m579a(lKUIRoundableLayout, -1, -1);
        if (ConstraintLayout.LayoutParams.class.isInstance(a2)) {
            ((ConstraintLayout.LayoutParams) a2).f2819k = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(a2)) {
            ((ConstraintLayout.LayoutParams) a2).f2812d = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(a2)) {
            ((ConstraintLayout.LayoutParams) a2).f2815g = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(a2)) {
            ((ConstraintLayout.LayoutParams) a2).f2816h = 0;
        }
        C0178a.m580a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            lKUIRoundableLayout.addView(appCompatImageView, a2);
        }
        View view = new View(context);
        view.setId(R.id.media_cover_foreground);
        if (Build.VERSION.SDK_INT >= 26) {
            view.setForeground(context.getResources().getDrawable(R.drawable.common_black_c1_a30_bg));
        }
        ViewGroup.LayoutParams a3 = C0178a.m579a(lKUIRoundableLayout, -1, -1);
        if (ConstraintLayout.LayoutParams.class.isInstance(a3)) {
            ((ConstraintLayout.LayoutParams) a3).f2819k = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(a3)) {
            ((ConstraintLayout.LayoutParams) a3).f2812d = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(a3)) {
            ((ConstraintLayout.LayoutParams) a3).f2815g = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(a3)) {
            ((ConstraintLayout.LayoutParams) a3).f2816h = 0;
        }
        C0178a.m580a(view);
        if (view.getParent() == null) {
            lKUIRoundableLayout.addView(view, a3);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ViewGroup.LayoutParams a4 = C0178a.m579a(lKUIRoundableLayout, -2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a4)) {
            ((LinearLayout.LayoutParams) a4).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a4)) {
            ((FrameLayout.LayoutParams) a4).gravity = 17;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(a4)) {
            ((DrawerLayout.LayoutParams) a4).f3665a = 17;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(a4)) {
            ((ConstraintLayout.LayoutParams) a4).f2819k = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(a4)) {
            ((ConstraintLayout.LayoutParams) a4).f2812d = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(a4)) {
            ((ConstraintLayout.LayoutParams) a4).f2815g = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(a4)) {
            ((ConstraintLayout.LayoutParams) a4).f2816h = 0;
        }
        DonutProgress donutProgress = new DonutProgress(context);
        donutProgress.setProgress(50.0f);
        donutProgress.setInnerBackgroundColor(resources.getColor(R.color.lkui_N00));
        donutProgress.setStartingDegree(270);
        donutProgress.setFinishedStrokeColor(resources.getColor(R.color.lkui_B500));
        donutProgress.setFinishedStrokeWidth(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        donutProgress.setTextColor(resources.getColor(R.color.lkui_N900));
        donutProgress.setTextSize(TypedValue.applyDimension(2, 15.0f, resources.getDisplayMetrics()));
        donutProgress.setUnfinishedStrokeColor(resources.getColor(R.color.lkui_N300));
        donutProgress.setUnfinishedStrokeWidth(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        donutProgress.setId(R.id.media_upload_progress);
        donutProgress.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((DrawerLayout.LayoutParams) layoutParams).f3665a = 17;
        }
        C0178a.m580a(donutProgress);
        if (donutProgress.getParent() == null) {
            linearLayout.addView(donutProgress, layoutParams);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setId(R.id.media_media_play);
        appCompatImageView2.setImageResource(R.drawable.media_play);
        appCompatImageView2.setVisibility(8);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        C0178a.m580a(appCompatImageView2);
        if (appCompatImageView2.getParent() == null) {
            linearLayout.addView(appCompatImageView2, layoutParams2);
        }
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context);
        appCompatImageView3.setId(R.id.media_continue_upload);
        appCompatImageView3.setImageResource(R.drawable.media_continue_upload);
        appCompatImageView3.setVisibility(8);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        C0178a.m580a(appCompatImageView3);
        if (appCompatImageView3.getParent() == null) {
            linearLayout.addView(appCompatImageView3, layoutParams3);
        }
        C0178a.m580a(linearLayout);
        if (linearLayout.getParent() == null) {
            lKUIRoundableLayout.addView(linearLayout, a4);
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R.id.media_duration);
        appCompatTextView.setBackgroundResource(R.drawable.common_black_c1_a70_bg);
        boolean z2 = appCompatTextView instanceof TextView;
        if (z2) {
            appCompatTextView.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 3.5f, resources.getDisplayMetrics()));
        }
        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingRight(), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        appCompatTextView.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), appCompatTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), appCompatTextView.getPaddingBottom());
        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
        appCompatTextView.setTextColor(resources.getColorStateList(R.color.lkui_N00));
        appCompatTextView.setTextSize(2, 12.0f);
        ViewGroup.LayoutParams a5 = C0178a.m579a(lKUIRoundableLayout, -2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a5)) {
            ((LinearLayout.LayoutParams) a5).gravity = 8388693;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a5)) {
            ((FrameLayout.LayoutParams) a5).gravity = 8388693;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(a5)) {
            ((DrawerLayout.LayoutParams) a5).f3665a = 8388693;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a5)) {
            ((ViewGroup.MarginLayoutParams) a5).bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a5) && Build.VERSION.SDK_INT >= 17) {
            ((ViewGroup.MarginLayoutParams) a5).setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(a5)) {
            i = 0;
            ((ConstraintLayout.LayoutParams) a5).f2819k = 0;
        } else {
            i = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(a5)) {
            ((ConstraintLayout.LayoutParams) a5).f2815g = i;
        }
        if (z2) {
            appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(R.drawable.ic_svg_video_time_icon), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        C0178a.m580a(appCompatTextView);
        if (appCompatTextView.getParent() == null) {
            lKUIRoundableLayout.addView(appCompatTextView, a5);
        }
        C0178a.m580a(lKUIRoundableLayout);
        lKUIRoundableLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(lKUIRoundableLayout);
        }
        return lKUIRoundableLayout;
    }
}
