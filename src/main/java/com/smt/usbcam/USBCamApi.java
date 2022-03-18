package com.smt.usbcam;

import android.content.Context;
import android.util.Size;
import android.view.Surface;
import java.util.List;

public interface USBCamApi {
    void deinit();

    List<Size> getSupportSize();

    void init(Context context, OnConnectListener onConnectListener);

    void setBufferSize(Size size);

    void setFrameCallback(FrameCallback frameCallback, USBCamPixelFormat uSBCamPixelFormat);

    void setSurface(Surface surface);

    boolean startPreview();

    void stopPreview();
}
