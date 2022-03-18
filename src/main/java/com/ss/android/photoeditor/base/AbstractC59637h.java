package com.ss.android.photoeditor.base;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import com.ss.android.photoeditor.mosaic.p3011a.AbstractC59737a;
import java.util.Stack;

/* renamed from: com.ss.android.photoeditor.base.h */
public interface AbstractC59637h {

    /* renamed from: com.ss.android.photoeditor.base.h$a */
    public interface AbstractC59638a {
        /* renamed from: a */
        View mo203151a();

        /* renamed from: a */
        void mo203152a(Class cls);

        /* renamed from: b */
        View mo203153b();

        /* renamed from: c */
        Stack<Class<? extends AbstractC59637h>> mo203154c();

        /* renamed from: d */
        void mo203155d();

        /* renamed from: e */
        void mo203156e();

        /* renamed from: f */
        int mo203157f();

        /* renamed from: g */
        Bitmap mo203158g();

        /* renamed from: h */
        AbstractC59737a mo203159h();
    }

    /* renamed from: a */
    void mo203140a();

    /* renamed from: a */
    void mo203141a(RectF rectF, boolean z);

    /* renamed from: b */
    void mo203142b();

    /* renamed from: c */
    void mo203143c();

    /* renamed from: d */
    void mo203144d();

    /* renamed from: e */
    void mo203145e();

    /* renamed from: f */
    boolean mo203146f();

    View getEditView();

    RectF getLocation();

    void setImageBitmap(Bitmap bitmap);

    void setPluginContext(AbstractC59638a aVar);
}
