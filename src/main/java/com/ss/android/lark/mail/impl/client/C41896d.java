package com.ss.android.lark.mail.impl.client;

import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.email.client.v1.MailGetMigrationDetailsResponse;
import com.bytedance.lark.pb.email.client.v1.MigrationFailureDetail;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.mail.impl.client.AbstractC41891b;
import com.ss.android.lark.mail.impl.entity.MigrationStage;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.client.d */
public class C41896d implements AbstractC41891b.AbstractC41892a {

    /* renamed from: a */
    private C1177w<List<MigrationFailureDetail>> f106252a = new C1177w<>();

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.mail.impl.client.AbstractC41891b.AbstractC41892a
    /* renamed from: a */
    public C1177w<List<MigrationFailureDetail>> mo150476a() {
        return this.f106252a;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        C42176e.m168344a().mo152241c(new AbstractC41870b<MailGetMigrationDetailsResponse>() {
            /* class com.ss.android.lark.mail.impl.client.C41896d.C418971 */

            @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
            /* renamed from: a */
            public void mo150434a(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void mo150435a(MailGetMigrationDetailsResponse mailGetMigrationDetailsResponse) {
                int i;
                int i2 = 0;
                if (mailGetMigrationDetailsResponse.stage == null) {
                    i = 0;
                } else {
                    i = mailGetMigrationDetailsResponse.stage.intValue();
                }
                MigrationStage convertToStage = MigrationStage.convertToStage(i);
                if (mailGetMigrationDetailsResponse.progress_pct != null) {
                    i2 = mailGetMigrationDetailsResponse.progress_pct.intValue();
                }
                ArrayList arrayList = new ArrayList();
                if (mailGetMigrationDetailsResponse.failureDetails != null) {
                    arrayList.addAll(mailGetMigrationDetailsResponse.failureDetails);
                }
                C41896d.this.mo150478a(convertToStage, i2, arrayList);
            }
        });
    }

    /* renamed from: a */
    public void mo150478a(MigrationStage migrationStage, int i, List<MigrationFailureDetail> list) {
        this.f106252a.mo5929b(list);
    }
}
