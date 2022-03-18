package com.ss.android.vc.meeting.module.sketch;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.vc.meeting.module.sketch.dto.Coord;

public interface ISketchViewImpl extends ISketchView {
    void attach(ViewGroup viewGroup, FrameLayout.LayoutParams layoutParams);

    void detach();

    void enterScaleMode();

    View getImplView();

    SketchRenderModel getRenderModel();

    void onContentBoundChanged(RectF rectF);

    void onDestroy();

    void onEndRender();

    void onInit();

    void onStartRender();

    void resetLayoutParams(FrameLayout.LayoutParams layoutParams);

    void setRenderModel(SketchRenderModel sketchRenderModel);

    void setSketchView(SketchView sketchView);

    void setVisibleStatus(int i);

    Coord translateCoordinate(Coord coord);
}
