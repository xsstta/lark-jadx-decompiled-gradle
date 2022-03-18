package com.larksuite.component.air;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public abstract class AirActivity extends AppCompatActivity {
    private final AbstractC24045b mDelegate = C24044a.m87852a().mo86282b();

    public Resources.Theme getTheme() {
        return super.getTheme();
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public Resources getResources() {
        Resources a;
        Resources resources = super.getResources();
        AbstractC24045b bVar = this.mDelegate;
        if (bVar == null || (a = bVar.mo86283a(this, resources)) == null) {
            return resources;
        }
        return a;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onDestroy() {
        AbstractC24045b bVar = this.mDelegate;
        if (bVar != null) {
            bVar.mo86287c(this);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        AbstractC24045b bVar = this.mDelegate;
        if (bVar != null) {
            bVar.mo86285a(this);
        }
        super.onCreate(bundle);
        AbstractC24045b bVar2 = this.mDelegate;
        if (bVar2 != null) {
            bVar2.mo86286b(this);
        }
    }
}
