package com.ss.android.lark.widget.photo_picker_impl.view.large;

import androidx.fragment.app.Fragment;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.widget.photo_picker_impl.base.IPlugin;
import com.ss.android.lark.widget.photo_picker_impl.bean.Photo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH&J\u0006\u0010\r\u001a\u00020\u0006J\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\nJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0006R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/view/large/LargeShowPlugin;", "DATA", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "Lcom/ss/android/lark/widget/photo_picker_impl/base/IPlugin;", "()V", "mContext", "Lcom/ss/android/lark/widget/photo_picker_impl/view/large/LargeShowPlugin$ILargeShowPluginContext;", "bind", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;)V", "getFragment", "Landroidx/fragment/app/Fragment;", "getLargeShowPluginContext", "refresh", "setContext", "context", "ILargeShowPluginContext", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.c.b */
public abstract class LargeShowPlugin<DATA extends Photo> implements IPlugin<DATA> {

    /* renamed from: a */
    private ILargeShowPluginContext f145814a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/view/large/LargeShowPlugin$ILargeShowPluginContext;", "", "finish", "", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.c.b$a */
    public interface ILargeShowPluginContext {
    }

    /* renamed from: a */
    public abstract Fragment mo197688a();

    /* renamed from: a */
    public abstract void mo197690a(DATA data);

    /* renamed from: b */
    public abstract void mo197692b(DATA data);

    /* renamed from: a */
    public final void mo199678a(ILargeShowPluginContext aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "context");
        this.f145814a = aVar;
    }
}
