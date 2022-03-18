package com.ss.android.lark.widget.photo_picker_impl.view.base;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.widget.photo_picker_impl.base.IPlugin;
import com.ss.android.lark.widget.photo_picker_impl.bean.Photo;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0015\u0010\b\u001a\u00028\u00012\u0006\u0010\t\u001a\u00020\u0007H&¢\u0006\u0002\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/view/base/IShowPluginFactory;", "DATA", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "PLUGIN", "Lcom/ss/android/lark/widget/photo_picker_impl/base/IPlugin;", "", "getColumnCount", "", "getPlugin", ShareHitPoint.f121869d, "(I)Lcom/ss/android/lark/widget/photo_picker_impl/base/IPlugin;", "getType", "position", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(ILcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;)I", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.a.b */
public interface IShowPluginFactory<DATA extends Photo, PLUGIN extends IPlugin<DATA>> {
    /* renamed from: a */
    int mo197709a();

    /* renamed from: a */
    int mo197711a(int i, DATA data);

    /* renamed from: a */
    PLUGIN mo197712a(int i);
}
