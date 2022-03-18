package com.ss.android.lark.widget.photo_picker_new.grid;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.photo_picker_impl.view.grid.GridShowPlugin;
import com.ss.android.lark.widget.photo_picker_new.SelectablePhoto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_new/grid/GridCameraShowPlugin;", "Lcom/ss/android/lark/widget/photo_picker_impl/view/grid/GridShowPlugin;", "Lcom/ss/android/lark/widget/photo_picker_new/SelectablePhoto;", "Lcom/ss/android/lark/widget/photo_picker_new/grid/GridCameraShowPlugin$CameraViewHolder;", "onCameraClick", "Lcom/ss/android/lark/widget/photo_picker_new/grid/GridCameraShowPlugin$OnCameraClickListener;", "(Lcom/ss/android/lark/widget/photo_picker_new/grid/GridCameraShowPlugin$OnCameraClickListener;)V", "onBindViewHolder", "", "viewHolder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "CameraViewHolder", "OnCameraClickListener", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.d.a.b */
public final class GridCameraShowPlugin extends GridShowPlugin<SelectablePhoto, CameraViewHolder> {

    /* renamed from: a */
    private final OnCameraClickListener f143627a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_new/grid/GridCameraShowPlugin$OnCameraClickListener;", "Landroid/view/View$OnClickListener;", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.d.a.b$b */
    public interface OnCameraClickListener extends View.OnClickListener {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_new/grid/GridCameraShowPlugin$CameraViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "iconView", "Landroid/widget/ImageView;", "(Landroid/widget/ImageView;)V", "getIconView", "()Landroid/widget/ImageView;", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.d.a.b$a */
    public static final class CameraViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final ImageView f143628a;

        /* renamed from: a */
        public final ImageView mo197650a() {
            return this.f143628a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CameraViewHolder(ImageView imageView) {
            super(imageView);
            Intrinsics.checkParameterIsNotNull(imageView, "iconView");
            this.f143628a = imageView;
        }
    }

    public GridCameraShowPlugin(OnCameraClickListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "onCameraClick");
        this.f143627a = bVar;
    }

    /* renamed from: b */
    public CameraViewHolder mo197646a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return new CameraViewHolder(new ImageView(viewGroup.getContext()));
    }

    /* renamed from: a */
    public void mo197647a(CameraViewHolder aVar, SelectablePhoto fVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewHolder");
        Intrinsics.checkParameterIsNotNull(fVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        aVar.mo197650a().setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ImageView a = aVar.mo197650a();
        Context context = aVar.mo197650a().getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "viewHolder.iconView.context");
        a.setColorFilter(UDColorUtils.getColor(context, R.color.icon_n2), PorterDuff.Mode.SRC_ATOP);
        aVar.mo197650a().setImageResource(R.drawable.__picker_ic_camera_new);
        aVar.mo197650a().setOnClickListener(this.f143627a);
    }
}
