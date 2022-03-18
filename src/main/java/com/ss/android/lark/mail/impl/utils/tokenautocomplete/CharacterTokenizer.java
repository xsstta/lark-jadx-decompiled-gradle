package com.ss.android.lark.mail.impl.utils.tokenautocomplete;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public class CharacterTokenizer implements Tokenizer {
    public static final Parcelable.Creator<CharacterTokenizer> CREATOR = new Parcelable.Creator<CharacterTokenizer>() {
        /* class com.ss.android.lark.mail.impl.utils.tokenautocomplete.CharacterTokenizer.C438251 */

        /* renamed from: a */
        public CharacterTokenizer[] newArray(int i) {
            return new CharacterTokenizer[i];
        }

        /* renamed from: a */
        public CharacterTokenizer createFromParcel(Parcel parcel) {
            return new CharacterTokenizer(parcel);
        }
    };

    /* renamed from: a */
    private ArrayList<Character> f111193a;

    /* renamed from: b */
    private String f111194b;

    /* renamed from: c */
    private String f111195c;

    public int describeContents() {
        return 0;
    }

    CharacterTokenizer(Parcel parcel) {
        this(parcel.readArrayList(Character.class.getClassLoader()), parcel.readString(), parcel.readString());
    }

    @Override // com.ss.android.lark.mail.impl.utils.tokenautocomplete.Tokenizer
    /* renamed from: a */
    public boolean mo156092a(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (this.f111193a.contains(Character.valueOf(charSequence.charAt(i)))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.utils.tokenautocomplete.Tokenizer
    /* renamed from: b */
    public CharSequence mo156093b(CharSequence charSequence) {
        String str = ((Object) charSequence) + this.f111194b;
        if (!(charSequence instanceof Spanned)) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        TextUtils.copySpansFrom((Spanned) charSequence, 0, charSequence.length(), Object.class, spannableString, 0);
        return spannableString;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f111193a);
        parcel.writeString(this.f111194b);
        parcel.writeString(this.f111195c);
    }

    public CharacterTokenizer(List<Character> list, String str, String str2) {
        this.f111193a = new ArrayList<>(list);
        this.f111194b = str;
        this.f111195c = str2;
    }

    /* renamed from: b */
    private boolean m173707b(CharSequence charSequence, int i, int i2) {
        if (TextUtils.isEmpty(this.f111195c)) {
            return true;
        }
        String charSequence2 = charSequence.subSequence(i, i2).toString();
        if (!TextUtils.isEmpty(charSequence2)) {
            return charSequence2.contains(this.f111195c);
        }
        return true;
    }

    @Override // com.ss.android.lark.mail.impl.utils.tokenautocomplete.Tokenizer
    /* renamed from: a */
    public List<C43844c> mo156091a(CharSequence charSequence, int i, int i2) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (i == i2) {
            return arrayList;
        }
        int i3 = i;
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (i3 == i && Character.isWhitespace(charAt)) {
                i3 = i + 1;
            }
            if (this.f111193a.contains(Character.valueOf(charAt)) || i == i2 - 1) {
                if ((i <= i3 || (!m173707b(charSequence, i3, i) && i != i2 - 1)) && (i != i3 || this.f111193a.contains(Character.valueOf(charAt)))) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    arrayList.add(new C43844c(i3, i + 1));
                }
                i3 = i + 1;
            }
            i++;
        }
        return arrayList;
    }
}
