package com.bytedance.ee.plugin.common.pdftron;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.bytedance.ee.plugin.common.pdftron.wrapper.Annot;
import java.util.Map;

public interface IToolManagerWrapper {

    public interface AnnotationModificationListener {
        void annotationsCouldNotBeAdded(String str);

        void onAnnotationsAdded(Map<Annot, Integer> map);

        void onAnnotationsModified(Map<Annot, Integer> map, Bundle bundle);

        void onAnnotationsPreModify(Map<Annot, Integer> map);

        void onAnnotationsPreRemove(Map<Annot, Integer> map);

        void onAnnotationsRemoved(Map<Annot, Integer> map);

        void onAnnotationsRemovedOnPage(int i);

        void showCommentEditor(int i, Annot annot);
    }

    public interface PreToolManagerListener {
        boolean onDoubleTap(MotionEvent motionEvent);

        boolean onDown(MotionEvent motionEvent);

        boolean onKeyUp(int i, KeyEvent keyEvent);

        void onLinkClick(int i, int i2, String str);

        boolean onLongPress(MotionEvent motionEvent);

        void onLongPressConfirmed(int i, float f, float f2);

        void onMarkupSingleTab(Annot annot);

        boolean onMove(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

        boolean onScale(float f, float f2);

        boolean onScaleBegin(float f, float f2);

        boolean onScaleEnd(float f, float f2);

        void onScrollChanged(int i, int i2, int i3, int i4);

        void onSingleTab();

        boolean onSingleTapConfirmed(MotionEvent motionEvent);

        boolean onUp(MotionEvent motionEvent);
    }

    public interface QuickMenuListener {
        boolean canComment();

        Map<String, String> getTitles();

        boolean onQuickMenuClicked(int i, String str);

        void onQuickMenuDismissed();

        void onQuickMenuShown();
    }

    void addAnnotationModificationListener(AnnotationModificationListener annotationModificationListener);

    void enableHighlight();

    void setPreToolManagerListener(PreToolManagerListener preToolManagerListener);

    void setQuickMenuListener(QuickMenuListener quickMenuListener);
}
