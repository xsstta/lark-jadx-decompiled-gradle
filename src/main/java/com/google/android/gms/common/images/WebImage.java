package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Locale;

public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new C21719d();

    /* renamed from: a */
    private final int f52970a;

    /* renamed from: b */
    private final Uri f52971b;

    /* renamed from: c */
    private final int f52972c;

    /* renamed from: d */
    private final int f52973d;

    WebImage(int i, Uri uri, int i2, int i3) {
        this.f52970a = i;
        this.f52971b = uri;
        this.f52972c = i2;
        this.f52973d = i3;
    }

    /* renamed from: a */
    public final Uri mo73556a() {
        return this.f52971b;
    }

    /* renamed from: b */
    public final int mo73557b() {
        return this.f52972c;
    }

    /* renamed from: c */
    public final int mo73558c() {
        return this.f52973d;
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.f52972c), Integer.valueOf(this.f52973d), this.f52971b.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            return Objects.equal(this.f52971b, webImage.f52971b) && this.f52972c == webImage.f52972c && this.f52973d == webImage.f52973d;
        }
    }

    public final int hashCode() {
        return Objects.hashCode(this.f52971b, Integer.valueOf(this.f52972c), Integer.valueOf(this.f52973d));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f52970a);
        SafeParcelWriter.writeParcelable(parcel, 2, mo73556a(), i, false);
        SafeParcelWriter.writeInt(parcel, 3, mo73557b());
        SafeParcelWriter.writeInt(parcel, 4, mo73558c());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
