package com.ss.android.lark.todo.impl.features.detail.comment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.bytedance.lark.pb.todo.v1.TodoComment;
import com.bytedance.lark.pb.todo.v1.TodoCommentReaction;
import com.bytedance.lark.pb.todo.v1.TodoUser;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.framework.section.IActionData;
import com.larksuite.framework.section.IActionDispatcher;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.suite.R;
import com.ss.android.lark.reaction.widget.detailwindow.C53002b;
import com.ss.android.lark.reaction.widget.detailwindow.bean.DetailUserInfo;
import com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel;
import com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout;
import com.ss.android.lark.reaction.widget.flowlayout.p2562a.C53061a;
import com.ss.android.lark.reaction.widget.flowlayout.p2562a.C53062b;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextView;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0019\u001aB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u000f2\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rH\u0016R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2$ViewHolder;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "(Lcom/larksuite/framework/section/IViewAbility;)V", "context", "Landroid/content/Context;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/bytedance/lark/pb/todo/v1/TodoComment;", "getItemCount", "", "onAttachedToRecyclerView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ViewHolder", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.a */
public final class CommentAdapterV2 extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: c */
    public static final int f139722c = R.color.text_caption;

    /* renamed from: d */
    public static final int f139723d = R.color.text_link_normal;

    /* renamed from: e */
    public static final int f139724e = R.color.lkui_transparent;

    /* renamed from: f */
    public static final Options f139725f;

    /* renamed from: g */
    public static final String f139726g = UIHelper.getString(R.string.Todo_Task_EditedComment);

    /* renamed from: h */
    public static final RichText f139727h = C59029c.m229161b(UIHelper.getString(R.string.Todo_Task_UnsupportedComment));

    /* renamed from: i */
    public static final Companion f139728i = new Companion(null);

    /* renamed from: a */
    public List<TodoComment> f139729a;

    /* renamed from: b */
    public final IViewAbility<ITodoDetailViewDataStore> f139730b;

    /* renamed from: j */
    private Context f139731j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0006H\u0002J\f\u0010\u001b\u001a\u00020\u001c*\u00020\u001dH\u0002J\f\u0010\u001e\u001a\u00020\u001f*\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \r*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2$Companion;", "", "()V", "AVATAR_SIZE", "", "LOG_TAG", "", "TEXT_SIZE", "atBgColorRes", "", "atColorRes", "atOtherColorRes", "textEditedComment", "kotlin.jvm.PlatformType", "textUnsupportedComment", "Lcom/ss/android/lark/widget/richtext/RichText;", "timeOptions", "Lcom/ss/android/lark/time/format/Options;", "calSpanCount", "imageCount", "goUserProfile", "", "context", "Landroid/content/Context;", "userId", "openUrl", "text", "toReactionDetailViewModel", "Lcom/ss/android/lark/reaction/widget/detailwindow/bean/ReactionDetailViewModel;", "Lcom/bytedance/lark/pb/todo/v1/TodoCommentReaction;", "toReactionFlowLayoutViewModel", "Lcom/ss/android/lark/reaction/widget/flowlayout/bean/ReactionFlowLayoutViewModel;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.a$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo192335a(int i) {
            return RangesKt.coerceAtMost(i, 3);
        }

        /* renamed from: a */
        public final C53061a mo192336a(TodoCommentReaction todoCommentReaction) {
            C53061a aVar = new C53061a();
            aVar.f131133a = todoCommentReaction.type;
            aVar.f131134b = todoCommentReaction.users.size();
            List<TodoUser> list = todoCommentReaction.users;
            Intrinsics.checkExpressionValueIsNotNull(list, "users");
            List<TodoUser> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (T t : list2) {
                C53062b bVar = new C53062b();
                bVar.f131136a = t.user_id;
                bVar.f131137b = t.name;
                arrayList.add(bVar);
            }
            aVar.f131135c = arrayList;
            return aVar;
        }

        /* renamed from: b */
        public final ReactionDetailViewModel mo192338b(TodoCommentReaction todoCommentReaction) {
            ReactionDetailViewModel reactionDetailViewModel = new ReactionDetailViewModel();
            reactionDetailViewModel.setReactionKey(todoCommentReaction.type);
            reactionDetailViewModel.setTotalCount(todoCommentReaction.users.size());
            List<TodoUser> list = todoCommentReaction.users;
            Intrinsics.checkExpressionValueIsNotNull(list, "users");
            List<TodoUser> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (T t : list2) {
                DetailUserInfo detailUserInfo = new DetailUserInfo();
                detailUserInfo.setUserId(t.user_id);
                detailUserInfo.setUserName(t.name);
                detailUserInfo.setAvatarKey(t.avatar_key);
                arrayList.add(detailUserInfo);
            }
            reactionDetailViewModel.setUserInfoList(arrayList);
            List<TodoUser> list3 = todoCommentReaction.users;
            Intrinsics.checkExpressionValueIsNotNull(list3, "users");
            List<TodoUser> list4 = list3;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator<T> it = list4.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().user_id);
            }
            reactionDetailViewModel.setSelfInvoke(arrayList2.contains(CommentConstants.f139800a.mo192375a()));
            return reactionDetailViewModel;
        }

        /* renamed from: a */
        public final void mo192337a(Context context, String str) {
            TodoDependencyHolder.f139242a.mo191730a().messengerModuleDependency().mo145420a(context, str);
        }

        /* renamed from: b */
        public final void mo192339b(Context context, String str) {
            TodoDependencyHolder.f139242a.mo191730a().browserDependency().mo145368a(context, str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<TodoComment> list = this.f139729a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    static {
        Options aVar = new Options(null, null, null, null, null, false, false, false, false, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
        aVar.mo191592a(DisplayPattern.RELATIVE);
        aVar.mo191594a(TimePreciseness.MINUTE);
        aVar.mo191599b(!TodoDependencyHolder.f139242a.mo191730a().timeFormatDependency().mo145434b());
        aVar.mo191603d(true);
        f139725f = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2;Landroid/view/View;)V", "bind", "", "context", "Landroid/content/Context;", "item", "Lcom/bytedance/lark/pb/todo/v1/TodoComment;", "position", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.a$c */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ CommentAdapterV2 f139733a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", BottomDialog.f17198f, "", "kotlin.jvm.PlatformType", "perform", "com/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2$ViewHolder$bind$1$9$3", "com/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2$ViewHolder$$special$$inlined$run$lambda$7"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.a$c$k */
        public static final class C56509k implements ReactionBaseFlowLayout.AbstractC53046a {

            /* renamed from: a */
            final /* synthetic */ ViewHolder f139779a;

            /* renamed from: b */
            final /* synthetic */ int f139780b;

            /* renamed from: c */
            final /* synthetic */ TodoComment f139781c;

            /* renamed from: d */
            final /* synthetic */ Context f139782d;

            C56509k(ViewHolder cVar, int i, TodoComment todoComment, Context context) {
                this.f139779a = cVar;
                this.f139780b = i;
                this.f139781c = todoComment;
                this.f139782d = context;
            }

            @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout.AbstractC53046a
            public final void perform(String str) {
                Companion bVar = CommentAdapterV2.f139728i;
                Context context = this.f139782d;
                Intrinsics.checkExpressionValueIsNotNull(str, BottomDialog.f17198f);
                bVar.mo192337a(context, str);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2$ViewHolder$bind$1$2"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.a$c$d */
        public static final class View$OnClickListenerC56502d implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ ViewHolder f139747a;

            /* renamed from: b */
            final /* synthetic */ int f139748b;

            /* renamed from: c */
            final /* synthetic */ TodoComment f139749c;

            /* renamed from: d */
            final /* synthetic */ Context f139750d;

            View$OnClickListenerC56502d(ViewHolder cVar, int i, TodoComment todoComment, Context context) {
                this.f139747a = cVar;
                this.f139748b = i;
                this.f139749c = todoComment;
                this.f139750d = context;
            }

            public final void onClick(View view) {
                this.f139747a.f139733a.f139730b.mo92075d().mo92069a(138, false);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\b"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2$ViewHolder$bind$1$3$1$1", "com/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2$ViewHolder$$special$$inlined$let$lambda$1", "com/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2$ViewHolder$$special$$inlined$run$lambda$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.a$c$e */
        public static final class View$OnClickListenerC56503e implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ TodoUser f139751a;

            /* renamed from: b */
            final /* synthetic */ TextView f139752b;

            /* renamed from: c */
            final /* synthetic */ ViewHolder f139753c;

            /* renamed from: d */
            final /* synthetic */ int f139754d;

            /* renamed from: e */
            final /* synthetic */ TodoComment f139755e;

            /* renamed from: f */
            final /* synthetic */ Context f139756f;

            View$OnClickListenerC56503e(TodoUser todoUser, TextView textView, ViewHolder cVar, int i, TodoComment todoComment, Context context) {
                this.f139751a = todoUser;
                this.f139752b = textView;
                this.f139753c = cVar;
                this.f139754d = i;
                this.f139755e = todoComment;
                this.f139756f = context;
            }

            public final void onClick(View view) {
                Companion bVar = CommentAdapterV2.f139728i;
                Context context = this.f139756f;
                String str = this.f139751a.user_id;
                Intrinsics.checkExpressionValueIsNotNull(str, "user.user_id");
                bVar.mo192337a(context, str);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\b"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2$ViewHolder$bind$1$6$1$1", "com/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2$ViewHolder$$special$$inlined$let$lambda$2", "com/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2$ViewHolder$$special$$inlined$run$lambda$2"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.a$c$f */
        public static final class View$OnClickListenerC56504f implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ TodoUser f139757a;

            /* renamed from: b */
            final /* synthetic */ LKUIRoundedImageView2 f139758b;

            /* renamed from: c */
            final /* synthetic */ ViewHolder f139759c;

            /* renamed from: d */
            final /* synthetic */ int f139760d;

            /* renamed from: e */
            final /* synthetic */ TodoComment f139761e;

            /* renamed from: f */
            final /* synthetic */ Context f139762f;

            View$OnClickListenerC56504f(TodoUser todoUser, LKUIRoundedImageView2 lKUIRoundedImageView2, ViewHolder cVar, int i, TodoComment todoComment, Context context) {
                this.f139757a = todoUser;
                this.f139758b = lKUIRoundedImageView2;
                this.f139759c = cVar;
                this.f139760d = i;
                this.f139761e = todoComment;
                this.f139762f = context;
            }

            public final void onClick(View view) {
                Companion bVar = CommentAdapterV2.f139728i;
                Context context = this.f139762f;
                String str = this.f139757a.user_id;
                Intrinsics.checkExpressionValueIsNotNull(str, "user.user_id");
                bVar.mo192337a(context, str);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "key", "", "kotlin.jvm.PlatformType", "onReactionClicked", "com/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2$ViewHolder$bind$1$9$2", "com/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2$ViewHolder$$special$$inlined$run$lambda$6"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.a$c$j */
        public static final class C56508j implements ReactionBaseFlowLayout.AbstractC53049d {

            /* renamed from: a */
            final /* synthetic */ ViewHolder f139775a;

            /* renamed from: b */
            final /* synthetic */ int f139776b;

            /* renamed from: c */
            final /* synthetic */ TodoComment f139777c;

            /* renamed from: d */
            final /* synthetic */ Context f139778d;

            C56508j(ViewHolder cVar, int i, TodoComment todoComment, Context context) {
                this.f139775a = cVar;
                this.f139776b = i;
                this.f139777c = todoComment;
                this.f139778d = context;
            }

            @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout.AbstractC53049d
            public final void onReactionClicked(String str) {
                IActionDispatcher d = this.f139775a.f139733a.f139730b.mo92075d();
                TodoComment todoComment = this.f139777c;
                Intrinsics.checkExpressionValueIsNotNull(str, "key");
                d.mo92066a(137, (IActionData) new CommentItemReactionInfo(todoComment, str, 0));
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick", "com/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2$ViewHolder$bind$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.a$c$a */
        public static final class View$OnLongClickListenerC56498a implements View.OnLongClickListener {

            /* renamed from: a */
            final /* synthetic */ ViewHolder f139734a;

            /* renamed from: b */
            final /* synthetic */ int f139735b;

            /* renamed from: c */
            final /* synthetic */ TodoComment f139736c;

            /* renamed from: d */
            final /* synthetic */ Context f139737d;

            View$OnLongClickListenerC56498a(ViewHolder cVar, int i, TodoComment todoComment, Context context) {
                this.f139734a = cVar;
                this.f139735b = i;
                this.f139736c = todoComment;
                this.f139737d = context;
            }

            public final boolean onLongClick(View view) {
                IActionDispatcher d = this.f139734a.f139733a.f139730b.mo92075d();
                View view2 = this.f139734a.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                d.mo92066a(133, (IActionData) new CommentPanelInfo(view2, this.f139735b, this.f139736c));
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2$ViewHolder$bind$1$10$1", "com/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2$ViewHolder$$special$$inlined$run$lambda$9"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.a$c$c */
        public static final class View$OnClickListenerC56501c implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ ViewHolder f139743a;

            /* renamed from: b */
            final /* synthetic */ int f139744b;

            /* renamed from: c */
            final /* synthetic */ TodoComment f139745c;

            /* renamed from: d */
            final /* synthetic */ Context f139746d;

            View$OnClickListenerC56501c(ViewHolder cVar, int i, TodoComment todoComment, Context context) {
                this.f139743a = cVar;
                this.f139744b = i;
                this.f139745c = todoComment;
                this.f139746d = context;
            }

            public final void onClick(View view) {
                IActionDispatcher d = this.f139743a.f139733a.f139730b.mo92075d();
                View view2 = this.f139743a.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                d.mo92066a(133, (IActionData) new CommentPanelInfo(view2, this.f139744b, this.f139745c));
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "selectedReaction", "", "kotlin.jvm.PlatformType", "perform", "com/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2$ViewHolder$bind$1$9$4", "com/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2$ViewHolder$$special$$inlined$run$lambda$8"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.a$c$b */
        public static final class C56499b implements ReactionBaseFlowLayout.AbstractC53047b {

            /* renamed from: a */
            final /* synthetic */ ViewHolder f139738a;

            /* renamed from: b */
            final /* synthetic */ int f139739b;

            /* renamed from: c */
            final /* synthetic */ TodoComment f139740c;

            /* renamed from: d */
            final /* synthetic */ Context f139741d;

            C56499b(ViewHolder cVar, int i, TodoComment todoComment, Context context) {
                this.f139738a = cVar;
                this.f139739b = i;
                this.f139740c = todoComment;
                this.f139741d = context;
            }

            @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout.AbstractC53047b
            public final void perform(String str) {
                List<TodoCommentReaction> list = this.f139740c.reactions;
                Intrinsics.checkExpressionValueIsNotNull(list, "item.reactions");
                List<TodoCommentReaction> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (T t : list2) {
                    Companion bVar = CommentAdapterV2.f139728i;
                    Intrinsics.checkExpressionValueIsNotNull(t, "it");
                    arrayList.add(bVar.mo192338b(t));
                }
                C53002b a = C53002b.m205274a(arrayList, str, true);
                a.mo181046a(new C53002b.AbstractC53005b(this) {
                    /* class com.ss.android.lark.todo.impl.features.detail.comment.CommentAdapterV2.ViewHolder.C56499b.C565001 */

                    /* renamed from: a */
                    final /* synthetic */ C56499b f139742a;

                    {
                        this.f139742a = r1;
                    }

                    @Override // com.ss.android.lark.reaction.widget.detailwindow.C53002b.AbstractC53005b
                    public final void onItemClicked(String str) {
                        Companion bVar = CommentAdapterV2.f139728i;
                        Context context = this.f139742a.f139741d;
                        Intrinsics.checkExpressionValueIsNotNull(str, "userId");
                        bVar.mo192337a(context, str);
                    }
                });
                Context context = this.f139741d;
                if (context != null) {
                    a.mo181044a(((FragmentActivity) context).getSupportFragmentManager());
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(CommentAdapterV2 aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f139733a = aVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\n¸\u0006\u000b"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2$ViewHolder$bind$1$7$1", "Lcom/ss/android/lark/widget/linked_emojicon/widget/LinkEmojiTextView$IURLStringClickListener;", "onURLClick", "", "view", "Landroid/view/View;", "text", "", "onURLLongClick", "", "todo_release", "com/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2$ViewHolder$$special$$inlined$run$lambda$3"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.a$c$g */
        public static final class C56505g implements LinkEmojiTextView.AbstractC58525j {

            /* renamed from: a */
            final /* synthetic */ ViewHolder f139763a;

            /* renamed from: b */
            final /* synthetic */ int f139764b;

            /* renamed from: c */
            final /* synthetic */ TodoComment f139765c;

            /* renamed from: d */
            final /* synthetic */ Context f139766d;

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
            /* renamed from: b */
            public boolean mo122807b(View view, String str) {
                Intrinsics.checkParameterIsNotNull(view, "view");
                Intrinsics.checkParameterIsNotNull(str, "text");
                return false;
            }

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
            /* renamed from: a */
            public void mo122806a(View view, String str) {
                Intrinsics.checkParameterIsNotNull(view, "view");
                Intrinsics.checkParameterIsNotNull(str, "text");
                CommentAdapterV2.f139728i.mo192339b(this.f139766d, str);
            }

            C56505g(ViewHolder cVar, int i, TodoComment todoComment, Context context) {
                this.f139763a = cVar;
                this.f139764b = i;
                this.f139765c = todoComment;
                this.f139766d = context;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t¸\u0006\n"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2$ViewHolder$bind$1$7$3", "Lcom/ss/android/lark/widget/richtext/RichTextView$RichTextListener;", "onTextClick", "", "textView", "Landroid/widget/TextView;", "onTextLongClick", "text", "", "todo_release", "com/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2$ViewHolder$$special$$inlined$run$lambda$5"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.a$c$i */
        public static final class C56507i implements RichTextView.AbstractC59025c {

            /* renamed from: a */
            final /* synthetic */ ViewHolder f139771a;

            /* renamed from: b */
            final /* synthetic */ int f139772b;

            /* renamed from: c */
            final /* synthetic */ TodoComment f139773c;

            /* renamed from: d */
            final /* synthetic */ Context f139774d;

            @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59025c
            /* renamed from: a */
            public void mo124117a(TextView textView) {
            }

            @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59025c
            /* renamed from: a */
            public void mo124118a(String str, TextView textView) {
                IActionDispatcher d = this.f139771a.f139733a.f139730b.mo92075d();
                View view = this.f139771a.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                d.mo92066a(133, (IActionData) new CommentPanelInfo(view, this.f139772b, this.f139773c));
            }

            C56507i(ViewHolder cVar, int i, TodoComment todoComment, Context context) {
                this.f139771a = cVar;
                this.f139772b = i;
                this.f139773c = todoComment;
                this.f139774d = context;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J&\u0010\t\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000b¸\u0006\f"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2$ViewHolder$bind$1$7$2", "Lcom/ss/android/lark/widget/linked_emojicon/widget/LinkEmojiTextView$IAtStringClickListenr;", "onAtClick", "", "view", "Landroid/view/View;", "text", "", "userId", "onAtLongClick", "", "todo_release", "com/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2$ViewHolder$$special$$inlined$run$lambda$4"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.a$c$h */
        public static final class C56506h implements LinkEmojiTextView.AbstractC58521f {

            /* renamed from: a */
            final /* synthetic */ ViewHolder f139767a;

            /* renamed from: b */
            final /* synthetic */ int f139768b;

            /* renamed from: c */
            final /* synthetic */ TodoComment f139769c;

            /* renamed from: d */
            final /* synthetic */ Context f139770d;

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
            /* renamed from: b */
            public boolean mo117507b(View view, String str, String str2) {
                return false;
            }

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
            /* renamed from: c */
            public void mo120297c(View view, String str, String str2) {
                Intrinsics.checkParameterIsNotNull(view, "view");
                Intrinsics.checkParameterIsNotNull(str2, "userId");
                CommentAdapterV2.f139728i.mo192337a(this.f139770d, str2);
            }

            C56506h(ViewHolder cVar, int i, TodoComment todoComment, Context context) {
                this.f139767a = cVar;
                this.f139768b = i;
                this.f139769c = todoComment;
                this.f139770d = context;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:42:0x01be  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x01c2  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0239 A[LOOP:1: B:51:0x0233->B:53:0x0239, LOOP_END] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo192340a(android.content.Context r18, com.bytedance.lark.pb.todo.v1.TodoComment r19, int r20) {
            /*
            // Method dump skipped, instructions count: 645
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.detail.comment.CommentAdapterV2.ViewHolder.mo192340a(android.content.Context, com.bytedance.lark.pb.todo.v1.TodoComment, int):void");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        Context context = recyclerView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "recyclerView.context");
        this.f139731j = context;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lcom/bytedance/lark/pb/todo/v1/TodoComment;", "kotlin.jvm.PlatformType", "onChanged", "com/ss/android/lark/todo/impl/features/detail/comment/CommentAdapterV2$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.a$a */
    static final class C56497a<T> implements AbstractC1178x<List<TodoComment>> {

        /* renamed from: a */
        final /* synthetic */ CommentAdapterV2 f139732a;

        C56497a(CommentAdapterV2 aVar) {
            this.f139732a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(List<TodoComment> list) {
            this.f139732a.f139730b.mo92075d().mo92069a(SmActions.ACTION_IDLE_ENTRY, list.isEmpty());
            this.f139732a.f139729a = new ArrayList(list);
            this.f139732a.notifyDataSetChanged();
        }
    }

    public CommentAdapterV2(IViewAbility<ITodoDetailViewDataStore> fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
        this.f139730b = fVar;
        fVar.mo92073b().getCommentLv().mo5923a(fVar.mo92074c(), new C56497a(this));
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.todo_item_comment, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new ViewHolder(this, inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder cVar, int i) {
        TodoComment todoComment;
        Intrinsics.checkParameterIsNotNull(cVar, "holder");
        List<TodoComment> list = this.f139729a;
        if (list != null) {
            todoComment = list.get(i);
        } else {
            todoComment = null;
        }
        if (todoComment != null) {
            cVar.mo192340a(this.f139730b.mo92048a(), todoComment, i);
        }
    }
}
