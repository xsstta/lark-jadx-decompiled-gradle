package com.ss.android.lark.mail.impl.message.plugin.translation;

import android.app.Activity;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.bytedance.lark.pb.email.client.v1.MailTranslateMessagesResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.message.p2204d.C42871i;
import com.ss.android.lark.mail.impl.message.plugin.AbstractC42954a;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.C43853v;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.mail.impl.view.dialog.C43939b;
import com.ss.android.lark.mail.impl.view.dialog.C43943c;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.message.plugin.translation.c */
public class C42972c extends AbstractC42954a {

    /* renamed from: c */
    public List<Language> f109423c;

    /* renamed from: d */
    public final HashMap<String, C42971b> f109424d = new HashMap<>();

    /* renamed from: e */
    ArrayList<C42970a> f109425e;

    /* renamed from: f */
    private final String f109426f = "TranslationHandler";

    /* renamed from: g */
    private boolean f109427g;

    /* renamed from: a */
    public void mo154122a(boolean z, List<MailMessage> list) {
        if (!CollectionUtils.isEmpty(list)) {
            for (MailMessage mailMessage : list) {
                if (mailMessage != null && !TextUtils.isEmpty(mailMessage.mo151581b())) {
                    mo154121a(z, mailMessage.mo151581b());
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo154124a(MailTranslateMessagesResponse.TranslateMessageInfo translateMessageInfo, String str) {
        if (!CollectionUtils.isNotEmpty(translateMessageInfo.source_languages)) {
            return true;
        }
        String str2 = translateMessageInfo.source_languages.get(0);
        if (TextUtils.isEmpty(str2) || !str2.equals(str)) {
            return true;
        }
        Log.m165397w("TranslationHandler", "checkAutoTranslationResult same language");
        return false;
    }

    /* renamed from: a */
    public boolean mo154123a() {
        return this.f109427g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.message.plugin.translation.c$7 */
    public static /* synthetic */ class C429807 {

        /* renamed from: a */
        static final /* synthetic */ int[] f109455a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.bytedance.lark.pb.email.client.v1.MailTranslateMessagesResponse$TranslateResult[] r0 = com.bytedance.lark.pb.email.client.v1.MailTranslateMessagesResponse.TranslateResult.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.message.plugin.translation.C42972c.C429807.f109455a = r0
                com.bytedance.lark.pb.email.client.v1.MailTranslateMessagesResponse$TranslateResult r1 = com.bytedance.lark.pb.email.client.v1.MailTranslateMessagesResponse.TranslateResult.SUCCEED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.message.plugin.translation.C42972c.C429807.f109455a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.lark.pb.email.client.v1.MailTranslateMessagesResponse$TranslateResult r1 = com.bytedance.lark.pb.email.client.v1.MailTranslateMessagesResponse.TranslateResult.SAME_LANGUAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.mail.impl.message.plugin.translation.C42972c.C429807.f109455a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.lark.pb.email.client.v1.MailTranslateMessagesResponse$TranslateResult r1 = com.bytedance.lark.pb.email.client.v1.MailTranslateMessagesResponse.TranslateResult.NOT_SUPPORT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.mail.impl.message.plugin.translation.C42972c.C429807.f109455a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.lark.pb.email.client.v1.MailTranslateMessagesResponse$TranslateResult r1 = com.bytedance.lark.pb.email.client.v1.MailTranslateMessagesResponse.TranslateResult.BLOB_DETECTED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.mail.impl.message.plugin.translation.C42972c.C429807.f109455a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.bytedance.lark.pb.email.client.v1.MailTranslateMessagesResponse$TranslateResult r1 = com.bytedance.lark.pb.email.client.v1.MailTranslateMessagesResponse.TranslateResult.PARTIAL_SUPPORT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.message.plugin.translation.C42972c.C429807.<clinit>():void");
        }
    }

    /* renamed from: b */
    private void m171064b() {
        if (!CollectionUtils.isNotEmpty(this.f109423c) || !CollectionUtils.isNotEmpty(this.f109425e)) {
            Log.m165389i("TranslationHandler", "obtainLanguageList run");
            List<Language> i = C43853v.m173851i();
            this.f109423c = i;
            if (CollectionUtils.isNotEmpty(i)) {
                this.f109425e = new ArrayList<>();
                for (Language language : this.f109423c) {
                    if (language != null) {
                        this.f109425e.add(new C42970a(language.mo154094b(), language.mo154093a()));
                    }
                }
                return;
            }
            Log.m165397w("TranslationHandler", "obtainLanguageList nothing");
        }
    }

    /* renamed from: a */
    public void mo154120a(boolean z) {
        this.f109427g = z;
    }

    /* renamed from: a */
    public void mo154112a(final String str) {
        Log.m165389i("TranslationHandler", "turnOffTranslation");
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.plugin.translation.C42972c.RunnableC429774 */

            public void run() {
                try {
                    C42972c.this.f109390b.mo154072a("dismissTranslation", str);
                    if (C42871i.m170779b()) {
                        C42972c.this.f109390b.mo154070a();
                    }
                } catch (Exception e) {
                    Log.m165384e("TranslationHandler", "turnOffTranslation", e);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo154125b(String str) {
        MailToast.m173700a(C43819s.m173684a((int) R.string.Mail_Translations_Networkerror));
        C42209j.m168612a("read_mail_translations_network_error", "toast");
        C42971b bVar = this.f109424d.get(str);
        if (bVar != null) {
            mo154117a(str, bVar.mo154105b(), bVar.mo154101a().mo154094b(), true, bVar.mo154107c(), bVar.mo154109d(), bVar.mo154110e());
        }
    }

    /* renamed from: a */
    public void mo154113a(String str, MailMessage mailMessage) {
        mo154115a(str, mailMessage, "");
    }

    /* renamed from: b */
    public void mo154126b(String str, MailMessage mailMessage) {
        mo154127b(str, mailMessage, null);
    }

    public C42972c(Activity activity, AbstractC42954a.AbstractC42955a aVar) {
        super(activity, aVar);
        m171064b();
    }

    /* renamed from: a */
    public void mo154118a(String str, List<MailMessage> list) {
        mo154119a(str, list, (String) null);
    }

    /* renamed from: a */
    public void mo154121a(final boolean z, final String str) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.plugin.translation.C42972c.RunnableC429796 */

            public void run() {
                try {
                    C42972c.this.f109390b.mo154074a("toggleTranslationLoading", str, Boolean.toString(z));
                } catch (Exception e) {
                    Log.m165384e("TranslationHandler", "toggleLoading", e);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo154115a(String str, MailMessage mailMessage, String str2) {
        if (TextUtils.isEmpty(str) || mailMessage == null || TextUtils.isEmpty(mailMessage.mo151581b())) {
            Log.m165383e("TranslationHandler", "translateMessage invalid parameter");
            return;
        }
        C42971b bVar = this.f109424d.get(mailMessage.mo151581b());
        if (bVar == null) {
            mo154114a(str, mailMessage, C43853v.m173847e(), str2);
        } else {
            mo154114a(str, mailMessage, bVar.mo154101a(), str2);
        }
    }

    /* renamed from: a */
    public C42971b mo154111a(MailMessage mailMessage, MailTranslateMessagesResponse.TranslateMessageInfo translateMessageInfo, Language language) {
        if (mailMessage == null || translateMessageInfo == null || language == null || TextUtils.isEmpty(translateMessageInfo.message_id) || !translateMessageInfo.message_id.equals(mailMessage.mo151581b())) {
            Log.m165383e("TranslationHandler", "updateTranslationCache invalid param");
            return null;
        }
        String b = mailMessage.mo151581b();
        C42971b bVar = this.f109424d.get(b);
        if (bVar == null) {
            bVar = new C42971b();
            this.f109424d.put(b, bVar);
        }
        bVar.mo154102a(language);
        bVar.mo154106b(translateMessageInfo.translated_subject);
        bVar.mo154108c(translateMessageInfo.translated_body_plain_text);
        bVar.mo154104a(translateMessageInfo.show_original_text.booleanValue());
        String replace = translateMessageInfo.translated_body.replace("<table", "<div class='mTableArea'><table").replace("/table>", "/table></div>");
        if (mailMessage.mo151550C()) {
            replace = "<!--" + replace + "-->";
        }
        bVar.mo154103a(replace);
        return bVar;
    }

    /* renamed from: b */
    public void mo154127b(final String str, final MailMessage mailMessage, final String str2) {
        Log.m165389i("TranslationHandler", "showLanguageSelectionDialog");
        if (mailMessage == null || TextUtils.isEmpty(mailMessage.mo151581b())) {
            Log.m165383e("TranslationHandler", "showLanguageSelectionDialog invalid message");
            return;
        }
        m171064b();
        if (CollectionUtils.isEmpty(this.f109423c)) {
            Log.m165383e("TranslationHandler", "showLanguageSelectionDialog invalid language list");
        } else if (CollectionUtils.isEmpty(this.f109425e)) {
            Log.m165383e("TranslationHandler", "showLanguageSelectionDialog invalid item list");
        } else {
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.message.plugin.translation.C42972c.RunnableC429753 */

                public void run() {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < C42972c.this.f109425e.size(); i++) {
                        C42970a aVar = C42972c.this.f109425e.get(i);
                        final Language language = C42972c.this.f109423c.get(i);
                        if (aVar != null) {
                            arrayList.add(new C43943c.C43945a(aVar.mo89285a().toString(), new Runnable() {
                                /* class com.ss.android.lark.mail.impl.message.plugin.translation.C42972c.RunnableC429753.RunnableC429761 */

                                public void run() {
                                    if (language == null) {
                                        Log.m165383e("TranslationHandler", "showLanguageSelectionDialog invalid language");
                                        return;
                                    }
                                    C42972c.this.mo154114a(str, mailMessage, language, str2);
                                    C42187a.m168556m(str, mailMessage.mo151581b(), language.mo154093a());
                                }
                            }, false));
                        }
                    }
                    C43939b.m174083b(new C43939b.C43942a(C42972c.this.f109389a).mo156385a(arrayList).mo156384a(UIHelper.getString(R.string.Mail_Translate_SelectTranslateLanguage)));
                }
            });
        }
    }

    /* renamed from: a */
    public void mo154119a(String str, List<MailMessage> list, String str2) {
        Log.m165389i("TranslationHandler", "autoTranslateMessageList");
        if (!C43853v.m173849g()) {
            Log.m165389i("TranslationHandler", "autoTranslateMessageList fg abort");
            return;
        }
        final List<MailMessage> c = C43853v.m173844c(list);
        if (CollectionUtils.isEmpty(c)) {
            Log.m165389i("TranslationHandler", "autoTranslateMessageList all messages filtered");
            return;
        }
        final HashMap hashMap = new HashMap();
        for (MailMessage mailMessage : c) {
            if (mailMessage != null) {
                hashMap.put(mailMessage.mo151581b(), mailMessage);
                mo154121a(true, mailMessage.mo151581b());
            }
        }
        C42187a.m168570t(str);
        final Language e = C43853v.m173847e();
        C42176e.m168344a().mo152219a(str, c, e.mo154093a(), true, false, str2, (IGetDataCallback<MailTranslateMessagesResponse>) new IGetDataCallback<MailTranslateMessagesResponse>() {
            /* class com.ss.android.lark.mail.impl.message.plugin.translation.C42972c.C429742 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("TranslationHandler", "autoTranslateMessageList onError");
                C42972c.this.mo154122a(false, c);
            }

            /* renamed from: a */
            public void onSuccess(MailTranslateMessagesResponse mailTranslateMessagesResponse) {
                Log.m165389i("TranslationHandler", "autoTranslateMessageList onSuccess");
                C42972c.this.mo154122a(false, c);
                if (mailTranslateMessagesResponse == null || CollectionUtils.isEmpty(mailTranslateMessagesResponse.messages)) {
                    Log.m165383e("TranslationHandler", "autoTranslateMessageList onSuccess empty data");
                    return;
                }
                for (MailTranslateMessagesResponse.TranslateMessageInfo translateMessageInfo : mailTranslateMessagesResponse.messages) {
                    if (translateMessageInfo == null || translateMessageInfo.result == null) {
                        Log.m165383e("TranslationHandler", "autoTranslateMessageList invalid info");
                    } else {
                        int i = C429807.f109455a[translateMessageInfo.result.ordinal()];
                        if (i != 1 && i != 5) {
                            Log.m165389i("TranslationHandler", "autoTranslateMessageList switch to default");
                        } else if (C42972c.this.mo154124a(translateMessageInfo, e.mo154093a())) {
                            String str = translateMessageInfo.message_id;
                            if (!TextUtils.isEmpty(str)) {
                                C42971b a = C42972c.this.mo154111a((MailMessage) hashMap.get(str), translateMessageInfo, e);
                                if (a == null) {
                                    Log.m165383e("TranslationHandler", "autoTranslateMessageList onSuccess empty translation");
                                } else {
                                    C42972c.this.mo154117a(str, a.mo154105b(), e.mo154094b(), true, a.mo154107c(), a.mo154109d(), !a.mo154110e());
                                }
                            }
                        }
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo154114a(String str, final MailMessage mailMessage, final Language language, String str2) {
        Log.m165389i("TranslationHandler", "translateMessage");
        final String b = mailMessage.mo151581b();
        mo154121a(true, b);
        ArrayList arrayList = new ArrayList();
        arrayList.add(mailMessage);
        C42176e.m168344a().mo152219a(str, (List<MailMessage>) arrayList, language.mo154093a(), true, true, str2, (IGetDataCallback<MailTranslateMessagesResponse>) new IGetDataCallback<MailTranslateMessagesResponse>() {
            /* class com.ss.android.lark.mail.impl.message.plugin.translation.C42972c.C429731 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("TranslationHandler", "translateMessage onError");
                C42972c.this.mo154121a(false, b);
                C42972c.this.mo154125b(b);
            }

            /* JADX WARNING: Removed duplicated region for block: B:27:0x00b7 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:28:0x00b8  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onSuccess(com.bytedance.lark.pb.email.client.v1.MailTranslateMessagesResponse r10) {
                /*
                // Method dump skipped, instructions count: 257
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.message.plugin.translation.C42972c.C429731.onSuccess(com.bytedance.lark.pb.email.client.v1.MailTranslateMessagesResponse):void");
            }
        });
    }

    /* renamed from: a */
    public void mo154116a(String str, String str2, String str3, String str4) {
        Log.m165389i("TranslationHandler", "viewOriginal");
        C42971b bVar = this.f109424d.get(str);
        if (bVar == null) {
            Log.m165383e("TranslationHandler", "viewOriginal no setting");
        } else {
            mo154117a(str, str2, bVar.mo154101a().mo154094b(), false, str3, str4, false);
        }
    }

    /* renamed from: a */
    public void mo154117a(final String str, final String str2, final String str3, final boolean z, final String str4, final String str5, final boolean z2) {
        Log.m165389i("TranslationHandler", "updateTranslation");
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.plugin.translation.C42972c.RunnableC429785 */

            public void run() {
                try {
                    C42972c.this.f109390b.mo154071a("javascript:updateTranslation(`" + str + "`, " + z + ", `" + str4 + "`, `" + str5 + "`, `" + str2 + "`, `" + str3 + "`, " + z2 + ")", (ValueCallback<String>) null);
                } catch (Exception e) {
                    Log.m165384e("TranslationHandler", "TRANSLATE", e);
                }
                if (C42871i.m170779b()) {
                    C42972c.this.f109390b.mo154073a(str4, z, C43853v.m173848f());
                }
            }
        });
    }
}
