package com.ss.android.vc.meeting.module.sketch;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.sketch.action.ISketchAction;
import com.ss.android.vc.meeting.module.sketch.dto.Coord;

public class SketchView {
    protected TouchAction currentAction = TouchAction.NO_ACTION;
    protected boolean isGL;
    protected C61303k meeting;
    protected ISketchViewImpl sketchViewImpl;

    public enum TouchAction {
        ACTION_DOWN,
        ACTION_MOVE,
        NO_ACTION
    }

    public TouchAction getCurrentTouchAction() {
        return this.currentAction;
    }

    public C61303k getMeeting() {
        return this.meeting;
    }

    public boolean isGL() {
        return this.isGL;
    }

    private void init() {
        this.sketchViewImpl.onInit();
    }

    public void destroy() {
        this.sketchViewImpl.onDestroy();
    }

    public void detach() {
        this.sketchViewImpl.detach();
    }

    public void enterScaleMode() {
        this.sketchViewImpl.enterScaleMode();
    }

    public View getImplView() {
        return this.sketchViewImpl.getImplView();
    }

    public SketchRenderModel getRenderModel() {
        return this.sketchViewImpl.getRenderModel();
    }

    public void onEndRender() {
        this.sketchViewImpl.onEndRender();
    }

    public void onStartRender() {
        this.sketchViewImpl.onStartRender();
    }

    public void endRender() {
        if (SketchControl.isSeeSketchFG()) {
            onEndRender();
        }
    }

    public void startRender() {
        boolean z;
        C60700b.m235851b("[Sketch] [SketchView]", "[startRender]", "startRender");
        boolean isSeeSketchFG = SketchControl.isSeeSketchFG();
        C61303k kVar = this.meeting;
        boolean z2 = false;
        if (kVar != null) {
            z2 = kVar.ag().canSketchOn();
            z = this.meeting.ag().isInSketch();
        } else {
            z = false;
        }
        if (!isSeeSketchFG || !z2 || !z) {
            C60700b.m235861e("[Sketch] [SketchView]", "[startRender2]", " failed: [fg]" + isSeeSketchFG + "  [canSketchOn]" + z2 + "  [inSketch]" + z);
            return;
        }
        onStartRender();
    }

    public void setLayoutParams(FrameLayout.LayoutParams layoutParams) {
        this.sketchViewImpl.resetLayoutParams(layoutParams);
    }

    public void setRenderModel(SketchRenderModel sketchRenderModel) {
        this.sketchViewImpl.setRenderModel(sketchRenderModel);
    }

    public void setVisibility(int i) {
        this.sketchViewImpl.setVisibleStatus(i);
    }

    public Coord translateCoordinate(Coord coord) {
        return this.sketchViewImpl.translateCoordinate(coord);
    }

    public void onContentBoundChanged(RectF rectF) {
        getRenderModel().setContentBoundary(rectF);
        this.sketchViewImpl.onContentBoundChanged(rectF);
    }

    public void attach(ViewGroup viewGroup, FrameLayout.LayoutParams layoutParams) {
        this.sketchViewImpl.attach(viewGroup, layoutParams);
    }

    public SketchView(Context context, C61303k kVar) {
        this.meeting = kVar;
        boolean isGL2 = kVar.ag().isGL();
        this.isGL = isGL2;
        ISketchViewImpl createSketchViewImpl = SketchViewImplFactory.createSketchViewImpl(context, this, this.meeting, isGL2);
        this.sketchViewImpl = createSketchViewImpl;
        createSketchViewImpl.setSketchView(this);
        setRenderModel(kVar.ag().getRenderModel());
        init();
    }

    public void touchDown(Coord coord, float f) {
        this.currentAction = TouchAction.ACTION_DOWN;
        C60700b.m235843a("[Sketch] [SketchView]", "[touchDown]", "percent point = " + coord);
        ISketchAction currentAction2 = getRenderModel().getCurrentAction();
        if (currentAction2 != null) {
            Coord translateCoordinate = translateCoordinate(coord);
            currentAction2.touchDown(translateCoordinate.f159003x, translateCoordinate.f159004y, f, this.meeting);
        }
    }

    public void touchMove(Coord coord, float f) {
        this.currentAction = TouchAction.ACTION_MOVE;
        C60700b.m235843a("[Sketch] [SketchView]", "[touchMove]", "percent point = " + coord);
        ISketchAction currentAction2 = getRenderModel().getCurrentAction();
        if (currentAction2 != null) {
            Coord translateCoordinate = translateCoordinate(coord);
            currentAction2.touchMove(translateCoordinate.f159003x, translateCoordinate.f159004y, f, this.meeting);
        }
    }

    public void touchUp(Coord coord, float f) {
        this.currentAction = TouchAction.NO_ACTION;
        C60700b.m235843a("[Sketch] [SketchView]", "[touchUp]", "percent point = " + coord);
        ISketchAction currentAction2 = getRenderModel().getCurrentAction();
        if (currentAction2 != null) {
            Coord translateCoordinate = translateCoordinate(coord);
            currentAction2.touchUp(translateCoordinate.f159003x, translateCoordinate.f159004y, f, this.meeting);
        }
    }
}
