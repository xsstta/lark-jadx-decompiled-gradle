package com.bytedance.ee.bear.drive.view.preview.block;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.drive.biz.preview.block.DriveBlockTitleView;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0005H\u0007J\u0006\u0010\u001d\u001a\u00020\u0011J\b\u0010\u001e\u001a\u00020\u001bH\u0014J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0005H\u0007R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013¨\u0006!"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/block/DriveBlockPreviewVM;", "Landroidx/lifecycle/ViewModel;", "()V", "blockClickInterceptors", "Ljava/util/HashSet;", "Lcom/bytedance/ee/bear/drive/view/preview/block/IBlockClickInterceptor;", "Lkotlin/collections/HashSet;", "getBlockClickInterceptors", "()Ljava/util/HashSet;", "blockTitleView", "Lcom/bytedance/ee/bear/drive/biz/preview/block/DriveBlockTitleView;", "getBlockTitleView", "()Lcom/bytedance/ee/bear/drive/biz/preview/block/DriveBlockTitleView;", "setBlockTitleView", "(Lcom/bytedance/ee/bear/drive/biz/preview/block/DriveBlockTitleView;)V", "blockTitleViewVisibility", "Landroidx/lifecycle/MutableLiveData;", "", "getBlockTitleViewVisibility", "()Landroidx/lifecycle/MutableLiveData;", "enterFullScreen", "", "getEnterFullScreen", "liveBlockState", "Lcom/bytedance/ee/bear/drive/view/preview/block/DriveBlockPreviewVM$BlockState;", "getLiveBlockState", "addBlockClickInterceptor", "", "interceptor", "isFromBlockPreview", "onCleared", "removeBlockClickInterceptor", "BlockState", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveBlockPreviewVM extends AbstractC1142af {
    private final HashSet<IBlockClickInterceptor> blockClickInterceptors = new HashSet<>();
    private DriveBlockTitleView blockTitleView;
    private final C1177w<Boolean> blockTitleViewVisibility = new C1177w<>();
    private final C1177w<Object> enterFullScreen = new C1177w<>();
    private final C1177w<BlockState> liveBlockState = new C1177w<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/block/DriveBlockPreviewVM$BlockState;", "", "(Ljava/lang/String;I)V", "BLOCK", "FULLSCREEN", "ANIMATING", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public enum BlockState {
        BLOCK,
        FULLSCREEN,
        ANIMATING
    }

    public final HashSet<IBlockClickInterceptor> getBlockClickInterceptors() {
        return this.blockClickInterceptors;
    }

    public final DriveBlockTitleView getBlockTitleView() {
        return this.blockTitleView;
    }

    public final C1177w<Boolean> getBlockTitleViewVisibility() {
        return this.blockTitleViewVisibility;
    }

    public final C1177w<Object> getEnterFullScreen() {
        return this.enterFullScreen;
    }

    public final C1177w<BlockState> getLiveBlockState() {
        return this.liveBlockState;
    }

    public final boolean isFromBlockPreview() {
        if (this.liveBlockState.mo5927b() != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        super.onCleared();
        this.blockTitleView = null;
        this.blockClickInterceptors.clear();
    }

    public final void setBlockTitleView(DriveBlockTitleView driveBlockTitleView) {
        this.blockTitleView = driveBlockTitleView;
    }

    public final void addBlockClickInterceptor(IBlockClickInterceptor aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "interceptor");
        this.blockClickInterceptors.add(aVar);
    }

    public final void removeBlockClickInterceptor(IBlockClickInterceptor aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "interceptor");
        this.blockClickInterceptors.remove(aVar);
    }
}
