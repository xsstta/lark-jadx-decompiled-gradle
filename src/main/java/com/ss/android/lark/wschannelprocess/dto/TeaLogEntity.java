package com.ss.android.lark.wschannelprocess.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.log.Log;
import org.json.JSONException;
import org.json.JSONObject;

public class TeaLogEntity implements Parcelable, AbstractC59312a {
    public static final Parcelable.Creator<TeaLogEntity> CREATOR = new Parcelable.Creator<TeaLogEntity>() {
        /* class com.ss.android.lark.wschannelprocess.dto.TeaLogEntity.C593111 */

        /* renamed from: a */
        public TeaLogEntity[] newArray(int i) {
            return new TeaLogEntity[i];
        }

        /* renamed from: a */
        public TeaLogEntity createFromParcel(Parcel parcel) {
            return new TeaLogEntity(parcel);
        }
    };

    /* renamed from: a */
    private String f147280a;

    /* renamed from: b */
    private String f147281b;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public String mo201606a() {
        return this.f147280a;
    }

    /* renamed from: b */
    public String mo201607b() {
        return this.f147281b;
    }

    /* renamed from: c */
    public String mo201608c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("eventName", this.f147280a);
            jSONObject.put("eventParams", this.f147281b);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.m165383e("TeaLogEntity", "parse to string error" + e.getMessage());
            return null;
        }
    }

    protected TeaLogEntity(Parcel parcel) {
        this.f147280a = parcel.readString();
        this.f147281b = parcel.readString();
    }

    /* renamed from: a */
    public static TeaLogEntity m230306a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new TeaLogEntity(jSONObject.getString("eventName"), jSONObject.getString("eventParams"));
        } catch (JSONException e) {
            Log.m165383e("TeaLogEntity", "parse to data error" + e.getMessage());
            return null;
        }
    }

    public TeaLogEntity(String str, String str2) {
        this.f147280a = str;
        this.f147281b = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f147280a);
        parcel.writeString(this.f147281b);
    }
}
