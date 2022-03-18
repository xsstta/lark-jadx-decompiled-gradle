package org.webrtc;

import android.media.MediaRecorder;
import org.webrtc.CameraEnumerationAndroid;

public interface CameraVideoCapturer extends VideoCapturer {

    public interface CameraEventsHandler {
        void onCameraClosed();

        void onCameraConfig(int i, int i2, CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange);

        void onCameraDisconnected();

        void onCameraError(String str);

        void onCameraFreezed(String str);

        void onCameraOpening(String str);

        void onFirstFrameAvailable();
    }

    public interface CameraSwitchHandler {
        void onCameraSwitchDone(boolean z);

        void onCameraSwitchError(String str);
    }

    public interface MediaRecorderHandler {
        void onMediaRecorderError(String str);

        void onMediaRecorderSuccess();
    }

    void addMediaRecorderToCamera(MediaRecorder mediaRecorder, MediaRecorderHandler mediaRecorderHandler);

    void removeMediaRecorderFromCamera(MediaRecorderHandler mediaRecorderHandler);

    void setOrientationMode(ORIENTATION_MODE orientation_mode);

    void switchCamera(CameraSwitchHandler cameraSwitchHandler);

    public enum ORIENTATION_MODE {
        ORIENTATION_MODE_ADAPTIVE(0),
        ORIENTATION_MODE_FIXED_LANDSCAPE(1),
        ORIENTATION_MODE_FIXED_PORTRAIT(2);
        
        private int value;

        public int getValue() {
            return this.value;
        }

        public static ORIENTATION_MODE convertFromInt(int i) {
            return values()[i];
        }

        private ORIENTATION_MODE(int i) {
            this.value = i;
        }
    }

    public static class CameraStatistics {
        private final Runnable cameraObserver;
        public final CameraEventsHandler eventsHandler;
        public int frameCount;
        public int freezePeriodCount;
        public final SurfaceTextureHelper surfaceTextureHelper;

        public void addFrame() {
            checkThread();
            this.frameCount++;
        }

        public void release() {
            this.surfaceTextureHelper.getHandler().removeCallbacks(this.cameraObserver);
        }

        private void checkThread() {
            if (Thread.currentThread() != this.surfaceTextureHelper.getHandler().getLooper().getThread()) {
                throw new IllegalStateException("Wrong thread");
            }
        }

        public CameraStatistics(SurfaceTextureHelper surfaceTextureHelper2, CameraEventsHandler cameraEventsHandler) {
            RunnableC701151 r0 = new Runnable() {
                /* class org.webrtc.CameraVideoCapturer.CameraStatistics.RunnableC701151 */

                public void run() {
                    Logging.m268870d("CameraStatistics", "Camera fps: " + Math.round((((float) CameraStatistics.this.frameCount) * 1000.0f) / 2000.0f) + ".");
                    if (CameraStatistics.this.frameCount == 0) {
                        CameraStatistics.this.freezePeriodCount++;
                        if (CameraStatistics.this.freezePeriodCount * 2000 >= 4000 && CameraStatistics.this.eventsHandler != null) {
                            Logging.m268871e("CameraStatistics", "Camera freezed.");
                            if (CameraStatistics.this.surfaceTextureHelper.isTextureInUse()) {
                                CameraStatistics.this.eventsHandler.onCameraFreezed("Camera failure. Client must return video buffers.");
                                return;
                            } else {
                                CameraStatistics.this.eventsHandler.onCameraFreezed("Camera failure.");
                                return;
                            }
                        }
                    } else {
                        CameraStatistics.this.freezePeriodCount = 0;
                    }
                    CameraStatistics.this.frameCount = 0;
                    CameraStatistics.this.surfaceTextureHelper.getHandler().postDelayed(this, 2000);
                }
            };
            this.cameraObserver = r0;
            if (surfaceTextureHelper2 != null) {
                this.surfaceTextureHelper = surfaceTextureHelper2;
                this.eventsHandler = cameraEventsHandler;
                this.frameCount = 0;
                this.freezePeriodCount = 0;
                surfaceTextureHelper2.getHandler().postDelayed(r0, 2000);
                return;
            }
            throw new IllegalArgumentException("SurfaceTextureHelper is null");
        }
    }

    /* renamed from: org.webrtc.CameraVideoCapturer$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$removeMediaRecorderFromCamera(CameraVideoCapturer cameraVideoCapturer, MediaRecorderHandler mediaRecorderHandler) {
            throw new UnsupportedOperationException("Deprecated and not implemented.");
        }

        public static void $default$addMediaRecorderToCamera(CameraVideoCapturer cameraVideoCapturer, MediaRecorder mediaRecorder, MediaRecorderHandler mediaRecorderHandler) {
            throw new UnsupportedOperationException("Deprecated and not implemented.");
        }
    }
}
