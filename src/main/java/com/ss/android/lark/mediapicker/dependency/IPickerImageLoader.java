package com.ss.android.lark.mediapicker.dependency;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import com.ss.android.lark.mediapicker.dependency.C44675a;

public interface IPickerImageLoader extends Parcelable {
    /* renamed from: a */
    void mo158256a(Context context, String str, View view, LoadOption loadOption, C44675a.AbstractC44676a<Bitmap> aVar);

    /* renamed from: a */
    void mo158257a(Context context, String str, ImageView imageView, LoadOption loadOption, C44675a.AbstractC44676a<Drawable> aVar);
}
