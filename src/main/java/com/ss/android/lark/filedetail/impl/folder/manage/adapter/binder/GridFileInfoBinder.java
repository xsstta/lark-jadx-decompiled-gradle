package com.ss.android.lark.filedetail.impl.folder.manage.adapter.binder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.filedetail.impl.folder.manage.adapter.FileInfoAdapter;
import com.ss.android.lark.filedetail.impl.folder.manage.adapter.FileTitleUtils;
import com.ss.android.lark.filedetail.impl.folder.manage.drawable.ExtraVideoDrawable;
import com.ss.android.lark.filedetail.impl.folder.manage.drawable.extra.AddExtraVideoAction;
import com.ss.android.lark.filedetail.impl.folder.manage.drawable.property.DrawableProperty;
import com.ss.android.lark.filedetail.impl.folder.manage.drawable.property.ExtraVideoProperty;
import com.ss.android.lark.filedetail.impl.folder.manage.entity.FilePreviewInfo;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.widget.span.C59153c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0018H\u0016¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/adapter/binder/GridFileInfoBinder;", "Lcom/ss/android/lark/filedetail/impl/folder/manage/adapter/binder/FileInfoBinder;", "Lcom/ss/android/lark/filedetail/impl/folder/manage/adapter/FileInfoAdapter$FileItemViewHolder;", "()V", "getDrawableProperty", "Lcom/ss/android/lark/filedetail/impl/folder/manage/drawable/property/DrawableProperty;", "drawable", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "isVideo", "", "getFileDescription", "Lkotlin/Pair;", "", "textView", "Landroid/widget/TextView;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FilePreviewInfo;", "getPreviewTarget", "Lcom/ss/android/lark/image/api/SimpleTarget;", "view", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "defaultIcon", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.adapter.a.b */
public final class GridFileInfoBinder extends FileInfoBinder<FileInfoAdapter.FileItemViewHolder> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/filedetail/impl/folder/manage/adapter/binder/GridFileInfoBinder$getPreviewTarget$1", "Lcom/ss/android/lark/image/api/SimpleTarget;", "Landroid/graphics/drawable/Drawable;", "onResourceReady", "", "resource", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.adapter.a.b$a */
    public static final class C38269a extends C38818i<Drawable> {

        /* renamed from: a */
        final /* synthetic */ GridFileInfoBinder f98174a;

        /* renamed from: b */
        final /* synthetic */ LKUIRoundedImageView2 f98175b;

        /* renamed from: c */
        final /* synthetic */ Drawable f98176c;

        /* renamed from: d */
        final /* synthetic */ boolean f98177d;

        /* renamed from: i_ */
        public void mo49248a(Drawable drawable) {
            if (drawable == null) {
                this.f98175b.setImageDrawable(this.f98176c);
                return;
            }
            Context context = this.f98175b.getContext();
            GridFileInfoBinder bVar = this.f98174a;
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            this.f98175b.setImageDrawable(new ExtraVideoDrawable(bVar.mo139901a(drawable, context, this.f98177d), new C59153c(UIUtils.getColor(context, R.color.line_border_card), UIUtils.dp2px(context, 0.5f), UIUtils.dp2px(context, 5.0f)), new ExtraVideoProperty.Builder().mo139948a(context), new AddExtraVideoAction()));
        }

        C38269a(GridFileInfoBinder bVar, LKUIRoundedImageView2 lKUIRoundedImageView2, Drawable drawable, boolean z) {
            this.f98174a = bVar;
            this.f98175b = lKUIRoundedImageView2;
            this.f98176c = drawable;
            this.f98177d = z;
        }
    }

    /* renamed from: b */
    public FileInfoAdapter.FileItemViewHolder mo139900a(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.grid_item_file_info, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new FileInfoAdapter.FileItemViewHolder(inflate);
    }

    @Override // com.ss.android.lark.filedetail.impl.folder.manage.adapter.binder.FileInfoBinder
    /* renamed from: a */
    public Pair<String, String> mo139897a(TextView textView, FilePreviewInfo aVar) {
        boolean z;
        String str;
        Intrinsics.checkParameterIsNotNull(textView, "textView");
        Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        int dp2px = UIUtils.dp2px(textView.getContext(), 100.0f);
        if (textView.getPaint().measureText(aVar.mo139968c()) > ((float) dp2px)) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C26311p.m95262a(aVar.mo139969d()));
        if (z) {
            str = "";
        } else {
            str = "\n";
        }
        sb.append(str);
        return TuplesKt.to(FileTitleUtils.f98180a.mo139908a(textView, aVar.mo139968c(), dp2px), sb.toString());
    }

    @Override // com.ss.android.lark.filedetail.impl.folder.manage.adapter.binder.FileInfoBinder
    /* renamed from: a */
    public C38818i<Drawable> mo139896a(LKUIRoundedImageView2 lKUIRoundedImageView2, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(lKUIRoundedImageView2, "view");
        return new C38269a(this, lKUIRoundedImageView2, UIUtils.getDrawable(lKUIRoundedImageView2.getContext(), i), z);
    }

    /* renamed from: a */
    public final DrawableProperty mo139901a(Drawable drawable, Context context, boolean z) {
        float f;
        float f2;
        float f3;
        float dp2px = (float) UIUtils.dp2px(context, 32.0f);
        float dp2px2 = (float) UIUtils.dp2px(context, 28.0f);
        float dp2px3 = (float) UIUtils.dp2px(context, 100.0f);
        float dp2px4 = (float) UIUtils.dp2px(context, 84.0f);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = (float) drawable.getIntrinsicHeight();
        float f4 = dp2px3 * intrinsicHeight;
        float f5 = (float) intrinsicWidth;
        if (f4 < dp2px2 * f5) {
            f = dp2px2 / intrinsicHeight;
            f3 = intrinsicHeight * f;
        } else {
            float f6 = dp2px4 * f5;
            if (f6 < dp2px * intrinsicHeight) {
                f = dp2px / f5;
                f2 = (dp2px4 - (intrinsicHeight * f)) * 0.5f;
            } else if (f6 < f4) {
                f = dp2px4 / intrinsicHeight;
                f2 = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = dp2px3 / f5;
                f3 = intrinsicHeight * f;
            }
            return new DrawableProperty.Builder().mo139959a((dp2px3 - (f5 * f)) * 0.5f).mo139962b(f2).mo139963c(f).mo139960a(z).mo139961a(drawable, dp2px3, dp2px4);
        }
        f2 = dp2px4 - f3;
        return new DrawableProperty.Builder().mo139959a((dp2px3 - (f5 * f)) * 0.5f).mo139962b(f2).mo139963c(f).mo139960a(z).mo139961a(drawable, dp2px3, dp2px4);
    }
}
