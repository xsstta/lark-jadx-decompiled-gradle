package ee.android.framework.manis.interfaces;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IProcessProvider {

    @Retention(RetentionPolicy.SOURCE)
    public @interface BASE_PROCESS_COMMAND {
    }
}
