package com.bytedance.ee.bear.drive.biz.preview.block;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;

public class DriveBlockTitleView extends FrameLayout {

    /* renamed from: a */
    private ImageView f18048a;

    /* renamed from: b */
    private TextView f18049b;

    /* renamed from: c */
    private boolean f18050c;

    /* renamed from: d */
    private int f18051d;

    /* renamed from: a */
    private void m26286a() {
        LayoutInflater.from(getContext()).inflate(R.layout.drive_block_titlebar, this);
        this.f18048a = (ImageView) findViewById(R.id.icon);
        this.f18049b = (TextView) findViewById(R.id.title);
    }

    public DriveBlockTitleView(Context context) {
        super(context);
        m26286a();
    }

    public void setForceGone(boolean z) {
        this.f18050c = z;
        setVisibility(this.f18051d);
    }

    public void setIcon(int i) {
        this.f18048a.setImageResource(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.f18049b.setText(charSequence);
    }

    public void setVisibility(int i) {
        this.f18051d = i;
        if (this.f18050c) {
            super.setVisibility(8);
        } else {
            super.setVisibility(i);
        }
    }

    public DriveBlockTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26286a();
    }
}
