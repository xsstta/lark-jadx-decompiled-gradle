package com.tt.miniapp.video.base;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public interface ITTVideoController {

    public static class ShowStateEntity implements Parcelable {
        public static final Parcelable.Creator<ShowStateEntity> CREATOR = new Parcelable.Creator<ShowStateEntity>() {
            /* class com.tt.miniapp.video.base.ITTVideoController.ShowStateEntity.C670821 */

            /* renamed from: a */
            public ShowStateEntity[] newArray(int i) {
                return new ShowStateEntity[i];
            }

            /* renamed from: a */
            public ShowStateEntity createFromParcel(Parcel parcel) {
                return new ShowStateEntity(parcel);
            }
        };

        /* renamed from: a */
        private boolean f169076a;

        /* renamed from: b */
        private boolean f169077b;

        /* renamed from: c */
        private boolean f169078c;

        /* renamed from: d */
        private boolean f169079d;

        /* renamed from: e */
        private String f169080e;

        /* renamed from: f */
        private boolean f169081f;

        /* renamed from: g */
        private boolean f169082g;

        /* renamed from: h */
        private String f169083h;

        /* renamed from: i */
        private int f169084i;

        public int describeContents() {
            return 0;
        }

        public ShowStateEntity() {
        }

        /* renamed from: a */
        public int mo233200a() {
            return this.f169084i;
        }

        /* renamed from: c */
        public boolean mo233208c() {
            return this.f169081f;
        }

        /* renamed from: d */
        public boolean mo233210d() {
            return this.f169082g;
        }

        /* renamed from: e */
        public String mo233213e() {
            return this.f169080e;
        }

        /* renamed from: b */
        public boolean mo233206b() {
            return this.f169076a;
        }

        /* renamed from: f */
        public boolean mo233215f() {
            if (!this.f169076a || !this.f169077b) {
                return false;
            }
            return true;
        }

        /* renamed from: i */
        public boolean mo233218i() {
            if (!this.f169076a || !this.f169079d) {
                return false;
            }
            return true;
        }

        /* renamed from: g */
        public boolean mo233216g() {
            if (!this.f169076a || !this.f169078c || !TextUtils.equals(this.f169083h, "center")) {
                return false;
            }
            return true;
        }

        /* renamed from: h */
        public boolean mo233217h() {
            if (!this.f169076a || !this.f169078c || !TextUtils.equals(this.f169083h, "bottom")) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public ShowStateEntity mo233204b(String str) {
            this.f169083h = str;
            return this;
        }

        /* renamed from: c */
        public ShowStateEntity mo233207c(boolean z) {
            this.f169076a = z;
            return this;
        }

        /* renamed from: d */
        public ShowStateEntity mo233209d(boolean z) {
            this.f169077b = z;
            return this;
        }

        /* renamed from: e */
        public ShowStateEntity mo233212e(boolean z) {
            this.f169078c = z;
            return this;
        }

        /* renamed from: f */
        public ShowStateEntity mo233214f(boolean z) {
            this.f169079d = z;
            return this;
        }

        /* renamed from: a */
        public ShowStateEntity mo233201a(int i) {
            this.f169084i = i;
            return this;
        }

        /* renamed from: b */
        public ShowStateEntity mo233205b(boolean z) {
            this.f169082g = z;
            return this;
        }

        /* renamed from: a */
        public ShowStateEntity mo233202a(String str) {
            this.f169080e = str;
            return this;
        }

        /* renamed from: a */
        public ShowStateEntity mo233203a(boolean z) {
            this.f169081f = z;
            return this;
        }

        protected ShowStateEntity(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5 = true;
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f169076a = z;
            if (parcel.readByte() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f169077b = z2;
            if (parcel.readByte() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f169078c = z3;
            this.f169080e = parcel.readString();
            this.f169083h = parcel.readString();
            if (parcel.readByte() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f169081f = z4;
            this.f169082g = parcel.readByte() == 0 ? false : z5;
            this.f169084i = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(this.f169076a ? (byte) 1 : 0);
            parcel.writeByte(this.f169077b ? (byte) 1 : 0);
            parcel.writeByte(this.f169078c ? (byte) 1 : 0);
            parcel.writeString(this.f169080e);
            parcel.writeString(this.f169083h);
            parcel.writeByte(this.f169081f ? (byte) 1 : 0);
            parcel.writeByte(this.f169082g ? (byte) 1 : 0);
            parcel.writeInt(this.f169084i);
        }
    }

    /* renamed from: com.tt.miniapp.video.base.ITTVideoController$a */
    public static class C67083a {

        /* renamed from: a */
        private boolean f169085a;

        /* renamed from: b */
        private boolean f169086b;

        /* renamed from: c */
        private boolean f169087c;

        /* renamed from: d */
        private int f169088d = -1;

        /* renamed from: e */
        private int f169089e;

        /* renamed from: f */
        private boolean f169090f;

        /* renamed from: g */
        private String f169091g;

        /* renamed from: h */
        private int f169092h;

        /* renamed from: i */
        private long f169093i;

        /* renamed from: j */
        private String f169094j;

        /* renamed from: k */
        private long f169095k;

        /* renamed from: l */
        private int f169096l = -1;

        /* renamed from: m */
        private int f169097m;

        /* renamed from: n */
        private int f169098n;

        /* renamed from: o */
        private String f169099o;

        /* renamed from: p */
        private String f169100p;

        /* renamed from: q */
        private String f169101q;

        /* renamed from: r */
        private String f169102r;

        /* renamed from: b */
        public int mo233228b() {
            return this.f169088d;
        }

        /* renamed from: e */
        public int mo233237e() {
            return this.f169089e;
        }

        /* renamed from: f */
        public String mo233238f() {
            return this.f169100p;
        }

        /* renamed from: g */
        public boolean mo233239g() {
            return this.f169085a;
        }

        /* renamed from: h */
        public String mo233240h() {
            return this.f169099o;
        }

        /* renamed from: i */
        public String mo233241i() {
            return this.f169091g;
        }

        /* renamed from: j */
        public int mo233242j() {
            return this.f169092h;
        }

        /* renamed from: k */
        public long mo233243k() {
            return this.f169093i;
        }

        /* renamed from: l */
        public String mo233244l() {
            return this.f169094j;
        }

        /* renamed from: m */
        public long mo233245m() {
            return this.f169095k;
        }

        /* renamed from: n */
        public String mo233246n() {
            return this.f169101q;
        }

        /* renamed from: o */
        public String mo233247o() {
            return this.f169102r;
        }

        /* renamed from: p */
        public int mo233248p() {
            return this.f169097m;
        }

        /* renamed from: q */
        public int mo233249q() {
            return this.f169098n;
        }

        /* renamed from: d */
        public boolean mo233236d() {
            return this.f169090f;
        }

        /* renamed from: c */
        public boolean mo233234c() {
            return this.f169087c;
        }

        /* renamed from: a */
        public boolean mo233227a() {
            return this.f169086b;
        }

        /* renamed from: a */
        public C67083a mo233224a(int i) {
            this.f169089e = i;
            return this;
        }

        /* renamed from: c */
        public C67083a mo233232c(String str) {
            this.f169101q = str;
            return this;
        }

        /* renamed from: d */
        public C67083a mo233235d(boolean z) {
            this.f169087c = z;
            return this;
        }

        /* renamed from: a */
        public C67083a mo233225a(String str) {
            this.f169099o = str;
            return this;
        }

        /* renamed from: b */
        public C67083a mo233229b(int i) {
            this.f169088d = i;
            return this;
        }

        /* renamed from: c */
        public C67083a mo233233c(boolean z) {
            this.f169086b = z;
            return this;
        }

        /* renamed from: a */
        public C67083a mo233226a(boolean z) {
            this.f169090f = z;
            return this;
        }

        /* renamed from: b */
        public C67083a mo233230b(String str) {
            this.f169100p = str;
            return this;
        }

        /* renamed from: b */
        public C67083a mo233231b(boolean z) {
            this.f169085a = z;
            return this;
        }
    }
}
