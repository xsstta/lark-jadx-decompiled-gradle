package com.ss.android.lark.mine.impl.index.v2.list;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.framework.larkwidget.WidgetManager;
import com.ss.android.lark.mine.impl.index.v2.ICommonWidget;
import com.ss.android.lark.mine.impl.index.v2.list.base.IAsyncSubComponent;
import com.ss.android.lark.mine.impl.index.v2.list.base.ISubComponent;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0001 B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0014\u001a\u00020\u0015J\u0012\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\u0015J\u0006\u0010\u001a\u001a\u00020\u0015J\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0011J\u0006\u0010\u001d\u001a\u00020\u0015J\u000e\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\nR\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f¨\u0006!"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/SubComponentManager;", "", "host", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "mContainer", "Landroid/widget/LinearLayout;", "(Lcom/ss/android/lark/framework/larkwidget/Widget;Landroid/widget/LinearLayout;)V", "asyncObserver", "Lcom/ss/android/lark/mine/impl/index/v2/list/base/IAsyncSubComponent$IAsyncObserver;", "height", "", "getHeight", "()I", "getHost", "()Lcom/ss/android/lark/framework/larkwidget/Widget;", "map", "", "Lcom/ss/android/lark/mine/impl/index/v2/list/base/ISubComponent;", "width", "getWidth", "appendList", "", "appendListAsync", "content", "Landroid/view/ViewGroup;", "destroy", "onShow", "registerSubComponent", "component", "reload", "unRegisterSubComponent", "sidebarType", "Companion", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.index.v2.list.a */
public final class SubComponentManager {

    /* renamed from: a */
    public static final Integer[] f115354a = {0, 1008, 1000, Integer.valueOf((int) CommonCode.StatusCode.API_CLIENT_EXPIRED), 1002, 1004, 1005, 1006, 1007, 1};

    /* renamed from: b */
    public static final Companion f115355b = new Companion(null);

    /* renamed from: c */
    private final int f115356c = -1;

    /* renamed from: d */
    private final int f115357d;

    /* renamed from: e */
    private final Map<Integer, ISubComponent> f115358e;

    /* renamed from: f */
    private final IAsyncSubComponent.IAsyncObserver f115359f;

    /* renamed from: g */
    private final Widget f115360g;

    /* renamed from: h */
    private final LinearLayout f115361h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/SubComponentManager$Companion;", "", "()V", "DESKTOP_ITEM_HEIGHT", "", "PHONE_ITEM_HEIGHT", "sequence", "", "getSequence", "()[Ljava/lang/Integer;", "[Ljava/lang/Integer;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo160823b() {
        for (Map.Entry<Integer, ISubComponent> entry : this.f115358e.entrySet()) {
            ISubComponent value = entry.getValue();
            if (value instanceof IAsyncSubComponent) {
                ((IAsyncSubComponent) value).mo160834b(this.f115359f);
            }
        }
        this.f115358e.clear();
    }

    /* renamed from: c */
    public final void mo160824c() {
        for (Map.Entry<Integer, ISubComponent> entry : this.f115358e.entrySet()) {
            ISubComponent value = entry.getValue();
            if (value instanceof ICommonWidget) {
                ((ICommonWidget) value).ba_();
            }
        }
    }

    /* renamed from: d */
    public final void mo160825d() {
        for (Map.Entry<Integer, ISubComponent> entry : this.f115358e.entrySet()) {
            ISubComponent value = entry.getValue();
            if (value instanceof ICommonWidget) {
                ((ICommonWidget) value).bb_();
            }
        }
    }

    /* renamed from: a */
    public final void mo160820a() {
        View h;
        for (Integer num : f115354a) {
            ISubComponent iSubComponent = this.f115358e.get(Integer.valueOf(num.intValue()));
            if (iSubComponent != null && !(iSubComponent instanceof IAsyncSubComponent) && (h = iSubComponent.mo160836h()) != null && h.getParent() == null) {
                this.f115361h.addView(h, new LinearLayout.LayoutParams(this.f115356c, this.f115357d));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/list/SubComponentManager$asyncObserver$1", "Lcom/ss/android/lark/mine/impl/index/v2/list/base/IAsyncSubComponent$IAsyncObserver;", "onAsyncReady", "", "contentView", "Landroid/view/ViewGroup;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.a$b */
    public static final class C45685b implements IAsyncSubComponent.IAsyncObserver {

        /* renamed from: a */
        final /* synthetic */ SubComponentManager f115362a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45685b(SubComponentManager aVar) {
            this.f115362a = aVar;
        }

        @Override // com.ss.android.lark.mine.impl.index.v2.list.base.IAsyncSubComponent.IAsyncObserver
        /* renamed from: a */
        public void mo160826a(ViewGroup viewGroup) {
            this.f115362a.mo160821a(viewGroup);
        }
    }

    /* renamed from: a */
    public final void mo160822a(ISubComponent iSubComponent) {
        Intrinsics.checkParameterIsNotNull(iSubComponent, "component");
        WidgetManager.f99047e.mo141220a(this.f115360g).mo141214a((Widget) iSubComponent);
        this.f115358e.put(Integer.valueOf(iSubComponent.mo160827a()), iSubComponent);
        if (iSubComponent instanceof IAsyncSubComponent) {
            ((IAsyncSubComponent) iSubComponent).mo160833a(this.f115359f);
        }
    }

    /* renamed from: a */
    public final void mo160821a(ViewGroup viewGroup) {
        View h;
        if (viewGroup != null && viewGroup.getParent() == null) {
            this.f115361h.removeAllViews();
            for (Integer num : f115354a) {
                ISubComponent iSubComponent = this.f115358e.get(Integer.valueOf(num.intValue()));
                if (!(iSubComponent == null || (h = iSubComponent.mo160836h()) == null || h.getParent() != null)) {
                    this.f115361h.addView(h, new LinearLayout.LayoutParams(this.f115356c, this.f115357d));
                }
            }
        }
    }

    public SubComponentManager(Widget widget, LinearLayout linearLayout) {
        int i;
        Intrinsics.checkParameterIsNotNull(widget, "host");
        Intrinsics.checkParameterIsNotNull(linearLayout, "mContainer");
        this.f115360g = widget;
        this.f115361h = linearLayout;
        if (DesktopUtil.m144301a(linearLayout.getContext())) {
            i = UIUtils.dp2px(linearLayout.getContext(), (float) 48);
        } else {
            i = UIUtils.dp2px(linearLayout.getContext(), (float) 56);
        }
        this.f115357d = i;
        this.f115358e = new HashMap();
        this.f115359f = new C45685b(this);
    }
}
