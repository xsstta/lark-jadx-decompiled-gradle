package androidx.webkit;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class TracingConfig {

    @Retention(RetentionPolicy.SOURCE)
    public @interface PredefinedCategories {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TracingMode {
    }
}
