package com.bytedance.ee.bear.templates.preview.announce;

import com.bytedance.ee.util.io.NonProguard;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001b¨\u0006 "}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/announce/TemplateData;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "baseRev", "", "getBaseRev", "()I", "setBaseRev", "(I)V", "needAnimation", "", "getNeedAnimation", "()Ljava/lang/Boolean;", "setNeedAnimation", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "position", "getPosition", "setPosition", "visible", "getVisible", "setVisible", "x", "", "getX", "()Ljava/lang/Float;", "setX", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "y", "getY", "setY", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class TemplateData implements NonProguard {
    private int baseRev;
    private Boolean needAnimation = false;
    private int position;
    private Boolean visible = false;

    /* renamed from: x */
    private Float f31114x;

    /* renamed from: y */
    private Float f31115y;

    public final int getBaseRev() {
        return this.baseRev;
    }

    public final Boolean getNeedAnimation() {
        return this.needAnimation;
    }

    public final int getPosition() {
        return this.position;
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public final Float getX() {
        return this.f31114x;
    }

    public final Float getY() {
        return this.f31115y;
    }

    public final void setBaseRev(int i) {
        this.baseRev = i;
    }

    public final void setNeedAnimation(Boolean bool) {
        this.needAnimation = bool;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public final void setVisible(Boolean bool) {
        this.visible = bool;
    }

    public final void setX(Float f) {
        this.f31114x = f;
    }

    public final void setY(Float f) {
        this.f31115y = f;
    }
}
