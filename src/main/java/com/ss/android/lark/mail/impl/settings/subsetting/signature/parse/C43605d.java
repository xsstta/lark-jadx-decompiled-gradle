package com.ss.android.lark.mail.impl.settings.subsetting.signature.parse;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.MailEntSignature;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.parse.d */
public class C43605d {
    /* renamed from: a */
    public String mo155612a(final List<MailEntSignature> list, final boolean z) {
        Log.m165389i("MailSignatureParseHelper", "handleHtml start");
        FutureTask futureTask = new FutureTask(new Callable<String>() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.parse.C43605d.CallableC436061 */

            /* renamed from: a */
            public String call() throws Exception {
                String str = null;
                try {
                    Log.m165389i("MailSignatureParseHelper", "MailContentSegmentHandler start");
                    str = new C43600b(z).mo155606a(list);
                    Log.m165389i("MailSignatureParseHelper", "MailContentSegmentHandler end");
                    return str;
                } catch (Throwable th) {
                    Log.m165389i("MailSignatureParseHelper", "TemplateParseError 11 e:" + th.getMessage());
                    Log.m165387e("TemplateParseError", th, true);
                    return str;
                }
            }
        });
        CoreThreadPool.getDefault().getFixedThreadPool().execute(futureTask);
        final C43603c cVar = new C43603c();
        FutureTask futureTask2 = new FutureTask(new Callable<String>() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.parse.C43605d.CallableC436072 */

            /* renamed from: a */
            public String call() throws Exception {
                String str = null;
                try {
                    Log.m165389i("MailSignatureParseHelper", "MailHtmlSegmentHandler start");
                    str = cVar.mo155611a(list);
                    Log.m165389i("MailSignatureParseHelper", "MailHtmlSegmentHandler end");
                    return str;
                } catch (Throwable th) {
                    Log.m165389i("MailSignatureParseHelper", "TemplateParseError 22 e:" + th.getMessage());
                    Log.m165387e("TemplateParseError", th, true);
                    return str;
                }
            }
        });
        CoreThreadPool.getDefault().getFixedThreadPool().execute(futureTask2);
        String str = null;
        try {
            str = cVar.mo155609a((String) futureTask2.get(), (String) futureTask.get()).replace("<table", "<div class='mTableArea'><table").replace("/table>", "/table></div>");
        } catch (Throwable th) {
            Log.m165389i("MailSignatureParseHelper", "TemplateParseError 33 e:" + th.getMessage());
            Log.m165387e("TemplateParseError", th, true);
        }
        Log.m165389i("MailSignatureParseHelper", "handleHtml end");
        return str;
    }
}
