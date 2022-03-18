package com.ss.android.lark.filedetail.impl.folder.manage.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.filedetail.impl.folder.manage.adapter.binder.GridFileInfoBinder;
import com.ss.android.lark.filedetail.impl.folder.manage.adapter.binder.ListFileInfoBinder;
import com.ss.android.lark.filedetail.impl.folder.manage.entity.FilePreviewInfo;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0018\u0019\u001a\u001b\u001cB\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0016J\u0006\u0010\r\u001a\u00020\bJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bH\u0016J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\bJ\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/adapter/FileInfoAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FilePreviewInfo;", "()V", "binderFactory", "Lcom/ss/android/lark/filedetail/impl/folder/manage/adapter/AdapterBinderFactory;", "layoutType", "", "listener", "Lcom/ss/android/lark/filedetail/impl/folder/manage/adapter/FileInfoAdapter$OnItemSelectListener;", "getItemViewType", "position", "getLayoutViewType", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setLayoutViewType", ShareHitPoint.f121869d, "setListener", "Companion", "FileItemViewHolder", "FileLayoutType", "ListFileItemViewHolder", "OnItemSelectListener", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FileInfoAdapter extends LarkRecyclerViewBaseAdapter<RecyclerView.ViewHolder, FilePreviewInfo> {

    /* renamed from: b */
    public static final Companion f98161b = new Companion(null);

    /* renamed from: a */
    public OnItemSelectListener f98162a;

    /* renamed from: c */
    private int f98163c;

    /* renamed from: d */
    private final AdapterBinderFactory f98164d = new AdapterBinderFactory();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/adapter/FileInfoAdapter$FileLayoutType;", "", "Companion", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface FileLayoutType {
        public static final Companion Companion = Companion.f98165a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/adapter/FileInfoAdapter$FileLayoutType$Companion;", "", "()V", "GRID_VIEW", "", "LIST_VIEW", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.adapter.FileInfoAdapter$FileLayoutType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f98165a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/adapter/FileInfoAdapter$OnItemSelectListener;", "", "onItemSelect", "", "item", "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FilePreviewInfo;", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.adapter.FileInfoAdapter$d */
    public interface OnItemSelectListener {
        /* renamed from: a */
        void mo139875a(FilePreviewInfo aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/adapter/FileInfoAdapter$Companion;", "", "()V", "LOG_TAG", "", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.adapter.FileInfoAdapter$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/adapter/FileInfoAdapter$FileItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "fileIcon", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "getFileIcon", "()Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "fileSubtitle", "Landroid/widget/TextView;", "getFileSubtitle", "()Landroid/widget/TextView;", "fileTitle", "getFileTitle", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.adapter.FileInfoAdapter$b */
    public static class FileItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final LKUIRoundedImageView2 f98166a;

        /* renamed from: b */
        private final TextView f98167b;

        /* renamed from: c */
        private final TextView f98168c;

        /* renamed from: a */
        public final LKUIRoundedImageView2 mo139888a() {
            return this.f98166a;
        }

        /* renamed from: b */
        public final TextView mo139889b() {
            return this.f98167b;
        }

        /* renamed from: c */
        public final TextView mo139890c() {
            return this.f98168c;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FileItemViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            View findViewById = view.findViewById(R.id.file_icon_iv);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.file_icon_iv)");
            this.f98166a = (LKUIRoundedImageView2) findViewById;
            View findViewById2 = view.findViewById(R.id.file_title_tv);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.file_title_tv)");
            this.f98167b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.file_subtitle_tv);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.file_subtitle_tv)");
            this.f98168c = (TextView) findViewById3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/adapter/FileInfoAdapter$ListFileItemViewHolder;", "Lcom/ss/android/lark/filedetail/impl/folder/manage/adapter/FileInfoAdapter$FileItemViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "videoBg", "Landroid/widget/ImageView;", "getVideoBg", "()Landroid/widget/ImageView;", "videoPlayIcon", "getVideoPlayIcon", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.adapter.FileInfoAdapter$c */
    public static final class ListFileItemViewHolder extends FileItemViewHolder {

        /* renamed from: a */
        private final ImageView f98169a;

        /* renamed from: b */
        private final ImageView f98170b;

        /* renamed from: d */
        public final ImageView mo139891d() {
            return this.f98169a;
        }

        /* renamed from: e */
        public final ImageView mo139892e() {
            return this.f98170b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ListFileItemViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            View findViewById = view.findViewById(R.id.preview_video_play_icon);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.….preview_video_play_icon)");
            this.f98169a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.preview_video_bg);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.preview_video_bg)");
            this.f98170b = (ImageView) findViewById2;
        }
    }

    /* renamed from: a */
    public final void mo139886a(int i) {
        this.f98163c = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f98163c;
    }

    /* renamed from: a */
    public final void mo139887a(OnItemSelectListener dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "listener");
        this.f98162a = dVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.adapter.FileInfoAdapter$e */
    static final class View$OnClickListenerC38267e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FileInfoAdapter f98171a;

        /* renamed from: b */
        final /* synthetic */ FilePreviewInfo f98172b;

        View$OnClickListenerC38267e(FileInfoAdapter fileInfoAdapter, FilePreviewInfo aVar) {
            this.f98171a = fileInfoAdapter;
            this.f98172b = aVar;
        }

        public final void onClick(View view) {
            OnItemSelectListener dVar = this.f98171a.f98162a;
            if (dVar != null) {
                FilePreviewInfo aVar = this.f98172b;
                Intrinsics.checkExpressionValueIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                dVar.mo139875a(aVar);
                return;
            }
            Log.m165389i("FileInfoAdapter", "listener is null");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return this.f98164d.mo139894a(i).mo139900a(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        FilePreviewInfo aVar = (FilePreviewInfo) getItem(i);
        IAdapterBinder<FilePreviewInfo, ? extends RecyclerView.ViewHolder> a = this.f98164d.mo139894a(getItemViewType(i));
        if ((a instanceof ListFileInfoBinder) && (viewHolder instanceof ListFileItemViewHolder)) {
            Intrinsics.checkExpressionValueIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            ((ListFileInfoBinder) a).mo139898a((FileItemViewHolder) viewHolder, aVar);
        } else if ((a instanceof GridFileInfoBinder) && (viewHolder instanceof FileItemViewHolder)) {
            Intrinsics.checkExpressionValueIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            ((GridFileInfoBinder) a).mo139898a((FileItemViewHolder) viewHolder, aVar);
        }
        viewHolder.itemView.setOnClickListener(new View$OnClickListenerC38267e(this, aVar));
    }
}
