package com.larksuite.component.openplatform.plugins.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.lark.plugin_annotation.bean.LKOpenApiBizDomain;
import com.bytedance.ee.lark.plugin_annotation.bean.LKOpenApiBizType;
import java.io.Serializable;

public class LKOpenApiAccessConfig implements Parcelable, Serializable {
    public static final Parcelable.Creator<LKOpenApiAccessConfig> CREATOR = new Parcelable.Creator<LKOpenApiAccessConfig>() {
        /* class com.larksuite.component.openplatform.plugins.config.LKOpenApiAccessConfig.C255681 */

        /* renamed from: a */
        public LKOpenApiAccessConfig[] newArray(int i) {
            return new LKOpenApiAccessConfig[i];
        }

        /* renamed from: a */
        public LKOpenApiAccessConfig createFromParcel(Parcel parcel) {
            return new LKOpenApiAccessConfig(parcel);
        }
    };
    public LKOpenApiBizType mBizType;
    public LKOpenApiBizDomain mDomain;
    public boolean mPublicToJS;
    public String mScene;

    public int describeContents() {
        return 0;
    }

    private LKOpenApiAccessConfig() {
    }

    public LKOpenApiBizType getBizType() {
        return this.mBizType;
    }

    public LKOpenApiBizDomain getDomain() {
        return this.mDomain;
    }

    public String getScene() {
        return this.mScene;
    }

    public boolean isPublicToJS() {
        return this.mPublicToJS;
    }

    /* renamed from: com.larksuite.component.openplatform.plugins.config.LKOpenApiAccessConfig$a */
    public static final class C25569a {

        /* renamed from: a */
        private LKOpenApiBizDomain f62200a = LKOpenApiBizDomain.OPEN_PLATFORM;

        /* renamed from: b */
        private LKOpenApiBizType f62201b;

        /* renamed from: c */
        private String f62202c = "";

        /* renamed from: d */
        private boolean f62203d = true;

        /* renamed from: a */
        public LKOpenApiAccessConfig mo88737a() {
            LKOpenApiAccessConfig lKOpenApiAccessConfig = new LKOpenApiAccessConfig();
            lKOpenApiAccessConfig.mDomain = this.f62200a;
            lKOpenApiAccessConfig.mPublicToJS = this.f62203d;
            lKOpenApiAccessConfig.mScene = this.f62202c;
            lKOpenApiAccessConfig.mBizType = this.f62201b;
            return lKOpenApiAccessConfig;
        }

        /* renamed from: a */
        public C25569a mo88733a(LKOpenApiBizDomain lKOpenApiBizDomain) {
            this.f62200a = lKOpenApiBizDomain;
            return this;
        }

        /* renamed from: a */
        public C25569a mo88734a(LKOpenApiBizType lKOpenApiBizType) {
            this.f62201b = lKOpenApiBizType;
            return this;
        }

        /* renamed from: a */
        public C25569a mo88735a(String str) {
            this.f62202c = str;
            return this;
        }

        /* renamed from: a */
        public C25569a mo88736a(boolean z) {
            this.f62203d = z;
            return this;
        }
    }

    public String toString() {
        return "LKOpenApiAccessConfig{mDomain=" + this.mDomain + ", mBizType=" + this.mBizType + ", mScene='" + this.mScene + '\'' + ", mPublicToJS=" + this.mPublicToJS + '}';
    }

    public void updateDomain(LKOpenApiBizDomain lKOpenApiBizDomain) {
        this.mDomain = lKOpenApiBizDomain;
    }

    protected LKOpenApiAccessConfig(Parcel parcel) {
        boolean z;
        this.mScene = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mPublicToJS = z;
        Serializable readSerializable = parcel.readSerializable();
        if (readSerializable != null) {
            this.mDomain = (LKOpenApiBizDomain) readSerializable;
        }
        Serializable readSerializable2 = parcel.readSerializable();
        if (readSerializable2 != null) {
            this.mBizType = (LKOpenApiBizType) readSerializable2;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mScene);
        parcel.writeByte(this.mPublicToJS ? (byte) 1 : 0);
        parcel.writeSerializable(this.mDomain);
        parcel.writeSerializable(this.mBizType);
    }

    public static LKOpenApiAccessConfig createOpenApiConfig(LKOpenApiBizDomain lKOpenApiBizDomain, LKOpenApiBizType lKOpenApiBizType, String str, boolean z) {
        return new C25569a().mo88734a(lKOpenApiBizType).mo88733a(lKOpenApiBizDomain).mo88736a(z).mo88735a(str).mo88737a();
    }
}
