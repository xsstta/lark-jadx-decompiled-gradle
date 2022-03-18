package com.bytedance.ee.bear.p398i;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.bytedance.ee.bear.p398i.AbstractC7828b;
import com.bytedance.ee.bear.p519p.AbstractC10466g;
import com.bytedance.ee.bear.p519p.C10462b;
import com.bytedance.ee.bear.p519p.C10463c;
import com.bytedance.ee.bear.p519p.C10467h;
import com.bytedance.ee.bear.p519p.C10468i;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.i.c */
public abstract class AbstractC7831c implements TextWatcher, AbstractC7828b {

    /* renamed from: a */
    private AbstractC7828b.C7829a f21145a;

    /* renamed from: a */
    private void m31364a(SpannableStringBuilder spannableStringBuilder) {
        new C10467h("CommentChangeWatcherImp", spannableStringBuilder).mo39765a(C10468i.class).mo39765a(C10463c.class).mo39765a(C10462b.class).mo39766a();
    }

    public void afterTextChanged(Editable editable) {
        C13479a.m54772d("CommentChangeWatcherImp", "afterTextChanged: ");
        if (this.f21145a != null) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) editable;
            C13479a.m54772d("CommentChangeWatcherImp", "afterTextChanged: before handling comment changing.");
            m31364a(spannableStringBuilder);
            mo30598a(spannableStringBuilder, this.f21145a);
            C13479a.m54772d("CommentChangeWatcherImp", "afterTextChanged: after handling comment changing.");
            m31364a(spannableStringBuilder);
            this.f21145a = null;
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        int i4;
        C13479a.m54772d("CommentChangeWatcherImp", "beforeTextChanged: start = " + i + ", count = " + i2 + ", after = " + i3);
        if (i2 <= 0 || i3 != 0) {
            z = false;
        } else {
            z = true;
        }
        if (i2 != 0 || i3 <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i2 <= 0 || i3 <= 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z) {
            i4 = 1;
        } else if (z2) {
            i4 = 2;
        } else if (z3) {
            i4 = 3;
        } else {
            i4 = 0;
        }
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
        int i5 = i2 + i;
        AbstractC10466g[] gVarArr = (AbstractC10466g[]) spannableStringBuilder.getSpans(i, i5, AbstractC10466g.class);
        ArrayList arrayList = new ArrayList();
        for (AbstractC10466g gVar : gVarArr) {
            int spanStart = spannableStringBuilder.getSpanStart(gVar);
            int spanEnd = spannableStringBuilder.getSpanEnd(gVar);
            if (spanStart <= i5 && spanEnd > i) {
                arrayList.add(new AbstractC7828b.C7829a.C7830a(gVar, spanStart, spanEnd));
            }
        }
        AbstractC7828b.C7829a.C7830a[] aVarArr = new AbstractC7828b.C7829a.C7830a[arrayList.size()];
        arrayList.toArray(aVarArr);
        this.f21145a = new AbstractC7828b.C7829a(aVarArr, i4, i, spannableStringBuilder.subSequence(i, i5), null);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C13479a.m54772d("CommentChangeWatcherImp", "onTextChanged: ");
        if (this.f21145a != null) {
            CharSequence subSequence = charSequence.subSequence(i, i3 + i);
            CharSequence c = this.f21145a.mo30605c();
            this.f21145a.mo30601a(subSequence);
            if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(subSequence) && this.f21145a.mo30599a() == 3) {
                if (TextUtils.equals(c, subSequence)) {
                    int b = this.f21145a.mo30602b() + c.length();
                    this.f21145a.mo30603b(0);
                    this.f21145a.mo30600a(b);
                    this.f21145a.mo30604b(new SpannableStringBuilder(""));
                    this.f21145a.mo30601a(new SpannableStringBuilder(""));
                } else if (subSequence.length() > c.length() && subSequence.toString().startsWith(c.toString())) {
                    C13479a.m54772d("CommentChangeWatcherImp", "onTextChanged: change modify to add action");
                    int b2 = this.f21145a.mo30602b() + c.length();
                    this.f21145a.mo30603b(2);
                    this.f21145a.mo30600a(b2);
                    this.f21145a.mo30604b(new SpannableStringBuilder(""));
                    this.f21145a.mo30601a(subSequence.subSequence(c.length(), subSequence.length()));
                } else if (subSequence.length() < c.length() && c.toString().startsWith(subSequence.toString())) {
                    C13479a.m54772d("CommentChangeWatcherImp", "onTextChanged: chagne modify to delete action");
                    int b3 = this.f21145a.mo30602b() + subSequence.length();
                    this.f21145a.mo30603b(1);
                    this.f21145a.mo30600a(b3);
                    this.f21145a.mo30601a(new SpannableStringBuilder(""));
                    this.f21145a.mo30604b(c.subSequence(subSequence.length(), c.length()));
                }
            }
        }
    }
}
