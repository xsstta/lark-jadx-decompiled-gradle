package com.ss.android.lark.chatwindow.view.preview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.chat.base.view.vo.message.preview.NewUrlPreviewVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.entity.preview.NetUrlPreviewEntity;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.chat.entity.preview.Url;
import com.ss.android.lark.chat.entity.preview.UrlPreviewBody;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.chat.preview.ChatPreviewInit;
import com.ss.android.lark.chat.preview.creator.ChatPreviewComponentCreator;
import com.ss.android.lark.chatwindow.view.preview.IPreviewBinder;
import com.ss.android.lark.tangram.base.component.IComponent;
import com.ss.android.lark.tangram.base.render.Render;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001d\u001eB)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u001c\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u0012\u0010\u001c\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/preview/NetPreviewBinder;", "Lcom/ss/android/lark/chatwindow/view/preview/IPreviewBinder;", "Lcom/ss/android/lark/chatwindow/view/preview/NetPreviewBinder$NewUrlPreviewViewHolder;", "Lcom/ss/android/lark/chat/base/view/vo/message/preview/NewUrlPreviewVO;", "context", "Landroid/content/Context;", "onLongClickListener", "Landroid/view/View$OnLongClickListener;", "isGroup", "", "mChatContext", "Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;", "(Landroid/content/Context;Landroid/view/View$OnLongClickListener;ZLcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;)V", "getMChatContext", "()Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;", "bindPreviewView", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "provider", "createPreviewView", "parent", "Landroid/view/ViewGroup;", "getPreviewType", "", "parseUrlComponentsFromPb", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewComponents;", "byteArray", "", "showPreview", "Companion", "NewUrlPreviewViewHolder", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatwindow.view.b.e */
public final class NetPreviewBinder implements IPreviewBinder<NewUrlPreviewViewHolder, NewUrlPreviewVO> {

    /* renamed from: a */
    public static final Companion f91076a = new Companion(null);

    /* renamed from: b */
    private final Context f91077b;

    /* renamed from: c */
    private final View.OnLongClickListener f91078c;

    /* renamed from: d */
    private final boolean f91079d;

    /* renamed from: e */
    private final AbstractC33342d f91080e;

    @Override // com.ss.android.lark.chatwindow.view.preview.IPreviewBinder
    /* renamed from: a */
    public int mo129762a() {
        return 4;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/preview/NetPreviewBinder$Companion;", "", "()V", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.b.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/preview/NetPreviewBinder$NewUrlPreviewViewHolder;", "Lcom/ss/android/lark/chatwindow/view/preview/IPreviewBinder$PreviewViewHolder;", "itemView", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.b.e$b */
    public static final class NewUrlPreviewViewHolder extends IPreviewBinder.PreviewViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NewUrlPreviewViewHolder(ViewGroup viewGroup) {
            super(viewGroup);
            Intrinsics.checkParameterIsNotNull(viewGroup, "itemView");
        }
    }

    /* renamed from: a */
    public boolean mo129783a(NewUrlPreviewVO cVar) {
        PreviewHangPoint previewHangPoint;
        if (cVar != null) {
            previewHangPoint = cVar.mo121797a();
        } else {
            previewHangPoint = null;
        }
        if (previewHangPoint != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public NewUrlPreviewViewHolder mo129764a(NewUrlPreviewVO cVar, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return new NewUrlPreviewViewHolder(viewGroup);
    }

    /* renamed from: a */
    public void mo129765a(NewUrlPreviewVO cVar, NewUrlPreviewViewHolder bVar) {
        ViewGroup b;
        UrlPreviewEntity urlPreviewEntity;
        UrlPreviewBody urlPreviewBody;
        String str;
        Url url;
        PreviewHangPoint a;
        Render b2;
        if (mo129783a(cVar) && bVar != null && (b = bVar.mo129770b()) != null) {
            if (cVar == null || (b2 = cVar.mo121799b()) == null) {
                String str2 = null;
                if (cVar == null || (a = cVar.mo121797a()) == null) {
                    urlPreviewEntity = null;
                } else {
                    urlPreviewEntity = a.getUrlPreviewEntity();
                }
                if (urlPreviewEntity instanceof NetUrlPreviewEntity) {
                    NetUrlPreviewEntity netUrlPreviewEntity = (NetUrlPreviewEntity) cVar.mo121797a().getUrlPreviewEntity();
                    if (netUrlPreviewEntity != null) {
                        urlPreviewBody = netUrlPreviewEntity.getPreviewBody();
                    } else {
                        urlPreviewBody = null;
                    }
                    Context context = this.f91077b;
                    if (netUrlPreviewEntity != null) {
                        str = netUrlPreviewEntity.getPreviewId();
                    } else {
                        str = null;
                    }
                    if (!(netUrlPreviewEntity == null || (url = netUrlPreviewEntity.getUrl()) == null)) {
                        str2 = url.getUrl();
                    }
                    ChatPreviewComponentCreator aVar = new ChatPreviewComponentCreator(context, str, str2, this.f91079d, this.f91078c);
                    IComponent a2 = aVar.mo126249a(urlPreviewBody);
                    AbstractC33342d dVar = this.f91080e;
                    int i = Integer.MAX_VALUE;
                    if (dVar == null || !dVar.mo122559w()) {
                        AbstractC33342d dVar2 = this.f91080e;
                        if (dVar2 == null || !dVar2.mo122558v()) {
                            ChatPreviewInit.IChatPreviewModuleDependency a3 = ChatPreviewInit.f88086a.mo126246a();
                            if (a3 != null) {
                                i = a3.mo102694a(this.f91077b);
                            }
                        } else {
                            ChatPreviewInit.IChatPreviewModuleDependency a4 = ChatPreviewInit.f88086a.mo126246a();
                            if (a4 != null) {
                                i = a4.mo102695a(this.f91077b, false);
                            }
                        }
                    } else {
                        ChatPreviewInit.IChatPreviewModuleDependency a5 = ChatPreviewInit.f88086a.mo126246a();
                        if (a5 != null) {
                            i = a5.mo102695a(this.f91077b, true);
                        }
                    }
                    cVar.mo121798a(aVar.mo126250a(b, a2, i));
                    return;
                }
                return;
            }
            b2.mo188792a(b).mo188789a();
        }
    }

    public NetPreviewBinder(Context context, View.OnLongClickListener onLongClickListener, boolean z, AbstractC33342d dVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f91077b = context;
        this.f91078c = onLongClickListener;
        this.f91079d = z;
        this.f91080e = dVar;
    }
}
