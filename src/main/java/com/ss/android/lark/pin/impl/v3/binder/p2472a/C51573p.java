package com.ss.android.lark.pin.impl.v3.binder.p2472a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.impl.C51502e;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;
import com.ss.android.lark.pin.impl.v3.binder.viewholder.ProfileViewHolder;
import com.ss.android.lark.pin.p2466a.AbstractC51472a;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.p */
public class C51573p extends AbstractC51540b<ProfileViewHolder> {

    /* renamed from: a */
    private static int f128364a = DeviceUtils.getDpFromDimenXml(UIHelper.getContext(), R.dimen.avatar_width_chatter);

    /* renamed from: b */
    private AbstractC51472a.AbstractC51480g f128365b = PinModule.m199585b().mo144032f();

    /* renamed from: a */
    private void m200133a(ProfileViewHolder profileViewHolder) {
        C25649b.m91857a(profileViewHolder.mChatterNameTV, LarkFont.HEADLINE);
        C25649b.m91857a(profileViewHolder.mTagTV, LarkFont.CAPTION0);
        C25649b.m91853a(profileViewHolder.mAvatarIV, 48);
    }

    /* renamed from: a */
    public ProfileViewHolder mo31176b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ProfileViewHolder.C51599a.m200237a(layoutInflater, viewGroup);
    }

    public C51573p(Context context, C51502e.AbstractC51506c cVar) {
        super(context, cVar);
    }

    /* access modifiers changed from: private */
    @Override // com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b
    /* renamed from: a */
    public /* synthetic */ void m200132a(PinInfo bVar, View view) {
        PinModule.m199585b().mo144035i().mo144073a(this.f146181d, ((ProfileContent) bVar.mo177396g().getContent()).getId(), "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo177530a(ProfileViewHolder profileViewHolder, PinInfo bVar) {
        super.mo177530a((AbstractC51540b.C51541a) profileViewHolder, bVar);
        profileViewHolder.mContentView.setOnClickListener(new View.OnClickListener(bVar) {
            /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.$$Lambda$p$V_Rtl4YpB464kmMxdlKzvVoX6Vo */
            public final /* synthetic */ PinInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C51573p.lambda$V_Rtl4YpB464kmMxdlKzvVoX6Vo(C51573p.this, this.f$1, view);
            }
        });
        profileViewHolder.mContentView.setOnLongClickListener(mo177529a(bVar));
    }

    /* renamed from: a */
    public void mo177520a(ProfileViewHolder profileViewHolder, int i, PinInfo bVar) {
        super.mo31174a((AbstractC51540b.C51541a) profileViewHolder, i, bVar);
        ProfileContent profileContent = (ProfileContent) bVar.mo177396g().getContent();
        profileViewHolder.mChatterNameTV.setText(profileContent.getDisplayName());
        this.f128365b.mo144055a(this.f146181d, profileContent.getAvatarKey(), profileContent.getId(), profileViewHolder.mAvatarIV, UIHelper.dp2px((float) f128364a), UIHelper.dp2px((float) f128364a));
        if (!DesktopUtil.m144307b()) {
            m200133a(profileViewHolder);
        }
    }
}
