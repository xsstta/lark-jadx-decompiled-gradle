package com.bytedance.ee.android.file.picker.lib.p237c;

import android.content.Context;
import com.bytedance.ee.android.file.picker.lib.media.FileEntry;
import com.bytedance.ee.android.file.picker.lib.utils.FileEntryUtils;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import java.util.List;

/* renamed from: com.bytedance.ee.android.file.picker.lib.c.a */
public class C4041a {

    /* renamed from: a */
    private final String f12275a = "FileTracer";

    /* renamed from: a */
    public void mo15854a(final Context context, final IGetDataCallback<List<FileEntry>> iGetDataCallback) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.bytedance.ee.android.file.picker.lib.p237c.C4041a.RunnableC40421 */

            public void run() {
                List<FileEntry> a = FileEntryUtils.m17125a(context);
                Log.m165389i("FileTracer", "fetchReceivedFiles size: " + a.size());
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(a);
                }
            }
        });
    }
}
