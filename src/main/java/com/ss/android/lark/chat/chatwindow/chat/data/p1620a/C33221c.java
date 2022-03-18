package com.ss.android.lark.chat.chatwindow.chat.data.p1620a;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.api.service.p1600b.C32832c;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.ChatterCustomStatus;
import com.ss.android.lark.chat.p1660e.C33973b;
import com.ss.android.lark.chat.utils.C34340h;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.a.c */
public class C33221c {
    /* renamed from: a */
    public C33973b mo122491a(ChatChatter chatChatter) {
        C33973b bVar = new C33973b(chatChatter.getId());
        bVar.mo124209e(C34340h.m133174a(chatChatter, ChatterNameDisplayRule.NICKNAME_NAME));
        bVar.mo124213f(C34340h.m133174a(chatChatter, ChatterNameDisplayRule.ALIAS_NAME));
        bVar.mo124215g(C34340h.m133174a(chatChatter, ChatterNameDisplayRule.NICKNAME_ALIAS_NAME));
        bVar.mo124217h(C34340h.m133174a(chatChatter, ChatterNameDisplayRule.ALIAS_NICKNAME_NAME));
        bVar.mo124194a(chatChatter.getNickName());
        bVar.mo124190a(chatChatter.getType());
        bVar.mo124220i(chatChatter.getAvatarKey());
        bVar.mo124193a(chatChatter.getWorkStatus());
        bVar.mo124200b(chatChatter.isFrozen());
        bVar.mo124188a(chatChatter.getZenModeEndTime());
        bVar.mo124192a(chatChatter.getDescription());
        bVar.mo124204c(chatChatter.isDimission());
        bVar.mo124207d(chatChatter.isProfileEnable());
        bVar.mo124221j(chatChatter.getWithBotTag());
        bVar.mo124203c(C32832c.m126312a().mo121121a(chatChatter, ChatterNameDisplayRule.NAME));
        bVar.mo124206d(chatChatter.getName());
        bVar.mo124199b(chatChatter.getTenantId());
        bVar.mo124196a(chatChatter.isCustomer());
        bVar.mo124195a(chatChatter.getTagInfos());
        bVar.mo124210e(chatChatter.isAnonymous());
        bVar.mo124191a(ChatterCustomStatus.fromPB(C29990c.m110929a().mo104196a().mo134529a(ChatterCustomStatus.toPB(chatChatter.getChatter().getCustomStatus()))));
        bVar.mo124189a(chatChatter.getAvatarMedal());
        return bVar;
    }
}
