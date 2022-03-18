package com.bytedance.ee.bear.list.manualoffline;

import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rj\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/list/manualoffline/ManualOfflineSort;", "", "resId", "", "rank", "asc", "", "reportSort", "", "(Ljava/lang/String;IIIZLjava/lang/String;)V", "getAsc", "()Z", "getRank", "()I", "getReportSort", "()Ljava/lang/String;", "setReportSort", "(Ljava/lang/String;)V", "getResId", "DEFAULT", "MODIFIED", "CREATED", "Companion", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum ManualOfflineSort {
    DEFAULT(R.string.Doc_Facade_Default, 9, false, "default"),
    MODIFIED(R.string.Doc_List_Filter_Recent_Modified, 7, false, "last_modified"),
    CREATED(R.string.Doc_List_Filter_Recent_Created, 3, false, "last_created");
    
    public static final Companion Companion = new Companion(null);
    private final boolean asc;
    private final int rank;
    private String reportSort;
    private final int resId;

    @JvmStatic
    public static final ManualOfflineSort getSort(int i) {
        return Companion.mo33543a(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/list/manualoffline/ManualOfflineSort$Companion;", "", "()V", "getSort", "Lcom/bytedance/ee/bear/list/manualoffline/ManualOfflineSort;", "rank", "", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.manualoffline.ManualOfflineSort$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final ManualOfflineSort mo33543a(int i) {
            if (i == ManualOfflineSort.MODIFIED.getRank()) {
                return ManualOfflineSort.MODIFIED;
            }
            if (i == ManualOfflineSort.CREATED.getRank()) {
                return ManualOfflineSort.CREATED;
            }
            return ManualOfflineSort.DEFAULT;
        }
    }

    public final boolean getAsc() {
        return this.asc;
    }

    public final int getRank() {
        return this.rank;
    }

    public final String getReportSort() {
        return this.reportSort;
    }

    public final int getResId() {
        return this.resId;
    }

    public final void setReportSort(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.reportSort = str;
    }

    private ManualOfflineSort(int i, int i2, boolean z, String str) {
        this.resId = i;
        this.rank = i2;
        this.asc = z;
        this.reportSort = str;
    }
}
