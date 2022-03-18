package com.ss.android.lark.chatsetting.impl.group.ownership.applicant;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.chat.entity.chat.AddChatChatterApply;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.DuplicateEnterChecker;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001%B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\nH\u0016J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\nH\u0016J(\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0016H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006&"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantViewHolder;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantViewData;", "mContext", "Landroid/content/Context;", "itemClickListener", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListAdapter$ItemClickListener;", "(Landroid/content/Context;Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListAdapter$ItemClickListener;)V", "AVATAR_SIZE", "", "checker", "Lcom/ss/android/lark/widget/listener/DuplicateEnterChecker;", "getItemClickListener", "()Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListAdapter$ItemClickListener;", "getMContext", "()Landroid/content/Context;", "getJoinWayText", "Landroid/text/SpannableString;", "way", "Lcom/ss/android/lark/chat/entity/chat/AddChatChatterApply$Ways;", "inviterName", "", "inviterId", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setSpan", "sb", "inviteeIndex", "inviteeName", "id", "ItemClickListener", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.a */
public final class ApplicantListAdapter extends LarkRecyclerViewBaseAdapter<ApplicantViewHolder, ApplicantViewData> {

    /* renamed from: a */
    public final DuplicateEnterChecker f89543a = new DuplicateEnterChecker();

    /* renamed from: b */
    private final int f89544b;

    /* renamed from: c */
    private final Context f89545c;

    /* renamed from: d */
    private final ItemClickListener f89546d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListAdapter$ItemClickListener;", "", "onCloseBtnClick", "", "position", "", "id", "", "onDoneBtnClick", "onUserClick", BottomDialog.f17198f, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.a$a */
    public interface ItemClickListener {
        /* renamed from: a */
        void mo128085a(int i, String str);

        /* renamed from: a */
        void mo128086a(String str);

        /* renamed from: b */
        void mo128087b(int i, String str);
    }

    /* renamed from: a */
    public final Context mo128081a() {
        return this.f89545c;
    }

    /* renamed from: b */
    public final ItemClickListener mo128084b() {
        return this.f89546d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListAdapter$onBindViewHolder$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.a$b */
    public static final class C34685b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ApplicantListAdapter f89547a;

        /* renamed from: b */
        final /* synthetic */ ApplicantViewData f89548b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f89547a.mo128084b().mo128086a(this.f89548b.mo128132c());
        }

        C34685b(ApplicantListAdapter aVar, ApplicantViewData gVar) {
            this.f89547a = aVar;
            this.f89548b = gVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListAdapter$onBindViewHolder$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.a$c */
    public static final class C34686c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ApplicantListAdapter f89549a;

        /* renamed from: b */
        final /* synthetic */ ApplicantViewData f89550b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f89549a.mo128084b().mo128086a(this.f89550b.mo128132c());
        }

        C34686c(ApplicantListAdapter aVar, ApplicantViewData gVar) {
            this.f89549a = aVar;
            this.f89550b = gVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.a$d */
    public static final class View$OnClickListenerC34687d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ApplicantListAdapter f89551a;

        /* renamed from: b */
        final /* synthetic */ ApplicantViewData f89552b;

        View$OnClickListenerC34687d(ApplicantListAdapter aVar, ApplicantViewData gVar) {
            this.f89551a = aVar;
            this.f89552b = gVar;
        }

        public final void onClick(View view) {
            this.f89551a.mo128084b().mo128085a(this.f89551a.getIndex(this.f89552b), this.f89552b.mo128132c());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.a$e */
    public static final class View$OnClickListenerC34688e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ApplicantListAdapter f89553a;

        /* renamed from: b */
        final /* synthetic */ ApplicantViewData f89554b;

        View$OnClickListenerC34688e(ApplicantListAdapter aVar, ApplicantViewData gVar) {
            this.f89553a = aVar;
            this.f89554b = gVar;
        }

        public final void onClick(View view) {
            this.f89553a.mo128084b().mo128087b(this.f89553a.getIndex(this.f89554b), this.f89554b.mo128132c());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListAdapter$setSpan$clickSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.a$f */
    public static final class C34689f extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ ApplicantListAdapter f89555a;

        /* renamed from: b */
        final /* synthetic */ String f89556b;

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "widget");
            if (!this.f89555a.f89543a.mo198450a()) {
                this.f89555a.mo128084b().mo128086a(this.f89556b);
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "ds");
            textPaint.setColor(UIUtils.getColor(this.f89555a.mo128081a(), R.color.function_info_500));
        }

        C34689f(ApplicantListAdapter aVar, String str) {
            this.f89555a = aVar;
            this.f89556b = str;
        }
    }

    public ApplicantListAdapter(Context context, ItemClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(aVar, "itemClickListener");
        this.f89545c = context;
        this.f89546d = aVar;
        this.f89544b = UIUtils.dp2px(context, 48.0f);
    }

    /* renamed from: a */
    public ApplicantViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f89545c).inflate(R.layout.applicant_item_layout, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(mCon…em_layout, parent, false)");
        ApplicantViewHolder hVar = new ApplicantViewHolder(inflate);
        DesktopUtil.m144299a(hVar.mo128141b());
        DesktopUtil.m144306b(hVar.mo128142c(), hVar.mo128145f());
        return hVar;
    }

    /* renamed from: a */
    public void onBindViewHolder(ApplicantViewHolder hVar, int i) {
        Intrinsics.checkParameterIsNotNull(hVar, "holder");
        ApplicantViewData gVar = (ApplicantViewData) getItem(i);
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        int i2 = this.f89544b;
        a.mo127279i().mo127409a(this.f89545c, gVar.mo128131b(), gVar.mo128132c(), hVar.mo128140a(), i2, i2);
        hVar.mo128140a().setOnClickListener(new C34685b(this, gVar));
        hVar.mo128141b().setText(gVar.mo128130a());
        hVar.mo128141b().setOnClickListener(new C34686c(this, gVar));
        AddChatChatterApply.Ways d = gVar.mo128133d();
        String f = gVar.mo128136f();
        if (f == null) {
            f = "";
        }
        hVar.mo128142c().setText(m134825a(d, f, gVar.mo128134e()));
        hVar.mo128142c().setMovementMethod(LinkMovementMethod.getInstance());
        hVar.mo128144e().setOnClickListener(new View$OnClickListenerC34687d(this, gVar));
        hVar.mo128143d().setOnClickListener(new View$OnClickListenerC34688e(this, gVar));
        if (TextUtils.isEmpty(gVar.mo128137g())) {
            hVar.mo128145f().setVisibility(8);
            return;
        }
        hVar.mo128145f().setVisibility(0);
        hVar.mo128145f().setText(UIHelper.mustacheFormat((int) R.string.Lark_Group_MembershipRequestAdditionalComments, MapsKt.mapOf(TuplesKt.to("content", gVar.mo128137g()))));
    }

    /* renamed from: a */
    private final SpannableString m134825a(AddChatChatterApply.Ways ways, String str, String str2) {
        switch (C34690b.f89557a[ways.ordinal()]) {
            case 1:
            case 2:
                String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Group_ApplyToJoinGroupDescription, MapsKt.mapOf(TuplesKt.to("Inviter", str)));
                String str3 = mustacheFormat;
                SpannableString spannableString = new SpannableString(str3);
                Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "s");
                int indexOf$default = StringsKt.indexOf$default((CharSequence) str3, str, 0, false, 6, (Object) null);
                if (str2 == null) {
                    str2 = "";
                }
                m134826a(spannableString, indexOf$default, str, str2);
                return spannableString;
            case 3:
                String mustacheFormat2 = UIHelper.mustacheFormat((int) R.string.Lark_Group_InviteMembersRequestDescription, MapsKt.mapOf(TuplesKt.to("Inviter", str)));
                String str4 = mustacheFormat2;
                SpannableString spannableString2 = new SpannableString(str4);
                Intrinsics.checkExpressionValueIsNotNull(mustacheFormat2, "s");
                int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str4, str, 0, false, 6, (Object) null);
                if (str2 == null) {
                    str2 = "";
                }
                m134826a(spannableString2, indexOf$default2, str, str2);
                return spannableString2;
            case 4:
                return new SpannableString(UIUtils.getString(this.f89545c, R.string.Lark_Group_JoinPublicGroupBySearch));
            case 5:
                return new SpannableString(UIUtils.getString(this.f89545c, R.string.Lark_Group_ApplyToJoinGroupGeneral));
            case 6:
                String mustacheFormat3 = UIHelper.mustacheFormat((int) R.string.Lark_Chat_JoinApplicationThroughLink, MapsKt.mapOf(TuplesKt.to("user_name", str)));
                String str5 = mustacheFormat3;
                SpannableString spannableString3 = new SpannableString(str5);
                Intrinsics.checkExpressionValueIsNotNull(mustacheFormat3, "s");
                int indexOf$default3 = StringsKt.indexOf$default((CharSequence) str5, str, 0, false, 6, (Object) null);
                if (str2 == null) {
                    str2 = "";
                }
                m134826a(spannableString3, indexOf$default3, str, str2);
                return spannableString3;
            default:
                return new SpannableString("");
        }
    }

    /* renamed from: a */
    private final void m134826a(SpannableString spannableString, int i, String str, String str2) {
        spannableString.setSpan(new C34689f(this, str2), i, str.length() + i, 33);
    }
}
