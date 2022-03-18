package com.ss.android.lark.appstrategy.service.impl.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;

public class SuccessResultWrapper implements Parcelable {
    public static final Parcelable.Creator<SuccessResultWrapper> CREATOR = new Parcelable.Creator<SuccessResultWrapper>() {
        /* class com.ss.android.lark.appstrategy.service.impl.dto.SuccessResultWrapper.C292791 */

        /* renamed from: a */
        public SuccessResultWrapper[] newArray(int i) {
            return new SuccessResultWrapper[i];
        }

        /* renamed from: a */
        public SuccessResultWrapper createFromParcel(Parcel parcel) {
            return new SuccessResultWrapper(parcel);
        }
    };

    /* renamed from: a */
    public Serializable f73298a;

    /* renamed from: b */
    public HashMap<String, Serializable> f73299b;

    public int describeContents() {
        return 0;
    }

    public SuccessResultWrapper(Serializable serializable) {
        this(serializable, null);
    }

    protected SuccessResultWrapper(Parcel parcel) {
        this.f73298a = parcel.readSerializable();
        this.f73299b = (HashMap) parcel.readSerializable();
    }

    public SuccessResultWrapper(Serializable serializable, HashMap<String, Serializable> hashMap) {
        this.f73298a = serializable;
        this.f73299b = hashMap;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f73298a);
        parcel.writeSerializable(this.f73299b);
    }
}
