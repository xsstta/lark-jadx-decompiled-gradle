package com.tt.miniapp.component.nativeview;

import android.util.SparseArray;
import android.view.View;

public interface NativeViewManager {
    View findViewWithCoordinates(float f, float f2);

    SparseArray<View> getAllNativeViews();

    InputBean getCurrentInputValue();

    String getCurrentUrl();

    View getFocusedInput();

    View getView(int i);

    String getViewType();

    void setShowConfirmBar(boolean z);
}
