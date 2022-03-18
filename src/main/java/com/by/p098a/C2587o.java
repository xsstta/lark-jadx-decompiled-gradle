package com.by.p098a;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.C0178a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.by.inflate_lib.AbstractC2604b;
import com.larksuite.component.ui.layout.LKUIRoundableLayout;
import com.larksuite.suite.R;

/* renamed from: com.by.a.o */
public class C2587o implements AbstractC2604b {
    @Override // com.by.inflate_lib.AbstractC2604b
    /* renamed from: a */
    public View mo11274a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        int i;
        Resources resources = context.getResources();
        LKUIRoundableLayout lKUIRoundableLayout = new LKUIRoundableLayout(context);
        lKUIRoundableLayout.setId(R.id.round_container);
        lKUIRoundableLayout.setBackgroundColor(resources.getColor(R.color.bg_float));
        ViewGroup.LayoutParams a = C0178a.m579a(viewGroup, -1, -2);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setPadding((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        ViewGroup.LayoutParams a2 = C0178a.m579a(lKUIRoundableLayout, -1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a2)) {
            ((LinearLayout.LayoutParams) a2).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a2)) {
            ((FrameLayout.LayoutParams) a2).gravity = 17;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(a2)) {
            ((DrawerLayout.LayoutParams) a2).f3665a = 17;
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R.id.title_tv);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setMaxLines(2);
        appCompatTextView.setTextColor(resources.getColorStateList(R.color.text_title));
        appCompatTextView.setTextSize(0, resources.getDimension(R.dimen.sp_16));
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(10, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams)).leftMargin = (int) resources.getDimension(R.dimen.dp_12);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams)).rightMargin = (int) resources.getDimension(R.dimen.dp_12);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams)).topMargin = (int) resources.getDimension(R.dimen.dp_12);
        }
        C0178a.m580a(appCompatTextView);
        if (appCompatTextView.getParent() == null) {
            relativeLayout.addView(appCompatTextView, layoutParams);
        }
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setId(R.id.sub_title_tv);
        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView2.setMaxLines(1);
        appCompatTextView2.setTextColor(resources.getColorStateList(R.color.text_caption));
        appCompatTextView2.setTextSize(0, resources.getDimension(R.dimen.sp_14));
        ViewGroup.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((RelativeLayout.LayoutParams) layoutParams2).addRule(3, R.id.title_tv);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams2)).leftMargin = (int) resources.getDimension(R.dimen.dp_12);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams2)).rightMargin = (int) resources.getDimension(R.dimen.dp_12);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams2)).topMargin = (int) TypedValue.applyDimension(1, 2.5f, resources.getDisplayMetrics());
        }
        C0178a.m580a(appCompatTextView2);
        if (appCompatTextView2.getParent() == null) {
            relativeLayout.addView(appCompatTextView2, layoutParams2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams3)).topMargin = (int) resources.getDimension(R.dimen.dp_12);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((RelativeLayout.LayoutParams) layoutParams3).addRule(3, R.id.sub_title_tv);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.location_iv);
        appCompatImageView.setBackgroundColor(resources.getColor(R.color.bg_body_overlay));
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        C0178a.m580a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            frameLayout.addView(appCompatImageView, layoutParams4);
        }
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setId(R.id.location_message_image_loading);
        progressBar.setVisibility(8);
        progressBar.setIndeterminateDrawableTiled(context.getResources().getDrawable(R.drawable.progressbar_round));
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            i = 17;
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 17;
        } else {
            i = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = i;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((DrawerLayout.LayoutParams) layoutParams5).f3665a = i;
        }
        C0178a.m580a(progressBar);
        if (progressBar.getParent() == null) {
            frameLayout.addView(progressBar, layoutParams5);
        }
        C0178a.m580a(frameLayout);
        if (frameLayout.getParent() == null) {
            relativeLayout.addView(frameLayout, layoutParams3);
        }
        C0178a.m580a(relativeLayout);
        if (relativeLayout.getParent() == null) {
            lKUIRoundableLayout.addView(relativeLayout, a2);
        }
        C0178a.m580a(lKUIRoundableLayout);
        lKUIRoundableLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(lKUIRoundableLayout);
        }
        return lKUIRoundableLayout;
    }
}
