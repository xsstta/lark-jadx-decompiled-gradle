package com.ss.android.lark.chatwindow.p1723b;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.im.v1.PushMessageReactions;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.api.service.p1600b.C32832c;
import com.ss.android.lark.chat.entity.chatter.C33982a;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.chat.entity.chatter.WorkStatus;
import com.ss.android.lark.chat.entity.reaction.Reaction;
import com.ss.android.lark.chat.entity.reaction.ReactionInfo;
import com.ss.android.lark.chat.utils.C34340h;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2851u.p2852a.C57306b;
import com.ss.android.lark.p2851u.p2852a.C57327p;
import com.ss.android.lark.reaction.widget.detailwindow.bean.DetailUserInfo;
import com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel;
import com.ss.android.lark.reaction.widget.flowlayout.p2562a.C53061a;
import com.ss.android.lark.reaction.widget.flowlayout.p2562a.C53062b;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.chatwindow.b.c */
public class C35237c {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chatwindow.b.c$1 */
    public static /* synthetic */ class C352381 {

        /* renamed from: a */
        static final /* synthetic */ int[] f90997a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.lark.chat.entity.chatter.ChatterDescription$Type[] r0 = com.ss.android.lark.chat.entity.chatter.ChatterDescription.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.chatwindow.p1723b.C35237c.C352381.f90997a = r0
                com.ss.android.lark.chat.entity.chatter.ChatterDescription$Type r1 = com.ss.android.lark.chat.entity.chatter.ChatterDescription.Type.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.chatwindow.p1723b.C35237c.C352381.f90997a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.chat.entity.chatter.ChatterDescription$Type r1 = com.ss.android.lark.chat.entity.chatter.ChatterDescription.Type.BUSINESS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.chatwindow.p1723b.C35237c.C352381.f90997a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.chat.entity.chatter.ChatterDescription$Type r1 = com.ss.android.lark.chat.entity.chatter.ChatterDescription.Type.LEAVE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.chatwindow.p1723b.C35237c.C352381.f90997a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.chat.entity.chatter.ChatterDescription$Type r1 = com.ss.android.lark.chat.entity.chatter.ChatterDescription.Type.MEETING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chatwindow.p1723b.C35237c.C352381.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static DetailUserInfo.DescriptionType m137594a(ChatterDescription.Type type) {
        int i = C352381.f90997a[type.ordinal()];
        if (i == 1) {
            return DetailUserInfo.DescriptionType.DEFAULT;
        }
        if (i == 2) {
            return DetailUserInfo.DescriptionType.BUSINESS;
        }
        if (i == 3) {
            return DetailUserInfo.DescriptionType.LEAVE;
        }
        if (i != 4) {
            return DetailUserInfo.DescriptionType.DEFAULT;
        }
        return DetailUserInfo.DescriptionType.MEETING;
    }

    /* renamed from: a */
    public static List<ReactionDetailViewModel> m137597a(List<ReactionInfo> list, boolean z) {
        ChatterNameDisplayRule chatterNameDisplayRule;
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        String a = C29990c.m110930b().mo134515N().mo134394a();
        C32832c a2 = C32832c.m126312a();
        if (z) {
            chatterNameDisplayRule = ChatterNameDisplayRule.ALIAS_NAME;
        } else {
            chatterNameDisplayRule = ChatterNameDisplayRule.NICKNAME_ALIAS_NAME;
        }
        for (ReactionInfo reactionInfo : list) {
            ReactionDetailViewModel reactionDetailViewModel = new ReactionDetailViewModel();
            reactionDetailViewModel.setReactionKey(reactionInfo.getReaction().getType());
            ArrayList arrayList2 = new ArrayList();
            Map<String, ChatChatter> reactionChatters = reactionInfo.getReactionChatters();
            List<String> chatterIds = reactionInfo.getReaction().getChatterIds();
            if (chatterIds.contains(a)) {
                if (!(chatterIds instanceof ArrayList)) {
                    ArrayList arrayList3 = new ArrayList(chatterIds);
                    reactionInfo.getReaction().setChatterIds(arrayList3);
                    chatterIds = arrayList3;
                }
                chatterIds.remove(a);
                chatterIds.add(0, a);
            }
            for (String str : chatterIds) {
                ChatChatter chatChatter = reactionChatters.get(str);
                if (chatChatter != null) {
                    DetailUserInfo detailUserInfo = new DetailUserInfo();
                    detailUserInfo.setAvatarKey(chatChatter.getAvatarKey());
                    detailUserInfo.setUserName(a2.mo121121a(chatChatter, chatterNameDisplayRule));
                    detailUserInfo.setUserId(chatChatter.getId());
                    detailUserInfo.setRegistered(chatChatter.getRegistered());
                    ChatterDescription description = chatChatter.getDescription();
                    if (description != null) {
                        detailUserInfo.setDescription(description.description);
                        detailUserInfo.setDescType(m137594a(description.type));
                    }
                    WorkStatus workStatus = chatChatter.getWorkStatus();
                    if (WorkStatus.isInvalid(workStatus)) {
                        detailUserInfo.setWorkStatusDesc("");
                    } else {
                        detailUserInfo.setWorkStatusDesc(workStatus.getDisplayTextNoDuration(UIHelper.getContext()));
                    }
                    arrayList2.add(detailUserInfo);
                }
            }
            reactionDetailViewModel.setTotalCount(reactionInfo.getReaction().getCount());
            reactionDetailViewModel.setUserInfoList(arrayList2);
            arrayList.add(reactionDetailViewModel);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<ReactionInfo> m137595a(String str, PushMessageReactions.Reactions reactions, C14928Entity entity) {
        ArrayList arrayList = new ArrayList();
        if (!(TextUtils.isEmpty(str) || reactions == null || entity == null)) {
            C33982a a = C57306b.m222058a(entity, true, "ReactionParser::parseReactionInfo");
            for (PushMessageReactions.Reactions.Reaction reaction : reactions.reactions) {
                if (reaction != null) {
                    Reaction a2 = C57327p.m222181a(reaction);
                    List<String> chatterIds = a2.getChatterIds();
                    HashMap hashMap = new HashMap();
                    for (String str2 : chatterIds) {
                        ChatChatter a3 = a.mo124892a(str, str2);
                        if (a3 != null) {
                            hashMap.put(a3.getId(), a3);
                        } else {
                            Log.m165397w("ReactionParser", "reactionChatter is null, chatId: " + str + ", reactionChatterId: " + str2);
                        }
                    }
                    arrayList.add(new ReactionInfo(a2, hashMap));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<C53061a> m137596a(String str, boolean z, List<ReactionInfo> list) {
        ChatterNameDisplayRule chatterNameDisplayRule;
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        ArrayList<ReactionInfo> arrayList2 = new ArrayList(list);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            if (CollectionUtils.isEmpty(((ReactionInfo) it.next()).getReaction().getChatterIds())) {
                it.remove();
            }
        }
        if (CollectionUtils.isEmpty(arrayList2)) {
            return arrayList;
        }
        for (ReactionInfo reactionInfo : arrayList2) {
            List<String> chatterIds = reactionInfo.getReaction().getChatterIds();
            Map<String, ChatChatter> reactionChatters = reactionInfo.getReactionChatters();
            if (chatterIds.contains(str)) {
                if (!(chatterIds instanceof ArrayList)) {
                    ArrayList arrayList3 = new ArrayList(chatterIds);
                    reactionInfo.getReaction().setChatterIds(arrayList3);
                    chatterIds = arrayList3;
                }
                chatterIds.remove(str);
                chatterIds.add(0, str);
            }
            ArrayList<Chatter> arrayList4 = new ArrayList();
            for (String str2 : chatterIds) {
                ChatChatter chatChatter = reactionChatters.get(str2);
                if (chatChatter != null) {
                    arrayList4.add(chatChatter);
                } else {
                    Log.m165388i("reaction cannot find chatter: " + str2);
                }
            }
            if (arrayList4.size() != 0) {
                ArrayList arrayList5 = new ArrayList();
                if (z) {
                    chatterNameDisplayRule = ChatterNameDisplayRule.ALIAS_NAME;
                } else {
                    chatterNameDisplayRule = ChatterNameDisplayRule.NICKNAME_ALIAS_NAME;
                }
                for (Chatter chatter : arrayList4) {
                    String a = C34340h.m133174a(chatter, chatterNameDisplayRule);
                    if (!TextUtils.isEmpty(a)) {
                        C53062b bVar = new C53062b();
                        bVar.f131136a = chatter.getId();
                        bVar.f131137b = a;
                        bVar.mo181234b(!chatter.isAnonymous());
                        arrayList5.add(bVar);
                    }
                }
                C53061a aVar = new C53061a();
                aVar.f131133a = reactionInfo.getReaction().getType();
                aVar.f131134b = Math.max(reactionInfo.getReaction().getCount(), arrayList5.size());
                aVar.f131135c = arrayList5;
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }
}
