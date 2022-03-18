package com.huawei.hms.support.api.entity.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.core.aidl.IMessageEntity;

public class Scope implements Parcelable, IMessageEntity {
    public static final Parcelable.Creator<Scope> CREATOR = new Parcelable.Creator<Scope>() {
        /* class com.huawei.hms.support.api.entity.auth.Scope.C237931 */

        @Override // android.os.Parcelable.Creator
        public Scope[] newArray(int i) {
            return new Scope[i];
        }

        @Override // android.os.Parcelable.Creator
        public Scope createFromParcel(Parcel parcel) {
            return new Scope(parcel);
        }
    };
    private String mScopeUri;

    public int describeContents() {
        return 0;
    }

    public String getScopeUri() {
        return this.mScopeUri;
    }

    public final String toString() {
        return this.mScopeUri;
    }

    public Scope() {
        this.mScopeUri = null;
    }

    public final int hashCode() {
        String str = this.mScopeUri;
        if (str == null) {
            return super.hashCode();
        }
        return str.hashCode();
    }

    public boolean equeals(Object obj) {
        return equals(obj);
    }

    protected Scope(Parcel parcel) {
        this.mScopeUri = parcel.readString();
    }

    public Scope(String str) {
        this.mScopeUri = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return Objects.equal(this.mScopeUri, ((Scope) obj).mScopeUri);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mScopeUri);
    }
}
