package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.C21589a;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInOptions extends AbstractSafeParcelable implements C21611a.AbstractC21615d.AbstractC21620e, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new C21586h();

    /* renamed from: a */
    public static final Scope f52467a = new Scope("profile");

    /* renamed from: b */
    public static final Scope f52468b = new Scope("email");

    /* renamed from: c */
    public static final Scope f52469c = new Scope("openid");

    /* renamed from: d */
    public static final Scope f52470d;

    /* renamed from: e */
    public static final Scope f52471e = new Scope("https://www.googleapis.com/auth/games");

    /* renamed from: f */
    public static final GoogleSignInOptions f52472f = new C21576a().mo73054a().mo73058c().mo73059d();

    /* renamed from: g */
    public static final GoogleSignInOptions f52473g;

    /* renamed from: r */
    private static Comparator<Scope> f52474r = new C21585g();

    /* renamed from: h */
    private final int f52475h;

    /* renamed from: i */
    private final ArrayList<Scope> f52476i;

    /* renamed from: j */
    private Account f52477j;

    /* renamed from: k */
    private boolean f52478k;

    /* renamed from: l */
    private final boolean f52479l;

    /* renamed from: m */
    private final boolean f52480m;

    /* renamed from: n */
    private String f52481n;

    /* renamed from: o */
    private String f52482o;

    /* renamed from: p */
    private ArrayList<GoogleSignInOptionsExtensionParcelable> f52483p;

    /* renamed from: q */
    private Map<Integer, GoogleSignInOptionsExtensionParcelable> f52484q;

    /* renamed from: a */
    public static GoogleSignInOptions m78131a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString = jSONObject.optString("accountName", null);
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), new HashMap());
    }

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    public static final class C21576a {

        /* renamed from: a */
        private Set<Scope> f52485a = new HashSet();

        /* renamed from: b */
        private boolean f52486b;

        /* renamed from: c */
        private boolean f52487c;

        /* renamed from: d */
        private boolean f52488d;

        /* renamed from: e */
        private String f52489e;

        /* renamed from: f */
        private Account f52490f;

        /* renamed from: g */
        private String f52491g;

        /* renamed from: h */
        private Map<Integer, GoogleSignInOptionsExtensionParcelable> f52492h = new HashMap();

        public C21576a() {
        }

        public C21576a(GoogleSignInOptions googleSignInOptions) {
            Preconditions.checkNotNull(googleSignInOptions);
            this.f52485a = new HashSet(googleSignInOptions.f52476i);
            this.f52486b = googleSignInOptions.f52479l;
            this.f52487c = googleSignInOptions.f52480m;
            this.f52488d = googleSignInOptions.f52478k;
            this.f52489e = googleSignInOptions.f52481n;
            this.f52490f = googleSignInOptions.f52477j;
            this.f52491g = googleSignInOptions.f52482o;
            this.f52492h = GoogleSignInOptions.m78134b(googleSignInOptions.f52483p);
        }

        /* renamed from: a */
        public final C21576a mo73054a() {
            this.f52485a.add(GoogleSignInOptions.f52469c);
            return this;
        }

        /* renamed from: b */
        public final C21576a mo73057b() {
            this.f52485a.add(GoogleSignInOptions.f52468b);
            return this;
        }

        /* renamed from: c */
        public final C21576a mo73058c() {
            this.f52485a.add(GoogleSignInOptions.f52467a);
            return this;
        }

        /* renamed from: a */
        public final C21576a mo73055a(Scope scope, Scope... scopeArr) {
            this.f52485a.add(scope);
            this.f52485a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        /* renamed from: a */
        public final C21576a mo73056a(String str) {
            this.f52488d = true;
            this.f52489e = m78151b(str);
            return this;
        }

        /* renamed from: d */
        public final GoogleSignInOptions mo73059d() {
            if (this.f52485a.contains(GoogleSignInOptions.f52471e) && this.f52485a.contains(GoogleSignInOptions.f52470d)) {
                this.f52485a.remove(GoogleSignInOptions.f52470d);
            }
            if (this.f52488d && (this.f52490f == null || !this.f52485a.isEmpty())) {
                mo73054a();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f52485a), this.f52490f, this.f52488d, this.f52486b, this.f52487c, this.f52489e, this.f52491g, this.f52492h, null);
        }

        /* renamed from: b */
        private final String m78151b(String str) {
            Preconditions.checkNotEmpty(str);
            String str2 = this.f52489e;
            Preconditions.checkArgument(str2 == null || str2.equals(str), "two different server client ids provided");
            return str;
        }
    }

    GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2) {
        this(i, arrayList, account, z, z2, z3, str, str2, m78134b(arrayList2));
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map) {
        this.f52475h = i;
        this.f52476i = arrayList;
        this.f52477j = account;
        this.f52478k = z;
        this.f52479l = z2;
        this.f52480m = z3;
        this.f52481n = str;
        this.f52482o = str2;
        this.f52483p = new ArrayList<>(map.values());
        this.f52484q = map;
    }

    /* renamed from: a */
    public ArrayList<Scope> mo73043a() {
        return new ArrayList<>(this.f52476i);
    }

    /* renamed from: b */
    public Account mo73044b() {
        return this.f52477j;
    }

    /* renamed from: c */
    public boolean mo73045c() {
        return this.f52478k;
    }

    /* renamed from: d */
    public boolean mo73046d() {
        return this.f52479l;
    }

    /* renamed from: e */
    public boolean mo73047e() {
        return this.f52480m;
    }

    /* renamed from: f */
    public String mo73049f() {
        return this.f52481n;
    }

    /* renamed from: g */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> mo73050g() {
        return this.f52483p;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Map<Integer, GoogleSignInOptionsExtensionParcelable> m78134b(List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : list) {
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.mo73075a()), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f52475h);
        SafeParcelWriter.writeTypedList(parcel, 2, mo73043a(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, mo73044b(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, mo73045c());
        SafeParcelWriter.writeBoolean(parcel, 5, mo73046d());
        SafeParcelWriter.writeBoolean(parcel, 6, mo73047e());
        SafeParcelWriter.writeString(parcel, 7, mo73049f(), false);
        SafeParcelWriter.writeString(parcel, 8, this.f52482o, false);
        SafeParcelWriter.writeTypedList(parcel, 9, mo73050g(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r1.equals(r4.mo73044b()) != false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0066, code lost:
        if (r3.f52481n.equals(r4.mo73049f()) != false) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f52476i;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Scope scope = arrayList2.get(i);
            i++;
            arrayList.add(scope.mo73201a());
        }
        Collections.sort(arrayList);
        return new C21589a().mo73084a(arrayList).mo73084a(this.f52477j).mo73084a(this.f52481n).mo73085a(this.f52480m).mo73085a(this.f52478k).mo73085a(this.f52479l).mo73083a();
    }

    /* renamed from: h */
    public final String mo73051h() {
        return m78142i().toString();
    }

    /* renamed from: i */
    private final JSONObject m78142i() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f52476i, f52474r);
            ArrayList<Scope> arrayList = this.f52476i;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Scope scope = arrayList.get(i);
                i++;
                jSONArray.put(scope.mo73201a());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f52477j;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f52478k);
            jSONObject.put("forceCodeForRefreshToken", this.f52480m);
            jSONObject.put("serverAuthRequested", this.f52479l);
            if (!TextUtils.isEmpty(this.f52481n)) {
                jSONObject.put("serverClientId", this.f52481n);
            }
            if (!TextUtils.isEmpty(this.f52482o)) {
                jSONObject.put("hostedDomain", this.f52482o);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, C21585g gVar) {
        this(3, arrayList, account, z, z2, z3, str, str2, map);
    }

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f52470d = scope;
        f52473g = new C21576a().mo73055a(scope, new Scope[0]).mo73059d();
    }
}
