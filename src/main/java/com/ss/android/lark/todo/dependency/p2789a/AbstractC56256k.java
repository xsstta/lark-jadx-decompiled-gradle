package com.ss.android.lark.todo.dependency.p2789a;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.basic.v1.RichTextElement;
import com.larksuite.framework.callback.AbstractC25974h;
import com.ss.android.lark.biz.core.api.EncryptImageData;
import com.ss.android.lark.image.entity.Image;
import io.reactivex.Observable;
import java.util.List;

/* renamed from: com.ss.android.lark.todo.dependency.a.k */
public interface AbstractC56256k {
    /* renamed from: a */
    Image mo145387a(ImageSet imageSet);

    /* renamed from: a */
    Observable<EncryptImageData> mo145388a(Context context, String str, Boolean bool, Boolean bool2, AbstractC25974h hVar);

    /* renamed from: a */
    String mo145390a(RichTextElement.ImageProperty imageProperty);

    /* renamed from: a */
    List<Bitmap> mo145391a(Context context, List<String> list, List<String> list2, int i, int i2);

    /* renamed from: a */
    void mo145392a(Context context, String str, String str2, ImageView imageView, int i, int i2);

    /* renamed from: b */
    String mo145393b(RichTextElement.ImageProperty imageProperty);
}
