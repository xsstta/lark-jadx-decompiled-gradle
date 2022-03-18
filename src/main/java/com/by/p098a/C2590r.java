package com.by.p098a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.C0178a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.by.inflate_lib.AbstractC2604b;
import com.by.inflate_lib.p099a.C2600a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.button.LKUIButton;
import com.larksuite.suite.R;
import com.ss.android.lark.p1830f.C37034a;
import com.ss.android.lark.p1830f.C37037c;

/* renamed from: com.by.a.r */
public class C2590r implements AbstractC2604b {
    @Override // com.by.inflate_lib.AbstractC2604b
    /* renamed from: a */
    public View mo11274a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        ViewGroup.LayoutParams a = C0178a.m579a(viewGroup, -1, -2);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.title_layout);
        relativeLayout.setBackgroundResource(R.drawable.vote_msg_title_bg);
        if (TextView.class.isInstance(relativeLayout)) {
            C0178a.m583b(relativeLayout, (int) TypedValue.applyDimension(1, 90.0f, resources.getDisplayMetrics()));
        } else {
            relativeLayout.setMinimumHeight((int) TypedValue.applyDimension(1, 90.0f, resources.getDisplayMetrics()));
        }
        ViewGroup.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((ConstraintLayout.LayoutParams) layoutParams).f2812d = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((ConstraintLayout.LayoutParams) layoutParams).f2815g = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((ConstraintLayout.LayoutParams) layoutParams).f2816h = 0;
        }
        ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        if (TextView.class.isInstance(constraintLayout2)) {
            C0178a.m583b(constraintLayout2, (int) TypedValue.applyDimension(1, 90.0f, resources.getDisplayMetrics()));
        } else {
            constraintLayout2.setMinimumHeight((int) TypedValue.applyDimension(1, 90.0f, resources.getDisplayMetrics()));
        }
        constraintLayout2.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        ViewGroup.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R.id.select_type_tv);
        appCompatTextView.setTextSize(2, 12.0f);
        appCompatTextView.setTextColor(resources.getColorStateList(R.color.static_white));
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((RelativeLayout.LayoutParams) layoutParams3).addRule(2, R.id.title_tv);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.f2818j = R.id.title_tv;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams3)) {
            i = 0;
            layoutParams3.f2812d = 0;
        } else {
            i = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.f2816h = i;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.f2783A = 1.0f;
        }
        C37037c cVar = new C37037c();
        cVar.mo136561a("app:textColorAlpha", new C2600a.C2602b("0.8"), appCompatTextView, layoutParams3);
        cVar.mo136560a(appCompatTextView, layoutParams3);
        C0178a.m580a(appCompatTextView);
        if (appCompatTextView.getParent() == null) {
            constraintLayout2.addView(appCompatTextView, layoutParams3);
        }
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setId(R.id.title_tv);
        appCompatTextView2.setTextColor(resources.getColorStateList(R.color.static_white));
        appCompatTextView2.setTextSize(2, 16.0f);
        appCompatTextView2.setTypeface(Typeface.defaultFromStyle(1));
        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((RelativeLayout.LayoutParams) layoutParams4).addRule(12, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams4)) {
            i2 = 0;
            layoutParams4.f2819k = 0;
        } else {
            i2 = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.f2812d = i2;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.f2815g = i2;
        }
        C0178a.m580a(appCompatTextView2);
        if (appCompatTextView2.getParent() == null) {
            constraintLayout2.addView(appCompatTextView2, layoutParams4);
        }
        C0178a.m580a(constraintLayout2);
        if (constraintLayout2.getParent() == null) {
            relativeLayout.addView(constraintLayout2, layoutParams2);
        }
        C0178a.m580a(relativeLayout);
        if (relativeLayout.getParent() == null) {
            constraintLayout.addView(relativeLayout, layoutParams);
        }
        View recyclerView = new RecyclerView(context);
        recyclerView.setId(R.id.options_rv);
        recyclerView.setOverScrollMode(2);
        recyclerView.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), recyclerView.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((RelativeLayout.LayoutParams) layoutParams5).addRule(3, R.id.title_layout);
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams5)) {
            i3 = 0;
            ((ConstraintLayout.LayoutParams) layoutParams5).f2812d = 0;
        } else {
            i3 = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((ConstraintLayout.LayoutParams) layoutParams5).f2815g = i3;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((ConstraintLayout.LayoutParams) layoutParams5).f2817i = R.id.title_layout;
        }
        C0178a.m580a(recyclerView);
        if (recyclerView.getParent() == null) {
            constraintLayout.addView(recyclerView, layoutParams5);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.participant_number_layout);
        linearLayout.setOrientation(1);
        linearLayout.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        linearLayout.setPadding(linearLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams6 = new ConstraintLayout.LayoutParams((int) TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, resources.getDisplayMetrics()), -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((RelativeLayout.LayoutParams) layoutParams6).addRule(3, R.id.options_rv);
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams6)) {
            i4 = 0;
            ((ConstraintLayout.LayoutParams) layoutParams6).f2812d = 0;
        } else {
            i4 = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((ConstraintLayout.LayoutParams) layoutParams6).f2815g = i4;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((ConstraintLayout.LayoutParams) layoutParams6).f2817i = R.id.options_rv;
        }
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context);
        appCompatTextView3.setId(R.id.actual_participant_number_tv);
        appCompatTextView3.setTextColor(resources.getColorStateList(R.color.text_title));
        appCompatTextView3.setTextSize(2, 12.0f);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        C0178a.m580a(appCompatTextView3);
        if (appCompatTextView3.getParent() == null) {
            linearLayout.addView(appCompatTextView3, layoutParams7);
        }
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(context);
        appCompatTextView4.setId(R.id.number_of_participants_tv);
        appCompatTextView4.setTextColor(resources.getColorStateList(R.color.text_title));
        appCompatTextView4.setTextSize(2, 12.0f);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        C0178a.m580a(appCompatTextView4);
        if (appCompatTextView4.getParent() == null) {
            linearLayout.addView(appCompatTextView4, layoutParams8);
        }
        C0178a.m580a(linearLayout);
        if (linearLayout.getParent() == null) {
            constraintLayout.addView(linearLayout, layoutParams6);
        }
        LKUIButton lKUIButton = new LKUIButton(context);
        lKUIButton.setId(R.id.action_btn);
        lKUIButton.setTextColor(resources.getColorStateList(R.color.text_title));
        lKUIButton.setTextSize(2, 14.0f);
        lKUIButton.setTypeface(Typeface.defaultFromStyle(1));
        lKUIButton.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        ViewGroup.LayoutParams layoutParams9 = new ConstraintLayout.LayoutParams((int) TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, resources.getDisplayMetrics()), -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams9)) {
            ((RelativeLayout.LayoutParams) layoutParams9).addRule(3, R.id.participant_number_layout);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            ((ViewGroup.MarginLayoutParams) layoutParams9).setMargins((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        lKUIButton.setGravity(17);
        C37034a aVar = new C37034a();
        aVar.mo136557a("app:button_corner_radius", new C2600a.C2603c("20", "dp"), lKUIButton, layoutParams9);
        aVar.mo136557a("app:button_disable_color", new C2600a.C2601a("2131099773", "color"), lKUIButton, layoutParams9);
        aVar.mo136557a("app:button_normal_color", new C2600a.C2601a("2131099773", "color"), lKUIButton, layoutParams9);
        aVar.mo136557a("app:button_pressed_color", new C2600a.C2601a("2131101953", "color"), lKUIButton, layoutParams9);
        aVar.mo136557a("app:button_stroke_color", new C2600a.C2601a("2131100363", "color"), lKUIButton, layoutParams9);
        aVar.mo136557a("app:button_stroke_width", new C2600a.C2603c("1", "dp"), lKUIButton, layoutParams9);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams9)) {
            i5 = 0;
            ((ConstraintLayout.LayoutParams) layoutParams9).f2812d = 0;
        } else {
            i5 = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams9)) {
            ((ConstraintLayout.LayoutParams) layoutParams9).f2815g = i5;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams9)) {
            ((ConstraintLayout.LayoutParams) layoutParams9).f2817i = R.id.options_rv;
        }
        aVar.mo136556a(lKUIButton, layoutParams9);
        C0178a.m580a(lKUIButton);
        if (lKUIButton.getParent() == null) {
            constraintLayout.addView(lKUIButton, layoutParams9);
        }
        C0178a.m580a(constraintLayout);
        constraintLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
