package com.ss.android.lark.pin.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.component.ui.layout.LKUIConstraintLayout;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.p1400a.C29520a;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.p1820e.C36913c;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.statistics.PinAppreciableHitPoint;
import com.ss.android.lark.pin.impl.v3.C51527b;
import com.ss.android.lark.pin.impl.v3.ChatPinView2;
import com.ss.android.lark.pin.p2466a.AbstractC51472a;

/* renamed from: com.ss.android.lark.pin.impl.c */
public class C51499c extends C29520a {

    /* renamed from: b */
    public View f128163b;

    /* renamed from: c */
    private BasePinPresenter f128164c;

    /* renamed from: d */
    private LKUIConstraintLayout f128165d;

    /* renamed from: e */
    private String f128166e = "";

    /* renamed from: f */
    private String f128167f = "";

    /* renamed from: g */
    private int f128168g;

    /* renamed from: h */
    private int f128169h;

    /* renamed from: i */
    private int f128170i;

    /* renamed from: j */
    private boolean f128171j;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.pin.impl.c$a */
    public class C51500a implements ChatPinView2.AbstractC51519a {

        /* renamed from: b */
        private final AbstractC51472a.AbstractC51474b f128173b = PinModule.m199585b().mo144035i();

        @Override // com.ss.android.lark.pin.impl.v3.ChatPinView2.AbstractC51519a
        /* renamed from: a */
        public void mo177347a() {
            C51499c.this.finish();
        }

        C51500a() {
        }

        @Override // com.ss.android.lark.pin.impl.v3.ChatPinView2.AbstractC51519a
        /* renamed from: a */
        public void mo177349a(ChatPinView2 chatPinView2) {
            ButterKnife.bind(chatPinView2, C51499c.this.f128163b);
        }

        @Override // com.ss.android.lark.pin.impl.v3.ChatPinView2.AbstractC51519a
        /* renamed from: a */
        public void mo177348a(PinInfo bVar) {
            PinModule.m199585b().mo144017a(C51499c.this.getActivity(), bVar.mo177396g());
        }

        @Override // com.ss.android.lark.pin.impl.v3.ChatPinView2.AbstractC51519a
        /* renamed from: b */
        public void mo177350b(PinInfo bVar) {
            this.f128173b.mo144066a(C51499c.this.getActivity(), (MergeForwardContent) bVar.mo177396g().getContent(), -1, bVar.mo177396g().getChatId());
        }

        @Override // com.ss.android.lark.pin.impl.v3.ChatPinView2.AbstractC51519a
        /* renamed from: c */
        public void mo177351c(PinInfo bVar) {
            this.f128173b.mo144071a((Context) C51499c.this.getActivity(), bVar.mo177396g().getChatId(), bVar.mo177396g().getPosition(), false);
        }

        @Override // com.ss.android.lark.pin.impl.v3.ChatPinView2.AbstractC51519a
        /* renamed from: d */
        public void mo177352d(PinInfo bVar) {
            PinModule.m199585b().mo144026b(C51499c.this.getActivity(), bVar.mo177396g());
        }

        @Override // com.ss.android.lark.pin.impl.v3.ChatPinView2.AbstractC51519a
        /* renamed from: e */
        public void mo177353e(PinInfo bVar) {
            PinModule.m199585b().mo144029c(C51499c.this.getActivity(), bVar.mo177396g());
        }

        @Override // com.ss.android.lark.pin.impl.v3.ChatPinView2.AbstractC51519a
        /* renamed from: f */
        public void mo177354f(PinInfo bVar) {
            this.f128173b.mo144070a(C51499c.this.getActivity(), bVar.mo177396g().getThreadId(), bVar.mo177396g().getThreadPosition());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        KeyboardUtils.hideKeyboard(this.mContext);
        BasePinPresenter aVar = this.f128164c;
        if (aVar != null) {
            aVar.mo177330a();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        C36913c.m145732a(this.mContext).mo136286a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        BasePinPresenter aVar = this.f128164c;
        if (aVar != null) {
            aVar.destroy();
            this.f128164c = null;
        }
        LKUIConstraintLayout lKUIConstraintLayout = this.f128165d;
        if (lKUIConstraintLayout != null) {
            lKUIConstraintLayout.unRegisterPlus(ChatPinDrawEventPlus.class);
        }
        C36913c.m145732a(this.mContext).mo136289b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!this.f128171j) {
            this.f128171j = true;
            PinModule.m199585b().mo144035i().mo144077a(false);
        }
    }

    /* renamed from: e */
    private boolean m199774e() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return false;
        }
        this.f128166e = arguments.getString("key_chat_id");
        this.f128167f = arguments.getString("key_chat_owner_id");
        this.f128170i = arguments.getInt("key_chatter_count", 0);
        this.f128169h = arguments.getInt("key_chat_type", 0);
        int i = arguments.getInt("key_from");
        this.f128168g = i;
        if (i > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private void m199775f() {
        boolean z;
        int i;
        String str;
        String str2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("key_chat_owner_id");
            String string2 = arguments.getString("key_chat_id");
            int i2 = arguments.getInt("key_from");
            str = string;
            z = arguments.getBoolean("key_is_super_group", false);
            str2 = string2;
            i = i2;
        } else {
            str2 = "";
            str = str2;
            i = 0;
            z = false;
        }
        C51527b bVar = new C51527b(getActivity(), new C51500a(), str2, str, i, this.f128170i, z);
        this.f128164c = bVar;
        bVar.create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        PinAppreciableHitPoint.f128210a.mo177430g();
        m199775f();
        PinAppreciableHitPoint.f128210a.mo177428e();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!m199774e()) {
            finish();
            return null;
        }
        PinAppreciableHitPoint.f128210a.mo177423a(this.f128169h, this.f128166e, this.f128170i);
        PinAppreciableHitPoint.f128210a.mo177427d();
        PinAppreciableHitPoint.f128210a.mo177429f();
        View view = this.f128163b;
        if (view == null) {
            this.f128163b = layoutInflater.inflate(R.layout.activity_chat_pin_layout2, viewGroup, false);
        } else if (view.getParent() != null) {
            ((ViewGroup) this.f128163b.getParent()).removeView(this.f128163b);
        }
        LKUIConstraintLayout lKUIConstraintLayout = (LKUIConstraintLayout) this.f128163b.findViewById(R.id.root_view);
        this.f128165d = lKUIConstraintLayout;
        lKUIConstraintLayout.registerPlus(ChatPinDrawEventPlus.class);
        return this.f128163b;
    }
}
