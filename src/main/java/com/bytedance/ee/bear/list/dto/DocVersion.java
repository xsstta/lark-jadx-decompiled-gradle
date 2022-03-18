package com.bytedance.ee.bear.list.dto;

import com.bytedance.ee.util.io.NonProguard;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/list/dto/DocVersion;", "Lcom/bytedance/ee/util/io/NonProguard;", "ownerType", "", "(I)V", "getOwnerType", "()I", "isDocV2", "", "Companion", "list-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DocVersion implements NonProguard {
    public static final Companion Companion = new Companion(null);
    private final int ownerType;

    public DocVersion() {
        this(0, 1, null);
    }

    @JvmStatic
    public static final int getOwnerType(boolean z) {
        return Companion.mo32371a(z);
    }

    @JvmStatic
    public static final boolean isDocV2(int i) {
        return Companion.mo32372a(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/list/dto/DocVersion$Companion;", "", "()V", "OWNER_TYPE_DOCUMENT_V1", "", "OWNER_TYPE_DOCUMENT_V2", "getOwnerType", "isSpaceV2", "", "isDocV2", "ownerType", "list-export_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.dto.DocVersion$a */
    public static final class Companion {
        @JvmStatic
        /* renamed from: a */
        public final int mo32371a(boolean z) {
            return z ? 5 : 0;
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean mo32372a(int i) {
            return i == 5;
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getOwnerType() {
        return this.ownerType;
    }

    public final boolean isDocV2() {
        if (this.ownerType == 5) {
            return true;
        }
        return false;
    }

    public DocVersion(int i) {
        this.ownerType = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DocVersion(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
