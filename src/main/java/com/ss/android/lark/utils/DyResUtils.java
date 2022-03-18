package com.ss.android.lark.utils;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.annotation.AnnotationRetention;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/utils/DyResUtils;", "", "()V", "Companion", "DyResDependencyAPi", "ResI18n", "ResType", "ResValue", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DyResUtils {

    /* renamed from: a */
    public static final Companion f142243a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/utils/DyResUtils$ResI18n;", "", "Companion", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface ResI18n {
        public static final Companion Companion = Companion.f142244a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/utils/DyResUtils$ResI18n$Companion;", "", "()V", "de_DE", "", "en_US", "es_ES", "fr_FR", "hi_IN", "in", "it_IT", "ja_JP", "ko_KR", "pt_BR", "ru_RU", "th_TH", "vi_VN", "zh_CN", "keys", "", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.utils.DyResUtils$ResI18n$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f142244a = new Companion();

            private Companion() {
            }

            /* renamed from: a */
            public final List<String> mo195938a() {
                return CollectionsKt.listOf((Object[]) new String[]{"zh_CN", "en_US", "ja_JP", "de_DE", "es_ES", "fr_FR", "hi_IN", "in", "it_IT", "ko_KR", "pt_BR", "ru_RU", "th_TH", "vi_VN"});
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/utils/DyResUtils$ResType;", "", "Companion", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface ResType {
        public static final Companion Companion = Companion.f142245a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/utils/DyResUtils$ResType$Companion;", "", "()V", "IMAGE", "", "TEXT", GrsBaseInfo.CountryCodeSource.UNKNOWN, "VIDEO", "from", "value", "", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.utils.DyResUtils$ResType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f142245a = new Companion();

            private Companion() {
            }

            /* renamed from: a */
            public final int mo195939a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "value");
                int hashCode = str.hashCode();
                if (hashCode != 3556653) {
                    if (hashCode != 100313435) {
                        if (hashCode == 112202875 && str.equals("video")) {
                            return 3;
                        }
                    } else if (str.equals("image")) {
                        return 2;
                    }
                } else if (str.equals("text")) {
                    return 1;
                }
                return 0;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/utils/DyResUtils$DyResDependencyAPi;", "", "getDyResJson", "", "key", "Companion", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.utils.DyResUtils$b */
    public interface DyResDependencyAPi {

        /* renamed from: a */
        public static final Companion f142246a = Companion.f142247a;

        String getDyResJson(String str);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/utils/DyResUtils$DyResDependencyAPi$Companion;", "", "()V", "impl", "Lcom/ss/android/lark/utils/DyResUtils$DyResDependencyAPi;", "getImpl", "()Lcom/ss/android/lark/utils/DyResUtils$DyResDependencyAPi;", "setImpl", "(Lcom/ss/android/lark/utils/DyResUtils$DyResDependencyAPi;)V", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.utils.DyResUtils$b$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f142247a = new Companion();

            /* renamed from: b */
            private static DyResDependencyAPi f142248b;

            private Companion() {
            }

            /* renamed from: a */
            public final DyResDependencyAPi mo195942a() {
                return f142248b;
            }

            /* renamed from: a */
            public final void mo195943a(DyResDependencyAPi bVar) {
                f142248b = bVar;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\bJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u0005R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/utils/DyResUtils$ResValue;", "", "()V", "i18nValueMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", ShareHitPoint.f121869d, "", "valueKey", "getType", "getValue", "i18nType", "Companion", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.utils.DyResUtils$c */
    public static final class ResValue {

        /* renamed from: d */
        public static final Companion f142249d = new Companion(null);

        /* renamed from: a */
        public String f142250a;

        /* renamed from: b */
        public int f142251b;

        /* renamed from: c */
        public HashMap<String, String> f142252c = new HashMap<>();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/utils/DyResUtils$ResValue$Companion;", "", "()V", "parse", "Lcom/ss/android/lark/utils/DyResUtils$ResValue;", "valueKey", "", "obj", "Lorg/json/JSONObject;", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.utils.DyResUtils$c$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARNING: Removed duplicated region for block: B:15:0x005a A[Catch:{ JSONException -> 0x0064 }] */
            /* JADX WARNING: Removed duplicated region for block: B:16:0x005b A[Catch:{ JSONException -> 0x0064 }] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.ss.android.lark.utils.DyResUtils.ResValue mo195946a(java.lang.String r6, org.json.JSONObject r7) {
                /*
                // Method dump skipped, instructions count: 101
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.utils.DyResUtils.ResValue.Companion.mo195946a(java.lang.String, org.json.JSONObject):com.ss.android.lark.utils.DyResUtils$c");
            }
        }

        /* renamed from: a */
        public final int mo195944a() {
            return this.f142251b;
        }

        /* renamed from: a */
        public final String mo195945a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "i18nType");
            return this.f142252c.get(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0003J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0003J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\rJ \u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\rJ\u0018\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/utils/DyResUtils$Companion;", "", "()V", "TAG", "", "getLangKey", "context", "Landroid/content/Context;", "locale", "Ljava/util/Locale;", "getString", "domainKey", "resId", "", "resKey", "parseResValue", "Lcom/ss/android/lark/utils/DyResUtils$ResValue;", "resJson", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.utils.DyResUtils$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final String m224116a(Context context) {
            Locale locale;
            if (Build.VERSION.SDK_INT >= 24) {
                Resources resources = context.getResources();
                Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
                Configuration configuration = resources.getConfiguration();
                Intrinsics.checkExpressionValueIsNotNull(configuration, "context.resources.configuration");
                locale = configuration.getLocales().get(0);
                if (locale == null) {
                    Resources resources2 = context.getResources();
                    Intrinsics.checkExpressionValueIsNotNull(resources2, "context.resources");
                    locale = resources2.getConfiguration().locale;
                }
            } else {
                Resources resources3 = context.getResources();
                Intrinsics.checkExpressionValueIsNotNull(resources3, "context.resources");
                locale = resources3.getConfiguration().locale;
            }
            Intrinsics.checkExpressionValueIsNotNull(locale, "locale");
            return m224117a(locale);
        }

        /* renamed from: a */
        private final String m224117a(Locale locale) {
            boolean z;
            String str;
            StringBuilder sb = new StringBuilder();
            String language = locale.getLanguage();
            Intrinsics.checkExpressionValueIsNotNull(language, "locale.language");
            if (language != null) {
                String lowerCase = language.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                sb.append(lowerCase);
                String country = locale.getCountry();
                Intrinsics.checkExpressionValueIsNotNull(country, "locale.country");
                if (country.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str = "";
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("_");
                    String country2 = locale.getCountry();
                    Intrinsics.checkExpressionValueIsNotNull(country2, "locale.country");
                    if (country2 != null) {
                        String upperCase = country2.toUpperCase();
                        Intrinsics.checkExpressionValueIsNotNull(upperCase, "(this as java.lang.String).toUpperCase()");
                        sb2.append(upperCase);
                        str = sb2.toString();
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                sb.append(str);
                return sb.toString();
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }

        /* renamed from: a */
        public final String mo195941a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "domainKey");
            Intrinsics.checkParameterIsNotNull(str2, "resKey");
            Application application = LarkContext.getApplication();
            Intrinsics.checkExpressionValueIsNotNull(application, "LarkContext.getApplication()");
            return mo195940a(application, str, str2);
        }

        /* renamed from: b */
        private final ResValue m224118b(String str, String str2) {
            JSONObject optJSONObject;
            try {
                JSONObject optJSONObject2 = new JSONObject(str).optJSONObject("res");
                if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject(str2)) == null) {
                    return null;
                }
                return ResValue.f142249d.mo195946a(str2, optJSONObject);
            } catch (Exception e) {
                Log.m165384e("DyResUtils", "parse json err", e);
                return null;
            }
        }

        /* renamed from: a */
        public final String mo195940a(Context context, String str, String str2) {
            String str3;
            boolean z;
            ResValue b;
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "domainKey");
            Intrinsics.checkParameterIsNotNull(str2, "resKey");
            DyResDependencyAPi a = DyResDependencyAPi.f142246a.mo195942a();
            if (a != null) {
                str3 = a.getDyResJson(str);
            } else {
                str3 = null;
            }
            String str4 = str3;
            if (str4 == null || str4.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && (b = m224118b(str3, str2)) != null) {
                String a2 = b.mo195945a(DyResUtils.f142243a.m224116a(context));
                if (a2 != null) {
                    return a2;
                }
                if (b.mo195944a() != 1) {
                    Companion aVar = DyResUtils.f142243a;
                    Locale locale = Locale.US;
                    Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
                    String a3 = b.mo195945a(aVar.m224117a(locale));
                    if (a3 != null) {
                        return a3;
                    }
                }
            }
            return null;
        }
    }
}
