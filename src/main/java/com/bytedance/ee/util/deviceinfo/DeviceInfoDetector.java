package com.bytedance.ee.util.deviceinfo;

import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13608f;
import java.util.concurrent.atomic.AtomicBoolean;

public class DeviceInfoDetector {

    /* renamed from: a */
    private static DeviceInfo f35833a = new DeviceInfo();

    /* renamed from: b */
    private static AtomicBoolean f35834b = new AtomicBoolean(false);

    public static class DeviceInfo implements Parcelable {
        public static final Parcelable.Creator<DeviceInfo> CREATOR = new Parcelable.Creator<DeviceInfo>() {
            /* class com.bytedance.ee.util.deviceinfo.DeviceInfoDetector.DeviceInfo.C136501 */

            /* renamed from: a */
            public DeviceInfo[] newArray(int i) {
                return new DeviceInfo[i];
            }

            /* renamed from: a */
            public DeviceInfo createFromParcel(Parcel parcel) {
                return new DeviceInfo(parcel);
            }
        };

        /* renamed from: a */
        public String f35835a;

        /* renamed from: b */
        public String f35836b;

        /* renamed from: c */
        public String f35837c;

        /* renamed from: d */
        public String f35838d;

        /* renamed from: e */
        public String f35839e;

        /* renamed from: f */
        public String f35840f;

        /* renamed from: g */
        public String f35841g;

        /* renamed from: h */
        public String f35842h;

        /* renamed from: i */
        public String f35843i;

        /* renamed from: j */
        public String f35844j;

        /* renamed from: k */
        public String f35845k;

        public int describeContents() {
            return 0;
        }

        private DeviceInfo() {
        }

        /* renamed from: a */
        public String mo50614a() {
            if (TextUtils.isEmpty(this.f35836b)) {
                return "";
            }
            return this.f35836b;
        }

        /* renamed from: b */
        public String mo50615b() {
            if (TextUtils.isEmpty(this.f35837c)) {
                return "";
            }
            return this.f35837c;
        }

        /* renamed from: c */
        public String mo50616c() {
            if (TextUtils.isEmpty(this.f35838d)) {
                return "1";
            }
            return this.f35838d;
        }

        /* renamed from: d */
        public String mo50617d() {
            if (TextUtils.isEmpty(this.f35839e)) {
                return "";
            }
            return this.f35839e;
        }

        protected DeviceInfo(Parcel parcel) {
            this.f35835a = parcel.readString();
            this.f35836b = parcel.readString();
            this.f35837c = parcel.readString();
            this.f35838d = parcel.readString();
            this.f35839e = parcel.readString();
            this.f35840f = parcel.readString();
            this.f35841g = parcel.readString();
            this.f35842h = parcel.readString();
            this.f35843i = parcel.readString();
            this.f35844j = parcel.readString();
            this.f35845k = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f35835a);
            parcel.writeString(this.f35836b);
            parcel.writeString(this.f35837c);
            parcel.writeString(this.f35838d);
            parcel.writeString(this.f35839e);
            parcel.writeString(this.f35840f);
            parcel.writeString(this.f35841g);
            parcel.writeString(this.f35842h);
            parcel.writeString(this.f35843i);
            parcel.writeString(this.f35844j);
            parcel.writeString(this.f35845k);
        }
    }

    /* renamed from: a */
    private static String m55378a() {
        if (Build.VERSION.SDK_INT >= 21) {
            StringBuilder sb = new StringBuilder();
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr != null) {
                for (int i = 0; i < strArr.length; i++) {
                    sb.append(strArr[i]);
                    if (i != strArr.length - 1) {
                        sb.append(",");
                    }
                }
            }
            return sb.toString();
        }
        return Build.CPU_ABI + "," + Build.CPU_ABI2;
    }

    /* renamed from: a */
    public static DeviceInfo m55377a(Context context) {
        if (!f35834b.get()) {
            m55379b(context);
        }
        return f35833a;
    }

    /* renamed from: b */
    public static void m55379b(Context context) {
        C13608f.m55249a(new Runnable(context) {
            /* class com.bytedance.ee.util.deviceinfo.$$Lambda$DeviceInfoDetector$bAbb4RbS87gQoZ13s6ClzNivQ7g */
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                DeviceInfoDetector.m55381d(this.f$0);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m55381d(Context context) {
        if (!f35834b.get()) {
            synchronized (DeviceInfoDetector.class) {
                if (!f35834b.get()) {
                    m55380c(context);
                    f35834b.set(true);
                }
            }
        }
    }

    /* renamed from: c */
    private static void m55380c(Context context) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            f35833a.f35835a = Build.MODEL;
            f35833a.f35836b = C13653a.m55393a();
            f35833a.f35837c = C13653a.m55396b();
            f35833a.f35838d = String.valueOf(C13653a.m55398c());
            f35833a.f35839e = String.valueOf(C13653a.m55400d());
            f35833a.f35840f = String.valueOf(C13653a.m55401e());
            f35833a.f35841g = String.valueOf(C13653a.m55392a(context));
            f35833a.f35842h = String.valueOf(Build.VERSION.SDK_INT);
            f35833a.f35843i = m55378a();
            f35833a.f35844j = C13653a.m55397b(context);
            f35833a.f35845k = Build.BRAND;
            C13479a.m54764b("DeviceInfoDetector", "init device info cost time:" + (System.currentTimeMillis() - currentTimeMillis));
        } catch (Exception e) {
            C13479a.m54761a("DeviceInfoDetector", e);
        }
    }
}
