package com.ss.android.vc.common.widget.tag;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;

/* renamed from: com.ss.android.vc.common.widget.tag.a */
abstract class AbstractC60867a extends TextView {
    /* access modifiers changed from: protected */
    public int getBackgroundResId() {
        return R.drawable.vc_bg_interpretation_tag;
    }

    /* access modifiers changed from: protected */
    public int getHeightDp() {
        return 18;
    }

    /* access modifiers changed from: protected */
    public int getTextColorResId() {
        return R.color.udtoken_tag_neutral_text_normal;
    }

    /* access modifiers changed from: protected */
    public int getTextSizeDp() {
        return 12;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo208712a() {
        setSingleLine(true);
        setPadding(C60773o.m236115a(4.0d), 0, C60773o.m236115a(4.0d), 0);
        setTextSize(1, (float) getTextSizeDp());
        setHeight(C60773o.m236115a((double) getHeightDp()));
        setGravity(17);
        setTextColor(C60773o.m236126d(getTextColorResId()));
        setBackgroundResource(getBackgroundResId());
        if (Build.VERSION.SDK_INT >= 23) {
            getPaint().setFakeBoldText(true);
        }
    }

    AbstractC60867a(Context context) {
        super(context);
        mo208712a();
    }

    AbstractC60867a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo208712a();
    }

    AbstractC60867a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo208712a();
    }
}
