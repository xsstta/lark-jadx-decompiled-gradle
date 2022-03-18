package com.bytedance.ee.bear.bitable.card.view.form;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.bitable.card.viewmodel.C4771b;
import com.bytedance.ee.bear.p522q.C10539a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.form.d */
public class C4719d extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final Context f13934a;

    /* renamed from: b */
    private final TextView f13935b;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.form.d$a */
    public static class C4721a extends CharacterStyle {
        private C4721a() {
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        }
    }

    /* renamed from: a */
    public void mo18435a(boolean z) {
        this.f13935b.setTextColor(this.f13934a.getResources().getColor(R.color.static_white));
        this.f13935b.setEnabled(z);
    }

    /* renamed from: a */
    private void m19577a(TextView textView) {
        String string = this.f13934a.getString(R.string.Bitable_Common_BitableName);
        String a = C10539a.m43639a(this.f13934a, R.string.Bitable_Form_PoweredByBitable, "bitableName", string);
        int indexOf = a.indexOf(string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a);
        spannableStringBuilder.setSpan(new C4721a(), indexOf, string.length() + indexOf, 33);
        textView.setText(spannableStringBuilder);
    }

    public C4719d(View view, C4771b bVar) {
        super(view);
        this.f13934a = view.getContext();
        TextView textView = (TextView) view.findViewById(R.id.form_submit);
        this.f13935b = textView;
        textView.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.bitable.card.view.form.$$Lambda$d$b9M9brnel19DjE6s7yHejtXIxDk */

            public final void onClick(View view) {
                C4771b.this.confirmForm();
            }
        });
        m19577a((TextView) view.findViewById(R.id.form_support_text));
    }
}
