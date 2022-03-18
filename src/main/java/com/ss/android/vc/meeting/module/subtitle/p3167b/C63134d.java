package com.ss.android.vc.meeting.module.subtitle.p3167b;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.util.SparseArray;
import android.view.View;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.meeting.module.subtitle.AbstractC63158f;
import com.ss.android.vc.meeting.module.subtitle.SubtitleModel2;

/* renamed from: com.ss.android.vc.meeting.module.subtitle.b.d */
public class C63134d extends AbstractC63131b {
    @Override // com.ss.android.vc.meeting.module.subtitle.p3167b.AbstractC63131b
    /* renamed from: b */
    public void mo218593b(SubtitleModel2 subtitleModel2) {
        SpannableString spannableString = new SpannableString(subtitleModel2.mSubtitle.mTarget);
        if (subtitleModel2.mSearchMatch != null && CollectionUtils.isNotEmpty(subtitleModel2.mSearchMatch.f152654b) && !TextUtils.isEmpty(subtitleModel2.mSearchContent)) {
            for (Integer num : subtitleModel2.mSearchMatch.f152654b) {
                int intValue = num.intValue() + subtitleModel2.mSearchContent.length();
                if (num.intValue() < spannableString.length() && intValue <= spannableString.length()) {
                    if (!C57782ag.m224242a(subtitleModel2.mSeqId + "_" + num, subtitleModel2.mCurrentSelectItem)) {
                        spannableString.setSpan(new BackgroundColorSpan(C60773o.m236126d(R.color.ud_S300)), num.intValue(), intValue, 17);
                    } else {
                        spannableString.setSpan(new BackgroundColorSpan(C60773o.m236126d(R.color.ud_R300)), num.intValue(), intValue, 17);
                    }
                }
            }
        }
        this.f159100f.setText(spannableString);
        this.f159100f.setCallBack(this.f159102h);
    }

    public C63134d(View view, String str, SparseArray sparseArray, AbstractC63158f fVar) {
        super(view, str, sparseArray, fVar);
    }
}
