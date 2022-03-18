package com.ss.android.lark.share.impl.systemshare;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.share.impl.systemshare.c */
public class C54764c extends BaseAdapter {

    /* renamed from: a */
    private Context f135238a;

    /* renamed from: b */
    private List<String> f135239b;

    /* renamed from: c */
    private int f135240c;

    /* renamed from: d */
    private int f135241d;

    /* renamed from: e */
    private IRequestCreator f135242e;

    public long getItemId(int i) {
        return (long) i;
    }

    public int getCount() {
        return this.f135239b.size();
    }

    /* renamed from: a */
    private void m212496a() {
        int i;
        if (DesktopUtil.m144301a(this.f135238a)) {
            i = this.f135240c;
        } else {
            i = DeviceUtils.getScreenWidth(this.f135238a);
        }
        this.f135241d = (i - UIUtils.dp2px(this.f135238a, 45.0f)) / 3;
    }

    /* renamed from: com.ss.android.lark.share.impl.systemshare.c$a */
    private class C54766a {

        /* renamed from: a */
        SelectableRoundedImageView f135243a;

        private C54766a() {
        }
    }

    /* renamed from: a */
    public void mo186924a(List<String> list) {
        if (CollectionUtils.isEmpty(list)) {
            list = new ArrayList<>();
        }
        this.f135239b = list;
    }

    /* renamed from: a */
    public String getItem(int i) {
        if (i >= 0 || i <= this.f135239b.size()) {
            return this.f135239b.get(i);
        }
        return null;
    }

    public C54764c(Context context, int i) {
        this.f135238a = context;
        this.f135240c = i;
        this.f135242e = ImageLoader.with(context);
        m212496a();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        C54766a aVar;
        if (view == null) {
            aVar = new C54766a();
            view2 = LayoutInflater.from(this.f135238a).inflate(R.layout.activity_share_content_image_item, (ViewGroup) null);
            view2.setTag(aVar);
        } else {
            view2 = view;
            aVar = (C54766a) view.getTag();
        }
        aVar.f135243a = (SelectableRoundedImageView) view2.findViewById(R.id.share_image);
        SelectableRoundedImageView selectableRoundedImageView = aVar.f135243a;
        int i2 = this.f135241d;
        selectableRoundedImageView.setLayoutParams(new LinearLayout.LayoutParams(i2, i2));
        this.f135242e.load(this.f135239b.get(i)).placeholder(R.drawable.ud_icon_nopicture_filled).error(R.drawable.ud_icon_loadfail_filled).into(aVar.f135243a);
        return view2;
    }
}
