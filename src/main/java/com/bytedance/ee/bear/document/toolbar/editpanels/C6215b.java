package com.bytedance.ee.bear.document.toolbar.editpanels;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7624i;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.jsbridge.IBridge;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import java.lang.ref.WeakReference;
import java.util.Stack;

/* renamed from: com.bytedance.ee.bear.document.toolbar.editpanels.b */
public class C6215b extends AbstractC1142af implements AbstractC10549e {
    private static String BIZ_UTIL_SET_PANEL_HEIGHT = "lark.biz.util.setPanelHeight";
    public C1177w<AbstractC6214a> activeEditPanel;
    private Stack<AbstractC6214a> activeEditPanelStack = new Stack<>();
    private int bottomPanelTop;
    public IBridge bridge;
    public View contentView;
    public AbstractC7624i docToolbarV2Compat;
    private C6216a keyBoardStatusChangedHandler = new C6216a(this, null);
    public int keyboardHeight;
    private WeakReference<AbstractC10550f> keyboardHeightProviderRef;
    public AbstractC6214a lastActiveEditPanel;
    private AbstractC6217b panelHeightDelegate;
    private boolean scrollWebViewWhenKeyboardHeightChange = true;
    private Runnable updateJSKeyboardStateTask = new Runnable() {
        /* class com.bytedance.ee.bear.document.toolbar.editpanels.$$Lambda$b$2Wb50okV9jR31nnWzerqZ60gKuE */

        public final void run() {
            C6215b.this.lambda$new$0$b();
        }
    };

    /* renamed from: com.bytedance.ee.bear.document.toolbar.editpanels.b$b */
    public interface AbstractC6217b {
    }

    public AbstractC6217b getPanelHeightDelegate() {
        return this.panelHeightDelegate;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.toolbar.editpanels.b$a */
    public class C6216a implements AbstractC7945d<Void> {

        /* renamed from: b */
        private AbstractC7947h f17298b;

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo25150b() {
            mo25148a(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo25149a() {
            if (C6215b.this.docToolbarV2Compat == null || !C6215b.this.docToolbarV2Compat.isShowingFunctionPanel()) {
                return false;
            }
            return true;
        }

        private C6216a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo25148a(boolean z) {
            String str;
            boolean z2;
            if (this.f17298b != null && C6215b.this.bridge != null && C6215b.this.contentView != null && C6215b.this.contentView.getRootView() != null) {
                AbstractC6214a b = C6215b.this.getActiveEditPanel().mo5927b();
                if (b != null) {
                    str = b.getPanelName();
                } else {
                    str = "editor";
                }
                int a = m25059a(z, b, C6215b.this.contentView, str);
                if (a != -1) {
                    boolean a2 = mo25149a();
                    if (C6215b.this.keyboardHeight > 0 || (!str.equals(Comment.f24093e) && b != null)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String a3 = mo25146a(str, z2);
                    JSONObject jSONObject = new JSONObject();
                    if (z) {
                        jSONObject.put("isOpenKeyboard", (Object) 0);
                    } else {
                        int i = z2 ? 1 : 0;
                        int i2 = z2 ? 1 : 0;
                        int i3 = z2 ? 1 : 0;
                        jSONObject.put("isOpenKeyboard", (Object) Integer.valueOf(i));
                        if (a2) {
                            jSONObject.put("toolbar_v2_compat", (Object) Boolean.valueOf(a2));
                        }
                    }
                    jSONObject.put("innerHeight", (Object) Integer.valueOf(a));
                    jSONObject.put("keyboardType", (Object) a3);
                    C13479a.m54764b("EditPanelsManager", "Notify js keyboard:" + jSONObject.toString() + " keyboard height:" + C6215b.this.keyboardHeight + " isShowingFunctionPanel:" + a2);
                    this.f17298b.mo17188a(jSONObject);
                    C6215b.this.lastActiveEditPanel = null;
                }
            }
        }

        /* synthetic */ C6216a(C6215b bVar, EditPanelsManager$1 editPanelsManager$1) {
            this();
        }

        /* renamed from: a */
        public void handle(Void r1, AbstractC7947h hVar) {
            this.f17298b = hVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo25146a(String str, boolean z) {
            C13479a.m54764b("EditPanelsManager", "activeEditPanel > " + C6215b.this.activeEditPanel + " type > " + str + "; last active panel > " + C6215b.this.lastActiveEditPanel);
            if (C6215b.this.lastActiveEditPanel != null) {
                String panelName = C6215b.this.lastActiveEditPanel.getPanelName();
                if (!z && str.equals("editor") && TextUtils.equals(panelName, "equation")) {
                    C13479a.m54764b("EditPanelsManager", "using hideKeyboardType " + panelName);
                    return panelName;
                }
            }
            return str;
        }

        /* renamed from: a */
        private int m25059a(boolean z, AbstractC6214a aVar, View view, String str) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i = iArr[1];
            int bottomPanelTop = C6215b.this.getBottomPanelTop(z);
            if (bottomPanelTop <= 0) {
                View findViewById = view.getRootView().findViewById(16908290);
                if (findViewById == null) {
                    return -1;
                }
                int[] iArr2 = new int[2];
                findViewById.getLocationOnScreen(iArr2);
                bottomPanelTop = findViewById.getHeight() + iArr2[1];
            }
            C13479a.m54764b("EditPanelsManager", "getWebRemainingHeight: panelTop " + bottomPanelTop);
            int i2 = bottomPanelTop - i;
            if (aVar != null) {
                int panelHeight = aVar.getPanelHeight(C6215b.this.contentView.getContext());
                if (panelHeight == 0 && "editor".equals(str)) {
                    panelHeight = C6215b.this.contentView.getContext().getResources().getDimensionPixelSize(R.dimen.toolbar_menu_height);
                }
                i2 -= panelHeight;
            } else {
                if (C6215b.this.keyboardHeight > 0) {
                    i2 -= C6215b.this.contentView.getContext().getResources().getDimensionPixelSize(R.dimen.toolbar_menu_height);
                }
                C13479a.m54775e("EditPanelsManager", "no active panel !");
            }
            return C13749l.m55749b(i2);
        }
    }

    public void forceCloseToolbarV2() {
        this.keyBoardStatusChangedHandler.mo25148a(true);
    }

    public /* synthetic */ void lambda$new$0$b() {
        this.keyBoardStatusChangedHandler.mo25150b();
    }

    public void requestUpdateWebContentHeight() {
        requestUpdateWebContentHeight(0);
    }

    public LiveData<AbstractC6214a> getActiveEditPanel() {
        if (this.activeEditPanel == null) {
            this.activeEditPanel = new C1177w<>();
        }
        return this.activeEditPanel;
    }

    public void setContentView(View view) {
        this.contentView = view;
    }

    public void setDocToolbarV2Compat(AbstractC7624i iVar) {
        this.docToolbarV2Compat = iVar;
    }

    public void setPanelHeightDelegate(AbstractC6217b bVar) {
        this.panelHeightDelegate = bVar;
    }

    public void setScrollWebViewWhenKeyboardHeightChange(boolean z) {
        this.scrollWebViewWhenKeyboardHeightChange = z;
    }

    public void attachBridge(IBridge iVar) {
        this.bridge = iVar;
        iVar.mo19349a("biz.util.onKeyboardChanged", this.keyBoardStatusChangedHandler);
    }

    public void requestNotFocus(Context context) {
        AbstractC6214a b = getActiveEditPanel().mo5927b();
        if (b != null) {
            b.requestNotFocus(context);
        }
    }

    public int getBottomPanelTop(boolean z) {
        if (z) {
            return 0;
        }
        WeakReference<AbstractC10550f> weakReference = this.keyboardHeightProviderRef;
        if (weakReference == null || weakReference.get() == null) {
            return this.bottomPanelTop;
        }
        return this.keyboardHeightProviderRef.get().mo39937k();
    }

    public void onConfigurationChanged(AbstractC10550f fVar) {
        this.bottomPanelTop = fVar.mo39937k();
        C13479a.m54764b("EditPanelsManager", "onConfigurationChanged: bottomPanelTop = " + this.bottomPanelTop);
    }

    public void requestUpdateWebContentHeight(long j) {
        C13479a.m54764b("EditPanelsManager", "requestUpdateWebContentHeight");
        C13742g.m55710c(this.updateJSKeyboardStateTask);
        C13742g.m55706a(this.updateJSKeyboardStateTask, j);
    }

    public void detachBridge(IBridge iVar) {
        this.bridge = null;
        iVar.mo19348a("biz.util.onKeyboardChanged");
        C13742g.m55710c(this.updateJSKeyboardStateTask);
        WeakReference<AbstractC10550f> weakReference = this.keyboardHeightProviderRef;
        if (weakReference != null) {
            weakReference.clear();
            this.keyboardHeightProviderRef = null;
        }
        this.activeEditPanelStack.clear();
        C1177w<AbstractC6214a> wVar = this.activeEditPanel;
        if (wVar != null) {
            wVar.mo5929b((AbstractC6214a) null);
        }
    }

    public void registerEditPanel(LifecycleOwner lifecycleOwner, AbstractC6214a aVar) {
        aVar.getActive().mo5923a(lifecycleOwner, new AbstractC1178x(aVar) {
            /* class com.bytedance.ee.bear.document.toolbar.editpanels.$$Lambda$b$Mgncw_H3GTWz0AxFrpLUl6Sok8 */
            public final /* synthetic */ AbstractC6214a f$1;

            {
                this.f$1 = r2;
            }

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C6215b.this.lambda$registerEditPanel$1$b(this.f$1, (Boolean) obj);
            }
        });
        lifecycleOwner.getLifecycle().addObserver(new EditPanelsManager$1(this, aVar));
    }

    public void setPanelHeight(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("height", (Object) Integer.valueOf(i));
        jSONObject.put("keyboardType", (Object) str);
        this.bridge.mo19350a(BIZ_UTIL_SET_PANEL_HEIGHT, jSONObject, null);
    }

    public /* synthetic */ void lambda$registerEditPanel$1$b(AbstractC6214a aVar, Boolean bool) {
        C13479a.m54772d("EditPanelsManager", "onActiveChanged:" + bool + ", " + aVar.getClass().getSimpleName());
        updateActivePanel(aVar, Boolean.TRUE.equals(bool));
    }

    public void updateActivePanel(AbstractC6214a aVar, boolean z) {
        AbstractC6214a aVar2;
        boolean z2;
        AbstractC6214a aVar3 = null;
        if (this.activeEditPanelStack.isEmpty()) {
            aVar2 = null;
        } else {
            aVar2 = this.activeEditPanelStack.peek();
        }
        this.lastActiveEditPanel = aVar2;
        if (z) {
            this.activeEditPanelStack.remove(aVar);
            this.activeEditPanelStack.push(aVar);
        } else {
            this.activeEditPanelStack.remove(aVar);
        }
        if (!this.activeEditPanelStack.isEmpty()) {
            aVar3 = this.activeEditPanelStack.peek();
        }
        C1177w wVar = (C1177w) getActiveEditPanel();
        AbstractC6214a aVar4 = (AbstractC6214a) wVar.mo5927b();
        if ((aVar4 != null || aVar3 == null) && (aVar4 == null || aVar4.equals(aVar3))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            C13479a.m54764b("EditPanelsManager", "active panel changed to :" + aVar3);
            wVar.mo5929b(aVar3);
            if (z) {
                aVar.onBecomeActive(this, aVar4);
                if (aVar4 != null) {
                    aVar4.onBecomeInactive(this, aVar);
                }
            } else {
                aVar.onBecomeInactive(this, aVar3);
            }
            requestUpdateWebContentHeight(200);
        }
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        this.keyboardHeight = i;
        this.bottomPanelTop = fVar.mo39937k();
        this.keyboardHeightProviderRef = new WeakReference<>(fVar);
        C13479a.m54764b("EditPanelsManager", "onKeyboardHeightChanged: keyboardHeight = " + i + ", bottomPanelTop = " + this.bottomPanelTop);
        if (this.scrollWebViewWhenKeyboardHeightChange) {
            requestUpdateWebContentHeight();
        }
    }
}
