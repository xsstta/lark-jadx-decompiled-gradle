package com.ss.android.lark.mail.impl.compose.attachment;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.lark.pb.email.client.v1.MailDeleteLargeFileResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.compose.C41923a;
import com.ss.android.lark.mail.impl.compose.attachment.C41941c;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.compose.attachment.b */
public class C41937b implements C41941c.AbstractC41945a {

    /* renamed from: a */
    private final String f106439a = "AttachmentViewController";

    /* renamed from: b */
    private Context f106440b;

    /* renamed from: c */
    private AbstractC41940a f106441c;

    /* renamed from: d */
    private LinearLayout f106442d;

    /* renamed from: e */
    private HashMap<String, C41941c> f106443e;

    /* renamed from: f */
    private List<SoftReference<C41941c>> f106444f;

    /* renamed from: g */
    private LinearLayout.LayoutParams f106445g;

    /* renamed from: h */
    private LinearLayout.LayoutParams f106446h;

    /* renamed from: i */
    private C41923a f106447i;

    /* renamed from: j */
    private boolean f106448j;

    /* renamed from: com.ss.android.lark.mail.impl.compose.attachment.b$a */
    public interface AbstractC41940a {
        /* renamed from: d */
        void mo150609d(String str);

        /* renamed from: e */
        void mo150612e(String str);

        /* renamed from: f */
        void mo150616f(String str);

        /* renamed from: l */
        void mo150627l();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m166729a(DialogInterface dialogInterface, int i) {
    }

    /* renamed from: a */
    private C41941c m166728a() {
        if (!CollectionUtils.isEmpty(this.f106444f)) {
            Iterator<SoftReference<C41941c>> it = this.f106444f.iterator();
            while (it.hasNext()) {
                it.remove();
                C41941c cVar = it.next().get();
                if (cVar != null) {
                    return cVar;
                }
            }
        }
        return new C41941c(this.f106440b, this, this.f106448j);
    }

    @Override // com.ss.android.lark.mail.impl.compose.attachment.C41941c.AbstractC41945a
    /* renamed from: b */
    public void mo150785b(String str) {
        Log.m165389i("AttachmentViewController", "onErrorButtonClick");
        if (this.f106441c != null && !TextUtils.isEmpty(str)) {
            this.f106441c.mo150612e(str);
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.attachment.C41941c.AbstractC41945a
    /* renamed from: c */
    public void mo150786c(String str) {
        Log.m165389i("AttachmentViewController", "onOpenAttachment");
        if (this.f106441c != null && !TextUtils.isEmpty(str)) {
            this.f106441c.mo150616f(str);
        }
    }

    /* renamed from: d */
    private void m166733d(String str) {
        Log.m165389i("AttachmentViewController", "onDeleteAttachment");
        if (!CollectionUtils.isEmpty(this.f106443e)) {
            C41941c remove = this.f106443e.remove(str);
            if (remove != null) {
                this.f106442d.removeView(remove.mo150789a());
                if (this.f106444f == null) {
                    this.f106444f = new ArrayList();
                }
                this.f106444f.add(new SoftReference<>(remove));
            }
            if (this.f106443e.size() == 0) {
                this.f106442d.setVisibility(8);
            }
        }
        if (this.f106441c != null && !TextUtils.isEmpty(str)) {
            this.f106441c.mo150609d(str);
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.attachment.C41941c.AbstractC41945a
    /* renamed from: a */
    public void mo150780a(String str) {
        Log.m165389i("AttachmentViewController", "onDeleteButtonClick");
        if (!CollectionUtils.isEmpty(this.f106443e)) {
            C41941c cVar = this.f106443e.get(str);
            if (cVar == null || cVar.mo150793b() == null || !cVar.mo150793b().mo151239o() || this.f106448j) {
                m166733d(str);
                return;
            }
            String j = cVar.mo150793b().mo151234j();
            m166733d(str);
            this.f106447i.mo150733a(this.f106440b, $$Lambda$b$b1T_DxHHiNHetFHtmdOIrmt3x4.INSTANCE, new DialogInterface.OnClickListener(j) {
                /* class com.ss.android.lark.mail.impl.compose.attachment.$$Lambda$b$OhDDqrY3xdIdnDEdqB0Ywm0l47A */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C41937b.this.m166730a((C41937b) this.f$1, (String) dialogInterface, (DialogInterface) i);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo150784a(boolean z) {
        if (!CollectionUtils.isEmpty(this.f106443e)) {
            for (C41941c cVar : this.f106443e.values()) {
                cVar.mo150792a(z);
            }
        }
    }

    /* renamed from: a */
    private void m166731a(String str, AbstractC41870b<MailDeleteLargeFileResponse> bVar) {
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            m166732a(arrayList, bVar);
        }
    }

    /* renamed from: a */
    private void m166732a(List<String> list, final AbstractC41870b<MailDeleteLargeFileResponse> bVar) {
        C42176e.m168344a().mo152238b(list, new IGetDataCallback<MailDeleteLargeFileResponse>() {
            /* class com.ss.android.lark.mail.impl.compose.attachment.C41937b.C419392 */

            /* renamed from: a */
            public void onSuccess(MailDeleteLargeFileResponse mailDeleteLargeFileResponse) {
                bVar.onSuccess(mailDeleteLargeFileResponse);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                bVar.onError(errorResult);
            }
        });
    }

    /* renamed from: a */
    public void mo150782a(ArrayList<LocalAttachment> arrayList, boolean z) {
        this.f106442d.removeAllViews();
        for (C41941c cVar : this.f106443e.values()) {
            if (this.f106444f == null) {
                this.f106444f = new ArrayList();
            }
            this.f106444f.add(new SoftReference<>(cVar));
        }
        this.f106443e.clear();
        mo150783a(arrayList, z, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m166730a(final String str, DialogInterface dialogInterface, int i) {
        m166731a(str, new AbstractC41870b<MailDeleteLargeFileResponse>() {
            /* class com.ss.android.lark.mail.impl.compose.attachment.C41937b.C419381 */

            @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
            /* renamed from: a */
            public void mo150434a(ErrorResult errorResult) {
                MailToast.m173697a((int) R.string.Mail_Compose_LFDeleteFailed);
                C42209j.m168612a("send_compose_largefile_delete_fail", "toast");
            }

            /* renamed from: a */
            public void mo150435a(MailDeleteLargeFileResponse mailDeleteLargeFileResponse) {
                if (mailDeleteLargeFileResponse == null || mailDeleteLargeFileResponse.success_tokens == null || !mailDeleteLargeFileResponse.success_tokens.contains(str)) {
                    MailToast.m173697a((int) R.string.Mail_Compose_LFDeleteFailed);
                    C42209j.m168612a("send_compose_largefile_delete_fail", "toast");
                }
            }
        });
    }

    public C41937b(Context context, LinearLayout linearLayout, AbstractC41940a aVar) {
        this.f106440b = context;
        this.f106442d = linearLayout;
        this.f106441c = aVar;
        this.f106443e = new HashMap<>(8);
        this.f106448j = C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.largefile.phase2");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, context.getResources().getDimensionPixelSize(R.dimen.mail_compose_attachment_item_view_height));
        this.f106445g = layoutParams;
        layoutParams.setMargins(context.getResources().getDimensionPixelSize(R.dimen.mail_compose_attachment_item_view_vertical_padding), 0, context.getResources().getDimensionPixelSize(R.dimen.mail_compose_attachment_item_view_vertical_padding), 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, context.getResources().getDimensionPixelSize(R.dimen.mail_compose_attachment_item_view_height));
        this.f106446h = layoutParams2;
        layoutParams2.setMargins(context.getResources().getDimensionPixelSize(R.dimen.mail_compose_attachment_item_view_vertical_padding), context.getResources().getDimensionPixelSize(R.dimen.mail_compose_attachment_item_view_bottom_margin), context.getResources().getDimensionPixelSize(R.dimen.mail_compose_attachment_item_view_vertical_padding), 0);
        this.f106447i = new C41923a(context);
    }

    /* renamed from: a */
    public void mo150783a(ArrayList<LocalAttachment> arrayList, boolean z, boolean z2) {
        LinearLayout.LayoutParams layoutParams;
        if (CollectionUtils.isEmpty(arrayList)) {
            if (this.f106443e.size() == 0) {
                this.f106442d.setVisibility(8);
            }
            Log.m165389i("AttachmentViewController", "appendAttachmentsToViewController list is empty");
            return;
        }
        this.f106442d.setVisibility(0);
        Iterator<LocalAttachment> it = arrayList.iterator();
        while (it.hasNext()) {
            LocalAttachment next = it.next();
            if (next != null) {
                C41941c a = m166728a();
                a.mo150792a(z);
                LinearLayout linearLayout = this.f106442d;
                View a2 = a.mo150790a(next, next.mo150766c());
                if (this.f106442d.getChildCount() > 0) {
                    layoutParams = this.f106446h;
                } else {
                    layoutParams = this.f106445g;
                }
                linearLayout.addView(a2, layoutParams);
                this.f106443e.put(next.mo150760a(), a);
            }
        }
        if (z2) {
            this.f106441c.mo150627l();
        }
    }

    /* renamed from: a */
    public void mo150781a(String str, int i, int i2, long j) {
        C41941c cVar = this.f106443e.get(str);
        if (cVar != null) {
            cVar.mo150791a(i, i2, j);
        }
    }
}
