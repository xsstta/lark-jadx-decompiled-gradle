package com.bytedance.ee.bear.document.selection;

import android.content.ClipboardManager;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.AbstractC5625aa;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.document.DocumentMetadata;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.EditorAbility;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground_permission_export.model.IAuditApi;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.utils.C26326z;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

public abstract class SelectionPlugin extends DocumentPlugin implements AbstractC10549e {
    private static final C8275a[] NEW_SELECTION_SUPPORT_TYPES = {C8275a.f22371d, C8275a.f22372e, C8275a.f22377j, C8275a.f22378k, C8275a.f22373f};
    private static boolean enableNewSelection;
    public String BIZ_SELECT_CLOSE_HANDLER = "window.lark.biz.util.onContextMenuClose";
    private ClipboardManager.OnPrimaryClipChangedListener clipboardListener;
    private ClipboardManager clipboardManager;
    private boolean fallbackEnable = false;
    public Runnable fallbackRunnable;
    public List<AbstractC6124a> mObservers = new ArrayList();
    private View$OnTouchListenerC6127d selectionHandleViewHelper = new View$OnTouchListenerC6127d();
    private AbstractC5625aa webViewContainer;

    public abstract void clearSelection();

    /* access modifiers changed from: protected */
    public abstract void closeActionMode();

    public abstract boolean isShowingActionMode();

    /* access modifiers changed from: protected */
    public abstract void setSelectionScrollEndRate(float f);

    /* access modifiers changed from: protected */
    public boolean shouldEnableTextIntentItems() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public static class SelectionPluginCompat extends SelectionPlugin {
        @Override // com.bytedance.ee.bear.document.selection.SelectionPlugin
        public void clearSelection() {
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.document.selection.SelectionPlugin
        public void closeActionMode() {
        }

        @Override // com.bytedance.ee.bear.document.selection.SelectionPlugin
        public boolean isShowingActionMode() {
            return false;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.document.selection.SelectionPlugin
        public void setSelectionScrollEndRate(float f) {
        }

        SelectionPluginCompat() {
        }

        @Override // com.bytedance.ee.bear.document.selection.SelectionPlugin, com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
        public /* bridge */ /* synthetic */ void onDetachFromHost(C4943e eVar) {
            SelectionPlugin.super.onDetachFromHost((C6095s) eVar);
        }

        @Override // com.bytedance.ee.bear.document.selection.SelectionPlugin, com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
        public /* bridge */ /* synthetic */ void onAttachToUIContainer(C4943e eVar, AbstractC4958n nVar) {
            SelectionPlugin.super.onAttachToUIContainer((C6095s) eVar, nVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ee.bear.browser.k, com.bytedance.ee.bear.browser.plugin.n] */
        @Override // com.bytedance.ee.bear.document.selection.SelectionPlugin, com.bytedance.ee.bear.browser.BaseWebPlugin
        public /* bridge */ /* synthetic */ void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
            SelectionPlugin.super.onDetachFromUIContainer(sVar, nVar);
        }

        @Override // com.bytedance.ee.bear.document.selection.SelectionPlugin, com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin, com.bytedance.ee.bear.browser.BaseWebPlugin
        public /* bridge */ /* synthetic */ void onDetachFromUIContainer(C4943e eVar, AbstractC4958n nVar) {
            SelectionPlugin.super.onDetachFromUIContainer((C6095s) eVar, nVar);
        }
    }

    /* access modifiers changed from: package-private */
    public ActionMode.Callback getActionModeDelegate() {
        return new ActionMode.Callback() {
            /* class com.bytedance.ee.bear.document.selection.SelectionPlugin.ActionMode$CallbackC61091 */

            public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return false;
            }

            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }

            public void onDestroyActionMode(ActionMode actionMode) {
                for (AbstractC6124a aVar : SelectionPlugin.this.mObservers) {
                    aVar.onDestroyActionMode();
                }
                SelectionPlugin.this.getWeb().mo19439b(SelectionPlugin.this.BIZ_SELECT_CLOSE_HANDLER);
            }

            public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                for (AbstractC6124a aVar : SelectionPlugin.this.mObservers) {
                    aVar.onPrepareActionMode();
                }
                return false;
            }
        };
    }

    public void auditCopyEvent() {
        String str;
        BearUrl bearUrl = getDocViewModel().getBearUrl();
        BearUrl originBearUrl = getDocViewModel().getOriginBearUrl();
        boolean isType = getDocViewModel().isType(C8275a.f22377j);
        if (bearUrl != null && originBearUrl != null) {
            IAuditApi cVar = (IAuditApi) KoinJavaComponent.m268610a(IAuditApi.class);
            C8275a d = C8275a.m34055d(bearUrl.f17446a);
            String str2 = bearUrl.f17447b;
            if (isType) {
                str = originBearUrl.f17447b;
            } else {
                str = "";
            }
            cVar.mo37703a(d, 19, str2, 0, isType ? 1 : 0, str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.selection.SelectionPlugin$a */
    public class C6111a implements AbstractC7945d {
        private C6111a() {
        }

        @Override // com.bytedance.ee.bear.jsbridge.AbstractC7948j
        public void handle(Object obj, AbstractC7947h hVar) {
            C13479a.m54764b("SelectionPlugin", "copy");
            SelectionPlugin.this.auditCopyEvent();
            SelectionPlugin.this.notifyJsCopyFinish(hVar);
            SelectionPlugin.this.getWeb().mo19435b().dispatchKeyEvent(new KeyEvent(0, 278));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.selection.SelectionPlugin$b */
    public class C6112b implements AbstractC7945d {
        private C6112b() {
        }

        @Override // com.bytedance.ee.bear.jsbridge.AbstractC7948j
        public void handle(Object obj, AbstractC7947h hVar) {
            C13479a.m54764b("SelectionPlugin", "cut");
            SelectionPlugin.this.auditCopyEvent();
            SelectionPlugin.this.getWeb().mo19435b().dispatchKeyEvent(new KeyEvent(0, 277));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.selection.SelectionPlugin$c */
    public class C6113c implements AbstractC7945d {
        private C6113c() {
        }

        @Override // com.bytedance.ee.bear.jsbridge.AbstractC7948j
        public void handle(Object obj, AbstractC7947h hVar) {
            C13479a.m54764b("SelectionPlugin", "paste");
            SelectionPlugin.this.getWeb().mo19435b().dispatchKeyEvent(new KeyEvent(0, 279));
        }
    }

    public void unregisterActionModeObserver(AbstractC6124a aVar) {
        this.mObservers.remove(aVar);
    }

    public void onDetachFromHost(C6095s sVar) {
        super.onDetachFromHost((C4943e) sVar);
        this.mObservers.clear();
    }

    public void registerActionModeObserver(AbstractC6124a aVar) {
        if (!this.mObservers.contains(aVar)) {
            this.mObservers.add(aVar);
        }
    }

    private static boolean enableNewSelection(EditorAbility vVar) {
        DocumentMetadata q = vVar.mo24602q();
        for (C8275a aVar : NEW_SELECTION_SUPPORT_TYPES) {
            if (q.isDocumentType(aVar)) {
                return true;
            }
        }
        return false;
    }

    public static SelectionPlugin create(C4943e eVar) {
        boolean enableNewSelection2 = enableNewSelection((EditorAbility) eVar.mo19551b(EditorAbility.class));
        enableNewSelection = enableNewSelection2;
        if (enableNewSelection2) {
            return new SelectionPluginNew();
        }
        if (C26326z.m95341e()) {
            return new SelectionPluginOld();
        }
        return new SelectionPluginCompat();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r0 = (android.content.ClipboardManager) getContext().getSystemService("clipboard");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void notifyJsCopyFinish(final com.bytedance.ee.bear.jsbridge.AbstractC7947h r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "clipboard"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0
            if (r0 == 0) goto L_0x0020
            android.content.ClipboardManager$OnPrimaryClipChangedListener r1 = r2.clipboardListener
            r0.removePrimaryClipChangedListener(r1)
            com.bytedance.ee.bear.document.selection.SelectionPlugin$2 r1 = new com.bytedance.ee.bear.document.selection.SelectionPlugin$2
            r1.<init>(r0, r3)
            r2.clipboardListener = r1
            r0.addPrimaryClipChangedListener(r1)
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.document.selection.SelectionPlugin.notifyJsCopyFinish(com.bytedance.ee.bear.jsbridge.h):void");
    }

    public void copyCallback(ClipboardManager clipboardManager2, AbstractC7947h hVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.valueOf(clipboardManager2.hasPrimaryClip()));
        hVar.mo17188a(jSONObject);
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        AbstractC10550f.AbstractC10551a.m43717b(getActivity()).mo39928b(this.selectionHandleViewHelper);
        sVar.mo19448b().mo19436b(this.selectionHandleViewHelper);
        this.selectionHandleViewHelper.mo24707a();
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        if (C26326z.m95341e() || enableNewSelection) {
            ClipboardManager clipboardManager2 = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager2 != null) {
                clipboardManager2.removePrimaryClipChangedListener(this.clipboardListener);
            }
            AbstractC10550f.AbstractC10551a.m43717b(getActivity()).mo39928b(this);
        }
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        this.selectionHandleViewHelper.mo24708a((DocBridgeWebViewV2) sVar.mo19448b().mo19435b());
        sVar.mo19448b().mo19422a(this.selectionHandleViewHelper);
        AbstractC10550f.AbstractC10551a.m43717b(getActivity()).mo39924a(this.selectionHandleViewHelper);
        if (C26326z.m95341e() || enableNewSelection) {
            this.webViewContainer = (AbstractC5625aa) nVar.mo19583a(R.id.webContainer);
            bindBridgeHandlerAutoUnbind("biz.navigation.handleCopyMenuClick", new C6111a());
            bindBridgeHandlerAutoUnbind("biz.navigation.handleCutMenuClick", new C6112b());
            bindBridgeHandlerAutoUnbind("biz.navigation.handlePasteMenuClick", new C6113c());
            AbstractC10550f.AbstractC10551a.m43717b(getActivity()).mo39924a(this);
            this.fallbackEnable = C4211a.m17514a().mo16536a("spacekit.mobile.doc_copy_fallback", false);
            this.clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        }
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        boolean z;
        if (C26326z.m95341e() || enableNewSelection) {
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            float dimension = (1.0f - ((((float) i) + getResources().getDimension(R.dimen.toolbar_menu_height)) / ((float) this.webViewContainer.getHeight()))) - 0.13f;
            if (!z) {
                dimension = 0.87f;
            }
            setSelectionScrollEndRate(dimension);
        }
    }
}
