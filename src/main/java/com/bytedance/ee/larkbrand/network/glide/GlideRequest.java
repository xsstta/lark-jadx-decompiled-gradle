package com.bytedance.ee.larkbrand.network.glide;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.load.p085b.AbstractC2220h;
import com.bumptech.glide.load.p085b.C2219g;
import com.bumptech.glide.util.C2567j;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

public class GlideRequest implements Parcelable, AbstractC2265c {
    public static final Parcelable.Creator<GlideRequest> CREATOR = new Parcelable.Creator<GlideRequest>() {
        /* class com.bytedance.ee.larkbrand.network.glide.GlideRequest.C132721 */

        /* renamed from: a */
        public GlideRequest[] newArray(int i) {
            return new GlideRequest[i];
        }

        /* renamed from: a */
        public GlideRequest createFromParcel(Parcel parcel) {
            return new GlideRequest(parcel);
        }
    };

    /* renamed from: b */
    private String f35151b;

    /* renamed from: c */
    private Map<String, String> f35152c;

    /* renamed from: d */
    private String f35153d = "GET";

    /* renamed from: e */
    private String f35154e;

    /* renamed from: f */
    private volatile byte[] f35155f;

    /* renamed from: g */
    private int f35156g;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public String mo49492a() {
        return this.f35151b;
    }

    /* renamed from: b */
    public Map<String, String> mo49493b() {
        return this.f35152c;
    }

    /* renamed from: c */
    public String mo49494c() {
        return this.f35153d;
    }

    /* renamed from: d */
    public String mo49495d() {
        return this.f35154e;
    }

    /* renamed from: e */
    public String mo49497e() {
        return this.f35151b;
    }

    public GlideRequest() {
    }

    /* renamed from: f */
    private byte[] m54052f() {
        if (this.f35155f == null) {
            this.f35155f = mo49497e().getBytes(f7599a);
        }
        return this.f35155f;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        if (this.f35156g == 0) {
            int hashCode = mo49497e().hashCode();
            this.f35156g = hashCode;
            this.f35156g = (hashCode * 31) + this.f35152c.hashCode();
        }
        return this.f35156g;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(m54052f());
    }

    protected GlideRequest(Parcel parcel) {
        this.f35151b = parcel.readString();
        this.f35153d = parcel.readString();
        this.f35154e = parcel.readString();
        HashMap hashMap = new HashMap();
        this.f35152c = hashMap;
        parcel.readMap(hashMap, getClass().getClassLoader());
        this.f35155f = parcel.createByteArray();
        this.f35156g = parcel.readInt();
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        if (!(obj instanceof C2219g)) {
            return false;
        }
        GlideRequest glideRequest = (GlideRequest) obj;
        if (!mo49497e().equals(glideRequest.mo49497e()) || !this.f35152c.equals(glideRequest.f35152c)) {
            return false;
        }
        return true;
    }

    public GlideRequest(String str, Map<String, String> map) {
        Map<String, String> map2;
        this.f35151b = C2567j.m10896a(str);
        if (map == null) {
            map2 = AbstractC2220h.f7536b.getHeaders();
        } else {
            map2 = (Map) C2567j.m10894a(map);
        }
        this.f35152c = map2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f35151b);
        parcel.writeString(this.f35153d);
        parcel.writeString(this.f35154e);
        parcel.writeMap(this.f35152c);
        parcel.writeByteArray(this.f35155f);
        parcel.writeInt(this.f35156g);
    }

    public GlideRequest(String str, Map<String, String> map, String str2, String str3) {
        Map<String, String> map2;
        this.f35151b = C2567j.m10896a(str);
        if (map == null) {
            map2 = AbstractC2220h.f7536b.getHeaders();
        } else {
            map2 = (Map) C2567j.m10894a(map);
        }
        this.f35152c = map2;
        this.f35153d = str2 == null ? "GET" : str2;
        this.f35154e = str3;
    }
}
