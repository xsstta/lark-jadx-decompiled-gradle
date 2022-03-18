package com.ss.android.lark.widget.linked_emojicon;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.emoji.EmojiReader;
import com.ss.android.lark.widget.linked_emojicon.p2941a.C58497a;
import java.util.Map;

/* renamed from: com.ss.android.lark.widget.linked_emojicon.g */
public class C58513g extends SpannableStringBuilder {

    /* renamed from: a */
    private Context f144408a;

    /* renamed from: b */
    private CharSequence f144409b;

    /* renamed from: a */
    private boolean m227004a() {
        CharSequence charSequence = this.f144409b;
        if (charSequence == null || charSequence.length() <= 2) {
            return false;
        }
        EmojiReader aVar = EmojiReader.f143882a;
        CharSequence charSequence2 = this.f144409b;
        return aVar.mo197851a(charSequence2, charSequence2.length() - 2);
    }

    public C58513g(Context context) {
        super("");
        this.f144408a = context;
    }

    /* renamed from: a */
    public C58513g append(CharSequence charSequence) {
        if (charSequence == null) {
            return this;
        }
        int length = length();
        this.f144409b = charSequence;
        return (C58513g) replace(length, length, charSequence, 0, charSequence.length());
    }

    public boolean equals(Object obj) {
        if ((obj instanceof Spanned) && toString().equals(obj.toString())) {
            Spanned spanned = (Spanned) obj;
            Object[] spans = getSpans(0, length(), Object.class);
            if (spans.length == spanned.getSpans(0, spanned.length(), Object.class).length) {
                for (Object obj2 : spans) {
                    Object[] spans2 = spanned.getSpans(getSpanStart(obj2), getSpanEnd(obj2), obj2.getClass());
                    if (spans2.length == 0) {
                        return false;
                    }
                    Object obj3 = spans2[0];
                    if (obj2 != obj3 && (!obj2.equals(obj3) || getSpanFlags(obj2) != spanned.getSpanFlags(obj3))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public C58513g(Context context, CharSequence charSequence) {
        super(charSequence, 0, charSequence.length());
        this.f144408a = context;
    }

    /* renamed from: a */
    public C58513g append(CharSequence charSequence, Object obj, int i) {
        if (TextUtils.isEmpty(charSequence)) {
            return this;
        }
        int length = length();
        append(charSequence);
        this.f144409b = charSequence;
        setSpan(obj, length, length(), i);
        this.f144409b = null;
        return this;
    }

    /* renamed from: a */
    public C58513g mo198348a(CharSequence charSequence, Map<String, Object> map, int i) {
        if (TextUtils.isEmpty(charSequence)) {
            return this;
        }
        int length = length();
        append(charSequence);
        this.f144409b = charSequence;
        if (!CollectionUtils.isEmpty(map)) {
            for (String str : map.keySet()) {
                setSpan(map.get(str), length, length(), i);
            }
        }
        this.f144409b = null;
        return this;
    }

    /* renamed from: a */
    private void m227003a(Object obj, int i, int i2, int i3) {
        boolean z;
        C58506c cVar;
        C58506c cVar2 = (C58506c) obj;
        if (i2 - i > 15) {
            while (i < i2) {
                int i4 = i + 15;
                if (i4 >= i2) {
                    z = true;
                } else {
                    z = false;
                }
                int min = Math.min(i4, i2);
                if (z) {
                    cVar = cVar2;
                } else {
                    cVar = new C58506c(cVar2.mo198311a());
                    cVar.mo198312a(false);
                }
                super.setSpan(cVar, i, min, i3);
                i = i4;
            }
            return;
        }
        super.setSpan(obj, i, i2, i3);
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        try {
            int i4 = 2;
            if (obj instanceof C58497a) {
                if (!m227004a()) {
                    i4 = 1;
                }
                super.setSpan(obj, i2 - i4, i2, i3);
            } else if (obj instanceof C58498b) {
                if (!m227004a()) {
                    i4 = 1;
                }
                C58498b bVar = (C58498b) obj;
                C58498b bVar2 = new C58498b(this.f144408a, bVar.mo198239a(), bVar.mo198240b(), bVar.mo198241c(), true);
                C58498b bVar3 = new C58498b(this.f144408a, bVar.mo198239a(), bVar.mo198240b(), bVar.mo198241c(), false);
                super.setSpan(bVar2, i, i + i4, i3);
                super.setSpan(bVar3, i2 - i4, i2, i3);
            } else if (obj instanceof C58496a) {
                C58496a aVar = (C58496a) obj;
                C58496a aVar2 = new C58496a(aVar.mo198228a(), true, aVar.mo198229b());
                C58496a aVar3 = new C58496a(aVar.mo198228a(), false, aVar.mo198229b());
                super.setSpan(aVar2, i, i + 1, i3);
                super.setSpan(aVar3, i2 - 1, i2, i3);
            } else if (obj instanceof C58506c) {
                m227003a(obj, i, i2, i3);
            } else {
                super.setSpan(obj, i, i2, i3);
            }
        } catch (IndexOutOfBoundsException e) {
            Log.m165382e("Span is:" + obj.getClass().getSimpleName() + ", start is:" + i + "end:" + i2);
            e.printStackTrace();
        }
    }
}
