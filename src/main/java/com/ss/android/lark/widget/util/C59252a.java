package com.ss.android.lark.widget.util;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector;

/* renamed from: com.ss.android.lark.widget.util.a */
public class C59252a {

    /* renamed from: com.ss.android.lark.widget.util.a$a */
    public interface AbstractC59254a {
        /* renamed from: a */
        int mo31266a();

        /* renamed from: b */
        boolean mo31267b();
    }

    /* renamed from: a */
    public static void m230151a(Context context, final LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout, RecyclerView recyclerView, final AbstractC59254a aVar) {
        if (DesktopUtil.m144307b()) {
            View view = new View(context);
            view.setBackgroundColor(0);
            lKUIPtrClassicFrameLayout.setFooterView(view);
            recyclerView.addOnScrollListener(new RecyclerViewScrollDetector() {
                /* class com.ss.android.lark.widget.util.C59252a.C592531 */

                @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
                public void onScrollStop(int i, int i2) {
                }

                @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
                public void onScrollToBottom() {
                }

                @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
                public void onScrollPassed(int i, int i2) {
                    if (i2 >= aVar.mo31266a() && aVar.mo31267b()) {
                        lKUIPtrClassicFrameLayout.autoLoadMore();
                    }
                }
            });
        }
    }
}
