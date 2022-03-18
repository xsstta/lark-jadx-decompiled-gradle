package com.bytedance.ee.bear.share.export;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import com.bytedance.ee.bear.bizwidget.shareview.ShareType;
import java.io.File;

/* renamed from: com.bytedance.ee.bear.share.export.a */
public interface AbstractC11003a {

    /* renamed from: com.bytedance.ee.bear.share.export.a$a */
    public interface AbstractC11004a {
        /* renamed from: a */
        String mo41770a(Context context, ShareType shareType);

        /* renamed from: a */
        void mo41771a(Context context, ShareType shareType, File file, String str, AbstractC11005b bVar);

        /* renamed from: a */
        void mo41772a(Context context, ShareType shareType, String str, AbstractC11005b bVar);

        /* renamed from: a */
        void mo41773a(Context context, File file, AbstractC11005b bVar);

        /* renamed from: a */
        void mo41774a(Context context, String str, AbstractC11005b bVar);

        /* renamed from: a */
        void mo41775a(boolean z, Context context, ShareType shareType, File file, AbstractC11005b bVar);

        /* renamed from: a */
        void mo41776a(boolean z, Context context, ShareType shareType, String str, AbstractC11005b bVar);

        /* renamed from: a */
        boolean mo41777a();
    }

    /* renamed from: a */
    DialogInterface$OnCancelListenerC1021b mo41760a(ShareParams shareParams);

    /* renamed from: a */
    DialogInterface$OnCancelListenerC1021b mo41761a(ShareParams shareParams, Bundle bundle);

    /* renamed from: a */
    AbstractC11004a mo41762a();

    /* renamed from: a */
    void mo41763a(DialogInterface$OnCancelListenerC1021b bVar);

    /* renamed from: a */
    void mo41764a(String str, String str2);

    /* renamed from: b */
    DialogInterface$OnCancelListenerC1021b mo41765b(ShareParams shareParams);

    /* renamed from: b */
    void mo41766b();

    /* renamed from: c */
    void mo41767c();

    /* renamed from: d */
    void mo41768d();

    /* renamed from: e */
    void mo41769e();
}
