package com.ss.android.lark.chatsetting.impl.group.ownership.sharing;

import android.content.Context;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.widget.linked_emojicon.C58513g;
import com.ss.android.lark.widget.linked_emojicon.C58514h;
import com.ss.android.lark.widget.span.TextStyleInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001)B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0003H\u0002J\u001e\u0010\u001f\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010 \u001a\u00020\u0007H\u0002J\u0014\u0010!\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\u0018\u0010#\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\fH\u0016J\u0018\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\fH\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryItemViewHolder;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryViewData;", "mContext", "Landroid/content/Context;", "isThread", "", "mItemClickListener", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryAdapter$IItemClickListener;", "(Landroid/content/Context;ZLcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryAdapter$IItemClickListener;)V", "AVATAR_SIZE", "", "TARGET_TEXT_COLOR", "()Z", "getMContext", "()Landroid/content/Context;", "mIsSelectable", "getMIsSelectable", "setMIsSelectable", "(Z)V", "getMItemClickListener", "()Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryAdapter$IItemClickListener;", "activateItems", "", "ids", "", "", "binderSharingTarget", "holder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "changeItemStatus", "isDeactivate", "deactivateItems", "getSelectedItems", "onBindViewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "IItemClickListener", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.e */
public final class SharingHistoryAdapter extends LarkRecyclerViewBaseAdapter<SharingHistoryItemViewHolder, SharingHistoryViewData> {

    /* renamed from: a */
    public final int f89858a;

    /* renamed from: b */
    private boolean f89859b;

    /* renamed from: c */
    private final int f89860c;

    /* renamed from: d */
    private final Context f89861d;

    /* renamed from: e */
    private final boolean f89862e;

    /* renamed from: f */
    private final IItemClickListener f89863f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryAdapter$IItemClickListener;", "", "onAvatarClick", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryViewData;", "onItemClick", "onSharingNameClick", "onSharingTargetClick", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.e$a */
    public interface IItemClickListener {
        /* renamed from: a */
        void mo128456a(View view, SharingHistoryViewData sharingHistoryViewData);

        /* renamed from: b */
        void mo128457b(View view, SharingHistoryViewData sharingHistoryViewData);

        /* renamed from: c */
        void mo128458c(View view, SharingHistoryViewData sharingHistoryViewData);

        /* renamed from: d */
        void mo128459d(View view, SharingHistoryViewData sharingHistoryViewData);
    }

    /* renamed from: b */
    public final IItemClickListener mo128454b() {
        return this.f89863f;
    }

    /* renamed from: a */
    public final List<String> mo128450a() {
        ArrayList arrayList = new ArrayList();
        List<SharingHistoryViewData> items = getItems();
        if (CollectionUtils.isEmpty(items)) {
            return arrayList;
        }
        for (SharingHistoryViewData sharingHistoryViewData : items) {
            if (sharingHistoryViewData.mo128406b()) {
                arrayList.add(sharingHistoryViewData.mo128403a());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo128453a(boolean z) {
        this.f89859b = z;
    }

    /* renamed from: a */
    public final void mo128452a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "ids");
        m135277a(list, true);
    }

    /* renamed from: b */
    public final void mo128455b(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "ids");
        m135277a(list, false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryAdapter$binderSharingTarget$spannableStringBuilderAllVer$clickableSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.e$b */
    public static final class C34792b extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ SharingHistoryAdapter f89864a;

        /* renamed from: b */
        final /* synthetic */ SharingHistoryViewData f89865b;

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "widget");
            this.f89864a.mo128454b().mo128459d(view, this.f89865b);
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f89864a.f89858a);
            textPaint.setUnderlineText(false);
        }

        C34792b(SharingHistoryAdapter eVar, SharingHistoryViewData sharingHistoryViewData) {
            this.f89864a = eVar;
            this.f89865b = sharingHistoryViewData;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryAdapter$binderSharingTarget$spannableStringBuilderAllVer$clickableSpan$2", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.e$c */
    public static final class C34793c extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ SharingHistoryAdapter f89866a;

        /* renamed from: b */
        final /* synthetic */ SharingHistoryViewData f89867b;

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "widget");
            this.f89866a.mo128454b().mo128459d(view, this.f89867b);
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f89866a.f89858a);
            textPaint.setUnderlineText(false);
        }

        C34793c(SharingHistoryAdapter eVar, SharingHistoryViewData sharingHistoryViewData) {
            this.f89866a = eVar;
            this.f89867b = sharingHistoryViewData;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryAdapter$binderSharingTarget$spannableStringBuilderAllVer$clickableSpan$3", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.e$d */
    public static final class C34794d extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ SharingHistoryAdapter f89868a;

        /* renamed from: b */
        final /* synthetic */ SharingHistoryViewData f89869b;

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "widget");
            this.f89868a.mo128454b().mo128459d(view, this.f89869b);
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f89868a.f89858a);
            textPaint.setUnderlineText(false);
        }

        C34794d(SharingHistoryAdapter eVar, SharingHistoryViewData sharingHistoryViewData) {
            this.f89868a = eVar;
            this.f89869b = sharingHistoryViewData;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.e$f */
    public static final class View$OnClickListenerC34796f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SharingHistoryAdapter f89873a;

        /* renamed from: b */
        final /* synthetic */ SharingHistoryViewData f89874b;

        View$OnClickListenerC34796f(SharingHistoryAdapter eVar, SharingHistoryViewData sharingHistoryViewData) {
            this.f89873a = eVar;
            this.f89874b = sharingHistoryViewData;
        }

        public final void onClick(View view) {
            IItemClickListener b = this.f89873a.mo128454b();
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            SharingHistoryViewData sharingHistoryViewData = this.f89874b;
            Intrinsics.checkExpressionValueIsNotNull(sharingHistoryViewData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            b.mo128457b(view, sharingHistoryViewData);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.e$g */
    public static final class View$OnClickListenerC34797g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SharingHistoryAdapter f89875a;

        /* renamed from: b */
        final /* synthetic */ SharingHistoryViewData f89876b;

        View$OnClickListenerC34797g(SharingHistoryAdapter eVar, SharingHistoryViewData sharingHistoryViewData) {
            this.f89875a = eVar;
            this.f89876b = sharingHistoryViewData;
        }

        public final void onClick(View view) {
            IItemClickListener b = this.f89875a.mo128454b();
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            SharingHistoryViewData sharingHistoryViewData = this.f89876b;
            Intrinsics.checkExpressionValueIsNotNull(sharingHistoryViewData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            b.mo128458c(view, sharingHistoryViewData);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.e$e */
    public static final class View$OnClickListenerC34795e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SharingHistoryAdapter f89870a;

        /* renamed from: b */
        final /* synthetic */ SharingHistoryViewData f89871b;

        /* renamed from: c */
        final /* synthetic */ int f89872c;

        View$OnClickListenerC34795e(SharingHistoryAdapter eVar, SharingHistoryViewData sharingHistoryViewData, int i) {
            this.f89870a = eVar;
            this.f89871b = sharingHistoryViewData;
            this.f89872c = i;
        }

        public final void onClick(View view) {
            SharingHistoryViewData sharingHistoryViewData = this.f89871b;
            sharingHistoryViewData.mo128404a(!sharingHistoryViewData.mo128406b());
            this.f89870a.notifyItemChanged(this.f89872c);
            IItemClickListener b = this.f89870a.mo128454b();
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            SharingHistoryViewData sharingHistoryViewData2 = this.f89871b;
            Intrinsics.checkExpressionValueIsNotNull(sharingHistoryViewData2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            b.mo128456a(view, sharingHistoryViewData2);
        }
    }

    /* renamed from: a */
    public SharingHistoryItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f89861d).inflate(R.layout.sharing_history_item_layout, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(mCon…em_layout, parent, false)");
        return new SharingHistoryItemViewHolder(inflate);
    }

    /* renamed from: a */
    private final void m135277a(List<String> list, boolean z) {
        if (!list.isEmpty()) {
            List<SharingHistoryViewData> items = getItems();
            if (!CollectionUtils.isEmpty(items)) {
                for (SharingHistoryViewData sharingHistoryViewData : items) {
                    if (list.contains(sharingHistoryViewData.mo128403a())) {
                        if (z) {
                            sharingHistoryViewData.mo128404a(false);
                        }
                        sharingHistoryViewData.mo128405b(z);
                    }
                }
                notifyDataSetChanged();
            }
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(SharingHistoryItemViewHolder hVar, int i) {
        int i2;
        String str;
        String str2;
        String str3;
        Intrinsics.checkParameterIsNotNull(hVar, "holder");
        SharingHistoryViewData sharingHistoryViewData = (SharingHistoryViewData) getItem(i);
        if (this.f89859b && !sharingHistoryViewData.mo128411f()) {
            hVar.itemView.setOnClickListener(new View$OnClickListenerC34795e(this, sharingHistoryViewData, i));
        }
        UDCheckBox a = hVar.mo128476a();
        if (this.f89859b) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        a.setVisibility(i2);
        hVar.mo128476a().setClickable(false);
        if (sharingHistoryViewData.mo128411f()) {
            hVar.mo128476a().setChecked(true);
            hVar.mo128476a().setEnabled(false);
            TextView g = hVar.mo128482g();
            Intrinsics.checkExpressionValueIsNotNull(g, "holder.deactivatedTv");
            g.setVisibility(0);
        } else {
            hVar.mo128476a().setEnabled(true);
            hVar.mo128476a().setChecked(sharingHistoryViewData.mo128406b());
            TextView g2 = hVar.mo128482g();
            Intrinsics.checkExpressionValueIsNotNull(g2, "holder.deactivatedTv");
            g2.setVisibility(8);
        }
        hVar.mo128477b().setVisibility(0);
        AbstractC34461c a2 = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "ChatSettingModule.getDependency()");
        AbstractC34461c.AbstractC34474m i3 = a2.mo127279i();
        Context context = this.f89861d;
        String c = sharingHistoryViewData.mo128407c();
        String e = sharingHistoryViewData.mo128409e();
        ImageView b = hVar.mo128477b();
        int i4 = this.f89860c;
        i3.mo127409a(context, c, e, b, i4, i4);
        hVar.mo128477b().setOnClickListener(new View$OnClickListenerC34796f(this, sharingHistoryViewData));
        TextView c2 = hVar.mo128478c();
        Intrinsics.checkExpressionValueIsNotNull(c2, "holder.nameTv");
        c2.setText(sharingHistoryViewData.mo128408d());
        hVar.mo128478c().setOnClickListener(new View$OnClickListenerC34797g(this, sharingHistoryViewData));
        TextView d = hVar.mo128479d();
        Intrinsics.checkExpressionValueIsNotNull(d, "holder.waysTv");
        int i5 = C34798f.f89877a[sharingHistoryViewData.mo128413h().ordinal()];
        if (i5 == 1) {
            str = UIUtils.getString(this.f89861d, R.string.Lark_Group_CreateQRCodeMobile);
        } else if (i5 == 2) {
            if (this.f89862e) {
                str2 = UIUtils.getString(this.f89861d, R.string.Lark_Groups_ShareHistoryCircleCardSharedByUser);
            } else {
                str2 = UIUtils.getString(this.f89861d, R.string.Lark_Group_ShareInvitationToChatMobile);
            }
            str = str2;
        } else if (i5 == 3) {
            if (this.f89862e) {
                str3 = UIUtils.getString(this.f89861d, R.string.Lark_Groups_ShareHistoryGeneratedCircleLink);
            } else {
                str3 = UIUtils.getString(this.f89861d, R.string.Lark_Chat_CreatedShareLink);
            }
            str = str3;
        }
        d.setText(str);
        DisplayPattern displayPattern = DisplayPattern.RELATIVE;
        LengthType lengthType = LengthType.LONG;
        AbstractC34461c a3 = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "ChatSettingModule.getDependency()");
        Options aVar = new Options(null, displayPattern, lengthType, null, TimePreciseness.MINUTE, false, !a3.mo127257B(), false, false, 425, null);
        TextView f = hVar.mo128481f();
        Intrinsics.checkExpressionValueIsNotNull(f, "holder.timeTv");
        f.setText(TimeFormatUtils.m219292g(this.f89861d, new Date(sharingHistoryViewData.mo128412g()), aVar));
        Intrinsics.checkExpressionValueIsNotNull(sharingHistoryViewData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        m135276a(hVar, sharingHistoryViewData);
    }

    /* renamed from: a */
    private final void m135276a(SharingHistoryItemViewHolder hVar, SharingHistoryViewData sharingHistoryViewData) {
        int i;
        C58513g gVar;
        String str;
        if (sharingHistoryViewData.mo128415i() == null) {
            TextView e = hVar.mo128480e();
            Intrinsics.checkExpressionValueIsNotNull(e, "holder.targetTv");
            e.setVisibility(8);
            return;
        }
        TextView e2 = hVar.mo128480e();
        Intrinsics.checkExpressionValueIsNotNull(e2, "holder.targetTv");
        e2.setVisibility(0);
        TextView e3 = hVar.mo128480e();
        Intrinsics.checkExpressionValueIsNotNull(e3, "holder.targetTv");
        ViewGroup.LayoutParams layoutParams = e3.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (this.f89859b) {
                i = UIUtils.dp2px(this.f89861d, 16.0f);
            } else {
                i = UIUtils.dp2px(this.f89861d, 50.0f);
            }
            layoutParams2.setMarginEnd(i);
            TextView e4 = hVar.mo128480e();
            Intrinsics.checkExpressionValueIsNotNull(e4, "holder.targetTv");
            e4.setLayoutParams(layoutParams2);
            SharingTarget i2 = sharingHistoryViewData.mo128415i();
            if (i2 instanceof ChatTarget) {
                ImageView h = hVar.mo128483h();
                Intrinsics.checkExpressionValueIsNotNull(h, "holder.docIcon");
                h.setVisibility(8);
                TextView e5 = hVar.mo128480e();
                Intrinsics.checkExpressionValueIsNotNull(e5, "holder.targetTv");
                ViewGroup.LayoutParams layoutParams3 = e5.getLayoutParams();
                if (layoutParams3 != null) {
                    ((LinearLayout.LayoutParams) layoutParams3).setMarginStart(C57582a.m223601a(this.f89861d, (float) BitmapDescriptorFactory.HUE_RED));
                    gVar = new C58513g(this.f89861d, sharingHistoryViewData.mo128415i().mo128501d());
                    C34792b bVar = new C34792b(this, sharingHistoryViewData);
                    TextStyleInfo textStyleInfo = new TextStyleInfo();
                    textStyleInfo.textColor = this.f89858a;
                    gVar.setSpan(new C58514h(textStyleInfo), 0, sharingHistoryViewData.mo128415i().mo128501d().length(), 33);
                    gVar.setSpan(bVar, 0, sharingHistoryViewData.mo128415i().mo128501d().length(), 33);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
            } else if (i2 instanceof ChatterTarget) {
                ImageView h2 = hVar.mo128483h();
                Intrinsics.checkExpressionValueIsNotNull(h2, "holder.docIcon");
                h2.setVisibility(8);
                TextView e6 = hVar.mo128480e();
                Intrinsics.checkExpressionValueIsNotNull(e6, "holder.targetTv");
                ViewGroup.LayoutParams layoutParams4 = e6.getLayoutParams();
                if (layoutParams4 != null) {
                    ((LinearLayout.LayoutParams) layoutParams4).setMarginStart(C57582a.m223601a(this.f89861d, (float) BitmapDescriptorFactory.HUE_RED));
                    gVar = new C58513g(this.f89861d, sharingHistoryViewData.mo128415i().mo128501d());
                    gVar.setSpan(new C34793c(this, sharingHistoryViewData), 0, sharingHistoryViewData.mo128415i().mo128501d().length(), 33);
                    TextStyleInfo textStyleInfo2 = new TextStyleInfo();
                    textStyleInfo2.textColor = this.f89858a;
                    gVar.setSpan(new C58514h(textStyleInfo2), 0, sharingHistoryViewData.mo128415i().mo128501d().length(), 33);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
            } else if (i2 instanceof DocTarget) {
                ImageView h3 = hVar.mo128483h();
                Intrinsics.checkExpressionValueIsNotNull(h3, "holder.docIcon");
                h3.setVisibility(0);
                TextView e7 = hVar.mo128480e();
                Intrinsics.checkExpressionValueIsNotNull(e7, "holder.targetTv");
                ViewGroup.LayoutParams layoutParams5 = e7.getLayoutParams();
                if (layoutParams5 != null) {
                    ((LinearLayout.LayoutParams) layoutParams5).setMarginStart(C57582a.m223601a(this.f89861d, 5.0f));
                    ImageView h4 = hVar.mo128483h();
                    AbstractC34461c a = ChatSettingModule.m133639a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
                    h4.setImageResource(a.mo127258C().mo127384a(((DocTarget) sharingHistoryViewData.mo128415i()).mo128424b()));
                    if (((DocTarget) sharingHistoryViewData.mo128415i()).mo128425c()) {
                        str = UIUtils.getString(this.f89861d, R.string.Lark_Group_UnauthorizedDoc);
                    } else {
                        str = sharingHistoryViewData.mo128415i().mo128501d();
                    }
                    C58513g gVar2 = new C58513g(this.f89861d, str);
                    TextStyleInfo textStyleInfo3 = new TextStyleInfo();
                    textStyleInfo3.textColor = this.f89858a;
                    gVar2.setSpan(new C58514h(textStyleInfo3), 0, str.length(), 33);
                    gVar2.setSpan(new C34794d(this, sharingHistoryViewData), 0, str.length(), 33);
                    gVar = gVar2;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
            } else {
                gVar = new C58513g(this.f89861d, "");
            }
            TextView e8 = hVar.mo128480e();
            Intrinsics.checkExpressionValueIsNotNull(e8, "holder.targetTv");
            e8.setMovementMethod(LinkMovementMethod.getInstance());
            TextView e9 = hVar.mo128480e();
            Intrinsics.checkExpressionValueIsNotNull(e9, "holder.targetTv");
            e9.setText(gVar);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    public SharingHistoryAdapter(Context context, boolean z, IItemClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(aVar, "mItemClickListener");
        this.f89861d = context;
        this.f89862e = z;
        this.f89863f = aVar;
        this.f89860c = UIUtils.dp2px(context, 40.0f);
        this.f89858a = UIUtils.getColor(context, R.color.function_info_500);
    }
}
