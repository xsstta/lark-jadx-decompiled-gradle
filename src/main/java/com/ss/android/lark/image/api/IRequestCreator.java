package com.ss.android.lark.image.api;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.ss.android.lark.image.transform.AbstractC38925a;
import com.ss.android.lark.image.transform.C38926b;
import com.ss.android.lark.image.transform.CropTransformation;
import java.io.File;
import java.util.concurrent.ExecutionException;

public interface IRequestCreator {
    IRequestCreator asBitmap();

    IRequestCreator asDrawable();

    IRequestCreator asFile();

    IRequestCreator asGif();

    IRequestCreator centerCrop();

    IRequestCreator diskCacheStrategy(DiskCacheStrategy diskCacheStrategy);

    IRequestCreator dontAnimate(boolean z);

    File downloadOnly(int i, int i2) throws InterruptedException, ExecutionException;

    <R> void downloadOnly(AbstractC38819j<R> jVar);

    IRequestCreator error(int i);

    IRequestCreator error(Drawable drawable);

    IRequestCreator fitCenter();

    Bitmap getBitmap(int i, int i2) throws InterruptedException, ExecutionException;

    void into(ImageView imageView);

    <R> void into(AbstractC38819j<R> jVar);

    IRequestCreator isAsync(boolean z);

    IRequestCreator listener(AbstractC38817h hVar);

    IRequestCreator load(Object obj);

    IRequestCreator onlyRetrieveFromCache(boolean z);

    IRequestCreator override(int i, int i2);

    void pauseRequests();

    IRequestCreator placeholder(int i);

    IRequestCreator placeholder(Drawable drawable);

    void resumeRequests();

    IRequestCreator setErrorScaleType(ImageView.ScaleType scaleType);

    IRequestCreator skipMemoryCache(boolean z);

    IRequestCreator thumbnail(float f);

    IRequestCreator thumbnail(IRequestCreator iRequestCreator);

    IRequestCreator transform(CropTransformation cropTransformation);

    IRequestCreator transform(AbstractC38925a aVar);

    IRequestCreator transform(C38926b bVar);
}
