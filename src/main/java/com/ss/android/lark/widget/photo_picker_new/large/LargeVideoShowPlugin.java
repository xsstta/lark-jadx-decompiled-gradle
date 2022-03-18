package com.ss.android.lark.widget.photo_picker_new.large;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.gallery.C58746e;
import com.ss.android.lark.widget.photo_picker_impl.view.large.LargeShowPlugin;
import com.ss.android.lark.widget.photo_picker_new.SelectablePhoto;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_new/large/LargeVideoShowPlugin;", "Lcom/ss/android/lark/widget/photo_picker_impl/view/large/LargeShowPlugin;", "Lcom/ss/android/lark/widget/photo_picker_new/SelectablePhoto;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "fragment", "Lcom/ss/android/lark/widget/photo_picker/gallery/VideoGalleryFragment;", "photo", "bind", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getFragment", "Landroidx/fragment/app/Fragment;", "refresh", "transform", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "selectablePhoto", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.d.b.d */
public final class LargeVideoShowPlugin extends LargeShowPlugin<SelectablePhoto> {

    /* renamed from: a */
    private SelectablePhoto f143694a;

    /* renamed from: b */
    private C58746e f143695b;

    /* renamed from: c */
    private final Context f143696c;

    @Override // com.ss.android.lark.widget.photo_picker_impl.view.large.LargeShowPlugin
    /* renamed from: a */
    public Fragment mo197688a() {
        C58746e a = C58746e.m227922a(ImageLoader.with(this.f143696c), m226379c(this.f143694a));
        this.f143695b = a;
        if (a != null) {
            return a;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
    }

    /* renamed from: a */
    public void mo197690a(SelectablePhoto fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f143694a = fVar;
    }

    public LargeVideoShowPlugin(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f143696c = context;
    }

    /* renamed from: b */
    public void mo197692b(SelectablePhoto fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        C58746e eVar = this.f143695b;
        if (eVar == null) {
            Intrinsics.throwNpe();
        }
        eVar.mo198635a(m226379c(fVar));
    }

    /* renamed from: c */
    private final PhotoItem m226379c(SelectablePhoto fVar) {
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
        return photoItem;
    }
}
