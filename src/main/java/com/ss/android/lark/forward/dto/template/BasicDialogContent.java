package com.ss.android.lark.forward.dto.template;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.forward.dto.StickImage;
import com.ss.android.lark.image.entity.Image;

public class BasicDialogContent implements Parcelable {
    public static final Parcelable.Creator<BasicDialogContent> CREATOR = new Parcelable.Creator<BasicDialogContent>() {
        /* class com.ss.android.lark.forward.dto.template.BasicDialogContent.C383901 */

        /* renamed from: a */
        public BasicDialogContent[] newArray(int i) {
            return new BasicDialogContent[i];
        }

        /* renamed from: a */
        public BasicDialogContent createFromParcel(Parcel parcel) {
            return new BasicDialogContent(parcel);
        }
    };

    /* renamed from: a */
    private String f98666a;

    /* renamed from: b */
    private String f98667b;

    /* renamed from: c */
    private String f98668c;

    /* renamed from: d */
    private String f98669d;

    /* renamed from: e */
    private int f98670e;

    /* renamed from: f */
    private Image f98671f;

    /* renamed from: g */
    private Image f98672g;

    /* renamed from: h */
    private StickImage f98673h;

    /* renamed from: i */
    private int f98674i;

    /* renamed from: j */
    private boolean f98675j;

    public int describeContents() {
        return 0;
    }

    private BasicDialogContent() {
    }

    /* renamed from: a */
    public String mo140702a() {
        return this.f98667b;
    }

    /* renamed from: b */
    public String mo140708b() {
        return this.f98668c;
    }

    /* renamed from: c */
    public String mo140712c() {
        return this.f98669d;
    }

    /* renamed from: d */
    public int mo140714d() {
        return this.f98670e;
    }

    /* renamed from: e */
    public Image mo140717e() {
        return this.f98672g;
    }

    /* renamed from: f */
    public Image mo140718f() {
        return this.f98671f;
    }

    /* renamed from: g */
    public StickImage mo140719g() {
        return this.f98673h;
    }

    /* renamed from: h */
    public int mo140720h() {
        return this.f98674i;
    }

    /* renamed from: i */
    public boolean mo140721i() {
        return this.f98675j;
    }

    /* renamed from: com.ss.android.lark.forward.dto.template.BasicDialogContent$a */
    public static class C38391a {

        /* renamed from: a */
        private String f98676a;

        /* renamed from: b */
        private String f98677b;

        /* renamed from: c */
        private String f98678c;

        /* renamed from: d */
        private String f98679d;

        /* renamed from: e */
        private int f98680e;

        /* renamed from: f */
        private Image f98681f;

        /* renamed from: g */
        private Image f98682g;

        /* renamed from: h */
        private StickImage f98683h;

        /* renamed from: i */
        private int f98684i;

        /* renamed from: j */
        private boolean f98685j;

        /* renamed from: a */
        public BasicDialogContent mo140732a() {
            BasicDialogContent basicDialogContent = new BasicDialogContent();
            basicDialogContent.mo140706a(this.f98676a);
            basicDialogContent.mo140711b(this.f98677b);
            basicDialogContent.mo140713c(this.f98678c);
            basicDialogContent.mo140715d(this.f98679d);
            basicDialogContent.mo140703a(this.f98680e);
            basicDialogContent.mo140705a(this.f98682g);
            basicDialogContent.mo140710b(this.f98681f);
            basicDialogContent.mo140704a(this.f98683h);
            basicDialogContent.mo140709b(this.f98684i);
            basicDialogContent.mo140707a(this.f98685j);
            return basicDialogContent;
        }

        /* renamed from: a */
        public C38391a mo140730a(String str) {
            this.f98677b = str;
            return this;
        }

        /* renamed from: b */
        public C38391a mo140733b(int i) {
            this.f98684i = i;
            return this;
        }

        /* renamed from: c */
        public C38391a mo140736c(String str) {
            this.f98679d = str;
            return this;
        }

        /* renamed from: a */
        public C38391a mo140731a(boolean z) {
            this.f98685j = z;
            return this;
        }

        /* renamed from: b */
        public C38391a mo140735b(String str) {
            this.f98678c = str;
            return this;
        }

        /* renamed from: a */
        public C38391a mo140727a(int i) {
            this.f98680e = i;
            this.f98682g = null;
            this.f98681f = null;
            this.f98683h = null;
            return this;
        }

        /* renamed from: b */
        public C38391a mo140734b(Image image) {
            this.f98681f = image;
            this.f98680e = 0;
            this.f98683h = null;
            this.f98682g = null;
            return this;
        }

        /* renamed from: a */
        public C38391a mo140728a(StickImage stickImage) {
            this.f98683h = stickImage;
            this.f98680e = 0;
            this.f98682g = null;
            this.f98681f = null;
            return this;
        }

        /* renamed from: a */
        public C38391a mo140729a(Image image) {
            this.f98682g = image;
            this.f98680e = 0;
            this.f98683h = null;
            this.f98681f = null;
            return this;
        }
    }

    /* renamed from: a */
    public void mo140703a(int i) {
        this.f98670e = i;
    }

    /* renamed from: b */
    public void mo140709b(int i) {
        this.f98674i = i;
    }

    /* renamed from: c */
    public void mo140713c(String str) {
        this.f98668c = str;
    }

    /* renamed from: d */
    public void mo140715d(String str) {
        this.f98669d = str;
    }

    /* renamed from: a */
    public void mo140704a(StickImage stickImage) {
        this.f98673h = stickImage;
    }

    /* renamed from: b */
    public void mo140710b(Image image) {
        this.f98671f = image;
    }

    /* renamed from: a */
    public void mo140705a(Image image) {
        this.f98672g = image;
    }

    /* renamed from: b */
    public void mo140711b(String str) {
        this.f98667b = str;
    }

    /* renamed from: a */
    public void mo140706a(String str) {
        this.f98666a = str;
    }

    protected BasicDialogContent(Parcel parcel) {
        this.f98666a = parcel.readString();
        this.f98667b = parcel.readString();
        this.f98668c = parcel.readString();
        this.f98669d = parcel.readString();
        this.f98670e = parcel.readInt();
        this.f98672g = (Image) parcel.readSerializable();
        this.f98671f = (Image) parcel.readSerializable();
        this.f98673h = (StickImage) parcel.readSerializable();
        this.f98674i = parcel.readInt();
        this.f98675j = parcel.readInt() != 1 ? false : true;
    }

    /* renamed from: a */
    public void mo140707a(boolean z) {
        this.f98675j = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f98666a);
        parcel.writeString(this.f98667b);
        parcel.writeString(this.f98668c);
        parcel.writeString(this.f98669d);
        parcel.writeInt(this.f98670e);
        parcel.writeSerializable(this.f98672g);
        parcel.writeSerializable(this.f98671f);
        parcel.writeSerializable(this.f98673h);
        parcel.writeInt(this.f98674i);
        parcel.writeInt(this.f98675j ? 1 : 0);
    }
}
