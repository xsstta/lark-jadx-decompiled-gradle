package com.ss.android.lark.integrator.im.chat.dependency;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.api.service.AbstractC32819b;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.dependency.AbstractC36459ag;
import com.ss.android.lark.integrator.im.chat.AbstractC39484a;
import com.ss.android.lark.integrator.im.p2038p.C39748a;
import com.ss.android.lark.pin.dto.ShowPinDialogParam;
import com.ss.android.lark.sdk.C53241h;

/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.y */
class C39554y implements AbstractC36459ag {
    C39554y() {
    }

    @Override // com.ss.android.lark.dependency.AbstractC36459ag
    /* renamed from: a */
    public void mo134431a(Activity activity, MessageInfo messageInfo, Chat chat, Chatter chatter, AbstractC36459ag.AbstractC36460a aVar) {
        if (messageInfo == null) {
            C53241h.m205894a("PinDependency", "messageInfo is null when show pin dialog!");
        } else {
            C39748a.m157770a().mo177247a(m156392a((Context) activity, messageInfo, chat, chatter, aVar).mo177304a());
        }
    }

    /* renamed from: a */
    public static ShowPinDialogParam.Builder m156392a(Context context, MessageInfo messageInfo, Chat chat, Chatter chatter, AbstractC36459ag.AbstractC36460a aVar) {
        AbstractC32819b p = AbstractC39484a.m156004a().mo104265p();
        ShowPinDialogParam.Builder d = new ShowPinDialogParam.Builder(context).mo177302a(chat.getId()).mo177305b(chat.getOwnerId()).mo177303a(chat.isThread()).mo177300a(messageInfo.getMessage()).mo177308e(p.mo121121a(messageInfo.getMessageSender(), ChatterNameDisplayRule.NICKNAME_NAME)).mo177306c(chatter.getId()).mo177307d(p.mo121121a(chatter, ChatterNameDisplayRule.NICKNAME_NAME));
        if (messageInfo.getPin() != null) {
            d.mo177309f(messageInfo.getPin().getId()).mo177310g(messageInfo.getPin().getOperatorId()).mo177311h(messageInfo.getPin().getOperatorDisplayName()).mo177299a(messageInfo.getPin().getTimeStamp());
        }
        if (aVar != null) {
            aVar.getClass();
            d.mo177301a(new ShowPinDialogParam.IPinActionListener() {
                /* class com.ss.android.lark.integrator.im.chat.dependency.$$Lambda$f8gl6ZRPrleQDByT8mnCWykfgI */

                @Override // com.ss.android.lark.pin.dto.ShowPinDialogParam.IPinActionListener
                public final void onPin(boolean z) {
                    AbstractC36459ag.AbstractC36460a.this.onPin(z);
                }
            });
        }
        return d;
    }
}
