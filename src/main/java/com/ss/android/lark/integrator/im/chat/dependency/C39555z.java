package com.ss.android.lark.integrator.im.chat.dependency;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.AbstractC29542ad;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.chat.api.service.AbstractC32901c;
import com.ss.android.lark.chat.api.service.IChatService;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.p1660e.C33973b;
import com.ss.android.lark.dependency.AbstractC36461ah;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.dto.chat.ProfileSource;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.chat.AbstractC39484a;
import com.ss.android.lark.integrator.im.dependency.AbstractC39572n;
import com.ss.android.lark.listener.IPushAddFriendListener;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.z */
public class C39555z implements AbstractC36461ah {

    /* renamed from: d */
    private static final Map<IPushAddFriendListener, com.ss.android.lark.biz.core.api.IPushAddFriendListener> f101024d = new ConcurrentHashMap();

    /* renamed from: a */
    public final AbstractC29542ad f101025a = C39603g.m157159a().getCoreDependency().mo143379E();

    /* renamed from: b */
    private final IChatService f101026b = AbstractC39484a.m156004a().mo104251d();

    /* renamed from: c */
    private final AbstractC32901c f101027c = AbstractC39484a.m156004a().mo104256g();

    @Override // com.ss.android.lark.dependency.AbstractC36461ah
    /* renamed from: a */
    public void mo134439a(IPushAddFriendListener eVar) {
        if (eVar != null) {
            eVar.getClass();
            $$Lambda$t_8yiHOwChUO0b_NgHp2E6ICsTU r0 = new com.ss.android.lark.biz.core.api.IPushAddFriendListener() {
                /* class com.ss.android.lark.integrator.im.chat.dependency.$$Lambda$t_8yiHOwChUO0b_NgHp2E6ICsTU */

                @Override // com.ss.android.lark.biz.core.api.IPushAddFriendListener
                public final void onAddFriend(String str) {
                    IPushAddFriendListener.this.mo123083a(str);
                }
            };
            C39603g.m157159a().getCoreDependency().mo143466a(r0);
            f101024d.put(eVar, r0);
        }
    }

    @Override // com.ss.android.lark.dependency.AbstractC36461ah
    /* renamed from: b */
    public String mo134440b() {
        return C39603g.m157159a().getCoreDependency().mo143382H();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36461ah
    /* renamed from: c */
    public boolean mo134442c() {
        return C39603g.m157159a().getCoreDependency().am();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36461ah
    /* renamed from: a */
    public String mo134433a() {
        return C39603g.m157159a().getCoreDependency().mo143381G();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36461ah
    /* renamed from: a */
    public IPlusItem mo134432a(Chat chat) {
        return C39603g.m157159a().getCoreDependency().mo143406a(chat);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36461ah
    /* renamed from: b */
    public void mo134441b(IPushAddFriendListener eVar) {
        if (eVar != null) {
            AbstractC39572n coreDependency = C39603g.m157159a().getCoreDependency();
            Map<IPushAddFriendListener, com.ss.android.lark.biz.core.api.IPushAddFriendListener> map = f101024d;
            coreDependency.mo143536b(map.get(eVar));
            map.remove(eVar);
        }
    }

    /* renamed from: a */
    private void m156395a(ProfileSource profileSource, IGetDataCallback<ProfileSource> iGetDataCallback) {
        boolean z;
        if (profileSource.f94742b == 3) {
            z = true;
        } else {
            z = false;
        }
        $$Lambda$z$yy1JQs9ewu5RANmCiHlEIWxKIaI r1 = new C57865c.AbstractC57873d(profileSource, z) {
            /* class com.ss.android.lark.integrator.im.chat.dependency.$$Lambda$z$yy1JQs9ewu5RANmCiHlEIWxKIaI */
            public final /* synthetic */ ProfileSource f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return C39555z.this.m156394a(this.f$1, this.f$2);
            }
        };
        iGetDataCallback.getClass();
        C57865c.m224574a(r1, new C57865c.AbstractC57871b() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.$$Lambda$Ikya3B2IQHkApyytSfA06v51eiI */

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
            public final void consume(Object obj) {
                IGetDataCallback.this.onSuccess((ProfileSource) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ ProfileSource m156394a(ProfileSource profileSource, boolean z) {
        boolean z2;
        Chatter b;
        if (profileSource.f94746f == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && (b = this.f101027c.mo121203b(profileSource.f94744d)) != null) {
            profileSource.mo136058a(Boolean.valueOf(b.isBot()));
            if (z) {
                profileSource.mo136059a(b.getLocalizedName());
            }
        }
        if (TextUtils.isEmpty(profileSource.f94745e)) {
            if (z) {
                Chatter b2 = this.f101027c.mo121203b(profileSource.f94744d);
                if (b2 != null) {
                    profileSource.mo136059a(b2.getLocalizedName());
                }
            } else {
                Chat a = this.f101026b.mo120985a(profileSource.f94743c);
                if (a != null) {
                    profileSource.mo136059a(a.getName());
                }
            }
        }
        return profileSource;
    }

    @Override // com.ss.android.lark.dependency.AbstractC36461ah
    /* renamed from: a */
    public void mo134436a(final Context context, ProfileSource profileSource) {
        m156395a(profileSource, new IGetDataCallback<ProfileSource>() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39555z.C395561 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165397w("ProfileDependency", errorResult.getDisplayMsg());
            }

            /* renamed from: a */
            public void onSuccess(ProfileSource profileSource) {
                boolean z;
                if (!profileSource.f94746f.booleanValue()) {
                    if (profileSource.f94742b == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ContactSource.C29531a aVar = new ContactSource.C29531a();
                    if (z) {
                        aVar.mo104726a(7).mo104727a(profileSource.f94745e).mo104731d(profileSource.f94744d);
                    } else {
                        aVar.mo104726a(2).mo104729b(profileSource.f94745e).mo104730c(profileSource.f94743c);
                    }
                    C39555z.this.f101025a.mo105573a(context, profileSource.f94744d, profileSource.f94743c, aVar.mo104728a());
                    return;
                }
                C39555z.this.f101025a.mo105585c(context, profileSource.f94744d);
            }
        });
    }

    @Override // com.ss.android.lark.dependency.AbstractC36461ah
    /* renamed from: a */
    public void mo134434a(Context context, Bundle bundle, int i) {
        C39603g.m157159a().getCoreDependency().mo143379E().mo105564a(context, bundle, i);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36461ah
    /* renamed from: a */
    public void mo134435a(Context context, C33973b bVar, Chat chat) {
        if (bVar.mo124230r()) {
            Log.m165389i("ProfileDependency", "chatter is anonymous");
        } else {
            mo134436a(context, new ProfileSource.C36868a().mo136066c(bVar.mo124202c()).mo136061a(Boolean.valueOf(bVar.mo124225m())).mo136065b(chat.getId()).mo136060a(0).mo136062a(chat.getName()).mo136063a());
        }
    }

    @Override // com.ss.android.lark.dependency.AbstractC36461ah
    /* renamed from: a */
    public void mo134437a(Context context, String str, String str2, ProfileSource profileSource, C36516a aVar, int i) {
        C39603g.m157159a().getCoreDependency().mo143379E().mo105577a(context, str, "", profileSource.f94743c, str2, new ContactSource.C29531a().mo104726a(2).mo104729b(profileSource.f94745e).mo104730c(profileSource.f94743c).mo104728a(), aVar, i);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36461ah
    /* renamed from: a */
    public void mo134438a(Context context, String str, String str2, String str3, String str4, boolean z) {
        C39603g.m157159a().getCoreDependency().mo143379E().mo105579a(context, str, str2, str3, str4, z);
    }
}
