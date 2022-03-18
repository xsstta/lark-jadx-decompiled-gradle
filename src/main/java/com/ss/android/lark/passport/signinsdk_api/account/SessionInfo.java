package com.ss.android.lark.passport.signinsdk_api.account;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class SessionInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<SessionInfo> CREATOR = new Parcelable.Creator<SessionInfo>() {
        /* class com.ss.android.lark.passport.signinsdk_api.account.SessionInfo.C493371 */

        /* renamed from: a */
        public SessionInfo[] newArray(int i) {
            return new SessionInfo[i];
        }

        /* renamed from: a */
        public SessionInfo createFromParcel(Parcel parcel) {
            return new SessionInfo(parcel);
        }
    };
    private String hostUrl;
    @JSONField(alternateNames = {"value", "session"})
    private String session;
    @JSONField(alternateNames = {"name", "sessionName"})
    private String sessionName;

    public int describeContents() {
        return 0;
    }

    public SessionInfo() {
    }

    public String getHostUrl() {
        return this.hostUrl;
    }

    public String getSession() {
        return this.session;
    }

    public String getSessionName() {
        return this.sessionName;
    }

    public void setHostUrl(String str) {
        this.hostUrl = str;
    }

    public void setSession(String str) {
        this.session = str;
    }

    public void setSessionName(String str) {
        this.sessionName = str;
    }

    protected SessionInfo(Parcel parcel) {
        this.hostUrl = parcel.readString();
        this.sessionName = parcel.readString();
        this.session = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.hostUrl);
        parcel.writeString(this.sessionName);
        parcel.writeString(this.session);
    }

    public SessionInfo(String str, String str2, String str3) {
        this.hostUrl = str;
        this.sessionName = str2;
        this.session = str3;
    }
}
