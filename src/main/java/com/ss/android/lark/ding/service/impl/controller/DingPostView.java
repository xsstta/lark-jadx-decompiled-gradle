package com.ss.android.lark.ding.service.impl.controller;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57814c;
import com.ss.android.lark.widget.EllipsizedEmojiconTextView;
import com.ss.android.lark.widget.linked_emojicon.base.EmojiconTextView;

public class DingPostView extends FrameLayout {

    /* renamed from: a */
    private EmojiconTextView f94336a;

    /* renamed from: b */
    private ImageView f94337b;

    /* renamed from: c */
    private EllipsizedEmojiconTextView f94338c;

    /* renamed from: a */
    private void m144808a() {
        LayoutInflater.from(getContext()).inflate(R.layout.ding_post_view, (ViewGroup) this, true);
        m144809b();
    }

    /* renamed from: b */
    private void m144809b() {
        this.f94336a = (EmojiconTextView) findViewById(R.id.title);
        this.f94337b = (ImageView) findViewById(R.id.figure);
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView = (EllipsizedEmojiconTextView) findViewById(R.id.post_content);
        this.f94338c = ellipsizedEmojiconTextView;
        ellipsizedEmojiconTextView.setTranslateEmojiCode(false);
    }

    public DingPostView(Context context) {
        super(context);
        m144808a();
    }

    public void setTextColor(int i) {
        this.f94336a.setTextColor(i);
        this.f94338c.setTextColor(i);
    }

    public DingPostView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m144808a();
    }

    /* renamed from: a */
    public void mo135326a(String str, CharSequence charSequence) {
        this.f94336a.setTranslateEmojiCode(false);
        if (TextUtils.isEmpty(str)) {
            this.f94336a.setVisibility(8);
        } else {
            this.f94336a.setVisibility(0);
            this.f94336a.setText(str);
        }
        this.f94338c.setText(C57814c.m224346a(charSequence));
        UIUtils.hide(this.f94337b);
    }

    public DingPostView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m144808a();
    }
}
