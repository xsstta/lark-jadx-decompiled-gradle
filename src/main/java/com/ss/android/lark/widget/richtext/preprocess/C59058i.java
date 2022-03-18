package com.ss.android.lark.widget.richtext.preprocess;

import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.richtext.preprocess.p2966a.C59038a;
import com.ss.android.lark.widget.richtext.preprocess.p2966a.C59039b;
import com.ss.android.lark.widget.richtext.preprocess.p2966a.C59041c;
import com.ss.android.lark.widget.richtext.preprocess.p2966a.C59042d;
import com.ss.android.lark.widget.richtext.preprocess.p2967b.C59044a;
import com.ss.android.lark.widget.richtext.preprocess.p2968c.C59046a;
import com.ss.android.lark.widget.span.PrefixInfo;
import com.ss.android.lark.widget.span.PrefixSpan;

/* renamed from: com.ss.android.lark.widget.richtext.preprocess.i */
public class C59058i extends AbstractC59037a {

    /* renamed from: b */
    public AbstractC59061b f146399b;

    /* renamed from: c */
    private C59060a f146400c = new C59060a();

    /* renamed from: com.ss.android.lark.widget.richtext.preprocess.i$b */
    public interface AbstractC59061b {
        /* renamed from: a */
        void mo200627a(PrefixInfo prefixInfo);

        /* renamed from: b */
        void mo200628b(PrefixInfo prefixInfo);
    }

    /* renamed from: a */
    public int mo200651a() {
        return this.f146400c.mo200652a();
    }

    /* renamed from: com.ss.android.lark.widget.richtext.preprocess.i$a */
    private class C59060a extends AbstractC59037a {

        /* renamed from: c */
        private C59039b f146402c;

        /* renamed from: d */
        private C59044a f146403d;

        /* renamed from: e */
        private C59038a f146404e;

        /* renamed from: a */
        public int mo200652a() {
            PrefixSpan prefixSpan;
            if (this.f146402c.mo200598a() != null) {
                prefixSpan = C59041c.m229235a(this.f146402c.mo200598a());
            } else {
                prefixSpan = null;
            }
            if (prefixSpan != null) {
                return prefixSpan.getLeadingMargin(true);
            }
            return 0;
        }

        private C59060a() {
            this.f146402c = new C59039b(C59058i.this.f146399b);
            this.f146403d = new C59044a(C59058i.this.f146399b);
            this.f146404e = new C59038a(C59058i.this.f146399b);
        }

        @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59037a
        /* renamed from: a */
        public void mo200596a(RichTextElement richTextElement, StringBuilder sb) {
            RichTextElement.RichTextTag tag = richTextElement.getTag();
            if (tag == RichTextElement.RichTextTag.LI) {
                this.f146402c.mo200596a(richTextElement, sb);
            } else if (tag == RichTextElement.RichTextTag.QUOTE) {
                this.f146403d.mo200596a(richTextElement, sb);
            } else if (richTextElement.getElementExtra().isInList() && tag != RichTextElement.RichTextTag.UL && tag != RichTextElement.RichTextTag.OL) {
                this.f146404e.mo200596a(richTextElement, sb);
            }
        }

        @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59037a
        /* renamed from: a */
        public void mo200597a(RichTextElement richTextElement, StringBuilder sb, RichTextElement.RichTextTag richTextTag) {
            RichTextElement.RichTextTag tag = richTextElement.getTag();
            if (tag == RichTextElement.RichTextTag.LI) {
                this.f146402c.mo200597a(richTextElement, sb, richTextTag);
            } else if (tag == RichTextElement.RichTextTag.QUOTE) {
                this.f146403d.mo200597a(richTextElement, sb, richTextTag);
            } else if (richTextElement.getElementExtra().isInList() && tag != RichTextElement.RichTextTag.UL && tag != RichTextElement.RichTextTag.OL) {
                if (tag != RichTextElement.RichTextTag.PARAGRAPH) {
                    C59042d.m229244a(sb);
                }
                this.f146404e.mo200597a(richTextElement, sb, richTextTag);
            }
        }
    }

    public C59058i(AbstractC59061b bVar) {
        this.f146399b = bVar;
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59037a
    /* renamed from: a */
    public void mo200596a(RichTextElement richTextElement, StringBuilder sb) {
        this.f146400c.mo200596a(richTextElement, sb);
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59037a
    /* renamed from: a */
    public void mo200597a(RichTextElement richTextElement, StringBuilder sb, RichTextElement.RichTextTag richTextTag) {
        C59046a.m229335a().mo200629a(richTextElement, sb, richTextTag);
        this.f146400c.mo200597a(richTextElement, sb, richTextTag);
    }
}
