package com.ss.android.lark.widget.p2932c;

import android.app.Dialog;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.p2932c.C58339d;
import com.ss.android.lark.widget.p2932c.C58348f;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.c.b */
public class C58333b {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.c.b$a */
    public static class C58335a {

        /* renamed from: a */
        public Dialog f143523a;

        /* renamed from: b */
        private C58337c f143524b;

        /* renamed from: a */
        public Dialog mo197559a() {
            return this.f143523a;
        }

        public C58335a(Context context, List<C58339d.C58341a> list) {
            m226186a(context, list);
        }

        /* renamed from: a */
        private void m226186a(Context context, final List<C58339d.C58341a> list) {
            this.f143523a = new BaseDialog(context, R.style.PopDialog);
            View inflate = LayoutInflater.from(context).inflate(R.layout.global_dialog_list_desktop, (ViewGroup) null);
            ListView listView = (ListView) inflate.findViewById(R.id.list_dialog);
            C58337c cVar = new C58337c(context, list);
            this.f143524b = cVar;
            listView.setAdapter((ListAdapter) cVar);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                /* class com.ss.android.lark.widget.p2932c.C58333b.C58335a.C583361 */

                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    ((C58339d.C58341a) list.get(i)).f143533c.onMenuItemClick();
                    if (C58335a.this.f143523a.isShowing()) {
                        C58335a.this.f143523a.dismiss();
                    }
                }
            });
            this.f143523a.setContentView(inflate);
            this.f143523a.setCanceledOnTouchOutside(true);
        }
    }

    /* renamed from: a */
    public static void m226185a(Context context, List<C58339d.C58341a> list, float[] fArr) {
        m226184a(context, list, 53, fArr);
    }

    /* renamed from: a */
    public static void m226183a(Context context, View view, final List<C58339d.C58341a> list) {
        C58348f.C58350a aVar = new C58348f.C58350a(context);
        for (int i = 0; i < list.size(); i++) {
            aVar.mo197584a(i, list.get(i).f143532b, null);
        }
        PopupWindow a = aVar.mo197582a(14.0f).mo197583a(UIHelper.dp2px(10.0f)).mo197586a(context.getDrawable(R.drawable.desktop_menu_with_arror_center_bg)).mo197589b(17).mo197587a(new C58348f.AbstractC58353d() {
            /* class com.ss.android.lark.widget.p2932c.C58333b.C583341 */

            @Override // com.ss.android.lark.widget.p2932c.C58348f.AbstractC58353d
            public void onMenuItemClick(int i, View view) {
                C58339d.AbstractC58343b a = ((C58339d.C58341a) list.get(i)).mo197569a();
                if (a != null) {
                    a.onMenuItemClick();
                }
            }
        }).mo197581a();
        a.setClippingEnabled(false);
        a.showAsDropDown(view, (-((UIUtils.getWidth(a.getContentView()) + (UIUtils.dp2px(context, 12.0f) * 2)) - UIUtils.getWidth(view))) / 2, -UIUtils.dp2px(context, 8.0f));
    }

    /* renamed from: a */
    public static void m226184a(Context context, List<C58339d.C58341a> list, int i, float[] fArr) {
        m226182a(context, i, fArr, new C58335a(context, list).mo197559a());
    }

    /* renamed from: a */
    private static void m226182a(Context context, int i, float[] fArr, Dialog dialog) {
        Window window = dialog.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = i;
        float f = fArr[0];
        float f2 = fArr[1];
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        attributes.horizontalMargin = f / ((float) displayMetrics.widthPixels);
        attributes.verticalMargin = f2 / ((float) displayMetrics.heightPixels);
        window.setAttributes(attributes);
        window.setWindowAnimations(R.style.UtilsAnimBottomFade);
        window.setDimAmount(BitmapDescriptorFactory.HUE_RED);
        dialog.setCanceledOnTouchOutside(true);
        dialog.show();
    }
}
