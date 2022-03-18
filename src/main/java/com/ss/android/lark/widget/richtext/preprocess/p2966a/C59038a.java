package com.ss.android.lark.widget.richtext.preprocess.p2966a;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.richtext.preprocess.AbstractC59037a;
import com.ss.android.lark.widget.richtext.preprocess.C59058i;
import com.ss.android.lark.widget.richtext.preprocess.ElementExtra;
import com.ss.android.lark.widget.span.PrefixInfo;
import com.ss.android.lark.widget.span.PrefixSpan;
import java.util.Stack;

/* renamed from: com.ss.android.lark.widget.richtext.preprocess.a.a */
public class C59038a extends AbstractC59037a {

    /* renamed from: b */
    private int f146324b = -1;

    /* renamed from: c */
    private Stack<Integer> f146325c = new Stack<>();

    /* renamed from: d */
    private Stack<ElementExtra.FloorInfo> f146326d = new Stack<>();

    /* renamed from: e */
    private Stack<PrefixInfo> f146327e = new Stack<>();

    /* renamed from: f */
    private ElementExtra.FloorInfo f146328f;

    /* renamed from: g */
    private PrefixInfo f146329g = null;

    /* renamed from: h */
    private C59058i.AbstractC59061b f146330h;

    public C59038a(C59058i.AbstractC59061b bVar) {
        this.f146330h = bVar;
    }

    /* renamed from: b */
    private void m229225b(RichTextElement richTextElement, StringBuilder sb) {
        if (this.f146328f == null || this.f146324b == sb.length()) {
            Log.m165383e("DirectLiParser", "span is invalid, remove prefixInfo");
            this.f146330h.mo200628b(this.f146329g);
            return;
        }
        PrefixSpan a = C59041c.m229235a(this.f146328f);
        if (a != null) {
            a.mo201009b().mo201021a(PrefixSpan.Type.LEFT_MARGIN);
            this.f146329g.prefixParams = a.mo201009b();
            this.f146329g.type = 12;
            this.f146329g.start = this.f146324b;
            this.f146329g.end = sb.length();
            this.f146329g.text = sb.substring(this.f146324b, sb.length());
            return;
        }
        Log.m165383e("DirectLiParser", "span is null, remove prefixInfo");
        this.f146330h.mo200628b(this.f146329g);
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59037a
    /* renamed from: a */
    public void mo200596a(RichTextElement richTextElement, StringBuilder sb) {
        ElementExtra.FloorInfo floorInfo;
        int i;
        super.mo200596a(richTextElement, sb);
        if (this.f146324b == sb.length()) {
            sb.append(" ");
        }
        m229225b(richTextElement, sb);
        PrefixInfo prefixInfo = null;
        if (this.f146326d.isEmpty()) {
            floorInfo = null;
        } else {
            floorInfo = this.f146326d.pop();
        }
        this.f146328f = floorInfo;
        if (this.f146325c.isEmpty()) {
            i = -1;
        } else {
            i = this.f146325c.pop().intValue();
        }
        this.f146324b = i;
        if (!this.f146327e.isEmpty()) {
            prefixInfo = this.f146327e.pop();
        }
        this.f146329g = prefixInfo;
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59037a
    /* renamed from: a */
    public void mo200597a(RichTextElement richTextElement, StringBuilder sb, RichTextElement.RichTextTag richTextTag) {
        super.mo200597a(richTextElement, sb, richTextTag);
        int i = this.f146324b;
        if (i != -1) {
            this.f146325c.push(Integer.valueOf(i));
        }
        this.f146324b = sb.length();
        ElementExtra.FloorInfo floorInfo = this.f146328f;
        if (floorInfo != null) {
            this.f146326d.push(floorInfo);
        }
        this.f146328f = richTextElement.getElementExtra().getFloorInfo();
        PrefixInfo prefixInfo = this.f146329g;
        if (prefixInfo != null) {
            this.f146327e.push(prefixInfo);
        }
        PrefixInfo prefixInfo2 = new PrefixInfo(new PrefixSpan.C59145a(PrefixSpan.Type.NONE).mo201016a().mo201009b());
        this.f146329g = prefixInfo2;
        this.f146330h.mo200627a(prefixInfo2);
    }
}
