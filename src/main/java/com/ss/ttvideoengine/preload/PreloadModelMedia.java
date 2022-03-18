package com.ss.ttvideoengine.preload;

import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.model.IVideoModel;
import com.ss.ttvideoengine.strategrycenter.ISelectBitrateCallback;
import java.util.Map;
import java.util.Objects;

public class PreloadModelMedia extends PreloadMedia {
    public boolean isLast;
    private Map<String, String> mExtraInfo;
    public boolean mForbidP2p;
    public Resolution mResolution = Resolution.Undefine;
    private ISelectBitrateCallback mSelectCallback;
    public IVideoModel mVideoModel;

    public Map<String, String> getExtraInfo() {
        return this.mExtraInfo;
    }

    public ISelectBitrateCallback getSelectCallback() {
        return this.mSelectCallback;
    }

    @Override // com.ss.ttvideoengine.preload.PreloadMedia
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.mVideoModel);
    }

    public void setExtraInfo(Map<String, String> map) {
        this.mExtraInfo = map;
    }

    public void setSelectBitrateCallback(ISelectBitrateCallback iSelectBitrateCallback) {
        this.mSelectCallback = iSelectBitrateCallback;
    }

    public PreloadModelMedia(IVideoModel iVideoModel) {
        this.mVideoModel = iVideoModel;
    }

    @Override // com.ss.ttvideoengine.preload.PreloadMedia
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof PreloadModelMedia) && super.equals(obj)) {
            return Objects.equals(this.mVideoModel, ((PreloadModelMedia) obj).mVideoModel);
        }
        return false;
    }

    public PreloadModelMedia(IVideoModel iVideoModel, ISelectBitrateCallback iSelectBitrateCallback) {
        this.mVideoModel = iVideoModel;
        this.mSelectCallback = iSelectBitrateCallback;
    }

    public PreloadModelMedia(IVideoModel iVideoModel, Resolution resolution, long j, boolean z) {
        this.mVideoModel = iVideoModel;
        this.mResolution = resolution;
        this.mPreloadSize = j;
        this.mForbidP2p = z;
    }
}
