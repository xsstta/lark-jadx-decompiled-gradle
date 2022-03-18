package com.ss.android.lark.widget.photo_picker.entity;

import android.text.TextUtils;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.CollectionUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PhotoDirectory implements Serializable {
    private String coverPath;
    private String id;
    private String name;
    private String path;
    private List<Photo> photos = new ArrayList();

    public String getCoverPath() {
        return this.coverPath;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public List<Photo> getPhotos() {
        return this.photos;
    }

    public int getPhotoNum() {
        if (CollectionUtils.isEmpty(this.photos)) {
            return 0;
        }
        return this.photos.size();
    }

    public List<String> getPhotoPaths() {
        ArrayList arrayList = new ArrayList(this.photos.size());
        for (Photo photo : this.photos) {
            arrayList.add(photo.getPath());
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
        return "PhotoDirectory{id='" + this.id + '\'' + ", coverPath='" + this.coverPath + '\'' + ", name='" + this.name + '\'' + ", photos=" + this.photos + '}';
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoDirectory)) {
            return false;
        }
        PhotoDirectory photoDirectory = (PhotoDirectory) obj;
        boolean z = !TextUtils.isEmpty(this.id);
        boolean isEmpty = true ^ TextUtils.isEmpty(photoDirectory.id);
        if (!z || !isEmpty || !TextUtils.equals(this.id, photoDirectory.id)) {
            return false;
        }
        return TextUtils.equals(this.name, photoDirectory.name);
    }

    public void setPhotos(List<Photo> list) {
        if (list != null) {
            int size = list.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                Photo photo = list.get(i);
                if (photo == null || !C26311p.m95290j(photo.getPath())) {
                    list.remove(i);
                } else {
                    i++;
                }
            }
            this.photos = list;
        }
    }

    public void addPhoto(int i, String str, String str2, long j) {
        C26311p.m95290j(str);
    }
}
