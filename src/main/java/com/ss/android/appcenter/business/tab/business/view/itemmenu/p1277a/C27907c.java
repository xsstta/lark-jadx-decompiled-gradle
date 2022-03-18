package com.ss.android.appcenter.business.tab.business.view.itemmenu.p1277a;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.tab.business.blockit.BlockitView;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1277a.C27909d;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1278b.C27917b;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1278b.C27918c;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1278b.C27919d;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27921a;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27924d;
import com.ss.android.appcenter.business.tab.fragmentv3.component.header.CommonHeader;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.appcenter.engine.vlayout.VirtualLayoutManager;

/* renamed from: com.ss.android.appcenter.business.tab.business.view.itemmenu.a.c */
public class C27907c {
    /* renamed from: a */
    public static void m101868a(VirtualLayoutManager virtualLayoutManager, boolean z) {
        virtualLayoutManager.mo100689a(z);
    }

    /* renamed from: a */
    public static void m101864a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        int a = C28209p.m103291a(16.0f);
        int top = viewHolder.itemView.getTop();
        int bottom = viewHolder.itemView.getBottom();
        int height = recyclerView.getHeight();
        if (bottom - top > height - (a * 2)) {
            recyclerView.scrollBy(0, top - a);
        } else if (top < a) {
            recyclerView.scrollBy(0, top - a);
        } else {
            int i = bottom + a;
            if (height < i) {
                recyclerView.scrollBy(0, i - height);
            }
        }
    }

    /* renamed from: a */
    public static void m101867a(final C27917b bVar, final Context context, final C27909d dVar) {
        if (bVar != null) {
            View view = bVar.f69800a;
            if (view.getWidth() == 0) {
                view.post(new Runnable() {
                    /* class com.ss.android.appcenter.business.tab.business.view.itemmenu.p1277a.C27907c.RunnableC279081 */

                    public void run() {
                        C27907c.m101867a(bVar, context, dVar);
                    }
                });
                return;
            }
            C27918c cVar = new C27918c(context);
            cVar.setMainTargetHollow(bVar);
            dVar.mo99506a(cVar);
        }
    }

    /* renamed from: a */
    public static void m101865a(BlockitView blockitView, Fragment fragment, ItemInfo itemInfo, boolean z, boolean z2, int i, C27909d.AbstractC27912a aVar, C27924d.AbstractC27927a aVar2) {
        if (fragment == null || fragment.getActivity() == null) {
            C28184h.m103248b("BlockMenuHelper", "open>>>fragment or activity is null.");
        } else {
            m101866a(blockitView, fragment.getActivity(), itemInfo, z, z2, i, aVar, aVar2);
        }
    }

    /* renamed from: a */
    public static void m101866a(BlockitView blockitView, FragmentActivity fragmentActivity, ItemInfo itemInfo, boolean z, boolean z2, int i, C27909d.AbstractC27912a aVar, C27924d.AbstractC27927a aVar2) {
        if (!C27909d.f69770e) {
            C27909d.f69770e = true;
            Context context = blockitView.getContext();
            C27909d dVar = new C27909d(fragmentActivity);
            C27917b bVar = new C27917b(blockitView);
            bVar.f69800a = blockitView;
            if (i != 0) {
                bVar.f69804e = i - C28209p.m103291a(8.0f);
            }
            int a = C28209p.m103291a(4.0f);
            Rect rect = new Rect(a, a, a, a);
            if (!blockitView.mo99224a() && blockitView.mo99259h()) {
                rect.top += CommonHeader.m102627a(false);
            }
            bVar.mo99528a(rect);
            bVar.mo99529a(new C27919d(blockitView.getRoundCorner()));
            C27906b blockMenuEntity = blockitView.getBlockMenuEntity();
            blockMenuEntity.f69760a.clear();
            blockMenuEntity.f69765f = null;
            if (z) {
                blockMenuEntity.f69760a.add(C27921a.m101923a(context));
                blockMenuEntity.f69760a.add(C27921a.m101925b(context));
            } else if (z2) {
                blockMenuEntity.f69760a.add(C27924d.m101944a(context, itemInfo.getItemId(), aVar2));
                blockMenuEntity.f69760a.add(C27924d.m101942a(context, aVar2));
            }
            if (blockMenuEntity.mo99501c()) {
                blockMenuEntity.f69765f = C27924d.m101943a(context, blockMenuEntity.f69764e);
            }
            dVar.f69772b = blockitView.mo99224a();
            dVar.f69773c = blockitView.mo99259h();
            dVar.f69774d = blockMenuEntity;
            dVar.mo99505a(aVar);
            C27710b.m101262a(blockitView.getAppName(), blockitView.getAppId(), blockitView.getBlkTypeId(), blockitView.getBlkId(), blockMenuEntity.mo99503e());
            m101867a(bVar, fragmentActivity, dVar);
        }
    }
}
