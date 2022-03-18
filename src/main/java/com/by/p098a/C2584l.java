package com.by.p098a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.InputFilter;
import android.util.TypedValue;
import android.view.C0178a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.C0942e;
import com.by.inflate_lib.AbstractC2604b;
import com.by.inflate_lib.p099a.C2600a;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout;
import com.ss.android.lark.p1830f.C37036b;
import com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout;

/* renamed from: com.by.a.l */
public class C2584l implements AbstractC2604b {
    @Override // com.by.inflate_lib.AbstractC2604b
    /* renamed from: a */
    public View mo11274a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        int i;
        int i2;
        int i3;
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setClickable(true);
        ViewGroup.LayoutParams a = C0178a.m579a(viewGroup, -1, -1);
        View view = new View(context);
        view.setId(R.id.shadow_view);
        view.setBackgroundColor(resources.getColor(R.color.kb_input_post_mask));
        view.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -1);
        C0178a.m580a(view);
        if (view.getParent() == null) {
            constraintLayout.addView(view, layoutParams);
        }
        ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        ViewGroup.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-1, -1);
        DragShrinkLayout dragShrinkLayout = new DragShrinkLayout(context);
        dragShrinkLayout.setId(R.id.postmessage_et_layout);
        dragShrinkLayout.setBackgroundResource(R.drawable.kb_common_top_corner9_color_c11);
        dragShrinkLayout.setOrientation(1);
        dragShrinkLayout.setVisibility(8);
        ViewGroup.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams3)).topMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((ConstraintLayout.LayoutParams) layoutParams3).f2816h = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((ConstraintLayout.LayoutParams) layoutParams3).f2825q = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((ConstraintLayout.LayoutParams) layoutParams3).f2827s = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((ConstraintLayout.LayoutParams) layoutParams3).f2818j = R.id.bottom_container;
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        ViewGroup.LayoutParams a2 = C0178a.m579a(dragShrinkLayout, -1, -2);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.scale_btn);
        appCompatImageView.setClickable(true);
        appCompatImageView.setFocusable(true);
        C0942e.m4551a(appCompatImageView, resources.getColorStateList(R.color.ud_N600));
        appCompatImageView.setImageResource(R.drawable.ud_icon_minify_outlined);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            i = -1;
            layoutParams4.addRule(11, -1);
        } else {
            i = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(10, i);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        C0178a.m580a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            relativeLayout.addView(appCompatImageView, layoutParams4);
        }
        C0178a.m580a(relativeLayout);
        if (relativeLayout.getParent() == null) {
            dragShrinkLayout.addView(relativeLayout, a2);
        }
        RichTextEmojiconEditText richTextEmojiconEditText = new RichTextEmojiconEditText(context);
        richTextEmojiconEditText.setId(R.id.toolbox_et_posttitle);
        richTextEmojiconEditText.setBackgroundDrawable(null);
        richTextEmojiconEditText.setFocusable(true);
        richTextEmojiconEditText.setFocusableInTouchMode(true);
        richTextEmojiconEditText.setHint(context.getResources().getString(R.string.Lark_Legacy_ComposePostTitle));
        richTextEmojiconEditText.setInputType(131073);
        richTextEmojiconEditText.setMaxHeight((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        richTextEmojiconEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        richTextEmojiconEditText.setTextColor(resources.getColorStateList(R.color.text_title));
        richTextEmojiconEditText.setHintTextColor(resources.getColor(R.color.text_placeholder));
        richTextEmojiconEditText.setTextSize(2, 17.0f);
        richTextEmojiconEditText.setTypeface(Typeface.defaultFromStyle(1));
        ViewGroup.LayoutParams a3 = C0178a.m579a(dragShrinkLayout, -1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a3)) {
            ((ViewGroup.MarginLayoutParams) a3).leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a3)) {
            ((ViewGroup.MarginLayoutParams) a3).rightMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a3)) {
            ((ViewGroup.MarginLayoutParams) a3).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        richTextEmojiconEditText.setGravity(3);
        C0178a.m580a(richTextEmojiconEditText);
        if (richTextEmojiconEditText.getParent() == null) {
            dragShrinkLayout.addView(richTextEmojiconEditText, a3);
        }
        ScrollView scrollView = new ScrollView(context);
        scrollView.setId(R.id.toolbox_postmsg_container);
        scrollView.setOverScrollMode(2);
        ViewGroup.LayoutParams a4 = C0178a.m579a(dragShrinkLayout, -1, -1);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a4)) {
            ((ViewGroup.MarginLayoutParams) a4).leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a4)) {
            ((ViewGroup.MarginLayoutParams) a4).rightMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a4)) {
            ((ViewGroup.MarginLayoutParams) a4).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a4)) {
            ((ViewGroup.MarginLayoutParams) a4).bottomMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        }
        C37036b bVar = new C37036b();
        bVar.mo136559a("android:fillViewport", new C2600a.C2602b("true"), scrollView, a4);
        RichTextEmojiconEditText richTextEmojiconEditText2 = new RichTextEmojiconEditText(context);
        richTextEmojiconEditText2.setId(R.id.toolbox_et_postmessage);
        richTextEmojiconEditText2.setBackgroundDrawable(null);
        richTextEmojiconEditText2.setFocusable(true);
        richTextEmojiconEditText2.setFocusableInTouchMode(true);
        richTextEmojiconEditText2.setHint(context.getResources().getString(R.string.Lark_Legacy_ComposePostWriteSomething));
        richTextEmojiconEditText2.setInputType(131073);
        richTextEmojiconEditText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)});
        richTextEmojiconEditText2.setTextColor(resources.getColorStateList(R.color.text_title));
        richTextEmojiconEditText2.setHintTextColor(resources.getColor(R.color.text_placeholder));
        richTextEmojiconEditText2.setTextSize(2, 16.0f);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        richTextEmojiconEditText2.setGravity(3);
        C0178a.m580a(richTextEmojiconEditText2);
        if (richTextEmojiconEditText2.getParent() == null) {
            scrollView.addView(richTextEmojiconEditText2, layoutParams5);
        }
        bVar.mo136558a(scrollView, a4);
        C0178a.m580a(scrollView);
        if (scrollView.getParent() == null) {
            dragShrinkLayout.addView(scrollView, a4);
        }
        C0178a.m580a(dragShrinkLayout);
        if (dragShrinkLayout.getParent() == null) {
            constraintLayout2.addView(dragShrinkLayout, layoutParams3);
        }
        SlidingUpPanelLayout slidingUpPanelLayout = new SlidingUpPanelLayout(context);
        slidingUpPanelLayout.setId(R.id.top_drawer);
        slidingUpPanelLayout.setVisibility(8);
        ViewGroup.LayoutParams layoutParams6 = new ConstraintLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, resources.getDisplayMetrics()));
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams6)) {
            i2 = 0;
            ((ConstraintLayout.LayoutParams) layoutParams6).f2816h = 0;
        } else {
            i2 = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((ConstraintLayout.LayoutParams) layoutParams6).f2825q = i2;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((ConstraintLayout.LayoutParams) layoutParams6).f2827s = i2;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((ConstraintLayout.LayoutParams) layoutParams6).f2818j = R.id.bottom_container;
        }
        slidingUpPanelLayout.setGravity(80);
        View view2 = new View(context);
        view2.setId(R.id.content);
        view2.setBackgroundColor(resources.getColor(R.color.transparent));
        ViewGroup.MarginLayoutParams a5 = C0178a.m579a(slidingUpPanelLayout, -1, -1);
        C0178a.m580a(view2);
        if (view2.getParent() == null) {
            slidingUpPanelLayout.addView(view2, a5);
        }
        C0178a.m580a(slidingUpPanelLayout);
        if (slidingUpPanelLayout.getParent() == null) {
            constraintLayout2.addView(slidingUpPanelLayout, layoutParams6);
        }
        ConstraintLayout constraintLayout3 = new ConstraintLayout(context);
        constraintLayout3.setId(R.id.bottom_container);
        ViewGroup.LayoutParams layoutParams7 = new ConstraintLayout.LayoutParams(-1, -2);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams7)) {
            i3 = 0;
            ((ConstraintLayout.LayoutParams) layoutParams7).f2825q = 0;
        } else {
            i3 = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((ConstraintLayout.LayoutParams) layoutParams7).f2827s = i3;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((ConstraintLayout.LayoutParams) layoutParams7).f2819k = i3;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((ConstraintLayout.LayoutParams) layoutParams7).f2817i = R.id.postmessage_et_layout;
        }
        C0178a.m580a(constraintLayout3);
        if (constraintLayout3.getParent() == null) {
            constraintLayout2.addView(constraintLayout3, layoutParams7);
        }
        C0178a.m580a(constraintLayout2);
        if (constraintLayout2.getParent() == null) {
            constraintLayout.addView(constraintLayout2, layoutParams2);
        }
        C0178a.m580a(constraintLayout);
        constraintLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
