package com.ss.android.lark.passport.signinsdk_api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.passport.signinsdk_api.account.SessionInfo;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SessionResult implements Parcelable, Serializable {
    public static final Parcelable.Creator<SessionResult> CREATOR = new Parcelable.Creator<SessionResult>() {
        /* class com.ss.android.lark.passport.signinsdk_api.entity.SessionResult.C493641 */

        /* renamed from: a */
        public SessionResult[] newArray(int i) {
            return new SessionResult[i];
        }

        /* renamed from: a */
        public SessionResult createFromParcel(Parcel parcel) {
            return new SessionResult(parcel);
        }
    };
    public boolean isOnboarding;
    public int responseCode;
    public String responseMessage;
    public Map<String, SessionInfo> sessionInfoMap = new HashMap();
    public String token;

    public int describeContents() {
        return 0;
    }

    public SessionResult() {
    }

    protected SessionResult(Parcel parcel) {
        this.token = parcel.readString();
        parcel.readMap(this.sessionInfoMap, SessionInfo.class.getClassLoader());
        this.isOnboarding = parcel.readInt() != 1 ? false : true;
        this.responseCode = parcel.readInt();
        this.responseMessage = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.token);
        parcel.writeMap(this.sessionInfoMap);
        parcel.writeInt(this.isOnboarding ? 1 : 0);
        parcel.writeInt(this.responseCode);
        parcel.writeString(this.responseMessage);
    }

    public SessionResult(String str, Map<String, SessionInfo> map, int i, String str2) {
        this.token = str;
        this.sessionInfoMap = map;
        this.responseCode = i;
        this.responseMessage = str2;
        this.isOnboarding = false;
    }
}
