package com.bytedance.ee.bear.sheet.inputbar.at.p546b;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import com.bytedance.ee.bear.p519p.AbstractC10466g;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentStyle;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.ui.ColorUtils;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.inputbar.at.b.a */
public abstract class AbstractC11197a extends CharacterStyle implements AbstractC11204h {

    /* renamed from: a */
    private final Context f30119a;

    /* renamed from: b */
    private SegmentStyle f30120b;

    @Override // com.bytedance.ee.bear.p519p.AbstractC10466g
    /* renamed from: o */
    public /* synthetic */ int mo39738o() {
        return AbstractC10466g.CC.$default$o(this);
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.at.p546b.AbstractC11204h
    /* renamed from: a */
    public SegmentStyle mo42792a() {
        return mo42803h().getStyle();
    }

    /* renamed from: b */
    public AbstractC11197a clone() throws CloneNotSupportedException {
        AbstractC11197a aVar = (AbstractC11197a) super.clone();
        SegmentStyle segmentStyle = this.f30120b;
        if (segmentStyle != null) {
            aVar.f30120b = segmentStyle.clone();
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo42794a(SegmentStyle segmentStyle) {
        this.f30120b = segmentStyle;
    }

    public AbstractC11197a(Context context) {
        this.f30119a = context;
    }

    public void updateDrawState(TextPaint textPaint) {
        SegmentStyle a = mo42792a();
        if (a == null) {
            a = this.f30120b;
        }
        if (a != null) {
            mo42798c(textPaint, a);
            mo42796b(textPaint, a);
            mo42793a(textPaint, a);
        }
    }

    /* renamed from: a */
    private int m46536a(String str) {
        boolean z;
        int a = ColorUtils.m55697a(str);
        boolean a2 = ColorUtils.m55701a(this.f30119a);
        if ((!ColorUtils.m55699a(a) || !a2) && (!ColorUtils.m55702b(a) || a2)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return this.f30119a.getResources().getColor(R.color.text_title);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo42796b(TextPaint textPaint, SegmentStyle segmentStyle) {
        if (segmentStyle.getFontWeight() == 700 && "italic".equals(segmentStyle.getFontStyle())) {
            textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 3));
        } else if (segmentStyle.getFontWeight() == 700) {
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        } else if ("italic".equals(segmentStyle.getFontStyle())) {
            textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 2));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo42798c(TextPaint textPaint, SegmentStyle segmentStyle) {
        if (!TextUtils.isEmpty(segmentStyle.getColor())) {
            try {
                textPaint.setColor(m46536a(segmentStyle.getColor()));
            } catch (Exception unused) {
                C13479a.m54758a("AbsStyleSpan", "onSetSpanColor failed, color = " + segmentStyle.getColor());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo42793a(TextPaint textPaint, SegmentStyle segmentStyle) {
        if (!TextUtils.isEmpty(segmentStyle.getTextDecoration())) {
            String[] split = segmentStyle.getTextDecoration().split(" ");
            for (String str : split) {
                if ("line-through".equals(str)) {
                    textPaint.setStrikeThruText(true);
                } else if ("underline".equals(str)) {
                    textPaint.setUnderlineText(true);
                }
            }
        }
    }
}
