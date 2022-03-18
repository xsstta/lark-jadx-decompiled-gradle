package com.bytedance.ee.bear.drive.view.preview.imageviewer;

import android.content.Context;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.imageviewer.d */
public class C7362d {
    /* renamed from: a */
    public static AbstractC7361c m29394a(Context context, C7358b bVar, C7555f fVar) {
        if (bVar.mo28636c()) {
            C13479a.m54764b("preview_image", "DrivePhotoViewProvider.of() > ProgressivePhotoView");
            return new ProgressivePhotoView(context, bVar, fVar);
        } else if (bVar.mo28635b() || !bVar.mo28634a()) {
            C13479a.m54764b("preview_image", "DrivePhotoViewProvider.of() > DefaultDrivePhotoView");
            return new C7354a(context, bVar);
        } else {
            C13479a.m54764b("preview_image", "DrivePhotoViewProvider.of() > DriveSubsamplingScaleImageView");
            return new C7363e(context, bVar);
        }
    }
}
