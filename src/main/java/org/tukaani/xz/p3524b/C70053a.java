package org.tukaani.xz.p3524b;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import org.tukaani.xz.C70099t;
import org.tukaani.xz.CorruptedInputException;
import org.tukaani.xz.UnsupportedOptionsException;
import org.tukaani.xz.XZFormatException;

/* renamed from: org.tukaani.xz.b.a */
public class C70053a extends C70055c {
    /* renamed from: a */
    public static long m268761a(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            long j = (long) (read & SmActions.ACTION_ONTHECALL_ENTRY);
            int i = 0;
            while ((read & SmActions.ACTION_ONTHECALL_EXIT) != 0) {
                i++;
                if (i < 9) {
                    read = inputStream.read();
                    if (read == -1) {
                        throw new EOFException();
                    } else if (read != 0) {
                        j |= ((long) (read & SmActions.ACTION_ONTHECALL_ENTRY)) << (i * 7);
                    } else {
                        throw new CorruptedInputException();
                    }
                } else {
                    throw new CorruptedInputException();
                }
            }
            return j;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    public static C70054b m268762a(byte[] bArr) throws IOException {
        for (int i = 0; i < C70099t.f175216a.length; i++) {
            if (bArr[i] != C70099t.f175216a[i]) {
                throw new XZFormatException();
            }
        }
        if (m268765a(bArr, C70099t.f175216a.length, 2, C70099t.f175216a.length + 2)) {
            try {
                return m268763a(bArr, C70099t.f175216a.length);
            } catch (UnsupportedOptionsException unused) {
                throw new UnsupportedOptionsException("Unsupported options in XZ Stream Header");
            }
        } else {
            throw new CorruptedInputException("XZ Stream Header is corrupt");
        }
    }

    /* renamed from: a */
    private static C70054b m268763a(byte[] bArr, int i) throws UnsupportedOptionsException {
        if (bArr[i] == 0) {
            int i2 = i + 1;
            if ((bArr[i2] & 255) < 16) {
                C70054b bVar = new C70054b();
                bVar.f175078a = bArr[i2];
                return bVar;
            }
        }
        throw new UnsupportedOptionsException();
    }

    /* renamed from: a */
    public static boolean m268764a(C70054b bVar, C70054b bVar2) {
        return bVar.f175078a == bVar2.f175078a;
    }

    /* renamed from: a */
    public static boolean m268765a(byte[] bArr, int i, int i2, int i3) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, i, i2);
        long value = crc32.getValue();
        for (int i4 = 0; i4 < 4; i4++) {
            if (((byte) ((int) (value >>> (i4 * 8)))) != bArr[i3 + i4]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static C70054b m268766b(byte[] bArr) throws IOException {
        if (bArr[10] != C70099t.f175217b[0] || bArr[11] != C70099t.f175217b[1]) {
            throw new CorruptedInputException("XZ Stream Footer is corrupt");
        } else if (m268765a(bArr, 4, 6, 0)) {
            try {
                C70054b a = m268763a(bArr, 8);
                a.f175079b = 0;
                for (int i = 0; i < 4; i++) {
                    a.f175079b |= (long) ((bArr[i + 4] & 255) << (i * 8));
                }
                a.f175079b = (a.f175079b + 1) * 4;
                return a;
            } catch (UnsupportedOptionsException unused) {
                throw new UnsupportedOptionsException("Unsupported options in XZ Stream Footer");
            }
        } else {
            throw new CorruptedInputException("XZ Stream Footer is corrupt");
        }
    }
}
