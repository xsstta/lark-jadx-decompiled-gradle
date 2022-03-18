package com.bytedance.common.jato.fdio;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.bytedance.common.jato.Jato;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class FDIOCollector implements FDIOOperator {
    private Context context = Jato.getContext();
    private boolean isNoMerge;
    private String scene;
    private ExecutorService service = Jato.getWorkExecutorService();

    private static native void nativeEndCollect(String str, String str2, boolean z, boolean z2);

    private static native void nativeStartCollect(String str, String str2, List<String> list);

    public void setNoMerge(boolean z) {
        this.isNoMerge = z;
    }

    @Override // com.bytedance.common.jato.fdio.FDIOOperator
    public void end(boolean z) {
        if (this.service != null && this.context != null && !this.scene.isEmpty()) {
            String str = this.context.getCacheDir().getAbsolutePath() + File.separator + "jato_fdio" + File.separator + this.scene;
            File parentFile = new File(str).getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
            try {
                nativeEndCollect(this.scene, str, this.isNoMerge, z);
            } catch (Throwable unused) {
            }
            Log.i("testFDIO", "end, save path: " + str);
        }
    }

    @Override // com.bytedance.common.jato.fdio.FDIOOperator
    public void start(String str, boolean z) {
        Context context2;
        String str2;
        if (!(this.service == null || (context2 = this.context) == null)) {
            this.scene = str;
            String packageCodePath = context2.getPackageCodePath();
            String substring = packageCodePath.substring(0, packageCodePath.lastIndexOf("/"));
            if (Build.VERSION.SDK_INT < 29) {
                str2 = System.getenv("BOOTCLASSPATH");
            } else {
                str2 = System.getenv("DEX2OATBOOTCLASSPATH");
            }
            ArrayList arrayList = new ArrayList(30);
            if (str2 != null) {
                String[] split = str2.split(":");
                for (String str3 : split) {
                    if (str3.endsWith(".apk")) {
                        arrayList.add(str3);
                    }
                    try {
                        arrayList.add(str3.substring(str3.lastIndexOf("/") + 1, str3.lastIndexOf(".")));
                    } catch (Throwable unused) {
                    }
                }
            }
            nativeStartCollect(str, substring, arrayList);
        }
    }
}
