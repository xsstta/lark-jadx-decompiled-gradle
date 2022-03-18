package com.ss.android.lark.keyboard.plugin.tool.more;

import android.app.Activity;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.keyboard.ISupportForItem;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.keyboard.p2074c.C40679d;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.utils.KBHoverUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0014H\u0016J\u0018\u0010\u001d\u001a\u00020\u001b2\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u001fH\u0016J\b\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\rH\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020%H\u0016J\u000e\u0010'\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0016J\b\u0010(\u001a\u00020\u001bH\u0016J\u0018\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u000200H\u0016J\u0018\u00101\u001a\u00020\r2\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u000204H\u0016J\u0012\u00105\u001a\u0004\u0018\u00010\r2\u0006\u00102\u001a\u000200H\u0016J\b\u00106\u001a\u00020\u001bH\u0016J\u0010\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u0005H\u0016J\u0010\u00109\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0014H\u0016J\u0010\u0010:\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020\u0005H\u0016J\u0010\u0010<\u001a\u00020\u001b2\u0006\u0010=\u001a\u00020\u0005H\u0016J\b\u0010>\u001a\u00020\u001bH\u0016J\b\u0010?\u001a\u00020\u001bH\u0016J\b\u0010@\u001a\u00020\u001bH\u0016J\u0010\u0010A\u001a\u00020\u001b2\u0006\u0010B\u001a\u00020\u0005H\u0016J$\u0010C\u001a\u00020\u001b2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00140\u001f2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00140\u001fH\u0016J\u0012\u0010F\u001a\u00020\u001b2\n\u0010G\u001a\u0006\u0012\u0002\b\u00030\u000bJ\u0010\u0010H\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020\tH\u0016J\b\u0010J\u001a\u00020\u001bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006K"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/more/PlusKBDesktopPlugin;", "Lcom/ss/android/lark/chat/entity/keyboard/ISupportForItem;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/more/IPlusPluginDataAPI;", "isDarkStyle", "", "showHoverTips", "(ZZ)V", "mContext", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext;", "mHostFragment", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "mIcon", "Landroid/view/View;", "mMoreItemsAdapter", "Lcom/ss/android/lark/keyboard/plugin/tool/more/MoreItemsAdapter;", "mMoreItemsPanel", "Lcom/ss/android/lark/keyboard/plugin/tool/more/LarkKeyBoardMorePanel;", "mPlusItemList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "Lkotlin/collections/ArrayList;", "mPopupWindow", "Lcom/ss/android/lark/keyboard/plugin/tool/more/PlusKBDesktopPopupWindow;", "mRootView", "mView", "addPlusItem", "", "plusItem", "addPlusItemList", "plusItemList", "", "closeKeyBoard", "createIcon", "getActivity", "Landroid/app/Activity;", "getParentMsgId", "", "getRootMsgId", "getSourceFragment", "notifySend", "onActivityResult", "requestCode", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "pluginContainer", "Landroid/view/ViewGroup;", "onCreateIcon", "parent", "notifier", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$ITouchActionNotifier;", "onCreatePluginPanel", "onDestroy", "onEnableChanged", "isEnable", "onItemChanged", "onKeyboardChanged", "shown", "onReplyModeChanged", "replyMode", "onRestart", "onStart", "onStop", "onVisibleChanged", "isVisible", "replaceItemList", "oldList", "newList", "setHostFragment", "hostFragment", "setKeyBoardContext", "context", "showPopupWindow", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.more.c */
public final class PlusKBDesktopPlugin implements ISupportForItem, IKeyBoardPlugin, IPlusPluginDataAPI {

    /* renamed from: a */
    public final boolean f104176a;

    /* renamed from: b */
    private IKeyBoardPlugin.IKeyBoardContext f104177b;

    /* renamed from: c */
    private View f104178c;

    /* renamed from: d */
    private View f104179d;

    /* renamed from: e */
    private MoreItemsAdapter f104180e;

    /* renamed from: f */
    private ArrayList<IPlusItem> f104181f;

    /* renamed from: g */
    private C40973d f104182g;

    /* renamed from: h */
    private C36516a<?> f104183h;

    /* renamed from: i */
    private final boolean f104184i;

    public PlusKBDesktopPlugin() {
        this(false, false, 3, null);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public View mo147287a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return null;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: b */
    public void mo147294b(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "pluginContainer");
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: b */
    public void mo147295b(boolean z) {
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: e */
    public void mo147301e(boolean z) {
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: j */
    public void mo147306j() {
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.ISupportForItem
    /* renamed from: c */
    public C36516a<?> mo124329c() {
        return this.f104183h;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: k */
    public boolean mo147307k() {
        return IKeyBoardPlugin.C40806a.m161551a(this);
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.ISupportForItem
    /* renamed from: a */
    public void mo124326a() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104177b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        bVar.mo147380y();
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.ISupportForItem
    /* renamed from: b */
    public Activity mo124328b() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104177b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        return bVar.mo147365B();
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.ISupportForItem
    /* renamed from: d */
    public String mo124330d() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104177b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        return bVar.mo147378r();
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.ISupportForItem
    /* renamed from: e */
    public String mo124331e() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104177b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        return bVar.mo147377q();
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.ISupportForItem
    /* renamed from: f */
    public void mo124332f() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104177b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        bVar.mo147379v();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: i */
    public void mo147305i() {
        View view = this.f104179d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        view.setSelected(false);
    }

    /* renamed from: m */
    private final View m162318m() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104177b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        AppCompatImageView a = C40679d.m160786a(bVar.mo147365B(), R.id.toolbox_btn_more, R.drawable.kb_ic_svg_chat_menu_more_normal);
        Intrinsics.checkExpressionValueIsNotNull(a, "KBViewUtil.createIconVie…vg_chat_menu_more_normal)");
        return a;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: g */
    public void mo147303g() {
        View view = this.f104179d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        view.setSelected(true);
        Iterator<T> it = this.f104181f.iterator();
        while (it.hasNext()) {
            it.next().mo31054b(true);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: h */
    public void mo147304h() {
        View view = this.f104179d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        view.setSelected(true);
        Iterator<T> it = this.f104181f.iterator();
        while (it.hasNext()) {
            it.next().mo31054b(false);
        }
    }

    /* renamed from: l */
    public final void mo147653l() {
        C40973d dVar = this.f104182g;
        if (dVar != null) {
            if (dVar != null) {
                dVar.dismiss();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.PopupWindow");
            }
        }
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104177b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        C40973d dVar2 = new C40973d(bVar.mo147365B(), this.f104181f);
        this.f104182g = dVar2;
        if (dVar2 != null) {
            View view = this.f104179d;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIcon");
            }
            dVar2.mo147657b(view);
        }
        C40973d dVar3 = this.f104182g;
        if (dVar3 != null) {
            View view2 = this.f104179d;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIcon");
            }
            dVar3.mo147656a(view2);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: c */
    public void mo147297c(boolean z) {
        IKeyBoardPlugin.C40806a.m161550a(this, z);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.more.c$a */
    public static final class View$OnClickListenerC40970a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PlusKBDesktopPlugin f104185a;

        View$OnClickListenerC40970a(PlusKBDesktopPlugin cVar) {
            this.f104185a = cVar;
        }

        public final void onClick(View view) {
            KBHoverUtil.f103302a.mo146863a(new Function0<Unit>(this) {
                /* class com.ss.android.lark.keyboard.plugin.tool.more.PlusKBDesktopPlugin.View$OnClickListenerC40970a.C409711 */
                final /* synthetic */ View$OnClickListenerC40970a this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final void invoke() {
                    this.this$0.f104185a.mo147653l();
                }
            });
        }
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.ISupportForItem
    /* renamed from: a */
    public void mo124327a(IPlusItem bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "plusItem");
        MoreItemsAdapter moreItemsAdapter = this.f104180e;
        if (moreItemsAdapter != null) {
            moreItemsAdapter.notifyItemChanged(bVar);
        }
    }

    /* renamed from: b */
    public void mo147652b(IPlusItem bVar) {
        if (bVar != null) {
            this.f104181f.add(bVar);
            bVar.mo31050a(this);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: d */
    public void mo147299d(boolean z) {
        Iterator<T> it = this.f104181f.iterator();
        while (it.hasNext()) {
            it.next().mo31051a(z);
        }
    }

    /* renamed from: a */
    public final void mo147651a(C36516a<?> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "hostFragment");
        this.f104183h = aVar;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public void mo147290a(IKeyBoardPlugin.IKeyBoardContext bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "context");
        this.f104177b = bVar;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.more.IPlusPluginDataAPI
    /* renamed from: a */
    public void mo147643a(List<? extends IPlusItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "plusItemList");
        ArrayList<IPlusItem> arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        CollectionsKt.filterNotNullTo(list, arrayList2);
        this.f104181f.addAll(arrayList2);
        for (IPlusItem bVar : arrayList) {
            bVar.mo31050a(this);
        }
        MoreItemsAdapter moreItemsAdapter = this.f104180e;
        if (moreItemsAdapter != null) {
            moreItemsAdapter.notifyDataSetChanged();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public void mo147291a(boolean z) {
        View view = this.f104179d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        view.setEnabled(z);
    }

    public PlusKBDesktopPlugin(boolean z, boolean z2) {
        this.f104184i = z;
        this.f104176a = z2;
        this.f104181f = new ArrayList<>();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onHover"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.more.c$b */
    static final class View$OnHoverListenerC40972b implements View.OnHoverListener {

        /* renamed from: a */
        final /* synthetic */ PlusKBDesktopPlugin f104186a;

        View$OnHoverListenerC40972b(PlusKBDesktopPlugin cVar) {
            this.f104186a = cVar;
        }

        public final boolean onHover(View view, MotionEvent motionEvent) {
            Intrinsics.checkExpressionValueIsNotNull(view, "v");
            String string = UIUtils.getString(view.getContext(), R.string.Lark_Legacy_LarkMore);
            KBHoverUtil bVar = KBHoverUtil.f103302a;
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            if (!this.f104186a.f104176a) {
                string = null;
            }
            return bVar.mo146864a(view, motionEvent, string);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public View mo147288a(ViewGroup viewGroup, IKeyBoardPlugin.ITouchActionNotifier dVar) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Intrinsics.checkParameterIsNotNull(dVar, "notifier");
        View m = m162318m();
        this.f104178c = m;
        if (m == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        View findViewById = m.findViewById(R.id.toolbox_btn_more);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mView.findViewById<AppCo…w>(R.id.toolbox_btn_more)");
        this.f104179d = findViewById;
        if (findViewById == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        findViewById.setActivated(this.f104184i);
        View view = this.f104178c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        view.setOnClickListener(new View$OnClickListenerC40970a(this));
        View view2 = this.f104178c;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        view2.setOnHoverListener(new View$OnHoverListenerC40972b(this));
        View view3 = this.f104178c;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        return view3;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.more.IPlusPluginDataAPI
    /* renamed from: a */
    public void mo147644a(List<? extends IPlusItem> list, List<? extends IPlusItem> list2) {
        Intrinsics.checkParameterIsNotNull(list, "oldList");
        Intrinsics.checkParameterIsNotNull(list2, "newList");
        this.f104181f.removeAll(list);
        mo147643a(list2);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public boolean mo147292a(int i, Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Iterator<T> it = this.f104181f.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().mo31052a(intent, i)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlusKBDesktopPlugin(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2);
    }
}
