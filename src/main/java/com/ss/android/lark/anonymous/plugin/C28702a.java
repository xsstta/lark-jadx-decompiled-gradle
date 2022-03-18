package com.ss.android.lark.anonymous.plugin;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.anonymous.model.C28694a;
import com.ss.android.lark.anonymous.plugin.ThreadAnonymityIdentityPlugin;
import com.ss.android.lark.anonymous.plugin.ThreadAnonymityPickPlugin;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.anonymous.plugin.a */
public class C28702a {

    /* renamed from: a */
    public ThreadAnonymityPickPlugin f72229a;

    /* renamed from: b */
    public ThreadAnonymityIdentityPlugin f72230b;

    /* renamed from: c */
    public List<C28694a> f72231c = new ArrayList();

    /* renamed from: d */
    public int f72232d;

    /* renamed from: e */
    private final String f72233e = "default-avatar_37d1c4f9-ffe3-4fc0-b9b4-4aec9e03e550";

    /* renamed from: f */
    private final Map<String, IInputSupportAdditionPlugin> f72234f = new HashMap();

    /* renamed from: g */
    private final AbstractC28706a f72235g;

    /* renamed from: h */
    private final boolean f72236h;

    /* renamed from: com.ss.android.lark.anonymous.plugin.a$a */
    public interface AbstractC28706a {
        /* renamed from: a */
        void mo102102a(int i);

        /* renamed from: a */
        void mo102103a(IGetDataCallback<Long> iGetDataCallback);
    }

    /* renamed from: b */
    public void mo102100b() {
        this.f72230b.mo102077a(this.f72231c.get(this.f72232d));
        this.f72235g.mo102102a(this.f72232d);
    }

    /* renamed from: c */
    private void m105248c() {
        this.f72229a = new ThreadAnonymityPickPlugin(this.f72236h, new ThreadAnonymityPickPlugin.AbstractC28701a() {
            /* class com.ss.android.lark.anonymous.plugin.C28702a.C287031 */

            @Override // com.ss.android.lark.anonymous.plugin.ThreadAnonymityPickPlugin.AbstractC28701a
            /* renamed from: a */
            public void mo102094a() {
                C28702a.this.f72229a.mo102090a(C28702a.this.f72231c);
            }

            @Override // com.ss.android.lark.anonymous.plugin.ThreadAnonymityPickPlugin.AbstractC28701a
            /* renamed from: a */
            public void mo102095a(C28694a aVar) {
                C28702a.this.f72232d = aVar.mo102063e();
                C28702a.this.f72230b.mo102076a(1);
                C28702a.this.mo102100b();
            }
        }, false);
        ThreadAnonymityIdentityPlugin threadAnonymityIdentityPlugin = new ThreadAnonymityIdentityPlugin(new ThreadAnonymityIdentityPlugin.AbstractC28700a() {
            /* class com.ss.android.lark.anonymous.plugin.C28702a.C287042 */

            @Override // com.ss.android.lark.anonymous.plugin.ThreadAnonymityIdentityPlugin.AbstractC28700a
            /* renamed from: a */
            public void mo102088a() {
                C28702a.this.mo102100b();
            }

            @Override // com.ss.android.lark.anonymous.plugin.ThreadAnonymityIdentityPlugin.AbstractC28700a
            /* renamed from: a */
            public void mo102089a(boolean z) {
                if (z) {
                    C28702a.this.mo102097a();
                } else {
                    C28702a.this.f72229a.mo102093e();
                }
            }
        }, true);
        this.f72230b = threadAnonymityIdentityPlugin;
        this.f72234f.put("input_addition", threadAnonymityIdentityPlugin);
        this.f72234f.put("input_pop", this.f72229a);
    }

    /* renamed from: a */
    public void mo102097a() {
        if (!this.f72236h) {
            this.f72229a.mo102090a(this.f72231c);
            this.f72229a.mo102092d();
            return;
        }
        this.f72235g.mo102103a(new IGetDataCallback<Long>() {
            /* class com.ss.android.lark.anonymous.plugin.C28702a.C287053 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                String displayMsg = errorResult.getDisplayMsg();
                if (TextUtils.isEmpty(displayMsg)) {
                    displayMsg = "error occurs";
                }
                Log.m165383e("AnonymityPluginManager", displayMsg);
            }

            /* renamed from: a */
            public void onSuccess(Long l) {
                if (l.longValue() == 0) {
                    if (C28702a.this.f72232d == 1) {
                        C28702a.this.f72232d = 0;
                        C28702a.this.mo102100b();
                    }
                    for (C28694a aVar : C28702a.this.f72231c) {
                        if (aVar.mo102063e() == 1) {
                            aVar.mo102060b(false);
                            aVar.mo102058a(false);
                            aVar.mo102057a(UIHelper.getString(R.string.Lark_Groups_CantAnonymousLimitReachedTip));
                        }
                        if (aVar.mo102063e() == 0 && !aVar.mo102061c()) {
                            aVar.mo102058a(true);
                        }
                    }
                } else {
                    for (C28694a aVar2 : C28702a.this.f72231c) {
                        if (aVar2.mo102063e() == 1) {
                            aVar2.mo102060b(true);
                        }
                    }
                }
                C28702a.this.f72229a.mo102090a(C28702a.this.f72231c);
                C28702a.this.f72229a.mo102092d();
            }
        });
    }

    /* renamed from: a */
    public void mo102099a(boolean z) {
        this.f72229a.mo102091b(z);
    }

    /* renamed from: a */
    private void m105245a(ChatChatter chatChatter) {
        this.f72231c = m105246b(chatChatter);
        m105248c();
    }

    /* renamed from: a */
    public IInputSupportAdditionPlugin mo102096a(String str) {
        return this.f72234f.get(str);
    }

    /* renamed from: a */
    private List<C28694a> m105244a(List<C28694a> list) {
        boolean z;
        if (m105247b(list)) {
            return list;
        }
        this.f72232d = 0;
        for (C28694a aVar : list) {
            aVar.mo102060b(TextUtils.isEmpty(aVar.mo102059b()));
            if (aVar.mo102063e() == this.f72232d) {
                z = true;
            } else {
                z = false;
            }
            aVar.mo102058a(z);
        }
        return list;
    }

    /* renamed from: b */
    private boolean m105247b(List<C28694a> list) {
        int i = 0;
        for (C28694a aVar : list) {
            if (!aVar.mo102065g() && aVar.mo102061c()) {
                return false;
            }
            if (aVar.mo102061c()) {
                i++;
            }
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private List<C28694a> m105246b(ChatChatter chatChatter) {
        String str;
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(chatChatter.getNickName())) {
            str = chatChatter.getNickName();
        } else {
            str = chatChatter.getLocalizedName();
        }
        C28694a.C28696a b = new C28694a.C28696a().mo102071c(str).mo102067a(chatChatter.getAvatarKey()).mo102070b(chatChatter.getId());
        boolean z2 = false;
        C28694a.C28696a a = b.mo102066a(0);
        if (this.f72232d == 0) {
            z = true;
        } else {
            z = false;
        }
        arrayList.add(a.mo102068a(z).mo102069a());
        C28694a.C28696a a2 = new C28694a.C28696a().mo102067a("default-avatar_37d1c4f9-ffe3-4fc0-b9b4-4aec9e03e550").mo102066a(1);
        if (this.f72232d == 1) {
            z2 = true;
        }
        arrayList.add(a2.mo102068a(z2).mo102069a());
        return m105244a(arrayList);
    }

    /* renamed from: a */
    public void mo102098a(int i) {
        boolean z;
        this.f72232d = i;
        for (C28694a aVar : this.f72231c) {
            if (aVar.mo102063e() == i) {
                z = true;
            } else {
                z = false;
            }
            aVar.mo102058a(z);
        }
        this.f72230b.mo102077a(this.f72231c.get(this.f72232d));
        this.f72229a.mo102090a(this.f72231c);
    }

    public C28702a(AbstractC28706a aVar, ChatChatter chatChatter, int i, boolean z) {
        this.f72235g = aVar;
        this.f72232d = i;
        this.f72236h = z;
        m105245a(chatChatter);
    }
}
