package com.ss.android.lark.mail.impl.mailtoolbar.plugins.subpanel;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.document.toolbar.AbstractC6205b;
import com.bytedance.ee.bear.document.toolbar.AbstractC6212e;
import com.bytedance.ee.bear.document.toolbar.Item;
import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.compose.C41970e;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.C42815b;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.C42822e;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.MailItemId;
import com.ss.android.lark.mail.impl.utils.C43785p;
import com.ss.android.lark.mail.impl.widget.FontLayout;
import com.ss.android.lark.utils.C57764ab;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.subpanel.a */
public class C42803a extends AbstractC6205b {

    /* renamed from: e */
    static final /* synthetic */ boolean f108972e;

    /* renamed from: c */
    public TextView f108973c;

    /* renamed from: d */
    public MailTxtAttrId f108974d = MailTxtAttrId.FontNormal;

    /* renamed from: f */
    private C42815b f108975f;

    /* renamed from: g */
    private C42822e f108976g;

    /* renamed from: h */
    private FontLayout f108977h;

    /* renamed from: i */
    private FrameLayout f108978i;

    /* renamed from: j */
    private MailTxtAttrId f108979j = MailTxtAttrId.getDefaultFont();

    /* renamed from: k */
    private Item f108980k = null;

    /* renamed from: l */
    private View f108981l;

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6205b
    /* renamed from: f */
    public int mo22132f() {
        return R.layout.mail_toolbar_attribution_fragment;
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6205b
    /* renamed from: g */
    public ItemId mo22133g() {
        return MailItemId.attribution;
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6205b
    /* renamed from: h */
    public AbstractC6212e mo22134h() {
        return this.f108975f;
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6207c, androidx.fragment.app.Fragment
    public void onDestroy() {
        C41970e.m166941d().mo150950a(MailItemId.attribution, 0);
        super.onDestroy();
    }

    /* renamed from: l */
    private List<MailTxtAttrId> m170598l() {
        return Arrays.asList(MailTxtAttrId.FontSmall, MailTxtAttrId.FontNormal, MailTxtAttrId.FontLarge, MailTxtAttrId.FontHuge);
    }

    /* renamed from: k */
    private MailTxtAttrId m170597k() {
        for (MailTxtAttrId mailTxtAttrId : m170598l()) {
            Item a = mo25095a((ItemId) mailTxtAttrId);
            if (a != null && a.isSelected()) {
                return mailTxtAttrId;
            }
        }
        return null;
    }

    /* renamed from: j */
    public void mo153672j() {
        MailTxtAttrId mailTxtAttrId;
        Item item;
        String str = (String) this.f108973c.getTag(2022351188);
        MailTxtAttrId[] values = MailTxtAttrId.values();
        int length = values.length;
        int i = 0;
        while (true) {
            mailTxtAttrId = null;
            if (i >= length) {
                item = null;
                break;
            }
            mailTxtAttrId = values[i];
            if (mailTxtAttrId.name().equals(str)) {
                item = mo25095a((ItemId) mailTxtAttrId);
                break;
            }
            i++;
        }
        if (mailTxtAttrId == null) {
            mailTxtAttrId = MailTxtAttrId.getDefaultFont();
            item = mo25095a((ItemId) mailTxtAttrId);
        }
        if (item == null) {
            C13479a.m54758a("MailTxtAttrFragment", "selectFont while font item invalid ");
        }
        this.f108975f.processToolbarItemClick(this.f108979j, "true");
        this.f108976g.selectFont(getActivity(), new C42822e.C42824b(getString(R.string.Mail_Compose_FontPanel), mailTxtAttrId, MailTxtAttrId.getFontList()), new C42822e.AbstractC42823a() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.subpanel.$$Lambda$a$JlkRMKIofb7lTQk6vV__D34ebJA */

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.C42822e.AbstractC42823a
            public final void onFontSelected(MailTxtAttrId mailTxtAttrId) {
                C42803a.lambda$JlkRMKIofb7lTQk6vV__D34ebJA(C42803a.this, mailTxtAttrId);
            }
        });
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6207c, com.bytedance.ee.bear.document.toolbar.AbstractC6205b
    /* renamed from: i */
    public View mo22135i() {
        final View i = super.mo22135i();
        this.f108973c = (TextView) i.findViewById(R.id.fontFamilyName);
        i.findViewById(R.id.selectFont).setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.subpanel.C42803a.C428041 */

            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C42803a.this.mo153672j();
            }
        });
        ViewGroup viewGroup = (ViewGroup) getActivity().getWindow().getDecorView();
        if (viewGroup.findViewById(R.id.keyboardBubbleHolder) == null) {
            this.f108978i = new FrameLayout(getContext());
            this.f108978i.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            this.f108978i.setId(R.id.keyboardBubbleHolder);
            viewGroup.addView(this.f108978i);
        } else if (this.f108978i == null) {
            this.f108978i = (FrameLayout) viewGroup.findViewById(R.id.keyboardBubbleHolder);
        }
        viewGroup.findViewById(R.id.keyboardPlaceholder).getLocationOnScreen(new int[2]);
        FontLayout fontLayout = (FontLayout) i.findViewById(R.id.selectFontSize);
        this.f108977h = fontLayout;
        fontLayout.setFontChangeCallback(new FontLayout.AbstractC43984a() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.subpanel.C42803a.C428052 */

            @Override // com.ss.android.lark.mail.impl.widget.FontLayout.AbstractC43984a
            /* renamed from: a */
            public void mo153673a() {
            }

            @Override // com.ss.android.lark.mail.impl.widget.FontLayout.AbstractC43984a
            /* renamed from: b */
            public int mo153675b() {
                return i.getHeight();
            }

            @Override // com.ss.android.lark.mail.impl.widget.FontLayout.AbstractC43984a
            /* renamed from: a */
            public void mo153674a(String str) {
                C42803a aVar = C42803a.this;
                aVar.f108974d = aVar.mo153668a(str);
                C42803a aVar2 = C42803a.this;
                aVar2.mo153671b(aVar2.f108974d);
                C42803a aVar3 = C42803a.this;
                aVar3.mo153670a(aVar3.f108974d);
            }
        });
        MailTxtAttrId k = m170597k();
        this.f108974d = k;
        FontLayout fontLayout2 = this.f108977h;
        if (fontLayout2 != null) {
            if (k != null) {
                mo153670a(k);
                this.f108977h.setCurrentFont(this.f108974d.name());
            } else {
                fontLayout2.setCurrentFont("");
            }
        }
        m170594a(i);
        return i;
    }

    /* renamed from: a */
    public void mo153670a(MailTxtAttrId mailTxtAttrId) {
        C42815b bVar = this.f108975f;
        if (bVar != null) {
            bVar.onFontChange(mailTxtAttrId);
        }
    }

    /* renamed from: a */
    private void m170594a(final View view) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.subpanel.C42803a.ViewTreeObserver$OnGlobalLayoutListenerC428063 */

                public void onGlobalLayout() {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    int realScreenHeight = DeviceUtils.getRealScreenHeight(C42803a.this.getContext()) - (iArr[1] + view.getHeight());
                    C41970e.m166941d().mo150950a(MailItemId.attribution, view.getHeight());
                    C42803a.this.mo153669a(realScreenHeight);
                }
            });
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m170596d(MailTxtAttrId mailTxtAttrId) {
        m170595c(mailTxtAttrId);
        this.f108975f.processToolbarItemClick(mailTxtAttrId, "true");
    }

    /* renamed from: b */
    public void mo153671b(MailTxtAttrId mailTxtAttrId) {
        if (mailTxtAttrId != null) {
            Item item = this.f108980k;
            if (item == null || !TextUtils.equals(item.getId(), mailTxtAttrId.name())) {
                this.f108975f.processToolbarItemClick(mailTxtAttrId, mailTxtAttrId.name());
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.bytedance.ee.bear.document.toolbar.AbstractC6207c
    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        Dialog a = super.mo946a(bundle);
        if (!(a == null || a.getWindow() == null)) {
            this.f108981l = a.getWindow().getDecorView();
            a.getWindow().getDecorView().setElevation(BitmapDescriptorFactory.HUE_RED);
            a.getWindow().getDecorView().setPadding(0, 0, 0, 0);
            a.getWindow().getDecorView().setBackgroundColor(-1);
        }
        return a;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.bytedance.ee.bear.document.toolbar.AbstractC6207c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (f108972e || activity != null) {
            this.f108975f = (C42815b) aj.m5366a(activity).mo6005a(C42815b.class);
            this.f108976g = (C42822e) aj.m5366a(activity).mo6005a(C42822e.class);
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: c */
    private void m170595c(MailTxtAttrId mailTxtAttrId) {
        C13479a.m54758a("MailTxtAttrFragment", "updateFont: " + mailTxtAttrId);
        if (getContext() != null) {
            this.f108973c.setTag(2022351188, mailTxtAttrId.name());
            this.f108973c.setText(mailTxtAttrId.getFontName());
            this.f108973c.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.subpanel.C42803a.ViewTreeObserver$OnGlobalLayoutListenerC428074 */

                public void onGlobalLayout() {
                    C42803a.this.f108973c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int measuredWidth = C42803a.this.f108973c.getMeasuredWidth();
                    int round = Math.round(C42803a.this.f108973c.getPaint().measureText(C42803a.this.f108973c.getText().toString()));
                    if (measuredWidth > round) {
                        C42803a.this.f108973c.setPadding(measuredWidth - round, C42803a.this.f108973c.getPaddingTop(), C42803a.this.f108973c.getPaddingRight(), C42803a.this.f108973c.getPaddingBottom());
                    }
                }
            });
            this.f108973c.requestLayout();
            this.f108979j = mailTxtAttrId;
            this.f108976g.updateSelectedFont(mailTxtAttrId);
        }
    }

    /* renamed from: a */
    public MailTxtAttrId mo153668a(String str) {
        for (MailTxtAttrId mailTxtAttrId : m170598l()) {
            if (TextUtils.equals(str, mailTxtAttrId.name())) {
                return mailTxtAttrId;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo153669a(int i) {
        int i2;
        if (this.f108981l != null && getActivity() != null && C57764ab.m224186a((Activity) getActivity())) {
            this.f108981l.setElevation(BitmapDescriptorFactory.HUE_RED);
            View view = this.f108981l;
            if (i < 60) {
                i2 = C43785p.m173530a(35);
            } else {
                i2 = 0;
            }
            view.setPadding(0, 0, 0, i2);
        }
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6205b
    /* renamed from: a */
    public void mo22131a(Item[] itemArr, View view) {
        super.mo22131a(itemArr, view);
        MailTxtAttrId defaultFont = MailTxtAttrId.getDefaultFont();
        MailTxtAttrId mailTxtAttrId = null;
        for (Item item : itemArr) {
            if (item != null && (item.id() instanceof MailTxtAttrId)) {
                MailTxtAttrId mailTxtAttrId2 = (MailTxtAttrId) item.id();
                if (mailTxtAttrId2.isFontOrSize()) {
                    if (MailTxtAttrId.isFont(mailTxtAttrId2)) {
                        if (item.isSelected()) {
                            defaultFont = mailTxtAttrId2;
                        }
                    } else if (item.isSelected()) {
                        mailTxtAttrId = mailTxtAttrId2;
                    }
                }
            }
        }
        this.f108974d = mailTxtAttrId;
        FontLayout fontLayout = this.f108977h;
        if (fontLayout != null) {
            if (mailTxtAttrId != null) {
                fontLayout.setCurrentFont(mailTxtAttrId.name());
            } else {
                fontLayout.setCurrentFont("");
            }
        }
        m170595c(defaultFont);
    }
}
