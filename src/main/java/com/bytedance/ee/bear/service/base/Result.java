package com.bytedance.ee.bear.service.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.service.remote.C10962g;

public class Result<T> implements Parcelable {
    public static final Parcelable.Creator<Result> CREATOR = new Parcelable.Creator<Result>() {
        /* class com.bytedance.ee.bear.service.base.Result.C109121 */

        /* renamed from: a */
        public Result[] newArray(int i) {
            return new Result[i];
        }

        /* renamed from: a */
        public Result createFromParcel(Parcel parcel) {
            return new Result(parcel);
        }
    };

    /* renamed from: a */
    public final T f29379a;

    /* renamed from: b */
    public final Throwable f29380b;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public boolean mo41496a() {
        if (this.f29379a == null || this.f29380b != null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static <T> Result<T> m45391a(Throwable th) {
        return new Result<>(null, th);
    }

    protected Result(Parcel parcel) {
        if (parcel.readInt() > 0) {
            this.f29379a = (T) new C10962g(parcel).mo41599a();
            this.f29380b = null;
            return;
        }
        this.f29380b = new Exception((String) new C10962g(parcel).mo41599a());
        this.f29379a = null;
    }

    private Result(T t, Throwable th) {
        this.f29379a = t;
        this.f29380b = th;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (mo41496a()) {
            parcel.writeInt(1);
            new C10962g(parcel).mo41601a((Object) this.f29379a);
            return;
        }
        parcel.writeInt(0);
        new C10962g(parcel).mo41601a(this.f29380b.getMessage());
    }
}
