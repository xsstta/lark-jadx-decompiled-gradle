package com.bytedance.ee.android.file.picker.lib.dependency;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

/* renamed from: com.bytedance.ee.android.file.picker.lib.dependency.a */
public class C4044a {

    /* renamed from: a */
    private static IPickerImageLoader f12283a;

    /* renamed from: a */
    public static IPickerImageLoader m16833a() {
        return f12283a;
    }

    /* renamed from: a */
    public static void m16835a(Bundle bundle) {
        IPickerImageLoader iPickerImageLoader;
        if (bundle != null && (iPickerImageLoader = f12283a) != null) {
            bundle.putParcelable("FilePickerImageLoader", iPickerImageLoader);
        }
    }

    /* renamed from: a */
    public static void m16836a(IPickerImageLoader iPickerImageLoader) {
        f12283a = iPickerImageLoader;
    }

    /* renamed from: b */
    public static void m16837b(Bundle bundle) {
        if (f12283a == null && bundle != null) {
            f12283a = (IPickerImageLoader) bundle.getParcelable("FilePickerImageLoader");
        }
    }

    /* renamed from: a */
    public static void m16834a(Context context, Uri uri, ImageView imageView, C4045b bVar) {
        f12283a.mo15865a(context, uri, imageView, bVar);
    }
}
