package com.ss.android.lark.filedetail.impl.folder.manage.adapter.binder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.filedetail.impl.folder.manage.adapter.FileInfoAdapter;
import com.ss.android.lark.filedetail.impl.folder.manage.adapter.FileTitleUtils;
import com.ss.android.lark.filedetail.impl.folder.manage.entity.FilePreviewInfo;
import com.ss.android.lark.image.api.C38818i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0017H\u0016¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/adapter/binder/ListFileInfoBinder;", "Lcom/ss/android/lark/filedetail/impl/folder/manage/adapter/binder/FileInfoBinder;", "Lcom/ss/android/lark/filedetail/impl/folder/manage/adapter/FileInfoAdapter$ListFileItemViewHolder;", "()V", "bindExtraInfo", "", "holder", "showPreview", "", "isVideo", "getFileDescription", "Lkotlin/Pair;", "", "textView", "Landroid/widget/TextView;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FilePreviewInfo;", "getPreviewTarget", "Lcom/ss/android/lark/image/api/SimpleTarget;", "Landroid/graphics/drawable/Drawable;", "view", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "defaultIcon", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.adapter.a.c */
public final class ListFileInfoBinder extends FileInfoBinder<FileInfoAdapter.ListFileItemViewHolder> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/filedetail/impl/folder/manage/adapter/binder/ListFileInfoBinder$getPreviewTarget$1", "Lcom/ss/android/lark/image/api/SimpleTarget;", "Landroid/graphics/drawable/Drawable;", "onResourceReady", "", "resource", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.adapter.a.c$a */
    public static final class C38270a extends C38818i<Drawable> {

        /* renamed from: a */
        final /* synthetic */ LKUIRoundedImageView2 f98178a;

        /* renamed from: b */
        final /* synthetic */ Drawable f98179b;

        /* renamed from: j_ */
        public void mo49248a(Drawable drawable) {
            LKUIRoundedImageView2 lKUIRoundedImageView2 = this.f98178a;
            if (drawable == null) {
                drawable = this.f98179b;
            }
            lKUIRoundedImageView2.setImageDrawable(drawable);
        }

        C38270a(LKUIRoundedImageView2 lKUIRoundedImageView2, Drawable drawable) {
            this.f98178a = lKUIRoundedImageView2;
            this.f98179b = drawable;
        }
    }

    /* renamed from: b */
    public FileInfoAdapter.ListFileItemViewHolder mo139900a(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_file_info, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new FileInfoAdapter.ListFileItemViewHolder(inflate);
    }

    @Override // com.ss.android.lark.filedetail.impl.folder.manage.adapter.binder.FileInfoBinder
    /* renamed from: a */
    public Pair<String, String> mo139897a(TextView textView, FilePreviewInfo aVar) {
        Intrinsics.checkParameterIsNotNull(textView, "textView");
        Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return TuplesKt.to(aVar.mo139968c(), C26311p.m95262a(aVar.mo139969d()) + " " + aVar.mo139972f() + " " + FileTitleUtils.f98180a.mo139907a(aVar.mo139970e()));
    }

    @Override // com.ss.android.lark.filedetail.impl.folder.manage.adapter.binder.FileInfoBinder
    /* renamed from: a */
    public C38818i<Drawable> mo139896a(LKUIRoundedImageView2 lKUIRoundedImageView2, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(lKUIRoundedImageView2, "view");
        return new C38270a(lKUIRoundedImageView2, UIUtils.getDrawable(lKUIRoundedImageView2.getContext(), i));
    }

    /* renamed from: a */
    public void mo139899a(FileInfoAdapter.ListFileItemViewHolder cVar, boolean z, boolean z2) {
        int i;
        float f;
        int i2;
        Intrinsics.checkParameterIsNotNull(cVar, "holder");
        View view = cVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        Context context = view.getContext();
        int i3 = 0;
        if (z) {
            i = UIUtils.getColor(context, R.color.line_border_card);
        } else {
            i = 0;
        }
        cVar.mo139888a().setBorderColor(i);
        LKUIRoundedImageView2 a = cVar.mo139888a();
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (z) {
            f = 0.5f;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        a.setBorderWidthInDp(f);
        LKUIRoundedImageView2 a2 = cVar.mo139888a();
        if (z) {
            f2 = 4.0f;
        }
        a2.setRadiusInDp(f2);
        ImageView d = cVar.mo139891d();
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        d.setVisibility(i2);
        ImageView e = cVar.mo139892e();
        if (!z2) {
            i3 = 8;
        }
        e.setVisibility(i3);
    }
}
