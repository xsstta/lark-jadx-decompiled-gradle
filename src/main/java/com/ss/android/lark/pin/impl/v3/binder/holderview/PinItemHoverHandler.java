package com.ss.android.lark.pin.impl.v3.binder.holderview;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.desktopmode.view.C36592a;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010$\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u001eH\u0002J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u0006H\u0002J\b\u0010(\u001a\u00020\u001cH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u000bX\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R#\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006*"}, d2 = {"Lcom/ss/android/lark/pin/impl/v3/binder/holderview/PinItemHoverHandler;", "", "target", "Landroid/view/View;", "(Landroid/view/View;)V", "colorSelected", "", "colorUnSelect", "handler", "Landroid/os/Handler;", "icons", "", "Lkotlin/Pair;", "Landroid/widget/ImageView;", "", "[Lkotlin/Pair;", "lastSelectView", "toolTipsWindow", "Lcom/ss/android/lark/desktopmode/view/HoverTipsWindow;", "kotlin.jvm.PlatformType", "getToolTipsWindow", "()Lcom/ss/android/lark/desktopmode/view/HoverTipsWindow;", "toolTipsWindow$delegate", "Lkotlin/Lazy;", "getLocationRect", "Landroid/graphics/Rect;", "v", "handleItemBtnHoverIfNeed", "", "event", "Landroid/view/MotionEvent;", "handleMessage", "", "msg", "Landroid/os/Message;", "handleTargetHover", "handleTouchAction", "ev", "setItemBtnsVisibility", "visibility", "setupListeners", "Companion", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.l */
public final class PinItemHoverHandler {

    /* renamed from: b */
    public static final Companion f128339b = new Companion(null);

    /* renamed from: a */
    public final View f128340a;

    /* renamed from: c */
    private final Handler f128341c;

    /* renamed from: d */
    private final int f128342d;

    /* renamed from: e */
    private final int f128343e;

    /* renamed from: f */
    private final Lazy f128344f;

    /* renamed from: g */
    private final Pair<ImageView, String>[] f128345g;

    /* renamed from: h */
    private ImageView f128346h;

    @JvmStatic
    /* renamed from: a */
    public static final void m200104a(View view) {
        f128339b.mo177568a(view);
    }

    /* renamed from: b */
    private final C36592a m200106b() {
        return (C36592a) this.f128344f.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/pin/impl/v3/binder/holderview/PinItemHoverHandler$Companion;", "", "()V", "MSG_SHOW_TOOLS_TIPS", "", "handle", "", "target", "Landroid/view/View;", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.l$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo177568a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "target");
            if (DesktopUtil.m144307b()) {
                new PinItemHoverHandler(view, null).mo177564a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/desktopmode/view/HoverTipsWindow;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.l$e */
    static final class C51562e extends Lambda implements Function0<C36592a> {
        final /* synthetic */ PinItemHoverHandler this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51562e(PinItemHoverHandler lVar) {
            super(0);
            this.this$0 = lVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C36592a invoke() {
            return new C36592a.C36593a().mo135003a(this.this$0.f128340a.getContext());
        }
    }

    /* renamed from: a */
    public final void mo177564a() {
        this.f128340a.setOnHoverListener(new View$OnHoverListenerC51560c(this));
        for (Pair<ImageView, String> pair : this.f128345g) {
            pair.getFirst().setOnTouchListener(new View$OnTouchListenerC51564n(new C51561d(this)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Landroid/os/Message;", "Lkotlin/ParameterName;", "name", "msg", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.l$b */
    static final /* synthetic */ class C51559b extends FunctionReference implements Function1<Message, Boolean> {
        C51559b(PinItemHoverHandler lVar) {
            super(1, lVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "handleMessage";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(PinItemHoverHandler.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "handleMessage(Landroid/os/Message;)Z";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(Message message) {
            return Boolean.valueOf(invoke(message));
        }

        public final boolean invoke(Message message) {
            Intrinsics.checkParameterIsNotNull(message, "p1");
            return ((PinItemHoverHandler) this.receiver).mo177565a(message);
        }
    }

    /* renamed from: b */
    private final Rect m200105b(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }

    /* renamed from: a */
    private final void m200103a(int i) {
        for (Pair<ImageView, String> pair : this.f128345g) {
            pair.getFirst().setVisibility(i);
        }
    }

    /* renamed from: a */
    public final boolean mo177565a(Message message) {
        ImageView imageView;
        if (message.what != 65281 || (imageView = this.f128346h) == null) {
            return true;
        }
        m200106b().mo134997a(imageView, 0, 6);
        return true;
    }

    private PinItemHoverHandler(View view) {
        this.f128340a = view;
        this.f128341c = new Handler(Looper.getMainLooper(), new C51563m(new C51559b(this)));
        this.f128342d = C57582a.m223616d(view.getContext(), R.color.text_placeholder);
        this.f128343e = C57582a.m223616d(view.getContext(), R.color.primary_pri_500);
        this.f128344f = LazyKt.lazy(new C51562e(this));
        View findViewById = view.findViewById(R.id.item_unpin_btn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "target.findViewById(R.id.item_unpin_btn)");
        View findViewById2 = view.findViewById(R.id.item_view_in_chat_btn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "target.findViewById(R.id.item_view_in_chat_btn)");
        View findViewById3 = view.findViewById(R.id.item_forward_btn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "target.findViewById(R.id.item_forward_btn)");
        this.f128345g = new Pair[]{new Pair<>(findViewById, UIHelper.getString(R.string.Lark_Legacy_UnpinButton)), new Pair<>(findViewById2, UIHelper.getString(R.string.Lark_Legacy_JumpToChat)), new Pair<>(findViewById3, UIHelper.getString(R.string.Lark_Legacy_ForwardToChat))};
    }

    /* renamed from: b */
    private final void m200107b(MotionEvent motionEvent) {
        Drawable drawable;
        Drawable drawable2;
        String str = null;
        ImageView imageView = null;
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        Pair<ImageView, String>[] pairArr = this.f128345g;
        ArrayList arrayList = new ArrayList(pairArr.length);
        for (Pair<ImageView, String> pair : pairArr) {
            arrayList.add(m200105b(pair.getFirst()));
        }
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            if (((Rect) arrayList2.get(i)).contains(rawX, rawY)) {
                String second = this.f128345g[i].getSecond();
                imageView = this.f128345g[i].getFirst();
                str = second;
            }
        }
        if (imageView == null) {
            ImageView imageView2 = this.f128346h;
            if (!(imageView2 == null || (drawable = imageView2.getDrawable()) == null)) {
                drawable.setTint(this.f128342d);
            }
            m200106b().dismiss();
        } else if (!Intrinsics.areEqual(imageView, this.f128346h)) {
            ImageView imageView3 = this.f128346h;
            if (!(imageView3 == null || (drawable2 = imageView3.getDrawable()) == null)) {
                drawable2.setTint(this.f128342d);
            }
            imageView.getDrawable().setTint(this.f128343e);
            C36592a b = m200106b();
            b.dismiss();
            b.mo134999a(str);
            this.f128341c.removeCallbacksAndMessages(null);
            this.f128341c.sendEmptyMessageDelayed(65281, 200);
        }
        this.f128346h = imageView;
    }

    /* renamed from: a */
    public final boolean mo177566a(MotionEvent motionEvent) {
        int paddingStart = this.f128340a.getPaddingStart();
        int paddingEnd = this.f128340a.getPaddingEnd();
        int paddingTop = this.f128340a.getPaddingTop();
        int paddingBottom = this.f128340a.getPaddingBottom();
        int action = motionEvent.getAction();
        if (action == 7) {
            m200107b(motionEvent);
            return true;
        } else if (action == 9) {
            this.f128340a.setBackgroundResource(R.drawable.desktop_pin_shadow_bg);
            this.f128340a.setPadding(paddingStart, paddingTop, paddingEnd, paddingBottom);
            return true;
        } else if (action != 10) {
            return false;
        } else {
            this.f128340a.setBackgroundResource(R.drawable.desktop_pin_bg);
            this.f128340a.setPadding(paddingStart, paddingTop, paddingEnd, paddingBottom);
            m200103a(8);
            m200107b(motionEvent);
            return true;
        }
    }

    public /* synthetic */ PinItemHoverHandler(View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "ev", "Landroid/view/MotionEvent;", "onHover"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.l$c */
    public static final class View$OnHoverListenerC51560c implements View.OnHoverListener {

        /* renamed from: a */
        final /* synthetic */ PinItemHoverHandler f128347a;

        View$OnHoverListenerC51560c(PinItemHoverHandler lVar) {
            this.f128347a = lVar;
        }

        public final boolean onHover(View view, MotionEvent motionEvent) {
            PinItemHoverHandler lVar = this.f128347a;
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "ev");
            return lVar.mo177566a(motionEvent);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "p1", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "v", "p2", "Landroid/view/MotionEvent;", "ev", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.l$d */
    public static final /* synthetic */ class C51561d extends FunctionReference implements Function2<View, MotionEvent, Boolean> {
        C51561d(PinItemHoverHandler lVar) {
            super(2, lVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "handleTouchAction";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(PinItemHoverHandler.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "handleTouchAction(Landroid/view/View;Landroid/view/MotionEvent;)Z";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Boolean invoke(View view, MotionEvent motionEvent) {
            return Boolean.valueOf(invoke(view, motionEvent));
        }

        public final boolean invoke(View view, MotionEvent motionEvent) {
            Intrinsics.checkParameterIsNotNull(view, "p1");
            Intrinsics.checkParameterIsNotNull(motionEvent, "p2");
            return ((PinItemHoverHandler) this.receiver).mo177567a(view, motionEvent);
        }
    }

    /* renamed from: a */
    public final boolean mo177567a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        m200106b().dismiss();
        return false;
    }
}
