package com.by.p098a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.C0178a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.C0942e;
import androidx.drawerlayout.widget.DrawerLayout;
import com.by.inflate_lib.AbstractC2604b;
import com.larksuite.suite.R;

/* renamed from: com.by.a.ac */
public class C2573ac implements AbstractC2604b {
    @Override // com.by.inflate_lib.AbstractC2604b
    /* renamed from: a */
    public View mo11274a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.ll_timezone_container);
        linearLayout.setOrientation(0);
        linearLayout.setPadding((int) TypedValue.applyDimension(1, 16.5f, resources.getDisplayMetrics()), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        linearLayout.setPadding(linearLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.5f, resources.getDisplayMetrics()), linearLayout.getPaddingBottom());
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        linearLayout.setVisibility(8);
        ViewGroup.MarginLayoutParams a = C0178a.m579a(viewGroup, -2, (int) TypedValue.applyDimension(1, 39.0f, resources.getDisplayMetrics()));
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.iv_icon);
        appCompatImageView.setImageResource(R.drawable.ud_icon_time_outlined);
        C0942e.m4551a(appCompatImageView, resources.getColorStateList(R.color.icon_n3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 16;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((DrawerLayout.LayoutParams) layoutParams).f3665a = 16;
        }
        C0178a.m580a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            linearLayout.addView(appCompatImageView, layoutParams);
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R.id.tv_timezone_tip);
        appCompatTextView.setTextColor(resources.getColorStateList(R.color.text_placeholder));
        appCompatTextView.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2) && Build.VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 16;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((DrawerLayout.LayoutParams) layoutParams2).f3665a = 16;
        }
        C0178a.m580a(appCompatTextView);
        if (appCompatTextView.getParent() == null) {
            linearLayout.addView(appCompatTextView, layoutParams2);
        }
        C0178a.m580a(linearLayout);
        linearLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
