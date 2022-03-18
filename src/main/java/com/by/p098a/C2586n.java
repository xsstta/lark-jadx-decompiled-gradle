package com.by.p098a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C0178a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.by.inflate_lib.AbstractC2604b;
import com.larksuite.suite.R;

/* renamed from: com.by.a.n */
public class C2586n implements AbstractC2604b {
    @Override // com.by.inflate_lib.AbstractC2604b
    /* renamed from: a */
    public View mo11274a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.LayoutParams a = C0178a.m579a(viewGroup, -2, -2);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.tag_container);
        frameLayout2.setBackgroundResource(R.drawable.bubble_reaction_grey_bg);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams)).leftMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams)).topMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((DrawerLayout.LayoutParams) layoutParams2).f3665a = 17;
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.image_reaction_icon);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((FrameLayout.LayoutParams) layoutParams3).gravity = 16;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((DrawerLayout.LayoutParams) layoutParams3).f3665a = 16;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = (int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = (int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics());
        }
        C0178a.m580a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            linearLayout.addView(appCompatImageView, layoutParams3);
        }
        View view = new View(context);
        view.setId(R.id.vertical_split_reaction);
        view.setBackgroundColor(resources.getColor(R.color.line_divider_default));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((FrameLayout.LayoutParams) layoutParams4).gravity = 16;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((DrawerLayout.LayoutParams) layoutParams4).f3665a = 16;
        }
        C0178a.m580a(view);
        if (view.getParent() == null) {
            linearLayout.addView(view, layoutParams4);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.names_reaction_list);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding((int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()), linearLayout2.getPaddingTop(), linearLayout2.getPaddingRight(), linearLayout2.getPaddingBottom());
        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), linearLayout2.getPaddingTop(), (int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()), linearLayout2.getPaddingBottom());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((FrameLayout.LayoutParams) layoutParams5).gravity = 16;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((DrawerLayout.LayoutParams) layoutParams5).f3665a = 16;
        }
        C0178a.m580a(linearLayout2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2, layoutParams5);
        }
        C0178a.m580a(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout2.addView(linearLayout, layoutParams2);
        }
        C0178a.m580a(frameLayout2);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2, layoutParams);
        }
        C0178a.m580a(frameLayout);
        frameLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
