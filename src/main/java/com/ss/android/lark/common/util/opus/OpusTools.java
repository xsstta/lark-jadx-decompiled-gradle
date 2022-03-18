package com.ss.android.lark.common.util.opus;

import android.util.Log;
import com.C1711a;
import java.nio.ByteBuffer;

public class OpusTools {
    public native void closeOpusFile();

    public native int decode(String str, String str2, String str3);

    public native int encode(String str, String str2, String str3);

    public native int getChannelCount();

    public native int getFinished();

    public native long getPcmOffset();

    public native int getSize();

    public native long getTotalPcmDuration();

    public native byte[] getWaveform(String str);

    public native int isOpusFile(String str);

    public native int openOpusFile(String str);

    public native int play(String str);

    public native byte[] readFrame(long j);

    public native void readOpusFile(ByteBuffer byteBuffer, int i);

    public native int seekOpusFile(float f);

    public native int startRecording(String str);

    public native void stopPlaying();

    public native void stopRecording();

    public native long writeFrame(ByteBuffer byteBuffer, int i);

    static {
        try {
            C1711a.m7628a("opustool");
            Log.d("OpusTools", "loaded library ");
        } catch (UnsatisfiedLinkError unused) {
            Log.e("OpusTools", "Could not load library ");
        }
    }
}
