package com.ss.android.lark.mail.impl.message.template;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.C42097j;
import com.ss.android.lark.mail.impl.entity.C42104p;
import com.ss.android.lark.mail.impl.message.p2203c.C42844a;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.ss.android.lark.mail.impl.message.template.v */
public class C43081v {
    /* renamed from: a */
    public String mo154263a(final List<C42097j> list, boolean z, final C42104p pVar, final String str, C42844a aVar, int i) {
        String str2;
        Log.m165389i("MailTemplateParseHelper", "handleHtml start");
        FutureTask futureTask = new FutureTask(new Callable<String>() {
            /* class com.ss.android.lark.mail.impl.message.template.C43081v.CallableC430821 */

            /* renamed from: a */
            public String call() throws Exception {
                String str = null;
                try {
                    Log.m165389i("MailTemplateParseHelper", "MailContentSegmentHandler start");
                    str = new C43067o(pVar, str).mo154248a(list);
                    Log.m165389i("MailTemplateParseHelper", "MailContentSegmentHandler end");
                    return str;
                } catch (Throwable th) {
                    Log.m165389i("MailTemplateParseHelper", "TemplateParseError 11 e:" + th.getMessage());
                    Log.m165387e("TemplateParseError", th, true);
                    return str;
                }
            }
        });
        CoreThreadPool.getDefault().getFixedThreadPool().execute(futureTask);
        final C43073q qVar = new C43073q(z, pVar, str, aVar, aVar.mo153784a(), i);
        FutureTask futureTask2 = new FutureTask(new Callable<String>() {
            /* class com.ss.android.lark.mail.impl.message.template.C43081v.CallableC430832 */

            /* renamed from: a */
            public String call() throws Exception {
                String str = null;
                try {
                    Log.m165389i("MailTemplateParseHelper", "MailHtmlSegmentHandler start");
                    str = qVar.mo154255a(list);
                    Log.m165389i("MailTemplateParseHelper", "MailHtmlSegmentHandler end");
                    return str;
                } catch (Throwable th) {
                    Log.m165389i("MailTemplateParseHelper", "TemplateParseError 22 e:" + th.getMessage());
                    Log.m165387e("TemplateParseError", th, true);
                    return str;
                }
            }
        });
        CoreThreadPool.getDefault().getFixedThreadPool().execute(futureTask2);
        String str3 = null;
        try {
            str3 = qVar.mo154253a((String) futureTask2.get(), (String) futureTask.get()).replace("<table", "<div class='mTableArea'><table");
            str2 = str3.replace("/table>", "/table></div>");
        } catch (Throwable th) {
            Log.m165389i("MailTemplateParseHelper", "TemplateParseError 33 e:" + th.getMessage());
            Log.m165387e("TemplateParseError", th, true);
            str2 = str3;
        }
        Log.m165389i("MailTemplateParseHelper", "handleHtml end");
        return str2;
    }
}
