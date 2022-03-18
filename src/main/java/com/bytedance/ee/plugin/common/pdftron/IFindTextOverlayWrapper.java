package com.bytedance.ee.plugin.common.pdftron;

import android.view.View;

public interface IFindTextOverlayWrapper {

    public interface FindTextCallback {
        void onFindTextTaskCancelled();

        void onFindTextTaskFinished(int i);

        void onFindTextTaskProgressUpdated(boolean z, int i, int i2);

        void onFindTextTaskStarted();
    }

    public interface FindTextTaskHolder {
        void cancel();
    }

    void cancelFindTask();

    FindTextTaskHolder executeFindText(String str, FindTextCallback findTextCallback);

    View getFindTextOverlayView();

    void gotoNextSearch();

    void gotoPreviousSearch();

    void onExitSearch();
}
