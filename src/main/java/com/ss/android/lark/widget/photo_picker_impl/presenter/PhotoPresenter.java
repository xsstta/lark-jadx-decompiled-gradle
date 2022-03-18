package com.ss.android.lark.widget.photo_picker_impl.presenter;

import android.content.Intent;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.widget.photo_picker_impl.base.IOnInfoUpdateCallback;
import com.ss.android.lark.widget.photo_picker_impl.base.IOnPhotoDataUpdateCallback;
import com.ss.android.lark.widget.photo_picker_impl.bean.Photo;
import com.ss.android.lark.widget.photo_picker_impl.bean.PhotoDir;
import com.ss.android.lark.widget.photo_picker_impl.model.IPhotoModel;
import com.ss.android.lark.widget.photo_picker_impl.view.PhotoView;
import com.ss.android.lark.widget.photo_picker_impl.view.base.Component;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\nJ\u0006\u0010\u0013\u001a\u00020\nJ\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\nR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/presenter/PhotoPresenter;", "DATA", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "", "mView", "Lcom/ss/android/lark/widget/photo_picker_impl/view/PhotoView;", "mModel", "Lcom/ss/android/lark/widget/photo_picker_impl/model/IPhotoModel;", "(Lcom/ss/android/lark/widget/photo_picker_impl/view/PhotoView;Lcom/ss/android/lark/widget/photo_picker_impl/model/IPhotoModel;)V", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "", "onDestroy", "onResume", "onSaveInstanceState", "outState", "Landroid/os/Bundle;", "onStop", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker_impl.c.a */
public final class PhotoPresenter<DATA extends Photo> {

    /* renamed from: a */
    public final PhotoView<DATA> f145749a;

    /* renamed from: b */
    public final IPhotoModel<DATA> f145750b;

    /* renamed from: b */
    public final boolean mo199624b() {
        return this.f145749a.mo199632b();
    }

    /* renamed from: a */
    public final void mo199622a() {
        this.f145749a.mo199633c();
        this.f145750b.mo199752d();
    }

    public PhotoPresenter(PhotoView<DATA> aVar, IPhotoModel<DATA> cVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "mView");
        Intrinsics.checkParameterIsNotNull(cVar, "mModel");
        this.f145749a = aVar;
        this.f145750b = cVar;
        aVar.mo199629a(new Component.IDataLoadNotify(this) {
            /* class com.ss.android.lark.widget.photo_picker_impl.presenter.PhotoPresenter.C588891 */

            /* renamed from: a */
            final /* synthetic */ PhotoPresenter f145751a;

            @Override // com.ss.android.lark.widget.photo_picker_impl.view.base.Component.IDataLoadNotify
            /* renamed from: a */
            public void mo199625a() {
                this.f145751a.f145750b.mo199751c();
            }

            @Override // com.ss.android.lark.widget.photo_picker_impl.view.base.Component.IDataLoadNotify
            /* renamed from: b */
            public void mo199626b() {
                this.f145751a.f145750b.mo199750b();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f145751a = r1;
            }
        });
        cVar.mo199748a(new IOnInfoUpdateCallback(this) {
            /* class com.ss.android.lark.widget.photo_picker_impl.presenter.PhotoPresenter.C588902 */

            /* renamed from: a */
            final /* synthetic */ PhotoPresenter f145752a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f145752a = r1;
            }

            @Override // com.ss.android.lark.widget.photo_picker_impl.base.IOnInfoUpdateCallback
            /* renamed from: a */
            public void mo199564a(Map<Integer, PhotoDir> map) {
                Intrinsics.checkParameterIsNotNull(map, "photoDirs");
                this.f145752a.f145749a.mo199631a(map);
            }
        });
        cVar.mo199749a(new IOnPhotoDataUpdateCallback<DATA>(this) {
            /* class com.ss.android.lark.widget.photo_picker_impl.presenter.PhotoPresenter.C588913 */

            /* renamed from: a */
            final /* synthetic */ PhotoPresenter f145753a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f145753a = r1;
            }

            @Override // com.ss.android.lark.widget.photo_picker_impl.base.IOnPhotoDataUpdateCallback
            /* renamed from: a */
            public void mo199565a(List<DATA> list, int i, boolean z) {
                Intrinsics.checkParameterIsNotNull(list, "photos");
                this.f145753a.f145749a.mo199630a(list, i, z);
            }
        });
        aVar.mo199627a();
        cVar.mo199746a();
    }

    /* renamed from: a */
    public final void mo199623a(int i, int i2, Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f145749a.mo199628a(i, i2, intent);
        this.f145750b.mo199747a(i, i2, intent);
    }
}
