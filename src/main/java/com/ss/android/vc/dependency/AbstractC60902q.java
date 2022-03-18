package com.ss.android.vc.dependency;

import android.graphics.Bitmap;
import com.ss.android.vc.dto.NewGuideConfig;

/* renamed from: com.ss.android.vc.dependency.q */
public interface AbstractC60902q {

    /* renamed from: com.ss.android.vc.dependency.q$a */
    public interface AbstractC60903a {
        /* renamed from: a */
        void mo144595a(String str);

        /* renamed from: b */
        void mo144596b(String str);

        /* renamed from: c */
        void mo144597c(String str);
    }

    /* renamed from: a */
    void mo196397a(Bitmap bitmap);

    /* renamed from: a */
    void mo196398a(NewGuideConfig newGuideConfig, AbstractC60903a aVar);

    /* renamed from: a */
    void mo196399a(String str, NewGuideConfig newGuideConfig, AbstractC60903a aVar);

    boolean checkToShow(String str);

    void completeGuide(String str, boolean z);
}
