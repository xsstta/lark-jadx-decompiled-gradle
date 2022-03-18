package com.tt.refer.common.download.engine.model;

public interface DownloadBean extends Cloneable {
    String getDownloadPath();

    String getDownloadUrl();

    long getDownloadedSize();

    String getDownloadingPath();

    String getFileName();

    long getFileSize();

    String getId();

    long getSpeed();

    int getStatus();

    boolean isAllowInMobile();

    void setDownloadedSize(long j);

    void setFileSize(long j);

    void setSpeed(long j);

    void setStatus(int i);
}
