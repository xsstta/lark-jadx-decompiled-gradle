package com.huawei.hms.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;

public final class ConnectionResult implements Parcelable {
    public static final int API_UNAVAILABLE = 1000;
    public static final int BINDFAIL_RESOLUTION_BACKGROUND = 7;
    public static final int BINDFAIL_RESOLUTION_REQUIRED = 6;
    public static final int CANCELED = 13;
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new C23446a();
    public static final int DEVELOPER_ERROR = 10;
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 9002;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 15;
    public static final int INVALID_ACCOUNT = 5;
    public static final int LICENSE_CHECK_FAILED = 11;
    public static final int NETWORK_ERROR = 9000;
    public static final int RESOLUTION_REQUIRED = 9001;
    public static final int RESTRICTED_PROFILE = 9003;
    public static final int SERVICE_DISABLED = 3;
    public static final int SERVICE_INVALID = 9;
    public static final int SERVICE_MISSING = 1;
    public static final int SERVICE_MISSING_PERMISSION = 19;
    public static final int SERVICE_UNSUPPORTED = 21;
    public static final int SERVICE_UPDATING = 9004;
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_FAILED = 9005;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int TIMEOUT = 14;

    /* renamed from: a */
    private int f57796a;

    /* renamed from: b */
    private PendingIntent f57797b;

    /* renamed from: c */
    private String f57798c;

    /* renamed from: d */
    private int f57799d;

    public int describeContents() {
        return 0;
    }

    /* renamed from: com.huawei.hms.api.ConnectionResult$a */
    static class C23446a implements Parcelable.Creator<ConnectionResult> {
        C23446a() {
        }

        @Override // android.os.Parcelable.Creator
        public ConnectionResult[] newArray(int i) {
            return new ConnectionResult[i];
        }

        @Override // android.os.Parcelable.Creator
        public ConnectionResult createFromParcel(Parcel parcel) {
            return new ConnectionResult(parcel, (C23446a) null);
        }
    }

    public int getErrorCode() {
        return this.f57799d;
    }

    public final String getErrorMessage() {
        return this.f57798c;
    }

    public final PendingIntent getResolution() {
        return this.f57797b;
    }

    public final boolean isSuccess() {
        if (this.f57799d == 0) {
            return true;
        }
        return false;
    }

    public final boolean hasResolution() {
        return HuaweiApiAvailability.getInstance().isUserResolvableError(this.f57799d, this.f57797b);
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf((long) this.f57796a), Long.valueOf((long) getErrorCode()), getErrorMessage(), this.f57797b);
    }

    public ConnectionResult(int i) {
        this(i, (PendingIntent) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (!(obj instanceof ConnectionResult) || this.f57796a != ((ConnectionResult) obj).f57796a || this.f57799d != ((ConnectionResult) obj).f57799d || !this.f57798c.equals(((ConnectionResult) obj).f57798c) || !this.f57797b.equals(((ConnectionResult) obj).f57797b)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private ConnectionResult(Parcel parcel) {
        this.f57796a = 1;
        this.f57797b = null;
        this.f57798c = null;
        this.f57796a = parcel.readInt();
        this.f57799d = parcel.readInt();
        this.f57798c = parcel.readString();
        Parcelable parcelable = (Parcelable) PendingIntent.CREATOR.createFromParcel(parcel);
        if (parcelable != null) {
            this.f57797b = (PendingIntent) parcelable;
        }
    }

    /* renamed from: a */
    static String m85043a(int i) {
        if (i == -1) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        if (i == 0) {
            return "SUCCESS";
        }
        if (i == 1) {
            return "SERVICE_MISSING";
        }
        if (i == 2) {
            return "SERVICE_VERSION_UPDATE_REQUIRED";
        }
        if (i == 3) {
            return "SERVICE_DISABLED";
        }
        if (i == 13) {
            return "CANCELED";
        }
        if (i == 14) {
            return "TIMEOUT";
        }
        if (i == 19) {
            return "SERVICE_MISSING_PERMISSION";
        }
        if (i == 21) {
            return "API_VERSION_UPDATE_REQUIRED";
        }
        switch (i) {
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                return "UNKNOWN_ERROR_CODE(" + i + ")";
        }
    }

    /* synthetic */ ConnectionResult(Parcel parcel, C23446a aVar) {
        this(parcel);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public final void startResolutionForResult(Activity activity, int i) throws IntentSender.SendIntentException {
        if (hasResolution()) {
            HuaweiApiAvailability.getInstance().resolveError(activity, this.f57799d, i, this.f57797b);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f57796a);
        parcel.writeInt(this.f57799d);
        parcel.writeString(this.f57798c);
        this.f57797b.writeToParcel(parcel, i);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f57796a = 1;
        this.f57797b = null;
        this.f57798c = null;
        this.f57796a = i;
        this.f57799d = i2;
        this.f57797b = pendingIntent;
        this.f57798c = str;
    }
}
