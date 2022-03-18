package com.bytedance.ee.bear.contract.route.lark;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.list.dto.C8275a;
import java.util.ArrayList;

public class SpaceMultipleDriveFileRouteBean extends SpaceRouteBean {
    public static final Parcelable.Creator<SpaceMultipleDriveFileRouteBean> CREATOR = new Parcelable.Creator<SpaceMultipleDriveFileRouteBean>() {
        /* class com.bytedance.ee.bear.contract.route.lark.SpaceMultipleDriveFileRouteBean.C52171 */

        /* renamed from: a */
        public SpaceMultipleDriveFileRouteBean[] newArray(int i) {
            return new SpaceMultipleDriveFileRouteBean[i];
        }

        /* renamed from: a */
        public SpaceMultipleDriveFileRouteBean createFromParcel(Parcel parcel) {
            return new SpaceMultipleDriveFileRouteBean(parcel);
        }
    };

    /* renamed from: a */
    private int f14933a;

    /* renamed from: b */
    private ArrayList<DriveFile> f14934b;

    @Override // com.bytedance.ee.bear.contract.route.lark.SpaceRouteBean
    public int describeContents() {
        return 0;
    }

    public static class DriveFile implements Parcelable {
        public static final Parcelable.Creator<DriveFile> CREATOR = new Parcelable.Creator<DriveFile>() {
            /* class com.bytedance.ee.bear.contract.route.lark.SpaceMultipleDriveFileRouteBean.DriveFile.C52181 */

            /* renamed from: a */
            public DriveFile[] newArray(int i) {
                return new DriveFile[i];
            }

            /* renamed from: a */
            public DriveFile createFromParcel(Parcel parcel) {
                return new DriveFile(parcel);
            }
        };

        /* renamed from: a */
        private String f14935a;

        /* renamed from: b */
        private String f14936b;

        /* renamed from: c */
        private String f14937c;

        /* renamed from: d */
        private String f14938d;

        public int describeContents() {
            return 0;
        }

        public DriveFile() {
        }

        /* renamed from: a */
        public String mo20945a() {
            return this.f14935a;
        }

        /* renamed from: b */
        public String mo20947b() {
            return this.f14937c;
        }

        /* renamed from: c */
        public String mo20949c() {
            return this.f14938d;
        }

        /* renamed from: a */
        public void mo20946a(String str) {
            this.f14935a = str;
        }

        /* renamed from: b */
        public void mo20948b(String str) {
            this.f14936b = str;
        }

        /* renamed from: c */
        public void mo20950c(String str) {
            this.f14938d = str;
        }

        protected DriveFile(Parcel parcel) {
            this.f14935a = parcel.readString();
            this.f14936b = parcel.readString();
            this.f14937c = parcel.readString();
            this.f14938d = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f14935a);
            parcel.writeString(this.f14936b);
            parcel.writeString(this.f14937c);
            parcel.writeString(this.f14938d);
        }
    }

    /* renamed from: a */
    public ArrayList<DriveFile> mo20939a() {
        return this.f14934b;
    }

    public SpaceMultipleDriveFileRouteBean() {
        mo20957a(C8275a.f22375h.mo32555b());
    }

    /* renamed from: a */
    public void mo20940a(ArrayList<DriveFile> arrayList) {
        this.f14934b = arrayList;
    }

    protected SpaceMultipleDriveFileRouteBean(Parcel parcel) {
        super(parcel);
        this.f14933a = parcel.readInt();
        this.f14934b = parcel.createTypedArrayList(DriveFile.CREATOR);
    }

    @Override // com.bytedance.ee.bear.contract.route.lark.SpaceRouteBean
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f14933a);
        parcel.writeTypedList(this.f14934b);
    }
}
