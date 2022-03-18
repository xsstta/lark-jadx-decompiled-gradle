package com.ss.android.lark.keyboard.plugin.tool.more;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.keyboard.ISupportForItem;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.keyboard.C40673a;
import com.ss.android.lark.keyboard.C40683h;
import com.ss.android.lark.keyboard.KeyboardScene;
import com.ss.android.lark.keyboard.hitpoint.KeyboardHitPointExtraParams;
import com.ss.android.lark.keyboard.hitpoint.KeyboardHitPointNew;
import com.ss.android.lark.keyboard.p2074c.C40679d;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.statistics.extensions.C54952a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001RB\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0019H\u0016J\u0018\u0010\u001f\u001a\u00020\u001d2\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190!H\u0016J\b\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u000eH\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020'H\u0016J\u000e\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\u001dH\u0016J\u0018\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u000203H\u0016J\u0018\u00104\u001a\u00020\u000e2\u0006\u00105\u001a\u0002032\u0006\u00106\u001a\u000207H\u0016J\u0012\u00108\u001a\u0004\u0018\u00010\u000e2\u0006\u00105\u001a\u000203H\u0016J\b\u00109\u001a\u00020\u001dH\u0016J\u0010\u0010:\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u0005H\u0016J\u0010\u0010<\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J\u0010\u0010=\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020\u0005H\u0016J\u0010\u0010?\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020\u0005H\u0016J\b\u0010A\u001a\u00020\u001dH\u0016J\b\u0010B\u001a\u00020\u001dH\u0016J\b\u0010C\u001a\u00020\u001dH\u0016J\u0010\u0010D\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020\u0005H\u0016J$\u0010F\u001a\u00020\u001d2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00190!2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00190!H\u0016J\b\u0010I\u001a\u00020\u001dH\u0002J\b\u0010J\u001a\u00020\u001dH\u0002J\u0010\u0010K\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020\bH\u0016J\u000e\u0010M\u001a\u00020\u001d2\u0006\u0010N\u001a\u00020\u0010J\u000e\u0010O\u001a\u00020\u001d2\u0006\u0010P\u001a\u00020\u0016J \u0010Q\u001a\u00020\u001d2\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001aH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006S"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/more/PlusKBPlugin;", "Lcom/ss/android/lark/chat/entity/keyboard/ISupportForItem;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/more/IPlusPluginDataAPI;", "isDarkStyle", "", "(Z)V", "mContext", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext;", "getMContext$im_keyboard_release", "()Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext;", "setMContext$im_keyboard_release", "(Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext;)V", "mIcon", "Landroid/view/View;", "mLifeCycleCallback", "Lcom/ss/android/lark/keyboard/plugin/tool/more/PlusKBPlugin$ILifeCycleCallback;", "mMoreItemsAdapter", "Lcom/ss/android/lark/keyboard/plugin/tool/more/MoreItemsAdapter;", "mMoreItemsPanel", "Lcom/ss/android/lark/keyboard/plugin/tool/more/LarkKeyBoardMorePanel;", "mOnPluginClickListener", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IPluginClickListener;", "mPlusItemList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "Lkotlin/collections/ArrayList;", "mRootView", "addPlusItem", "", "plusItem", "addPlusItemList", "plusItemList", "", "closeKeyBoard", "createIcon", "getActivity", "Landroid/app/Activity;", "getParentMsgId", "", "getRootMsgId", "getSourceFragment", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "notifySend", "onActivityResult", "requestCode", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "pluginContainer", "Landroid/view/ViewGroup;", "onCreateIcon", "parent", "notifier", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$ITouchActionNotifier;", "onCreatePluginPanel", "onDestroy", "onEnableChanged", "isEnable", "onItemChanged", "onKeyboardChanged", "shown", "onReplyModeChanged", "replyMode", "onRestart", "onStart", "onStop", "onVisibleChanged", "isVisible", "replaceItemList", "oldList", "newList", "sendKBPlusClickHitPoint", "sendKBPlusViewHitPoint", "setKeyBoardContext", "context", "setLifeCycleCallback", "callback", "setOnPluginClickListener", "listener", "sortPlusItemList", "ILifeCycleCallback", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.more.e */
public final class PlusKBPlugin implements ISupportForItem, IKeyBoardPlugin, IPlusPluginDataAPI {

    /* renamed from: a */
    public IKeyBoardPlugin.IKeyBoardContext f104199a;

    /* renamed from: b */
    public IKeyBoardPlugin.IPluginClickListener f104200b;

    /* renamed from: c */
    private View f104201c;

    /* renamed from: d */
    private LarkKeyBoardMorePanel f104202d;

    /* renamed from: e */
    private MoreItemsAdapter f104203e;

    /* renamed from: f */
    private View f104204f;

    /* renamed from: g */
    private ArrayList<IPlusItem> f104205g;

    /* renamed from: h */
    private ILifeCycleCallback f104206h;

    /* renamed from: i */
    private final boolean f104207i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/more/PlusKBPlugin$ILifeCycleCallback;", "", "onRestart", "", "onStart", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.more.e$a */
    public interface ILifeCycleCallback {
        /* renamed from: a */
        void mo147664a();

        /* renamed from: b */
        void mo147665b();
    }

    public PlusKBPlugin() {
        this(false, 1, null);
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

    @Override // com.ss.android.lark.chat.entity.keyboard.ISupportForItem
    /* renamed from: c */
    public C36516a<?> mo124329c() {
        return null;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: e */
    public void mo147301e(boolean z) {
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: j */
    public void mo147306j() {
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public boolean mo147292a(int i, Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Iterator<T> it = this.f104205g.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().mo31052a(intent, i)) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: k */
    public boolean mo147307k() {
        return IKeyBoardPlugin.C40806a.m161551a(this);
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.ISupportForItem
    /* renamed from: b */
    public Activity mo124328b() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104199a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        return bVar.mo147365B();
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.ISupportForItem
    /* renamed from: d */
    public String mo124330d() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104199a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        return bVar.mo147378r();
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.ISupportForItem
    /* renamed from: e */
    public String mo124331e() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104199a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        return bVar.mo147377q();
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.ISupportForItem
    /* renamed from: f */
    public void mo124332f() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104199a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        bVar.mo147379v();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: i */
    public void mo147305i() {
        View view = this.f104201c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        view.setSelected(false);
    }

    /* renamed from: l */
    public final IKeyBoardPlugin.IKeyBoardContext mo147662l() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104199a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        return bVar;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.ISupportForItem
    /* renamed from: a */
    public void mo124326a() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104199a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        bVar.mo147380y();
    }

    /* renamed from: n */
    private final View m162375n() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104199a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        AppCompatImageView a = C40679d.m160786a(bVar.mo147365B(), R.id.toolbox_btn_more, R.drawable.kb_more_btn_bg_selector);
        Intrinsics.checkExpressionValueIsNotNull(a, "KBViewUtil.createIconVie….kb_more_btn_bg_selector)");
        return a;
    }

    /* renamed from: o */
    private final void m162376o() {
        boolean z;
        IKeyBoardPlugin.IKeyBoardContext a = C40673a.m160697a(this);
        if (a != null) {
            String e = C40683h.m160855e(a.mo147372b());
            if (e.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                KeyboardHitPointNew.m160872a(e, C40673a.m160698a(a.mo147381z().mo146903h()));
            }
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: g */
    public void mo147303g() {
        View view = this.f104201c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        view.setSelected(true);
        Iterator<T> it = this.f104205g.iterator();
        while (it.hasNext()) {
            it.next().mo31054b(true);
        }
        ILifeCycleCallback aVar = this.f104206h;
        if (aVar != null) {
            aVar.mo147664a();
        }
        m162376o();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: h */
    public void mo147304h() {
        View view = this.f104201c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        view.setSelected(true);
        Iterator<T> it = this.f104205g.iterator();
        while (it.hasNext()) {
            it.next().mo31054b(false);
        }
        ILifeCycleCallback aVar = this.f104206h;
        if (aVar != null) {
            aVar.mo147665b();
        }
        m162376o();
    }

    /* renamed from: m */
    public final void mo147663m() {
        boolean z;
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104199a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        KeyboardScene b = bVar.mo147372b();
        if (C40683h.m160851a(b).length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            KeyboardHitPointExtraParams.Click click = KeyboardHitPointExtraParams.Click.INPUT_PLUS;
            KeyboardHitPointExtraParams.Target target = KeyboardHitPointExtraParams.Target.IM_CHAT_INPUT_PLUS_VIEW;
            IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f104199a;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            KeyboardHitPointNew.m160872a(C40683h.m160851a(b), C54952a.m213204a(click.plus(target).plus(C40673a.m160698a(bVar2.mo147381z().mo146903h())), C40683h.m160856f(b)));
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public void mo147290a(IKeyBoardPlugin.IKeyBoardContext bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "context");
        this.f104199a = bVar;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: c */
    public void mo147297c(boolean z) {
        IKeyBoardPlugin.C40806a.m161550a(this, z);
    }

    public PlusKBPlugin(boolean z) {
        this.f104207i = z;
        this.f104205g = new ArrayList<>();
    }

    /* renamed from: a */
    private final void m162374a(ArrayList<IPlusItem> arrayList) {
        CollectionsKt.sortWith(arrayList, C40976c.f104210a);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.more.e$b */
    static final class View$OnClickListenerC40975b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PlusKBPlugin f104208a;

        /* renamed from: b */
        final /* synthetic */ IKeyBoardPlugin.ITouchActionNotifier f104209b;

        View$OnClickListenerC40975b(PlusKBPlugin eVar, IKeyBoardPlugin.ITouchActionNotifier dVar) {
            this.f104208a = eVar;
            this.f104209b = dVar;
        }

        public final void onClick(View view) {
            IKeyBoardPlugin.IPluginClickListener cVar = this.f104208a.f104200b;
            if (cVar != null) {
                cVar.mo122033a();
            }
            this.f104208a.mo147663m();
            this.f104209b.mo147313a(this.f104208a);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: d */
    public void mo147299d(boolean z) {
        Iterator<T> it = this.f104205g.iterator();
        while (it.hasNext()) {
            it.next().mo31051a(z);
        }
    }

    /* renamed from: b */
    public void mo147661b(IPlusItem bVar) {
        if (bVar != null) {
            this.f104205g.add(bVar);
            bVar.mo31050a(this);
            if (this.f104203e != null) {
                m162374a(this.f104205g);
            }
            MoreItemsAdapter moreItemsAdapter = this.f104203e;
            if (moreItemsAdapter != null) {
                moreItemsAdapter.resetAll(this.f104205g);
            }
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public View mo147287a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        m162374a(this.f104205g);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.kb_plugin_more, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…ugin_more, parent, false)");
        this.f104204f = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById = inflate.findViewById(R.id.more_items_panel);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.findViewById(R.id.more_items_panel)");
        this.f104202d = (LarkKeyBoardMorePanel) findViewById;
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104199a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        MoreItemsAdapter moreItemsAdapter = new MoreItemsAdapter(bVar.mo147365B());
        this.f104203e = moreItemsAdapter;
        if (moreItemsAdapter != null) {
            moreItemsAdapter.resetAll(this.f104205g);
        }
        LarkKeyBoardMorePanel larkKeyBoardMorePanel = this.f104202d;
        if (larkKeyBoardMorePanel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMoreItemsPanel");
        }
        larkKeyBoardMorePanel.setAdapter(this.f104203e);
        View view = this.f104204f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return view;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.ISupportForItem
    /* renamed from: a */
    public void mo124327a(IPlusItem bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "plusItem");
        MoreItemsAdapter moreItemsAdapter = this.f104203e;
        if (moreItemsAdapter != null) {
            moreItemsAdapter.notifyItemChanged(bVar);
        }
    }

    /* renamed from: a */
    public final void mo147660a(IKeyBoardPlugin.IPluginClickListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f104200b = cVar;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.more.IPlusPluginDataAPI
    /* renamed from: a */
    public void mo147643a(List<? extends IPlusItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "plusItemList");
        ArrayList<IPlusItem> arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        CollectionsKt.filterNotNullTo(list, arrayList2);
        this.f104205g.addAll(arrayList2);
        for (IPlusItem bVar : arrayList) {
            bVar.mo31050a(this);
        }
        if (this.f104203e != null) {
            m162374a(this.f104205g);
        }
        MoreItemsAdapter moreItemsAdapter = this.f104203e;
        if (moreItemsAdapter != null) {
            moreItemsAdapter.resetAll(this.f104205g);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public void mo147291a(boolean z) {
        View view = this.f104201c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        view.setEnabled(z);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.more.e$c */
    public static final class C40976c<T> implements Comparator<IPlusItem> {

        /* renamed from: a */
        public static final C40976c f104210a = new C40976c();

        C40976c() {
        }

        /* renamed from: a */
        public final int compare(IPlusItem bVar, IPlusItem bVar2) {
            Intrinsics.checkParameterIsNotNull(bVar, "o1");
            Intrinsics.checkParameterIsNotNull(bVar2, "o2");
            return bVar.mo31057e() - bVar2.mo31057e();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public View mo147288a(ViewGroup viewGroup, IKeyBoardPlugin.ITouchActionNotifier dVar) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Intrinsics.checkParameterIsNotNull(dVar, "notifier");
        View n = m162375n();
        this.f104201c = n;
        if (n == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        n.setActivated(this.f104207i);
        View view = this.f104201c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        view.setOnClickListener(new View$OnClickListenerC40975b(this, dVar));
        View view2 = this.f104201c;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        return view2;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.more.IPlusPluginDataAPI
    /* renamed from: a */
    public void mo147644a(List<? extends IPlusItem> list, List<? extends IPlusItem> list2) {
        Intrinsics.checkParameterIsNotNull(list, "oldList");
        Intrinsics.checkParameterIsNotNull(list2, "newList");
        this.f104205g.removeAll(list);
        mo147643a(list2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlusKBPlugin(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
