package com.bytedance.ee.bear.list.homepage.title;

import android.content.Context;
import android.util.SparseArray;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.homepage.title.b */
public class C8504b {

    /* renamed from: a */
    private Context f22993a;

    /* renamed from: b */
    private SparseArray<C8503a> f22994b = new SparseArray<>();

    /* renamed from: b */
    public C8503a mo33243b() {
        C8503a aVar = this.f22994b.get(0);
        if (aVar != null) {
            return aVar;
        }
        C8503a aVar2 = new C8503a();
        aVar2.mo33240a(m35247a(R.drawable.ud_icon_search_outlined));
        this.f22994b.put(0, aVar2);
        return aVar2;
    }

    /* renamed from: a */
    public C8503a mo33242a() {
        C8503a aVar = this.f22994b.get(1);
        if (aVar != null) {
            return aVar;
        }
        C8503a aVar2 = new C8503a();
        FrameLayout a = m35247a(R.drawable.ud_icon_addnew_outlined);
        a.setId(R.id.list_main_menu_add);
        aVar2.mo33240a(a);
        this.f22994b.put(1, aVar2);
        return aVar2;
    }

    public C8504b(Context context) {
        this.f22993a = context;
    }

    /* renamed from: a */
    private FrameLayout m35247a(int i) {
        FrameLayout frameLayout = new FrameLayout(this.f22993a);
        ImageView imageView = new ImageView(this.f22993a);
        imageView.setId(R.id.list_function_button_image);
        imageView.setImageDrawable(this.f22993a.getResources().getDrawable(i));
        frameLayout.addView(imageView, -2, -2);
        return frameLayout;
    }
}
