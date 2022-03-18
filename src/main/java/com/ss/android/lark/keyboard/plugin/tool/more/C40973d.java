package com.ss.android.lark.keyboard.plugin.tool.more;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.keyboard.plugin.tool.more.MoreItemsAdapter;
import com.ss.android.lark.ui.BasePopupWindow;
import java.util.List;

/* renamed from: com.ss.android.lark.keyboard.plugin.tool.more.d */
public class C40973d extends BasePopupWindow {

    /* renamed from: a */
    private Context f104189a;

    /* renamed from: b */
    private View f104190b;

    /* renamed from: c */
    private RecyclerView f104191c;

    /* renamed from: d */
    private MoreItemsAdapter f104192d;

    /* renamed from: e */
    private List<IPlusItem> f104193e;

    /* renamed from: f */
    private View f104194f;

    @Override // com.ss.android.lark.ui.BasePopupWindow
    public void dismiss() {
        View view = this.f104194f;
        if (view != null) {
            view.setSelected(false);
        }
        super.dismiss();
    }

    /* renamed from: a */
    private void m162358a() {
        this.f104191c = (RecyclerView) this.f104190b.findViewById(R.id.menu_list);
        MoreItemsAdapter moreItemsAdapter = new MoreItemsAdapter(this.f104189a);
        this.f104192d = moreItemsAdapter;
        moreItemsAdapter.addAll(this.f104193e);
        this.f104192d.mo147638a(new MoreItemsAdapter.AbstractC40968a() {
            /* class com.ss.android.lark.keyboard.plugin.tool.more.C40973d.C409741 */

            @Override // com.ss.android.lark.keyboard.plugin.tool.more.MoreItemsAdapter.AbstractC40968a
            /* renamed from: a */
            public void mo147639a(View view, IPlusItem bVar) {
                C40973d.this.dismiss();
            }
        });
        this.f104191c.setLayoutManager(new LinearLayoutManager(this.f104189a, 1, false));
        this.f104191c.setAdapter(this.f104192d);
    }

    /* renamed from: b */
    public void mo147657b(View view) {
        this.f104194f = view;
    }

    /* renamed from: a */
    public void mo147656a(View view) {
        m162359a(view, UIUtils.dp2px(view.getContext(), 4.0f));
    }

    public C40973d(Context context, List<IPlusItem> list) {
        super(-2, -2);
        View inflate = LayoutInflater.from(context).inflate(R.layout.kb_plus_menu_popup_window, (ViewGroup) null, false);
        this.f104190b = inflate;
        setContentView(inflate);
        setBackgroundDrawable(new ColorDrawable(0));
        setFocusable(true);
        this.f104189a = context;
        this.f104193e = list;
        m162358a();
    }

    /* renamed from: a */
    private void m162359a(View view, int i) {
        int[] a = DesktopUtil.m144302a(view);
        int screenHeight = DeviceUtils.getScreenHeight(view.getContext());
        try {
            showAtLocation(view, 83, (a[0] + (UIUtils.getWidth(view) >> 1)) - (UIUtils.getWidth(this.f104190b) >> 1), (screenHeight - a[1]) + i);
        } catch (Exception unused) {
        }
    }

    @Override // com.ss.android.lark.ui.BasePopupWindow
    public void showAtLocation(View view, int i, int i2, int i3) {
        super.showAtLocation(view, i, i2, i3);
        View view2 = this.f104194f;
        if (view2 != null) {
            view2.setSelected(true);
        }
    }
}
