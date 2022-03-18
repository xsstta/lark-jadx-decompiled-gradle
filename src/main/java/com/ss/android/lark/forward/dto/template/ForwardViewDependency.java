package com.ss.android.lark.forward.dto.template;

import android.os.Parcel;
import android.os.Parcelable;

public class ForwardViewDependency implements Parcelable {
    public static final Parcelable.Creator<ForwardViewDependency> CREATOR = new Parcelable.Creator<ForwardViewDependency>() {
        /* class com.ss.android.lark.forward.dto.template.ForwardViewDependency.C384031 */

        /* renamed from: a */
        public ForwardViewDependency[] newArray(int i) {
            return new ForwardViewDependency[i];
        }

        /* renamed from: a */
        public ForwardViewDependency createFromParcel(Parcel parcel) {
            return new ForwardViewDependency(parcel);
        }
    };

    /* renamed from: a */
    private boolean f98747a;

    /* renamed from: b */
    private String f98748b;

    /* renamed from: c */
    private String f98749c;

    /* renamed from: d */
    private String f98750d;

    /* renamed from: e */
    private BasicDialogContent f98751e;

    /* renamed from: f */
    private ForwardEnhancedView f98752f;

    /* renamed from: g */
    private String f98753g;

    /* renamed from: h */
    private String f98754h;

    /* renamed from: i */
    private boolean f98755i = true;

    /* renamed from: j */
    private boolean f98756j;

    public int describeContents() {
        return 0;
    }

    /* renamed from: b */
    public String mo140872b() {
        return this.f98748b;
    }

    /* renamed from: c */
    public String mo140875c() {
        return this.f98753g;
    }

    /* renamed from: d */
    public String mo140878d() {
        return this.f98754h;
    }

    /* renamed from: e */
    public String mo140881e() {
        return this.f98750d;
    }

    /* renamed from: f */
    public BasicDialogContent mo140883f() {
        return this.f98751e;
    }

    /* renamed from: g */
    public ForwardEnhancedView mo140884g() {
        return this.f98752f;
    }

    /* renamed from: h */
    public boolean mo140885h() {
        return this.f98755i;
    }

    public ForwardViewDependency() {
    }

    /* renamed from: com.ss.android.lark.forward.dto.template.ForwardViewDependency$a */
    public static class C38404a {

        /* renamed from: a */
        private boolean f98757a = true;

        /* renamed from: b */
        private String f98758b;

        /* renamed from: c */
        private String f98759c;

        /* renamed from: d */
        private String f98760d;

        /* renamed from: e */
        private BasicDialogContent f98761e;

        /* renamed from: f */
        private ForwardEnhancedView f98762f;

        /* renamed from: g */
        private boolean f98763g = true;

        /* renamed from: h */
        private String f98764h;

        /* renamed from: i */
        private String f98765i;

        /* renamed from: a */
        public static ForwardViewDependency m151460a() {
            return new C38404a().mo140897b();
        }

        /* renamed from: b */
        public ForwardViewDependency mo140897b() {
            ForwardViewDependency forwardViewDependency = new ForwardViewDependency();
            forwardViewDependency.mo140877c(this.f98763g);
            forwardViewDependency.mo140882e(this.f98760d);
            forwardViewDependency.mo140867a(this.f98761e);
            forwardViewDependency.mo140870a(this.f98757a);
            forwardViewDependency.mo140869a(this.f98758b);
            forwardViewDependency.mo140873b(this.f98759c);
            forwardViewDependency.mo140868a(this.f98762f);
            forwardViewDependency.mo140876c(this.f98764h);
            forwardViewDependency.mo140879d(this.f98765i);
            return forwardViewDependency;
        }

        /* renamed from: a */
        public C38404a mo140891a(BasicDialogContent basicDialogContent) {
            this.f98761e = basicDialogContent;
            return this;
        }

        /* renamed from: b */
        public C38404a mo140895b(String str) {
            this.f98759c = str;
            return this;
        }

        /* renamed from: c */
        public C38404a mo140898c(String str) {
            this.f98760d = str;
            return this;
        }

        /* renamed from: a */
        public C38404a mo140892a(ForwardEnhancedView forwardEnhancedView) {
            this.f98762f = forwardEnhancedView;
            return this;
        }

        /* renamed from: b */
        public C38404a mo140896b(boolean z) {
            this.f98763g = z;
            return this;
        }

        /* renamed from: a */
        public C38404a mo140893a(String str) {
            this.f98758b = str;
            return this;
        }

        /* renamed from: a */
        public C38404a mo140894a(boolean z) {
            this.f98757a = z;
            return this;
        }
    }

    /* renamed from: a */
    public boolean mo140871a() {
        return this.f98747a;
    }

    /* renamed from: a */
    public void mo140867a(BasicDialogContent basicDialogContent) {
        this.f98751e = basicDialogContent;
    }

    /* renamed from: a */
    public void mo140868a(ForwardEnhancedView forwardEnhancedView) {
        this.f98752f = forwardEnhancedView;
    }

    /* renamed from: b */
    public void mo140873b(String str) {
        this.f98749c = str;
    }

    /* renamed from: c */
    public void mo140876c(String str) {
        this.f98753g = str;
    }

    /* renamed from: d */
    public void mo140879d(String str) {
        this.f98754h = str;
    }

    /* renamed from: e */
    public void mo140882e(String str) {
        this.f98750d = str;
    }

    /* renamed from: a */
    public void mo140869a(String str) {
        this.f98748b = str;
    }

    /* renamed from: b */
    public void mo140874b(boolean z) {
        this.f98756j = z;
    }

    /* renamed from: c */
    public void mo140877c(boolean z) {
        this.f98755i = z;
    }

    /* renamed from: a */
    public void mo140870a(boolean z) {
        this.f98747a = z;
    }

    protected ForwardViewDependency(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f98755i = z;
        this.f98747a = parcel.readByte() == 0 ? false : z2;
        this.f98748b = parcel.readString();
        this.f98749c = parcel.readString();
        this.f98750d = parcel.readString();
        this.f98753g = parcel.readString();
        this.f98754h = parcel.readString();
        this.f98751e = (BasicDialogContent) parcel.readParcelable(BasicDialogContent.class.getClassLoader());
        this.f98752f = (ForwardEnhancedView) parcel.readParcelable(BasicDialogContent.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f98755i ? (byte) 1 : 0);
        parcel.writeByte(this.f98747a ? (byte) 1 : 0);
        parcel.writeString(this.f98748b);
        parcel.writeString(this.f98749c);
        parcel.writeString(this.f98750d);
        parcel.writeString(this.f98753g);
        parcel.writeString(this.f98754h);
        parcel.writeParcelable(this.f98751e, i);
        parcel.writeParcelable(this.f98752f, i);
    }
}
