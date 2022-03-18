package com.ss.android.vesdk.algorithm;

import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;

public enum VEAlgorithmRuntimeParamKey {
    FACE_PARAM_BASE_SMOOTH_LEVEL(100),
    FACE_PARAM_EXTRA_SMOOTH_LEVEL(101),
    FACE_ATTR_MALE_SCORE_RANGE(102),
    FACE_ATTR_FEMALE_SCORE_RANGE(103),
    FACE_ATTR_FORCE_DETEC(104),
    SKELETON_FORCE_DETECT(LocationRequest.PRIORITY_NO_POWER),
    FACE_PARAM_USE_FILTER_V2(ActivityIdentificationData.WALKING);
    
    private int value;

    public int getValue() {
        return this.value;
    }

    private VEAlgorithmRuntimeParamKey(int i) {
        this.value = i;
    }
}
