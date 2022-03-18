package com.ss.video.rtc.engine;

import java.util.Arrays;
import java.util.List;

public class ByteStream {
    public boolean hasAudio;
    public boolean hasVideo;
    public boolean isScreen;
    public String userId;
    public List<VideoStreamDescription> videoStreamDescriptions;

    public ByteStream() {
    }

    public String toString() {
        return "ByteStream{ userId='" + this.userId + '\'' + ", isScreen=" + this.isScreen + ", hasVideo=" + this.hasVideo + ", hasAudio=" + this.hasAudio + ", videoStreamDescriptions=" + this.videoStreamDescriptions + '}';
    }

    private static ByteStream create(String str, boolean z, boolean z2, boolean z3) {
        return new ByteStream(str, z, z2, z3, null);
    }

    public ByteStream(String str, boolean z, boolean z2, boolean z3, List<VideoStreamDescription> list) {
        this.userId = str;
        this.isScreen = z;
        this.hasVideo = z2;
        this.hasAudio = z3;
        this.videoStreamDescriptions = list;
    }

    private static ByteStream createWithStreamDescriptions(String str, boolean z, boolean z2, boolean z3, VideoStreamDescription[] videoStreamDescriptionArr) {
        return new ByteStream(str, z, z2, z3, Arrays.asList(videoStreamDescriptionArr));
    }
}
