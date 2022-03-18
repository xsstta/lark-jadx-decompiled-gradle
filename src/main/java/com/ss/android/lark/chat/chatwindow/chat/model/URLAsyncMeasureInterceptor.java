package com.ss.android.lark.chat.chatwindow.chat.model;

import android.content.Context;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TextContentVO;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.LayoutSizeHelper;
import com.ss.android.lark.chat.core.model.C33955c;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.entity.preview.NetUrlPreviewEntity;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.chat.entity.preview.Url;
import com.ss.android.lark.chat.entity.preview.UrlPreviewBody;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.preview.creator.ChatPreviewComponentCreator;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.tangram.base.component.IComponent;
import com.ss.android.lark.tangram.base.render.Render;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J,\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J,\u0010\u0019\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J,\u0010\u001a\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J,\u0010\u001b\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/model/URLAsyncMeasureInterceptor;", "Lcom/ss/android/lark/chat/core/model/DataListPipeline$ListChangeInterceptor;", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "context", "Landroid/content/Context;", "isGroup", "", "(Landroid/content/Context;Z)V", "getContext", "()Landroid/content/Context;", "isEnable", "()Z", "setEnable", "(Z)V", "buildComponentTree", "Lcom/ss/android/lark/tangram/base/render/Render;", "urlPreviewEntity", "Lcom/ss/android/lark/chat/entity/preview/NetUrlPreviewEntity;", "onItemChanged", "", "list", "", "start", "", "count", "onItemInserted", "onItemRemoved", "preCalculateLayout", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.j */
public final class URLAsyncMeasureInterceptor implements C33955c.AbstractC33956a<ChatMessageVO<?>> {

    /* renamed from: a */
    private boolean f86042a;

    /* renamed from: b */
    private final Context f86043b;

    /* renamed from: c */
    private final boolean f86044c;

    @Override // com.ss.android.lark.chat.core.model.C33955c.AbstractC33956a
    /* renamed from: b */
    public void mo122970b(List<ChatMessageVO<?>> list, int i, int i2) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/model/URLAsyncMeasureInterceptor$buildComponentTree$1", "Lcom/ss/android/lark/tangram/base/render/Render$OnAnchorViewDestroyCallback;", "onAnchorViewDestroy", "", "onComponentNotFindError", "component", "Lcom/ss/android/lark/tangram/base/component/IComponent;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.j$a */
    public static final class C33414a implements Render.OnAnchorViewDestroyCallback {
        @Override // com.ss.android.lark.tangram.base.render.Render.OnAnchorViewDestroyCallback
        /* renamed from: a */
        public void mo122981a() {
        }

        C33414a() {
        }
    }

    /* renamed from: a */
    public final void mo122980a(boolean z) {
        this.f86042a = z;
    }

    /* renamed from: a */
    private final Render m129472a(NetUrlPreviewEntity netUrlPreviewEntity) {
        String str;
        String str2;
        UrlPreviewBody urlPreviewBody;
        Url url;
        Context context = this.f86043b;
        if (netUrlPreviewEntity != null) {
            str = netUrlPreviewEntity.getPreviewId();
        } else {
            str = null;
        }
        if (netUrlPreviewEntity == null || (url = netUrlPreviewEntity.getUrl()) == null) {
            str2 = null;
        } else {
            str2 = url.getUrl();
        }
        ChatPreviewComponentCreator aVar = new ChatPreviewComponentCreator(context, str, str2, this.f86044c, null);
        if (netUrlPreviewEntity != null) {
            urlPreviewBody = netUrlPreviewEntity.getPreviewBody();
        } else {
            urlPreviewBody = null;
        }
        IComponent a = aVar.mo126249a(urlPreviewBody);
        int a2 = LayoutSizeHelper.m128406a(this.f86043b);
        if (a != null) {
            return new Render(a, new C33414a(), UIHelper.px2dp((float) a2), Integer.MAX_VALUE);
        }
        return null;
    }

    public URLAsyncMeasureInterceptor(Context context, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f86043b = context;
        this.f86044c = z;
    }

    @Override // com.ss.android.lark.chat.core.model.C33955c.AbstractC33956a
    /* renamed from: a */
    public void mo122969a(List<ChatMessageVO<?>> list, int i, int i2) {
        m129473d(list, i, i2);
    }

    @Override // com.ss.android.lark.chat.core.model.C33955c.AbstractC33956a
    /* renamed from: c */
    public void mo122971c(List<ChatMessageVO<?>> list, int i, int i2) {
        m129473d(list, i, i2);
    }

    /* renamed from: d */
    private final void m129473d(List<ChatMessageVO<?>> list, int i, int i2) {
        PreviewHangPoint q;
        PreviewHangPoint o;
        if (this.f86042a && list != null) {
            int i3 = i2 + i;
            while (i < i3) {
                ChatMessageVO<?> cVar = list.get(i);
                UrlPreviewEntity urlPreviewEntity = null;
                if (cVar.mo121710r() == Message.Type.TEXT && (cVar.mo121699g() instanceof TextContentVO)) {
                    ContentVO g = cVar.mo121699g();
                    if (g != null) {
                        TextContentVO mVar = (TextContentVO) g;
                        if (((TextContent) mVar.mo126168z()).getPreviewHangPoints().size() == 1 && mVar.mo121904o() != null && (o = mVar.mo121904o()) != null && o.hasPreViewBodyAndUrl()) {
                            PreviewHangPoint o2 = mVar.mo121904o();
                            if (o2 != null) {
                                urlPreviewEntity = o2.getUrlPreviewEntity();
                            }
                            mVar.mo121776a(m129472a((NetUrlPreviewEntity) urlPreviewEntity));
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.base.view.vo.message.TextContentVO");
                    }
                } else if (cVar.mo121710r() == Message.Type.POST && (cVar.mo121699g() instanceof PostContentVO)) {
                    ContentVO g2 = cVar.mo121699g();
                    if (g2 != null) {
                        PostContentVO iVar = (PostContentVO) g2;
                        if (((PostContent) iVar.mo126168z()).getPreviewHangPoints().size() == 1 && iVar.mo121885q() != null && (q = iVar.mo121885q()) != null && q.hasPreViewBodyAndUrl()) {
                            PreviewHangPoint q2 = iVar.mo121885q();
                            if (q2 != null) {
                                urlPreviewEntity = q2.getUrlPreviewEntity();
                            }
                            iVar.mo121776a(m129472a((NetUrlPreviewEntity) urlPreviewEntity));
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.base.view.vo.message.PostContentVO");
                    }
                }
                i++;
            }
        }
    }
}
