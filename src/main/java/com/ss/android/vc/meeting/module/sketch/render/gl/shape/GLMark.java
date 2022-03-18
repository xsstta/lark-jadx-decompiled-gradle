package com.ss.android.vc.meeting.module.sketch.render.gl.shape;

import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.meeting.module.sketch.dto.Coord;
import com.ss.android.vc.meeting.module.sketch.dto.MarkerDrawableData;
import com.ss.android.vc.meeting.module.sketch.render.IMarkRender;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/vc/meeting/module/sketch/render/gl/shape/GLMark;", "Lcom/ss/android/vc/meeting/module/sketch/render/IMarkRender;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/vc/meeting/module/sketch/dto/MarkerDrawableData;", "(Lcom/ss/android/vc/meeting/module/sketch/dto/MarkerDrawableData;)V", "coord", "Lcom/ss/android/vc/meeting/module/sketch/dto/Coord;", "getData", "()Lcom/ss/android/vc/meeting/module/sketch/dto/MarkerDrawableData;", "expireTime", "", "expired", "", "expiresAfter", "timeMills", "getPosition", "update", "position", "updated", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class GLMark implements IMarkRender {
    private Coord coord;
    private final MarkerDrawableData data;
    private long expireTime = -1;

    public final boolean updated() {
        return false;
    }

    public final MarkerDrawableData getData() {
        return this.data;
    }

    public final Coord getPosition() {
        return this.coord;
    }

    public final boolean expired() {
        if (this.expireTime <= 0 || System.currentTimeMillis() <= this.expireTime) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.render.IMarkRender
    public GLMark expiresAfter(long j) {
        if (j <= 0) {
            return this;
        }
        this.expireTime = System.currentTimeMillis() + j;
        return this;
    }

    public final GLMark update(Coord coord2) {
        Intrinsics.checkParameterIsNotNull(coord2, "position");
        this.coord.f159003x = coord2.f159003x;
        this.coord.f159004y = coord2.f159004y;
        return this;
    }

    public GLMark(MarkerDrawableData markerDrawableData) {
        Intrinsics.checkParameterIsNotNull(markerDrawableData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.data = markerDrawableData;
        Coord coord2 = new Coord(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.coord = coord2;
        coord2.f159003x = markerDrawableData.position.f159003x;
        this.coord.f159004y = markerDrawableData.position.f159004y;
    }
}
