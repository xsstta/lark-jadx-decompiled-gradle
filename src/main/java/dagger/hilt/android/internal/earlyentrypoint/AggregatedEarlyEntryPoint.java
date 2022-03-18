package dagger.hilt.android.internal.earlyentrypoint;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
public @interface AggregatedEarlyEntryPoint {
    String earlyEntryPoint();
}
