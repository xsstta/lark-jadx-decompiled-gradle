package com.ss.android.lark.widget.richtext2.widget.text;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.widget.linked_emojicon.TextViewFixTouchConsume;
import com.ss.android.lark.widget.richtext.preprocess.p2966a.C59042d;
import com.ss.android.lark.widget.richtext2.entity.TextParseResult;
import com.ss.android.lark.widget.richtext2.span.p2974b.C59070a;
import com.ss.android.lark.widget.richtext2.span.p2976d.C59079a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleRichTextView extends TextViewFixTouchConsume {

    /* renamed from: k */
    private SpannableStringBuilder f146555k;

    /* renamed from: l */
    private Map<String, AbstractC59111c> f146556l;

    /* renamed from: m */
    private AbstractC59106c f146557m;

    /* renamed from: n */
    private AbstractC59104a f146558n;

    /* renamed from: o */
    private AbstractC59105b f146559o;

    /* renamed from: com.ss.android.lark.widget.richtext2.widget.text.SimpleRichTextView$a */
    public interface AbstractC59104a {
        /* renamed from: a */
        void mo200805a(View view, String str, String str2);

        /* renamed from: b */
        boolean mo200806b(View view, String str, String str2);
    }

    /* renamed from: com.ss.android.lark.widget.richtext2.widget.text.SimpleRichTextView$b */
    public interface AbstractC59105b {
        /* renamed from: a */
        void mo200807a(View view, String str);

        /* renamed from: b */
        boolean mo200808b(View view, String str);
    }

    /* renamed from: com.ss.android.lark.widget.richtext2.widget.text.SimpleRichTextView$c */
    public interface AbstractC59106c {
        /* renamed from: a */
        void mo200809a(View view, String str);

        /* renamed from: b */
        boolean mo200810b(View view, String str);
    }

    /* renamed from: a */
    private void m229587a(SpannableStringBuilder spannableStringBuilder) {
    }

    /* renamed from: a */
    private void m229586a() {
        C59042d.m229241a(this.f146555k);
        C59042d.m229242a(this.f146555k, C59079a.class);
        C59042d.m229242a(this.f146555k, C59070a.class);
    }

    public void setAtClickListener(AbstractC59104a aVar) {
        this.f146558n = aVar;
    }

    public void setPhoneClickListener(AbstractC59105b bVar) {
        this.f146559o = bVar;
    }

    public void setUrlClickListener(AbstractC59106c cVar) {
        this.f146557m = cVar;
    }

    public SimpleRichTextView(Context context) {
        this(context, null);
    }

    public void setInfo(TextParseResult textParseResult) {
        mo200800a(textParseResult, false);
    }

    /* renamed from: a */
    private SpannableStringBuilder m229585a(TextParseResult textParseResult) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isNotEmpty(textParseResult.getUrlInfoList()) && this.f146557m != null) {
            arrayList.add(new C59112d(textParseResult.getUrlInfoList(), this.f146557m));
        }
        if (CollectionUtils.isNotEmpty(textParseResult.getAtInfoList()) && this.f146558n != null) {
            arrayList.add(new C59107a(textParseResult.getAtInfoList(), this.f146558n));
        }
        if (CollectionUtils.isNotEmpty(textParseResult.getPhoneInfoList()) && this.f146559o != null) {
            arrayList.add(new C59109b(textParseResult.getPhoneInfoList(), this.f146559o));
        }
        for (AbstractC59111c cVar : this.f146556l.values()) {
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return m229584a(textParseResult.getSpanBuilder(), arrayList);
    }

    public SimpleRichTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private SpannableStringBuilder m229584a(SpannableStringBuilder spannableStringBuilder, List<AbstractC59111c> list) {
        for (AbstractC59111c cVar : list) {
            spannableStringBuilder = cVar.mo200811a(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public void mo200800a(TextParseResult textParseResult, boolean z) {
        this.f146555k = m229585a(textParseResult);
        if (z) {
            m229586a();
        }
        setText(this.f146555k);
        setMovementMethod(TextViewFixTouchConsume.C58493a.m226905a());
        m229587a(this.f146555k);
    }

    public SimpleRichTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f146556l = new HashMap();
    }
}
