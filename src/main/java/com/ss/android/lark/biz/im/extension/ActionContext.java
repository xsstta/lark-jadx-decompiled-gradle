package com.ss.android.lark.biz.im.extension;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.export.entity.message.OpenMessageInfo;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC59005c;
import com.ss.android.lark.widget.recyclerview.hive.C59008d;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001%B\u001d\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H&J\u0006\u0010\u0013\u001a\u00020\u0014J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&J\b\u0010\u0017\u001a\u00020\u0018H&J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH&J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH&J\f\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001eH&J\u0006\u0010\u001f\u001a\u00020 J\n\u0010!\u001a\u0004\u0018\u00010\"H&J\b\u0010#\u001a\u00020$H&R\u001b\u0010\u0007\u001a\u00020\b8FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006&"}, d2 = {"Lcom/ss/android/lark/biz/im/extension/ActionContext;", "", "messageGroupCell", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveGroupCell;", "messageGroupHolder", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveGroupHolder;", "(Lcom/ss/android/lark/widget/recyclerview/hive/HiveGroupCell;Lcom/ss/android/lark/widget/recyclerview/hive/HiveGroupHolder;)V", "messageCellHiveHolder", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveHolder;", "getMessageCellHiveHolder", "()Lcom/ss/android/lark/widget/recyclerview/hive/HiveHolder;", "messageCellHiveHolder$delegate", "Lkotlin/Lazy;", "getMessageGroupCell", "()Lcom/ss/android/lark/widget/recyclerview/hive/HiveGroupCell;", "getMessageGroupHolder", "()Lcom/ss/android/lark/widget/recyclerview/hive/HiveGroupHolder;", "getActivity", "Landroidx/fragment/app/FragmentActivity;", "getAdapterPosition", "", "getChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getContext", "Landroid/content/Context;", "getMessage", "Lcom/ss/android/lark/chat/entity/message/Message;", "getMessageInfo", "Lcom/ss/android/lark/chat/export/entity/message/OpenMessageInfo;", "getMessageVO", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "getMessageView", "Landroid/view/View;", "getP2pChatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "getPageType", "Lcom/ss/android/lark/biz/im/extension/ActionContext$PageType;", "PageType", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class ActionContext {

    /* renamed from: a */
    private final Lazy f74299a = LazyKt.lazy(new C29637a(this));

    /* renamed from: b */
    private final AbstractView$OnClickListenerC59005c<?, ?> f74300b;

    /* renamed from: c */
    private final C59008d f74301c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/biz/im/extension/ActionContext$PageType;", "", "(Ljava/lang/String;I)V", "NORMAL_SINGLE_CHAT", "SECRET_SINGLE_CHAT", "NORMAL_GROUP_CHAT", "SECRET_GROUP_CHAT", "CHAT_THREAD", "THREAD", "THREAD_DETAIL", "MESSAGE_MERGE_FORWARD", "PRIVATE_THREAD_FORWARD", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum PageType {
        NORMAL_SINGLE_CHAT,
        SECRET_SINGLE_CHAT,
        NORMAL_GROUP_CHAT,
        SECRET_GROUP_CHAT,
        CHAT_THREAD,
        THREAD,
        THREAD_DETAIL,
        MESSAGE_MERGE_FORWARD,
        PRIVATE_THREAD_FORWARD
    }

    /* renamed from: a */
    public final AbstractC59010e mo106781a() {
        return (AbstractC59010e) this.f74299a.getValue();
    }

    /* renamed from: b */
    public abstract Context mo106782b();

    /* renamed from: c */
    public abstract FragmentActivity mo106783c();

    /* renamed from: d */
    public abstract PageType mo106784d();

    /* renamed from: e */
    public abstract Chat mo106785e();

    /* renamed from: h */
    public abstract AbsMessageVO<?> mo106788h();

    /* renamed from: i */
    public abstract OpenMessageInfo mo106789i();

    /* renamed from: j */
    public abstract Message mo106790j();

    /* renamed from: k */
    public abstract Chatter mo106791k();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final AbstractView$OnClickListenerC59005c<?, ?> mo106792l() {
        return this.f74300b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final C59008d mo106793m() {
        return this.f74301c;
    }

    /* renamed from: g */
    public final int mo106787g() {
        return this.f74301c.mo200148l();
    }

    /* renamed from: f */
    public final View mo106786f() {
        View view = this.f74301c.f146209n;
        Intrinsics.checkExpressionValueIsNotNull(view, "messageGroupHolder.itemView");
        return view;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveHolder;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.biz.im.extension.ActionContext$a */
    static final class C29637a extends Lambda implements Function0<AbstractC59010e> {
        final /* synthetic */ ActionContext this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29637a(ActionContext actionContext) {
            super(0);
            this.this$0 = actionContext;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC59010e invoke() {
            int indexOfValue = this.this$0.mo106793m().f146207m.indexOfValue(this.this$0.mo106792l().mo200139f());
            if (indexOfValue < 0) {
                return this.this$0.mo106793m();
            }
            return this.this$0.mo106793m().f146206l.get(this.this$0.mo106793m().f146207m.keyAt(indexOfValue));
        }
    }

    public ActionContext(AbstractView$OnClickListenerC59005c<?, ?> cVar, C59008d dVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "messageGroupCell");
        Intrinsics.checkParameterIsNotNull(dVar, "messageGroupHolder");
        this.f74300b = cVar;
        this.f74301c = dVar;
    }
}
