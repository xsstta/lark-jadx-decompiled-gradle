package com.bytedance.ee.bear.edit.component.toolbar2.insertblock;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.suite.R;

public class InsertNewBlockItemView extends RelativeLayout {

    /* renamed from: a */
    private AppCompatImageView f20695a;

    /* renamed from: b */
    private TextView f20696b;

    /* renamed from: c */
    private View f20697c;

    public InsertNewBlockItemView(Context context) {
        super(context);
        m30593a(context);
    }

    public void setIcon(int i) {
        this.f20695a.setImageResource(i);
    }

    public void setBadge(boolean z) {
        int i;
        View view = this.f20697c;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void setIconBackgroundTint(int i) {
        this.f20695a.setBackgroundTintList(getResources().getColorStateList(i));
    }

    public void setIconImageTint(int i) {
        this.f20695a.setImageTintList(getResources().getColorStateList(i));
    }

    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f20696b.setVisibility(8);
            return;
        }
        this.f20696b.setVisibility(0);
        this.f20696b.setText(str);
    }

    /* renamed from: a */
    private void m30593a(Context context) {
        View.inflate(context, R.layout.doc_toolbar_insert_new_block_item, this);
        this.f20695a = (AppCompatImageView) findViewById(R.id.inb_icon);
        this.f20696b = (TextView) findViewById(R.id.inb_text);
        this.f20697c = findViewById(R.id.inb_badge);
        C13747j.m55728a((ImageView) this.f20695a, (int) R.color.icon_n1);
    }

    public InsertNewBlockItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30593a(context);
    }
}
