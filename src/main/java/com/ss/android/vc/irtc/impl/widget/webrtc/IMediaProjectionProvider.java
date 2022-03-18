package com.ss.android.vc.irtc.impl.widget.webrtc;

import android.media.projection.MediaProjection;

public interface IMediaProjectionProvider {
    MediaProjection getMediaProjection();

    boolean isValid();
}
