package com.ss.android.lark.mm.module.detail.comment;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.image.UDAvatar;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.detail.baseinfo.BaseUserType;
import com.ss.android.lark.mm.module.detail.comment.model.MmComment;
import com.ss.android.lark.mm.module.mention.C46488d;
import com.ss.android.lark.mm.module.mention.C46489e;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45853e;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.C47098d;
import com.ss.android.lark.mm.utils.ClipBoardUtil;
import com.ss.android.lark.mm.utils.MmDateUtil;
import com.ss.android.lark.mm.utils.ResString;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003+,-B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0015J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001fH\u0016J\u0018\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001fH\u0016J\u000e\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u0006J\u0014\u0010)\u001a\u00020\u001c2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150*R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentDetailAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "pid", "", "commentId", "callback", "Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentDetailAdapter$IMmCommentDetailAdapterCallback;", "depend", "Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentDetailAdapter$IMmCommentDetailAdapterDepend;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentDetailAdapter$IMmCommentDetailAdapterCallback;Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentDetailAdapter$IMmCommentDetailAdapterDepend;)V", "getCallback", "()Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentDetailAdapter$IMmCommentDetailAdapterCallback;", "getCommentId", "()Ljava/lang/String;", "getContext", "()Landroid/content/Context;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment$MmCommentInfo$CommentDetail$CommentDetailContent;", "getDepend", "()Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentDetailAdapter$IMmCommentDetailAdapterDepend;", "getPid", "tempCoordinates", "Landroid/graphics/Rect;", "addComment", "", Comment.f24093e, "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "remove", "contentId", "update", "", "IMmCommentDetailAdapterCallback", "IMmCommentDetailAdapterDepend", "MmCommentDetailContentViewHolder", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.comment.h */
public final class MmParaCommentDetailAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final Rect f116035a = new Rect();

    /* renamed from: b */
    private final List<MmComment.MmCommentInfo.CommentDetail.CommentDetailContent> f116036b = new ArrayList();

    /* renamed from: c */
    private final Context f116037c;

    /* renamed from: d */
    private final String f116038d;

    /* renamed from: e */
    private final String f116039e;

    /* renamed from: f */
    private final IMmCommentDetailAdapterCallback f116040f;

    /* renamed from: g */
    private final IMmCommentDetailAdapterDepend f116041g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentDetailAdapter$IMmCommentDetailAdapterCallback;", "", "onDeleteSuccess", "", "contentId", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.h$a */
    public interface IMmCommentDetailAdapterCallback {
        /* renamed from: a */
        void mo161745a(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH&J\b\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentDetailAdapter$IMmCommentDetailAdapterDepend;", "", "deleteComment", "", "pid", "", "commentId", "contentId", "dataCallback", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "isOwner", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.h$b */
    public interface IMmCommentDetailAdapterDepend {
        /* renamed from: a */
        void mo161746a(String str, String str2, String str3, AbstractC47070c<String> cVar);

        /* renamed from: a */
        boolean mo161747a();
    }

    /* renamed from: a */
    public final Context mo161767a() {
        return this.f116037c;
    }

    /* renamed from: b */
    public final String mo161771b() {
        return this.f116038d;
    }

    /* renamed from: c */
    public final String mo161772c() {
        return this.f116039e;
    }

    /* renamed from: d */
    public final IMmCommentDetailAdapterCallback mo161773d() {
        return this.f116040f;
    }

    /* renamed from: e */
    public final IMmCommentDetailAdapterDepend mo161774e() {
        return this.f116041g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f116036b.size();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\r\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentDetailAdapter$MmCommentDetailContentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "contentView", "Landroid/view/View;", "(Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentDetailAdapter;Landroid/view/View;)V", "avatarIcon", "Lcom/larksuite/component/universe_design/image/UDAvatar;", "commentContentView", "Landroid/widget/TextView;", "commentContentViewLayout", "commentOriginContentView", "getContentView", "()Landroid/view/View;", "divider", "nickName", "sendTime", "bind", "", "item", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment$MmCommentInfo$CommentDetail$CommentDetailContent;", "deleteConfirm", "findMentionsOffsetOfTop", "", "()Ljava/lang/Integer;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.h$c */
    public final class MmCommentDetailContentViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final UDAvatar f116042a;

        /* renamed from: b */
        public final TextView f116043b;

        /* renamed from: c */
        final /* synthetic */ MmParaCommentDetailAdapter f116044c;

        /* renamed from: d */
        private final TextView f116045d;

        /* renamed from: e */
        private final View f116046e;

        /* renamed from: f */
        private final TextView f116047f;

        /* renamed from: g */
        private final TextView f116048g;

        /* renamed from: h */
        private final View f116049h;

        /* renamed from: i */
        private final View f116050i;

        /* renamed from: a */
        public final Integer mo161775a() {
            boolean z;
            Integer num;
            Integer num2;
            C45855f.m181664c("MmCommentDetailAdapter", "commentContentView.text is Spanned: " + (this.f116043b.getText() instanceof Spanned));
            if (this.f116043b.getText() instanceof Spanned) {
                CharSequence text = this.f116043b.getText();
                if (text != null) {
                    C46488d[] dVarArr = (C46488d[]) ((Spanned) text).getSpans(0, this.f116043b.getText().length(), C46488d.class);
                    Intrinsics.checkExpressionValueIsNotNull(dVarArr, "span");
                    if (dVarArr.length == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        CharSequence text2 = this.f116043b.getText();
                        if (text2 != null) {
                            int spanStart = ((Spanned) text2).getSpanStart(dVarArr[0]);
                            C45855f.m181664c("MmCommentDetailAdapter", "offset: " + spanStart + ", layout: " + this.f116043b.getLayout());
                            if (spanStart != -1) {
                                Layout layout = this.f116043b.getLayout();
                                if (layout != null) {
                                    num = Integer.valueOf(layout.getLineForOffset(spanStart));
                                } else {
                                    num = null;
                                }
                                C45855f.m181664c("MmCommentDetailAdapter", "line: " + num);
                                if (num != null) {
                                    num.intValue();
                                    Layout layout2 = this.f116043b.getLayout();
                                    if (layout2 != null) {
                                        num2 = Integer.valueOf(layout2.getLineTop(num.intValue()));
                                    } else {
                                        num2 = null;
                                    }
                                    C45855f.m181664c("MmCommentDetailAdapter", "lineTop: " + num2);
                                    if (num2 != null) {
                                        return Integer.valueOf(-num2.intValue());
                                    }
                                }
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.text.Spanned");
                        }
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.text.Spanned");
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.comment.h$c$a */
        public static final class C46045a extends Lambda implements Function1<View, Unit> {
            final /* synthetic */ MmComment.MmCommentInfo.CommentDetail.CommentDetailContent $item;
            final /* synthetic */ MmCommentDetailContentViewHolder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46045a(MmCommentDetailContentViewHolder cVar, MmComment.MmCommentInfo.CommentDetail.CommentDetailContent commentDetailContent) {
                super(1);
                this.this$0 = cVar;
                this.$item = commentDetailContent;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke(view);
                return Unit.INSTANCE;
            }

            public final void invoke(View view) {
                Intrinsics.checkParameterIsNotNull(view, "it");
                C45855f.m181664c("MmCommentDetailAdapter", "click avatarIcon, jump to profile");
                Activity a = C47098d.m186533a(this.this$0.f116044c.mo161767a());
                if (a != null) {
                    FragmentActivity fragmentActivity = (FragmentActivity) a;
                    C47083e.m186423a(fragmentActivity, "vc_mm_click_button", C47086i.m186432a().mo165409a("profile_picture").mo165413a("page_name", "detail_page").mo165413a("from_source", "commentator_picture").mo165421c());
                    C47083e.m186423a(fragmentActivity, "vc_minutes_detail_click", C47086i.m186432a().mo165422d("profile").mo165423e("none").mo165424f("commentator_picture").mo165421c());
                    IMmDepend a2 = C45899c.m181859a();
                    Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl()");
                    a2.getHostDepend().mo144633a(this.this$0.f116042a.getContext(), this.$item.getUser_id(), BaseUserType.USER);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.comment.h$c$b */
        public static final class View$OnLongClickListenerC46046b implements View.OnLongClickListener {

            /* renamed from: a */
            final /* synthetic */ MmCommentDetailContentViewHolder f116051a;

            /* renamed from: b */
            final /* synthetic */ MmComment.MmCommentInfo.CommentDetail.CommentDetailContent f116052b;

            View$OnLongClickListenerC46046b(MmCommentDetailContentViewHolder cVar, MmComment.MmCommentInfo.CommentDetail.CommentDetailContent commentDetailContent) {
                this.f116051a = cVar;
                this.f116052b = commentDetailContent;
            }

            public final boolean onLongClick(View view) {
                final TextView textView = this.f116051a.f116043b;
                textView.post(new Runnable(this) {
                    /* class com.ss.android.lark.mm.module.detail.comment.MmParaCommentDetailAdapter.MmCommentDetailContentViewHolder.View$OnLongClickListenerC46046b.RunnableC460471 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnLongClickListenerC46046b f116053a;

                    {
                        this.f116053a = r1;
                    }

                    public final void run() {
                        View inflate = LayoutInflater.from(this.f116053a.f116051a.f116044c.mo161767a()).inflate(R.layout.mm_comment_content_tips, (ViewGroup) null);
                        int i = 0;
                        inflate.measure(0, 0);
                        final PopupWindow popupWindow = new PopupWindow(inflate, -2, -2, true);
                        View findViewById = inflate.findViewById(R.id.copyActionView);
                        Intrinsics.checkExpressionValueIsNotNull(findViewById, "popMenuView.findViewById…iew>(R.id.copyActionView)");
                        C47110e.m186573a(findViewById, new Function1<View, Unit>(this) {
                            /* class com.ss.android.lark.mm.module.detail.comment.MmParaCommentDetailAdapter.MmCommentDetailContentViewHolder.View$OnLongClickListenerC46046b.RunnableC460471.C460481 */
                            final /* synthetic */ RunnableC460471 this$0;

                            {
                                this.this$0 = r1;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                                invoke(view);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(View view) {
                                Intrinsics.checkParameterIsNotNull(view, "it");
                                C45855f.m181664c("MmCommentDetailAdapter", "comment copied");
                                popupWindow.dismiss();
                                ClipBoardUtil.f118606a.mo165481a(this.this$0.f116053a.f116051a.f116044c.mo161767a(), this.this$0.f116053a.f116051a.f116043b.getText().toString());
                                C45858j.m181677a((int) R.string.MMWeb_G_CopiedSuccessfully);
                            }
                        });
                        View findViewById2 = inflate.findViewById(R.id.deleteActionView);
                        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "deleteActionView");
                        if (!this.f116053a.f116052b.isCanDelete() && !this.f116053a.f116051a.f116044c.mo161774e().mo161747a()) {
                            i = 8;
                        }
                        findViewById2.setVisibility(i);
                        C47110e.m186573a(findViewById2, new Function1<View, Unit>(this) {
                            /* class com.ss.android.lark.mm.module.detail.comment.MmParaCommentDetailAdapter.MmCommentDetailContentViewHolder.View$OnLongClickListenerC46046b.RunnableC460471.C460492 */
                            final /* synthetic */ RunnableC460471 this$0;

                            {
                                this.this$0 = r1;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                                invoke(view);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(View view) {
                                Intrinsics.checkParameterIsNotNull(view, "it");
                                C45855f.m181664c("MmCommentDetailAdapter", "comment deleted");
                                popupWindow.dismiss();
                                this.this$0.f116053a.f116051a.mo161777b(this.this$0.f116053a.f116052b);
                            }
                        });
                        int a = C57582a.m223601a(this.f116053a.f116051a.f116044c.mo161767a(), 24.0f);
                        int dp2px = UIUtils.dp2px(this.f116053a.f116051a.f116044c.mo161767a(), 5.0f);
                        textView.getLocalVisibleRect(this.f116053a.f116051a.f116044c.f116035a);
                        int height = this.f116053a.f116051a.f116044c.f116035a.height();
                        TextView textView = textView;
                        Intrinsics.checkExpressionValueIsNotNull(inflate, "popMenuView");
                        popupWindow.showAsDropDown(textView, ((textView.getMeasuredWidth() / 2) - (inflate.getMeasuredWidth() / 2)) + a, ((-inflate.getMeasuredHeight()) - height) + dp2px);
                    }
                });
                return true;
            }
        }

        /* renamed from: b */
        public final void mo161777b(MmComment.MmCommentInfo.CommentDetail.CommentDetailContent commentDetailContent) {
            Activity a = C47098d.m186533a(this.f116044c.mo161767a());
            if (a != null) {
                ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f116044c.mo161767a()).message(ResString.f118656a.mo165504a(R.string.MMWeb_G_DeleteComment))).actionButtonOrientation(UDBaseDialogBuilder.ActionBottomOrientation.HORIZONTAL)).addActionButton(R.id.ud_dialog_btn_secondary, R.string.MMWeb_G_Cancel, (DialogInterface.OnClickListener) null)).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90706b(R.string.MMWeb_G_Delete).mo90710d(R.color.ud_R500).mo90703a(new DialogInterface$OnClickListenerC46050c(this, commentDetailContent, (FragmentActivity) a)))).show();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        }

        /* renamed from: a */
        public final void mo161776a(MmComment.MmCommentInfo.CommentDetail.CommentDetailContent commentDetailContent) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(commentDetailContent, "item");
            C45853e.m181660b(this.f116042a, commentDetailContent.getAvatar_url());
            C47110e.m186573a(this.f116042a, new C46045a(this, commentDetailContent));
            this.f116045d.setText(commentDetailContent.getUser_name());
            C46489e.m183854a(this.f116043b, commentDetailContent.getContent());
            String originContent = commentDetailContent.getOriginContent();
            if (originContent == null || StringsKt.isBlank(originContent)) {
                z = true;
            } else {
                z = false;
            }
            if (z || Intrinsics.areEqual(commentDetailContent.getOriginContent(), commentDetailContent.getContent())) {
                this.f116047f.setVisibility(8);
            } else {
                C46489e.m183854a(this.f116047f, commentDetailContent.getOriginContent());
                this.f116047f.setVisibility(0);
            }
            this.f116048g.setText(MmDateUtil.m186537a(commentDetailContent.getCreate_time()));
            if (getAdapterPosition() == this.f116044c.getItemCount() - 1) {
                this.f116049h.setVisibility(8);
            } else {
                this.f116049h.setVisibility(0);
            }
            this.f116043b.setOnLongClickListener(new View$OnLongClickListenerC46046b(this, commentDetailContent));
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.comment.h$c$c */
        public static final class DialogInterface$OnClickListenerC46050c implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ MmCommentDetailContentViewHolder f116055a;

            /* renamed from: b */
            final /* synthetic */ MmComment.MmCommentInfo.CommentDetail.CommentDetailContent f116056b;

            /* renamed from: c */
            final /* synthetic */ FragmentActivity f116057c;

            DialogInterface$OnClickListenerC46050c(MmCommentDetailContentViewHolder cVar, MmComment.MmCommentInfo.CommentDetail.CommentDetailContent commentDetailContent, FragmentActivity fragmentActivity) {
                this.f116055a = cVar;
                this.f116056b = commentDetailContent;
                this.f116057c = fragmentActivity;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                IMmCommentDetailAdapterDepend e = this.f116055a.f116044c.mo161774e();
                String b = this.f116055a.f116044c.mo161771b();
                String c = this.f116055a.f116044c.mo161772c();
                String content_id = this.f116056b.getContent_id();
                Intrinsics.checkExpressionValueIsNotNull(content_id, "item.content_id");
                e.mo161746a(b, c, content_id, new AbstractC47070c<String>(this) {
                    /* class com.ss.android.lark.mm.module.detail.comment.MmParaCommentDetailAdapter.MmCommentDetailContentViewHolder.DialogInterface$OnClickListenerC46050c.C460511 */

                    /* renamed from: a */
                    final /* synthetic */ DialogInterface$OnClickListenerC46050c f116058a;

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f116058a = r1;
                    }

                    @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
                    /* renamed from: a */
                    public void mo161288a(C47068a aVar) {
                        C45855f.m181666e("MmCommentDetailAdapter", "[deleteComment]: " + aVar);
                        C45858j.m181677a((int) R.string.MMWeb_G_DeleteMeetingErrorTryAgainLater);
                    }

                    /* renamed from: a */
                    public void mo161289a(String str) {
                        String str2;
                        boolean isCanDelete = this.f116058a.f116056b.isCanDelete();
                        FragmentActivity fragmentActivity = this.f116058a.f116057c;
                        C47086i a = C47086i.m186432a().mo165409a("delete_comment");
                        String str3 = "self";
                        if (isCanDelete) {
                            str2 = str3;
                        } else {
                            str2 = "others";
                        }
                        C47083e.m186423a(fragmentActivity, "vc_mm_click_button", a.mo165413a("comment_source", str2).mo165421c());
                        FragmentActivity fragmentActivity2 = this.f116058a.f116057c;
                        C47086i e = C47086i.m186432a().mo165422d("delete_comment").mo165423e("none");
                        if (!isCanDelete) {
                            str3 = "others";
                        }
                        C47083e.m186423a(fragmentActivity2, "vc_minutes_detail_click", e.mo165413a("comment_owner", str3).mo165421c());
                        IMmCommentDetailAdapterCallback d = this.f116058a.f116055a.f116044c.mo161773d();
                        String content_id = this.f116058a.f116056b.getContent_id();
                        Intrinsics.checkExpressionValueIsNotNull(content_id, "item.content_id");
                        d.mo161745a(content_id);
                    }
                });
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MmCommentDetailContentViewHolder(MmParaCommentDetailAdapter hVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "contentView");
            this.f116044c = hVar;
            this.f116050i = view;
            View findViewById = view.findViewById(R.id.avatarIcon);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "contentView.findViewById(R.id.avatarIcon)");
            this.f116042a = (UDAvatar) findViewById;
            View findViewById2 = view.findViewById(R.id.nickName);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "contentView.findViewById(R.id.nickName)");
            this.f116045d = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.commentContentViewLayout);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "contentView.findViewById…commentContentViewLayout)");
            this.f116046e = findViewById3;
            View findViewById4 = view.findViewById(R.id.commentContentView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "contentView.findViewById(R.id.commentContentView)");
            this.f116043b = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.commentOriginContentView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "contentView.findViewById…commentOriginContentView)");
            this.f116047f = (TextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.sendTime);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "contentView.findViewById(R.id.sendTime)");
            this.f116048g = (TextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById7, "contentView.findViewById(R.id.divider)");
            this.f116049h = findViewById7;
        }
    }

    /* renamed from: a */
    public final void mo161768a(MmComment.MmCommentInfo.CommentDetail.CommentDetailContent commentDetailContent) {
        Intrinsics.checkParameterIsNotNull(commentDetailContent, Comment.f24093e);
        int size = this.f116036b.size();
        this.f116036b.add(commentDetailContent);
        notifyItemChanged(size - 1);
        notifyItemInserted(size);
    }

    /* renamed from: a */
    public final void mo161770a(List<? extends MmComment.MmCommentInfo.CommentDetail.CommentDetailContent> list) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f116036b.clear();
        this.f116036b.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo161769a(String str) {
        T t;
        Intrinsics.checkParameterIsNotNull(str, "contentId");
        Iterator<T> it = this.f116036b.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (Intrinsics.areEqual(t.getContent_id(), str)) {
                break;
            }
        }
        T t2 = t;
        int indexOf = CollectionsKt.indexOf((List) this.f116036b, (Object) t2);
        List<MmComment.MmCommentInfo.CommentDetail.CommentDetailContent> list = this.f116036b;
        if (list != null) {
            C69121n.m265986c(list).remove(t2);
            notifyItemRemoved(indexOf);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        if (viewHolder instanceof MmCommentDetailContentViewHolder) {
            ((MmCommentDetailContentViewHolder) viewHolder).mo161776a(this.f116036b.get(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mm_comment_detail_content_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…tent_item, parent, false)");
        return new MmCommentDetailContentViewHolder(this, inflate);
    }

    public MmParaCommentDetailAdapter(Context context, String str, String str2, IMmCommentDetailAdapterCallback aVar, IMmCommentDetailAdapterDepend bVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "pid");
        Intrinsics.checkParameterIsNotNull(str2, "commentId");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        Intrinsics.checkParameterIsNotNull(bVar, "depend");
        this.f116037c = context;
        this.f116038d = str;
        this.f116039e = str2;
        this.f116040f = aVar;
        this.f116041g = bVar;
    }
}
