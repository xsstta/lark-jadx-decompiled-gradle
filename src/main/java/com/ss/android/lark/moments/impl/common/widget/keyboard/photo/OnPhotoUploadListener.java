package com.ss.android.lark.moments.impl.common.widget.keyboard.photo;

import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u001e\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u0003H&J\u0016\u0010\u000e\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H&J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u0003H&¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/keyboard/photo/OnPhotoUploadListener;", "", "cameraCanRecordVideo", "", "getLeftMaxCount", "", "hasImage", "hasVideo", "onPhotoEnableToUpload", "", "orderPhotos", "", "Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "isKeepOriginPhoto", "onUploadError", "paths", "", "", "onUploadSuccess", "image", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.c.c */
public interface OnPhotoUploadListener {
    /* renamed from: a */
    int mo166343a();

    /* renamed from: a */
    void mo166344a(IPhotoDependency.Image image, boolean z);

    /* renamed from: a */
    void mo166345a(List<String> list);

    /* renamed from: a */
    void mo166346a(List<Photo> list, boolean z);

    /* renamed from: b */
    boolean mo166347b();

    /* renamed from: c */
    boolean mo166348c();

    /* renamed from: d */
    boolean mo166349d();
}
