package com.by.p098a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C0178a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.by.inflate_lib.AbstractC2604b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.base.KeyBoardObserveFrameLayout;
import com.ss.android.lark.keyboard.base.NestScrollFrameLayout;
import com.ss.android.lark.keyboard.widget.KBPluginContainerView;

/* renamed from: com.by.a.m */
public class C2585m implements AbstractC2604b {
    @Override // com.by.inflate_lib.AbstractC2604b
    /* renamed from: a */
    public View mo11274a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.root_view);
        ViewGroup.LayoutParams a = C0178a.m579a(viewGroup, -1, -2);
        View frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.input_container);
        ViewGroup.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((ConstraintLayout.LayoutParams) layoutParams).f2803U = true;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((ConstraintLayout.LayoutParams) layoutParams).f2816h = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((ConstraintLayout.LayoutParams) layoutParams).f2818j = R.id.toolbar_region;
        }
        C0178a.m580a(frameLayout);
        if (frameLayout.getParent() == null) {
            constraintLayout.addView(frameLayout, layoutParams);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundColor(resources.getColor(R.color.bg_body_overlay));
        linearLayout.setId(R.id.toolbar_region);
        linearLayout.setOrientation(0);
        linearLayout.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), linearLayout.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-1, -2);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((ConstraintLayout.LayoutParams) layoutParams2).f2818j = R.id.kb_observer_layout;
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.tool_menu_wrapper);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, resources.getDisplayMetrics()), -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).weight = (float) 1;
        }
        KBPluginContainerView kBPluginContainerView = new KBPluginContainerView(context);
        kBPluginContainerView.setId(R.id.tool_menu);
        kBPluginContainerView.setClickable(true);
        kBPluginContainerView.setOrientation(0);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 16;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((DrawerLayout.LayoutParams) layoutParams4).f3665a = 16;
        }
        C0178a.m580a(kBPluginContainerView);
        if (kBPluginContainerView.getParent() == null) {
            frameLayout2.addView(kBPluginContainerView, layoutParams4);
        }
        C0178a.m580a(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout.addView(frameLayout2, layoutParams3);
        }
        View frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.btn_send_region);
        ViewGroup.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((FrameLayout.LayoutParams) layoutParams5).gravity = 8388613;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((DrawerLayout.LayoutParams) layoutParams5).f3665a = 8388613;
        }
        C0178a.m580a(frameLayout3);
        if (frameLayout3.getParent() == null) {
            linearLayout.addView(frameLayout3, layoutParams5);
        }
        C0178a.m580a(linearLayout);
        if (linearLayout.getParent() == null) {
            constraintLayout.addView(linearLayout, layoutParams2);
        }
        KeyBoardObserveFrameLayout keyBoardObserveFrameLayout = new KeyBoardObserveFrameLayout(context);
        keyBoardObserveFrameLayout.setId(R.id.kb_observer_layout);
        ViewGroup.LayoutParams layoutParams6 = new ConstraintLayout.LayoutParams(-1, -2);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((ConstraintLayout.LayoutParams) layoutParams6).f2819k = 0;
        }
        NestScrollFrameLayout nestScrollFrameLayout = new NestScrollFrameLayout(context);
        nestScrollFrameLayout.setId(R.id.plugin_container);
        ViewGroup.MarginLayoutParams a2 = C0178a.m579a(keyBoardObserveFrameLayout, -1, (int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        C0178a.m580a(nestScrollFrameLayout);
        if (nestScrollFrameLayout.getParent() == null) {
            keyBoardObserveFrameLayout.addView(nestScrollFrameLayout, a2);
        }
        C0178a.m580a(keyBoardObserveFrameLayout);
        if (keyBoardObserveFrameLayout.getParent() == null) {
            constraintLayout.addView(keyBoardObserveFrameLayout, layoutParams6);
        }
        C0178a.m580a(constraintLayout);
        constraintLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
