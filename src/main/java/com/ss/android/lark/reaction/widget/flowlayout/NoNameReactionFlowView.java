package com.ss.android.lark.reaction.widget.flowlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.suite.R;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0014J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/reaction/widget/flowlayout/NoNameReactionFlowView;", "Lcom/ss/android/lark/reaction/widget/flowlayout/ReactionFlowView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "init", "", "setTagBackgroundColor", "tagBackgroundColor", "reaction-component_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class NoNameReactionFlowView extends ReactionFlowView {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionFlowView
    /* renamed from: a */
    public void mo181173a() {
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(R.id.tag_container);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = mo181207a(6.0f);
        layoutParams.topMargin = mo181207a(6.0f);
        frameLayout.setLayoutParams(layoutParams);
        addView(frameLayout);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, mo181207a(24.0f));
        layoutParams2.gravity = 16;
        linearLayout.setLayoutParams(layoutParams2);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(getContext());
        imageView.setId(R.id.image_reaction_icon);
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        int c = LKUIDisplayManager.m91881c(context, 20);
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(c, LKUIDisplayManager.m91881c(context2, 20));
        layoutParams3.gravity = 16;
        layoutParams3.leftMargin = mo181207a(7.0f);
        layoutParams3.rightMargin = mo181207a(7.0f);
        imageView.setLayoutParams(layoutParams3);
        linearLayout.addView(imageView);
        TextView textView = new TextView(getContext());
        textView.setId(R.id.reaction_count);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        textView.setPadding(0, 0, mo181207a(7.0f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(C52990a.m205239c(getContext(), R.color.text_caption));
        layoutParams4.gravity = 16;
        textView.setLayoutParams(layoutParams4);
        linearLayout.addView(textView);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoNameReactionFlowView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        mo181173a();
    }

    public final void setTagBackgroundColor(int i) {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.tag_container);
        Intrinsics.checkExpressionValueIsNotNull(viewGroup, "tagContainer");
        viewGroup.setBackground(ReactionFlowView.m205401a(getContext(), i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoNameReactionFlowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        mo181173a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoNameReactionFlowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        mo181173a();
    }
}
