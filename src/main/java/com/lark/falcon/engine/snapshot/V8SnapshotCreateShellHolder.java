package com.lark.falcon.engine.snapshot;

import com.lark.falcon.engine.common.JSEngineType;
import com.lark.falcon.engine.holder.AndroidFalconShellHolder;
import com.lark.falcon.engine.holder.C23974a;
import com.lark.falcon.engine.p1059c.C23970a;
import java.io.File;

public class V8SnapshotCreateShellHolder extends AndroidFalconShellHolder {

    /* renamed from: c */
    private boolean f59401c = false;

    private native boolean nativeCreateBlob(long j, String str);

    public V8SnapshotCreateShellHolder(boolean z) {
        super(new C23974a.C23976a().mo86104a(JSEngineType.V8SnapshotCreator).mo86106a(true).mo86108b(false).mo86109c(z).mo86107a());
    }

    /* renamed from: b */
    public boolean mo86204b(String str) {
        if (this.f59401c) {
            C23970a.m87622c("V8SnapshotCreateShellHolder", "It has already been created blob");
            return false;
        } else if (mo86088b() == 0) {
            C23970a.m87622c("V8SnapshotCreateShellHolder", "Shell Point invalidate");
            return false;
        } else {
            this.f59401c = true;
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile == null || parentFile.exists()) {
                if (file.exists()) {
                    C23970a.m87622c("V8SnapshotCreateShellHolder", "snapshot file exists");
                    return false;
                }
            } else if (!parentFile.mkdirs()) {
                C23970a.m87622c("V8SnapshotCreateShellHolder", "mkdirs failed");
                return false;
            }
            return nativeCreateBlob(mo86088b(), str);
        }
    }
}
