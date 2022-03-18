package com.by.p098a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.C0178a;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.by.inflate_lib.AbstractC2604b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.core.view.TextChatView;

/* renamed from: com.by.a.aa */
public class C2571aa implements AbstractC2604b {
    @Override // com.by.inflate_lib.AbstractC2604b
    /* renamed from: a */
    public View mo11274a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.translate_root_view);
        ViewGroup.MarginLayoutParams a = C0178a.m579a(viewGroup, -2, -2);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R.id.translate_label);
        appCompatTextView.setTextSize(2, 12.0f);
        appCompatTextView.setTextColor(resources.getColorStateList(R.color.text_caption));
        appCompatTextView.setText(R.string.Lark_Chat_Translation);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.f2816h = R.id.translate_divider;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.f2819k = R.id.translate_divider;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.f2825q = 0;
        }
        C0178a.m580a(appCompatTextView);
        if (appCompatTextView.getParent() == null) {
            constraintLayout.addView(appCompatTextView, layoutParams);
        }
        View view = new View(context);
        view.setId(R.id.translate_divider);
        view.setBackgroundColor(resources.getColor(R.color.line_divider_default));
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams((int) TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) resources.getDimension(R.dimen.dp_12);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2) && Build.VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.f2832x = (int) TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.f2828t = (int) TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.f2816h = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.f2824p = R.id.translate_label;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.f2827s = 0;
        }
        C0178a.m580a(view);
        if (view.getParent() == null) {
            constraintLayout.addView(view, layoutParams2);
        }
        View view2 = new View(context);
        view2.setId(R.id.translate_hint_line);
        view2.setBackgroundResource(R.drawable.translate_hint_line_bg);
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, resources.getDisplayMetrics()));
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.f2816h = R.id.translate_content;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.f2819k = R.id.translate_content;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.f2825q = 0;
        }
        C0178a.m580a(view2);
        if (view2.getParent() == null) {
            constraintLayout.addView(view2, layoutParams3);
        }
        TextChatView textChatView = new TextChatView(context);
        textChatView.setId(R.id.translate_content);
        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(-2, -2);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.f2802T = true;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.f2828t = (int) TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.f2832x = (int) TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.f2829u = (int) TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.f2834z = BitmapDescriptorFactory.HUE_RED;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4) && Build.VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = (int) resources.getDimension(R.dimen.dp_12);
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.f2827s = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.f2824p = R.id.translate_hint_line;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.f2817i = R.id.translate_divider;
        }
        C0178a.m580a(textChatView);
        if (textChatView.getParent() == null) {
            constraintLayout.addView(textChatView, layoutParams4);
        }
        C0178a.m580a(constraintLayout);
        constraintLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
