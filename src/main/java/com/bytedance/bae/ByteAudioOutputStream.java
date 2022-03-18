package com.bytedance.bae;

import com.bytedance.bae.ByteAudioSinkInterface;
import java.util.LinkedHashMap;

public class ByteAudioOutputStream {
    public int gain;
    public boolean mute;
    public long nativeEnginePtr;
    public long nativeStreamPtr;
    public ByteAudioOutputSinkProxy sinkProxy;
    public int stream_id;

    public long getID() {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeOutputStreamGetId(j);
        }
        return -1;
    }

    public String getName() {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeOutputStreamGetName(j);
        }
        return null;
    }

    public LinkedHashMap getStatsReport() {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeOutputStreamGetStatsReport(j);
        }
        return null;
    }

    public int startStream() {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeOutputStreamStart(j);
        }
        return -1;
    }

    public int stopStream() {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeOutputStreamStop(j);
        }
        return -1;
    }

    public void releaseStream() {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            long j2 = this.nativeEnginePtr;
            if (j2 != 0) {
                ByteAudioNativeFunctions.nativeDestroyOutputStream(j2, j);
                this.nativeStreamPtr = 0;
            }
        }
    }

    public ByteAudioStreamOption outputStreamGetValue(int i) {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeOutputStreamGetValue(j, i);
        }
        return null;
    }

    public int setMute(boolean z) {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeOutputStreamSetMute(j, z);
        }
        return -1;
    }

    public int setStreamFormat(ByteAudioStreamFormat byteAudioStreamFormat) {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeOutputStreamSetFormat(j, byteAudioStreamFormat);
        }
        return -1;
    }

    public int setGain(int i) {
        long j = this.nativeStreamPtr;
        if (j == 0) {
            return -1;
        }
        this.gain = i;
        return ByteAudioNativeFunctions.nativeOutputStreamSetGain(j, i);
    }

    public void setSink(ByteAudioSinkInterface.ByteAudioOutputSink byteAudioOutputSink) {
        ByteAudioOutputSinkProxy byteAudioOutputSinkProxy = new ByteAudioOutputSinkProxy(byteAudioOutputSink, this);
        this.sinkProxy = byteAudioOutputSinkProxy;
        long j = this.nativeStreamPtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeOutputStreamSetSink(j, byteAudioOutputSinkProxy);
        }
    }

    public int outputStreamSetValue(int i, ByteAudioStreamOption byteAudioStreamOption) {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeOutputStreamSetValue(j, i, byteAudioStreamOption);
        }
        return -1;
    }

    public ByteAudioOutputStream(long j, String str) {
        this.nativeEnginePtr = j;
        if (j != 0) {
            this.nativeStreamPtr = ByteAudioNativeFunctions.nativeCreateOutputStream(j, str);
        }
    }
}
