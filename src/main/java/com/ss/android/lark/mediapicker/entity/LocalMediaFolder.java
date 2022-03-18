package com.ss.android.lark.mediapicker.entity;

import android.text.TextUtils;
import com.ss.android.lark.mediapicker.utils.C44753h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LocalMediaFolder implements Serializable {
    private int checkedNum;
    private String coverPath;
    private String id;
    private boolean isChecked;
    private List<LocalMedia> localMedia = new ArrayList();
    private String name;
    private String path;

    public int getCheckedNum() {
        return this.checkedNum;
    }

    public String getCoverPath() {
        return this.coverPath;
    }

    public String getId() {
        return this.id;
    }

    public List<LocalMedia> getLocalMedia() {
        return this.localMedia;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public int getLocalMediaNum() {
        List<LocalMedia> list = this.localMedia;
        if (list == null || list.size() == 0) {
            return 0;
        }
        return this.localMedia.size();
    }

    public List<String> getLocalMediaPaths() {
        ArrayList arrayList = new ArrayList(this.localMedia.size());
        for (LocalMedia localMedia2 : this.localMedia) {
            arrayList.add(localMedia2.getPath());
        }
        return arrayList;
    }

    public int hashCode() {
        if (!TextUtils.isEmpty(this.id)) {
            int hashCode = this.id.hashCode();
            if (TextUtils.isEmpty(this.name)) {
                return hashCode;
            }
            return (hashCode * 31) + this.name.hashCode();
        } else if (TextUtils.isEmpty(this.name)) {
            return 0;
        } else {
            return this.name.hashCode();
        }
    }

    public String toString() {
        return "LocalMediaFolder{id='" + this.id + '\'' + ", coverPath='" + this.coverPath + '\'' + ", name='" + this.name + '\'' + ", localMedia=" + this.localMedia + '}';
    }

    public void setChecked(boolean z) {
        this.isChecked = z;
    }

    public void setCheckedNum(int i) {
        this.checkedNum = i;
    }

    public void setCoverPath(String str) {
        this.coverPath = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setLocalMedia(List<LocalMedia> list) {
        if (list != null) {
            int size = list.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                if (list.get(i) == null) {
                    list.remove(i);
                } else {
                    i++;
                }
            }
            this.localMedia = list;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalMediaFolder)) {
            return false;
        }
        LocalMediaFolder localMediaFolder = (LocalMediaFolder) obj;
        boolean z = !TextUtils.isEmpty(this.id);
        boolean isEmpty = true ^ TextUtils.isEmpty(localMediaFolder.id);
        if (!z || !isEmpty || !TextUtils.equals(this.id, localMediaFolder.id)) {
            return false;
        }
        return TextUtils.equals(this.name, localMediaFolder.name);
    }

    public void addMedia(int i, String str, String str2, long j) {
        C44753h.m177495b(str);
    }
}
