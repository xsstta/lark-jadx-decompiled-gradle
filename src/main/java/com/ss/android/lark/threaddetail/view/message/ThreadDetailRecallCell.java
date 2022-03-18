package com.ss.android.lark.threaddetail.view.message;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33290a;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1633b.C33360a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.threaddetail.view.C55869b;
import com.ss.android.lark.threaddetail.view.p2751a.AbstractC55867c;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0016\u0017B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\"\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0010\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0015H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/threaddetail/view/message/ThreadDetailRecallCell;", "Lcom/ss/android/lark/chat/chatwindow/chat/message/BaseMessageCell;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/threaddetail/view/message/ThreadDetailRecallCell$ThreadDetailRecallViewHolder;", "chaContext", "Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;", "mUICallback", "Lcom/ss/android/lark/threaddetail/view/callback/IThreadDetailRecallCallback;", "(Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;Lcom/ss/android/lark/threaddetail/view/callback/IThreadDetailRecallCallback;)V", "bindReplyDesc", "", "viewHolder", "showRelpyDesc", "", "replyCount", "", "getHolderClassImpl", "Ljava/lang/Class;", "layoutId", "onBindViewHolder", "item", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "Companion", "ThreadDetailRecallViewHolder", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ThreadDetailRecallCell extends AbstractC33290a<ContentVO<?>, ThreadDetailRecallViewHolder> {

    /* renamed from: b */
    public static final Companion f138156b = new Companion(null);

    /* renamed from: a */
    public final AbstractC55867c f138157a;

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.item_thread_detail_recall;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/threaddetail/view/message/ThreadDetailRecallCell$Companion;", "", "()V", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threaddetail.view.message.ThreadDetailRecallCell$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<ThreadDetailRecallViewHolder> mo122650b() {
        return ThreadDetailRecallViewHolder.class;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/threaddetail/view/message/ThreadDetailRecallCell$ThreadDetailRecallViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveHolder;", "()V", "recallIcon", "Landroid/widget/ImageView;", "getRecallIcon", "()Landroid/widget/ImageView;", "setRecallIcon", "(Landroid/widget/ImageView;)V", "recallReEditTv", "Landroid/widget/TextView;", "getRecallReEditTv", "()Landroid/widget/TextView;", "setRecallReEditTv", "(Landroid/widget/TextView;)V", "replyDescTv", "getReplyDescTv", "setReplyDescTv", "userNameTV", "getUserNameTV", "setUserNameTV", "onBindView", "", "itemView", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class ThreadDetailRecallViewHolder extends AbstractC59010e {
        @BindView(7925)
        public ImageView recallIcon;
        @BindView(8499)
        public TextView recallReEditTv;
        @BindView(8549)
        public TextView replyDescTv;
        @BindView(9134)
        public TextView userNameTV;

        /* renamed from: a */
        public final TextView mo190651a() {
            TextView textView = this.userNameTV;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userNameTV");
            }
            return textView;
        }

        /* renamed from: b */
        public final TextView mo190652b() {
            TextView textView = this.replyDescTv;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("replyDescTv");
            }
            return textView;
        }

        /* renamed from: c */
        public final TextView mo190653c() {
            TextView textView = this.recallReEditTv;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recallReEditTv");
            }
            return textView;
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            ButterKnife.bind(this, view);
            Context context = view.getContext();
            TextView textView = this.replyDescTv;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("replyDescTv");
            }
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            layoutParams.height = LKUIDisplayManager.m91881c(context, 50);
            TextView textView2 = this.replyDescTv;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("replyDescTv");
            }
            C25649b.m91857a(textView2, LarkFont.TITLE4);
            TextView textView3 = this.userNameTV;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userNameTV");
            }
            C25649b.m91857a(textView3, LarkFont.BODY1);
            TextView textView4 = this.recallReEditTv;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recallReEditTv");
            }
            C25649b.m91857a(textView4, LarkFont.BODY1);
            ImageView imageView = this.recallIcon;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recallIcon");
            }
            C25649b.m91853a(imageView, 16);
        }
    }

    public final class ThreadDetailRecallViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ThreadDetailRecallViewHolder f138158a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ThreadDetailRecallViewHolder threadDetailRecallViewHolder = this.f138158a;
            if (threadDetailRecallViewHolder != null) {
                this.f138158a = null;
                threadDetailRecallViewHolder.userNameTV = null;
                threadDetailRecallViewHolder.replyDescTv = null;
                threadDetailRecallViewHolder.recallReEditTv = null;
                threadDetailRecallViewHolder.recallIcon = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ThreadDetailRecallViewHolder_ViewBinding(ThreadDetailRecallViewHolder threadDetailRecallViewHolder, View view) {
            this.f138158a = threadDetailRecallViewHolder;
            threadDetailRecallViewHolder.userNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_recall_user, "field 'userNameTV'", TextView.class);
            threadDetailRecallViewHolder.replyDescTv = (TextView) Utils.findRequiredViewAsType(view, R.id.reply_desc, "field 'replyDescTv'", TextView.class);
            threadDetailRecallViewHolder.recallReEditTv = (TextView) Utils.findRequiredViewAsType(view, R.id.recall_re_edit, "field 'recallReEditTv'", TextView.class);
            threadDetailRecallViewHolder.recallIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_recall_icon, "field 'recallIcon'", ImageView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/threaddetail/view/message/ThreadDetailRecallCell$onBindViewHolder$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threaddetail.view.message.ThreadDetailRecallCell$c */
    public static final class C55915c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ThreadDetailRecallCell f138161a;

        /* renamed from: b */
        final /* synthetic */ ThreadDetailRecallViewHolder f138162b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            if (this.f138161a.f138157a != null) {
                this.f138161a.f138157a.mo190470d(this.f138162b.mo200148l());
            }
        }

        C55915c(ThreadDetailRecallCell threadDetailRecallCell, ThreadDetailRecallViewHolder threadDetailRecallViewHolder) {
            this.f138161a = threadDetailRecallCell;
            this.f138162b = threadDetailRecallViewHolder;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/threaddetail/view/message/ThreadDetailRecallCell$onBindViewHolder$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threaddetail.view.message.ThreadDetailRecallCell$b */
    public static final class C55914b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ThreadDetailRecallCell f138159a;

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef f138160b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Boolean bool;
            Intrinsics.checkParameterIsNotNull(view, "v");
            StringBuilder sb = new StringBuilder();
            sb.append("chatter is anonymous :");
            T t = this.f138160b.element;
            if (t != null) {
                bool = Boolean.valueOf(t.mo124230r());
            } else {
                bool = null;
            }
            sb.append(bool);
            Log.m165389i("ThreadDetailRecallCell", sb.toString());
            if (this.f138160b.element != null && !this.f138160b.element.mo124230r()) {
                this.f138159a.f138157a.mo190478j(this.f138160b.element.mo124202c());
            }
        }

        C55914b(ThreadDetailRecallCell threadDetailRecallCell, Ref.ObjectRef objectRef) {
            this.f138159a = threadDetailRecallCell;
            this.f138160b = objectRef;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreadDetailRecallCell(AbstractC33342d dVar, AbstractC55867c cVar) {
        super(dVar);
        Intrinsics.checkParameterIsNotNull(dVar, "chaContext");
        Intrinsics.checkParameterIsNotNull(cVar, "mUICallback");
        this.f138157a = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(ThreadDetailRecallViewHolder threadDetailRecallViewHolder, AbsMessageVO<ContentVO<?>> aVar) {
        boolean z;
        String str;
        String str2;
        Intrinsics.checkParameterIsNotNull(threadDetailRecallViewHolder, "viewHolder");
        Intrinsics.checkParameterIsNotNull(aVar, "item");
        super.mo122648a((AbstractC59010e) threadDetailRecallViewHolder, (AbsMessageVO) aVar);
        if (aVar instanceof ChatMessageVO) {
            ChatMessageVO cVar = (ChatMessageVO) aVar;
            if (cVar.mo124239L() != 0 || aVar.ai()) {
                z = false;
            } else {
                z = true;
            }
            m217216a(threadDetailRecallViewHolder, z, aVar.mo121715w());
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (T) aVar.mo121704l();
            if (objectRef.element == null) {
                objectRef.element = (T) aVar.mo121657C();
            }
            T t = objectRef.element;
            if (t != null) {
                str = t.mo124214g();
            } else {
                str = null;
            }
            Message.RecallerIdentity K = cVar.mo124238K();
            if (K == Message.RecallerIdentity.OWNER) {
                str2 = UIHelper.mustacheFormat((int) R.string.Lark_Chat_TopicAdminReplyRecallTip, "name", str);
                Intrinsics.checkExpressionValueIsNotNull(str2, "UIHelper.mustacheFormat(…  \"name\", recallUserName)");
            } else if (K == Message.RecallerIdentity.ADMINISTRATOR) {
                str2 = UIHelper.mustacheFormat((int) R.string.Lark_Chat_SystemAdminReplyRecallTip, "name", str);
                Intrinsics.checkExpressionValueIsNotNull(str2, "UIHelper.mustacheFormat(…  \"name\", recallUserName)");
            } else {
                str2 = str + " " + UIUtils.getString(this.f85789d.mo122543g(), R.string.Lark_Chat_TopicReplyRecallTip2);
            }
            String str3 = str2;
            SpannableString spannableString = new SpannableString(str3);
            if (str != null) {
                spannableString.setSpan(new C55869b(), StringsKt.indexOf$default((CharSequence) str3, str, 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) str3, str, 0, false, 6, (Object) null) + str.length(), 33);
            }
            threadDetailRecallViewHolder.mo190651a().setText(spannableString);
            threadDetailRecallViewHolder.mo190651a().setOnClickListener(new C55914b(this, objectRef));
            if (!aVar.mo121703k() || !aVar.mo121695c() || aVar.mo121704l() != null) {
                threadDetailRecallViewHolder.mo190653c().setVisibility(8);
                threadDetailRecallViewHolder.mo190653c().setOnClickListener(null);
                return;
            }
            threadDetailRecallViewHolder.mo190653c().setTextColor(C33360a.m129178v(false));
            threadDetailRecallViewHolder.mo190653c().setCompoundDrawables(null, null, C33360a.m129160d(mo122719d(), false), null);
            threadDetailRecallViewHolder.mo190653c().setVisibility(0);
            SpannableString spannableString2 = new SpannableString(UIHelper.getString(R.string.Lark_Legacy_Reedit));
            spannableString2.setSpan(new C55869b(), 0, spannableString2.length(), 33);
            threadDetailRecallViewHolder.mo190653c().setText(spannableString2);
            threadDetailRecallViewHolder.mo190653c().setOnClickListener(new C55915c(this, threadDetailRecallViewHolder));
        }
    }

    /* renamed from: a */
    private final void m217216a(ThreadDetailRecallViewHolder threadDetailRecallViewHolder, boolean z, int i) {
        if (z) {
            threadDetailRecallViewHolder.mo190652b().setVisibility(0);
            if (i > 0) {
                TextView b = threadDetailRecallViewHolder.mo190652b();
                b.setText(UIHelper.getString(R.string.Lark_Chat_Topic_DetailPage_Replies_Title) + "  " + i);
                return;
            }
            threadDetailRecallViewHolder.mo190652b().setText(UIHelper.getString(R.string.Lark_Chat_Topic_DetailPage_Replies_Title));
            return;
        }
        threadDetailRecallViewHolder.mo190652b().setVisibility(8);
    }
}
