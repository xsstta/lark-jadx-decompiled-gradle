package com.ss.android.vesdk;

public class VEMVAlgorithmConfig {
    public AlgorithmInfo[] infos;

    public enum MV_REESULT_IN_TYPE {
        MV_REESULT_IN_TYPE_IMAGE,
        MV_REESULT_IN_TYPE_VIDEO,
        MV_REESULT_IN_TYPE_JSON
    }

    public enum MV_REESULT_OUT_TYPE {
        MV_REESULT_OUT_TYPE_IMAGE,
        MV_REESULT_OUT_TYPE_VIDEO,
        MV_REESULT_OUT_TYPE_IMAGE_AND_JSON,
        MV_REESULT_OUT_TYPE_VIDEO_AND_JSON,
        MV_REESULT_OUT_TYPE_JSON,
        MV_REESULT_OUT_TYPE_INVALID
    }

    public class AlgorithmInfo {
        public AlgorithmItem[] items;
        public String photoPath;

        public AlgorithmInfo() {
        }

        public class AlgorithmItem {
            public String algorithmName;
            public String algorithmParamJson;
            public boolean isNeedServerExecute;
            public MV_REESULT_OUT_TYPE result_out_type;

            public AlgorithmItem(AlgorithmInfo algorithmInfo, String str, boolean z) {
                this(algorithmInfo, str, z, null);
            }

            public AlgorithmItem(AlgorithmInfo algorithmInfo, String str, boolean z, String str2) {
                this(str, z, str2, -1);
            }

            public AlgorithmItem(String str, boolean z, String str2, int i) {
                this.algorithmName = str;
                this.isNeedServerExecute = z;
                this.algorithmParamJson = str2;
                if (i == 0) {
                    this.result_out_type = MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_IMAGE;
                } else if (i == 1) {
                    this.result_out_type = MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_VIDEO;
                } else if (i == 2) {
                    this.result_out_type = MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_IMAGE_AND_JSON;
                } else if (i == 3) {
                    this.result_out_type = MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_VIDEO_AND_JSON;
                } else if (i == 4) {
                    this.result_out_type = MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_JSON;
                } else {
                    this.result_out_type = MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_INVALID;
                }
            }
        }
    }
}
