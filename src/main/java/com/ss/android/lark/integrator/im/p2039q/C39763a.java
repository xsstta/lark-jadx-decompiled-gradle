package com.ss.android.lark.integrator.im.p2039q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.ss.android.lark.biz.core.api.AbstractC29542ad;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.ding.entity.DingStatus;
import com.ss.android.lark.dto.chat.MessageReadStateResponse;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.chat.AbstractC39484a;
import com.ss.android.lark.integrator.im.p2026f.C39587a;
import com.ss.android.lark.integrator.im.p2039q.C39763a;
import com.ss.android.lark.readstate.ReadStateModule;
import com.ss.android.lark.readstate.dto.MessageReadStateResponseDTO;
import com.ss.android.lark.readstate.p2564a.AbstractC53096a;
import com.ss.android.lark.readstate.p2565b.C53097b;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.UserStatusHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.integrator.im.q.a */
public class C39763a {

    /* renamed from: a */
    private static volatile ReadStateModule f101319a;

    /* renamed from: b */
    private static AbstractC53096a m157850b() {
        return new AbstractC53096a() {
            /* class com.ss.android.lark.integrator.im.p2039q.C39763a.C397641 */

            @Override // com.ss.android.lark.readstate.p2564a.AbstractC53096a
            /* renamed from: a */
            public boolean mo144096a(String str, String str2, int i) {
                return AbstractC39484a.m156004a().mo104194a(str).mo121419a(str2, i);
            }

            @Override // com.ss.android.lark.readstate.p2564a.AbstractC53096a
            /* renamed from: a */
            public void mo144095a(String str, String str2, int i, List<String> list) {
                AbstractC39484a.m156004a().mo104194a(str).mo121418a(str2, i, list);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public static /* synthetic */ Chat m157852b(String str) {
                return AbstractC39484a.m156004a().mo104251d().mo120985a(str);
            }

            @Override // com.ss.android.lark.readstate.p2564a.AbstractC53096a
            /* renamed from: a */
            public DingStatus mo144088a(String str) {
                return C39587a.m157080a().mo135086b().mo135280a(str);
            }

            @Override // com.ss.android.lark.readstate.p2564a.AbstractC53096a
            /* renamed from: a */
            public Drawable mo144087a(ChatterDescription.Type type) {
                return LarkContext.getApplication().getDrawable(UserStatusHelper.m224138a().mo195998a(type.getNumber()));
            }

            @Override // com.ss.android.lark.readstate.p2564a.AbstractC53096a
            /* renamed from: a */
            public String mo144091a(Chatter chatter) {
                return AbstractC39484a.m156004a().mo104265p().mo121121a(chatter, ChatterNameDisplayRule.ALIAS_NICKNAME_NAME);
            }

            @Override // com.ss.android.lark.readstate.p2564a.AbstractC53096a
            /* renamed from: a */
            public C53097b mo144090a(String str, String str2) {
                MessageReadStateResponse a = AbstractC39484a.m156004a().mo104258i().mo121082a(str, str2);
                if (a == null) {
                    return null;
                }
                return new C53097b(str2, a.mo136088a(), a.mo136089b());
            }

            @Override // com.ss.android.lark.readstate.p2564a.AbstractC53096a
            /* renamed from: a */
            public Map<String, ChatChatter> mo144092a(String str, List<String> list) {
                return AbstractC39484a.m156004a().mo104256g().mo121212c(str, list);
            }

            @Override // com.ss.android.lark.readstate.p2564a.AbstractC53096a
            /* renamed from: a */
            public MessageReadStateResponseDTO mo144089a(String str, int i, String str2) {
                MessageReadStateResponse a = AbstractC39484a.m156004a().mo104258i().mo121081a(str, i, str2);
                if (a == null) {
                    return null;
                }
                return new MessageReadStateResponseDTO(a.mo136090c(), a.mo136091d(), a.mo136092e(), a.mo136094f(), a.mo136095g(), a.mo136096h(), a.mo136098i(), a.mo136099j(), a.mo136100k(), a.mo136101l());
            }

            @Override // com.ss.android.lark.readstate.p2564a.AbstractC53096a
            /* renamed from: a */
            public void mo144093a(Context context, Chatter chatter, String str) {
                C57865c.m224574a(new C57865c.AbstractC57873d(str) {
                    /* class com.ss.android.lark.integrator.im.p2039q.$$Lambda$a$1$RyNVV3YxByffkKBz1tRcZqETH8w */
                    public final /* synthetic */ String f$0;

                    {
                        this.f$0 = r1;
                    }

                    @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
                    public final Object produce() {
                        return C39763a.C397641.m157852b(this.f$0);
                    }
                }, new C57865c.AbstractC57871b(context, chatter, str) {
                    /* class com.ss.android.lark.integrator.im.p2039q.$$Lambda$a$1$rxq4mffZnQDqAIVW72jjDYydwuc */
                    public final /* synthetic */ Context f$1;
                    public final /* synthetic */ Chatter f$2;
                    public final /* synthetic */ String f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
                    public final void consume(Object obj) {
                        C39763a.C397641.m157851a(AbstractC29542ad.this, this.f$1, this.f$2, this.f$3, (Chat) obj);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m157851a(AbstractC29542ad adVar, Context context, Chatter chatter, String str, Chat chat) {
                ContactSource contactSource = new ContactSource();
                contactSource.setSourceType(2);
                contactSource.setSourceName(chat.getName());
                adVar.mo105573a(context, chatter.getId(), str, contactSource);
            }

            @Override // com.ss.android.lark.readstate.p2564a.AbstractC53096a
            /* renamed from: a */
            public void mo144094a(Context context, String str, String str2, ImageView imageView, int i, int i2) {
                C39603g.m157159a().getCoreDependency().mo143425a(context, imageView, str, str2, new LoadParams().mo105413a(i).mo105422b(i2));
            }
        };
    }

    /* renamed from: a */
    public static ReadStateModule m157849a() {
        if (f101319a == null) {
            synchronized (C39763a.class) {
                if (f101319a == null) {
                    f101319a = new ReadStateModule(m157850b());
                }
            }
        }
        return f101319a;
    }
}
