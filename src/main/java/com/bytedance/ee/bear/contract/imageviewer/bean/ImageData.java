package com.bytedance.ee.bear.contract.imageviewer.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p700c.C13598b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Objects;

public class ImageData implements NonProguard {
    protected Image image;
    protected List<Image> imageList;
    protected ToolStatus toolStatus;

    public static class Image implements NonProguard {
        private String originalSrc;
        public Position position;
        private ToolStatus singleToolStatus;
        private String src;
        private String title;
        private String uuid;

        public String getOriginalSrc() {
            return this.originalSrc;
        }

        public Position getPosition() {
            return this.position;
        }

        public ToolStatus getSingleToolStatus() {
            return this.singleToolStatus;
        }

        public String getSrc() {
            return this.src;
        }

        public String getTitle() {
            return this.title;
        }

        public String getUuid() {
            return this.uuid;
        }

        public String getRealSrc() {
            if (TextUtils.isEmpty(this.originalSrc)) {
                return this.src;
            }
            return this.originalSrc;
        }

        public int hashCode() {
            return Objects.hash(this.title, this.src, this.uuid, this.originalSrc);
        }

        public String toString() {
            return "Image{uuid='" + C13598b.m55197d(this.uuid) + '\'' + ", singleToolStatus=" + this.singleToolStatus + '}';
        }

        public void setOriginalSrc(String str) {
            this.originalSrc = str;
        }

        public void setPosition(Position position2) {
            this.position = position2;
        }

        public void setSingleToolStatus(ToolStatus toolStatus) {
            this.singleToolStatus = toolStatus;
        }

        public void setSrc(String str) {
            this.src = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setUuid(String str) {
            this.uuid = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Image image = (Image) obj;
            if (!Objects.equals(this.title, image.title) || !Objects.equals(this.src, image.src) || !Objects.equals(this.originalSrc, image.originalSrc) || !Objects.equals(this.uuid, image.uuid)) {
                return false;
            }
            return true;
        }
    }

    public static class Position implements Parcelable, NonProguard {
        public static final Parcelable.Creator<Position> CREATOR = new Parcelable.Creator<Position>() {
            /* class com.bytedance.ee.bear.contract.imageviewer.bean.ImageData.Position.C51851 */

            /* renamed from: a */
            public Position[] newArray(int i) {
                return new Position[i];
            }

            /* renamed from: a */
            public Position createFromParcel(Parcel parcel) {
                return new Position(parcel);
            }
        };
        public float height;
        public float width;

        /* renamed from: x */
        public float f14903x;

        /* renamed from: y */
        public float f14904y;

        public int describeContents() {
            return 0;
        }

        public Position() {
        }

        protected Position(Parcel parcel) {
            this.f14903x = parcel.readFloat();
            this.f14904y = parcel.readFloat();
            this.width = parcel.readFloat();
            this.height = parcel.readFloat();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f14903x);
            parcel.writeFloat(this.f14904y);
            parcel.writeFloat(this.width);
            parcel.writeFloat(this.height);
        }
    }

    public static class ToolStatus implements NonProguard {
        private boolean comment;
        private boolean commentable;
        private boolean copy;
        private boolean delete;

        public boolean isComment() {
            return this.comment;
        }

        public boolean isCommentable() {
            return this.commentable;
        }

        public boolean isCopy() {
            return this.copy;
        }

        public boolean isDelete() {
            return this.delete;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(this.comment), Boolean.valueOf(this.delete));
        }

        public String toString() {
            return "ToolStatus{comment=" + this.comment + ", commentable=" + this.commentable + ", delete=" + this.delete + ", copy=" + this.copy + '}';
        }

        public void setComment(boolean z) {
            this.comment = z;
        }

        public void setCommentable(boolean z) {
            this.commentable = z;
        }

        public void setCopy(boolean z) {
            this.copy = z;
        }

        public void setDelete(boolean z) {
            this.delete = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ToolStatus toolStatus = (ToolStatus) obj;
            if (this.comment == toolStatus.comment && this.delete == toolStatus.delete && this.copy == toolStatus.copy) {
                return true;
            }
            return false;
        }
    }

    public Image getImage() {
        return this.image;
    }

    public List<Image> getImageList() {
        return this.imageList;
    }

    public ToolStatus getToolStatus() {
        return this.toolStatus;
    }

    public boolean hasValidEnterAnimator() {
        Position position;
        Image image2 = this.image;
        if (image2 != null && (position = image2.position) != null && position.width > BitmapDescriptorFactory.HUE_RED && position.height > BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.toolStatus, this.image, this.imageList);
    }

    public String toString() {
        return "ImageData{toolStatus=" + this.toolStatus + ", image=" + this.image + ", imageList=" + this.imageList + '}';
    }

    public void setImage(Image image2) {
        this.image = image2;
    }

    public void setImageList(List<Image> list) {
        this.imageList = list;
    }

    public void setToolStatus(ToolStatus toolStatus2) {
        this.toolStatus = toolStatus2;
    }

    public Image findImageByPosition(int i) {
        List<Image> list = this.imageList;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.imageList.get(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageData imageData = (ImageData) obj;
        if (!Objects.equals(this.toolStatus, imageData.toolStatus) || !Objects.equals(this.image, imageData.image) || !Objects.equals(this.imageList, imageData.imageList)) {
            return false;
        }
        return true;
    }
}
