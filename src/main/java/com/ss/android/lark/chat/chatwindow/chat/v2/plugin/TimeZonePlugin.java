package com.ss.android.lark.chat.chatwindow.chat.v2.plugin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardTopExtendComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatTimeTipsPushHandler;
import com.ss.android.lark.chat.entity.timetip.PushChatTimeTipNotify;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.p2392o.AbstractC48707q;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001a\u0010 \u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\f2\u0006\u0010\"\u001a\u00020\u001fH\u0002J\u0018\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0012H\u0002J\u0018\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0012H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/TimeZonePlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/BaseChatPlugin;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatTimeTipsPushHandler$ITimeTipsPushListener;", "Lcom/ss/android/lark/listener/ITimeFormatChangeListener;", "()V", "keyboardTopExtendComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardTopExtendComponent;", "mChatId", "", "mPushHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatTimeTipsPushHandler;", "mTimeZoneContainer", "Landroid/view/View;", "mTimezoneTv", "Landroid/widget/TextView;", "messageListComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent;", "getTimeTipHeight", "", "onCreate", "", "chatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "onDestroy", "onPushChatTimeTipNotice", "timeTipNotify", "Lcom/ss/android/lark/chat/entity/timetip/PushChatTimeTipNotify;", "onTimeFormatChanged", "is24HourClock", "", "playTimeZoneAnim", "tipView", "isShow", "setHeight", "v", C14002h.f36692e, "showTimeZoneTip", "tipStr", "timeTipStatus", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.t */
public final class TimeZonePlugin extends BaseChatPlugin implements ChatTimeTipsPushHandler.ITimeTipsPushListener, AbstractC48707q {

    /* renamed from: a */
    public IMessageListComponent f87199a;

    /* renamed from: b */
    public IKeyboardTopExtendComponent f87200b;

    /* renamed from: c */
    public TextView f87201c;

    /* renamed from: d */
    public View f87202d;

    /* renamed from: e */
    public String f87203e;

    /* renamed from: f */
    public ChatTimeTipsPushHandler f87204f;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "queueIdle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.t$f */
    public static final class C33852f implements MessageQueue.IdleHandler {

        /* renamed from: a */
        final /* synthetic */ TimeZonePlugin f87221a;

        C33852f(TimeZonePlugin tVar) {
            this.f87221a = tVar;
        }

        public final boolean queueIdle() {
            TimeZonePlugin tVar = this.f87221a;
            tVar.mo123871a(tVar.f87202d, true);
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.t$a */
    static final class RunnableC33847a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TimeZonePlugin f87205a;

        /* renamed from: b */
        final /* synthetic */ PushChatTimeTipNotify f87206b;

        RunnableC33847a(TimeZonePlugin tVar, PushChatTimeTipNotify pushChatTimeTipNotify) {
            this.f87205a = tVar;
            this.f87206b = pushChatTimeTipNotify;
        }

        public final void run() {
            TimeZonePlugin tVar = this.f87205a;
            String b = this.f87206b.mo126052b();
            Intrinsics.checkExpressionValueIsNotNull(b, "timeTipNotify.copyWriting");
            tVar.mo123872a(b, this.f87206b.mo126049a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.t$b */
    static final class RunnableC33848b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TimeZonePlugin f87207a;

        /* renamed from: b */
        final /* synthetic */ boolean f87208b;

        RunnableC33848b(TimeZonePlugin tVar, boolean z) {
            this.f87207a = tVar;
            this.f87208b = z;
        }

        public final void run() {
            Log.m165389i("ChatWindowLog", "refresh message list onTimeFormatChanged: " + this.f87208b);
            TimeZonePlugin.m131087b(this.f87207a).mo123330n();
        }
    }

    /* renamed from: b */
    private final int m131086b() {
        View inflate = LayoutInflater.from(mo122128i()).inflate(R.layout.view_chat_timezone_tip, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        inflate.setVisibility(0);
        inflate.measure(View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE));
        return inflate.getMeasuredHeight();
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    public void as_() {
        super.as_();
        C32821b.m126120a().mo121145o(this.f87203e);
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.mo134524W().mo134470b(this);
        ChatTimeTipsPushHandler lVar = this.f87204f;
        if (lVar != null) {
            lVar.mo123056b();
        }
        this.f87204f = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/TimeZonePlugin$playTimeZoneAnim$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.t$c */
    public static final class C33849c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f87209a;

        /* renamed from: b */
        final /* synthetic */ float f87210b;

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            this.f87209a.setAlpha(this.f87210b);
        }

        C33849c(View view, float f) {
            this.f87209a = view;
            this.f87210b = f;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IKeyboardTopExtendComponent m131085a(TimeZonePlugin tVar) {
        IKeyboardTopExtendComponent eVar = tVar.f87200b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keyboardTopExtendComponent");
        }
        return eVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ IMessageListComponent m131087b(TimeZonePlugin tVar) {
        IMessageListComponent iMessageListComponent = tVar.f87199a;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        return iMessageListComponent;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/TimeZonePlugin$playTimeZoneAnim$3", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationStart", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.t$e */
    public static final class C33851e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ TimeZonePlugin f87215a;

        /* renamed from: b */
        final /* synthetic */ boolean f87216b;

        /* renamed from: c */
        final /* synthetic */ View f87217c;

        /* renamed from: d */
        final /* synthetic */ int f87218d;

        /* renamed from: e */
        final /* synthetic */ int f87219e;

        /* renamed from: f */
        final /* synthetic */ float[] f87220f;

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            if (this.f87216b) {
                this.f87215a.mo123870a(this.f87217c, 0);
                this.f87217c.setVisibility(0);
            }
        }

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            this.f87215a.mo123870a(this.f87217c, this.f87218d);
            if (!this.f87216b) {
                this.f87217c.setVisibility(8);
            }
            TimeZonePlugin.m131087b(this.f87215a).mo123325i().mo122592a(0, (int) (((float) this.f87219e) - this.f87220f[0]));
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            if (!this.f87216b) {
                this.f87217c.setVisibility(8);
            }
            TimeZonePlugin.m131087b(this.f87215a).mo123325i().mo122592a(0, (int) (((float) this.f87219e) - this.f87220f[0]));
        }

        C33851e(TimeZonePlugin tVar, boolean z, View view, int i, int i2, float[] fArr) {
            this.f87215a = tVar;
            this.f87216b = z;
            this.f87217c = view;
            this.f87218d = i;
            this.f87219e = i2;
            this.f87220f = fArr;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.t$d */
    public static final class C33850d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ TimeZonePlugin f87211a;

        /* renamed from: b */
        final /* synthetic */ View f87212b;

        /* renamed from: c */
        final /* synthetic */ int f87213c;

        /* renamed from: d */
        final /* synthetic */ float[] f87214d;

        C33850d(TimeZonePlugin tVar, View view, int i, float[] fArr) {
            this.f87211a = tVar;
            this.f87212b = view;
            this.f87213c = i;
            this.f87214d = fArr;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                float animatedFraction = valueAnimator.getAnimatedFraction();
                this.f87211a.mo123870a(this.f87212b, intValue);
                float f = ((float) this.f87213c) * animatedFraction;
                TimeZonePlugin.m131087b(this.f87211a).mo123325i().mo122592a(0, (int) (f - this.f87214d[0]));
                this.f87214d[0] = f;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatTimeTipsPushHandler.ITimeTipsPushListener
    /* renamed from: a */
    public void mo123109a(PushChatTimeTipNotify pushChatTimeTipNotify) {
        Intrinsics.checkParameterIsNotNull(pushChatTimeTipNotify, "timeTipNotify");
        UICallbackExecutor.post(new RunnableC33847a(this, pushChatTimeTipNotify));
    }

    @Override // com.ss.android.lark.p2392o.AbstractC48707q
    /* renamed from: a */
    public void mo123873a(boolean z) {
        UICallbackExecutor.execute(new RunnableC33848b(this, z));
    }

    /* renamed from: a */
    public final void mo123870a(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    /* renamed from: a */
    public void mo122114a(IChatWindowApp dVar, C35219b bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatApp");
        Intrinsics.checkParameterIsNotNull(bVar, "initData");
        super.mo122114a(dVar, bVar);
        this.f87199a = (IMessageListComponent) dVar.mo123122a(IMessageListComponent.class);
        this.f87200b = (IKeyboardTopExtendComponent) dVar.mo123122a(IKeyboardTopExtendComponent.class);
        IMessageListComponent iMessageListComponent = this.f87199a;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        iMessageListComponent.getLifecycle().addObserver(new TimeZonePlugin$onCreate$1(this, bVar));
    }

    /* renamed from: a */
    public final void mo123871a(View view, boolean z) {
        float f;
        int i;
        int i2;
        int i3;
        if (view != null) {
            Animation animation = view.getAnimation();
            if (animation != null) {
                animation.cancel();
            }
            float f2 = 1.0f;
            if (z) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = 1.0f;
            }
            if (!z) {
                f2 = BitmapDescriptorFactory.HUE_RED;
            }
            if (z) {
                i = 0;
            } else {
                i = view.getHeight();
            }
            if (z) {
                i2 = m131086b();
            } else {
                i2 = 0;
            }
            if (z) {
                i3 = ParticipantRepo.f117150c;
            } else {
                i3 = 80;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", f, f2);
            Intrinsics.checkExpressionValueIsNotNull(ofFloat, "alphaAnim");
            ofFloat.setDuration((long) i3);
            ofFloat.addListener(new C33849c(view, f2));
            int i4 = i2 - i;
            float[] fArr = {0.0f};
            ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
            Intrinsics.checkExpressionValueIsNotNull(ofInt, "heightAnim");
            ofInt.setDuration((long) LocationRequest.PRIORITY_INDOOR);
            ofInt.addUpdateListener(new C33850d(this, view, i4, fArr));
            ofInt.addListener(new C33851e(this, z, view, i2, i4, fArr));
            ofFloat.start();
            ofInt.start();
        }
    }

    /* renamed from: a */
    public final void mo123872a(String str, int i) {
        View view;
        View view2;
        String str2 = str;
        if (!TextUtils.isEmpty(str2)) {
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, '{', 0, false, 6, (Object) null);
            int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str2, '}', 0, false, 6, (Object) null) - 1;
            if (indexOf$default == -1 || indexOf$default2 == -1) {
                TextView textView = this.f87201c;
                if (textView != null) {
                    textView.setText(str2);
                }
                Log.m165397w("ChatWindowLog", "showTimeZoneTip tipStr error : " + str);
            } else {
                SpannableString spannableString = new SpannableString(StringsKt.replace$default(StringsKt.replace$default(str, "{", "", false, 4, (Object) null), "}", "", false, 4, (Object) null));
                spannableString.setSpan(new ForegroundColorSpan(UIUtils.getColor(mo122128i(), R.color.text_title)), indexOf$default, indexOf$default2, 33);
                TextView textView2 = this.f87201c;
                if (textView2 != null) {
                    textView2.setText(spannableString);
                }
            }
        }
        if (i == 0 && ((view2 = this.f87202d) == null || view2.getVisibility() != 0)) {
            Looper.myQueue().addIdleHandler(new C33852f(this));
        } else if (i == 2 && (view = this.f87202d) != null && view.getVisibility() == 0) {
            mo123871a(this.f87202d, false);
        }
    }
}
