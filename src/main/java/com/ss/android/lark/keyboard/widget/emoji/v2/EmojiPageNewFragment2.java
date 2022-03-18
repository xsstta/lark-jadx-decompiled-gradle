package com.ss.android.lark.keyboard.widget.emoji.v2;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.ICallback;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.widget.emoji.EmojiMapHandler;
import com.ss.android.lark.keyboard.widget.emoji.IEmojiDependency;
import com.ss.android.lark.keyboard.widget.emoji.base.EmojiPageBaseFragment;
import com.ss.android.lark.keyboard.widget.emoji.base.OnEmojiOperationListener;
import com.ss.android.lark.keyboard.widget.emoji.v2.EmojiPageAdapter2;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 .2\u00020\u0001:\u0002./B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eH\u0016J\u0016\u0010\u001b\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002J\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0002\u0010 J\"\u0010!\u001a\u00020\u00162\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dJ\b\u0010$\u001a\u00020\u0016H\u0002J&\u0010%\u001a\u0004\u0018\u00010\u00192\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020\u0016H\u0016J\b\u0010-\u001a\u00020\u0016H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/emoji/v2/EmojiPageNewFragment2;", "Lcom/ss/android/lark/keyboard/widget/emoji/base/EmojiPageBaseFragment;", "()V", "allList", "", "Lcom/ss/android/lark/keyboard/widget/emoji/v2/EmojiViewData;", "emojiContainerWidth", "", "emojiLeftMargin", "localCallbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "mAdapter", "Lcom/ss/android/lark/keyboard/widget/emoji/v2/EmojiPageAdapter2;", "mCurrentContext", "Landroid/content/Context;", "mEmojiList", "mRwDataLock", "Ljava/util/concurrent/locks/ReadWriteLock;", "recentList", "recyclerviewPadding", "showColumn", "bindView", "", "compute", "createAndInitView", "Landroid/view/View;", "context", "initAllList", "tempAllList", "", "", "initData", "()Lkotlin/Unit;", "initList", "originRecentList", "originAllList", "initListener", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "unRegisterListener", "Companion", "SpaceItemDecoration", "keyboard-component_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.keyboard.widget.emoji.v2.c */
public final class EmojiPageNewFragment2 extends EmojiPageBaseFragment {

    /* renamed from: f */
    public static final float f104846f = 56.0f;

    /* renamed from: g */
    public static final Companion f104847g = new Companion(null);

    /* renamed from: q */
    private static final float f104848q = f104848q;

    /* renamed from: d */
    public List<EmojiViewData> f104849d = new ArrayList();

    /* renamed from: e */
    public CallbackManager f104850e = new CallbackManager();

    /* renamed from: h */
    private List<EmojiViewData> f104851h = new ArrayList();

    /* renamed from: i */
    private List<EmojiViewData> f104852i = new ArrayList();

    /* renamed from: j */
    private EmojiPageAdapter2 f104853j;

    /* renamed from: k */
    private int f104854k;

    /* renamed from: l */
    private int f104855l;

    /* renamed from: m */
    private int f104856m;

    /* renamed from: n */
    private int f104857n;

    /* renamed from: o */
    private Context f104858o;

    /* renamed from: p */
    private ReadWriteLock f104859p = new ReentrantReadWriteLock();

    /* renamed from: r */
    private HashMap f104860r;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/keyboard/widget/emoji/v2/EmojiPageNewFragment2$initListener$1", "Lcom/ss/android/lark/keyboard/widget/emoji/v2/EmojiPageAdapter2$OnEmojiSelectListener;", "onSelectEmoji", "", "reactionKey", "", "keyboard-component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.keyboard.widget.emoji.v2.c$c */
    public static final class C41110c implements EmojiPageAdapter2.OnEmojiSelectListener {

        /* renamed from: a */
        final /* synthetic */ EmojiPageNewFragment2 f104866a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/keyboard/widget/emoji/v2/EmojiPageNewFragment2$initListener$1$onSelectEmoji$1$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Integer;)V", "keyboard-component_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.keyboard.widget.emoji.v2.c$c$a */
        public static final class C41111a implements IGetDataCallback<Integer> {
            C41111a() {
            }

            /* renamed from: a */
            public void onSuccess(Integer num) {
                Log.m165389i("EmojiPageNewFragment2", "add emoji success");
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165389i("EmojiPageNewFragment2", "add emoji failed");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C41110c(EmojiPageNewFragment2 cVar) {
            this.f104866a = cVar;
        }

        @Override // com.ss.android.lark.keyboard.widget.emoji.v2.EmojiPageAdapter2.OnEmojiSelectListener
        /* renamed from: a */
        public void mo148268a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "reactionKey");
            IEmojiDependency e = this.f104866a.mo148247e();
            if (e != null) {
                EmojiHitPoint.f104831a.mo148264a(str, "emoji", "none");
                e.mo147527a(str);
                ICallback wrapAndAddCallback = this.f104866a.f104850e.wrapAndAddCallback(new C41111a());
                Intrinsics.checkExpressionValueIsNotNull(wrapAndAddCallback, "localCallbackManager.wra…                       })");
                e.mo147528a(str, (IGetDataCallback) wrapAndAddCallback);
            }
            OnEmojiOperationListener bVar = this.f104866a.mo148239a().get();
            if (bVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(bVar, "mRefListener.get() ?: return");
                bVar.mo147530a(str);
            }
        }
    }

    @Override // com.ss.android.lark.keyboard.widget.emoji.base.EmojiPageBaseFragment
    /* renamed from: f */
    public void mo148248f() {
        HashMap hashMap = this.f104860r;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.keyboard.widget.emoji.base.EmojiPageBaseFragment, com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo148248f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/emoji/v2/EmojiPageNewFragment2$Companion;", "", "()V", "DEFAULT_COLUMN", "", "LOG_TAG", "", "MARGIN_BOTTOM_LAST_EMOJI", "", "MARGIN_LEFT_FIRST_EMOJI", "MAX_X_WIDTH", "MIN_X_WIDTH", "TITLE_LEFT_MARGIN", "TITLE_TOP_MARGIN", "keyboard-component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.keyboard.widget.emoji.v2.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.keyboard.widget.emoji.base.EmojiPageBaseFragment
    /* renamed from: d */
    public void mo148246d() {
        EmojiPageAdapter2 bVar = this.f104853j;
        if (bVar != null) {
            bVar.mo148265a();
        }
    }

    /* renamed from: h */
    private final Unit m163045h() {
        EmojiPageAdapter2 bVar = this.f104853j;
        if (bVar == null) {
            return null;
        }
        bVar.resetAll(this.f104852i);
        return Unit.INSTANCE;
    }

    /* renamed from: j */
    private final void m163047j() {
        EmojiPageAdapter2 bVar = this.f104853j;
        if (bVar != null) {
            bVar.mo148266a(new C41110c(this));
        }
    }

    @Override // com.ss.android.lark.keyboard.widget.emoji.base.EmojiPageBaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f104850e.cancelCallbacks();
        super.onDestroy();
    }

    /* renamed from: i */
    private final void m163046i() {
        if (this.f104855l == 0) {
            int i = 7;
            if (this.f104858o == null) {
                this.f104854k = 7;
                return;
            }
            int dp2px = UIHelper.dp2px(30.0f);
            int windowWidth = UIHelper.getWindowWidth(this.f104858o);
            if (this.f104854k == 0) {
                int i2 = (windowWidth - (dp2px * 2)) / 6;
                if (i2 > UIHelper.dp2px(64.0f)) {
                    i = 8;
                } else if (i2 < UIHelper.dp2px(48.0f)) {
                    i = 6;
                }
                this.f104854k = i;
            }
            int i3 = dp2px * 2;
            int i4 = (windowWidth - i3) / (this.f104854k - 1);
            if (i4 > i3) {
                this.f104855l = i3;
            } else {
                this.f104855l = i4;
                this.f104857n = dp2px - (i4 / 2);
            }
            this.f104856m = i4 - this.f104855l;
        }
    }

    /* renamed from: g */
    private final void m163044g() {
        RecyclerView b = mo148244b();
        if (b != null) {
            int i = this.f104857n;
            b.setPadding(i, 0, i, 0);
            RecyclerView.ItemAnimator itemAnimator = b.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.setChangeDuration(0);
            }
            RecyclerView.ItemAnimator itemAnimator2 = b.getItemAnimator();
            if (itemAnimator2 != null) {
                itemAnimator2.setAddDuration(0);
            }
            RecyclerView.ItemAnimator itemAnimator3 = b.getItemAnimator();
            if (itemAnimator3 != null) {
                itemAnimator3.setMoveDuration(0);
            }
            RecyclerView.ItemAnimator itemAnimator4 = b.getItemAnimator();
            if (itemAnimator4 != null) {
                itemAnimator4.setRemoveDuration(0);
            }
            RecyclerView.ItemAnimator itemAnimator5 = b.getItemAnimator();
            if (itemAnimator5 != null) {
                ((SimpleItemAnimator) itemAnimator5).setSupportsChangeAnimations(false);
                b.addItemDecoration(new SpaceItemDecoration(this.f104856m, UIHelper.dp2px(8.0f), UIHelper.dp2px(f104848q) - this.f104857n, this.f104854k));
                this.f104853j = new EmojiPageAdapter2(this.f104855l);
                b.setLayoutManager(new GridLayoutManager(b.getContext(), this.f104854k, 1, false));
                b.setAdapter(this.f104853j);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        }
    }

    /* renamed from: b */
    public View mo148272b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        mo148240a(mo148238a(context));
        this.f104858o = context;
        m163046i();
        m163044g();
        m163045h();
        m163047j();
        return mo148245c();
    }

    /* renamed from: a */
    private final void m163043a(List<String> list) {
        if (CollectionUtils.isEmpty(this.f104851h)) {
            for (String str : list) {
                if (EmojiMapHandler.m162996d(str)) {
                    this.f104851h.add(new EmojiViewData(str, 1));
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo148271a(List<String> list, List<String> list2) {
        Intrinsics.checkParameterIsNotNull(list, "originRecentList");
        Intrinsics.checkParameterIsNotNull(list2, "originAllList");
        List<String> list3 = list;
        if (!CollectionUtils.isEmpty(list3)) {
            List<String> list4 = list2;
            if (!CollectionUtils.isEmpty(list4)) {
                if (this.f104854k == 0) {
                    m163046i();
                }
                ArrayList arrayList = new ArrayList(list3);
                ArrayList arrayList2 = new ArrayList(list4);
                this.f104859p.writeLock().lock();
                try {
                    this.f104852i.clear();
                    List<EmojiViewData> list5 = this.f104852i;
                    String string = UIHelper.getString(R.string.Lark_Chat_EmojiRecentlyUsed);
                    Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…k_Chat_EmojiRecentlyUsed)");
                    list5.add(new EmojiViewData(string, 0));
                    this.f104849d.clear();
                    Iterator it = arrayList.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        Intrinsics.checkExpressionValueIsNotNull(str, "recent");
                        if (EmojiMapHandler.m162996d(str)) {
                            this.f104849d.add(new EmojiViewData(str, 1));
                            i++;
                            if (i == this.f104854k) {
                                break;
                            }
                        }
                    }
                    this.f104852i.addAll(this.f104849d);
                    List<EmojiViewData> list6 = this.f104852i;
                    String string2 = UIHelper.getString(R.string.Lark_General_All);
                    Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(R.string.Lark_General_All)");
                    list6.add(new EmojiViewData(string2, 0));
                    m163043a(arrayList2);
                    this.f104852i.addAll(this.f104851h);
                    this.f104859p.writeLock().unlock();
                    EmojiPageAdapter2 bVar = this.f104853j;
                    if (bVar != null) {
                        bVar.resetAll(this.f104852i);
                    }
                } catch (Throwable th) {
                    this.f104859p.writeLock().unlock();
                    throw th;
                }
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        LayoutInflater layoutInflater2 = getLayoutInflater();
        Intrinsics.checkExpressionValueIsNotNull(layoutInflater2, "layoutInflater");
        Context context = layoutInflater2.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "layoutInflater.context");
        return mo148272b(context);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/emoji/v2/EmojiPageNewFragment2$SpaceItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "imageLeftMargin", "", "titleTopMargin", "titleLeftMargin", "showColumn", "(Lcom/ss/android/lark/keyboard/widget/emoji/v2/EmojiPageNewFragment2;IIII)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "keyboard-component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.keyboard.widget.emoji.v2.c$b */
    public final class SpaceItemDecoration extends RecyclerView.AbstractC1335d {

        /* renamed from: b */
        private final int f104862b;

        /* renamed from: c */
        private final int f104863c;

        /* renamed from: d */
        private final int f104864d;

        /* renamed from: e */
        private final int f104865e;

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            Integer num;
            int i;
            int i2;
            Intrinsics.checkParameterIsNotNull(rect, "outRect");
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
            Intrinsics.checkParameterIsNotNull(state, "state");
            int size = EmojiPageNewFragment2.this.f104849d.size();
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                num = Integer.valueOf(adapter.getItemCount());
            } else {
                num = null;
            }
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
            Intrinsics.checkExpressionValueIsNotNull(childViewHolder, "parent.getChildViewHolder(view)");
            if (childViewHolder.getItemViewType() == 0) {
                if (childAdapterPosition == 0) {
                    i2 = this.f104863c * 2;
                } else {
                    i2 = this.f104863c;
                }
                rect.top = i2;
                rect.left = this.f104864d;
                return;
            }
            int i3 = this.f104865e;
            if (childAdapterPosition < i3 + 1) {
                i = (childAdapterPosition - 1) % i3;
            } else {
                i = ((childAdapterPosition - size) - 2) % i3;
            }
            rect.left = (this.f104862b * i) / i3;
            int i4 = this.f104862b;
            rect.right = i4 - (((i + 1) * i4) / this.f104865e);
            if (num != null) {
                num.intValue();
                double ceil = Math.ceil(((double) ((num.intValue() - 2) - size)) / ((double) this.f104865e));
                int i5 = this.f104865e;
                if (((double) childAdapterPosition) >= (((ceil * ((double) i5)) + ((double) size)) + ((double) 2)) - ((double) i5)) {
                    rect.bottom = UIHelper.dp2px(EmojiPageNewFragment2.f104846f);
                }
            }
        }

        public SpaceItemDecoration(int i, int i2, int i3, int i4) {
            this.f104862b = i;
            this.f104863c = i2;
            this.f104864d = i3;
            this.f104865e = i4;
        }
    }
}
