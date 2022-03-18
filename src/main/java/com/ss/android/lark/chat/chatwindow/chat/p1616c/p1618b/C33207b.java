package com.ss.android.lark.chat.chatwindow.chat.p1616c.p1618b;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1619c.C33213c;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1619c.C33215e;
import com.ss.android.lark.chat.core.model.ChannelDataFetcherStrategy;
import com.ss.android.lark.chat.core.model.MessageFetchScene;
import com.ss.android.lark.chat.core.model.entity.ChatMessageResponse;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.service.IInnerMessageService;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.utils.statistics.PerfLog;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.c.b.b */
public class C33207b implements AbstractC33208c<C33213c, C33215e<ChatMessageResponse>> {

    /* renamed from: a */
    private IInnerMessageService f85417a = C32848e.m126401b();

    /* renamed from: a */
    public C33215e<ChatMessageResponse> mo122423a(C33213c cVar) {
        MessageFetchScene messageFetchScene;
        boolean z;
        ChannelDataFetcherStrategy channelDataFetcherStrategy;
        String str;
        String b = cVar.mo122437b();
        int c = cVar.mo122438c();
        if (c >= 0) {
            messageFetchScene = MessageFetchScene.SPECIFIED_POSITION;
        } else {
            messageFetchScene = MessageFetchScene.FIRST_SCREEN;
        }
        if (c >= 0) {
            z = true;
        } else {
            z = false;
        }
        m128296a(b, true, z);
        if (z) {
            channelDataFetcherStrategy = ChannelDataFetcherStrategy.SYNC_SERVER_DATA;
        } else {
            channelDataFetcherStrategy = ChannelDataFetcherStrategy.RETURN_LOCAL_DATA;
        }
        PerfLog.start("syncPullChatMessages", "");
        ChatMessageResponse a = this.f85417a.mo121079a(b, messageFetchScene, c, 15, 5, 30, true, channelDataFetcherStrategy, "");
        PerfLog.end("syncPullChatMessages", "");
        C33215e<ChatMessageResponse> eVar = new C33215e<>();
        if (a != null) {
            boolean isNotEmpty = CollectionUtils.isNotEmpty(a.missingPositions);
            if (CollectionUtils.isNotEmpty(a.messageInfoList) || !isNotEmpty || z) {
                str = b;
                m128295a(messageFetchScene, a.messageInfoList);
                eVar.mo122445a(a);
            } else {
                Log.m165389i("ChatWindowDataPreLoader", "local data is empty, reload from net");
                PerfLog.start("syncPullNetMessages", "");
                str = b;
                a = this.f85417a.mo121079a(b, messageFetchScene, c, 15, 5, 30, true, ChannelDataFetcherStrategy.SYNC_SERVER_DATA, "");
                PerfLog.end("syncPullNetMessages", "");
                if (a == null) {
                    eVar.mo122444a(new ErrorResult("preload data failed, task is：" + cVar.mo122430a()));
                } else {
                    m128295a(messageFetchScene, a.messageInfoList);
                    eVar.mo122445a(a);
                }
            }
            if (a != null) {
                C29990c.m110930b().mo134577e().mo120954a(a.sdkCost, a.clientDataCost, a.netCosts);
            }
        } else {
            str = b;
            eVar.mo122444a(new ErrorResult("preload data failed, task is：" + cVar.mo122430a()));
        }
        m128296a(str, false, z);
        return eVar;
    }

    /* renamed from: a */
    private void m128295a(MessageFetchScene messageFetchScene, List<MessageInfo> list) {
        Log.m165389i("ChatWindowDataPreLoader", "print first page data begin, scene:" + messageFetchScene.getDesc());
        Iterator<MessageInfo> it = list.iterator();
        while (it.hasNext()) {
            Log.m165389i("ChatWindowDataPreLoader", "load message:" + it.next().getMessage());
        }
    }

    /* renamed from: a */
    private void m128296a(String str, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                C29990c.m110930b().mo134577e().mo120958a(str, C53234a.m205877a());
            } else {
                C29990c.m110930b().mo134577e().mo120970d();
            }
        } else if (z) {
            C29990c.m110930b().mo134577e().mo120964b(str);
        } else {
            C29990c.m110930b().mo134577e().mo120967c();
        }
        String str2 = "viaNetwork";
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("chat_loadData_");
            if (!z2) {
                str2 = "viaLocal";
            }
            sb.append(str2);
            PerfLog.start(sb.toString(), "");
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("chat_loadData_");
            if (!z2) {
                str2 = "viaLocal";
            }
            sb2.append(str2);
            PerfLog.end(sb2.toString(), "");
        }
        C29990c.m110930b().mo134577e().mo120976g();
    }
}
