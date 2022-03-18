package org.webrtc;

/* access modifiers changed from: package-private */
public enum RXVideoCodecStandard {
    H264(0),
    ByteVC1(1),
    Unknown(2),
    VP8(8),
    VP9(9);
    
    private final int value;

    public int toInt() {
        return this.value;
    }

    /* access modifiers changed from: package-private */
    public String mimeType() {
        if (this.value != 1) {
            return "video/avc";
        }
        return "video/hevc";
    }

    static RXVideoCodecStandard fromValue(int i) {
        if (i == 0) {
            return H264;
        }
        if (i != 1) {
            return H264;
        }
        return ByteVC1;
    }

    private RXVideoCodecStandard(int i) {
        this.value = i;
    }
}
