package com.bytedance.ee.bear.wikiv2.extension;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.ee.bear.contract.p282f.C5171a;
import com.bytedance.ee.bear.wikiv2.extension.ActivityMultiTaskWrapper;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.multitask.MultitaskHelper;
import com.ss.android.lark.multitask.task.AbstractC48369g;

/* renamed from: com.bytedance.ee.bear.wikiv2.extension.e */
public class C12251e extends WikiActivityExtension {

    /* renamed from: a */
    public ActivityMultiTaskWrapper.IMultiTaskInfoCallback f32929a;

    /* renamed from: c */
    private MultitaskHelper f32930c;

    /* renamed from: b */
    public MultitaskHelper mo46810b() {
        return this.f32930c;
    }

    public C12251e(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override // com.bytedance.ee.bear.wikiv2.extension.WikiActivityExtension
    /* renamed from: a */
    public void mo46799a(Intent intent) {
        super.mo46799a(intent);
        mo46811b(intent);
    }

    /* renamed from: c */
    private AbstractC48369g m50994c(Intent intent) {
        ActivityMultiTaskWrapper aVar = new ActivityMultiTaskWrapper(this.f20780b, intent);
        aVar.mo46802a(new ActivityMultiTaskWrapper.IMultiTaskInfoCallback() {
            /* class com.bytedance.ee.bear.wikiv2.extension.C12251e.C122521 */

            @Override // com.bytedance.ee.bear.wikiv2.extension.ActivityMultiTaskWrapper.IMultiTaskInfoCallback
            /* renamed from: a */
            public String mo46696a() {
                if (C12251e.this.f32929a != null) {
                    return C12251e.this.f32929a.mo46696a();
                }
                return null;
            }

            @Override // com.bytedance.ee.bear.wikiv2.extension.ActivityMultiTaskWrapper.IMultiTaskInfoCallback
            /* renamed from: b */
            public String mo46697b() {
                if (C12251e.this.f32929a != null) {
                    return C12251e.this.f32929a.mo46697b();
                }
                return null;
            }

            @Override // com.bytedance.ee.bear.wikiv2.extension.ActivityMultiTaskWrapper.IMultiTaskInfoCallback
            /* renamed from: c */
            public Integer mo46698c() {
                if (C12251e.this.f32929a != null) {
                    return C12251e.this.f32929a.mo46698c();
                }
                return null;
            }
        });
        return aVar;
    }

    @Override // com.bytedance.ee.bear.wikiv2.extension.WikiActivityExtension
    /* renamed from: a */
    public void mo46808a(Bundle bundle) {
        super.mo46808a(bundle);
        mo46811b(this.f20780b.getIntent());
    }

    /* renamed from: d */
    private Boolean m50995d(Intent intent) {
        return Boolean.valueOf(!C5171a.m21150a(intent.getStringExtra("url")));
    }

    /* renamed from: a */
    public void mo46809a(ActivityMultiTaskWrapper.IMultiTaskInfoCallback bVar) {
        C13479a.m54764b("MultiTaskExtension", "setMultiTaskInfoCallback. ");
        this.f32929a = bVar;
    }

    /* renamed from: b */
    public void mo46811b(Intent intent) {
        boolean z;
        if (intent == null || !m50995d(intent).booleanValue()) {
            C13479a.m54764b("MultiTaskExtension", "URL not support multitask! ");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("init multitask. multitaskHelper?=");
        if (this.f32930c == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C13479a.m54764b("MultiTaskExtension", sb.toString());
        MultitaskHelper hVar = this.f32930c;
        if (hVar == null) {
            this.f32930c = MultitaskHelper.m190623b(m50994c(intent));
        } else {
            this.f32930c = hVar.mo169042a(m50994c(intent));
        }
    }
}
