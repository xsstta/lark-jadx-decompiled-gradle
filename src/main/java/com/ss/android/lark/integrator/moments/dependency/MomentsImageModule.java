package com.ss.android.lark.integrator.moments.dependency;

import android.content.Context;
import com.larksuite.framework.callback.AbstractC25974h;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.moments.dependency.idependency.EncryptImageData;
import com.ss.android.lark.moments.dependency.idependency.IImageDependency;
import com.ss.android.lark.utils.ApiUtils;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J8\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/integrator/moments/dependency/MomentsImageModule;", "Lcom/ss/android/lark/moments/dependency/idependency/IImageDependency;", "()V", "parseImageSetFromPb", "Lcom/ss/android/lark/chat/entity/image/ImageSet;", "pbImageSet", "Lcom/bytedance/lark/pb/basic/v1/ImageSet;", "uploadEncryptImageV2", "Lio/reactivex/Observable;", "Lcom/ss/android/lark/moments/dependency/idependency/EncryptImageData;", "context", "Landroid/content/Context;", "photoPath", "", "keepOrigin", "", "isPost", "progressListener", "Lcom/larksuite/framework/callback/OnUpdateProgressListener;", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.moments.a.j */
public final class MomentsImageModule implements IImageDependency {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/moments/dependency/idependency/EncryptImageData;", "it", "Lcom/ss/android/lark/biz/core/api/EncryptImageData;", "apply"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.moments.a.j$a */
    static final class C39899a<T, R> implements Function<T, R> {

        /* renamed from: a */
        public static final C39899a f101582a = new C39899a();

        C39899a() {
        }

        /* renamed from: a */
        public final EncryptImageData apply(com.ss.android.lark.biz.core.api.EncryptImageData encryptImageData) {
            Intrinsics.checkParameterIsNotNull(encryptImageData, "it");
            return new EncryptImageData(encryptImageData.f73837a, encryptImageData.f73838b);
        }
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IImageDependency
    /* renamed from: a */
    public ImageSet mo144713a(com.bytedance.lark.pb.basic.v1.ImageSet imageSet) {
        Intrinsics.checkParameterIsNotNull(imageSet, "pbImageSet");
        ImageSet imageSet2 = new ImageSet();
        imageSet2.setKey(imageSet.key);
        imageSet2.setOrigin(((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getImage(imageSet.origin));
        imageSet2.setThumbnail(((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getThumbnailFromPb(imageSet));
        imageSet2.setMiddle(((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getMiddleFromPb(imageSet));
        return imageSet2;
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IImageDependency
    /* renamed from: a */
    public Observable<EncryptImageData> mo144714a(Context context, String str, boolean z, boolean z2, AbstractC25974h hVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "photoPath");
        Observable<R> map = ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).uploadEncryptImageV2(context, str, z, z2, hVar, Biz.Moments, Scene.Moments).map(C39899a.f101582a);
        Intrinsics.checkExpressionValueIsNotNull(map, "ApiUtils.getApi(ICoreApi…, it.token)\n            }");
        return map;
    }
}
