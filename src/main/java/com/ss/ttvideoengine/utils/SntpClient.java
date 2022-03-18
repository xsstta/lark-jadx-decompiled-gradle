package com.ss.ttvideoengine.utils;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.net.InetAddress;
import java.util.Arrays;

public class SntpClient {
    private long mNtpTime;
    private long mNtpTimeReference;
    private long mRoundTripTime;

    public long getNtpTime() {
        return this.mNtpTime;
    }

    public long getNtpTimeReference() {
        return this.mNtpTimeReference;
    }

    public long getRoundTripTime() {
        return this.mRoundTripTime;
    }

    /* access modifiers changed from: private */
    public static class InvalidServerReplyException extends Exception {
        public InvalidServerReplyException(String str) {
            super(str);
        }
    }

    public boolean requestTime(String str, int i) {
        try {
            return requestTime(InetAddress.getByName(str), SmActions.ACTION_CALLING_ENTRY, i);
        } catch (Exception e) {
            TTVideoEngineLog.m256501d(e);
            return false;
        }
    }

    private long read32(byte[] bArr, int i) {
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        int i2 = b & 128;
        byte b5 = b;
        if (i2 == 128) {
            b5 = (b & Byte.MAX_VALUE) + SmActions.ACTION_ONTHECALL_EXIT;
        }
        int i3 = b2 & 128;
        byte b6 = b2;
        if (i3 == 128) {
            b6 = (b2 & Byte.MAX_VALUE) + SmActions.ACTION_ONTHECALL_EXIT;
        }
        int i4 = b3 & 128;
        byte b7 = b3;
        if (i4 == 128) {
            b7 = (b3 & Byte.MAX_VALUE) + SmActions.ACTION_ONTHECALL_EXIT;
        }
        int i5 = b4 & 128;
        byte b8 = b4;
        if (i5 == 128) {
            b8 = (b4 & Byte.MAX_VALUE) + SmActions.ACTION_ONTHECALL_EXIT;
        }
        return ((b5 == 1 ? 1 : 0) << 24) + ((b6 == 1 ? 1 : 0) << 16) + ((b7 == 1 ? 1 : 0) << 8) + (b8 == 1 ? 1 : 0);
    }

    private long readTimeStamp(byte[] bArr, int i) {
        long read32 = read32(bArr, i);
        long read322 = read32(bArr, i + 4);
        if (read32 == 0 && read322 == 0) {
            return 0;
        }
        return ((read32 - 2208988800L) * 1000) + ((read322 * 1000) / 4294967296L);
    }

    private void writeTimeStamp(byte[] bArr, int i, long j) {
        if (j == 0) {
            Arrays.fill(bArr, i, i + 8, (byte) 0);
            return;
        }
        long j2 = j / 1000;
        long j3 = j - (j2 * 1000);
        long j4 = j2 + 2208988800L;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) (j4 >> 24));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) (j4 >> 16));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) (j4 >> 8));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) (j4 >> 0));
        long j5 = (j3 * 4294967296L) / 1000;
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) (j5 >> 24));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) (j5 >> 16));
        bArr[i7] = (byte) ((int) (j5 >> 8));
        bArr[i7 + 1] = (byte) ((int) (Math.random() * 255.0d));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean requestTime(java.net.InetAddress r22, int r23, int r24) {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.utils.SntpClient.requestTime(java.net.InetAddress, int, int):boolean");
    }

    private static void checkValidServerReply(byte b, byte b2, int i, long j) throws InvalidServerReplyException {
        if (b == 3) {
            throw new InvalidServerReplyException("unsynchronized server");
        } else if (b2 != 4 && b2 != 5) {
            throw new InvalidServerReplyException("untrusted mode: " + ((int) b2));
        } else if (i == 0 || i > 15) {
            throw new InvalidServerReplyException("untrusted stratum: " + i);
        } else if (j == 0) {
            throw new InvalidServerReplyException("zero transmitTime");
        }
    }
}
