package com.ss.android.lark.mail.impl.utils.tokenautocomplete;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TagTokenizer implements Tokenizer {
    public static final Parcelable.Creator<TagTokenizer> CREATOR = new Parcelable.Creator<TagTokenizer>() {
        /* class com.ss.android.lark.mail.impl.utils.tokenautocomplete.TagTokenizer.C438261 */

        /* renamed from: a */
        public TagTokenizer[] newArray(int i) {
            return new TagTokenizer[i];
        }

        /* renamed from: a */
        public TagTokenizer createFromParcel(Parcel parcel) {
            return new TagTokenizer(parcel);
        }
    };

    /* renamed from: a */
    private ArrayList<Character> f111196a;

    @Override // com.ss.android.lark.mail.impl.utils.tokenautocomplete.Tokenizer
    /* renamed from: b */
    public CharSequence mo156093b(CharSequence charSequence) {
        return charSequence;
    }

    public int describeContents() {
        return 0;
    }

    TagTokenizer() {
        this(Arrays.asList('@', '#'));
    }

    TagTokenizer(Parcel parcel) {
        this(parcel.readArrayList(Character.class.getClassLoader()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo156100a(char c) {
        if (Character.isLetterOrDigit(c) || c == '_') {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.mail.impl.utils.tokenautocomplete.Tokenizer
    /* renamed from: a */
    public boolean mo156092a(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (mo156100a(charSequence.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public TagTokenizer(List<Character> list) {
        this.f111196a = new ArrayList<>(list);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f111196a);
    }

    @Override // com.ss.android.lark.mail.impl.utils.tokenautocomplete.Tokenizer
    /* renamed from: a */
    public List<C43844c> mo156091a(CharSequence charSequence, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        if (i == i2) {
            return arrayList;
        }
        int i3 = Integer.MAX_VALUE;
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (mo156100a(charAt)) {
                if (i - 1 > i3) {
                    arrayList.add(new C43844c(i3, i));
                }
                i3 = Integer.MAX_VALUE;
            }
            if (this.f111196a.contains(Character.valueOf(charAt))) {
                i3 = i;
            }
            i++;
        }
        if (i2 > i3) {
            arrayList.add(new C43844c(i3, i2));
        }
        return arrayList;
    }
}
