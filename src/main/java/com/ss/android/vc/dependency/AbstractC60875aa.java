package com.ss.android.vc.dependency;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import android.view.View;
import com.larksuite.framework.callback.IGetDataCallback;
import java.util.List;

/* renamed from: com.ss.android.vc.dependency.aa */
public interface AbstractC60875aa {
    /* renamed from: a */
    void mo196434a(Activity activity, IGetDataCallback<List<Pair<String, View>>> iGetDataCallback);

    void launchMainWindow(Context context);

    void notifyBootMileStoneFirstContentDraw(String str);

    void notifyBootMileStoneFirstFrameDraw(String str);
}
