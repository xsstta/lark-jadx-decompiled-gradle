package com.bytedance.ee.bear.contract.leanmode;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import org.json.JSONObject;

public class CCMConfig implements Parcelable {
    public static final Parcelable.Creator<CCMConfig> CREATOR = new Parcelable.Creator<CCMConfig>() {
        /* class com.bytedance.ee.bear.contract.leanmode.CCMConfig.C51941 */

        /* renamed from: a */
        public CCMConfig[] newArray(int i) {
            return new CCMConfig[i];
        }

        /* renamed from: a */
        public CCMConfig createFromParcel(Parcel parcel) {
            return new CCMConfig(parcel);
        }
    };

    /* renamed from: a */
    private boolean f14905a;

    /* renamed from: b */
    private long f14906b = 86400000;

    /* renamed from: c */
    private SubConfig f14907c = new SubConfig();

    /* renamed from: d */
    private SubConfig f14908d = new SubConfig();

    /* renamed from: e */
    private SubConfig f14909e = new SubConfig();

    /* renamed from: f */
    private SubConfig f14910f = new SubConfig();

    /* renamed from: g */
    private SubConfig f14911g = new SubConfig();

    /* renamed from: h */
    private SubConfig f14912h = new SubConfig();

    /* renamed from: i */
    private SubConfig f14913i = new SubConfig();

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public boolean mo20775a() {
        return this.f14905a;
    }

    /* renamed from: b */
    public long mo20776b() {
        return this.f14906b;
    }

    public static class SubConfig implements Parcelable {
        public static final Parcelable.Creator<SubConfig> CREATOR = new Parcelable.Creator<SubConfig>() {
            /* class com.bytedance.ee.bear.contract.leanmode.CCMConfig.SubConfig.C51951 */

            /* renamed from: a */
            public SubConfig[] newArray(int i) {
                return new SubConfig[i];
            }

            /* renamed from: a */
            public SubConfig createFromParcel(Parcel parcel) {
                return new SubConfig(parcel);
            }
        };

        /* renamed from: a */
        public boolean f14914a = true;

        public int describeContents() {
            return 0;
        }

        public SubConfig() {
        }

        public String toString() {
            return "SubConfig{isEnable=" + this.f14914a + '}';
        }

        protected SubConfig(Parcel parcel) {
            boolean z = true;
            this.f14914a = parcel.readByte() == 0 ? false : z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(this.f14914a ? (byte) 1 : 0);
        }
    }

    /* renamed from: c */
    public SubConfig mo20777c() {
        if (this.f14907c == null) {
            this.f14907c = new SubConfig();
        }
        return this.f14907c;
    }

    /* renamed from: d */
    public SubConfig mo20778d() {
        if (this.f14908d == null) {
            this.f14908d = new SubConfig();
        }
        return this.f14908d;
    }

    /* renamed from: e */
    public SubConfig mo20780e() {
        if (this.f14909e == null) {
            this.f14909e = new SubConfig();
        }
        return this.f14909e;
    }

    /* renamed from: f */
    public SubConfig mo20781f() {
        if (this.f14911g == null) {
            this.f14911g = new SubConfig();
        }
        return this.f14911g;
    }

    /* renamed from: g */
    public SubConfig mo20782g() {
        if (this.f14913i == null) {
            this.f14913i = new SubConfig();
        }
        return this.f14913i;
    }

    /* renamed from: h */
    public SubConfig mo20783h() {
        if (this.f14912h == null) {
            this.f14912h = new SubConfig();
        }
        return this.f14912h;
    }

    public CCMConfig() {
    }

    public String toString() {
        return "CCMConfig{isNeedClearData=" + this.f14905a + ", cacheDataTimeInMills=" + this.f14906b + ", folderConfig=" + this.f14907c + ", starConfig=" + this.f14908d + ", offlineConfig=" + this.f14909e + ", pinConfig=" + this.f14910f + ", wikiConfig=" + this.f14911g + ", digitalLoadingConfig=" + this.f14912h + ", fetchFullDataConfig=" + this.f14913i + '}';
    }

    public CCMConfig(Parcel parcel) {
        boolean z;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f14905a = z;
        this.f14906b = parcel.readLong();
        this.f14907c = (SubConfig) parcel.readParcelable(SubConfig.class.getClassLoader());
        this.f14908d = (SubConfig) parcel.readParcelable(SubConfig.class.getClassLoader());
        this.f14909e = (SubConfig) parcel.readParcelable(SubConfig.class.getClassLoader());
        this.f14910f = (SubConfig) parcel.readParcelable(SubConfig.class.getClassLoader());
        this.f14911g = (SubConfig) parcel.readParcelable(SubConfig.class.getClassLoader());
        this.f14912h = (SubConfig) parcel.readParcelable(SubConfig.class.getClassLoader());
        this.f14913i = (SubConfig) parcel.readParcelable(SubConfig.class.getClassLoader());
    }

    /* renamed from: a */
    public static CCMConfig m21211a(String str) {
        long j;
        boolean z;
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("mSection").optJSONObject("mFeatures");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("leanMode");
            long j2 = 0;
            if (optJSONObject2 != null) {
                boolean optBoolean = optJSONObject2.optBoolean("mIsOn", false);
                String optString = optJSONObject2.optString("mTraits");
                if (!TextUtils.isEmpty(optString)) {
                    j2 = new JSONObject(optString).optLong("sdkDataTimeLimit") * 1000;
                }
                z = optBoolean;
                j = j2;
            } else {
                j = 0;
                z = false;
            }
            CCMConfig cCMConfig = new CCMConfig(z, j, m21210a(optJSONObject, "ccm.folder"), m21210a(optJSONObject, "ccm.star"), m21210a(optJSONObject, "ccm.offline"), m21210a(optJSONObject, "ccm.pin"), m21210a(optJSONObject, "ccm.wiki"), m21210a(optJSONObject, "ccm.fetchFullData"), m21210a(optJSONObject, "ccm.digitalLoading"));
            C13479a.m54764b("CCMConfig", cCMConfig.toString());
            return cCMConfig;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("origin config json:");
            if (str == null) {
                str = "null";
            }
            sb.append(str);
            C13479a.m54759a("CCMConfig", sb.toString(), e);
            return new CCMConfig();
        }
    }

    /* renamed from: a */
    private static SubConfig m21210a(JSONObject jSONObject, String str) {
        SubConfig subConfig = new SubConfig();
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject != null) {
                subConfig.f14914a = optJSONObject.optBoolean("mIsOn");
            }
        } catch (Exception e) {
            C13479a.m54761a("CCMConfig", e);
        }
        return subConfig;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f14905a ? (byte) 1 : 0);
        parcel.writeLong(this.f14906b);
        parcel.writeParcelable(this.f14907c, i);
        parcel.writeParcelable(this.f14908d, i);
        parcel.writeParcelable(this.f14909e, i);
        parcel.writeParcelable(this.f14910f, i);
        parcel.writeParcelable(this.f14911g, i);
        parcel.writeParcelable(this.f14912h, i);
        parcel.writeParcelable(this.f14913i, i);
    }

    public CCMConfig(boolean z, long j, SubConfig subConfig, SubConfig subConfig2, SubConfig subConfig3, SubConfig subConfig4, SubConfig subConfig5, SubConfig subConfig6, SubConfig subConfig7) {
        this.f14905a = z;
        this.f14906b = j;
        this.f14907c = subConfig;
        this.f14908d = subConfig2;
        this.f14909e = subConfig3;
        this.f14910f = subConfig4;
        this.f14911g = subConfig5;
        this.f14913i = subConfig6;
        this.f14912h = subConfig7;
    }
}
