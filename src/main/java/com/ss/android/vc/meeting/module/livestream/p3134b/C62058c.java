package com.ss.android.vc.meeting.module.livestream.p3134b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.C28460b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.livestream.MsgWithUrlInfo;
import com.ss.android.vc.statistics.event.C63750bm;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.vc.meeting.module.livestream.b.c */
public class C62058c {

    /* renamed from: com.ss.android.vc.meeting.module.livestream.b.c$b */
    public interface AbstractC62061b {
        /* renamed from: a */
        void mo214786a(String str);

        /* renamed from: a */
        void mo214787a(String str, String str2, String str3);
    }

    /* renamed from: a */
    private AbstractC62061b m242460a(final Context context) {
        return new AbstractC62061b() {
            /* class com.ss.android.vc.meeting.module.livestream.p3134b.C62058c.C620591 */

            @Override // com.ss.android.vc.meeting.module.livestream.p3134b.C62058c.AbstractC62061b
            /* renamed from: a */
            public void mo214786a(String str) {
                if (C28460b.m104296a(context)) {
                    try {
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    Context context = context;
                    if (context instanceof Activity) {
                        VCDialogUtils.m236160a(context, (int) R.string.View_N_FloatingWindowPermission, 1, UIHelper.mustacheFormat((int) R.string.View_G_PopupPermission, "appName", VideoChatModuleDependency.getLarkAppDependency().mo196409b()), (int) R.string.View_G_CancelButton, (int) R.string.View_G_ConfirmButton, false, UDUiModeUtils.m93320a(context.getResources().getConfiguration()));
                    }
                }
            }

            @Override // com.ss.android.vc.meeting.module.livestream.p3134b.C62058c.AbstractC62061b
            /* renamed from: a */
            public void mo214787a(String str, String str2, String str3) {
                C63750bm.m250193a(str, str2, str3);
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.livestream.b.c$a */
    public class C62060a extends ClickableSpan {

        /* renamed from: b */
        private String f155894b;

        /* renamed from: c */
        private AbstractC62061b f155895c;

        /* renamed from: d */
        private String f155896d;

        /* renamed from: e */
        private String f155897e;

        /* renamed from: f */
        private String f155898f;

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(Color.parseColor("#4e83fd"));
            textPaint.setUnderlineText(false);
        }

        public void onClick(View view) {
            AbstractC62061b bVar = this.f155895c;
            if (bVar != null) {
                bVar.mo214786a(this.f155894b);
                this.f155895c.mo214787a(this.f155896d, this.f155897e, this.f155898f);
            }
        }

        private C62060a(String str, String str2, String str3, String str4, AbstractC62061b bVar) {
            this.f155894b = str;
            this.f155896d = str2;
            this.f155897e = str3;
            this.f155898f = str4;
            this.f155895c = bVar;
        }
    }

    /* renamed from: a */
    public static void m242461a(TextView textView, MsgWithUrlInfo bVar) {
        if (bVar != null) {
            new C62058c().mo214785b(textView, bVar);
        }
    }

    /* renamed from: b */
    public void mo214785b(TextView textView, MsgWithUrlInfo bVar) {
        if (bVar.mo209956b().size() == 1) {
            m242463d(textView, bVar);
        } else if (bVar.mo209956b().size() == 2) {
            m242462c(textView, bVar);
        }
    }

    /* renamed from: d */
    private void m242463d(TextView textView, MsgWithUrlInfo bVar) {
        Context context = textView.getContext();
        String str = bVar.mo209956b().get(0);
        String a = bVar.mo209955a();
        Matcher matcher = Pattern.compile("@@.*?@@").matcher(a);
        String str2 = a;
        int i = 0;
        int i2 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            String substring = a.substring(matcher.start() + 2, matcher.end() - 2);
            str2 = a.replace(group, substring);
            i = matcher.start();
            i2 = i + substring.length();
        }
        SpannableString spannableString = new SpannableString(str2);
        spannableString.setSpan(new C62060a(str, bVar.mo209957c(), bVar.mo209958d(), "", m242460a(context)), i, i2, 33);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
    }

    /* renamed from: c */
    private void m242462c(TextView textView, MsgWithUrlInfo bVar) {
        SpannableString spannableString;
        int i;
        int i2;
        SpannableString spannableString2;
        TextView textView2;
        Context context = textView.getContext();
        String a = bVar.mo209955a();
        String str = bVar.mo209956b().get(0);
        String str2 = bVar.mo209956b().get(1);
        SpannableString spannableString3 = new SpannableString(a);
        SpannableString spannableString4 = new SpannableString(a);
        Pattern compile = Pattern.compile("@@.*?@@");
        Matcher matcher = compile.matcher(a);
        if (matcher.find()) {
            String group = matcher.group();
            String substring = a.substring(matcher.start() + 2, matcher.end() - 2);
            String replace = a.replace(group, substring);
            int start = matcher.start();
            int length = start + substring.length();
            spannableString = spannableString4;
            spannableString3 = new SpannableString(replace);
            spannableString3.setSpan(new C62060a(str, bVar.mo209957c(), bVar.mo209958d(), "", m242460a(context)), start, length, 33);
            i2 = start;
            i = length;
            a = replace;
        } else {
            spannableString = spannableString4;
            i2 = 0;
            i = 0;
        }
        Matcher matcher2 = compile.matcher(spannableString3);
        if (matcher2.find()) {
            String group2 = matcher2.group();
            String substring2 = a.substring(matcher2.start() + 2, matcher2.end() - 2);
            String replace2 = a.replace(group2, substring2);
            int start2 = matcher2.start();
            spannableString2 = new SpannableString(replace2);
            spannableString2.setSpan(new C62060a(str, bVar.mo209957c(), bVar.mo209958d(), "", m242460a(context)), i2, i, 33);
            spannableString2.setSpan(new C62060a(str2, bVar.mo209957c(), bVar.mo209959e(), "", m242460a(context)), start2, start2 + substring2.length(), 33);
            textView2 = textView;
        } else {
            textView2 = textView;
            spannableString2 = spannableString;
        }
        textView2.setText(spannableString2);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setHighlightColor(0);
    }
}
