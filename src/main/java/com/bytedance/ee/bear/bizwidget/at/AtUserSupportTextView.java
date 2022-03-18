package com.bytedance.ee.bear.bizwidget.at;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.larksuite.suite.R;
import java.util.List;

public class AtUserSupportTextView extends AppCompatTextView {
    public AtUserSupportTextView(Context context) {
        super(context);
        m20028a(context);
    }

    /* renamed from: a */
    private void m20028a(Context context) {
        setHighlightColor(context.getResources().getColor(R.color.space_kit_trans));
    }

    public AtUserSupportTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m20028a(context);
    }

    /* renamed from: a */
    public void mo19033a(String str, List<C4863a> list) {
        if (TextUtils.isEmpty(str)) {
            C13479a.m54764b("AtUserSupportTextView", "setMultiUserSpanText()...text is empty");
        } else if (!str.contains("@")) {
            C13479a.m54764b("AtUserSupportTextView", "setMultiUserSpanText()...@ is not exit");
            setText(str);
        } else if (C13657b.m55421a(list)) {
            C13479a.m54764b("AtUserSupportTextView", "setMultiUserSpanText()...userSpans is empty");
            setText(str);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            int i = -1;
            for (C4863a aVar : list) {
                int indexOf = str.indexOf("@", i + 1);
                if (!(indexOf == i || indexOf == -1)) {
                    spannableStringBuilder.setSpan(aVar, indexOf, indexOf + 1 + aVar.mo19036a().length(), 17);
                    i = indexOf;
                }
            }
            setText(spannableStringBuilder);
            setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public AtUserSupportTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m20028a(context);
    }

    /* renamed from: a */
    public void mo19032a(String str, int i, int i2, final View.OnClickListener onClickListener) {
        if (TextUtils.isEmpty(str)) {
            C13479a.m54764b("AtUserSupportTextView", "setClickableText()...text is empty");
        } else if (i < 0 || i2 < 0 || i > i2) {
            C13479a.m54764b("AtUserSupportTextView", "setClickableText()...begin or end is error");
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.setSpan(new ClickableSpan() {
                /* class com.bytedance.ee.bear.bizwidget.at.AtUserSupportTextView.C48621 */

                public void onClick(View view) {
                    onClickListener.onClick(view);
                }

                public void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                    textPaint.setColor(AtUserSupportTextView.this.getResources().getColor(R.color.space_kit_b500));
                    textPaint.clearShadowLayer();
                }
            }, i, i2, 34);
            setText(spannableStringBuilder);
            setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}
