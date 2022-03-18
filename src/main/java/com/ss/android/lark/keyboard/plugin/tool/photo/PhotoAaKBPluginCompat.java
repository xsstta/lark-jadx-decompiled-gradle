package com.ss.android.lark.keyboard.plugin.tool.photo;

import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.plugin.tool.aa.AaStyleKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoAaKBPluginCompat;", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$OnPhotoInsertListener;", "keyboard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "(Lcom/ss/android/lark/keyboard/KeyBoard;)V", "clearStyleBeforeSend", "", "onImageInsert", "image", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "onPhotoInsert", "photos", "", "Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.a */
public final class PhotoAaKBPluginCompat implements PhotoKBPlugin.OnPhotoInsertListener {

    /* renamed from: a */
    private final KeyBoard f104311a;

    /* renamed from: a */
    private final void m162502a() {
        AaStyleKBPlugin aVar = (AaStyleKBPlugin) this.f104311a.mo146819c("aa_editor");
        if (aVar != null) {
            aVar.mo147310n();
        }
    }

    public PhotoAaKBPluginCompat(KeyBoard fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "keyboard");
        this.f104311a = fVar;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin.OnPhotoInsertListener
    /* renamed from: a */
    public void mo147795a(IPhotoDependency.Image image) {
        Intrinsics.checkParameterIsNotNull(image, "image");
        m162502a();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin.OnPhotoInsertListener
    /* renamed from: a */
    public void mo147796a(List<Photo> list) {
        Intrinsics.checkParameterIsNotNull(list, "photos");
        m162502a();
    }
}
