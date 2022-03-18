package com.larksuite.component.ignition.widget.setting_group;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.larksuite.component.ignition.widget.setting_group.d */
public final class SettingGroupHelper {

    /* renamed from: a */
    public static final SettingGroupHelper f60019a = new SettingGroupHelper();

    /* renamed from: a */
    public static final void m88812a(RecyclerView recyclerView) {
        m88816a(recyclerView, false, 2, (Object) null);
    }

    private SettingGroupHelper() {
    }

    /* renamed from: a */
    public static final void m88813a(RecyclerView recyclerView, boolean z) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        m88814a(recyclerView, z, R.color.bg_setting_group_item);
    }

    /* renamed from: a */
    public static final void m88814a(RecyclerView recyclerView, boolean z, int i) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            Intrinsics.checkExpressionValueIsNotNull(adapter, "recyclerView.adapter ?: return");
            Context context = recyclerView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "recyclerView.context");
            SettingGroupAdapter aVar = new SettingGroupAdapter(context, adapter);
            aVar.mo87048a(i);
            recyclerView.setAdapter(aVar);
            if (z) {
                Context context2 = recyclerView.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "recyclerView.context");
                recyclerView.addItemDecoration(new SettingGroupDividerItemDecoration(context2));
            }
            int dp2px = UIUtils.dp2px(recyclerView.getContext(), 16.0f);
            recyclerView.setPadding(dp2px, recyclerView.getPaddingTop(), dp2px, recyclerView.getPaddingBottom());
            recyclerView.setOverScrollMode(2);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m88816a(RecyclerView recyclerView, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        m88813a(recyclerView, z);
    }

    /* renamed from: a */
    public static final void m88817a(RecyclerView recyclerView, boolean z, int i, Function1<? super Integer, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        Intrinsics.checkParameterIsNotNull(function1, "isItemStateful");
        m88814a(recyclerView, z, i);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            ((SettingGroupAdapter) adapter).mo87049a(function1);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.ignition.widget.setting_group.SettingGroupAdapter");
    }

    /* renamed from: a */
    public static final void m88815a(RecyclerView recyclerView, boolean z, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            Intrinsics.checkExpressionValueIsNotNull(adapter, "recyclerView.adapter ?: return");
            Context context = recyclerView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "recyclerView.context");
            SettingGroupAdapter aVar = new SettingGroupAdapter(context, adapter);
            aVar.mo87048a(i);
            recyclerView.setAdapter(aVar);
            if (z) {
                Context context2 = recyclerView.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "recyclerView.context");
                SettingGroupDividerItemDecoration cVar = new SettingGroupDividerItemDecoration(context2);
                cVar.mo87060a(UIUtils.getColor(recyclerView.getContext(), i2));
                recyclerView.addItemDecoration(cVar);
            }
            int dp2px = UIUtils.dp2px(recyclerView.getContext(), 16.0f);
            recyclerView.setPadding(dp2px, recyclerView.getPaddingTop(), dp2px, recyclerView.getPaddingBottom());
            recyclerView.setOverScrollMode(2);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m88818a(RecyclerView recyclerView, boolean z, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            i = R.color.bg_setting_group_item;
        }
        m88817a(recyclerView, z, i, (Function1<? super Integer, Boolean>) function1);
    }
}
