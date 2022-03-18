package org.chromium.support_lib_boundary;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface WebSettingsBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ForceDarkBehavior {
    }

    int getDisabledActionModeMenuItems();

    int getForceDark();

    int getForceDarkBehavior();

    boolean getOffscreenPreRaster();

    boolean getSafeBrowsingEnabled();

    boolean getWillSuppressErrorPage();

    void setDisabledActionModeMenuItems(int i);

    void setForceDark(int i);

    void setForceDarkBehavior(int i);

    void setOffscreenPreRaster(boolean z);

    void setSafeBrowsingEnabled(boolean z);

    void setWillSuppressErrorPage(boolean z);
}
