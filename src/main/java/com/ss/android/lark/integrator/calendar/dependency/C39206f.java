package com.ss.android.lark.integrator.calendar.dependency;

import android.content.Context;
import android.view.View;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26249aa;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30045g;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30025c;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d;
import com.ss.android.lark.calendar.wrapper.dependency.entity.CalChat;
import com.ss.android.lark.calendar.wrapper.dependency.entity.CalChatter;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.utils.ApiUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.integrator.calendar.dependency.f */
public class C39206f implements AbstractC30045g {

    /* renamed from: a */
    private final IIMApi f100495a = ((IIMApi) ApiUtils.getApi(IIMApi.class));

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30045g
    /* renamed from: a */
    public AbstractC30026d mo108218a() {
        return CalChatter.parseChatter(this.f100495a.getLoginChatter());
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30045g
    /* renamed from: a */
    public AbstractC30025c mo108217a(String str) {
        Chat chatById = this.f100495a.getChatById(str);
        if (chatById == null) {
            return null;
        }
        return new CalChat(chatById);
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30045g
    /* renamed from: a */
    public String mo108219a(AbstractC30026d dVar) {
        Chatter chatter;
        if (dVar == null) {
            chatter = null;
        } else {
            chatter = ((CalChatter) dVar).getChatter();
        }
        return this.f100495a.getAliasDisplayName(chatter);
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30045g
    /* renamed from: a */
    public Map<String, AbstractC30026d> mo108220a(C14928Entity entity) {
        return C26249aa.m94985a(this.f100495a.getChatterMapFromEntity(entity), $$Lambda$nXBfFAL62wArC4zlkP25pH4Mfzc.INSTANCE);
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30045g
    /* renamed from: a */
    public Map<String, AbstractC30026d> mo108221a(Map<String, com.bytedance.lark.pb.basic.v1.Chatter> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Chatter> entry : this.f100495a.getChatterMap(map).entrySet()) {
            hashMap.put(entry.getKey(), CalChatter.parseChatter(entry.getValue()));
        }
        return hashMap;
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30045g
    /* renamed from: a */
    public void mo108224a(final IGetDataCallback<AbstractC30026d> iGetDataCallback) {
        this.f100495a.getLoginChatter(new IGetDataCallback<Chatter>() {
            /* class com.ss.android.lark.integrator.calendar.dependency.C39206f.C392071 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Chatter chatter) {
                iGetDataCallback.onSuccess(CalChatter.parseChatter(chatter));
            }
        });
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30045g
    /* renamed from: b */
    public void mo108226b(Context context, String str) {
        this.f100495a.openChat(context, ChatBundle.m109259a().mo105931b(str).mo105933c("calendar").mo105929a());
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30045g
    /* renamed from: a */
    public void mo108222a(Context context, String str) {
        this.f100495a.openChat(context, ChatBundle.m109259a().mo105927a(str).mo105923a(ChatBundle.SourceType.PROFILE).mo105933c("calendar").mo105929a());
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30045g
    /* renamed from: a */
    public void mo108225a(String str, final IGetDataCallback<AbstractC30026d> iGetDataCallback) {
        this.f100495a.getChatterById(str, new IGetDataCallback<Chatter>() {
            /* class com.ss.android.lark.integrator.calendar.dependency.C39206f.C392082 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Chatter chatter) {
                iGetDataCallback.onSuccess(CalChatter.parseChatter(chatter));
            }
        });
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30045g
    /* renamed from: a */
    public void mo108223a(View view, int i, View view2, int[] iArr) {
        this.f100495a.setMessageCardBackground(view, i, view2, iArr);
    }
}
