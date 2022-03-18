package com.ss.android.lark.contact.impl.contacts_group;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.Lists;
import com.bytedance.lark.pb.basic.v1.Tag;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.avatar.v2.ChatterAvatar;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.biz.core.api.PickType;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.TagInfo;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.department.detail.frame.list.p1756a.C35858b;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.searchcommon.view.avataritem.AvatarItemView;
import com.ss.android.lark.searchcommon.view.avataritem.checkbox.CheckBoxModel;
import com.ss.android.lark.searchcommon.view.avataritem.title.TitleModel;
import com.ss.android.lark.searchcommon.view.avataritem.title.TitleTailModel;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\r\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u000389:B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H\u0002J\u0018\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0003H\u0002J\u0018\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H\u0002J\u0018\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0003H\u0002J\u0018\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H\u0002J\u0018\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H\u0002J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0003H\u0002J\u0018\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020\u0003H\u0002J\u0018\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020'H\u0016J\u0018\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020'H\u0016J\u0014\u0010,\u001a\u00020\u00162\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120.J\u000e\u0010/\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u00100\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u000fJ\u0014\u00102\u001a\u00020\u00162\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00120.J&\u00104\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u000f2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00120.2\b\u00105\u001a\u0004\u0018\u00010\rJ\u0018\u00106\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_group/ContactsMyGroupAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Lcom/ss/android/lark/contact/impl/contacts_group/ContactsMyGroupAdapter$GroupItemViewHolder;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "isCustomer", "", "(Z)V", "loginDependency", "Lcom/ss/android/lark/contact/dependency/IContactModuleDependency$ILoginDependency;", "kotlin.jvm.PlatformType", "onItemClickListener", "Lcom/ss/android/lark/contact/impl/contacts_group/ContactsMyGroupAdapter$OnItemClickListener;", "onItemSelectedListener", "Lcom/ss/android/lark/contact/impl/contacts_group/ContactsMyGroupAdapter$OnItemSelectListener;", "picType", "Lcom/ss/android/lark/biz/core/api/PickType;", "selectedChatIds", "", "", "selectedMode", "selfContainedChatId", "bindAvatar", "", "avatarItemView", "Lcom/ss/android/lark/searchcommon/view/avataritem/AvatarItemView;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "bindCheckBox", "chat", "bindClick", "bindSelf", "bindTags", "bindTitle", "enablePickGroup", "interceptClick", "context", "Landroid/content/Context;", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setContainedChatId", "chaIds", "", "setOnItemClickListener", "setPickType", "pickType", "setSelectChatIds", "selectedIds", "switchToSelectMode", "onItemSelectListener", "updateCheckBox", "checked", "GroupItemViewHolder", "OnItemClickListener", "OnItemSelectListener", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_group.a */
public final class ContactsMyGroupAdapter extends LarkRecyclerViewBaseAdapter<GroupItemViewHolder, Chat> {

    /* renamed from: a */
    public final Set<String> f92056a = new LinkedHashSet();

    /* renamed from: b */
    public final Set<String> f92057b = new LinkedHashSet();

    /* renamed from: c */
    public OnItemClickListener f92058c;

    /* renamed from: d */
    public OnItemSelectListener f92059d;

    /* renamed from: e */
    public boolean f92060e;

    /* renamed from: f */
    private PickType f92061f = new PickType();

    /* renamed from: g */
    private final AbstractC35361b.AbstractC35376o f92062g;

    /* renamed from: h */
    private final boolean f92063h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_group/ContactsMyGroupAdapter$GroupItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Lcom/ss/android/lark/searchcommon/view/avataritem/AvatarItemView;", "(Lcom/ss/android/lark/searchcommon/view/avataritem/AvatarItemView;)V", "getV", "()Lcom/ss/android/lark/searchcommon/view/avataritem/AvatarItemView;", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_group.a$a */
    public static final class GroupItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public static final Companion f92064a = new Companion(null);

        /* renamed from: b */
        private final AvatarItemView f92065b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_group/ContactsMyGroupAdapter$GroupItemViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/lark/contact/impl/contacts_group/ContactsMyGroupAdapter$GroupItemViewHolder;", "parent", "Landroid/view/ViewGroup;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.contacts_group.a$a$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            /* renamed from: a */
            public final GroupItemViewHolder mo131262a(ViewGroup viewGroup) {
                Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
                Context context = viewGroup.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
                AvatarItemView a = new AvatarItemView(context, null, 0, null, 14, null).mo184657a(R.style.AvatarItemDepartment);
                a.mo184680b(false);
                return new GroupItemViewHolder(a, null);
            }
        }

        /* renamed from: a */
        public final AvatarItemView mo131261a() {
            return this.f92065b;
        }

        private GroupItemViewHolder(AvatarItemView avatarItemView) {
            super(avatarItemView);
            this.f92065b = avatarItemView;
        }

        public /* synthetic */ GroupItemViewHolder(AvatarItemView avatarItemView, DefaultConstructorMarker defaultConstructorMarker) {
            this(avatarItemView);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_group/ContactsMyGroupAdapter$OnItemClickListener;", "", "onItemClick", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "position", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_group.a$b */
    public interface OnItemClickListener {
        void onItemClick(Chat chat, int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_group/ContactsMyGroupAdapter$OnItemSelectListener;", "", "onItemSelected", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "selected", "position", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_group.a$c */
    public interface OnItemSelectListener {
        boolean onItemSelected(Chat chat, boolean z, int i);
    }

    /* renamed from: a */
    public final boolean mo131259a(Context context, Chat chat) {
        if (!this.f92060e) {
            return false;
        }
        if ((chat.isPublic() && !this.f92061f.getEnablePublicGroup()) || ((chat.isMeeting() && !this.f92061f.getEnableMeetingGroup()) || ((chat.isSecret() && !this.f92061f.getEnableSecretGroup()) || (chat.isCrossTenant() && !this.f92061f.getEnableExternalGroup())))) {
            UDToast.show(context, (int) R.string.Project_MV_UnableToSelectExternalGroups);
            return true;
        } else if (this.f92061f.getEnableGroupChat()) {
            return false;
        } else {
            LKUIToast.show(context, (int) R.string.Lark_Group_UnableAddGroupVerifyOn);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_group.a$d */
    public static final class C35590d extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ AvatarItemView $avatarItemView;
        final /* synthetic */ Chat $data;
        final /* synthetic */ ContactsMyGroupAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35590d(ContactsMyGroupAdapter aVar, Chat chat, AvatarItemView avatarItemView) {
            super(1);
            this.this$0 = aVar;
            this.$data = chat;
            this.$avatarItemView = avatarItemView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            boolean z;
            ContactHitPoint.m140788a("groups_i_manage", "group", 1, this.this$0.getIndex(this.$data));
            ContactsMyGroupAdapter aVar = this.this$0;
            Context context = this.$avatarItemView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "avatarItemView.context");
            if (!aVar.mo131259a(context, this.$data)) {
                if (!this.this$0.f92060e) {
                    OnItemClickListener bVar = this.this$0.f92058c;
                    if (bVar != null) {
                        bVar.onItemClick(this.$data, this.this$0.items.indexOf(this.$data));
                        return;
                    }
                    return;
                }
                String id = this.$data.getId();
                Intrinsics.checkExpressionValueIsNotNull(id, "data.getId()");
                if (!this.this$0.f92057b.contains(id)) {
                    boolean contains = this.this$0.f92056a.contains(id);
                    OnItemSelectListener cVar = this.this$0.f92059d;
                    if (cVar == null || !cVar.onItemSelected(this.$data, !contains, this.this$0.items.indexOf(this.$data))) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        if (contains) {
                            this.this$0.f92056a.remove(id);
                        } else {
                            this.this$0.f92056a.add(id);
                        }
                        this.this$0.mo131257a(this.$avatarItemView, !contains);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo131256a(OnItemClickListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "onItemClickListener");
        this.f92058c = bVar;
    }

    /* renamed from: a */
    public final void mo131253a(PickType pickType) {
        Intrinsics.checkParameterIsNotNull(pickType, "pickType");
        this.f92061f = pickType;
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public final void mo131260b(Collection<String> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "chaIds");
        this.f92057b.clear();
        this.f92057b.addAll(collection);
        notifyDataSetChanged();
    }

    public ContactsMyGroupAdapter(boolean z) {
        this.f92063h = z;
        AbstractC35361b a = C35358a.m138143a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ContactModule.getDependency()");
        this.f92062g = a.mo130163h();
    }

    /* renamed from: a */
    private final boolean m139345a(Chat chat) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this.f92061f.getEnableExternalGroup() || (!chat.isCrossTenant() && this.f92061f.getEnableGroupChat())) {
            z = true;
        } else {
            z = false;
        }
        if (this.f92061f.getEnableSecretGroup() || (!chat.isSecret() && this.f92061f.getEnableGroupChat())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f92061f.getEnableMeetingGroup() || (!chat.isMeeting() && this.f92061f.getEnableGroupChat())) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f92061f.getEnablePublicGroup() || (!chat.isPublic() && this.f92061f.getEnableGroupChat())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z || !z2 || !z3 || !z4) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo131258a(Collection<String> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "selectedIds");
        this.f92056a.clear();
        this.f92056a.addAll(collection);
        notifyDataSetChanged();
    }

    /* renamed from: d */
    private final void m139348d(AvatarItemView avatarItemView, Chat chat) {
        C35858b.m140466a(avatarItemView, new C35590d(this, chat, avatarItemView));
    }

    /* renamed from: a */
    public GroupItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return GroupItemViewHolder.f92064a.mo131262a(viewGroup);
    }

    /* renamed from: a */
    private final void m139344a(AvatarItemView avatarItemView, Chat chat) {
        avatarItemView.mo184670a(new TitleModel(chat.getName(), true, null, 0, 12, null));
        avatarItemView.mo184671a(new TitleTailModel(" (" + chat.getUserCount() + ')', 0, 2, null));
    }

    /* renamed from: b */
    private final void m139346b(AvatarItemView avatarItemView, Chat chat) {
        ChatterAvatar.Builder aVar = new ChatterAvatar.Builder();
        aVar.mo89081c(chat.getId());
        aVar.mo88962a(chat.getAvatarKey());
        aVar.mo88967b(chat.getId());
        avatarItemView.mo184662a(aVar.mo88976k());
    }

    /* renamed from: c */
    private final void m139347c(AvatarItemView avatarItemView, Chat chat) {
        if (this.f92060e) {
            CheckBoxModel bVar = new CheckBoxModel();
            boolean contains = this.f92057b.contains(chat.getId());
            if (!m139345a(chat) || contains) {
                bVar.mo184703a(contains);
                bVar.mo184705b(false);
            } else {
                bVar.mo184705b(true);
                bVar.mo184703a(this.f92056a.contains(chat.getId()));
            }
            bVar.mo184707c(true);
            avatarItemView.mo184665a(bVar);
        }
    }

    /* renamed from: e */
    private final void m139349e(AvatarItemView avatarItemView, Chat chat) {
        boolean z;
        Context context = avatarItemView.getContext();
        LarkNameTag.Companion fVar = LarkNameTag.f62897a;
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        LarkNameTag.ChatTagBuilder b = fVar.mo90053b(context);
        b.mo90038i(chat.is_department());
        b.mo90040k(chat.isTenant());
        b.mo90041l(chat.isPublic());
        b.mo90035f(chat.isSecret());
        if (Lists.isEmpty(chat.getTags())) {
            z = false;
        } else {
            z = chat.getTags().contains(Tag.OFFICIAL);
        }
        b.mo90033b(z);
        boolean z2 = this.f92063h;
        boolean isCrossTenant = chat.isCrossTenant();
        AbstractC35361b.AbstractC35376o oVar = this.f92062g;
        Intrinsics.checkExpressionValueIsNotNull(oVar, "loginDependency");
        b.mo90020a(z2, isCrossTenant, oVar.mo130235g());
        if (chat.isEdu()) {
            TagInfo.Factory a = TagInfo.Companion.mo124874a();
            Context context2 = avatarItemView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "avatarItemView.context");
            TagInfo.Companion.mo124876a(b, a.mo124879a(context2));
            boolean z3 = this.f92063h;
            AbstractC35361b.AbstractC35376o oVar2 = this.f92062g;
            Intrinsics.checkExpressionValueIsNotNull(oVar2, "loginDependency");
            b.mo90020a(z3, false, oVar2.mo130235g());
        }
        if (chat.isCrossWithKa()) {
            TagInfo.Factory a2 = TagInfo.Companion.mo124874a();
            Context context3 = avatarItemView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "avatarItemView.context");
            TagInfo.Companion.mo124876a(b, a2.mo124881c(context3));
            b.mo90037h(false);
        }
        avatarItemView.setTag(b);
    }

    /* renamed from: a */
    public void onBindViewHolder(GroupItemViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        List list = this.items;
        Intrinsics.checkExpressionValueIsNotNull(list, "items");
        Chat chat = (Chat) CollectionsKt.getOrNull(list, i);
        if (chat != null) {
            AvatarItemView a = aVar.mo131261a();
            m139346b(a, chat);
            m139344a(a, chat);
            m139347c(a, chat);
            m139348d(a, chat);
            m139349e(a, chat);
        }
    }

    /* renamed from: a */
    public final void mo131257a(AvatarItemView avatarItemView, boolean z) {
        if (this.f92060e) {
            avatarItemView.mo184676a(z);
        }
    }

    /* renamed from: a */
    public final void mo131254a(PickType pickType, Collection<String> collection, OnItemSelectListener cVar) {
        Intrinsics.checkParameterIsNotNull(pickType, "pickType");
        Intrinsics.checkParameterIsNotNull(collection, "selectedIds");
        this.f92060e = true;
        this.f92061f = pickType;
        this.f92056a.clear();
        this.f92056a.addAll(collection);
        this.f92059d = cVar;
        notifyDataSetChanged();
    }
}
