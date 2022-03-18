package com.ss.android.lark.mail.impl.message.view.p2211b;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.C42097j;
import com.ss.android.lark.mail.impl.entity.C42104p;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.message.p2207g.C42936a;
import com.ss.android.lark.mail.impl.message.recall.sender.C42984a;
import com.ss.android.lark.mail.impl.utils.C43853v;
import com.ss.android.lark.mail.impl.view.dialog.action.AbstractC43930b;
import com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog;
import com.ss.android.lark.mail.impl.view.dialog.action.item.ForwardActionItem;
import com.ss.android.lark.mail.impl.view.dialog.action.item.ReEditActionItem;
import com.ss.android.lark.mail.impl.view.dialog.action.item.RecallActionItem;
import com.ss.android.lark.mail.impl.view.dialog.action.item.ReplyActionItem;
import com.ss.android.lark.mail.impl.view.dialog.action.item.ReplyAllActionItem;
import com.ss.android.lark.mail.impl.view.dialog.action.item.ScheduleActionItem;
import com.ss.android.lark.mail.impl.view.dialog.action.item.SendToChatActionItem;
import com.ss.android.lark.mail.impl.view.dialog.action.item.TranslateActionItem;
import com.ss.android.lark.mail.impl.view.dialog.action.item.TurnOffTranslateActionItem;
import com.ss.android.lark.mail.impl.view.dialog.action.item.UnsubscribeActionItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.message.view.b.b */
public class C43192b {

    /* renamed from: com.ss.android.lark.mail.impl.message.view.b.b$a */
    public interface AbstractC43193a {
        /* renamed from: a */
        C42104p mo154409a();

        /* renamed from: b */
        List<C42097j> mo154410b();

        /* renamed from: c */
        AbstractC43930b mo154411c();

        /* renamed from: d */
        int mo154412d();

        /* renamed from: e */
        boolean mo154413e();
    }

    /* renamed from: a */
    public void mo154594a(Context context, C43191a aVar, AbstractC43193a aVar2) {
        C42097j jVar;
        String str;
        C42097j jVar2;
        MailMessage mailMessage;
        ActionDialog.ActionItem actionItem;
        if (aVar != null && aVar2.mo154412d() != 4) {
            Log.m165388i("messageMenuEntity getThreadId:" + aVar.mo154590c() + " getMsgID:" + aVar.mo154584a() + " getInitial:" + aVar.mo154592d() + " getRgb:" + aVar.mo154593e());
            C42104p a = aVar2.mo154409a();
            List<C42097j> b = aVar2.mo154410b();
            int i = 0;
            int i2 = 0;
            while (true) {
                jVar = null;
                if (i2 >= b.size()) {
                    str = "";
                    jVar2 = null;
                    mailMessage = null;
                    break;
                }
                jVar2 = b.get(i2);
                if (jVar2 != null && (mailMessage = jVar2.mo151964g()) != null && aVar.mo154584a().equals(mailMessage.mo151581b())) {
                    str = jVar2.mo151959c();
                    break;
                }
                i2++;
            }
            if (mailMessage == null) {
                Log.m165388i("MessageMenuViewModel mailMessage null msgID:" + aVar.mo154584a());
                return;
            }
            ActionDialog.C43925a aVar3 = new ActionDialog.C43925a(context);
            ActionDialog.C43926b.C43927a aVar4 = new ActionDialog.C43926b.C43927a();
            boolean z = true;
            if (!TextUtils.isEmpty(aVar.mo154592d())) {
                aVar4.mo156370b(aVar.mo154592d()).mo156371c(mailMessage.mo151586c().mo151179c()).mo156372d(mailMessage.mo151608i()).mo156369a();
                if (aVar.mo154593e() != null && aVar.mo154593e().length == 3) {
                    int[] e = aVar.mo154593e();
                    aVar4.mo156367a(Color.rgb(e[0], e[1], e[2]));
                }
                aVar3.mo156363a(aVar4.mo156369a());
            } else {
                aVar3.mo156363a(aVar4.mo156371c(mailMessage.mo151586c().mo151179c()).mo156368a(mailMessage.mo151586c().mo151189j()).mo156372d(mailMessage.mo151608i()).mo156369a());
            }
            ArrayList arrayList = new ArrayList();
            if (mailMessage.mo151559L() <= 0) {
                z = false;
            }
            if (z) {
                ScheduleActionItem scheduleActionItem = new ScheduleActionItem();
                scheduleActionItem.putExtra("message", mailMessage);
                arrayList.add(scheduleActionItem);
            } else {
                ReplyActionItem replyActionItem = new ReplyActionItem();
                replyActionItem.putExtra("message", mailMessage);
                replyActionItem.putExtra("draft_id", str);
                replyActionItem.setDisplayType(ActionDialog.ActionItem.DisplayType.TOP_CIRCLE);
                arrayList.add(replyActionItem);
                while (true) {
                    if (i >= b.size()) {
                        break;
                    }
                    C42097j jVar3 = b.get(i);
                    if (aVar.mo154584a().equals(jVar3.mo151964g().mo151581b())) {
                        jVar = jVar3;
                        break;
                    }
                    i++;
                }
                if (jVar != null && jVar.mo151964g().mo151552E()) {
                    ReplyAllActionItem replyAllActionItem = new ReplyAllActionItem();
                    replyAllActionItem.putExtra("message", mailMessage);
                    replyAllActionItem.putExtra("draft_id", str);
                    replyAllActionItem.setDisplayType(ActionDialog.ActionItem.DisplayType.SQUARE);
                    arrayList.add(replyAllActionItem);
                }
                ForwardActionItem forwardActionItem = new ForwardActionItem();
                forwardActionItem.putExtra("message", mailMessage);
                forwardActionItem.putExtra("draft_id", str);
                forwardActionItem.setDisplayType(ActionDialog.ActionItem.DisplayType.BOTTOM_CIRCLE);
                arrayList.add(forwardActionItem);
                if (a != null && !a.mo152024f() && aVar2.mo154413e()) {
                    SendToChatActionItem sendToChatActionItem = new SendToChatActionItem();
                    sendToChatActionItem.putExtra("message", mailMessage);
                    arrayList.add(sendToChatActionItem);
                }
            }
            if (!z && mailMessage.mo151621u() && a != null && !a.mo152024f()) {
                ReEditActionItem reEditActionItem = new ReEditActionItem();
                reEditActionItem.putExtra("message", mailMessage);
                arrayList.add(reEditActionItem);
            }
            if (C43853v.m173845c()) {
                if (aVar.mo154589b()) {
                    actionItem = new TurnOffTranslateActionItem();
                } else {
                    actionItem = new TranslateActionItem();
                }
                actionItem.putExtra("message", mailMessage);
                arrayList.add(actionItem);
            }
            if (!z && a != null && !a.mo152024f()) {
                if (C42984a.m171086a().mo154142d(mailMessage) && C42984a.m171086a().mo154143e(mailMessage)) {
                    RecallActionItem recallActionItem = new RecallActionItem();
                    recallActionItem.putExtra("message", mailMessage);
                    recallActionItem.putExtra("message_item", jVar2);
                    arrayList.add(recallActionItem);
                }
                if (C42936a.m170980a() && mailMessage.mo151558K()) {
                    UnsubscribeActionItem unsubscribeActionItem = new UnsubscribeActionItem();
                    unsubscribeActionItem.putExtra("message", mailMessage);
                    arrayList.add(unsubscribeActionItem);
                }
            }
            aVar3.mo156365a(arrayList);
            aVar3.mo156364a(aVar2.mo154411c());
            aVar3.mo156366a().show();
        }
    }
}
