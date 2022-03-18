package com.ss.android.lark.mm.utils;

import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.widget.onboarding.MmNewGuideConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/mm/utils/MmOnBoardingUtils;", "", "()V", "editSpeakerGuideKey", "", "podcastGuideKey", "podcastSpKey", "getPodcastSpKey", "()Ljava/lang/String;", "showEditSpeakerOnBoarding", "", "anchor", "Landroid/view/View;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.utils.j */
public final class MmOnBoardingUtils {

    /* renamed from: a */
    public static final MmOnBoardingUtils f118633a = new MmOnBoardingUtils();

    /* renamed from: b */
    private static final String f118634b;

    private MmOnBoardingUtils() {
    }

    /* renamed from: a */
    public final String mo165491a() {
        return f118634b;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.utils.j$a */
    public static final class RunnableC47106a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f118635a;

        RunnableC47106a(View view) {
            this.f118635a = view;
        }

        public final void run() {
            MmNewGuideConfig mmNewGuideConfig = new MmNewGuideConfig(this.f118635a, "vc_minutes_edit_speaker", null, ResString.f118656a.mo165504a(R.string.MMWeb_G_EditSpeakerHere_Onboard), 80);
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            a.getGuideDependency().mo144593a(mmNewGuideConfig, null);
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("vc_mm_podcast_onboard.");
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.ILoginDepend loginDepend = a.getLoginDepend();
        Intrinsics.checkExpressionValueIsNotNull(loginDepend, "MmDepend.impl().loginDepend");
        sb.append(loginDepend.mo144647a());
        f118634b = sb.toString();
    }

    /* renamed from: a */
    public final void mo165492a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "anchor");
        C45859k.m181686a(new RunnableC47106a(view), 200);
    }
}
