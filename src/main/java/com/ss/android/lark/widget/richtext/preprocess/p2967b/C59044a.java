package com.ss.android.lark.widget.richtext.preprocess.p2967b;

import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.richtext.preprocess.AbstractC59037a;
import com.ss.android.lark.widget.richtext.preprocess.C59058i;
import com.ss.android.lark.widget.richtext2.span.p2975c.C59076b;
import com.ss.android.lark.widget.span.PrefixInfo;
import com.ss.android.lark.widget.span.PrefixSpan;
import java.util.Stack;

/* renamed from: com.ss.android.lark.widget.richtext.preprocess.b.a */
public class C59044a extends AbstractC59037a {

    /* renamed from: b */
    private int f146339b = -1;

    /* renamed from: c */
    private Stack<Integer> f146340c = new Stack<>();

    /* renamed from: d */
    private Stack<PrefixInfo> f146341d = new Stack<>();

    /* renamed from: e */
    private PrefixInfo f146342e = null;

    /* renamed from: f */
    private C59058i.AbstractC59061b f146343f;

    public C59044a(C59058i.AbstractC59061b bVar) {
        this.f146343f = bVar;
    }

    /* renamed from: a */
    private void m229278a(StringBuilder sb) {
        if (this.f146339b < sb.length()) {
            PrefixSpan.Type type = PrefixSpan.Type.QUOTE;
            float a = C59076b.m229455a(type);
            float c = C59076b.m229460c(type);
            PrefixSpan a2 = new PrefixSpan.C59145a(type).mo201018c(a).mo201019d(c).mo201013a(UIHelper.getColor(R.color.lkui_B500)).mo201016a();
            if (a2 != null) {
                this.f146342e.prefixParams = a2.mo201009b();
                this.f146342e.type = 12;
                this.f146342e.start = this.f146339b;
                this.f146342e.end = sb.length();
                this.f146342e.text = sb.substring(this.f146339b, sb.length());
                return;
            }
            Log.m165383e("QuoteParser", "quoteSpan is null, remove prefixInfo");
            this.f146343f.mo200628b(this.f146342e);
            return;
        }
        Log.m165383e("QuoteParser", "quoteSpan length is 0, remove prefixInfo");
        this.f146343f.mo200628b(this.f146342e);
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59037a
    /* renamed from: a */
    public void mo200596a(RichTextElement richTextElement, StringBuilder sb) {
        int i;
        PrefixInfo prefixInfo;
        super.mo200596a(richTextElement, sb);
        m229278a(sb);
        if (this.f146340c.isEmpty()) {
            i = -1;
        } else {
            i = this.f146340c.pop().intValue();
        }
        this.f146339b = i;
        if (this.f146341d.isEmpty()) {
            prefixInfo = null;
        } else {
            prefixInfo = this.f146341d.pop();
        }
        this.f146342e = prefixInfo;
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59037a
    /* renamed from: a */
    public void mo200597a(RichTextElement richTextElement, StringBuilder sb, RichTextElement.RichTextTag richTextTag) {
        super.mo200597a(richTextElement, sb, richTextTag);
        int i = this.f146339b;
        if (i != -1) {
            this.f146340c.push(Integer.valueOf(i));
        }
        PrefixInfo prefixInfo = this.f146342e;
        if (prefixInfo != null) {
            this.f146341d.push(prefixInfo);
        }
        this.f146339b = sb.length();
        PrefixInfo prefixInfo2 = new PrefixInfo(new PrefixSpan.C59145a(PrefixSpan.Type.NONE).mo201016a().mo201009b());
        this.f146342e = prefixInfo2;
        this.f146343f.mo200627a(prefixInfo2);
    }
}
