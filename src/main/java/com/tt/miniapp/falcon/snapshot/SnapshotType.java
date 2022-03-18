package com.tt.miniapp.falcon.snapshot;

public enum SnapshotType {
    KEEP_CODE("keep_code"),
    KEEP_APP("keep_app"),
    KEEP_HOME_PAGE("keep_home_page"),
    INVALID_TYPE("invalid_type");
    
    private final String mType;

    public String toString() {
        return this.mType;
    }

    public static SnapshotType getSnapshotType(String str) {
        SnapshotType snapshotType = KEEP_CODE;
        if (snapshotType.toString().equals(str)) {
            return snapshotType;
        }
        SnapshotType snapshotType2 = KEEP_APP;
        if (snapshotType2.toString().equals(str)) {
            return snapshotType2;
        }
        SnapshotType snapshotType3 = KEEP_HOME_PAGE;
        if (snapshotType3.toString().equals(str)) {
            return snapshotType3;
        }
        return INVALID_TYPE;
    }

    private SnapshotType(String str) {
        this.mType = str;
    }
}
