package com.ss.android.lark.pin.impl.v3;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import butterknife.BindView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.media.MediaImageSet;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.impl.C51489b;
import com.ss.android.lark.pin.impl.C51502e;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.parser.MediaImageSetParser;
import com.ss.android.lark.pin.impl.statistics.ChatPinExtraParams;
import com.ss.android.lark.pin.impl.statistics.ChatPinHitPoint;
import com.ss.android.lark.pin.impl.statistics.PinAppreciableHitPoint;
import com.ss.android.lark.pin.impl.v3.AbstractC51629c;
import com.ss.android.lark.pin.impl.v3.binder.C51530a;
import com.ss.android.lark.pin.impl.view.C51652b;
import com.ss.android.lark.pin.impl.view.SearchBarView;
import com.ss.android.lark.pin.p2466a.AbstractC51472a;
import com.ss.android.lark.statistics.extensions.TARGET_NONE;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.C57767ae;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.lark.widget.photo_picker.animation.BaseData;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnDialogMenuClickListener;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import com.ss.android.lark.widget.recyclerview.AbstractView$OnClickListenerC58987e;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector;
import com.ss.android.lark.widget.spin.SpinView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ChatPinView2 implements AbstractC51629c.AbstractC51632b {

    /* renamed from: a */
    public C51502e f128213a;

    /* renamed from: b */
    public RecyclerView.LayoutManager f128214b;

    /* renamed from: c */
    public LinearLayoutManager f128215c;

    /* renamed from: d */
    public AbstractC51629c.AbstractC51632b.AbstractC51633a f128216d;

    /* renamed from: e */
    public final AbstractC51519a f128217e;

    /* renamed from: f */
    Activity f128218f;

    /* renamed from: g */
    public boolean f128219g;

    /* renamed from: h */
    boolean f128220h;

    /* renamed from: i */
    public final AbstractC51472a.AbstractC51474b f128221i = PinModule.m199585b().mo144035i();

    /* renamed from: j */
    private C51502e f128222j;

    /* renamed from: k */
    private LKUIStatus f128223k;

    /* renamed from: l */
    private final int f128224l;

    /* renamed from: m */
    private CharSequence f128225m;
    @BindView(7110)
    ViewGroup mContainer;
    @BindView(6812)
    ImageView mDesktopAllPinAlertIcon;
    @BindView(6357)
    ConstraintLayout mDesktopAllPinTitleBar;
    @BindView(6651)
    ViewGroup mEmptyView;
    @BindView(6944)
    SpinView mLoadingIcon;
    @BindView(6946)
    ViewGroup mLoadingView;
    @BindView(7231)
    CommonRecyclerView mPinRV;
    @BindView(7120)
    View mPlaceHolderView;
    @BindView(7219)
    ViewGroup mRootView;
    @BindView(7272)
    CollapsingToolbarLayout mSearchBarCTL;
    @BindView(7273)
    AppBarLayout mSearchBarLayout;
    @BindView(7275)
    ImageView mSearchClearBtn;
    @BindView(7269)
    EditText mSearchET;
    @BindView(7232)
    CommonRecyclerView mSearchRV;
    @BindView(7299)
    SearchBarView mSearchView;
    @BindView(7475)
    CommonTitleBar mTitleBar;

    /* renamed from: n */
    private final C51502e.AbstractC51506c f128226n = new C51502e.AbstractC51506c() {
        /* class com.ss.android.lark.pin.impl.v3.ChatPinView2.C515101 */

        @Override // com.ss.android.lark.pin.impl.C51502e.AbstractC51506c
        /* renamed from: a */
        public void mo177364a(PinInfo bVar) {
            ChatPinView2.this.mo177463b(bVar);
        }

        @Override // com.ss.android.lark.pin.impl.C51502e.AbstractC51506c
        /* renamed from: b */
        public void mo177366b(PinInfo bVar) {
            ChatPinView2.this.mo177466c(bVar);
        }

        @Override // com.ss.android.lark.pin.impl.C51502e.AbstractC51506c
        /* renamed from: c */
        public void mo177369c(PinInfo bVar) {
            ChatPinView2.this.mo177467d(bVar);
        }

        @Override // com.ss.android.lark.pin.impl.C51502e.AbstractC51506c
        /* renamed from: b */
        public boolean mo177367b(View view, PinInfo bVar) {
            if (DesktopUtil.m144301a((Context) ChatPinView2.this.f128218f)) {
                return false;
            }
            ChatPinView2.this.mo177451a(view, bVar);
            return true;
        }

        @Override // com.ss.android.lark.pin.impl.C51502e.AbstractC51506c
        /* renamed from: c */
        public void mo177368c(View view, PinInfo bVar) {
            ChatPinView2.this.mo177451a(view, bVar);
            ChatPinHitPoint.f128202a.mo177400a();
            ChatPinHitPoint.f128202a.mo177401a(ChatPinExtraParams.Click.MORE.plus(ChatPinExtraParams.Target.IM_CHAT_PIN_VIEW));
        }

        @Override // com.ss.android.lark.pin.impl.C51502e.AbstractC51506c
        /* renamed from: a */
        public void mo177363a(View view, PinInfo bVar) {
            Message.Type type = bVar.mo177396g().getType();
            if (type == Message.Type.IMAGE || type == Message.Type.MEDIA) {
                ChatPinView2.this.mo177465c(view, bVar);
            } else if (type == Message.Type.FILE) {
                ChatPinView2.this.f128217e.mo177352d(bVar);
            } else if (type == Message.Type.FOLDER) {
                ChatPinView2.this.f128217e.mo177353e(bVar);
            } else if (type == Message.Type.MERGE_FORWARD) {
                ChatPinView2.this.f128217e.mo177350b(bVar);
            } else if (type == Message.Type.TEXT || type == Message.Type.POST || type == Message.Type.CALENDAR || type == Message.Type.CARD) {
                if (ChatPinView2.this.f128216d.mo177497b(bVar.mo177396g())) {
                    ChatPinView2.this.f128217e.mo177354f(bVar);
                } else {
                    ChatPinView2.this.f128217e.mo177351c(bVar);
                }
                if (DesktopUtil.m144301a((Context) ChatPinView2.this.f128218f)) {
                    ChatPinView2.this.f128217e.mo177347a();
                }
            } else if (type == Message.Type.STICKER) {
                ChatPinView2.this.mo177462b(view, bVar);
            } else {
                Log.m165383e("ChatPinView", "onContentClick not support Message type : " + type);
            }
            ChatPinHitPoint.f128202a.mo177405a(bVar.mo177396g().getChatId(), String.valueOf(bVar.mo177396g().getType().getNumber()), bVar.mo177396g().getId(), ChatPinView2.this.f128216d.mo177496b(), "1", "1");
        }

        @Override // com.ss.android.lark.pin.impl.C51502e.AbstractC51506c
        /* renamed from: a */
        public boolean mo177365a(View view, PinInfo bVar, MotionEvent motionEvent) {
            if (!DesktopUtil.m144307b()) {
                return false;
            }
            Message.Type type = bVar.mo177396g().getType();
            if (type == Message.Type.IMAGE || type == Message.Type.MEDIA) {
                return ChatPinView2.this.mo177459a(view, motionEvent, bVar);
            }
            return false;
        }
    };

    /* renamed from: o */
    private final AbstractView$OnClickListenerC58987e.AbstractC58990c<PinInfo> f128227o = new AbstractView$OnClickListenerC58987e.AbstractC58990c<PinInfo>() {
        /* class com.ss.android.lark.pin.impl.v3.ChatPinView2.C515156 */

        /* renamed from: a */
        public void onItemClicked(View view, int i, PinInfo bVar) {
            ChatPinView2.this.mo177452a(bVar);
            ChatPinHitPoint.f128202a.mo177405a(bVar.mo177396g().getChatId(), String.valueOf(bVar.mo177396g().getType().getNumber()), bVar.mo177396g().getId(), ChatPinView2.this.f128216d.mo177496b(), "2", "1");
        }
    };

    /* renamed from: p */
    private final AbstractView$OnClickListenerC58987e.AbstractC58990c<PinInfo> f128228p = new AbstractView$OnClickListenerC58987e.AbstractC58990c() {
        /* class com.ss.android.lark.pin.impl.v3.$$Lambda$ChatPinView2$HHMQmrSYi5JFkqtkRnJ2tG2npQg */

        @Override // com.ss.android.lark.widget.recyclerview.AbstractView$OnClickListenerC58987e.AbstractC58990c
        public final void onItemClicked(View view, int i, Object obj) {
            ChatPinView2.this.m199868b(view, i, (PinInfo) obj);
        }
    };

    /* renamed from: q */
    private boolean f128229q = false;

    /* renamed from: r */
    private boolean f128230r = false;

    /* renamed from: s */
    private final Runnable f128231s = new Runnable() {
        /* class com.ss.android.lark.pin.impl.v3.$$Lambda$ChatPinView2$4UrntUguzHfCu7TQmpJDSnzeNl0 */

        public final void run() {
            ChatPinView2.this.m199885r();
        }
    };

    /* renamed from: t */
    private final AbstractC51521c f128232t = new AbstractC51521c() {
        /* class com.ss.android.lark.pin.impl.v3.ChatPinView2.C515167 */
    };

    /* renamed from: com.ss.android.lark.pin.impl.v3.ChatPinView2$a */
    public interface AbstractC51519a {
        /* renamed from: a */
        void mo177347a();

        /* renamed from: a */
        void mo177348a(PinInfo bVar);

        /* renamed from: a */
        void mo177349a(ChatPinView2 chatPinView2);

        /* renamed from: b */
        void mo177350b(PinInfo bVar);

        /* renamed from: c */
        void mo177351c(PinInfo bVar);

        /* renamed from: d */
        void mo177352d(PinInfo bVar);

        /* renamed from: e */
        void mo177353e(PinInfo bVar);

        /* renamed from: f */
        void mo177354f(PinInfo bVar);
    }

    /* renamed from: com.ss.android.lark.pin.impl.v3.ChatPinView2$c */
    public interface AbstractC51521c {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.pin.impl.v3.ChatPinView2$b */
    public static class C51520b implements OnDialogMenuClickListener {
        private static final long serialVersionUID = 5009792412696021198L;

        @Override // com.ss.android.lark.widget.photo_picker.gallery.callback.OnDialogMenuClickListener
        public void onJumpToChatClicked(String str) {
        }

        C51520b() {
        }

        @Override // com.ss.android.lark.widget.photo_picker.gallery.callback.OnDialogMenuClickListener
        public void onDecodeQRCodeClicked(String str, Activity activity) {
            PinModule.m199585b().mo144022a(str, activity);
        }
    }

    /* renamed from: a */
    public void mo177452a(PinInfo bVar) {
        if (this.f128216d.mo177497b(bVar.mo177396g())) {
            this.f128217e.mo177354f(bVar);
        } else {
            this.f128217e.mo177351c(bVar);
        }
        if (DesktopUtil.m144301a((Context) this.f128218f)) {
            this.f128217e.mo177347a();
        }
    }

    @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51632b
    /* renamed from: a */
    public void mo177457a(List<PinInfo> list, long j, boolean z, boolean z2) {
        if (list.isEmpty()) {
            m199863a(true, z);
        } else {
            m199863a(false, false);
        }
        if (z2) {
            this.f128213a.mo177359a(list, j);
        } else {
            this.f128222j.mo177359a(list, j);
        }
        if (!this.f128229q) {
            this.f128229q = true;
            AbstractC51472a b = PinModule.m199585b();
            if (b != null) {
                b.mo144040n().mo144051a();
            }
        }
        if (!this.f128230r) {
            this.f128230r = true;
            PinAppreciableHitPoint.f128210a.mo177422a();
        }
    }

    @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51632b
    /* renamed from: a */
    public void mo177458a(boolean z) {
        this.f128222j.mo177360a(z);
    }

    /* renamed from: a */
    public void mo177450a(int i) {
        this.mPinRV.scrollToPosition(i);
    }

    @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51632b
    /* renamed from: a */
    public void mo177455a(String str) {
        this.f128219g = true;
        this.mSearchET.setText(str);
    }

    @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51632b
    /* renamed from: a */
    public void mo177454a(Boolean bool) {
        if (bool.booleanValue()) {
            this.mLoadingView.setPadding(0, UIHelper.dp2px(80.0f), 0, 0);
            UICallbackExecutor.executeDelayed(this.f128231s, 200);
            return;
        }
        UICallbackExecutor.removeCallbacks(this.f128231s);
        this.mLoadingView.setVisibility(8);
    }

    /* renamed from: a */
    public void mo177451a(View view, PinInfo bVar) {
        C515123 r0 = new C51489b.AbstractC51493b() {
            /* class com.ss.android.lark.pin.impl.v3.ChatPinView2.C515123 */

            @Override // com.ss.android.lark.pin.impl.C51489b.AbstractC51493b
            /* renamed from: a */
            public void mo177334a(PinInfo bVar) {
                ChatPinView2.this.mo177463b(bVar);
                ChatPinHitPoint.f128202a.mo177407b(ChatPinExtraParams.Click.UNPIN.plus(ChatPinExtraParams.Target.IM_UNPIN_CONFIRM_VIEW));
            }

            @Override // com.ss.android.lark.pin.impl.C51489b.AbstractC51493b
            /* renamed from: b */
            public void mo177335b(PinInfo bVar) {
                ChatPinView2.this.mo177466c(bVar);
                ChatPinHitPoint.f128202a.mo177407b(ChatPinExtraParams.Click.JUMP_TO_CHAT.plus(TARGET_NONE.f135700a));
            }

            @Override // com.ss.android.lark.pin.impl.C51489b.AbstractC51493b
            /* renamed from: c */
            public void mo177336c(PinInfo bVar) {
                ChatPinView2.this.mo177467d(bVar);
                ChatPinHitPoint.f128202a.mo177407b(ChatPinExtraParams.Click.FORWARD.plus(ChatPinExtraParams.Target.PUBLIC_MULTI_SELECT_SHARE_VIEW));
            }

            @Override // com.ss.android.lark.pin.impl.C51489b.AbstractC51493b
            /* renamed from: d */
            public void mo177337d(PinInfo bVar) {
                ChatPinView2.this.f128221i.mo144069a(ChatPinView2.this.f128218f, bVar.mo177396g());
                ChatPinHitPoint.f128202a.mo177413e();
            }
        };
        boolean b = this.f128216d.mo177497b(bVar.mo177396g());
        if (DesktopUtil.m144301a((Context) this.f128218f)) {
            C51489b.m199740a(this.f128218f, view, bVar, b, r0);
        } else {
            C51489b.m199742a(this.f128218f, bVar, b, this.f128216d.mo177499d(), r0);
        }
    }

    @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51632b
    /* renamed from: a */
    public void mo177456a(String str, String str2, final PinInfo bVar, Chatter chatter) {
        if (chatter != null) {
            C51489b.m199741a(this.f128218f, bVar, str, str2, this.f128221i.mo144063a(chatter), chatter.getId(), bVar.mo177398i(), false, new C51489b.AbstractC51492a() {
                /* class com.ss.android.lark.pin.impl.v3.ChatPinView2.C515134 */

                @Override // com.ss.android.lark.pin.impl.C51489b.AbstractC51492a
                /* renamed from: a */
                public void mo177254a(boolean z) {
                    ChatPinView2.this.f128216d.mo177492a(bVar.mo177396g());
                }
            });
        }
    }

    /* renamed from: a */
    public boolean mo177459a(View view, MotionEvent motionEvent, PinInfo bVar) {
        int i = C515145.f128241a[bVar.mo177396g().getType().ordinal()];
        if (i == 1) {
            PhotoItem e = m199871e(bVar);
            if (e == null) {
                LKUIToast.show(this.f128218f, UIHelper.getString(R.string.Lark_Legacy_PhotoGetFail));
                return false;
            }
            return C51641i.m200348a(view.getContext(), view, motionEvent.getRawX(), motionEvent.getRawY(), new C38824b(e.getImageKey()));
        } else if (i != 2) {
            return false;
        } else {
            return C51641i.m200347a(view.getContext(), view, motionEvent.getRawX(), motionEvent.getRawY(), bVar.mo177396g());
        }
    }

    /* renamed from: d */
    private void m199870d() {
        this.f128223k.mo89837a();
    }

    /* renamed from: e */
    private void m199872e() {
        this.f128223k.mo89847d();
    }

    /* renamed from: h */
    private void m199875h() {
        m199876i();
        m199878k();
    }

    @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51632b
    /* renamed from: c */
    public int mo177464c() {
        return this.f128215c.findFirstVisibleItemPosition();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ void m199883p() {
        PinModule.m199585b().mo144038l().mo144048a("all_add_pin", false);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: r */
    private /* synthetic */ void m199885r() {
        this.mLoadingView.setVisibility(0);
        m199863a(false, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.pin.impl.v3.ChatPinView2$5 */
    public static /* synthetic */ class C515145 {

        /* renamed from: a */
        static final /* synthetic */ int[] f128241a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.chat.entity.message.Message$Type[] r0 = com.ss.android.lark.chat.entity.message.Message.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.pin.impl.v3.ChatPinView2.C515145.f128241a = r0
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.IMAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.pin.impl.v3.ChatPinView2.C515145.f128241a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.MEDIA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.pin.impl.v3.ChatPinView2.C515145.<clinit>():void");
        }
    }

    /* renamed from: l */
    private void m199879l() {
        if (PinModule.m199585b().mo144038l().mo144049a("all_add_pin")) {
            m199880m();
        }
    }

    /* renamed from: m */
    private void m199880m() {
        PinTipPopupWindow hVar = new PinTipPopupWindow(this.f128218f, false);
        LinearLayout centerLayout = this.mTitleBar.getCenterLayout();
        centerLayout.postDelayed(new Runnable(centerLayout) {
            /* class com.ss.android.lark.pin.impl.v3.$$Lambda$ChatPinView2$PyLFSbpAgiZ8RgSVccy0L9Yy4 */
            public final /* synthetic */ View f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                ChatPinView2.m199861a(PinTipPopupWindow.this, this.f$1);
            }
        }, 500);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: q */
    private /* synthetic */ void m199884q() {
        this.mSearchBarLayout.setExpanded(true, true);
        AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) this.mSearchBarCTL.getLayoutParams();
        layoutParams.mo76392a(0);
        this.mSearchBarCTL.setLayoutParams(layoutParams);
    }

    @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51632b
    /* renamed from: b */
    public void mo177460b() {
        mo177461b(0);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f128217e.mo177349a(this);
        m199873f();
        m199881n();
        ChatPinHitPoint.f128202a.mo177417i();
    }

    /* renamed from: f */
    private void m199873f() {
        m199874g();
        m199875h();
        this.f128223k = new LKUIStatus.C25680a(this.mContainer).mo89857a(R.color.color_transparent).mo89859a();
        this.mLoadingIcon.setSpinDrawable(UIHelper.getDrawable(R.drawable.ic_loading));
        m199879l();
    }

    /* renamed from: g */
    private void m199874g() {
        if (!DesktopUtil.m144301a((Context) this.f128218f)) {
            m199862a(this.f128218f.getString(R.string.Lark_Pin_TitleOfPinnedItems), (IActionTitlebar.BaseAction) null);
            return;
        }
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.pin.impl.v3.ChatPinView2.View$OnClickListenerC515178 */

            public void onClick(View view) {
            }
        });
        m199869b(this.f128218f.getString(R.string.Lark_Pin_TitleOfPinnedItems), (IActionTitlebar.BaseAction) null);
    }

    /* renamed from: n */
    private void m199881n() {
        this.mSearchET.addTextChangedListener(new C57767ae() {
            /* class com.ss.android.lark.pin.impl.v3.ChatPinView2.C515112 */

            @Override // com.ss.android.lark.utils.C57767ae
            public void afterTextChanged(Editable editable) {
                if (TextUtils.isEmpty(editable)) {
                    ChatPinView2.this.f128216d.mo177495a(true);
                    ChatPinView2.this.mSearchClearBtn.setVisibility(8);
                    ChatPinView2.this.mSearchRV.setVisibility(8);
                    ChatPinView2.this.mPinRV.setVisibility(0);
                    return;
                }
                ChatPinView2.this.f128216d.mo177494a(editable.toString());
                ChatPinView2.this.mSearchClearBtn.setVisibility(0);
                ChatPinView2.this.mPinRV.setVisibility(8);
                ChatPinView2.this.mSearchRV.setVisibility(0);
                if (!ChatPinView2.this.f128219g) {
                    ChatPinView2.this.f128213a.mo177359a(new ArrayList(), -1);
                }
                ChatPinView2.this.f128219g = false;
            }
        });
        this.mSearchET.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.lark.pin.impl.v3.$$Lambda$ChatPinView2$nxrHh4ucu84c3IDoPIHIyNnchM4 */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ChatPinView2.this.m199865a((ChatPinView2) view, (View) motionEvent);
            }
        });
        this.mSearchET.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            /* class com.ss.android.lark.pin.impl.v3.$$Lambda$ChatPinView2$gNgiHZ74QNCupd7dgGIB7np7No */

            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return ChatPinView2.this.m199866a((ChatPinView2) textView, (TextView) i, (int) keyEvent);
            }
        });
        this.mSearchClearBtn.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.pin.impl.v3.$$Lambda$ChatPinView2$VD5h9OG0oXTYekdDoqo2xmQ6I3Q */

            public final void onClick(View view) {
                ChatPinView2.this.m199859a((ChatPinView2) view);
            }
        });
        this.mSearchBarLayout.addOnOffsetChangedListener((AppBarLayout.AbstractC22134b) new AppBarLayout.AbstractC22134b() {
            /* class com.ss.android.lark.pin.impl.v3.$$Lambda$ChatPinView2$dQ9mHcVKg6dKC2dggf5Kjraw4 */

            @Override // com.google.android.material.appbar.AppBarLayout.AbstractC22133a
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                ChatPinView2.this.m199860a((ChatPinView2) appBarLayout, (AppBarLayout) i);
            }
        });
    }

    /* renamed from: j */
    private void m199877j() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f128218f);
        this.f128214b = linearLayoutManager;
        this.mPinRV.setLayoutManager(linearLayoutManager);
        if (this.mPinRV.getItemDecorationCount() == 0) {
            this.mPinRV.addItemDecoration(new C51652b(this.f128218f, R.drawable.pin_list_divider2, false));
        }
        ((SimpleItemAnimator) this.mPinRV.getItemAnimator()).setSupportsChangeAnimations(false);
        this.mPinRV.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.pin.impl.v3.ChatPinView2.AnonymousClass10 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 1 && KeyboardUtils.isSoftShowing(ChatPinView2.this.f128218f)) {
                    KeyboardUtils.hideKeyboard(ChatPinView2.this.f128218f);
                }
            }
        });
        this.mPinRV.addOnScrollListener(new RecyclerViewScrollDetector() {
            /* class com.ss.android.lark.pin.impl.v3.ChatPinView2.AnonymousClass11 */

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
            public void onScrollStop(int i, int i2) {
            }

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
            public void onScrollToBottom() {
            }

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
            public void onScrollPassed(int i, int i2) {
                if (i2 >= ChatPinView2.this.f128214b.getItemCount() - 15) {
                    ChatPinView2.this.f128216d.mo177491a();
                }
            }
        });
    }

    /* renamed from: k */
    private void m199878k() {
        C51502e eVar = new C51502e(this.mSearchRV);
        this.f128213a = eVar;
        eVar.mo200108a(new C51530a(this.f128218f, this.f128222j, this.f128226n));
        this.f128213a.mo200109a(this.f128228p);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f128218f);
        this.f128215c = linearLayoutManager;
        this.mSearchRV.setLayoutManager(linearLayoutManager);
        this.mSearchRV.setAdapter(this.f128213a);
        this.mSearchRV.setVisibility(8);
        this.mSearchRV.clearOnScrollListeners();
        this.mSearchRV.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.pin.impl.v3.ChatPinView2.AnonymousClass12 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 1 && KeyboardUtils.isSoftShowing(ChatPinView2.this.f128218f)) {
                    KeyboardUtils.hideKeyboard(ChatPinView2.this.f128218f);
                }
                if (i == 0 && ChatPinView2.this.f128215c.findLastVisibleItemPosition() >= ChatPinView2.this.f128215c.getItemCount() - 15) {
                    ChatPinView2.this.f128216d.mo177491a();
                }
            }
        });
        this.f128213a.mo177358a(new C51502e.AbstractC51507d() {
            /* class com.ss.android.lark.pin.impl.v3.$$Lambda$ChatPinView2$F3oMmHvVIFhEScQqWdpDy6nrVKo */

            @Override // com.ss.android.lark.pin.impl.C51502e.AbstractC51507d
            public final void onUpdate() {
                ChatPinView2.this.m199884q();
            }
        });
    }

    /* renamed from: o */
    private void m199882o() {
        if (this.f128216d.mo177498c()) {
            this.f128225m = C57782ag.m224234a(this.f128218f.getString(R.string.Lark_Chat_TopicSidebarPinTip), this.f128218f.getString(R.string.Lark_Pin_PinButton), UIUtils.getColor(this.f128218f, R.color.function_info_500));
        } else {
            this.f128225m = C57782ag.m224234a(this.f128218f.getString(R.string.Lark_Pin_TipForTheEmptyPinList), this.f128218f.getString(R.string.Lark_Pin_PinButton), UIUtils.getColor(this.f128218f, R.color.function_info_500));
        }
    }

    /* renamed from: i */
    private void m199876i() {
        this.f128222j = new C51502e(this.mPinRV);
        HashMap hashMap = new HashMap();
        hashMap.put("biz", Integer.valueOf(Biz.Messenger.getValue()));
        hashMap.put("scene", Integer.valueOf(Scene.Pin.getValue()));
        this.mPinRV.mo200036a(hashMap);
        C51502e eVar = this.f128222j;
        eVar.mo200108a(new C51530a(this.f128218f, eVar, this.f128226n));
        this.f128222j.mo200109a(this.f128227o);
        this.f128222j.mo200110a(new AbstractView$OnClickListenerC58987e.AbstractC58991d() {
            /* class com.ss.android.lark.pin.impl.v3.$$Lambda$ChatPinView2$EPxaxdwsVS1GTZPj5Xk266Sq5s */

            @Override // com.ss.android.lark.widget.recyclerview.AbstractView$OnClickListenerC58987e.AbstractC58991d
            public final boolean onItemLongClicked(View view, int i, Object obj) {
                return ChatPinView2.this.m199864a((ChatPinView2) view, (View) i, (int) ((PinInfo) obj));
            }
        });
        this.mPinRV.setAdapter(this.f128222j);
        this.mPinRV.clearOnScrollListeners();
        m199877j();
        this.mPlaceHolderView.setVisibility(8);
        this.f128222j.mo177358a(new C51502e.AbstractC51507d() {
            /* class com.ss.android.lark.pin.impl.v3.ChatPinView2.C515189 */

            @Override // com.ss.android.lark.pin.impl.C51502e.AbstractC51507d
            public void onUpdate() {
                ChatPinView2.this.mSearchBarLayout.setExpanded(true, true);
                AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) ChatPinView2.this.mSearchBarCTL.getLayoutParams();
                if (DesktopUtil.m144301a((Context) ChatPinView2.this.f128218f)) {
                    layoutParams.mo76392a(0);
                } else {
                    layoutParams.mo76392a(5);
                }
                ChatPinView2.this.mSearchBarCTL.setLayoutParams(layoutParams);
            }
        });
        this.mPinRV.setVisibility(0);
        this.mPinRV.mo200038c();
        this.mSearchRV.mo200038c();
    }

    @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51632b
    /* renamed from: a */
    public void mo177449a() {
        mo177450a(0);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC51629c.AbstractC51632b.AbstractC51633a aVar) {
        this.f128216d = aVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m199867b(View view) {
        this.f128217e.mo177347a();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m199859a(View view) {
        mo177455a("");
        ChatPinHitPoint.f128202a.mo177412d();
    }

    /* renamed from: d */
    public void mo177467d(PinInfo bVar) {
        this.f128217e.mo177348a(bVar);
        ChatPinHitPoint.f128202a.mo177414f();
    }

    /* renamed from: c */
    public void mo177466c(PinInfo bVar) {
        if (this.f128216d.mo177497b(bVar.mo177396g())) {
            this.f128217e.mo177354f(bVar);
        } else {
            this.f128217e.mo177351c(bVar);
        }
        if (DesktopUtil.m144301a((Context) this.f128218f)) {
            this.f128217e.mo177347a();
        }
    }

    @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51632b
    /* renamed from: b */
    public void mo177461b(int i) {
        this.mSearchRV.scrollToPosition(i);
    }

    /* renamed from: e */
    private PhotoItem m199871e(PinInfo bVar) {
        Message g = bVar.mo177396g();
        if (g.getType() == Message.Type.IMAGE) {
            return C58659h.m227513a(Collections.singletonList(((ImageContent) g.getContent()).getImageSet())).get(0);
        }
        if (g.getType() == Message.Type.MEDIA) {
            MediaImageSet a = MediaImageSetParser.f128145a.mo177331a((MediaContent) g.getContent());
            a.setMessageIdentity(new MessageIdentity(g.getId(), g.getChatId(), bVar.mo177397h().getId(), Message.SourceType.TYPE_FROM_CHAT_PIN));
            return C58659h.m227513a(Collections.singletonList(a)).get(0);
        } else if (g.getType() != Message.Type.STICKER) {
            return null;
        } else {
            StickerContent stickerContent = (StickerContent) g.getContent();
            return new PhotoItem().setImageKey(stickerContent.getKey()).setPaths(new ArrayList(Collections.singletonList(stickerContent.getKey())));
        }
    }

    /* renamed from: b */
    public void mo177463b(PinInfo bVar) {
        this.f128216d.mo177493a(bVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m199860a(AppBarLayout appBarLayout, int i) {
        this.mSearchView.mo177687a(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m199861a(PinTipPopupWindow hVar, View view) {
        hVar.mo177658a(view, $$Lambda$ChatPinView2$2vJpHyQM0PVbXF2OAhZY2Kt3dfU.INSTANCE);
    }

    /* renamed from: a */
    private void m199862a(String str, IActionTitlebar.BaseAction baseAction) {
        if (DesktopUtil.m144301a((Context) this.f128218f)) {
            this.mTitleBar.setLeftImageDrawable(null);
            this.mTitleBar.setLeftClickListener(null);
        } else {
            this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.pin.impl.v3.$$Lambda$ChatPinView2$LTw4lNz4VfR50EehsAO0jO8xos4 */

                public final void onClick(View view) {
                    ChatPinView2.this.m199867b((ChatPinView2) view);
                }
            });
        }
        this.mTitleBar.setTitle(str);
        this.mTitleBar.setMainTitleSize(17.0f);
        this.mTitleBar.setMainTitleTextStyle(1);
        if (baseAction != null) {
            this.mTitleBar.addAction(baseAction);
        }
    }

    /* renamed from: b */
    private void m199869b(String str, IActionTitlebar.BaseAction baseAction) {
        this.mTitleBar.setLeftText(str);
        this.mTitleBar.setLeftImageDrawable(null);
        this.mTitleBar.getLeftText().setTypeface(Typeface.defaultFromStyle(1));
        this.mTitleBar.setLeftTextSize(17.0f);
        if (baseAction != null) {
            this.mTitleBar.addAction(baseAction);
        }
    }

    /* renamed from: a */
    private void m199863a(boolean z, boolean z2) {
        if (!z || !z2) {
            m199872e();
        } else {
            m199870d();
        }
        if (z) {
            if (!this.f128220h) {
                m199882o();
                this.f128220h = true;
            }
            if (TextUtils.isEmpty(this.mSearchET.getText().toString())) {
                this.f128223k.mo89840a(this.f128225m, R.drawable.illustration_empty_positive_pin, 5);
                this.mPinRV.setVisibility(8);
                return;
            }
            this.f128223k.mo89840a(UIHelper.getString(R.string.Lark_Pin_SearchNoResult), R.drawable.illustration_empty_positive_pin, 5);
            this.mSearchRV.setVisibility(8);
        } else if (TextUtils.isEmpty(this.mSearchET.getText().toString())) {
            this.mPinRV.setVisibility(0);
        } else {
            this.mSearchRV.setVisibility(0);
        }
    }

    /* renamed from: c */
    public void mo177465c(View view, PinInfo bVar) {
        PhotoItem photoItem;
        PhotoItem e = m199871e(bVar);
        if (e == null) {
            LKUIToast.show(this.f128218f, UIHelper.getString(R.string.Lark_Legacy_PhotoGetFail));
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (PinInfo bVar2 : this.f128222j.mo177357a()) {
            if (bVar2.equals(bVar)) {
                photoItem = e;
            } else {
                photoItem = m199871e(bVar2);
            }
            if (photoItem != null) {
                arrayList.add(photoItem);
            }
        }
        if (!CollectionUtils.isEmpty(arrayList)) {
            C58630d.m227370a(this.f128218f, arrayList, arrayList.indexOf(e), view, BaseData.AnimationType.TRANSLATE_ANIMATION, true, false, true, false, true, false, new C51520b(), null, "");
        }
    }

    /* renamed from: b */
    public void mo177462b(View view, PinInfo bVar) {
        if (bVar != null) {
            String stickerSetId = ((StickerContent) bVar.mo177396g().getContent()).getStickerSetId();
            AbstractC51472a b = PinModule.m199585b();
            if (b == null || TextUtils.isEmpty(stickerSetId)) {
                mo177465c(view, bVar);
            } else {
                b.mo144039m().mo144050a(view.getContext(), bVar.mo177396g());
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m199865a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        this.mSearchBarLayout.setExpanded(true, true);
        ChatPinHitPoint.f128202a.mo177406b();
        ChatPinHitPoint.f128202a.mo177401a(ChatPinExtraParams.Click.SEARCH.plus(TARGET_NONE.f135700a));
        return false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m199868b(View view, int i, PinInfo bVar) {
        mo177452a(bVar);
        ChatPinHitPoint.f128202a.mo177410c();
    }

    public ChatPinView2(Activity activity, int i, AbstractC51519a aVar) {
        this.f128218f = activity;
        this.f128217e = aVar;
        this.f128224l = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m199864a(View view, int i, PinInfo bVar) {
        if (DesktopUtil.m144301a((Context) this.f128218f)) {
            return false;
        }
        mo177451a(view, bVar);
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m199866a(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return true;
        }
        String obj = this.mSearchET.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            this.f128216d.mo177495a(true);
            return false;
        }
        this.f128216d.mo177494a(obj);
        return false;
    }
}
