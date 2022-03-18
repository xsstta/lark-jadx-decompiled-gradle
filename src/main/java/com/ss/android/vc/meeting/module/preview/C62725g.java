package com.ss.android.vc.meeting.module.preview;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57858o;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60742af;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.lark.message.meeting.cardview.attendee.MeetingAttendeeActivity;
import com.ss.android.vc.meeting.utils.C63497j;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.statistics.event.ce;
import java.lang.reflect.Array;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.vc.meeting.module.preview.g */
public class C62725g {

    /* renamed from: com.ss.android.vc.meeting.module.preview.g$a */
    public static class C62727a extends ClickableSpan {

        /* renamed from: a */
        private String f157861a;

        /* renamed from: b */
        private AbstractC62728a f157862b;

        /* renamed from: com.ss.android.vc.meeting.module.preview.g$a$a */
        public interface AbstractC62728a {
            void onJump(String str);
        }

        public void onClick(View view) {
            AbstractC62728a aVar = this.f157862b;
            if (aVar != null) {
                aVar.onJump(this.f157861a);
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(C60773o.m236126d(R.color.text_link_normal));
            textPaint.setUnderlineText(false);
        }

        private C62727a(String str, AbstractC62728a aVar) {
            this.f157861a = str;
            this.f157862b = aVar;
        }
    }

    /* renamed from: a */
    public static void m245471a(TextView textView, String str, List<String> list, C62727a.AbstractC62728a aVar) {
        Pattern compile = Pattern.compile("@@.*?@@");
        SpannableString spannableString = new SpannableString(str);
        if (!C60742af.m236059a(list)) {
            int size = list.size();
            int[] iArr = new int[2];
            iArr[1] = 2;
            iArr[0] = size;
            int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
            for (int i = 0; i < list.size(); i++) {
                Matcher matcher = compile.matcher(spannableString);
                if (matcher.find()) {
                    String group = matcher.group();
                    String substring = str.substring(matcher.start() + 2, matcher.end() - 2);
                    str = str.replace(group, substring);
                    iArr2[i][0] = matcher.start();
                    iArr2[i][1] = matcher.start() + substring.length();
                }
                spannableString = new SpannableString(str);
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                spannableString.setSpan(new C62727a(list.get(i2), aVar), iArr2[i2][0], iArr2[i2][1], 33);
            }
        }
        textView.setText(spannableString);
        textView.setTextColor(C60773o.m236126d(R.color.text_placeholder));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
    }

    /* renamed from: a */
    public static void m245472a(String str, ByteviewUser byteviewUser, String str2, List<Participant> list) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() != 0) {
            int size = list.size();
            Context a = ar.m236694a();
            if (size != 1) {
                String userId = byteviewUser.getUserId();
                String[] strArr = new String[size];
                int[] iArr = new int[size];
                boolean[] zArr = new boolean[size];
                int[] iArr2 = new int[size];
                boolean[] zArr2 = new boolean[size];
                for (int i = 0; i < size; i++) {
                    strArr[i] = list.get(i).getId();
                    iArr[i] = list.get(i).getParticipantType().getNumber();
                    zArr[i] = ParticipantUtil.m248735d(list.get(i));
                    iArr2[i] = list.get(i).getDeviceType().getNumber();
                    zArr2[i] = list.get(i).isGuest();
                }
                C57858o.m224559a(MeetingAttendeeActivity.class).mo196058a("extra.meeting_id", str).mo196062a("extra.participant_ids", strArr).mo196061a("extra.participant_types", iArr).mo196063a("extra.participant_external_types", zArr).mo196063a("extra.participant_is_guests", zArr2).mo196061a("extra.participant_device_types", iArr2).mo196058a("extra.meeting.topic", str2).mo196058a("extra.creator.id", userId).mo196058a("extra.from.source", "VC_PREVIEW_ATTENDEE").mo196064a(a);
            } else if (C63497j.m248855a(list.get(0))) {
                String id = list.get(0).getId();
                C60700b.m235851b("MeetingPreviewJumpUtils", "[openAttendee]", "go to profile, id = " + id);
                ce.m250276i();
                C63497j.m248854a(a, id, str2, str, byteviewUser);
            }
        }
    }
}
