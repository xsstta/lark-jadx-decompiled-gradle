package com.bytedance.ee.bear.share;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0005H&¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/share/IShareMeta;", "Ljava/io/Serializable;", "getObjType", "", "getShareToken", "", "isOpen", "", "setFlag", "", "flag", "setShareToken", "shareToken", "Companion", "bitable-api_release"}, mo238835k = 1, mv = {1, 1, 15})
public interface IShareMeta extends Serializable {
    public static final Companion Companion = Companion.f29516a;

    int getObjType();

    String getShareToken();

    boolean isOpen();

    void setFlag(int i);

    void setShareToken(String str);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/share/IShareMeta$Companion;", "", "()V", "FLAG_CLOSE", "", "FLAG_OPEN", "SHARE_TYPE_FORM", "SHARE_TYPE_RECORD", "SHARE_TYPE_VIEW", "bitable-api_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.IShareMeta$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f29516a = new Companion();

        private Companion() {
        }
    }
}
