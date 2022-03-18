package com.ss.android.lark.moments.dependency.idependency;

import android.content.Context;
import com.larksuite.framework.callback.AbstractC25974h;
import com.ss.android.lark.chat.entity.image.ImageSet;
import io.reactivex.Observable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J:\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/moments/dependency/idependency/IImageDependency;", "", "parseImageSetFromPb", "Lcom/ss/android/lark/chat/entity/image/ImageSet;", "imageSet", "Lcom/bytedance/lark/pb/basic/v1/ImageSet;", "uploadEncryptImageV2", "Lio/reactivex/Observable;", "Lcom/ss/android/lark/moments/dependency/idependency/EncryptImageData;", "context", "Landroid/content/Context;", "photoPath", "", "keepOrigin", "", "isPost", "progressListener", "Lcom/larksuite/framework/callback/OnUpdateProgressListener;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.b.a.l */
public interface IImageDependency {
    /* renamed from: a */
    ImageSet mo144713a(com.bytedance.lark.pb.basic.v1.ImageSet imageSet);

    /* renamed from: a */
    Observable<EncryptImageData> mo144714a(Context context, String str, boolean z, boolean z2, AbstractC25974h hVar);

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.b.a.l$a */
    public static final class C47179a {
        /* renamed from: a */
        public static /* synthetic */ Observable m186950a(IImageDependency lVar, Context context, String str, boolean z, boolean z2, AbstractC25974h hVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 16) != 0) {
                    hVar = null;
                }
                return lVar.mo144714a(context, str, z, z2, hVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadEncryptImageV2");
        }
    }
}
