package com.bytedance.bae;

import com.C1711a;
import java.util.ArrayList;
import java.util.List;

public class ByteAudioEngine extends IByteAudioEngine {
    private static Boolean sIsLibraryLoaded = false;
    private List<ByteAudioEventHandlerProxy> eventHandlerList = new ArrayList();
    private long nativeEnginePtr;

    public void release() {
    }

    public ByteAudioEngine() {
        if (!sIsLibraryLoaded.booleanValue()) {
            try {
                C1711a.m7628a("byteaudio");
                sIsLibraryLoaded = true;
            } catch (UnsatisfiedLinkError unused) {
            }
        }
        this.nativeEnginePtr = ByteAudioNativeFunctions.nativeGetInstance();
    }

    public static void setLibraryLoaded(boolean z) {
        sIsLibraryLoaded = Boolean.valueOf(z);
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int releaseAuxStream(ByteAudioAuxStream byteAudioAuxStream) {
        byteAudioAuxStream.releaseStream();
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int releaseInputStream(ByteAudioInputStream byteAudioInputStream) {
        byteAudioInputStream.releaseStream();
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int releaseOutputStream(ByteAudioOutputStream byteAudioOutputStream) {
        byteAudioOutputStream.releaseStream();
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public ByteAudioAuxStream createAuxStream(String str) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            return new ByteAudioAuxStream(j, str);
        }
        return null;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public ByteAudioInputStream createInputStream(String str) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            return new ByteAudioInputStream(j, str);
        }
        return null;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public ByteAudioOutputStream createOutputStream(String str) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            return new ByteAudioOutputStream(j, str);
        }
        return null;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void enableAudioRoute(boolean z) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeEnableAudioRoute(j, z);
        }
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int enableEarMonitor(boolean z) {
        long j = this.nativeEnginePtr;
        if (j == 0) {
            return 0;
        }
        ByteAudioNativeFunctions.nativeEnableEarMonitor(j, z);
        return 0;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void enableLocalAudio(boolean z) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeEnableLocalAudio(j, z);
        }
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void setEnableSpeakerphone(boolean z) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeSetEnableSpeakerphone(j, z);
        }
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int setServerConfigure(String str) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeSetServerConfigure(j, str);
        }
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void addEventHandler(ByteAudioEventHandler byteAudioEventHandler) {
        for (ByteAudioEventHandlerProxy byteAudioEventHandlerProxy : this.eventHandlerList) {
            if (byteAudioEventHandler.equals(byteAudioEventHandlerProxy)) {
                return;
            }
        }
        ByteAudioEventHandlerProxy byteAudioEventHandlerProxy2 = new ByteAudioEventHandlerProxy(byteAudioEventHandler);
        long j = this.nativeEnginePtr;
        if (j != 0) {
            long nativeAddEventHandler = ByteAudioNativeFunctions.nativeAddEventHandler(j, byteAudioEventHandlerProxy2);
            if (nativeAddEventHandler != 0) {
                byteAudioEventHandlerProxy2.setNativeHandler(nativeAddEventHandler);
                this.eventHandlerList.add(byteAudioEventHandlerProxy2);
            }
        }
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void removeEventHandler(ByteAudioEventHandler byteAudioEventHandler) {
        if (this.nativeEnginePtr != 0) {
            for (int i = 0; i < this.eventHandlerList.size(); i++) {
                ByteAudioEventHandlerProxy byteAudioEventHandlerProxy = this.eventHandlerList.get(i);
                if (byteAudioEventHandlerProxy.handler == byteAudioEventHandler) {
                    ByteAudioNativeFunctions.nativeRemoveEventHandler(this.nativeEnginePtr, byteAudioEventHandlerProxy.nativeHandlerPtr);
                    this.eventHandlerList.remove(byteAudioEventHandlerProxy);
                    byteAudioEventHandlerProxy.handler = null;
                    byteAudioEventHandlerProxy.nativeHandlerPtr = 0;
                    return;
                }
            }
        }
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void setFrontInputFilter(ByteAudioFilterProxy byteAudioFilterProxy, int i, int i2) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeSetFrontInputFilter(j, byteAudioFilterProxy, i, i2);
        }
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void setInputFilter(ByteAudioFilterProxy byteAudioFilterProxy, int i, int i2) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeSetInputFilter(j, byteAudioFilterProxy, i, i2);
        }
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void setOutputFilter(ByteAudioFilterProxy byteAudioFilterProxy, int i, int i2) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeSetOutputFilter(j, byteAudioFilterProxy, i, i2);
        }
    }
}
