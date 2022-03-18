package com.ss.android.lark.filedetail.impl.folder.manage.adapter.binder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.filedetail.impl.folder.manage.adapter.FileInfoAdapter;
import com.ss.android.lark.filedetail.impl.folder.manage.adapter.FileInfoAdapter.FileItemViewHolder;
import com.ss.android.lark.filedetail.impl.folder.manage.adapter.IAdapterBinder;
import com.ss.android.lark.filedetail.impl.folder.manage.entity.FilePreviewInfo;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.FileType;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0005J\u001d\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\nJ%\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\nJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u0004H&J(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\rH&J\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\rH\u0002J\u001d\u0010 \u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010\n¨\u0006\""}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/adapter/binder/FileInfoBinder;", "VH", "Lcom/ss/android/lark/filedetail/impl/folder/manage/adapter/FileInfoAdapter$FileItemViewHolder;", "Lcom/ss/android/lark/filedetail/impl/folder/manage/adapter/IAdapterBinder;", "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FilePreviewInfo;", "()V", "bindDesc", "", "holder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/ss/android/lark/filedetail/impl/folder/manage/adapter/FileInfoAdapter$FileItemViewHolder;Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FilePreviewInfo;)V", "bindExtraInfo", "showPreview", "", "isVideo", "(Lcom/ss/android/lark/filedetail/impl/folder/manage/adapter/FileInfoAdapter$FileItemViewHolder;ZZ)V", "bindFileIcon", "getFileDescription", "Lkotlin/Pair;", "", "textView", "Landroid/widget/TextView;", "getPreviewTarget", "Lcom/ss/android/lark/image/api/SimpleTarget;", "Landroid/graphics/drawable/Drawable;", "view", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "defaultIcon", "", "isVideoFile", "name", "isFolder", "onBindViewHolder", "item", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.adapter.a.a */
public abstract class FileInfoBinder<VH extends FileInfoAdapter.FileItemViewHolder> implements IAdapterBinder<FilePreviewInfo, VH> {
    /* renamed from: a */
    public abstract C38818i<Drawable> mo139896a(LKUIRoundedImageView2 lKUIRoundedImageView2, int i, boolean z);

    /* renamed from: a */
    public abstract Pair<String, String> mo139897a(TextView textView, FilePreviewInfo aVar);

    /* renamed from: a */
    public void mo139899a(VH vh, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(vh, "holder");
    }

    /* renamed from: a */
    public void mo139898a(VH vh, FilePreviewInfo aVar) {
        Intrinsics.checkParameterIsNotNull(vh, "holder");
        Intrinsics.checkParameterIsNotNull(aVar, "item");
        m150499b(vh, aVar);
        m150500c(vh, aVar);
    }

    /* renamed from: a */
    private final boolean m150498a(String str, boolean z) {
        String g;
        boolean z2;
        if (z || (g = C26311p.m95287g(str)) == null) {
            return false;
        }
        if (g.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || FileType.getFileTypeBySuffix(g) != FileType.TYPE_VIDEO) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private final void m150499b(VH vh, FilePreviewInfo aVar) {
        Pair<String, String> a = mo139897a(vh.mo139889b(), aVar);
        vh.mo139889b().setText(a.getFirst());
        vh.mo139890c().setText(a.getSecond());
    }

    /* renamed from: c */
    private final void m150500c(VH vh, FilePreviewInfo aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        Context context = vh.mo139888a().getContext();
        String h = aVar.mo139974h();
        boolean z4 = true;
        if (h == null || h.length() <= 0) {
            z = false;
        } else {
            z = true;
        }
        String c = aVar.mo139968c();
        if (aVar.mo139967b() == com.ss.android.lark.filedetail.impl.folder.manage.entity.FileType.FOLDER) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!m150498a(c, z2) || !z) {
            z3 = false;
        } else {
            z3 = true;
        }
        int dp2px = UIUtils.dp2px(context, 100.0f);
        String c2 = aVar.mo139968c();
        if (aVar.mo139967b() != com.ss.android.lark.filedetail.impl.folder.manage.entity.FileType.FOLDER) {
            z4 = false;
        }
        int b = C57881t.m224622b("", c2, z4);
        if (z) {
            IRequestCreator with = ImageLoader.with(context);
            String h2 = aVar.mo139974h();
            if (h2 == null) {
                Intrinsics.throwNpe();
            }
            with.load(new C38824b(h2)).asDrawable().override(dp2px, dp2px).error(b).into(mo139896a(vh.mo139888a(), b, z3));
        } else {
            vh.mo139888a().setImageResource(b);
        }
        mo139899a(vh, z, z3);
    }
}
