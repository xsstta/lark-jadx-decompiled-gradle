package com.ss.android.vc.meeting.module.sketch;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.module.sketch.SketchListener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/ISketchViewListener;", "", "closeSketchPenel", "", "hideView", "setSketchTurnOffListener", "listener", "Lcom/ss/android/vc/meeting/module/sketch/SketchListener$ITurnOffListener;", "showAccessibilityDialog", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "showSketch", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public interface ISketchViewListener {
    void closeSketchPenel();

    void hideView();

    void setSketchTurnOffListener(SketchListener.ITurnOffListener iTurnOffListener);

    void showAccessibilityDialog(VideoChat videoChat);

    void showSketch();
}
