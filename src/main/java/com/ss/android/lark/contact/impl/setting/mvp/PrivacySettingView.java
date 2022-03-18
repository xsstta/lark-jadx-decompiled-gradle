package com.ss.android.lark.contact.impl.setting.mvp;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.C25644o;
import com.larksuite.component.ui.dialog.LKUIListItemData;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a;
import com.ss.android.lark.contact.impl.setting.mvp.PrivacySettingView;
import com.ss.android.lark.contact.impl.setting.service.entity.C36067c;
import com.ss.android.lark.contact.impl.setting.service.entity.C36068d;
import com.ss.android.lark.contact.impl.setting.service.entity.C36069e;
import com.ss.android.lark.contact.impl.setting.service.entity.C36070f;
import com.ss.android.lark.contact.impl.setting.service.entity.WayToAddMeSettingItem;
import com.ss.android.lark.contact.impl.setting.widget.C36075b;
import com.ss.android.lark.contact.impl.setting.widget.C36076c;
import com.ss.android.lark.contact.impl.setting.widget.FindMeSettingView;
import com.ss.android.lark.contact.impl.setting.widget.SwitchSettingView;
import com.ss.android.lark.contact.impl.statistics.PrivacyHitPoint;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;

public class PrivacySettingView implements AbstractC36004a.AbstractC36006b {

    /* renamed from: a */
    public AbstractC36003a f93053a;

    /* renamed from: b */
    public AbstractC36004a.AbstractC36006b.AbstractC36007a f93054b;

    /* renamed from: c */
    public final Context f93055c;

    /* renamed from: d */
    public C36069e f93056d;

    /* renamed from: e */
    public C36070f f93057e;

    /* renamed from: f */
    public C36076c f93058f = new C36076c();

    /* renamed from: g */
    public String f93059g;

    /* renamed from: h */
    private final AbstractC35361b.AbstractC35370i f93060h = C35358a.m138143a().mo130150b();
    View mAddMeSceneZone;
    View mAddMeZone;
    TextView mDesktopTitleBar;
    FindMeSettingView mFindMeSetting;
    View mFindMeSettingMore;
    View mFindMeZone;
    SwitchSettingView mSwitchSettingChat;
    SwitchSettingView mSwitchSettingDing;
    SwitchSettingView mSwitchSettingDocument;
    SwitchSettingView mSwitchSettingMail;
    SwitchSettingView mSwitchSettingMeeting;
    SwitchSettingView mSwitchSettingNameCard;
    SwitchSettingView mSwitchSettingSchedule;
    SwitchSettingView mSwitchSettingToken;
    CommonTitleBar mTitleBar;
    TextView mTvFindMeSetting;

    /* renamed from: com.ss.android.lark.contact.impl.setting.mvp.PrivacySettingView$a */
    public interface AbstractC36003a {
        /* renamed from: a */
        void mo132401a();

        /* renamed from: a */
        void mo132402a(PrivacySettingView privacySettingView);
    }

    /* renamed from: a */
    public void mo132414a(String str, boolean z, String str2) {
        this.mFindMeSetting.mo132631a(str, false);
        this.f93054b.mo132442a(str, z, str2);
    }

    @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36006b
    /* renamed from: a */
    public void mo132411a(C36069e eVar) {
        this.f93056d = eVar;
        if (!eVar.mo132625b()) {
            UIUtils.hide(this.mSwitchSettingDing);
            return;
        }
        UIUtils.show(this.mSwitchSettingDing);
        mo132424h(eVar.mo132624a());
    }

    @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36006b
    /* renamed from: a */
    public void mo132415a(boolean z) {
        this.mSwitchSettingNameCard.setSwitchEnable(true);
        this.mSwitchSettingNameCard.setChecked(z);
    }

    @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36006b
    /* renamed from: a */
    public void mo132413a(String str, boolean z) {
        this.mFindMeSetting.mo132631a(str, true);
        this.mFindMeSetting.mo132632b(str, z);
        C36075b a = this.f93058f.mo132646a(str);
        if (a != null && a.f93241f && z) {
            LKUIToast.show(this.f93055c, (int) R.string.Lark_PrivacySettings_EnableSuccessfully_Toast);
        }
        a.f93239d = z;
    }

    @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36006b
    /* renamed from: a */
    public void mo132412a(String str) {
        if (TextUtils.isEmpty(str)) {
            LKUIToast.show(this.f93055c, (int) R.string.Lark_Setting_PrivacySetupFailed);
        } else {
            LKUIToast.show(this.f93055c, str);
        }
    }

    /* renamed from: f */
    private void m141150f() {
        this.mSwitchSettingMail.setVisibility(8);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f93053a = null;
        this.f93054b = null;
    }

    @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36006b
    /* renamed from: b */
    public void mo132416b() {
        UIUtils.show(this.mAddMeZone);
        UIUtils.show(this.mAddMeSceneZone);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f93053a.mo132402a(this);
        m141146d();
    }

    /* renamed from: g */
    private void m141152g() {
        C36075b a;
        C36076c cVar = this.f93058f;
        if (cVar != null && (a = cVar.mo132646a(this.f93059g)) != null) {
            this.mFindMeSetting.mo132631a(a.f93236a, true);
            this.mFindMeSetting.mo132632b(a.f93236a, a.f93239d);
        }
    }

    /* renamed from: e */
    private void m141148e() {
        if (!DesktopUtil.m144301a(this.f93055c)) {
            this.mTitleBar.setVisibility(0);
            this.mDesktopTitleBar.setVisibility(8);
            if (C35358a.m138143a().mo130150b().mo130208a("lark.client.contact.opt")) {
                this.mTitleBar.setTitle(R.string.Lark_NewSettings_HowToAddMe);
            } else {
                this.mTitleBar.setTitle(R.string.Lark_NewSettings_Privacy);
            }
        } else if (C35358a.m138143a().mo130150b().mo130208a("lark.client.contact.opt")) {
            this.mTitleBar.setVisibility(0);
            this.mDesktopTitleBar.setVisibility(8);
            this.mTitleBar.setLeftClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.contact.impl.setting.mvp.PrivacySettingView.C359963 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    PrivacySettingView.this.f93053a.mo132401a();
                }
            });
            this.mTitleBar.setTitle(R.string.Lark_NewSettings_HowToAddMe);
        } else {
            this.mTitleBar.setVisibility(8);
            this.mDesktopTitleBar.setVisibility(0);
            this.mDesktopTitleBar.setText(R.string.Lark_NewSettings_Privacy);
        }
    }

    /* renamed from: d */
    private void m141146d() {
        m141148e();
        this.mFindMeSettingMore.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.contact.impl.setting.mvp.PrivacySettingView.C359931 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (PrivacySettingView.this.f93057e == null) {
                    Log.m165383e("PrivacySettingView", "dockLink is null.");
                    return;
                }
                PrivacyHitPoint.f92909a.mo132206a();
                C35358a.m138143a().mo130160f().mo130192a(PrivacySettingView.this.f93055c, PrivacySettingView.this.f93057e.mo132629c());
            }
        });
        this.mSwitchSettingNameCard.setDisplayText(UIHelper.getString(R.string.Lark_NewSettings_AddMeViaNameCard));
        this.mSwitchSettingNameCard.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.contact.impl.setting.mvp.PrivacySettingView.C359974 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                PrivacySettingView.this.mSwitchSettingNameCard.setSwitchEnable(false);
                PrivacySettingView.this.f93054b.mo132443a(z);
                PrivacyHitPoint.f92909a.mo132208a("usercard", z);
            }
        });
        this.mSwitchSettingToken.setDisplayText(UIHelper.getString(R.string.Lark_NewSettings_AddMeViaQRCodeOrProfileLink));
        this.mSwitchSettingToken.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.contact.impl.setting.mvp.PrivacySettingView.C359985 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                PrivacySettingView.this.mSwitchSettingToken.setSwitchEnable(false);
                PrivacySettingView.this.f93054b.mo132444b(z);
                PrivacyHitPoint.f92909a.mo132208a("qrcode_link", z);
            }
        });
        this.mSwitchSettingChat.setDisplayText(UIHelper.getString(R.string.Lark_NewSettings_AddMeFromChat));
        this.mSwitchSettingChat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.contact.impl.setting.mvp.PrivacySettingView.C359996 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                PrivacySettingView.this.mSwitchSettingChat.setSwitchEnable(false);
                PrivacySettingView.this.f93054b.mo132445c(z);
                PrivacyHitPoint.f92909a.mo132208a("chat", z);
            }
        });
        this.mSwitchSettingSchedule.setDisplayText(UIHelper.getString(R.string.Lark_NewSettings_AddMeFromEvent));
        this.mSwitchSettingSchedule.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.contact.impl.setting.mvp.PrivacySettingView.C360007 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                PrivacySettingView.this.mSwitchSettingSchedule.setSwitchEnable(false);
                PrivacySettingView.this.f93054b.mo132446d(z);
                PrivacyHitPoint.f92909a.mo132208a("event", z);
            }
        });
        this.mSwitchSettingDocument.setDisplayText(UIHelper.getString(R.string.Lark_NewSettings_AddMeFromDocs));
        this.mSwitchSettingDocument.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.contact.impl.setting.mvp.PrivacySettingView.C360018 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                PrivacySettingView.this.mSwitchSettingDocument.setSwitchEnable(false);
                PrivacySettingView.this.f93054b.mo132447e(z);
                PrivacyHitPoint.f92909a.mo132208a("docs", z);
            }
        });
        this.mSwitchSettingMeeting.setDisplayText(UIHelper.getString(R.string.Lark_NewSettings_AddMeFromCallsAndMeetings));
        this.mSwitchSettingMeeting.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.contact.impl.setting.mvp.PrivacySettingView.C360029 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                PrivacySettingView.this.mSwitchSettingMeeting.setSwitchEnable(false);
                PrivacySettingView.this.f93054b.mo132448f(z);
                PrivacyHitPoint.f92909a.mo132208a("vc", z);
            }
        });
        this.mSwitchSettingMail.setDisplayText(UIHelper.getString(R.string.Lark_Mail_Name));
        this.mSwitchSettingMail.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.contact.impl.setting.mvp.PrivacySettingView.AnonymousClass10 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                PrivacySettingView.this.mSwitchSettingMail.setSwitchEnable(false);
                PrivacySettingView.this.f93054b.mo132449g(z);
                PrivacyHitPoint.f92909a.mo132208a("email", z);
            }
        });
        this.mFindMeSetting.setOnCheckedChangeListener(new FindMeSettingView.AbstractC36073a() {
            /* class com.ss.android.lark.contact.impl.setting.mvp.PrivacySettingView.AnonymousClass11 */

            @Override // com.ss.android.lark.contact.impl.setting.widget.FindMeSettingView.AbstractC36073a
            /* renamed from: a */
            public void mo132426a(String str, boolean z) {
                C36075b a = PrivacySettingView.this.f93058f.mo132646a(str);
                if (a == null) {
                    Log.m165389i("PrivacySettingView", "current entry is null.");
                } else if (!z || !a.f93241f) {
                    PrivacySettingView.this.mo132414a(str, z, "");
                } else {
                    PrivacySettingView.this.f93059g = str;
                    PrivacySettingView.this.mo132418c();
                }
            }
        });
        this.mSwitchSettingDing.setDisplayText(UIHelper.getString(R.string.Lark_buzz_AllowOtherUsers));
        this.mSwitchSettingDing.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.contact.impl.setting.mvp.PrivacySettingView.C359942 */

            public void onCheckedChanged(CompoundButton compoundButton, final boolean z) {
                PrivacySettingView.this.mSwitchSettingDing.setSwitchEnable(false);
                if (!z || !PrivacySettingView.this.f93056d.mo132626c()) {
                    PrivacySettingView.this.f93054b.mo132450h(z);
                } else {
                    new C25639g(PrivacySettingView.this.f93055c).mo89248g(R.string.Lark_buzz_AreYouSure).mo89254m(R.string.Lark_buzz_SubjectToLocal).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_buzz_Cancel, new DialogInterface.OnClickListener() {
                        /* class com.ss.android.lark.contact.impl.setting.mvp.PrivacySettingView.C359942.DialogInterface$OnClickListenerC359951 */

                        public void onClick(DialogInterface dialogInterface, int i) {
                            PrivacySettingView.this.mo132424h(!z);
                        }
                    }).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_buzz_Confirm, new DialogInterface.OnClickListener(z) {
                        /* class com.ss.android.lark.contact.impl.setting.mvp.$$Lambda$PrivacySettingView$2$iyzo1Boe68OhBwW43dC_yaVI7oo */
                        public final /* synthetic */ boolean f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            PrivacySettingView.C359942.lambda$iyzo1Boe68OhBwW43dC_yaVI7oo(PrivacySettingView.C359942.this, this.f$1, dialogInterface, i);
                        }
                    }).mo89238b(true).mo89247e(false).mo89239c();
                }
            }

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m141172a(boolean z, DialogInterface dialogInterface, int i) {
                PrivacySettingView.this.f93054b.mo132450h(z);
            }
        });
    }

    /* renamed from: c */
    public void mo132418c() {
        int i;
        C36075b a = this.f93058f.mo132646a(this.f93059g);
        if (a != null) {
            this.mFindMeSetting.mo132632b(this.f93059g, a.f93239d);
            this.mFindMeSetting.mo132631a(this.f93059g, false);
            ArrayList arrayList = new ArrayList();
            LKUIListItemData nVar = new LKUIListItemData(C57582a.m223604a(this.f93055c, (int) R.string.Lark_Passport_PrivacySettings_BeforeChanging_VerifyButton));
            nVar.mo89289b(R.color.text_title);
            arrayList.add(nVar);
            C25644o oVar = new C25644o(this.f93055c);
            if (a.mo132645a()) {
                i = R.string.Lark_Passport_PrivacySettings_BeforeChanging_VerifyEmail;
            } else {
                i = R.string.Lark_Passport_PrivacySettings_BeforeChanging_VerifyPhoneNumber;
            }
            ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) oVar.mo89248g(i)).mo89205a(arrayList)).mo89202a(new DialogInterface.OnClickListener(a) {
                /* class com.ss.android.lark.contact.impl.setting.mvp.$$Lambda$PrivacySettingView$iZZJ8dYs9fx0Aq1wTEW4W7hNk_Q */
                public final /* synthetic */ C36075b f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    PrivacySettingView.lambda$iZZJ8dYs9fx0Aq1wTEW4W7hNk_Q(PrivacySettingView.this, this.f$1, dialogInterface, i);
                }
            })).mo89225a(R.id.lkui_dialog_btn_cancel, C57582a.m223604a(this.f93055c, (int) R.string.Lark_Passport_PrivacySettings_BeforeChanging_CancelButton), new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.contact.impl.setting.mvp.$$Lambda$PrivacySettingView$1kpDxVJ246zbomUFNGpuCS7wu4 */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    PrivacySettingView.m270504lambda$1kpDxVJ246zbomUFNGpuCS7wu4(PrivacySettingView.this, dialogInterface, i);
                }
            })).mo89226a(new DialogInterface.OnCancelListener() {
                /* class com.ss.android.lark.contact.impl.setting.mvp.$$Lambda$PrivacySettingView$Tn1Zo_eQU1BHmnreQKWNxwB54ZQ */

                public final void onCancel(DialogInterface dialogInterface) {
                    PrivacySettingView.lambda$Tn1Zo_eQU1BHmnreQKWNxwB54ZQ(PrivacySettingView.this, dialogInterface);
                }
            })).mo89239c();
        }
    }

    @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36006b
    /* renamed from: a */
    public void mo132407a() {
        LKUIToast.show(this.f93055c, (int) R.string.Lark_Setting_PrivacySetupFailed);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC36004a.AbstractC36006b.AbstractC36007a aVar) {
        this.f93054b = aVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m141138a(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        m141152g();
    }

    @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36006b
    /* renamed from: c */
    public void mo132419c(boolean z) {
        this.mSwitchSettingChat.setSwitchEnable(true);
        this.mSwitchSettingChat.setChecked(z);
    }

    @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36006b
    /* renamed from: d */
    public void mo132420d(boolean z) {
        this.mSwitchSettingSchedule.setSwitchEnable(true);
        this.mSwitchSettingSchedule.setChecked(z);
    }

    @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36006b
    /* renamed from: e */
    public void mo132421e(boolean z) {
        this.mSwitchSettingDocument.setSwitchEnable(true);
        this.mSwitchSettingDocument.setChecked(z);
    }

    @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36006b
    /* renamed from: f */
    public void mo132422f(boolean z) {
        this.mSwitchSettingMeeting.setSwitchEnable(true);
        this.mSwitchSettingMeeting.setChecked(z);
    }

    @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36006b
    /* renamed from: g */
    public void mo132423g(boolean z) {
        this.mSwitchSettingMail.setSwitchEnable(true);
        this.mSwitchSettingMail.setChecked(z);
    }

    @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36006b
    /* renamed from: h */
    public void mo132424h(boolean z) {
        this.mSwitchSettingDing.setSwitchEnable(true);
        this.mSwitchSettingDing.setChecked(z);
    }

    /* renamed from: a */
    private void m141140a(C36068d dVar) {
        mo132416b();
        m141144b(dVar);
        m141145c(dVar);
    }

    /* renamed from: c */
    private void m141145c(C36068d dVar) {
        m141147d(dVar);
        m141149e(dVar);
        if (C35358a.m138143a().mo130150b().mo130208a("lark.messenger.setting.privacy.mail.addfriends")) {
            m141151f(dVar);
        } else {
            m141150f();
        }
    }

    /* renamed from: d */
    private void m141147d(C36068d dVar) {
        this.mSwitchSettingNameCard.setVisibility(0);
        this.mSwitchSettingNameCard.setChecked(m141143a(dVar, Integer.valueOf(WayToAddMeSettingItem.AddMeType.NAME_CARD.getNumber()), true));
    }

    /* renamed from: f */
    private void m141151f(C36068d dVar) {
        this.mSwitchSettingMail.setVisibility(0);
        this.mSwitchSettingMail.setChecked(m141143a(dVar, Integer.valueOf(WayToAddMeSettingItem.AddMeType.MAIL.getNumber()), true));
    }

    @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36006b
    /* renamed from: b */
    public void mo132417b(boolean z) {
        this.mSwitchSettingToken.setSwitchEnable(true);
        this.mSwitchSettingToken.setChecked(z);
    }

    /* renamed from: b */
    private void m141144b(C36068d dVar) {
        this.mSwitchSettingToken.setVisibility(0);
        this.mSwitchSettingToken.setChecked(m141143a(dVar, Integer.valueOf(WayToAddMeSettingItem.AddMeType.CONTACT_TOKEN.getNumber()), true));
        this.mSwitchSettingChat.setVisibility(0);
        this.mSwitchSettingChat.setChecked(m141143a(dVar, Integer.valueOf(WayToAddMeSettingItem.AddMeType.GROUP_CHAT.getNumber()), true));
    }

    /* renamed from: a */
    private void m141141a(C36070f fVar) {
        this.f93057e = fVar;
        if (fVar == null || !fVar.mo132628b()) {
            UIUtils.hide(this.mFindMeSettingMore);
        } else {
            TextView textView = this.mTvFindMeSetting;
            textView.setText(C57782ag.m224234a(UIHelper.getString(R.string.Lark_PrivacySettings_ContactInfovsLoginCredentials_Difference) + UIHelper.getString(R.string.Lark_PrivacySettings_ContactInfovsLoginCredentials_ViewDifference), UIHelper.getString(R.string.Lark_PrivacySettings_ContactInfovsLoginCredentials_ViewDifference), UIHelper.getColor(R.color.text_link_normal)));
            UIUtils.show(this.mFindMeSettingMore);
        }
        C36076c a = C36026d.m141243a(this.f93055c, this.f93057e);
        this.f93058f = a;
        this.mFindMeSetting.setInfo(a.mo132647a());
        if (this.f93058f.mo132649b()) {
            UIUtils.hide(this.mFindMeZone);
        } else {
            UIUtils.show(this.mFindMeZone);
        }
    }

    /* renamed from: e */
    private void m141149e(C36068d dVar) {
        this.mSwitchSettingSchedule.setVisibility(0);
        this.mSwitchSettingSchedule.setChecked(m141143a(dVar, Integer.valueOf(WayToAddMeSettingItem.AddMeType.SCHEDULE.getNumber()), true));
        this.mSwitchSettingDocument.setVisibility(0);
        this.mSwitchSettingDocument.setChecked(m141143a(dVar, Integer.valueOf(WayToAddMeSettingItem.AddMeType.DOCUMENT.getNumber()), true));
        this.mSwitchSettingMeeting.setVisibility(0);
        this.mSwitchSettingMeeting.setChecked(m141143a(dVar, Integer.valueOf(WayToAddMeSettingItem.AddMeType.MEETING.getNumber()), true));
        C35358a.m138143a().mo130150b().mo130208a("lark.messenger.setting.privacy.mail.addfriends");
    }

    @Override // com.ss.android.lark.contact.impl.setting.mvp.AbstractC36004a.AbstractC36006b
    /* renamed from: a */
    public void mo132410a(C36067c cVar) {
        m141141a(cVar.mo132622c());
        m141140a(cVar.mo132621b());
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m141139a(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        m141152g();
    }

    public PrivacySettingView(Context context, AbstractC36003a aVar) {
        this.f93055c = context;
        this.f93053a = aVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m141142a(C36075b bVar, DialogInterface dialogInterface, int i) {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scope", (Object) "contact_verify");
        if (bVar.f93238c != null) {
            str = bVar.f93238c.replace(" ", "");
        } else {
            str = bVar.f93238c;
        }
        jSONObject.put("credential", (Object) str);
        jSONObject.put("credential_type", (Object) Integer.valueOf(bVar.f93240e.getNumber()));
        C35358a.m138143a().mo130163h().mo130228a(this.f93055c, jSONObject);
    }

    /* renamed from: a */
    private boolean m141143a(C36068d dVar, Integer num, boolean z) {
        Boolean bool = dVar.mo132623a().get(num);
        if (bool != null) {
            return bool.booleanValue();
        }
        return z;
    }

    /* renamed from: a */
    public void mo132408a(int i, int i2, Intent intent) {
        if (i == 1) {
            C36075b a = this.f93058f.mo132646a(this.f93059g);
            if (i2 != -1) {
                Log.m165389i("PrivacySettingView", "onActivityResult called. but cannel, not return token.");
                m141152g();
            } else if (a == null) {
                Log.m165389i("PrivacySettingView", "passport verify success, but entry is null.");
            } else {
                mo132414a(a.f93236a, true, intent.getStringExtra("X-Verify-Token"));
            }
        }
    }
}
