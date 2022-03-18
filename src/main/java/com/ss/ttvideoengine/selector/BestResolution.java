package com.ss.ttvideoengine.selector;

import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.model.IVideoInfo;
import com.ss.ttvideoengine.model.IVideoModel;
import com.ss.ttvideoengine.selector.shift.SpeedShiftConfig;
import com.ss.ttvideoengine.selector.shift.SpeedShiftSelector;

public class BestResolution {
    public static Resolution findDefaultResolution(IVideoModel iVideoModel, Resolution resolution) {
        int abs;
        if (iVideoModel == null || resolution == null) {
            return Resolution.Standard;
        }
        int length = Resolution.getAllResolutions().length;
        Resolution[] supportResolutions = iVideoModel.getSupportResolutions();
        if (supportResolutions == null || supportResolutions.length == 0) {
            return resolution;
        }
        Resolution resolution2 = resolution;
        for (Resolution resolution3 : supportResolutions) {
            if (resolution3 != null && (abs = Math.abs(resolution3.ordinal() - resolution.ordinal())) < length) {
                resolution2 = resolution3;
                if (abs == 0) {
                    break;
                }
                length = abs;
            }
        }
        return resolution2;
    }

    public static Resolution findMaxCacheResolution(IVideoModel iVideoModel, Resolution resolution) {
        if (iVideoModel == null || resolution == null) {
            return Resolution.Standard;
        }
        long j = 0;
        Resolution[] supportResolutions = iVideoModel.getSupportResolutions();
        if (!(supportResolutions == null || supportResolutions.length == 0)) {
            for (Resolution resolution2 : supportResolutions) {
                long cacheFileSize = TTVideoEngine.getCacheFileSize(iVideoModel, resolution2);
                if (cacheFileSize > j) {
                    resolution = resolution2;
                    j = cacheFileSize;
                }
            }
        }
        return resolution;
    }

    public static Resolution findMaxQualityResolution(IVideoModel iVideoModel, Resolution resolution) {
        if (iVideoModel == null || resolution == null) {
            return Resolution.Standard;
        }
        Resolution[] supportResolutions = iVideoModel.getSupportResolutions();
        if (!(supportResolutions == null || supportResolutions.length == 0)) {
            for (Resolution resolution2 : supportResolutions) {
                if (TTVideoEngine.getCacheFileSize(iVideoModel, resolution2) > 0 && resolution2.ordinal() > resolution.ordinal()) {
                    resolution = resolution2;
                }
            }
        }
        return resolution;
    }

    public static Resolution findAwemeShiftResolution(IVideoModel iVideoModel, Resolution resolution, double d, SpeedShiftConfig speedShiftConfig) {
        IVideoInfo videoInfo;
        if (iVideoModel == null || resolution == null || speedShiftConfig == null || (videoInfo = new SpeedShiftSelector(speedShiftConfig).select(iVideoModel, new SpeedShiftSelector.Params().speed(d).build()).getVideoInfo()) == null) {
            return resolution;
        }
        return videoInfo.getResolution();
    }
}
