package com.ss.android.lark.inno.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;

public class VcTitleView extends LinearLayout {

    /* renamed from: a */
    private TextView f100344a;

    /* renamed from: b */
    private TextView f100345b;

    /* renamed from: a */
    private void m154311a() {
        LayoutInflater.from(getContext()).inflate(R.layout.inno_livevideo_layer_title_view, this);
        this.f100344a = (TextView) findViewById(R.id.video_title);
        this.f100345b = (TextView) findViewById(R.id.video_replay_tag);
        this.f100344a.setVisibility(0);
        this.f100345b.setVisibility(0);
        setOrientation(0);
        setGravity(16);
    }

    public VcTitleView(Context context) {
        this(context, null);
    }

    public void setTitleText(String str) {
        this.f100344a.setText(str);
    }

    public VcTitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f100344a.setMaxWidth(View.MeasureSpec.getSize(i) - (Math.round(this.f100345b.getPaint().measureText(this.f100345b.getText().toString())) + Math.round((float) UIUtils.dp2px(getContext(), 14.0f))));
        super.onMeasure(i, i2);
    }

    public VcTitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m154311a();
    }
}
