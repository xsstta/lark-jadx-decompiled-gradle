package com.ss.android.ttve.lensAlgorithm.videoStable;

import com.ss.android.ttve.lensAlgorithm.VEBaseLensAlgorithmConfig;

public class VEVideoStabConfig extends VEBaseLensAlgorithmConfig {
    public String filePath;
    public int length;
    public float[] videoStabMaxCropRatio;
    public int[] videoStabMotionType;
    public int[] videoStabSmoothRadius;
}
