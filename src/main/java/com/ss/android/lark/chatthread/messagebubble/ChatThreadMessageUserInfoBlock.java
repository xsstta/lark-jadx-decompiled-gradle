package com.ss.android.lark.chatthread.messagebubble;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.component.ui.avatar.v2.ChatterAvatar;
import com.larksuite.component.ui.avatar.v2.LarkAvatarView;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33297g;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.p1660e.C33973b;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.dependency.AbstractC36461ah;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dto.chat.ProfileSource;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u001b2\u0018\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u001b\u001cB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J$\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00042\u0012\u0010\u0018\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u0002H\u0014J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/chatthread/messagebubble/ChatThreadMessageUserInfoBlock;", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveCell;", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/chatthread/messagebubble/ChatThreadMessageUserInfoBlock$UserInfoHolder;", "chatContext", "Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;", "avatarClickListener", "Lcom/ss/android/lark/chat/chatwindow/chat/message/callbacks/OnAvatarClickListener;", "(Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;Lcom/ss/android/lark/chat/chatwindow/chat/message/callbacks/OnAvatarClickListener;)V", "bindAvatar", "", "holder", "chatter", "Lcom/ss/android/lark/chat/vo/ChatChatterVO;", "bindName", "handleAvatarClick", "v", "Landroid/view/View;", "fromChatter", "layoutId", "", "onBindViewHolder", "viewHolder", "item", "setDisplaySize", "setupSecretSign", "Companion", "UserInfoHolder", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatthread.b.e */
public final class ChatThreadMessageUserInfoBlock extends AbstractC59004b<ChatMessageVO<ContentVO<?>>, UserInfoHolder> {

    /* renamed from: b */
    public static final Companion f90615b = new Companion(null);

    /* renamed from: a */
    public final AbstractC33297g f90616a;

    /* renamed from: c */
    private final AbstractC33342d f90617c;

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatthread/messagebubble/ChatThreadMessageUserInfoBlock$Companion;", "", "()V", "LOG_TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.b.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/chatthread/messagebubble/ChatThreadMessageUserInfoBlock$UserInfoHolder;", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveHolder;", "()V", "avatarIV", "Lcom/larksuite/component/ui/avatar/v2/LarkAvatarView;", "getAvatarIV", "()Lcom/larksuite/component/ui/avatar/v2/LarkAvatarView;", "setAvatarIV", "(Lcom/larksuite/component/ui/avatar/v2/LarkAvatarView;)V", "secretSign", "Landroid/widget/ImageView;", "getSecretSign", "()Landroid/widget/ImageView;", "setSecretSign", "(Landroid/widget/ImageView;)V", "userName", "Landroid/widget/TextView;", "getUserName", "()Landroid/widget/TextView;", "setUserName", "(Landroid/widget/TextView;)V", "onBindView", "", "itemView", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.b.e$b */
    public static final class UserInfoHolder extends AbstractC59010e {

        /* renamed from: a */
        public LarkAvatarView f90618a;

        /* renamed from: b */
        public TextView f90619b;

        /* renamed from: c */
        public ImageView f90620c;

        /* renamed from: a */
        public final LarkAvatarView mo129399a() {
            LarkAvatarView larkAvatarView = this.f90618a;
            if (larkAvatarView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("avatarIV");
            }
            return larkAvatarView;
        }

        /* renamed from: b */
        public final TextView mo129400b() {
            TextView textView = this.f90619b;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userName");
            }
            return textView;
        }

        /* renamed from: c */
        public final ImageView mo129401c() {
            ImageView imageView = this.f90620c;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("secretSign");
            }
            return imageView;
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            if (view != null) {
                View findViewById = view.findViewById(R.id.avatar);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.avatar)");
                this.f90618a = (LarkAvatarView) findViewById;
                View findViewById2 = view.findViewById(R.id.name);
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.name)");
                this.f90619b = (TextView) findViewById2;
                View findViewById3 = view.findViewById(R.id.iv_secret_sign);
                Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.iv_secret_sign)");
                this.f90620c = (ImageView) findViewById3;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/chatthread/messagebubble/ChatThreadMessageUserInfoBlock$bindAvatar$2$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.b.e$c */
    public static final class View$OnClickListenerC35093c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatThreadMessageUserInfoBlock f90621a;

        /* renamed from: b */
        final /* synthetic */ C33973b f90622b;

        View$OnClickListenerC35093c(ChatThreadMessageUserInfoBlock eVar, C33973b bVar) {
            this.f90621a = eVar;
            this.f90622b = bVar;
        }

        public final void onClick(View view) {
            if (!this.f90622b.mo124230r()) {
                ChatThreadMessageUserInfoBlock eVar = this.f90621a;
                Intrinsics.checkExpressionValueIsNotNull(view, "it");
                eVar.mo129397a(view, this.f90622b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.b.e$d */
    public static final class View$OnLongClickListenerC35094d implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatThreadMessageUserInfoBlock f90623a;

        /* renamed from: b */
        final /* synthetic */ C33973b f90624b;

        View$OnLongClickListenerC35094d(ChatThreadMessageUserInfoBlock eVar, C33973b bVar) {
            this.f90623a = eVar;
            this.f90624b = bVar;
        }

        public final boolean onLongClick(View view) {
            AbstractC33297g gVar = this.f90623a.f90616a;
            if (gVar == null || !gVar.mo122762a(this.f90624b)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    private final void m136912a(UserInfoHolder bVar) {
        int i;
        if (this.f90617c.mo122546j()) {
            i = 0;
        } else {
            i = 8;
        }
        bVar.mo129401c().setVisibility(i);
    }

    /* renamed from: b */
    private final void m136914b(UserInfoHolder bVar) {
        C25649b.m91853a(bVar.mo129399a(), 32);
        C25649b.m91853a(bVar.mo129401c(), 15);
        C25649b.m91857a(bVar.mo129400b(), LarkFont.CAPTION0);
    }

    public ChatThreadMessageUserInfoBlock(AbstractC33342d dVar, AbstractC33297g gVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatContext");
        this.f90617c = dVar;
        this.f90616a = gVar;
    }

    /* renamed from: b */
    private final void m136915b(UserInfoHolder bVar, C33973b bVar2) {
        bVar.mo129400b().setTextColor(C52990a.m205239c(this.f90617c.mo122543g(), R.color.text_placeholder));
        bVar.mo129400b().setText(bVar2.mo124214g());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(UserInfoHolder bVar, ChatMessageVO<ContentVO<?>> cVar) {
        C33973b bVar2;
        Intrinsics.checkParameterIsNotNull(bVar, "viewHolder");
        if (cVar != null) {
            bVar2 = cVar.mo121657C();
        } else {
            bVar2 = null;
        }
        if (bVar2 == null) {
            Log.m165379d("ThreadMessageUserInfoBlock", "chatter is null , now return.");
            bVar.mo129399a().setVisibility(8);
            bVar.mo129400b().setVisibility(8);
            bVar.mo129401c().setVisibility(8);
            return;
        }
        m136914b(bVar);
        m136913a(bVar, bVar2);
        m136915b(bVar, bVar2);
    }

    /* renamed from: a */
    private final void m136913a(UserInfoHolder bVar, C33973b bVar2) {
        DesktopUtil.m144304b(bVar.mo129399a());
        m136912a(bVar);
        LarkAvatarView a = bVar.mo129399a();
        a.setVisibility(0);
        a.mo89076a(((ChatterAvatar.Builder) ((ChatterAvatar.Builder) new ChatterAvatar.Builder().mo88962a(bVar2.mo124216h())).mo89081c(bVar2.mo124202c()).mo88967b(bVar2.mo124202c())).mo88976k());
        a.setOnClickListener(new View$OnClickListenerC35093c(this, bVar2));
        bVar.mo129399a().setOnLongClickListener(new View$OnLongClickListenerC35094d(this, bVar2));
    }

    /* renamed from: a */
    public final void mo129397a(View view, C33973b bVar) {
        String str;
        Chat n = this.f90617c.mo122550n();
        FragmentActivity g = this.f90617c.mo122543g();
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36461ah V = b.mo134523V();
        FragmentActivity fragmentActivity = g;
        ProfileSource.C36868a a = new ProfileSource.C36868a().mo136066c(bVar.mo124202c()).mo136061a(Boolean.valueOf(bVar.mo124225m()));
        if (n != null) {
            str = n.getId();
        } else {
            str = null;
        }
        V.mo134436a(fragmentActivity, a.mo136065b(str).mo136060a(0).mo136062a(C34339g.m133170d(n)).mo136063a());
    }
}
