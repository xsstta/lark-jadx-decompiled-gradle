package com.ss.android.lark.widget.photo_picker.entity;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.C1177w;
import java.io.File;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004J\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0004J\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u0016\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0004X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0017\"\u0004\b \u0010\u0019R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/entity/PhotoState;", "Ljava/io/Serializable;", "()V", "clickLookOrigin", "Landroidx/lifecycle/MutableLiveData;", "", "downloadOriginProgress", "", "inlinePreviewDrawable", "Landroid/graphics/drawable/Drawable;", "getInlinePreviewDrawable", "()Landroid/graphics/drawable/Drawable;", "setInlinePreviewDrawable", "(Landroid/graphics/drawable/Drawable;)V", "isFromMe", "()Z", "setFromMe", "(Z)V", "isLoadOrigin", "setLoadOrigin", "middleFile", "Ljava/io/File;", "getMiddleFile", "()Ljava/io/File;", "setMiddleFile", "(Ljava/io/File;)V", "originFile", "getOriginFile", "setOriginFile", "showFile", "thumbnailFile", "getThumbnailFile", "setThumbnailFile", "uiState", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoState$UIState;", "getClickLookOrigin", "getDownloadOriginProgress", "getShowFile", "getUIState", "UIState", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PhotoState implements Serializable {
    private final C1177w<Boolean> clickLookOrigin = new C1177w<>();
    private final C1177w<Integer> downloadOriginProgress = new C1177w<>();
    private Drawable inlinePreviewDrawable;
    private boolean isFromMe;
    private boolean isLoadOrigin;
    private File middleFile;
    private File originFile;
    private C1177w<File> showFile = new C1177w<>();
    private File thumbnailFile;
    private final C1177w<UIState> uiState = new C1177w<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/entity/PhotoState$UIState;", "", "(Ljava/lang/String;I)V", "HIDE_LOOK", "SHOW_LOOK", "LOADING", "DONE", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum UIState {
        HIDE_LOOK,
        SHOW_LOOK,
        LOADING,
        DONE
    }

    public final C1177w<Boolean> getClickLookOrigin() {
        return this.clickLookOrigin;
    }

    public final C1177w<Integer> getDownloadOriginProgress() {
        return this.downloadOriginProgress;
    }

    public final Drawable getInlinePreviewDrawable() {
        return this.inlinePreviewDrawable;
    }

    public final File getMiddleFile() {
        return this.middleFile;
    }

    public final File getOriginFile() {
        return this.originFile;
    }

    public final C1177w<File> getShowFile() {
        return this.showFile;
    }

    public final File getThumbnailFile() {
        return this.thumbnailFile;
    }

    public final C1177w<UIState> getUIState() {
        return this.uiState;
    }

    public final boolean isFromMe() {
        return this.isFromMe;
    }

    public final boolean isLoadOrigin() {
        return this.isLoadOrigin;
    }

    public final void setFromMe(boolean z) {
        this.isFromMe = z;
    }

    public final void setInlinePreviewDrawable(Drawable drawable) {
        this.inlinePreviewDrawable = drawable;
    }

    public final void setLoadOrigin(boolean z) {
        this.isLoadOrigin = z;
    }

    public final void setMiddleFile(File file) {
        this.middleFile = file;
    }

    public final void setOriginFile(File file) {
        this.originFile = file;
    }

    public final void setThumbnailFile(File file) {
        this.thumbnailFile = file;
    }
}
