package com.bytedance.ee.bear.document.model.toolbar.insertblock;

import com.bytedance.ee.util.io.NonProguard;
import java.util.Arrays;
import java.util.Objects;

public class InsertNewBlock implements NonProguard {
    private Children[] children;
    private String title;

    public static class ChildData implements NonProguard {
        private boolean adminLimit;
        private String id;
        private String name;
        private boolean showBadge;

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public boolean isAdminLimit() {
            return this.adminLimit;
        }

        public boolean isShowBadge() {
            return this.showBadge;
        }

        public int hashCode() {
            return Objects.hash(this.id, this.name, Boolean.valueOf(this.adminLimit));
        }

        public String toString() {
            return "ChildData{id='" + this.id + '\'' + ", name='" + this.name + '\'' + ", showBadge=" + this.showBadge + ", adminLimit=" + this.adminLimit + '}';
        }

        public void setAdminLimit(boolean z) {
            this.adminLimit = z;
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setShowBadge(boolean z) {
            this.showBadge = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChildData)) {
                return false;
            }
            ChildData childData = (ChildData) obj;
            if (isShowBadge() != childData.isShowBadge() || isAdminLimit() != childData.isAdminLimit()) {
                return false;
            }
            if (getId() == null ? childData.getId() != null : !getId().equals(childData.getId())) {
                return false;
            }
            if (getName() != null) {
                return getName().equals(childData.getName());
            }
            if (childData.getName() == null) {
                return true;
            }
            return false;
        }
    }

    public static class Children implements NonProguard {
        public ChildData[] data;
        private String subTitle;

        public ChildData[] getData() {
            return this.data;
        }

        public String getSubTitle() {
            return this.subTitle;
        }

        public int hashCode() {
            return (Objects.hash(this.subTitle) * 31) + Arrays.hashCode(this.data);
        }

        public String toString() {
            return "Children{subTitle='" + this.subTitle + '\'' + ", data=" + Arrays.toString(this.data) + '}';
        }

        public void setData(ChildData[] childDataArr) {
            this.data = childDataArr;
        }

        public void setSubTitle(String str) {
            this.subTitle = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Children children = (Children) obj;
            if (!Objects.equals(this.subTitle, children.subTitle) || !Arrays.equals(this.data, children.data)) {
                return false;
            }
            return true;
        }
    }

    public Children[] getChildren() {
        return this.children;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return "InsertNewBlock{, children=" + Arrays.toString(this.children) + '}';
    }

    public void setChildren(Children[] childrenArr) {
        this.children = childrenArr;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
