package com.bytedance.frameworks.baselib.network.http.util;

import java.io.IOException;

public class DownloadFileTooLargeException extends IOException {
    private static final long serialVersionUID = -1098012010869697449L;
    final long length;
    final int maxSize;

    public long getLength() {
        return this.length;
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public DownloadFileTooLargeException(int i, long j) {
        super("Download file too large: " + j + " exceed maxsize: " + i);
        this.maxSize = i;
        this.length = j;
    }
}
