package com.ss.android.vc.irtc.impl.widget.utils;

import com.ss.android.vc.irtc.C61070t;
import com.ss.android.vc.irtc.C61071u;
import com.ss.android.vc.irtc.impl.widget.webrtc.BvVideoFrame;
import com.ss.video.rtc.engine.utils.ByteAudioFrame;

public class VideoFrameUtils {
    public static C61070t convert2VcAudioFrame(ByteAudioFrame byteAudioFrame) {
        if (byteAudioFrame == null) {
            return null;
        }
        return new C61070t(byteAudioFrame.samples, byteAudioFrame.numOfSamples, byteAudioFrame.bytesPerSample, byteAudioFrame.channels, byteAudioFrame.samplesPerSec);
    }

    public static C61071u convert2VcVideoFrame(BvVideoFrame bvVideoFrame) {
        if (bvVideoFrame == null) {
            return null;
        }
        return new C61071u(bvVideoFrame.f152921y, bvVideoFrame.f152919u, bvVideoFrame.f152920v, bvVideoFrame.ystride, bvVideoFrame.ustride, bvVideoFrame.vstride, bvVideoFrame.width, bvVideoFrame.height, bvVideoFrame.rotation, bvVideoFrame.timestamp, bvVideoFrame.flip);
    }

    public static BvVideoFrame convert2VideoFrame(C61071u uVar) {
        if (uVar == null) {
            return null;
        }
        return new BvVideoFrame(uVar.f152941a, uVar.f152942b, uVar.f152943c, uVar.f152944d, uVar.f152945e, uVar.f152946f, uVar.f152947g, uVar.f152948h, uVar.f152949i, uVar.f152950j, uVar.f152951k);
    }

    public static void audioFrameCopyFromVc(ByteAudioFrame byteAudioFrame, C61070t tVar) {
        byteAudioFrame.samples = tVar.f152936a;
        byteAudioFrame.numOfSamples = tVar.f152937b;
        byteAudioFrame.bytesPerSample = tVar.f152938c;
        byteAudioFrame.channels = tVar.f152939d;
        byteAudioFrame.samplesPerSec = tVar.f152937b * 100;
    }
}
