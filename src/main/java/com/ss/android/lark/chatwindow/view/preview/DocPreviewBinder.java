package com.ss.android.lark.chatwindow.view.preview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.preview.DocUrlPreviewVO;
import com.ss.android.lark.chat.utils.C34352r;
import com.ss.android.lark.chatwindow.view.preview.IPreviewBinder;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.doc.entity.AbstractC36839d;
import com.ss.android.lark.doc.entity.DocResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\"#B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001b2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010 \u001a\u00020!2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/preview/DocPreviewBinder;", "Lcom/ss/android/lark/chatwindow/view/preview/IPreviewBinder;", "Lcom/ss/android/lark/chatwindow/view/preview/DocPreviewBinder$DocUrlPreviewViewHolder;", "Lcom/ss/android/lark/chat/base/view/vo/message/preview/DocUrlPreviewVO;", "context", "Landroid/content/Context;", "dataProvider", "Lcom/ss/android/lark/chatwindow/view/preview/DocPreviewBinder$IDataProvider;", "onLongClickListener", "Landroid/view/View$OnLongClickListener;", "(Landroid/content/Context;Lcom/ss/android/lark/chatwindow/view/preview/DocPreviewBinder$IDataProvider;Landroid/view/View$OnLongClickListener;)V", "getContext", "()Landroid/content/Context;", "getDataProvider", "()Lcom/ss/android/lark/chatwindow/view/preview/DocPreviewBinder$IDataProvider;", "getOnLongClickListener", "()Landroid/view/View$OnLongClickListener;", "bindPreviewView", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "provider", "createPreviewView", "parent", "Landroid/view/ViewGroup;", "getDocCardViewBinder", "Lcom/ss/android/lark/doc/entity/IDocCardViewBinder;", "anchorView", "Landroid/view/View;", "getPreviewType", "", "setupOnLongClickListener", "view", "showPreview", "", "DocUrlPreviewViewHolder", "IDataProvider", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatwindow.view.b.a */
public final class DocPreviewBinder implements IPreviewBinder<DocUrlPreviewViewHolder, DocUrlPreviewVO> {

    /* renamed from: a */
    private final Context f91057a;

    /* renamed from: b */
    private final IDataProvider f91058b;

    /* renamed from: c */
    private final View.OnLongClickListener f91059c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\b\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\t\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u000bH&J\b\u0010\r\u001a\u00020\u000bH&J\b\u0010\u000e\u001a\u00020\u000bH&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/preview/DocPreviewBinder$IDataProvider;", "", "getChatAvatarKey", "", "getChatId", "getChatName", "getP2p2ChatterName", "getP2pChatterAvatarKey", "getP2pChatterId", "getSendId", "isCrossTenant", "", "isGroup", "isSelf", "isShowThumbBorder", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.b.a$b */
    public interface IDataProvider {
        /* renamed from: a */
        String mo129733a();

        /* renamed from: b */
        String mo129734b();

        /* renamed from: c */
        String mo129735c();

        /* renamed from: d */
        String mo129736d();

        /* renamed from: e */
        String mo129737e();

        /* renamed from: f */
        String mo129738f();

        /* renamed from: g */
        String mo129739g();

        /* renamed from: h */
        boolean mo129740h();

        /* renamed from: i */
        boolean mo129741i();

        /* renamed from: j */
        boolean mo129742j();

        /* renamed from: k */
        boolean mo129743k();
    }

    @Override // com.ss.android.lark.chatwindow.view.preview.IPreviewBinder
    /* renamed from: a */
    public int mo129762a() {
        return 2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/preview/DocPreviewBinder$DocUrlPreviewViewHolder;", "Lcom/ss/android/lark/chatwindow/view/preview/IPreviewBinder$PreviewViewHolder;", "itemView", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "mDocCardView", "Landroid/view/View;", "getMDocCardView", "()Landroid/view/View;", "setMDocCardView", "(Landroid/view/View;)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.b.a$a */
    public static final class DocUrlPreviewViewHolder extends IPreviewBinder.PreviewViewHolder {

        /* renamed from: a */
        private View f91060a;

        /* renamed from: a */
        public final View mo129768a() {
            return this.f91060a;
        }

        /* renamed from: a */
        public final void mo129769a(View view) {
            this.f91060a = view;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DocUrlPreviewViewHolder(ViewGroup viewGroup) {
            super(viewGroup);
            Intrinsics.checkParameterIsNotNull(viewGroup, "itemView");
        }
    }

    /* renamed from: a */
    private final AbstractC36839d m137686a(View view) {
        Object obj;
        if (view != null) {
            obj = view.getTag(R.id.tag_item_holder_view);
        } else {
            obj = null;
        }
        AbstractC36839d dVar = (AbstractC36839d) obj;
        if (dVar != null) {
            return dVar;
        }
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36839d a = b.mo134513L().mo134671a(this.f91057a);
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatModuleInstanceHolder…ocCardViewBinder(context)");
        return a;
    }

    /* renamed from: a */
    public boolean mo129767a(DocUrlPreviewVO bVar) {
        DocResult docResult;
        if (bVar != null) {
            docResult = bVar.mo121796a();
        } else {
            docResult = null;
        }
        if (docResult == null || !C34352r.m133232a(bVar.mo121796a(), this.f91058b.mo129742j())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public DocUrlPreviewViewHolder mo129764a(DocUrlPreviewVO bVar, ViewGroup viewGroup) {
        DocResult docResult;
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (bVar != null) {
            docResult = bVar.mo121796a();
        } else {
            docResult = null;
        }
        if (docResult == null) {
            return null;
        }
        return new DocUrlPreviewViewHolder(viewGroup);
    }

    /* renamed from: a */
    private final void m137687a(View view, View.OnLongClickListener onLongClickListener) {
        if (view.hasOnClickListeners()) {
            view.setOnLongClickListener(onLongClickListener);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                Intrinsics.checkExpressionValueIsNotNull(childAt, "view.getChildAt(i)");
                m137687a(childAt, onLongClickListener);
            }
        }
    }

    /* renamed from: a */
    public void mo129765a(DocUrlPreviewVO bVar, DocUrlPreviewViewHolder aVar) {
        ViewGroup viewGroup;
        View a;
        ViewGroup b;
        ViewGroup b2;
        if (mo129767a(bVar)) {
            Object obj = null;
            if (aVar != null) {
                viewGroup = aVar.mo129770b();
            } else {
                viewGroup = null;
            }
            AbstractC36839d a2 = m137686a(viewGroup);
            if (!(aVar == null || (b2 = aVar.mo129770b()) == null)) {
                obj = b2.getTag(R.id.doc_preview_view_tag);
            }
            View view = (View) obj;
            if (!(view != null || aVar == null || (b = aVar.mo129770b()) == null)) {
                view = a2.mo135980a(b);
                b.addView(view);
                b.setTag(R.id.tag_item_holder_view, a2);
                b.setTag(R.id.doc_preview_view_tag, view);
            }
            if (aVar != null) {
                aVar.mo129769a(view);
            }
            if (aVar != null && (a = aVar.mo129768a()) != null) {
                if (!(bVar == null || bVar.mo121796a() == null)) {
                    a2.mo135981a(a, bVar.mo121796a(), this.f91058b.mo129733a(), this.f91058b.mo129734b(), this.f91058b.mo129735c(), this.f91058b.mo129736d(), this.f91058b.mo129737e(), this.f91058b.mo129738f(), this.f91058b.mo129739g(), this.f91058b.mo129740h(), this.f91058b.mo129741i(), this.f91058b.mo129742j(), this.f91058b.mo129743k());
                }
                a.setOnLongClickListener(this.f91059c);
                ViewGroup b3 = aVar.mo129770b();
                if (b3 != null) {
                    m137687a(b3, this.f91059c);
                }
            }
        }
    }

    public DocPreviewBinder(Context context, IDataProvider bVar, View.OnLongClickListener onLongClickListener) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bVar, "dataProvider");
        this.f91057a = context;
        this.f91058b = bVar;
        this.f91059c = onLongClickListener;
    }
}
