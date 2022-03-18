package com.larksuite.component.air;

import android.app.Application;
import android.content.res.Resources;

public class AirApplication extends Application {
    private AbstractC24045b mDelegate;

    public void onCreate() {
        super.onCreate();
    }

    public Resources getResources() {
        Resources a;
        Resources resources = super.getResources();
        if (this.mDelegate == null) {
            this.mDelegate = C24044a.m87852a().mo86282b();
        }
        AbstractC24045b bVar = this.mDelegate;
        if (bVar == null || (a = bVar.mo86284a(this, resources)) == null) {
            return resources;
        }
        return a;
    }
}
