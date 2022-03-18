package com.ss.android.vc.common.widget.tag;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;

public class InterpretationTag extends AbstractC60867a {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.common.widget.tag.AbstractC60867a
    public int getBackgroundResId() {
        return R.drawable.vc_bg_interpretation_tag;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.common.widget.tag.AbstractC60867a
    public int getTextColorResId() {
        return R.color.udtoken_tag_neutral_text_normal;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.common.widget.tag.AbstractC60867a
    /* renamed from: a */
    public void mo208712a() {
        super.mo208712a();
        setEllipsize(TextUtils.TruncateAt.END);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m236596b() {
        float width = (float) getWidth();
        float measureText = getPaint().measureText("In...") + ((float) (C60773o.m236115a(4.0d) * 2));
        if (width > BitmapDescriptorFactory.HUE_RED && width < measureText) {
            setVisibility(8);
        }
    }

    public InterpretationTag(Context context) {
        super(context);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            post(new Runnable() {
                /* class com.ss.android.vc.common.widget.tag.$$Lambda$InterpretationTag$ASzhboGAELMNdmECC7rq9nu2m0c */

                public final void run() {
                    InterpretationTag.lambda$ASzhboGAELMNdmECC7rq9nu2m0c(InterpretationTag.this);
                }
            });
        }
    }

    public InterpretationTag(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InterpretationTag(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
