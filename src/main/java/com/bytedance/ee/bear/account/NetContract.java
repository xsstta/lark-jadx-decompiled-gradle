package com.bytedance.ee.bear.account;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.AbstractC68307f;

public interface NetContract {

    /* renamed from: com.bytedance.ee.bear.account.NetContract$a */
    public interface AbstractC4160a<T extends Result> {
        /* renamed from: a */
        T mo16368a(String str);
    }

    /* renamed from: a */
    <R extends Result> AbstractC68307f<R> mo16361a(String str, AbstractC4160a<R> aVar, String str2);

    public static class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new Parcelable.Creator<Result>() {
            /* class com.bytedance.ee.bear.account.NetContract.Result.C41591 */

            /* renamed from: a */
            public Result[] newArray(int i) {
                return new Result[i];
            }

            /* renamed from: a */
            public Result createFromParcel(Parcel parcel) {
                return new Result(parcel);
            }
        };
        public int code;
        public String msg;

        public int describeContents() {
            return 0;
        }

        public Result() {
        }

        protected Result(Parcel parcel) {
            this.code = parcel.readInt();
            this.msg = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.code);
            parcel.writeString(this.msg);
        }
    }
}
