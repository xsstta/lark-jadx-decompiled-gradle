package org.apache.commons.net.ntp;

import com.bytedance.ee.bear.attachment.filereader.FileReaderUtil;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TimeStamp implements Serializable, Comparable<TimeStamp> {
    private static final long serialVersionUID = 8139806907588338737L;
    private final long ntpTime;
    private DateFormat simpleFormatter;
    private DateFormat utcFormatter;

    public long ntpValue() {
        return this.ntpTime;
    }

    public long getTime() {
        return getTime(this.ntpTime);
    }

    public String toString() {
        return toString(this.ntpTime);
    }

    public static TimeStamp getCurrentTime() {
        return getNtpTime(System.currentTimeMillis());
    }

    public Date getDate() {
        return new Date(getTime(this.ntpTime));
    }

    public long getFraction() {
        return this.ntpTime & 4294967295L;
    }

    public long getSeconds() {
        return (this.ntpTime >>> 32) & 4294967295L;
    }

    public int hashCode() {
        long j = this.ntpTime;
        return (int) (j ^ (j >>> 32));
    }

    public String toDateString() {
        if (this.simpleFormatter == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, MMM dd yyyy HH:mm:ss.SSS", Locale.US);
            this.simpleFormatter = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
        }
        return this.simpleFormatter.format(getDate());
    }

    public String toUTCString() {
        if (this.utcFormatter == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, MMM dd yyyy HH:mm:ss.SSS 'UTC'", Locale.US);
            this.utcFormatter = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }
        return this.utcFormatter.format(getDate());
    }

    public TimeStamp(long j) {
        this.ntpTime = j;
    }

    public TimeStamp(String str) throws NumberFormatException {
        this.ntpTime = decodeNtpHexString(str);
    }

    public static TimeStamp getNtpTime(long j) {
        return new TimeStamp(toNtpTime(j));
    }

    public static TimeStamp parseNtpString(String str) throws NumberFormatException {
        return new TimeStamp(decodeNtpHexString(str));
    }

    public int compareTo(TimeStamp timeStamp) {
        int i = (this.ntpTime > timeStamp.ntpTime ? 1 : (this.ntpTime == timeStamp.ntpTime ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        return 1;
    }

    public TimeStamp(Date date) {
        long j;
        if (date == null) {
            j = 0;
        } else {
            j = toNtpTime(date.getTime());
        }
        this.ntpTime = j;
    }

    public static String toString(long j) {
        StringBuilder sb = new StringBuilder();
        appendHexString(sb, (j >>> 32) & 4294967295L);
        sb.append('.');
        appendHexString(sb, j & 4294967295L);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TimeStamp) || this.ntpTime != ((TimeStamp) obj).ntpValue()) {
            return false;
        }
        return true;
    }

    protected static long decodeNtpHexString(String str) throws NumberFormatException {
        if (str != null) {
            int indexOf = str.indexOf(46);
            if (indexOf != -1) {
                return (Long.parseLong(str.substring(0, indexOf), 16) << 32) | Long.parseLong(str.substring(indexOf + 1), 16);
            }
            if (str.length() == 0) {
                return 0;
            }
            return Long.parseLong(str, 16) << 32;
        }
        throw new NumberFormatException("null");
    }

    public static long getTime(long j) {
        long j2;
        long j3 = (j >>> 32) & 4294967295L;
        long round = Math.round((((double) (j & 4294967295L)) * 1000.0d) / 4.294967296E9d);
        if ((FileReaderUtil.f12880b & j3) == 0) {
            j2 = 2085978496000L;
        } else {
            j2 = -2208988800000L;
        }
        return (j3 * 1000) + j2 + round;
    }

    protected static long toNtpTime(long j) {
        boolean z;
        long j2 = 2085978496000L;
        if (j < 2085978496000L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            j2 = -2208988800000L;
        }
        long j3 = j - j2;
        long j4 = j3 / 1000;
        long j5 = ((j3 % 1000) * 4294967296L) / 1000;
        if (z) {
            j4 |= FileReaderUtil.f12880b;
        }
        return j5 | (j4 << 32);
    }

    private static void appendHexString(StringBuilder sb, long j) {
        String hexString = Long.toHexString(j);
        for (int length = hexString.length(); length < 8; length++) {
            sb.append('0');
        }
        sb.append(hexString);
    }
}
