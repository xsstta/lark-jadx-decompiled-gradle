package com.ss.android.lark.filedetail.impl.folder.manage.entity;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FileType;", "", "number", "", "(Ljava/lang/String;II)V", "getNumber", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "FILE", "IMAGE", "STICKER", "AUDIO", "MEDIA", "LARK_LOG", "AVATAR", "THIRD_PARTY", "FOLDER", "Companion", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum FileType {
    UNKNOWN(0),
    FILE(1),
    IMAGE(2),
    STICKER(3),
    AUDIO(4),
    MEDIA(5),
    LARK_LOG(6),
    AVATAR(7),
    THIRD_PARTY(8),
    FOLDER(9);
    
    public static final Companion Companion = new Companion(null);
    private final int number;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FileType$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FileType;", "value", "", "valueOf", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.entity.FileType$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final FileType mo139965a(int i) {
            return m150602b(i);
        }

        /* renamed from: b */
        private final FileType m150602b(int i) {
            FileType[] values = FileType.values();
            for (FileType fileType : values) {
                if (fileType.getNumber() == i) {
                    return fileType;
                }
            }
            return FileType.UNKNOWN;
        }
    }

    public final int getNumber() {
        return this.number;
    }

    private FileType(int i) {
        this.number = i;
    }
}
