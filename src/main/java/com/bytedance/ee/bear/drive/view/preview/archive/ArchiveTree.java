package com.bytedance.ee.bear.drive.view.preview.archive;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArchiveTree implements Serializable {
    private List<ArchiveTree> children = new ArrayList();
    @JSONField(name = "file_type")
    private int fileType;
    private String id;
    private String name;
    @JSONField(serialize = false)
    private ArchiveTree parent;
    @JSONField(serialize = false)
    private String path = "";
    private long size;

    public List<ArchiveTree> getChildren() {
        return this.children;
    }

    public int getFileType() {
        return this.fileType;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public ArchiveTree getParent() {
        return this.parent;
    }

    public String getPath() {
        return this.path;
    }

    public long getSize() {
        return this.size;
    }

    public boolean isDir() {
        if (this.fileType == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.name, this.path);
    }

    public String toString() {
        return "ArchiveTree{name='" + this.name + '\'' + ", fileType=" + this.fileType + ", children=" + this.children + '}';
    }

    public void setChildren(List<ArchiveTree> list) {
        this.children = list;
    }

    public void setFileType(int i) {
        this.fileType = i;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setParent(ArchiveTree archiveTree) {
        this.parent = archiveTree;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArchiveTree)) {
            return false;
        }
        ArchiveTree archiveTree = (ArchiveTree) obj;
        if (!Objects.equals(this.name, archiveTree.name) || !Objects.equals(this.path, archiveTree.path)) {
            return false;
        }
        return true;
    }
}
