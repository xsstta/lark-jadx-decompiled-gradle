package com.bytedance.ee.util.deviceinfo;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.util.Locale;

public final class Status extends ProcFile {
    public static final Parcelable.Creator<Status> CREATOR = new Parcelable.Creator<Status>() {
        /* class com.bytedance.ee.util.deviceinfo.Status.C136521 */

        /* renamed from: a */
        public Status[] newArray(int i) {
            return new Status[i];
        }

        /* renamed from: a */
        public Status createFromParcel(Parcel parcel) {
            return new Status(parcel);
        }
    };

    public int getGid() {
        try {
            return Integer.parseInt(getValue("Gid").split("\\s+")[0]);
        } catch (Exception unused) {
            return -1;
        }
    }

    public int getUid() {
        try {
            return Integer.parseInt(getValue("Uid").split("\\s+")[0]);
        } catch (Exception unused) {
            return -1;
        }
    }

    private Status(Parcel parcel) {
        super(parcel);
    }

    private Status(String str) throws IOException {
        super(str);
    }

    public static Status get(int i) throws IOException {
        return new Status(String.format(Locale.ENGLISH, "/proc/%d/status", Integer.valueOf(i)));
    }

    public String getValue(String str) {
        String[] split = this.content.split("\n");
        for (String str2 : split) {
            if (str2.startsWith(str + ":")) {
                return str2.split(str + ":")[1].trim();
            }
        }
        return null;
    }
}
