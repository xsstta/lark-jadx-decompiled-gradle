package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nonnull;

public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new C21562c();
    @Nonnull

    /* renamed from: a */
    private final String f52397a;

    /* renamed from: b */
    private final String f52398b;

    /* renamed from: c */
    private final Uri f52399c;
    @Nonnull

    /* renamed from: d */
    private final List<IdToken> f52400d;

    /* renamed from: e */
    private final String f52401e;

    /* renamed from: f */
    private final String f52402f;

    /* renamed from: g */
    private final String f52403g;

    /* renamed from: h */
    private final String f52404h;

    Credential(String str, String str2, Uri uri, List<IdToken> list, String str3, String str4, String str5, String str6) {
        List<IdToken> list2;
        String trim = ((String) Preconditions.checkNotNull(str, "credential identifier cannot be null")).trim();
        Preconditions.checkNotEmpty(trim, "credential identifier cannot be empty");
        if (str3 == null || !TextUtils.isEmpty(str3)) {
            if (str4 != null) {
                boolean z = false;
                if (!TextUtils.isEmpty(str4)) {
                    Uri parse = Uri.parse(str4);
                    if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority()) && ("http".equalsIgnoreCase(parse.getScheme()) || "https".equalsIgnoreCase(parse.getScheme()))) {
                        z = true;
                    }
                }
                if (!Boolean.valueOf(z).booleanValue()) {
                    throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
                }
            }
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                if (str2 != null && TextUtils.isEmpty(str2.trim())) {
                    str2 = null;
                }
                this.f52398b = str2;
                this.f52399c = uri;
                if (list == null) {
                    list2 = Collections.emptyList();
                } else {
                    list2 = Collections.unmodifiableList(list);
                }
                this.f52400d = list2;
                this.f52397a = trim;
                this.f52401e = str3;
                this.f52402f = str4;
                this.f52403g = str5;
                this.f52404h = str6;
                return;
            }
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        throw new IllegalArgumentException("Password must not be empty if set");
    }

    @Nonnull
    /* renamed from: a */
    public String mo72975a() {
        return this.f52397a;
    }

    /* renamed from: b */
    public String mo72976b() {
        return this.f52398b;
    }

    /* renamed from: c */
    public Uri mo72977c() {
        return this.f52399c;
    }

    @Nonnull
    /* renamed from: d */
    public List<IdToken> mo72978d() {
        return this.f52400d;
    }

    /* renamed from: e */
    public String mo72979e() {
        return this.f52401e;
    }

    /* renamed from: f */
    public String mo72981f() {
        return this.f52402f;
    }

    /* renamed from: g */
    public String mo72982g() {
        return this.f52403g;
    }

    /* renamed from: h */
    public String mo72983h() {
        return this.f52404h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, mo72975a(), false);
        SafeParcelWriter.writeString(parcel, 2, mo72976b(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, mo72977c(), i, false);
        SafeParcelWriter.writeTypedList(parcel, 4, mo72978d(), false);
        SafeParcelWriter.writeString(parcel, 5, mo72979e(), false);
        SafeParcelWriter.writeString(parcel, 6, mo72981f(), false);
        SafeParcelWriter.writeString(parcel, 9, mo72982g(), false);
        SafeParcelWriter.writeString(parcel, 10, mo72983h(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.f52397a, credential.f52397a) && TextUtils.equals(this.f52398b, credential.f52398b) && Objects.equal(this.f52399c, credential.f52399c) && TextUtils.equals(this.f52401e, credential.f52401e) && TextUtils.equals(this.f52402f, credential.f52402f);
    }

    public int hashCode() {
        return Objects.hashCode(this.f52397a, this.f52398b, this.f52399c, this.f52401e, this.f52402f);
    }
}
