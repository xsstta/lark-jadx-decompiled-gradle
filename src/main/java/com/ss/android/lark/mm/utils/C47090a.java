package com.ss.android.lark.mm.utils;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.p2288b.C45855f;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.lark.mm.utils.a */
public class C47090a {

    /* renamed from: com.ss.android.lark.mm.utils.a$a */
    public interface AbstractC47093a {
        /* renamed from: a */
        void mo142600a(int i);
    }

    /* renamed from: com.ss.android.lark.mm.utils.a$b */
    public static abstract class AbstractView$OnClickListenerC47094b implements View.OnClickListener {

        /* renamed from: b */
        public int f118598b;

        public AbstractView$OnClickListenerC47094b(int i) {
            this.f118598b = i;
        }
    }

    /* renamed from: a */
    public static void m186497a(Context context, TextView textView, String str, AbstractC47093a aVar) {
        m186498a(context, textView, str, "@@.+?@@", 2, aVar);
    }

    /* renamed from: a */
    public static void m186499a(Context context, UDNotice uDNotice, String str, AbstractC47093a aVar) {
        m186500a(context, uDNotice, str, "@@.+?@@", 2, aVar);
    }

    /* renamed from: a */
    public static void m186500a(Context context, UDNotice uDNotice, String str, String str2, int i, final AbstractC47093a aVar) {
        Matcher matcher = Pattern.compile(str2).matcher(str);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String str3 = str;
        int i2 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            String substring = str.substring(matcher.start() + i, matcher.end() - i);
            str3 = str3.replace(group, substring);
            if (i2 > 0) {
                arrayList.add(Integer.valueOf(matcher.start() - ((i * 2) * i2)));
            } else {
                arrayList.add(Integer.valueOf(matcher.start()));
            }
            arrayList2.add(Integer.valueOf(((Integer) arrayList.get(i2)).intValue() + substring.length()));
            if (((Integer) arrayList.get(i2)).intValue() < 0 || ((Integer) arrayList2.get(i2)).intValue() > str3.length()) {
                C45855f.m181666e("ClickableSpanTextUtil", "Agree text invalid: " + str);
                return;
            }
            i2++;
        }
        uDNotice.setText(str3);
        for (int i3 = 0; i3 < i2; i3++) {
            if (((Integer) arrayList.get(i3)).intValue() < 0 || ((Integer) arrayList.get(i3)).intValue() >= ((Integer) arrayList2.get(i3)).intValue() || ((Integer) arrayList2.get(i3)).intValue() > str3.length()) {
                uDNotice.setText(str3);
            } else {
                uDNotice.mo91029a(((Integer) arrayList.get(i3)).intValue(), ((Integer) arrayList2.get(i3)).intValue(), new AbstractView$OnClickListenerC47094b(i3) {
                    /* class com.ss.android.lark.mm.utils.C47090a.C470922 */

                    public void onClick(View view) {
                        AbstractC47093a aVar = aVar;
                        if (aVar != null) {
                            aVar.mo142600a(this.f118598b);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static void m186498a(final Context context, TextView textView, String str, String str2, int i, final AbstractC47093a aVar) {
        Matcher matcher = Pattern.compile(str2).matcher(str);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String str3 = str;
        int i2 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            String substring = str.substring(matcher.start() + i, matcher.end() - i);
            str3 = str3.replace(group, substring);
            if (i2 > 0) {
                arrayList.add(Integer.valueOf(matcher.start() - ((i * 2) * i2)));
            } else {
                arrayList.add(Integer.valueOf(matcher.start()));
            }
            arrayList2.add(Integer.valueOf(((Integer) arrayList.get(i2)).intValue() + substring.length()));
            if (((Integer) arrayList.get(i2)).intValue() < 0 || ((Integer) arrayList2.get(i2)).intValue() > str3.length()) {
                C45855f.m181666e("ClickableSpanTextUtil", "Agree text invalid: " + str);
                return;
            }
            i2++;
        }
        SpannableString spannableString = new SpannableString(str3);
        for (int i3 = 0; i3 < i2; i3++) {
            if (((Integer) arrayList.get(i3)).intValue() < 0 || ((Integer) arrayList.get(i3)).intValue() >= ((Integer) arrayList2.get(i3)).intValue() || ((Integer) arrayList2.get(i3)).intValue() > str3.length()) {
                textView.setText(str3);
            } else {
                spannableString.setSpan(new AbstractC47118r(i3) {
                    /* class com.ss.android.lark.mm.utils.C47090a.C470911 */

                    public void onClick(View view) {
                        AbstractC47093a aVar = aVar;
                        if (aVar != null) {
                            aVar.mo142600a(this.f118655c);
                        }
                    }

                    @Override // com.ss.android.lark.mm.utils.AbstractC47118r
                    public void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        textPaint.setColor(context.getResources().getColor(R.color.text_link_normal));
                        textPaint.setUnderlineText(false);
                    }
                }, ((Integer) arrayList.get(i3)).intValue(), ((Integer) arrayList2.get(i3)).intValue(), 33);
            }
        }
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
    }
}
