package com.ss.video.rtc.engine.data;

import android.util.Pair;
import com.ss.video.rtc.engine.VideoStreamDescription;
import com.ss.video.rtc.engine.utils.LogUtil;
import com.ss.video.rtc.engine.video.VideoEncoderConfiguration;
import java.util.Arrays;

public class ByteRtcData {
    private VideoEncoderConfiguration.ORIENTATION_MODE mOrientationMode;
    private VideoStreamDescription[] videoStreamDescriptions = new VideoStreamDescription[1];

    /* access modifiers changed from: private */
    public static class SingletonHelper {
        public static final ByteRtcData INSTANCE = new ByteRtcData();

        private SingletonHelper() {
        }
    }

    public static ByteRtcData instance() {
        return SingletonHelper.INSTANCE;
    }

    public VideoEncoderConfiguration.ORIENTATION_MODE getOrientationMode() {
        return this.mOrientationMode;
    }

    public VideoStreamDescription[] getVideoStreamDescriptions() {
        return this.videoStreamDescriptions;
    }

    public ByteRtcData() {
        VideoStreamDescription videoStreamDescription = new VideoStreamDescription();
        videoStreamDescription.videoSize = new Pair<>(640, 360);
        videoStreamDescription.frameRate = 20;
        videoStreamDescription.maxKbps = 600;
        this.videoStreamDescriptions[0] = videoStreamDescription;
        this.mOrientationMode = VideoEncoderConfiguration.ORIENTATION_MODE.ORIENTATION_MODE_ADAPTIVE;
    }

    public void setOrientationMode(VideoEncoderConfiguration.ORIENTATION_MODE orientation_mode) {
        this.mOrientationMode = orientation_mode;
    }

    public void setVideoStreamDescriptions(VideoStreamDescription[] videoStreamDescriptionArr) {
        LogUtil.m257132i("ByteRtcData", "setVideoStreamDescriptions: " + Arrays.toString(videoStreamDescriptionArr));
        this.videoStreamDescriptions = videoStreamDescriptionArr;
    }
}
