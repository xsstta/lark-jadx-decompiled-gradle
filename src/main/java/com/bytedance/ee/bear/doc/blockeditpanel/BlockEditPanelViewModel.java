package com.bytedance.ee.bear.doc.blockeditpanel;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.doc.blockeditpanel.model.BlockEditPanelMenusModel;
import com.bytedance.ee.bear.document.model.toolbar.selectcolor.impl.Highlight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001,B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J.\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001aJ\u000e\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010!\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0005J\u000e\u0010#\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010$\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010%\u001a\u00020\u0015J\u000e\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u0017J\u000e\u0010(\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010)\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0005J\u0010\u0010*\u001a\u00020\u00152\b\u0010+\u001a\u0004\u0018\u00010\u0012R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007¨\u0006-"}, d2 = {"Lcom/bytedance/ee/bear/doc/blockeditpanel/BlockEditPanelViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "active", "Landroidx/lifecycle/MutableLiveData;", "", "getActive", "()Landroidx/lifecycle/MutableLiveData;", "delegate", "Lcom/bytedance/ee/bear/doc/blockeditpanel/BlockEditPanelViewModel$Delegate;", "getDelegate", "()Lcom/bytedance/ee/bear/doc/blockeditpanel/BlockEditPanelViewModel$Delegate;", "setDelegate", "(Lcom/bytedance/ee/bear/doc/blockeditpanel/BlockEditPanelViewModel$Delegate;)V", "highlight", "Lcom/bytedance/ee/bear/document/model/toolbar/selectcolor/impl/Highlight;", "getHighlight", "menuItems", "Lcom/bytedance/ee/bear/doc/blockeditpanel/model/BlockEditPanelMenusModel;", "getMenuItems", "onClickBack", "", "level", "", "onClickColorMenuItem", "backgroundItem", "Lcom/bytedance/ee/bear/document/model/toolbar/selectcolor/impl/Highlight$ColorItem;", "textItem", "clearItem", "resetItem", "onClickEditMenuItem", "menuItem", "Lcom/bytedance/ee/bear/doc/blockeditpanel/model/BlockEditPanelMenusModel$BlockEditPanelMenuItem;", "onClickHighlightItem", "isDropdown", "onClickTriangleButton", "onCloseEditPanel", "onDestroyEditPanel", "onPanelHeightChanged", "height", "onPullingDown", "setActive", "setMenuItems", "model", "Delegate", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.b */
public final class BlockEditPanelViewModel extends AbstractC1142af {
    private final C1177w<Boolean> active = new C1177w<>();
    private Delegate delegate;
    private final C1177w<Highlight> highlight = new C1177w<>();
    private final C1177w<BlockEditPanelMenusModel> menuItems = new C1177w<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J0\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0005H&J\b\u0010\u0014\u001a\u00020\u0003H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0005H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ee/bear/doc/blockeditpanel/BlockEditPanelViewModel$Delegate;", "", "onClickBack", "", "currLevel", "", "onClickColorMenuItem", "backgroundItem", "Lcom/bytedance/ee/bear/document/model/toolbar/selectcolor/impl/Highlight$ColorItem;", "textItem", "clearItem", "resetItem", "onClickMenuItem", "menuItem", "Lcom/bytedance/ee/bear/doc/blockeditpanel/model/BlockEditPanelMenusModel$BlockEditPanelMenuItem;", "isClickDropdown", "", "onClickTriangleButton", "onClosePanel", "level", "onDestroyBlockEditPanel", "onPanelHeightChanged", "height", "onPullingDown", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.b$a */
    public interface Delegate {
        /* renamed from: a */
        void mo21367a();

        /* renamed from: a */
        void mo21368a(int i);

        /* renamed from: a */
        void mo21369a(BlockEditPanelMenusModel.BlockEditPanelMenuItem blockEditPanelMenuItem, boolean z);

        /* renamed from: a */
        void mo21370a(Highlight.ColorItem colorItem, Highlight.ColorItem colorItem2, Highlight.ColorItem colorItem3, Highlight.ColorItem colorItem4);

        /* renamed from: b */
        void mo21371b(int i);

        /* renamed from: c */
        void mo21372c(int i);

        /* renamed from: d */
        void mo21373d(int i);

        /* renamed from: e */
        void mo21374e(int i);
    }

    public final C1177w<Boolean> getActive() {
        return this.active;
    }

    public final Delegate getDelegate() {
        return this.delegate;
    }

    public final C1177w<Highlight> getHighlight() {
        return this.highlight;
    }

    public final C1177w<BlockEditPanelMenusModel> getMenuItems() {
        return this.menuItems;
    }

    public final void onDestroyEditPanel() {
        setActive(false);
        Delegate aVar = this.delegate;
        if (aVar != null) {
            aVar.mo21367a();
        }
    }

    public final void setDelegate(Delegate aVar) {
        this.delegate = aVar;
    }

    public final void onClickBack(int i) {
        Delegate aVar = this.delegate;
        if (aVar != null) {
            aVar.mo21372c(i);
        }
    }

    public final void onClickTriangleButton(int i) {
        Delegate aVar = this.delegate;
        if (aVar != null) {
            aVar.mo21374e(i);
        }
    }

    public final void onCloseEditPanel(int i) {
        Delegate aVar = this.delegate;
        if (aVar != null) {
            aVar.mo21368a(i);
        }
    }

    public final void onPanelHeightChanged(int i) {
        Delegate aVar = this.delegate;
        if (aVar != null) {
            aVar.mo21371b(i);
        }
    }

    public final void onPullingDown(int i) {
        Delegate aVar = this.delegate;
        if (aVar != null) {
            aVar.mo21373d(i);
        }
    }

    public final void setMenuItems(BlockEditPanelMenusModel blockEditPanelMenusModel) {
        this.menuItems.mo5929b(blockEditPanelMenusModel);
    }

    public final void onClickEditMenuItem(BlockEditPanelMenusModel.BlockEditPanelMenuItem blockEditPanelMenuItem) {
        Intrinsics.checkParameterIsNotNull(blockEditPanelMenuItem, "menuItem");
        Delegate aVar = this.delegate;
        if (aVar != null) {
            aVar.mo21369a(blockEditPanelMenuItem, false);
        }
    }

    public final void setActive(boolean z) {
        this.active.mo5929b(Boolean.valueOf(z));
    }

    public final void onClickHighlightItem(BlockEditPanelMenusModel.BlockEditPanelMenuItem blockEditPanelMenuItem, boolean z) {
        Intrinsics.checkParameterIsNotNull(blockEditPanelMenuItem, "menuItem");
        Delegate aVar = this.delegate;
        if (aVar != null) {
            aVar.mo21369a(blockEditPanelMenuItem, z);
        }
    }

    public final void onClickColorMenuItem(Highlight.ColorItem colorItem, Highlight.ColorItem colorItem2, Highlight.ColorItem colorItem3, Highlight.ColorItem colorItem4) {
        Delegate aVar = this.delegate;
        if (aVar != null) {
            aVar.mo21370a(colorItem, colorItem2, colorItem3, colorItem4);
        }
    }
}
