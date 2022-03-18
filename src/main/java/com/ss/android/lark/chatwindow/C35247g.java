package com.ss.android.lark.chatwindow;

import android.text.TextUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.C32805a;
import com.ss.android.lark.chat.base.view.vo.message.AudioContentVO;
import com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.service.AbstractC34122c;
import com.ss.android.lark.chat.service.impl.C34206f;
import com.ss.android.lark.dependency.al;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.widget.richtext.C59031e;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.chatwindow.g */
public class C35247g {

    /* renamed from: a */
    private static al f91021a = C29990c.m110930b().mo134596x();

    /* renamed from: b */
    private static AbstractC34122c f91022b = C34206f.m132767a();

    /* renamed from: a */
    public static String m137626a(boolean z, boolean z2, boolean z3) {
        return z ? "meeting" : z2 ? "group" : z3 ? "single_bot" : "single";
    }

    /* renamed from: a */
    public static boolean m137632a(Content content) {
        if (content == null || !(content instanceof PostContent)) {
            return false;
        }
        return m137631a((PostContent) content);
    }

    /* renamed from: a */
    public static boolean m137631a(PostContent postContent) {
        if (postContent == null) {
            return false;
        }
        return postContent.isGroupAnnouncement();
    }

    /* renamed from: com.ss.android.lark.chatwindow.g$1 */
    static /* synthetic */ class C352481 {

        /* renamed from: a */
        static final /* synthetic */ int[] f91023a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.biz.im.api.param.IMConstants$NetworkLevel[] r0 = com.ss.android.lark.biz.im.api.param.IMConstants.NetworkLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.chatwindow.C35247g.C352481.f91023a = r0
                com.ss.android.lark.biz.im.api.param.IMConstants$NetworkLevel r1 = com.ss.android.lark.biz.im.api.param.IMConstants.NetworkLevel.EXCELLENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.chatwindow.C35247g.C352481.f91023a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.biz.im.api.param.IMConstants$NetworkLevel r1 = com.ss.android.lark.biz.im.api.param.IMConstants.NetworkLevel.EVALUATING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chatwindow.C35247g.C352481.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static int m137623a() {
        int i = C352481.f91023a[C29990c.m110930b().mo134585m().mo134481a().ordinal()];
        if (i == 1) {
            return ParticipantRepo.f117150c;
        }
        if (i != 2) {
            return 0;
        }
        return 100;
    }

    /* renamed from: a */
    public static TranslatableContentVO m137625a(TranslatableContentVO oVar) {
        if (oVar == null) {
            return null;
        }
        if (m137634b(oVar)) {
            return oVar;
        }
        return oVar.mo121930y();
    }

    /* renamed from: b */
    public static boolean m137635b(ContentVO aVar) {
        if (aVar == null || !(aVar instanceof PostContentVO)) {
            return false;
        }
        return ((PostContentVO) aVar).mo121882n();
    }

    /* renamed from: b */
    public static boolean m137634b(TranslatableContentVO oVar) {
        if (oVar.mo121930y() == null || TextUtils.isEmpty(oVar.mo121925t()) || !TextUtils.equals(oVar.mo121925t(), oVar.mo121930y().mo121925t())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static ArrayList<String> m137627a(ContentVO aVar) {
        if (aVar instanceof BaseTextContentVO) {
            return C59031e.m229178a(((BaseTextContentVO) aVar).mo121772a(), true);
        }
        return new ArrayList<>();
    }

    /* renamed from: a */
    public static boolean m137629a(AudioContentVO bVar) {
        if (bVar == null || bVar.mo121809d() || TextUtils.isEmpty(bVar.mo121810e())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m137630a(ChatterDescription chatterDescription) {
        boolean z;
        if (chatterDescription == null) {
            return true;
        }
        if (chatterDescription.description == null || TextUtils.isEmpty(chatterDescription.description.trim())) {
            z = true;
        } else {
            z = false;
        }
        if (!z || chatterDescription.type != ChatterDescription.Type.DEFAULT) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m137633b(int i, long j) {
        if (!m137628a(i, j) || j == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m137628a(int i, long j) {
        if (i <= 0 || (j <= f91021a.mo134462a() && j != 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static long m137624a(int i, long j, long j2, String str) {
        if (j == 0) {
            return (long) (i * 1000);
        }
        long a = f91021a.mo134462a();
        C32805a.m125891a().mo120929a(i, j, j2, a, str);
        return Math.min(j - a, ((1000 * j2) + 604800000) - a);
    }
}
