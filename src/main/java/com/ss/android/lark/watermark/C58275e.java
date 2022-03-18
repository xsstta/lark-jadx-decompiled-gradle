package com.ss.android.lark.watermark;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.p1405e.AbstractC29559a;
import com.ss.android.lark.watermark.dto.WatermarkInfo;

/* renamed from: com.ss.android.lark.watermark.e */
public class C58275e {

    /* renamed from: b */
    private static volatile IWatermarkModuleDependency f143284b;

    /* renamed from: a */
    private C58222b f143285a = new C58222b();

    /* renamed from: com.ss.android.lark.watermark.e$a */
    public interface AbstractC58276a {
        /* renamed from: a */
        void mo133339a();
    }

    /* renamed from: a */
    public static IWatermarkModuleDependency m225982a() {
        return f143284b;
    }

    /* renamed from: b */
    public void mo197369b() {
        this.f143285a.mo197265c();
    }

    /* renamed from: c */
    public int mo197373c() {
        return this.f143285a.mo197262b();
    }

    /* renamed from: d */
    public C58219a mo197375d() {
        return new C58219a();
    }

    /* renamed from: a */
    public WatermarkInfo mo197360a(Context context) {
        return this.f143285a.mo197248a(context);
    }

    public C58275e(IWatermarkModuleDependency iWatermarkModuleDependency) {
        f143284b = iWatermarkModuleDependency;
    }

    /* renamed from: a */
    public void mo197361a(Activity activity) {
        this.f143285a.mo197252a(activity, true);
    }

    /* renamed from: b */
    public void mo197370b(Activity activity) {
        this.f143285a.mo197252a(activity, false);
    }

    /* renamed from: c */
    public void mo197374c(Activity activity) {
        this.f143285a.mo197263b(activity);
    }

    /* renamed from: b */
    public void mo197371b(Dialog dialog) {
        boolean z;
        C58222b bVar = this.f143285a;
        if (mo197373c() == 0) {
            z = true;
        } else {
            z = false;
        }
        bVar.mo197253a(dialog, z);
    }

    /* renamed from: a */
    public void mo197363a(Dialog dialog) {
        this.f143285a.mo197253a(dialog, true);
    }

    /* renamed from: b */
    public void mo197372b(AbstractC29559a aVar) {
        this.f143285a.mo197264b(aVar);
    }

    /* renamed from: a */
    public void mo197365a(View view) {
        this.f143285a.mo197255a(view);
    }

    /* renamed from: a */
    public void mo197366a(FrameLayout frameLayout) {
        this.f143285a.mo197256a(frameLayout, true);
    }

    /* renamed from: a */
    public void mo197367a(AbstractC29559a aVar) {
        this.f143285a.mo197257a(aVar);
    }

    /* renamed from: a */
    public void mo197368a(AbstractC58276a aVar) {
        this.f143285a.mo197260a(aVar);
    }

    /* renamed from: a */
    public void mo197362a(Activity activity, LifecycleOwner lifecycleOwner) {
        this.f143285a.mo197251a(activity, lifecycleOwner, false, true);
    }

    /* renamed from: a */
    public void mo197364a(Context context, int i, float f, IGetDataCallback<Drawable> iGetDataCallback) {
        this.f143285a.mo197254a(context, i, f, iGetDataCallback);
    }
}
