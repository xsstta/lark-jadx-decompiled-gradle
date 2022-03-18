package com.ss.ttvideoengine;

import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.ttvideoengine.model.VideoModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class VideoModelCache {
    private static int mCacheNB = 100;
    private static VideoModelCache mInstance = null;
    private static int mTimeOutSetByUser = -1;
    private ConcurrentHashMap<String, VideoModelCacheInfo> mVideoModelCache = new ConcurrentHashMap<>();

    public static class VideoModelCacheInfo {
        public boolean isExpired;
        public VideoModel model;
        public long modelGotTime;
    }

    public static VideoModelCache getInstance() {
        if (mInstance == null) {
            synchronized (VideoModelCache.class) {
                if (mInstance == null) {
                    mInstance = new VideoModelCache();
                }
            }
        }
        return mInstance;
    }

    public synchronized void clear() {
        mTimeOutSetByUser = -1;
        mCacheNB = 100;
        ConcurrentHashMap<String, VideoModelCacheInfo> concurrentHashMap = this.mVideoModelCache;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
    }

    public void setCacheNb(int i) {
        mCacheNB = i;
    }

    public void setTimeOutInSec(int i) {
        mTimeOutSetByUser = i;
    }

    public synchronized void remove(String str, String str2) {
        if (this.mVideoModelCache != null) {
            String videoModelCacheKey = getVideoModelCacheKey(str, str2);
            if (!TextUtils.isEmpty(videoModelCacheKey)) {
                this.mVideoModelCache.remove(videoModelCacheKey);
            }
        }
    }

    public synchronized VideoModelCacheInfo get(String str, String str2) {
        if (this.mVideoModelCache != null) {
            String videoModelCacheKey = getVideoModelCacheKey(str, str2);
            if (TextUtils.isEmpty(videoModelCacheKey)) {
                return null;
            }
            VideoModelCacheInfo videoModelCacheInfo = this.mVideoModelCache.get(videoModelCacheKey);
            if (videoModelCacheInfo != null) {
                int i = mTimeOutSetByUser;
                if (i <= 0) {
                    if (videoModelCacheInfo.model != null) {
                        i = (videoModelCacheInfo.model.getVideoRefInt(3) + 3600) - 300;
                    } else {
                        i = 3600;
                    }
                }
                if (SystemClock.elapsedRealtime() - videoModelCacheInfo.modelGotTime > ((long) (i * 1000))) {
                    videoModelCacheInfo.isExpired = true;
                } else {
                    videoModelCacheInfo.isExpired = false;
                }
                return videoModelCacheInfo;
            }
        }
        return null;
    }

    private String getVideoModelCacheKey(String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        String str7 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String[] split = str2.split("[?]");
        if (split.length >= 2) {
            String[] split2 = split[1].split(ContainerUtils.FIELD_DELIMITER);
            str6 = null;
            str5 = null;
            str4 = null;
            str3 = null;
            for (String str8 : split2) {
                int indexOf = str8.indexOf("codec_type");
                if (indexOf == 0) {
                    str7 = str8.substring(indexOf + 11);
                } else {
                    int indexOf2 = str8.indexOf("CodecType");
                    if (indexOf2 == 0) {
                        str7 = str8.substring(indexOf2 + 10);
                    } else {
                        int indexOf3 = str8.indexOf("Codec");
                        if (indexOf3 == 0) {
                            str7 = str8.substring(indexOf3 + 6);
                        } else {
                            int indexOf4 = str8.indexOf("format_type");
                            if (indexOf4 == 0) {
                                str6 = str8.substring(indexOf4 + 12);
                            } else {
                                int indexOf5 = str8.indexOf("FormatType");
                                if (indexOf5 == 0) {
                                    str6 = str8.substring(indexOf5 + 11);
                                } else {
                                    int indexOf6 = str8.indexOf("Format");
                                    if (indexOf6 == 0) {
                                        str6 = str8.substring(indexOf6 + 7);
                                    } else {
                                        int indexOf7 = str8.indexOf("ptoken");
                                        if (indexOf7 == 0) {
                                            str5 = str8.substring(indexOf7 + 7);
                                        } else {
                                            int indexOf8 = str8.indexOf("PToken");
                                            if (indexOf8 == 0) {
                                                str5 = str8.substring(indexOf8 + 7);
                                            } else {
                                                int indexOf9 = str8.indexOf("ssl");
                                                if (indexOf9 == 0) {
                                                    str4 = str8.substring(indexOf9 + 4);
                                                } else {
                                                    int indexOf10 = str8.indexOf("Ssl");
                                                    if (indexOf10 == 0) {
                                                        str4 = str8.substring(indexOf10 + 4);
                                                    } else {
                                                        int indexOf11 = str8.indexOf("HDRDefinition");
                                                        if (indexOf11 == 0) {
                                                            str3 = str8.substring(indexOf11 + 14);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            str6 = null;
            str5 = null;
            str4 = null;
            str3 = null;
        }
        sb.append(str);
        if (!TextUtils.isEmpty(str7)) {
            sb.append(String.format("/%s", str7));
        }
        if (!TextUtils.isEmpty(str6)) {
            sb.append(String.format("/%s", str6));
        }
        if (!TextUtils.isEmpty(str5)) {
            sb.append(String.format("/%s", str5));
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append(String.format("/%s", str4));
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append(String.format("/%s", "hdr_" + str3));
        }
        return sb.toString();
    }

    public synchronized void put(String str, String str2, VideoModel videoModel) {
        if (!(this.mVideoModelCache == null || str == null)) {
            if (str2 != null) {
                VideoModelCacheInfo videoModelCacheInfo = new VideoModelCacheInfo();
                videoModelCacheInfo.model = videoModel;
                videoModelCacheInfo.modelGotTime = SystemClock.elapsedRealtime();
                put(str, str2, videoModelCacheInfo);
            }
        }
    }

    public synchronized void put(String str, String str2, VideoModelCacheInfo videoModelCacheInfo) {
        String videoModelCacheKey = getVideoModelCacheKey(str, str2);
        if (!TextUtils.isEmpty(videoModelCacheKey)) {
            this.mVideoModelCache.put(videoModelCacheKey, videoModelCacheInfo);
            if (this.mVideoModelCache.size() > mCacheNB) {
                long j = Long.MAX_VALUE;
                String str3 = null;
                for (Map.Entry<String, VideoModelCacheInfo> entry : this.mVideoModelCache.entrySet()) {
                    VideoModelCacheInfo value = entry.getValue();
                    if (value.modelGotTime < j) {
                        j = value.modelGotTime;
                        str3 = entry.getKey();
                    }
                }
                if (str3 != null) {
                    this.mVideoModelCache.remove(str3);
                }
            }
        }
    }
}
