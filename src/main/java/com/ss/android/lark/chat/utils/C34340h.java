package com.ss.android.lark.chat.utils;

import android.text.TextUtils;
import com.larksuite.framework.utils.aj;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.dependency.AbstractC36510y;
import com.ss.android.lark.sdk.C53241h;
import java.util.Comparator;
import java.util.Locale;

/* renamed from: com.ss.android.lark.chat.utils.h */
public class C34340h {

    /* renamed from: a */
    public static AbstractC36510y f88674a = C29990c.m110930b().mo134587o();

    /* renamed from: a */
    private static boolean m133178a(char c) {
        if ('A' > c || c > 'Z') {
            return 'a' <= c && c <= 'z';
        }
        return true;
    }

    /* renamed from: a */
    public static Comparator<Chatter> m133177a() {
        return new Comparator<Chatter>() {
            /* class com.ss.android.lark.chat.utils.C34340h.C343411 */

            /* renamed from: a */
            Locale f88675a = C34340h.f88674a.mo134743b();

            /* renamed from: a */
            public int compare(Chatter chatter, Chatter chatter2) {
                String str;
                String str2;
                if (chatter.getLocalizedName() == null) {
                    str = chatter.getName();
                } else {
                    str = chatter.getLocalizedName();
                }
                if (chatter2.getLocalizedName() == null) {
                    str2 = chatter2.getName();
                } else {
                    str2 = chatter2.getLocalizedName();
                }
                if (Locale.CHINESE.getLanguage().equals(this.f88675a.getLanguage())) {
                    String namePy = chatter.getNamePy();
                    if (!TextUtils.isEmpty(namePy) && !namePy.equals("#")) {
                        str = namePy;
                    }
                    String namePy2 = chatter2.getNamePy();
                    if (!TextUtils.isEmpty(namePy2) && !namePy2.equals("#")) {
                        str2 = namePy2;
                    }
                }
                if (str.equalsIgnoreCase(str2)) {
                    return chatter.getId().compareTo(chatter2.getId());
                }
                return str.toUpperCase().compareTo(str2.toUpperCase());
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chat.utils.h$2 */
    public static /* synthetic */ class C343422 {

        /* renamed from: a */
        static final /* synthetic */ int[] f88676a;

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
                com.ss.android.lark.biz.im.api.ChatterNameDisplayRule[] r0 = com.ss.android.lark.biz.im.api.ChatterNameDisplayRule.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.chat.utils.C34340h.C343422.f88676a = r0
                com.ss.android.lark.biz.im.api.ChatterNameDisplayRule r1 = com.ss.android.lark.biz.im.api.ChatterNameDisplayRule.ALIAS_NAME     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.chat.utils.C34340h.C343422.f88676a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.biz.im.api.ChatterNameDisplayRule r1 = com.ss.android.lark.biz.im.api.ChatterNameDisplayRule.NICKNAME_NAME     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.chat.utils.C34340h.C343422.f88676a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.biz.im.api.ChatterNameDisplayRule r1 = com.ss.android.lark.biz.im.api.ChatterNameDisplayRule.ALIAS_NICKNAME_NAME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.chat.utils.C34340h.C343422.f88676a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.biz.im.api.ChatterNameDisplayRule r1 = com.ss.android.lark.biz.im.api.ChatterNameDisplayRule.NICKNAME_ALIAS_NAME     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.chat.utils.C34340h.C343422.f88676a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.biz.im.api.ChatterNameDisplayRule r1 = com.ss.android.lark.biz.im.api.ChatterNameDisplayRule.NICKNAME_WITH_ALIAS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.utils.C34340h.C343422.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static char m133172a(OpenChatter openChatter, Locale locale) {
        if (openChatter == null) {
            return '#';
        }
        return m133173a(openChatter.getName(), openChatter.getLocalizedName(), openChatter.getNamePy(), locale);
    }

    /* renamed from: a */
    public static String m133174a(OpenChatter openChatter, ChatterNameDisplayRule chatterNameDisplayRule) {
        if (openChatter == null) {
            return "";
        }
        String str = null;
        if (openChatter instanceof ChatChatter) {
            ChatChatter chatChatter = (ChatChatter) openChatter;
            if (chatChatter.isOncallDuty()) {
                return chatChatter.getName();
            }
            str = chatChatter.getNickName();
        }
        String alias = openChatter.getAlias();
        return m133176a(openChatter.getName(), openChatter.getEnName(), openChatter.getLocalizedName(), str, alias, chatterNameDisplayRule);
    }

    /* renamed from: a */
    public static String m133175a(String str, String str2) {
        Locale b = f88674a.mo134743b();
        if (b == null) {
            C53241h.m205894a("ChatterNameUtil", "getDisplayName failed: locale is null");
            return f88674a.mo134742a().getLanguage();
        } else if (!Locale.ENGLISH.getLanguage().equals(b.getLanguage()) || TextUtils.isEmpty(str2)) {
            return str;
        } else {
            return str2;
        }
    }

    /* renamed from: a */
    public static char m133173a(String str, String str2, String str3, Locale locale) {
        char c;
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
            return '#';
        }
        if (TextUtils.isEmpty(str2)) {
            c = str.charAt(0);
        } else {
            c = str2.charAt(0);
        }
        if (Locale.CHINESE.getLanguage().equals(locale.getLanguage()) && !TextUtils.isEmpty(str3)) {
            c = str3.charAt(0);
        }
        if (m133178a(c)) {
            return String.valueOf(c).toUpperCase().charAt(0);
        }
        return '#';
    }

    /* renamed from: a */
    public static String m133176a(String str, String str2, String str3, String str4, String str5, ChatterNameDisplayRule chatterNameDisplayRule) {
        String str6;
        int i = C343422.f88676a[chatterNameDisplayRule.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            if (!aj.m95021b(str4)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(str4);
                                if (!aj.m95021b(str5)) {
                                    str6 = String.format("(%s)", str5);
                                } else {
                                    str6 = "";
                                }
                                sb.append(str6);
                                return sb.toString();
                            } else if (!aj.m95021b(str5)) {
                                return str5;
                            }
                        }
                    } else if (!aj.m95021b(str4)) {
                        return str4;
                    } else {
                        if (!aj.m95021b(str5)) {
                            return str5;
                        }
                    }
                } else if (!aj.m95021b(str5)) {
                    return str5;
                } else {
                    if (!aj.m95021b(str4)) {
                        return str4;
                    }
                }
            } else if (!aj.m95021b(str4)) {
                return str4;
            }
        } else if (!aj.m95021b(str5)) {
            return str5;
        }
        if (!TextUtils.isEmpty(str3)) {
            str = str3;
        }
        return m133175a(str, str2);
    }
}
