package com.ss.android.lark.chatsetting.impl.chat_search;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.impl.chat_search.ChatSearchTypeAdapter;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingExtraParams;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.chatsetting.impl.statistics.setting.SettingHitPoint;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B'\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/chat_search/ChatSearchMenuController;", "", "context", "Landroid/content/Context;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "delegate", "Lcom/ss/android/lark/chatsetting/impl/chat_search/ChatSearchMenuController$SearchDelegate;", "(Landroid/content/Context;Landroidx/recyclerview/widget/RecyclerView;Lcom/ss/android/lark/chat/entity/chat/Chat;Lcom/ss/android/lark/chatsetting/impl/chat_search/ChatSearchMenuController$SearchDelegate;)V", "list", "", "Lcom/ss/android/lark/chatsetting/impl/chat_search/ChatSearchTypeBean;", "mChat", "mContext", "mDelegate", "mRecyclerView", "initList", "", "initRV", "sendItemClickEvent", ShareHitPoint.f121869d, "", "Companion", "SearchDelegate", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.chat_search.a */
public final class ChatSearchMenuController {

    /* renamed from: e */
    public static final Companion f89121e = new Companion(null);

    /* renamed from: a */
    public final Context f89122a;

    /* renamed from: b */
    public List<ChatSearchTypeBean> f89123b;

    /* renamed from: c */
    public final Chat f89124c;

    /* renamed from: d */
    public final SearchDelegate f89125d;

    /* renamed from: f */
    private final RecyclerView f89126f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/chat_search/ChatSearchMenuController$SearchDelegate;", "", "gotoSearchHistoryActivity", "", "context", "Landroid/content/Context;", "chatId", "", "isThread", "", ShareHitPoint.f121869d, "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.chat_search.a$b */
    public interface SearchDelegate {
        void gotoSearchHistoryActivity(Context context, String str, boolean z, int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/chat_search/ChatSearchMenuController$Companion;", "", "()V", "newInstance", "Lcom/ss/android/lark/chatsetting/impl/chat_search/ChatSearchMenuController;", "context", "Landroid/content/Context;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "delegate", "Lcom/ss/android/lark/chatsetting/impl/chat_search/ChatSearchMenuController$SearchDelegate;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.chat_search.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ChatSearchMenuController mo127604a(Context context, RecyclerView recyclerView, Chat chat, SearchDelegate bVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Intrinsics.checkParameterIsNotNull(bVar, "delegate");
            return new ChatSearchMenuController(context, recyclerView, chat, bVar, null);
        }
    }

    /* renamed from: a */
    private final void m134095a() {
        this.f89126f.setLayoutManager(new GridLayoutManager(this.f89122a, 5));
        ChatSearchTypeAdapter bVar = new ChatSearchTypeAdapter();
        bVar.mo127608a(new C34527c(this));
        this.f89126f.setAdapter(bVar);
        List<ChatSearchTypeBean> list = this.f89123b;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("list");
        }
        bVar.resetAll(list);
    }

    /* renamed from: b */
    private final void m134096b() {
        String string = UIHelper.getString(R.string.Lark_Legacy_MessageFragmentTitle);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…acy_MessageFragmentTitle)");
        String string2 = UIHelper.getString(R.string.Lark_Legacy_SendDocKey);
        Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(R.str…g.Lark_Legacy_SendDocKey)");
        String string3 = UIHelper.getString(R.string.Lark_Legacy_FileFragmentTitle);
        Intrinsics.checkExpressionValueIsNotNull(string3, "UIHelper.getString(R.str…Legacy_FileFragmentTitle)");
        String string4 = UIHelper.getString(R.string.Lark_Legacy_SearchPhotoInchat);
        Intrinsics.checkExpressionValueIsNotNull(string4, "UIHelper.getString(R.str…Legacy_SearchPhotoInchat)");
        String string5 = UIHelper.getString(R.string.Lark_Search_Link);
        Intrinsics.checkExpressionValueIsNotNull(string5, "UIHelper.getString(R.string.Lark_Search_Link)");
        this.f89123b = CollectionsKt.mutableListOf(new ChatSearchTypeBean(0, string, R.drawable.ud_icon_chat_outlined), new ChatSearchTypeBean(1, string2, R.drawable.ud_icon_space_outlined), new ChatSearchTypeBean(2, string3, R.drawable.ud_icon_folder_outlined), new ChatSearchTypeBean(3, string4, R.drawable.ud_icon_image_outlined), new ChatSearchTypeBean(4, string5, R.drawable.ud_icon_link_copy_outlined));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/chat_search/ChatSearchMenuController$initRV$1", "Lcom/ss/android/lark/chatsetting/impl/chat_search/ChatSearchTypeAdapter$OnItemSelectListener;", "onItemSelect", "", "position", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.chat_search.a$c */
    public static final class C34527c implements ChatSearchTypeAdapter.OnItemSelectListener {

        /* renamed from: a */
        final /* synthetic */ ChatSearchMenuController f89127a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34527c(ChatSearchMenuController aVar) {
            this.f89127a = aVar;
        }

        @Override // com.ss.android.lark.chatsetting.impl.chat_search.ChatSearchTypeAdapter.OnItemSelectListener
        /* renamed from: a */
        public void mo127606a(int i) {
            ChatSearchMenuController aVar = this.f89127a;
            aVar.mo127603a(((ChatSearchTypeBean) ChatSearchMenuController.m134094a(aVar).get(i)).mo127613a());
            SettingHitPoint.f90520a.mo129268a(this.f89127a.f89124c, ((ChatSearchTypeBean) ChatSearchMenuController.m134094a(this.f89127a).get(i)).mo127613a());
            SearchDelegate bVar = this.f89127a.f89125d;
            Context context = this.f89127a.f89122a;
            String id = this.f89127a.f89124c.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "mChat.getId()");
            bVar.gotoSearchHistoryActivity(context, id, this.f89127a.f89124c.isThread(), ((ChatSearchTypeBean) ChatSearchMenuController.m134094a(this.f89127a).get(i)).mo127613a());
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ List m134094a(ChatSearchMenuController aVar) {
        List<ChatSearchTypeBean> list = aVar.f89123b;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("list");
        }
        return list;
    }

    /* renamed from: a */
    public final void mo127603a(int i) {
        ChatSettingExtraParams.Click click;
        ChatSettingExtraParams.Target target;
        if (i == 1) {
            click = ChatSettingExtraParams.Click.DOC;
            target = ChatSettingExtraParams.Target.IM_CHAT_HISTORY_DOC_VIEW;
        } else if (i == 2) {
            click = ChatSettingExtraParams.Click.FILE;
            target = ChatSettingExtraParams.Target.IM_CHAT_HISTORY_FILE_VIEW;
        } else if (i == 3) {
            click = ChatSettingExtraParams.Click.IMAGE;
            target = ChatSettingExtraParams.Target.IM_CHAT_HISTORY_IMAGE_VIEW;
        } else if (i != 4) {
            click = ChatSettingExtraParams.Click.MESSAGE;
            target = ChatSettingExtraParams.Target.IM_CHAT_HISTORY_MESSAGE_VIEW;
        } else {
            click = ChatSettingExtraParams.Click.LINK;
            target = ChatSettingExtraParams.Target.IM_CHAT_HISTORY_LINK_VIEW;
        }
        ChatSettingHitPointNew.m136630b(click.plus(target));
    }

    private ChatSearchMenuController(Context context, RecyclerView recyclerView, Chat chat, SearchDelegate bVar) {
        this.f89122a = context;
        this.f89126f = recyclerView;
        this.f89124c = chat;
        this.f89125d = bVar;
        m134096b();
        m134095a();
    }

    public /* synthetic */ ChatSearchMenuController(Context context, RecyclerView recyclerView, Chat chat, SearchDelegate bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, recyclerView, chat, bVar);
    }
}
