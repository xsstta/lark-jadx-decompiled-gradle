package com.ss.android.vc.meeting.module.sketch.action;

import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.sketch.SketchRenderModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\n\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J*\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H&J*\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H&J*\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u001a"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/action/ISketchAction;", "", "model", "Lcom/ss/android/vc/meeting/module/sketch/SketchRenderModel;", "getModel", "()Lcom/ss/android/vc/meeting/module/sketch/SketchRenderModel;", "enterScaleMode", "", "getCurrentId", "", "getMode", "Lcom/ss/android/vc/meeting/module/sketch/action/SketchMode;", "onSelected", "selected", "", "color", "", "touchDown", "posX", "", "posY", "scale", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "touchMove", "touchUp", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public interface ISketchAction {
    void enterScaleMode();

    String getCurrentId();

    SketchMode getMode();

    SketchRenderModel getModel();

    void onSelected(boolean z, int i);

    void touchDown(float f, float f2, float f3, C61303k kVar);

    void touchMove(float f, float f2, float f3, C61303k kVar);

    boolean touchUp(float f, float f2, float f3, C61303k kVar);
}
