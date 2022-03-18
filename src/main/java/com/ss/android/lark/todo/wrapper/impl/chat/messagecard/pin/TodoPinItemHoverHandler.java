package com.ss.android.lark.todo.wrapper.impl.chat.messagecard.pin;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010$\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u001eH\u0002J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u0006H\u0002J\b\u0010(\u001a\u00020\u001cH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u000bX\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R#\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006*"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/pin/TodoPinItemHoverHandler;", "", "target", "Landroid/view/View;", "(Landroid/view/View;)V", "colorSelected", "", "colorUnSelect", "handler", "Landroid/os/Handler;", "icons", "", "Lkotlin/Pair;", "Landroid/widget/ImageView;", "", "[Lkotlin/Pair;", "lastSelectView", "toolTipsWindow", "Lcom/ss/android/lark/desktopmode/view/HoverTipsWindow;", "kotlin.jvm.PlatformType", "getToolTipsWindow", "()Lcom/ss/android/lark/desktopmode/view/HoverTipsWindow;", "toolTipsWindow$delegate", "Lkotlin/Lazy;", "getLocationRect", "Landroid/graphics/Rect;", "v", "handleItemBtnHoverIfNeed", "", "event", "Landroid/view/MotionEvent;", "handleMessage", "", "msg", "Landroid/os/Message;", "handleTargetHover", "handleTouchAction", "ev", "setItemBtnsVisibility", "visibility", "setupListeners", "Companion", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.b.b.a.a.b.b */
public final class TodoPinItemHoverHandler {

    /* renamed from: b */
    public static final Companion f139171b = new Companion(null);

    /* renamed from: a */
    public final View f139172a;

    /* renamed from: c */
    private final Handler f139173c;

    /* renamed from: d */
    private final int f139174d;

    /* renamed from: e */
    private final int f139175e;

    /* renamed from: f */
    private final Lazy f139176f;

    /* renamed from: g */
    private final Pair<ImageView, String>[] f139177g;

    /* renamed from: h */
    private ImageView f139178h;

    /* renamed from: b */
    private final C36592a m219392b() {
        return (C36592a) this.f139176f.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/pin/TodoPinItemHoverHandler$Companion;", "", "()V", "DELAY_TIME", "", "MSG_SHOW_TOOLS_TIPS", "", "handle", "", "target", "Landroid/view/View;", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.b.b.a.a.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo191688a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "target");
            if (DesktopUtil.m144307b()) {
                new TodoPinItemHoverHandler(view, null).mo191684a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/desktopmode/view/HoverTipsWindow;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.b.b.a.a.b.b$e */
    static final class C56236e extends Lambda implements Function0<C36592a> {
        final /* synthetic */ TodoPinItemHoverHandler this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56236e(TodoPinItemHoverHandler bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C36592a invoke() {
            return new C36592a.C36593a().mo135003a(this.this$0.f139172a.getContext());
        }
    }

    /* renamed from: a */
    public final void mo191684a() {
        this.f139172a.setOnHoverListener(new View$OnHoverListenerC56234c(this));
        for (Pair<ImageView, String> pair : this.f139177g) {
            pair.getFirst().setOnTouchListener(new View$OnTouchListenerC56238d(new C56235d(this)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Landroid/os/Message;", "Lkotlin/ParameterName;", "name", "msg", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.b.b.a.a.b.b$b */
    static final /* synthetic */ class C56233b extends FunctionReference implements Function1<Message, Boolean> {
        C56233b(TodoPinItemHoverHandler bVar) {
            super(1, bVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "handleMessage";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(TodoPinItemHoverHandler.class);
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
            return ((TodoPinItemHoverHandler) this.receiver).mo191685a(message);
        }
    }

    /* renamed from: a */
    private final Rect m219390a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }

    /* renamed from: a */
    private final void m219391a(int i) {
        for (Pair<ImageView, String> pair : this.f139177g) {
            pair.getFirst().setVisibility(i);
        }
    }

    /* renamed from: a */
    public final boolean mo191685a(Message message) {
        ImageView imageView;
        if (message.what != 65281 || (imageView = this.f139178h) == null) {
            return true;
        }
        m219392b().mo134997a(imageView, 0, 6);
        return true;
    }

    private TodoPinItemHoverHandler(View view) {
        this.f139172a = view;
        this.f139173c = new Handler(Looper.getMainLooper(), new C56237c(new C56233b(this)));
        this.f139174d = UIHelper.getColor(R.color.lkui_N500);
        this.f139175e = UIHelper.getColor(R.color.lkui_B500);
        this.f139176f = LazyKt.lazy(new C56236e(this));
        View findViewById = view.findViewById(R.id.item_unpin_btn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "target.findViewById(R.id.item_unpin_btn)");
        View findViewById2 = view.findViewById(R.id.item_view_in_chat_btn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "target.findViewById(R.id.item_view_in_chat_btn)");
        View findViewById3 = view.findViewById(R.id.item_forward_btn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "target.findViewById(R.id.item_forward_btn)");
        this.f139177g = new Pair[]{new Pair<>(findViewById, UIHelper.getString(R.string.Lark_Legacy_UnpinButton)), new Pair<>(findViewById2, UIHelper.getString(R.string.Lark_Legacy_JumpToChat)), new Pair<>(findViewById3, UIHelper.getString(R.string.Lark_Legacy_ForwardToChat))};
    }

    /* renamed from: b */
    private final void m219393b(MotionEvent motionEvent) {
        Drawable drawable;
        Drawable drawable2;
        String str = null;
        ImageView imageView = null;
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        Pair<ImageView, String>[] pairArr = this.f139177g;
        ArrayList arrayList = new ArrayList(pairArr.length);
        for (Pair<ImageView, String> pair : pairArr) {
            arrayList.add(m219390a(pair.getFirst()));
        }
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            if (((Rect) arrayList2.get(i)).contains(rawX, rawY)) {
                String second = this.f139177g[i].getSecond();
                imageView = this.f139177g[i].getFirst();
                str = second;
            }
        }
        if (imageView == null) {
            ImageView imageView2 = this.f139178h;
            if (!(imageView2 == null || (drawable = imageView2.getDrawable()) == null)) {
                drawable.setTint(this.f139174d);
            }
            m219392b().dismiss();
        } else if (!Intrinsics.areEqual(imageView, this.f139178h)) {
            ImageView imageView3 = this.f139178h;
            if (!(imageView3 == null || (drawable2 = imageView3.getDrawable()) == null)) {
                drawable2.setTint(this.f139174d);
            }
            imageView.getDrawable().setTint(this.f139175e);
            C36592a b = m219392b();
            b.dismiss();
            b.mo134999a(str);
            this.f139173c.removeCallbacksAndMessages(null);
            this.f139173c.sendEmptyMessageDelayed(65281, 200);
        }
        this.f139178h = imageView;
    }

    /* renamed from: a */
    public final boolean mo191686a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 7) {
            m219393b(motionEvent);
        } else if (action == 9) {
            this.f139172a.setElevation((float) UIHelper.dp2px(5.0f));
            m219391a(0);
        } else if (action != 10) {
            return false;
        } else {
            this.f139172a.setElevation((float) UIHelper.dp2px(BitmapDescriptorFactory.HUE_RED));
            m219391a(8);
            m219393b(motionEvent);
        }
        return true;
    }

    public /* synthetic */ TodoPinItemHoverHandler(View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "ev", "Landroid/view/MotionEvent;", "onHover"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.b.b.a.a.b.b$c */
    public static final class View$OnHoverListenerC56234c implements View.OnHoverListener {

        /* renamed from: a */
        final /* synthetic */ TodoPinItemHoverHandler f139179a;

        View$OnHoverListenerC56234c(TodoPinItemHoverHandler bVar) {
            this.f139179a = bVar;
        }

        public final boolean onHover(View view, MotionEvent motionEvent) {
            TodoPinItemHoverHandler bVar = this.f139179a;
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "ev");
            return bVar.mo191686a(motionEvent);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "p1", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "v", "p2", "Landroid/view/MotionEvent;", "ev", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.b.b.a.a.b.b$d */
    public static final /* synthetic */ class C56235d extends FunctionReference implements Function2<View, MotionEvent, Boolean> {
        C56235d(TodoPinItemHoverHandler bVar) {
            super(2, bVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "handleTouchAction";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(TodoPinItemHoverHandler.class);
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
            return ((TodoPinItemHoverHandler) this.receiver).mo191687a(view, motionEvent);
        }
    }

    /* renamed from: a */
    public final boolean mo191687a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        m219392b().dismiss();
        return false;
    }
}
