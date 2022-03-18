package com.ss.android.lark.widget.photo_picker.animation.activity_transition;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import com.ss.android.lark.widget.photo_picker.animation.activity_transition.p2946a.C58589c;
import java.io.Serializable;

public class ActivityTransitionLauncher {

    /* renamed from: a */
    private final Activity f144654a;

    /* renamed from: b */
    private View f144655b;

    /* renamed from: c */
    private Bitmap f144656c;

    /* renamed from: d */
    private int[] f144657d;

    /* renamed from: e */
    private LocationInfo f144658e;

    public static class LocationInfo implements Serializable {
        public int height;
        public int left;
        public int top;
        public int width;

        public LocationInfo() {
        }

        public LocationInfo(int i, int i2, int i3, int i4) {
            this.width = i;
            this.height = i2;
            this.left = i3;
            this.top = i4;
        }
    }

    /* renamed from: a */
    public Bundle mo198590a() {
        if (this.f144658e == null) {
            this.f144658e = m227225b(this.f144655b);
        }
        return C58589c.m227240a(this.f144654a, this.f144658e, this.f144656c, this.f144657d);
    }

    /* renamed from: a */
    public ActivityTransitionLauncher mo198591a(View view) {
        this.f144655b = view;
        return this;
    }

    private ActivityTransitionLauncher(Activity activity) {
        this.f144654a = activity;
    }

    /* renamed from: a */
    public static ActivityTransitionLauncher m227224a(Activity activity) {
        return new ActivityTransitionLauncher(activity);
    }

    /* renamed from: a */
    public ActivityTransitionLauncher mo198592a(LocationInfo locationInfo) {
        this.f144658e = locationInfo;
        return this;
    }

    /* renamed from: b */
    private LocationInfo m227225b(View view) {
        LocationInfo locationInfo = new LocationInfo();
        locationInfo.width = view.getMeasuredWidth();
        locationInfo.height = view.getMeasuredHeight();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        locationInfo.left = iArr[0];
        locationInfo.top = iArr[1];
        return locationInfo;
    }

    /* renamed from: a */
    public ActivityTransitionLauncher mo198593a(int[] iArr) {
        this.f144657d = iArr;
        return this;
    }
}
