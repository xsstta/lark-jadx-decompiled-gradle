package com.ss.android.lark.mail.impl.settings.subsetting.autoreply;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.lark.pb.email.client.v1.DocsPermissionConfig;
import com.bytedance.lark.pb.email.client.v1.MailUpdateAccountResponse;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.compose.AbstractC41999i;
import com.ss.android.lark.mail.impl.compose.C41974f;
import com.ss.android.lark.mail.impl.compose.C41988g;
import com.ss.android.lark.mail.impl.compose.attachment.LocalAttachment;
import com.ss.android.lark.mail.impl.compose.image.AbstractC42000a;
import com.ss.android.lark.mail.impl.compose.image.C42008f;
import com.ss.android.lark.mail.impl.compose.image.UploadImage;
import com.ss.android.lark.mail.impl.entity.EmailAutoReply;
import com.ss.android.lark.mail.impl.entity.MailImage;
import com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.C42226b;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42262e;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.settings.subsetting.autoreply.AbstractC43504f;
import com.ss.android.lark.mail.impl.settings.subsetting.autoreply.C43496d;
import com.ss.android.lark.mail.impl.utils.C43785p;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.recipient.SearchAddress;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.autoreply.d */
public class C43496d extends BasePresenter<AbstractC43504f.AbstractC43505a, EditAutoReplyView, AbstractC43504f.AbstractC43506b.AbstractC43507a> implements C41974f.AbstractC41985a {

    /* renamed from: a */
    public List<MailImage> f110463a = new ArrayList();

    /* renamed from: b */
    public HashMap<String, AbstractC42000a<UploadImage>> f110464b;

    /* renamed from: c */
    public HashMap<String, AbstractC42000a<UploadImage>> f110465c;

    /* renamed from: d */
    C42008f f110466d = new C42008f();

    /* renamed from: e */
    public Activity f110467e;

    @Override // com.ss.android.lark.mail.impl.compose.C41974f.AbstractC41985a
    /* renamed from: a */
    public void mo150847a(String str, DocsPermissionConfig.Action action) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC43504f.AbstractC43506b.AbstractC43507a createViewDelegate() {
        return new AbstractC43504f.AbstractC43506b.AbstractC43507a() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.C43496d.C434971 */

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
            /* renamed from: a */
            public void mo150893a(MailImage mailImage) {
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
            /* renamed from: a */
            public void mo150894a(SearchAddress searchAddress) {
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
            /* renamed from: a */
            public void mo150896a(String str, DocsPermissionConfig.Action action) {
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
            /* renamed from: b */
            public void mo150905b(SearchAddress searchAddress) {
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
            /* renamed from: d */
            public void mo150915d(String str) {
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
            /* renamed from: e */
            public void mo150918e(String str) {
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
            /* renamed from: w */
            public String mo150940w() {
                return null;
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
            /* renamed from: g */
            public List<MailImage> mo150922g() {
                return C43496d.this.f110463a;
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
            /* renamed from: h */
            public List<LocalAttachment> mo150924h() {
                return new ArrayList();
            }

            @Override // com.ss.android.lark.mail.impl.settings.subsetting.autoreply.AbstractC43504f.AbstractC43506b.AbstractC43507a
            /* renamed from: a */
            public EmailAutoReply mo155367a() {
                return ((AbstractC43504f.AbstractC43505a) C43496d.this.getModel()).mo155356a();
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
            /* renamed from: t */
            public void mo150937t() {
                Log.m165389i("EditAutoReplyPresente", "onWebViewRenderDone");
                ((EditAutoReplyView) C43496d.this.getView()).mo155327a();
            }

            @Override // com.ss.android.lark.mail.impl.settings.subsetting.autoreply.AbstractC43504f.AbstractC43506b.AbstractC43507a
            /* renamed from: c */
            public String[] mo155370c() {
                ArrayList arrayList = new ArrayList();
                if (!CollectionUtils.isEmpty(C43496d.this.f110465c)) {
                    arrayList.addAll(C43496d.this.f110465c.keySet());
                }
                if (!CollectionUtils.isEmpty(C43496d.this.f110464b)) {
                    arrayList.addAll(C43496d.this.f110464b.keySet());
                }
                return (String[]) arrayList.toArray(new String[0]);
            }

            @Override // com.ss.android.lark.mail.impl.settings.subsetting.autoreply.AbstractC43504f.AbstractC43506b.AbstractC43507a
            /* renamed from: d */
            public void mo155371d() {
                if (!CollectionUtils.isEmpty(C43496d.this.f110464b)) {
                    for (AbstractC42000a<UploadImage> aVar : C43496d.this.f110464b.values()) {
                        aVar.mo150778c();
                    }
                    C43496d.this.f110464b.clear();
                }
                if (!CollectionUtils.isEmpty(C43496d.this.f110465c)) {
                    C43496d.this.f110465c.clear();
                }
            }

            @Override // com.ss.android.lark.mail.impl.settings.subsetting.autoreply.AbstractC43504f.AbstractC43506b.AbstractC43507a
            /* renamed from: b */
            public boolean mo155369b() {
                if (!CollectionUtils.isEmpty(C43496d.this.f110464b) || !CollectionUtils.isEmpty(C43496d.this.f110465c)) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
            /* renamed from: b */
            public void mo150909b(List<MailImage> list) {
                if (C43496d.this.f110463a != null && CollectionUtils.isNotEmpty(list)) {
                    C43496d.this.f110463a.removeAll(list);
                }
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
            /* renamed from: g */
            public void mo150923g(String str) {
                AbstractC42000a<UploadImage> remove;
                Log.m165389i("EditAutoReplyPresente", "deleteImage");
                if (TextUtils.isEmpty(str)) {
                    Log.m165383e("EditAutoReplyPresente", "deleteImage empty uuid");
                    return;
                }
                boolean a = C43496d.this.mo155363a(str);
                boolean z = true;
                if (!(a || C43496d.this.f110464b == null || (remove = C43496d.this.f110464b.remove(str)) == null)) {
                    remove.mo150778c();
                    a = true;
                }
                if (!a && C43496d.this.f110463a != null) {
                    Iterator<MailImage> it = C43496d.this.f110463a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        MailImage next = it.next();
                        if (TextUtils.equals(next.mo151481g(), str)) {
                            C43496d.this.f110463a.remove(next);
                            break;
                        }
                    }
                }
                z = a;
                if (z) {
                    Log.m165389i("EditAutoReplyPresente", "deleteImage success");
                } else {
                    Log.m165389i("EditAutoReplyPresente", "deleteImage fail");
                }
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
            /* renamed from: a */
            public void mo150900a(List<MailImage> list) {
                C43496d.this.mo155362a(list);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m172680a(String str, AbstractC42000a aVar) {
                C43496d.this.mo155360a(str, aVar);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m172681b(String str, AbstractC42000a aVar) {
                C43496d.this.mo155360a(str, aVar);
                C42330c.m169079f("image");
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
            /* renamed from: b */
            public void mo150908b(String str, String str2) {
                Log.m165389i("EditAutoReplyPresente", "uploadImage");
                C42226b.m168638a().mo152308a("mail_dev_upload_image_cost_time");
                C42187a.m168542i();
                C43496d.this.f110466d.mo151007a(str, str2, C43785p.m173539a("", ((AbstractC43504f.AbstractC43505a) C43496d.this.getModel()).mo155358b()), C43496d.this.mo155364b(), new C42008f.AbstractC42009a() {
                    /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.$$Lambda$d$1$J1bg29roWTHa08pIgh_y6sYLds */

                    @Override // com.ss.android.lark.mail.impl.compose.image.C42008f.AbstractC42009a
                    public final void addImageUploadingTask(String str, AbstractC42000a aVar) {
                        C43496d.C434971.this.m172681b((C43496d.C434971) str, (String) aVar);
                    }
                });
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
            /* renamed from: a */
            public void mo150898a(final String str, final String str2) {
                final AbstractC42000a<UploadImage> aVar;
                Log.m165389i("EditAutoReplyPresente", "retryUploadImage");
                if (TextUtils.isEmpty(str2)) {
                    Log.m165383e("EditAutoReplyPresente", "retryUploadImage empty uuid");
                    return;
                }
                if (C43496d.this.f110465c == null) {
                    aVar = null;
                } else {
                    aVar = C43496d.this.f110465c.get(str2);
                }
                if (aVar == null) {
                    Log.m165383e("EditAutoReplyPresente", "retryUploadImage upload task not found");
                } else {
                    ((EditAutoReplyView) C43496d.this.getView()).mo155328a(new DialogInterface.OnClickListener() {
                        /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.C43496d.C434971.DialogInterface$OnClickListenerC434981 */

                        public void onClick(DialogInterface dialogInterface, int i) {
                            if (i == 0) {
                                C43496d.this.mo155363a(str2);
                                C43496d.this.mo155360a(str2, aVar);
                                ((EditAutoReplyView) C43496d.this.getView()).mo155334a(str, str2);
                                ((EditAutoReplyView) C43496d.this.getView()).mo155333a(str2, 0);
                                aVar.mo150989f();
                            } else if (i == 1) {
                                ((EditAutoReplyView) C43496d.this.getView()).mo155337a(new String[]{str});
                                C43496d.this.mo155363a(str2);
                            }
                        }
                    });
                }
            }

            @Override // com.ss.android.lark.mail.impl.settings.subsetting.autoreply.AbstractC43504f.AbstractC43506b.AbstractC43507a
            /* renamed from: a */
            public void mo155368a(EmailAutoReply emailAutoReply, List<MailImage> list, AbstractC41870b<MailUpdateAccountResponse> bVar) {
                EmailAutoReply.C42059a aVar;
                EmailAutoReply a = ((AbstractC43504f.AbstractC43505a) C43496d.this.getModel()).mo155356a();
                if (a != null) {
                    aVar = new EmailAutoReply.C42059a(a);
                    aVar.mo151156b(emailAutoReply.mo151137e());
                } else {
                    aVar = new EmailAutoReply.C42059a(emailAutoReply);
                }
                C43496d.this.mo155362a(list);
                aVar.mo151159d(C43496d.this.mo155365b(emailAutoReply.mo151143i()));
                aVar.mo151152a(C43496d.this.f110463a);
                ((AbstractC43504f.AbstractC43505a) C43496d.this.getModel()).mo155357a(aVar.mo151154a(), bVar);
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
            /* renamed from: a */
            public void mo150899a(String str, String str2, String str3, String str4, int i) {
                Log.m165389i("EditAutoReplyPresente", "onImageDomChange");
                C42226b.m168638a().mo152308a("mail_dev_upload_image_cost_time");
                C42187a.m168542i();
                C43496d.this.f110466d.mo151006a(C43496d.this.f110467e, str, str2, str3, C43785p.m173539a("", ((AbstractC43504f.AbstractC43505a) C43496d.this.getModel()).mo155358b()), str4, C43496d.this.mo155364b(), new C42008f.AbstractC42009a() {
                    /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.$$Lambda$d$1$Uwp6FhSRCR2MOeT6TzdIXblG3UI */

                    @Override // com.ss.android.lark.mail.impl.compose.image.C42008f.AbstractC42009a
                    public final void addImageUploadingTask(String str, AbstractC42000a aVar) {
                        C43496d.C434971.this.m172680a((C43496d.C434971) str, (String) aVar);
                    }
                }, i);
            }
        };
    }

    /* renamed from: b */
    public AbstractC41999i<UploadImage> mo155364b() {
        return new AbstractC41999i<UploadImage>() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.C43496d.C434992 */

            @Override // com.ss.android.lark.mail.impl.compose.AbstractC41999i
            /* renamed from: a */
            public void mo150871a() {
                ((C42262e) C42344d.m169091a(C42262e.class, C43496d.this.f110467e)).mo152368a();
            }

            @Override // com.ss.android.lark.mail.impl.compose.AbstractC41999i
            /* renamed from: a */
            public void mo150872a(String str, int i) {
                Log.m165379d("EditAutoReplyPresente", "onProgressUpdate progress:" + i + " uuid:" + str);
                ((EditAutoReplyView) C43496d.this.getView()).mo155333a(str, i);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m172703a(boolean z, String str, UploadImage uploadImage) {
                String str2;
                long j;
                String str3;
                if (z) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("uuid", str);
                    } catch (JSONException e) {
                        Log.m165384e("EditAutoReplyPresente", "generateImageUploadCallback updateProgress success", e);
                    }
                    C42226b.m168638a().mo152309a("mail_dev_upload_image_cost_time", jSONObject);
                } else {
                    C42226b.m168638a().mo152310b("mail_dev_upload_image_cost_time");
                }
                EditAutoReplyView editAutoReplyView = (EditAutoReplyView) C43496d.this.getView();
                if (z) {
                    str2 = uploadImage.mo151480f();
                } else {
                    str2 = null;
                }
                if (uploadImage == null) {
                    j = 0;
                } else {
                    j = uploadImage.mo151482h();
                }
                if (uploadImage == null) {
                    str3 = "";
                } else {
                    str3 = uploadImage.mo151477e();
                }
                editAutoReplyView.mo155336a(str, z, str2, j, str3);
                C43496d.this.mo155361a(str, z, uploadImage);
            }

            /* renamed from: a */
            public void mo150874a(String str, UploadImage uploadImage, boolean z, long j) {
                Log.m165379d("EditAutoReplyPresente", "generateImageUploadCallback " + z + " uuid " + str);
                C43849u.m173826a(new Runnable(z, str, uploadImage) {
                    /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.$$Lambda$d$2$BgiAL0PVodku2RaoYHZ9nIVJQKA */
                    public final /* synthetic */ boolean f$1;
                    public final /* synthetic */ String f$2;
                    public final /* synthetic */ UploadImage f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void run() {
                        C43496d.C434992.this.m172703a(this.f$1, this.f$2, this.f$3);
                    }
                });
                C42187a.m168523d(z);
            }
        };
    }

    /* renamed from: c */
    public boolean mo155366c() {
        return ((EditAutoReplyView) getView()).mo155341e();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C41988g.m166978i().mo153471d();
        C41988g.m166972c();
        super.destroy();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f110463a = ((AbstractC43504f.AbstractC43505a) getModel()).mo155356a().mo151141h();
        m172670d();
    }

    /* renamed from: d */
    private void m172670d() {
        String str;
        if (((AbstractC43504f.AbstractC43505a) getModel()).mo155356a() != null) {
            str = ((AbstractC43504f.AbstractC43505a) getModel()).mo155356a().mo151143i();
        } else {
            str = "";
        }
        ((EditAutoReplyView) getView()).mo155330a(new ComposeWebView.C42751a.C42752a().mo153533a(str).mo153534a(this.f110463a).mo153535a());
    }

    /* renamed from: b */
    public String mo155365b(String str) {
        for (int size = this.f110463a.size() - 1; size >= 0; size--) {
            if (!m172669a(str, this.f110463a.get(size))) {
                this.f110463a.remove(size);
            }
        }
        return str;
    }

    /* renamed from: a */
    public void mo155362a(List<MailImage> list) {
        Log.m165389i("EditAutoReplyPresente", "addImageIfNeeded");
        if (CollectionUtils.isEmpty(list)) {
            Log.m165383e("EditAutoReplyPresente", "addImageIfNeeded empty image list");
            return;
        }
        HashMap hashMap = new HashMap();
        for (MailImage mailImage : this.f110463a) {
            if (mailImage != null) {
                hashMap.put(mailImage.mo151481g(), mailImage);
            }
        }
        for (MailImage mailImage2 : list) {
            if (mailImage2 != null && !TextUtils.isEmpty(mailImage2.mo151481g()) && ((MailImage) hashMap.get(mailImage2.mo151481g())) == null) {
                this.f110463a.add(mailImage2);
                hashMap.put(mailImage2.mo151481g(), mailImage2);
            }
        }
    }

    /* renamed from: a */
    public boolean mo155363a(String str) {
        if (CollectionUtils.isEmpty(this.f110465c) || this.f110465c.remove(str) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo155360a(String str, AbstractC42000a<UploadImage> aVar) {
        if (this.f110464b == null) {
            this.f110464b = new HashMap<>(8);
        }
        this.f110464b.put(str, aVar);
    }

    /* renamed from: a */
    private boolean m172669a(String str, MailImage mailImage) {
        if (mailImage == null || TextUtils.isEmpty(mailImage.mo151481g())) {
            return false;
        }
        if (!str.contains("cid:" + mailImage.mo151481g() + "\"")) {
            if (str.contains(URLEncoder.encode("cid:" + mailImage.mo151481g() + "\""))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public C43496d(Activity activity, AbstractC43504f.AbstractC43505a aVar, EditAutoReplyView editAutoReplyView) {
        super(aVar, editAutoReplyView);
        this.f110467e = activity;
    }

    /* renamed from: a */
    public void mo155361a(String str, boolean z, MailImage mailImage) {
        AbstractC42000a<UploadImage> remove;
        if (!TextUtils.isEmpty(str) && (remove = this.f110464b.remove(str)) != null) {
            if (z) {
                this.f110463a.add(mailImage);
                return;
            }
            if (this.f110465c == null) {
                this.f110465c = new HashMap<>(8);
            }
            this.f110465c.put(str, remove);
        }
    }
}
