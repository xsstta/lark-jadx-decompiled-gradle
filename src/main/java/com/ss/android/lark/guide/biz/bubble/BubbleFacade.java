package com.ss.android.lark.guide.biz.bubble;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import com.ss.android.lark.guide.biz.IBubbleFacade;
import com.ss.android.lark.guide.biz.bubble.chat.InputMessageTip;
import com.ss.android.lark.guide.biz.bubble.tabpage.calendar.CreateNewCalendarTip;
import com.ss.android.lark.guide.biz.bubble.tabpage.contact.AddNewContactTip;
import com.ss.android.lark.guide.biz.bubble.tabpage.contact.UGReachAddNewContact;
import com.ss.android.lark.guide.biz.bubble.tenant.UpgradeTeamAvatarTip;
import com.ss.android.lark.guide.biz.bubble.translate.WebTranslateTip;
import com.ss.android.lark.guide.biz.fg.GuideFG;
import com.ss.android.lark.guide.biz.p1915a.p1920c.C38576b;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000b\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J:\u0010\u000f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0016J\"\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J:\u0010\u0015\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0016J\"\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J(\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/guide/biz/bubble/BubbleFacade;", "Lcom/ss/android/lark/guide/biz/IBubbleFacade;", "()V", "showAddNewContactTipIfNeed", "", "activity", "Landroid/app/Activity;", "anchorView", "Landroid/view/View;", "clickListener", "Landroid/view/View$OnClickListener;", "showChatInputTip", "", "chatType", "", "showClickAvatarTip", "tipContent", "", "btnName", "listener", "showCreateNewCalendarTipIfNeed", "showTenantPickTip", "highLightRect", "Landroid/graphics/Rect;", "showTenantSwitchGuidanceV3", "showUpgradeToBigTeamUserTip", "showWebTranslateTip", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "closeClick", "openClick", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.a.a */
public final class BubbleFacade implements IBubbleFacade {

    /* renamed from: a */
    public static final Lazy f99091a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C38566b.INSTANCE);

    /* renamed from: b */
    public static final Companion f99092b = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final IBubbleFacade m152093a() {
        return f99092b.mo141299a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/guide/biz/bubble/BubbleFacade$Companion;", "", "()V", "instance", "Lcom/ss/android/lark/guide/biz/bubble/BubbleFacade;", "getInstance", "()Lcom/ss/android/lark/guide/biz/bubble/BubbleFacade;", "instance$delegate", "Lkotlin/Lazy;", "inst", "Lcom/ss/android/lark/guide/biz/IBubbleFacade;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.a.a$a */
    public static final class Companion {
        /* renamed from: b */
        private final BubbleFacade m152102b() {
            Lazy lazy = BubbleFacade.f99091a;
            Companion aVar = BubbleFacade.f99092b;
            return (BubbleFacade) lazy.getValue();
        }

        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final IBubbleFacade mo141299a() {
            return m152102b();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/guide/biz/bubble/BubbleFacade;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.a.a$b */
    static final class C38566b extends Lambda implements Function0<BubbleFacade> {
        public static final C38566b INSTANCE = new C38566b();

        C38566b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final BubbleFacade invoke() {
            return new BubbleFacade();
        }
    }

    @Override // com.ss.android.lark.guide.biz.IBubbleFacade
    /* renamed from: a */
    public void mo141293a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "anchorView");
        UpgradeTeamAvatarTip.f99138a.mo141335a(view);
    }

    @Override // com.ss.android.lark.guide.biz.IBubbleFacade
    /* renamed from: a */
    public boolean mo141297a(View view, int i) {
        return InputMessageTip.f99093b.mo141309a(view, i);
    }

    @Override // com.ss.android.lark.guide.biz.IBubbleFacade
    /* renamed from: a */
    public GuideDelegate mo141291a(View view, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        return WebTranslateTip.f99140a.mo141337a(view, onClickListener, onClickListener2);
    }

    @Override // com.ss.android.lark.guide.biz.IBubbleFacade
    /* renamed from: a */
    public void mo141292a(Activity activity, View view, View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(view, "anchorView");
        if (GuideFG.f99144b.mo141341a().mo141338a()) {
            CreateNewCalendarTip.f99100a.mo141310a(activity, view, onClickListener);
        }
    }

    @Override // com.ss.android.lark.guide.biz.IBubbleFacade
    /* renamed from: b */
    public void mo141298b(Activity activity, View view, View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(view, "anchorView");
        if (!GuideFG.f99144b.mo141341a().mo141338a()) {
            return;
        }
        if (GuideFG.f99144b.mo141341a().mo141340c()) {
            new UGReachAddNewContact(activity, view).mo141313a();
        } else {
            AddNewContactTip.f99101a.mo141312a(activity, view, onClickListener);
        }
    }

    @Override // com.ss.android.lark.guide.biz.IBubbleFacade
    /* renamed from: a */
    public void mo141294a(View view, Activity activity, View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(view, "anchorView");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        C38576b.m152148a().mo141327a(view, activity, onClickListener);
    }

    @Override // com.ss.android.lark.guide.biz.IBubbleFacade
    /* renamed from: a */
    public void mo141295a(View view, Activity activity, String str, String str2, View.OnClickListener onClickListener) {
        C38576b.m152148a().mo141328a(view, activity, str, str2, onClickListener);
    }

    @Override // com.ss.android.lark.guide.biz.IBubbleFacade
    /* renamed from: a */
    public void mo141296a(View view, Rect rect, String str, String str2, View.OnClickListener onClickListener) {
        C38576b.m152148a().mo141329a(view, rect, str, str2, onClickListener);
    }
}
