package com.bytedance.ee.bear.contract;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.ee.bear.binder.annotation.NewRemoteService;
import com.bytedance.ee.bear.contract.BinderAccountChangeCallback;
import com.bytedance.ee.bear.contract.config.DocDynamicConfig;
import com.bytedance.ee.bear.contract.config.LoginInfo;
import io.reactivex.AbstractC68307f;

@NewRemoteService
public interface AccountService {

    /* renamed from: com.bytedance.ee.bear.contract.AccountService$a */
    public interface AbstractC4981a {
        void onChange(Account account);
    }

    /* renamed from: com.bytedance.ee.bear.contract.AccountService$b */
    public interface AbstractC4982b {
        void onLocalLogin(Account account);
    }

    AbstractC68307f<Boolean> checkAndLogin(String str);

    AbstractC68307f<Boolean> checkLoginInfo(LoginInfo loginInfo);

    AbstractC68307f<Account> findLoginUser();

    AbstractC68307f<Boolean> loginFlow(String str);

    AbstractC68307f<Boolean> logoutFlow();

    AbstractC68307f<Boolean> notifyConfigChange(DocDynamicConfig docDynamicConfig);

    void registerChangeCallback(BinderAccountChangeCallback binderAccountChangeCallback);

    void unregisterChangeCallback(BinderAccountChangeCallback binderAccountChangeCallback);

    public static class Account implements Parcelable {
        public static final Parcelable.Creator<Account> CREATOR = new Parcelable.Creator<Account>() {
            /* class com.bytedance.ee.bear.contract.AccountService.Account.C49791 */

            /* renamed from: a */
            public Account[] newArray(int i) {
                return new Account[i];
            }

            /* renamed from: a */
            public Account createFromParcel(Parcel parcel) {
                return new Account(parcel);
            }
        };

        /* renamed from: a */
        public String f14584a;

        /* renamed from: b */
        public String f14585b;

        /* renamed from: c */
        public String f14586c;

        /* renamed from: d */
        public String f14587d;

        /* renamed from: e */
        public String f14588e;

        /* renamed from: f */
        public String f14589f;

        /* renamed from: g */
        public String f14590g;

        /* renamed from: h */
        public String f14591h;

        /* renamed from: i */
        public String f14592i;

        /* renamed from: j */
        public String f14593j;

        /* renamed from: k */
        public int f14594k;

        /* renamed from: l */
        public String f14595l;

        /* renamed from: m */
        public String f14596m;

        /* renamed from: n */
        public boolean f14597n;

        /* renamed from: o */
        public boolean f14598o;

        /* renamed from: p */
        public String f14599p;

        /* renamed from: q */
        public String f14600q;

        /* renamed from: r */
        public boolean f14601r;

        /* renamed from: s */
        public String f14602s;

        /* renamed from: t */
        public boolean f14603t;

        public int describeContents() {
            return 0;
        }

        public Account() {
        }

        /* renamed from: d */
        private boolean m20629d() {
            return "0".equals(this.f14592i);
        }

        /* renamed from: a */
        public boolean mo19677a() {
            return !TextUtils.isEmpty(this.f14591h);
        }

        /* renamed from: b */
        public boolean mo19679b() {
            if (!m20629d() && TextUtils.equals(this.f14602s, "2")) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public boolean mo19681c() {
            if (m20629d() || mo19679b()) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "Account{uid='" + this.f14584a + '\'' + ", state=" + this.f14594k + '}';
        }

        /* renamed from: b */
        public boolean mo19680b(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return str.equals(this.f14584a);
        }

        /* renamed from: a */
        public boolean mo19678a(String str) {
            if (TextUtils.isEmpty(this.f14592i)) {
                return false;
            }
            return this.f14592i.equals(str);
        }

        protected Account(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            this.f14584a = parcel.readString();
            this.f14585b = parcel.readString();
            this.f14586c = parcel.readString();
            this.f14587d = parcel.readString();
            this.f14588e = parcel.readString();
            this.f14589f = parcel.readString();
            this.f14590g = parcel.readString();
            this.f14591h = parcel.readString();
            this.f14592i = parcel.readString();
            this.f14593j = parcel.readString();
            this.f14594k = parcel.readInt();
            this.f14595l = parcel.readString();
            this.f14596m = parcel.readString();
            boolean z4 = true;
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f14597n = z;
            if (parcel.readByte() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f14598o = z2;
            this.f14599p = parcel.readString();
            this.f14600q = parcel.readString();
            if (parcel.readByte() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f14601r = z3;
            this.f14602s = parcel.readString();
            this.f14603t = parcel.readByte() == 0 ? false : z4;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f14584a);
            parcel.writeString(this.f14585b);
            parcel.writeString(this.f14586c);
            parcel.writeString(this.f14587d);
            parcel.writeString(this.f14588e);
            parcel.writeString(this.f14589f);
            parcel.writeString(this.f14590g);
            parcel.writeString(this.f14591h);
            parcel.writeString(this.f14592i);
            parcel.writeString(this.f14593j);
            parcel.writeInt(this.f14594k);
            parcel.writeString(this.f14595l);
            parcel.writeString(this.f14596m);
            parcel.writeByte(this.f14597n ? (byte) 1 : 0);
            parcel.writeByte(this.f14598o ? (byte) 1 : 0);
            parcel.writeString(this.f14599p);
            parcel.writeString(this.f14600q);
            parcel.writeByte(this.f14601r ? (byte) 1 : 0);
            parcel.writeString(this.f14602s);
            parcel.writeByte(this.f14603t ? (byte) 1 : 0);
        }
    }

    public static abstract class AccountChangeUICallback extends BinderAccountChangeCallback.Stub {
        private Handler mHandler = new Handler(Looper.getMainLooper());

        public abstract void onChangeInUi(Account account);

        @Override // com.bytedance.ee.bear.contract.AccountService.AbstractC4981a
        public final void onChange(final Account account) {
            this.mHandler.post(new Runnable() {
                /* class com.bytedance.ee.bear.contract.AccountService.AccountChangeUICallback.RunnableC49801 */

                public void run() {
                    AccountChangeUICallback.this.onChangeInUi(account);
                }
            });
        }
    }
}
