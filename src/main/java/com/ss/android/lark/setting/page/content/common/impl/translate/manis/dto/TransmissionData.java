package com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.C54258b;

public class TransmissionData implements Parcelable {
    public static final Parcelable.Creator<TransmissionData> CREATOR = new Parcelable.Creator<TransmissionData>() {
        /* class com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.TransmissionData.C542651 */

        /* renamed from: a */
        public TransmissionData[] newArray(int i) {
            return new TransmissionData[i];
        }

        /* renamed from: a */
        public TransmissionData createFromParcel(Parcel parcel) {
            return new TransmissionData(parcel);
        }
    };

    /* renamed from: a */
    private Parcelable f134321a;

    /* renamed from: b */
    private Parcel f134322b;

    public int describeContents() {
        return 0;
    }

    public TransmissionData(Parcelable parcelable) {
        this.f134321a = parcelable;
    }

    protected TransmissionData(Parcel parcel) {
        this.f134322b = C54258b.m210667a(parcel);
    }

    /* renamed from: a */
    public <T extends Parcelable> T mo185733a(Parcelable.Creator<T> creator) {
        T t = (T) this.f134321a;
        if (t != null) {
            return t;
        }
        Parcel parcel = this.f134322b;
        if (parcel == null) {
            return null;
        }
        this.f134321a = creator.createFromParcel(parcel);
        this.f134322b.recycle();
        return (T) this.f134321a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        this.f134321a.writeToParcel(obtain, 0);
        C54258b.m210670a(obtain, parcel);
        obtain.recycle();
    }
}
