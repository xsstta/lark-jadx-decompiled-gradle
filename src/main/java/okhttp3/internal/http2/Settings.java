package okhttp3.internal.http2;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.Arrays;

public final class Settings {
    private int set;
    private final int[] values = new int[10];

    /* access modifiers changed from: package-private */
    public int size() {
        return Integer.bitCount(this.set);
    }

    /* access modifiers changed from: package-private */
    public void clear() {
        this.set = 0;
        Arrays.fill(this.values, 0);
    }

    /* access modifiers changed from: package-private */
    public int getHeaderTableSize() {
        if ((this.set & 2) != 0) {
            return this.values[1];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public int getInitialWindowSize() {
        if ((this.set & SmActions.ACTION_ONTHECALL_EXIT) != 0) {
            return this.values[7];
        }
        return 65535;
    }

    /* access modifiers changed from: package-private */
    public int get(int i) {
        return this.values[i];
    }

    /* access modifiers changed from: package-private */
    public int getMaxConcurrentStreams(int i) {
        if ((this.set & 16) != 0) {
            return this.values[4];
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public int getMaxFrameSize(int i) {
        if ((this.set & 32) != 0) {
            return this.values[5];
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public int getMaxHeaderListSize(int i) {
        if ((this.set & 64) != 0) {
            return this.values[6];
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public boolean isSet(int i) {
        if (((1 << i) & this.set) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean getEnablePush(boolean z) {
        int i;
        if ((this.set & 4) != 0) {
            i = this.values[2];
        } else if (z) {
            i = 1;
        } else {
            i = 0;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void merge(Settings settings) {
        for (int i = 0; i < 10; i++) {
            if (settings.isSet(i)) {
                set(i, settings.get(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Settings set(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.values;
            if (i < iArr.length) {
                this.set = (1 << i) | this.set;
                iArr[i] = i2;
            }
        }
        return this;
    }
}
