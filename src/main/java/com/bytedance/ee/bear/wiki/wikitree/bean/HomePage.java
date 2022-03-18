package com.bytedance.ee.bear.wiki.wikitree.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import java.io.Serializable;

public class HomePage implements Parcelable, NonProguard, Serializable, Cloneable {
    public static final Parcelable.Creator<HomePage> CREATOR = new Parcelable.Creator<HomePage>() {
        /* class com.bytedance.ee.bear.wiki.wikitree.bean.HomePage.C120731 */

        /* renamed from: a */
        public HomePage[] newArray(int i) {
            return new HomePage[i];
        }

        /* renamed from: a */
        public HomePage createFromParcel(Parcel parcel) {
            return new HomePage(parcel);
        }
    };
    private static final long serialVersionUID = 4915082666319992833L;
    private String mObjToken;
    private int mObjType;
    private String mSpaceIcon;
    private String mSpaceId;
    private String mSpaceName;
    private String mWikiToken;

    public int describeContents() {
        return 0;
    }

    public String getObjToken() {
        return this.mObjToken;
    }

    public int getObjType() {
        return this.mObjType;
    }

    public String getSpaceIcon() {
        return this.mSpaceIcon;
    }

    public String getSpaceId() {
        return this.mSpaceId;
    }

    public String getSpaceName() {
        return this.mSpaceName;
    }

    public String getWikiToken() {
        return this.mWikiToken;
    }

    @Override // java.lang.Object
    public HomePage clone() {
        try {
            return (HomePage) super.clone();
        } catch (Exception e) {
            C13479a.m54761a("Wiki_HomePage", e);
            return null;
        }
    }

    protected HomePage(Parcel parcel) {
        this.mWikiToken = parcel.readString();
        this.mObjToken = parcel.readString();
        this.mObjType = parcel.readInt();
        this.mSpaceId = parcel.readString();
        this.mSpaceName = parcel.readString();
        this.mSpaceIcon = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mWikiToken);
        parcel.writeString(this.mObjToken);
        parcel.writeInt(this.mObjType);
        parcel.writeString(this.mSpaceId);
        parcel.writeString(this.mSpaceName);
        parcel.writeString(this.mSpaceIcon);
    }

    public HomePage(String str, String str2, int i, String str3, String str4, String str5) {
        this.mWikiToken = str;
        this.mObjToken = str2;
        this.mObjType = i;
        this.mSpaceId = str3;
        this.mSpaceName = str4;
        this.mSpaceIcon = str5;
    }
}
