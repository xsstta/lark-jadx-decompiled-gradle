package com.appsflyer.internal.model.event;

import com.appsflyer.AFEvent;
import com.appsflyer.AFHelper;

public abstract class BackgroundEvent extends AFEvent {

    /* renamed from: ł */
    private boolean f6961;

    /* renamed from: ȷ */
    boolean f6962 = true;

    /* renamed from: ӏ */
    boolean f6963 = true;

    public boolean proxyMode() {
        return this.f6963;
    }

    public boolean readResponse() {
        return this.f6962;
    }

    public boolean trackingStopped() {
        return this.f6961;
    }

    public BackgroundEvent() {
        this.encrypt = false;
    }

    public String body() {
        return AFHelper.convertToJsonObject(this.params).toString();
    }

    public AFEvent encrypt(boolean z) {
        this.encrypt = z;
        return this;
    }

    public BackgroundEvent trackingStopped(boolean z) {
        this.f6961 = z;
        return this;
    }
}
