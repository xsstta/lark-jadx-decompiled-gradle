package com.bytedance.ee.bear.contract.drive.sdk.entity.open;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.HashMap;
import java.util.Map;

public class SpaceFileOpenEntity extends BaseSpaceOpenEntity {
    public static final Parcelable.Creator<SpaceFileOpenEntity> CREATOR = new Parcelable.Creator<SpaceFileOpenEntity>() {
        /* class com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceFileOpenEntity.C51631 */

        /* renamed from: a */
        public SpaceFileOpenEntity[] newArray(int i) {
            return new SpaceFileOpenEntity[i];
        }

        /* renamed from: a */
        public SpaceFileOpenEntity createFromParcel(Parcel parcel) {
            return new SpaceFileOpenEntity(parcel);
        }
    };
    private Map<String, String> extra = new HashMap();
    private String feedId;
    private boolean hasSpaceCache;
    private String originUrl;
    @JSONField(serialize = false)
    private Bundle reminderBinder;
    private String url;

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity, com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseSpaceOpenEntity
    public int describeContents() {
        return 0;
    }

    public Map<String, String> getExtra() {
        return this.extra;
    }

    public String getFeedId() {
        return this.feedId;
    }

    public String getOriginUrl() {
        return this.originUrl;
    }

    public Bundle getReminderBinder() {
        return this.reminderBinder;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isHasSpaceCache() {
        return this.hasSpaceCache;
    }

    public void setExtra(Map<String, String> map) {
        this.extra = map;
    }

    public void setFeedId(String str) {
        this.feedId = str;
    }

    public void setHasSpaceCache(boolean z) {
        this.hasSpaceCache = z;
    }

    public void setOriginUrl(String str) {
        this.originUrl = str;
    }

    public void setReminderBinder(Bundle bundle) {
        this.reminderBinder = bundle;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    protected SpaceFileOpenEntity(Parcel parcel) {
        super(parcel);
        boolean z;
        this.url = parcel.readString();
        this.originUrl = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.hasSpaceCache = z;
        this.reminderBinder = parcel.readBundle();
        this.extra = parcel.readHashMap(getClass().getClassLoader());
        this.feedId = parcel.readString();
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseSpaceOpenEntity
    public void readFromParcel(Parcel parcel) {
        boolean z;
        super.readFromParcel(parcel);
        this.url = parcel.readString();
        this.originUrl = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.hasSpaceCache = z;
        this.reminderBinder = parcel.readBundle();
        this.extra = parcel.readHashMap(getClass().getClassLoader());
        this.feedId = parcel.readString();
    }

    public SpaceFileOpenEntity(String str, String str2) {
        super("2", str, str2);
        setBizType(2);
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity, com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseSpaceOpenEntity
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.url);
        parcel.writeString(this.originUrl);
        parcel.writeByte(this.hasSpaceCache ? (byte) 1 : 0);
        parcel.writeBundle(this.reminderBinder);
        parcel.writeMap(this.extra);
        parcel.writeString(this.feedId);
    }
}
