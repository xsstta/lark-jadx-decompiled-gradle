package com.ss.android.lark.mm.module.reaction.panel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;

public class ReactionItemLayout extends FrameLayout {

    /* renamed from: a */
    private ImageView f117851a;

    /* renamed from: b */
    private TextView f117852b;

    public ImageView getReactionIcon() {
        return this.f117851a;
    }

    public TextView getReactionNum() {
        return this.f117852b;
    }

    /* renamed from: a */
    private void m185509a() {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_receive_reaction_item, (ViewGroup) this, true);
        this.f117851a = (ImageView) findViewById(R.id.reaction_icon);
        this.f117852b = (TextView) findViewById(R.id.reaction_num);
    }

    public ReactionItemLayout(Context context) {
        this(context, null);
    }

    public void setReactionKey(String str) {
        C46825b.m185521a().mo164506a(this.f117851a, str);
    }

    public void setReactionNum(long j) {
        TextView textView = this.f117852b;
        StringBuilder sb = new StringBuilder();
        sb.append("x");
        int i = 0;
        sb.append(String.format("%d ", Long.valueOf(j)));
        textView.setText(sb.toString());
        TextView textView2 = this.f117852b;
        if (j <= 1) {
            i = 8;
        }
        textView2.setVisibility(i);
    }

    public ReactionItemLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReactionItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m185509a();
    }
}
