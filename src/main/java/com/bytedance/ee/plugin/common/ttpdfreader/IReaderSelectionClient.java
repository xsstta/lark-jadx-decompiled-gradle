package com.bytedance.ee.plugin.common.ttpdfreader;

import android.os.Bundle;
import android.view.View;

public interface IReaderSelectionClient {
    View getLeftIndicator();

    View getPopupMenu();

    View getRightIndicator();

    void onSelectionChanged(String str, Bundle bundle);
}
