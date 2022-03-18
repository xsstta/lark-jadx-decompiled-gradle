package com.bytedance.ee.bear.document.alert;

import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/document/alert/FailType;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "mount_point", "", "getMount_point", "()Ljava/lang/String;", "setMount_point", "(Ljava/lang/String;)V", "mount_token", "getMount_token", "setMount_token", ShareHitPoint.f121869d, "", "getType", "()I", "setType", "(I)V", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class FailType implements NonProguard {
    public static final Companion Companion = new Companion(null);
    private String mount_point;
    private String mount_token;
    private int type = -1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/document/alert/FailType$Companion;", "", "()V", "CREATE_COPY_FAIL", "", "TRANSLATE_FAIL", "UPLOAD_FAIL", "USER_FULL_QUOTA", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.alert.FailType$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getMount_point() {
        return this.mount_point;
    }

    public final String getMount_token() {
        return this.mount_token;
    }

    public final int getType() {
        return this.type;
    }

    public final void setMount_point(String str) {
        this.mount_point = str;
    }

    public final void setMount_token(String str) {
        this.mount_token = str;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
