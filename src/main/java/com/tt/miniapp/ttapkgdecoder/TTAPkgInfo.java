package com.tt.miniapp.ttapkgdecoder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class TTAPkgInfo {
    private final byte[] mExtraInfo;
    private final List<TTAPkgFile> mFileList = new ArrayList();
    private final HashMap<String, TTAPkgFile> mFileMap = new HashMap<>();

    public byte[] getExtraInfo() {
        return this.mExtraInfo;
    }

    public List<TTAPkgFile> getFiles() {
        return this.mFileList;
    }

    public Collection<String> getFileNames() {
        return this.mFileMap.keySet();
    }

    public String toString() {
        return "TTAPkgInfo{mFile=" + this.mFileList + '}';
    }

    public void addFile(TTAPkgFile tTAPkgFile) {
        this.mFileMap.put(tTAPkgFile.getFileName(), tTAPkgFile);
        this.mFileList.add(tTAPkgFile);
    }

    public TTAPkgInfo(byte[] bArr) {
        this.mExtraInfo = bArr;
    }

    public TTAPkgFile findFile(String str) {
        if (str.startsWith("./")) {
            str = str.substring(2);
        } else if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return this.mFileMap.get(str);
    }
}
