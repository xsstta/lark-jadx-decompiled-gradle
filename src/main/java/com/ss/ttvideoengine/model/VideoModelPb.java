package com.ss.ttvideoengine.model;

import java.util.Map;

public interface VideoModelPb {

    public static final class Audio {
        public AudioMeta audioMeta;
        public String backupUrl;
        public BaseRangeInfo baseRangeInfo;
        public CheckInfo checkInfo;
        public EncryptInfo encryptInfo;
        public String mainUrl;
        public P2PInfo p2PInfo;
    }

    public static final class AudioMeta {
        public String atype;
        public long bitrate;
        public String codecType;
        public String definition;
        public String fileId;
        public String quality;
        public String qualityDesc;
        public long size;
    }

    public static final class BarrageInfo {
        public String barrageMaskOffset;
    }

    public static final class BaseRangeInfo {
        public String indexRange;
        public String initRange;
    }

    public static final class BigThumb {
        public double duration;
        public String fext;
        public long imgNum;
        public String imgUri;
        public String imgUrl;
        public long imgXLen;
        public long imgXSize;
        public long imgYLen;
        public long imgYSize;
        public double interval;
    }

    public static final class CheckInfo {
        public String checkInfo;
    }

    public static final class DNS {
        public String[] dns;
    }

    public static final class DNSInfo {
        public Map<String, DNS> dnsInfo;
        public long dnsTime;
    }

    public static final class DynamicVideo {
        public String backupUrl;
        public Audio[] dynamicAudioList;
        public String dynamicType;
        public Video[] dynamicVideoList;
        public String mainUrl;
    }

    public static final class EncryptInfo {
        public boolean encrypt;
        public String kid;
        public String spadeA;
    }

    public static final class P2PInfo {
        public String p2PVerifyUrl;
    }

    public static final class SeekOffSet {
        public double ending;
        public double opening;
    }

    public static final class Video {
        public String backupUrl;
        public BarrageInfo barrageInfo;
        public BaseRangeInfo baseRangeInfo;
        public CheckInfo checkInfo;
        public EncryptInfo encryptInfo;
        public String mainUrl;
        public P2PInfo p2PInfo;
        public VideoMeta videoMeta;
    }

    public static final class VideoInfo {
        public String barrageMaskUrl;
        public BigThumb[] bigThumbs;
        public DNSInfo dnsInfo;
        public DynamicVideo dynamicVideo;
        public boolean enableSsl;
        public FallBackAPI fallbackApi;
        public String mediaType;
        public String message;
        public SeekOffSet seekTs;
        public long status;
        public long urlExpire;
        public long version;
        public double videoDuration;
        public String videoId;
        public Video[] videoList;
    }

    public static final class FallBackAPI {
        private static volatile FallBackAPI[] _emptyArray;
        public String fallbackApi;
        public String keySeed;

        public static FallBackAPI[] emptyArray() {
            return _emptyArray;
        }
    }

    public static final class VideoMeta {
        public long bitrate;
        public String codecType;
        public String definition;
        public String fileId;
        public long fps;
        public String quality;
        public String qualityDesc;
        public long size;
        public long vheight;
        public String vtype;
        public long vwidth;

        public VideoMeta clear() {
            return this;
        }

        public VideoMeta() {
            clear();
        }
    }
}
