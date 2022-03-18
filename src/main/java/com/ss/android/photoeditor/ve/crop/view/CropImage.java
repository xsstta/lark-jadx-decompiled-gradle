package com.ss.android.photoeditor.ve.crop.view;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.photoeditor.ve.crop.view.CropImageView;

public final class CropImage {

    public static final class ActivityResult extends CropImageView.C59869a implements Parcelable {
        public static final Parcelable.Creator<ActivityResult> CREATOR = new Parcelable.Creator<ActivityResult>() {
            /* class com.ss.android.photoeditor.ve.crop.view.CropImage.ActivityResult.C598651 */

            /* renamed from: a */
            public ActivityResult[] newArray(int i) {
                return new ActivityResult[i];
            }

            /* renamed from: a */
            public ActivityResult createFromParcel(Parcel parcel) {
                return new ActivityResult(parcel);
            }
        };

        public int describeContents() {
            return 0;
        }

        protected ActivityResult(Parcel parcel) {
            super(null, (Uri) parcel.readParcelable(Uri.class.getClassLoader()), null, (Uri) parcel.readParcelable(Uri.class.getClassLoader()), (Exception) parcel.readSerializable(), parcel.createFloatArray(), (Rect) parcel.readParcelable(Rect.class.getClassLoader()), (Rect) parcel.readParcelable(Rect.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(mo203831a(), i);
            parcel.writeParcelable(mo203832b(), i);
            parcel.writeSerializable(mo203833c());
            parcel.writeFloatArray(mo203834d());
            parcel.writeParcelable(mo203835e(), i);
            parcel.writeParcelable(mo203836f(), i);
            parcel.writeInt(mo203837g());
            parcel.writeInt(mo203838h());
        }
    }
}
