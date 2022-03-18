package com.ss.android.vc.meeting.module.sketch;

public class SketchListener {

    public interface ITurnOffListener {
        void onTurnSketchOff();
    }

    public interface ITurnOnListener {
        void onTurnSketchOn();
    }

    public interface OnPanelClickListener {
        void onClickArrow();

        void onClickColor(int i);

        void onClickHighlight();

        void onClickPen();

        void onClickUndo();
    }

    public interface OnSketchStartListener {
        void onStartFailed(int i);

        void onStartSuccess();
    }

    public interface OnSketchVisibilityListener {
        void setVisible(boolean z);

        void switchVisible();
    }
}
