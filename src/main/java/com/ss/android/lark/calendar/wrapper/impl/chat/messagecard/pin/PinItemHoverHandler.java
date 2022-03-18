package com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.pin;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.desktopmode.view.C36592a;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010$\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u001eH\u0002J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u0006H\u0002J\b\u0010(\u001a\u00020\u001cH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u000bX\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R#\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006*"}, d2 = {"Lcom/ss/android/lark/calendar/wrapper/impl/chat/messagecard/pin/PinItemHoverHandler;", "", "target", "Landroid/view/View;", "(Landroid/view/View;)V", "colorSelected", "", "colorUnSelect", "handler", "Landroid/os/Handler;", "icons", "", "Lkotlin/Pair;", "Landroid/widget/ImageView;", "", "[Lkotlin/Pair;", "lastSelectView", "toolTipsWindow", "Lcom/ss/android/lark/desktopmode/view/HoverTipsWindow;", "kotlin.jvm.PlatformType", "getToolTipsWindow", "()Lcom/ss/android/lark/desktopmode/view/HoverTipsWindow;", "toolTipsWindow$delegate", "Lkotlin/Lazy;", "getLocationRect", "Landroid/graphics/Rect;", "v", "handleItemBtnHoverIfNeed", "", "event", "Landroid/view/MotionEvent;", "handleMessage", "", "msg", "Landroid/os/Message;", "handleTargetHover", "handleTouchAction", "ev", "setItemBtnsVisibility", "visibility", "setupListeners", "Companion", "calendar-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.d.c */
public final class PinItemHoverHandler {

    /* renamed from: b */
    public static final Companion f83869b = new Companion(null);

    /* renamed from: a */
    public final View f83870a;

    /* renamed from: c */
    private final Handler f83871c;

    /* renamed from: d */
    private final int f83872d;

    /* renamed from: e */
    private final int f83873e;

    /* renamed from: f */
    private final Lazy f83874f;

    /* renamed from: g */
    private final Pair<ImageView, String>[] f83875g;

    /* renamed from: h */
    private ImageView f83876h;

    @JvmStatic
    /* renamed from: a */
    public static final void m125525a(View view) {
        f83869b.mo120455a(view);
    }

    /* renamed from: b */
    private final C36592a m125527b() {
        return (C36592a) this.f83874f.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/wrapper/impl/chat/messagecard/pin/PinItemHoverHandler$Companion;", "", "()V", "MSG_SHOW_TOOLS_TIPS", "", "handle", "", "target", "Landroid/view/View;", "calendar-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.d.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo120455a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "target");
            if (DesktopUtil.m144307b()) {
                new PinItemHoverHandler(view, null).mo120451a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/desktopmode/view/HoverTipsWindow;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.d.c$e */
    static final class C32698e extends Lambda implements Function0<C36592a> {
        final /* synthetic */ PinItemHoverHandler this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32698e(PinItemHoverHandler cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C36592a invoke() {
            return new C36592a.C36593a().mo135003a(this.this$0.f83870a.getContext());
        }
    }

    /* renamed from: a */
    public final void mo120451a() {
        this.f83870a.setOnHoverListener(new View$OnHoverListenerC32696c(this));
        for (Pair<ImageView, String> pair : this.f83875g) {
            pair.getFirst().setOnTouchListener(new View$OnTouchListenerC32700e(new C32697d(this)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Landroid/os/Message;", "Lkotlin/ParameterName;", "name", "msg", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.d.c$b */
    static final /* synthetic */ class C32695b extends FunctionReference implements Function1<Message, Boolean> {
        C32695b(PinItemHoverHandler cVar) {
            super(1, cVar);
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
            return ((PinItemHoverHandler) this.receiver).mo120452a(message);
        }
    }

    /* renamed from: b */
    private final Rect m125526b(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }

    /* renamed from: a */
    private final void m125524a(int i) {
        for (Pair<ImageView, String> pair : this.f83875g) {
            pair.getFirst().setVisibility(i);
        }
    }

    /* renamed from: a */
    public final boolean mo120452a(Message message) {
        ImageView imageView;
        if (message.what != 65281 || (imageView = this.f83876h) == null) {
            return true;
        }
        m125527b().mo134997a(imageView, 0, 6);
        return true;
    }

    private PinItemHoverHandler(View view) {
        this.f83870a = view;
        this.f83871c = new Handler(Looper.getMainLooper(), new C32699d(new C32695b(this)));
        this.f83872d = UIHelper.getColor(R.color.lkui_N500);
        this.f83873e = UIHelper.getColor(R.color.lkui_B500);
        this.f83874f = LazyKt.lazy(new C32698e(this));
        View findViewById = view.findViewById(R.id.item_unpin_btn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "target.findViewById(R.id.item_unpin_btn)");
        View findViewById2 = view.findViewById(R.id.item_view_in_chat_btn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "target.findViewById(R.id.item_view_in_chat_btn)");
        View findViewById3 = view.findViewById(R.id.item_forward_btn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "target.findViewById(R.id.item_forward_btn)");
        this.f83875g = new Pair[]{new Pair<>(findViewById, UIHelper.getString(R.string.Lark_Legacy_UnpinButton)), new Pair<>(findViewById2, UIHelper.getString(R.string.Lark_Legacy_JumpToChat)), new Pair<>(findViewById3, UIHelper.getString(R.string.Lark_Legacy_ForwardToChat))};
    }

    /* renamed from: b */
    private final void m125528b(MotionEvent motionEvent) {
        Drawable drawable;
        Drawable drawable2;
        String str = null;
        ImageView imageView = null;
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        Pair<ImageView, String>[] pairArr = this.f83875g;
        ArrayList arrayList = new ArrayList(pairArr.length);
        for (Pair<ImageView, String> pair : pairArr) {
            arrayList.add(m125526b(pair.getFirst()));
        }
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            if (((Rect) arrayList2.get(i)).contains(rawX, rawY)) {
                String second = this.f83875g[i].getSecond();
                imageView = this.f83875g[i].getFirst();
                str = second;
            }
        }
        if (imageView == null) {
            ImageView imageView2 = this.f83876h;
            if (!(imageView2 == null || (drawable = imageView2.getDrawable()) == null)) {
                drawable.setTint(this.f83872d);
            }
            m125527b().dismiss();
        } else if (!Intrinsics.areEqual(imageView, this.f83876h)) {
            ImageView imageView3 = this.f83876h;
            if (!(imageView3 == null || (drawable2 = imageView3.getDrawable()) == null)) {
                drawable2.setTint(this.f83872d);
            }
            imageView.getDrawable().setTint(this.f83873e);
            C36592a b = m125527b();
            b.dismiss();
            b.mo134999a(str);
            this.f83871c.removeCallbacksAndMessages(null);
            this.f83871c.sendEmptyMessageDelayed(65281, 200);
        }
        this.f83876h = imageView;
    }

    /* renamed from: a */
    public final boolean mo120453a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 7) {
            m125528b(motionEvent);
        } else if (action == 9) {
            this.f83870a.setElevation((float) UIHelper.dp2px(5.0f));
            m125524a(0);
        } else if (action != 10) {
            return false;
        } else {
            this.f83870a.setElevation((float) UIHelper.dp2px(BitmapDescriptorFactory.HUE_RED));
            m125524a(8);
            m125528b(motionEvent);
        }
        return true;
    }

    public /* synthetic */ PinItemHoverHandler(View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "ev", "Landroid/view/MotionEvent;", "onHover"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.d.c$c */
    public static final class View$OnHoverListenerC32696c implements View.OnHoverListener {

        /* renamed from: a */
        final /* synthetic */ PinItemHoverHandler f83877a;

        View$OnHoverListenerC32696c(PinItemHoverHandler cVar) {
            this.f83877a = cVar;
        }

        public final boolean onHover(View view, MotionEvent motionEvent) {
            PinItemHoverHandler cVar = this.f83877a;
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "ev");
            return cVar.mo120453a(motionEvent);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "p1", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "v", "p2", "Landroid/view/MotionEvent;", "ev", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.d.c$d */
    public static final /* synthetic */ class C32697d extends FunctionReference implements Function2<View, MotionEvent, Boolean> {
        C32697d(PinItemHoverHandler cVar) {
            super(2, cVar);
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
            return ((PinItemHoverHandler) this.receiver).mo120454a(view, motionEvent);
        }
    }

    /* renamed from: a */
    public final boolean mo120454a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        m125527b().dismiss();
        return false;
    }
}
