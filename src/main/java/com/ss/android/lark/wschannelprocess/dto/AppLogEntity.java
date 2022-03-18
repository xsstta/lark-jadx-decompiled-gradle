package com.ss.android.lark.wschannelprocess.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.log.Log;
import org.json.JSONException;
import org.json.JSONObject;

public class AppLogEntity implements Parcelable, AbstractC59312a {
    public static final Parcelable.Creator<AppLogEntity> CREATOR = new Parcelable.Creator<AppLogEntity>() {
        /* class com.ss.android.lark.wschannelprocess.dto.AppLogEntity.C593101 */

        /* renamed from: a */
        public AppLogEntity[] newArray(int i) {
            return new AppLogEntity[i];
        }

        /* renamed from: a */
        public AppLogEntity createFromParcel(Parcel parcel) {
            return new AppLogEntity(parcel);
        }
    };

    /* renamed from: a */
    private String f147274a;

    /* renamed from: b */
    private String f147275b;

    /* renamed from: c */
    private String f147276c;

    /* renamed from: d */
    private long f147277d;

    /* renamed from: e */
    private long f147278e;

    /* renamed from: f */
    private String f147279f;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public String mo201593a() {
        return this.f147274a;
    }

    /* renamed from: b */
    public String mo201594b() {
        return this.f147275b;
    }

    /* renamed from: c */
    public String mo201595c() {
        return this.f147276c;
    }

    /* renamed from: d */
    public long mo201596d() {
        return this.f147277d;
    }

    /* renamed from: e */
    public long mo201598e() {
        return this.f147278e;
    }

    /* renamed from: f */
    public String mo201599f() {
        return this.f147279f;
    }

    /* renamed from: g */
    public String mo201600g() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("category", this.f147274a);
            jSONObject.put("label", this.f147276c);
            jSONObject.put("value", this.f147277d);
            jSONObject.put("extValue", this.f147278e);
            jSONObject.put("tag", this.f147275b);
            jSONObject.put("param", this.f147279f);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.m165383e("AppLogEntity", "parse to string error" + e.getMessage());
            return null;
        }
    }

    protected AppLogEntity(Parcel parcel) {
        this.f147274a = parcel.readString();
        this.f147275b = parcel.readString();
        this.f147276c = parcel.readString();
        this.f147277d = parcel.readLong();
        this.f147278e = parcel.readLong();
        this.f147279f = parcel.readString();
    }

    /* renamed from: a */
    public static AppLogEntity m230296a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new AppLogEntity(jSONObject.getString("category"), jSONObject.getString("tag"), jSONObject.getString("label"), jSONObject.getLong("value"), jSONObject.getLong("extValue"), jSONObject.getString("param"));
        } catch (JSONException e) {
            Log.m165383e("AppLogEntity", "parse to data error" + e.getMessage());
            return null;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f147274a);
        parcel.writeString(this.f147275b);
        parcel.writeString(this.f147276c);
        parcel.writeLong(this.f147277d);
        parcel.writeLong(this.f147278e);
        parcel.writeString(this.f147279f);
    }

    public AppLogEntity(String str, String str2, String str3, long j, long j2, String str4) {
        this.f147274a = str;
        this.f147275b = str2;
        this.f147276c = str3;
        this.f147277d = j;
        this.f147278e = j2;
        this.f147279f = str4;
    }
}
