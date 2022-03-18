package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C21584f();

    /* renamed from: a */
    private static Clock f52453a = DefaultClock.getInstance();

    /* renamed from: b */
    private final int f52454b;

    /* renamed from: c */
    private String f52455c;

    /* renamed from: d */
    private String f52456d;

    /* renamed from: e */
    private String f52457e;

    /* renamed from: f */
    private String f52458f;

    /* renamed from: g */
    private Uri f52459g;

    /* renamed from: h */
    private String f52460h;

    /* renamed from: i */
    private long f52461i;

    /* renamed from: j */
    private String f52462j;

    /* renamed from: k */
    private List<Scope> f52463k;

    /* renamed from: l */
    private String f52464l;

    /* renamed from: m */
    private String f52465m;

    /* renamed from: n */
    private Set<Scope> f52466n = new HashSet();

    /* renamed from: a */
    public static GoogleSignInAccount m78116a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount a = m78117a(jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        a.f52460h = jSONObject.optString("serverAuthCode", null);
        return a;
    }

    /* renamed from: a */
    private static GoogleSignInAccount m78117a(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, (l == null ? Long.valueOf(f52453a.currentTimeMillis() / 1000) : l).longValue(), Preconditions.checkNotEmpty(str7), new ArrayList((Collection) Preconditions.checkNotNull(set)), str5, str6);
    }

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f52454b = i;
        this.f52455c = str;
        this.f52456d = str2;
        this.f52457e = str3;
        this.f52458f = str4;
        this.f52459g = uri;
        this.f52460h = str5;
        this.f52461i = j;
        this.f52462j = str6;
        this.f52463k = list;
        this.f52464l = str7;
        this.f52465m = str8;
    }

    /* renamed from: a */
    public String mo73028a() {
        return this.f52455c;
    }

    /* renamed from: b */
    public String mo73029b() {
        return this.f52456d;
    }

    /* renamed from: c */
    public String mo73030c() {
        return this.f52457e;
    }

    /* renamed from: d */
    public Account mo73031d() {
        if (this.f52457e == null) {
            return null;
        }
        return new Account(this.f52457e, "com.google");
    }

    /* renamed from: e */
    public String mo73032e() {
        return this.f52458f;
    }

    /* renamed from: f */
    public String mo73034f() {
        return this.f52464l;
    }

    /* renamed from: g */
    public String mo73035g() {
        return this.f52465m;
    }

    /* renamed from: h */
    public Uri mo73036h() {
        return this.f52459g;
    }

    /* renamed from: i */
    public String mo73038i() {
        return this.f52460h;
    }

    /* renamed from: j */
    public final String mo73039j() {
        return this.f52462j;
    }

    /* renamed from: k */
    public Set<Scope> mo73040k() {
        HashSet hashSet = new HashSet(this.f52463k);
        hashSet.addAll(this.f52466n);
        return hashSet;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f52454b);
        SafeParcelWriter.writeString(parcel, 2, mo73028a(), false);
        SafeParcelWriter.writeString(parcel, 3, mo73029b(), false);
        SafeParcelWriter.writeString(parcel, 4, mo73030c(), false);
        SafeParcelWriter.writeString(parcel, 5, mo73032e(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, mo73036h(), i, false);
        SafeParcelWriter.writeString(parcel, 7, mo73038i(), false);
        SafeParcelWriter.writeLong(parcel, 8, this.f52461i);
        SafeParcelWriter.writeString(parcel, 9, this.f52462j, false);
        SafeParcelWriter.writeTypedList(parcel, 10, this.f52463k, false);
        SafeParcelWriter.writeString(parcel, 11, mo73034f(), false);
        SafeParcelWriter.writeString(parcel, 12, mo73035g(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public int hashCode() {
        return ((this.f52462j.hashCode() + 527) * 31) + mo73040k().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f52462j.equals(this.f52462j) && googleSignInAccount.mo73040k().equals(mo73040k());
    }

    /* renamed from: l */
    public final String mo73041l() {
        JSONObject m = m78118m();
        m.remove("serverAuthCode");
        return m.toString();
    }

    /* renamed from: m */
    private final JSONObject m78118m() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (mo73028a() != null) {
                jSONObject.put("id", mo73028a());
            }
            if (mo73029b() != null) {
                jSONObject.put("tokenId", mo73029b());
            }
            if (mo73030c() != null) {
                jSONObject.put("email", mo73030c());
            }
            if (mo73032e() != null) {
                jSONObject.put("displayName", mo73032e());
            }
            if (mo73034f() != null) {
                jSONObject.put("givenName", mo73034f());
            }
            if (mo73035g() != null) {
                jSONObject.put("familyName", mo73035g());
            }
            if (mo73036h() != null) {
                jSONObject.put("photoUrl", mo73036h().toString());
            }
            if (mo73038i() != null) {
                jSONObject.put("serverAuthCode", mo73038i());
            }
            jSONObject.put("expirationTime", this.f52461i);
            jSONObject.put("obfuscatedIdentifier", this.f52462j);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = this.f52463k;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, C21583e.f52505a);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.mo73201a());
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
