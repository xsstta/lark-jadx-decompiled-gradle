package com.ss.android.lark.contact.impl.p1761f;

import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.contact.v2.PushContactApplicationBannerAffectEvent;
import com.bytedance.lark.pb.im.v1.GetChatApplicationBadgeResponse;
import com.bytedance.lark.pb.im.v1.PushChatApplications;
import com.bytedance.lark.pb.im.v1.PushContact;
import com.bytedance.lark.pb.im.v1.PushContactToken;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.core.api.AbstractC29543ag;
import com.ss.android.lark.contact.dto.ChatApplication;
import com.ss.android.lark.contact.feat.entity.C35468a;
import com.ss.android.lark.contact.feat.newContact.IPushNewContactBadgeListener;
import com.ss.android.lark.contact.impl.entity.ExternalContact;
import com.ss.android.lark.contact.impl.p1760e.C35874a;
import com.ss.android.lark.contact.impl.p1760e.C35877c;
import com.ss.android.lark.contact.p1734c.AbstractC35384b;
import com.ss.android.lark.contact.p1734c.AbstractC35385c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.contact.impl.f.d */
public class C35890d {

    /* renamed from: a */
    public List<AbstractC35384b> f92822a;

    /* renamed from: b */
    public List<AbstractC35904b> f92823b;

    /* renamed from: c */
    public List<IPushNewContactBadgeListener> f92824c;

    /* renamed from: d */
    public List<AbstractC35385c> f92825d;

    /* renamed from: e */
    private List<AbstractC29543ag> f92826e;

    /* renamed from: com.ss.android.lark.contact.impl.f.d$a */
    private static class C35903a {

        /* renamed from: a */
        public static final C35890d f92844a = new C35890d();
    }

    /* renamed from: com.ss.android.lark.contact.impl.f.d$b */
    public interface AbstractC35904b {
        void onPushContact(ExternalContact externalContact);
    }

    /* renamed from: com.ss.android.lark.contact.impl.f.d$c */
    public interface AbstractC35905c extends AbstractC35904b {
        /* renamed from: a */
        void mo130820a(C35468a aVar);
    }

    /* renamed from: a */
    public static final C35890d m140654a() {
        return C35903a.f92844a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m140656b() {
        C53248k.m205912a().mo181696a(Command.PUSH_CONTACT_APPLICATION_BANNER_AFFECT_EVENT);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m140657c() {
        C53248k.m205912a().mo181697a(Command.PUSH_CONTACT_APPLICATION_BANNER_AFFECT_EVENT, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.contact.impl.p1761f.$$Lambda$d3G5ia7EF4phgUxt7Zc57nSgxU */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C35890d.this.mo132128c(bArr, str, z, z2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m140658d() {
        C53248k.m205912a().mo181696a(Command.PUSH_CONTACT);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m140659e() {
        C53248k.m205912a().mo181697a(Command.PUSH_CONTACT, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.contact.impl.p1761f.$$Lambda$GSW7hWh1p4dAY40G3hUjfoguac */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C35890d.this.mo132127b(bArr, str, z, z2);
            }
        });
    }

    private C35890d() {
        this.f92822a = new CopyOnWriteArrayList();
        this.f92823b = new CopyOnWriteArrayList();
        this.f92826e = new CopyOnWriteArrayList();
        this.f92824c = new CopyOnWriteArrayList();
        this.f92825d = new CopyOnWriteArrayList();
    }

    /* renamed from: b */
    public void mo132123b(AbstractC29543ag agVar) {
        C53246j.m205911b(this.f92826e, agVar, $$Lambda$d$_S_pc7L2AVhD77LtYvoQnBfAyw.INSTANCE);
    }

    /* renamed from: a */
    public void mo132117a(AbstractC29543ag agVar) {
        C53246j.m205910a(this.f92826e, agVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.contact.impl.p1761f.$$Lambda$d$8yyN3AUtNAfsGteJFD_cj7H7AE */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public final void handle() {
                C35890d.this.m140657c();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m140655a(PushContactApplicationBannerAffectEvent pushContactApplicationBannerAffectEvent) {
        for (AbstractC29543ag agVar : this.f92826e) {
            agVar.onPushContactStateChanged(pushContactApplicationBannerAffectEvent);
        }
    }

    /* renamed from: b */
    public void mo132124b(AbstractC35384b bVar) {
        C53246j.m205911b(this.f92822a, bVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35890d.C358964 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181696a(Command.PUSH_CHAT_APPLICATIONS);
            }
        });
    }

    /* renamed from: a */
    public void mo132118a(AbstractC35384b bVar) {
        C53246j.m205910a(this.f92822a, bVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35890d.C358943 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181697a(Command.PUSH_CHAT_APPLICATIONS, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.lark.contact.impl.p1761f.C35890d.C358943.C358951 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        C35890d.this.mo132122a(bArr, str, z, z2);
                    }
                });
            }
        });
    }

    /* renamed from: b */
    public void mo132125b(AbstractC35385c cVar) {
        C53246j.m205911b(this.f92825d, cVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35890d.C358996 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181696a(Command.PUSH_CONTACT_TOKEN);
            }
        });
    }

    /* renamed from: a */
    public void mo132119a(AbstractC35385c cVar) {
        C53246j.m205910a(this.f92825d, cVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35890d.C358975 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181697a(Command.PUSH_CONTACT_TOKEN, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.lark.contact.impl.p1761f.C35890d.C358975.C358981 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        C35890d.this.mo132129d(bArr, str, z, z2);
                    }
                });
            }
        });
    }

    /* renamed from: b */
    public void mo132126b(AbstractC35904b bVar) {
        C53246j.m205911b(this.f92823b, bVar, $$Lambda$d$lESauP1DnDhduohLCfyuNE_9QBo.INSTANCE);
    }

    /* renamed from: a */
    public void mo132120a(IPushNewContactBadgeListener aVar) {
        C53246j.m205910a(this.f92824c, aVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35890d.C358911 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181697a(Command.PUSH_CHAT_APPLICATION_BADGE, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.lark.contact.impl.p1761f.C35890d.C358911.C358921 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        C35890d.this.mo132130e(bArr, str, z, z2);
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public void mo132121a(AbstractC35904b bVar) {
        C53246j.m205910a(this.f92823b, bVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.contact.impl.p1761f.$$Lambda$d$Jdv0frZoVinZrJlvYIh5m4NB3kc */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public final void handle() {
                C35890d.this.m140659e();
            }
        });
    }

    /* renamed from: d */
    public void mo132129d(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            final PushContactToken decode = PushContactToken.ADAPTER.decode(bArr);
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.contact.impl.p1761f.C35890d.RunnableC359029 */

                public void run() {
                    for (AbstractC35385c cVar : C35890d.this.f92825d) {
                        cVar.mo130262a(decode.token);
                    }
                }
            });
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }

    /* renamed from: e */
    public void mo132130e(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            final GetChatApplicationBadgeResponse decode = GetChatApplicationBadgeResponse.ADAPTER.decode(bArr);
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.contact.impl.p1761f.C35890d.RunnableC358932 */

                public void run() {
                    for (IPushNewContactBadgeListener aVar : C35890d.this.f92824c) {
                        aVar.mo130722a(decode.friend_badge.intValue());
                    }
                }
            });
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }

    /* renamed from: c */
    public void mo132128c(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            PushContactApplicationBannerAffectEvent decode = PushContactApplicationBannerAffectEvent.ADAPTER.decode(bArr);
            if (decode == null) {
                Log.m165397w("ContactPush", "onPushContactV2 externalContact is null");
                return;
            }
            Log.m165379d("ContactPush", "onPushContactV2:" + decode.toString());
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable(decode) {
                /* class com.ss.android.lark.contact.impl.p1761f.$$Lambda$d$nkb6GjEjuhSszRhuVwvSP6Zvy0 */
                public final /* synthetic */ PushContactApplicationBannerAffectEvent f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C35890d.this.m140655a((C35890d) this.f$1);
                }
            });
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }

    /* renamed from: b */
    public void mo132127b(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            PushContact decode = PushContact.ADAPTER.decode(bArr);
            final ExternalContact a = C35877c.m140600a(decode.contact);
            final C35468a a2 = C35468a.m138741a(decode.contact_info);
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.contact.impl.p1761f.C35890d.RunnableC359018 */

                public void run() {
                    for (AbstractC35904b bVar : C35890d.this.f92823b) {
                        bVar.onPushContact(a);
                        if (bVar instanceof AbstractC35905c) {
                            ((AbstractC35905c) bVar).mo130820a(a2);
                        }
                    }
                }
            });
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }

    /* renamed from: a */
    public void mo132122a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            PushChatApplications decode = PushChatApplications.ADAPTER.decode(bArr);
            C14928Entity entity = decode.entity;
            final List<ChatApplication> a = C35874a.m140581a(decode.applications);
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.contact.impl.p1761f.C35890d.RunnableC359007 */

                public void run() {
                    for (AbstractC35384b bVar : C35890d.this.f92822a) {
                        bVar.mo130261a(a);
                    }
                }
            });
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }
}
