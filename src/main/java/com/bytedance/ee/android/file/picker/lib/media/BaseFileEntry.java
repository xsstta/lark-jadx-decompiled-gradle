package com.bytedance.ee.android.file.picker.lib.media;

import android.net.Uri;
import com.bytedance.ee.android.file.picker.lib.utils.FileUtils;
import java.io.Serializable;
import java.util.Objects;

public abstract class BaseFileEntry implements Serializable {
    protected String name;
    protected String path;
    protected long size;
    protected Uri uri;

    public String getName() {
        return this.name;
    }

    public long getSize() {
        return this.size;
    }

    public Uri getUri() {
        return this.uri;
    }

    public String path() {
        return this.path;
    }

    public int getIconResId() {
        return FileUtils.m17136a(this.name);
    }

    public int hashCode() {
        Uri uri2 = this.uri;
        if (uri2 != null) {
            return uri2.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "BaseFileEntry{uri='" + this.uri + '\'' + ", module='" + this.name + '\'' + ", size=" + this.size + '}';
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setUri(Uri uri2) {
        this.uri = uri2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.uri, ((BaseFileEntry) obj).uri);
    }
}
