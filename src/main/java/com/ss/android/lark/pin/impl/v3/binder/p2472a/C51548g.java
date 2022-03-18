package com.ss.android.lark.pin.impl.v3.binder.p2472a;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.larksuite.component.ui.avatar.AvatarType;
import com.larksuite.component.ui.avatar.FeedAvatarModel;
import com.larksuite.component.ui.avatar.LarkAvatar;
import com.larksuite.component.ui.badge.miniicon.MiniIconModel;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.ShareGroupChatContent;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.impl.C51502e;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;
import com.ss.android.lark.pin.impl.v3.binder.viewholder.C51609c;
import com.ss.android.lark.pin.p2466a.AbstractC51472a;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.g */
public class C51548g extends AbstractC51540b<C51609c> {

    /* renamed from: a */
    private AbstractC51472a.AbstractC51474b f128325a = PinModule.m199585b().mo144035i();

    /* renamed from: a */
    private void m200062a(C51609c cVar) {
        C25649b.m91853a(cVar.f128425m, 32);
        C25649b.m91857a(cVar.f128426n, LarkFont.HEADLINE);
        C25649b.m91857a(cVar.f128427o, LarkFont.BODY1);
        C25649b.m91857a(cVar.f128428p, LarkFont.BODY1);
    }

    /* renamed from: a */
    public C51609c mo31176b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C51609c.C51611a.m200244a(layoutInflater, viewGroup);
    }

    public C51548g(Context context, C51502e.AbstractC51506c cVar) {
        super(context, cVar);
    }

    /* renamed from: b */
    private void m200063b(C51609c cVar, PinInfo bVar) {
        Message g = bVar.mo177396g();
        if (g != null && g.getContent() != null) {
            MiniIconModel eVar = null;
            cVar.f128429q.setBackground(null);
            Chat chat = ((ShareGroupChatContent) g.getContent()).getChat();
            if (chat != null) {
                String avatarKey = chat.getAvatarKey();
                String entityId = chat.getEntityId();
                if (LarkAvatar.m91600a()) {
                    FeedAvatarModel gVar = new FeedAvatarModel();
                    gVar.mo89008b(avatarKey);
                    gVar.mo89011c(entityId);
                    if (chat.isThread()) {
                        eVar = new MiniIconModel(AvatarType.THRED);
                    }
                    LarkAvatar.m91597a(this.f146181d).mo89065a(gVar).mo89064a(eVar).mo89068a(cVar.f128425m);
                } else {
                    PinModule.m199585b().mo144032f().mo144055a(this.f146181d, avatarKey, entityId, cVar.f128425m, UIHelper.dp2px(40.0f), UIHelper.dp2px(40.0f));
                }
                String description = chat.getDescription();
                String name = chat.getName();
                if (TextUtils.isEmpty(description)) {
                    cVar.f128426n.setMaxLines(2);
                    cVar.f128427o.setVisibility(8);
                } else {
                    cVar.f128426n.setMaxLines(1);
                    cVar.f128427o.setVisibility(0);
                    cVar.f128427o.setText(description);
                }
                cVar.f128426n.setText(name);
                this.f128325a.mo144068a(this.f146181d, cVar.f128428p, g);
                this.f128325a.mo144067a(this.f146181d, cVar.f128430r, g);
                boolean z = !bVar.mo177391b();
                if (!z) {
                    cVar.f128428p.setTextColor(UIUtils.getColor(this.f146181d, R.color.text_placeholder));
                }
                cVar.f128428p.setEnabled(z);
                cVar.f128430r.setEnabled(z);
                if (!DesktopUtil.m144307b()) {
                    m200062a(cVar);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo177530a(C51609c cVar, PinInfo bVar) {
        super.mo177530a((AbstractC51540b.C51541a) cVar, bVar);
        cVar.f128429q.setOnLongClickListener(mo177529a(bVar));
        cVar.f128430r.setOnLongClickListener(mo177529a(bVar));
        cVar.f128428p.setOnLongClickListener(mo177529a(bVar));
    }

    /* renamed from: a */
    public void mo177520a(C51609c cVar, int i, PinInfo bVar) {
        super.mo31174a((AbstractC51540b.C51541a) cVar, i, bVar);
        m200063b(cVar, bVar);
    }
}
