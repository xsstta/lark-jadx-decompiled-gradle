package com.ss.android.vc.meeting.module.sketch.render.gl.model;

import android.graphics.PointF;

public class Operation {
    public float[] color = new float[4];
    public Command command;
    public PointF position = new PointF();

    public enum Command {
        CHANGE_AXIS,
        SCALE,
        TRANSLATE
    }
}
