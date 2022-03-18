package com.ss.android.lark.chat.utils;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35220c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.chat.ChatHitPoint;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J$\u0010\u000b\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\nH\u0007¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chat/utils/MessagePositionUtils;", "", "()V", "getCurrentReadPosition", "Lcom/ss/android/lark/chatwindow/model/data/LeftReadInfo;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "messageRV", "Landroidx/recyclerview/widget/RecyclerView;", "info", "Lcom/ss/android/lark/chat/utils/MessagePositionUtils$IMessagePosInfo;", "saveCurrentReadPositionIfNeed", "", "messagePosInfo", "IMessagePosInfo", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.utils.q */
public final class MessagePositionUtils {

    /* renamed from: a */
    public static final MessagePositionUtils f88696a = new MessagePositionUtils();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/chat/utils/MessagePositionUtils$IMessagePosInfo;", "", "itemCount", "", "getItemCount", "()I", "getItemByPosition", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "pos", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.utils.q$a */
    public interface IMessagePosInfo {
        /* renamed from: a */
        int mo123385a();

        /* renamed from: a */
        AbsMessageVO<?> mo123386a(int i);
    }

    private MessagePositionUtils() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.utils.q$b */
    public static final class RunnableC34351b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Chat f88697a;

        /* renamed from: b */
        final /* synthetic */ C35220c f88698b;

        RunnableC34351b(Chat chat, C35220c cVar) {
            this.f88697a = chat;
            this.f88698b = cVar;
        }

        public final void run() {
            C32821b.m126120a().mo121133a(this.f88697a.getId(), this.f88698b.f90967a, this.f88698b.f90968b, (IGetDataCallback<Void>) null);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m133220a(Chat chat, RecyclerView recyclerView, IMessagePosInfo aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "messagePosInfo");
        if (chat != null && recyclerView != null) {
            boolean z = false;
            if (C34339g.m133171e(chat) != Chat.MessagePosition.RECENT_LEFT) {
                ChatHitPoint.f135648a.mo187357a(false);
                return;
            }
            C35220c b = f88696a.m133221b(chat, recyclerView, aVar);
            Log.m165389i("ChatWindowLog", "saveCurrentReadPositionIfNeed, currentPosition is:" + b.f90967a + ", topOffset is:" + b.f90968b);
            ChatHitPoint.Companion aVar2 = ChatHitPoint.f135648a;
            if (b.f90967a != -1) {
                z = true;
            }
            aVar2.mo187357a(z);
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getFixedThreadPool().execute(new RunnableC34351b(chat, b));
        }
    }

    /* renamed from: b */
    private final C35220c m133221b(Chat chat, RecyclerView recyclerView, IMessagePosInfo aVar) {
        C35220c cVar = new C35220c();
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            try {
                int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                int a = aVar.mo123385a();
                if (findLastVisibleItemPosition >= 0) {
                    if (a > findLastVisibleItemPosition) {
                        AbsMessageVO<?> a2 = aVar.mo123386a(findLastVisibleItemPosition);
                        if (a2.mo121717y() != chat.getLastVisibleMessagePosition()) {
                            if (a2.mo121718z() != chat.getLastMessagePositionBadgeCount()) {
                                int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                                int a3 = aVar.mo123385a();
                                if (findFirstVisibleItemPosition >= 0) {
                                    if (a3 > findFirstVisibleItemPosition) {
                                        cVar.f90967a = aVar.mo123386a(findFirstVisibleItemPosition).mo121717y();
                                        int i = 0;
                                        View childAt = recyclerView.getChildAt(0);
                                        if (childAt != null) {
                                            i = childAt.getTop();
                                        }
                                        cVar.f90968b = i;
                                    }
                                }
                                return cVar;
                            }
                        }
                    }
                }
                return cVar;
            } catch (IndexOutOfBoundsException e) {
                Log.m165386e("ChatWindowLog", e);
            } catch (Exception e2) {
                Log.m165386e("ChatWindowLog", e2);
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }
    }
}
