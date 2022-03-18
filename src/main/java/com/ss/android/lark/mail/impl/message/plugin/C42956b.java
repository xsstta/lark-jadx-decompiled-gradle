package com.ss.android.lark.mail.impl.message.plugin;

import android.app.Activity;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.message.plugin.AbstractC42954a;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.utils.C43752b;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.recipient.C43800a;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.mail.impl.view.p2225a.C43909a;
import java.net.URLDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.lark.mail.impl.message.plugin.b */
public class C42956b extends AbstractC42954a {

    /* renamed from: e */
    private static final Pattern f109391e = Pattern.compile("mailto:(.*?)\\?(.*?)\\?source=larkmail_at");

    /* renamed from: c */
    public C43909a f109392c;

    /* renamed from: d */
    private final String f109393d = "MentionHandler";

    /* renamed from: a */
    public void mo154075a() {
        MailToast.m173697a((int) R.string.Mail_Normal_Failed);
    }

    /* renamed from: a */
    public boolean mo154076a(String str) {
        Log.m165389i("MentionHandler", "tryToShowMentionedUserInfo");
        if (!C43752b.m173436b(this.f109389a)) {
            Log.m165397w("MentionHandler", "tryToShowMentionedUserInfo activity not available");
            return false;
        }
        Matcher matcher = f109391e.matcher(URLDecoder.decode(str));
        if (matcher.find()) {
            try {
                m171028a(matcher.group(1), matcher.group(2), this.f109389a);
                return true;
            } catch (Exception e) {
                Log.m165384e("MentionHandler", "tryToShowMentionedUserInfo", e);
            }
        }
        return false;
    }

    public C42956b(Activity activity, AbstractC42954a.AbstractC42955a aVar) {
        super(activity, aVar);
    }

    /* renamed from: a */
    private void m171028a(String str, String str2, final Activity activity) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Log.m165383e("MentionHandler", "showMentionedUserInfo empty address or name");
            return;
        }
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.plugin.C42956b.RunnableC429571 */

            public void run() {
                if (C42956b.this.f109392c == null) {
                    C42956b.this.f109392c = new C43909a(activity);
                }
                C42956b.this.f109392c.mo156327a(C43819s.m173684a((int) R.string.Mail_Normal_Loading));
            }
        });
        C43800a.m173635a().mo156044a(str, str2, new AbstractC41870b<MailAddress>() {
            /* class com.ss.android.lark.mail.impl.message.plugin.C42956b.C429582 */

            @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
            /* renamed from: a */
            public void mo150434a(ErrorResult errorResult) {
                Log.m165389i("MentionHandler", "searchAddressAndOpenProfile onError");
                if (C42956b.this.f109392c != null) {
                    C42956b.this.f109392c.mo156326a();
                }
                C42956b.this.mo154075a();
            }

            /* renamed from: a */
            public void mo150435a(MailAddress mailAddress) {
                if (C42956b.this.f109392c != null) {
                    C42956b.this.f109392c.mo156326a();
                }
                if (mailAddress == null || TextUtils.isEmpty(mailAddress.mo151189j())) {
                    Log.m165397w("MentionHandler", "searchAddressAndOpenProfile onSuccess no user ID");
                    C42956b.this.mo154075a();
                    return;
                }
                C41816b.m166115a().mo150157x().mo150164a(mailAddress.mo151196q(), mailAddress.mo151189j(), mailAddress.mo151182e(), mailAddress.mo151176a());
            }
        });
    }
}
