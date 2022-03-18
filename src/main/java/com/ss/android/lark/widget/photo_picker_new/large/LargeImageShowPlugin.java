package com.ss.android.lark.widget.photo_picker_new.large;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.gallery.C58732b;
import com.ss.android.lark.widget.photo_picker.gallery.C58734c;
import com.ss.android.lark.widget.photo_picker_impl.view.large.LargeShowPlugin;
import com.ss.android.lark.widget.photo_picker_new.SelectablePhoto;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_new/large/LargeImageShowPlugin;", "Lcom/ss/android/lark/widget/photo_picker_impl/view/large/LargeShowPlugin;", "Lcom/ss/android/lark/widget/photo_picker_new/SelectablePhoto;", "context", "Landroid/content/Context;", "isSecret", "", "onItemClickListener", "Lcom/ss/android/lark/widget/photo_picker/gallery/GalleryPagerAdapter$OnItemClickListener;", "(Landroid/content/Context;ZLcom/ss/android/lark/widget/photo_picker/gallery/GalleryPagerAdapter$OnItemClickListener;)V", "galleryFragment", "Lcom/ss/android/lark/widget/photo_picker/gallery/ImageGalleryFragment;", "photo", "showPath", "", "bind", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getFragment", "Landroidx/fragment/app/Fragment;", "refresh", "transform", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "selectablePhoto", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.d.b.b */
public final class LargeImageShowPlugin extends LargeShowPlugin<SelectablePhoto> {

    /* renamed from: a */
    private C58734c f143678a;

    /* renamed from: b */
    private SelectablePhoto f143679b;

    /* renamed from: c */
    private String f143680c = "";

    /* renamed from: d */
    private final Context f143681d;

    /* renamed from: e */
    private final boolean f143682e;

    /* renamed from: f */
    private final C58732b.AbstractC58733a f143683f;

    @Override // com.ss.android.lark.widget.photo_picker_impl.view.large.LargeShowPlugin
    /* renamed from: a */
    public Fragment mo197688a() {
        C58734c a = C58734c.m227863a(ImageLoader.with(this.f143681d), m226363c(this.f143679b), this.f143682e, true, this.f143683f);
        this.f143678a = a;
        if (a != null) {
            return a;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
    }

    /* renamed from: a */
    public void mo197690a(SelectablePhoto fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f143679b = fVar;
        this.f143680c = fVar.mo199595b();
    }

    /* renamed from: b */
    public void mo197692b(SelectablePhoto fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (!TextUtils.equals(fVar.mo199595b(), this.f143680c)) {
            C58734c cVar = this.f143678a;
            if (cVar == null) {
                Intrinsics.throwNpe();
            }
            cVar.mo198635a(m226363c(fVar));
        }
        this.f143680c = fVar.mo199595b();
    }

    /* renamed from: c */
    private final PhotoItem m226363c(SelectablePhoto fVar) {
        PhotoItem photoItem = new PhotoItem();
        Photo photo = new Photo();
        if (fVar == null) {
            Intrinsics.throwNpe();
        }
        photo.setPath(fVar.mo199595b());
        Integer a = fVar.mo199589a();
        if (a == null) {
            Intrinsics.throwNpe();
        }
        photo.setId(a.intValue());
        photoItem.setPhoto(photo);
        photoItem.setPaths(CollectionsKt.listOf(fVar.mo199595b()));
        photoItem.setWidth(fVar.mo199602d());
        photoItem.setHeight(fVar.mo199603e());
        return photoItem;
    }

    public LargeImageShowPlugin(Context context, boolean z, C58732b.AbstractC58733a aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "onItemClickListener");
        this.f143681d = context;
        this.f143682e = z;
        this.f143683f = aVar;
    }
}
