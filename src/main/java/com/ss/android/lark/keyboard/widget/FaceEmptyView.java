package com.ss.android.lark.keyboard.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB+\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/FaceEmptyView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "createView", "Landroid/view/View;", "init", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FaceEmptyView extends LinearLayout {
    /* renamed from: a */
    private final void m162975a() {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        m162974a(context);
    }

    public FaceEmptyView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final View m162974a(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = linearLayout;
        addView(linearLayout2, layoutParams);
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(UIUtils.dp2px(context, 74.0f), UIUtils.dp2px(context, 74.0f));
        imageView.setImageDrawable(C57582a.m223614c(context, R.drawable.ic_icon_empty_sticker_add));
        linearLayout.addView(imageView, layoutParams2);
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = UIUtils.dp2px(context, 10.0f);
        textView.setText(UIUtils.getString(context, R.string.Lark_Legacy_ClickToAddStickers));
        textView.setTextColor(UIUtils.getColor(context, R.color.lkui_N500));
        textView.setTextSize(1, 12.0f);
        linearLayout.addView(textView, layoutParams3);
        return linearLayout2;
    }

    public FaceEmptyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public FaceEmptyView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public FaceEmptyView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m162975a();
    }
}
