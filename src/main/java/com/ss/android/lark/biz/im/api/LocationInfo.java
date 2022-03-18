package com.ss.android.lark.biz.im.api;

import android.text.TextUtils;
import com.ss.android.lark.chat.entity.message.Message;
import java.io.Serializable;

public class LocationInfo implements Serializable, Cloneable {
    private String desc;
    private boolean isInternal;
    private boolean isNeedGCTLatLng;
    private boolean isSecretChat;
    private String latitude;
    private String longitude;
    private Message message;
    private String name;
    private int zoomLevel;

    public String getDesc() {
        return this.desc;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public Message getMessage() {
        return this.message;
    }

    public String getName() {
        return this.name;
    }

    public int getZoomLevel() {
        return this.zoomLevel;
    }

    public boolean isInternal() {
        return this.isInternal;
    }

    public boolean isNeedGCTLatLng() {
        return this.isNeedGCTLatLng;
    }

    public boolean isSecretChat() {
        return this.isSecretChat;
    }

    public boolean isHideTitleBar() {
        if (this.message == null) {
            return true;
        }
        return false;
    }

    public boolean isNameAndDescEmpty() {
        if (!TextUtils.isEmpty(this.name) || !TextUtils.isEmpty(this.desc)) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.lark.biz.im.api.LocationInfo$a */
    public static class C29595a {

        /* renamed from: a */
        Message f74145a;

        /* renamed from: b */
        String f74146b;

        /* renamed from: c */
        String f74147c;

        /* renamed from: d */
        String f74148d;

        /* renamed from: e */
        String f74149e;

        /* renamed from: f */
        int f74150f;

        /* renamed from: g */
        boolean f74151g;

        /* renamed from: h */
        boolean f74152h;

        /* renamed from: i */
        boolean f74153i;

        /* renamed from: a */
        public LocationInfo mo106515a() {
            return new LocationInfo(this);
        }

        /* renamed from: a */
        public C29595a mo106511a(int i) {
            this.f74150f = i;
            return this;
        }

        /* renamed from: b */
        public C29595a mo106516b(String str) {
            this.f74147c = str;
            return this;
        }

        /* renamed from: c */
        public C29595a mo106518c(boolean z) {
            this.f74153i = z;
            return this;
        }

        /* renamed from: a */
        public C29595a mo106512a(Message message) {
            this.f74145a = message;
            return this;
        }

        /* renamed from: b */
        public C29595a mo106517b(boolean z) {
            this.f74152h = z;
            return this;
        }

        /* renamed from: a */
        public C29595a mo106513a(String str) {
            this.f74146b = str;
            return this;
        }

        /* renamed from: a */
        public C29595a mo106514a(boolean z) {
            this.f74151g = z;
            return this;
        }

        public C29595a(String str, String str2) {
            this.f74149e = str;
            this.f74148d = str2;
        }
    }

    private LocationInfo(C29595a aVar) {
        this.message = aVar.f74145a;
        this.name = aVar.f74146b;
        this.desc = aVar.f74147c;
        this.latitude = aVar.f74149e;
        this.longitude = aVar.f74148d;
        this.zoomLevel = aVar.f74150f;
        this.isSecretChat = aVar.f74151g;
        this.isInternal = aVar.f74152h;
        this.isNeedGCTLatLng = aVar.f74153i;
    }
}
