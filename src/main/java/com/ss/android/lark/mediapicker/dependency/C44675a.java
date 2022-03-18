package com.ss.android.lark.mediapicker.dependency;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mediapicker.utils.C44742a;

/* renamed from: com.ss.android.lark.mediapicker.dependency.a */
public class C44675a {

    /* renamed from: a */
    private static IPickerImageLoader f113225a;

    /* renamed from: com.ss.android.lark.mediapicker.dependency.a$a */
    public interface AbstractC44676a<T> {
    }

    /* renamed from: a */
    public static IPickerImageLoader m177225a() {
        return f113225a;
    }

    /* renamed from: a */
    public static void m177229a(Bundle bundle) {
        IPickerImageLoader iPickerImageLoader;
        if (bundle != null && (iPickerImageLoader = f113225a) != null) {
            bundle.putParcelable("mediaPickerImageLoader", iPickerImageLoader);
        }
    }

    /* renamed from: a */
    public static void m177230a(IPickerImageLoader iPickerImageLoader) {
        if (iPickerImageLoader != null) {
            f113225a = iPickerImageLoader;
        }
    }

    /* renamed from: b */
    public static void m177231b(Bundle bundle) {
        if (f113225a == null && bundle != null) {
            f113225a = (IPickerImageLoader) bundle.getParcelable("mediaPickerImageLoader");
        }
    }

    /* renamed from: a */
    public static void m177227a(Context context, String str, ImageView imageView, LoadOption loadOption) {
        m177228a(context, str, imageView, loadOption, (AbstractC44676a<Drawable>) null);
    }

    /* renamed from: a */
    public static void m177226a(Context context, String str, View view, LoadOption loadOption, AbstractC44676a<Bitmap> aVar) {
        if (f113225a == null) {
            Log.m165383e("MediaPicker", "imageLoader not init");
        } else if (!C44742a.m177481b(context)) {
            Log.m165382e("activity is not running: " + context);
        } else if (context == null || str == null || view == null) {
            Log.m165382e("context,path,image must not be null, " + context + str + view);
        } else {
            f113225a.mo158256a(context, str, view, loadOption, aVar);
        }
    }

    /* renamed from: a */
    public static void m177228a(Context context, String str, ImageView imageView, LoadOption loadOption, AbstractC44676a<Drawable> aVar) {
        if (f113225a == null) {
            Log.m165383e("MediaPicker", "imageLoader not init");
        } else if (!C44742a.m177481b(context)) {
            Log.m165382e("activity is not running: " + context);
        } else if (context == null || str == null || imageView == null) {
            Log.m165382e("context,path,image must not be null, " + context + str + imageView);
        } else {
            f113225a.mo158257a(context, str, imageView, loadOption, aVar);
        }
    }
}
