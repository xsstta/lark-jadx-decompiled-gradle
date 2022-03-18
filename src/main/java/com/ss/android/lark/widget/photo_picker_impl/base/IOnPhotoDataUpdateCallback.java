package com.ss.android.lark.widget.photo_picker_impl.base;

import com.ss.android.lark.widget.photo_picker_impl.bean.Photo;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J&\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/base/IOnPhotoDataUpdateCallback;", "T", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "", "onUpdatePhotos", "", "photos", "", "append", "", "updateAll", "", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker_impl.a.d */
public interface IOnPhotoDataUpdateCallback<T extends Photo> {
    /* renamed from: a */
    void mo199565a(List<T> list, int i, boolean z);
}
