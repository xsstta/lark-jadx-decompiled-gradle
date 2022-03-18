package com.ss.android.lark.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.PaintDrawable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.ui.BasePopupWindow;
import com.larksuite.framework.ui.C26174a;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonPopupRecycleAdapter;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.List;

/* renamed from: com.ss.android.lark.ui.d */
public class C57590d {
    /* renamed from: a */
    public static PopupWindow m223633a(View view, View view2, int i, List<CommonPopupRecycleAdapter.ListItem> list, CommonPopupRecycleAdapter.AbstractC57564a aVar) {
        return m223635b(view, view2, i, list, aVar);
    }

    /* renamed from: a */
    private static void m223634a(final PopupWindow popupWindow, Context context, RecyclerView recyclerView, List<CommonPopupRecycleAdapter.ListItem> list, final CommonPopupRecycleAdapter.AbstractC57564a aVar) {
        RecyclerView.AbstractC1335d a = new C26174a.C26176a(context).mo93148a(R.dimen.default_divider_height).mo93151b(R.dimen.default_divider_padding).mo93154e(R.color.lkui_N300).mo93149a();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        linearLayoutManager.setAutoMeasureEnabled(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(a);
        CommonPopupRecycleAdapter commonPopupRecycleAdapter = new CommonPopupRecycleAdapter(context, list);
        recyclerView.setAdapter(commonPopupRecycleAdapter);
        commonPopupRecycleAdapter.mo195425a(new CommonPopupRecycleAdapter.AbstractC57564a() {
            /* class com.ss.android.lark.ui.C57590d.C575955 */

            @Override // com.ss.android.lark.ui.CommonPopupRecycleAdapter.AbstractC57564a
            /* renamed from: a */
            public void mo102289a(View view, int i) {
                CommonPopupRecycleAdapter.AbstractC57564a aVar = aVar;
                if (aVar != null) {
                    aVar.mo102289a(view, i);
                    PopupWindow popupWindow = popupWindow;
                    if (popupWindow != null) {
                        popupWindow.dismiss();
                    }
                }
            }
        });
    }

    /* renamed from: b */
    private static PopupWindow m223635b(final View view, View view2, final int i, List<CommonPopupRecycleAdapter.ListItem> list, CommonPopupRecycleAdapter.AbstractC57564a aVar) {
        if (view == null || view2 == null) {
            return null;
        }
        final Context context = view.getContext();
        final View inflate = LayoutInflater.from(context).inflate(R.layout.common_popup_list_layout, (ViewGroup) null);
        inflate.setFocusable(true);
        inflate.setFocusableInTouchMode(true);
        final BasePopupWindow basePopupWindow = new BasePopupWindow(inflate, -1, -1, true);
        m223634a(basePopupWindow, context, (RecyclerView) inflate.findViewById(R.id.popuplist), list, aVar);
        basePopupWindow.setAnimationStyle(R.style.CommonAnimTopRight);
        basePopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            /* class com.ss.android.lark.ui.C57590d.C575911 */

            public void onDismiss() {
                C57582a.m223605a((Activity) context, 1.0f, null);
            }
        });
        try {
            basePopupWindow.showAtLocation(view2, 17, 0, 0);
            C57582a.m223605a((Activity) context, 0.69f, C57582a.m223614c(context, R.drawable.common_black_c1_rect_a30_bg));
        } catch (Throwable unused) {
        }
        basePopupWindow.setFocusable(true);
        basePopupWindow.setBackgroundDrawable(new PaintDrawable());
        int[] iArr = new int[2];
        view2.getLocationInWindow(iArr);
        final int a = C57582a.m223601a(context, 15.0f) + iArr[1];
        final int a2 = C57582a.m223601a(context, -90.0f) + iArr[0];
        final LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.popup_window_layout);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C57582a.m223601a(context, 130.0f), -2);
        layoutParams.setMargins(a2, a, 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        inflate.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.ui.C57590d.View$OnClickListenerC575922 */

            public void onClick(View view) {
                PopupWindow popupWindow = basePopupWindow;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                }
            }
        });
        inflate.setOnKeyListener(new View.OnKeyListener() {
            /* class com.ss.android.lark.ui.C57590d.View$OnKeyListenerC575933 */

            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i != 4) {
                    return false;
                }
                PopupWindow popupWindow = basePopupWindow;
                if (popupWindow == null) {
                    return true;
                }
                popupWindow.dismiss();
                return true;
            }
        });
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.lark.ui.C57590d.ViewTreeObserver$OnGlobalLayoutListenerC575944 */

            public void onGlobalLayout() {
                int height = a + ((inflate.getHeight() - view.getHeight()) - i);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.setMargins(a2, height, 0, 0);
                linearLayout.setLayoutParams(layoutParams);
                inflate.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        return basePopupWindow;
    }
}
