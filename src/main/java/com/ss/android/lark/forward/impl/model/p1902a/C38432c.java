package com.ss.android.lark.forward.impl.model.p1902a;

import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.C38389a;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.template.ForwardTargetFilter;
import com.ss.android.lark.forward.impl.model.packer.ForwardTargetParser;
import com.ss.android.lark.forward.impl.parser.ParserFactory;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.forward.impl.model.a.c */
public class C38432c {

    /* renamed from: a */
    private ParserFactory f98806a = new ParserFactory();

    /* renamed from: b */
    private ForwardTargetFilter f98807b;

    /* renamed from: com.ss.android.lark.forward.impl.model.a.c$a */
    enum EnumC38433a {
        FEED,
        SHORTCUT
    }

    public C38432c(ForwardTargetFilter forwardTargetFilter) {
        this.f98807b = forwardTargetFilter;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<SearchBaseInfo> mo140982a(C38431b bVar, EnumC38433a aVar) {
        ArrayList arrayList = new ArrayList();
        String b = C38364a.m151054a().mo140445g().mo140457b();
        for (C38389a aVar2 : bVar.f98805c) {
            if (!aVar2.mo140696o()) {
                Chat chat = bVar.f98803a.get(aVar2.mo140681g());
                if (chat != null && ((!this.f98807b.mo140831f() || chat.getType() != Chat.Type.GROUP) && ((!this.f98807b.mo140829e() || chat.getType() != Chat.Type.P2P) && (!this.f98807b.mo140824c() || chat.getType() != Chat.Type.GROUP)))) {
                    Chatter chatter = null;
                    if ((chat.getType() != Chat.Type.P2P || (chatter = bVar.f98804b.get(chat.getP2pChatterId())) == null || !chatter.isDimission()) && !aVar2.mo140674d()) {
                        if ((!aVar2.mo140677e() || !this.f98807b.mo140822b()) && (!this.f98807b.mo140820a() || !TextUtils.equals(chat.getP2pChatterId(), b))) {
                            ForwardTarget a = ForwardTargetParser.m151568a(chat);
                            if (!(a == null || chatter == null)) {
                                a.mo140566a(chatter.isBot());
                            }
                            if (this.f98807b.mo140832g() != null && this.f98807b.mo140832g().mo140837a(a)) {
                            }
                        }
                    }
                }
            } else if (this.f98807b.mo140835h()) {
            }
            SearchBaseInfo a2 = this.f98806a.mo140965a(aVar2);
            if (a2 != null) {
                if (aVar == EnumC38433a.FEED) {
                    a2.setHeaderId(1);
                    a2.setHeaderLabel(UIHelper.getString(R.string.Lark_Legacy_TableRecentchats));
                } else {
                    a2.setHeaderId(0);
                    a2.setHeaderLabel(UIHelper.getString(R.string.Lark_Legacy_TableQuickswitcher));
                }
                arrayList.add(a2);
            }
        }
        return arrayList;
    }
}
