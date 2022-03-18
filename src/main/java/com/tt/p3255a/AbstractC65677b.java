package com.tt.p3255a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.entity.C67531h;
import com.tt.option.previewImage.AbstractC67668a;
import com.tt.option.previewImage.ImageRequest;
import com.tt.option.share.AbstractC67683f;
import com.tt.option.share.AbstractC67684g;
import com.tt.option.share.ShareInfoModel;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.tt.a.b */
public interface AbstractC65677b {
    C67531h createInitParams(IAppContext iAppContext);

    boolean handleActivityLoginResult(int i, int i2, Intent intent);

    boolean handleActivityShareResult(int i, int i2, Intent intent);

    void loadImage(Context context, C65678c cVar);

    boolean openLoginActivity(Activity activity, HashMap<String, Object> hashMap);

    boolean share(Activity activity, ShareInfoModel shareInfoModel, AbstractC67684g gVar);

    void showShareDialog(Activity activity, AbstractC67683f fVar);

    boolean startImagePreviewActivity(Activity activity, String str, List<String> list, int i);

    boolean startImagePreviewActivity(Activity activity, List<ImageRequest> list, int i, AbstractC67668a aVar);
}
