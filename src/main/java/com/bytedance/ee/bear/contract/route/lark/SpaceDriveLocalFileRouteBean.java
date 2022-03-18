package com.bytedance.ee.bear.contract.route.lark;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.list.dto.C8275a;
import java.util.ArrayList;

public class SpaceDriveLocalFileRouteBean extends SpaceRouteBean {
    public static final Parcelable.Creator<SpaceDriveLocalFileRouteBean> CREATOR = new Parcelable.Creator<SpaceDriveLocalFileRouteBean>() {
        /* class com.bytedance.ee.bear.contract.route.lark.SpaceDriveLocalFileRouteBean.C52151 */

        /* renamed from: a */
        public SpaceDriveLocalFileRouteBean[] newArray(int i) {
            return new SpaceDriveLocalFileRouteBean[i];
        }

        /* renamed from: a */
        public SpaceDriveLocalFileRouteBean createFromParcel(Parcel parcel) {
            return new SpaceDriveLocalFileRouteBean(parcel);
        }
    };

    /* renamed from: a */
    private int f14927a;

    /* renamed from: b */
    private ArrayList<DriveLocalFile> f14928b;

    @Override // com.bytedance.ee.bear.contract.route.lark.SpaceRouteBean
    public int describeContents() {
        return 0;
    }

    public static class DriveLocalFile implements Parcelable {
        public static final Parcelable.Creator<DriveLocalFile> CREATOR = new Parcelable.Creator<DriveLocalFile>() {
            /* class com.bytedance.ee.bear.contract.route.lark.SpaceDriveLocalFileRouteBean.DriveLocalFile.C52161 */

            /* renamed from: a */
            public DriveLocalFile[] newArray(int i) {
                return new DriveLocalFile[i];
            }

            /* renamed from: a */
            public DriveLocalFile createFromParcel(Parcel parcel) {
                return new DriveLocalFile(parcel);
            }
        };

        /* renamed from: a */
        private String f14929a;

        /* renamed from: b */
        private String f14930b;

        /* renamed from: c */
        private String f14931c;

        /* renamed from: d */
        private boolean f14932d;

        public int describeContents() {
            return 0;
        }

        public DriveLocalFile() {
        }

        protected DriveLocalFile(Parcel parcel) {
            boolean z;
            this.f14929a = parcel.readString();
            this.f14930b = parcel.readString();
            this.f14931c = parcel.readString();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f14932d = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f14929a);
            parcel.writeString(this.f14930b);
            parcel.writeString(this.f14931c);
            parcel.writeByte(this.f14932d ? (byte) 1 : 0);
        }
    }

    public SpaceDriveLocalFileRouteBean() {
        mo20957a(C8275a.f22375h.mo32555b());
    }

    protected SpaceDriveLocalFileRouteBean(Parcel parcel) {
        super(parcel);
        this.f14927a = parcel.readInt();
        this.f14928b = parcel.createTypedArrayList(DriveLocalFile.CREATOR);
    }

    @Override // com.bytedance.ee.bear.contract.route.lark.SpaceRouteBean
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f14927a);
        parcel.writeTypedList(this.f14928b);
    }
}
