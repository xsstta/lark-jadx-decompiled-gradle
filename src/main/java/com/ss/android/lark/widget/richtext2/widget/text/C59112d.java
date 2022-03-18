package com.ss.android.lark.widget.richtext2.widget.text;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.richtext2.widget.text.SimpleRichTextView;
import com.ss.android.lark.widget.span.UrlInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.richtext2.widget.text.d */
public class C59112d extends AbstractC59111c {

    /* renamed from: a */
    private List<UrlInfo> f146569a;

    /* renamed from: b */
    private SimpleRichTextView.AbstractC59106c f146570b;

    /* renamed from: com.ss.android.lark.widget.richtext2.widget.text.d$a */
    private static class C59113a extends ClickableSpan {

        /* renamed from: a */
        private String f146571a;

        /* renamed from: b */
        private SimpleRichTextView.AbstractC59106c f146572b;

        public void updateDrawState(TextPaint textPaint) {
        }

        public void onClick(View view) {
            if (view.getTag(R.id.tag_long_press) != null) {
                view.setTag(R.id.tag_long_press, null);
                if (this.f146572b.mo200810b(view, this.f146571a)) {
                    view.performHapticFeedback(0);
                    return;
                }
                return;
            }
            this.f146572b.mo200809a(view, this.f146571a);
        }

        public C59113a(String str, SimpleRichTextView.AbstractC59106c cVar) {
            this.f146571a = str;
            this.f146572b = cVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.richtext2.widget.text.AbstractC59111c
    /* renamed from: a */
    public SpannableStringBuilder mo200811a(SpannableStringBuilder spannableStringBuilder) {
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        for (UrlInfo urlInfo : this.f146569a) {
            int i = urlInfo.start;
            int i2 = urlInfo.end;
            if (mo200816a(spannableStringBuilder2, i, i2)) {
                spannableStringBuilder.setSpan(new C59113a(urlInfo.href, this.f146570b), i, i2, 33);
            }
        }
        return spannableStringBuilder;
    }

    public C59112d(List<UrlInfo> list, SimpleRichTextView.AbstractC59106c cVar) {
        ArrayList arrayList = new ArrayList();
        this.f146569a = arrayList;
        CollectionUtils.resetToList(arrayList, list);
        this.f146570b = cVar;
    }
}
