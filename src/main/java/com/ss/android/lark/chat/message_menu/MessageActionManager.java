package com.ss.android.lark.chat.message_menu;

import com.ss.android.lark.biz.im.extension.ActionContext;
import com.ss.android.lark.biz.im.extension.ActionInterceptor;
import com.ss.android.lark.biz.im.extension.ActionProvider;
import com.ss.android.lark.biz.im.extension.MessageAction;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.message_menu.interceptor.BlockedChatterActionInterceptor;
import com.ss.android.lark.chat.message_menu.interceptor.DismissedAccountActionInterceptor;
import com.ss.android.lark.chat.message_menu.interceptor.MergeForwardPageActionInterceptor;
import com.ss.android.lark.chat.message_menu.interceptor.PrivateThreadForwardPageActionInterceptor;
import com.ss.android.lark.chat.message_menu.interceptor.SecretActionInterceptor;
import com.ss.android.lark.chat.message_menu.interceptor.SecretChatPageActionInterceptor;
import com.ss.android.lark.chat.message_menu.interceptor.message.AudioMessageActionInterceptor;
import com.ss.android.lark.chat.message_menu.interceptor.message.CardMessageActionInterceptor;
import com.ss.android.lark.chat.message_menu.interceptor.message.ChatCommonMessageActionInterceptor;
import com.ss.android.lark.chat.message_menu.interceptor.message.FileMessageActionInterceptor;
import com.ss.android.lark.chat.message_menu.interceptor.message.FolderMessageActionInterceptor;
import com.ss.android.lark.chat.message_menu.interceptor.message.RedPacketMessageActionInterceptor;
import com.ss.android.lark.chat.message_menu.interceptor.message.ShareGroupMessageActionInterceptor;
import com.ss.android.lark.chat.message_menu.interceptor.message.StickerMessageActionInterceptor;
import com.ss.android.lark.chat.message_menu.interceptor.message.ThreadAudioMessageActionInterceptor;
import com.ss.android.lark.chat.message_menu.interceptor.message.ThreadCommonMessageActionInterceptor;
import com.ss.android.lark.chat.message_menu.interceptor.message.ThreadMergeForwardMessageActionInterceptor;
import com.ss.android.lark.chat.message_menu.interceptor.message.ThreadOtherAreaActionInterceptor;
import com.ss.android.lark.chat.message_menu.provider.BackToChatActionProvider;
import com.ss.android.lark.chat.message_menu.provider.ChatAddStickerActionProvider;
import com.ss.android.lark.chat.message_menu.provider.ChatAudioToTextActionProvider;
import com.ss.android.lark.chat.message_menu.provider.ChatCopyActionProvider;
import com.ss.android.lark.chat.message_menu.provider.ChatFavoriteActionProvider;
import com.ss.android.lark.chat.message_menu.provider.ChatForwardActionProvider;
import com.ss.android.lark.chat.message_menu.provider.ChatMultiSelectActionProvider;
import com.ss.android.lark.chat.message_menu.provider.ChatMutePlayActionProvider;
import com.ss.android.lark.chat.message_menu.provider.ChatRecallActionProvider;
import com.ss.android.lark.chat.message_menu.provider.ChatReplyActionProvider;
import com.ss.android.lark.chat.message_menu.provider.ChatTranslateActionProvider;
import com.ss.android.lark.chat.message_menu.provider.DeleteActionProvider;
import com.ss.android.lark.chat.message_menu.provider.DingActionProvider;
import com.ss.android.lark.chat.message_menu.provider.EditImageActionProvider;
import com.ss.android.lark.chat.message_menu.provider.HidePreviewActionProvider;
import com.ss.android.lark.chat.message_menu.provider.ImageToStickerActionProvider;
import com.ss.android.lark.chat.message_menu.provider.PinActionProvider;
import com.ss.android.lark.chat.message_menu.provider.PlayModeActionProvider;
import com.ss.android.lark.chat.message_menu.provider.ReactionActionProvider;
import com.ss.android.lark.chat.message_menu.provider.ThreadAddStickerActionProvider;
import com.ss.android.lark.chat.message_menu.provider.ThreadAudioToTextActionProvider;
import com.ss.android.lark.chat.message_menu.provider.ThreadCopyActionProvider;
import com.ss.android.lark.chat.message_menu.provider.ThreadDetailRecallActionProvider;
import com.ss.android.lark.chat.message_menu.provider.ThreadDetailReplyActionProvider;
import com.ss.android.lark.chat.message_menu.provider.ThreadFavoriteActionProvider;
import com.ss.android.lark.chat.message_menu.provider.ThreadForwardActionProvider;
import com.ss.android.lark.chat.message_menu.provider.ThreadMultiSelectActionProvider;
import com.ss.android.lark.chat.message_menu.provider.ThreadMutePlayActionProvider;
import com.ss.android.lark.chat.message_menu.provider.ThreadTranslateActionProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0007H\u0007J\u0018\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\nH\u0002J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\nH\u0002J\u000e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0007H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\tX\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/chat/message_menu/MessageActionManager;", "", "()V", "allInterceptorList", "", "Lcom/ss/android/lark/biz/im/extension/ActionInterceptor;", "allProviderList", "Lcom/ss/android/lark/biz/im/extension/ActionProvider;", "pageTypeToInterceptorListMap", "", "Lcom/ss/android/lark/biz/im/extension/ActionContext$PageType;", "pageTypeToProviderListMap", "addInterceptor", "", "interceptor", "addProvider", "provider", "buildMenuItemList", "", "Lcom/ss/android/lark/chat/export/ui/menu/MenuItem;", "actionContext", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "ensureInterceptorListOfPageTypeInitialized", "pageType", "ensureProviderListOfPageTypeInitialized", "removeInterceptor", "removeProvider", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.c.a */
public final class MessageActionManager {

    /* renamed from: a */
    public static final MessageActionManager f84892a = new MessageActionManager();

    /* renamed from: b */
    private static final List<ActionProvider> f84893b;

    /* renamed from: c */
    private static final List<ActionInterceptor> f84894c;

    /* renamed from: d */
    private static final Map<ActionContext.PageType, List<ActionProvider>> f84895d = new LinkedHashMap();

    /* renamed from: e */
    private static final Map<ActionContext.PageType, List<ActionInterceptor>> f84896e = new LinkedHashMap();

    private MessageActionManager() {
    }

    static {
        ArrayList arrayList = new ArrayList();
        f84893b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        f84894c = arrayList2;
        arrayList.add(new ReactionActionProvider());
        arrayList.add(new ChatAddStickerActionProvider());
        arrayList.add(new ImageToStickerActionProvider());
        arrayList.add(new PlayModeActionProvider());
        arrayList.add(new ChatAudioToTextActionProvider());
        arrayList.add(new DingActionProvider());
        arrayList.add(new ChatMutePlayActionProvider());
        arrayList.add(new ChatReplyActionProvider());
        arrayList.add(new ChatCopyActionProvider());
        arrayList.add(new ChatForwardActionProvider());
        arrayList.add(new BackToChatActionProvider());
        arrayList.add(new ChatFavoriteActionProvider());
        arrayList.add(new ChatMultiSelectActionProvider());
        arrayList.add(new PinActionProvider());
        arrayList.add(new ChatRecallActionProvider());
        arrayList.add(new ChatTranslateActionProvider());
        arrayList.add(new DeleteActionProvider());
        arrayList.add(new HidePreviewActionProvider());
        arrayList.add(new EditImageActionProvider());
        arrayList.add(new ThreadAddStickerActionProvider());
        arrayList.add(new ThreadAudioToTextActionProvider());
        arrayList.add(new ThreadMutePlayActionProvider());
        arrayList.add(new ThreadTranslateActionProvider());
        arrayList.add(new ThreadCopyActionProvider());
        arrayList.add(new ThreadDetailReplyActionProvider());
        arrayList.add(new ThreadForwardActionProvider());
        arrayList.add(new ThreadFavoriteActionProvider());
        arrayList.add(new ThreadDetailRecallActionProvider());
        arrayList.add(new ThreadMultiSelectActionProvider());
        arrayList2.add(new SecretActionInterceptor());
        arrayList2.add(new AudioMessageActionInterceptor());
        arrayList2.add(new BlockedChatterActionInterceptor());
        arrayList2.add(new ChatCommonMessageActionInterceptor());
        arrayList2.add(new ThreadCommonMessageActionInterceptor());
        arrayList2.add(new DismissedAccountActionInterceptor());
        arrayList2.add(new FileMessageActionInterceptor());
        arrayList2.add(new FolderMessageActionInterceptor());
        arrayList2.add(new MergeForwardPageActionInterceptor());
        arrayList2.add(new RedPacketMessageActionInterceptor());
        arrayList2.add(new SecretChatPageActionInterceptor());
        arrayList2.add(new ShareGroupMessageActionInterceptor());
        arrayList2.add(new StickerMessageActionInterceptor());
        arrayList2.add(new ThreadMergeForwardMessageActionInterceptor());
        arrayList2.add(new ThreadAudioMessageActionInterceptor());
        arrayList2.add(new PrivateThreadForwardPageActionInterceptor());
        arrayList2.add(new ThreadOtherAreaActionInterceptor());
        arrayList2.add(new CardMessageActionInterceptor());
    }

    /* renamed from: a */
    public final void mo121932a(ActionInterceptor aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "interceptor");
        List<ActionInterceptor> list = f84894c;
        if (!list.contains(aVar)) {
            list.add(aVar);
            for (ActionContext.PageType pageType : aVar.mo106803a()) {
                m127162b(pageType);
                List<ActionInterceptor> list2 = f84896e.get(pageType);
                if (list2 != null && !list2.contains(aVar)) {
                    list2.add(aVar);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo121934b(ActionProvider bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "provider");
        f84893b.remove(bVar);
        for (ActionContext.PageType pageType : bVar.mo106806a()) {
            List<ActionProvider> list = f84895d.get(pageType);
            if (list != null) {
                list.remove(bVar);
            }
        }
    }

    /* renamed from: a */
    private final void m127161a(ActionContext.PageType pageType) {
        boolean z;
        List<ActionProvider> list = f84895d.get(pageType);
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (T t : f84893b) {
                if (t.mo106806a().contains(pageType)) {
                    arrayList.add(t);
                }
            }
            f84895d.put(pageType, CollectionsKt.toMutableList((Collection) arrayList));
        }
    }

    /* renamed from: b */
    private final void m127162b(ActionContext.PageType pageType) {
        boolean z;
        List<ActionInterceptor> list = f84896e.get(pageType);
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (T t : f84894c) {
                if (t.mo106803a().contains(pageType)) {
                    arrayList.add(t);
                }
            }
            f84896e.put(pageType, CollectionsKt.toMutableList((Collection) arrayList));
        }
    }

    /* renamed from: a */
    public final List<C34029b<?>> mo121931a(ActionContext actionContext) {
        ArrayList arrayList;
        Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
        ActionContext.PageType d = actionContext.mo106784d();
        ArrayList arrayList2 = new ArrayList();
        m127161a(d);
        m127162b(d);
        List<ActionProvider> list = f84895d.get(d);
        if (list != null) {
            List<ActionInterceptor> list2 = f84896e.get(d);
            if (list2 != null) {
                ArrayList arrayList3 = new ArrayList();
                for (T t : list2) {
                    if (t.mo106805a(actionContext.mo106788h().mo121710r())) {
                        arrayList3.add(t);
                    }
                }
                arrayList = arrayList3;
            } else {
                arrayList = CollectionsKt.emptyList();
            }
            for (ActionProvider bVar : list) {
                if (bVar.mo106808a(actionContext.mo106788h().mo121710r()) && bVar.mo106807a(actionContext)) {
                    MessageAction b = bVar.mo106809b(actionContext);
                    boolean z = false;
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((ActionInterceptor) it.next()).mo106804a(b, actionContext)) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (!z) {
                        arrayList2.add(b.mo106824g());
                    }
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    public final void mo121933a(ActionProvider bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "provider");
        List<ActionProvider> list = f84893b;
        if (!list.contains(bVar)) {
            list.add(bVar);
            for (ActionContext.PageType pageType : bVar.mo106806a()) {
                m127161a(pageType);
                List<ActionProvider> list2 = f84895d.get(pageType);
                if (list2 != null && !list2.contains(bVar)) {
                    list2.add(bVar);
                }
            }
        }
    }
}
