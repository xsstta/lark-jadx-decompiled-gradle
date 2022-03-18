package com.ss.android.lark.widget.richtext2.widget.text;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.richtext2.widget.text.SimpleRichTextView;
import com.ss.android.lark.widget.span.AtInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.richtext2.widget.text.a */
public class C59107a extends AbstractC59111c {

    /* renamed from: a */
    private List<AtInfo> f146560a;

    /* renamed from: b */
    private SimpleRichTextView.AbstractC59104a f146561b;

    /* renamed from: com.ss.android.lark.widget.richtext2.widget.text.a$a */
    private static class C59108a extends ClickableSpan {

        /* renamed from: a */
        private String f146562a;

        /* renamed from: b */
        private String f146563b;

        /* renamed from: c */
        private SimpleRichTextView.AbstractC59104a f146564c;

        public void updateDrawState(TextPaint textPaint) {
        }

        public void onClick(View view) {
            if (view.getTag(R.id.tag_long_press) != null) {
                view.setTag(R.id.tag_long_press, null);
                if (this.f146564c.mo200806b(view, this.f146563b, this.f146562a)) {
                    view.performHapticFeedback(0);
                    return;
                }
                return;
            }
            this.f146564c.mo200805a(view, this.f146563b, this.f146562a);
        }

        public C59108a(String str, String str2, SimpleRichTextView.AbstractC59104a aVar) {
            this.f146562a = str2;
            this.f146563b = str;
            this.f146564c = aVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.richtext2.widget.text.AbstractC59111c
    /* renamed from: a */
    public SpannableStringBuilder mo200811a(SpannableStringBuilder spannableStringBuilder) {
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        for (AtInfo atInfo : this.f146560a) {
            int i = atInfo.start;
            int i2 = atInfo.end;
            if (mo200816a(spannableStringBuilder2, i, i2)) {
                spannableStringBuilder.setSpan(new C59108a(atInfo.text, atInfo.userId, this.f146561b), i, i2, 33);
            }
        }
        return spannableStringBuilder;
    }

    public C59107a(List<AtInfo> list, SimpleRichTextView.AbstractC59104a aVar) {
        ArrayList arrayList = new ArrayList();
        this.f146560a = arrayList;
        CollectionUtils.resetToList(arrayList, list);
        this.f146561b = aVar;
    }
}
