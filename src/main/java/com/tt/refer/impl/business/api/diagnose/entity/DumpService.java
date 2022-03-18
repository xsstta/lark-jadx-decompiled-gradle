package com.tt.refer.impl.business.api.diagnose.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class DumpService implements Parcelable {
    public static final Parcelable.Creator<DumpService> CREATOR = new Parcelable.Creator<DumpService>() {
        /* class com.tt.refer.impl.business.api.diagnose.entity.DumpService.C678901 */

        /* renamed from: a */
        public DumpService[] newArray(int i) {
            return new DumpService[i];
        }

        /* renamed from: a */
        public DumpService createFromParcel(Parcel parcel) {
            return new DumpService(parcel);
        }
    };

    /* renamed from: a */
    protected String f170989a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo235527a(C67894c cVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo235528a(C67895d dVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo235530a(DumpConfig dumpConfig) {
        return false;
    }

    public int describeContents() {
        return 0;
    }

    DumpService() {
    }

    /* renamed from: a */
    public String mo235526a() {
        return this.f170989a;
    }

    protected DumpService(Parcel parcel) {
        this.f170989a = parcel.readString();
    }

    /* renamed from: a */
    public void mo235529a(String str) {
        this.f170989a = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f170989a);
    }
}
