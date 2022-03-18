package com.ss.android.lark.forward.dto.template;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;

public class ForwardFeature implements Parcelable {
    public static final Parcelable.Creator<ForwardFeature> CREATOR = new Parcelable.Creator<ForwardFeature>() {
        /* class com.ss.android.lark.forward.dto.template.ForwardFeature.C383931 */

        /* renamed from: a */
        public ForwardFeature[] newArray(int i) {
            return new ForwardFeature[i];
        }

        /* renamed from: a */
        public ForwardFeature createFromParcel(Parcel parcel) {
            return new ForwardFeature(parcel);
        }
    };

    /* renamed from: a */
    private boolean f98686a;

    /* renamed from: b */
    private boolean f98687b;

    /* renamed from: c */
    private int f98688c;

    /* renamed from: d */
    private boolean f98689d;

    /* renamed from: e */
    private boolean f98690e;

    /* renamed from: f */
    private boolean f98691f;

    /* renamed from: g */
    private boolean f98692g;

    /* renamed from: h */
    private boolean f98693h;

    /* renamed from: i */
    private IForwardCancelListener f98694i;

    /* renamed from: j */
    private IForwardSelectListener f98695j;

    public int describeContents() {
        return 0;
    }

    /* renamed from: d */
    public int mo140757d() {
        return this.f98688c;
    }

    /* renamed from: h */
    public boolean mo140766h() {
        return this.f98693h;
    }

    /* renamed from: i */
    public IForwardCancelListener mo140767i() {
        return this.f98694i;
    }

    /* renamed from: b */
    public boolean mo140754b() {
        return this.f98686a;
    }

    /* renamed from: c */
    public boolean mo140756c() {
        return this.f98687b;
    }

    /* renamed from: e */
    public boolean mo140761e() {
        return this.f98691f;
    }

    /* renamed from: f */
    public boolean mo140763f() {
        return this.f98692g;
    }

    /* renamed from: g */
    public boolean mo140765g() {
        return this.f98689d;
    }

    /* renamed from: com.ss.android.lark.forward.dto.template.ForwardFeature$a */
    public static class C38394a {

        /* renamed from: a */
        private boolean f98696a = true;

        /* renamed from: b */
        private boolean f98697b = true;

        /* renamed from: c */
        private int f98698c = 10;

        /* renamed from: d */
        private boolean f98699d = true;

        /* renamed from: e */
        private boolean f98700e = DesktopUtil.m144301a(UIHelper.getContext());

        /* renamed from: f */
        private boolean f98701f = true;

        /* renamed from: g */
        private boolean f98702g = true;

        /* renamed from: h */
        private boolean f98703h;

        /* renamed from: i */
        private IForwardCancelListener f98704i;

        /* renamed from: j */
        private IForwardSelectListener f98705j;

        /* renamed from: a */
        public static ForwardFeature m151360a() {
            return new C38394a().mo140777b();
        }

        /* renamed from: b */
        public ForwardFeature mo140777b() {
            ForwardFeature forwardFeature = new ForwardFeature();
            forwardFeature.mo140753b(this.f98696a);
            forwardFeature.mo140755c(this.f98697b);
            forwardFeature.mo140748a(this.f98698c);
            forwardFeature.mo140762f(this.f98699d);
            forwardFeature.mo140751a(this.f98700e);
            forwardFeature.mo140758d(this.f98701f);
            forwardFeature.mo140760e(this.f98702g);
            forwardFeature.mo140764g(this.f98703h);
            forwardFeature.mo140749a(this.f98704i);
            forwardFeature.mo140750a(this.f98705j);
            return forwardFeature;
        }

        /* renamed from: a */
        public C38394a mo140773a(IForwardCancelListener iForwardCancelListener) {
            this.f98704i = iForwardCancelListener;
            return this;
        }

        /* renamed from: b */
        public C38394a mo140776b(boolean z) {
            this.f98697b = z;
            return this;
        }

        /* renamed from: c */
        public C38394a mo140778c(boolean z) {
            this.f98701f = z;
            return this;
        }

        /* renamed from: d */
        public C38394a mo140779d(boolean z) {
            this.f98702g = z;
            return this;
        }

        /* renamed from: e */
        public C38394a mo140780e(boolean z) {
            this.f98699d = z;
            return this;
        }

        /* renamed from: f */
        public C38394a mo140781f(boolean z) {
            this.f98703h = z;
            return this;
        }

        /* renamed from: a */
        public C38394a mo140774a(IForwardSelectListener iForwardSelectListener) {
            this.f98705j = iForwardSelectListener;
            return this;
        }

        /* renamed from: a */
        public C38394a mo140775a(boolean z) {
            this.f98696a = z;
            return this;
        }
    }

    private ForwardFeature() {
        this.f98691f = true;
        this.f98692g = true;
    }

    /* renamed from: a */
    public boolean mo140752a() {
        return this.f98690e;
    }

    /* renamed from: a */
    public void mo140748a(int i) {
        this.f98688c = i;
    }

    /* renamed from: b */
    public void mo140753b(boolean z) {
        this.f98686a = z;
    }

    /* renamed from: c */
    public void mo140755c(boolean z) {
        this.f98687b = z;
    }

    /* renamed from: e */
    public void mo140760e(boolean z) {
        this.f98692g = z;
    }

    /* renamed from: f */
    public void mo140762f(boolean z) {
        this.f98689d = z;
    }

    /* renamed from: g */
    public void mo140764g(boolean z) {
        this.f98693h = z;
    }

    /* renamed from: a */
    public void mo140749a(IForwardCancelListener iForwardCancelListener) {
        this.f98694i = iForwardCancelListener;
    }

    /* renamed from: d */
    public void mo140758d(boolean z) {
        this.f98691f = z;
    }

    /* renamed from: a */
    public void mo140750a(IForwardSelectListener iForwardSelectListener) {
        this.f98695j = iForwardSelectListener;
    }

    /* renamed from: a */
    public void mo140751a(boolean z) {
        this.f98690e = z;
    }

    protected ForwardFeature(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7 = true;
        this.f98691f = true;
        this.f98692g = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f98686a = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f98687b = z2;
        this.f98688c = parcel.readInt();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f98691f = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f98692g = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f98689d = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f98690e = z6;
        this.f98693h = parcel.readByte() == 0 ? false : z7;
        this.f98694i = (IForwardCancelListener) parcel.readParcelable(ForwardFeature.class.getClassLoader());
        this.f98695j = (IForwardSelectListener) parcel.readParcelable(ForwardFeature.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f98686a ? (byte) 1 : 0);
        parcel.writeByte(this.f98687b ? (byte) 1 : 0);
        parcel.writeInt(this.f98688c);
        parcel.writeByte(this.f98691f ? (byte) 1 : 0);
        parcel.writeByte(this.f98692g ? (byte) 1 : 0);
        parcel.writeByte(this.f98689d ? (byte) 1 : 0);
        parcel.writeByte(this.f98690e ? (byte) 1 : 0);
        parcel.writeByte(this.f98693h ? (byte) 1 : 0);
        parcel.writeParcelable(this.f98694i, i);
        parcel.writeParcelable(this.f98695j, i);
    }
}
