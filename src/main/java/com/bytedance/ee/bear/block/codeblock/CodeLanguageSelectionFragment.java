package com.bytedance.ee.bear.block.codeblock;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.block.codeblock.CodeLanguageSelectionAdapter;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0019H\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\"\u001a\u00020\u0010H\u0016J\u001a\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u001d2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020'H\u0002J\u0018\u0010(\u001a\u00020\u00102\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010*H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/bytedance/ee/bear/block/codeblock/CodeLanguageSelectionFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "()V", "adapter", "Lcom/bytedance/ee/bear/block/codeblock/CodeLanguageSelectionAdapter;", "noResultsPlaceHolder", "Landroid/widget/TextView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "searchEditText", "Lcom/bytedance/ee/bear/widgets/universedesign/SpaceEditText;", "textWatcher", "Landroid/text/TextWatcher;", "viewModel", "Lcom/bytedance/ee/bear/block/codeblock/CodeBlockViewModel;", "closeCodeLanguageSelectionPanel", "", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateAnimation", "Landroid/view/animation/Animation;", "transit", "", "enter", "nextAnim", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onViewCreated", "view", "searchKeyWord", "keyWord", "", "updateNoResultsPlaceHolder", "currentCodeLanguageList", "", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.block.codeblock.c */
public final class CodeLanguageSelectionFragment extends C7667e {

    /* renamed from: a */
    public CodeBlockViewModel f14413a;

    /* renamed from: b */
    public RecyclerView f14414b;

    /* renamed from: c */
    public CodeLanguageSelectionAdapter f14415c;

    /* renamed from: d */
    private SpaceEditText f14416d;

    /* renamed from: e */
    private TextWatcher f14417e;

    /* renamed from: f */
    private TextView f14418f;

    /* renamed from: g */
    private HashMap f14419g;

    /* renamed from: b */
    public void mo19234b() {
        HashMap hashMap = this.f14419g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo19234b();
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        mo19231a();
        return true;
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onDestroy() {
        super.onDestroy();
        mo19231a();
    }

    /* renamed from: a */
    public final void mo19231a() {
        CodeBlockViewModel aVar = this.f14413a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        aVar.isShowingCodeLanguageSelectionPanel().mo5929b((Boolean) false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.block.codeblock.c$a */
    static final class View$OnClickListenerC4900a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CodeLanguageSelectionFragment f14420a;

        View$OnClickListenerC4900a(CodeLanguageSelectionFragment cVar) {
            this.f14420a = cVar;
        }

        public final void onClick(View view) {
            this.f14420a.mo19231a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/block/codeblock/CodeLanguageSelectionFragment$onViewCreated$2", "Lcom/bytedance/ee/bear/block/codeblock/CodeLanguageSelectionAdapter$OnSelectedChangeListener;", "onSelectCodeLanguage", "", "codeLanguage", "", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.block.codeblock.c$b */
    public static final class C4901b implements CodeLanguageSelectionAdapter.OnSelectedChangeListener {

        /* renamed from: a */
        final /* synthetic */ CodeLanguageSelectionFragment f14421a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4901b(CodeLanguageSelectionFragment cVar) {
            this.f14421a = cVar;
        }

        @Override // com.bytedance.ee.bear.block.codeblock.CodeLanguageSelectionAdapter.OnSelectedChangeListener
        /* renamed from: a */
        public void mo19226a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "codeLanguage");
            CodeLanguageSelectionFragment.m20195a(this.f14421a).getOnSelectCodeLanguage().mo5929b(str);
            this.f14421a.mo19231a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/bytedance/ee/bear/block/codeblock/CodeLanguageSelectionFragment$onViewCreated$4", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.block.codeblock.c$d */
    public static final class C4904d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ CodeLanguageSelectionFragment f14425a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "s");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4904d(CodeLanguageSelectionFragment cVar) {
            this.f14425a = cVar;
        }

        public void afterTextChanged(Editable editable) {
            Intrinsics.checkParameterIsNotNull(editable, "s");
            this.f14425a.mo19232a(editable.toString());
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ CodeBlockViewModel m20195a(CodeLanguageSelectionFragment cVar) {
        CodeBlockViewModel aVar = cVar.f14413a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ CodeLanguageSelectionAdapter m20196b(CodeLanguageSelectionFragment cVar) {
        CodeLanguageSelectionAdapter bVar = cVar.f14415c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        return bVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ RecyclerView m20197c(CodeLanguageSelectionFragment cVar) {
        RecyclerView recyclerView = cVar.f14414b;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }
        return recyclerView;
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC1142af a = C4950k.m20474a(this, CodeBlockViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "PluginViewModelProviders…ockViewModel::class.java)");
        this.f14413a = (CodeBlockViewModel) a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/block/codeblock/CodeLanguageData;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.block.codeblock.c$c */
    static final class C4902c<T> implements AbstractC1178x<CodeLanguageData> {

        /* renamed from: a */
        final /* synthetic */ CodeLanguageSelectionFragment f14422a;

        C4902c(CodeLanguageSelectionFragment cVar) {
            this.f14422a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(final CodeLanguageData codeLanguageData) {
            List<String> list;
            String str;
            CodeLanguageSelectionAdapter b = CodeLanguageSelectionFragment.m20196b(this.f14422a);
            List<String> list2 = null;
            if (codeLanguageData != null) {
                list = codeLanguageData.getList();
            } else {
                list = null;
            }
            b.mo19225a(list);
            CodeLanguageSelectionAdapter b2 = CodeLanguageSelectionFragment.m20196b(this.f14422a);
            if (codeLanguageData != null) {
                str = codeLanguageData.getValue();
            } else {
                str = null;
            }
            b2.mo19224a(str);
            CodeLanguageSelectionFragment.m20197c(this.f14422a).post(new Runnable(this) {
                /* class com.bytedance.ee.bear.block.codeblock.CodeLanguageSelectionFragment.C4902c.RunnableC49031 */

                /* renamed from: a */
                final /* synthetic */ C4902c f14423a;

                {
                    this.f14423a = r1;
                }

                public final void run() {
                    int i;
                    List<String> list;
                    RecyclerView.LayoutManager layoutManager = CodeLanguageSelectionFragment.m20197c(this.f14423a.f14422a).getLayoutManager();
                    if (!(layoutManager instanceof LinearLayoutManager)) {
                        layoutManager = null;
                    }
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    if (linearLayoutManager != null) {
                        CodeLanguageData codeLanguageData = codeLanguageData;
                        if (codeLanguageData == null || (list = codeLanguageData.getList()) == null) {
                            i = 0;
                        } else {
                            i = CollectionsKt.indexOf((List) list, (Object) codeLanguageData.getValue());
                        }
                        linearLayoutManager.scrollToPositionWithOffset(i, this.f14423a.f14422a.getResources().getDimensionPixelSize(R.dimen.code_language_selection_item_height) * 2);
                    }
                }
            });
            CodeLanguageSelectionFragment cVar = this.f14422a;
            if (codeLanguageData != null) {
                list2 = codeLanguageData.getList();
            }
            cVar.mo19233a(list2);
        }
    }

    /* renamed from: a */
    public final void mo19233a(List<String> list) {
        int i;
        TextView textView = this.f14418f;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("noResultsPlaceHolder");
        }
        if (list == null || list.isEmpty()) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo19232a(String str) {
        List<String> list;
        CodeBlockViewModel aVar = this.f14413a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        CodeLanguageData b = aVar.getCodeLanguageData().mo5927b();
        if (b != null) {
            list = b.getList();
        } else {
            list = null;
        }
        if (!(list == null || list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : list) {
                if (StringsKt.contains((CharSequence) str2, (CharSequence) str, true)) {
                    arrayList.add(str2);
                }
            }
            CodeLanguageSelectionAdapter bVar = this.f14415c;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            bVar.mo19225a(arrayList);
            CodeLanguageSelectionAdapter bVar2 = this.f14415c;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            bVar2.notifyDataSetChanged();
            mo19233a(arrayList);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.close_icon).setOnClickListener(new View$OnClickListenerC4900a(this));
        View findViewById = view.findViewById(R.id.no_results_place_holder);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.no_results_place_holder)");
        this.f14418f = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.select_code_languages_rv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.select_code_languages_rv)");
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        this.f14414b = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        CodeLanguageSelectionAdapter bVar = new CodeLanguageSelectionAdapter();
        this.f14415c = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        bVar.mo19222a(new C4901b(this));
        RecyclerView recyclerView2 = this.f14414b;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }
        CodeLanguageSelectionAdapter bVar2 = this.f14415c;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        recyclerView2.setAdapter(bVar2);
        CodeBlockViewModel aVar = this.f14413a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        aVar.getCodeLanguageData().mo5923a(this, new C4902c(this));
        View findViewById3 = view.findViewById(R.id.search_et);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.search_et)");
        SpaceEditText spaceEditText = (SpaceEditText) findViewById3;
        this.f14416d = spaceEditText;
        if (spaceEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchEditText");
        }
        C13747j.m55726a(spaceEditText, (int) R.color.ud_N100);
        this.f14417e = new C4904d(this);
        SpaceEditText spaceEditText2 = this.f14416d;
        if (spaceEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchEditText");
        }
        TextWatcher textWatcher = this.f14417e;
        if (textWatcher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textWatcher");
        }
        spaceEditText2.addTextChangedListener(textWatcher);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.code_language_selection_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        int i3;
        Context context = getContext();
        if (z) {
            i3 = R.anim.actionsheet_anim_enter;
        } else {
            i3 = R.anim.actionsheet_anim_exit;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(context, i3);
        Intrinsics.checkExpressionValueIsNotNull(loadAnimation, "AnimationUtils.loadAnima…im.actionsheet_anim_exit)");
        return loadAnimation;
    }
}
