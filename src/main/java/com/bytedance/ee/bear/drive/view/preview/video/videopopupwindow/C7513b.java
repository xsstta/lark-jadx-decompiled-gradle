package com.bytedance.ee.bear.drive.view.preview.video.videopopupwindow;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.drive.view.preview.video.videopopupwindow.C7514c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.video.videopopupwindow.b */
public class C7513b {

    /* renamed from: a */
    private String f20289a;

    /* renamed from: b */
    private View f20290b;

    /* renamed from: c */
    private C7514c f20291c;

    /* renamed from: d */
    private ResolutionPopupWindow f20292d;

    /* renamed from: e */
    private Context f20293e;

    /* renamed from: f */
    private boolean f20294f;

    /* renamed from: a */
    public ResolutionPopupWindow mo29342a() {
        return this.f20292d;
    }

    /* renamed from: b */
    public boolean mo29346b() {
        ResolutionPopupWindow resolutionPopupWindow = this.f20292d;
        if (resolutionPopupWindow == null || !resolutionPopupWindow.isShowing()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private String m30069a(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("_")) {
            return str;
        }
        C13479a.m54764b("DRIVE_VideoPlayer", "get resolution");
        String[] split = str.split("_");
        if (split != null) {
            return split[split.length - 1];
        }
        return str;
    }

    /* renamed from: a */
    private List<C7512a> m30070a(List<String> list) {
        if (C13657b.m55421a(list)) {
            C13479a.m54758a("DRIVE_VideoPlayer", "resolution keys list is empty or null");
            return new ArrayList();
        }
        Collections.reverse(list);
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            arrayList.add(new C7512a(str, m30069a(str), TextUtils.equals(this.f20289a, str)));
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m30071a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.drive_horizontal_video_view_resolution_layout, (ViewGroup) null);
        this.f20290b = inflate;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.drive_video_pop_window_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        C7514c cVar = new C7514c();
        this.f20291c = cVar;
        recyclerView.setAdapter(cVar);
    }

    /* renamed from: a */
    public void mo29343a(View view) {
        ResolutionPopupWindow resolutionPopupWindow = this.f20292d;
        if (resolutionPopupWindow == null) {
            C13479a.m54758a("DRIVE_VideoPlayer", "show popup window failed, mPopupWindow == null");
            return;
        }
        int i = 85;
        if (this.f20294f) {
            i = 83;
        }
        resolutionPopupWindow.showAtLocation(view, i, this.f20293e.getResources().getDimensionPixelSize(R.dimen.drive_video_resolution_popup_window_x_position), this.f20293e.getResources().getDimensionPixelSize(R.dimen.drive_video_resolution_popup_window_y_position));
    }

    /* renamed from: a */
    public void mo29345a(boolean z) {
        ResolutionPopupWindow resolutionPopupWindow = new ResolutionPopupWindow();
        this.f20292d = resolutionPopupWindow;
        resolutionPopupWindow.setFocusable(true);
        this.f20292d.setContentView(this.f20290b);
        this.f20292d.setWidth(this.f20293e.getResources().getDimensionPixelSize(R.dimen.drive_video_resolution_popup_window_width));
        this.f20292d.setHeight(-2);
        this.f20294f = z;
        if (z) {
            this.f20290b.setRotation(90.0f);
        }
    }

    public C7513b(Context context, String str) {
        this.f20293e = context;
        this.f20289a = str;
        m30071a(context);
    }

    /* renamed from: a */
    public void mo29344a(List<String> list, C7514c.AbstractC7516a aVar) {
        this.f20291c.mo29350a(m30070a(list));
        this.f20291c.mo29348a(aVar);
    }
}
