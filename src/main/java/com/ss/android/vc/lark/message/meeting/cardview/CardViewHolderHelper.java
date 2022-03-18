package com.ss.android.vc.lark.message.meeting.cardview;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.dto.VideoChatContent;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.service.impl.VideoChatService;
import com.ss.android.vcxp.annotation.XMethod;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class CardViewHolderHelper {

    /* renamed from: a */
    private static CardViewHolderHelper f153045a;

    /* renamed from: b */
    private static final int f153046b = UIHelper.dp2px(12.0f);

    /* renamed from: c */
    private static final int f153047c = UIHelper.dp2px(20.0f);

    @Retention(RetentionPolicy.SOURCE)
    public @interface CardType {
    }

    /* renamed from: a */
    public void mo211368a(int i, C61148e eVar, CardSubMessageInfo bVar, VideoChatContent videoChatContent) {
        if (eVar != null && bVar != null && videoChatContent != null) {
            AbstractC61294b j = MeetingManager.m238341a().mo211906j();
            Participant participant = null;
            if (!(j == null || !TextUtils.equals(j.mo212055d(), videoChatContent.meetingCard.meetingId) || j.mo212056e() == null)) {
                C60700b.m235851b("CardViewHolderHelper", "[initMeetingCardView]", "ongoing meeting card");
                participant = ParticipantUtil.m248731c(j.mo212056e().getParticipants());
            }
            if (!(videoChatContent.meetingCard == null || videoChatContent.meetingCard.totalParticipantNum == 0 || !CollectionUtils.isNotEmpty(videoChatContent.meetingCard.participants))) {
                m237661a(videoChatContent.meetingCard.participants, participant);
            }
            if (videoChatContent.type == 1) {
                if (videoChatContent.meetingCard != null) {
                    eVar.f153179c.setVisibility(0);
                    eVar.f153193q.setVisibility(8);
                    m237664b(i, eVar, bVar, videoChatContent);
                    m237657a(eVar, videoChatContent, bVar);
                    if (!(videoChatContent == null || videoChatContent.meetingCard == null)) {
                        eVar.f153190n.mo208613a(videoChatContent.meetingCard.meetingId, videoChatContent.meetingCard.participants, videoChatContent.meetingCard.totalParticipantNum);
                    }
                } else {
                    return;
                }
            } else if (videoChatContent.type == 2) {
                eVar.f153179c.setVisibility(8);
                eVar.f153193q.setVisibility(0);
                m237656a(eVar, videoChatContent);
            }
            m237653a(videoChatContent, bVar, i);
        }
    }

    /* renamed from: a */
    private void m237661a(ArrayList<Participant> arrayList, Participant participant) {
        String c = VideoChatModuleDependency.m236630c();
        String b = VideoChatModuleDependency.m236629b();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Participant participant2 = arrayList.get(i3);
            if (TextUtils.equals(participant2.getId(), c) && TextUtils.equals(participant2.getDeviceId(), b)) {
                i = i3;
            }
            if (TextUtils.equals(participant2.getId(), c)) {
                i2 = i3;
            }
        }
        if ((i >= 0 && i <= 1) || (i2 >= 0 && i2 <= 1)) {
            C60700b.m235851b("CardViewHolderHelper", "[processMeetingCard]", "has device in 15 participants");
        } else if (i > 1) {
            arrayList.remove(i2);
            arrayList.add(1, arrayList.get(i2));
        } else if (i2 > 1) {
            C60700b.m235851b("CardViewHolderHelper", "[processMeetingCard2]", "otherDeviceIndex > 1, move to position 1");
            arrayList.remove(i2);
            arrayList.add(1, arrayList.get(i2));
        } else if (participant != null) {
            arrayList.add(1, participant);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m237659a(ObservableEmitter observableEmitter, VideoChatUser videoChatUser) {
        if (videoChatUser != null) {
            observableEmitter.onNext(videoChatUser.getName() != null ? videoChatUser.getName() : "");
            observableEmitter.onComplete();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m237660a(String str, final ObservableEmitter observableEmitter) throws Exception {
        final HashMap hashMap = new HashMap();
        hashMap.put("name", str);
        VcBizSender.m249235b("View_C_InvitedToVirtualOffice", hashMap).mo219889a(new AbstractC63598b<String>() {
            /* class com.ss.android.vc.lark.message.meeting.cardview.CardViewHolderHelper.C611091 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                observableEmitter.onNext("");
                observableEmitter.onComplete();
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                if (TextUtils.isEmpty(str)) {
                    str = UIHelper.mustacheFormat((int) R.string.View_C_InvitedToVirtualOffice, hashMap);
                }
                observableEmitter.onNext(str);
                observableEmitter.onComplete();
            }
        });
    }

    /* renamed from: a */
    public void mo211371a(final C61148e eVar, final String str, final VideoChatContent videoChatContent, final String str2) {
        if (eVar.f153179c.getWidth() == 0) {
            eVar.f153179c.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                /* class com.ss.android.vc.lark.message.meeting.cardview.CardViewHolderHelper.ViewTreeObserver$OnPreDrawListenerC611135 */

                public boolean onPreDraw() {
                    if (((float) ((eVar.f153179c.getWidth() - (C60773o.m236115a(12.0d) * 2)) - eVar.f153181e.getWidth())) - eVar.f153184h.getPaint().measureText(str2) < ((float) C60773o.m236115a(150.0d))) {
                        CardViewHolderHelper cardViewHolderHelper = CardViewHolderHelper.this;
                        C61148e eVar = eVar;
                        cardViewHolderHelper.mo211369a(eVar, str, videoChatContent, eVar.f153179c.getWidth(), str2);
                    } else if (eVar.f153179c.getWidth() < C60773o.m236115a(348.0d)) {
                        CardViewHolderHelper cardViewHolderHelper2 = CardViewHolderHelper.this;
                        C61148e eVar2 = eVar;
                        cardViewHolderHelper2.mo211370a(eVar2, str, videoChatContent, eVar2.f153179c.getWidth(), str2, true);
                    } else {
                        CardViewHolderHelper cardViewHolderHelper3 = CardViewHolderHelper.this;
                        C61148e eVar3 = eVar;
                        cardViewHolderHelper3.mo211370a(eVar3, str, videoChatContent, eVar3.f153179c.getWidth(), str2, false);
                    }
                    eVar.f153179c.getViewTreeObserver().removeOnPreDrawListener(this);
                    return true;
                }
            });
        } else if (((float) ((eVar.f153179c.getWidth() - (C60773o.m236115a(12.0d) * 2)) - eVar.f153181e.getWidth())) - eVar.f153184h.getPaint().measureText(str2) < ((float) C60773o.m236115a(150.0d))) {
            mo211369a(eVar, str, videoChatContent, eVar.f153179c.getWidth(), str2);
        } else if (eVar.f153179c.getWidth() < C60773o.m236115a(348.0d)) {
            mo211370a(eVar, str, videoChatContent, eVar.f153179c.getWidth(), str2, true);
        } else {
            mo211370a(eVar, str, videoChatContent, eVar.f153179c.getWidth(), str2, false);
        }
    }

    /* renamed from: a */
    public void mo211369a(C61148e eVar, String str, VideoChatContent videoChatContent, int i, String str2) {
        int i2 = 0;
        eVar.f153198v.setVisibility(0);
        eVar.f153191o.setVisibility(8);
        eVar.f153182f.setVisibility(8);
        eVar.f153183g.setVisibility(8);
        eVar.f153197u.setVisibility(0);
        eVar.f153185i.setVisibility(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = C60773o.m236115a(12.0d);
        layoutParams.rightMargin = C60773o.m236115a(12.0d);
        layoutParams.topMargin = C60773o.m236115a(4.0d);
        layoutParams.gravity = 8388611;
        eVar.f153197u.setLayoutParams(layoutParams);
        int measureText = (int) eVar.f153185i.getPaint().measureText(str);
        int measureText2 = videoChatContent.meetingCard.isExternal ? ((int) eVar.f153196t.getPaint().measureText(C60773o.m236119a((int) R.string.View_G_ExternalLabel))) + (C60773o.m236115a(4.0d) * 2) + C60773o.m236115a(6.0d) : 0;
        int a = (i - (C60773o.m236115a(12.0d) * 2)) - measureText2;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        if (measureText <= a) {
            eVar.f153185i.setText(str);
            TextView textView = eVar.f153186j;
            if (!videoChatContent.meetingCard.isExternal) {
                i2 = 8;
            }
            textView.setVisibility(i2);
            eVar.f153194r.setVisibility(8);
            return;
        }
        int breakText = eVar.f153185i.getPaint().breakText(str, 0, str.length(), true, (float) (measureText2 + a), new float[1]);
        if (breakText != str.length() || !videoChatContent.meetingCard.isExternal) {
            eVar.f153185i.setText(str.substring(0, breakText));
            eVar.f153195s.setVisibility(0);
            eVar.f153194r.setVisibility(0);
            float f = (float) a;
            if (eVar.f153195s.getPaint().breakText(str, breakText, str.length(), true, f, new float[1]) < str.length() - breakText) {
                int breakText2 = eVar.f153195s.getPaint().breakText(str, breakText, str.length(), true, f - eVar.f153195s.getPaint().measureText("..."), new float[1]);
                TextView textView2 = eVar.f153195s;
                textView2.setText(str.substring(breakText, breakText2 + breakText) + "...");
            } else {
                eVar.f153195s.setText(str.substring(breakText));
            }
            eVar.f153186j.setVisibility(8);
            TextView textView3 = eVar.f153196t;
            if (!videoChatContent.meetingCard.isExternal) {
                i2 = 8;
            }
            textView3.setVisibility(i2);
            layoutParams2.leftMargin = C60773o.m236115a(6.0d);
            layoutParams2.gravity = 16;
            eVar.f153196t.setLayoutParams(layoutParams2);
            return;
        }
        eVar.f153196t.setVisibility(0);
        eVar.f153194r.setVisibility(0);
        eVar.f153195s.setVisibility(8);
        eVar.f153186j.setVisibility(8);
        eVar.f153185i.setText(str);
        layoutParams2.leftMargin = 0;
        layoutParams2.topMargin = C60773o.m236115a(2.0d);
        eVar.f153196t.setLayoutParams(layoutParams2);
    }

    /* renamed from: a */
    public void mo211370a(C61148e eVar, String str, VideoChatContent videoChatContent, int i, String str2, Boolean bool) {
        int i2 = 0;
        if (bool.booleanValue()) {
            eVar.f153198v.setVisibility(0);
            eVar.f153191o.setVisibility(8);
        } else {
            eVar.f153198v.setVisibility(8);
            eVar.f153191o.setVisibility(0);
        }
        eVar.f153182f.setVisibility(0);
        eVar.f153195s.setVisibility(8);
        eVar.f153194r.setVisibility(8);
        int measureText = (int) eVar.f153182f.getPaint().measureText(str);
        int width = eVar.f153181e.getWidth();
        int measureText2 = videoChatContent.meetingCard.isExternal ? ((int) eVar.f153183g.getPaint().measureText(C60773o.m236119a((int) R.string.View_G_ExternalLabel))) + (C60773o.m236115a(4.0d) * 2) + C60773o.m236115a(6.0d) : 0;
        int a = (((((i - (C60773o.m236115a(12.0d) * 2)) - width) - C60773o.m236115a(8.0d)) - C60773o.m236115a(16.0d)) - ((int) eVar.f153184h.getPaint().measureText(str2))) - measureText2;
        if (measureText <= a) {
            eVar.f153182f.setText(str);
            TextView textView = eVar.f153183g;
            if (!videoChatContent.meetingCard.isExternal) {
                i2 = 8;
            }
            textView.setVisibility(i2);
            eVar.f153186j.setVisibility(8);
            eVar.f153197u.setVisibility(8);
            return;
        }
        int breakText = eVar.f153182f.getPaint().breakText(str, 0, str.length(), true, (float) (a + measureText2), new float[1]);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (breakText != str.length() || !videoChatContent.meetingCard.isExternal) {
            eVar.f153182f.setMaxWidth(C60773o.m236115a((double) measureText2) + a);
            eVar.f153182f.setText(str.substring(0, breakText));
            eVar.f153183g.setVisibility(8);
            eVar.f153185i.setVisibility(0);
            eVar.f153197u.setVisibility(0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.leftMargin = C60773o.m236115a(20.0d) + eVar.f153181e.getWidth();
            layoutParams2.gravity = 8388611;
            eVar.f153197u.setLayoutParams(layoutParams2);
            float f = (float) a;
            if (eVar.f153185i.getPaint().breakText(str, breakText, str.length(), true, f, new float[1]) < str.length() - breakText) {
                int breakText2 = eVar.f153185i.getPaint().breakText(str, breakText, str.length(), true, f - eVar.f153185i.getPaint().measureText("..."), new float[1]);
                TextView textView2 = eVar.f153185i;
                textView2.setText(str.substring(breakText, breakText2 + breakText) + "...");
            } else {
                eVar.f153185i.setText(str.substring(breakText));
            }
            TextView textView3 = eVar.f153186j;
            if (!videoChatContent.meetingCard.isExternal) {
                i2 = 8;
            }
            textView3.setVisibility(i2);
            layoutParams.leftMargin = C60773o.m236115a(6.0d);
            layoutParams.gravity = 16;
            eVar.f153186j.setLayoutParams(layoutParams);
            return;
        }
        eVar.f153186j.setVisibility(0);
        eVar.f153197u.setVisibility(0);
        eVar.f153185i.setVisibility(8);
        eVar.f153182f.setText(str);
        eVar.f153183g.setVisibility(8);
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = C60773o.m236115a(2.0d);
        eVar.f153186j.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public boolean mo211372a(VideoChatContent videoChatContent) {
        return (videoChatContent == null || videoChatContent.meetingCard == null || videoChatContent.meetingCard.ownerType == null || videoChatContent.meetingCard.ownerType != ParticipantType.LARK_USER || !TextUtils.equals(videoChatContent.meetingCard.ownerUserId, VideoChatModuleDependency.getDependency().getUserId())) ? false : true;
    }

    /* renamed from: a */
    public static CardViewHolderHelper m237650a() {
        CardViewHolderHelper cardViewHolderHelper;
        synchronized ("CardViewHolderHelper") {
            if (f153045a == null) {
                f153045a = new CardViewHolderHelper();
            }
            cardViewHolderHelper = f153045a;
        }
        return cardViewHolderHelper;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ ObservableSource m237663b(String str) throws Exception {
        return Observable.create(new ObservableOnSubscribe(str) {
            /* class com.ss.android.vc.lark.message.meeting.cardview.$$Lambda$CardViewHolderHelper$zF9AInmG0uUYhxQZ21E5ZPLeAc */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                CardViewHolderHelper.this.m237660a((CardViewHolderHelper) this.f$1, (String) observableEmitter);
            }
        });
    }

    /* renamed from: a */
    private String m237651a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (i < str.length() / 3) {
            int i2 = i * 3;
            i++;
            stringBuffer.append((CharSequence) str, i2, i * 3);
            stringBuffer.append(" ");
        }
        int i3 = i * 3;
        if (i3 < str.length()) {
            stringBuffer.append((CharSequence) str, i3, str.length());
        }
        return stringBuffer.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m237662b(com.ss.android.vc.dto.VideoChatContent r7) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.lark.message.meeting.cardview.CardViewHolderHelper.m237662b(com.ss.android.vc.dto.VideoChatContent):int");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m237654a(VideoChatContent videoChatContent, ObservableEmitter observableEmitter) throws Exception {
        UserInfoService.getChatterById(videoChatContent.meetingCard.forwarderId, new GetUserInfoListener() {
            /* class com.ss.android.vc.lark.message.meeting.cardview.$$Lambda$CardViewHolderHelper$JCbYNYZW_OYnPc_0WKFNayr0WY */

            @Override // com.ss.android.vc.net.service.GetUserInfoListener
            public final void onGetUserInfo(VideoChatUser videoChatUser) {
                CardViewHolderHelper.m237659a(ObservableEmitter.this, videoChatUser);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m237652a(VideoChatContent videoChatContent, View view) {
        C60700b.m235851b("CardViewHolderHelper", "[initClickEvents5]", "copy meeting information clicked");
        C61303k kVar = (C61303k) MeetingManager.m238341a().getMeeting(videoChatContent.meetingCard.meetingId);
        ((ClipboardManager) ar.m236694a().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("meetingCardInfo", UIHelper.getString(R.string.View_M_MeetingIdColon) + m237651a(videoChatContent.meetingCard.meetNumber)));
        C60738ac.m236037c((int) R.string.View_M_JoiningInfoCopied);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m237666c(final VideoChatContent videoChatContent, View view) {
        C60700b.m235851b("CardViewHolderHelper", "[initClickEvents]", "join meeting clicked");
        if (!videoChatContent.meetingCard.isLocked() || m237662b(videoChatContent) != 0 || mo211372a(videoChatContent) || videoChatContent.meetingCard.meetingStatus == 3) {
            String str = videoChatContent.meetingCard.meetingId;
            final Integer valueOf = Integer.valueOf(m237662b(videoChatContent));
            boolean isOnTheCall = MeetingManager.m238341a().isOnTheCall(str);
            if (valueOf.intValue() == 2 && videoChatContent.meetingCard.meetingStatus != 3 && isOnTheCall) {
                C60700b.m235851b("CardViewHolderHelper", "[initClickEvents2]", "reopen meeting from meeting card");
                ByteRTCMeetingActivity.showExistOnTheCallView(str);
            } else if (videoChatContent.meetingCard.meetingStatus == 3 || !MeetingManager.m238341a().isWaiting(str)) {
                VideoChatService.m249602d().asyncCheckAndInit(new VideoChatService.OnInitFinishListener() {
                    /* class com.ss.android.vc.lark.message.meeting.cardview.CardViewHolderHelper.C611102 */

                    @Override // com.ss.android.vc.service.impl.VideoChatService.OnInitFinishListener
                    @XMethod
                    public void onInited() {
                        boolean z;
                        if (valueOf.intValue() != 0 || !CardViewHolderHelper.this.mo211372a(videoChatContent)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        new C61144c().mo211435a(videoChatContent, z);
                    }
                });
            } else {
                ByteRTCMeetingActivity.showExistWaitingView(str);
            }
        } else {
            C60738ac.m236023a((int) R.string.View_M_MeetingLocked);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m237665b(final VideoChatContent videoChatContent, View view) {
        C60700b.m235851b("CardViewHolderHelper", "[initClickEvents]", "short card join meeting clicked");
        if (!videoChatContent.meetingCard.isLocked() || m237662b(videoChatContent) != 0 || mo211372a(videoChatContent) || videoChatContent.meetingCard.meetingStatus == 3) {
            String str = videoChatContent.meetingCard.meetingId;
            final Integer valueOf = Integer.valueOf(m237662b(videoChatContent));
            boolean isOnTheCall = MeetingManager.m238341a().isOnTheCall(str);
            if (valueOf.intValue() == 2 && videoChatContent.meetingCard.meetingStatus != 3 && isOnTheCall) {
                C60700b.m235851b("CardViewHolderHelper", "[initClickEvents2]", "reopen meeting from meeting card");
                ByteRTCMeetingActivity.showExistOnTheCallView(str);
            } else if (videoChatContent.meetingCard.meetingStatus == 3 || !MeetingManager.m238341a().isWaiting(str)) {
                VideoChatService.m249602d().asyncCheckAndInit(new VideoChatService.OnInitFinishListener() {
                    /* class com.ss.android.vc.lark.message.meeting.cardview.CardViewHolderHelper.C611113 */

                    @Override // com.ss.android.vc.service.impl.VideoChatService.OnInitFinishListener
                    @XMethod
                    public void onInited() {
                        boolean z;
                        if (valueOf.intValue() != 0 || !CardViewHolderHelper.this.mo211372a(videoChatContent)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        new C61144c().mo211435a(videoChatContent, z);
                    }
                });
            } else {
                ByteRTCMeetingActivity.showExistWaitingView(str);
            }
        } else {
            C60738ac.m236023a((int) R.string.View_M_MeetingLocked);
        }
    }

    /* renamed from: a */
    private void m237656a(C61148e eVar, VideoChatContent videoChatContent) {
        if (eVar.f153193q.getText() != null && eVar.f153193q.getText().toString().contains("{{name}}")) {
            eVar.f153193q.setText(UIHelper.mustacheFormat((int) R.string.View_C_InvitedToVirtualOffice, "name", ""));
        }
        if (videoChatContent.meetingCard != null && videoChatContent.meetingCard.forwarderId != null) {
            Observable.create(new ObservableOnSubscribe() {
                /* class com.ss.android.vc.lark.message.meeting.cardview.$$Lambda$CardViewHolderHelper$6fVQDDwQjkcazGBlgHyfpZRDM */

                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(ObservableEmitter observableEmitter) {
                    CardViewHolderHelper.m237654a(VideoChatContent.this, observableEmitter);
                }
            }).subscribeOn(LarkRxSchedulers.io()).observeOn(LarkRxSchedulers.io()).flatMap(new Function() {
                /* class com.ss.android.vc.lark.message.meeting.cardview.$$Lambda$CardViewHolderHelper$QNKlcNrGXJLWPY68OQaSc0up9_s */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return CardViewHolderHelper.this.m237663b((String) obj);
                }
            }).observeOn(LarkRxSchedulers.mainThread()).subscribe(new Consumer() {
                /* class com.ss.android.vc.lark.message.meeting.cardview.$$Lambda$CardViewHolderHelper$Q3DJBMNobdyL_YxSshOx1wxMqLE */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    CardViewHolderHelper.m237658a(C61148e.this, (String) obj);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m237658a(C61148e eVar, String str) throws Exception {
        if (!TextUtils.isEmpty(str)) {
            eVar.f153193q.setText(str);
        }
    }

    /* renamed from: a */
    private void m237653a(VideoChatContent videoChatContent, CardSubMessageInfo bVar, int i) {
        if (videoChatContent != null && videoChatContent.meetingCard != null) {
            C60700b.m235851b("CardViewHolderHelper", "[logCardInfo]", "onBindViewHolder message id: " + bVar.mo211430a() + " meeting status: " + videoChatContent.meetingCard.meetingStatus + " card type: " + i + " meetingId: " + videoChatContent.meetingCard.meetingId);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m237655a(final CardSubMessageInfo bVar, final VideoChatContent videoChatContent, View view) {
        C60700b.m235851b("CardViewHolderHelper", "[initClickEvents5]", "participant list clicked");
        VideoChatService.m249602d().asyncCheckAndInit(new VideoChatService.OnInitFinishListener() {
            /* class com.ss.android.vc.lark.message.meeting.cardview.CardViewHolderHelper.C611124 */

            @Override // com.ss.android.vc.service.impl.VideoChatService.OnInitFinishListener
            @XMethod
            public void onInited() {
                new C61144c().mo211436a(bVar.mo211431b(), videoChatContent);
            }
        });
    }

    /* renamed from: a */
    private void m237657a(C61148e eVar, VideoChatContent videoChatContent, CardSubMessageInfo bVar) {
        if (videoChatContent.meetingCard != null) {
            eVar.f153191o.setOnClickListener(new View.OnClickListener(videoChatContent) {
                /* class com.ss.android.vc.lark.message.meeting.cardview.$$Lambda$CardViewHolderHelper$NDlX5iHf7ry6aAgfpZyJprNFN9s */
                public final /* synthetic */ VideoChatContent f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    CardViewHolderHelper.this.m237666c(this.f$1, view);
                }
            });
            eVar.f153198v.setOnClickListener(new View.OnClickListener(videoChatContent) {
                /* class com.ss.android.vc.lark.message.meeting.cardview.$$Lambda$CardViewHolderHelper$itKFNR1wm3Nm9Qx4xR33bcG5La8 */
                public final /* synthetic */ VideoChatContent f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    CardViewHolderHelper.this.m237665b(this.f$1, view);
                }
            });
            eVar.f153190n.setOnClickListener(new View.OnClickListener(bVar, videoChatContent) {
                /* class com.ss.android.vc.lark.message.meeting.cardview.$$Lambda$CardViewHolderHelper$8j3VjLGFb7Qkeg0qxdn4pO8X5As */
                public final /* synthetic */ CardSubMessageInfo f$1;
                public final /* synthetic */ VideoChatContent f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(View view) {
                    CardViewHolderHelper.this.m237655a((CardViewHolderHelper) this.f$1, (CardSubMessageInfo) this.f$2, (VideoChatContent) view);
                }
            });
            eVar.f153188l.setOnClickListener(new View.OnClickListener(videoChatContent) {
                /* class com.ss.android.vc.lark.message.meeting.cardview.$$Lambda$CardViewHolderHelper$pS7HvKCCKIqP_lsDpmybA32zMfk */
                public final /* synthetic */ VideoChatContent f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    CardViewHolderHelper.this.m237652a((CardViewHolderHelper) this.f$1, (VideoChatContent) view);
                }
            });
        }
    }

    /* renamed from: b */
    private void m237664b(int i, C61148e eVar, CardSubMessageInfo bVar, VideoChatContent videoChatContent) {
        String str;
        if (videoChatContent != null && videoChatContent.meetingCard != null) {
            HashMap hashMap = new HashMap();
            Iterator<Participant> it = videoChatContent.meetingCard.participants.iterator();
            while (it.hasNext()) {
                Participant next = it.next();
                if (next != null && !hashMap.containsKey(next.getId())) {
                    hashMap.put(next.getId(), next.getParticipantType());
                }
            }
            UserInfoService.getUserInfoByIds(videoChatContent.meetingCard.meetingId, hashMap);
            Context context = eVar.f153177a.getContext();
            if (videoChatContent.meetingCard.meetingSource == 3) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("name", videoChatContent.meetingCard.topic);
                str = UIHelper.mustacheFormat(context.getResources().getString(R.string.View_M_VideoInterviewNameBraces), hashMap2);
            } else {
                str = videoChatContent.meetingCard.topic;
            }
            if (C57782ag.m224241a(str)) {
                str = context.getResources().getString(R.string.View_G_ServerNoTitle);
            }
            if (!C57782ag.m224241a(videoChatContent.meetingCard.meetNumber)) {
                eVar.f153187k.setVisibility(0);
                TextView textView = eVar.f153187k;
                textView.setText(UIHelper.getString(R.string.View_M_MeetingIdColon) + m237651a(videoChatContent.meetingCard.meetNumber));
            } else {
                eVar.f153187k.setVisibility(8);
            }
            int b = m237662b(videoChatContent);
            if (b != 2 || videoChatContent.meetingCard.meetingStatus == 3) {
                int i2 = videoChatContent.meetingCard.meetingStatus;
                if (i2 == 2) {
                    if (b != 0 || !mo211372a(videoChatContent)) {
                        eVar.f153191o.setText(context.getResources().getString(R.string.View_M_FullButton));
                        eVar.f153191o.setTextColor(C60773o.m236126d(R.color.text_disable));
                        eVar.f153191o.setBackground(ContextCompat.getDrawable(context, R.drawable.vc_bg_meeting_card_ended_button));
                        eVar.f153198v.setText(context.getResources().getString(R.string.View_M_FullButton));
                        eVar.f153198v.setTextColor(C60773o.m236126d(R.color.text_disable));
                        eVar.f153198v.setBackground(ContextCompat.getDrawable(context, R.drawable.vc_bg_meeting_card_ended_button));
                    } else {
                        eVar.f153191o.setBackground(C60773o.m236128f(R.drawable.vc_bg_meeting_card_join_button));
                        eVar.f153191o.setText(context.getResources().getString(R.string.View_M_JoinButton));
                        eVar.f153191o.setTextColor(C60773o.m236126d(R.color.ud_G600));
                        eVar.f153198v.setBackground(C60773o.m236128f(R.drawable.vc_bg_meeting_card_join_button));
                        eVar.f153198v.setText(context.getResources().getString(R.string.View_M_JoinButton));
                        eVar.f153198v.setTextColor(C60773o.m236126d(R.color.ud_G600));
                    }
                    eVar.f153181e.setImageTintList(C60773o.m236127e(R.color.udtoken_message_card_text_green));
                    eVar.f153182f.setTextColor(C60773o.m236126d(R.color.udtoken_message_card_text_green));
                    eVar.f153185i.setTextColor(C60773o.m236126d(R.color.udtoken_message_card_text_green));
                    eVar.f153184h.setTextColor(C60773o.m236126d(R.color.udtoken_message_card_text_green));
                    eVar.f153195s.setTextColor(C60773o.m236126d(R.color.udtoken_message_card_text_green));
                    eVar.f153183g.setBackground(C60773o.m236128f(R.drawable.bg_tag_external_meetingcard));
                    eVar.f153183g.setTextColor(C60773o.m236126d(R.color.udtoken_tag_text_s_green));
                    eVar.f153186j.setBackground(C60773o.m236128f(R.drawable.bg_tag_external_meetingcard));
                    eVar.f153186j.setTextColor(C60773o.m236126d(R.color.udtoken_tag_text_s_green));
                    eVar.f153196t.setBackground(C60773o.m236128f(R.drawable.bg_tag_external_meetingcard));
                    eVar.f153196t.setTextColor(C60773o.m236126d(R.color.udtoken_tag_text_s_green));
                    String a = C61145d.m237771a().mo211438a(C61145d.m237771a().mo211442b(), videoChatContent.meetingCard);
                    eVar.f153184h.setText(a);
                    mo211371a(eVar, str, videoChatContent, a);
                    C61145d.m237771a().mo211440a(eVar.f153178b, videoChatContent);
                } else if (i2 != 3) {
                    eVar.f153191o.setBackground(C60773o.m236128f(R.drawable.vc_bg_meeting_card_join_button));
                    eVar.f153191o.setText(context.getResources().getString(R.string.View_M_JoinButton));
                    eVar.f153191o.setTextColor(C60773o.m236126d(R.color.ud_G600));
                    eVar.f153198v.setBackground(C60773o.m236128f(R.drawable.vc_bg_meeting_card_join_button));
                    eVar.f153198v.setText(context.getResources().getString(R.string.View_M_JoinButton));
                    eVar.f153198v.setTextColor(C60773o.m236126d(R.color.ud_G600));
                    eVar.f153181e.setImageTintList(C60773o.m236127e(R.color.udtoken_message_card_text_green));
                    eVar.f153182f.setTextColor(C60773o.m236126d(R.color.udtoken_message_card_text_green));
                    eVar.f153185i.setTextColor(C60773o.m236126d(R.color.udtoken_message_card_text_green));
                    eVar.f153184h.setTextColor(C60773o.m236126d(R.color.udtoken_message_card_text_green));
                    eVar.f153195s.setTextColor(C60773o.m236126d(R.color.udtoken_message_card_text_green));
                    eVar.f153183g.setBackground(C60773o.m236128f(R.drawable.bg_tag_external_meetingcard));
                    eVar.f153183g.setTextColor(C60773o.m236126d(R.color.udtoken_tag_text_s_green));
                    eVar.f153186j.setBackground(C60773o.m236128f(R.drawable.bg_tag_external_meetingcard));
                    eVar.f153186j.setTextColor(C60773o.m236126d(R.color.udtoken_tag_text_s_green));
                    eVar.f153196t.setBackground(C60773o.m236128f(R.drawable.bg_tag_external_meetingcard));
                    eVar.f153196t.setTextColor(C60773o.m236126d(R.color.udtoken_tag_text_s_green));
                    String a2 = C61145d.m237771a().mo211438a(C61145d.m237771a().mo211442b(), videoChatContent.meetingCard);
                    eVar.f153184h.setText(a2);
                    mo211371a(eVar, str, videoChatContent, a2);
                    C61145d.m237771a().mo211440a(eVar.f153178b, videoChatContent);
                } else {
                    eVar.f153191o.setText(context.getResources().getString(R.string.View_M_EndedButton));
                    eVar.f153191o.setTextColor(C60773o.m236126d(R.color.text_disable));
                    eVar.f153191o.setBackground(C60773o.m236128f(R.drawable.vc_bg_meeting_card_ended_button));
                    eVar.f153198v.setText(context.getResources().getString(R.string.View_M_EndedButton));
                    eVar.f153198v.setTextColor(C60773o.m236126d(R.color.text_disable));
                    eVar.f153198v.setBackground(C60773o.m236128f(R.drawable.vc_bg_meeting_card_ended_button));
                    eVar.f153181e.setImageTintList(C60773o.m236127e(R.color.udtoken_message_card_text_neutral));
                    eVar.f153182f.setTextColor(C60773o.m236126d(R.color.udtoken_message_card_text_neutral));
                    eVar.f153185i.setTextColor(C60773o.m236126d(R.color.udtoken_message_card_text_neutral));
                    eVar.f153184h.setTextColor(C60773o.m236126d(R.color.udtoken_message_card_text_neutral));
                    eVar.f153195s.setTextColor(C60773o.m236126d(R.color.udtoken_message_card_text_neutral));
                    eVar.f153183g.setBackground(C60773o.m236128f(R.drawable.vc_bg_tag_external_meetingcard_ended));
                    eVar.f153183g.setTextColor(C60773o.m236126d(R.color.udtoken_message_card_text_neutral));
                    eVar.f153186j.setBackground(C60773o.m236128f(R.drawable.vc_bg_tag_external_meetingcard_ended));
                    eVar.f153186j.setTextColor(C60773o.m236126d(R.color.udtoken_message_card_text_neutral));
                    eVar.f153196t.setBackground(C60773o.m236128f(R.drawable.vc_bg_tag_external_meetingcard_ended));
                    eVar.f153196t.setTextColor(C60773o.m236126d(R.color.udtoken_message_card_text_neutral));
                    String a3 = C61145d.m237771a().mo211437a(videoChatContent.meetingCard.endTime - videoChatContent.meetingCard.startTime);
                    eVar.f153184h.setText(a3);
                    mo211371a(eVar, str, videoChatContent, a3);
                    C61145d.m237771a().mo211439a(eVar.f153178b);
                }
            } else {
                eVar.f153191o.setText(context.getResources().getString(R.string.View_M_JoinedButton));
                eVar.f153191o.setTextColor(C60773o.m236126d(R.color.text_title));
                eVar.f153191o.setBackground(C60773o.m236128f(R.drawable.vc_bg_meeting_card_joined_button));
                eVar.f153198v.setText(context.getResources().getString(R.string.View_M_JoinedButton));
                eVar.f153198v.setTextColor(C60773o.m236126d(R.color.text_title));
                eVar.f153198v.setBackground(C60773o.m236128f(R.drawable.vc_bg_meeting_card_joined_button));
                eVar.f153181e.setImageTintList(C60773o.m236127e(R.color.udtoken_message_card_text_green));
                eVar.f153182f.setTextColor(C60773o.m236126d(R.color.udtoken_message_card_text_green));
                eVar.f153185i.setTextColor(C60773o.m236126d(R.color.udtoken_message_card_text_green));
                eVar.f153184h.setTextColor(C60773o.m236126d(R.color.udtoken_message_card_text_green));
                eVar.f153195s.setTextColor(C60773o.m236126d(R.color.udtoken_message_card_text_green));
                eVar.f153183g.setBackground(C60773o.m236128f(R.drawable.bg_tag_external_meetingcard));
                eVar.f153183g.setTextColor(C60773o.m236126d(R.color.udtoken_tag_text_s_green));
                eVar.f153186j.setBackground(C60773o.m236128f(R.drawable.bg_tag_external_meetingcard));
                eVar.f153186j.setTextColor(C60773o.m236126d(R.color.udtoken_tag_text_s_green));
                eVar.f153196t.setBackground(C60773o.m236128f(R.drawable.bg_tag_external_meetingcard));
                eVar.f153196t.setTextColor(C60773o.m236126d(R.color.udtoken_tag_text_s_green));
                String a4 = C61145d.m237771a().mo211438a(C61145d.m237771a().mo211442b(), videoChatContent.meetingCard);
                eVar.f153184h.setText(a4);
                mo211371a(eVar, str, videoChatContent, a4);
                C61145d.m237771a().mo211440a(eVar.f153178b, videoChatContent);
            }
        }
    }
}
