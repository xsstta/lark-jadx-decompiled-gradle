package com.ss.android.lark.invitation.v2.feat.external.contact.v2.invite;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.contact.v1.SendUserInvitationResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.entity.mobile.ContactMobileBean;
import com.ss.android.lark.inv.export.ui.EmptyGoneTextView;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.external.bean.C40219a;
import com.ss.android.lark.invitation.v2.feat.external.common.InviteExternalService;
import com.ss.android.lark.invitation.v2.feat.external.p2054a.C40205c;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.thirdshare.base.export.p2741c.AbstractC55713a;
import com.ss.android.lark.thirdshare.base.export.p2741c.C55719c;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57832h;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001cB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0019\u001a\u00020\rH\u0002J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u001b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/contact/v2/invite/InviteExternalContactInviteItem;", "Lcom/ss/android/lark/thirdshare/base/export/item/BaseItem;", "()V", "bean", "Lcom/ss/android/lark/contact/entity/mobile/ContactMobileBean;", "(Lcom/ss/android/lark/contact/entity/mobile/ContactMobileBean;)V", "actionTv", "Landroid/widget/TextView;", "drawerDialog", "Lcom/ss/android/lark/invitation/v2/feat/external/common/InviteExternalSearchNothingDrawerDialog;", "isInvited", "", "bind", "", "holder", "Lcom/ss/android/lark/thirdshare/base/export/item/ItemViewHolder;", "position", "", "getInviteMsgAndShowDrawer", "context", "Landroid/content/Context;", "invitePeopleH5Share", "contact", "", "onViewRecycled", "setActionBtn", "showDrawer", "updateInvited", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.a.b */
public final class InviteExternalContactInviteItem extends AbstractC55713a<InviteExternalContactInviteItem> {

    /* renamed from: c */
    public static String f102247c;

    /* renamed from: d */
    public static String f102248d;

    /* renamed from: e */
    public static final Companion f102249e = new Companion(null);

    /* renamed from: a */
    public boolean f102250a;

    /* renamed from: b */
    public C40205c f102251b;

    /* renamed from: f */
    private ContactMobileBean f102252f;

    /* renamed from: g */
    private TextView f102253g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\rJ\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\u0006\u0010\u0011\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/contact/v2/invite/InviteExternalContactInviteItem$Companion;", "", "()V", "inviteMsg", "", "getInviteMsg", "()Ljava/lang/String;", "setInviteMsg", "(Ljava/lang/String;)V", "uniqueId", "getUniqueId", "setUniqueId", "getItems", "", "Lcom/ss/android/lark/invitation/v2/feat/external/contact/v2/invite/InviteExternalContactInviteItem;", "beans", "Lcom/ss/android/lark/contact/entity/mobile/ContactMobileBean;", "filterKey", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo145976a() {
            String str = InviteExternalContactInviteItem.f102247c;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inviteMsg");
            }
            return str;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo145979a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            InviteExternalContactInviteItem.f102247c = str;
        }

        /* renamed from: b */
        public final void mo145980b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            InviteExternalContactInviteItem.f102248d = str;
        }

        /* renamed from: a */
        public final List<InviteExternalContactInviteItem> mo145977a(List<? extends ContactMobileBean> list) {
            Intrinsics.checkParameterIsNotNull(list, "beans");
            if (list.isEmpty()) {
                return CollectionsKt.listOf(new InviteExternalContactInviteItem());
            }
            List<? extends ContactMobileBean> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new InviteExternalContactInviteItem(it.next()));
            }
            return arrayList;
        }

        /* renamed from: a */
        public final List<InviteExternalContactInviteItem> mo145978a(List<? extends ContactMobileBean> list, String str) {
            Intrinsics.checkParameterIsNotNull(list, "beans");
            Intrinsics.checkParameterIsNotNull(str, "filterKey");
            if (TextUtils.isEmpty(str)) {
                return mo145977a(list);
            }
            Companion aVar = this;
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (t.isMatch(str)) {
                    arrayList.add(t);
                }
            }
            return aVar.mo145977a(arrayList);
        }
    }

    public InviteExternalContactInviteItem() {
        super(R.layout.inv_invite_external_contact_v2_empty_view);
    }

    /* renamed from: a */
    private final void m159497a() {
        if (this.f102250a) {
            TextView textView = this.f102253g;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("actionTv");
            }
            textView.setBackgroundColor(0);
            TextView textView2 = this.f102253g;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("actionTv");
            }
            textView2.setTextColor(UIHelper.getColor(R.color.text_placeholder));
            TextView textView3 = this.f102253g;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("actionTv");
            }
            textView3.setText(R.string.Lark_NewContacts_MobileContactsInviteToLarkInvited);
            return;
        }
        TextView textView4 = this.f102253g;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionTv");
        }
        textView4.setBackgroundResource(R.drawable.inv_invite_btn_bg_enable);
        TextView textView5 = this.f102253g;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionTv");
        }
        textView5.setTextColor(UIHelper.getColor(R.color.static_white));
        TextView textView6 = this.f102253g;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionTv");
        }
        textView6.setText(R.string.Lark_NewContacts_MobileContactsInviteToLarkButton);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "consume", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.a.b$e */
    public static final class C40248e<T> implements ApiUtils.AbstractC57748a<Boolean> {

        /* renamed from: a */
        public static final C40248e f102263a = new C40248e();

        C40248e() {
        }

        /* renamed from: a */
        public final void consume(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            InvHitPoint.m160377d(bool.booleanValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteExternalContactInviteItem(ContactMobileBean contactMobileBean) {
        super(R.layout.inv_invite_external_contact_v2_invite_item_view);
        Intrinsics.checkParameterIsNotNull(contactMobileBean, "bean");
        this.f102252f = contactMobileBean;
    }

    /* renamed from: a */
    public final void mo145972a(Context context) {
        InviteExternalService.f102179a.mo145894a(context, new C40245c(this, context));
    }

    /* renamed from: a */
    public final void mo145974a(boolean z) {
        this.f102250a = z;
        if (this.f137416h) {
            m159497a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/invitation/v2/feat/external/contact/v2/invite/InviteExternalContactInviteItem$bind$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.a.b$b */
    static final class View$OnClickListenerC40244b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View f102254a;

        /* renamed from: b */
        final /* synthetic */ InviteExternalContactInviteItem f102255b;

        /* renamed from: c */
        final /* synthetic */ int f102256c;

        View$OnClickListenerC40244b(View view, InviteExternalContactInviteItem bVar, int i) {
            this.f102254a = view;
            this.f102255b = bVar;
            this.f102256c = i;
        }

        public final void onClick(View view) {
            if (!this.f102255b.f102250a) {
                InvHitPoint.m160404r();
                if (TextUtils.isEmpty(InviteExternalContactInviteItem.f102249e.mo145976a())) {
                    InviteExternalContactInviteItem bVar = this.f102255b;
                    Context context = this.f102254a.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "context");
                    bVar.mo145972a(context);
                    return;
                }
                InviteExternalContactInviteItem bVar2 = this.f102255b;
                Context context2 = this.f102254a.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                bVar2.mo145975b(context2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/invitation/v2/feat/external/bean/InvitationInfoGroup;", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.a.b$c */
    public static final class C40245c<T> implements ApiUtils.AbstractC57748a<C40219a> {

        /* renamed from: a */
        final /* synthetic */ InviteExternalContactInviteItem f102257a;

        /* renamed from: b */
        final /* synthetic */ Context f102258b;

        C40245c(InviteExternalContactInviteItem bVar, Context context) {
            this.f102257a = bVar;
            this.f102258b = context;
        }

        /* renamed from: a */
        public final void consume(C40219a aVar) {
            if (aVar == null) {
                ViewUtils.m224144a();
            } else if (aVar.f102188a != null) {
                ErrorResult errorResult = aVar.f102188a;
                Intrinsics.checkExpressionValueIsNotNull(errorResult, "it.errorResult");
                ViewUtils.m224150a(errorResult.getDisplayMsg());
            } else {
                Companion aVar2 = InviteExternalContactInviteItem.f102249e;
                String b = aVar.mo145912b();
                Intrinsics.checkExpressionValueIsNotNull(b, "it.linkInviteMsg");
                aVar2.mo145979a(b);
                Companion aVar3 = InviteExternalContactInviteItem.f102249e;
                String c = aVar.mo145914c();
                Intrinsics.checkExpressionValueIsNotNull(c, "it.linkUniqueId");
                aVar3.mo145980b(c);
                this.f102257a.mo145975b(this.f102258b);
            }
        }
    }

    /* renamed from: a */
    public final void mo145973a(String str) {
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "@", false, 2, (Object) null)) {
            String str2 = f102248d;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("uniqueId");
            }
            InvHitPoint.m160358a("link", "invite_email", str2);
            return;
        }
        String str3 = f102248d;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uniqueId");
        }
        InvHitPoint.m160358a("link", "invite_message", str3);
    }

    /* renamed from: b */
    public final void mo145975b(Context context) {
        ContactMobileBean contactMobileBean = this.f102252f;
        if (contactMobileBean == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bean");
        }
        String emailOrPhoneE164 = contactMobileBean.getEmailOrPhoneE164();
        String str = f102247c;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inviteMsg");
        }
        this.f102251b = (C40205c) new C40205c(context, emailOrPhoneE164, str, new C40246d(this, context), C40248e.f102263a).mo197765f();
    }

    @Override // com.ss.android.lark.thirdshare.base.export.p2741c.AbstractC55713a
    /* renamed from: b */
    public void mo130633b(C55719c cVar, int i) {
        Intrinsics.checkParameterIsNotNull(cVar, "holder");
        super.mo130633b(cVar, i);
        ContactMobileBean contactMobileBean = this.f102252f;
        if (contactMobileBean == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bean");
        }
        View view = cVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        View view2 = cVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
        contactMobileBean.cancelLoadAvatar((TextView) view.findViewById(R.id.ieciiAvatarTv), (LKUIRoundedImageView) view2.findViewById(R.id.ieciiAvatarIv));
    }

    @Override // com.ss.android.lark.thirdshare.base.export.p2741c.AbstractC55713a
    /* renamed from: a */
    public void mo130630a(C55719c cVar, int i) {
        int i2;
        Intrinsics.checkParameterIsNotNull(cVar, "holder");
        if (!mo189847c(R.layout.inv_invite_external_contact_v2_empty_view)) {
            View view = cVar.itemView;
            TextView textView = (TextView) view.findViewById(R.id.ieciiActionTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "ieciiActionTv");
            this.f102253g = textView;
            Intrinsics.checkExpressionValueIsNotNull(view, "this");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                if (i == 0) {
                    i2 = UIHelper.dp2px(8.0f);
                } else {
                    i2 = 0;
                }
                layoutParams2.topMargin = i2;
                view.setLayoutParams(layoutParams2);
                ContactMobileBean contactMobileBean = this.f102252f;
                if (contactMobileBean == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bean");
                }
                contactMobileBean.loadAvatar((TextView) view.findViewById(R.id.ieciiAvatarTv), (LKUIRoundedImageView) view.findViewById(R.id.ieciiAvatarIv));
                TextView textView2 = (TextView) view.findViewById(R.id.ieciiUsernameTv);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "ieciiUsernameTv");
                ContactMobileBean contactMobileBean2 = this.f102252f;
                if (contactMobileBean2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bean");
                }
                textView2.setText(contactMobileBean2.getName());
                EmptyGoneTextView emptyGoneTextView = (EmptyGoneTextView) view.findViewById(R.id.ieciiCpTv);
                Intrinsics.checkExpressionValueIsNotNull(emptyGoneTextView, "ieciiCpTv");
                ContactMobileBean contactMobileBean3 = this.f102252f;
                if (contactMobileBean3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bean");
                }
                emptyGoneTextView.setText(contactMobileBean3.getEmailOrPhone());
                m159497a();
                C57832h.m224486a(view);
                view.setOnClickListener(new View$OnClickListenerC40244b(view, this, i));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "contact", "", "kotlin.jvm.PlatformType", "isSms", "", "isChangedData", "onClickSend"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.a.b$d */
    public static final class C40246d implements C40205c.AbstractC40215a {

        /* renamed from: a */
        final /* synthetic */ InviteExternalContactInviteItem f102259a;

        /* renamed from: b */
        final /* synthetic */ Context f102260b;

        C40246d(InviteExternalContactInviteItem bVar, Context context) {
            this.f102259a = bVar;
            this.f102260b = context;
        }

        @Override // com.ss.android.lark.invitation.v2.feat.external.p2054a.C40205c.AbstractC40215a
        /* renamed from: a */
        public final void mo145893a(String str, boolean z, boolean z2) {
            final ViewUtils.C57751a c = ViewUtils.m224154c(this.f102260b);
            c.mo196039b();
            InvHitPoint.m160373c(z2);
            InviteExternalContactInviteItem bVar = this.f102259a;
            Intrinsics.checkExpressionValueIsNotNull(str, "contact");
            bVar.mo145973a(str);
            C40147z.m159162b().sendContent(str, z, new UIGetDataCallback(new IGetDataCallback<SendUserInvitationResponse>(this) {
                /* class com.ss.android.lark.invitation.v2.feat.external.contact.v2.invite.InviteExternalContactInviteItem.C40246d.C402471 */

                /* renamed from: a */
                final /* synthetic */ C40246d f102261a;

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Intrinsics.checkParameterIsNotNull(errorResult, "err");
                    c.mo196042e();
                    ViewUtils.m224150a(errorResult.getDisplayMsg());
                    C53241h.m205894a("InvitationModule", errorResult.getDebugMsg());
                }

                /* renamed from: a */
                public void onSuccess(SendUserInvitationResponse sendUserInvitationResponse) {
                    Intrinsics.checkParameterIsNotNull(sendUserInvitationResponse, "response");
                    c.mo196042e();
                    if (!sendUserInvitationResponse.success.booleanValue()) {
                        ViewUtils.m224144a();
                        return;
                    }
                    ViewUtils.m224150a(UIHelper.getString(R.string.Lark_UserGrowth_InviteTenantToastSent));
                    this.f102261a.f102259a.mo145974a(true);
                    C40205c cVar = this.f102261a.f102259a.f102251b;
                    if (cVar != null) {
                        cVar.mo197766g();
                    }
                }

                {
                    this.f102261a = r1;
                }
            }));
        }
    }
}
