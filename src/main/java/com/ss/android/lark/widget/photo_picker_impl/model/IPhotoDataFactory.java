package com.ss.android.lark.widget.photo_picker_impl.model;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.widget.photo_picker_impl.bean.Photo;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\r\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0005J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/model/IPhotoDataFactory;", "T", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "", "newPhoto", "()Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "process", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker_impl.model.b */
public interface IPhotoDataFactory<T extends Photo> {
    /* renamed from: a */
    T mo197705a();

    /* renamed from: a */
    List<T> mo197706a(List<T> list);
}
