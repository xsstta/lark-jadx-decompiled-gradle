package com.ss.android.lark.contact.impl.department.detail.frame.list.binder.impl;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.avatar.v2.ChatterAvatar;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.component.ui.tag.TextTag;
import com.larksuite.component.ui.tag.v2.ITagEditor;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.chat.entity.chatter.TimeZone;
import com.ss.android.lark.chat.entity.chatter.WorkStatus;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.department.detail.frame.list.AbstractC35856a;
import com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.AbsItemBinder;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.contact.IPersonDependency;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.contact.ISelectDependency;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.viewholder.DepartmentPersonItemViewHolder;
import com.ss.android.lark.contact.impl.department.detail.frame.list.p1756a.C35858b;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.searchcommon.view.DepartmentPersonItemView;
import com.ss.android.lark.searchcommon.view.avataritem.localtime.LocalTimeModel;
import com.ss.android.lark.searchcommon.view.avataritem.title.TitleModel;
import com.ss.android.lark.searchcommon.view.avataritem.userduty.UserDutyModel;
import com.ss.android.lark.searchcommon.view.avataritem.userstatus.UserStatusModel;
import com.ss.android.lark.utils.UserStatusHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J%\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001bJ%\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001eJ\u001f\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0002\b!J%\u0010\"\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b#J \u0010$\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u0018H\u0002J\u0018\u0010&\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010'\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0018H\u0002J\u0018\u0010(\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u001dH\u0016J\u0010\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020-H\u0016J \u0010.\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u00182\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010/\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u0018H\u0002J\u0010\u00100\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u0018H\u0002J\u0010\u00101\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u0018H\u0002J\u0010\u00102\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u0016H\u0002J\u0018\u00103\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \f*\u0004\u0018\u00010\u000e0\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \f*\u0004\u0018\u00010\u00100\u0010X\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/impl/DepartmentPersonItemBinder;", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/AbsItemBinder;", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/viewholder/DepartmentPersonItemViewHolder;", "selectDependency", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/contact/ISelectDependency;", "dependency", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/contact/IPersonDependency;", "clickHandler", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/IItemOperationHandler;", "(Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/contact/ISelectDependency;Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/contact/IPersonDependency;Lcom/ss/android/lark/contact/impl/department/detail/frame/list/IItemOperationHandler;)V", "chatDependency", "Lcom/ss/android/lark/contact/dependency/IContactModuleDependency$IChatDependency;", "kotlin.jvm.PlatformType", "loginDependency", "Lcom/ss/android/lark/contact/dependency/IContactModuleDependency$ILoginDependency;", "tenantId", "", "bindAvatar", "", "departmentPersonItemView", "Lcom/ss/android/lark/searchcommon/view/DepartmentPersonItemView;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "bindCheckBox", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/DepartmentRecyclerViewItem$Person;", "isFromOrganization", "", "bindCheckBox$core_contact_contact_release", "bindClick", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/DepartmentRecyclerViewItem;", "bindClick$core_contact_contact_release", "bindLocalTime", "chatter", "bindLocalTime$core_contact_contact_release", "bindSelf", "bindSelf$core_contact_contact_release", "bindTags", "person", "bindTitle", "bindUserDuty", "bindUserStatus", "bindViewHolder", "holder", "createViewHolder", "context", "Landroid/content/Context;", "interceptClick", "isBlocked", "isLoginUserAuthorityControled", "isOtherUserAuthorityControled", "isOuterChatterDisabled", "pickChatterEnabled", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.b.d */
public class DepartmentPersonItemBinder extends AbsItemBinder<DepartmentPersonItemViewHolder> {

    /* renamed from: a */
    public final ISelectDependency f92743a;

    /* renamed from: b */
    public final AbstractC35856a f92744b;

    /* renamed from: c */
    private final AbstractC35361b.AbstractC35376o f92745c;

    /* renamed from: d */
    private final AbstractC35361b.AbstractC35367f f92746d;

    /* renamed from: e */
    private final String f92747e;

    /* renamed from: f */
    private final IPersonDependency f92748f;

    /* renamed from: a */
    public final void mo132020a(DepartmentPersonItemView departmentPersonItemView, DepartmentRecyclerViewItem.Person person, boolean z) {
        Intrinsics.checkParameterIsNotNull(departmentPersonItemView, "departmentPersonItemView");
        Intrinsics.checkParameterIsNotNull(person, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        departmentPersonItemView.setAlpha(m140494a(person, z) ? 1.0f : 0.5f);
        departmentPersonItemView.mo184680b(false);
    }

    /* renamed from: a */
    public final void mo132021a(DepartmentPersonItemView departmentPersonItemView, DepartmentRecyclerViewItem departmentRecyclerViewItem, boolean z) {
        Intrinsics.checkParameterIsNotNull(departmentPersonItemView, "departmentPersonItemView");
        Intrinsics.checkParameterIsNotNull(departmentRecyclerViewItem, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        C35858b.m140466a(departmentPersonItemView, new C35868a(this, departmentRecyclerViewItem.getPerson(), departmentPersonItemView, z, this.f92743a.mo131998e(), departmentRecyclerViewItem));
    }

    /* renamed from: a */
    public final boolean mo132022a(DepartmentRecyclerViewItem.Person person, Context context, boolean z) {
        Chatter chatter = person.getChatter();
        if (chatter != null) {
            if (z) {
                if (m140496b(person)) {
                    LKUIToast.show(context, (int) R.string.Lark_Contacts_CantAddExternalContactNoExternalCommunicationPermission);
                    return true;
                } else if (m140498c(person)) {
                    LKUIToast.show(context, (int) R.string.Lark_Contacts_CantAddUserExternalGroupMemberNoExternalCommunicationPermission);
                    return true;
                }
            }
            IPersonDependency bVar = this.f92748f;
            String id = chatter.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "chatter.getId()");
            if (bVar.mo131992b(id)) {
                LKUIToast.show(context, (int) R.string.Lark_Chat_CantSecretChatWithUserSecurityRestrict);
                return true;
            } else if (m140493a(person)) {
                boolean isBeBlocked = person.isBeBlocked();
                int i = R.string.Lark_NewContacts_CantAddToGroupBlockedTip;
                if (!isBeBlocked && person.isBlock()) {
                    i = R.string.Lark_NewContacts_CantAddToGroupBlockedOthersTip;
                }
                LKUIToast.show(context, i);
                return true;
            } else {
                Chatter chatter2 = person.getChatter();
                Intrinsics.checkExpressionValueIsNotNull(chatter2, "person.chatter");
                if (m140492a(chatter2)) {
                    LKUIToast.show(context, (int) R.string.Lark_Chat_Add_Member_PublicChatAddExternalUser_ErrrorTip);
                    return true;
                }
                IPersonDependency bVar2 = this.f92748f;
                String id2 = chatter.getId();
                Intrinsics.checkExpressionValueIsNotNull(id2, "chatter.getId()");
                if (bVar2.mo131991a(id2)) {
                    LKUIToast.show(context, (int) R.string.Lark_Groups_NoPermissionToAdd);
                    return true;
                }
                IPersonDependency bVar3 = this.f92748f;
                String id3 = chatter.getId();
                Intrinsics.checkExpressionValueIsNotNull(id3, "chatter.getId()");
                if (!bVar3.mo131994c(id3)) {
                    return this.f92743a.mo131998e() && !m140494a(person, z);
                }
                LKUIToast.show(context, (int) R.string.Lark_Contacts_NoBusinessEmail);
                return true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.b.d$a */
    public static final class C35868a extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ DepartmentRecyclerViewItem $data;
        final /* synthetic */ DepartmentPersonItemView $departmentPersonItemView;
        final /* synthetic */ boolean $enableSelect;
        final /* synthetic */ boolean $isFromOrganization;
        final /* synthetic */ DepartmentRecyclerViewItem.Person $person;
        final /* synthetic */ DepartmentPersonItemBinder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35868a(DepartmentPersonItemBinder dVar, DepartmentRecyclerViewItem.Person person, DepartmentPersonItemView departmentPersonItemView, boolean z, boolean z2, DepartmentRecyclerViewItem departmentRecyclerViewItem) {
            super(1);
            this.this$0 = dVar;
            this.$person = person;
            this.$departmentPersonItemView = departmentPersonItemView;
            this.$isFromOrganization = z;
            this.$enableSelect = z2;
            this.$data = departmentRecyclerViewItem;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            DepartmentPersonItemBinder dVar = this.this$0;
            DepartmentRecyclerViewItem.Person person = this.$person;
            Intrinsics.checkExpressionValueIsNotNull(person, "person");
            Context context = this.$departmentPersonItemView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "departmentPersonItemView.context");
            if (!dVar.mo132022a(person, context, this.$isFromOrganization)) {
                if (!this.$enableSelect) {
                    AbstractC35856a aVar = this.this$0.f92744b;
                    if (aVar != null) {
                        aVar.mo131891a(this.$data);
                        return;
                    }
                    return;
                }
                ISelectDependency cVar = this.this$0.f92743a;
                DepartmentRecyclerViewItem.Person person2 = this.$person;
                Intrinsics.checkExpressionValueIsNotNull(person2, "person");
                String id = person2.getChatter().getId();
                Intrinsics.checkExpressionValueIsNotNull(id, "person.chatter.getId()");
                boolean a = ISelectDependency.C35857b.m140465a(cVar, id, 0, 2, null);
                AbstractC35856a aVar2 = this.this$0.f92744b;
                if (aVar2 != null) {
                    aVar2.mo131893a(this.$data, !a);
                }
            }
        }
    }

    /* renamed from: a */
    private final boolean m140493a(DepartmentRecyclerViewItem.Person person) {
        return person.isBlockOrBeBlocked();
    }

    /* renamed from: b */
    public DepartmentPersonItemViewHolder mo131989a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return DepartmentPersonItemViewHolder.f92771a.mo132046a(context);
    }

    /* renamed from: b */
    private final boolean m140496b(DepartmentRecyclerViewItem.Person person) {
        if (person == null) {
            return false;
        }
        int deniedReason = person.getDeniedReason();
        AbstractC35361b a = C35358a.m138143a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ContactModule.getDependency()");
        AbstractC35361b.AbstractC35364c s = a.mo130174s();
        Intrinsics.checkExpressionValueIsNotNull(s, "ContactModule.getDependency().auditDependency");
        if (deniedReason == s.mo130185a()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m140492a(Chatter chatter) {
        if ((!this.f92743a.mo132000g() || this.f92748f.mo131995d()) && (!Intrinsics.areEqual(this.f92747e, chatter.getTenantId()))) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m140498c(DepartmentRecyclerViewItem.Person person) {
        if (person == null) {
            return false;
        }
        int deniedReason = person.getDeniedReason();
        AbstractC35361b a = C35358a.m138143a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ContactModule.getDependency()");
        AbstractC35361b.AbstractC35364c s = a.mo130174s();
        Intrinsics.checkExpressionValueIsNotNull(s, "ContactModule.getDependency().auditDependency");
        if (deniedReason == s.mo130189d()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final void m140495b(DepartmentPersonItemView departmentPersonItemView, Chatter chatter) {
        departmentPersonItemView.mo184670a(new TitleModel(this.f92746d.mo130195a(chatter), false, null, 0, 14, null));
    }

    /* renamed from: a */
    private final void m140490a(DepartmentPersonItemView departmentPersonItemView, DepartmentRecyclerViewItem.Person person) {
        UserDutyModel bVar = new UserDutyModel();
        Context context = departmentPersonItemView.getContext();
        bVar.mo184747b(person.getSection());
        bVar.mo184745a(person.getDuty());
        bVar.mo184744a(Integer.valueOf(UIUtils.getColor(context, R.color.text_placeholder)));
        bVar.mo184743a(UIUtils.getDrawable(context, 2131231942));
        departmentPersonItemView.mo184578a(bVar);
    }

    /* renamed from: c */
    private final void m140497c(DepartmentPersonItemView departmentPersonItemView, Chatter chatter) {
        ChatterAvatar.Builder aVar = new ChatterAvatar.Builder();
        aVar.mo89081c(chatter.getId());
        aVar.mo88962a(chatter.getAvatarKey());
        aVar.mo88967b(chatter.getId());
        departmentPersonItemView.mo184662a(aVar.mo88976k());
    }

    /* renamed from: d */
    private final void m140499d(DepartmentPersonItemView departmentPersonItemView, Chatter chatter) {
        ChatterDescription description = chatter.getDescription();
        UserStatusModel bVar = new UserStatusModel();
        if (description != null && !TextUtils.isEmpty(description.description)) {
            Context context = departmentPersonItemView.getContext();
            bVar.mo184755a(description.description);
            bVar.mo184754a(Integer.valueOf(UIUtils.getColor(context, R.color.text_placeholder)));
            ChatterDescription.Type type = description.type;
            if (type != null) {
                bVar.mo184753a(UIUtils.getDrawable(context, UserStatusHelper.m224138a().mo195998a(type.getNumber())));
            }
        }
        departmentPersonItemView.mo184672a(bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m140494a(com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.Person r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.contact.impl.department.detail.frame.list.binder.impl.DepartmentPersonItemBinder.m140494a(com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem$Person, boolean):boolean");
    }

    /* renamed from: a */
    public void mo131990a(DepartmentPersonItemViewHolder dVar, DepartmentRecyclerViewItem departmentRecyclerViewItem) {
        Intrinsics.checkParameterIsNotNull(dVar, "holder");
        Intrinsics.checkParameterIsNotNull(departmentRecyclerViewItem, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        DepartmentRecyclerViewItem.Person person = departmentRecyclerViewItem.getPerson();
        DepartmentPersonItemView a = dVar.mo132045a();
        Intrinsics.checkExpressionValueIsNotNull(person, "person");
        Chatter chatter = person.getChatter();
        mo132021a(a, departmentRecyclerViewItem, true);
        mo132020a(a, person, true);
        mo132024b(a, person, true);
        m140491a(a, departmentRecyclerViewItem, person);
        m140490a(a, person);
        Intrinsics.checkExpressionValueIsNotNull(chatter, "chatter");
        m140497c(a, chatter);
        m140495b(a, chatter);
        mo132019a(a, chatter);
        m140499d(a, chatter);
    }

    /* renamed from: a */
    public final void mo132019a(DepartmentPersonItemView departmentPersonItemView, Chatter chatter) {
        Intrinsics.checkParameterIsNotNull(departmentPersonItemView, "departmentPersonItemView");
        if (this.f92748f.mo131993c()) {
            if (chatter == null) {
                Intrinsics.throwNpe();
            }
            TimeZone timeZone = chatter.getTimeZone();
            if (timeZone != null && !TextUtils.isEmpty(timeZone.getTimeZoneId())) {
                java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
                java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone(timeZone.getTimeZoneId());
                long currentTimeMillis = System.currentTimeMillis();
                if (timeZone2.getOffset(currentTimeMillis) != timeZone3.getOffset(currentTimeMillis)) {
                    AbstractC35361b a = C35358a.m138143a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "contactDependency");
                    AbstractC35361b.AbstractC35381t g = a.mo130162g();
                    Intrinsics.checkExpressionValueIsNotNull(g, "contactDependency.settingDependency");
                    boolean a2 = g.mo130254a();
                    AbstractC35361b.AbstractC35375n c = a.mo130153c();
                    Intrinsics.checkExpressionValueIsNotNull(c, "contactDependency.languageDependency");
                    Boolean b = c.mo130224b();
                    Intrinsics.checkExpressionValueIsNotNull(b, "isEn");
                    departmentPersonItemView.mo184666a(new LocalTimeModel(a2, b.booleanValue(), timeZone.getTimeZoneId()));
                }
            }
        }
    }

    public DepartmentPersonItemBinder(ISelectDependency cVar, IPersonDependency bVar, AbstractC35856a aVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "selectDependency");
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        this.f92743a = cVar;
        this.f92748f = bVar;
        this.f92744b = aVar;
        AbstractC35361b a = C35358a.m138143a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ContactModule.getDependency()");
        this.f92745c = a.mo130163h();
        AbstractC35361b a2 = C35358a.m138143a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "ContactModule.getDependency()");
        this.f92746d = a2.mo130165j();
        AbstractC35361b a3 = C35358a.m138143a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "ContactModule.getDependency()");
        AbstractC35361b.AbstractC35376o h = a3.mo130163h();
        Intrinsics.checkExpressionValueIsNotNull(h, "ContactModule.getDependency().loginDependency");
        this.f92747e = h.mo130232d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo132024b(com.ss.android.lark.searchcommon.view.DepartmentPersonItemView r8, com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.Person r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.contact.impl.department.detail.frame.list.binder.impl.DepartmentPersonItemBinder.mo132024b(com.ss.android.lark.searchcommon.view.DepartmentPersonItemView, com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem$Person, boolean):void");
    }

    /* renamed from: a */
    private final void m140491a(DepartmentPersonItemView departmentPersonItemView, DepartmentRecyclerViewItem departmentRecyclerViewItem, DepartmentRecyclerViewItem.Person person) {
        departmentPersonItemView.mo184656a();
        Chatter chatter = person.getChatter();
        Context context = departmentPersonItemView.getContext();
        LarkNameTag.Companion fVar = LarkNameTag.f62897a;
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        LarkNameTag.Builder a = fVar.mo90052a(context);
        Intrinsics.checkExpressionValueIsNotNull(chatter, "chatter");
        if (!chatter.getRegistered()) {
            TextTag.Companion bVar = TextTag.f62987a;
            TextTag.Builder aVar = new TextTag.Builder();
            aVar.mo90139b(0);
            aVar.mo90143c(R.string.Lark_Legacy_TagUnregistered);
            aVar.mo90145d(R.color.udtoken_tag_neutral_text_normal);
            aVar.mo90147e(R.color.udtoken_tag_neutral_bg_normal);
            LarkNameTag.Builder bVar2 = (LarkNameTag.Builder) ITagEditor.C25691a.m92166a((ITagEditor) a, aVar.mo90154l(), false, 2, (Object) null);
        }
        if (person.isSuperAdministrator()) {
            TextTag.Companion bVar3 = TextTag.f62987a;
            TextTag.Builder aVar2 = new TextTag.Builder();
            aVar2.mo90139b(50);
            aVar2.mo90143c(R.string.Lark_Core_SuperAdministratorLable);
            aVar2.mo90145d(R.color.udtoken_tag_text_s_purple);
            aVar2.mo90147e(R.color.udtoken_tag_bg_purple);
            LarkNameTag.Builder bVar4 = (LarkNameTag.Builder) ITagEditor.C25691a.m92166a((ITagEditor) a, aVar2.mo90154l(), false, 2, (Object) null);
        } else if (person.isAdministrator()) {
            TextTag.Companion bVar5 = TextTag.f62987a;
            TextTag.Builder aVar3 = new TextTag.Builder();
            aVar3.mo90139b(50);
            aVar3.mo90143c(R.string.Lark_Core_RegularAdministratorLable);
            aVar3.mo90145d(R.color.udtoken_tag_text_s_blue);
            aVar3.mo90147e(R.color.udtoken_tag_bg_blue);
            LarkNameTag.Builder bVar6 = (LarkNameTag.Builder) ITagEditor.C25691a.m92166a((ITagEditor) a, aVar3.mo90154l(), false, 2, (Object) null);
        }
        if (person.isLeader()) {
            TextTag.Companion bVar7 = TextTag.f62987a;
            TextTag.Builder aVar4 = new TextTag.Builder();
            aVar4.mo90139b(100);
            aVar4.mo90143c(R.string.Lark_Legacy_DepartmentLeaderTag);
            aVar4.mo90145d(R.color.udtoken_tag_text_s_blue);
            aVar4.mo90147e(R.color.udtoken_tag_bg_blue);
            LarkNameTag.Builder bVar8 = (LarkNameTag.Builder) ITagEditor.C25691a.m92166a((ITagEditor) a, aVar4.mo90154l(), false, 2, (Object) null);
        }
        departmentPersonItemView.mo184663a(a, 1);
        LarkNameTag.ChatTagBuilder b = LarkNameTag.f62897a.mo90053b(context);
        if (!Intrinsics.areEqual(chatter.getTenantId(), this.f92747e)) {
            boolean e = this.f92743a.mo131998e();
            if (!departmentRecyclerViewItem.isCollaboration()) {
                b.mo90037h(true);
            } else if (e) {
                b.mo90037h(true);
            }
        }
        if (!WorkStatus.isInvalid(chatter.getWorkStatus())) {
            String displayTextNoDuration = chatter.getWorkStatus().getDisplayTextNoDuration(context);
            TextTag.Companion bVar9 = TextTag.f62987a;
            TextTag.Builder aVar5 = new TextTag.Builder();
            aVar5.mo90139b(100);
            aVar5.mo90136a(displayTextNoDuration);
            aVar5.mo90145d(R.color.LARK_TAG_TEXT_RED);
            aVar5.mo90147e(R.color.LARK_TAG_TEXT_READ_BG);
            LarkNameTag.Builder bVar10 = (LarkNameTag.Builder) ITagEditor.C25691a.m92166a((ITagEditor) a, aVar5.mo90154l(), false, 2, (Object) null);
        }
        departmentPersonItemView.mo184663a(b, 2);
    }
}
