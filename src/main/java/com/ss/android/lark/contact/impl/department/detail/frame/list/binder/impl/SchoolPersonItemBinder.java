package com.ss.android.lark.contact.impl.department.detail.frame.list.binder.impl;

import android.content.Context;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.avatar.v2.ChatterAvatar;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.component.ui.tag.TextTag;
import com.larksuite.component.ui.tag.v2.ITagEditor;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.WorkStatus;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.entity.EduRoleType;
import com.ss.android.lark.contact.entity.InactiveParent;
import com.ss.android.lark.contact.impl.department.detail.frame.list.AbstractC35856a;
import com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.AbsItemBinder;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.contact.IPersonDependency;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.contact.ISelectDependency;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.viewholder.DepartmentPersonItemViewHolder;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.searchcommon.view.DepartmentPersonItemView;
import com.ss.android.lark.searchcommon.view.avataritem.title.TitleModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0002J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/impl/SchoolPersonItemBinder;", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/AbsItemBinder;", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/viewholder/DepartmentPersonItemViewHolder;", "selectDependency", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/contact/ISelectDependency;", "dependency", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/contact/IPersonDependency;", "operationListener", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/IItemOperationHandler;", "(Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/contact/ISelectDependency;Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/contact/IPersonDependency;Lcom/ss/android/lark/contact/impl/department/detail/frame/list/IItemOperationHandler;)V", "baseBinder", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/impl/DepartmentPersonItemBinder;", "chatDependency", "Lcom/ss/android/lark/contact/dependency/IContactModuleDependency$IChatDependency;", "kotlin.jvm.PlatformType", "addEduTags", "", "builder", "Lcom/larksuite/component/ui/tag/LarkNameTag$Builder;", "roleTypes", "", "Lcom/ss/android/lark/contact/entity/EduRoleType;", "bindAvatarAndTitle", "departmentPersonItemView", "Lcom/ss/android/lark/searchcommon/view/DepartmentPersonItemView;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/DepartmentRecyclerViewItem$Person;", "bindTags", "bindViewHolder", "holder", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/DepartmentRecyclerViewItem;", "createViewHolder", "context", "Landroid/content/Context;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.b.f */
public final class SchoolPersonItemBinder extends AbsItemBinder<DepartmentPersonItemViewHolder> {

    /* renamed from: a */
    private final AbstractC35361b.AbstractC35367f f92750a;

    /* renamed from: b */
    private final DepartmentPersonItemBinder f92751b;

    /* renamed from: b */
    public DepartmentPersonItemViewHolder mo131989a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return this.f92751b.mo131989a(context);
    }

    /* renamed from: a */
    public void mo131990a(DepartmentPersonItemViewHolder dVar, DepartmentRecyclerViewItem departmentRecyclerViewItem) {
        Intrinsics.checkParameterIsNotNull(dVar, "holder");
        Intrinsics.checkParameterIsNotNull(departmentRecyclerViewItem, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        DepartmentRecyclerViewItem.Person person = departmentRecyclerViewItem.getPerson();
        DepartmentPersonItemView a = dVar.mo132045a();
        DepartmentPersonItemBinder dVar2 = this.f92751b;
        Intrinsics.checkExpressionValueIsNotNull(person, "person");
        dVar2.mo132024b(a, person, false);
        this.f92751b.mo132021a(a, departmentRecyclerViewItem, false);
        this.f92751b.mo132019a(a, person.getChatter());
        m140514a(a, person);
        m140515b(a, person);
    }

    /* renamed from: a */
    private final void m140513a(LarkNameTag.Builder bVar, List<? extends EduRoleType> list) {
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                int i = C35870g.f92752a[it.next().ordinal()];
                if (i == 1) {
                    TextTag.Companion bVar2 = TextTag.f62987a;
                    TextTag.Builder aVar = new TextTag.Builder();
                    aVar.mo90139b(100);
                    aVar.mo90143c(R.string.Lark_Education_HeadTeacherLabel);
                    aVar.mo90145d(R.color.udtoken_tag_text_s_blue);
                    aVar.mo90147e(R.color.udtoken_tag_bg_blue);
                    LarkNameTag.Builder bVar3 = (LarkNameTag.Builder) ITagEditor.C25691a.m92166a((ITagEditor) bVar, aVar.mo90154l(), false, 2, (Object) null);
                } else if (i == 2) {
                    TextTag.Companion bVar4 = TextTag.f62987a;
                    TextTag.Builder aVar2 = new TextTag.Builder();
                    aVar2.mo90139b(100);
                    aVar2.mo90143c(R.string.Lark_Legacy_DepartmentLeaderTag);
                    aVar2.mo90145d(R.color.udtoken_tag_text_s_blue);
                    aVar2.mo90147e(R.color.udtoken_tag_bg_blue);
                    LarkNameTag.Builder bVar5 = (LarkNameTag.Builder) ITagEditor.C25691a.m92166a((ITagEditor) bVar, aVar2.mo90154l(), false, 2, (Object) null);
                } else if (i == 3) {
                    TextTag.Companion bVar6 = TextTag.f62987a;
                    TextTag.Builder aVar3 = new TextTag.Builder();
                    aVar3.mo90139b(50);
                    aVar3.mo90143c(R.string.Lark_Core_SuperAdministratorLable);
                    aVar3.mo90145d(R.color.udtoken_tag_text_s_purple);
                    aVar3.mo90147e(R.color.udtoken_tag_bg_purple);
                    LarkNameTag.Builder bVar7 = (LarkNameTag.Builder) ITagEditor.C25691a.m92166a((ITagEditor) bVar, aVar3.mo90154l(), false, 2, (Object) null);
                } else if (i == 4) {
                    TextTag.Companion bVar8 = TextTag.f62987a;
                    TextTag.Builder aVar4 = new TextTag.Builder();
                    aVar4.mo90139b(50);
                    aVar4.mo90143c(R.string.Lark_Core_RegularAdministratorLable);
                    aVar4.mo90145d(R.color.udtoken_tag_text_s_blue);
                    aVar4.mo90147e(R.color.udtoken_tag_bg_blue);
                    LarkNameTag.Builder bVar9 = (LarkNameTag.Builder) ITagEditor.C25691a.m92166a((ITagEditor) bVar, aVar4.mo90154l(), false, 2, (Object) null);
                }
            }
        }
    }

    /* renamed from: a */
    private final void m140514a(DepartmentPersonItemView departmentPersonItemView, DepartmentRecyclerViewItem.Person person) {
        Chatter chatter = person.getChatter();
        InactiveParent inactiveParent = person.getInactiveParent();
        if (chatter != null) {
            departmentPersonItemView.mo184662a(((ChatterAvatar.Builder) ((ChatterAvatar.Builder) new ChatterAvatar.Builder().mo89081c(chatter.getId()).mo88967b(chatter.getId())).mo88962a(chatter.getAvatarKey())).mo88976k());
            if (person.isParent()) {
                departmentPersonItemView.mo184670a(new TitleModel(chatter.getName(), false, null, 0, 14, null));
            } else {
                departmentPersonItemView.mo184670a(new TitleModel(this.f92750a.mo130195a(chatter), false, null, 0, 14, null));
            }
        } else if (inactiveParent != null) {
            departmentPersonItemView.mo184662a(((ChatterAvatar.Builder) new ChatterAvatar.Builder().mo88957a(R.drawable.icon_inactive_parent)).mo88976k());
            departmentPersonItemView.mo184670a(new TitleModel(inactiveParent.getName(), false, null, 0, 12, null));
        }
    }

    /* renamed from: b */
    private final void m140515b(DepartmentPersonItemView departmentPersonItemView, DepartmentRecyclerViewItem.Person person) {
        WorkStatus workStatus;
        Context context = departmentPersonItemView.getContext();
        departmentPersonItemView.mo184656a();
        if (!person.isStudent()) {
            Chatter chatter = person.getChatter();
            LarkNameTag.Companion fVar = LarkNameTag.f62897a;
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            LarkNameTag.Builder a = fVar.mo90052a(context);
            InactiveParent inactiveParent = person.getInactiveParent();
            if ((chatter != null && !person.isParent() && !chatter.getRegistered()) || inactiveParent != null) {
                TextTag.Companion bVar = TextTag.f62987a;
                TextTag.Builder aVar = new TextTag.Builder();
                aVar.mo90139b(0);
                aVar.mo90143c(R.string.Lark_Legacy_TagUnregistered);
                aVar.mo90145d(R.color.lkui_N500);
                aVar.mo90147e(R.color.lkui_N200);
                LarkNameTag.Builder bVar2 = (LarkNameTag.Builder) ITagEditor.C25691a.m92166a((ITagEditor) a, aVar.mo90154l(), false, 2, (Object) null);
            }
            if (person.isSuperAdministrator()) {
                TextTag.Companion bVar3 = TextTag.f62987a;
                TextTag.Builder aVar2 = new TextTag.Builder();
                aVar2.mo90139b(50);
                aVar2.mo90143c(R.string.Lark_Core_SuperAdministratorLable);
                aVar2.mo90145d(R.color.lkui_P600);
                aVar2.mo90147e(R.color.lkui_P100);
                LarkNameTag.Builder bVar4 = (LarkNameTag.Builder) ITagEditor.C25691a.m92166a((ITagEditor) a, aVar2.mo90154l(), false, 2, (Object) null);
            } else if (person.isAdministrator()) {
                TextTag.Companion bVar5 = TextTag.f62987a;
                TextTag.Builder aVar3 = new TextTag.Builder();
                aVar3.mo90139b(50);
                aVar3.mo90143c(R.string.Lark_Core_RegularAdministratorLable);
                aVar3.mo90145d(R.color.lkui_B500);
                aVar3.mo90147e(R.color.lkui_B100);
                LarkNameTag.Builder bVar6 = (LarkNameTag.Builder) ITagEditor.C25691a.m92166a((ITagEditor) a, aVar3.mo90154l(), false, 2, (Object) null);
            }
            if (person.isLeader()) {
                TextTag.Companion bVar7 = TextTag.f62987a;
                TextTag.Builder aVar4 = new TextTag.Builder();
                aVar4.mo90139b(100);
                aVar4.mo90143c(R.string.Lark_Legacy_DepartmentLeaderTag);
                aVar4.mo90145d(R.color.lkui_B500);
                aVar4.mo90147e(R.color.lkui_B100);
                LarkNameTag.Builder bVar8 = (LarkNameTag.Builder) ITagEditor.C25691a.m92166a((ITagEditor) a, aVar4.mo90154l(), false, 2, (Object) null);
            }
            if (!(person.getChatterTagInfo() == null || person.getChatterTagInfo().mo130573a() == null)) {
                m140513a(a, person.getChatterTagInfo().mo130573a());
            }
            departmentPersonItemView.mo184663a(a, 1);
            LarkNameTag.Builder a2 = LarkNameTag.f62897a.mo90052a(context);
            if (chatter != null) {
                workStatus = chatter.getWorkStatus();
            } else {
                workStatus = null;
            }
            if (!WorkStatus.isInvalid(workStatus)) {
                Intrinsics.checkExpressionValueIsNotNull(chatter, "chatter");
                String displayTextNoDuration = chatter.getWorkStatus().getDisplayTextNoDuration(context);
                TextTag.Companion bVar9 = TextTag.f62987a;
                TextTag.Builder aVar5 = new TextTag.Builder();
                aVar5.mo90139b(100);
                aVar5.mo90136a(displayTextNoDuration);
                aVar5.mo90145d(R.color.LARK_TAG_TEXT_RED);
                aVar5.mo90147e(R.color.LARK_TAG_TEXT_READ_BG);
                LarkNameTag.Builder bVar10 = (LarkNameTag.Builder) ITagEditor.C25691a.m92166a((ITagEditor) a, aVar5.mo90154l(), false, 2, (Object) null);
            }
            departmentPersonItemView.mo184663a(a2, 2);
        }
    }

    public SchoolPersonItemBinder(ISelectDependency cVar, IPersonDependency bVar, AbstractC35856a aVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "selectDependency");
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        AbstractC35361b a = C35358a.m138143a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ContactModule.getDependency()");
        this.f92750a = a.mo130165j();
        this.f92751b = new DepartmentPersonItemBinder(cVar, bVar, aVar);
    }
}
