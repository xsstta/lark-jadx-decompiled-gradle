package com.bytedance.ee.bear.bitable.card.view.cell.link;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.bitable.card.model.enums.EFieldType;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4525a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4535b;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4533g;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a;
import com.bytedance.ee.bear.bitable.card.view.cell.CellEditDragView;
import com.bytedance.ee.bear.bitable.card.view.title.BitableCardTitleView;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.panel.InterceptTouchRecyclerView;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.util.p701d.C13630j;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C69043h;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0018\u0018\u00002\u00020\u0001:\u00044567B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0019\u0010\u0013\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\u0010\u0017J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0014J\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0011H\u0002J\b\u0010\u001d\u001a\u00020\u0011H\u0002J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 H\u0016J\u000e\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\rJ\u0018\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020 H\u0002J\u000e\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0006J\u0010\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u0016H\u0002J)\u0010*\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\b2\u0012\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u0015\"\u00020\u0019H\u0002¢\u0006\u0002\u0010,J\b\u0010-\u001a\u00020\u0011H\u0016J\u0016\u0010.\u001a\u00020\u00112\u0006\u0010%\u001a\u00020 2\u0006\u0010/\u001a\u00020 J\b\u00100\u001a\u00020\u0011H\u0002J\b\u00101\u001a\u00020\u0011H\u0002J\u0019\u00102\u001a\u00020\u00112\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\u0010\u0017R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordPickerPanel;", "Lcom/bytedance/ee/bear/bitable/card/view/cell/BaseCellEditPanel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mActionListener", "Lcom/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordPickerPanel$OnActionListener;", "mAutoScrollToBottomAfterDataUpdated", "", "mCurrentLinkRecordList", "", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/STRecord;", "mCurrentLinkSTTable", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/STTable;", "mRecordAdapter", "Lcom/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordPickerPanel$RecordAdapter;", "adjustEmptyViewPositionIfNeed", "", "dismiss", "filterData", "filteredRecordIds", "", "", "([Ljava/lang/String;)V", "getContentView", "Landroid/view/View;", "getDragView", "Lcom/bytedance/ee/bear/bitable/card/view/cell/CellEditDragView;", "initSearchKeywordWatcher", "initView", "notifyKeyboardHeightChanged", "keyboardHeight", "", "setData", "linkTable", "setEmptyDataViewVisibility", "visible", "placeHolderImageResId", "setOnActionListener", "listener", "setTableName", "tableName", "setVisible", "views", "(Z[Landroid/view/View;)V", "show", "showInvalidTablePlaceHolder", "tipResId", "showLinkTableView", "showLoadingView", "updateSelectedRecordIds", "selectedRecordIds", "DefaultSpan", "OnActionListener", "RecordAdapter", "TableNameSpan", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.e.d */
public final class LinkRecordPickerPanel extends AbstractC4565a {

    /* renamed from: f */
    public C4535b f13651f;

    /* renamed from: g */
    public OnActionListener f13652g;

    /* renamed from: h */
    public boolean f13653h;

    /* renamed from: i */
    private List<? extends C4525a> f13654i;

    /* renamed from: j */
    private RecordAdapter f13655j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H&J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordPickerPanel$OnActionListener;", "", "onAddNewRecordBtnClicked", "", "recordTitle", "", "onSearchKeywordChanged", "keyword", "onSelectedItemsChanged", "recordId", "isChecked", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.e.d$b */
    public interface OnActionListener {
        /* renamed from: a */
        void mo18149a(String str);

        /* renamed from: a */
        void mo18150a(String str, boolean z);

        /* renamed from: b */
        void mo18151b(String str);
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001e\u001fB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\fJ\u0014\u0010\u001a\u001a\u00020\u00112\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0019\u0010\u001b\u001a\u00020\u00112\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u001cR\u0018\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordPickerPanel$RecordAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordPickerPanel$RecordAdapter$ViewHolder;", "()V", "filteredRecordIds", "", "", "[Ljava/lang/String;", "recordList", "", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/STRecord;", "selectListener", "Lcom/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordPickerPanel$RecordAdapter$OnSelectListener;", "selectedRecordIds", "getItemCount", "", "onBindViewHolder", "", "holder", "pos", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnSelectListener", "listener", "setRecordList", "updateFilteredRecordIds", "([Ljava/lang/String;)V", "updateSelectedRecordIds", "OnSelectListener", "ViewHolder", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.e.d$c */
    public static final class RecordAdapter extends RecyclerView.Adapter<ViewHolder> {

        /* renamed from: a */
        public List<? extends C4525a> f13656a = new ArrayList();

        /* renamed from: b */
        public List<String> f13657b = CollectionsKt.emptyList();

        /* renamed from: c */
        public String[] f13658c;

        /* renamed from: d */
        public OnSelectListener f13659d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordPickerPanel$RecordAdapter$OnSelectListener;", "", "onSelectedItemsChanged", "", "recordId", "", "isChecked", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.e.d$c$a */
        public interface OnSelectListener {
            /* renamed from: a */
            void mo18182a(String str, boolean z);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordPickerPanel$RecordAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordPickerPanel$RecordAdapter;Landroid/view/View;)V", "checkBox", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "getCheckBox", "()Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "setCheckBox", "(Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;)V", "titleTV", "Lcom/bytedance/ee/bear/bitable/card/view/title/BitableCardTitleView;", "getTitleTV", "()Lcom/bytedance/ee/bear/bitable/card/view/title/BitableCardTitleView;", "setTitleTV", "(Lcom/bytedance/ee/bear/bitable/card/view/title/BitableCardTitleView;)V", "setData", "", "record", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/STRecord;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.e.d$c$b */
        public final class ViewHolder extends RecyclerView.ViewHolder {

            /* renamed from: a */
            final /* synthetic */ RecordAdapter f13660a;

            /* renamed from: b */
            private BitableCardTitleView f13661b;

            /* renamed from: c */
            private UDCheckBox f13662c;

            /* renamed from: a */
            public final UDCheckBox mo18183a() {
                return this.f13662c;
            }

            /* renamed from: a */
            public final void mo18184a(C4525a aVar) {
                int i;
                Intrinsics.checkParameterIsNotNull(aVar, "record");
                String[] strArr = this.f13660a.f13658c;
                boolean z = true;
                int i2 = 0;
                if (strArr == null || !C69043h.m265767b(strArr, aVar.mo17707b())) {
                    z = false;
                }
                View view = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
                View view2 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                View view3 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
                ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                if (z) {
                    i2 = -2;
                }
                layoutParams.height = i2;
                view2.setLayoutParams(layoutParams);
                if (z) {
                    UDCheckBox uDCheckBox = this.f13662c;
                    List<String> list = this.f13660a.f13657b;
                    uDCheckBox.setChecked((list != null ? Boolean.valueOf(list.contains(aVar.mo17707b())) : null).booleanValue());
                    List<C4537a> h = aVar.mo17714h();
                    Intrinsics.checkExpressionValueIsNotNull(h, "record.cells");
                    for (T t : h) {
                        Intrinsics.checkExpressionValueIsNotNull(t, "it");
                        C4533g a = t.mo17829a();
                        if (TextUtils.equals(a != null ? a.mo17749g() : null, aVar.mo17708c())) {
                            this.f13661b.setData(t);
                        }
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public ViewHolder(RecordAdapter cVar, View view) {
                super(view);
                Intrinsics.checkParameterIsNotNull(view, "itemView");
                this.f13660a = cVar;
                BitableCardTitleView bitableCardTitleView = (BitableCardTitleView) view.findViewById(R.id.titleTV);
                Intrinsics.checkExpressionValueIsNotNull(bitableCardTitleView, "itemView.titleTV");
                this.f13661b = bitableCardTitleView;
                UDCheckBox uDCheckBox = (UDCheckBox) view.findViewById(R.id.checkBox);
                Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "itemView.checkBox");
                this.f13662c = uDCheckBox;
                BitableCardTitleView bitableCardTitleView2 = this.f13661b;
                bitableCardTitleView2.setDefaultTitle(bitableCardTitleView2.getResources().getString(R.string.Doc_Block_UnnamedRecord));
                bitableCardTitleView2.setTitleSize((float) bitableCardTitleView2.getResources().getDimensionPixelSize(R.dimen.bitable_field_link_title_size));
                bitableCardTitleView2.setTitleColor(bitableCardTitleView2.getResources().getColor(R.color.text_title));
                bitableCardTitleView2.setTypeface(Typeface.DEFAULT);
                bitableCardTitleView2.setShouldFormatRichText(false);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f13656a.size();
        }

        /* renamed from: a */
        public final void mo18177a(OnSelectListener aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "listener");
            this.f13659d = aVar;
        }

        /* renamed from: b */
        public final void mo18181b(String[] strArr) {
            Intrinsics.checkParameterIsNotNull(strArr, "filteredRecordIds");
            this.f13658c = strArr;
        }

        /* renamed from: a */
        public final void mo18180a(String[] strArr) {
            Intrinsics.checkParameterIsNotNull(strArr, "selectedRecordIds");
            this.f13657b = C69043h.m265716a(strArr);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordPickerPanel$RecordAdapter$onBindViewHolder$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.e.d$c$c */
        public static final class C4619c extends AbstractView$OnClickListenerC11839e {

            /* renamed from: a */
            final /* synthetic */ RecordAdapter f13663a;

            /* renamed from: b */
            final /* synthetic */ ViewHolder f13664b;

            /* renamed from: c */
            final /* synthetic */ int f13665c;

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                Context context;
                List<String> list;
                if (view != null) {
                    context = view.getContext();
                } else {
                    context = null;
                }
                C13630j.m55310a(context, 1, 1);
                boolean z = !this.f13664b.mo18183a().isChecked();
                this.f13664b.mo18183a().setChecked(z);
                RecordAdapter cVar = this.f13663a;
                if (z) {
                    list = CollectionsKt.plus((Collection) cVar.f13657b, (Object) ((C4525a) this.f13663a.f13656a.get(this.f13665c)).mo17707b());
                } else {
                    list = CollectionsKt.minus(cVar.f13657b, ((C4525a) this.f13663a.f13656a.get(this.f13665c)).mo17707b());
                }
                cVar.f13657b = list;
                OnSelectListener aVar = this.f13663a.f13659d;
                if (aVar != null) {
                    aVar.mo18182a(((C4525a) this.f13663a.f13656a.get(this.f13665c)).mo17707b(), z);
                }
            }

            C4619c(RecordAdapter cVar, ViewHolder bVar, int i) {
                this.f13663a = cVar;
                this.f13664b = bVar;
                this.f13665c = i;
            }
        }

        /* renamed from: a */
        public final void mo18179a(List<? extends C4525a> list) {
            Intrinsics.checkParameterIsNotNull(list, "recordList");
            this.f13656a = list;
            List<? extends C4525a> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().mo17707b());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                this.f13658c = (String[]) array;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        /* renamed from: a */
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bitable_link_records_list_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            return new ViewHolder(this, inflate);
        }

        /* renamed from: a */
        public void onBindViewHolder(ViewHolder bVar, int i) {
            int i2;
            Intrinsics.checkParameterIsNotNull(bVar, "holder");
            if (i >= 0 && i < getItemCount()) {
                bVar.mo18184a((C4525a) this.f13656a.get(i));
                bVar.itemView.setOnClickListener(new C4619c(this, bVar, i));
                View view = bVar.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    int i3 = 0;
                    if (i == 0) {
                        i2 = C13749l.m55738a(4);
                    } else {
                        i2 = 0;
                    }
                    marginLayoutParams.topMargin = i2;
                    if (i == getItemCount() - 1) {
                        i3 = C13749l.m55738a(4);
                    }
                    marginLayoutParams.bottomMargin = i3;
                    View view2 = bVar.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
                    view2.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo18170a(boolean z, View... viewArr) {
        for (View view : viewArr) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a
    /* renamed from: b */
    public void mo17978b() {
        this.f13651f = null;
        mo17982f();
        super.mo17978b();
    }

    /* renamed from: k */
    private final void m19199k() {
        View view = this.f13458b;
        Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
        ((EditText) view.findViewById(R.id.searchEditText)).addTextChangedListener(new C4620e(this));
    }

    /* renamed from: h */
    public final CellEditDragView mo18173h() {
        View view = this.f13458b;
        Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
        CellEditDragView cellEditDragView = (CellEditDragView) view.findViewById(R.id.dragView);
        Intrinsics.checkExpressionValueIsNotNull(cellEditDragView, "contentView.dragView");
        return cellEditDragView;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a
    /* renamed from: a */
    public void mo17973a() {
        View view = this.f13458b;
        Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
        ((CellEditDragView) view.findViewById(R.id.dragView)).mo17964b(false);
        View view2 = this.f13458b;
        Intrinsics.checkExpressionValueIsNotNull(view2, "contentView");
        ((EditText) view2.findViewById(R.id.searchEditText)).setText("");
        super.mo17973a();
    }

    /* renamed from: l */
    private final void m19200l() {
        View view = this.f13458b;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.loadingLayout);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "loadingLayout");
        mo18170a(true, frameLayout);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.linkTableContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "linkTableContainer");
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.linkTableContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "linkTableContainer");
        mo18170a(false, linearLayout, linearLayout2);
        ((BearLottieView) view.findViewById(R.id.loadingLottie)).playAnimation();
    }

    /* renamed from: m */
    private final void m19201m() {
        View view = this.f13458b;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.loadingLayout);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "loadingLayout");
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.linkTableContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "linkTableContainer");
        mo18170a(false, frameLayout, linearLayout);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.linkTableContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "linkTableContainer");
        mo18170a(true, linearLayout2);
        ((BearLottieView) view.findViewById(R.id.loadingLottie)).cancelAnimation();
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

    /* renamed from: j */
    private final void m19198j() {
        m19200l();
        View view = this.f13458b;
        ((ImageView) view.findViewById(R.id.clearSearchIcon)).setOnClickListener(new View$OnClickListenerC4625j(view));
        ((TextView) view.findViewById(R.id.cancelSearchBtn)).setOnClickListener(new View$OnClickListenerC4621f(view, this));
        ((RelativeLayout) view.findViewById(R.id.addNewRecordBtn)).setOnClickListener(new C4622g(view, this));
        this.f13655j = new RecordAdapter();
        InterceptTouchRecyclerView interceptTouchRecyclerView = (InterceptTouchRecyclerView) view.findViewById(R.id.recordListRV);
        Intrinsics.checkExpressionValueIsNotNull(interceptTouchRecyclerView, "recordListRV");
        interceptTouchRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        InterceptTouchRecyclerView interceptTouchRecyclerView2 = (InterceptTouchRecyclerView) view.findViewById(R.id.recordListRV);
        Intrinsics.checkExpressionValueIsNotNull(interceptTouchRecyclerView2, "recordListRV");
        interceptTouchRecyclerView2.setAdapter(this.f13655j);
        ((InterceptTouchRecyclerView) view.findViewById(R.id.recordListRV)).addOnScrollListener(new C4623h(this));
        InterceptTouchRecyclerView interceptTouchRecyclerView3 = (InterceptTouchRecyclerView) view.findViewById(R.id.recordListRV);
        Intrinsics.checkExpressionValueIsNotNull(interceptTouchRecyclerView3, "recordListRV");
        ((CellEditDragView) view.findViewById(R.id.dragView)).mo45437a(interceptTouchRecyclerView3);
        ((CellEditDragView) view.findViewById(R.id.dragView)).setHeightChangedListener(new C4624i(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordPickerPanel$initSearchKeywordWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.e.d$e */
    public static final class C4620e implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ LinkRecordPickerPanel f13666a;

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4620e(LinkRecordPickerPanel dVar) {
            this.f13666a = dVar;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            boolean z;
            OnActionListener bVar;
            String str;
            EFieldType eFieldType = null;
            if (!(this.f13666a.f13651f == null || (bVar = this.f13666a.f13652g) == null)) {
                if (charSequence != null) {
                    str = charSequence.toString();
                } else {
                    str = null;
                }
                bVar.mo18149a(str);
            }
            if (charSequence != null) {
                if (charSequence.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    LinkRecordPickerPanel dVar = this.f13666a;
                    View view = dVar.f13458b;
                    Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
                    TextView textView = (TextView) view.findViewById(R.id.cancelSearchBtn);
                    Intrinsics.checkExpressionValueIsNotNull(textView, "contentView.cancelSearchBtn");
                    View view2 = this.f13666a.f13458b;
                    Intrinsics.checkExpressionValueIsNotNull(view2, "contentView");
                    ImageView imageView = (ImageView) view2.findViewById(R.id.clearSearchIcon);
                    Intrinsics.checkExpressionValueIsNotNull(imageView, "contentView.clearSearchIcon");
                    dVar.mo18170a(true, textView, imageView);
                    C4535b bVar2 = this.f13666a.f13651f;
                    if (bVar2 != null && bVar2.mo17787l()) {
                        C4533g g = bVar2.mo17779g(bVar2.mo17780g());
                        if (g != null) {
                            eFieldType = g.mo17752i();
                        }
                        if (eFieldType == EFieldType.TEXT) {
                            LinkRecordPickerPanel dVar2 = this.f13666a;
                            View view3 = dVar2.f13458b;
                            Intrinsics.checkExpressionValueIsNotNull(view3, "contentView");
                            RelativeLayout relativeLayout = (RelativeLayout) view3.findViewById(R.id.addNewRecordBtn);
                            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "contentView.addNewRecordBtn");
                            dVar2.mo18170a(true, relativeLayout);
                            View view4 = this.f13666a.f13458b;
                            Intrinsics.checkExpressionValueIsNotNull(view4, "contentView");
                            TextView textView2 = (TextView) view4.findViewById(R.id.newRecordTV);
                            Intrinsics.checkExpressionValueIsNotNull(textView2, "contentView.newRecordTV");
                            textView2.setText(charSequence.toString());
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            View view5 = this.f13666a.f13458b;
            LinkRecordPickerPanel dVar3 = this.f13666a;
            RelativeLayout relativeLayout2 = (RelativeLayout) view5.findViewById(R.id.addNewRecordBtn);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "addNewRecordBtn");
            TextView textView3 = (TextView) view5.findViewById(R.id.cancelSearchBtn);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "cancelSearchBtn");
            ImageView imageView2 = (ImageView) view5.findViewById(R.id.clearSearchIcon);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "clearSearchIcon");
            dVar3.mo18170a(false, relativeLayout2, textView3, imageView2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordPickerPanel$initView$1$4", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.e.d$h */
    public static final class C4623h extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ LinkRecordPickerPanel f13671a;

        C4623h(LinkRecordPickerPanel dVar) {
            this.f13671a = dVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            if (i == 1) {
                this.f13671a.mo17982f();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordPickerPanel$setOnActionListener$1", "Lcom/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordPickerPanel$RecordAdapter$OnSelectListener;", "onSelectedItemsChanged", "", "recordId", "", "isChecked", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.e.d$k */
    public static final class C4626k implements RecordAdapter.OnSelectListener {

        /* renamed from: a */
        final /* synthetic */ LinkRecordPickerPanel f13674a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4626k(LinkRecordPickerPanel dVar) {
            this.f13674a = dVar;
        }

        @Override // com.bytedance.ee.bear.bitable.card.view.cell.link.LinkRecordPickerPanel.RecordAdapter.OnSelectListener
        /* renamed from: a */
        public void mo18182a(String str, boolean z) {
            OnActionListener bVar = this.f13674a.f13652g;
            if (bVar != null) {
                bVar.mo18150a(str, z);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a
    /* renamed from: a */
    public View mo17972a(Context context) {
        View view = this.f13458b;
        Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
        return view;
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordPickerPanel$DefaultSpan;", "Landroid/text/style/CharacterStyle;", "()V", "updateDrawState", "", "tp", "Landroid/text/TextPaint;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.e.d$a */
    public static final class DefaultSpan extends CharacterStyle {
        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "tp");
            textPaint.setTypeface(Typeface.DEFAULT);
            textPaint.setStyle(Paint.Style.FILL);
        }
    }

    /* renamed from: a */
    public final void mo18171a(String[] strArr) {
        Intrinsics.checkParameterIsNotNull(strArr, "selectedRecordIds");
        RecordAdapter cVar = this.f13655j;
        if (cVar != null) {
            cVar.mo18180a(strArr);
            cVar.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordPickerPanel$TableNameSpan;", "Landroid/text/style/CharacterStyle;", "()V", "updateDrawState", "", "tp", "Landroid/text/TextPaint;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.e.d$d */
    public static final class TableNameSpan extends CharacterStyle {
        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "tp");
            textPaint.setTypeface(Typeface.DEFAULT);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            textPaint.setStrokeWidth(1.0f);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordPickerPanel$initView$1$2"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.e.d$f */
    public static final class View$OnClickListenerC4621f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View f13667a;

        /* renamed from: b */
        final /* synthetic */ LinkRecordPickerPanel f13668b;

        View$OnClickListenerC4621f(View view, LinkRecordPickerPanel dVar) {
            this.f13667a = view;
            this.f13668b = dVar;
        }

        public final void onClick(View view) {
            ((EditText) this.f13667a.findViewById(R.id.searchEditText)).setText("");
            this.f13668b.mo17982f();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.e.d$j */
    public static final class View$OnClickListenerC4625j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View f13673a;

        View$OnClickListenerC4625j(View view) {
            this.f13673a = view;
        }

        public final void onClick(View view) {
            ((EditText) this.f13673a.findViewById(R.id.searchEditText)).setText("");
        }
    }

    public LinkRecordPickerPanel(Context context) {
        super(context);
        this.f13458b = LayoutInflater.from(context).inflate(R.layout.bitable_card_link_picker_panel, (ViewGroup) null);
        m19198j();
        m19199k();
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a
    /* renamed from: a */
    public void mo17974a(int i) {
        super.mo17974a(i);
        if (i > 0) {
            mo18173h().mo17962a(true);
        }
        mo18174i();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordPickerPanel$initView$1$3", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.e.d$g */
    public static final class C4622g extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ View f13669a;

        /* renamed from: b */
        final /* synthetic */ LinkRecordPickerPanel f13670b;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            OnActionListener bVar = this.f13670b.f13652g;
            if (bVar != null) {
                EditText editText = (EditText) this.f13669a.findViewById(R.id.searchEditText);
                Intrinsics.checkExpressionValueIsNotNull(editText, "searchEditText");
                bVar.mo18151b(editText.getText().toString());
            }
            ((EditText) this.f13669a.findViewById(R.id.searchEditText)).setText("");
            this.f13670b.mo17982f();
            this.f13670b.f13653h = true;
        }

        C4622g(View view, LinkRecordPickerPanel dVar) {
            this.f13669a = view;
            this.f13670b = dVar;
        }
    }

    /* renamed from: a */
    private final void m19196a(String str) {
        String a = C10539a.m43639a(mo17981e(), R.string.Bitable_Relation_From, "tableName", str);
        String string = mo17981e().getString(R.string.Bitable_Relation_From);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.Bitable_Relation_From)");
        String str2 = string;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, "{{" + "tableName" + "}}", 0, false, 6, (Object) null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a);
        spannableStringBuilder.setSpan(new DefaultSpan(), 0, a.length(), 33);
        spannableStringBuilder.setSpan(new TableNameSpan(), indexOf$default, str.length() + indexOf$default, 33);
        View view = this.f13458b;
        Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
        ((CellEditDragView) view.findViewById(R.id.dragView)).setTitle(spannableStringBuilder);
    }

    /* renamed from: b */
    public final void mo18172b(String[] strArr) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(strArr, "filteredRecordIds");
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (String str : strArr) {
            List<? extends C4525a> list = this.f13654i;
            if (list != null) {
                List<? extends C4525a> list2 = list;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next().mo17707b());
                }
                z = arrayList2.contains(str);
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(str);
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            String[] strArr2 = (String[]) array;
            RecordAdapter cVar = this.f13655j;
            if (cVar != null) {
                cVar.mo18181b(strArr2);
                cVar.notifyDataSetChanged();
            }
            if (strArr2.length == 0) {
                z2 = true;
            }
            m19197a(z2, R.drawable.illustration_placeholder_common_search_failed);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    public final void mo18168a(C4535b bVar) {
        List<C4525a> list;
        RecordAdapter cVar;
        int i;
        boolean z;
        Intrinsics.checkParameterIsNotNull(bVar, "linkTable");
        m19201m();
        String c = bVar.mo17770c();
        Intrinsics.checkExpressionValueIsNotNull(c, "linkTable.tableName");
        m19196a(c);
        this.f13651f = bVar;
        if (bVar == null || (list = bVar.mo17784i()) == null) {
            list = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            Intrinsics.checkExpressionValueIsNotNull(t2, "it");
            if (t2.mo17713g()) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        this.f13654i = arrayList2;
        boolean isEmpty = arrayList2.isEmpty();
        m19197a(isEmpty, R.drawable.illustration_empty_neutral_no_content);
        if (!isEmpty && (cVar = this.f13655j) != null) {
            List<? extends C4525a> list2 = this.f13654i;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            cVar.mo18179a(list2);
            View view = this.f13458b;
            Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
            EditText editText = (EditText) view.findViewById(R.id.searchEditText);
            Intrinsics.checkExpressionValueIsNotNull(editText, "contentView.searchEditText");
            Editable text = editText.getText();
            if (TextUtils.isEmpty(text)) {
                cVar.notifyDataSetChanged();
                List<? extends C4525a> list3 = this.f13654i;
                if (list3 != null) {
                    i = list3.size();
                } else {
                    i = 0;
                }
                if (!this.f13653h || i <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    View view2 = this.f13458b;
                    Intrinsics.checkExpressionValueIsNotNull(view2, "contentView");
                    ((InterceptTouchRecyclerView) view2.findViewById(R.id.recordListRV)).smoothScrollToPosition(i - 1);
                    this.f13653h = false;
                    return;
                }
                return;
            }
            OnActionListener bVar2 = this.f13652g;
            if (bVar2 != null) {
                bVar2.mo18149a(text.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo18169a(OnActionListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f13652g = bVar;
        RecordAdapter cVar = this.f13655j;
        if (cVar != null) {
            cVar.mo18177a(new C4626k(this));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "onHeightChanged", "com/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordPickerPanel$initView$1$5"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.e.d$i */
    public static final class C4624i implements CellEditDragView.AbstractC4563a {

        /* renamed from: a */
        final /* synthetic */ LinkRecordPickerPanel f13672a;

        C4624i(LinkRecordPickerPanel dVar) {
            this.f13672a = dVar;
        }

        @Override // com.bytedance.ee.bear.bitable.card.view.cell.CellEditDragView.AbstractC4563a
        /* renamed from: a */
        public final void mo17968a(int i, int i2) {
            this.f13672a.mo18174i();
        }
    }

    /* renamed from: a */
    private final void m19197a(boolean z, int i) {
        View view = this.f13458b;
        Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
        SpaceEmptyState spaceEmptyState = (SpaceEmptyState) view.findViewById(R.id.emptyView);
        Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState, "contentView.emptyView");
        mo18170a(z, spaceEmptyState);
        View view2 = this.f13458b;
        Intrinsics.checkExpressionValueIsNotNull(view2, "contentView");
        InterceptTouchRecyclerView interceptTouchRecyclerView = (InterceptTouchRecyclerView) view2.findViewById(R.id.recordListRV);
        Intrinsics.checkExpressionValueIsNotNull(interceptTouchRecyclerView, "contentView.recordListRV");
        mo18170a(!z, interceptTouchRecyclerView);
        View view3 = this.f13458b;
        Intrinsics.checkExpressionValueIsNotNull(view3, "contentView");
        ((SpaceEmptyState) view3.findViewById(R.id.emptyView)).setImageRes(Integer.valueOf(i));
        mo18174i();
    }

    /* renamed from: a */
    public final void mo18167a(int i, int i2) {
        View view = this.f13458b;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.loadingLayout);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "loadingLayout");
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.linkTableContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "linkTableContainer");
        mo18170a(false, frameLayout, linearLayout);
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.invalidTableContainer);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "invalidTableContainer");
        mo18170a(true, frameLayout2);
        ((BearLottieView) view.findViewById(R.id.loadingLottie)).cancelAnimation();
        ((SpaceEmptyState) view.findViewById(R.id.invalidView)).setImageRes(Integer.valueOf(i));
        ((SpaceEmptyState) view.findViewById(R.id.invalidView)).setDesc(view.getContext().getString(i2));
    }
}
