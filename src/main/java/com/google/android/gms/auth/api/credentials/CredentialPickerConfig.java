package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new C21564e();

    /* renamed from: a */
    private final int f52405a;

    /* renamed from: b */
    private final boolean f52406b;

    /* renamed from: c */
    private final boolean f52407c;

    /* renamed from: d */
    private final boolean f52408d;

    /* renamed from: e */
    private final int f52409e;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Prompt {
        public static final int CONTINUE = 1;
        public static final int SIGN_IN = 2;
        public static final int SIGN_UP = 3;
    }

    CredentialPickerConfig(int i, boolean z, boolean z2, boolean z3, int i2) {
        this.f52405a = i;
        this.f52406b = z;
        this.f52407c = z2;
        boolean z4 = true;
        int i3 = 1;
        if (i < 2) {
            this.f52408d = z3;
            this.f52409e = z3 ? 3 : i3;
            return;
        }
        this.f52408d = i2 != 3 ? false : z4;
        this.f52409e = i2;
    }

    private CredentialPickerConfig(C21559a aVar) {
        this(2, aVar.f52410a, aVar.f52411b, false, aVar.f52412c);
    }

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$a */
    public static class C21559a {

        /* renamed from: a */
        private boolean f52410a;

        /* renamed from: b */
        private boolean f52411b = true;

        /* renamed from: c */
        private int f52412c = 1;

        /* renamed from: a */
        public CredentialPickerConfig mo72990a() {
            return new CredentialPickerConfig(this);
        }
    }

    /* renamed from: a */
    public final boolean mo72986a() {
        return this.f52406b;
    }

    /* renamed from: b */
    public final boolean mo72987b() {
        return this.f52407c;
    }

    /* renamed from: c */
    public final boolean mo72988c() {
        return this.f52409e == 3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, mo72986a());
        SafeParcelWriter.writeBoolean(parcel, 2, mo72987b());
        SafeParcelWriter.writeBoolean(parcel, 3, mo72988c());
        SafeParcelWriter.writeInt(parcel, 4, this.f52409e);
        SafeParcelWriter.writeInt(parcel, 1000, this.f52405a);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
