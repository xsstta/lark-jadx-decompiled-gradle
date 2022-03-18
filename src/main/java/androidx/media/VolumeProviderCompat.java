package androidx.media;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class VolumeProviderCompat {

    /* renamed from: a */
    private final int f4438a;

    /* renamed from: b */
    private final int f4439b;

    /* renamed from: c */
    private int f4440c;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ControlType {
    }

    /* renamed from: androidx.media.VolumeProviderCompat$a */
    public static abstract class AbstractC1223a {
    }

    /* renamed from: a */
    public void mo6202a(int i) {
    }

    /* renamed from: b */
    public void mo6204b(int i) {
    }

    /* renamed from: a */
    public final int mo6201a() {
        return this.f4440c;
    }

    /* renamed from: b */
    public final int mo6203b() {
        return this.f4438a;
    }

    /* renamed from: c */
    public final int mo6205c() {
        return this.f4439b;
    }
}
