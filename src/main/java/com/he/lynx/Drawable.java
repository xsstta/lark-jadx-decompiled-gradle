package com.he.lynx;

import android.view.SurfaceHolder;
import android.view.View;

public class Drawable {
    public final SurfaceHolder holder;
    public final long ptr;
    public final View view;

    public Drawable(long j, View view2, SurfaceHolder surfaceHolder) {
        this.ptr = j;
        this.view = view2;
        this.holder = surfaceHolder;
    }
}
