package com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.aj;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.thread.ThreadInfo;
import com.ss.android.lark.dto.translate.C36874a;
import com.ss.android.lark.dto.translate.TranslateState;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.b.b.ad */
public class C33102ad extends C33103ae {
    private Map<String, String> mReplyThreadIdMap = new HashMap();

    public static C33102ad from(Fragment fragment) {
        return (C33102ad) aj.m5364a(fragment).mo6005a(C33102ad.class);
    }

    public static C33102ad from(FragmentActivity fragmentActivity) {
        return (C33102ad) aj.m5366a(fragmentActivity).mo6005a(C33102ad.class);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33103ae, com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w
    public void batchUpdateTranslateState(List<AbstractC34006a> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC34006a aVar : list) {
            if (aVar instanceof ThreadInfo) {
                if (aVar.getMessage().getType() == Message.Type.TEXT || aVar.getMessage().getType() == Message.Type.POST || aVar.getMessage().getType() == Message.Type.IMAGE || aVar.getMessage().getType() == Message.Type.MERGE_FORWARD) {
                    arrayList.add(aVar);
                }
                ThreadInfo threadInfo = (ThreadInfo) aVar;
                if (!CollectionUtils.isEmpty(threadInfo.mo126023e())) {
                    for (MessageInfo messageInfo : threadInfo.mo126023e()) {
                        if (messageInfo.getMessage() != null && (messageInfo.getMessage().getType() == Message.Type.TEXT || messageInfo.getMessage().getType() == Message.Type.IMAGE || messageInfo.getMessage().getType() == Message.Type.POST)) {
                            this.mReplyThreadIdMap.put(messageInfo.getId(), threadInfo.getId());
                            arrayList2.add(messageInfo);
                        }
                    }
                }
            }
        }
        if (!CollectionUtils.isEmpty(arrayList)) {
            super.batchUpdateTranslateState(arrayList);
        }
        if (!CollectionUtils.isEmpty(arrayList2)) {
            super.batchUpdateTranslateState(arrayList2);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33103ae, com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w
    public void handlePushTranslateState(C36874a aVar, AbstractC33134w.AbstractC33136b bVar) {
        super.handlePushTranslateState(aVar, bVar);
        HashSet hashSet = new HashSet();
        if (!CollectionUtils.isEmpty(aVar.mo136147b())) {
            ArrayList<String> arrayList = new ArrayList(aVar.mo136147b().keySet());
            HashSet hashSet2 = new HashSet();
            for (String str : arrayList) {
                String str2 = this.mReplyThreadIdMap.get(str);
                if (!TextUtils.isEmpty(str2)) {
                    hashSet2.add(str2);
                }
            }
            Iterator<AbstractC34006a> it = getMessageInfoMap(new ArrayList(hashSet2)).values().iterator();
            while (it.hasNext()) {
                ThreadInfo threadInfo = (ThreadInfo) it.next();
                List<MessageInfo> e = threadInfo.mo126023e();
                if (e != null) {
                    for (MessageInfo messageInfo : e) {
                        TranslateState translateState = aVar.mo136147b().get(messageInfo.getId());
                        if (translateState != null) {
                            messageInfo.setMessage(translateState.getMessage());
                            messageInfo.setTranslateInfo(translateState.getTranslateInfo());
                        }
                    }
                    hashSet.add(threadInfo);
                }
            }
            Log.m165379d("ThreadTranslateModelHandler", "handle reply PushTranslateState ：" + hashSet.size());
        }
        if (!CollectionUtils.isEmpty(hashSet)) {
            this.mDataProvider.mo122324b(hashSet);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33103ae
    public void translate(AbstractC34006a aVar, String str, IGetDataCallback<Map<String, TranslateState>> iGetDataCallback) {
        Chat j;
        String str2 = this.mCurrentChatId;
        boolean z = aVar instanceof ThreadInfo;
        if (z && (j = ((ThreadInfo) aVar).mo126028j()) != null) {
            str2 = j.getId();
        }
        translate(aVar, str, str2, iGetDataCallback);
        if (z) {
            ThreadInfo threadInfo = (ThreadInfo) aVar;
            if (!CollectionUtils.isEmpty(threadInfo.mo126023e())) {
                HashMap hashMap = new HashMap();
                for (MessageInfo messageInfo : threadInfo.mo126023e()) {
                    if (messageInfo.getMessage().getType() == Message.Type.TEXT || messageInfo.getMessage().getType() == Message.Type.POST) {
                        hashMap.put(messageInfo.getId(), messageInfo);
                        this.mReplyThreadIdMap.put(messageInfo.getId(), threadInfo.getId());
                    }
                }
                if (!CollectionUtils.isEmpty(hashMap)) {
                    translate(new ArrayList(hashMap.keySet()), hashMap, true, str, getMessageSource(""), str2, iGetDataCallback);
                }
            }
        }
    }
}
