package com.by.p098a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.C0178a;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.by.inflate_lib.AbstractC2604b;
import com.by.inflate_lib.p099a.C2600a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.p1830f.C37037c;

/* renamed from: com.by.a.b */
public class C2574b implements AbstractC2604b {
    @Override // com.by.inflate_lib.AbstractC2604b
    /* renamed from: a */
    public View mo11274a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        ViewGroup.MarginLayoutParams a = C0178a.m579a(viewGroup, -1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a)) {
            a.bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a) && Build.VERSION.SDK_INT >= 17) {
            a.setMarginEnd((int) TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a) && Build.VERSION.SDK_INT >= 17) {
            a.setMarginStart((int) TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a)) {
            a.topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        View view = new View(context);
        view.setId(R.id.system_message_check_label);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, resources.getDisplayMetrics()));
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.f2819k = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.f2825q = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.f2816h = 0;
        }
        C0178a.m580a(view);
        if (view.getParent() == null) {
            constraintLayout.addView(view, layoutParams);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.red_packet_system_iv);
        appCompatImageView.setImageResource(R.drawable.ud_icon_luckmoney_colorful);
        appCompatImageView.setVisibility(8);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.f2819k = R.id.system_label;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.f2826r = R.id.system_label;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.f2834z = 0.5f;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.f2789G = 2;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.f2824p = R.id.system_message_check_label;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.f2816h = R.id.system_label;
        }
        C0178a.m580a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            constraintLayout.addView(appCompatImageView, layoutParams2);
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R.id.system_label);
        appCompatTextView.setTextColor(resources.getColorStateList(R.color.text_placeholder));
        appCompatTextView.setTextSize(2, 14.0f);
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-2, -2);
        appCompatTextView.setGravity(17);
        C37037c cVar = new C37037c();
        cVar.mo136561a("android:paddingHorizontal", new C2600a.C2603c("4", "dp"), appCompatTextView, layoutParams3);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.f2802T = true;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.f2819k = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.f2827s = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.f2824p = R.id.red_packet_system_iv;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.f2816h = 0;
        }
        cVar.mo136560a(appCompatTextView, layoutParams3);
        C0178a.m580a(appCompatTextView);
        if (appCompatTextView.getParent() == null) {
            constraintLayout.addView(appCompatTextView, layoutParams3);
        }
        C0178a.m580a(constraintLayout);
        constraintLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        return constraintLayout;
    }
}
