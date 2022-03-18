package com.ss.android.lark.mail.impl.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.DisplayRule;
import com.bytedance.lark.pb.im.v1.TranslateScopeMask;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.message.plugin.translation.Language;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TranslationSetting implements Parcelable {
    public static final Parcelable.Creator<TranslationSetting> CREATOR = new Parcelable.Creator<TranslationSetting>() {
        /* class com.ss.android.lark.mail.impl.entity.TranslationSetting.C420851 */

        /* renamed from: a */
        public TranslationSetting[] newArray(int i) {
            return new TranslationSetting[i];
        }

        /* renamed from: a */
        public TranslationSetting createFromParcel(Parcel parcel) {
            return new TranslationSetting(parcel);
        }
    };

    /* renamed from: a */
    public static final int f107010a = TranslateScopeMask.EMAIL.getValue();

    /* renamed from: b */
    public static final Language f107011b = Language.f109414a;

    /* renamed from: c */
    public int f107012c;

    /* renamed from: d */
    public int f107013d;

    /* renamed from: e */
    private final String f107014e = "TranslationSetting";

    /* renamed from: f */
    private Language f107015f;

    /* renamed from: g */
    private List<LanguageSetting> f107016g;

    /* renamed from: h */
    private Map<String, LanguageSetting> f107017h;

    /* renamed from: i */
    private List<Language> f107018i;

    public int describeContents() {
        return 0;
    }

    public static class LanguageSetting implements Parcelable {
        public static final Parcelable.Creator<LanguageSetting> CREATOR = new Parcelable.Creator<LanguageSetting>() {
            /* class com.ss.android.lark.mail.impl.entity.TranslationSetting.LanguageSetting.C420861 */

            /* renamed from: a */
            public LanguageSetting[] newArray(int i) {
                return new LanguageSetting[i];
            }

            /* renamed from: a */
            public LanguageSetting createFromParcel(Parcel parcel) {
                return new LanguageSetting(parcel);
            }
        };

        /* renamed from: a */
        public String f107019a;

        /* renamed from: b */
        public String f107020b;

        /* renamed from: c */
        public String f107021c;

        /* renamed from: d */
        public int f107022d;

        /* renamed from: e */
        public int f107023e;

        public int describeContents() {
            return 0;
        }

        public LanguageSetting() {
        }

        /* renamed from: a */
        public boolean mo151800a() {
            if ((this.f107023e & TranslationSetting.f107010a) == TranslationSetting.f107010a) {
                return true;
            }
            return false;
        }

        protected LanguageSetting(Parcel parcel) {
            this.f107019a = parcel.readString();
            this.f107020b = parcel.readString();
            this.f107021c = parcel.readString();
            this.f107022d = parcel.readInt();
            this.f107023e = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f107019a);
            parcel.writeString(this.f107020b);
            parcel.writeString(this.f107021c);
            parcel.writeInt(this.f107022d);
            parcel.writeInt(this.f107023e);
        }
    }

    /* renamed from: c */
    public List<LanguageSetting> mo151790c() {
        return this.f107016g;
    }

    /* renamed from: f */
    public List<Language> mo151794f() {
        return this.f107018i;
    }

    public TranslationSetting() {
    }

    /* renamed from: a */
    public boolean mo151786a() {
        int i = this.f107013d;
        int i2 = f107010a;
        if ((i & i2) == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo151789b() {
        if (this.f107012c == DisplayRule.WITH_ORIGINAL.getValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public Language mo151791d() {
        Language language = this.f107015f;
        if (language != null) {
            return language;
        }
        Log.m165397w("TranslationSetting", "getTranslationLanguage empty");
        return f107011b;
    }

    /* renamed from: e */
    public String mo151793e() {
        Language language = this.f107015f;
        if (language != null && !TextUtils.isEmpty(language.mo154093a())) {
            return this.f107015f.mo154093a();
        }
        Log.m165397w("TranslationSetting", "getTranslationLanguageKey empty");
        return f107011b.mo154093a();
    }

    /* renamed from: a */
    public void mo151783a(Language language) {
        this.f107015f = language;
    }

    /* renamed from: a */
    public boolean mo151787a(String str) {
        Map<String, LanguageSetting> map;
        LanguageSetting languageSetting;
        if (TextUtils.isEmpty(str) || (map = this.f107017h) == null || (languageSetting = map.get(str)) == null) {
            return false;
        }
        return !languageSetting.mo151800a();
    }

    /* renamed from: b */
    public String mo151788b(String str) {
        Map<String, LanguageSetting> map;
        LanguageSetting languageSetting;
        if (TextUtils.isEmpty(str) || (map = this.f107017h) == null || (languageSetting = map.get(str)) == null) {
            return null;
        }
        return languageSetting.f107021c;
    }

    protected TranslationSetting(Parcel parcel) {
        this.f107015f = (Language) parcel.readParcelable(Language.class.getClassLoader());
        this.f107016g = parcel.createTypedArrayList(LanguageSetting.CREATOR);
        this.f107012c = parcel.readInt();
        this.f107013d = parcel.readInt();
        this.f107018i = parcel.createTypedArrayList(Language.CREATOR);
    }

    /* renamed from: a */
    public void mo151784a(List<LanguageSetting> list) {
        this.f107016g = list;
        if (CollectionUtils.isEmpty(list)) {
            this.f107017h = null;
        }
        this.f107017h = new HashMap();
        for (LanguageSetting languageSetting : list) {
            if (languageSetting != null && !TextUtils.isEmpty(languageSetting.f107019a)) {
                this.f107017h.put(languageSetting.f107019a, languageSetting);
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f107015f, i);
        parcel.writeTypedList(this.f107016g);
        parcel.writeInt(this.f107012c);
        parcel.writeInt(this.f107013d);
        parcel.writeTypedList(this.f107018i);
    }

    /* renamed from: a */
    public void mo151785a(List<String> list, Map<String, String> map) {
        if (CollectionUtils.isEmpty(map)) {
            Log.m165383e("TranslationSetting", "setSupportedLanguageList empty map");
            this.f107018i = null;
            return;
        }
        if (CollectionUtils.isEmpty(list)) {
            list = new ArrayList<>();
            list.addAll(map.keySet());
        }
        this.f107018i = new ArrayList();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                String str2 = map.get(str);
                if (!TextUtils.isEmpty(str2)) {
                    this.f107018i.add(new Language(str, str2));
                }
            }
        }
    }
}
