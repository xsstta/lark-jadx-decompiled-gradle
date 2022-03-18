package com.ss.android.vc.meeting.module.subtitle.p3167b;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.util.SparseArray;
import android.view.View;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.entity.MeetingSubtitleData;
import com.ss.android.vc.meeting.module.subtitle.AbstractC63158f;
import com.ss.android.vc.meeting.module.subtitle.SubtitleModel2;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;

/* renamed from: com.ss.android.vc.meeting.module.subtitle.b.f */
public class C63136f extends AbstractC63131b {

    /* renamed from: com.ss.android.vc.meeting.module.subtitle.b.f$a */
    public abstract class AbstractC63138a extends ClickableSpan {
        public AbstractC63138a() {
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(C60773o.m236126d(R.color.ud_B500));
            textPaint.setUnderlineText(false);
        }
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.p3167b.AbstractC63131b
    /* renamed from: b */
    public void mo218593b(SubtitleModel2 subtitleModel2) {
        MeetingSubtitleData.SubtitleEvent subtitleEvent = subtitleModel2.mSubtitleEvent;
        if (subtitleEvent != null && subtitleEvent.f152466c != null) {
            if (subtitleEvent.f152465b == null || subtitleEvent.f152466c == null) {
                this.f159100f.setVisibility(8);
            } else {
                UserInfoService.getUserInfoById(this.f159096b, subtitleModel2.mSubtitle.mSpeaker.getUserId(), subtitleModel2.mSubtitle.mSpeaker.getParticipantType(), new GetUserInfoListener(subtitleEvent, subtitleModel2) {
                    /* class com.ss.android.vc.meeting.module.subtitle.p3167b.$$Lambda$f$oM1N1dDCrFV7uX_nVmaTq3CoW6c */
                    public final /* synthetic */ MeetingSubtitleData.SubtitleEvent f$1;
                    public final /* synthetic */ SubtitleModel2 f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    @Override // com.ss.android.vc.net.service.GetUserInfoListener
                    public final void onGetUserInfo(VideoChatUser videoChatUser) {
                        C63136f.lambda$oM1N1dDCrFV7uX_nVmaTq3CoW6c(C63136f.this, this.f$1, this.f$2, videoChatUser);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m247248a(final MeetingSubtitleData.SubtitleEvent subtitleEvent, SubtitleModel2 subtitleModel2, VideoChatUser videoChatUser) {
        String str;
        String str2;
        String str3;
        if (TextUtils.isEmpty(videoChatUser.getName())) {
            str = videoChatUser.getNickname();
        } else {
            str = videoChatUser.getName();
        }
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(subtitleEvent.f152466c.f152468b)) {
            str2 = UIHelper.getString(R.string.View_VM_UntitledDocument);
        } else {
            str2 = subtitleEvent.f152466c.f152468b;
        }
        if (subtitleEvent.f152464a == MeetingSubtitleData.SubtitleEvent.Type.START_FOLLOW) {
            str3 = UIHelper.mustacheFormat((int) R.string.View_G_StartedSharingColonNameBraces, "name", str);
        } else {
            str3 = UIHelper.mustacheFormat((int) R.string.View_G_StoppedSharingColonNameBraces, "name", str);
        }
        sb.append(String.format("(%s)", str3 + "  " + str2));
        int length = str3.length() + 1;
        SpannableString spannableString = new SpannableString(sb.toString());
        C631371 r0 = new AbstractC63138a() {
            /* class com.ss.android.vc.meeting.module.subtitle.p3167b.C63136f.C631371 */

            public void onClick(View view) {
                C63136f.this.f159102h.mo218632a(subtitleEvent.f152466c.f152467a);
            }
        };
        int i = length + 1;
        spannableString.setSpan(r0, i, str2.length() + length + 2, 17);
        if (subtitleModel2.mSearchMatch != null && CollectionUtils.isNotEmpty(subtitleModel2.mSearchMatch.f152654b) && !TextUtils.isEmpty(subtitleModel2.mSearchContent)) {
            for (Integer num : subtitleModel2.mSearchMatch.f152654b) {
                int intValue = num.intValue();
                Integer valueOf = Integer.valueOf(length + 2 + num.intValue());
                int intValue2 = valueOf.intValue() + subtitleModel2.mSearchContent.length();
                if (valueOf.intValue() < spannableString.length() && intValue2 <= spannableString.length()) {
                    if (!C57782ag.m224242a(subtitleModel2.mSeqId + "_" + intValue, subtitleModel2.mCurrentSelectItem)) {
                        spannableString.setSpan(new BackgroundColorSpan(Color.parseColor("#fff67a")), valueOf.intValue(), intValue2, 17);
                    } else {
                        spannableString.setSpan(new BackgroundColorSpan(C60773o.m236126d(R.color.ud_R300)), valueOf.intValue(), intValue2, 17);
                    }
                }
            }
        }
        spannableString.setSpan(new ImageSpan(this.itemView.getContext(), (int) R.drawable.icon_doc_outlined, 1), length, i, 33);
        this.f159100f.setText(spannableString);
        this.f159100f.setMovementMethod(LinkMovementMethod.getInstance());
        this.f159100f.setVisibility(0);
    }

    public C63136f(View view, String str, SparseArray sparseArray, AbstractC63158f fVar) {
        super(view, str, sparseArray, fVar);
    }
}
