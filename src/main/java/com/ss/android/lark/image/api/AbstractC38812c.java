package com.ss.android.lark.image.api;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.load.AbstractC2265c;
import com.ss.android.lark.image.impl.C38899h;
import java.io.File;

/* renamed from: com.ss.android.lark.image.api.c */
public interface AbstractC38812c {
    /* renamed from: a */
    Bitmap mo142225a(int i, int i2, C38899h hVar);

    /* renamed from: a */
    void mo142226a(Context context);

    /* renamed from: a */
    <T extends AbstractC2265c, Y> void mo142227a(Context context, Class<T> cls, Class<Y> cls2, AbstractC38815f<T, Y> fVar);

    /* renamed from: a */
    void mo142228a(View view);

    /* renamed from: a */
    void mo142229a(ImageView imageView, C38899h hVar);

    /* renamed from: a */
    <R> void mo142230a(AbstractC38819j<R> jVar, C38899h hVar);

    /* renamed from: a */
    void mo142231a(C38899h hVar);

    /* renamed from: b */
    File mo142232b(int i, int i2, C38899h hVar);

    /* renamed from: b */
    <R> void mo142233b(AbstractC38819j<R> jVar, C38899h hVar);

    /* renamed from: b */
    void mo142234b(C38899h hVar);
}
