package com.ss.android.lark.member_manage.impl.base.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.avatar.v2.ChatterAvatar;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.component.ui.tag.TextTag;
import com.larksuite.component.ui.tag.v2.ITagEditor;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.TagFilterRule;
import com.ss.android.lark.chat.entity.chatter.TagInfo;
import com.ss.android.lark.chat.entity.chatter.WorkStatus;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.C45085e;
import com.ss.android.lark.searchcommon.view.avataritem.AvatarItemView;
import com.ss.android.lark.searchcommon.view.avataritem.personalstatus.PersonalStatus;
import com.ss.android.lark.searchcommon.view.avataritem.title.TitleModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\u00022\u0006\u0010*\u001a\u00020+H\u0016J\u0018\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\u0018\u00101\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0002H\u0002J\u0018\u00102\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0002H\u0002R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00063"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/base/adapter/SelectMemberBinder;", "Lcom/ss/android/lark/member_manage/impl/base/adapter/IAdapterBinder;", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "Lcom/ss/android/lark/member_manage/impl/base/adapter/GroupMemberManageViewHolder;", "context", "Landroid/content/Context;", "binder", "Lcom/ss/android/lark/member_manage/impl/base/adapter/IFuncBinder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "(Landroid/content/Context;Lcom/ss/android/lark/member_manage/impl/base/adapter/IFuncBinder;)V", "getBinder", "()Lcom/ss/android/lark/member_manage/impl/base/adapter/IFuncBinder;", "setBinder", "(Lcom/ss/android/lark/member_manage/impl/base/adapter/IFuncBinder;)V", "getContext", "()Landroid/content/Context;", "onLongClickListener", "Lcom/ss/android/lark/member_manage/impl/base/adapter/IFuncBinder$OnItemLongClickListener;", "getOnLongClickListener", "()Lcom/ss/android/lark/member_manage/impl/base/adapter/IFuncBinder$OnItemLongClickListener;", "setOnLongClickListener", "(Lcom/ss/android/lark/member_manage/impl/base/adapter/IFuncBinder$OnItemLongClickListener;)V", "onSelectChangeListener", "Lcom/ss/android/lark/member_manage/impl/base/adapter/IFuncBinder$OnSelectChangeListener;", "getOnSelectChangeListener", "()Lcom/ss/android/lark/member_manage/impl/base/adapter/IFuncBinder$OnSelectChangeListener;", "setOnSelectChangeListener", "(Lcom/ss/android/lark/member_manage/impl/base/adapter/IFuncBinder$OnSelectChangeListener;)V", "onUnSelectedItemClickListener", "Lcom/ss/android/lark/member_manage/impl/base/adapter/IFuncBinder$OnUnSelectedItemClickListener;", "getOnUnSelectedItemClickListener", "()Lcom/ss/android/lark/member_manage/impl/base/adapter/IFuncBinder$OnUnSelectedItemClickListener;", "setOnUnSelectedItemClickListener", "(Lcom/ss/android/lark/member_manage/impl/base/adapter/IFuncBinder$OnUnSelectedItemClickListener;)V", "getItemId", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onBindViewHolder", "", "holder", "item", "showShadow", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "setClickListener", "setLongClickListener", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.base.adapter.h */
public final class SelectMemberBinder implements IAdapterBinder<C45084c, C45047e> {

    /* renamed from: a */
    public IFuncBinder.AbstractC45039b f114060a;

    /* renamed from: b */
    public IFuncBinder.AbstractC45040c f114061b;

    /* renamed from: c */
    private IFuncBinder.AbstractC45038a f114062c;

    /* renamed from: d */
    private final Context f114063d;

    /* renamed from: e */
    private IFuncBinder<RecyclerView.ViewHolder, Object> f114064e;

    /* renamed from: c */
    public final IFuncBinder.AbstractC45038a mo159369c() {
        return this.f114062c;
    }

    /* renamed from: d */
    public final IFuncBinder<RecyclerView.ViewHolder, Object> mo159370d() {
        return this.f114064e;
    }

    /* renamed from: b */
    public final IFuncBinder.AbstractC45040c mo159368b() {
        IFuncBinder.AbstractC45040c cVar = this.f114061b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onUnSelectedItemClickListener");
        }
        return cVar;
    }

    /* renamed from: a */
    public final IFuncBinder.AbstractC45039b mo159361a() {
        IFuncBinder.AbstractC45039b bVar = this.f114060a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onSelectChangeListener");
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo159363a(IFuncBinder.AbstractC45038a aVar) {
        this.f114062c = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.base.adapter.h$b */
    public static final class View$OnLongClickListenerC45050b implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ SelectMemberBinder f114067a;

        /* renamed from: b */
        final /* synthetic */ C45084c f114068b;

        View$OnLongClickListenerC45050b(SelectMemberBinder hVar, C45084c cVar) {
            this.f114067a = hVar;
            this.f114068b = cVar;
        }

        public final boolean onLongClick(View view) {
            this.f114067a.mo159370d().mo159328a(this.f114068b, this.f114067a.mo159369c());
            return true;
        }
    }

    /* renamed from: a */
    public long mo159342a(C45084c cVar) {
        int i;
        if (cVar != null) {
            i = cVar.hashCode();
        } else {
            i = 1822972960;
        }
        return (long) i;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.base.adapter.h$a */
    public static final class View$OnClickListenerC45049a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SelectMemberBinder f114065a;

        /* renamed from: b */
        final /* synthetic */ C45084c f114066b;

        View$OnClickListenerC45049a(SelectMemberBinder hVar, C45084c cVar) {
            this.f114065a = hVar;
            this.f114066b = cVar;
        }

        public final void onClick(View view) {
            if (this.f114065a.mo159370d().mo159331a(this.f114066b)) {
                C45084c cVar = this.f114066b;
                cVar.mo159503b(!cVar.mo159504b());
                this.f114065a.mo159370d().mo159329a(this.f114066b, this.f114065a.mo159361a());
                return;
            }
            this.f114065a.mo159370d().mo159330a(this.f114066b, this.f114065a.mo159368b());
        }
    }

    /* renamed from: a */
    public final void mo159364a(IFuncBinder.AbstractC45039b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "<set-?>");
        this.f114060a = bVar;
    }

    /* renamed from: a */
    public final void mo159365a(IFuncBinder.AbstractC45040c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "<set-?>");
        this.f114061b = cVar;
    }

    /* renamed from: a */
    public final void mo159366a(IFuncBinder<RecyclerView.ViewHolder, Object> iFuncBinder) {
        Intrinsics.checkParameterIsNotNull(iFuncBinder, "<set-?>");
        this.f114064e = iFuncBinder;
    }

    /* renamed from: a */
    private final void m178660a(C45047e eVar, C45084c cVar) {
        eVar.f114059a.setOnClickListener(new View$OnClickListenerC45049a(this, cVar));
    }

    /* renamed from: b */
    private final void m178661b(C45047e eVar, C45084c cVar) {
        eVar.f114059a.setOnLongClickListener(new View$OnLongClickListenerC45050b(this, cVar));
    }

    public SelectMemberBinder(Context context, IFuncBinder<RecyclerView.ViewHolder, Object> iFuncBinder) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(iFuncBinder, "binder");
        this.f114063d = context;
        this.f114064e = iFuncBinder;
    }

    /* renamed from: a */
    public C45047e mo159346b(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Context context = viewGroup.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
        AvatarItemView avatarItemView = new AvatarItemView(context, null, 0, null, 14, null);
        avatarItemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        if (DesktopUtil.m144307b()) {
            avatarItemView.mo184657a(R.style.AvatarItemDesktop);
        }
        return new C45047e(avatarItemView);
    }

    /* renamed from: a */
    public void mo159344a(C45047e eVar, C45084c cVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Intrinsics.checkParameterIsNotNull(eVar, "holder");
        if (cVar != null) {
            C45085e g = cVar.mo159512g();
            AvatarItemView avatarItemView = eVar.f114059a;
            ChatterAvatar.Builder aVar = new ChatterAvatar.Builder();
            Intrinsics.checkExpressionValueIsNotNull(g, "chatterInfo");
            avatarItemView.mo184662a(((ChatterAvatar.Builder) ((ChatterAvatar.Builder) aVar.mo89081c(g.mo159522a()).mo88962a(g.mo159526b())).mo88967b(g.mo159522a())).mo88976k());
            if (CollectionUtils.isEmpty(g.mo159528d())) {
                eVar.f114059a.mo184670a(new TitleModel(g.mo159527c(), false, null, 0, 14, null));
            } else {
                eVar.f114059a.mo184670a(new TitleModel(g.mo159527c(), true, g.mo159528d(), 0, 8, null));
            }
            AvatarItemView avatarItemView2 = eVar.f114059a;
            C45085e g2 = cVar.mo159512g();
            Intrinsics.checkExpressionValueIsNotNull(g2, "item.chatterInfo");
            avatarItemView2.mo184667a(new PersonalStatus(g2.mo159541o()));
            LarkNameTag.ChatterTagBuilder b = LarkNameTag.f62897a.mo90054c(this.f114063d).mo90051i(g.mo159532g()).mo90046b(GroupMemberManageModule.m177902a().isInZenMode(g.mo159537k()));
            if (g.mo159529e() == Chatter.ChatterType.BOT) {
                z2 = true;
            } else {
                z2 = false;
            }
            LarkNameTag.ChatterTagBuilder a = b.mo90045a(z2);
            if (g.mo159531f() || g.mo159529e() != Chatter.ChatterType.USER) {
                z3 = false;
            } else {
                z3 = true;
            }
            LarkNameTag.ChatterTagBuilder e = a.mo90048f(z3).mo90047e(g.mo159536j());
            if (!this.f114064e.mo159332b() || !cVar.mo159508d()) {
                z4 = false;
            } else {
                z4 = true;
            }
            LarkNameTag.ChatterTagBuilder g3 = e.mo90049g(z4);
            if (!this.f114064e.mo159332b() || !cVar.mo159509e()) {
                z5 = false;
            } else {
                z5 = true;
            }
            LarkNameTag.ChatterTagBuilder h = g3.mo90050h(z5);
            if (cVar.mo159506c()) {
                TextTag.Companion bVar = TextTag.f62987a;
                TextTag.Builder aVar2 = new TextTag.Builder();
                aVar2.mo90143c(R.string.Lark_Legacy_UnreadLabel);
                aVar2.mo90145d(R.color.text_placeholder);
                aVar2.mo90147e(R.color.bg_body_overlay);
                LarkNameTag.Builder bVar2 = (LarkNameTag.Builder) ITagEditor.C25691a.m92166a((ITagEditor) h, aVar2.mo90154l(), false, 2, (Object) null);
            }
            if (!WorkStatus.isInvalid(g.mo159535i())) {
                TextTag.Companion bVar3 = TextTag.f62987a;
                TextTag.Builder aVar3 = new TextTag.Builder();
                aVar3.mo90139b(0);
                aVar3.mo90136a(g.mo159535i().getDisplayTextNoDuration(this.f114063d));
                aVar3.mo90145d(R.color.function_danger_500);
                aVar3.mo90147e(R.color.function_danger_100);
                LarkNameTag.Builder bVar4 = (LarkNameTag.Builder) ITagEditor.C25691a.m92166a((ITagEditor) h, aVar3.mo90154l(), false, 2, (Object) null);
            }
            C45085e g4 = cVar.mo159512g();
            Intrinsics.checkExpressionValueIsNotNull(g4, "item.chatterInfo");
            List<TagInfo> p = g4.mo159542p();
            if (p != null) {
                TagInfo.Companion.mo124877a(h, p, TagFilterRule.m131800a());
            }
            eVar.f114059a.setTag(h);
            eVar.f114059a.mo184680b(!z);
            m178660a(eVar, cVar);
            m178661b(eVar, cVar);
            this.f114064e.mo159327a(eVar, cVar);
        }
    }
}
