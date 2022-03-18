package com.ss.android.lark.invitation.v2.feat.external.contact.v2.using;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.basic.v1.UserInfo;
import com.bytedance.lark.pb.contact.v2.UserContactStatus;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.contact.entity.mobile.ContactMobileBean;
import com.ss.android.lark.contact.entity.mobile.ContactPointUserInfoBean;
import com.ss.android.lark.contact.entity.mobile.ContactsMobileFeishuInfo;
import com.ss.android.lark.contact.entity.mobile.util.C35409a;
import com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency;
import com.ss.android.lark.inv.export.ui.EmptyGoneTextView;
import com.ss.android.lark.inv.export.util.C40125p;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.thirdshare.base.export.p2741c.AbstractC55713a;
import com.ss.android.lark.thirdshare.base.export.p2741c.C55718b;
import com.ss.android.lark.thirdshare.base.export.p2741c.C55719c;
import com.ss.android.lark.utils.C57832h;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.android.lark.utils.aj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0013\u0014B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0017R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/contact/v2/using/InviteExternalContactUsingItem;", "Lcom/ss/android/lark/thirdshare/base/export/item/BaseItem;", "()V", "cpFeishuUsers", "Lcom/ss/android/lark/contact/entity/mobile/ContactsMobileFeishuInfo$CpFeishuUsers;", "sourceFragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "filterKey", "", "(Lcom/ss/android/lark/contact/entity/mobile/ContactsMobileFeishuInfo$CpFeishuUsers;Lcom/ss/android/lark/base/fragment/BaseFragment;Ljava/lang/String;)V", "baseItemAdapter", "Lcom/ss/android/lark/thirdshare/base/export/item/BaseItemAdapter;", "Lcom/ss/android/lark/invitation/v2/feat/external/contact/v2/using/InviteExternalContactUsingItem$InviteExternalContactUsingItemUserItem;", "bind", "", "holder", "Lcom/ss/android/lark/thirdshare/base/export/item/ItemViewHolder;", "position", "", "Companion", "InviteExternalContactUsingItemUserItem", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.b.b */
public final class InviteExternalContactUsingItem extends AbstractC55713a<InviteExternalContactUsingItem> {

    /* renamed from: c */
    public static final Companion f102272c = new Companion(null);

    /* renamed from: a */
    public ContactsMobileFeishuInfo.CpFeishuUsers f102273a;

    /* renamed from: b */
    public final C55718b<InviteExternalContactUsingItemUserItem> f102274b = new C55718b<>();

    /* renamed from: d */
    private String f102275d;

    /* renamed from: e */
    private BaseFragment f102276e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\b\u0010\u0017\u001a\u00020\fH\u0002J\u000e\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/contact/v2/using/InviteExternalContactUsingItem$InviteExternalContactUsingItemUserItem;", "Lcom/ss/android/lark/thirdshare/base/export/item/BaseItem;", "cpIndex", "", "cpUserInfo", "Lcom/ss/android/lark/contact/entity/mobile/ContactPointUserInfoBean;", "sourceFragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "(ILcom/ss/android/lark/contact/entity/mobile/ContactPointUserInfoBean;Lcom/ss/android/lark/base/fragment/BaseFragment;)V", "actionTv", "Landroid/widget/TextView;", "agreeFriendRequest", "", "bind", "holder", "Lcom/ss/android/lark/thirdshare/base/export/item/ItemViewHolder;", "position", "openAddFriendPage", "context", "Landroid/content/Context;", "openProfile", "recordPosition", "setActionBtnListener", "setActionBtnStyle", "updateStatus", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/contact/v2/UserContactStatus;", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.b.b$b */
    public static final class InviteExternalContactUsingItemUserItem extends AbstractC55713a<InviteExternalContactUsingItemUserItem> {

        /* renamed from: b */
        public static final Companion f102277b = new Companion(null);

        /* renamed from: a */
        public final ContactPointUserInfoBean f102278a;

        /* renamed from: c */
        private TextView f102279c;

        /* renamed from: d */
        private final int f102280d;

        /* renamed from: e */
        private final BaseFragment f102281e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/contact/v2/using/InviteExternalContactUsingItem$InviteExternalContactUsingItemUserItem$Companion;", "", "()V", "getItems", "", "Lcom/ss/android/lark/invitation/v2/feat/external/contact/v2/using/InviteExternalContactUsingItem$InviteExternalContactUsingItemUserItem;", "cpIndex", "", "cpUserInfos", "Lcom/ss/android/lark/contact/entity/mobile/ContactPointUserInfoBean;", "sourceFragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.b.b$b$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final List<InviteExternalContactUsingItemUserItem> mo145996a(int i, List<ContactPointUserInfoBean> list, BaseFragment baseFragment) {
                Intrinsics.checkParameterIsNotNull(list, "cpUserInfos");
                Intrinsics.checkParameterIsNotNull(baseFragment, "sourceFragment");
                List<ContactPointUserInfoBean> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new InviteExternalContactUsingItemUserItem(i, it.next(), baseFragment));
                }
                return arrayList;
            }
        }

        /* renamed from: a */
        public final void mo145991a() {
            C40147z.m159162b().agreeFriendRequest(this.f102278a.mo130622a().user_id, new UIGetDataCallback(new C40251b(this)));
        }

        /* renamed from: b */
        private final void m159525b() {
            int i = C40255c.f102293a[this.f102278a.mo130626b().ordinal()];
            if (i == 1) {
                TextView textView = this.f102279c;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("actionTv");
                }
                textView.setBackgroundColor(0);
                TextView textView2 = this.f102279c;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("actionTv");
                }
                textView2.setTextColor(UIHelper.getColor(R.color.text_placeholder));
                TextView textView3 = this.f102279c;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("actionTv");
                }
                textView3.setText(R.string.Lark_NewContacts_FromMobileContactsAdded);
            } else if (i == 2) {
                TextView textView4 = this.f102279c;
                if (textView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("actionTv");
                }
                textView4.setBackgroundColor(0);
                TextView textView5 = this.f102279c;
                if (textView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("actionTv");
                }
                textView5.setTextColor(UIHelper.getColor(R.color.text_placeholder));
                TextView textView6 = this.f102279c;
                if (textView6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("actionTv");
                }
                textView6.setText(R.string.Lark_Legacy_Requested);
            } else if (i != 3) {
                TextView textView7 = this.f102279c;
                if (textView7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("actionTv");
                }
                textView7.setBackgroundResource(R.drawable.inv_invite_btn_bg_enable);
                TextView textView8 = this.f102279c;
                if (textView8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("actionTv");
                }
                textView8.setTextColor(UIHelper.getColor(R.color.static_white));
                TextView textView9 = this.f102279c;
                if (textView9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("actionTv");
                }
                textView9.setText(R.string.Lark_NewContacts_FromMobileContactsAdd);
            } else {
                TextView textView10 = this.f102279c;
                if (textView10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("actionTv");
                }
                textView10.setBackgroundResource(R.drawable.inv_invite_btn_bg_enable);
                TextView textView11 = this.f102279c;
                if (textView11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("actionTv");
                }
                textView11.setTextColor(UIHelper.getColor(R.color.static_white));
                TextView textView12 = this.f102279c;
                if (textView12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("actionTv");
                }
                textView12.setText(R.string.Lark_Legacy_Agree);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/invitation/v2/feat/external/contact/v2/using/InviteExternalContactUsingItem$InviteExternalContactUsingItemUserItem$agreeFriendRequest$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.b.b$b$b */
        public static final class C40251b implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ InviteExternalContactUsingItemUserItem f102282a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C40251b(InviteExternalContactUsingItemUserItem bVar) {
                this.f102282a = bVar;
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                this.f102282a.mo145994a(UserContactStatus.CONTACT_POINT_FRIEND);
                ViewUtils.m224150a(UIHelper.mustacheFormat((int) R.string.Lark_NewContacts_AcceptedContactRequestToast));
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e("ContactFeat", errorResult.getDebugMsg());
                ViewUtils.m224150a(errorResult.getDisplayMsg());
            }
        }

        /* renamed from: b */
        public final void mo145995b(int i) {
            C35409a.f91494a = this.f102280d;
            C35409a.f91495b = i;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/invitation/v2/feat/external/contact/v2/using/InviteExternalContactUsingItem$InviteExternalContactUsingItemUserItem$bind$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.b.b$b$c */
        static final class View$OnClickListenerC40252c implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ InviteExternalContactUsingItemUserItem f102283a;

            /* renamed from: b */
            final /* synthetic */ C55719c f102284b;

            /* renamed from: c */
            final /* synthetic */ int f102285c;

            View$OnClickListenerC40252c(InviteExternalContactUsingItemUserItem bVar, C55719c cVar, int i) {
                this.f102283a = bVar;
                this.f102284b = cVar;
                this.f102285c = i;
            }

            public final void onClick(View view) {
                this.f102283a.mo145992a(this.f102285c);
                this.f102283a.mo145995b(this.f102285c);
            }
        }

        /* renamed from: a */
        public final void mo145992a(int i) {
            C40147z.m159160a().openProfile(aj.m224263a(), this.f102278a.mo130622a().user_id, 10);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.b.b$b$d */
        public static final class View$OnClickListenerC40253d implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ InviteExternalContactUsingItemUserItem f102286a;

            /* renamed from: b */
            final /* synthetic */ int f102287b;

            /* renamed from: c */
            final /* synthetic */ TextView f102288c;

            View$OnClickListenerC40253d(InviteExternalContactUsingItemUserItem bVar, int i, TextView textView) {
                this.f102286a = bVar;
                this.f102287b = i;
                this.f102288c = textView;
            }

            public final void onClick(View view) {
                int i = C40255c.f102294b[this.f102286a.f102278a.mo130626b().ordinal()];
                if (i == 1) {
                    this.f102286a.mo145992a(this.f102287b);
                } else if (i == 2) {
                    this.f102286a.mo145992a(this.f102287b);
                } else if (i != 3) {
                    InviteExternalContactUsingItemUserItem bVar = this.f102286a;
                    Context context = this.f102288c.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "actionTv.context");
                    bVar.mo145993a(context);
                    InvHitPoint.m160402q();
                } else {
                    this.f102286a.mo145991a();
                }
                this.f102286a.mo145995b(this.f102287b);
            }
        }

        /* renamed from: a */
        public final void mo145993a(Context context) {
            UserInfo a = this.f102278a.mo130622a();
            IInvitationModuleDependency a2 = C40147z.m159160a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "InvUtils.getDep()");
            a2.getContactDependency().mo145578a(context, a.user_id, a.user_name, this.f102281e);
        }

        /* renamed from: a */
        public final void mo145994a(UserContactStatus userContactStatus) {
            Intrinsics.checkParameterIsNotNull(userContactStatus, UpdateKey.STATUS);
            this.f102278a.mo130624a(userContactStatus);
            if (this.f137416h) {
                m159525b();
            }
        }

        /* renamed from: a */
        private final void m159524a(TextView textView, int i) {
            textView.setOnClickListener(new View$OnClickListenerC40253d(this, i, textView));
        }

        @Override // com.ss.android.lark.thirdshare.base.export.p2741c.AbstractC55713a
        /* renamed from: a */
        public void mo130630a(C55719c cVar, int i) {
            String str;
            int i2;
            Intrinsics.checkParameterIsNotNull(cVar, "holder");
            View view = cVar.itemView;
            TextView textView = (TextView) view.findViewById(R.id.iecuiuiActionTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "iecuiuiActionTv");
            this.f102279c = textView;
            m159525b();
            UserInfo a = this.f102278a.mo130622a();
            C40125p.m159094a(a.avatar_key, a.user_id, (LKUIRoundedImageView) view.findViewById(R.id.iecuiuiAvatarIv));
            TextView textView2 = (TextView) view.findViewById(R.id.iecuiuiUsernameTv);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "iecuiuiUsernameTv");
            if (TextUtils.isEmpty(a.alias)) {
                str = a.user_name;
            } else {
                str = a.alias;
            }
            textView2.setText(str);
            String str2 = a.tenant_name;
            EmptyGoneTextView emptyGoneTextView = (EmptyGoneTextView) view.findViewById(R.id.iecuiuiTenantTv);
            Intrinsics.checkExpressionValueIsNotNull(emptyGoneTextView, "iecuiuiTenantTv");
            String str3 = str2;
            if (TextUtils.isEmpty(str3)) {
            }
            emptyGoneTextView.setText(str3);
            C57832h.m224486a(cVar.itemView);
            cVar.itemView.setOnClickListener(new View$OnClickListenerC40252c(this, cVar, i));
            TextView textView3 = (TextView) view.findViewById(R.id.iecuiuiActionTv);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "iecuiuiActionTv");
            m159524a(textView3, i);
            View findViewById = view.findViewById(R.id.iecuiuiSplitLine);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "iecuiuiSplitLine");
            if (mo189851g() == mo189850f() - 1) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            findViewById.setVisibility(i2);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public InviteExternalContactUsingItemUserItem(int i, ContactPointUserInfoBean aVar, BaseFragment baseFragment) {
            super(R.layout.inv_invite_external_contact_v2_using_item_user_item_view);
            Intrinsics.checkParameterIsNotNull(aVar, "cpUserInfo");
            Intrinsics.checkParameterIsNotNull(baseFragment, "sourceFragment");
            this.f102280d = i;
            this.f102278a = aVar;
            this.f102281e = baseFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0002J \u0010\u000e\u001a\u00020\u000f2\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u00062\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/contact/v2/using/InviteExternalContactUsingItem$Companion;", "", "()V", "TAG", "", "getItems", "", "Lcom/ss/android/lark/invitation/v2/feat/external/contact/v2/using/InviteExternalContactUsingItem;", "cpFeishuUsers", "Lcom/ss/android/lark/contact/entity/mobile/ContactsMobileFeishuInfo$CpFeishuUsers;", "filterKey", "sourceFragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "getItemsReal", "updateStatus", "", "items", "Lcom/ss/android/lark/thirdshare/base/export/item/BaseItem;", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/contact/v2/UserContactStatus;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo145990a(List<? extends AbstractC55713a<?>> list, UserContactStatus userContactStatus) {
            Intrinsics.checkParameterIsNotNull(list, "items");
            Intrinsics.checkParameterIsNotNull(userContactStatus, UpdateKey.STATUS);
            int i = C35409a.f91494a;
            int i2 = C35409a.f91495b;
            if (i < 0 || i >= list.size()) {
                Log.m165389i("ContactFeat", "cpIndex: " + i + " is invalid.");
                return;
            }
            AbstractC55713a aVar = (AbstractC55713a) list.get(i);
            if (aVar instanceof InviteExternalContactUsingItem) {
                if (i2 >= 0 || InviteExternalContactUsingItem.m159519a((InviteExternalContactUsingItem) aVar).mo130652b().size() > i2) {
                    ((InviteExternalContactUsingItem) aVar).f102274b.mo189857a().get(i2).mo145994a(userContactStatus);
                    return;
                }
                Log.m165389i("ContactFeat", "cpUserIndex: " + i2 + " is invalid.");
            }
        }

        /* renamed from: b */
        private final List<InviteExternalContactUsingItem> m159521b(List<ContactsMobileFeishuInfo.CpFeishuUsers> list, String str, BaseFragment baseFragment) {
            if (list.isEmpty()) {
                return CollectionsKt.listOf(new InviteExternalContactUsingItem());
            }
            List<ContactsMobileFeishuInfo.CpFeishuUsers> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new InviteExternalContactUsingItem(it.next(), baseFragment, str));
            }
            return arrayList;
        }

        /* renamed from: a */
        public final List<InviteExternalContactUsingItem> mo145989a(List<ContactsMobileFeishuInfo.CpFeishuUsers> list, String str, BaseFragment baseFragment) {
            Intrinsics.checkParameterIsNotNull(list, "cpFeishuUsers");
            Intrinsics.checkParameterIsNotNull(str, "filterKey");
            Intrinsics.checkParameterIsNotNull(baseFragment, "sourceFragment");
            if (TextUtils.isEmpty(str)) {
                return m159521b(list, "", baseFragment);
            }
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (t.mo130653b(str)) {
                    arrayList.add(t);
                }
            }
            return m159521b(arrayList, str, baseFragment);
        }
    }

    public InviteExternalContactUsingItem() {
        super(R.layout.inv_invite_external_contact_v2_empty_view);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.b.b$c */
    static final class RunnableC40254c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TextView f102289a;

        /* renamed from: b */
        final /* synthetic */ String f102290b;

        /* renamed from: c */
        final /* synthetic */ TextView f102291c;

        /* renamed from: d */
        final /* synthetic */ ContactMobileBean f102292d;

        RunnableC40254c(TextView textView, String str, TextView textView2, ContactMobileBean contactMobileBean) {
            this.f102289a = textView;
            this.f102290b = str;
            this.f102291c = textView2;
            this.f102292d = contactMobileBean;
        }

        public final void run() {
            TextView textView = this.f102289a;
            Intrinsics.checkExpressionValueIsNotNull(textView, "iecuiTitleTv");
            float measureText = textView.getPaint().measureText(this.f102290b);
            TextView textView2 = this.f102289a;
            Intrinsics.checkExpressionValueIsNotNull(textView2, "iecuiTitleTv");
            float paddingLeft = measureText + ((float) textView2.getPaddingLeft());
            TextView textView3 = this.f102289a;
            Intrinsics.checkExpressionValueIsNotNull(textView3, "iecuiTitleTv");
            float paddingRight = paddingLeft + ((float) textView3.getPaddingRight());
            TextView textView4 = this.f102289a;
            Intrinsics.checkExpressionValueIsNotNull(textView4, "iecuiTitleTv");
            if (paddingRight <= ((float) textView4.getWidth())) {
                TextView textView5 = this.f102289a;
                Intrinsics.checkExpressionValueIsNotNull(textView5, "iecuiTitleTv");
                textView5.setText(this.f102290b);
                TextView textView6 = this.f102291c;
                Intrinsics.checkExpressionValueIsNotNull(textView6, "iecuiTitleCpTv");
                textView6.setVisibility(8);
                return;
            }
            TextView textView7 = this.f102289a;
            Intrinsics.checkExpressionValueIsNotNull(textView7, "iecuiTitleTv");
            textView7.setText(UIHelper.getString(R.string.Lark_NewContacts_FromMobileContacts) + this.f102292d.getName());
            TextView textView8 = this.f102291c;
            Intrinsics.checkExpressionValueIsNotNull(textView8, "iecuiTitleCpTv");
            textView8.setVisibility(0);
            TextView textView9 = this.f102291c;
            Intrinsics.checkExpressionValueIsNotNull(textView9, "iecuiTitleCpTv");
            textView9.setText(this.f102292d.getEmailOrPhone());
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ContactsMobileFeishuInfo.CpFeishuUsers m159519a(InviteExternalContactUsingItem bVar) {
        ContactsMobileFeishuInfo.CpFeishuUsers bVar2 = bVar.f102273a;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cpFeishuUsers");
        }
        return bVar2;
    }

    @Override // com.ss.android.lark.thirdshare.base.export.p2741c.AbstractC55713a
    /* renamed from: a */
    public void mo130630a(C55719c cVar, int i) {
        Intrinsics.checkParameterIsNotNull(cVar, "holder");
        if (!mo189847c(R.layout.inv_invite_external_contact_v2_empty_view)) {
            ContactsMobileFeishuInfo.CpFeishuUsers bVar = this.f102273a;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cpFeishuUsers");
            }
            ContactMobileBean a = bVar.mo130650a();
            ContactsMobileFeishuInfo.CpFeishuUsers bVar2 = this.f102273a;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cpFeishuUsers");
            }
            String str = this.f102275d;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("filterKey");
            }
            List<ContactPointUserInfoBean> a2 = bVar2.mo130651a(str);
            TextView textView = (TextView) cVar.mo189863a(R.id.iecuiTitleTv);
            textView.post(new RunnableC40254c(textView, UIHelper.getString(R.string.Lark_NewContacts_FromMobileContacts) + a.getName() + ' ' + a.getEmailOrPhone(), (TextView) cVar.mo189863a(R.id.iecuiTitleCpTv), a));
            RecyclerView recyclerView = (RecyclerView) cVar.mo189863a(R.id.iecuiRv);
            C55718b<InviteExternalContactUsingItemUserItem> bVar3 = this.f102274b;
            InviteExternalContactUsingItemUserItem.Companion aVar = InviteExternalContactUsingItemUserItem.f102277b;
            BaseFragment baseFragment = this.f102276e;
            if (baseFragment == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sourceFragment");
            }
            bVar3.mo189862a(aVar.mo145996a(i, a2, baseFragment));
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "iecuiRv");
            recyclerView.setAdapter(this.f102274b);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteExternalContactUsingItem(ContactsMobileFeishuInfo.CpFeishuUsers bVar, BaseFragment baseFragment, String str) {
        super(R.layout.inv_invite_external_contact_v2_using_item_view);
        Intrinsics.checkParameterIsNotNull(bVar, "cpFeishuUsers");
        Intrinsics.checkParameterIsNotNull(baseFragment, "sourceFragment");
        Intrinsics.checkParameterIsNotNull(str, "filterKey");
        this.f102273a = bVar;
        this.f102276e = baseFragment;
        this.f102275d = str;
    }
}
