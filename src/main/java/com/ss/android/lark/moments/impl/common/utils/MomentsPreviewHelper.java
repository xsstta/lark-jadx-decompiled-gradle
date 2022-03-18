package com.ss.android.lark.moments.impl.common.utils;

import android.app.Activity;
import android.view.View;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.entity.media.MediaExtra;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.lark.widget.photo_picker.animation.BaseData;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ.\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006J6\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000e2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006J.\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/utils/MomentsPreviewHelper;", "", "()V", "getPhotoItemList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "Lkotlin/collections/ArrayList;", "path", "", "goPhotoPickPage", "", "activity", "Landroid/app/Activity;", "maxCount", "", "totalMaxCount", "goPreviewCategoryAvatar", "view", "Landroid/view/View;", "photos", "goPreviewPhotoPage", "v", "index", "goPreviewVideoPage", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.utils.e */
public final class MomentsPreviewHelper {

    /* renamed from: a */
    public static final MomentsPreviewHelper f119251a = new MomentsPreviewHelper();

    private MomentsPreviewHelper() {
    }

    /* renamed from: a */
    public final ArrayList<PhotoItem> mo166204a(String str) {
        if (str == null) {
            return new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        MediaExtra mediaExtra = new MediaExtra();
        mediaExtra.setFilePath(str);
        PhotoItem type = new PhotoItem().setPaths(arrayList).setMediaExtra(mediaExtra).setMessageIdentity(new MessageIdentity("", "")).setMessageId("").setType(2);
        ArrayList<PhotoItem> arrayList2 = new ArrayList<>();
        arrayList2.add(type);
        return arrayList2;
    }

    /* renamed from: b */
    public final void mo166208b(Activity activity, View view, ArrayList<PhotoItem> arrayList) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(arrayList, "photos");
        C58630d.m227364a().mo198658a(view).mo198667a(arrayList).mo198661a(BaseData.AnimationType.TRANSLATE_ANIMATION).mo198673b(false).mo198674c(false).mo198675d(false).mo198676e(false).mo198678g(false).mo198679h(false).mo198666a("").mo198677f(false).mo198683l(false).mo198668a(true).mo198659a(Biz.Moments).mo198660a(Scene.Moments).mo198672b(5).mo198669a(activity);
    }

    /* renamed from: a */
    public final void mo166205a(Activity activity, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        new C58557a.C58559a().mo198526i(false).mo198524g(true).mo198506a(i).mo198513b(i2).mo198532o(false).mo198525h(false).mo198529l(true).mo198528k(false).mo198533p(false).mo198531n(true).mo198527j(true).mo198521e(true).mo198523f(true).mo198522f(3).mo198510a(activity, 233);
    }

    /* renamed from: a */
    public final void mo166207a(Activity activity, View view, ArrayList<PhotoItem> arrayList) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(arrayList, "photos");
        C58630d.m227364a().mo198658a(view).mo198667a(arrayList).mo198657a(0).mo198673b(false).mo198674c(false).mo198675d(false).mo198676e(false).mo198678g(false).mo198661a(BaseData.AnimationType.TRANSLATE_ANIMATION).mo198683l(false).mo198668a(true).mo198659a(Biz.Moments).mo198660a(Scene.Moments).mo198672b(4).mo198669a(activity);
    }

    /* renamed from: a */
    public final void mo166206a(Activity activity, View view, int i, ArrayList<PhotoItem> arrayList) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(view, "v");
        Intrinsics.checkParameterIsNotNull(arrayList, "photos");
        C58630d.m227364a().mo198658a(view).mo198667a(arrayList).mo198657a(i).mo198681j(true).mo198682k(true).mo198661a(BaseData.AnimationType.TRANSLATE_ANIMATION).mo198673b(false).mo198674c(false).mo198675d(false).mo198676e(false).mo198678g(false).mo198679h(false).mo198666a("").mo198677f(false).mo198683l(false).mo198684m(true).mo198668a(true).mo198659a(Biz.Moments).mo198660a(Scene.Moments).mo198672b(1).mo198669a(activity);
    }
}
