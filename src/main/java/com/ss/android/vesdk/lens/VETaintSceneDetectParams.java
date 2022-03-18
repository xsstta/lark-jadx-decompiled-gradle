package com.ss.android.vesdk.lens;

public class VETaintSceneDetectParams extends VEBaseRecorderLensParams {
    public int backendType;
    public int detectFrequency = 3;
    public int detectRepeatNum = 1;
    public String kernelBinPath;
    public String modelPath;
    public int numThread = 2;
}
