package androidx.core.util;

import android.util.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.Writer;

/* renamed from: androidx.core.util.b */
public class C0841b extends Writer {

    /* renamed from: a */
    private final String f3315a;

    /* renamed from: b */
    private StringBuilder f3316b = new StringBuilder((int) SmActions.ACTION_ONTHECALL_EXIT);

    @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
    public void close() {
        m3985a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m3985a();
    }

    /* renamed from: a */
    private void m3985a() {
        if (this.f3316b.length() > 0) {
            Log.d(this.f3315a, this.f3316b.toString());
            StringBuilder sb = this.f3316b;
            sb.delete(0, sb.length());
        }
    }

    public C0841b(String str) {
        this.f3315a = str;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m3985a();
            } else {
                this.f3316b.append(c);
            }
        }
    }
}
