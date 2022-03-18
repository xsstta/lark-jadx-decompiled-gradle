package com.tt.miniapp.shortcut.dialog;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.larksuite.suite.R;
import com.tt.miniapp.shortcut.dialog.C66858e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tt.miniapp.shortcut.dialog.a */
public class C66845a {

    /* renamed from: a */
    public C66857d f168613a;

    /* renamed from: b */
    public C66848b f168614b;

    /* renamed from: c */
    public Context f168615c;

    /* renamed from: d */
    public C66857d f168616d;

    /* renamed from: e */
    public C66857d f168617e;

    /* renamed from: com.tt.miniapp.shortcut.dialog.a$a */
    public interface AbstractC66847a {
        /* renamed from: a */
        void mo232763a(String str);
    }

    public C66845a() {
    }

    /* renamed from: a */
    public void mo232775a(TextView textView, C66858e eVar) {
        if (eVar != null && textView != null) {
            textView.setText(m260786b(textView, eVar));
        }
    }

    /* renamed from: a */
    public static C66858e m260784a(Context context, String str) {
        return new C66858e.C66859a().mo232799a(str).mo232797a(ContextCompat.getColor(context, R.color.microapp_m_black_1)).mo232796a(context.getResources().getDimension(R.dimen.microapp_m_text_size_16)).mo232800a();
    }

    /* renamed from: a */
    public static List<C66858e> m260785a(Context context, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(new C66858e.C66859a().mo232799a(str).mo232797a(ContextCompat.getColor(context, R.color.microapp_m_80000000)).mo232796a(context.getResources().getDimension(R.dimen.microapp_m_text_size_16)).mo232800a());
        }
        return arrayList;
    }

    /* renamed from: b */
    private SpannableString m260786b(TextView textView, C66858e eVar) {
        final String a = eVar.mo232791a();
        SpannableString spannableString = new SpannableString(a);
        spannableString.setSpan(new AbsoluteSizeSpan((int) eVar.mo232792b()), 0, a.length(), 33);
        final int c = eVar.mo232793c();
        spannableString.setSpan(new ForegroundColorSpan(c), 0, a.length(), 33);
        spannableString.setSpan(new StyleSpan(eVar.mo232794d()), 0, a.length(), 33);
        final AbstractC66847a e = eVar.mo232795e();
        if (e != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            spannableString.setSpan(new ClickableSpan() {
                /* class com.tt.miniapp.shortcut.dialog.C66845a.C668461 */

                public void onClick(View view) {
                    e.mo232763a(a);
                }

                public void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setColor(c);
                    textPaint.setUnderlineText(false);
                }
            }, 0, a.length(), 33);
        }
        return spannableString;
    }

    /* renamed from: a */
    public void mo232776a(TextView textView, List<C66858e> list) {
        if (!(textView == null || list == null)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (C66858e eVar : list) {
                spannableStringBuilder.append((CharSequence) m260786b(textView, eVar));
            }
            textView.setText(spannableStringBuilder);
        }
    }

    public C66845a(C66857d dVar, C66848b bVar, Context context, C66857d dVar2, C66857d dVar3) {
        this.f168613a = dVar;
        this.f168614b = bVar;
        this.f168615c = context;
        this.f168616d = dVar2;
        this.f168617e = dVar3;
    }
}
