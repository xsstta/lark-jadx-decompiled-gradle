package com.ss.android.vc.meeting.module.sketch;

import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61420b;
import com.ss.android.vc.meeting.module.sketch.SketchListener;
import com.ss.android.vc.meeting.module.sketch.SketchRenderModel;
import com.ss.android.vc.meeting.module.sketch.action.SketchMode;
import com.ss.android.vc.meeting.p3104c.C61246b;

public abstract class AbsSketchControl extends AbstractC61420b implements ISketchLoadListener, ISketchViewListener {
    public String curShareScreenId;

    public abstract void addSketchLoadListener(ISketchLoadListener iSketchLoadListener);

    public abstract void addSketchViewListener(ISketchViewListener iSketchViewListener);

    public abstract void addTimeOutShapes(String str);

    public abstract boolean canSketchOn();

    public abstract void checkAndCreateSketchView();

    public abstract void enableOnlyPresenterCanAnnotate(boolean z);

    public abstract void eraseTimeOutShapes();

    public abstract SketchRenderModel getRenderModel();

    public abstract String getSketchInstanceId();

    public abstract SketchView getSketchView();

    public abstract boolean getTransferInVideo();

    public abstract boolean isAccessibility();

    public abstract boolean isGL();

    public abstract boolean isInSketch();

    public abstract boolean isSketchOn();

    public abstract void onPushScreenShareData(boolean z, InMeetingData.ScreenSharedData screenSharedData);

    public abstract void onTransferModeChanged();

    public abstract void openSketch();

    public abstract void reSizeGestureWrapper();

    public abstract void registerSketchEnableChangeListener(ISketchEnableChangeListener iSketchEnableChangeListener);

    public abstract void removeSketchLoadListener(ISketchLoadListener iSketchLoadListener);

    public abstract void removeSketchViewListener(ISketchViewListener iSketchViewListener);

    public abstract void restoreSketch();

    public abstract void sendAccesbilityRequest();

    public abstract void setCurrentAction(SketchMode sketchMode);

    public abstract void setFloatWindowWrapper(C61246b bVar);

    public abstract void setGestureSurfaceViewWrapper(C61246b bVar);

    public abstract void setOnSketchStartFailListener(SketchListener.OnSketchStartListener onSketchStartListener);

    public abstract void setOnSketchVisiblityListener(SketchListener.OnSketchVisibilityListener onSketchVisibilityListener);

    public abstract void setPaintColor(int i);

    public abstract void setSelfShapeCountListener(SketchRenderModel.OnSelfShapeCountListener onSelfShapeCountListener);

    public abstract void setSketchOn(boolean z);

    public abstract void setSketchView(SketchView sketchView);

    public abstract void setTransferInVideo(boolean z);

    public abstract void setVisible(boolean z);

    public abstract void switchVisible();

    public abstract void unRegisterSketchEnableChangeListener(ISketchEnableChangeListener iSketchEnableChangeListener);

    public abstract void undo();

    public AbsSketchControl(C61303k kVar) {
        super(kVar);
    }
}
