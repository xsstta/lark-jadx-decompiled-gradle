package com.ss.android.lark.mine.impl.index.v2.title;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.contact.v2.GetUserProfileRequest;
import com.bytedance.lark.pb.contact.v2.GetUserProfileResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.Subscribe;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.biz.core.api.AbstractC29545ai;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterCustomStatus;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.dto.C45427e;
import com.ss.android.lark.mine.dto.TenantCertificationInfo;
import com.ss.android.lark.mine.impl.custom_status.C45616s;
import com.ss.android.lark.mine.impl.index.v2.container.HostViewModel;
import com.ss.android.lark.mine.impl.p2273b.AbstractC45431a;
import com.ss.android.lark.mine.impl.p2273b.p2274a.AbstractC45433b;
import com.ss.android.lark.mine.impl.p2273b.p2275b.AbstractC45434a;
import com.ss.android.lark.mine.impl.status.p2282a.C45802a;
import com.ss.android.lark.mine.p2270a.AbstractC45399a;
import com.ss.android.lark.sdk.SdkSender;
import java.util.Map;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 Q2\u00020\u0001:\u0001QB\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0006\u0010:\u001a\u00020;J\b\u0010<\u001a\u00020;H\u0002J\b\u0010=\u001a\u00020;H\u0002J\b\u0010>\u001a\u00020;H\u0002J\u0016\u0010?\u001a\u00020;2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020B0AH\u0002J\b\u0010C\u001a\u00020;H\u0002J\u0006\u0010D\u001a\u00020;J\u0006\u0010E\u001a\u00020;J\b\u0010F\u001a\u00020;H\u0016J\b\u0010G\u001a\u00020;H\u0016J\u0012\u0010H\u001a\u00020;2\b\u0010I\u001a\u0004\u0018\u00010JH\u0002J\u0012\u0010K\u001a\u00020;2\b\u0010I\u001a\u0004\u0018\u00010JH\u0002J\u0010\u0010L\u001a\u00020;2\u0006\u0010M\u001a\u00020NH\u0007J\b\u0010O\u001a\u00020;H\u0002J\b\u0010P\u001a\u00020;H\u0002R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b\"\u0010\f\u001a\u0004\b \u0010!R\u000e\u0010#\u001a\u00020$X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010%\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b)\u0010\f\u001a\u0004\b'\u0010(R\u000e\u0010*\u001a\u00020+X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010,\u001a\u00020-8BX\u0002¢\u0006\f\n\u0004\b0\u0010\f\u001a\u0004\b.\u0010/R\u000e\u00101\u001a\u000202X\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001b\u00105\u001a\u0002068BX\u0002¢\u0006\f\n\u0004\b9\u0010\f\u001a\u0004\b7\u00108¨\u0006R"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/title/TitleModel;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "map", "", "", "Landroidx/lifecycle/ViewModel;", "(Ljava/util/Map;)V", "e", "Lcom/ss/android/lark/mine/impl/index/v2/container/HostViewModel;", "getE", "()Lcom/ss/android/lark/mine/impl/index/v2/container/HostViewModel;", "e$delegate", "Lkotlin/Lazy;", "mChatDependency", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IChatDependency;", "getMChatDependency", "()Lcom/ss/android/lark/mine/dependency/IMineDependency$IChatDependency;", "mChatDependency$delegate", "mLeanModeChangeListener", "Lcom/ss/android/lark/mine/impl/listener/ILeanModeChangeListener;", "mLeanModeDependency", "Lcom/ss/android/lark/mine/dependency/IMineDependency$ILeanModeDependency;", "getMLeanModeDependency", "()Lcom/ss/android/lark/mine/dependency/IMineDependency$ILeanModeDependency;", "mLeanModeDependency$delegate", "mLoginDependency", "Lcom/ss/android/lark/mine/dependency/IMineDependency$ILoginDependency;", "getMLoginDependency", "()Lcom/ss/android/lark/mine/dependency/IMineDependency$ILoginDependency;", "mLoginDependency$delegate", "mProfileDependency", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IProfileDependency;", "getMProfileDependency", "()Lcom/ss/android/lark/mine/dependency/IMineDependency$IProfileDependency;", "mProfileDependency$delegate", "mPushChattersListener", "Lcom/ss/android/lark/mine/impl/listener/push/IPushChatterListener;", "mPushDependency", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IPushDependency;", "getMPushDependency", "()Lcom/ss/android/lark/mine/dependency/IMineDependency$IPushDependency;", "mPushDependency$delegate", "mPushMineChatterChangedListener", "Lcom/ss/android/lark/biz/core/api/IPushMineChatterChangedListener;", "mSettingDependency", "Lcom/ss/android/lark/mine/dependency/IMineDependency$ISettingDependency;", "getMSettingDependency", "()Lcom/ss/android/lark/mine/dependency/IMineDependency$ISettingDependency;", "mSettingDependency$delegate", "mZenSettingStatusChangeListener", "Lcom/ss/android/lark/mine/impl/listener/observer/IZenStatusChangeObserver;", "getMap", "()Ljava/util/Map;", "viewModel", "Lcom/ss/android/lark/mine/impl/index/v2/title/TitleViewModel;", "getViewModel", "()Lcom/ss/android/lark/mine/impl/index/v2/title/TitleViewModel;", "viewModel$delegate", "deleteWorkStatus", "", "fetchLeanMode", "fetchLoginChatter", "fetchProfileInfo", "fetchTenantCertificationInfo", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/mine/dto/TenantCertificationInfo;", "fetchZenSetting", "load", "loadUserStatus", "onCreate", "onDestroy", "onPushChatter", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "onPushMineChatterUpload", "onUserStatusUpdate", "event", "Lcom/ss/android/lark/mine/impl/status/event/MineUserStatusUpdateEvent;", "registerPushListeners", "unRegisterPushListeners", "Companion", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TitleModel extends Widget {

    /* renamed from: a */
    public static final Companion f115450a = new Companion(null);

    /* renamed from: b */
    private final Lazy f115451b = LazyKt.lazy(C45736r.INSTANCE);

    /* renamed from: c */
    private final Lazy f115452c = LazyKt.lazy(C45732n.INSTANCE);

    /* renamed from: d */
    private final Lazy f115453d = LazyKt.lazy(C45728j.INSTANCE);

    /* renamed from: e */
    private final Lazy f115454e = LazyKt.lazy(C45731m.INSTANCE);

    /* renamed from: f */
    private final Lazy f115455f = LazyKt.lazy(C45734p.INSTANCE);

    /* renamed from: g */
    private final Lazy f115456g = LazyKt.lazy(C45730l.INSTANCE);

    /* renamed from: h */
    private final Lazy f115457h = LazyKt.lazy(new C45738t(this));

    /* renamed from: i */
    private final Lazy f115458i = LazyKt.lazy(new C45720b(this));

    /* renamed from: j */
    private final AbstractC29545ai f115459j = new C45735q(this);

    /* renamed from: k */
    private final AbstractC45434a f115460k = new C45733o(this);

    /* renamed from: l */
    private final AbstractC45433b f115461l = new C45737s(this);

    /* renamed from: m */
    private final AbstractC45431a f115462m = new C45729k(this);

    /* renamed from: n */
    private final Map<Integer, AbstractC1142af> f115463n;

    /* renamed from: j */
    private final AbstractC45399a.AbstractC45415p m181255j() {
        return (AbstractC45399a.AbstractC45415p) this.f115452c.getValue();
    }

    /* renamed from: k */
    private final AbstractC45399a.AbstractC45401b m181256k() {
        return (AbstractC45399a.AbstractC45401b) this.f115453d.getValue();
    }

    /* renamed from: l */
    private final AbstractC45399a.AbstractC45410k m181257l() {
        return (AbstractC45399a.AbstractC45410k) this.f115454e.getValue();
    }

    /* renamed from: m */
    private final AbstractC45399a.AbstractC45416q m181258m() {
        return (AbstractC45399a.AbstractC45416q) this.f115455f.getValue();
    }

    /* renamed from: a */
    public final AbstractC45399a.AbstractC45417r mo160886a() {
        return (AbstractC45399a.AbstractC45417r) this.f115451b.getValue();
    }

    /* renamed from: b */
    public final AbstractC45399a.AbstractC45408i mo160888b() {
        return (AbstractC45399a.AbstractC45408i) this.f115456g.getValue();
    }

    /* renamed from: c */
    public final TitleViewModel mo121985c() {
        return (TitleViewModel) this.f115457h.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/title/TitleModel$Companion;", "", "()V", "TAG", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleModel$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: i */
    public final Map<Integer, AbstractC1142af> mo160893i() {
        return this.f115463n;
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        m181259n();
    }

    /* renamed from: h */
    public final void mo160892h() {
        m181256k().mo133506a();
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: r */
    public void mo122001r() {
        super.mo122001r();
        m181260p();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IChatDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleModel$j */
    static final class C45728j extends Lambda implements Function0<AbstractC45399a.AbstractC45401b> {
        public static final C45728j INSTANCE = new C45728j();

        C45728j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC45399a.AbstractC45401b invoke() {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            return a.mo133459r();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/dependency/IMineDependency$ILeanModeDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleModel$l */
    static final class C45730l extends Lambda implements Function0<AbstractC45399a.AbstractC45408i> {
        public static final C45730l INSTANCE = new C45730l();

        C45730l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC45399a.AbstractC45408i invoke() {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            return a.mo133464w();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/dependency/IMineDependency$ILoginDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleModel$m */
    static final class C45731m extends Lambda implements Function0<AbstractC45399a.AbstractC45410k> {
        public static final C45731m INSTANCE = new C45731m();

        C45731m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC45399a.AbstractC45410k invoke() {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            return a.mo133458q();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IProfileDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleModel$n */
    static final class C45732n extends Lambda implements Function0<AbstractC45399a.AbstractC45415p> {
        public static final C45732n INSTANCE = new C45732n();

        C45732n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC45399a.AbstractC45415p invoke() {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            return a.mo133463v();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IPushDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleModel$p */
    static final class C45734p extends Lambda implements Function0<AbstractC45399a.AbstractC45416q> {
        public static final C45734p INSTANCE = new C45734p();

        C45734p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC45399a.AbstractC45416q invoke() {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            return a.mo133460s();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/dependency/IMineDependency$ISettingDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleModel$r */
    static final class C45736r extends Lambda implements Function0<AbstractC45399a.AbstractC45417r> {
        public static final C45736r INSTANCE = new C45736r();

        C45736r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC45399a.AbstractC45417r invoke() {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            return a.mo133456o();
        }
    }

    /* renamed from: s */
    private final void m181261s() {
        m181256k().mo133509a(new C45722d(this));
    }

    /* renamed from: t */
    private final void m181262t() {
        m181255j().mo133531a(new C45723e(this));
    }

    /* renamed from: g */
    public final void mo160891g() {
        m181256k().mo133509a(new C45727i(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/impl/index/v2/container/HostViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleModel$b */
    static final class C45720b extends Lambda implements Function0<HostViewModel> {
        final /* synthetic */ TitleModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45720b(TitleModel titleModel) {
            super(0);
            this.this$0 = titleModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final HostViewModel invoke() {
            AbstractC1142af afVar = this.this$0.mo160893i().get(0);
            if (afVar != null) {
                return (HostViewModel) afVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.mine.impl.index.v2.container.HostViewModel");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleModel$c */
    public static final class RunnableC45721c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TitleModel f115464a;

        RunnableC45721c(TitleModel titleModel) {
            this.f115464a = titleModel;
        }

        public final void run() {
            this.f115464a.mo121985c().isLeanMode().mo5926a(Boolean.valueOf(this.f115464a.mo160888b().mo133471a()));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleModel$g */
    public static final class RunnableC45725g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TitleModel f115468a;

        RunnableC45725g(TitleModel titleModel) {
            this.f115468a = titleModel;
        }

        public final void run() {
            this.f115468a.mo121985c().isInZenSetting().mo5926a(Boolean.valueOf(this.f115468a.mo160886a().mo133488b()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/impl/index/v2/title/TitleViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleModel$t */
    static final class C45738t extends Lambda implements Function0<TitleViewModel> {
        final /* synthetic */ TitleModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45738t(TitleModel titleModel) {
            super(0);
            this.this$0 = titleModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TitleViewModel invoke() {
            AbstractC1142af afVar = this.this$0.mo160893i().get(1);
            if (afVar != null) {
                return (TitleViewModel) afVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.mine.impl.index.v2.title.TitleViewModel");
        }
    }

    /* renamed from: v */
    private final void m181263v() {
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getFixedThreadPool().execute(new RunnableC45725g(this));
    }

    /* renamed from: w */
    private final void m181264w() {
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getFixedThreadPool().execute(new RunnableC45721c(this));
    }

    /* renamed from: f */
    public final void mo160890f() {
        m181261s();
        m181262t();
        m181263v();
        m181264w();
        m181254a(new C45726h(this));
    }

    /* renamed from: n */
    private final void m181259n() {
        EventBus.getDefault().register(this);
        m181258m().mo133514a(this.f115459j);
        m181258m().mo133515a(this.f115460k);
        AbstractC45399a a = C45421b.m180420a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
        a.mo133462u().mo133524a(this.f115461l);
        mo160888b().mo133470a(this.f115462m);
    }

    /* renamed from: p */
    private final void m181260p() {
        m181258m().mo133517b(this.f115459j);
        m181258m().mo133518b(this.f115460k);
        AbstractC45399a a = C45421b.m180420a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
        a.mo133462u().mo133526b(this.f115461l);
        mo160888b().mo133472b(this.f115462m);
        EventBus.getDefault().unregister(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/title/TitleModel$fetchLoginChatter$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleModel$d */
    public static final class C45722d implements IGetDataCallback<Chatter> {

        /* renamed from: a */
        final /* synthetic */ TitleModel f115465a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45722d(TitleModel titleModel) {
            this.f115465a = titleModel;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("MINE_V2_Title_Model", "fetch login chatter fail " + errorResult.getMessage());
        }

        /* renamed from: a */
        public void onSuccess(Chatter chatter) {
            if (chatter == null) {
                this.f115465a.mo121985c().getUserStatus().mo5926a((Chatter.ChatterCustomStatus) null);
                Log.m165389i("MINE_V2_Title_Model", "fetch login chatter fail chatter is null");
                return;
            }
            this.f115465a.mo121985c().getChatter().mo5926a(chatter);
            this.f115465a.mo121985c().getUserStatus().mo5926a(C45616s.m180940a(ChatterCustomStatus.Companion.mo124851b(chatter.getCustomStatus())));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/title/TitleModel$fetchProfileInfo$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/mine/dto/MineProfile;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleModel$e */
    public static final class C45723e implements IGetDataCallback<C45427e> {

        /* renamed from: a */
        final /* synthetic */ TitleModel f115466a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45723e(TitleModel titleModel) {
            this.f115466a = titleModel;
        }

        /* renamed from: a */
        public void onSuccess(C45427e eVar) {
            if (eVar == null) {
                Log.m165389i("MINE_V2_Title_Model", "fetch profile info fail profile is null");
            } else {
                this.f115466a.mo121985c().getProfileInfo().mo5926a(eVar);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("MINE_V2_Title_Model", "fetch profile info fail " + errorResult.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/title/TitleModel$load$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/mine/dto/TenantCertificationInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleModel$h */
    public static final class C45726h implements IGetDataCallback<TenantCertificationInfo> {

        /* renamed from: a */
        final /* synthetic */ TitleModel f115469a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45726h(TitleModel titleModel) {
            this.f115469a = titleModel;
        }

        /* renamed from: a */
        public void onSuccess(TenantCertificationInfo gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            C1177w<Result<TenantCertificationInfo>> tenantCertificationInfo = this.f115469a.mo121985c().getTenantCertificationInfo();
            Result.Companion aVar = Result.Companion;
            tenantCertificationInfo.mo5926a(Result.m271568boximpl(Result.m271569constructorimpl(gVar)));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("MINE_V2_Title_Model", "fetch user tenant certification info is null");
            C1177w<Result<TenantCertificationInfo>> tenantCertificationInfo = this.f115469a.mo121985c().getTenantCertificationInfo();
            Result.Companion aVar = Result.Companion;
            Exception exception = errorResult.getException();
            Intrinsics.checkExpressionValueIsNotNull(exception, "err.exception");
            tenantCertificationInfo.mo5926a(Result.m271568boximpl(Result.m271569constructorimpl(C69097g.m265890a((Throwable) exception))));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/title/TitleModel$loadUserStatus$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleModel$i */
    public static final class C45727i implements IGetDataCallback<com.ss.android.lark.chat.entity.chatter.Chatter> {

        /* renamed from: a */
        final /* synthetic */ TitleModel f115470a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45727i(TitleModel titleModel) {
            this.f115470a = titleModel;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("MINE_V2_Title_Model", "fetch login chatter fail " + errorResult.getMessage());
        }

        /* renamed from: a */
        public void onSuccess(com.ss.android.lark.chat.entity.chatter.Chatter chatter) {
            if (chatter == null) {
                this.f115470a.mo121985c().getUserStatus().mo5926a((Chatter.ChatterCustomStatus) null);
                Log.m165389i("MINE_V2_Title_Model", "fetch login chatter fail chatter is null");
                return;
            }
            this.f115470a.mo121985c().getUserStatus().mo5926a(C45616s.m180940a(ChatterCustomStatus.Companion.mo124851b(chatter.getCustomStatus())));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "kotlin.jvm.PlatformType", "onPushChatter"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleModel$o */
    static final class C45733o implements AbstractC45434a {

        /* renamed from: a */
        final /* synthetic */ TitleModel f115472a;

        C45733o(TitleModel titleModel) {
            this.f115472a = titleModel;
        }

        @Override // com.ss.android.lark.mine.impl.p2273b.p2275b.AbstractC45434a
        /* renamed from: a */
        public final void mo160320a(com.ss.android.lark.chat.entity.chatter.Chatter chatter) {
            this.f115472a.mo160889b(chatter);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "kotlin.jvm.PlatformType", "onPushMineChatterChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleModel$q */
    static final class C45735q implements AbstractC29545ai {

        /* renamed from: a */
        final /* synthetic */ TitleModel f115473a;

        C45735q(TitleModel titleModel) {
            this.f115473a = titleModel;
        }

        @Override // com.ss.android.lark.biz.core.api.AbstractC29545ai
        /* renamed from: a */
        public final void mo105590a(com.ss.android.lark.chat.entity.chatter.Chatter chatter) {
            this.f115473a.mo160887a(chatter);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "leanMode", "", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleModel$k */
    static final class C45729k implements AbstractC45431a {

        /* renamed from: a */
        final /* synthetic */ TitleModel f115471a;

        C45729k(TitleModel titleModel) {
            this.f115471a = titleModel;
        }

        @Override // com.ss.android.lark.mine.impl.p2273b.AbstractC45431a
        /* renamed from: a */
        public final void mo160316a(boolean z) {
            this.f115471a.mo121985c().isLeanMode().mo5926a(Boolean.valueOf(z));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isZenModeOn", "", "onZenStatusChangeListener"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleModel$s */
    static final class C45737s implements AbstractC45433b {

        /* renamed from: a */
        final /* synthetic */ TitleModel f115474a;

        C45737s(TitleModel titleModel) {
            this.f115474a = titleModel;
        }

        @Override // com.ss.android.lark.mine.impl.p2273b.p2274a.AbstractC45433b
        /* renamed from: a */
        public final void mo160319a(boolean z) {
            this.f115474a.mo121985c().isInZenSetting().mo5926a(Boolean.valueOf(z));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/dto/TenantCertificationInfo;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.title.TitleModel$f */
    public static final class C45724f<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C45724f f115467a = new C45724f();

        C45724f() {
        }

        /* renamed from: a */
        public final TenantCertificationInfo parse(byte[] bArr) {
            GetUserProfileResponse decode = GetUserProfileResponse.ADAPTER.decode(bArr);
            Boolean bool = decode.user_info.has_tenant_certification;
            Intrinsics.checkExpressionValueIsNotNull(bool, "response.user_info.has_tenant_certification");
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = decode.user_info.is_tenant_certification;
            Intrinsics.checkExpressionValueIsNotNull(bool2, "response.user_info.is_tenant_certification");
            return new TenantCertificationInfo(booleanValue, bool2.booleanValue(), decode.user_info.tenant_certification_url);
        }
    }

    /* renamed from: a */
    private final void m181254a(IGetDataCallback<TenantCertificationInfo> iGetDataCallback) {
        AbstractC45399a a = C45421b.m180420a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
        AbstractC45399a.AbstractC45410k q = a.mo133458q();
        Intrinsics.checkExpressionValueIsNotNull(q, "MineModule.getDependency().loginDependency");
        GetUserProfileRequest.C16488a a2 = new GetUserProfileRequest.C16488a().mo58770a(q.mo133504e()).mo58767a(SyncDataStrategy.FORCE_SERVER);
        a2.mo58768a(GetUserProfileRequest.Scene.BY_USER_ID);
        SdkSender.asynSendRequestNonWrap(Command.GET_USER_PROFILE_V2, a2, iGetDataCallback, C45724f.f115467a);
    }

    /* renamed from: a */
    public final void mo160887a(com.ss.android.lark.chat.entity.chatter.Chatter chatter) {
        if (chatter != null && !(!Intrinsics.areEqual(chatter.getId(), m181257l().mo133504e()))) {
            mo121985c().getChatter().mo5926a(chatter);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onUserStatusUpdate(C45802a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "event");
        if (mo121985c().getProfileInfo().mo5927b() != null) {
            C1177w<C45427e> profileInfo = mo121985c().getProfileInfo();
            C45427e b = mo121985c().getProfileInfo().mo5927b();
            if (b == null) {
                Intrinsics.throwNpe();
            }
            C45427e eVar = b;
            Intrinsics.checkExpressionValueIsNotNull(eVar, "this");
            eVar.mo160305d().description = aVar.mo161031a();
            ChatterDescription d = eVar.mo160305d();
            ChatterDescription.Type b2 = aVar.mo161032b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "event.descriptionType");
            d.type = ChatterDescription.Type.valueOf(b2.getNumber());
            profileInfo.mo5926a(b);
            return;
        }
        Log.m165397w("MINE_V2_Title_Model", "viewModel.profileInfo.value is null");
    }

    public TitleModel(Map<Integer, AbstractC1142af> map) {
        Intrinsics.checkParameterIsNotNull(map, "map");
        this.f115463n = map;
    }

    /* renamed from: b */
    public final void mo160889b(com.ss.android.lark.chat.entity.chatter.Chatter chatter) {
        if (chatter != null && !(!Intrinsics.areEqual(chatter.getId(), m181257l().mo133504e()))) {
            mo121985c().getChatter().mo5926a(chatter);
            mo121985c().getUserStatus().mo5926a(C45616s.m180940a(ChatterCustomStatus.Companion.mo124851b(chatter.getCustomStatus())));
            if (mo121985c().getProfileInfo().mo5927b() != null) {
                C1177w<C45427e> profileInfo = mo121985c().getProfileInfo();
                C45427e b = mo121985c().getProfileInfo().mo5927b();
                if (b == null) {
                    Intrinsics.throwNpe();
                }
                C45427e eVar = b;
                Intrinsics.checkExpressionValueIsNotNull(eVar, "this");
                eVar.mo160299a(chatter.getWorkStatus());
                eVar.mo160298a(chatter.getDescription());
                profileInfo.mo5926a(b);
                return;
            }
            Log.m165397w("MINE_V2_Title_Model", "viewModel.profileInfo.value is null");
        }
    }
}
