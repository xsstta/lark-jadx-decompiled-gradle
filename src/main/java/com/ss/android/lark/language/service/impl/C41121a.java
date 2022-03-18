package com.ss.android.lark.language.service.impl;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import androidx.core.os.C0799d;
import androidx.core.os.C0800e;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.C26254af;
import com.larksuite.framework.utils.C26326z;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.Reflect;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.AbstractC29540ab;
import com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a;
import com.ss.android.lark.language.C41115a;
import com.ss.android.lark.language.service.AbstractC41118a;
import com.ss.android.lark.language.service.watch.LocaleWatchDog;
import com.ss.android.lark.language.service.watch.LocaleWatchDogLogger;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.C57852m;
import com.ss.android.lark.utils.LarkContext;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.language.service.impl.a */
public class C41121a implements AbstractC41118a {

    /* renamed from: a */
    private static final Locale f104894a = new Locale("en", "US");

    /* renamed from: b */
    private static boolean f104895b = true;

    /* renamed from: c */
    private static LocaleList f104896c = LocaleList.getDefault();

    /* renamed from: d */
    private final ConcurrentHashMap<AbstractC29540ab, Object> f104897d;

    /* renamed from: e */
    private final Map<String, Locale> f104898e;

    /* renamed from: f */
    private LanguageChangeBroadcastReceiver f104899f;

    /* renamed from: g */
    private final AbstractC29551a f104900g;

    /* renamed from: com.ss.android.lark.language.service.impl.a$a */
    private static final class C41123a {

        /* renamed from: a */
        public static final C41121a f104901a = new C41121a();
    }

    /* renamed from: m */
    public static C41121a m163149m() {
        return C41123a.f104901a;
    }

    @Override // com.ss.android.lark.language.service.AbstractC41118a
    /* renamed from: d */
    public Locale mo148301d() {
        return f104894a;
    }

    @Override // com.ss.android.lark.language.service.AbstractC41118a
    /* renamed from: h */
    public boolean mo148305h() {
        return f104895b;
    }

    @Override // com.ss.android.lark.language.service.AbstractC41118a
    /* renamed from: a */
    public void mo148291a(Locale locale) {
        if (locale == null) {
            mo148355n();
            Locale c = mo148300c();
            this.f104900g.mo105660a(c);
            Locale.setDefault(c);
            return;
        }
        mo148353c(locale);
        this.f104900g.mo105660a(locale);
        Locale.setDefault(locale);
    }

    @Override // com.ss.android.lark.language.service.AbstractC41118a
    /* renamed from: a */
    public boolean mo148292a(Application application, Locale locale) {
        Locale locale2;
        if (mo148293a((Context) application, locale)) {
            return false;
        }
        Configuration configuration = application.getResources().getConfiguration();
        if (Build.VERSION.SDK_INT >= 24) {
            locale2 = configuration.getLocales().get(0);
        } else {
            locale2 = configuration.locale;
        }
        Configuration configuration2 = new Configuration(configuration);
        if (Build.VERSION.SDK_INT >= 24) {
            configuration2.setLocale(locale);
        } else {
            configuration2.locale = locale;
        }
        application.getResources().updateConfiguration(configuration2, application.getResources().getDisplayMetrics());
        Context createConfigurationContext = application.createConfigurationContext(configuration2);
        if (Build.VERSION.SDK_INT > 27) {
            m163146a(createConfigurationContext.getResources(), application.getResources());
        }
        if (mo148293a(createConfigurationContext, locale)) {
            Reflect.m94918a(application).mo93334a("mBase", createConfigurationContext);
            C41115a.m163064a().mo133671a(application);
        }
        C41115a.m163064a().mo133672a(createConfigurationContext);
        m163145a(application, locale2, locale);
        return true;
    }

    @Override // com.ss.android.lark.language.service.AbstractC41118a
    /* renamed from: a */
    public boolean mo148293a(Context context, Locale locale) {
        Locale locale2 = context.getResources().getConfiguration().locale;
        Log.m165389i("LaunchLocaleWatch", "scene= isSameWithSetting, context's locale is " + locale2 + ", target locale is " + locale);
        boolean z = locale.getLanguage().equals(locale2.getLanguage()) && locale.getCountry().equals(locale2.getCountry());
        if (z) {
            if (!"zh_CN".equals(locale2.getLanguage() + "_" + locale2.getCountry()) || locale2.getScript().equals(locale.getScript())) {
                return z;
            }
            return false;
        }
        return z;
    }

    @Override // com.ss.android.lark.language.service.AbstractC41118a
    /* renamed from: a */
    public void mo148290a(AbstractC29540ab abVar) {
        LanguageChangeBroadcastReceiver languageChangeBroadcastReceiver = this.f104899f;
        if (languageChangeBroadcastReceiver == null) {
            this.f104897d.put(abVar, new Object());
        } else {
            languageChangeBroadcastReceiver.mo148350a(abVar);
        }
    }

    @Override // com.ss.android.lark.language.service.AbstractC41118a
    /* renamed from: a */
    public boolean mo148294a(Locale locale, Locale locale2) {
        Log.m165389i("LaunchLocaleWatch", "scene= isSameWithSetting, context's locale is " + locale + ", target locale is " + locale2);
        boolean z = locale2.getLanguage().equals(locale.getLanguage()) && locale2.getCountry().equals(locale.getCountry());
        if (z) {
            if (!"zh_CN".equals(locale.getLanguage() + "_" + locale.getCountry()) || locale.getScript().equals(locale2.getScript())) {
                return z;
            }
            return false;
        }
        return z;
    }

    @Override // com.ss.android.lark.language.service.AbstractC41118a
    /* renamed from: a */
    public void mo148289a(Configuration configuration) {
        Locale b = mo148297b();
        Locale b2 = mo148298b(configuration);
        if (mo148294a(b, b2)) {
            Log.m165389i("LanguageSettingService", "currentLocale equals configLocale, configLocale: " + b2);
            return;
        }
        if (C26326z.m95341e()) {
            configuration.setLocale(b);
        } else {
            configuration.locale = b;
        }
        Log.m165389i("LanguageSettingService", "changed the locale of newConfig, configLocale: " + b2);
    }

    @Override // com.ss.android.lark.language.service.AbstractC41118a
    /* renamed from: f */
    public Locale mo148303f() {
        return this.f104900g.mo105659a();
    }

    @Override // com.ss.android.lark.language.service.AbstractC41118a
    /* renamed from: c */
    public Locale mo148300c() {
        return mo148354d(mo148286a());
    }

    @Override // com.ss.android.lark.language.service.AbstractC41118a
    /* renamed from: l */
    public boolean mo148309l() {
        return C41115a.m163064a().mo133673b();
    }

    static {
        if (Build.VERSION.SDK_INT >= 24) {
        }
    }

    private C41121a() {
        this.f104897d = new ConcurrentHashMap<>();
        this.f104898e = new HashMap();
        this.f104900g = C41124b.m163182s();
    }

    /* renamed from: q */
    private List<String> m163150q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("en");
        arrayList.add("ja");
        arrayList.add("zh");
        if (C57824f.m224469c()) {
            m163147a(arrayList);
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.language.service.AbstractC41118a
    /* renamed from: a */
    public Locale mo148286a() {
        C0800e a = C0799d.m3883a(Resources.getSystem().getConfiguration());
        Log.m165389i("LocaleListCompat", a.toString());
        return a.mo4391a(0);
    }

    @Override // com.ss.android.lark.language.service.AbstractC41118a
    /* renamed from: g */
    public Locale mo148304g() {
        Locale f = mo148303f();
        if (f == null || TextUtils.isEmpty(f.getLanguage())) {
            return mo148301d();
        }
        return f;
    }

    @Override // com.ss.android.lark.language.service.AbstractC41118a
    /* renamed from: k */
    public String mo148308k() {
        Locale b = mo148297b();
        if (b != null) {
            return b.getLanguage().toLowerCase();
        }
        if (C41115a.m163064a().mo133673b()) {
        }
        return "en";
    }

    /* renamed from: n */
    public void mo148355n() {
        C57744a a = C57744a.m224104a();
        a.putString("params_language_locale", "");
        a.putString("params_language_contry", "");
    }

    @Override // com.ss.android.lark.language.service.AbstractC41118a
    /* renamed from: e */
    public List<Locale> mo148302e() {
        ArrayList arrayList = new ArrayList();
        for (String str : m163151r()) {
            Locale locale = this.f104898e.get(str);
            if (locale != null) {
                arrayList.add(locale);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.language.service.AbstractC41118a
    /* renamed from: i */
    public boolean mo148306i() {
        Locale b = mo148297b();
        return (b.getLanguage().toLowerCase() + "_" + b.getCountry().toLowerCase()).startsWith(Locale.CHINESE.getLanguage());
    }

    @Override // com.ss.android.lark.language.service.AbstractC41118a
    /* renamed from: j */
    public String mo148307j() {
        Locale b = mo148297b();
        if (b != null) {
            return b.getLanguage().toLowerCase() + "_" + b.getCountry().toUpperCase();
        }
        if (C41115a.m163064a().mo133673b()) {
        }
        return "en_US";
    }

    /* renamed from: o */
    public Locale mo148356o() {
        C57744a a = C57744a.m224104a();
        String string = a.getString("params_language_locale", "");
        String string2 = a.getString("params_language_contry", "");
        if (!TextUtils.isEmpty(string) || !TextUtils.isEmpty(string2)) {
            f104895b = false;
            return new Locale(string, string2);
        }
        f104895b = true;
        return mo148286a();
    }

    /* renamed from: p */
    public void mo148357p() {
        Locale locale;
        for (String str : m163151r()) {
            String[] split = str.split("_");
            if (!TextUtils.isEmpty(split[0])) {
                if (split.length > 1) {
                    locale = new Locale(split[0], split[1]);
                } else {
                    locale = new Locale(split[0]);
                }
                this.f104898e.put(str, locale);
            }
        }
    }

    @Override // com.ss.android.lark.language.service.AbstractC41118a
    /* renamed from: b */
    public Locale mo148297b() {
        Locale d = mo148354d(mo148356o());
        this.f104900g.mo105660a(d);
        Locale.setDefault(d);
        return d;
    }

    /* renamed from: r */
    private List<String> m163151r() {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        int i = R.raw.language;
        try {
            if (C57824f.m224469c()) {
                i = R.raw.language_14;
            }
            if (!C41115a.m163064a().mo133673b() && C57852m.m224554a(LarkContext.getApplication())) {
                i = R.raw.language_debug;
            }
            Properties a = C41127d.m163205a(C41115a.m163064a().mo133670a(), i);
            Set<String> stringPropertyNames = a.stringPropertyNames();
            TreeSet treeSet = new TreeSet();
            treeSet.addAll(stringPropertyNames);
            boolean a2 = C41115a.m163064a().mo133674c().mo133676a("lark.i18n.traditional.chinese");
            C57744a a3 = C57744a.m224104a();
            if (!a2 && !C57852m.m224554a(LarkContext.getApplication())) {
                if (!a3.getBoolean("feature_key_traditional_chinese_enable_gsp", false)) {
                    Iterator it = treeSet.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(a.getProperty((String) it.next()));
                    }
                    return arrayList2;
                }
            }
            if (stringPropertyNames.size() == 15) {
                arrayList = new ArrayList(Arrays.asList("sq", "en_US", "id_ID", "de_DE", "es_ES", "fr_FR", "it_IT", "pt_BR", "vi_VN", "ru_RU", "hi_IN", "th_TH", "ja_JP", "zh_CN", "zh_HK", "zh_TW", "ko_KR"));
            } else if (stringPropertyNames.size() == 14) {
                arrayList = new ArrayList(Arrays.asList("en_US", "id_ID", "de_DE", "es_ES", "fr_FR", "it_IT", "pt_BR", "vi_VN", "ru_RU", "hi_IN", "th_TH", "ja_JP", "zh_CN", "zh_HK", "zh_TW", "ko_KR"));
            } else if (stringPropertyNames.size() != 3) {
                return arrayList2;
            } else {
                arrayList = new ArrayList(Arrays.asList("zh_CN", "zh_HK", "zh_TW", "en_US", "ja_JP"));
            }
            return arrayList;
        } catch (Exception e) {
            arrayList2.add("en_US");
            Log.m165384e("lark", "load env file error!  --- " + e.getMessage(), e);
            return arrayList2;
        }
    }

    /* renamed from: c */
    public void mo148353c(Locale locale) {
        C57744a a = C57744a.m224104a();
        a.putString("params_language_locale", locale.getLanguage());
        a.putString("params_language_contry", locale.getCountry());
    }

    /* renamed from: a */
    private Locale m163144a(boolean z) {
        if (C41115a.m163064a().mo133674c().mo133676a("lark.i18n.traditional.chinese")) {
            return new Locale("en", "US");
        }
        if (!z || !this.f104898e.containsKey("zh_TW")) {
            return new Locale("en", "US");
        }
        return Locale.TRADITIONAL_CHINESE;
    }

    @Override // com.ss.android.lark.language.service.AbstractC41118a
    /* renamed from: b */
    public String mo148296b(Locale locale) {
        String str = locale.getLanguage() + "_" + locale.getCountry().toUpperCase();
        if ("in_ID".equals(str)) {
            return "id_ID";
        }
        return str;
    }

    /* renamed from: d */
    public Locale mo148354d(Locale locale) {
        String str;
        boolean z;
        if (!TextUtils.isEmpty(locale.getCountry())) {
            str = locale.getLanguage() + "_" + locale.getCountry();
        } else {
            str = locale.getLanguage();
        }
        Locale locale2 = new Locale("en", "US");
        boolean z2 = true;
        if (C41115a.m163064a().mo133673b()) {
            Iterator<String> it = m163150q().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (str.contains(it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                return locale2;
            }
        }
        if (str.startsWith("ja") && !C41115a.m163064a().mo133674c().mo133675a()) {
            return locale2;
        }
        if (!"zh_CN".equals(str) || !"Hant".equals(locale.getScript())) {
            z2 = false;
        }
        Log.m165389i("LaunchLocaleWatch", "locale tag is " + str);
        if (CollectionUtils.isEmpty(this.f104898e)) {
            mo148357p();
        }
        if (this.f104898e.containsKey(str) && !z2) {
            return locale;
        }
        C41115a.m163064a().mo133673b();
        if (C57824f.m224469c()) {
            return m163143a(str, locale, locale2, z2);
        }
        if (str.startsWith("zh")) {
            return m163144a(z2);
        }
        if (str.startsWith("ja")) {
            return new Locale("ja", "JP");
        }
        return locale2;
    }

    /* renamed from: a */
    private void m163147a(List<String> list) {
        list.add("es");
        list.add("it");
        list.add("de");
        list.add("fr");
        list.add("pt");
        list.add("in");
        list.add("id");
        list.add("vi");
        list.add("th");
        list.add("ko");
        list.add("ru");
        list.add("hi");
    }

    @Override // com.ss.android.lark.language.service.AbstractC41118a
    /* renamed from: b */
    public Locale mo148298b(Configuration configuration) {
        if (C26326z.m95341e()) {
            return configuration.getLocales().get(0);
        }
        return configuration.locale;
    }

    @Override // com.ss.android.lark.language.service.AbstractC41118a
    /* renamed from: a */
    public Context mo148285a(Context context) {
        Locale b = mo148297b();
        if (mo148293a(context, b)) {
            Log.m165389i("LanguageSettingService", "same locale");
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        if (Build.VERSION.SDK_INT >= 24) {
            configuration.setLocale(b);
        } else {
            configuration.locale = b;
        }
        context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        if (Build.VERSION.SDK_INT > 27) {
            m163146a(createConfigurationContext.getResources(), context.getResources());
        }
        if (mo148293a(createConfigurationContext, b)) {
            return createConfigurationContext;
        }
        return context;
    }

    @Override // com.ss.android.lark.language.service.AbstractC41118a
    /* renamed from: b */
    public void mo148299b(AbstractC29540ab abVar) {
        Iterator<Map.Entry<AbstractC29540ab, Object>> it = this.f104897d.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().getKey() == abVar) {
                    this.f104897d.remove(abVar);
                    break;
                }
            } else {
                break;
            }
        }
        LanguageChangeBroadcastReceiver languageChangeBroadcastReceiver = this.f104899f;
        if (languageChangeBroadcastReceiver != null) {
            languageChangeBroadcastReceiver.mo148351b(abVar);
        }
    }

    @Override // com.ss.android.lark.language.service.AbstractC41118a
    /* renamed from: a */
    public void mo148287a(Application application) {
        if (application != null) {
            mo148357p();
            Locale b = mo148297b();
            if (!mo148293a((Context) application, b)) {
                Log.m165389i("LaunchLocaleWatch", "change application's lcoale " + LocaleWatchDogLogger.m163107a(application) + " to " + b);
                Reflect.m94918a(application).mo93334a("mBase", mo148285a(application.getBaseContext()));
                C41115a.m163064a().mo133671a(application);
                Log.m165389i("LanguageSettingService", "update language setting");
            }
        }
    }

    @Override // com.ss.android.lark.language.service.AbstractC41118a
    /* renamed from: b */
    public Context mo148295b(Context context, Locale locale) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        if (Build.VERSION.SDK_INT >= 24) {
            configuration.setLocale(locale);
        } else {
            configuration.locale = locale;
        }
        context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
        return context.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    private void m163146a(Resources resources, Resources resources2) {
        try {
            AssetManager assets = resources.getAssets();
            AssetManager assets2 = resources2.getAssets();
            Method a = C26254af.m95003a((Class<?>) AssetManager.class, "getApkAssets", new Class[0]);
            a.setAccessible(true);
            Object invoke = a.invoke(assets2, new Object[0]);
            Method a2 = C26254af.m95003a((Class<?>) AssetManager.class, "setApkAssets", invoke.getClass(), Boolean.TYPE);
            a2.setAccessible(true);
            a2.invoke(assets, invoke, true);
        } catch (Exception e) {
            Log.m165383e("LanguageSettingService", e.getMessage());
        }
    }

    @Override // com.ss.android.lark.language.service.AbstractC41118a
    /* renamed from: a */
    public void mo148288a(Application application, AbstractC29540ab abVar) {
        LocaleWatchDog.f104871a.mo148310a(application);
        LanguageChangeBroadcastReceiver c = LanguageChangeBroadcastReceiver.m163140c(application);
        this.f104899f = c;
        c.mo148350a(abVar);
        if (!this.f104897d.isEmpty()) {
            for (Map.Entry<AbstractC29540ab, Object> entry : this.f104897d.entrySet()) {
                this.f104899f.mo148350a(entry.getKey());
            }
            this.f104897d.clear();
        }
        Locale b = mo148297b();
        LocaleWatchDog.m163104a("application_init", application, b, LocaleWatchDogLogger.m163107a(application));
        mo148292a(application, b);
    }

    /* renamed from: a */
    private void m163145a(Context context, Locale locale, Locale locale2) {
        if (C26252ad.m94993b(context)) {
            m163148b(context, locale, locale2);
        }
    }

    /* renamed from: b */
    private void m163148b(Context context, Locale locale, Locale locale2) {
        Intent intent = new Intent();
        intent.putExtra("KEY_ORIGIN_LOCALE", locale);
        intent.putExtra("KEY_NEW_LOCALE", locale2);
        intent.setAction(LanguageChangeBroadcastReceiver.m163138a(context));
        context.sendBroadcast(intent, LanguageChangeBroadcastReceiver.m163139b(context));
    }

    /* renamed from: a */
    private Locale m163143a(String str, Locale locale, Locale locale2, boolean z) {
        if (str.startsWith("zh")) {
            return m163144a(z);
        }
        if (str.startsWith("ja")) {
            return new Locale("ja", "JP");
        }
        if (str.startsWith("in") || str.startsWith("id")) {
            return new Locale("id", "ID");
        }
        if (str.startsWith("de")) {
            return new Locale("de", "DE");
        }
        if (str.startsWith("en")) {
            return new Locale("en", "US");
        }
        if (str.startsWith("es")) {
            return new Locale("es", "ES");
        }
        if (str.startsWith("fr")) {
            return new Locale("fr", "FR");
        }
        if (str.startsWith("it")) {
            return new Locale("it", "IT");
        }
        if (str.startsWith("pt")) {
            return new Locale("pt", "BR");
        }
        if (str.startsWith("vi")) {
            return new Locale("vi", "VN");
        }
        if (str.startsWith("ru")) {
            return new Locale("ru", "RU");
        }
        if (str.startsWith("hi")) {
            return new Locale("hi", "IN");
        }
        if (str.startsWith("th")) {
            return new Locale("th", "TH");
        }
        if (str.startsWith("ko")) {
            return new Locale("ko", "KR");
        }
        return locale2;
    }
}
