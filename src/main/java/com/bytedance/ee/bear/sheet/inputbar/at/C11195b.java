package com.bytedance.ee.bear.sheet.inputbar.at;

import android.content.Context;
import android.text.InputFilter;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.core.util.AbstractC0846g;
import com.bytedance.ee.bear.sheet.inputbar.at.p546b.AbstractC11200d;
import com.bytedance.ee.bear.sheet.inputbar.at.p546b.AbstractC11204h;
import com.bytedance.ee.bear.sheet.inputbar.at.p546b.C11206j;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentStyle;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.TextLikeSegment;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.TextSegment;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13658c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.sheet.inputbar.at.b */
public class C11195b implements InputFilter, SpanWatcher {

    /* renamed from: a */
    private final Context f30116a;

    /* renamed from: b */
    private SegmentStyle f30117b;

    public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
    }

    public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m46531a(Spanned spanned, int i, AbstractC11200d dVar) {
        return dVar.mo39746f() || (dVar.mo39745e() && spanned.getSpanEnd(dVar) != i);
    }

    /* renamed from: a */
    private boolean m46532a(AbstractC11200d dVar, AbstractC11200d dVar2) {
        TextLikeSegment textLikeSegment;
        if (dVar == dVar2) {
            return false;
        }
        BaseSegment h = dVar.mo42803h();
        BaseSegment h2 = dVar2.mo42803h();
        if ((h instanceof TextLikeSegment) && (h2 instanceof TextSegment)) {
            List<TextSegment> texts = ((TextLikeSegment) h).getTexts();
            if (texts == null || !texts.contains(h2)) {
                return true;
            }
            return false;
        } else if (!(h2 instanceof TextLikeSegment) || !(h instanceof TextSegment) || (textLikeSegment = ((TextSegment) h).getTextLikeSegment()) == null || textLikeSegment != h2) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.sheet.inputbar.at.b$a */
    public static class C11196a {

        /* renamed from: a */
        private List<AbstractC11200d> f30118a;

        /* renamed from: a */
        public List<AbstractC11200d> mo42791a() {
            List<AbstractC11200d> list = this.f30118a;
            if (list == null) {
                return new ArrayList();
            }
            return list;
        }

        public C11196a(List<AbstractC11200d> list) {
            this.f30118a = list;
        }
    }

    /* renamed from: a */
    public void mo42786a(SegmentStyle segmentStyle) {
        this.f30117b = segmentStyle;
    }

    public C11195b(Context context, SegmentStyle segmentStyle) {
        this.f30116a = context;
        this.f30117b = segmentStyle;
    }

    /* renamed from: a */
    private Spannable m46526a(String str, List<AbstractC11200d> list) {
        if (list == null) {
            return null;
        }
        C11196a aVar = new C11196a(list);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(aVar, 0, str.length(), 33);
        return spannableStringBuilder;
    }

    /* renamed from: a */
    private Spannable m46525a(String str, SegmentStyle segmentStyle) {
        TextSegment textSegment = new TextSegment(str);
        if (segmentStyle != null) {
            try {
                segmentStyle = segmentStyle.clone();
            } catch (CloneNotSupportedException e) {
                C13479a.m54759a("SegmentInputFilter", "appendTextSpan, clone fail", e);
            }
        }
        textSegment.setStyle(segmentStyle);
        C11206j jVar = new C11206j(this.f30116a, textSegment);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(jVar, 0, str.length(), jVar.mo39738o());
        return spannableStringBuilder;
    }

    /* renamed from: a */
    private void m46528a(Spannable spannable, C11196a aVar) {
        boolean z;
        for (AbstractC11200d dVar : aVar.mo42791a()) {
            int spanStart = spannable.getSpanStart(dVar);
            int spanEnd = spannable.getSpanEnd(dVar);
            int spanStart2 = spannable.getSpanStart(aVar);
            int spanEnd2 = spannable.getSpanEnd(aVar);
            if (spanStart > spanStart2 || spanEnd < spanEnd2) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                spannable.removeSpan(dVar);
                if (spanStart < 0) {
                    spanStart = spanStart2;
                }
                int[] b = C13658c.m55427b(new int[]{spanStart, spanEnd}, new int[]{spanStart2, spanEnd2});
                spannable.setSpan(dVar, b[0], b[1], dVar.mo39738o());
            }
        }
        spannable.removeSpan(aVar);
    }

    /* renamed from: a */
    private void m46530a(Spanned spanned, Spannable spannable) {
        if (spanned.length() == spannable.length()) {
            TextUtils.copySpansFrom(spanned, 0, spanned.length(), null, spannable, 0);
            return;
        }
        Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
        for (Object obj : spans) {
            spannable.setSpan(obj, 0, spannable.length(), spanned.getSpanFlags(obj));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ boolean m46533b(Spanned spanned, int i, AbstractC11200d dVar) {
        if (spanned.getSpanStart(dVar) != i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private Spannable m46524a(String str, Spanned spanned, int i) {
        AbstractC11200d[] dVarArr = (AbstractC11200d[]) spanned.getSpans(i, i, AbstractC11200d.class);
        if (i > 0 && spanned.charAt(i - 1) != '\n') {
            return m46527a(str, dVarArr, new AbstractC0846g(spanned, i) {
                /* class com.bytedance.ee.bear.sheet.inputbar.at.$$Lambda$b$lSd7BqYD6zCYGiVzUFBlUY31668 */
                public final /* synthetic */ Spanned f$0;
                public final /* synthetic */ int f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                @Override // androidx.core.util.AbstractC0846g
                public final boolean test(Object obj) {
                    return C11195b.m46533b(this.f$0, this.f$1, (AbstractC11200d) obj);
                }
            }, new AbstractC0846g(spanned, i) {
                /* class com.bytedance.ee.bear.sheet.inputbar.at.$$Lambda$b$G8e1zeryibC2ZuB3B38DX192izI */
                public final /* synthetic */ Spanned f$0;
                public final /* synthetic */ int f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                @Override // androidx.core.util.AbstractC0846g
                public final boolean test(Object obj) {
                    return C11195b.m46531a(this.f$0, this.f$1, (AbstractC11200d) obj);
                }
            });
        }
        if (spanned.length() <= i || spanned.charAt(i) == '\n') {
            return m46525a(str, this.f30117b);
        }
        return m46527a(str, dVarArr, (AbstractC0846g<AbstractC11200d>) null, $$Lambda$hjz1yfsSIi9PwQszXKB_76GXN3Q.INSTANCE);
    }

    public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (obj instanceof C11196a) {
            m46528a(spannable, (C11196a) obj);
        }
        if (obj instanceof AbstractC11200d) {
            m46529a(spannable, (AbstractC11200d) obj, i, i2);
        }
    }

    /* renamed from: a */
    private Spannable m46527a(String str, AbstractC11200d[] dVarArr, AbstractC0846g<AbstractC11200d> gVar, AbstractC0846g<AbstractC11200d> gVar2) {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        SegmentStyle segmentStyle = null;
        for (AbstractC11200d dVar : dVarArr) {
            if (gVar == null || gVar.test(dVar)) {
                if (gVar2 == null || !gVar2.test(dVar)) {
                    z = false;
                } else {
                    arrayList.add(dVar);
                }
                if (dVar instanceof AbstractC11204h) {
                    AbstractC11204h hVar = (AbstractC11204h) dVar;
                    if (hVar.mo42792a() != null) {
                        segmentStyle = hVar.mo42792a();
                    }
                }
            }
        }
        if (z) {
            return m46526a(str, arrayList);
        }
        return m46525a(str, segmentStyle);
    }

    /* renamed from: a */
    private void m46529a(Spannable spannable, AbstractC11200d dVar, int i, int i2) {
        AbstractC11200d dVar2;
        AbstractC11200d[] dVarArr = (AbstractC11200d[]) spannable.getSpans(i, i2, AbstractC11200d.class);
        for (AbstractC11200d dVar3 : dVarArr) {
            if (m46532a(dVar, dVar3)) {
                int[][] a = C13658c.m55426a(new int[]{spannable.getSpanStart(dVar3), spannable.getSpanEnd(dVar3)}, new int[]{spannable.getSpanStart(dVar), spannable.getSpanEnd(dVar)});
                spannable.removeSpan(dVar3);
                for (int[] iArr : a) {
                    try {
                        dVar2 = dVar3.mo42797c();
                    } catch (CloneNotSupportedException e) {
                        C13479a.m54759a("SegmentInputFilter", "handleOverlappingSpan, clone fail", e);
                        dVar2 = dVar3;
                    }
                    spannable.setSpan(dVar2, iArr[0], iArr[1], dVar3.mo39738o());
                }
            }
        }
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        boolean z = !TextUtils.isEmpty(charSequence);
        if ((charSequence instanceof SpannableStringBuilder) && ((AbstractC11200d[]) ((SpannableStringBuilder) charSequence).getSpans(i, i2, AbstractC11200d.class)).length != 0) {
            z = false;
        }
        if (!z) {
            return null;
        }
        Spannable a = m46524a(charSequence.toString(), spanned, i3);
        if (charSequence instanceof Spanned) {
            m46530a((Spanned) charSequence, a);
        }
        return a;
    }
}
