package com.ss.mediakit.medialoader;

public class AVMDLCopyOperation {
    String mDestPath;
    String mFileKey;
    public final AVMDLCopyOperationListener mListener;
    boolean mWaitIfCaching;

    public AVMDLCopyOperation(String str, String str2, AVMDLCopyOperationListener aVMDLCopyOperationListener) {
        this.mFileKey = str;
        this.mDestPath = str2;
        this.mListener = aVMDLCopyOperationListener;
    }

    public AVMDLCopyOperation(String str, String str2, boolean z, AVMDLCopyOperationListener aVMDLCopyOperationListener) {
        this.mFileKey = str;
        this.mDestPath = str2;
        this.mListener = aVMDLCopyOperationListener;
        this.mWaitIfCaching = z;
    }
}
