package com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1178x;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardTopExtendComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.KeyboardExtendsManager;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.statistics.PerfLog;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001CB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0014H\u0016J\b\u00101\u001a\u00020&H\u0016J\b\u00102\u001a\u00020&H\u0016J\u0010\u00103\u001a\u00020/2\u0006\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u00020/H\u0016J\b\u00107\u001a\u00020/H\u0002J\b\u00108\u001a\u00020/H\u0016J\u0010\u00109\u001a\u00020/2\u0006\u0010:\u001a\u00020;H\u0016J\u0010\u0010<\u001a\u00020/2\u0006\u0010=\u001a\u00020\u001eH\u0016J\u0018\u0010>\u001a\u00020/2\u0006\u00104\u001a\u0002052\u0006\u0010?\u001a\u00020@H\u0016J\b\u0010A\u001a\u00020/H\u0016J\u0010\u0010B\u001a\u00020/2\u0006\u00104\u001a\u000205H\u0016R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8VX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020&8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*¨\u0006D"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/KeyboardTopExtendComponent;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardTopExtendComponent;", "mContext", "Landroid/app/Activity;", "hostVM", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardExtendDependenceViewModel;", "mDependency", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/KeyboardTopExtendComponent$KeyboardExtendComponentDependency;", "(Landroid/app/Activity;Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardExtendDependenceViewModel;Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/KeyboardTopExtendComponent$KeyboardExtendComponentDependency;)V", "callbacks", "", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardTopExtendComponent$IKeyboardTopExtendCallbacks;", "getCallbacks", "()Ljava/util/List;", "callbacks$delegate", "Lkotlin/Lazy;", "keyboardExtendManager", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/KeyboardExtendsManager;", "layoutId", "", "getLayoutId", "()I", "mExtendContainer", "Landroid/widget/FrameLayout;", "getMExtendContainer", "()Landroid/widget/FrameLayout;", "setMExtendContainer", "(Landroid/widget/FrameLayout;)V", "mListener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/KeyboardExtendsManager$OnExtendStatusChangeListener;", "mRootLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getMRootLayout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setMRootLayout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "mSmartReplyContainer", "Landroid/view/ViewGroup;", "getMSmartReplyContainer", "()Landroid/view/ViewGroup;", "setMSmartReplyContainer", "(Landroid/view/ViewGroup;)V", "mTimeZoneContainer", "getMTimeZoneContainer", "setMTimeZoneContainer", "changeBottomMargin", "", "height", "getSmartReplyContainer", "getTimeZone", "hideExtend", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/ExtendType;", "hideKeyboardExtend", "initViewModel", "onCreate", "registerKeyboardTopExtend", "extend", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardTopExtend;", "setOnKeyboardExtendStatusChangeListener", "listener", "showExtend", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardExtendData;", "showKeyboardExtend", "unRegisterKeyboardTopExtend", "KeyboardExtendComponentDependency", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class KeyboardTopExtendComponent extends Widget implements IKeyboardTopExtendComponent {

    /* renamed from: a */
    private final Lazy f86446a = LazyKt.lazy(C33550b.INSTANCE);

    /* renamed from: b */
    private KeyboardExtendsManager.OnExtendStatusChangeListener f86447b;

    /* renamed from: c */
    private KeyboardExtendsManager f86448c;

    /* renamed from: d */
    private Activity f86449d;

    /* renamed from: e */
    private IKeyboardExtendDependenceViewModel f86450e;

    /* renamed from: g */
    private KeyboardExtendComponentDependency f86451g;
    @BindView(7672)
    public FrameLayout mExtendContainer;
    @BindView(8597)
    public ConstraintLayout mRootLayout;
    @BindView(7722)
    public ViewGroup mSmartReplyContainer;
    @BindView(8084)
    public ViewGroup mTimeZoneContainer;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/KeyboardTopExtendComponent$KeyboardExtendComponentDependency;", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.KeyboardTopExtendComponent$a */
    public interface KeyboardExtendComponentDependency {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.KeyboardTopExtendComponent$c */
    public static final class C33551c<T> implements AbstractC1178x<C35219b> {

        /* renamed from: a */
        public static final C33551c f86452a = new C33551c();

        C33551c() {
        }

        /* renamed from: a */
        public final void onChanged(C35219b bVar) {
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent
    /* renamed from: a */
    public List<IKeyboardTopExtendComponent.IKeyboardTopExtendCallbacks> mo121968a() {
        return (List) this.f86446a.getValue();
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: d */
    public int mo121986d() {
        return R.layout.chat_window_component_keyboard_top_extend;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent
    /* renamed from: h */
    public boolean mo121990h() {
        return IKeyboardTopExtendComponent.C33553a.m130043a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardTopExtendComponent$IKeyboardTopExtendCallbacks;", "Lkotlin/collections/ArrayList;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.KeyboardTopExtendComponent$b */
    static final class C33550b extends Lambda implements Function0<ArrayList<IKeyboardTopExtendComponent.IKeyboardTopExtendCallbacks>> {
        public static final C33550b INSTANCE = new C33550b();

        C33550b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrayList<IKeyboardTopExtendComponent.IKeyboardTopExtendCallbacks> invoke() {
            return new ArrayList<>();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardTopExtendComponent
    /* renamed from: b */
    public ViewGroup mo123274b() {
        ViewGroup viewGroup = this.mTimeZoneContainer;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTimeZoneContainer");
        }
        return viewGroup;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardTopExtendComponent
    /* renamed from: c */
    public ViewGroup mo121985c() {
        ViewGroup viewGroup = this.mSmartReplyContainer;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSmartReplyContainer");
        }
        return viewGroup;
    }

    /* renamed from: i */
    private final void m130008i() {
        this.f86450e.getInitData().mo5923a(this, C33551c.f86452a);
    }

    /* renamed from: f */
    public void mo123275f() {
        KeyboardExtendsManager.OnExtendStatusChangeListener bVar;
        ExtendType extendType;
        IKeyboardTopExtend a;
        View K = mo141184K();
        if (K != null) {
            K.setVisibility(0);
        }
        KeyboardExtendsManager fVar = this.f86448c;
        if (fVar != null && fVar.mo123294b() && (bVar = this.f86447b) != null) {
            KeyboardExtendsManager fVar2 = this.f86448c;
            if (fVar2 == null || (a = fVar2.mo123289a()) == null || (extendType = a.mo123282a()) == null) {
                extendType = ExtendType.UNKNOWN;
            }
            bVar.mo123160a(extendType);
        }
    }

    /* renamed from: g */
    public void mo123276g() {
        KeyboardExtendsManager.OnExtendStatusChangeListener bVar;
        ExtendType extendType;
        IKeyboardTopExtend a;
        View K = mo141184K();
        if (K != null) {
            K.setVisibility(8);
        }
        KeyboardExtendsManager fVar = this.f86448c;
        if (fVar != null && fVar.mo123294b() && (bVar = this.f86447b) != null) {
            KeyboardExtendsManager fVar2 = this.f86448c;
            if (fVar2 == null || (a = fVar2.mo123289a()) == null || (extendType = a.mo123282a()) == null) {
                extendType = ExtendType.UNKNOWN;
            }
            bVar.mo123161b(extendType);
        }
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        PerfLog.start("keyboard_extend_init", "");
        View K = mo141184K();
        if (K != null) {
            ButterKnife.bind(this, K);
            try {
                Activity activity = this.f86449d;
                FrameLayout frameLayout = this.mExtendContainer;
                if (frameLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mExtendContainer");
                }
                KeyboardExtendsManager fVar = new KeyboardExtendsManager(activity, frameLayout);
                this.f86448c = fVar;
                if (fVar != null) {
                    fVar.mo123293a(this.f86447b);
                }
                m130008i();
                PerfLog.end("keyboard_extend_init", "");
            } catch (Exception e) {
                Exception exc = e;
                Log.m165385e("ChatWindowLog", "init keyboard_extend crash", exc, true);
                throw exc;
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardTopExtendComponent
    /* renamed from: a */
    public void mo123269a(ExtendType extendType) {
        Intrinsics.checkParameterIsNotNull(extendType, ShareHitPoint.f121869d);
        KeyboardExtendsManager fVar = this.f86448c;
        if (fVar != null) {
            fVar.mo123290a(extendType);
        }
    }

    /* renamed from: a */
    public void mo123268a(int i) {
        ConstraintLayout constraintLayout = this.mRootLayout;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootLayout");
        }
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.bottomMargin != i) {
                marginLayoutParams.bottomMargin = i;
            }
        }
        ConstraintLayout constraintLayout2 = this.mRootLayout;
        if (constraintLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootLayout");
        }
        constraintLayout2.setLayoutParams(layoutParams);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardTopExtendComponent
    /* renamed from: a */
    public void mo123271a(IKeyboardTopExtend dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "extend");
        KeyboardExtendsManager fVar = this.f86448c;
        if (fVar != null) {
            fVar.mo123292a(dVar);
        }
    }

    /* renamed from: a */
    public void mo121971a(IKeyboardTopExtendComponent.IKeyboardTopExtendCallbacks bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "callback");
        IKeyboardTopExtendComponent.C33553a.m130042a(this, bVar);
    }

    /* renamed from: a */
    public void mo123273a(KeyboardExtendsManager.OnExtendStatusChangeListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f86447b = bVar;
        KeyboardExtendsManager fVar = this.f86448c;
        if (fVar != null) {
            fVar.mo123293a(bVar);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardTopExtendComponent
    /* renamed from: a */
    public void mo123270a(ExtendType extendType, IKeyboardExtendData aVar) {
        Intrinsics.checkParameterIsNotNull(extendType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        FrameLayout frameLayout = this.mExtendContainer;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mExtendContainer");
        }
        frameLayout.setVisibility(0);
        KeyboardExtendsManager fVar = this.f86448c;
        if (fVar != null) {
            fVar.mo123291a(extendType, aVar);
        }
    }

    public KeyboardTopExtendComponent(Activity activity, IKeyboardExtendDependenceViewModel bVar, KeyboardExtendComponentDependency aVar) {
        Intrinsics.checkParameterIsNotNull(activity, "mContext");
        Intrinsics.checkParameterIsNotNull(bVar, "hostVM");
        Intrinsics.checkParameterIsNotNull(aVar, "mDependency");
        this.f86449d = activity;
        this.f86450e = bVar;
        this.f86451g = aVar;
    }
}
