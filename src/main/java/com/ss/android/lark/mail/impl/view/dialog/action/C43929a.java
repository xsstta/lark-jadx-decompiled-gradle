package com.ss.android.lark.mail.impl.view.dialog.action;

import android.view.View;
import com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog;

/* renamed from: com.ss.android.lark.mail.impl.view.dialog.action.a */
public class C43929a {
    /* renamed from: a */
    public static boolean m174056a(ActionDialog actionDialog, AbstractC43930b bVar, View view, ActionDialog.ActionItem actionItem) {
        if (actionDialog == null || bVar == null || view == null || actionItem == null) {
            return false;
        }
        String name = actionItem.getClass().getName();
        name.hashCode();
        char c = 65535;
        switch (name.hashCode()) {
            case -1631743877:
                if (name.equals("com.ss.android.lark.mail.impl.view.dialog.action.item.SendToChatActionItem")) {
                    c = 0;
                    break;
                }
                break;
            case -1278531172:
                if (name.equals("com.ss.android.lark.mail.impl.view.dialog.action.item.TurnOffTranslateActionItem")) {
                    c = 1;
                    break;
                }
                break;
            case -1276650569:
                if (name.equals("com.ss.android.lark.mail.impl.view.dialog.action.item.ScheduleActionItem")) {
                    c = 2;
                    break;
                }
                break;
            case -822575913:
                if (name.equals("com.ss.android.lark.mail.impl.view.dialog.action.item.ForwardActionItem")) {
                    c = 3;
                    break;
                }
                break;
            case 475050557:
                if (name.equals("com.ss.android.lark.mail.impl.view.dialog.action.item.ReEditActionItem")) {
                    c = 4;
                    break;
                }
                break;
            case 951359857:
                if (name.equals("com.ss.android.lark.mail.impl.view.dialog.action.item.RecallActionItem")) {
                    c = 5;
                    break;
                }
                break;
            case 957196151:
                if (name.equals("com.ss.android.lark.mail.impl.view.dialog.action.item.ReplyAllActionItem")) {
                    c = 6;
                    break;
                }
                break;
            case 1047246304:
                if (name.equals("com.ss.android.lark.mail.impl.view.dialog.action.item.TranslateActionItem")) {
                    c = 7;
                    break;
                }
                break;
            case 1298641148:
                if (name.equals("com.ss.android.lark.mail.impl.view.dialog.action.item.ReplyActionItem")) {
                    c = '\b';
                    break;
                }
                break;
            case 1391290723:
                if (name.equals("com.ss.android.lark.mail.impl.view.dialog.action.item.UnsubscribeActionItem")) {
                    c = '\t';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                bVar.mo154421h(view, actionDialog, actionItem);
                return true;
            case 1:
                bVar.mo154420g(view, actionDialog, actionItem);
                return true;
            case 2:
                bVar.mo154419f(view, actionDialog, actionItem);
                return true;
            case 3:
                bVar.mo154416c(view, actionDialog, actionItem);
                return true;
            case 4:
                bVar.mo154417d(view, actionDialog, actionItem);
                return true;
            case 5:
                bVar.mo154422i(view, actionDialog, actionItem);
                return true;
            case 6:
                bVar.mo154415b(view, actionDialog, actionItem);
                return true;
            case 7:
                bVar.mo154418e(view, actionDialog, actionItem);
                return true;
            case '\b':
                bVar.mo154414a(view, actionDialog, actionItem);
                return true;
            case '\t':
                bVar.mo154423j(view, actionDialog, actionItem);
                return true;
            default:
                return false;
        }
    }
}
