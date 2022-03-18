package kotlin.io;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0007"}, d2 = {"walk", "Lkotlin/io/FileTreeWalk;", "Ljava/io/File;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lkotlin/io/FileWalkDirection;", "walkBottomUp", "walkTopDown", "kotlin-stdlib"}, mo238835k = 5, mv = {1, 1, 16}, xi = 1, xs = "kotlin/io/FilesKt")
/* renamed from: kotlin.io.j */
class C69107j extends C69106i {
    /* renamed from: b */
    public static final FileTreeWalk m265925b(File file) {
        Intrinsics.checkParameterIsNotNull(file, "$this$walkTopDown");
        return C69104g.m265924a(file, FileWalkDirection.TOP_DOWN);
    }

    /* renamed from: c */
    public static final FileTreeWalk m265926c(File file) {
        Intrinsics.checkParameterIsNotNull(file, "$this$walkBottomUp");
        return C69104g.m265924a(file, FileWalkDirection.BOTTOM_UP);
    }

    /* renamed from: a */
    public static final FileTreeWalk m265924a(File file, FileWalkDirection fileWalkDirection) {
        Intrinsics.checkParameterIsNotNull(file, "$this$walk");
        Intrinsics.checkParameterIsNotNull(fileWalkDirection, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION);
        return new FileTreeWalk(file, fileWalkDirection);
    }
}
