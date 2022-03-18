package com.ss.ttvideoengine.superresolution;

public class SRStrategyConfig {
    private Integer mCurrentDuration;
    private Float mCurrentFps;
    private Integer mCurrentHeight;
    private Integer mCurrentPower;
    private Integer mCurrentScene;
    private Integer mCurrentVideoFormatType;
    private Integer mCurrentWidth;
    private Boolean mEnableHdr;
    private Boolean mEnableSR;
    private Boolean mEnableSpeed;
    private String mExtraConfig;
    private Boolean mIsCharging;
    private Boolean mIsHdr;
    private Boolean mIsSpeed;
    private Long mMaxDuration;
    private Float mMaxFps;
    private Integer mMaxHeight;
    private Integer mMaxWidth;
    private Long mMinDuration;
    private Integer mMinPower;
    private Integer mSRPercent;
    ISRStatusListener mStatusListener;
    private Integer mSupportScene;
    private Integer mVideoFormatType;

    public Integer getCurrentDuration() {
        return this.mCurrentDuration;
    }

    public Float getCurrentFps() {
        return this.mCurrentFps;
    }

    public Integer getCurrentHeight() {
        return this.mCurrentHeight;
    }

    public Integer getCurrentPower() {
        return this.mCurrentPower;
    }

    public Integer getCurrentScene() {
        return this.mCurrentScene;
    }

    public Integer getCurrentVideoFormatType() {
        return this.mCurrentVideoFormatType;
    }

    public Integer getCurrentWidth() {
        return this.mCurrentWidth;
    }

    public Boolean getEnableHdr() {
        return this.mEnableHdr;
    }

    public Boolean getEnableSR() {
        return this.mEnableSR;
    }

    public Boolean getEnableSpeed() {
        return this.mEnableSpeed;
    }

    public String getExtraConfig() {
        return this.mExtraConfig;
    }

    public Boolean getIsCharging() {
        return this.mIsCharging;
    }

    public Boolean getIsHdr() {
        return this.mIsHdr;
    }

    public Boolean getIsSpeed() {
        return this.mIsSpeed;
    }

    public ISRStatusListener getListener() {
        return this.mStatusListener;
    }

    public Long getMaxDuration() {
        return this.mMaxDuration;
    }

    public Float getMaxFps() {
        return this.mMaxFps;
    }

    public Integer getMaxHeight() {
        return this.mMaxHeight;
    }

    public Integer getMaxWidth() {
        return this.mMaxWidth;
    }

    public Long getMinDuration() {
        return this.mMinDuration;
    }

    public Integer getMinPower() {
        return this.mMinPower;
    }

    public Integer getSRPercent() {
        return this.mSRPercent;
    }

    public Integer getSupportScene() {
        return this.mSupportScene;
    }

    public Integer getVideoFormatType() {
        return this.mVideoFormatType;
    }

    public SRStrategyConfig() {
        resetAll();
    }

    public void resetStream() {
        this.mMaxFps = null;
        this.mCurrentVideoFormatType = null;
        this.mCurrentDuration = null;
        this.mCurrentWidth = null;
        this.mCurrentHeight = null;
        this.mCurrentFps = null;
        this.mIsHdr = null;
    }

    public void resetAll() {
        this.mEnableSR = null;
        this.mVideoFormatType = null;
        this.mMinDuration = null;
        this.mMaxDuration = null;
        this.mMinPower = null;
        this.mSupportScene = null;
        this.mEnableSpeed = null;
        this.mSRPercent = null;
        this.mMaxWidth = null;
        this.mMaxHeight = null;
        this.mMaxFps = null;
        this.mEnableHdr = null;
        this.mCurrentVideoFormatType = null;
        this.mCurrentDuration = null;
        this.mCurrentPower = null;
        this.mIsCharging = null;
        this.mCurrentScene = null;
        this.mIsSpeed = null;
        this.mCurrentWidth = null;
        this.mCurrentHeight = null;
        this.mCurrentFps = null;
        this.mIsHdr = null;
        this.mExtraConfig = null;
        this.mStatusListener = null;
    }

    public String toString() {
        String str = "SRStrategyConfig{";
        if (this.mEnableSR != null) {
            str = str + ", mEnableSR=" + this.mEnableSR;
        }
        if (this.mVideoFormatType != null) {
            str = str + ", mVideoFormatType=" + this.mVideoFormatType;
        }
        if (this.mMinDuration != null) {
            str = str + ", mMinDuration=" + this.mMinDuration;
        }
        if (this.mMaxDuration != null) {
            str = str + ", mMaxDuration=" + this.mMaxDuration;
        }
        if (this.mMinPower != null) {
            str = str + ", mMinPower=" + this.mMinPower;
        }
        if (this.mSupportScene != null) {
            str = str + ", mSupportScene=" + this.mSupportScene;
        }
        if (this.mEnableSpeed != null) {
            str = str + ", mEnableSpeed=" + this.mEnableSpeed;
        }
        if (this.mSRPercent != null) {
            str = str + ", mSRPercent=" + this.mSRPercent;
        }
        if (this.mMaxWidth != null) {
            str = str + ", mMaxWidth=" + this.mMaxWidth;
        }
        if (this.mMaxHeight != null) {
            str = str + ", mMaxHeight=" + this.mMaxHeight;
        }
        if (this.mMaxFps != null) {
            str = str + ", mMaxFps=" + this.mMaxFps;
        }
        if (this.mEnableHdr != null) {
            str = str + ", mEnableHdr=" + this.mEnableHdr;
        }
        if (this.mCurrentVideoFormatType != null) {
            str = str + ", mCurrentVideoFormatType=" + this.mCurrentVideoFormatType;
        }
        if (this.mCurrentDuration != null) {
            str = str + ", mCurrentDuration=" + this.mCurrentDuration;
        }
        if (this.mCurrentPower != null) {
            str = str + ", mCurrentPower=" + this.mCurrentPower;
        }
        if (this.mIsCharging != null) {
            str = str + ", mIsCharging=" + this.mIsCharging;
        }
        if (this.mCurrentScene != null) {
            str = str + ", mCurrentScene=" + this.mCurrentScene;
        }
        if (this.mIsSpeed != null) {
            str = str + ", mIsSpeed=" + this.mIsSpeed;
        }
        if (this.mCurrentWidth != null) {
            str = str + ", mCurrentWidth=" + this.mCurrentWidth;
        }
        if (this.mCurrentHeight != null) {
            str = str + ", mCurrentHeight=" + this.mCurrentHeight;
        }
        if (this.mCurrentFps != null) {
            str = str + ", mCurrentFps=" + this.mCurrentFps;
        }
        if (this.mIsHdr != null) {
            str = str + ", mIsHdr=" + this.mIsHdr;
        }
        if (this.mStatusListener != null) {
            str = str + ", mStatusListener=" + this.mStatusListener;
        }
        if (this.mExtraConfig != null) {
            str = str + ", mExtraConfig='" + this.mStatusListener + "'";
        }
        return str + '}';
    }

    public SRStrategyConfig setExtraConfig(String str) {
        this.mExtraConfig = str;
        return this;
    }

    public SRStrategyConfig setListener(ISRStatusListener iSRStatusListener) {
        this.mStatusListener = iSRStatusListener;
        return this;
    }

    public SRStrategyConfig enableSR(boolean z) {
        this.mEnableSR = Boolean.valueOf(z);
        return this;
    }

    public SRStrategyConfig enableSpeed(boolean z) {
        this.mEnableSpeed = Boolean.valueOf(z);
        return this;
    }

    public void setCurrentDuration(int i) {
        this.mCurrentDuration = Integer.valueOf(i);
    }

    public SRStrategyConfig setCurrentFps(float f) {
        this.mCurrentFps = Float.valueOf(f);
        return this;
    }

    public SRStrategyConfig setCurrentHeight(int i) {
        this.mCurrentHeight = Integer.valueOf(i);
        return this;
    }

    public SRStrategyConfig setCurrentPower(int i) {
        this.mCurrentPower = Integer.valueOf(i);
        return this;
    }

    public SRStrategyConfig setCurrentScene(int i) {
        this.mCurrentScene = Integer.valueOf(i);
        return this;
    }

    public void setCurrentVideoFormatType(int i) {
        this.mCurrentVideoFormatType = Integer.valueOf(i);
    }

    public SRStrategyConfig setCurrentWidth(int i) {
        this.mCurrentWidth = Integer.valueOf(i);
        return this;
    }

    public SRStrategyConfig setEnableHdr(boolean z) {
        this.mEnableHdr = Boolean.valueOf(z);
        return this;
    }

    public SRStrategyConfig setIsCharging(boolean z) {
        this.mIsCharging = Boolean.valueOf(z);
        return this;
    }

    public SRStrategyConfig setIsHdr(boolean z) {
        this.mIsHdr = Boolean.valueOf(z);
        return this;
    }

    public SRStrategyConfig setIsSpeed(boolean z) {
        this.mIsSpeed = Boolean.valueOf(z);
        return this;
    }

    public SRStrategyConfig setMaxFps(float f) {
        this.mMaxFps = Float.valueOf(f);
        return this;
    }

    public SRStrategyConfig setMaxHeight(int i) {
        this.mMaxHeight = Integer.valueOf(i);
        return this;
    }

    public SRStrategyConfig setMaxWidth(int i) {
        this.mMaxWidth = Integer.valueOf(i);
        return this;
    }

    public SRStrategyConfig setMinPower(int i) {
        this.mMinPower = Integer.valueOf(i);
        return this;
    }

    public SRStrategyConfig setSRPercent(int i) {
        this.mSRPercent = Integer.valueOf(i);
        return this;
    }

    public SRStrategyConfig setSupportScene(int i) {
        this.mSupportScene = Integer.valueOf(i);
        return this;
    }

    public SRStrategyConfig setVideoFormatType(int i) {
        this.mVideoFormatType = Integer.valueOf(i);
        return this;
    }

    public void updateFrom(SRStrategyConfig sRStrategyConfig) {
        if (sRStrategyConfig != null) {
            Boolean enableSR = sRStrategyConfig.getEnableSR();
            if (enableSR != null) {
                this.mEnableSR = enableSR;
            }
            Integer videoFormatType = sRStrategyConfig.getVideoFormatType();
            if (videoFormatType != null) {
                this.mVideoFormatType = videoFormatType;
            }
            Long minDuration = sRStrategyConfig.getMinDuration();
            if (minDuration != null) {
                this.mMinDuration = minDuration;
            }
            Long maxDuration = sRStrategyConfig.getMaxDuration();
            if (maxDuration != null) {
                this.mMaxDuration = maxDuration;
            }
            Integer minPower = sRStrategyConfig.getMinPower();
            if (minPower != null) {
                this.mMinPower = minPower;
            }
            Integer supportScene = sRStrategyConfig.getSupportScene();
            if (supportScene != null) {
                this.mSupportScene = supportScene;
            }
            Boolean enableSpeed = sRStrategyConfig.getEnableSpeed();
            if (enableSpeed != null) {
                this.mEnableSpeed = enableSpeed;
            }
            Integer sRPercent = sRStrategyConfig.getSRPercent();
            if (sRPercent != null) {
                this.mSRPercent = sRPercent;
            }
            Integer maxWidth = sRStrategyConfig.getMaxWidth();
            if (maxWidth != null) {
                this.mMaxWidth = maxWidth;
            }
            Integer maxHeight = sRStrategyConfig.getMaxHeight();
            if (maxHeight != null) {
                this.mMaxHeight = maxHeight;
            }
            Float maxFps = sRStrategyConfig.getMaxFps();
            if (maxFps != null) {
                this.mMaxFps = maxFps;
            }
            Boolean enableHdr = sRStrategyConfig.getEnableHdr();
            if (enableHdr != null) {
                this.mEnableHdr = enableHdr;
            }
            Integer currentVideoFormatType = sRStrategyConfig.getCurrentVideoFormatType();
            if (currentVideoFormatType != null) {
                this.mCurrentVideoFormatType = currentVideoFormatType;
            }
            Integer currentDuration = sRStrategyConfig.getCurrentDuration();
            if (currentDuration != null) {
                this.mCurrentDuration = currentDuration;
            }
            Integer currentPower = sRStrategyConfig.getCurrentPower();
            if (currentPower != null) {
                this.mCurrentPower = currentPower;
            }
            Boolean isCharging = sRStrategyConfig.getIsCharging();
            if (isCharging != null) {
                this.mIsCharging = isCharging;
            }
            Integer currentScene = sRStrategyConfig.getCurrentScene();
            if (currentScene != null) {
                this.mCurrentScene = currentScene;
            }
            Boolean isSpeed = sRStrategyConfig.getIsSpeed();
            if (isSpeed != null) {
                this.mIsSpeed = isSpeed;
            }
            Integer currentWidth = sRStrategyConfig.getCurrentWidth();
            if (currentWidth != null) {
                this.mCurrentWidth = currentWidth;
            }
            Integer currentHeight = sRStrategyConfig.getCurrentHeight();
            if (currentHeight != null) {
                this.mCurrentHeight = currentHeight;
            }
            Float currentFps = sRStrategyConfig.getCurrentFps();
            if (currentFps != null) {
                this.mCurrentFps = currentFps;
            }
            Boolean isHdr = sRStrategyConfig.getIsHdr();
            if (isHdr != null) {
                this.mIsHdr = isHdr;
            }
            ISRStatusListener listener = sRStrategyConfig.getListener();
            if (listener != null) {
                this.mStatusListener = listener;
            }
        }
    }

    public SRStrategyConfig setDurationRangeSecond(long j, long j2) {
        this.mMinDuration = Long.valueOf(j);
        this.mMaxDuration = Long.valueOf(j2);
        return this;
    }
}
