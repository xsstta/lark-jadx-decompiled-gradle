package com.ss.android.lark.guide.biz.bubble.chat;

import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.biz.onboarding.res.IResGetter;
import com.ss.android.lark.guide.biz.onboarding.res.ResGetterFactory;
import com.ss.android.lark.guide.ui.common.popup.GuidePopupBuilder;
import com.ss.android.lark.guide.ui.common.popup.IGuide;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ug.common.ChatOpener;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\n\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/guide/biz/bubble/chat/InputMessageTip;", "", "()V", "resGetter", "Lcom/ss/android/lark/guide/biz/onboarding/res/IResGetter;", "createAllStaffGroupTip", "Lcom/ss/android/lark/guide/biz/bubble/chat/BaseInputMessageTip;", "createCustomerServiceTip", "createFlowTip", "createMyselfTip", "createTip", "chatType", "", "show", "", "anchorView", "Landroid/view/View;", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.a.a.b */
public final class InputMessageTip {

    /* renamed from: b */
    public static final Companion f99093b = new Companion(null);

    /* renamed from: a */
    public final IResGetter f99094a = ResGetterFactory.f99165a.mo141363a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/guide/biz/bubble/chat/InputMessageTip$Companion;", "", "()V", "TAG", "", "show", "", "anchorView", "Landroid/view/View;", "chatType", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.a.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo141309a(View view, int i) {
            return new InputMessageTip().mo141308a(view, i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/guide/biz/bubble/chat/InputMessageTip$createFlowTip$1", "Lcom/ss/android/lark/guide/biz/bubble/chat/BaseInputMessageTip;", "getContent", "", "getTitle", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.a.a.b$d */
    public static final class C38569d extends BaseInputMessageTip {

        /* renamed from: a */
        final /* synthetic */ String f99097a;

        /* renamed from: b */
        final /* synthetic */ String f99098b;

        @Override // com.ss.android.lark.guide.biz.bubble.chat.BaseInputMessageTip
        /* renamed from: c */
        public String mo141306c() {
            return this.f99098b;
        }

        @Override // com.ss.android.lark.guide.biz.bubble.chat.BaseInputMessageTip
        /* renamed from: d */
        public String mo141307d() {
            return this.f99097a;
        }

        C38569d(String str, String str2) {
            this.f99097a = str;
            this.f99098b = str2;
        }
    }

    /* renamed from: a */
    private final BaseInputMessageTip m152113a() {
        return new C38568c(this);
    }

    /* renamed from: b */
    private final BaseInputMessageTip m152115b() {
        return new C38567b(this);
    }

    /* renamed from: c */
    private final BaseInputMessageTip m152116c() {
        return new C38570e(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/guide/biz/bubble/chat/InputMessageTip$createAllStaffGroupTip$1", "Lcom/ss/android/lark/guide/biz/bubble/chat/BaseInputMessageTip;", "getContent", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.a.a.b$b */
    public static final class C38567b extends BaseInputMessageTip {

        /* renamed from: a */
        final /* synthetic */ InputMessageTip f99095a;

        @Override // com.ss.android.lark.guide.biz.bubble.chat.BaseInputMessageTip
        /* renamed from: d */
        public String mo141307d() {
            return this.f99095a.f99094a.mo141352a(R.string.Lark_Guide_SpotlightAllStaffGroup);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38567b(InputMessageTip bVar) {
            this.f99095a = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/guide/biz/bubble/chat/InputMessageTip$createCustomerServiceTip$1", "Lcom/ss/android/lark/guide/biz/bubble/chat/BaseInputMessageTip;", "getContent", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.a.a.b$c */
    public static final class C38568c extends BaseInputMessageTip {

        /* renamed from: a */
        final /* synthetic */ InputMessageTip f99096a;

        @Override // com.ss.android.lark.guide.biz.bubble.chat.BaseInputMessageTip
        /* renamed from: d */
        public String mo141307d() {
            return this.f99096a.f99094a.mo141352a(R.string.Lark_Guide_SpotlightCustomerService);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38568c(InputMessageTip bVar) {
            this.f99096a = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/guide/biz/bubble/chat/InputMessageTip$createMyselfTip$1", "Lcom/ss/android/lark/guide/biz/bubble/chat/BaseInputMessageTip;", "getContent", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.a.a.b$e */
    public static final class C38570e extends BaseInputMessageTip {

        /* renamed from: a */
        final /* synthetic */ InputMessageTip f99099a;

        @Override // com.ss.android.lark.guide.biz.bubble.chat.BaseInputMessageTip
        /* renamed from: d */
        public String mo141307d() {
            return this.f99099a.f99094a.mo141352a(R.string.Lark_Guide_SpotlightMyself);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38570e(InputMessageTip bVar) {
            this.f99099a = bVar;
        }
    }

    /* renamed from: d */
    private final BaseInputMessageTip m152117d() {
        boolean z;
        String a = ChatOpener.f141337a.mo194684a();
        String b = ChatOpener.f141337a.mo194686b();
        String str = b;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return new C38569d(b, a);
        }
        Log.m165389i("InputMessageTip", "createFlowTip, detail is null");
        return null;
    }

    /* renamed from: a */
    private final BaseInputMessageTip m152114a(int i) {
        if (i == 0) {
            return m152116c();
        }
        if (i == 1) {
            return m152115b();
        }
        if (i == 2) {
            return m152113a();
        }
        if (i != 3) {
            return null;
        }
        return m152117d();
    }

    /* renamed from: a */
    public final boolean mo141308a(View view, int i) {
        if (view == null) {
            Log.m165389i("InputMessageTip", "method:show, anchorView is null");
            return false;
        }
        BaseInputMessageTip a = m152114a(i);
        if (a == null) {
            Log.m165389i("InputMessageTip", "method:show, tip is null, chatType = " + i);
            return false;
        }
        IGuide a2 = new GuidePopupBuilder().mo141718a(a).mo141716a(view).mo141721a(true).mo141723a();
        if (a2 != null) {
            return a2.mo141707b();
        }
        return false;
    }
}
