package com.ss.android.lark.reaction.widget.flowlayout;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ReactionFlowView extends FrameLayout {

    /* renamed from: a */
    private boolean f131117a;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ReactionTagBackground {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo181173a() {
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(R.id.tag_container);
        frameLayout.setBackgroundResource(R.drawable.bubble_reaction_grey_bg);
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
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(mo181207a(20.0f), mo181207a(20.0f));
        layoutParams3.gravity = 16;
        layoutParams3.leftMargin = mo181207a(7.0f);
        layoutParams3.rightMargin = mo181207a(7.0f);
        imageView.setLayoutParams(layoutParams3);
        linearLayout.addView(imageView);
        View view = new View(getContext());
        view.setId(R.id.vertical_split_reaction);
        view.setBackgroundColor(getContext().getResources().getColor(R.color.fill_disable));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(C52990a.m205224a(getContext(), 0.5f), mo181207a(13.0f));
        layoutParams4.gravity = 16;
        view.setLayoutParams(layoutParams4);
        linearLayout.addView(view);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setId(R.id.names_reaction_list);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding(mo181207a(7.0f), 0, mo181207a(7.0f), 0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, mo181207a(20.0f));
        layoutParams5.gravity = 16;
        linearLayout2.setLayoutParams(layoutParams5);
        linearLayout.addView(linearLayout2);
    }

    public void setDisplayChangeEnable(boolean z) {
        this.f131117a = z;
    }

    public ReactionFlowView(Context context) {
        super(context);
        mo181173a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo181207a(float f) {
        if (!this.f131117a) {
            return C52990a.m205224a(getContext(), f);
        }
        return LKUIDisplayManager.m91881c(getContext(), (int) f);
    }

    public ReactionFlowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo181173a();
    }

    /* renamed from: a */
    protected static Drawable m205401a(Context context, int i) {
        Drawable b = C52990a.m205235b(context, (int) R.drawable.bubble_reaction_grey_bg);
        int i2 = R.color.udtoken_reaction_bg_grey;
        if (i != 0 && i == 1) {
            i2 = R.color.udtoken_reaction_bg_grey_float;
        }
        ((GradientDrawable) b).setColor(UDColorUtils.getColor(context, i2));
        return b;
    }

    public ReactionFlowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo181173a();
    }
}
