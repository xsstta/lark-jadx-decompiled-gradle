package com.ss.android.lark.integrator.im.p2035m;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.basic.v1.RichText;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.AbstractC29542ad;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.audit.AuditModuleProvider;
import com.ss.android.lark.integrator.im.chat.AbstractC39484a;
import com.ss.android.lark.integrator.im.groupmember.C39633a;
import com.ss.android.lark.integrator.im.p2035m.C39715a;
import com.ss.android.lark.message.card.C45294c;
import com.ss.android.lark.message.card.p2261a.AbstractC45287a;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.integrator.im.m.a */
public class C39715a {
    /* renamed from: a */
    public static C45294c m157675a() {
        return new C45294c(new AbstractC45287a() {
            /* class com.ss.android.lark.integrator.im.p2035m.C39715a.C397161 */

            @Override // com.ss.android.lark.message.card.p2261a.AbstractC45287a
            /* renamed from: a */
            public void mo143898a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
                C39603g.m157159a().getOpenPlatformDependency().mo143651a(str, jSONObject, jSONObject2, jSONObject3);
            }

            @Override // com.ss.android.lark.message.card.p2261a.AbstractC45287a
            /* renamed from: a */
            public void mo143896a(Context context, String str, boolean z, boolean z2, Boolean bool) {
                UrlParams.Source source;
                if (z2) {
                    source = UrlParams.Source.APP_CARD_FOOTER_LINK;
                } else if (z) {
                    source = bool.booleanValue() ? UrlParams.Source.APP_CARD_LINK_GROUP : UrlParams.Source.APP_CARD_LINK_SINGLE;
                } else {
                    source = bool.booleanValue() ? UrlParams.Source.APP_CARD_GROUP : UrlParams.Source.APP_CARD_SINGLE;
                }
                C39603g.m157159a().getCoreDependency().mo143489a("messenger", "messenger_chat_shared_link_card");
                C39603g.m157159a().getCoreDependency().mo143441a(context, str, UrlParams.m108857a().mo105518a(source).mo105523a(), C39603g.m157159a().getCCMDependency().mo143299b());
                AuditModuleProvider.f100784c.mo143320a().mo104056d().mo104129a(str);
            }

            @Override // com.ss.android.lark.message.card.p2261a.AbstractC45287a
            /* renamed from: a */
            public void mo143895a(Context context, String str, String str2) {
                C57865c.m224574a(new C57865c.AbstractC57873d(str, str2) {
                    /* class com.ss.android.lark.integrator.im.p2035m.$$Lambda$a$1$wRB6HIL5uxKPPnM1wUzigbc9_XY */
                    public final /* synthetic */ String f$0;
                    public final /* synthetic */ String f$1;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
                    public final Object produce() {
                        return C39715a.C397161.m157676a(this.f$0, this.f$1);
                    }
                }, new C57865c.AbstractC57871b(context, str, str2) {
                    /* class com.ss.android.lark.integrator.im.p2035m.$$Lambda$a$1$Fp9AIaUdI2h1h0emlBWnqvYW_AM */
                    public final /* synthetic */ Context f$0;
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ String f$2;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
                    public final void consume(Object obj) {
                        C39715a.C397161.m157677a(this.f$0, this.f$1, this.f$2, (Chat) obj);
                    }
                });
            }

            @Override // com.ss.android.lark.message.card.p2261a.AbstractC45287a
            /* renamed from: a */
            public boolean mo143899a(String str) {
                return C37239a.m146648b().mo136951a(str);
            }

            @Override // com.ss.android.lark.message.card.p2261a.AbstractC45287a
            /* renamed from: a */
            public boolean mo143900a(String str, boolean z) {
                return C37239a.m146648b().mo136952a(str, z);
            }

            @Override // com.ss.android.lark.message.card.p2261a.AbstractC45287a
            /* renamed from: a */
            public void mo143897a(View view, View view2, int[] iArr) {
                AbstractC39484a.m156004a().mo104211a(view, 13, view2, iArr);
            }

            @Override // com.ss.android.lark.message.card.p2261a.AbstractC45287a
            /* renamed from: a */
            public Context mo143887a() {
                return LarkContext.getApplication();
            }

            @Override // com.ss.android.lark.message.card.p2261a.AbstractC45287a
            /* renamed from: g */
            public AbstractC45287a.AbstractC45288a mo143906g() {
                return new AbstractC45287a.AbstractC45288a() {
                    /* class com.ss.android.lark.integrator.im.p2035m.C39715a.C397161.C397171 */

                    @Override // com.ss.android.lark.message.card.p2261a.AbstractC45287a.AbstractC45288a
                    /* renamed from: a */
                    public void mo143907a(List<String> list) {
                        C39603g.m157159a().getCCMDependency().mo143296a(list);
                    }
                };
            }

            @Override // com.ss.android.lark.message.card.p2261a.AbstractC45287a
            /* renamed from: e */
            public Locale mo143904e() {
                return C39603g.m157159a().getCoreDependency().mo143609q();
            }

            @Override // com.ss.android.lark.message.card.p2261a.AbstractC45287a
            /* renamed from: f */
            public int mo143905f() {
                return AbstractC39484a.m156004a().mo104192a(mo143887a(), false);
            }

            @Override // com.ss.android.lark.message.card.p2261a.AbstractC45287a
            /* renamed from: b */
            public String mo143901b() {
                String b = C39603g.m157159a().getPassportDependency().mo143668b();
                if (b == null) {
                    return "";
                }
                return b;
            }

            @Override // com.ss.android.lark.message.card.p2261a.AbstractC45287a
            /* renamed from: c */
            public String mo143902c() {
                String c = C39603g.m157159a().getPassportDependency().mo143672c();
                if (c == null) {
                    return "";
                }
                return c;
            }

            @Override // com.ss.android.lark.message.card.p2261a.AbstractC45287a
            /* renamed from: d */
            public String mo143903d() {
                String e = C39603g.m157159a().getPassportDependency().mo143674e();
                if (e == null) {
                    return "";
                }
                return e;
            }

            @Override // com.ss.android.lark.message.card.p2261a.AbstractC45287a
            /* renamed from: a */
            public RichText mo143888a(com.ss.android.lark.widget.richtext.RichText richText) {
                return AbstractC39484a.m156004a().mo104267r().mo121410a(richText);
            }

            @Override // com.ss.android.lark.message.card.p2261a.AbstractC45287a
            /* renamed from: a */
            public com.ss.android.lark.widget.richtext.RichText mo143889a(RichText richText) {
                return AbstractC39484a.m156004a().mo104267r().mo121411a(richText);
            }

            @Override // com.ss.android.lark.message.card.p2261a.AbstractC45287a
            /* renamed from: a */
            public String mo143891a(DomainSettings.Alias alias) {
                return DynamicConfigModule.m145551a(alias);
            }

            @Override // com.ss.android.lark.message.card.p2261a.AbstractC45287a
            /* renamed from: a */
            public void mo143894a(Context context) {
                C39603g.m157159a().getOpenPlatformDependency().mo143642a(context);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ Chat m157676a(String str, String str2) {
                if (AbstractC39484a.m156004a().mo104256g().mo121203b(str).isBot()) {
                    return null;
                }
                return AbstractC39484a.m156004a().mo104251d().mo120985a(str2);
            }

            @Override // com.ss.android.lark.message.card.p2261a.AbstractC45287a
            /* renamed from: a */
            public com.ss.android.lark.widget.richtext.RichText mo143890a(RichText richText, HashMap hashMap) {
                return AbstractC39484a.m156004a().mo104267r().mo121412a(richText, hashMap);
            }

            @Override // com.ss.android.lark.message.card.p2261a.AbstractC45287a
            /* renamed from: a */
            public void mo143892a(Activity activity, String str, IGetDataCallback<List<ChatChatter>> iGetDataCallback) {
                C39633a.m157280a().mo158791a(activity, str, true, iGetDataCallback);
            }

            @Override // com.ss.android.lark.message.card.p2261a.AbstractC45287a
            /* renamed from: a */
            public void mo143893a(Activity activity, List<String> list, IGetDataCallback<List<ChatChatter>> iGetDataCallback) {
                C39633a.m157280a().mo158794a(activity, list, iGetDataCallback);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m157677a(Context context, String str, String str2, Chat chat) {
                AbstractC29542ad E = C39603g.m157159a().getCoreDependency().mo143379E();
                if (chat == null) {
                    E.mo105585c(context, str);
                } else {
                    E.mo105573a(context, str, str2, new ContactSource.C29531a().mo104726a(2).mo104729b(chat.getName()).mo104728a());
                }
            }
        });
    }
}
