package com.ss.android.lark.chat.chatwindow.chat;

import android.content.Context;
import com.larksuite.component.ui.tag.C25694f;
import com.larksuite.component.ui.tag.DefaultTagProvider;
import com.larksuite.component.ui.tag.DrawableStateSet;
import com.larksuite.component.ui.tag.IconTag;
import com.larksuite.component.ui.tag.TextTag;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.tag.UDTagsDrawable;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/SecretTagProvider;", "Lcom/larksuite/component/ui/tag/DefaultTagProvider;", "()V", "allStaffTag", "Lcom/larksuite/component/ui/tag/TextTag;", "getAllStaffTag", "()Lcom/larksuite/component/ui/tag/TextTag;", "departmentTag", "getDepartmentTag", "externalTag", "getExternalTag", "noDisturbTag", "Lcom/larksuite/component/ui/tag/IconTag;", "getNoDisturbTag", "()Lcom/larksuite/component/ui/tag/IconTag;", "officialTag", "getOfficialTag", "publicTag", "getPublicTag", "secretTag", "getSecretTag", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.o */
public final class SecretTagProvider extends DefaultTagProvider {

    /* renamed from: a */
    private final TextTag f86045a;

    /* renamed from: b */
    private final TextTag f86046b;

    /* renamed from: c */
    private final TextTag f86047c;

    /* renamed from: d */
    private final TextTag f86048d;

    /* renamed from: e */
    private final TextTag f86049e;

    /* renamed from: f */
    private final IconTag f86050f;

    /* renamed from: g */
    private final IconTag f86051g;

    @Override // com.larksuite.component.ui.tag.ITagProvider, com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: b */
    public IconTag mo89962b() {
        return this.f86051g;
    }

    @Override // com.larksuite.component.ui.tag.ITagProvider, com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: g */
    public TextTag mo89967g() {
        return this.f86045a;
    }

    @Override // com.larksuite.component.ui.tag.ITagProvider, com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: h */
    public IconTag mo89968h() {
        return this.f86050f;
    }

    @Override // com.larksuite.component.ui.tag.ITagProvider, com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: n */
    public TextTag mo89974n() {
        return this.f86046b;
    }

    @Override // com.larksuite.component.ui.tag.ITagProvider, com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: p */
    public TextTag mo89976p() {
        return this.f86047c;
    }

    @Override // com.larksuite.component.ui.tag.ITagProvider, com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: r */
    public TextTag mo89978r() {
        return this.f86048d;
    }

    @Override // com.larksuite.component.ui.tag.ITagProvider, com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: s */
    public TextTag mo89979s() {
        return this.f86049e;
    }

    public SecretTagProvider() {
        TextTag.Companion bVar = TextTag.f62987a;
        TextTag.Builder aVar = new TextTag.Builder();
        aVar.mo90134a(C25694f.f62929a.mo90125a());
        aVar.mo90139b(C25694f.f62929a.mo90128b());
        aVar.mo90143c(R.string.Lark_Chat_OfficialTag);
        aVar.mo90145d(R.color.imtoken_secret_blue_tag_text);
        aVar.mo90147e(R.color.imtoken_secret_blue_tag_bg);
        this.f86045a = aVar.mo90154l();
        TextTag.Companion bVar2 = TextTag.f62987a;
        TextTag.Builder aVar2 = new TextTag.Builder();
        aVar2.mo90134a(C25694f.f62931c.mo90125a());
        aVar2.mo90139b(C25694f.f62931c.mo90128b());
        aVar2.mo90143c(R.string.Lark_Legacy_External);
        aVar2.mo90145d(R.color.imtoken_secret_blue_tag_text);
        aVar2.mo90147e(R.color.imtoken_secret_blue_tag_bg);
        this.f86046b = aVar2.mo90154l();
        TextTag.Companion bVar3 = TextTag.f62987a;
        TextTag.Builder aVar3 = new TextTag.Builder();
        aVar3.mo90134a(C25694f.f62934f.mo90125a());
        aVar3.mo90139b(C25694f.f62934f.mo90128b());
        aVar3.mo90143c(R.string.Lark_Legacy_TagDepartment);
        aVar3.mo90145d(R.color.imtoken_secret_blue_tag_text);
        aVar3.mo90147e(R.color.imtoken_secret_blue_tag_bg);
        this.f86047c = aVar3.mo90154l();
        TextTag.Companion bVar4 = TextTag.f62987a;
        TextTag.Builder aVar4 = new TextTag.Builder();
        aVar4.mo90134a(C25694f.f62933e.mo90125a());
        aVar4.mo90139b(C25694f.f62933e.mo90128b());
        aVar4.mo90143c(R.string.Lark_Legacy_TagAllStaff);
        aVar4.mo90145d(R.color.imtoken_secret_blue_tag_text);
        aVar4.mo90147e(R.color.imtoken_secret_blue_tag_bg);
        this.f86048d = aVar4.mo90154l();
        TextTag.Companion bVar5 = TextTag.f62987a;
        TextTag.Builder aVar5 = new TextTag.Builder();
        aVar5.mo90134a(C25694f.f62932d.mo90125a());
        aVar5.mo90139b(C25694f.f62932d.mo90128b());
        aVar5.mo90143c(R.string.Lark_Group_CreateGroup_TypeSwitch_Public);
        aVar5.mo90145d(R.color.imtoken_secret_blue_tag_text);
        aVar5.mo90147e(R.color.imtoken_secret_blue_tag_bg);
        this.f86049e = aVar5.mo90154l();
        IconTag.Companion bVar6 = IconTag.f62887a;
        IconTag.Builder aVar6 = new IconTag.Builder();
        aVar6.mo89993a(C25694f.f62940l.mo89986a());
        aVar6.mo89996b(C25694f.f62940l.mo89988b());
        aVar6.mo89994a(C33416a.INSTANCE);
        this.f86050f = aVar6.mo90001f();
        IconTag.Companion bVar7 = IconTag.f62887a;
        IconTag.Builder aVar7 = new IconTag.Builder();
        aVar7.mo89993a(C25694f.f62936h.mo89986a());
        aVar7.mo89996b(C25694f.f62936h.mo89988b());
        aVar7.mo89994a(C33417b.INSTANCE);
        this.f86051g = aVar7.mo90001f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/larksuite/component/universe_design/tag/UDTagsDrawable;", "context", "Landroid/content/Context;", "<anonymous parameter 1>", "Lcom/larksuite/component/ui/tag/DrawableStateSet;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.o$a */
    static final class C33416a extends Lambda implements Function2<Context, DrawableStateSet, UDTagsDrawable> {
        public static final C33416a INSTANCE = new C33416a();

        C33416a() {
            super(2);
        }

        public final UDTagsDrawable invoke(Context context, DrawableStateSet drawableStateSet) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(drawableStateSet, "<anonymous parameter 1>");
            return new UDTagsDrawable.Builder(context).mo91384a(new UDTagsDrawable.TagModel.Builder(context).mo91416a(UDIconUtils.getIconDrawable(context, R.drawable.ud_icon_alerts_off_filled)).mo91424d(UDColorUtils.getColor(context, R.color.static_black_70)).mo91419b(UDColorUtils.getColor(context, R.color.imtoken_secret_icon_bg)).mo91427g()).mo91398i();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/larksuite/component/universe_design/tag/UDTagsDrawable;", "context", "Landroid/content/Context;", "<anonymous parameter 1>", "Lcom/larksuite/component/ui/tag/DrawableStateSet;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.o$b */
    static final class C33417b extends Lambda implements Function2<Context, DrawableStateSet, UDTagsDrawable> {
        public static final C33417b INSTANCE = new C33417b();

        C33417b() {
            super(2);
        }

        public final UDTagsDrawable invoke(Context context, DrawableStateSet drawableStateSet) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(drawableStateSet, "<anonymous parameter 1>");
            return new UDTagsDrawable.Builder(context).mo91384a(new UDTagsDrawable.TagModel.Builder(context).mo91416a(UDIconUtils.getIconDrawable(context, R.drawable.ud_icon_lock_chat_filled)).mo91424d(UDColorUtils.getColor(context, R.color.static_black_70)).mo91419b(UDColorUtils.getColor(context, R.color.imtoken_secret_icon_bg)).mo91427g()).mo91398i();
        }
    }
}
