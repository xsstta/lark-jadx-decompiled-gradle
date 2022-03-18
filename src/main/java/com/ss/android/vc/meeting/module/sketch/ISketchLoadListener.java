package com.ss.android.vc.meeting.module.sketch;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/ISketchLoadListener;", "", "onSketchClosed", "", "onSketchLoadBegin", "onSketchLoadCanceled", "onSketchLoadFailed", "onSketchLoadFinished", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public interface ISketchLoadListener {
    void onSketchClosed();

    void onSketchLoadBegin();

    void onSketchLoadCanceled();

    void onSketchLoadFailed();

    void onSketchLoadFinished();
}
