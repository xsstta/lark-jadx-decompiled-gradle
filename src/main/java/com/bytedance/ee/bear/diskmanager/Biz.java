package com.bytedance.ee.bear.diskmanager;

import com.google.android.gms.stats.CodePackage;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/diskmanager/Biz;", "", "bizRootDir", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getBizRootDir", "()Ljava/lang/String;", CodePackage.DRIVE, "DOCS", "RUSTSDK", "LOG", "DYNAMIC", "biz-diskmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum Biz {
    DRIVE("drive"),
    DOCS("docs"),
    RUSTSDK("rustsdk"),
    LOG("log"),
    DYNAMIC("dynamic");
    
    private final String bizRootDir;

    public final String getBizRootDir() {
        return this.bizRootDir;
    }

    private Biz(String str) {
        this.bizRootDir = str;
    }
}
