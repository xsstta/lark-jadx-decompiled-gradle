package com.ss.android.vc.meeting.module.reaction.view.reaction;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;

public class ReactionItemLayout extends LinearLayout {

    /* renamed from: a */
    private Context f158256a;

    /* renamed from: b */
    private View f158257b;

    /* renamed from: c */
    private ImageView f158258c;

    /* renamed from: d */
    private TextView f158259d;

    /* renamed from: e */
    private ImageView f158260e;

    /* renamed from: f */
    private TextView f158261f;

    /* renamed from: g */
    private TextView f158262g;

    /* renamed from: h */
    private ReactionState f158263h;

    /* renamed from: i */
    private int f158264i;

    public int getDisplayDuration() {
        return this.f158264i;
    }

    public TextView getMultiplication() {
        return this.f158261f;
    }

    public ImageView getReactionIcon() {
        return this.f158260e;
    }

    public TextView getReactionNum() {
        return this.f158262g;
    }

    public ReactionState getReactionState() {
        return this.f158263h;
    }

    public View getRootView() {
        return this.f158257b;
    }

    public ImageView getUserAvatar() {
        return this.f158258c;
    }

    public void setDisplayDuration(int i) {
        this.f158264i = i;
    }

    public void setReactionState(ReactionState reactionState) {
        this.f158263h = reactionState;
    }

    public ReactionItemLayout(Context context) {
        this(context, null);
    }

    public void setUserName(String str) {
        this.f158259d.setText(str);
        this.f158259d.requestLayout();
    }

    /* renamed from: a */
    public void mo217185a(boolean z) {
        if (z) {
            this.f158258c.setVisibility(8);
            this.f158259d.setVisibility(8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f158260e.getLayoutParams();
            layoutParams.leftMargin = C60773o.m236115a(12.0d);
            this.f158260e.setLayoutParams(layoutParams);
            return;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f158260e.getLayoutParams();
        layoutParams2.leftMargin = C60773o.m236115a(8.0d);
        this.f158260e.setLayoutParams(layoutParams2);
    }

    public void setReactionNum(int i) {
        int i2;
        int i3 = 0;
        this.f158262g.setText(String.format("%d ", Integer.valueOf(i)));
        TextView textView = this.f158261f;
        if (i > 1) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
        TextView textView2 = this.f158262g;
        if (i <= 1) {
            i3 = 8;
        }
        textView2.setVisibility(i3);
    }

    public ReactionItemLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m246046a(Context context, AttributeSet attributeSet) {
        this.f158256a = context;
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.vc_view_receive_reaction_item, (ViewGroup) this, true);
        this.f158257b = inflate;
        this.f158258c = (ImageView) inflate.findViewById(R.id.reaction_avatar);
        this.f158259d = (TextView) this.f158257b.findViewById(R.id.reaction_name);
        this.f158260e = (ImageView) this.f158257b.findViewById(R.id.reaction_icon);
        this.f158261f = (TextView) this.f158257b.findViewById(R.id.multiplication);
        this.f158262g = (TextView) this.f158257b.findViewById(R.id.reaction_num);
        Typeface createFromAsset = Typeface.createFromAsset(this.f158256a.getAssets(), "fonts/DINAlternateBold.ttf");
        try {
            this.f158261f.setTypeface(createFromAsset, 2);
            this.f158262g.setTypeface(createFromAsset, 2);
        } catch (Exception unused) {
        }
    }

    public ReactionItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m246046a(context, attributeSet);
    }
}
