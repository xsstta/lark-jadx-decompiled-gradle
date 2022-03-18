package com.ss.android.lark.chat.entity.message.content;

import com.larksuite.suite.R;

public enum FileState {
    DOWNLOAD(1, R.string.Lark_Legacy_FileStateDownload),
    DOWNLOADING(2, R.string.Lark_Legacy_FileStateDownloading),
    UPLOADING(3, R.string.Lark_Legacy_FileStateUploading),
    COMPRESSING(4, R.string.Lark_Legacy_FileStateCompressing),
    PAUSE(5, R.string.Lark_Legacy_FileStatePause),
    DONE(6, R.string.Lark_Legacy_FileStateDone);
    
    private int fileStateType;
    private int value;

    public int getFileStateType() {
        return this.fileStateType;
    }

    public int getValue() {
        return this.value;
    }

    private FileState(int i, int i2) {
        this.fileStateType = i;
        this.value = i2;
    }
}
