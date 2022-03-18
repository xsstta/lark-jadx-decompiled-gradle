package com.ss.android.lark.ai.p1327a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.ai.C28522a;
import com.ss.android.lark.ai.p1329c.AbstractC28534a;
import com.ss.android.lark.ai.p1329c.AbstractC28535b;
import com.ss.android.lark.ai.p1329c.AbstractC28536c;
import com.ss.android.lark.ai.p1329c.AbstractC28537d;
import com.ss.android.lark.ai.p1329c.AbstractC28538e;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.biz.im.api.C29601ad;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.chat.AbstractC39484a;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.lark.ai.a.a */
public class C28523a {

    /* renamed from: a */
    private static volatile C28522a f71679a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.ai.a.a$a */
    public static class C28530a {

        /* renamed from: a */
        public static final AbstractC28534a f71686a = C28523a.m104541b();
    }

    /* renamed from: b */
    public static AbstractC28534a m104541b() {
        return new AbstractC28534a() {
            /* class com.ss.android.lark.ai.p1327a.C28523a.C285241 */

            @Override // com.ss.android.lark.ai.p1329c.AbstractC28534a
            /* renamed from: a */
            public AbstractC28536c mo101553a() {
                return new AbstractC28536c() {
                    /* class com.ss.android.lark.ai.p1327a.C28523a.C285241.C285251 */

                    @Override // com.ss.android.lark.ai.p1329c.AbstractC28536c
                    /* renamed from: a */
                    public boolean mo101568a(String str) {
                        return C39603g.m157159a().getCoreDependency().mo143559b(str);
                    }

                    @Override // com.ss.android.lark.ai.p1329c.AbstractC28536c
                    /* renamed from: a */
                    public void mo101567a(String str, boolean z) {
                        C39603g.m157159a().getCoreDependency().mo143501a(str);
                    }
                };
            }

            @Override // com.ss.android.lark.ai.p1329c.AbstractC28534a
            /* renamed from: b */
            public AbstractC28537d mo101559b() {
                return new AbstractC28537d() {
                    /* class com.ss.android.lark.ai.p1327a.C28523a.C285241.C285262 */

                    @Override // com.ss.android.lark.ai.p1329c.AbstractC28537d
                    /* renamed from: a */
                    public boolean mo101569a() {
                        return C39603g.m157159a().getCoreDependency().mo143555b();
                    }

                    @Override // com.ss.android.lark.ai.p1329c.AbstractC28537d
                    /* renamed from: b */
                    public boolean mo101570b() {
                        return C39603g.m157159a().getCoreDependency().mo143569c();
                    }

                    @Override // com.ss.android.lark.ai.p1329c.AbstractC28537d
                    /* renamed from: c */
                    public boolean mo101571c() {
                        return C39603g.m157159a().getCoreDependency().mo143577d();
                    }
                };
            }

            @Override // com.ss.android.lark.ai.p1329c.AbstractC28534a
            /* renamed from: c */
            public AbstractC28535b mo101561c() {
                return new AbstractC28535b() {
                    /* class com.ss.android.lark.ai.p1327a.C28523a.C285241.C285273 */

                    @Override // com.ss.android.lark.ai.p1329c.AbstractC28535b
                    /* renamed from: a */
                    public void mo101572a(String str, String str2, String str3, RichText richText) {
                        AbstractC39484a.m156004a().mo104258i().mo121089a(((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) C29601ad.m109464a().mo125332j(str)).mo125330h(str2)).mo125331i(str3)).mo106659a(richText).mo106660a());
                    }

                    @Override // com.ss.android.lark.ai.p1329c.AbstractC28535b
                    /* renamed from: a */
                    public void mo101573a(String str, String str2, boolean z, final IGetDataCallback<List<ChatChatter>> iGetDataCallback, int i) {
                        AbstractC39484a.m156004a().mo104251d().mo121020a(str, str2, true, (IGetDataCallback<ChatChatterResponse>) new IGetDataCallback<ChatChatterResponse>() {
                            /* class com.ss.android.lark.ai.p1327a.C28523a.C285241.C285273.C285281 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(errorResult);
                                }
                            }

                            /* renamed from: a */
                            public void onSuccess(ChatChatterResponse aVar) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(aVar.mo136071e());
                                }
                            }
                        }, i);
                    }
                };
            }

            @Override // com.ss.android.lark.ai.p1329c.AbstractC28534a
            /* renamed from: d */
            public AbstractC28538e mo101563d() {
                return new AbstractC28538e() {
                    /* class com.ss.android.lark.ai.p1327a.C28523a.C285241.C285294 */

                    @Override // com.ss.android.lark.ai.p1329c.AbstractC28538e
                    /* renamed from: a */
                    public boolean mo101575a(Context context) {
                        return C39603g.m157159a().getCoreDependency().mo143557b(context);
                    }

                    @Override // com.ss.android.lark.ai.p1329c.AbstractC28538e
                    /* renamed from: b */
                    public boolean mo101576b(Context context) {
                        return C39603g.m157159a().getCoreDependency().mo143570c(context);
                    }
                };
            }

            @Override // com.ss.android.lark.ai.p1329c.AbstractC28534a
            /* renamed from: f */
            public Locale mo101565f() {
                return C39603g.m157159a().getCoreDependency().mo143609q();
            }

            @Override // com.ss.android.lark.ai.p1329c.AbstractC28534a
            /* renamed from: g */
            public String mo101566g() {
                return C39603g.m157159a().getCoreDependency().mo143612s();
            }

            @Override // com.ss.android.lark.ai.p1329c.AbstractC28534a
            /* renamed from: e */
            public String mo101564e() {
                String b = C39603g.m157159a().getPassportDependency().mo143668b();
                if (b == null) {
                    return "";
                }
                return b;
            }

            @Override // com.ss.android.lark.ai.p1329c.AbstractC28534a
            /* renamed from: a */
            public void mo101556a(Dialog dialog) {
                C39603g.m157159a().getCoreDependency().mo143419a(dialog);
            }

            @Override // com.ss.android.lark.ai.p1329c.AbstractC28534a
            /* renamed from: a */
            public boolean mo101558a(String str) {
                return C37239a.m146648b().mo136951a(str);
            }

            @Override // com.ss.android.lark.ai.p1329c.AbstractC28534a
            /* renamed from: b */
            public void mo101560b(Context context, String str) {
                C39603g.m157159a().getCoreDependency().mo143440a(context, str, UrlParams.m108857a().mo105539h(false).mo105523a());
            }

            @Override // com.ss.android.lark.ai.p1329c.AbstractC28534a
            /* renamed from: c */
            public boolean mo101562c(Context context, String str) {
                if (!C39603g.m157159a().getCoreDependency().mo143558b(context, str, 0)) {
                    return false;
                }
                C39603g.m157159a().getCoreDependency().mo143565c(context, str, 0);
                return true;
            }

            @Override // com.ss.android.lark.ai.p1329c.AbstractC28534a
            /* renamed from: a */
            public void mo101557a(Context context, String str) {
                AbstractC39484a.m156004a().mo104196a().mo134588p().mo134751b(context, str);
            }

            @Override // com.ss.android.lark.ai.p1329c.AbstractC28534a
            /* renamed from: a */
            public void mo101554a(Activity activity, C36516a aVar, int i, int i2, String str, String str2) {
                C39603g.m157159a().getCCMDependency().mo143293a(activity, aVar, i, str, i2, str2);
            }

            @Override // com.ss.android.lark.ai.p1329c.AbstractC28534a
            /* renamed from: a */
            public void mo101555a(Activity activity, String str, boolean z, long j, long j2, String str2, ArrayList<String> arrayList, boolean z2) {
                C39603g.m157159a().getCalendarDependency().mo143311a(activity, str, z, str2, arrayList, j, j2, z2, 2);
            }
        };
    }

    /* renamed from: a */
    public static C28522a m104540a() {
        if (f71679a == null) {
            synchronized (C28523a.class) {
                if (f71679a == null) {
                    f71679a = new C28522a(C28530a.f71686a);
                }
            }
        }
        return f71679a;
    }
}
