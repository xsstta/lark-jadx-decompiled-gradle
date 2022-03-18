package com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ReplacementSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.JoinLeaveViewData;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import com.ss.android.lark.utils.C57820d;
import com.ss.android.lark.widget.linked_emojicon.C58513g;
import com.ss.android.lark.widget.linked_emojicon.C58514h;
import com.ss.android.lark.widget.span.TextStyleInfo;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00013B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0002J \u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0002J \u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0002J \u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0002J\u0018\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0002J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\fH\u0016J\u0018\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\fH\u0016J \u0010&\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J:\u0010+\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010'\u001a\u00020(2\b\b\u0001\u0010,\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010)\u001a\u00020*2\u0006\u0010-\u001a\u00020\nH\u0002J \u0010.\u001a\u00020 2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u0010\u0018\u001a\u00020\fH\u0002R\u000e\u0010\t\u001a\u00020\nXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u00064"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveItemViewHolder;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveViewData;", "mContext", "Landroid/content/Context;", "mItemClickListener", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveAdapter$ItemClickListener;", "(Landroid/content/Context;Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveAdapter$ItemClickListener;)V", "AT_TEXT", "", "AVATAR_SIZE", "", "ICON_REPLACE", "TAG", "VALUE_TEXT_COLOR", "getMContext", "()Landroid/content/Context;", "getMItemClickListener", "()Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveAdapter$ItemClickListener;", "getBotValueDisplaySpannable", "Lcom/ss/android/lark/widget/linked_emojicon/SpannableStringBuilderAllVer;", "contentValue", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveViewData$ContentValue;", "position", "getChatValueDisplaySpannable", "iconSize", "getContentValueDisplaySpannable", "textSize", "getDocValueDisplaySpannable", "getUserValueDisplaySpannable", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setClickableValueDisplaySpannable", "spannable", "Landroid/text/SpannableStringBuilder;", "clickableSpan", "Landroid/text/style/ClickableSpan;", "setIconDisplaySpannable", "iconId", "space", "setWaySpannable", "extra", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveViewData$JoinLeaveWay;", "textView", "Landroid/widget/TextView;", "ItemClickListener", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.b */
public final class JoinLeaveAdapter extends LarkRecyclerViewBaseAdapter<JoinLeaveItemViewHolder, JoinLeaveViewData> {

    /* renamed from: a */
    public final int f89672a;

    /* renamed from: b */
    private final int f89673b;

    /* renamed from: c */
    private final String f89674c = " ";

    /* renamed from: d */
    private final String f89675d = "@";

    /* renamed from: e */
    private final String f89676e = "JoinLeaveAdapter";

    /* renamed from: f */
    private final Context f89677f;

    /* renamed from: g */
    private final ItemClickListener f89678g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveAdapter$ItemClickListener;", "", "onBotClick", "", "botId", "", "position", "", "onChatClick", "chatId", "onDocClick", "url", "onUserClick", "userId", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.b$a */
    public interface ItemClickListener {
        /* renamed from: a */
        void mo128232a(String str, int i);

        /* renamed from: b */
        void mo128233b(String str, int i);

        /* renamed from: c */
        void mo128234c(String str, int i);

        /* renamed from: d */
        void mo128235d(String str, int i);
    }

    /* renamed from: a */
    public final Context mo128228a() {
        return this.f89677f;
    }

    /* renamed from: b */
    public final ItemClickListener mo128231b() {
        return this.f89678g;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveAdapter$getBotValueDisplaySpannable$userClickableSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.b$b */
    public static final class C34719b extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ JoinLeaveAdapter f89679a;

        /* renamed from: b */
        final /* synthetic */ JoinLeaveViewData.ContentValue f89680b;

        /* renamed from: c */
        final /* synthetic */ int f89681c;

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "widget");
            ItemClickListener b = this.f89679a.mo128231b();
            String b2 = this.f89680b.mo128209b();
            if (b2 == null) {
                b2 = "";
            }
            b.mo128234c(b2, this.f89681c);
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f89679a.f89672a);
            textPaint.setUnderlineText(false);
        }

        C34719b(JoinLeaveAdapter bVar, JoinLeaveViewData.ContentValue aVar, int i) {
            this.f89679a = bVar;
            this.f89680b = aVar;
            this.f89681c = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveAdapter$getChatValueDisplaySpannable$userClickableSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.b$c */
    public static final class C34720c extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ JoinLeaveAdapter f89682a;

        /* renamed from: b */
        final /* synthetic */ JoinLeaveViewData.ContentValue f89683b;

        /* renamed from: c */
        final /* synthetic */ int f89684c;

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "widget");
            ItemClickListener b = this.f89682a.mo128231b();
            String b2 = this.f89683b.mo128209b();
            if (b2 == null) {
                b2 = "";
            }
            b.mo128235d(b2, this.f89684c);
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f89682a.f89672a);
            textPaint.setUnderlineText(false);
        }

        C34720c(JoinLeaveAdapter bVar, JoinLeaveViewData.ContentValue aVar, int i) {
            this.f89682a = bVar;
            this.f89683b = aVar;
            this.f89684c = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveAdapter$getDocValueDisplaySpannable$userClickableSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.b$d */
    public static final class C34721d extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ JoinLeaveAdapter f89685a;

        /* renamed from: b */
        final /* synthetic */ JoinLeaveViewData.ContentValue f89686b;

        /* renamed from: c */
        final /* synthetic */ int f89687c;

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "widget");
            ItemClickListener b = this.f89685a.mo128231b();
            String c = this.f89686b.mo128210c();
            if (c == null) {
                c = "";
            }
            b.mo128233b(c, this.f89687c);
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f89685a.f89672a);
            textPaint.setUnderlineText(false);
        }

        C34721d(JoinLeaveAdapter bVar, JoinLeaveViewData.ContentValue aVar, int i) {
            this.f89685a = bVar;
            this.f89686b = aVar;
            this.f89687c = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveAdapter$getUserValueDisplaySpannable$userClickableSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.b$e */
    public static final class C34722e extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ JoinLeaveAdapter f89688a;

        /* renamed from: b */
        final /* synthetic */ JoinLeaveViewData.ContentValue f89689b;

        /* renamed from: c */
        final /* synthetic */ int f89690c;

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "widget");
            ItemClickListener b = this.f89688a.mo128231b();
            String b2 = this.f89689b.mo128209b();
            if (b2 == null) {
                b2 = "";
            }
            b.mo128232a(b2, this.f89690c);
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f89688a.f89672a);
            textPaint.setUnderlineText(false);
        }

        C34722e(JoinLeaveAdapter bVar, JoinLeaveViewData.ContentValue aVar, int i) {
            this.f89688a = bVar;
            this.f89689b = aVar;
            this.f89690c = i;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.b$f */
    public static final class View$OnClickListenerC34723f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ JoinLeaveAdapter f89691a;

        /* renamed from: b */
        final /* synthetic */ JoinLeaveViewData f89692b;

        /* renamed from: c */
        final /* synthetic */ int f89693c;

        View$OnClickListenerC34723f(JoinLeaveAdapter bVar, JoinLeaveViewData joinLeaveViewData, int i) {
            this.f89691a = bVar;
            this.f89692b = joinLeaveViewData;
            this.f89693c = i;
        }

        public final void onClick(View view) {
            this.f89691a.mo128231b().mo128232a(this.f89692b.mo128203a(), this.f89693c);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.b$g */
    public static final class View$OnClickListenerC34724g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ JoinLeaveAdapter f89694a;

        /* renamed from: b */
        final /* synthetic */ JoinLeaveViewData f89695b;

        /* renamed from: c */
        final /* synthetic */ int f89696c;

        View$OnClickListenerC34724g(JoinLeaveAdapter bVar, JoinLeaveViewData joinLeaveViewData, int i) {
            this.f89694a = bVar;
            this.f89695b = joinLeaveViewData;
            this.f89696c = i;
        }

        public final void onClick(View view) {
            this.f89694a.mo128231b().mo128232a(this.f89695b.mo128203a(), this.f89696c);
        }
    }

    public JoinLeaveAdapter(Context context, ItemClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(aVar, "mItemClickListener");
        this.f89677f = context;
        this.f89678g = aVar;
        this.f89673b = UIUtils.dp2px(context, 42.0f);
        this.f89672a = UIUtils.getColor(context, R.color.text_link_normal);
    }

    /* renamed from: a */
    private final C58513g m135014a(JoinLeaveViewData.ContentValue aVar, int i) {
        C34719b bVar = new C34719b(this, aVar, i);
        String str = this.f89675d + aVar.mo128208a();
        C58513g gVar = new C58513g(this.f89677f, str);
        m135018a(str, gVar, bVar);
        return gVar;
    }

    /* renamed from: b */
    private final C58513g m135019b(JoinLeaveViewData.ContentValue aVar, int i) {
        C34722e eVar = new C34722e(this, aVar, i);
        String str = this.f89675d + aVar.mo128208a();
        C58513g gVar = new C58513g(this.f89677f, str);
        m135018a(str, gVar, eVar);
        return gVar;
    }

    /* renamed from: a */
    public JoinLeaveItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f89677f).inflate(R.layout.join_leave_item_layout, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(mCon…em_layout, parent, false)");
        return new JoinLeaveItemViewHolder(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(JoinLeaveItemViewHolder gVar, int i) {
        int i2;
        Intrinsics.checkParameterIsNotNull(gVar, "holder");
        JoinLeaveViewData joinLeaveViewData = (JoinLeaveViewData) getItem(i);
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        AbstractC34461c.AbstractC34474m i3 = a.mo127279i();
        Context context = this.f89677f;
        String b = joinLeaveViewData.mo128204b();
        String a2 = joinLeaveViewData.mo128203a();
        View view = gVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        int i4 = this.f89673b;
        i3.mo127409a(context, b, a2, (LKUIRoundedImageView) view.findViewById(R.id.mAvatarIv), i4, i4);
        View view2 = gVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
        ((LKUIRoundedImageView) view2.findViewById(R.id.mAvatarIv)).setOnClickListener(new View$OnClickListenerC34723f(this, joinLeaveViewData, i));
        View view3 = gVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "holder.itemView");
        TextView textView = (TextView) view3.findViewById(R.id.mNameTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "holder.itemView.mNameTv");
        textView.setText(joinLeaveViewData.mo128205c());
        View view4 = gVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "holder.itemView");
        ((TextView) view4.findViewById(R.id.mNameTv)).setOnClickListener(new View$OnClickListenerC34724g(this, joinLeaveViewData, i));
        DisplayPattern displayPattern = DisplayPattern.RELATIVE;
        LengthType lengthType = LengthType.LONG;
        AbstractC34461c a3 = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "ChatSettingModule.getDependency()");
        Options aVar = new Options(null, displayPattern, lengthType, null, TimePreciseness.MINUTE, false, !a3.mo127257B(), false, false, 425, null);
        View view5 = gVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "holder.itemView");
        TextView textView2 = (TextView) view5.findViewById(R.id.mTimeTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "holder.itemView.mTimeTv");
        textView2.setText(TimeFormatUtils.m219292g(this.f89677f, new Date(joinLeaveViewData.mo128206d() * ((long) 1000)), aVar));
        JoinLeaveViewData.JoinLeaveWay e = joinLeaveViewData.mo128207e();
        View view6 = gVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view6, "holder.itemView");
        TextView textView3 = (TextView) view6.findViewById(R.id.mWayTipTv);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "holder.itemView.mWayTipTv");
        m135016a(e, textView3, i);
        View view7 = gVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view7, "holder.itemView");
        View findViewById = view7.findViewById(R.id.mTopDivider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "holder.itemView.mTopDivider");
        if (i == 0) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        findViewById.setVisibility(i2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JR\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J4\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016¨\u0006\u0015"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveAdapter$setIconDisplaySpannable$iconSpan$1", "Landroid/text/style/ReplacementSpan;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", "", "end", "x", "", "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "getSize", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.b$h */
    public static final class C34725h extends ReplacementSpan {

        /* renamed from: a */
        final /* synthetic */ JoinLeaveAdapter f89697a;

        /* renamed from: b */
        final /* synthetic */ int f89698b;

        /* renamed from: c */
        final /* synthetic */ int f89699c;

        C34725h(JoinLeaveAdapter bVar, int i, int i2) {
            this.f89697a = bVar;
            this.f89698b = i;
            this.f89699c = i2;
        }

        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            Intrinsics.checkParameterIsNotNull(paint, "paint");
            return (int) paint.getTextSize();
        }

        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            Intrinsics.checkParameterIsNotNull(canvas, "canvas");
            Intrinsics.checkParameterIsNotNull(paint, "paint");
            float f2 = (float) (i3 + (((i5 - i3) - this.f89698b) / 2));
            Bitmap a = C57820d.m224428a(this.f89697a.mo128228a(), this.f89699c);
            int i6 = this.f89698b;
            Intrinsics.checkExpressionValueIsNotNull(a, "bitmap");
            canvas.drawBitmap(a, (Rect) null, new RectF(f, f2, ((float) ((i6 * a.getWidth()) / a.getHeight())) + f, ((float) this.f89698b) + f2), paint);
        }
    }

    /* renamed from: a */
    private final void m135018a(String str, SpannableStringBuilder spannableStringBuilder, ClickableSpan clickableSpan) {
        TextStyleInfo textStyleInfo = new TextStyleInfo();
        textStyleInfo.textColor = this.f89672a;
        spannableStringBuilder.setSpan(new C58514h(textStyleInfo), 0, str.length(), 33);
        spannableStringBuilder.setSpan(clickableSpan, 0, str.length(), 33);
    }

    /* renamed from: c */
    private final C58513g m135021c(JoinLeaveViewData.ContentValue aVar, int i, int i2) {
        C34720c cVar = new C34720c(this, aVar, i);
        String str = this.f89674c + "  " + aVar.mo128208a();
        C58513g gVar = new C58513g(this.f89677f, str);
        m135017a(str, gVar, R.drawable.jl_chat_icon, i2, cVar, "  ");
        return gVar;
    }

    /* renamed from: a */
    private final C58513g m135015a(JoinLeaveViewData.ContentValue aVar, int i, int i2) {
        int d = aVar.mo128211d();
        if (d == 1) {
            return m135019b(aVar, i2);
        }
        if (d == 2) {
            return m135014a(aVar, i2);
        }
        if (d == 3) {
            return m135021c(aVar, i2, i);
        }
        if (d == 4) {
            return m135020b(aVar, i2, i);
        }
        Log.m165383e(this.f89676e, "unknown type");
        return new C58513g(this.f89677f, aVar.mo128208a());
    }

    /* renamed from: b */
    private final C58513g m135020b(JoinLeaveViewData.ContentValue aVar, int i, int i2) {
        String str;
        C34721d dVar = new C34721d(this, aVar, i);
        if (aVar.mo128212e()) {
            str = this.f89674c + " " + UIUtils.getString(this.f89677f, R.string.Lark_Group_UnauthorizedDoc);
        } else {
            str = this.f89674c + " " + aVar.mo128208a();
        }
        C58513g gVar = new C58513g(this.f89677f, str);
        m135017a(str, gVar, R.drawable.jl_doc_icon, i2, dVar, " ");
        return gVar;
    }

    /* renamed from: a */
    private final void m135016a(JoinLeaveViewData.JoinLeaveWay bVar, TextView textView, int i) {
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        if (CollectionUtils.isEmpty(bVar.mo128214b())) {
            textView.setText(bVar.mo128213a());
        }
        C58513g gVar = new C58513g(this.f89677f, bVar.mo128213a());
        for (String str : bVar.mo128214b().keySet()) {
            String str2 = '{' + str + '}';
            int indexOf$default = StringsKt.indexOf$default((CharSequence) gVar, str2, 0, false, 6, (Object) null);
            if (!(indexOf$default == -1 || bVar.mo128214b().get(str) == null)) {
                int length = str2.length() + indexOf$default;
                JoinLeaveViewData.ContentValue aVar = bVar.mo128214b().get(str);
                if (aVar == null) {
                    Intrinsics.throwNpe();
                }
                gVar.replace(indexOf$default, length, (CharSequence) m135015a(aVar, ((int) textView.getTextSize()) + 2, i));
            }
        }
        textView.setText(gVar);
    }

    /* renamed from: a */
    private final void m135017a(String str, SpannableStringBuilder spannableStringBuilder, int i, int i2, ClickableSpan clickableSpan, String str2) {
        spannableStringBuilder.setSpan(new C34725h(this, i2, i), 0, this.f89674c.length(), 33);
        TextStyleInfo textStyleInfo = new TextStyleInfo();
        textStyleInfo.textColor = this.f89672a;
        spannableStringBuilder.setSpan(new C58514h(textStyleInfo), this.f89674c.length() + str2.length(), str.length(), 33);
        m135018a(str, spannableStringBuilder, clickableSpan);
    }
}
