package com.ss.android.lark.biz.core.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import java.util.List;
import java.util.Map;

public class CommonShareData extends BaseShareData implements Parcelable {
    public static final Parcelable.Creator<CommonShareData> CREATOR = new Parcelable.Creator<CommonShareData>() {
        /* class com.ss.android.lark.biz.core.api.CommonShareData.C295301 */

        /* renamed from: a */
        public CommonShareData[] newArray(int i) {
            return new CommonShareData[i];
        }

        /* renamed from: a */
        public CommonShareData createFromParcel(Parcel parcel) {
            return new CommonShareData(parcel);
        }
    };
    private List<String> mFiles;
    private String mHashKey;
    private String mIconPath;
    private List<String> mImages;
    private boolean mNewStyle;
    private int mShareFileScene;
    private String mUrl;
    private Map<String, Long> mVideos;

    @Override // com.ss.android.lark.biz.core.api.BaseShareData
    public int describeContents() {
        return 0;
    }

    public List<String> getFiles() {
        return this.mFiles;
    }

    public String getHashKey() {
        return this.mHashKey;
    }

    public String getIconPath() {
        return this.mIconPath;
    }

    public List<String> getImages() {
        return this.mImages;
    }

    public int getShareFileScene() {
        return this.mShareFileScene;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public Map<String, Long> getVideos() {
        return this.mVideos;
    }

    public boolean isNewStyle() {
        return this.mNewStyle;
    }

    public CommonShareData() {
        this.mHashKey = Integer.toString(hashCode());
    }

    public boolean isEmpty() {
        if (!TextUtils.isEmpty(getContent()) || !CollectionUtils.isEmpty(this.mImages) || !CollectionUtils.isEmpty(this.mFiles) || !CollectionUtils.isEmpty(this.mVideos)) {
            return false;
        }
        return true;
    }

    public void setFiles(List<String> list) {
        this.mFiles = list;
    }

    public void setHashKey(String str) {
        this.mHashKey = str;
    }

    public void setIconPath(String str) {
        this.mIconPath = str;
    }

    public void setImages(List<String> list) {
        this.mImages = list;
    }

    public void setNewStyle(boolean z) {
        this.mNewStyle = z;
    }

    public void setShareFileScene(int i) {
        this.mShareFileScene = i;
    }

    public void setUrl(String str) {
        this.mUrl = str;
    }

    public void setVideos(Map<String, Long> map) {
        this.mVideos = map;
    }

    protected CommonShareData(Parcel parcel) {
        super(parcel);
        boolean z;
        this.mImages = parcel.createStringArrayList();
        this.mFiles = parcel.createStringArrayList();
        this.mShareFileScene = parcel.readInt();
        this.mVideos = parcel.readHashMap(CommonShareData.class.getClassLoader());
        this.mHashKey = parcel.readString();
        this.mUrl = parcel.readString();
        this.mIconPath = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mNewStyle = z;
    }

    @Override // com.ss.android.lark.biz.core.api.BaseShareData
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeStringList(this.mImages);
        parcel.writeStringList(this.mFiles);
        parcel.writeInt(this.mShareFileScene);
        parcel.writeMap(this.mVideos);
        parcel.writeString(this.mHashKey);
        parcel.writeString(this.mUrl);
        parcel.writeString(this.mIconPath);
        parcel.writeByte(this.mNewStyle ? (byte) 1 : 0);
    }
}
