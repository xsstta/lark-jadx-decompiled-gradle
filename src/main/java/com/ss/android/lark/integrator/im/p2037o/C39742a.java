package com.ss.android.lark.integrator.im.p2037o;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.biz.core.api.C29550b;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.CardContent;
import com.ss.android.lark.dto.p1816e.C36872a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.chat.AbstractC39484a;
import com.ss.android.lark.integrator.im.p2035m.C39715a;
import com.ss.android.lark.phone.C51341b;
import com.ss.android.lark.phone.p2459a.AbstractC51337a;
import com.ss.android.lark.utils.LarkContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.ss.android.lark.integrator.im.o.a */
public class C39742a {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.integrator.im.o.a$a */
    public static class C39747a {

        /* renamed from: a */
        public static final AbstractC51337a f101296a = C39742a.m157746a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static C51341b m157747a() {
        return new C51341b(C39747a.f101296a);
    }

    /* renamed from: a */
    public static AbstractC51337a m157746a(final Context context) {
        return new AbstractC51337a() {
            /* class com.ss.android.lark.integrator.im.p2037o.C39742a.C397431 */

            @Override // com.ss.android.lark.phone.p2459a.AbstractC51337a
            /* renamed from: c */
            public Context mo144003c() {
                return context;
            }

            @Override // com.ss.android.lark.phone.p2459a.AbstractC51337a
            /* renamed from: f */
            public AbstractC51337a.AbstractC51340c mo144006f() {
                return $$Lambda$a$1$N1rk2KVPLHKC6Juddnu7CREqng4.INSTANCE;
            }

            @Override // com.ss.android.lark.phone.p2459a.AbstractC51337a
            /* renamed from: d */
            public AbstractC51337a.AbstractC51338a mo144004d() {
                return new AbstractC51337a.AbstractC51338a() {
                    /* class com.ss.android.lark.integrator.im.p2037o.C39742a.C397431.C397441 */

                    @Override // com.ss.android.lark.phone.p2459a.AbstractC51337a.AbstractC51338a
                    /* renamed from: b */
                    public void mo144012b(String str) {
                        AbstractC39484a.m156004a().mo104249c(str);
                    }

                    @Override // com.ss.android.lark.phone.p2459a.AbstractC51337a.AbstractC51338a
                    /* renamed from: a */
                    public CardContent mo144008a(com.bytedance.lark.pb.basic.v1.CardContent cardContent) {
                        return C39715a.m157675a().mo160032a(cardContent);
                    }

                    @Override // com.ss.android.lark.phone.p2459a.AbstractC51337a.AbstractC51338a
                    /* renamed from: a */
                    public Message mo144007a(String str) {
                        Map<String, Message> b = AbstractC39484a.m156004a().mo104258i().mo121107b(new ArrayList(Collections.singleton(str)));
                        if (b == null) {
                            return null;
                        }
                        return b.get(str);
                    }

                    @Override // com.ss.android.lark.phone.p2459a.AbstractC51337a.AbstractC51338a
                    /* renamed from: b */
                    public void mo144013b(String str, IGetDataCallback<Chat> iGetDataCallback) {
                        String b = C39603g.m157159a().getPassportDependency().mo143668b();
                        if (TextUtils.isEmpty(b)) {
                            iGetDataCallback.onError(new ErrorResult("currLoginUserId is empty"));
                        } else {
                            AbstractC39484a.m156004a().mo104251d().mo121062f(str, b, new UIGetDataCallback(iGetDataCallback));
                        }
                    }

                    @Override // com.ss.android.lark.phone.p2459a.AbstractC51337a.AbstractC51338a
                    /* renamed from: a */
                    public void mo144010a(String str, final IGetDataCallback<String> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104256g().mo121208b(str, new IGetDataCallback<Chatter>() {
                            /* class com.ss.android.lark.integrator.im.p2037o.C39742a.C397431.C397441.C397451 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(errorResult);
                                }
                            }

                            /* renamed from: a */
                            public void onSuccess(Chatter chatter) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(AbstractC39484a.m156004a().mo104265p().mo121121a(chatter, ChatterNameDisplayRule.ALIAS_NAME));
                                }
                            }
                        });
                    }

                    @Override // com.ss.android.lark.phone.p2459a.AbstractC51337a.AbstractC51338a
                    /* renamed from: a */
                    public void mo144009a(Context context, String str, int i) {
                        AbstractC39484a.m156004a().mo104206a(context, ChatBundle.m109259a().mo105927a(str).mo105920a(i).mo105929a());
                    }

                    @Override // com.ss.android.lark.phone.p2459a.AbstractC51337a.AbstractC51338a
                    /* renamed from: a */
                    public void mo144011a(String str, CardContent cardContent, IGetDataCallback<String> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104258i().mo121090a(((C36872a.C36873a) C36872a.m145522a().mo125332j(str)).mo136114a(cardContent).mo136115a(), iGetDataCallback);
                    }
                };
            }

            @Override // com.ss.android.lark.phone.p2459a.AbstractC51337a
            /* renamed from: e */
            public AbstractC51337a.AbstractC51339b mo144005e() {
                return new AbstractC51337a.AbstractC51339b() {
                    /* class com.ss.android.lark.integrator.im.p2037o.C39742a.C397431.C397462 */

                    @Override // com.ss.android.lark.phone.p2459a.AbstractC51337a.AbstractC51339b
                    /* renamed from: a */
                    public void mo144015a(IGetDataCallback<String> iGetDataCallback) {
                        C39603g.m157159a().getCoreDependency().mo143575d(iGetDataCallback);
                    }
                };
            }

            @Override // com.ss.android.lark.phone.p2459a.AbstractC51337a
            /* renamed from: b */
            public String mo144002b() {
                C29550b v = C39603g.m157159a().getCoreDependency().mo143616v();
                if (v == null) {
                    return null;
                }
                return v.mo105624a("help-about-telephone-tel-query-limit");
            }

            @Override // com.ss.android.lark.phone.p2459a.AbstractC51337a
            /* renamed from: a */
            public boolean mo144000a() {
                return C39603g.m157159a().getPassportDependency().mo143678i().mo172430k();
            }

            @Override // com.ss.android.lark.phone.p2459a.AbstractC51337a
            /* renamed from: a */
            public boolean mo144001a(String str) {
                return C37239a.m146648b().mo136951a(str);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public static /* synthetic */ void m157748b(Context context, String str) {
                C39603g.m157159a().getVideoConferenceDependency().mo143696c().openJoinMeetingPage(context, str);
            }

            @Override // com.ss.android.lark.phone.p2459a.AbstractC51337a
            /* renamed from: a */
            public void mo143998a(Activity activity, String str) {
                C39603g.m157159a().getVideoConferenceDependency().mo143694a(activity, str);
            }

            @Override // com.ss.android.lark.phone.p2459a.AbstractC51337a
            /* renamed from: a */
            public void mo143999a(Context context, String str) {
                C39603g.m157159a().getCoreDependency().mo143437a(context, str);
            }
        };
    }
}
