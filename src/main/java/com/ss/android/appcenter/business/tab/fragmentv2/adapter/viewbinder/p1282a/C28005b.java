package com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.p1282a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.ignition.widget.squircle.SquircleImageView;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.activity.appaddv2.AddAppActivity;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.net.C27711a;
import com.ss.android.appcenter.business.net.dto.AppBadgeNode;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.net.workplacehome.C27771a;
import com.ss.android.appcenter.business.p1265a.C27569b;
import com.ss.android.appcenter.business.p1265a.C27575d;
import com.ss.android.appcenter.business.p1265a.C27577f;
import com.ss.android.appcenter.business.p1268b.C27688a;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.C27902a;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.C27913b;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1278b.AbstractC27920e;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1278b.C27916a;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1278b.C27919d;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.AddAppItem;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.C27999a;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.C28000b;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27990a;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27991b;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27993d;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27994e;
import com.ss.android.appcenter.business.view.C28108a;
import com.ss.android.appcenter.common.adapter.groupadapter.C28118a;
import com.ss.android.appcenter.common.adapter.groupadapter.UpdateActionType;
import com.ss.android.appcenter.common.base.AbstractView$OnClickListenerC28143a;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28209p;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.a.b */
public class C28005b extends AbstractC27990a implements AbstractC27991b, AbstractC27993d {

    /* renamed from: a */
    private AbstractView$OnClickListenerC28143a f70073a = new AbstractView$OnClickListenerC28143a() {
        /* class com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.p1282a.C28005b.C280061 */

        /* access modifiers changed from: protected */
        @Override // com.ss.android.appcenter.common.base.AbstractView$OnClickListenerC28143a
        /* renamed from: a */
        public void mo98319a(View view) {
            AddAppActivity.m100674a(view.getContext());
            C27710b.m101298g();
        }
    };

    @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27993d
    /* renamed from: a */
    public void mo99752a(AbstractC27994e eVar, C28118a aVar, int i, C28000b bVar, UpdateActionType updateActionType) {
        if (bVar != null && aVar != null && updateActionType == UpdateActionType.BADGE) {
            m102329a(aVar, bVar.mo99821o(i));
        }
    }

    /* renamed from: a */
    private void m102329a(C28118a aVar, C27999a aVar2) {
        aVar.mo100091a(R.id.iv_fold_badge, aVar2.mo99797n());
    }

    /* renamed from: a */
    private void m102328a(C28118a aVar, ItemInfo itemInfo) {
        LKUIBadgeView lKUIBadgeView = (LKUIBadgeView) aVar.mo100089a(R.id.icon_badge);
        int badgeNum = itemInfo.badgeNum();
        lKUIBadgeView.setTag(R.id.tag_key_data, Integer.valueOf(badgeNum));
        C27569b.m100617a(lKUIBadgeView, badgeNum);
    }

    @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27993d
    /* renamed from: b */
    public void mo99753b(AbstractC27994e eVar, C28118a aVar, int i, C28000b bVar) {
        ((TextView) aVar.mo100089a(R.id.name)).setText(bVar.mo99815i(i));
        if (bVar.mo99819m(i)) {
            LinearLayout linearLayout = (LinearLayout) aVar.mo100089a(R.id.ll_unfold);
            linearLayout.setVisibility(0);
            TextView textView = (TextView) aVar.mo100089a(R.id.tv_unfold);
            ImageView imageView = (ImageView) aVar.mo100089a(R.id.iv_unfold_icon);
            m102330a(eVar.mo99765d(i), bVar.mo99816j(i).size(), textView, imageView);
            linearLayout.setOnClickListener(new View.OnClickListener(eVar, i, bVar, textView, imageView) {
                /* class com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.p1282a.$$Lambda$b$FNhpwrQLjateCeMvQeK8Kywjw */
                public final /* synthetic */ AbstractC27994e f$1;
                public final /* synthetic */ int f$2;
                public final /* synthetic */ C28000b f$3;
                public final /* synthetic */ TextView f$4;
                public final /* synthetic */ ImageView f$5;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                }

                public final void onClick(View view) {
                    C28005b.m270218lambda$FNhpwrQLjateCeMvQeK8Kywjw(C28005b.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, view);
                }
            });
        } else {
            ((LinearLayout) aVar.mo100089a(R.id.ll_unfold)).setVisibility(8);
        }
        m102329a(aVar, bVar.mo99821o(i));
    }

    /* renamed from: a */
    private void m102330a(boolean z, int i, TextView textView, ImageView imageView) {
        if (z) {
            textView.setText(C28209p.m103298a(textView.getContext(), (int) R.string.OpenPlatform_AppCenter_ViewAll, "num", String.valueOf(i)));
            imageView.setImageResource(R.drawable.ud_icon_down_bold_outlined);
            return;
        }
        textView.setText(R.string.OpenPlatform_AppCenter_CollapseBttn);
        imageView.setImageResource(R.drawable.ud_icon_up_bold_outlined);
    }

    /* renamed from: a */
    private boolean m102331a(AbstractC27994e eVar, C28118a aVar, int i, C28000b bVar) {
        if (!C28004a.m102323a(bVar.mo99816j(i))) {
            return false;
        }
        aVar.itemView.setOnClickListener(this.f70073a);
        return true;
    }

    @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27991b
    /* renamed from: a */
    public void mo99749a(AbstractC27994e eVar, C28118a aVar, int i, int i2, C28000b bVar) {
        boolean z;
        int i3;
        if (!m102331a(eVar, aVar, i, bVar)) {
            Context a = eVar.mo99754a();
            ItemInfo b = bVar.mo99806b(i, i2);
            if (b == null) {
                C28184h.m103250d("Workplace_Page", String.format("bind icon. get(%s, %s) itemInfo is null.", String.valueOf(i), String.valueOf(i2)));
                return;
            }
            m102328a(aVar, b);
            if (!b.isNew() || bVar.mo99820n(i) || i2 >= 5) {
                z = false;
            } else {
                z = true;
            }
            SquircleImageView squircleImageView = (SquircleImageView) aVar.mo100089a(R.id.icon);
            TextView textView = (TextView) aVar.mo100089a(R.id.name);
            View a2 = aVar.mo100089a(R.id.bot_icon);
            if (b.isSingleBot()) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            a2.setVisibility(i3);
            if (b instanceof AddAppItem) {
                squircleImageView.setBorderWidth(0);
                squircleImageView.setImageResource(R.drawable.workplace_addapp_icon_squircle);
                textView.setText(R.string.OpenPlatform_AppCenter_AddAppBttn);
                aVar.itemView.setOnLongClickListener(null);
                aVar.itemView.setOnClickListener(this.f70073a);
                return;
            }
            if (z) {
                Drawable drawable = a.getDrawable(R.drawable.appcenter_new_bg);
                int a3 = C28209p.m103293a(a, 6.0f);
                drawable.setBounds(0, 0, a3, a3);
                C28108a aVar2 = new C28108a(drawable);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) ("  " + b.getName()));
                spannableStringBuilder.setSpan(aVar2, 0, 1, 33);
                textView.setText(spannableStringBuilder);
            } else {
                textView.setText(b.getName());
            }
            squircleImageView.setBorderWidth((int) eVar.mo99754a().getResources().getDimension(R.dimen.workplace_common_icon_border_width));
            C27688a.m101210a(a, b.getName(), b.getIconKey(), squircleImageView);
            m102327a(eVar, aVar, b, bVar, i, i2, z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m102326a(AbstractC27994e eVar, int i, C28000b bVar, TextView textView, ImageView imageView, View view) {
        boolean z = !eVar.mo99765d(i);
        C28184h.m103250d("Workplace_Page", "click to fold:" + z + " groupPosition:" + i);
        if (z) {
            eVar.mo99757a(i, true);
            m102330a(true, bVar.mo99816j(i).size(), textView, imageView);
        } else {
            eVar.mo99757a(i, false);
            m102330a(false, bVar.mo99816j(i).size(), textView, imageView);
        }
        eVar.mo99762c();
    }

    @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27991b
    /* renamed from: a */
    public void mo99750a(AbstractC27994e eVar, C28118a aVar, int i, int i2, C28000b bVar, UpdateActionType updateActionType) {
        ItemInfo b;
        if (bVar != null && aVar != null && updateActionType == UpdateActionType.BADGE && (b = bVar.mo99806b(i, i2)) != null) {
            m102328a(aVar, b);
        }
    }

    /* renamed from: a */
    private void m102327a(final AbstractC27994e eVar, final C28118a aVar, final ItemInfo itemInfo, final C28000b bVar, final int i, final int i2, final boolean z) {
        View view = aVar.itemView;
        view.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.p1282a.C28005b.View$OnClickListenerC280072 */

            public void onClick(View view) {
                String str;
                C28184h.m103250d("Workplace_Page", "click app: " + itemInfo);
                C27577f.m100655a(eVar.mo99754a(), itemInfo);
                AppBadgeNode badgeNode = itemInfo.badgeNode();
                if (badgeNode == null) {
                    str = "null";
                } else if (badgeNode.needShow) {
                    str = "on";
                } else {
                    str = "off";
                }
                C27710b.m101264a(itemInfo.getName(), itemInfo.getAppId(), C27575d.m100643a(itemInfo), null, C27575d.m100644a(itemInfo.getItemUrl().getMobileAppLink()), str, itemInfo.badgeNum());
                C27710b.m101259a(itemInfo.getAppId(), itemInfo.getItemId());
                if (z) {
                    C27711a.m101329a(itemInfo.getItemId());
                    eVar.mo99758a(itemInfo.getItemId());
                }
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.p1282a.C28005b.View$OnLongClickListenerC280083 */

            public boolean onLongClick(View view) {
                boolean z;
                C28184h.m103250d("Workplace_Page", "click long app: " + itemInfo);
                eVar.mo99756a(i, i2, aVar);
                boolean z2 = false;
                eVar.mo99759a(false);
                String itemId = itemInfo.getItemId();
                boolean a = bVar.mo99803a(itemId);
                boolean n = bVar.mo99820n(i);
                if (n) {
                    z = bVar.mo99808b(itemId);
                } else {
                    z = false;
                }
                LKUIBadgeView lKUIBadgeView = (LKUIBadgeView) aVar.mo100089a(R.id.icon_badge);
                Object tag = lKUIBadgeView.getTag(R.id.tag_key_data);
                AbstractC27920e eVar = null;
                if (tag instanceof Integer) {
                    int intValue = ((Integer) tag).intValue();
                    if (intValue > 0 && intValue < 10) {
                        eVar = new C27916a();
                    } else if (intValue > 10) {
                        eVar = new C27919d((float) C28209p.m103293a(eVar.mo99754a(), 30.0f));
                    }
                }
                C27902a aVar = new C27902a(eVar.mo99760b());
                C27902a b = aVar.mo99487a(z).mo99489b(a);
                if (!z && n) {
                    z2 = true;
                }
                b.mo99490c(z2).mo99491d(C27577f.m100658b(itemInfo)).mo99486a(itemId).mo99483a(itemInfo).mo99481a(aVar.mo100089a(R.id.icon), eVar.mo99754a().getResources().getDimension(R.dimen.workplace_common_icon_radius)).mo99482a(aVar.mo100089a(R.id.bot_icon), new C27919d((float) C28209p.m103293a(eVar.mo99754a(), 40.0f))).mo99485a(new ItemMenuAdapter.AbstractC27933b() {
                    /* class com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.p1282a.C28005b.View$OnLongClickListenerC280083.C280102 */

                    @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.AbstractC27933b
                    /* renamed from: d */
                    public void mo99571d() {
                    }

                    @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.AbstractC27933b
                    /* renamed from: c */
                    public void mo99570c() {
                        C27710b.m101309l(itemInfo.getAppId());
                    }

                    @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.AbstractC27933b
                    /* renamed from: a */
                    public void mo99568a() {
                        int a = bVar.mo99800a(itemInfo, itemInfo.isWidget());
                        if (a != -1) {
                            eVar.mo99755a(a);
                        }
                        C27771a.m101486a().mo99116a(itemInfo, true);
                        C27710b.m101305j(itemInfo.getAppId());
                    }

                    @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.AbstractC27933b
                    /* renamed from: b */
                    public void mo99569b() {
                        int b = bVar.mo99805b(itemInfo, itemInfo.isWidget());
                        if (b != -1) {
                            eVar.mo99761b(b);
                        }
                        C27771a.m101486a().mo99116a(itemInfo, false);
                        C27710b.m101307k(itemInfo.getAppId());
                    }
                }).mo99484a(new C27913b.AbstractC27915a() {
                    /* class com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.p1282a.C28005b.View$OnLongClickListenerC280083.C280091 */

                    @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.C27913b.AbstractC27915a
                    public void onDismiss() {
                        eVar.mo99759a(true);
                    }
                });
                if (eVar != null) {
                    aVar.mo99482a(lKUIBadgeView, eVar);
                }
                aVar.mo99488a();
                C27710b.m101285c(itemInfo.getAppId(), n);
                return true;
            }
        });
    }
}
