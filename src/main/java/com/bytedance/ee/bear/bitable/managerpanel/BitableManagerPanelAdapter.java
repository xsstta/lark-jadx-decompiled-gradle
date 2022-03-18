package com.bytedance.ee.bear.bitable.managerpanel;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.bitable.managerpanel.BitableManagerPanelData;
import com.bytedance.ee.bear.bitable.panel.EPanelItemIcon;
import com.bytedance.ee.bear.facade.common.widget.RoundFrameLayout;
import com.chad.library.adapter.base.AbstractC20921b;
import com.chad.library.adapter.base.C20923c;
import com.chad.library.adapter.base.entity.AbstractC20929b;
import com.chad.library.adapter.base.entity.AbstractC20930c;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.C69043h;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 &2\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001&B3\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0005\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\n\u0012\u0006\u0012\u0004\u0018\u00010\b`\t¢\u0006\u0002\u0010\nJ \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u001c\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0014J \u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001f\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010\fJ\u0018\u0010!\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0014\u0010\"\u001a\u00020\u00142\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005J\u0018\u0010#\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%H\u0002R\"\u0010\u0006\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\n\u0012\u0006\u0012\u0004\u0018\u00010\b`\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelAdapter;", "Lcom/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "Lcom/chad/library/adapter/base/BaseViewHolder;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "mExpandedTableList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "(Ljava/util/List;Ljava/util/ArrayList;)V", "mOperationCallBack", "Lcom/bytedance/ee/bear/bitable/managerpanel/OperationCallBack;", "collapse", "", "position", "animate", "", "notify", "convert", "", "helper", "item", "expand", "shouldNotify", "indexOfTable", "tableId", "onTableItemWithSubClick", "blockBean", "Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelData$BlockBean;", "onTableItemWithoutSubClick", "setOperationCallBack", "operationCallBack", "updateBlockItemHolder", "updateData", "updateViewItemHolder", "viewBean", "Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelData$ViewBean;", "Companion", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.managerpanel.a */
public final class BitableManagerPanelAdapter extends AbstractC20921b<AbstractC20930c, C20923c> {

    /* renamed from: c */
    public static final Companion f14076c = new Companion(null);

    /* renamed from: a */
    public OperationCallBack f14077a;

    /* renamed from: b */
    public final ArrayList<String> f14078b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelAdapter$Companion;", "", "()V", "TAG", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.managerpanel.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo18773a(List<? extends AbstractC20930c> list) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (this.f51214t == null || this.f51214t.isEmpty()) {
            mo70690f(list);
            return;
        }
        List list2 = this.f51214t;
        ArrayList arrayList = new ArrayList();
        for (AbstractC20930c cVar : list) {
            arrayList.add(cVar);
            if (cVar instanceof BitableManagerPanelData.BlockBean) {
                BitableManagerPanelData.BlockBean blockBean = (BitableManagerPanelData.BlockBean) cVar;
                if (this.f14078b.contains(blockBean.getId())) {
                    blockBean.setExpanded(true);
                    List subItems = blockBean.getSubItems();
                    if (subItems != null) {
                        List<BitableManagerPanelData.ViewBean> list3 = subItems;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                        for (BitableManagerPanelData.ViewBean viewBean : list3) {
                            arrayList2.add(Boolean.valueOf(arrayList.add(viewBean)));
                        }
                    }
                }
            }
        }
        C1374g.C1377b a = C1374g.m6297a(new C4792e(list2, arrayList));
        Intrinsics.checkExpressionValueIsNotNull(a, "DiffUtil.calculateDiff(o…\n            }\n        })");
        a.mo7412a(this);
        this.f51214t = arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelAdapter$updateData$diffResult$1", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.managerpanel.a$e */
    public static final class C4792e extends C1374g.AbstractC1376a {

        /* renamed from: a */
        final /* synthetic */ List f14087a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f14088b;

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: a */
        public int mo7380a() {
            return this.f14087a.size();
        }

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: b */
        public int mo7382b() {
            return this.f14088b.size();
        }

        C4792e(List list, ArrayList arrayList) {
            this.f14087a = list;
            this.f14088b = arrayList;
        }

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: a */
        public boolean mo7381a(int i, int i2) {
            AbstractC20930c cVar = (AbstractC20930c) this.f14087a.get(i);
            AbstractC20930c cVar2 = (AbstractC20930c) this.f14088b.get(i2);
            if ((cVar instanceof BitableManagerPanelData.BlockBean) && (cVar2 instanceof BitableManagerPanelData.BlockBean)) {
                return Intrinsics.areEqual(((BitableManagerPanelData.BlockBean) cVar).getId(), ((BitableManagerPanelData.BlockBean) cVar2).getId());
            }
            if (!(cVar instanceof BitableManagerPanelData.ViewBean) || !(cVar2 instanceof BitableManagerPanelData.ViewBean)) {
                return false;
            }
            return Intrinsics.areEqual(((BitableManagerPanelData.ViewBean) cVar).getId(), ((BitableManagerPanelData.ViewBean) cVar2).getId());
        }

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: b */
        public boolean mo7383b(int i, int i2) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            AbstractC20930c cVar = (AbstractC20930c) this.f14087a.get(i);
            AbstractC20930c cVar2 = (AbstractC20930c) this.f14088b.get(i2);
            Integer num5 = null;
            if ((cVar instanceof BitableManagerPanelData.BlockBean) && (cVar2 instanceof BitableManagerPanelData.BlockBean)) {
                BitableManagerPanelData.BlockBean blockBean = (BitableManagerPanelData.BlockBean) cVar;
                BitableManagerPanelData.BlockBean blockBean2 = (BitableManagerPanelData.BlockBean) cVar2;
                if (TextUtils.equals(blockBean.getText(), blockBean2.getText())) {
                    String[] actions = blockBean.getActions();
                    if (actions != null) {
                        num2 = Integer.valueOf(actions.length);
                    } else {
                        num2 = null;
                    }
                    String[] actions2 = blockBean2.getActions();
                    if (actions2 != null) {
                        num3 = Integer.valueOf(actions2.length);
                    } else {
                        num3 = null;
                    }
                    if (Intrinsics.areEqual(num2, num3) && blockBean.getActive() == blockBean2.getActive()) {
                        BitableManagerPanelData.ViewBean[] views = blockBean.getViews();
                        if (views != null) {
                            num4 = Integer.valueOf(views.length);
                        } else {
                            num4 = null;
                        }
                        BitableManagerPanelData.ViewBean[] views2 = blockBean2.getViews();
                        if (views2 != null) {
                            num5 = Integer.valueOf(views2.length);
                        }
                        if (Intrinsics.areEqual(num4, num5)) {
                            return true;
                        }
                    }
                }
                return false;
            } else if (!(cVar instanceof BitableManagerPanelData.ViewBean) || !(cVar2 instanceof BitableManagerPanelData.ViewBean)) {
                return false;
            } else {
                BitableManagerPanelData.ViewBean viewBean = (BitableManagerPanelData.ViewBean) cVar;
                BitableManagerPanelData.ViewBean viewBean2 = (BitableManagerPanelData.ViewBean) cVar2;
                if (TextUtils.equals(viewBean.getText(), viewBean2.getText()) && TextUtils.equals(viewBean.getType(), viewBean2.getType())) {
                    String[] actions3 = viewBean.getActions();
                    if (actions3 != null) {
                        num = Integer.valueOf(actions3.length);
                    } else {
                        num = null;
                    }
                    String[] actions4 = viewBean2.getActions();
                    if (actions4 != null) {
                        num5 = Integer.valueOf(actions4.length);
                    }
                    if (!Intrinsics.areEqual(num, num5) || viewBean.getActive() != viewBean2.getActive()) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
        }
    }

    /* renamed from: a */
    public final void mo18771a(OperationCallBack dVar) {
        this.f14077a = dVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelAdapter$updateBlockItemHolder$3$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.managerpanel.a$c */
    public static final class View$OnClickListenerC4790c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BitableManagerPanelAdapter f14082a;

        /* renamed from: b */
        final /* synthetic */ BitableManagerPanelData.BlockBean f14083b;

        View$OnClickListenerC4790c(BitableManagerPanelAdapter aVar, BitableManagerPanelData.BlockBean blockBean) {
            this.f14082a = aVar;
            this.f14083b = blockBean;
        }

        public final void onClick(View view) {
            OperationCallBack dVar = this.f14082a.f14077a;
            if (dVar != null) {
                dVar.mo18761a(this.f14083b.getId());
            }
        }
    }

    /* renamed from: b */
    public final void mo18775b(BitableManagerPanelData.BlockBean blockBean) {
        OperationCallBack dVar = this.f14077a;
        if (dVar != null) {
            dVar.mo18762a(blockBean.getId(), null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelAdapter$updateBlockItemHolder$2$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.managerpanel.a$b */
    public static final class View$OnClickListenerC4789b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BitableManagerPanelAdapter f14080a;

        /* renamed from: b */
        final /* synthetic */ BitableManagerPanelData.BlockBean f14081b;

        View$OnClickListenerC4789b(BitableManagerPanelAdapter aVar, BitableManagerPanelData.BlockBean blockBean) {
            this.f14080a = aVar;
            this.f14081b = blockBean;
        }

        public final void onClick(View view) {
            OperationCallBack dVar = this.f14080a.f14077a;
            if (dVar != null) {
                dVar.mo18765b(this.f14081b.getId(), null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.managerpanel.a$d */
    public static final class View$OnClickListenerC4791d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BitableManagerPanelAdapter f14084a;

        /* renamed from: b */
        final /* synthetic */ boolean f14085b;

        /* renamed from: c */
        final /* synthetic */ BitableManagerPanelData.BlockBean f14086c;

        View$OnClickListenerC4791d(BitableManagerPanelAdapter aVar, boolean z, BitableManagerPanelData.BlockBean blockBean) {
            this.f14084a = aVar;
            this.f14085b = z;
            this.f14086c = blockBean;
        }

        public final void onClick(View view) {
            if (this.f14085b) {
                this.f14084a.mo18770a(this.f14086c);
            } else {
                this.f14084a.mo18775b(this.f14086c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelAdapter$updateViewItemHolder$2$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.managerpanel.a$f */
    public static final class View$OnClickListenerC4793f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BitableManagerPanelAdapter f14089a;

        /* renamed from: b */
        final /* synthetic */ BitableManagerPanelData.ViewBean f14090b;

        View$OnClickListenerC4793f(BitableManagerPanelAdapter aVar, BitableManagerPanelData.ViewBean viewBean) {
            this.f14089a = aVar;
            this.f14090b = viewBean;
        }

        public final void onClick(View view) {
            OperationCallBack dVar = this.f14089a.f14077a;
            if (dVar != null) {
                dVar.mo18765b(this.f14090b.getParentTableId(), this.f14090b.getId());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.managerpanel.a$g */
    public static final class View$OnClickListenerC4794g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BitableManagerPanelAdapter f14091a;

        /* renamed from: b */
        final /* synthetic */ BitableManagerPanelData.ViewBean f14092b;

        View$OnClickListenerC4794g(BitableManagerPanelAdapter aVar, BitableManagerPanelData.ViewBean viewBean) {
            this.f14091a = aVar;
            this.f14092b = viewBean;
        }

        public final void onClick(View view) {
            OperationCallBack dVar = this.f14091a.f14077a;
            if (dVar != null) {
                dVar.mo18762a(this.f14092b.getParentTableId(), this.f14092b.getId());
            }
        }
    }

    /* renamed from: a */
    public final int mo18769a(String str) {
        List list = this.f51214t;
        Intrinsics.checkExpressionValueIsNotNull(list, "mData");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            AbstractC20930c cVar = (AbstractC20930c) obj;
            if ((cVar instanceof BitableManagerPanelData.BlockBean) && TextUtils.equals(((BitableManagerPanelData.BlockBean) cVar).getId(), str)) {
                return i;
            }
            arrayList.add(Unit.INSTANCE);
            i = i2;
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo18770a(BitableManagerPanelData.BlockBean blockBean) {
        int a = mo18769a(blockBean.getId());
        if (a < 0) {
            return;
        }
        if (blockBean.isExpanded()) {
            mo70691g(a);
            OperationCallBack dVar = this.f14077a;
            if (dVar != null) {
                dVar.mo18766c(blockBean.getId());
                return;
            }
            return;
        }
        mo70688f(a);
        OperationCallBack dVar2 = this.f14077a;
        if (dVar2 != null) {
            dVar2.mo18764b(blockBean.getId());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BitableManagerPanelAdapter(List<? extends AbstractC20930c> list, ArrayList<String> arrayList) {
        super(list);
        Intrinsics.checkParameterIsNotNull(arrayList, "mExpandedTableList");
        this.f14078b = arrayList;
        mo70726a(1, R.layout.bitable_manager_panel_block_title_item);
        mo70726a(2, R.layout.bitable_manager_panel_view_item);
        registerAdapterDataObserver(new RecyclerView.AdapterDataObserver(this) {
            /* class com.bytedance.ee.bear.bitable.managerpanel.BitableManagerPanelAdapter.C47881 */

            /* renamed from: a */
            final /* synthetic */ BitableManagerPanelAdapter f14079a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f14079a = r1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeRemoved(int i, int i2) {
                String id;
                List b = this.f14079a.mo70673b();
                Intrinsics.checkExpressionValueIsNotNull(b, "this@BitableManagerPanelAdapter.data");
                ArrayList<String> arrayList = this.f14079a.f14078b;
                if (1 <= i2) {
                    int i3 = 1;
                    while (true) {
                        int i4 = (i + i3) - 1;
                        if (i4 < b.size()) {
                            AbstractC20930c cVar = (AbstractC20930c) b.get(i4);
                            if (!(cVar instanceof BitableManagerPanelData.BlockBean)) {
                                cVar = null;
                            }
                            BitableManagerPanelData.BlockBean blockBean = (BitableManagerPanelData.BlockBean) cVar;
                            if (!(blockBean == null || (id = blockBean.getId()) == null || !arrayList.contains(id))) {
                                arrayList.remove(id);
                            }
                        }
                        if (i3 != i2) {
                            i3++;
                        } else {
                            return;
                        }
                    }
                }
            }
        });
    }

    /* renamed from: a */
    private final void m19823a(C20923c cVar, BitableManagerPanelData.BlockBean blockBean) {
        boolean z;
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        boolean z2;
        String[] actions;
        int i5;
        boolean z3;
        int i6;
        boolean a = mo70670a((AbstractC20929b) blockBean);
        boolean active = (!a) & blockBean.getActive();
        int i7 = 0;
        if (a) {
            z = this.f14078b.contains(blockBean.getId());
        } else {
            z = false;
        }
        View view = cVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "helper.itemView");
        view.setSelected(active);
        View view2 = cVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "helper.itemView");
        Resources resources = view2.getResources();
        int i8 = R.color.text_title;
        if (active) {
            i = R.color.primary_pri_500;
        } else {
            i = R.color.text_title;
        }
        cVar.mo70743c(R.id.text_tv, resources.getColor(i));
        View b = cVar.mo70740b(R.id.tag);
        Intrinsics.checkExpressionValueIsNotNull(b, "helper.getView<View>(R.id.tag)");
        if (active) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        b.setVisibility(i2);
        ImageView imageView = (ImageView) cVar.mo70740b(R.id.icon);
        imageView.setImageResource(EPanelItemIcon.getEPanelItemIconById(blockBean.getType()).activeImageRes);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "this");
        Resources resources2 = imageView.getResources();
        if (active) {
            i3 = R.color.primary_pri_500;
        } else {
            i3 = R.color.icon_n2;
        }
        imageView.setImageTintList(ColorStateList.valueOf(resources2.getColor(i3)));
        cVar.mo70737a(R.id.text_tv, blockBean.getText());
        View view3 = cVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "helper.itemView");
        Resources resources3 = view3.getResources();
        if (active) {
            i8 = R.color.primary_pri_500;
        }
        cVar.mo70743c(R.id.text_tv, resources3.getColor(i8));
        cVar.mo70742b(R.id.arrow, a);
        View b2 = cVar.mo70740b(R.id.arrow);
        Intrinsics.checkExpressionValueIsNotNull(b2, "helper.getView<ImageView>(R.id.arrow)");
        ImageView imageView2 = (ImageView) b2;
        if (z) {
            f = 90.0f;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        imageView2.setRotation(f);
        cVar.mo70742b(R.id.divider, z);
        View view4 = cVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "helper.itemView");
        int dimensionPixelSize = view4.getResources().getDimensionPixelSize(R.dimen.bitable_manager_panel_item_margin);
        View view5 = cVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "helper.itemView");
        ViewGroup.LayoutParams layoutParams = view5.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            if (this.f51214t.indexOf(blockBean) == 0) {
                i6 = dimensionPixelSize;
            } else {
                i6 = 0;
            }
            marginLayoutParams.topMargin = i6;
        }
        if (marginLayoutParams != null) {
            if (z) {
                dimensionPixelSize = 0;
            }
            marginLayoutParams.bottomMargin = dimensionPixelSize;
        }
        View view6 = cVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view6, "helper.itemView");
        view6.setLayoutParams(marginLayoutParams);
        RoundFrameLayout roundFrameLayout = (RoundFrameLayout) cVar.mo70740b(R.id.container);
        View view7 = cVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view7, "helper.itemView");
        int dimensionPixelSize2 = view7.getResources().getDimensionPixelSize(R.dimen.bitable_manager_panel_item_radius);
        if (z) {
            i4 = 0;
        } else {
            i4 = dimensionPixelSize2;
        }
        roundFrameLayout.mo30242a(dimensionPixelSize2, dimensionPixelSize2, i4, i4);
        View b3 = cVar.mo70740b(R.id.swipe_layout);
        Intrinsics.checkExpressionValueIsNotNull(b3, "helper.getView<BitableSw…ayout>(R.id.swipe_layout)");
        BitableSwipeMenuLayout bitableSwipeMenuLayout = (BitableSwipeMenuLayout) b3;
        String[] actions2 = blockBean.getActions();
        if (actions2 != null) {
            if (actions2.length == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                z2 = true;
                bitableSwipeMenuLayout.setSwipeEnable(z2);
                View b4 = cVar.mo70740b(R.id.menu_more);
                actions = blockBean.getActions();
                if (actions == null && C69043h.m265767b(actions, "more")) {
                    i5 = 0;
                } else {
                    i5 = 8;
                }
                b4.setVisibility(i5);
                b4.setOnClickListener(new View$OnClickListenerC4789b(this, blockBean));
                View b5 = cVar.mo70740b(R.id.menu_add);
                String[] actions3 = blockBean.getActions();
                if (actions3 == null || !C69043h.m265767b(actions3, "add_view")) {
                    i7 = 8;
                }
                b5.setVisibility(i7);
                b5.setOnClickListener(new View$OnClickListenerC4790c(this, blockBean));
                cVar.mo70740b(R.id.content_container).setOnClickListener(new View$OnClickListenerC4791d(this, a, blockBean));
            }
        }
        z2 = false;
        bitableSwipeMenuLayout.setSwipeEnable(z2);
        View b42 = cVar.mo70740b(R.id.menu_more);
        actions = blockBean.getActions();
        if (actions == null) {
        }
        i5 = 8;
        b42.setVisibility(i5);
        b42.setOnClickListener(new View$OnClickListenerC4789b(this, blockBean));
        View b52 = cVar.mo70740b(R.id.menu_add);
        String[] actions32 = blockBean.getActions();
        i7 = 8;
        b52.setVisibility(i7);
        b52.setOnClickListener(new View$OnClickListenerC4790c(this, blockBean));
        cVar.mo70740b(R.id.content_container).setOnClickListener(new View$OnClickListenerC4791d(this, a, blockBean));
    }

    /* renamed from: a */
    private final void m19824a(C20923c cVar, BitableManagerPanelData.ViewBean viewBean) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        View view = cVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "helper.itemView");
        view.setSelected(viewBean.getActive());
        cVar.mo70737a(R.id.text_tv, viewBean.getText());
        View view2 = cVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "helper.itemView");
        Resources resources = view2.getResources();
        boolean active = viewBean.getActive();
        int i3 = R.color.primary_pri_500;
        if (active) {
            i = R.color.primary_pri_500;
        } else {
            i = R.color.text_title;
        }
        cVar.mo70743c(R.id.text_tv, resources.getColor(i));
        View b = cVar.mo70740b(R.id.tag);
        Intrinsics.checkExpressionValueIsNotNull(b, "helper.getView<View>(R.id.tag)");
        int i4 = 0;
        if (viewBean.getActive()) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        b.setVisibility(i2);
        ImageView imageView = (ImageView) cVar.mo70740b(R.id.icon);
        imageView.setImageResource(EPanelItemIcon.getEPanelItemIconById(viewBean.getType()).activeImageRes);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "this");
        Resources resources2 = imageView.getResources();
        if (!viewBean.getActive()) {
            i3 = R.color.icon_n2;
        }
        imageView.setImageTintList(ColorStateList.valueOf(resources2.getColor(i3)));
        RoundFrameLayout roundFrameLayout = (RoundFrameLayout) cVar.mo70740b(R.id.container);
        View view3 = cVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "helper.itemView");
        int dimensionPixelSize = view3.getResources().getDimensionPixelSize(R.dimen.bitable_manager_panel_item_margin);
        View view4 = cVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "helper.itemView");
        ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int adapterPosition = cVar.getAdapterPosition() + 1;
        if (adapterPosition >= getItemCount() || (mo70685d(adapterPosition) instanceof BitableManagerPanelData.BlockBean)) {
            View view5 = cVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view5, "helper.itemView");
            int dimensionPixelSize2 = view5.getResources().getDimensionPixelSize(R.dimen.bitable_manager_panel_item_radius);
            roundFrameLayout.mo30242a(0, 0, dimensionPixelSize2, dimensionPixelSize2);
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = dimensionPixelSize;
            }
            cVar.mo70742b(R.id.divider, false);
        } else {
            roundFrameLayout.mo30242a(0, 0, 0, 0);
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = 0;
            }
            cVar.mo70742b(R.id.divider, true);
        }
        View view6 = cVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view6, "helper.itemView");
        view6.setLayoutParams(marginLayoutParams);
        View b2 = cVar.mo70740b(R.id.swipe_layout);
        Intrinsics.checkExpressionValueIsNotNull(b2, "helper.getView<BitableSw…ayout>(R.id.swipe_layout)");
        BitableSwipeMenuLayout bitableSwipeMenuLayout = (BitableSwipeMenuLayout) b2;
        String[] actions = viewBean.getActions();
        if (actions != null) {
            if (actions.length == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                z = true;
                bitableSwipeMenuLayout.setSwipeEnable(z);
                View b3 = cVar.mo70740b(R.id.menu_more);
                String[] actions2 = viewBean.getActions();
                if (actions2 == null || !C69043h.m265767b(actions2, "more")) {
                    i4 = 8;
                }
                b3.setVisibility(i4);
                b3.setOnClickListener(new View$OnClickListenerC4793f(this, viewBean));
                cVar.mo70740b(R.id.content_container).setOnClickListener(new View$OnClickListenerC4794g(this, viewBean));
            }
        }
        z = false;
        bitableSwipeMenuLayout.setSwipeEnable(z);
        View b32 = cVar.mo70740b(R.id.menu_more);
        String[] actions22 = viewBean.getActions();
        i4 = 8;
        b32.setVisibility(i4);
        b32.setOnClickListener(new View$OnClickListenerC4793f(this, viewBean));
        cVar.mo70740b(R.id.content_container).setOnClickListener(new View$OnClickListenerC4794g(this, viewBean));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16806a(C20923c cVar, AbstractC20930c cVar2) {
        Integer num;
        if (cVar != null) {
            num = Integer.valueOf(cVar.getItemViewType());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            if (cVar2 != null) {
                m19823a(cVar, (BitableManagerPanelData.BlockBean) cVar2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.bitable.managerpanel.BitableManagerPanelData.BlockBean");
        } else if (num == null || num.intValue() != 2) {
        } else {
            if (cVar2 != null) {
                m19824a(cVar, (BitableManagerPanelData.ViewBean) cVar2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.bitable.managerpanel.BitableManagerPanelData.ViewBean");
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: a */
    public int mo18768a(int i, boolean z, boolean z2) {
        AbstractC20930c cVar = (AbstractC20930c) mo70685d(i);
        if (cVar instanceof BitableManagerPanelData.BlockBean) {
            BitableManagerPanelData.BlockBean blockBean = (BitableManagerPanelData.BlockBean) cVar;
            if (!this.f14078b.contains(blockBean.getId())) {
                this.f14078b.add(blockBean.getId());
            }
        }
        return super.mo18768a(i, z, z2);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: b */
    public int mo18774b(int i, boolean z, boolean z2) {
        AbstractC20930c cVar = (AbstractC20930c) mo70685d(i);
        if (cVar instanceof BitableManagerPanelData.BlockBean) {
            BitableManagerPanelData.BlockBean blockBean = (BitableManagerPanelData.BlockBean) cVar;
            if (this.f14078b.contains(blockBean.getId())) {
                this.f14078b.remove(blockBean.getId());
            }
        }
        return super.mo18774b(i, z, z2);
    }
}
