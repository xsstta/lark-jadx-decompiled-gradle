package com.bytedance.ee.bear.share;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import com.bytedance.ee.bear.bizwidget.shareview.ShareType;
import com.bytedance.ee.bear.share.bitableshare.BitableShareFragment;
import com.bytedance.ee.bear.share.export.AbstractC11003a;
import com.bytedance.ee.bear.share.export.AbstractC11005b;
import com.bytedance.ee.bear.share.export.ShareParams;
import com.bytedance.ee.bear.share.externalshare.C11007b;
import com.bytedance.ee.bear.share.newshare.BaseShareFragment;
import com.bytedance.ee.bear.share.newshare.ShareDocFragment;
import com.bytedance.ee.bear.share.newshare.ShareFolderFragment;
import com.bytedance.ee.log.C13479a;
import java.io.File;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.share.e */
public class C10999e implements AbstractC11003a {

    /* renamed from: a */
    private static BaseShareFragment f29624a;

    C10999e() {
    }

    @Override // com.bytedance.ee.bear.share.export.AbstractC11003a
    /* renamed from: e */
    public void mo41769e() {
        BaseShareFragment aVar = f29624a;
        if (aVar != null) {
            aVar.mo41706o();
        }
    }

    @Override // com.bytedance.ee.bear.share.export.AbstractC11003a
    /* renamed from: a */
    public AbstractC11003a.AbstractC11004a mo41762a() {
        return new AbstractC11003a.AbstractC11004a() {
            /* class com.bytedance.ee.bear.share.C10999e.C110001 */

            @Override // com.bytedance.ee.bear.share.export.AbstractC11003a.AbstractC11004a
            /* renamed from: a */
            public boolean mo41777a() {
                return C11007b.m45863a();
            }

            @Override // com.bytedance.ee.bear.share.export.AbstractC11003a.AbstractC11004a
            /* renamed from: a */
            public String mo41770a(Context context, ShareType shareType) {
                return C11007b.m45866b(context, shareType);
            }

            @Override // com.bytedance.ee.bear.share.export.AbstractC11003a.AbstractC11004a
            /* renamed from: a */
            public void mo41773a(Context context, File file, AbstractC11005b bVar) {
                C11007b.m45857a(context, file, bVar);
            }

            @Override // com.bytedance.ee.bear.share.export.AbstractC11003a.AbstractC11004a
            /* renamed from: a */
            public void mo41774a(Context context, String str, AbstractC11005b bVar) {
                C11007b.m45858a(context, str, bVar);
            }

            @Override // com.bytedance.ee.bear.share.export.AbstractC11003a.AbstractC11004a
            /* renamed from: a */
            public void mo41772a(Context context, ShareType shareType, String str, AbstractC11005b bVar) {
                C11007b.m45856a(context, shareType, str, bVar);
            }

            @Override // com.bytedance.ee.bear.share.export.AbstractC11003a.AbstractC11004a
            /* renamed from: a */
            public void mo41771a(Context context, ShareType shareType, File file, String str, AbstractC11005b bVar) {
                C11007b.m45855a(context, shareType, file, str, bVar);
            }

            @Override // com.bytedance.ee.bear.share.export.AbstractC11003a.AbstractC11004a
            /* renamed from: a */
            public void mo41775a(boolean z, Context context, ShareType shareType, File file, AbstractC11005b bVar) {
                C11007b.m45859a(z, context, shareType, file, bVar);
            }

            @Override // com.bytedance.ee.bear.share.export.AbstractC11003a.AbstractC11004a
            /* renamed from: a */
            public void mo41776a(boolean z, Context context, ShareType shareType, String str, AbstractC11005b bVar) {
                C11007b.m45860a(z, context, shareType, str, bVar);
            }
        };
    }

    @Override // com.bytedance.ee.bear.share.export.AbstractC11003a
    /* renamed from: b */
    public void mo41766b() {
        if (f29624a != null) {
            C13479a.m54764b("ShareApiImpl", "showShareFragment()...");
            f29624a.mo41716y();
        }
    }

    @Override // com.bytedance.ee.bear.share.export.AbstractC11003a
    /* renamed from: c */
    public void mo41767c() {
        if (f29624a != null) {
            C13479a.m54764b("ShareApiImpl", "hideShareFragment()...");
            f29624a.mo41715x();
        }
    }

    @Override // com.bytedance.ee.bear.share.export.AbstractC11003a
    /* renamed from: d */
    public void mo41768d() {
        if (f29624a != null) {
            C13479a.m54764b("ShareApiImpl", "dismissShareFragment()...");
            f29624a.mo5513b();
            f29624a = null;
        }
    }

    @Override // com.bytedance.ee.bear.share.export.AbstractC11003a
    /* renamed from: a */
    public DialogInterface$OnCancelListenerC1021b mo41760a(ShareParams shareParams) {
        return ShareFolderFragment.m45655a(shareParams);
    }

    @Override // com.bytedance.ee.bear.share.export.AbstractC11003a
    /* renamed from: b */
    public DialogInterface$OnCancelListenerC1021b mo41765b(ShareParams shareParams) {
        return BitableShareFragment.m45716a(shareParams);
    }

    @Override // com.bytedance.ee.bear.share.export.AbstractC11003a
    /* renamed from: a */
    public void mo41763a(DialogInterface$OnCancelListenerC1021b bVar) {
        f29624a = (BaseShareFragment) bVar;
    }

    @Override // com.bytedance.ee.bear.share.export.AbstractC11003a
    /* renamed from: a */
    public void mo41764a(String str, String str2) {
        ShareAnalytic.m45772a(str, str2);
    }

    @Override // com.bytedance.ee.bear.share.export.AbstractC11003a
    /* renamed from: a */
    public DialogInterface$OnCancelListenerC1021b mo41761a(ShareParams shareParams, Bundle bundle) {
        return ShareDocFragment.m45635a(shareParams, bundle);
    }
}
