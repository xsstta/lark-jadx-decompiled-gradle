package com.ss.android.vc.meeting.module.reaction.livewidget;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.C58377d;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.meeting.module.reaction.livewidget.VCLinkEmojiTextView;

/* renamed from: com.ss.android.vc.meeting.module.reaction.livewidget.b */
public class C62841b {
    /* renamed from: a */
    private static VCLinkEmojiTextView m245979a(Context context) {
        VCLinkEmojiTextView vCLinkEmojiTextView = new VCLinkEmojiTextView(context);
        vCLinkEmojiTextView.setUrlTextColor(C60773o.m236126d(R.color.ud_B500));
        vCLinkEmojiTextView.setUrlBackGroundColor(C60773o.m236126d(R.color.ud_N50));
        vCLinkEmojiTextView.setCurrentUserId(C58377d.m226286a().mo102878a());
        return vCLinkEmojiTextView;
    }

    /* renamed from: a */
    public static VCLinkEmojiTextView m245980a(Context context, VCLinkEmojiTextView.AbstractC62815i iVar, VCLinkEmojiTextView.AbstractC62811e eVar) {
        VCLinkEmojiTextView a = m245979a(context);
        a.setUrlStringClickListner(iVar);
        a.setAtStringClickListner(eVar);
        return a;
    }
}
