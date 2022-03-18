package com.bytedance.ee.bear.middleground.calendar.plugin.toolbar;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.BaseWebPlugin;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.jsbridge.AbstractC7948j;
import com.bytedance.ee.bear.middleground.calendar.editor.WebEditorToolbar;
import com.bytedance.ee.bear.middleground.calendar.toolbar.C8929a;
import com.bytedance.ee.bear.middleground.calendar.toolbar.C8930b;
import com.bytedance.ee.bear.middleground.calendar.toolbar.ToolbarModel;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0002J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\f\u001a\u00020\tH\u0002J\u001a\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/middleground/calendar/plugin/toolbar/CalendarToolBarPlugin;", "Lcom/bytedance/ee/bear/browser/BaseWebPlugin;", "Lcom/bytedance/ee/bear/browser/WebPluginHost;", "()V", "mViewModel", "Lcom/bytedance/ee/bear/middleground/calendar/plugin/toolbar/CalendarToolbarViewModel;", "mWebEditorToolbar", "Lcom/bytedance/ee/bear/middleground/calendar/editor/WebEditorToolbar;", "ensureView", "", "onAttachToHost", "host", "registerHandler", "setToolbar", "toolbarData", "Lcom/bytedance/ee/bear/middleground/calendar/toolbar/ToolbarModel;", "jsCallback", "Lcom/bytedance/ee/bear/middleground/calendar/toolbar/ToolbarCallback;", "SetToolBarHandler", "middleground-calendar_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarToolBarPlugin extends BaseWebPlugin<C4933k> {
    public CalendarToolbarViewModel mViewModel;
    private WebEditorToolbar mWebEditorToolbar;

    private final void registerHandler() {
        bindJSHandler("biz.navigation.setToolBar", new SetToolBarHandler());
    }

    public final void ensureView() {
        AbstractC4958n uIContainer = getUIContainer();
        if (uIContainer != null) {
            View f = uIContainer.mo19601f();
            if (!(f instanceof ViewGroup)) {
                f = null;
            }
            ViewGroup viewGroup = (ViewGroup) f;
            if (viewGroup != null && this.mWebEditorToolbar == null) {
                WebEditorToolbar webEditorToolbar = new WebEditorToolbar(uIContainer.mo19593b());
                this.mWebEditorToolbar = webEditorToolbar;
                if (webEditorToolbar != null) {
                    AbstractC4931i web = getWeb();
                    Intrinsics.checkExpressionValueIsNotNull(web, "web");
                    webEditorToolbar.setCurrentWebView(web.mo19435b());
                }
                viewGroup.addView(this.mWebEditorToolbar, -1, -2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/middleground/calendar/plugin/toolbar/CalendarToolBarPlugin$SetToolBarHandler;", "Lcom/bytedance/ee/bear/jsbridge/JSHandler;", "Lcom/bytedance/ee/bear/middleground/calendar/toolbar/ToolbarModel;", "(Lcom/bytedance/ee/bear/middleground/calendar/plugin/toolbar/CalendarToolBarPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callBackFunction", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "middleground-calendar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.bear.middleground.calendar.plugin.toolbar.CalendarToolBarPlugin$a */
    public final class SetToolBarHandler implements AbstractC7948j<ToolbarModel> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public SetToolBarHandler() {
        }

        /* renamed from: a */
        public void handle(ToolbarModel toolbarModel, AbstractC7947h hVar) {
            if (toolbarModel != null) {
                CalendarToolbarViewModel aVar = CalendarToolBarPlugin.this.mViewModel;
                if (aVar != null) {
                    aVar.setToolbarCallBackFunction(hVar);
                }
                CalendarToolbarViewModel aVar2 = CalendarToolBarPlugin.this.mViewModel;
                if (aVar2 != null) {
                    aVar2.updateToolbarData(toolbarModel);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/middleground/calendar/toolbar/ToolbarModel;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.bear.middleground.calendar.plugin.toolbar.CalendarToolBarPlugin$b */
    public static final class C8926b<T> implements AbstractC1178x<ToolbarModel> {

        /* renamed from: a */
        final /* synthetic */ CalendarToolBarPlugin f24087a;

        C8926b(CalendarToolBarPlugin calendarToolBarPlugin) {
            this.f24087a = calendarToolBarPlugin;
        }

        /* renamed from: a */
        public final void onChanged(ToolbarModel toolbarModel) {
            AbstractC7947h hVar;
            this.f24087a.ensureView();
            CalendarToolBarPlugin calendarToolBarPlugin = this.f24087a;
            CalendarToolbarViewModel aVar = calendarToolBarPlugin.mViewModel;
            if (aVar != null) {
                hVar = aVar.getToolbarCallBackFunction();
            } else {
                hVar = null;
            }
            calendarToolBarPlugin.setToolbar(toolbarModel, new C8930b(hVar));
        }
    }

    public void onAttachToHost(C4933k kVar) {
        LiveData<ToolbarModel> toolbarData;
        super.onAttachToHost((C4943e) kVar);
        CalendarToolbarViewModel aVar = (CalendarToolbarViewModel) viewModel(CalendarToolbarViewModel.class);
        this.mViewModel = aVar;
        if (!(aVar == null || (toolbarData = aVar.getToolbarData()) == null)) {
            toolbarData.mo5923a(getLifecycleOwner(), new C8926b(this));
        }
        registerHandler();
    }

    public final void setToolbar(ToolbarModel toolbarModel, C8930b bVar) {
        List<ToolbarModel.ToolbarItem> list;
        boolean z;
        C8929a toolbarAdapter;
        C8929a toolbarAdapter2;
        if (toolbarModel != null) {
            list = toolbarModel.getItems();
        } else {
            list = null;
        }
        List<ToolbarModel.ToolbarItem> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            WebEditorToolbar webEditorToolbar = this.mWebEditorToolbar;
            if (!(webEditorToolbar == null || (toolbarAdapter2 = webEditorToolbar.getToolbarAdapter()) == null)) {
                toolbarAdapter2.mo70690f(list);
            }
            WebEditorToolbar webEditorToolbar2 = this.mWebEditorToolbar;
            if (!(webEditorToolbar2 == null || (toolbarAdapter = webEditorToolbar2.getToolbarAdapter()) == null)) {
                toolbarAdapter.mo70668a((BaseQuickAdapter.AbstractC20911a) new C8927c(list, bVar));
            }
            if (C10548d.m43704c(this.mWebEditorToolbar)) {
                WebEditorToolbar webEditorToolbar3 = this.mWebEditorToolbar;
                if (webEditorToolbar3 != null) {
                    webEditorToolbar3.mo34212a();
                    return;
                }
                return;
            }
            WebEditorToolbar webEditorToolbar4 = this.mWebEditorToolbar;
            if (webEditorToolbar4 != null) {
                webEditorToolbar4.mo34214b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u000128\u0010\u0002\u001a4\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005*\u000f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003¨\u0006\u00010\u0003¨\u0006\u00012\u000e\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\b0\b2\u0006\u0010\t\u001a\u00020\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "", "adapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "kotlin.jvm.PlatformType", "Lcom/chad/library/adapter/base/BaseViewHolder;", "view", "Landroid/view/View;", "position", "", "onItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.bear.middleground.calendar.plugin.toolbar.CalendarToolBarPlugin$c */
    public static final class C8927c implements BaseQuickAdapter.AbstractC20911a {

        /* renamed from: a */
        final /* synthetic */ List f24088a;

        /* renamed from: b */
        final /* synthetic */ C8930b f24089b;

        C8927c(List list, C8930b bVar) {
            this.f24088a = list;
            this.f24089b = bVar;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter.AbstractC20911a
        public final void onItemClick(BaseQuickAdapter<Object, C20923c> baseQuickAdapter, View view, int i) {
            ToolbarModel.ToolbarItem toolbarItem = (ToolbarModel.ToolbarItem) this.f24088a.get(i);
            if (toolbarItem != null) {
                this.f24089b.mo34274a(toolbarItem.getId());
            }
        }
    }
}
