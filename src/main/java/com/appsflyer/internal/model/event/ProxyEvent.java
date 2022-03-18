package com.appsflyer.internal.model.event;

public class ProxyEvent extends BackgroundEvent {

    /* renamed from: ł */
    private String f6964;

    public ProxyEvent() {
        ((BackgroundEvent) this).f6963 = false;
    }

    @Override // com.appsflyer.internal.model.event.BackgroundEvent
    public String body() {
        return this.f6964;
    }

    public BackgroundEvent body(String str) {
        this.f6964 = str;
        return this;
    }
}
