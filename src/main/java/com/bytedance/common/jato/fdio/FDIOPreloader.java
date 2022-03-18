package com.bytedance.common.jato.fdio;

import android.content.Context;
import android.util.Log;
import com.bytedance.common.jato.Jato;
import java.io.File;
import java.util.concurrent.ExecutorService;

public class FDIOPreloader implements FDIOOperator {
    private Context context = Jato.getContext();
    private ExecutorService service = Jato.getWorkExecutorService();

    private static native void nativeStartPreload(String str, boolean z);

    @Override // com.bytedance.common.jato.fdio.FDIOOperator
    public void end(boolean z) {
    }

    @Override // com.bytedance.common.jato.fdio.FDIOOperator
    public void start(String str, boolean z) {
        if (!str.isEmpty() && this.context != null && this.service != null) {
            Log.i("testFDIO", "start preload: " + str);
            File file = new File(this.context.getCacheDir().getAbsolutePath() + File.separator + "jato_fdio" + File.separator + str);
            if (file.exists()) {
                nativeStartPreload(file.getAbsolutePath(), z);
            }
        }
    }
}
