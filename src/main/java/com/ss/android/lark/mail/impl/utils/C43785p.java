package com.ss.android.lark.mail.impl.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.AddressType;
import com.ss.android.lark.mail.impl.entity.C42093e;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.message.template.C43089z;
import com.ss.android.lark.mail.impl.service.C43277a;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/* renamed from: com.ss.android.lark.mail.impl.utils.p */
public class C43785p {

    /* renamed from: a */
    private static String f111082a;

    /* renamed from: a */
    public static boolean m173542a(List<String> list, List<MailAddress> list2) {
        if (list.isEmpty() || CollectionUtils.isEmpty(list2)) {
            return false;
        }
        for (int i = 0; i < list2.size(); i++) {
            String c = m173547c(list2.get(i).mo151182e());
            if (!(c == null || list.contains(c))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m173541a(List<String> list, MailAddress mailAddress) {
        if (list.isEmpty() || mailAddress == null) {
            return false;
        }
        String c = m173547c(mailAddress.mo151182e());
        if (c == null || list.contains(c)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m173543a(boolean z, AddressType addressType, String str, final String str2, final String str3, final String str4) {
        if (!z || TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str) || (AddressType.UNKNOWN != addressType && AddressType.USER != addressType)) {
            return C41816b.m166115a().mo150157x().mo150164a(str, str2, str3, str4);
        }
        CoreThreadPool.getBackgroundHandler().post(new Runnable() {
            /* class com.ss.android.lark.mail.impl.utils.C43785p.RunnableC437861 */

            public void run() {
                final String str;
                MailAddress a = C41816b.m166115a().mo150115E().mo150184a(str2);
                if (a != null) {
                    str = a.mo151196q();
                } else {
                    str = "";
                }
                C43849u.m173826a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.utils.C43785p.RunnableC437861.RunnableC437871 */

                    public void run() {
                        C41816b.m166115a().mo150157x().mo150164a(str, str2, str3, str4);
                    }
                });
            }
        });
        return true;
    }

    /* renamed from: a */
    public static Locale m173540a(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            return Locale.forLanguageTag(str);
        }
        if (z) {
            return Locale.forLanguageTag("en-US");
        }
        return C41816b.m166115a().mo150146m();
    }

    /* renamed from: b */
    public static boolean m173545b() {
        return new Locale("en").getLanguage().equals(C41816b.m166115a().mo150146m().getLanguage());
    }

    /* renamed from: c */
    public static boolean m173548c() {
        Log.m165389i("MailUtils", "useEnString");
        Locale m = C41816b.m166115a().mo150146m();
        if (m == null) {
            return false;
        }
        String displayCountry = m.getDisplayCountry();
        if (!TextUtils.isEmpty(displayCountry) && displayCountry.equals(Locale.CHINA.getDisplayCountry())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m173536a() {
        String[] split = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".split("");
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 36; i++) {
            if (i == 8 || i == 18 || i == 23 || i == 13) {
                sb.append("-");
            } else if (i != 14) {
                int nextInt = random.nextInt(16);
                if (i == 19) {
                    nextInt = (nextInt & 3) | 8;
                }
                sb.append(split[nextInt]);
            } else {
                sb.append("4");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m173538a(String str) {
        return m173539a(str, "");
    }

    /* renamed from: e */
    public static Locale m173550e(String str) {
        return m173540a(str, false);
    }

    /* renamed from: a */
    public static int m173533a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        return displayMetrics.widthPixels;
    }

    /* renamed from: a */
    public static int m173530a(int i) {
        return (int) ((((float) i) * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    public static String m173544b(String str) {
        String d = C26311p.m95284d(str);
        if (!TextUtils.isEmpty(d)) {
            return d.toUpperCase();
        }
        if (f111082a == null) {
            f111082a = C43819s.m173684a((int) R.string.Mail_Attachment_UnknownType);
        }
        return f111082a;
    }

    /* renamed from: c */
    public static String m173547c(String str) {
        String[] split;
        if (!TextUtils.isEmpty(str) && (split = str.split("@")) != null && split.length == 2) {
            return split[1];
        }
        return null;
    }

    /* renamed from: d */
    public static String m173549d(String str) {
        return "<svg width=\"12px\" height=\"12px\" viewBox=\"0 0 24 24\" style=\"position: relative;bottom:-0.5px;margin: 0px 3px 0px 0px;\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><g id=\"mail_g_1\" stroke=\"none\" stroke-width=\"1\" fill=\"none\" fill-rule=\"evenodd\"><g id=\"mail_g_2\" transform=\"translate(-403.000000, -50.000000)\" fill=\"" + str + "\" fill-rule=\"nonzero\"><g id=\"mail_g_3\" transform=\"translate(403.000000, 50.000000)\"><path d=\"M12,0 C18.627417,0 24,5.372583 24,12 C24,18.627417 18.627417,24 12,24 C5.372583,24 0,18.627417 0,12 C0,5.372583 5.372583,0 12,0 Z M12,4 C7.58172739,4 4,7.58173034 4,12 C4,16.4182697 7.58172739,20 12,20 C16.4182725,20 20,16.4182697 20,12 C20,11.5021789 19.9538801,11.0053836 19.8620143,10.5157528 L19.8620143,10.5157528 L19.8490674,10.5157528 L19.8622668,10.4719101 L12.1721664,10.4719101 L12.1721664,13.5955056 L16.3920803,13.5955056 C15.7403271,15.3913258 14.0199483,16.6741573 12,16.6741573 C9.42002867,16.6741573 7.32855092,14.5814607 7.32855092,12 C7.32855092,9.41853933 9.42002867,7.3258427 12,7.3258427 C13.1082916,7.32579165 14.1792238,7.71804962 15.0152769,8.43026966 L15.0152769,8.43026966 L17.3989555,6.09680899 C15.9758966,4.79467416 14.0808723,4 12,4 Z\" id=\"icon_label_GinCircle\"></path></g></g></g></svg>";
    }

    /* renamed from: b */
    public static boolean m173546b(Context context) {
        if (!(context instanceof Activity)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 17) {
            return !((Activity) context).isFinishing();
        }
        Activity activity = (Activity) context;
        if (activity.isDestroyed() || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static int m173534a(List list) {
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: a */
    public static String m173537a(AddressType addressType) {
        if (addressType == AddressType.ENTERPRISE_MAIL_GROUP) {
            return C43089z.m171291a().mo154272a("address-mail-list-icon");
        }
        if (addressType == AddressType.GROUP) {
            return C43089z.m171291a().mo154272a("address-group-icon");
        }
        return "";
    }

    /* renamed from: a */
    public static int m173531a(long j, long j2) {
        boolean a = C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.largefile.phase2");
        if (j <= 26214400 - j2) {
            return 1;
        }
        if (a) {
            return 2;
        }
        return 0;
    }

    /* renamed from: a */
    public static String m173539a(String str, String str2) {
        C42093e eVar;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (TextUtils.isEmpty(str2)) {
            eVar = C43277a.m171921a().mo154948l();
        } else {
            eVar = C43277a.m171921a().mo154926a(str2);
        }
        if (eVar == null || !eVar.mo151858f()) {
            return C41816b.m166115a().mo150139f();
        }
        return "shared_mailbox_" + eVar.mo151848b();
    }

    /* renamed from: a */
    public static int m173532a(long j, long j2, long j3) {
        long j4;
        boolean a = C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.largefile.phase2");
        if (a) {
            j4 = 3221225472L;
        } else {
            j4 = 26214400 - j3;
        }
        if (j <= j4) {
            return 0;
        }
        if (a) {
            return R.string.Mail_Attachment_FailedToSend;
        }
        return R.string.Mail_Attachment_OverLimit;
    }

    /* renamed from: a */
    public static int m173535a(List<MailAddress> list, List<MailAddress> list2, List<MailAddress> list3) {
        int i = 0;
        if (list != null) {
            for (MailAddress mailAddress : list) {
                i += mailAddress.mo151191l() ? 1 : 0;
            }
        }
        if (list2 != null) {
            for (MailAddress mailAddress2 : list2) {
                i += mailAddress2.mo151191l() ? 1 : 0;
            }
        }
        if (list3 != null) {
            for (MailAddress mailAddress3 : list3) {
                i += mailAddress3.mo151191l() ? 1 : 0;
            }
        }
        return i;
    }
}
