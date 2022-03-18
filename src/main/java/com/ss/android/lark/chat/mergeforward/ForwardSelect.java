package com.ss.android.lark.chat.mergeforward;

import android.os.Parcel;
import android.os.Parcelable;

public class ForwardSelect implements IForwardSelectContract {
    public static final Parcelable.Creator<ForwardSelect> CREATOR = new Parcelable.Creator<ForwardSelect>() {
        /* class com.ss.android.lark.chat.mergeforward.ForwardSelect.C340361 */

        /* renamed from: a */
        public ForwardSelect[] newArray(int i) {
            return new ForwardSelect[i];
        }

        /* renamed from: a */
        public ForwardSelect createFromParcel(Parcel parcel) {
            return new ForwardSelect();
        }
    };

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }
}
