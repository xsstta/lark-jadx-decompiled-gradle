package com.bytedance.bae;

import com.bytedance.bae.ByteAudioSinkInterface;

public class ByteAudioAuxStream {
    public int gain;
    public boolean mute;
    public long nativeEnginePtr;
    public long nativeStreamPtr;
    public ByteAudioAuxSinkProxy sinkProxy;
    public int stream_id;

    public void clearInputStreamNameForMix() {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeClearInputStreamNameForMix(j);
        }
    }

    public long getID() {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeAuxStreamGetId(j);
        }
        return -1;
    }

    public String getName() {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeAuxStreamGetName(j);
        }
        return null;
    }

    public int pauseStream() {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeAuxStreamPause(j);
        }
        return -1;
    }

    public int resumeStream() {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeAuxStreamResume(j);
        }
        return -1;
    }

    public int startStream() {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeAuxStreamStart(j);
        }
        return -1;
    }

    public int stopStream() {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeAuxStreamStop(j);
        }
        return -1;
    }

    public void releaseStream() {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            long j2 = this.nativeEnginePtr;
            if (j2 != 0) {
                ByteAudioNativeFunctions.nativeDestroyAuxStream(j2, j);
                this.nativeStreamPtr = 0;
            }
        }
    }

    public void addInputStreamNameForMix(String str) {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeAddInputStreamNameForMix(j, str);
        }
    }

    public ByteAudioStreamOption auxStreamGetValue(int i) {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeAuxStreamGetValue(j, i);
        }
        return null;
    }

    public void setPath(String str) {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeAuxStreamSetPath(j, str);
        }
    }

    public int setStreamFormat(ByteAudioStreamFormat byteAudioStreamFormat) {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeAuxStreamSetFormat(j, byteAudioStreamFormat);
        }
        return -1;
    }

    public int setGain(int i) {
        long j = this.nativeStreamPtr;
        if (j == 0) {
            return -1;
        }
        this.gain = i;
        return ByteAudioNativeFunctions.nativeAuxStreamSetGain(j, i);
    }

    public void setSink(ByteAudioSinkInterface.ByteAudioAuxSink byteAudioAuxSink) {
        ByteAudioAuxSinkProxy byteAudioAuxSinkProxy = new ByteAudioAuxSinkProxy(byteAudioAuxSink, this);
        this.sinkProxy = byteAudioAuxSinkProxy;
        long j = this.nativeStreamPtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeAuxStreamSetSink(j, byteAudioAuxSinkProxy);
        }
    }

    public int auxStreamSetValue(int i, ByteAudioStreamOption byteAudioStreamOption) {
        long j = this.nativeStreamPtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeAuxStreamSetValue(j, i, byteAudioStreamOption);
        }
        return -1;
    }

    public ByteAudioAuxStream(long j, String str) {
        this.nativeEnginePtr = j;
        if (j != 0) {
            this.nativeStreamPtr = ByteAudioNativeFunctions.nativeCreateAuxStream(j, str);
        }
    }
}
