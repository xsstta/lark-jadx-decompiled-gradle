package com.ss.android.lark.threadwindow;

import com.larksuite.component.ui.tag.C25694f;
import com.larksuite.component.ui.tag.DefaultTagProvider;
import com.larksuite.component.ui.tag.TextTag;
import com.larksuite.suite.R;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/threadwindow/ThreadWindowTagProvider;", "Lcom/larksuite/component/ui/tag/DefaultTagProvider;", "()V", "allStaffTag", "Lcom/larksuite/component/ui/tag/TextTag;", "getAllStaffTag", "()Lcom/larksuite/component/ui/tag/TextTag;", "departmentTag", "getDepartmentTag", "externalTag", "getExternalTag", "kaTag", "getKaTag", "publicTag", "getPublicTag", "superTag", "getSuperTag", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.threadwindow.k */
public final class ThreadWindowTagProvider extends DefaultTagProvider {

    /* renamed from: a */
    private final TextTag f138875a;

    /* renamed from: b */
    private final TextTag f138876b;

    /* renamed from: c */
    private final TextTag f138877c;

    /* renamed from: d */
    private final TextTag f138878d;

    /* renamed from: e */
    private final TextTag f138879e;

    /* renamed from: f */
    private final TextTag f138880f;

    @Override // com.larksuite.component.ui.tag.ITagProvider, com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: n */
    public TextTag mo89974n() {
        return this.f138875a;
    }

    @Override // com.larksuite.component.ui.tag.ITagProvider, com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: o */
    public TextTag mo89975o() {
        return this.f138880f;
    }

    @Override // com.larksuite.component.ui.tag.ITagProvider, com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: p */
    public TextTag mo89976p() {
        return this.f138876b;
    }

    @Override // com.larksuite.component.ui.tag.ITagProvider, com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: q */
    public TextTag mo89977q() {
        return this.f138877c;
    }

    @Override // com.larksuite.component.ui.tag.ITagProvider, com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: r */
    public TextTag mo89978r() {
        return this.f138878d;
    }

    @Override // com.larksuite.component.ui.tag.ITagProvider, com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: s */
    public TextTag mo89979s() {
        return this.f138879e;
    }

    public ThreadWindowTagProvider() {
        TextTag.Companion bVar = TextTag.f62987a;
        TextTag.Builder aVar = new TextTag.Builder();
        aVar.mo90134a(C25694f.f62931c.mo90125a());
        aVar.mo90139b(C25694f.f62931c.mo90128b());
        aVar.mo90143c(R.string.Lark_Legacy_External);
        aVar.mo90145d(R.color.lkui_N700);
        aVar.mo90147e(R.color.lkui_N200);
        this.f138875a = aVar.mo90154l();
        TextTag.Companion bVar2 = TextTag.f62987a;
        TextTag.Builder aVar2 = new TextTag.Builder();
        aVar2.mo90134a(C25694f.f62934f.mo90125a());
        aVar2.mo90139b(C25694f.f62934f.mo90128b());
        aVar2.mo90143c(R.string.Lark_Legacy_TagDepartment);
        aVar2.mo90145d(R.color.lkui_N700);
        aVar2.mo90147e(R.color.lkui_N200);
        this.f138876b = aVar2.mo90154l();
        TextTag.Companion bVar3 = TextTag.f62987a;
        TextTag.Builder aVar3 = new TextTag.Builder();
        aVar3.mo90134a(C25694f.m92283f().mo90125a());
        aVar3.mo90139b(C25694f.m92283f().mo90128b());
        aVar3.mo90143c(R.string.Lark_Supergroups_Supergroup);
        aVar3.mo90145d(R.color.lkui_N700);
        aVar3.mo90147e(R.color.lkui_N200);
        this.f138877c = aVar3.mo90154l();
        TextTag.Companion bVar4 = TextTag.f62987a;
        TextTag.Builder aVar4 = new TextTag.Builder();
        aVar4.mo90134a(C25694f.f62933e.mo90125a());
        aVar4.mo90139b(C25694f.f62933e.mo90128b());
        aVar4.mo90143c(R.string.Lark_Legacy_TagAllStaff);
        aVar4.mo90145d(R.color.lkui_N700);
        aVar4.mo90147e(R.color.lkui_N200);
        this.f138878d = aVar4.mo90154l();
        TextTag.Companion bVar5 = TextTag.f62987a;
        TextTag.Builder aVar5 = new TextTag.Builder();
        aVar5.mo90134a(C25694f.f62932d.mo90125a());
        aVar5.mo90139b(C25694f.f62932d.mo90128b());
        aVar5.mo90143c(R.string.Lark_Group_CreateGroup_TypeSwitch_Public);
        aVar5.mo90145d(R.color.lkui_N700);
        aVar5.mo90147e(R.color.lkui_N200);
        this.f138879e = aVar5.mo90154l();
        TextTag.Companion bVar6 = TextTag.f62987a;
        TextTag.Builder aVar6 = new TextTag.Builder();
        aVar6.mo90134a(C25694f.f62930b.mo90125a());
        aVar6.mo90139b(C25694f.f62930b.mo90128b());
        aVar6.mo90143c(R.string.Lark_Group_ConnectGroupLabel);
        aVar6.mo90145d(R.color.lkui_N700);
        aVar6.mo90147e(R.color.lkui_N200);
        this.f138880f = aVar6.mo90154l();
    }
}
