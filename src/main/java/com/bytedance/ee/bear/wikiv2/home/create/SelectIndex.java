package com.bytedance.ee.bear.wikiv2.home.create;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/create/SelectIndex;", "", "documentType", "", "(Ljava/lang/String;II)V", "getDocumentType", "()I", "id", "DOCX", "DOC", "SHEET", "MINDNOTE", "MEDIA", "FILE", "BITABLE", GrsBaseInfo.CountryCodeSource.UNKNOWN, "Companion", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum SelectIndex {
    DOCX(22),
    DOC(2),
    SHEET(3),
    MINDNOTE(11),
    MEDIA(12),
    FILE(12),
    BITABLE(8),
    UNKNOWN(-1);
    
    public static final Companion Companion = new Companion(null);
    private final int documentType;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/create/SelectIndex$Companion;", "", "()V", "isSelectFile", "", "id", "", "valueOf", "Lcom/bytedance/ee/bear/wikiv2/home/create/SelectIndex;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.create.SelectIndex$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final SelectIndex mo46850a(int i) {
            SelectIndex[] values = SelectIndex.values();
            if (i < 0 || i >= values.length) {
                return SelectIndex.UNKNOWN;
            }
            return values[i];
        }

        /* renamed from: b */
        public final boolean mo46851b(int i) {
            if (i == SelectIndex.MEDIA.ordinal() || i == SelectIndex.FILE.ordinal()) {
                return true;
            }
            return false;
        }
    }

    public final int getDocumentType() {
        return this.documentType;
    }

    public final int id() {
        return ordinal();
    }

    private SelectIndex(int i) {
        this.documentType = i;
    }
}
