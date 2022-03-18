package com.ss.ttm.player;

import android.util.AndroidRuntimeException;
import com.ss.ttm.player.MediaTransport;

public class NativeMediaTransport extends MediaTransport {
    private static boolean isNativeMediaTransport(MediaTransport mediaTransport) {
        return mediaTransport instanceof NativeMediaTransport;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.MediaTransport
    public void sendPacket(MediaTransport.MediaPacket mediaPacket) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
