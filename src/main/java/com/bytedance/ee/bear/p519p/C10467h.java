package com.bytedance.ee.bear.p519p;

import android.text.SpannableStringBuilder;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.p.h */
public class C10467h {

    /* renamed from: a */
    private final SpannableStringBuilder f28153a;

    /* renamed from: b */
    private final String f28154b;

    /* renamed from: c */
    private final List<Class> f28155c = new ArrayList(2);

    /* renamed from: a */
    public void mo39766a() {
        C13479a.m54772d(this.f28154b, this.f28153a.toString());
        SpannableStringBuilder spannableStringBuilder = this.f28153a;
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        for (Object obj : spans) {
            if (this.f28155c.size() <= 0 || this.f28155c.contains(obj.getClass())) {
                int spanStart = this.f28153a.getSpanStart(obj);
                int spanEnd = this.f28153a.getSpanEnd(obj);
                CharSequence subSequence = this.f28153a.subSequence(spanStart, spanEnd);
                C13479a.m54772d(this.f28154b, String.valueOf(spanStart) + " -> " + spanEnd + " | " + obj.toString() + " | " + ((Object) subSequence));
            }
        }
    }

    /* renamed from: a */
    public C10467h mo39765a(Class cls) {
        this.f28155c.add(cls);
        return this;
    }

    public C10467h(String str, SpannableStringBuilder spannableStringBuilder) {
        this.f28154b = str;
        this.f28153a = spannableStringBuilder;
    }
}
