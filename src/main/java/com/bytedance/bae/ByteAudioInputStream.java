package com.bytedance.bae;

import com.bytedance.bae.ByteAudioSinkInterface;
import java.util.LinkedHashMap;

public class ByteAudioInputStream {
    public int gain;
    public boolean mute;
    public long nativeEnginePtr;
    public long nativeStreamPtr;
    public ByteAudioInputSinkProxy sinkProxy;
    public int stream_id;

    public long getID() {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeInputStreamGetId(j);
        }
        return -1;
    }

    public String getName() {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeInputStreamGetName(j);
        }
        return null;
    }

    public LinkedHashMap getStatsReport() {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeInputStreamGetStatsReport(j);
        }
        return null;
    }

    public int startStream() {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeInputStreamStart(j);
        }
        return -1;
    }

    public int stopStream() {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeInputStreamStop(j);
        }
        return -1;
    }

    public void releaseStream() {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            long j2 = this.nativeEnginePtr;
            if (j2 != 0) {
                ByteAudioNativeFunctions.nativeDestroyInputStream(j2, j);
                this.nativeStreamPtr = 0;
            }
        }
    }

    public ByteAudioStreamOption inputStreamGetValue(int i) {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeInputStreamGetValue(j, i);
        }
        return null;
    }

    public int setMute(boolean z) {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeInputStreamSetMute(j, z);
        }
        return -1;
    }

    public int setStreamFormat(ByteAudioStreamFormat byteAudioStreamFormat) {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeInputStreamSetFormat(j, byteAudioStreamFormat);
        }
        return -1;
    }

    public int setGain(int i) {
        long j = this.nativeStreamPtr;
        if (j == 0) {
            return -1;
        }
        this.gain = i;
        return ByteAudioNativeFunctions.nativeInputStreamSetGain(j, i);
    }

    public void setSink(ByteAudioSinkInterface.ByteAudioInputSink byteAudioInputSink) {
        ByteAudioInputSinkProxy byteAudioInputSinkProxy = new ByteAudioInputSinkProxy(byteAudioInputSink, this);
        this.sinkProxy = byteAudioInputSinkProxy;
        long j = this.nativeStreamPtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeInputStreamSetSink(j, byteAudioInputSinkProxy);
        }
    }

    public int inputStreamSetValue(int i, ByteAudioStreamOption byteAudioStreamOption) {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeInputStreamSetValue(j, i, byteAudioStreamOption);
        }
        return -1;
    }

    public ByteAudioInputStream(long j, String str) {
        this.nativeEnginePtr = j;
        if (j != 0) {
            this.nativeStreamPtr = ByteAudioNativeFunctions.nativeCreateInputStream(j, str);
        }
    }
}
