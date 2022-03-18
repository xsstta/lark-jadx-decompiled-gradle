package com.ss.android.lark.passport.infra.util;

import android.app.Activity;
import android.os.Build;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ICommonService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49146ab;
import com.ss.android.lark.passport.infra.widget.p2444b.C49249b;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import java.net.URL;

/* renamed from: com.ss.android.lark.passport.infra.util.y */
public class C49226y {

    /* renamed from: com.ss.android.lark.passport.infra.util.y$a */
    public interface AbstractC49228a {

        /* renamed from: com.ss.android.lark.passport.infra.util.y$a$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static boolean $default$a(AbstractC49228a aVar, TextPaint textPaint) {
                return false;
            }
        }

        /* renamed from: a */
        boolean mo171752a(TextPaint textPaint);

        /* renamed from: a */
        boolean mo171753a(String str);
    }

    /* renamed from: a */
    public static Spanned m194059a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, 63);
        }
        return Html.fromHtml(str);
    }

    /* renamed from: a */
    public static void m194064a(String str, String str2) {
        ICommonService c = ServiceFinder.m193748c();
        if (c != null) {
            c.statistics("passport_click_link", new C49146ab.C49147a().mo171628a("from", str).mo171628a("url", str2).mo171629a());
        }
    }

    /* renamed from: a */
    public static void m194063a(Activity activity, String str, PassportLog passportLog) {
        String str2;
        if (activity != null && (activity instanceof BaseActivity)) {
            RouterAnno routerAnno = (RouterAnno) activity.getClass().getAnnotation(RouterAnno.class);
            if (routerAnno != null) {
                str2 = routerAnno.teaName();
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                m194064a(str2, str);
            } else {
                passportLog.mo171471d("RichTextUtil", "activity not contain from name");
            }
        }
    }

    /* renamed from: a */
    public static void m194061a(Activity activity, TextView textView, String str, JSONObject jSONObject, PassportLog passportLog) {
        m194062a(activity, textView, str, jSONObject, (UniContext) null, passportLog, (AbstractC49228a) null);
    }

    /* renamed from: a */
    public static void m194060a(final Activity activity, SpannableStringBuilder spannableStringBuilder, final URLSpan uRLSpan, final JSONObject jSONObject, final UniContext uniContext, final PassportLog passportLog, final AbstractC49228a aVar) {
        int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
        int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
        int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
        spannableStringBuilder.removeSpan(uRLSpan);
        spannableStringBuilder.setSpan(new C49249b(activity, new C49249b.AbstractView$OnClickListenerC49250a() {
            /* class com.ss.android.lark.passport.infra.util.C49226y.C492271 */

            @Override // com.ss.android.lark.passport.infra.widget.p2444b.C49249b.AbstractView$OnClickListenerC49250a
            /* renamed from: a */
            public boolean mo171692a(TextPaint textPaint) {
                AbstractC49228a aVar = aVar;
                if (aVar == null || !aVar.mo171752a(textPaint)) {
                    return false;
                }
                return true;
            }

            public void onClick(View view) {
                AbstractC49228a aVar = aVar;
                if (aVar == null || !aVar.mo171753a(uRLSpan.getURL())) {
                    try {
                        PassportLog passportLog = passportLog;
                        passportLog.mo171465b("RichTextUtil", "url: " + uRLSpan.getURL());
                        String host = new URL(uRLSpan.getURL()).getHost();
                        JSONObject jSONObject = jSONObject;
                        if (jSONObject == null || !jSONObject.containsKey(host)) {
                            JSONObject jSONObject2 = jSONObject;
                            if (jSONObject2 == null || !host.equals(jSONObject2.getString("next_step"))) {
                                JSONObject jSONObject3 = jSONObject;
                                if (jSONObject3 != null && !TextUtils.isEmpty(jSONObject3.getString("next_step"))) {
                                    C49092f.m193532a(activity, jSONObject.getString("next_step"), jSONObject.getJSONObject("step_info"), RouterScene.ALL.value, uniContext, (PassportLog) null, (AbstractC49336a) null);
                                    return;
                                }
                                if (!TextUtils.isEmpty(uRLSpan.getURL())) {
                                    C49226y.m194063a(activity, uRLSpan.getURL(), passportLog);
                                    C49157ai.m193846a(activity, uRLSpan.getURL());
                                    return;
                                }
                                passportLog.mo171471d("RichTextUtil", "subtitleLinkText href is empty");
                                return;
                            }
                            C49092f.m193532a(activity, host, jSONObject.getJSONObject("step_info"), RouterScene.ALL.value, uniContext, (PassportLog) null, (AbstractC49336a) null);
                            return;
                        }
                        C49092f.m193532a(activity, host, (JSONObject) jSONObject.get(host), RouterScene.ALL.value, uniContext, (PassportLog) null, (AbstractC49336a) null);
                    } catch (Exception e) {
                        e.printStackTrace();
                        PassportLog passportLog2 = passportLog;
                        passportLog2.mo171471d("RichTextUtil", "error " + e.getMessage());
                    }
                }
            }
        }), spanStart, spanEnd, spanFlags);
    }

    /* renamed from: a */
    public static void m194062a(Activity activity, TextView textView, String str, JSONObject jSONObject, UniContext uniContext, PassportLog passportLog, AbstractC49228a aVar) {
        Spanned spanned;
        if (!TextUtils.isEmpty(str)) {
            String a = C49208s.m193982a(str, "span", activity);
            if (Build.VERSION.SDK_INT >= 24) {
                spanned = Html.fromHtml(a, 63);
            } else {
                spanned = Html.fromHtml(a);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spanned);
            for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spanned.length(), URLSpan.class)) {
                m194060a(activity, spannableStringBuilder, uRLSpan, jSONObject, uniContext, passportLog, aVar);
            }
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(0);
        }
    }
}
