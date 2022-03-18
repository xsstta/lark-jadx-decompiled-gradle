package com.ss.android.lark.widget.richtext2.widget.text;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext2.widget.text.SimpleRichTextView;
import com.ss.android.lark.widget.span.PhoneInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.richtext2.widget.text.b */
public class C59109b extends AbstractC59111c {

    /* renamed from: a */
    private List<PhoneInfo> f146565a;

    /* renamed from: b */
    private SimpleRichTextView.AbstractC59105b f146566b;

    /* renamed from: com.ss.android.lark.widget.richtext2.widget.text.b$a */
    private static class C59110a extends ClickableSpan {

        /* renamed from: a */
        private String f146567a;

        /* renamed from: b */
        private SimpleRichTextView.AbstractC59105b f146568b;

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(UIHelper.getColor(R.color.lkui_B700));
        }

        public void onClick(View view) {
            if (view.getTag(R.id.tag_long_press) != null) {
                view.setTag(R.id.tag_long_press, null);
                if (this.f146568b.mo200808b(view, this.f146567a)) {
                    view.performHapticFeedback(0);
                    return;
                }
                return;
            }
            this.f146568b.mo200807a(view, this.f146567a);
        }

        public C59110a(String str, SimpleRichTextView.AbstractC59105b bVar) {
            this.f146567a = str;
            this.f146568b = bVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.richtext2.widget.text.AbstractC59111c
    /* renamed from: a */
    public SpannableStringBuilder mo200811a(SpannableStringBuilder spannableStringBuilder) {
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        for (PhoneInfo phoneInfo : this.f146565a) {
            int i = phoneInfo.start;
            int i2 = phoneInfo.end;
            if (mo200816a(spannableStringBuilder2, i, i2)) {
                spannableStringBuilder.setSpan(new C59110a(phoneInfo.text, this.f146566b), i, i2, 33);
            }
        }
        return spannableStringBuilder;
    }

    public C59109b(List<PhoneInfo> list, SimpleRichTextView.AbstractC59105b bVar) {
        ArrayList arrayList = new ArrayList();
        this.f146565a = arrayList;
        CollectionUtils.resetToList(arrayList, list);
        this.f146566b = bVar;
    }
}
