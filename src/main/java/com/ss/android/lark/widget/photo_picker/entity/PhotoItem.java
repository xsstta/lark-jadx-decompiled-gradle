package com.ss.android.lark.widget.photo_picker.entity;

import com.bytedance.lark.pb.basic.v1.ImageTranslationInfo;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.media.MediaExtra;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.image.entity.ImageFormat;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okio.ByteString;

public class PhotoItem implements Serializable {
    protected int currentIndex = 0;
    private String entityId;
    private ImageTranslationInfo.EntityType entityType;
    private int height = 0;
    private ImageFormat imageFormat;
    protected String imageKey;
    private ByteString inlinePreview;
    private PicInfo intactPicInfo = new PicInfo();
    private boolean isOriginSource = false;
    private MediaExtra mediaExtra;
    private MessageIdentity messageIdentity;
    private PicInfo middlePicInfo = new PicInfo();
    private PicInfo originPicInfo = new PicInfo();
    private long originSize = 0;
    protected final List<String> paths = new ArrayList();
    private Photo photo;
    private PhotoState photoState = new PhotoState();
    protected Object tag;
    private PicInfo thumbnailPicInfo = new PicInfo();
    private String token;
    private TranslateProperty translateProperty = new TranslateProperty();
    private int type = 2;
    private int width = 0;

    public static class TranslateProperty implements Serializable {
        private boolean canTranslate;
        private boolean isTranslated;
        private List<String> srcLanguages = new ArrayList();

        public boolean canTranslate() {
            return this.canTranslate;
        }

        public List<String> getSrcLanguages() {
            return this.srcLanguages;
        }

        public boolean isTranslated() {
            return this.isTranslated;
        }

        public void setCanTranslate(boolean z) {
            this.canTranslate = z;
        }

        public void setSrcLanguages(List<String> list) {
            this.srcLanguages = list;
        }

        public void setTranslated(boolean z) {
            this.isTranslated = z;
            if (z) {
                this.canTranslate = true;
            }
        }
    }

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    public String getEntityId() {
        return this.entityId;
    }

    public ImageTranslationInfo.EntityType getEntityType() {
        return this.entityType;
    }

    public int getHeight() {
        return this.height;
    }

    public ImageFormat getImageFormat() {
        return this.imageFormat;
    }

    public String getImageKey() {
        return this.imageKey;
    }

    public ByteString getInlinePreview() {
        return this.inlinePreview;
    }

    public PicInfo getIntactPicInfo() {
        return this.intactPicInfo;
    }

    public MediaExtra getMediaExtra() {
        return this.mediaExtra;
    }

    public MessageIdentity getMessageIdentity() {
        return this.messageIdentity;
    }

    public PicInfo getMiddlePicInfo() {
        return this.middlePicInfo;
    }

    public PicInfo getOriginPicInfo() {
        return this.originPicInfo;
    }

    public long getOriginSize() {
        return this.originSize;
    }

    public List<String> getPaths() {
        return this.paths;
    }

    public Photo getPhoto() {
        return this.photo;
    }

    public PhotoState getPhotoState() {
        return this.photoState;
    }

    public Object getTag() {
        return this.tag;
    }

    public PicInfo getThumbnailPicInfo() {
        return this.thumbnailPicInfo;
    }

    public String getToken() {
        return this.token;
    }

    public TranslateProperty getTranslateProperty() {
        return this.translateProperty;
    }

    public int getType() {
        return this.type;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isOriginSource() {
        return this.isOriginSource;
    }

    public long getDuration() {
        return this.photo.getDuration();
    }

    public String getMimeType() {
        return this.photo.getMimeType();
    }

    public static class PicInfo implements Serializable {
        public final int height;
        public final String key;
        public final List<String> urls;
        public final int width;

        public PicInfo() {
            this.key = "";
            this.urls = new ArrayList();
        }

        public boolean isEmpty() {
            if (!this.key.equals("") || this.width != 0 || this.height != 0 || !this.urls.isEmpty()) {
                return false;
            }
            return true;
        }

        public PicInfo(String str, List<String> list, int i, int i2) {
            this.key = str;
            this.width = i;
            this.height = i2;
            this.urls = list;
        }
    }

    public String getMessageId() {
        MessageIdentity messageIdentity2 = this.messageIdentity;
        if (messageIdentity2 == null) {
            return "";
        }
        return messageIdentity2.getMessageId();
    }

    public String getCurrentUrl() {
        if (CollectionUtils.isEmpty(this.paths)) {
            return this.imageKey;
        }
        return this.paths.get(this.currentIndex);
    }

    public int hashCode() {
        int i;
        List<String> list = this.paths;
        int i2 = 0;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str = this.imageKey;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i3 + i2;
    }

    public boolean isVideo() {
        Photo photo2 = this.photo;
        if ((photo2 == null || !photo2.isVideo()) && this.mediaExtra == null) {
            return false;
        }
        return true;
    }

    public PhotoItem setCurrentIndex(int i) {
        this.currentIndex = i;
        return this;
    }

    public PhotoItem setEntityId(String str) {
        this.entityId = str;
        return this;
    }

    public PhotoItem setHeight(int i) {
        this.height = i;
        return this;
    }

    public PhotoItem setImageFormat(ImageFormat imageFormat2) {
        this.imageFormat = imageFormat2;
        return this;
    }

    public PhotoItem setImageKey(String str) {
        this.imageKey = str;
        return this;
    }

    public PhotoItem setInlinePreview(ByteString byteString) {
        this.inlinePreview = byteString;
        return this;
    }

    public PhotoItem setIntactPicInfo(PicInfo picInfo) {
        this.intactPicInfo = picInfo;
        return this;
    }

    public PhotoItem setMediaExtra(MediaExtra mediaExtra2) {
        this.mediaExtra = mediaExtra2;
        return this;
    }

    public PhotoItem setMiddlePicInfo(PicInfo picInfo) {
        this.middlePicInfo = picInfo;
        return this;
    }

    public PhotoItem setOriginPicInfo(PicInfo picInfo) {
        this.originPicInfo = picInfo;
        return this;
    }

    public PhotoItem setOriginSize(long j) {
        this.originSize = j;
        return this;
    }

    public PhotoItem setOriginSource(boolean z) {
        this.isOriginSource = z;
        return this;
    }

    public void setPhoto(Photo photo2) {
        this.photo = photo2;
    }

    public PhotoItem setTag(Object obj) {
        this.tag = obj;
        return this;
    }

    public PhotoItem setThumbnailPicInfo(PicInfo picInfo) {
        this.thumbnailPicInfo = picInfo;
        return this;
    }

    public PhotoItem setToken(String str) {
        this.token = str;
        return this;
    }

    public PhotoItem setType(int i) {
        this.type = i;
        return this;
    }

    public PhotoItem setWidth(int i) {
        this.width = i;
        return this;
    }

    public PhotoItem setMessageIdentity(MessageIdentity messageIdentity2) {
        this.messageIdentity = messageIdentity2;
        this.entityType = ImageTranslationInfo.EntityType.MESSAGE_ENTITY;
        return this;
    }

    public PhotoItem setPaths(List<String> list) {
        this.paths.addAll(list);
        return this;
    }

    public PhotoItem setMessageId(String str) {
        this.messageIdentity = new MessageIdentity(str, "");
        this.entityType = ImageTranslationInfo.EntityType.MESSAGE_ENTITY;
        return this;
    }

    public static List<PhotoItem> getPhotoItemsByPhotos(List<Photo> list) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        for (Photo photo2 : list) {
            PhotoItem paths2 = new PhotoItem().setPaths(Collections.singletonList(photo2.getPath()));
            paths2.setPhoto(photo2);
            arrayList.add(paths2);
        }
        return arrayList;
    }

    public static List<PhotoItem> getPhotoItemsByUrls(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        for (String str : list) {
            arrayList.add(new PhotoItem().setPaths(Collections.singletonList(str)));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoItem)) {
            return false;
        }
        PhotoItem photoItem = (PhotoItem) obj;
        List<String> list = this.paths;
        if (list == null ? photoItem.paths != null : !list.equals(photoItem.paths)) {
            return false;
        }
        String str = this.imageKey;
        String str2 = photoItem.imageKey;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }
}
