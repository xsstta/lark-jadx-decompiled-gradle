package com.ss.android.vc.meeting.module.sketch.render.gl;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ss.android.vc.meeting.module.sketch.ISketchView;
import com.ss.android.vc.meeting.module.sketch.dto.Coord;
import com.ss.android.vc.meeting.module.sketch.render.gl.model.GLRenderModel;
import com.ss.android.vc.meeting.module.sketch.render.gl.shape.GLMark;
import java.util.concurrent.ConcurrentHashMap;

public class MarkersRenderer extends FrameLayout implements ISketchView {
    private ConcurrentHashMap<String, MarkTextView> marks = new ConcurrentHashMap<>();
    private GLRenderModel model;
    private Runnable updateRunnable = new Runnable() {
        /* class com.ss.android.vc.meeting.module.sketch.render.gl.$$Lambda$MarkersRenderer$ajwhVoOVP34XNTqJ4HvTA9IauLc */

        public final void run() {
            MarkersRenderer.lambda$ajwhVoOVP34XNTqJ4HvTA9IauLc(MarkersRenderer.this);
        }
    };

    public void postUpdate() {
        removeCallbacks(this.updateRunnable);
        post(this.updateRunnable);
    }

    /* access modifiers changed from: private */
    public void update() {
        for (GLMark gLMark : this.model.getMarkers().values()) {
            String str = gLMark.getData().id;
            if (gLMark.expired()) {
                remove(str);
            } else {
                if (!this.marks.containsKey(str)) {
                    add(gLMark);
                }
                update(str);
            }
        }
    }

    public void setModel(GLRenderModel gLRenderModel) {
        this.model = gLRenderModel;
    }

    public MarkersRenderer(Context context) {
        super(context);
    }

    private void add(GLMark gLMark) {
        MarkTextView markTextView = new MarkTextView(getContext(), gLMark);
        this.marks.put(gLMark.getData().id, markTextView);
        addView(markTextView, new FrameLayout.LayoutParams(-2, -2));
    }

    private void remove(String str) {
        MarkTextView remove = this.marks.remove(str);
        if (remove != null) {
            removeView(remove);
        }
        this.model.removeMark(str);
    }

    public void update(String str) {
        MarkTextView markTextView;
        if (this.marks.containsKey(str) && (markTextView = this.marks.get(str)) != null) {
            Coord position = markTextView.mark.getPosition();
            if (markTextView.mark.expired()) {
                remove(str);
                return;
            }
            Coord pcPoint2LocalPosition = this.model.pcPoint2LocalPosition(position);
            markTextView.setTranslationX(pcPoint2LocalPosition.f159003x);
            markTextView.setTranslationY(pcPoint2LocalPosition.f159004y);
        }
    }

    public MarkersRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MarkersRenderer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
