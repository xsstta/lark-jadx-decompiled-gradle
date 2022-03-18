package com.ss.android.lark.dependency;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.basic.v1.RichTextElement;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.dto.p1813b.C36865a;
import com.ss.android.lark.dto.p1813b.C36866b;
import com.ss.android.lark.image.entity.Image;
import io.reactivex.Observable;
import java.io.File;
import okio.ByteString;

/* renamed from: com.ss.android.lark.dependency.x */
public interface AbstractC36509x {
    /* renamed from: a */
    Image mo134731a(com.bytedance.lark.pb.basic.v1.Image image);

    /* renamed from: a */
    Image mo134732a(ImageSet imageSet);

    /* renamed from: a */
    Observable<C36865a> mo134733a(Context context, String str, boolean z, boolean z2, AbstractC25974h hVar, Biz biz, Scene scene);

    /* renamed from: a */
    String mo134734a(RichTextElement.ImageProperty imageProperty);

    /* renamed from: a */
    void mo134735a(Context context, ImageView imageView, Image image, Drawable drawable, Drawable drawable2, int i, int i2, boolean z, ImageView.ScaleType scaleType, boolean z2, boolean z3, ListenerParams.FromType fromType);

    /* renamed from: a */
    void mo134736a(Context context, File file, boolean z, IGetDataCallback<C36866b> iGetDataCallback);

    /* renamed from: a */
    void mo134737a(Context context, String str, Object obj, int i, int i2, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo134738a(Context context, String str, boolean z, boolean z2, AbstractC25974h hVar, IGetDataCallback<C36865a> iGetDataCallback);

    /* renamed from: b */
    Image mo134739b(ImageSet imageSet);

    /* renamed from: b */
    String mo134740b(RichTextElement.ImageProperty imageProperty);

    /* renamed from: c */
    ByteString mo134741c(ImageSet imageSet);
}
