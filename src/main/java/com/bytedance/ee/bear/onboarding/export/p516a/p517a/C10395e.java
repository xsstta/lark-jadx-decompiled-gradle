package com.bytedance.ee.bear.onboarding.export.p516a.p517a;

import android.graphics.RectF;
import android.view.View;
import com.bytedance.ee.bear.onboarding.export.Direction;
import java.util.Arrays;

/* renamed from: com.bytedance.ee.bear.onboarding.export.a.a.e */
public class C10395e extends C10388a {

    /* renamed from: a */
    private String f27953a;

    /* renamed from: b */
    private String f27954b;

    /* renamed from: c */
    private View f27955c;

    /* renamed from: d */
    private int[] f27956d;

    /* renamed from: e */
    private RectF f27957e;

    /* renamed from: f */
    private Direction f27958f;

    /* renamed from: g */
    private int f27959g;

    /* renamed from: h */
    private int f27960h = -1;

    /* renamed from: b */
    public RectF mo39590b() {
        return this.f27957e;
    }

    /* renamed from: c */
    public String mo39592c() {
        return this.f27953a;
    }

    /* renamed from: d */
    public String mo39593d() {
        return this.f27954b;
    }

    /* renamed from: e */
    public View mo39594e() {
        return this.f27955c;
    }

    /* renamed from: f */
    public int[] mo39595f() {
        return this.f27956d;
    }

    /* renamed from: g */
    public Direction mo39596g() {
        return this.f27958f;
    }

    /* renamed from: h */
    public int mo39597h() {
        return this.f27959g;
    }

    /* renamed from: i */
    public int mo39598i() {
        return this.f27960h;
    }

    public String toString() {
        return "TextData{title='" + this.f27953a + '\'' + ", body='" + this.f27954b + '\'' + ", targetView=" + this.f27955c + ", timerDuration=" + this.f27959g + ", autoDismissDelayTime=" + this.f27960h + ", targetPos=" + Arrays.toString(this.f27956d) + '}';
    }

    /* renamed from: a */
    public C10395e mo39587a(String str) {
        this.f27954b = str;
        return this;
    }

    /* renamed from: a */
    public void mo39588a(int i) {
        this.f27959g = i;
    }

    /* renamed from: b */
    public void mo39591b(int i) {
        this.f27960h = i;
    }

    /* renamed from: a */
    public void mo39589a(Direction direction) {
        this.f27958f = direction;
    }

    public C10395e(String str, RectF rectF) {
        this.f27953a = str;
        this.f27957e = rectF;
    }

    public C10395e(String str, View view) {
        this.f27953a = str;
        this.f27955c = view;
    }

    public C10395e(String str, int[] iArr) {
        this.f27953a = str;
        this.f27956d = iArr;
    }
}
