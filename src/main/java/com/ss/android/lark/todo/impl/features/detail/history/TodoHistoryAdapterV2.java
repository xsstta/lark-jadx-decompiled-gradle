package com.ss.android.lark.todo.impl.features.detail.history;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.todo.v1.Record;
import com.bytedance.lark.pb.todo.v1.TodoAssignee;
import com.bytedance.lark.pb.todo.v1.TodoReminder;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.suite.R;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.idependency.IMessengerDependency;
import com.ss.android.lark.todo.impl.features.common.helper.EndTimeHelper;
import com.ss.android.lark.todo.impl.features.detail.common.UserSpan;
import com.ss.android.lark.todo.impl.features.detail.p2809b.p2810a.C56478e;
import com.ss.android.lark.todo.impl.features.detail.time.TodoReminderItems;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.richtext.RichTextView;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002:;B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0002J\u0016\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0002J0\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001cH\u0002J\b\u0010!\u001a\u00020\u0018H\u0016JD\u0010\"\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0002JH\u0010'\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0002J@\u0010'\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0002J\u0010\u0010(\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\tH\u0002J\u0010\u0010*\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u001fH\u0002J(\u0010,\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000bH\u0002J\u0018\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u0018H\u0016J\u0018\u00100\u001a\u00020\u00022\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0018H\u0016J\u0010\u00104\u001a\u00020\u001c2\u0006\u00105\u001a\u000206H\u0002J\u0010\u00107\u001a\u00020\u001c2\u0006\u00105\u001a\u000206H\u0002J\u0016\u00108\u001a\u00020\r2\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/history/TodoHistoryAdapterV2;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/todo/impl/features/detail/history/TodoHistoryAdapterV2$ViewHolder;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "(Lcom/larksuite/framework/section/IViewAbility;)V", "records", "", "Lcom/bytedance/lark/pb/todo/v1/Record;", "uuid", "", "bindContentRichText", "", "richTextView", "Lcom/ss/android/lark/widget/richtext/RichTextView;", "record", "getAssigneeText", "assignees", "Lcom/bytedance/lark/pb/todo/v1/TodoAssignee;", "getContentSpannable", "spannable", "Landroid/text/SpannableStringBuilder;", "resId", "", "contentKey", "content", "hasShownReminderOperation", "", "getDueTimeText", "dueTime", "", "isAllDay", "getItemCount", "getMultiAssigneeSpannable", "operatorName", "operatorId", "addedAssignees", "deletedAssignees", "getOperatorIndex", "getRecordString", "", "getTimeLineText", "timeMillis", "getUserSpannable", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "shouldShowDescriptionRichText", "record_type", "Lcom/bytedance/lark/pb/todo/v1/Record$RecordType;", "shouldShowSummaryRichText", "updateData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Companion", "ViewHolder", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.c.c */
public final class TodoHistoryAdapterV2 extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public static final Companion f139713a = new Companion(null);

    /* renamed from: b */
    private List<Record> f139714b = new ArrayList();

    /* renamed from: c */
    private final String f139715c;

    /* renamed from: d */
    private final IViewAbility<ITodoDetailViewDataStore> f139716d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/history/TodoHistoryAdapterV2$Companion;", "", "()V", "RES_KEY_FOLLOWER", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.c.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/history/TodoHistoryAdapterV2$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.c.c$b */
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final View f139717a;

        /* renamed from: a */
        public final View mo192322a() {
            return this.f139717a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f139717a = view;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/history/TodoHistoryAdapterV2$bindContentRichText$1", "Lcom/ss/android/lark/widget/linked_emojicon/widget/LinkEmojiTextView$IURLStringClickListener;", "onURLClick", "", "view", "Landroid/view/View;", "text", "", "onURLLongClick", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.c.c$c */
    public static final class C56488c implements LinkEmojiTextView.AbstractC58525j {
        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
        /* renamed from: b */
        public boolean mo122807b(View view, String str) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(str, "text");
            return false;
        }

        C56488c() {
        }

        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
        /* renamed from: a */
        public void mo122806a(View view, String str) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(str, "text");
            TodoDependencyHolder.f139242a.mo191730a().browserDependency().mo145368a(view.getContext(), str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J&\u0010\t\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/history/TodoHistoryAdapterV2$bindContentRichText$2", "Lcom/ss/android/lark/widget/linked_emojicon/widget/LinkEmojiTextView$IAtStringClickListenr;", "onAtClick", "", "view", "Landroid/view/View;", "text", "", "userId", "onAtLongClick", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.c.c$d */
    public static final class C56489d implements LinkEmojiTextView.AbstractC58521f {
        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
        /* renamed from: b */
        public boolean mo117507b(View view, String str, String str2) {
            return false;
        }

        C56489d() {
        }

        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
        /* renamed from: c */
        public void mo120297c(View view, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(str2, "userId");
            IMessengerDependency messengerModuleDependency = TodoDependencyHolder.f139242a.mo191730a().messengerModuleDependency();
            Context context = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            messengerModuleDependency.mo145420a(context, str2);
        }
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f139716d.mo92048a()).inflate(R.layout.todo_detail_history_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(view…tory_item, parent, false)");
        return new ViewHolder(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        Record record = this.f139714b.get(i);
        try {
            TextView textView = (TextView) bVar.mo192322a().findViewById(R.id.history_item_content);
            Intrinsics.checkExpressionValueIsNotNull(textView, "holder.view.history_item_content");
            textView.setText(m220201a(record));
            TextView textView2 = (TextView) bVar.mo192322a().findViewById(R.id.history_item_content);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "holder.view.history_item_content");
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            RichTextView richTextView = (RichTextView) bVar.mo192322a().findViewById(R.id.history_item_rich_text);
            Intrinsics.checkExpressionValueIsNotNull(richTextView, "holder.view.history_item_rich_text");
            m220205a(richTextView, record);
        } catch (Exception unused) {
        }
        TextView textView3 = (TextView) bVar.mo192322a().findViewById(R.id.history_item_time);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "holder.view.history_item_time");
        Long l = record.record_milli_time;
        Intrinsics.checkExpressionValueIsNotNull(l, "this.record_milli_time");
        textView3.setText(m220202a(l.longValue()));
        if (i == 0) {
            ((FrameLayout) bVar.mo192322a().findViewById(R.id.round_dot_container)).setBackgroundResource(R.drawable.todo_svg_icon_round_bg);
            View findViewById = bVar.mo192322a().findViewById(R.id.history_dot_first);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "holder.view.history_dot_first");
            findViewById.setVisibility(0);
        } else {
            ((FrameLayout) bVar.mo192322a().findViewById(R.id.round_dot_container)).setBackgroundColor(0);
            View findViewById2 = bVar.mo192322a().findViewById(R.id.history_dot_first);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "holder.view.history_dot_first");
            findViewById2.setVisibility(8);
        }
        if (i == getItemCount() - 1) {
            View findViewById3 = bVar.mo192322a().findViewById(R.id.history_line);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "holder.view.history_line");
            findViewById3.setVisibility(4);
            return;
        }
        View findViewById4 = bVar.mo192322a().findViewById(R.id.history_line);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "holder.view.history_line");
        findViewById4.setVisibility(0);
    }

    /* renamed from: a */
    private final void m220205a(RichTextView richTextView, Record record) {
        richTextView.setAtTextColor(R.color.text_link_normal);
        richTextView.setAtSelfTextColor(R.color.text_link_normal);
        richTextView.setAtOtherChatUserTextColor(R.color.text_caption);
        richTextView.setAtSelfBgColor(R.color.lkui_transparent);
        richTextView.setDefaultAtUserColor(UIHelper.getColor(R.color.text_link_normal));
        richTextView.setUrlTextColor(UIHelper.getColor(R.color.text_link_normal));
        richTextView.setTextSize(UIHelper.sp2px(14.0f));
        richTextView.setShowImage(false);
        richTextView.setShowVideo(false);
        richTextView.setNeedToRecognizePhone(false);
        richTextView.setUrlStringClickListner(new C56488c());
        richTextView.setAtStringClickListner(new C56489d());
        Record.RecordType recordType = record.record_type;
        Intrinsics.checkExpressionValueIsNotNull(recordType, "record.record_type");
        if (!m220206a(recordType)) {
            Record.RecordType recordType2 = record.record_type;
            Intrinsics.checkExpressionValueIsNotNull(recordType2, "record.record_type");
            if (!m220208b(recordType2)) {
                richTextView.setVisibility(8);
                return;
            }
        }
        Record.RecordType recordType3 = record.record_type;
        Intrinsics.checkExpressionValueIsNotNull(recordType3, "record.record_type");
        if (m220206a(recordType3)) {
            richTextView.setInfo(C56478e.m220168a(record.rich_summary));
        } else {
            Record.RecordType recordType4 = record.record_type;
            Intrinsics.checkExpressionValueIsNotNull(recordType4, "record.record_type");
            if (m220208b(recordType4)) {
                richTextView.setInfo(C56478e.m220168a(record.rich_description));
            }
        }
        richTextView.setVisibility(0);
    }

    /* renamed from: a */
    private final void m220204a(SpannableStringBuilder spannableStringBuilder, int i, String str, String str2, boolean z) {
        if (z) {
            spannableStringBuilder.append((CharSequence) ResUtil.f139261a.mo191781c(R.string.Todo_Common_DivideSymbol));
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str, this.f139715c);
        int indexOf$default = StringsKt.indexOf$default((CharSequence) ResUtil.f139261a.mo191779a(i, hashMap), this.f139715c, 0, false, 6, (Object) null) + spannableStringBuilder.length();
        hashMap.put(str, str2);
        spannableStringBuilder.append((CharSequence) ResUtil.f139261a.mo191779a(i, hashMap));
        spannableStringBuilder.setSpan(new StyleSpan(1), indexOf$default, str2.length() + indexOf$default, 33);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f139714b.size();
    }

    /* renamed from: a */
    private final boolean m220206a(Record.RecordType recordType) {
        if (recordType == Record.RecordType.USER_UPDATED_RICH_SUMMARY) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lcom/bytedance/lark/pb/todo/v1/TodoAssignee;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.c.c$e */
    public static final class C56490e extends Lambda implements Function1<TodoAssignee, String> {
        public static final C56490e INSTANCE = new C56490e();

        C56490e() {
            super(1);
        }

        public final String invoke(TodoAssignee todoAssignee) {
            Intrinsics.checkParameterIsNotNull(todoAssignee, "it");
            String str = todoAssignee.name;
            Intrinsics.checkExpressionValueIsNotNull(str, "it.name");
            return str;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "reminder", "Lcom/bytedance/lark/pb/todo/v1/TodoReminder;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.c.c$f */
    public static final class C56491f extends Lambda implements Function1<TodoReminder, String> {
        public static final C56491f INSTANCE = new C56491f();

        C56491f() {
            super(1);
        }

        public final String invoke(TodoReminder todoReminder) {
            TodoReminderItems cVar = TodoReminderItems.f140115a;
            Intrinsics.checkExpressionValueIsNotNull(todoReminder, "reminder");
            return cVar.mo192734a(todoReminder);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "reminder", "Lcom/bytedance/lark/pb/todo/v1/TodoReminder;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.c.c$g */
    public static final class C56492g extends Lambda implements Function1<TodoReminder, String> {
        public static final C56492g INSTANCE = new C56492g();

        C56492g() {
            super(1);
        }

        public final String invoke(TodoReminder todoReminder) {
            TodoReminderItems cVar = TodoReminderItems.f140115a;
            Intrinsics.checkExpressionValueIsNotNull(todoReminder, "reminder");
            return cVar.mo192734a(todoReminder);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "reminder", "Lcom/bytedance/lark/pb/todo/v1/TodoReminder;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.c.c$h */
    public static final class C56493h extends Lambda implements Function1<TodoReminder, String> {
        public static final C56493h INSTANCE = new C56493h();

        C56493h() {
            super(1);
        }

        public final String invoke(TodoReminder todoReminder) {
            TodoReminderItems cVar = TodoReminderItems.f140115a;
            Intrinsics.checkExpressionValueIsNotNull(todoReminder, "reminder");
            return cVar.mo192734a(todoReminder);
        }
    }

    /* renamed from: a */
    public final void mo192321a(List<Record> list) {
        if (list == null) {
            list = new ArrayList();
        }
        this.f139714b = list;
        notifyDataSetChanged();
    }

    /* renamed from: b */
    private final String m220207b(List<TodoAssignee> list) {
        return CollectionsKt.joinToString$default(list, ResUtil.f139261a.mo191781c(R.string.Todo_Task_Comma), null, null, 0, null, C56490e.INSTANCE, 30, null);
    }

    public TodoHistoryAdapterV2(IViewAbility<ITodoDetailViewDataStore> fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
        this.f139716d = fVar;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkExpressionValueIsNotNull(uuid, "UUID.randomUUID().toString()");
        this.f139715c = uuid;
    }

    /* renamed from: b */
    private final boolean m220208b(Record.RecordType recordType) {
        if (recordType == Record.RecordType.USER_ADDED_DESCRIPTION || recordType == Record.RecordType.USER_UPDATED_DESCRIPTION || recordType == Record.RecordType.USER_DELETED_DESCRIPTION) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final String m220202a(long j) {
        Context a = TodoDependencyHolder.f139242a.mo191730a().settingDependency().mo145427a();
        Options aVar = new Options(null, null, null, null, null, false, false, false, false, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
        aVar.mo191592a(DisplayPattern.RELATIVE);
        aVar.mo191599b(!TodoDependencyHolder.f139242a.mo191730a().timeFormatDependency().mo145434b());
        aVar.mo191594a(TimePreciseness.MINUTE);
        return TimeFormatUtils.m219292g(a, new Date(j), aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:209:0x044a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, r3) == false) goto L_0x044c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.CharSequence m220201a(com.bytedance.lark.pb.todo.v1.Record r26) {
        /*
        // Method dump skipped, instructions count: 1678
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.detail.history.TodoHistoryAdapterV2.m220201a(com.bytedance.lark.pb.todo.v1.Record):java.lang.CharSequence");
    }

    /* renamed from: a */
    private final String m220203a(long j, boolean z) {
        return EndTimeHelper.m219791a(EndTimeHelper.f139399a, TodoDependencyHolder.f139242a.mo191730a().settingDependency().mo145427a(), j, z, TodoDependencyHolder.f139242a.mo191730a().timeFormatDependency().mo145434b(), false, 16, null).getEndTimeStr();
    }

    /* renamed from: a */
    private final SpannableStringBuilder m220198a(SpannableStringBuilder spannableStringBuilder, int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("user_name", this.f139715c);
        int indexOf$default = StringsKt.indexOf$default((CharSequence) ResUtil.f139261a.mo191779a(i, hashMap), this.f139715c, 0, false, 6, (Object) null) + spannableStringBuilder.length();
        hashMap.put("user_name", str);
        spannableStringBuilder.append((CharSequence) ResUtil.f139261a.mo191779a(i, hashMap));
        spannableStringBuilder.setSpan(new UserSpan(str2, 0, 2, null), indexOf$default, str.length() + indexOf$default, 33);
        return spannableStringBuilder;
    }

    /* renamed from: a */
    private final SpannableStringBuilder m220197a(int i, String str, String str2, String str3, String str4, List<TodoAssignee> list) {
        return m220199a(new SpannableStringBuilder(), i, str, str2, str3, str4, list);
    }

    /* renamed from: a */
    private final SpannableStringBuilder m220200a(SpannableStringBuilder spannableStringBuilder, int i, String str, String str2, List<TodoAssignee> list, List<TodoAssignee> list2) {
        String b = m220207b(list);
        String b2 = m220207b(list2);
        HashMap hashMap = new HashMap();
        hashMap.put("user_name", this.f139715c);
        hashMap.put("assignee", b);
        hashMap.put("other_assignee", b2);
        int indexOf$default = StringsKt.indexOf$default((CharSequence) ResUtil.f139261a.mo191779a(i, hashMap), this.f139715c, 0, false, 6, (Object) null) + spannableStringBuilder.length();
        hashMap.put("user_name", str);
        hashMap.put("assignee", this.f139715c);
        hashMap.put("other_assignee", b2);
        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) ResUtil.f139261a.mo191779a(i, hashMap), this.f139715c, 0, false, 6, (Object) null) + spannableStringBuilder.length();
        hashMap.put("user_name", str);
        hashMap.put("assignee", b);
        hashMap.put("other_assignee", this.f139715c);
        int indexOf$default3 = StringsKt.indexOf$default((CharSequence) ResUtil.f139261a.mo191779a(i, hashMap), this.f139715c, 0, false, 6, (Object) null) + spannableStringBuilder.length();
        hashMap.put("user_name", str);
        hashMap.put("assignee", b);
        hashMap.put("other_assignee", b2);
        spannableStringBuilder.append((CharSequence) ResUtil.f139261a.mo191779a(i, hashMap));
        spannableStringBuilder.setSpan(new UserSpan(str2, 0, 2, null), indexOf$default, str.length() + indexOf$default, 33);
        for (TodoAssignee todoAssignee : list) {
            String str3 = todoAssignee.assignee_id;
            Intrinsics.checkExpressionValueIsNotNull(str3, "assignee.assignee_id");
            spannableStringBuilder.setSpan(new UserSpan(str3, 0, 2, null), indexOf$default2, todoAssignee.name.length() + indexOf$default2, 33);
            indexOf$default2 += (todoAssignee.name + ResUtil.f139261a.mo191781c(R.string.Todo_Task_Comma)).length();
        }
        for (TodoAssignee todoAssignee2 : list2) {
            String str4 = todoAssignee2.assignee_id;
            Intrinsics.checkExpressionValueIsNotNull(str4, "assignee.assignee_id");
            spannableStringBuilder.setSpan(new UserSpan(str4, 0, 2, null), indexOf$default3, todoAssignee2.name.length() + indexOf$default3, 33);
            indexOf$default3 += (todoAssignee2.name + ResUtil.f139261a.mo191781c(R.string.Todo_Task_Comma)).length();
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    private final SpannableStringBuilder m220199a(SpannableStringBuilder spannableStringBuilder, int i, String str, String str2, String str3, String str4, List<TodoAssignee> list) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (spannableStringBuilder.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) ResUtil.f139261a.mo191781c(R.string.Todo_Task_Comma));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("user_name", this.f139715c);
        String str5 = str3;
        if (str5.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            hashMap.put(str3, str4);
        }
        int indexOf$default = StringsKt.indexOf$default((CharSequence) ResUtil.f139261a.mo191779a(i, hashMap), this.f139715c, 0, false, 6, (Object) null) + spannableStringBuilder.length();
        hashMap.put("user_name", str);
        if (str5.length() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            hashMap.put(str3, this.f139715c);
        }
        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) ResUtil.f139261a.mo191779a(i, hashMap), this.f139715c, 0, false, 6, (Object) null) + spannableStringBuilder.length();
        hashMap.put("user_name", str);
        if (str5.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            hashMap.put(str3, str4);
        }
        spannableStringBuilder.append((CharSequence) ResUtil.f139261a.mo191779a(i, hashMap));
        spannableStringBuilder.setSpan(new UserSpan(str2, 0, 2, null), indexOf$default, str.length() + indexOf$default, 33);
        if (!list.isEmpty()) {
            for (TodoAssignee todoAssignee : list) {
                String str6 = todoAssignee.assignee_id;
                Intrinsics.checkExpressionValueIsNotNull(str6, "assignee.assignee_id");
                spannableStringBuilder.setSpan(new UserSpan(str6, 0, 2, null), indexOf$default2, todoAssignee.name.length() + indexOf$default2, 33);
                indexOf$default2 += (todoAssignee.name + ResUtil.f139261a.mo191781c(R.string.Todo_Task_Comma)).length();
            }
        } else if (indexOf$default2 != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(1), indexOf$default2, str4.length() + indexOf$default2, 33);
        }
        return spannableStringBuilder;
    }
}
