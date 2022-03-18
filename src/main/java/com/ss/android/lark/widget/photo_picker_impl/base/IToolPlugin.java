package com.ss.android.lark.widget.photo_picker_impl.base;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.widget.photo_picker_impl.bean.PhotoDir;
import com.ss.android.lark.widget.photo_picker_impl.bean.TransationData;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH&J\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00150\u0014H&J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u0017H&J\b\u0010\u0018\u001a\u00020\u0010H&J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/base/IToolPlugin;", "DATA", "CONTEXT", "", "getView", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBind", "", "(Ljava/lang/Object;)V", "onBindPhotoDir", "dirInfos", "", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/PhotoDir;", "onResume", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/TransationData;", "onStop", "setContext", "context", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker_impl.a.f */
public interface IToolPlugin<DATA, CONTEXT> {
    /* renamed from: a */
    View mo197631a(ViewGroup viewGroup);

    /* renamed from: a */
    void mo197632a();

    /* renamed from: a */
    void mo197633a(TransationData dVar);

    /* renamed from: a */
    void mo197635a(DATA data);

    /* renamed from: a */
    void mo197637a(Map<Integer, PhotoDir> map);

    /* renamed from: a */
    boolean mo197638a(int i, int i2, Intent intent);

    /* renamed from: b */
    void mo197639b(CONTEXT context);
}
