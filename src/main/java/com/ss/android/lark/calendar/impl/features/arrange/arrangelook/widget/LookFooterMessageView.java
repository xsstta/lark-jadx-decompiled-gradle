package com.ss.android.lark.calendar.impl.features.arrange.arrangelook.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ0\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/widget/LookFooterMessageView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "bindResult", "", "mBusyList", "Ljava/util/ArrayList;", "", "mOutWorkHourList", "mBothConflictList", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LookFooterMessageView extends LinearLayout {

    /* renamed from: a */
    private HashMap f75321a;

    /* renamed from: a */
    public View mo108805a(int i) {
        if (this.f75321a == null) {
            this.f75321a = new HashMap();
        }
        View view = (View) this.f75321a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f75321a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LookFooterMessageView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LookFooterMessageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LookFooterMessageView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo108806a(ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3) {
        Intrinsics.checkParameterIsNotNull(arrayList, "mBusyList");
        Intrinsics.checkParameterIsNotNull(arrayList2, "mOutWorkHourList");
        Intrinsics.checkParameterIsNotNull(arrayList3, "mBothConflictList");
        TextView textView = (TextView) mo108805a(R.id.tvLookConflict);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvLookConflict");
        textView.setText(C32634ae.m125180a(R.plurals.Calendar_Plural_GuestOnBusy, arrayList3.size() + arrayList2.size() + arrayList.size()));
        if (arrayList3.size() > 0 || (arrayList2.size() > 0 && arrayList.size() > 0)) {
            ImageView imageView = (ImageView) mo108805a(R.id.imgLookNotWork);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "imgLookNotWork");
            imageView.setVisibility(0);
            TextView textView2 = (TextView) mo108805a(R.id.tvLookNotWork);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tvLookNotWork");
            textView2.setVisibility(0);
            ImageView imageView2 = (ImageView) mo108805a(R.id.imgLookBusy);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "imgLookBusy");
            imageView2.setVisibility(0);
            TextView textView3 = (TextView) mo108805a(R.id.tvLookBusy);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "tvLookBusy");
            textView3.setVisibility(0);
            TextView textView4 = (TextView) mo108805a(R.id.tvLookDivider);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "tvLookDivider");
            textView4.setVisibility(0);
        } else if (arrayList2.size() > 0) {
            ImageView imageView3 = (ImageView) mo108805a(R.id.imgLookNotWork);
            Intrinsics.checkExpressionValueIsNotNull(imageView3, "imgLookNotWork");
            imageView3.setVisibility(0);
            TextView textView5 = (TextView) mo108805a(R.id.tvLookNotWork);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "tvLookNotWork");
            textView5.setVisibility(0);
            ImageView imageView4 = (ImageView) mo108805a(R.id.imgLookBusy);
            Intrinsics.checkExpressionValueIsNotNull(imageView4, "imgLookBusy");
            imageView4.setVisibility(8);
            TextView textView6 = (TextView) mo108805a(R.id.tvLookBusy);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "tvLookBusy");
            textView6.setVisibility(8);
            TextView textView7 = (TextView) mo108805a(R.id.tvLookDivider);
            Intrinsics.checkExpressionValueIsNotNull(textView7, "tvLookDivider");
            textView7.setVisibility(8);
        } else if (arrayList.size() > 0) {
            ImageView imageView5 = (ImageView) mo108805a(R.id.imgLookNotWork);
            Intrinsics.checkExpressionValueIsNotNull(imageView5, "imgLookNotWork");
            imageView5.setVisibility(8);
            TextView textView8 = (TextView) mo108805a(R.id.tvLookNotWork);
            Intrinsics.checkExpressionValueIsNotNull(textView8, "tvLookNotWork");
            textView8.setVisibility(8);
            ImageView imageView6 = (ImageView) mo108805a(R.id.imgLookBusy);
            Intrinsics.checkExpressionValueIsNotNull(imageView6, "imgLookBusy");
            imageView6.setVisibility(0);
            TextView textView9 = (TextView) mo108805a(R.id.tvLookBusy);
            Intrinsics.checkExpressionValueIsNotNull(textView9, "tvLookBusy");
            textView9.setVisibility(0);
            TextView textView10 = (TextView) mo108805a(R.id.tvLookDivider);
            Intrinsics.checkExpressionValueIsNotNull(textView10, "tvLookDivider");
            textView10.setVisibility(8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LookFooterMessageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.look_footer_message, (ViewGroup) this, true);
    }
}
