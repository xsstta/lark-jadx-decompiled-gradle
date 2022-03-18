package com.ss.android.lark.integrator.todo.dependency;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.basic.v1.RichTextElement;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.core.api.EncryptImageData;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.todo.dependency.p2789a.AbstractC56256k;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.UIHelper;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J2\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002JB\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0012\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J@\u0010\u001e\u001a\u00020\u001f2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010 \u001a\u0004\u0018\u00010\r2\b\u0010!\u001a\u0004\u0018\u00010\r2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0010H\u0016J:\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\r2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006/"}, d2 = {"Lcom/ss/android/lark/integrator/todo/dependency/TodoImage;", "Lcom/ss/android/lark/todo/dependency/idependency/IImageDependency;", "()V", "coreApi", "Lcom/ss/android/lark/biz/core/api/ICoreApi;", "kotlin.jvm.PlatformType", "getCoreApi", "()Lcom/ss/android/lark/biz/core/api/ICoreApi;", "getBitmapFromImageKey", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "imageKey", "", "id", "targetWidth", "", "targetHeight", "getBitmapListFromImageKeyList", "", "imageKeys", "ids", "getMiddleKeyFromPb", "pbProperty", "Lcom/bytedance/lark/pb/basic/v1/RichTextElement$ImageProperty;", "getThumbnailFromPb", "Lcom/ss/android/lark/image/entity/Image;", "pbImageSet", "Lcom/bytedance/lark/pb/basic/v1/ImageSet;", "getThumbnailKeyFromPb", "loadImage", "", "avatarKey", "entityId", "imageView", "Landroid/widget/ImageView;", "imageWidth", "imageHeight", "uploadEncryptImageV2", "Lio/reactivex/Observable;", "Lcom/ss/android/lark/biz/core/api/EncryptImageData;", "photoPath", "keepOrigin", "", "isPost", "progressListener", "Lcom/larksuite/framework/callback/OnUpdateProgressListener;", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.todo.a.k */
public final class TodoImage implements AbstractC56256k {

    /* renamed from: a */
    private final ICoreApi f101798a = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

    @Override // com.ss.android.lark.todo.dependency.p2789a.AbstractC56256k
    /* renamed from: a */
    public Image mo145387a(ImageSet imageSet) {
        Image thumbnailFromPb = this.f101798a.getThumbnailFromPb(imageSet);
        Intrinsics.checkExpressionValueIsNotNull(thumbnailFromPb, "coreApi.getThumbnailFromPb(pbImageSet)");
        return thumbnailFromPb;
    }

    @Override // com.ss.android.lark.todo.dependency.p2789a.AbstractC56256k
    /* renamed from: b */
    public String mo145393b(RichTextElement.ImageProperty imageProperty) {
        String middleKeyFromPb = this.f101798a.getMiddleKeyFromPb(imageProperty);
        Intrinsics.checkExpressionValueIsNotNull(middleKeyFromPb, "coreApi.getMiddleKeyFromPb(pbProperty)");
        return middleKeyFromPb;
    }

    @Override // com.ss.android.lark.todo.dependency.p2789a.AbstractC56256k
    /* renamed from: a */
    public String mo145390a(RichTextElement.ImageProperty imageProperty) {
        String thumbnailKeyFromPb = this.f101798a.getThumbnailKeyFromPb(imageProperty);
        Intrinsics.checkExpressionValueIsNotNull(thumbnailKeyFromPb, "coreApi.getThumbnailKeyFromPb(pbProperty)");
        return thumbnailKeyFromPb;
    }

    @Override // com.ss.android.lark.todo.dependency.p2789a.AbstractC56256k
    /* renamed from: a */
    public /* synthetic */ Observable mo145388a(Context context, String str, Boolean bool, Boolean bool2, AbstractC25974h hVar) {
        return mo145389a(context, str, bool.booleanValue(), bool2.booleanValue(), hVar);
    }

    /* renamed from: a */
    private final Bitmap m158747a(Context context, String str, String str2, int i, int i2) {
        IRequestCreator load = ImageLoader.with(context).load(AvatarImage.Builder.obtain(str, str2, i, i2).build());
        Intrinsics.checkExpressionValueIsNotNull(load, "ImageLoader.with(context).load(avatarImage)");
        return load.asBitmap().centerCrop().error(R.drawable.kb_avatar_bg).getBitmap(i, i2);
    }

    /* renamed from: a */
    public Observable<EncryptImageData> mo145389a(Context context, String str, boolean z, boolean z2, AbstractC25974h hVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Observable<EncryptImageData> uploadEncryptImageV2 = this.f101798a.uploadEncryptImageV2(context, str, z, z2, hVar, Biz.Todo, Scene.TodoComment);
        Intrinsics.checkExpressionValueIsNotNull(uploadEncryptImageV2, "coreApi.uploadEncryptIma… Todo, Scene.TodoComment)");
        return uploadEncryptImageV2;
    }

    @Override // com.ss.android.lark.todo.dependency.p2789a.AbstractC56256k
    /* renamed from: a */
    public List<Bitmap> mo145391a(Context context, List<String> list, List<String> list2, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(list, "imageKeys");
        Intrinsics.checkParameterIsNotNull(list2, "ids");
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Bitmap a = m158747a(context, list.get(i3), list2.get(i3), i, i2);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.todo.dependency.p2789a.AbstractC56256k
    /* renamed from: a */
    public void mo145392a(Context context, String str, String str2, ImageView imageView, int i, int i2) {
        this.f101798a.loadAvatarImage(context, imageView, str, str2, new LoadParams().mo105413a(UIHelper.dp2px((float) i)).mo105422b(UIHelper.dp2px((float) i2)));
    }
}
