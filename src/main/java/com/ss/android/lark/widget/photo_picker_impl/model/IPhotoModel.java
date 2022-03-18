package com.ss.android.lark.widget.photo_picker_impl.model;

import android.content.Intent;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.widget.photo_picker_impl.base.IOnInfoUpdateCallback;
import com.ss.android.lark.widget.photo_picker_impl.base.IOnPhotoDataUpdateCallback;
import com.ss.android.lark.widget.photo_picker_impl.bean.Photo;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&J \u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0016\u0010\u0012\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/model/IPhotoModel;", "DATA", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "", "create", "", "loadMore", "loadPre", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onDestroy", "setInfoUpdateCallback", "callBack", "Lcom/ss/android/lark/widget/photo_picker_impl/base/IOnInfoUpdateCallback;", "setPhotoDataUpdateCallback", "Lcom/ss/android/lark/widget/photo_picker_impl/base/IOnPhotoDataUpdateCallback;", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker_impl.model.c */
public interface IPhotoModel<DATA extends Photo> {
    /* renamed from: a */
    void mo199746a();

    /* renamed from: a */
    void mo199747a(int i, int i2, Intent intent);

    /* renamed from: a */
    void mo199748a(IOnInfoUpdateCallback cVar);

    /* renamed from: a */
    void mo199749a(IOnPhotoDataUpdateCallback<DATA> dVar);

    /* renamed from: b */
    void mo199750b();

    /* renamed from: c */
    void mo199751c();

    /* renamed from: d */
    void mo199752d();
}
