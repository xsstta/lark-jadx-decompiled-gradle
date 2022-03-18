package com.bytedance.ee.bear.document.offline.remoteres;

import android.net.Uri;
import com.bytedance.ee.util.io.NonProguard;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoteResourceConfig implements NonProguard {
    private Set<String> fileNameSet;
    private List<String> remote_file_list;

    public Set<String> getFileNameSet() {
        return this.fileNameSet;
    }

    public List<String> getRemote_file_list() {
        return this.remote_file_list;
    }

    public static RemoteResourceConfig defaultResConfig() {
        RemoteResourceConfig remoteResourceConfig = new RemoteResourceConfig();
        remoteResourceConfig.remote_file_list = new ArrayList();
        return remoteResourceConfig;
    }

    public void generateFileNameSet() {
        this.fileNameSet = new HashSet();
        List<String> list = this.remote_file_list;
        if (list != null) {
            for (String str : list) {
                this.fileNameSet.add(Uri.parse(str).getLastPathSegment());
            }
        }
    }

    public void setFileNameSet(Set<String> set) {
        this.fileNameSet = set;
    }

    public void setRemote_file_list(List<String> list) {
        this.remote_file_list = list;
    }
}
