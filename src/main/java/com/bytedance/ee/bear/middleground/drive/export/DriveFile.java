package com.bytedance.ee.bear.middleground.drive.export;

import java.io.Serializable;

public class DriveFile implements Serializable {
    public long bytesTotal;
    public long bytesTransferred;
    public String errorCode;
    public String fileName;
    public String key;
    public String mountNodePoint;
    public String path;
    public Status status;

    public enum Status implements Serializable {
        PENDING(0),
        INFLIGHT(1),
        FAILED(2),
        SUCCESS(3),
        QUEUE(4),
        READY(5),
        CANCEL(6),
        RANGE_FINISH(7),
        UNKNOWN(-1);
        
        private final int value;

        public int value() {
            return this.value;
        }

        public static Status from(int i) {
            switch (i) {
                case 0:
                    return PENDING;
                case 1:
                    return INFLIGHT;
                case 2:
                    return FAILED;
                case 3:
                    return SUCCESS;
                case 4:
                    return QUEUE;
                case 5:
                    return READY;
                case 6:
                    return CANCEL;
                case 7:
                    return RANGE_FINISH;
                default:
                    return UNKNOWN;
            }
        }

        private Status(int i) {
            this.value = i;
        }
    }

    public long getBytesTotal() {
        return this.bytesTotal;
    }

    public long getBytesTransferred() {
        return this.bytesTransferred;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getKey() {
        return this.key;
    }

    public String getMountNodePoint() {
        return this.mountNodePoint;
    }

    public String getPath() {
        return this.path;
    }

    public Status getStatus() {
        return this.status;
    }

    public String toString() {
        return "DriveFile{key='" + this.key + '\'' + ", fileName='" + this.fileName + '\'' + ", status=" + this.status + ", bytesTransferred=" + this.bytesTransferred + ", bytesTotal=" + this.bytesTotal + ", path='" + this.path + '\'' + ", mountNodePoint='" + this.mountNodePoint + '\'' + ", errorCode='" + this.errorCode + '\'' + '}';
    }

    public void setBytesTotal(long j) {
        this.bytesTotal = j;
    }

    public void setBytesTransferred(long j) {
        this.bytesTransferred = j;
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setMountNodePoint(String str) {
        this.mountNodePoint = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setStatus(Status status2) {
        this.status = status2;
    }
}
