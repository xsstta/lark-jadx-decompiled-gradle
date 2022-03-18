package androidx.webkit;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class ServiceWorkerWebSettingsCompat {

    @Retention(RetentionPolicy.SOURCE)
    public @interface CacheMode {
    }
}
