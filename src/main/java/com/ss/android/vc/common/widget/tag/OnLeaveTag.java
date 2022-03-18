package com.ss.android.vc.common.widget.tag;

import android.content.Context;
import android.util.AttributeSet;
import com.larksuite.suite.R;

public class OnLeaveTag extends AbstractC60867a {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.common.widget.tag.AbstractC60867a
    public int getBackgroundResId() {
        return R.drawable.vc_bg_tag_on_leave;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.common.widget.tag.AbstractC60867a
    public int getTextColorResId() {
        return R.color.udtoken_tag_text_s_red;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.common.widget.tag.AbstractC60867a
    /* renamed from: a */
    public void mo208712a() {
        super.mo208712a();
        setText(R.string.View_G_OnLeave);
    }

    public OnLeaveTag(Context context) {
        super(context);
    }

    public OnLeaveTag(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OnLeaveTag(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
