package com.ss.android.lark.mail.impl.message.plugin.translation;

import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.utils.C43819s;
import java.util.Locale;

public class Language implements Parcelable {
    public static final Parcelable.Creator<Language> CREATOR = new Parcelable.Creator<Language>() {
        /* class com.ss.android.lark.mail.impl.message.plugin.translation.Language.C429691 */

        /* renamed from: a */
        public Language[] newArray(int i) {
            return new Language[i];
        }

        /* renamed from: a */
        public Language createFromParcel(Parcel parcel) {
            return new Language(parcel);
        }
    };

    /* renamed from: a */
    public static final Language f109414a = new Language(Locale.ENGLISH.getLanguage().toLowerCase(), C43819s.m173684a((int) R.string.Mail_Translations_English));

    /* renamed from: b */
    private String f109415b;

    /* renamed from: c */
    private String f109416c;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public String mo154093a() {
        return this.f109415b;
    }

    /* renamed from: b */
    public String mo154094b() {
        return this.f109416c;
    }

    protected Language(Parcel parcel) {
        this.f109415b = parcel.readString();
        this.f109416c = parcel.readString();
    }

    public Language(String str, String str2) {
        this.f109415b = str;
        this.f109416c = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f109415b);
        parcel.writeString(this.f109416c);
    }
}
