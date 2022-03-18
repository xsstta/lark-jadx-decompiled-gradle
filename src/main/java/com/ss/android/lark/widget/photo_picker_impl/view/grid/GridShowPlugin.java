package com.ss.android.lark.widget.photo_picker_impl.view.grid;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.widget.photo_picker_impl.base.IPlugin;
import com.ss.android.lark.widget.photo_picker_impl.bean.Photo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000bJ\u0015\u0010\r\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00020\u000fH&¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/view/grid/GridShowPlugin;", "DATA", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/ss/android/lark/widget/photo_picker_impl/base/IPlugin;", "()V", "doBind", "", "viewHolder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;)V", "onBindViewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.b.c */
public abstract class GridShowPlugin<DATA extends Photo, VH extends RecyclerView.ViewHolder> implements IPlugin<DATA> {
    /* renamed from: a */
    public abstract VH mo197646a(ViewGroup viewGroup);

    /* renamed from: a */
    public abstract void mo197647a(VH vh, DATA data);

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.recyclerview.widget.RecyclerView$ViewHolder */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final void mo199658b(RecyclerView.ViewHolder viewHolder, DATA data) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "viewHolder");
        Intrinsics.checkParameterIsNotNull(data, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        mo197647a(viewHolder, data);
    }
}
