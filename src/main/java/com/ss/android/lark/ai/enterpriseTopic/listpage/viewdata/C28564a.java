package com.ss.android.lark.ai.enterpriseTopic.listpage.viewdata;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.recyclerview.p2964a.AbstractC58968a;
import com.ss.android.lark.widget.recyclerview.p2964a.C58974c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.ai.enterpriseTopic.listpage.viewdata.a */
public class C28564a extends AbstractC58968a<C28564a> {

    /* renamed from: a */
    private final CharSequence f71839a;

    /* renamed from: b */
    private final boolean f71840b;

    /* renamed from: f */
    private final List<String> f71841f;

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m104754a(TextView textView) {
        if (!this.f71840b) {
            textView.setText(m104753a(textView.getContext(), textView));
        }
    }

    public C28564a(CharSequence charSequence, boolean z) {
        this(charSequence, new ArrayList(), z);
    }

    @Override // com.ss.android.lark.widget.recyclerview.p2964a.AbstractC58968a
    /* renamed from: a */
    public void mo101671a(C58974c cVar, int i) {
        int i2;
        TextView textView = (TextView) cVar.mo200081a(R.id.tv_summary);
        if (this.f71840b) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        textView.setVisibility(i2);
        textView.post(new Runnable(textView) {
            /* class com.ss.android.lark.ai.enterpriseTopic.listpage.viewdata.$$Lambda$a$7RorZKQ9SIK0n6pLtZLSVoaTz5g */
            public final /* synthetic */ TextView f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C28564a.this.m104754a((C28564a) this.f$1);
            }
        });
    }

    /* renamed from: a */
    private CharSequence m104753a(Context context, TextView textView) {
        if (context == null) {
            return this.f71839a;
        }
        TextPaint paint = textView.getPaint();
        CharSequence charSequence = this.f71839a;
        String charSequence2 = TextUtils.ellipsize(this.f71839a, textView.getPaint(), paint.measureText(charSequence, 0, Math.min(charSequence.length(), 98)), TextUtils.TruncateAt.END).toString();
        String str = context.getString(R.string.Lark_Common_OpeningQuote) + ((Object) charSequence2) + context.getString(R.string.Lark_Common_ClosingQuote);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (String str2 : this.f71841f) {
            int indexOf = str.indexOf(str2);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.primary_pri_500)), indexOf, str2.length() + indexOf, 33);
            }
        }
        return spannableStringBuilder;
    }

    public C28564a(CharSequence charSequence, List<String> list, boolean z) {
        super(R.layout.entity_query);
        this.f71839a = charSequence;
        this.f71841f = list;
        this.f71840b = z;
    }
}
