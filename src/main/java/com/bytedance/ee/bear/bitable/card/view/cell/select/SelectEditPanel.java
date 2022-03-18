package com.bytedance.ee.bear.bitable.card.view.cell.select;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ee.bear.bitable.card.model.enums.EFieldType;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.common.ColorBean;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.common.RandomColorResult;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4530e;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a;
import com.bytedance.ee.bear.bitable.card.view.cell.CellEditDragView;
import com.bytedance.ee.bear.bitable.card.view.cell.select.C4655h;
import com.bytedance.ee.bear.bitable.card.view.cell.select.OptionCreationPanel;
import com.bytedance.ee.bear.bitable.card.view.cell.select.OptionMoreOperationPanel;
import com.bytedance.ee.bear.widgets.C11811a;
import com.bytedance.ee.bear.widgets.panel.InterceptTouchRecyclerView;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0002NOB%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ \u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u0006H\u0002J\b\u0010+\u001a\u00020'H\u0002J\b\u0010,\u001a\u00020'H\u0016J\b\u0010-\u001a\u00020'H\u0002J\b\u0010.\u001a\u00020'H\u0002J\b\u0010/\u001a\u00020'H\u0002J\u0012\u00100\u001a\u0004\u0018\u0001012\u0006\u0010(\u001a\u00020\u0010H\u0002J\u0010\u00102\u001a\u0002032\u0006\u0010\u0003\u001a\u00020\u0004H\u0014J\u0006\u00104\u001a\u000205J\b\u00106\u001a\u00020'H\u0002J\b\u00107\u001a\u00020'H\u0002J\u0010\u00108\u001a\u00020'2\u0006\u00109\u001a\u00020\u001fH\u0016J\u0010\u0010:\u001a\u00020'2\u0006\u0010;\u001a\u00020\u0006H\u0016J\u0018\u0010<\u001a\u00020'2\u0006\u0010=\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u0006H\u0016J\u0010\u0010>\u001a\u00020'2\u0006\u0010?\u001a\u000201H\u0016J\u0018\u0010@\u001a\u00020'2\u0006\u0010A\u001a\u00020\u00102\u0006\u0010B\u001a\u00020\u001fH\u0002J\u0010\u0010C\u001a\u00020'2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u000e\u0010D\u001a\u00020'2\u0006\u0010E\u001a\u00020\u0014J \u0010F\u001a\u00020'2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u000e\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0019J\u001a\u0010H\u001a\u00020'2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010I\u001a\u0004\u0018\u00010\u0010J\b\u0010J\u001a\u00020'H\u0016J\b\u0010K\u001a\u00020'H\u0002J\u0010\u0010L\u001a\u00020'2\u0006\u0010?\u001a\u000201H\u0002J\b\u0010M\u001a\u00020'H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X.¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000¨\u0006P"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/select/SelectEditPanel;", "Lcom/bytedance/ee/bear/bitable/card/view/cell/BaseCellEditPanel;", "Lcom/bytedance/ee/bear/bitable/card/view/cell/select/SelectEditAdapter$ActionListener;", "context", "Landroid/content/Context;", "enableEditOptionAttrs", "", "commonColorList", "", "Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/common/ColorBean;", "(Landroid/content/Context;Z[Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/common/ColorBean;)V", "analyticDelegate", "Lcom/bytedance/ee/bear/bitable/card/view/cell/select/BitableSelectFieldAnalyticDelegate;", "[Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/common/ColorBean;", "curMultiCheckedOptionIds", "", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/field/OptionField;", "dataRequestListener", "Lcom/bytedance/ee/bear/bitable/card/view/cell/select/SelectEditPanel$DataRequestListener;", "fetchRandomColorIdDisposable", "Lio/reactivex/disposables/Disposable;", "isInSearchMode", "multiSelectedOptionIds", "", "optionCreationPanel", "Lcom/bytedance/ee/bear/bitable/card/view/cell/select/OptionCreationPanel;", "optionMoreOperationPanel", "Lcom/bytedance/ee/bear/bitable/card/view/cell/select/OptionMoreOperationPanel;", "randomColorId", "", "scrollPosition", "selectEditAdapter", "Lcom/bytedance/ee/bear/bitable/card/view/cell/select/SelectEditAdapter;", "singleSelectedOptionId", ShareHitPoint.f121869d, "Lcom/bytedance/ee/bear/bitable/card/model/enums/EFieldType;", "addNewOption", "", "optionContent", "optionColorId", "isChecked", "adjustEmptyViewPositionIfNeed", "dismiss", "enterSearchMode", "exitSearchMode", "fetchRandomColorId", "findAvailableOption", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/field/OptionField$OptionEntity;", "getContentView", "Landroid/view/View;", "getDragView", "Lcom/bytedance/ee/bear/bitable/card/view/cell/CellEditDragView;", "initSearchModeWatcher", "initView", "notifyKeyboardHeightChanged", "keyboardHeight", "notifySearchKeywordResult", "isResultEmpty", "notifySelectedItemsChanged", "optionId", "onMoreOperationClicked", "optionEntity", "reportEditOperation", "fieldType", "itemChangeNum", "setAnalyticDelegate", "setDataRequestListener", "listener", "setMultiSelectData", "selectedOptionIds", "setSingleSelectData", "selectedOptionId", "show", "showOptionCreationPanel", "showOptionModifyPanel", "updateView", "Companion", "DataRequestListener", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.i */
public final class SelectEditPanel extends AbstractC4565a implements C4655h.AbstractC4656a {

    /* renamed from: m */
    public static final Companion f13768m = new Companion(null);

    /* renamed from: f */
    public C4655h f13769f;

    /* renamed from: g */
    public int f13770g;

    /* renamed from: h */
    public DataRequestListener f13771h;

    /* renamed from: i */
    public int f13772i;

    /* renamed from: j */
    public BitableSelectFieldAnalyticDelegate f13773j;

    /* renamed from: k */
    public final boolean f13774k;

    /* renamed from: l */
    public final ColorBean[] f13775l;

    /* renamed from: n */
    private EFieldType f13776n;

    /* renamed from: o */
    private C4530e f13777o;

    /* renamed from: p */
    private String f13778p;

    /* renamed from: q */
    private List<String> f13779q;

    /* renamed from: r */
    private final List<String> f13780r = new ArrayList();

    /* renamed from: s */
    private boolean f13781s;

    /* renamed from: t */
    private OptionCreationPanel f13782t;

    /* renamed from: u */
    private OptionMoreOperationPanel f13783u;

    /* renamed from: v */
    private Disposable f13784v;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\"\u0010\u000f\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0007H&¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/select/SelectEditPanel$DataRequestListener;", "", "onAddNewOption", "", "optionContent", "", "optionColorId", "", "isChecked", "", "onDeleteOption", "optionId", "onFetchRandomColorId", "Lio/reactivex/Single;", "Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/common/RandomColorResult;", "onModifyOption", "newOptionContent", "newOptionColorId", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.i$b */
    public interface DataRequestListener {
        /* renamed from: a */
        Single<RandomColorResult> mo18257a();

        /* renamed from: a */
        void mo18258a(String str);

        /* renamed from: a */
        void mo18259a(String str, int i, boolean z);

        /* renamed from: a */
        void mo18260a(String str, String str2, int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/select/SelectEditPanel$Companion;", "", "()V", "TAG", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo18309a(C4530e eVar, List<String> list) {
        this.f13776n = EFieldType.MULTI_SELECT;
        this.f13777o = eVar;
        this.f13779q = list;
        this.f13780r.clear();
        if (list != null) {
            this.f13780r.addAll(list);
        }
        List<C4530e.C4531a> list2 = null;
        List<Integer> b = eVar != null ? eVar.mo17730b(list) : null;
        int i = 0;
        if (b != null && b.size() > 0) {
            Integer num = b.get(0);
            Intrinsics.checkExpressionValueIsNotNull(num, "selectedPositions[0]");
            i = num.intValue();
        }
        this.f13770g = i;
        C4655h hVar = this.f13769f;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectEditAdapter");
        }
        if (eVar != null) {
            list2 = eVar.mo17727a();
        }
        hVar.mo18301a(list2, b);
        C4655h hVar2 = this.f13769f;
        if (hVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectEditAdapter");
        }
        hVar2.notifyDataSetChanged();
        m19366o();
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.select.C4655h.AbstractC4656a
    /* renamed from: a */
    public void mo18303a(String str, boolean z) {
        EFieldType eFieldType;
        Intrinsics.checkParameterIsNotNull(str, "optionId");
        if (this.f13459c != null && (eFieldType = this.f13776n) != null) {
            int i = C4675j.f13805a[eFieldType.ordinal()];
            int i2 = 1;
            if (i == 1) {
                if (!z) {
                    str = null;
                }
                int i3 = (!TextUtils.isEmpty(str) ? 1 : 0) - (!TextUtils.isEmpty(this.f13778p) ? 1 : 0);
                this.f13459c.mo17986a(str);
                m19363a("singleSelect", i3);
                mo17978b();
            } else if (i == 2) {
                if (!z) {
                    this.f13780r.remove(str);
                } else if (!this.f13780r.contains(str)) {
                    this.f13780r.add(str);
                }
                this.f13459c.mo17986a(this.f13780r);
                if (!z) {
                    i2 = -1;
                }
                m19363a("multiSelect", i2);
            }
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.select.C4655h.AbstractC4656a
    /* renamed from: a */
    public void mo18304a(boolean z) {
        View view = this.f13458b;
        InterceptTouchRecyclerView interceptTouchRecyclerView = (InterceptTouchRecyclerView) view.findViewById(R.id.recyclerView);
        Intrinsics.checkExpressionValueIsNotNull(interceptTouchRecyclerView, "recyclerView");
        int i = 8;
        interceptTouchRecyclerView.setVisibility(z ? 8 : 0);
        SpaceEmptyState spaceEmptyState = (SpaceEmptyState) view.findViewById(R.id.emptyView);
        Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState, "emptyView");
        if (z) {
            i = 0;
        }
        spaceEmptyState.setVisibility(i);
        if (z) {
            ((SpaceEmptyState) view.findViewById(R.id.emptyView)).setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_neutral_search_failed));
            ((SpaceEmptyState) view.findViewById(R.id.emptyView)).setDesc(view.getResources().getString(R.string.Bitable_Option_NoOptionFound));
        }
        mo18174i();
    }

    /* renamed from: a */
    public final void mo18312a(String str, int i, boolean z) {
        DataRequestListener bVar = this.f13771h;
        if (bVar != null) {
            bVar.mo18259a(str, i, z);
        }
        View view = this.f13458b;
        Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
        ((EditText) view.findViewById(R.id.searchEditText)).setText("");
        if (this.f13776n != EFieldType.SINGLE_SELECT || !z) {
            View view2 = this.f13458b;
            Intrinsics.checkExpressionValueIsNotNull(view2, "contentView");
            ((InterceptTouchRecyclerView) view2.findViewById(R.id.recyclerView)).scrollToPosition(0);
            return;
        }
        mo17978b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005¸\u0006\u0000"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/select/SelectEditPanel$onMoreOperationClicked$1$1", "Lcom/bytedance/ee/bear/bitable/card/view/cell/select/OptionMoreOperationPanel$OperationListener;", "onClickDeleteItem", "", "onClickModifyItem", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.i$l */
    public static final class C4669l implements OptionMoreOperationPanel.OperationListener {

        /* renamed from: a */
        final /* synthetic */ SelectEditPanel f13797a;

        /* renamed from: b */
        final /* synthetic */ C4530e.C4531a f13798b;

        @Override // com.bytedance.ee.bear.bitable.card.view.cell.select.OptionMoreOperationPanel.OperationListener
        /* renamed from: a */
        public void mo18281a() {
            this.f13797a.mo18313b(this.f13798b);
        }

        @Override // com.bytedance.ee.bear.bitable.card.view.cell.select.OptionMoreOperationPanel.OperationListener
        /* renamed from: b */
        public void mo18282b() {
            C11811a a = C11811a.m48976a(this.f13797a.mo17981e());
            a.mo45214a(R.string.Bitable_Option_ConfirmToDelete);
            a.mo45225b(R.string.Bitable_Common_ButtonDelete, new View.OnClickListener(this) {
                /* class com.bytedance.ee.bear.bitable.card.view.cell.select.SelectEditPanel.C4669l.View$OnClickListenerC46701 */

                /* renamed from: a */
                final /* synthetic */ C4669l f13799a;

                {
                    this.f13799a = r1;
                }

                public final void onClick(View view) {
                    DataRequestListener bVar = this.f13799a.f13797a.f13771h;
                    if (bVar != null) {
                        bVar.mo18258a(this.f13799a.f13798b.mo17731a());
                    }
                    BitableSelectFieldAnalyticDelegate bVar2 = this.f13799a.f13797a.f13773j;
                    if (bVar2 != null) {
                        bVar2.mo18249a("ccm_bitable_option_field_delete_click", "delete");
                    }
                }
            });
            a.mo45218a(new View.OnClickListener(this) {
                /* class com.bytedance.ee.bear.bitable.card.view.cell.select.SelectEditPanel.C4669l.View$OnClickListenerC46712 */

                /* renamed from: a */
                final /* synthetic */ C4669l f13800a;

                {
                    this.f13800a = r1;
                }

                public final void onClick(View view) {
                    BitableSelectFieldAnalyticDelegate bVar = this.f13800a.f13797a.f13773j;
                    if (bVar != null) {
                        bVar.mo18249a("ccm_bitable_option_field_delete_click", "cancel");
                    }
                }
            });
            a.mo45231c();
            BitableSelectFieldAnalyticDelegate bVar = this.f13797a.f13773j;
            if (bVar != null) {
                bVar.mo18254d("ccm_bitable_option_field_delete_view");
            }
        }

        C4669l(SelectEditPanel iVar, C4530e.C4531a aVar) {
            this.f13797a = iVar;
            this.f13798b = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.i$m */
    public static final class RunnableC4672m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SelectEditPanel f13801a;

        RunnableC4672m(SelectEditPanel iVar) {
            this.f13801a = iVar;
        }

        public final void run() {
            View view = this.f13801a.f13458b;
            Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
            ((InterceptTouchRecyclerView) view.findViewById(R.id.recyclerView)).scrollToPosition(this.f13801a.f13770g);
        }
    }

    /* renamed from: p */
    private final void m19367p() {
        Disposable disposable;
        Single<RandomColorResult> a;
        DataRequestListener bVar = this.f13771h;
        if (bVar == null || (a = bVar.mo18257a()) == null) {
            disposable = null;
        } else {
            disposable = a.subscribe(new C4660c(this), C4661d.f13786a);
        }
        this.f13784v = disposable;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a
    /* renamed from: b */
    public void mo17978b() {
        super.mo17978b();
        mo18315k();
        Disposable disposable = this.f13784v;
        if (disposable != null) {
            disposable.dispose();
        }
        OptionCreationPanel dVar = this.f13782t;
        if (dVar != null) {
            dVar.mo17978b();
        }
        OptionMoreOperationPanel eVar = this.f13783u;
        if (eVar != null) {
            eVar.mo17978b();
        }
    }

    /* renamed from: h */
    public final CellEditDragView mo18173h() {
        View view = this.f13458b;
        Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
        CellEditDragView cellEditDragView = (CellEditDragView) view.findViewById(R.id.dragView);
        Intrinsics.checkExpressionValueIsNotNull(cellEditDragView, "contentView.dragView");
        return cellEditDragView;
    }

    /* renamed from: j */
    public final void mo18314j() {
        if (!this.f13781s) {
            this.f13781s = true;
            View view = this.f13458b;
            Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
            EditText editText = (EditText) view.findViewById(R.id.searchEditText);
            if (!editText.hasFocus()) {
                editText.requestFocus();
            }
            BitableSelectFieldAnalyticDelegate bVar = this.f13773j;
            if (bVar != null) {
                bVar.mo18249a("ccm_bitable_option_field_panel_click", "search");
            }
        }
    }

    /* renamed from: k */
    public final void mo18315k() {
        if (this.f13781s) {
            this.f13781s = false;
            View view = this.f13458b;
            Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
            EditText editText = (EditText) view.findViewById(R.id.searchEditText);
            editText.clearFocus();
            if (!TextUtils.isEmpty(editText.getText())) {
                editText.setText("");
            }
            mo17982f();
        }
    }

    /* renamed from: n */
    private final void m19365n() {
        View view = this.f13458b;
        ((ImageView) view.findViewById(R.id.clearSearchIcon)).setOnClickListener(new View$OnClickListenerC4665h(view));
        ((TextView) view.findViewById(R.id.cancelSearchBtn)).setOnClickListener(new View$OnClickListenerC4662e(this));
        ((EditText) view.findViewById(R.id.searchEditText)).addTextChangedListener(new C4663f(view, this));
        ((EditText) view.findViewById(R.id.searchEditText)).setOnFocusChangeListener(new View$OnFocusChangeListenerC4664g(view, this));
    }

    /* renamed from: i */
    public final void mo18174i() {
        View view = this.f13458b;
        Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
        SpaceEmptyState spaceEmptyState = (SpaceEmptyState) view.findViewById(R.id.emptyView);
        if (spaceEmptyState.getVisibility() == 0) {
            ViewGroup.LayoutParams layoutParams = spaceEmptyState.getLayoutParams();
            if (this.f13461e == 0) {
                layoutParams.height = -1;
            } else {
                View view2 = this.f13458b;
                Intrinsics.checkExpressionValueIsNotNull(view2, "contentView");
                FrameLayout frameLayout = (FrameLayout) view2.findViewById(R.id.contentContainer);
                Intrinsics.checkExpressionValueIsNotNull(frameLayout, "contentView.contentContainer");
                int height = frameLayout.getHeight() - this.f13461e;
                if (height > 0) {
                    if (height >= spaceEmptyState.getResources().getDimensionPixelSize(R.dimen.space_kit_emptystate_image_size_middle) + (spaceEmptyState.getResources().getDimensionPixelSize(R.dimen.space_kit_len_16) * 2)) {
                        layoutParams.height = height;
                    } else {
                        layoutParams.height = -2;
                    }
                } else {
                    return;
                }
            }
            spaceEmptyState.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: l */
    public final void mo18316l() {
        Context e = mo17981e();
        Intrinsics.checkExpressionValueIsNotNull(e, "context");
        OptionCreationPanel dVar = new OptionCreationPanel(e, this.f13775l, this.f13772i);
        Context e2 = mo17981e();
        Intrinsics.checkExpressionValueIsNotNull(e2, "getContext()");
        dVar.mo18265a((CharSequence) e2.getResources().getString(R.string.Bitable_Option_CreateTitle));
        dVar.mo18264a(new C4673n(this));
        dVar.mo18263a(this.f13773j);
        dVar.mo17973a();
        this.f13782t = dVar;
        BitableSelectFieldAnalyticDelegate bVar = this.f13773j;
        if (bVar != null) {
            bVar.mo18249a("ccm_bitable_option_field_panel_click", "add");
        }
    }

    /* renamed from: m */
    private final void m19364m() {
        int i;
        View view = this.f13458b;
        C4655h hVar = new C4655h(this.f13774k);
        hVar.setHasStableIds(true);
        hVar.mo18298a(this);
        this.f13769f = hVar;
        InterceptTouchRecyclerView interceptTouchRecyclerView = (InterceptTouchRecyclerView) view.findViewById(R.id.recyclerView);
        interceptTouchRecyclerView.setSceneTag("select_edit_panel_rv");
        interceptTouchRecyclerView.setHasFixedSize(true);
        interceptTouchRecyclerView.setLayoutManager(new LinearLayoutManager(interceptTouchRecyclerView.getContext()));
        C4655h hVar2 = this.f13769f;
        if (hVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectEditAdapter");
        }
        interceptTouchRecyclerView.setAdapter(hVar2);
        CellEditDragView cellEditDragView = (CellEditDragView) view.findViewById(R.id.dragView);
        if (cellEditDragView != null) {
            CellEditDragView cellEditDragView2 = cellEditDragView;
            cellEditDragView.setSlideView((RelativeLayout) cellEditDragView2.findViewById(R.id.searchContainer));
            cellEditDragView.setSlideView((SpaceEmptyState) cellEditDragView2.findViewById(R.id.emptyView));
            InterceptTouchRecyclerView interceptTouchRecyclerView2 = (InterceptTouchRecyclerView) cellEditDragView2.findViewById(R.id.recyclerView);
            Intrinsics.checkExpressionValueIsNotNull(interceptTouchRecyclerView2, "recyclerView");
            cellEditDragView.mo45437a(interceptTouchRecyclerView2);
            cellEditDragView.setHeightChangedListener(new C4666i(this));
        }
        EditText editText = (EditText) view.findViewById(R.id.searchEditText);
        Intrinsics.checkExpressionValueIsNotNull(editText, "searchEditText");
        Resources resources = view.getResources();
        if (this.f13774k) {
            i = R.string.Bitable_Option_SearchOrCreate;
        } else {
            i = R.string.Bitable_Option_Search;
        }
        editText.setHint(resources.getString(i));
        TextView textView = (TextView) view.findViewById(R.id.cancelSearchBtn);
        Intrinsics.checkExpressionValueIsNotNull(textView, "cancelSearchBtn");
        int i2 = 8;
        textView.setVisibility(8);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.createNewOptionBtn);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "createNewOptionBtn");
        if (this.f13774k) {
            i2 = 0;
        }
        appCompatImageView.setVisibility(i2);
        ((AppCompatImageView) view.findViewById(R.id.createNewOptionBtn)).setOnClickListener(new View$OnClickListenerC4667j(this));
        ((RelativeLayout) view.findViewById(R.id.createNewOptionContainer)).setOnClickListener(new View$OnClickListenerC4668k(view, this));
    }

    /* renamed from: o */
    private final void m19366o() {
        int i;
        int i2;
        List<C4530e.C4531a> list;
        C4530e eVar;
        List<C4530e.C4531a> a;
        C4530e eVar2 = this.f13777o;
        boolean z = true;
        int i3 = 0;
        if (eVar2 != null) {
            if (eVar2 != null) {
                list = eVar2.mo17727a();
            } else {
                list = null;
            }
            if (list != null && ((eVar = this.f13777o) == null || (a = eVar.mo17727a()) == null || !a.isEmpty())) {
                z = false;
            }
        }
        View view = this.f13458b;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.searchContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "searchContainer");
        if (!z || this.f13774k) {
            i = 0;
        } else {
            i = 8;
        }
        relativeLayout.setVisibility(i);
        InterceptTouchRecyclerView interceptTouchRecyclerView = (InterceptTouchRecyclerView) view.findViewById(R.id.recyclerView);
        Intrinsics.checkExpressionValueIsNotNull(interceptTouchRecyclerView, "recyclerView");
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        interceptTouchRecyclerView.setVisibility(i2);
        SpaceEmptyState spaceEmptyState = (SpaceEmptyState) view.findViewById(R.id.emptyView);
        Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState, "emptyView");
        if (!z) {
            i3 = 8;
        }
        spaceEmptyState.setVisibility(i3);
        ((SpaceEmptyState) view.findViewById(R.id.emptyView)).setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_neutral_no_content));
        ((SpaceEmptyState) view.findViewById(R.id.emptyView)).setDesc(view.getResources().getString(R.string.Bitable_Mobile_CannotEditOption));
        mo18174i();
        if (this.f13781s) {
            EditText editText = (EditText) view.findViewById(R.id.searchEditText);
            Intrinsics.checkExpressionValueIsNotNull(editText, "searchEditText");
            if (!TextUtils.isEmpty(editText.getText())) {
                C4655h hVar = this.f13769f;
                if (hVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("selectEditAdapter");
                }
                EditText editText2 = (EditText) view.findViewById(R.id.searchEditText);
                Intrinsics.checkExpressionValueIsNotNull(editText2, "searchEditText");
                hVar.mo18299a(editText2.getText().toString());
            }
        }
        if (this.f13774k) {
            RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(R.id.createNewOptionContainer);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "createNewOptionContainer");
            if (relativeLayout2.getVisibility() == 8) {
                m19367p();
            }
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a
    /* renamed from: a */
    public void mo17973a() {
        super.mo17973a();
        View view = this.f13458b;
        Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
        ((CellEditDragView) view.findViewById(R.id.dragView)).mo17964b(false);
        View view2 = this.f13458b;
        Intrinsics.checkExpressionValueIsNotNull(view2, "contentView");
        ((InterceptTouchRecyclerView) view2.findViewById(R.id.recyclerView)).post(new RunnableC4672m(this));
        BitableSelectFieldAnalyticDelegate bVar = this.f13773j;
        if (bVar != null) {
            bVar.mo18254d("ccm_bitable_option_field_panel_view");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/select/SelectEditPanel$showOptionModifyPanel$1$1", "Lcom/bytedance/ee/bear/bitable/card/view/cell/select/OptionCreationPanel$ActionListener;", "onClickDoneBtn", "", "optionContent", "", "optionColorId", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.i$o */
    public static final class C4674o implements OptionCreationPanel.ActionListener {

        /* renamed from: a */
        final /* synthetic */ SelectEditPanel f13803a;

        /* renamed from: b */
        final /* synthetic */ C4530e.C4531a f13804b;

        @Override // com.bytedance.ee.bear.bitable.card.view.cell.select.OptionCreationPanel.ActionListener
        /* renamed from: b */
        public void mo18269b(String str) {
            OptionCreationPanel.ActionListener.C4643a.m19327b(this, str);
        }

        @Override // com.bytedance.ee.bear.bitable.card.view.cell.select.OptionCreationPanel.ActionListener
        /* renamed from: a */
        public C4530e.C4531a mo18267a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "optionContent");
            return OptionCreationPanel.ActionListener.C4643a.m19326a(this, str);
        }

        C4674o(SelectEditPanel iVar, C4530e.C4531a aVar) {
            this.f13803a = iVar;
            this.f13804b = aVar;
        }

        @Override // com.bytedance.ee.bear.bitable.card.view.cell.select.OptionCreationPanel.ActionListener
        /* renamed from: a */
        public void mo18268a(String str, int i) {
            Intrinsics.checkParameterIsNotNull(str, "optionContent");
            DataRequestListener bVar = this.f13803a.f13771h;
            if (bVar != null) {
                bVar.mo18260a(this.f13804b.mo17731a(), str, i);
            }
        }
    }

    /* renamed from: a */
    public final void mo18310a(BitableSelectFieldAnalyticDelegate bVar) {
        this.f13773j = bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.i$d */
    public static final class C4661d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C4661d f13786a = new C4661d();

        C4661d() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54765b("SelectEditPanel", "fetch random colorId failed", th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/bitable/card/view/cell/select/SelectEditPanel$initSearchModeWatcher$1$2"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.i$e */
    public static final class View$OnClickListenerC4662e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SelectEditPanel f13787a;

        View$OnClickListenerC4662e(SelectEditPanel iVar) {
            this.f13787a = iVar;
        }

        public final void onClick(View view) {
            this.f13787a.mo18315k();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/bitable/card/view/cell/select/SelectEditPanel$initView$1$4"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.i$j */
    public static final class View$OnClickListenerC4667j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SelectEditPanel f13794a;

        View$OnClickListenerC4667j(SelectEditPanel iVar) {
            this.f13794a = iVar;
        }

        public final void onClick(View view) {
            this.f13794a.mo18316l();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f¸\u0006\u0000"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/select/SelectEditPanel$showOptionCreationPanel$1$1", "Lcom/bytedance/ee/bear/bitable/card/view/cell/select/OptionCreationPanel$ActionListener;", "onChooseAvailableOption", "", "optionId", "", "onClickDoneBtn", "optionContent", "optionColorId", "", "onFindAvailableOption", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/field/OptionField$OptionEntity;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.i$n */
    public static final class C4673n implements OptionCreationPanel.ActionListener {

        /* renamed from: a */
        final /* synthetic */ SelectEditPanel f13802a;

        C4673n(SelectEditPanel iVar) {
            this.f13802a = iVar;
        }

        @Override // com.bytedance.ee.bear.bitable.card.view.cell.select.OptionCreationPanel.ActionListener
        /* renamed from: a */
        public C4530e.C4531a mo18267a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "optionContent");
            return this.f13802a.mo18307a(str);
        }

        @Override // com.bytedance.ee.bear.bitable.card.view.cell.select.OptionCreationPanel.ActionListener
        /* renamed from: b */
        public void mo18269b(String str) {
            if (str != null) {
                this.f13802a.mo18303a(str, true);
            }
        }

        @Override // com.bytedance.ee.bear.bitable.card.view.cell.select.OptionCreationPanel.ActionListener
        /* renamed from: a */
        public void mo18268a(String str, int i) {
            Intrinsics.checkParameterIsNotNull(str, "optionContent");
            this.f13802a.mo18312a(str, i, false);
        }
    }

    /* renamed from: a */
    public final void mo18311a(DataRequestListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f13771h = bVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ C4655h m19362a(SelectEditPanel iVar) {
        C4655h hVar = iVar.f13769f;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectEditAdapter");
        }
        return hVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.i$h */
    public static final class View$OnClickListenerC4665h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View f13792a;

        View$OnClickListenerC4665h(View view) {
            this.f13792a = view;
        }

        public final void onClick(View view) {
            ((EditText) this.f13792a.findViewById(R.id.searchEditText)).setText("");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a
    /* renamed from: a */
    public View mo17972a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        View view = this.f13458b;
        Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
        return view;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "randomColorResult", "Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/common/RandomColorResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.i$c */
    public static final class C4660c<T> implements Consumer<RandomColorResult> {

        /* renamed from: a */
        final /* synthetic */ SelectEditPanel f13785a;

        C4660c(SelectEditPanel iVar) {
            this.f13785a = iVar;
        }

        /* renamed from: a */
        public final void accept(RandomColorResult randomColorResult) {
            int i;
            ColorBean colorBean;
            SelectEditPanel iVar = this.f13785a;
            Integer color = randomColorResult.getColor();
            if (color != null) {
                i = color.intValue();
            } else {
                i = 0;
            }
            iVar.f13772i = i;
            ColorBean[] colorBeanArr = this.f13785a.f13775l;
            if (colorBeanArr != null && (colorBean = colorBeanArr[this.f13785a.f13772i]) != null) {
                View view = this.f13785a.f13458b;
                Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
                ((SelectTextView) view.findViewById(R.id.newOptionTV)).mo18231a(colorBean.getColor(), colorBean.getTextColor());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/bitable/card/view/cell/select/SelectEditPanel$initView$1$5"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.i$k */
    public static final class View$OnClickListenerC4668k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View f13795a;

        /* renamed from: b */
        final /* synthetic */ SelectEditPanel f13796b;

        View$OnClickListenerC4668k(View view, SelectEditPanel iVar) {
            this.f13795a = view;
            this.f13796b = iVar;
        }

        public final void onClick(View view) {
            SelectEditPanel iVar = this.f13796b;
            SelectTextView selectTextView = (SelectTextView) this.f13795a.findViewById(R.id.newOptionTV);
            Intrinsics.checkExpressionValueIsNotNull(selectTextView, "newOptionTV");
            iVar.mo18312a(selectTextView.getText().toString(), this.f13796b.f13772i, true);
            BitableSelectFieldAnalyticDelegate bVar = this.f13796b.f13773j;
            if (bVar != null) {
                bVar.mo18249a("ccm_bitable_option_field_panel_click", "create_option");
            }
        }
    }

    /* renamed from: a */
    public final C4530e.C4531a mo18307a(String str) {
        List<C4530e.C4531a> a;
        C4530e eVar = this.f13777o;
        if (eVar == null || (a = eVar.mo17727a()) == null) {
            return null;
        }
        for (T t : a) {
            Intrinsics.checkExpressionValueIsNotNull(t, "it");
            if (TextUtils.equals(t.mo17734b(), str)) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo18313b(C4530e.C4531a aVar) {
        Context e = mo17981e();
        Intrinsics.checkExpressionValueIsNotNull(e, "context");
        OptionCreationPanel dVar = new OptionCreationPanel(e, this.f13775l, aVar.mo17736c());
        Context e2 = mo17981e();
        Intrinsics.checkExpressionValueIsNotNull(e2, "getContext()");
        dVar.mo18265a((CharSequence) e2.getResources().getString(R.string.Bitable_Option_Modify));
        dVar.mo18266b(aVar.mo17734b());
        dVar.mo18264a(new C4674o(this, aVar));
        dVar.mo18263a(this.f13773j);
        dVar.mo17973a();
        this.f13782t = dVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e¸\u0006\u0000"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/select/SelectEditPanel$initSearchModeWatcher$1$3", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.i$f */
    public static final class C4663f implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ View f13788a;

        /* renamed from: b */
        final /* synthetic */ SelectEditPanel f13789b;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void afterTextChanged(android.text.Editable r9) {
            /*
            // Method dump skipped, instructions count: 161
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.bitable.card.view.cell.select.SelectEditPanel.C4663f.afterTextChanged(android.text.Editable):void");
        }

        C4663f(View view, SelectEditPanel iVar) {
            this.f13788a = view;
            this.f13789b = iVar;
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a
    /* renamed from: a */
    public void mo17974a(int i) {
        super.mo17974a(i);
        OptionCreationPanel dVar = this.f13782t;
        if (dVar == null || !dVar.mo17980d()) {
            OptionMoreOperationPanel eVar = this.f13783u;
            if (eVar == null || !eVar.mo17980d()) {
                if (i > 0) {
                    if (this.f13781s) {
                        View view = this.f13458b;
                        Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
                        ((CellEditDragView) view.findViewById(R.id.dragView)).mo17962a(true);
                    }
                } else if (this.f13781s) {
                    View view2 = this.f13458b;
                    Intrinsics.checkExpressionValueIsNotNull(view2, "contentView");
                    EditText editText = (EditText) view2.findViewById(R.id.searchEditText);
                    Intrinsics.checkExpressionValueIsNotNull(editText, "contentView.searchEditText");
                    if (TextUtils.isEmpty(editText.getText())) {
                        mo18315k();
                    }
                }
                mo18174i();
                return;
            }
            return;
        }
        OptionCreationPanel dVar2 = this.f13782t;
        if (dVar2 != null) {
            dVar2.mo17974a(i);
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.select.C4655h.AbstractC4656a
    /* renamed from: a */
    public void mo18302a(C4530e.C4531a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "optionEntity");
        Context e = mo17981e();
        Intrinsics.checkExpressionValueIsNotNull(e, "context");
        String b = aVar.mo17734b();
        Intrinsics.checkExpressionValueIsNotNull(b, "optionEntity.content");
        String e2 = aVar.mo17739e();
        Intrinsics.checkExpressionValueIsNotNull(e2, "optionEntity.textColor");
        String d = aVar.mo17738d();
        Intrinsics.checkExpressionValueIsNotNull(d, "optionEntity.capsuleColor");
        OptionMoreOperationPanel eVar = new OptionMoreOperationPanel(e, b, e2, d);
        eVar.mo18280a(new C4669l(this, aVar));
        eVar.mo18279a(this.f13773j);
        eVar.mo17973a();
        this.f13783u = eVar;
        BitableSelectFieldAnalyticDelegate bVar = this.f13773j;
        if (bVar != null) {
            bVar.mo18249a("ccm_bitable_option_field_panel_click", "option_more");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "lastHeight", "", "currentHeight", "onHeightChanged", "com/bytedance/ee/bear/bitable/card/view/cell/select/SelectEditPanel$initView$1$3$1", "com/bytedance/ee/bear/bitable/card/view/cell/select/SelectEditPanel$$special$$inlined$run$lambda$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.i$i */
    public static final class C4666i implements CellEditDragView.AbstractC4563a {

        /* renamed from: a */
        final /* synthetic */ SelectEditPanel f13793a;

        C4666i(SelectEditPanel iVar) {
            this.f13793a = iVar;
        }

        @Override // com.bytedance.ee.bear.bitable.card.view.cell.CellEditDragView.AbstractC4563a
        /* renamed from: a */
        public final void mo17968a(int i, int i2) {
            if (i2 < i && this.f13793a.f13461e > 0) {
                this.f13793a.mo17982f();
            }
            this.f13793a.mo18174i();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange", "com/bytedance/ee/bear/bitable/card/view/cell/select/SelectEditPanel$initSearchModeWatcher$1$4"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.i$g */
    public static final class View$OnFocusChangeListenerC4664g implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ View f13790a;

        /* renamed from: b */
        final /* synthetic */ SelectEditPanel f13791b;

        View$OnFocusChangeListenerC4664g(View view, SelectEditPanel iVar) {
            this.f13790a = view;
            this.f13791b = iVar;
        }

        public final void onFocusChange(View view, boolean z) {
            int i;
            TextView textView = (TextView) this.f13790a.findViewById(R.id.cancelSearchBtn);
            Intrinsics.checkExpressionValueIsNotNull(textView, "cancelSearchBtn");
            int i2 = 0;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
            AppCompatImageView appCompatImageView = (AppCompatImageView) this.f13790a.findViewById(R.id.createNewOptionBtn);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "createNewOptionBtn");
            if (z || !this.f13791b.f13774k) {
                i2 = 8;
            }
            appCompatImageView.setVisibility(i2);
            if (z) {
                this.f13791b.mo18314j();
            } else {
                this.f13791b.mo18315k();
            }
        }
    }

    /* renamed from: a */
    private final void m19363a(String str, int i) {
        Map<String, String> map = this.f13460d;
        map.clear();
        View view = this.f13458b;
        Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
        EditText editText = (EditText) view.findViewById(R.id.searchEditText);
        Intrinsics.checkExpressionValueIsNotNull(editText, "contentView.searchEditText");
        boolean z = true;
        map.put("bitable_edit_search", String.valueOf(!TextUtils.isEmpty(editText.getText())));
        if (this.f13776n != EFieldType.MULTI_SELECT) {
            z = false;
        }
        map.put("is_edit_panel_open", String.valueOf(z));
        map.put("cell_item_change", String.valueOf(i));
        this.f13459c.mo17987a(str, map);
    }

    /* renamed from: a */
    public final void mo18308a(C4530e eVar, String str) {
        int i;
        List<C4530e.C4531a> list;
        this.f13776n = EFieldType.SINGLE_SELECT;
        this.f13777o = eVar;
        this.f13778p = str;
        int i2 = 0;
        if (eVar != null) {
            i = eVar.mo17729b(str);
        } else {
            i = 0;
        }
        if (i > 0) {
            i2 = i;
        }
        this.f13770g = i2;
        C4655h hVar = this.f13769f;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectEditAdapter");
        }
        if (eVar != null) {
            list = eVar.mo17727a();
        } else {
            list = null;
        }
        hVar.mo18300a(list, i);
        C4655h hVar2 = this.f13769f;
        if (hVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectEditAdapter");
        }
        hVar2.notifyDataSetChanged();
        m19366o();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectEditPanel(Context context, boolean z, ColorBean[] colorBeanArr) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f13774k = z;
        this.f13775l = colorBeanArr;
        this.f13458b = LayoutInflater.from(context).inflate(R.layout.bitable_card_select_edit_panel, (ViewGroup) null);
        m19364m();
        m19365n();
    }
}
