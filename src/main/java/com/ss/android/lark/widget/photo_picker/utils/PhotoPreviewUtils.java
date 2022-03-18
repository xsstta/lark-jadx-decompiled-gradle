package com.ss.android.lark.widget.photo_picker.utils;

import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0007J$\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/utils/PhotoPreviewUtils;", "", "()V", "EDIT_ACTION_INDEX", "", "addEditAction", "", "menuList", "", "Lcom/ss/android/lark/widget/photo_picker/gallery/function/action/IFuncAction;", "editAction", "isShowEditBtn", "", "photoItem", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "resource", "Ljava/io/File;", "enable", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker.f.g */
public final class PhotoPreviewUtils {

    /* renamed from: a */
    public static final PhotoPreviewUtils f144864a = new PhotoPreviewUtils();

    private PhotoPreviewUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m227506a(List<AbstractC58768d> list, AbstractC58768d dVar) {
        Intrinsics.checkParameterIsNotNull(list, "menuList");
        Intrinsics.checkParameterIsNotNull(dVar, "editAction");
        if (list.size() <= 3) {
            list.add(dVar);
        } else {
            list.add(3, dVar);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m227507a(PhotoItem photoItem, File file, boolean z) {
        MessageIdentity messageIdentity;
        if (photoItem == null || file == null || !z || (((messageIdentity = photoItem.getMessageIdentity()) != null && messageIdentity.isHideEditor()) || photoItem.isVideo() || ImageUtils.m224131a(file) == ImageUtils.ImageType.TYPE_GIF || photoItem.getType() == 4)) {
            return false;
        }
        return true;
    }
}
