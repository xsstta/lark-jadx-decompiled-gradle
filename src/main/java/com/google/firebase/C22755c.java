package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* renamed from: com.google.firebase.c */
public final class C22755c {

    /* renamed from: a */
    public final String f56284a;

    /* renamed from: b */
    public final String f56285b;

    /* renamed from: c */
    public final String f56286c;

    /* renamed from: d */
    public final String f56287d;

    /* renamed from: e */
    public final String f56288e;

    /* renamed from: f */
    public final String f56289f;

    /* renamed from: g */
    public final String f56290g;

    /* renamed from: a */
    public String mo79141a() {
        return this.f56284a;
    }

    /* renamed from: b */
    public String mo79142b() {
        return this.f56285b;
    }

    /* renamed from: c */
    public String mo79143c() {
        return this.f56288e;
    }

    /* renamed from: d */
    public String mo79144d() {
        return this.f56290g;
    }

    public int hashCode() {
        return Objects.hashCode(this.f56285b, this.f56284a, this.f56286c, this.f56287d, this.f56288e, this.f56289f, this.f56290g);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f56285b).add("apiKey", this.f56284a).add("databaseUrl", this.f56286c).add("gcmSenderId", this.f56288e).add("storageBucket", this.f56289f).add("projectId", this.f56290g).toString();
    }

    /* renamed from: a */
    public static C22755c m82720a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new C22755c(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C22755c)) {
            return false;
        }
        C22755c cVar = (C22755c) obj;
        if (!Objects.equal(this.f56285b, cVar.f56285b) || !Objects.equal(this.f56284a, cVar.f56284a) || !Objects.equal(this.f56286c, cVar.f56286c) || !Objects.equal(this.f56287d, cVar.f56287d) || !Objects.equal(this.f56288e, cVar.f56288e) || !Objects.equal(this.f56289f, cVar.f56289f) || !Objects.equal(this.f56290g, cVar.f56290g)) {
            return false;
        }
        return true;
    }

    private C22755c(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f56285b = str;
        this.f56284a = str2;
        this.f56286c = str3;
        this.f56287d = str4;
        this.f56288e = str5;
        this.f56289f = str6;
        this.f56290g = str7;
    }
}
