package com.ss.ttvideoengine.model;

import android.text.TextUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.model.IVideoModel;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class BareVideoModel implements IVideoModel {
    public boolean mAdaptive;
    public int mCategory;
    public long mDuration;
    public String mFirstSubVid;
    public List<VideoInfo> mInfos;
    public float mLoudness;
    public float mPeak;
    public String mVid;

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public JSONObject getDnsInfo() {
        return null;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public String getDynamicType() {
        return "";
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public List<SubInfo> getSubInfoList() {
        return null;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public List<Integer> getSupportInfoId(int i) {
        return null;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public int[] getSupportSubtitleLangs() {
        return null;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public List<Integer> getSupportedTTSAudioInfo() {
        return null;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public String getVType() {
        return "mp4";
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public VideoInfo getVideoInfoByInfoId(int i) {
        return null;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public boolean getVideoRefBool(int i) {
        return false;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public long getVideoRefLong(int i) {
        return 0;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public boolean isSupportBash() {
        return false;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public boolean isSupportHLSSeamlessSwitch() {
        return false;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public void setUpResolution(HashMap<String, Resolution> hashMap) {
    }

    private BareVideoModel() {
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public IVideoModel.Source getSource() {
        return IVideoModel.Source.BARE;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public List<VideoInfo> getVideoInfoList() {
        return this.mInfos;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public Set<IVideoModel.Format> getFormats() {
        HashSet hashSet = new HashSet();
        hashSet.add(IVideoModel.Format.MP4);
        return hashSet;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public boolean hasData() {
        List<VideoInfo> list = this.mInfos;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public String toMediaInfoJsonString() {
        JSONObject mediaInfo = getMediaInfo();
        if (mediaInfo != null) {
            return mediaInfo.toString();
        }
        return null;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public String getSpadea() {
        for (VideoInfo videoInfo : this.mInfos) {
            String valueStr = videoInfo.getValueStr(5);
            if (!TextUtils.isEmpty(valueStr)) {
                return valueStr;
            }
        }
        return null;
    }

    public static class Builder {
        private boolean mAdaptive;
        private int mCategory;
        private long mDuration;
        private String mFirstSubVid;
        private List<VideoInfo> mInfos;
        private float mLoudness;
        private float mPeak;
        private String mVid;

        public BareVideoModel build() {
            BareVideoModel bareVideoModel = new BareVideoModel();
            bareVideoModel.mVid = this.mVid;
            bareVideoModel.mDuration = this.mDuration;
            bareVideoModel.mAdaptive = this.mAdaptive;
            bareVideoModel.mLoudness = this.mLoudness;
            bareVideoModel.mPeak = this.mPeak;
            bareVideoModel.mCategory = this.mCategory;
            bareVideoModel.mFirstSubVid = this.mFirstSubVid;
            if (this.mInfos == null) {
                this.mInfos = Collections.emptyList();
            }
            bareVideoModel.mInfos = this.mInfos;
            return bareVideoModel;
        }

        public Builder adaptive(boolean z) {
            this.mAdaptive = z;
            return this;
        }

        public Builder category(int i) {
            this.mCategory = i;
            return this;
        }

        public Builder duration(long j) {
            this.mDuration = j;
            return this;
        }

        public Builder firstSubVideoId(String str) {
            this.mFirstSubVid = str;
            return this;
        }

        public Builder loudness(float f) {
            this.mLoudness = f;
            return this;
        }

        public Builder peak(float f) {
            this.mPeak = f;
            return this;
        }

        public Builder vid(String str) {
            this.mVid = str;
            return this;
        }

        public Builder addVideoInfo(VideoInfo videoInfo) {
            if (this.mInfos == null) {
                this.mInfos = new ArrayList();
            }
            this.mInfos.add(videoInfo);
            return this;
        }

        public Builder setVideoInfos(List<? extends VideoInfo> list) {
            if (this.mInfos == null) {
                this.mInfos = new ArrayList();
            }
            this.mInfos.clear();
            this.mInfos.addAll(list);
            return this;
        }
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public String[] getCodecs() {
        HashSet hashSet = new HashSet();
        for (VideoInfo videoInfo : this.mInfos) {
            String valueStr = videoInfo.getValueStr(8);
            if (!TextUtils.isEmpty(valueStr)) {
                hashSet.add(valueStr);
            }
        }
        return (String[]) hashSet.toArray(new String[0]);
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public String[] getSupportQualityInfos() {
        HashSet hashSet = new HashSet();
        for (VideoInfo videoInfo : this.mInfos) {
            String valueStr = videoInfo.getValueStr(32);
            if (!TextUtils.isEmpty(valueStr)) {
                hashSet.add(valueStr);
            }
        }
        return (String[]) hashSet.toArray(new String[0]);
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public Resolution[] getSupportResolutions() {
        HashSet hashSet = new HashSet();
        for (VideoInfo videoInfo : this.mInfos) {
            hashSet.add(videoInfo.getResolution());
        }
        return (Resolution[]) hashSet.toArray(new Resolution[0]);
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public JSONObject getMediaInfo() {
        String str;
        if (hasFormat(IVideoModel.Format.MP4)) {
            str = "mp4";
        } else if (hasFormat(IVideoModel.Format.MP3)) {
            str = "mp3";
        } else {
            str = "";
        }
        String videoRefStr = getVideoRefStr(2);
        long j = this.mDuration;
        List<VideoInfo> videoInfoList = getVideoInfoList();
        if (videoInfoList == null) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (VideoInfo videoInfo : videoInfoList) {
                arrayList.add(videoInfo.toMediaInfo());
            }
            hashMap.put("format", str);
            hashMap.put("vid", videoRefStr);
            hashMap.put("category", Integer.valueOf(getVideoRefInt(232)));
            hashMap.put("frt_sub_vid", getVideoRefStr(233));
            hashMap.put("duration", Double.valueOf(((double) (((float) j) * 1.0f)) / 1000.0d));
            hashMap.put("infos", arrayList);
            return new JSONObject(hashMap);
        } catch (Throwable th) {
            TTVideoEngineLog.m256501d(th);
            return null;
        }
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public String[] allVideoURLs(Resolution resolution) {
        return allVideoURLs(resolution, null);
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public String resolutionToString(Resolution resolution) {
        return resolution.toString(VideoRef.TYPE_VIDEO);
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public float getVideoRefFloat(int i) {
        if (i == 224) {
            return this.mLoudness;
        }
        if (i != 225) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return this.mPeak;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public String getVideoRefStr(int i) {
        if (i == 2) {
            return this.mVid;
        }
        if (i != 233) {
            return null;
        }
        return this.mFirstSubVid;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public boolean hasFormat(IVideoModel.Format format) {
        return getFormats().contains(format);
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public int getVideoRefInt(int i) {
        if (i == 3) {
            return (int) this.mDuration;
        }
        if (i == 7) {
            return VideoRef.TYPE_VIDEO;
        }
        if (i != 232) {
            return 0;
        }
        return this.mCategory;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public VideoInfo getVideoInfo(Map<Integer, String> map) {
        Iterator<VideoInfo> it = this.mInfos.iterator();
        while (it.hasNext()) {
            VideoInfo next = it.next();
            if (next != null) {
                if (map == null || map.isEmpty()) {
                    return next;
                }
                boolean z = true;
                Iterator<Map.Entry<Integer, String>> it2 = map.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry<Integer, String> next2 = it2.next();
                    int intValue = next2.getKey().intValue();
                    String value = next2.getValue();
                    if (!TextUtils.isEmpty(value) && !value.equals(next.getValueStr(intValue))) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return next;
                }
            }
        }
        return null;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public VideoInfo getVideoInfo(Resolution resolution, Map<Integer, String> map) {
        return getVideoInfo(resolution, getVideoRefInt(7), map);
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public String[] allVideoURLs(Resolution resolution, Map<Integer, String> map) {
        VideoInfo videoInfo = getVideoInfo(resolution, map);
        if (videoInfo == null) {
            return new String[0];
        }
        return videoInfo.getValueStrArr(16);
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public VideoInfo getVideoInfo(Resolution resolution, boolean z) {
        return getVideoInfo(resolution, getVideoRefInt(7), null, z);
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public VideoInfo getVideoInfo(Resolution resolution, int i, boolean z) {
        return getVideoInfo(resolution, i, null, z);
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public VideoInfo getVideoInfo(Resolution resolution, Map<Integer, String> map, boolean z) {
        return getVideoInfo(resolution, getVideoRefInt(7), map, z);
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public VideoInfo getVideoInfo(Resolution resolution, int i, Map<Integer, String> map) {
        Iterator<VideoInfo> it = this.mInfos.iterator();
        while (it.hasNext()) {
            VideoInfo next = it.next();
            if (next != null && resolution == next.getResolution() && i == next.getMediatype()) {
                if (map == null || map.isEmpty()) {
                    return next;
                }
                boolean z = true;
                Iterator<Map.Entry<Integer, String>> it2 = map.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry<Integer, String> next2 = it2.next();
                    int intValue = next2.getKey().intValue();
                    String value = next2.getValue();
                    if (!TextUtils.isEmpty(value) && !value.equals(next.getValueStr(intValue))) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return next;
                }
            }
        }
        return null;
    }

    @Override // com.ss.ttvideoengine.model.IVideoModel
    public VideoInfo getVideoInfo(Resolution resolution, int i, Map<Integer, String> map, boolean z) {
        VideoInfo videoInfo = getVideoInfo(resolution, i, map);
        if (!z) {
            return videoInfo;
        }
        String[] allQualityInfos = TTVideoEngine.getAllQualityInfos();
        int i2 = 0;
        if (allQualityInfos.length > 0 && map != null && map.containsKey(32)) {
            int length = allQualityInfos.length - 1;
            while (videoInfo == null) {
                String str = map.get(32);
                if (str != null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= allQualityInfos.length) {
                            break;
                        } else if (allQualityInfos[i3].equals(str)) {
                            length = i3;
                            break;
                        } else {
                            i3++;
                        }
                    }
                    int i4 = length;
                    while (videoInfo == null) {
                        map.put(32, allQualityInfos[i4]);
                        videoInfo = getVideoInfo(resolution, i, map);
                        if (videoInfo == null) {
                            i4 = ((i4 + allQualityInfos.length) - 1) % allQualityInfos.length;
                            if (i4 == length) {
                                break;
                            }
                        } else {
                            return videoInfo;
                        }
                    }
                    length = i4;
                }
            }
        }
        Resolution[] allResolutions = Resolution.getAllResolutions();
        if (allResolutions.length <= 0) {
            return videoInfo;
        }
        int length2 = allResolutions.length - 1;
        if (resolution != null) {
            while (true) {
                if (i2 >= allResolutions.length) {
                    break;
                } else if (allResolutions[i2].getIndex() == resolution.getIndex()) {
                    length2 = i2;
                    break;
                } else {
                    i2++;
                }
            }
        }
        int i5 = length2;
        while (videoInfo == null) {
            videoInfo = getVideoInfo(allResolutions[i5], i, (Map<Integer, String>) null);
            if (videoInfo != null) {
                break;
            }
            i5 = ((i5 + allResolutions.length) - 1) % allResolutions.length;
            if (i5 == length2) {
                break;
            }
        }
        return videoInfo;
    }
}
