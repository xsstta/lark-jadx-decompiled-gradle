package com.ss.android.openbusiness.bot.net.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Avatar implements Parcelable {
    public static final Parcelable.Creator<Avatar> CREATOR = new Parcelable.Creator<Avatar>() {
        /* class com.ss.android.openbusiness.bot.net.data.Avatar.C595351 */

        /* renamed from: a */
        public Avatar[] newArray(int i) {
            return new Avatar[i];
        }

        /* renamed from: a */
        public Avatar createFromParcel(Parcel parcel) {
            return new Avatar(parcel);
        }
    };
    @SerializedName("key")
    @Expose

    /* renamed from: a */
    private String f147781a;
    @SerializedName("fs_unit")
    @Expose

    /* renamed from: b */
    private String f147782b;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public String mo202887a() {
        return this.f147781a;
    }

    protected Avatar(Parcel parcel) {
        this.f147781a = parcel.readString();
        this.f147782b = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f147781a);
        parcel.writeString(this.f147782b);
    }
}
