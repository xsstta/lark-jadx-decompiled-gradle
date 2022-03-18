package com.bytedance.ee.bear.contract.route.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.ee.bear.list.dto.Document;

public class WikiDocument extends Document {
    public static final Parcelable.Creator<WikiDocument> CREATOR = new Parcelable.Creator<WikiDocument>() {
        /* class com.bytedance.ee.bear.contract.route.parcelable.WikiDocument.C52231 */

        /* renamed from: a */
        public WikiDocument[] newArray(int i) {
            return new WikiDocument[i];
        }

        /* renamed from: a */
        public WikiDocument createFromParcel(Parcel parcel) {
            return new WikiDocument(parcel);
        }
    };

    /* renamed from: a */
    private String f14960a;

    /* renamed from: b */
    private int f14961b;

    /* renamed from: c */
    private String f14962c;

    /* renamed from: d */
    private String f14963d;

    /* renamed from: e */
    private SpaceCover f14964e;

    /* renamed from: f */
    private String f14965f;

    /* renamed from: g */
    private int f14966g;

    /* renamed from: h */
    private int f14967h;

    @Override // com.bytedance.ee.bear.list.dto.Document
    public int describeContents() {
        return 0;
    }

    public static class SpaceCover implements Parcelable {
        public static final Parcelable.Creator<SpaceCover> CREATOR = new Parcelable.Creator<SpaceCover>() {
            /* class com.bytedance.ee.bear.contract.route.parcelable.WikiDocument.SpaceCover.C52241 */

            /* renamed from: a */
            public SpaceCover[] newArray(int i) {
                return new SpaceCover[i];
            }

            /* renamed from: a */
            public SpaceCover createFromParcel(Parcel parcel) {
                return new SpaceCover(parcel);
            }
        };

        /* renamed from: a */
        public String f14968a;

        /* renamed from: b */
        public String f14969b;

        /* renamed from: c */
        public String f14970c;

        /* renamed from: d */
        public boolean f14971d;

        /* renamed from: e */
        public String f14972e;

        public int describeContents() {
            return 0;
        }

        public SpaceCover() {
        }

        /* renamed from: a */
        public String mo21026a() {
            return this.f14968a;
        }

        /* renamed from: b */
        public String mo21029b() {
            return this.f14969b;
        }

        /* renamed from: c */
        public String mo21031c() {
            return this.f14970c;
        }

        /* renamed from: e */
        public String mo21036e() {
            return this.f14972e;
        }

        /* renamed from: d */
        public boolean mo21034d() {
            return this.f14971d;
        }

        /* renamed from: d */
        public void mo21033d(String str) {
            this.f14972e = str;
        }

        /* renamed from: a */
        public void mo21027a(String str) {
            this.f14968a = str;
        }

        /* renamed from: b */
        public void mo21030b(String str) {
            this.f14969b = str;
        }

        /* renamed from: c */
        public void mo21032c(String str) {
            this.f14970c = str;
        }

        /* renamed from: a */
        public void mo21028a(boolean z) {
            this.f14971d = z;
        }

        protected SpaceCover(Parcel parcel) {
            boolean z;
            this.f14968a = parcel.readString();
            this.f14969b = parcel.readString();
            this.f14970c = parcel.readString();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f14971d = z;
            this.f14972e = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f14968a);
            parcel.writeString(this.f14969b);
            parcel.writeString(this.f14970c);
            parcel.writeByte(this.f14971d ? (byte) 1 : 0);
            parcel.writeString(this.f14972e);
        }
    }

    public WikiDocument() {
    }

    /* renamed from: a */
    public int mo21004a() {
        return this.f14961b;
    }

    /* renamed from: b */
    public String mo21008b() {
        return this.f14962c;
    }

    /* renamed from: c */
    public String mo21011c() {
        return this.f14963d;
    }

    /* renamed from: d */
    public SpaceCover mo21014d() {
        return this.f14964e;
    }

    /* renamed from: e */
    public String mo21016e() {
        return this.f14965f;
    }

    /* renamed from: f */
    public int mo21018f() {
        return this.f14966g;
    }

    /* renamed from: g */
    public int mo21019g() {
        return this.f14967h;
    }

    /* renamed from: h */
    public boolean mo21020h() {
        if (this.f14967h == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo21005a(int i) {
        this.f14961b = i;
    }

    /* renamed from: b */
    public void mo21009b(int i) {
        this.f14966g = i;
    }

    /* renamed from: c */
    public void mo21012c(int i) {
        this.f14967h = i;
    }

    /* renamed from: a */
    public void mo21006a(SpaceCover spaceCover) {
        this.f14964e = spaceCover;
    }

    /* renamed from: b */
    public void mo21010b(String str) {
        this.f14963d = str;
    }

    /* renamed from: c */
    public void mo21013c(String str) {
        this.f14965f = str;
    }

    /* renamed from: a */
    public void mo21007a(String str) {
        this.f14962c = str;
    }

    protected WikiDocument(Parcel parcel) {
        super(parcel);
        this.f14960a = parcel.readString();
        this.f14961b = parcel.readInt();
        this.f14962c = parcel.readString();
        this.f14963d = parcel.readString();
        this.f14964e = (SpaceCover) parcel.readParcelable(SpaceCover.class.getClassLoader());
        this.f14965f = parcel.readString();
        this.f14966g = parcel.readInt();
        this.f14967h = parcel.readInt();
    }

    @Override // com.bytedance.ee.bear.list.dto.Document
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            WikiDocument wikiDocument = (WikiDocument) obj;
            if (!TextUtils.isEmpty(this.f14963d) && !TextUtils.isEmpty(wikiDocument.f14963d) && !m33924M(this.f14963d) && !m33924M(wikiDocument.f14963d)) {
                return TextUtils.equals(this.f14963d, wikiDocument.f14963d);
            }
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.list.dto.Document
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f14960a);
        parcel.writeInt(this.f14961b);
        parcel.writeString(this.f14962c);
        parcel.writeString(this.f14963d);
        parcel.writeParcelable(this.f14964e, i);
        parcel.writeString(this.f14965f);
        parcel.writeInt(this.f14966g);
        parcel.writeInt(this.f14967h);
    }
}
