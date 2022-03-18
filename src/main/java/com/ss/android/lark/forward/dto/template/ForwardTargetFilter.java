package com.ss.android.lark.forward.dto.template;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.impl.IRemoteForwardTargetFilter;
import com.ss.android.lark.log.Log;

public class ForwardTargetFilter implements Parcelable {
    public static final Parcelable.Creator<ForwardTargetFilter> CREATOR = new Parcelable.Creator<ForwardTargetFilter>() {
        /* class com.ss.android.lark.forward.dto.template.ForwardTargetFilter.C383993 */

        /* renamed from: a */
        public ForwardTargetFilter[] newArray(int i) {
            return new ForwardTargetFilter[i];
        }

        /* renamed from: a */
        public ForwardTargetFilter createFromParcel(Parcel parcel) {
            return new ForwardTargetFilter(parcel);
        }
    };

    /* renamed from: a */
    public IRemoteForwardTargetFilter f98721a;

    /* renamed from: b */
    private boolean f98722b;

    /* renamed from: c */
    private boolean f98723c;

    /* renamed from: d */
    private boolean f98724d;

    /* renamed from: e */
    private boolean f98725e;

    /* renamed from: f */
    private boolean f98726f;

    /* renamed from: g */
    private boolean f98727g;

    /* renamed from: h */
    private boolean f98728h;

    /* renamed from: i */
    private boolean f98729i;

    /* renamed from: j */
    private AbstractC38407b f98730j;

    public int describeContents() {
        return 0;
    }

    private ForwardTargetFilter() {
        this.f98728h = true;
    }

    /* renamed from: a */
    public boolean mo140820a() {
        return this.f98722b;
    }

    /* renamed from: b */
    public boolean mo140822b() {
        return this.f98723c;
    }

    /* renamed from: c */
    public boolean mo140824c() {
        return this.f98724d;
    }

    /* renamed from: d */
    public boolean mo140826d() {
        return this.f98725e;
    }

    /* renamed from: e */
    public boolean mo140829e() {
        return this.f98726f;
    }

    /* renamed from: f */
    public boolean mo140831f() {
        return this.f98727g;
    }

    /* renamed from: h */
    public boolean mo140835h() {
        return this.f98728h;
    }

    /* renamed from: com.ss.android.lark.forward.dto.template.ForwardTargetFilter$a */
    public static class C38400a {

        /* renamed from: a */
        private boolean f98732a;

        /* renamed from: b */
        private boolean f98733b;

        /* renamed from: c */
        private boolean f98734c;

        /* renamed from: d */
        private boolean f98735d = true;

        /* renamed from: e */
        private boolean f98736e;

        /* renamed from: f */
        private boolean f98737f;

        /* renamed from: g */
        private boolean f98738g = true;

        /* renamed from: h */
        private boolean f98739h;

        /* renamed from: i */
        private AbstractC38407b f98740i;

        /* renamed from: a */
        public static ForwardTargetFilter m151418a() {
            return new C38400a().mo140846b();
        }

        /* renamed from: b */
        public ForwardTargetFilter mo140846b() {
            ForwardTargetFilter forwardTargetFilter = new ForwardTargetFilter();
            forwardTargetFilter.mo140819a(this.f98732a);
            forwardTargetFilter.mo140821b(this.f98733b);
            forwardTargetFilter.mo140825d(this.f98735d);
            forwardTargetFilter.mo140823c(this.f98734c);
            forwardTargetFilter.mo140828e(this.f98736e);
            forwardTargetFilter.mo140830f(this.f98737f);
            forwardTargetFilter.mo140818a(this.f98740i);
            forwardTargetFilter.mo140833g(this.f98738g);
            forwardTargetFilter.mo140834h(this.f98739h);
            return forwardTargetFilter;
        }

        /* renamed from: a */
        public C38400a mo140843a(AbstractC38407b bVar) {
            this.f98740i = bVar;
            return this;
        }

        /* renamed from: b */
        public C38400a mo140845b(boolean z) {
            this.f98733b = z;
            return this;
        }

        /* renamed from: g */
        public C38400a mo140851g(boolean z) {
            this.f98738g = z;
            return this;
        }

        /* renamed from: h */
        public C38400a mo140852h(boolean z) {
            this.f98739h = z;
            return this;
        }

        /* renamed from: a */
        public C38400a mo140844a(boolean z) {
            this.f98732a = z;
            return this;
        }

        /* renamed from: c */
        public C38400a mo140847c(boolean z) {
            this.f98734c = z;
            this.f98735d = !z;
            return this;
        }

        /* renamed from: d */
        public C38400a mo140848d(boolean z) {
            this.f98735d = z;
            this.f98734c = !z;
            return this;
        }

        /* renamed from: e */
        public C38400a mo140849e(boolean z) {
            this.f98736e = z;
            if (z) {
                this.f98737f = false;
            }
            return this;
        }

        /* renamed from: f */
        public C38400a mo140850f(boolean z) {
            this.f98737f = z;
            if (z) {
                this.f98736e = false;
            }
            return this;
        }
    }

    /* renamed from: g */
    public AbstractC38407b mo140832g() {
        if (this.f98730j == null && this.f98721a != null) {
            this.f98730j = new AbstractC38407b() {
                /* class com.ss.android.lark.forward.dto.template.ForwardTargetFilter.C383971 */

                @Override // com.ss.android.lark.forward.dto.template.AbstractC38407b
                /* renamed from: a */
                public boolean mo140837a(ForwardTarget forwardTarget) {
                    try {
                        return ForwardTargetFilter.this.f98721a.filter(forwardTarget);
                    } catch (RemoteException e) {
                        Log.m165384e("ForwardTargetFilter", "filter", e);
                        return false;
                    }
                }
            };
        }
        return this.f98730j;
    }

    /* renamed from: a */
    public void mo140819a(boolean z) {
        this.f98722b = z;
    }

    /* renamed from: b */
    public void mo140821b(boolean z) {
        this.f98723c = z;
    }

    /* renamed from: c */
    public void mo140823c(boolean z) {
        this.f98724d = z;
    }

    /* renamed from: d */
    public void mo140825d(boolean z) {
        this.f98725e = z;
    }

    /* renamed from: e */
    public void mo140828e(boolean z) {
        this.f98726f = z;
    }

    /* renamed from: f */
    public void mo140830f(boolean z) {
        this.f98727g = z;
    }

    /* renamed from: g */
    public void mo140833g(boolean z) {
        this.f98728h = z;
    }

    /* renamed from: h */
    public void mo140834h(boolean z) {
        this.f98729i = z;
    }

    /* renamed from: a */
    public void mo140818a(final AbstractC38407b bVar) {
        if (bVar != null) {
            this.f98721a = new IRemoteForwardTargetFilter.Stub() {
                /* class com.ss.android.lark.forward.dto.template.ForwardTargetFilter.BinderC383982 */

                @Override // com.ss.android.lark.forward.impl.IRemoteForwardTargetFilter
                public boolean filter(ForwardTarget forwardTarget) throws RemoteException {
                    return bVar.mo140837a(forwardTarget);
                }
            };
        }
    }

    protected ForwardTargetFilter(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8 = true;
        this.f98728h = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f98722b = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f98723c = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f98724d = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f98725e = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f98726f = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f98727g = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f98728h = z7;
        this.f98729i = parcel.readByte() == 0 ? false : z8;
        if (parcel.readInt() > 0) {
            this.f98721a = IRemoteForwardTargetFilter.Stub.asInterface(parcel.readStrongBinder());
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f98722b ? (byte) 1 : 0);
        parcel.writeByte(this.f98723c ? (byte) 1 : 0);
        parcel.writeByte(this.f98724d ? (byte) 1 : 0);
        parcel.writeByte(this.f98725e ? (byte) 1 : 0);
        parcel.writeByte(this.f98726f ? (byte) 1 : 0);
        parcel.writeByte(this.f98727g ? (byte) 1 : 0);
        parcel.writeByte(this.f98728h ? (byte) 1 : 0);
        parcel.writeByte(this.f98729i ? (byte) 1 : 0);
        if (this.f98721a != null) {
            parcel.writeInt(1);
            parcel.writeStrongBinder(this.f98721a.asBinder());
            return;
        }
        parcel.writeInt(0);
    }
}
