package com.ss.android.lark.integrator.im.chat.dependency;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.basic.v1.RichTextElement;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.core.api.C29548at;
import com.ss.android.lark.biz.core.api.EncryptImageData;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.dependency.AbstractC36509x;
import com.ss.android.lark.dto.p1813b.C36865a;
import com.ss.android.lark.dto.p1813b.C36866b;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.dependency.AbstractC39572n;
import io.reactivex.Observable;
import java.io.File;
import okio.ByteString;

/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.o */
class C39537o implements AbstractC36509x {
    C39537o() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C36865a m156322a(EncryptImageData encryptImageData) throws Exception {
        return new C36865a(encryptImageData.f73837a, encryptImageData.f73838b);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36509x
    /* renamed from: b */
    public Image mo134739b(ImageSet imageSet) {
        return C39603g.m157159a().getCoreDependency().mo143518b(imageSet);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36509x
    /* renamed from: c */
    public ByteString mo134741c(ImageSet imageSet) {
        return C39603g.m157159a().getCoreDependency().mo143560c(imageSet);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36509x
    /* renamed from: a */
    public Image mo134731a(com.bytedance.lark.pb.basic.v1.Image image) {
        return C39603g.m157159a().getCoreDependency().mo143407a(image);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36509x
    /* renamed from: b */
    public String mo134740b(RichTextElement.ImageProperty imageProperty) {
        return C39603g.m157159a().getCoreDependency().mo143519b(imageProperty);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36509x
    /* renamed from: a */
    public Image mo134732a(ImageSet imageSet) {
        return C39603g.m157159a().getCoreDependency().mo143408a(imageSet);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36509x
    /* renamed from: a */
    public String mo134734a(RichTextElement.ImageProperty imageProperty) {
        return C39603g.m157159a().getCoreDependency().mo143411a(imageProperty);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36509x
    /* renamed from: a */
    public void mo134736a(Context context, File file, boolean z, final IGetDataCallback<C36866b> iGetDataCallback) {
        Scene scene;
        AbstractC39572n coreDependency = C39603g.m157159a().getCoreDependency();
        C395381 r5 = new IGetDataCallback<C29548at>() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39537o.C395381 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(C29548at atVar) {
                C36866b bVar;
                if (atVar != null) {
                    bVar = new C36866b(atVar.mo105606a(), atVar.mo105607b());
                } else {
                    bVar = null;
                }
                iGetDataCallback.onSuccess(bVar);
            }
        };
        Biz biz = Biz.Messenger;
        if (z) {
            scene = Scene.SecretChat;
        } else {
            scene = Scene.Chat;
        }
        coreDependency.mo143436a(context, file, z, r5, biz, scene);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36509x
    /* renamed from: a */
    public void mo134737a(Context context, String str, Object obj, int i, int i2, final IGetDataCallback<String> iGetDataCallback) {
        C39603g.m157159a().getCoreDependency().mo143443a(context, str, obj, i, i2, new IGetDataCallback<File>() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39537o.C395403 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(File file) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(file.getPath());
                }
            }
        });
    }

    @Override // com.ss.android.lark.dependency.AbstractC36509x
    /* renamed from: a */
    public void mo134738a(Context context, String str, boolean z, boolean z2, AbstractC25974h hVar, final IGetDataCallback<C36865a> iGetDataCallback) {
        C39603g.m157159a().getCoreDependency().mo143453a(context, str, z, z2, hVar, new IGetDataCallback<EncryptImageData>() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39537o.C395392 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(EncryptImageData encryptImageData) {
                C36865a aVar;
                if (encryptImageData != null) {
                    aVar = new C36865a(encryptImageData.f73837a, encryptImageData.f73838b);
                } else {
                    aVar = null;
                }
                iGetDataCallback.onSuccess(aVar);
            }
        });
    }

    @Override // com.ss.android.lark.dependency.AbstractC36509x
    /* renamed from: a */
    public Observable<C36865a> mo134733a(Context context, String str, boolean z, boolean z2, AbstractC25974h hVar, Biz biz, Scene scene) {
        return C39603g.m157159a().getCoreDependency().mo143410a(context, str, z, z2, hVar, biz, scene).map($$Lambda$o$VYEBk7WBuiEGk7mS0WjTKqqrqM.INSTANCE);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36509x
    /* renamed from: a */
    public void mo134735a(Context context, ImageView imageView, Image image, Drawable drawable, Drawable drawable2, int i, int i2, boolean z, ImageView.ScaleType scaleType, boolean z2, boolean z3, ListenerParams.FromType fromType) {
        C39603g.m157159a().getCoreDependency().mo143424a(context, imageView, image.getKey(), new LoadParams().mo105414a(drawable).mo105423b(drawable2).mo105413a(i).mo105422b(i2).mo105415a(scaleType).mo105425b(!z3).mo105416a(new ListenerParams.Builder().mo105401a(z).mo105405b(z2).mo105404b(image.getKey()).mo105398a(fromType).mo105402a()));
    }
}
