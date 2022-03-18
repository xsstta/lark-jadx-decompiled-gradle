package com.ss.android.lark.create.groupchat.impl.p2p.p1783a;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.create.groupchat.CreateGroupChatModule;
import com.ss.android.lark.create.groupchat.dto.C36260c;
import com.ss.android.lark.create.groupchat.impl.p2p.p1783a.AbstractC36345a;
import com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.lark.create.groupchat.impl.p2p.a.b */
public class C36347b extends AbstractC36345a {

    /* renamed from: j */
    Chat f93803j;

    /* renamed from: k */
    AbstractC36248c.AbstractC36258j f93804k = CreateGroupChatModule.getDependency().getSearchDependency();

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36350a
    /* renamed from: f */
    public Chat mo134103f() {
        return this.f93803j;
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36350a
    /* renamed from: g */
    public String mo134104g() {
        return this.f93796d;
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36350a
    /* renamed from: i */
    public String mo134105i() {
        return CreateGroupChatModule.getDependency().getAccountDependency().mo133721b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m143232a(Set set) {
        this.f93795c.addAll(set);
        this.f93801i.mo134100a(set.size());
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.p1783a.AbstractC36345a
    /* renamed from: a */
    public void mo134090a(Intent intent) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("key_chat_id");
        this.f93796d = extras.getString("department_id");
        C57865c.m224574a(new C57865c.AbstractC57873d(string) {
            /* class com.ss.android.lark.create.groupchat.impl.p2p.p1783a.$$Lambda$b$OaGAj7pMmafSi5P5q1ZUik6SOrk */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return C36347b.lambda$OaGAj7pMmafSi5P5q1ZUik6SOrk(C36347b.this, this.f$1);
            }
        }, new C57865c.AbstractC57871b() {
            /* class com.ss.android.lark.create.groupchat.impl.p2p.p1783a.$$Lambda$b$2Sqfh_Fi_ZxkpDvu1PSjrRZ4U */

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
            public final void consume(Object obj) {
                C36347b.m270515lambda$2Sqfh_Fi_ZxkpDvu1PSjrRZ4U(C36347b.this, (Set) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Set m143231a(String str) {
        this.f93803j = this.f93798f.mo133727a(str);
        HashSet hashSet = new HashSet(4);
        Chat chat = this.f93803j;
        if (chat != null) {
            hashSet.add(chat.getP2pChatterId());
        }
        hashSet.add(CreateGroupChatModule.getDependency().getAccountDependency().mo133721b());
        return hashSet;
    }

    public C36347b(Intent intent, boolean z, AbstractC36345a.AbstractC36346a aVar) {
        super(intent, z, aVar);
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36350a
    /* renamed from: a */
    public void mo134102a(String str, Chat chat, List<String> list) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < list.size()) {
                int i2 = i + 1;
                arrayList.add(new C36260c(i2, 1, list.get(i)));
                i = i2;
            }
            AbstractC36248c.AbstractC36258j jVar = this.f93804k;
            if (chat == null) {
                str2 = "";
            } else {
                str2 = chat.getId();
            }
            jVar.mo133743a(str, str2, arrayList, new IGetDataCallback<Void>() {
                /* class com.ss.android.lark.create.groupchat.impl.p2p.p1783a.C36347b.C363481 */

                /* renamed from: a */
                public void onSuccess(Void r1) {
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165382e("put search history failed: " + errorResult.toString());
                }
            });
        }
    }
}
