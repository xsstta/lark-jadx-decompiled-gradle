package com.huawei.hms.location;

import android.text.TextUtils;
import com.huawei.hms.support.api.entity.location.fence.GeofenceEntity;

public interface Geofence {
    public static final int DWELL_GEOFENCE_CONVERSION = 4;
    public static final int ENTER_GEOFENCE_CONVERSION = 1;
    public static final int EXIT_GEOFENCE_CONVERSION = 2;
    public static final long GEOFENCE_NEVER_EXPIRE = -1;

    public static final class Builder {

        /* renamed from: a */
        private String f58366a = null;

        /* renamed from: b */
        private int f58367b = 0;

        /* renamed from: c */
        private long f58368c = -2;

        /* renamed from: d */
        private double f58369d;

        /* renamed from: e */
        private double f58370e;

        /* renamed from: f */
        private float f58371f;

        /* renamed from: g */
        private int f58372g = 0;

        /* renamed from: h */
        private int f58373h = -1;

        public Geofence build() {
            if (!TextUtils.isEmpty(this.f58366a)) {
                int i = this.f58367b;
                if (i <= 0) {
                    throw new IllegalArgumentException("conversions not set.");
                } else if ((i & 4) == 0 || this.f58373h >= 0) {
                    long j = this.f58368c;
                    if (j != -2) {
                        int i2 = this.f58372g;
                        if (i2 >= 0) {
                            return new GeofenceEntity(this.f58366a, i, this.f58369d, this.f58370e, this.f58371f, j, i2, this.f58373h);
                        }
                        throw new IllegalArgumentException("notificationInterval should be nonnegative.");
                    }
                    throw new IllegalArgumentException("validDuration not set.");
                } else {
                    throw new IllegalArgumentException("Non-negative dwellDelayTime needs to be set when conversions include DWELL_GEOFENCE_CONVERSION.");
                }
            } else {
                throw new IllegalArgumentException("uniqueId not set.");
            }
        }

        public Builder setConversions(int i) {
            this.f58367b = i;
            return this;
        }

        public Builder setDwellDelayTime(int i) {
            this.f58373h = i;
            return this;
        }

        public Builder setNotificationInterval(int i) {
            this.f58372g = i;
            return this;
        }

        public Builder setRoundArea(double d, double d2, float f) {
            this.f58369d = d;
            this.f58370e = d2;
            this.f58371f = f;
            return this;
        }

        public Builder setUniqueId(String str) {
            this.f58366a = str;
            return this;
        }

        public Builder setValidContinueTime(long j) {
            if (j < 0) {
                j = -1;
            }
            this.f58368c = j;
            return this;
        }
    }

    String getUniqueId();
}
