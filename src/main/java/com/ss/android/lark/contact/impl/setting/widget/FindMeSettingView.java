package com.ss.android.lark.contact.impl.setting.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.larksuite.component.ignition.widget.setting_group.SettingGroupLayout;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.impl.statistics.PrivacyHitPoint;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import java.util.ArrayList;
import java.util.List;

public class FindMeSettingView extends SettingGroupLayout {

    /* renamed from: a */
    public AbstractC36073a f93225a;

    /* renamed from: b */
    private List<C36074a> f93226b = new ArrayList();

    /* renamed from: c */
    private List<SwitchSettingView> f93227c = new ArrayList();

    /* renamed from: com.ss.android.lark.contact.impl.setting.widget.FindMeSettingView$a */
    public interface AbstractC36073a {
        /* renamed from: a */
        void mo132426a(String str, boolean z);
    }

    /* renamed from: a */
    private void m141462a() {
        setOrientation(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.contact.impl.setting.widget.FindMeSettingView$2 */
    public static /* synthetic */ class C360722 {

        /* renamed from: a */
        static final /* synthetic */ int[] f93230a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.contact.impl.setting.service.entity.WayToFindMeSettingItem$FindMeType[] r0 = com.ss.android.lark.contact.impl.setting.service.entity.WayToFindMeSettingItem.FindMeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.contact.impl.setting.widget.FindMeSettingView.C360722.f93230a = r0
                com.ss.android.lark.contact.impl.setting.service.entity.WayToFindMeSettingItem$FindMeType r1 = com.ss.android.lark.contact.impl.setting.service.entity.WayToFindMeSettingItem.FindMeType.EMAIL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.contact.impl.setting.widget.FindMeSettingView.C360722.f93230a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.contact.impl.setting.service.entity.WayToFindMeSettingItem$FindMeType r1 = com.ss.android.lark.contact.impl.setting.service.entity.WayToFindMeSettingItem.FindMeType.MOBILE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.contact.impl.setting.widget.FindMeSettingView.C360722.<clinit>():void");
        }
    }

    /* renamed from: b */
    private void m141464b() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f93226b.size(); i++) {
            final C36074a aVar = this.f93226b.get(i);
            SwitchSettingView switchSettingView = new SwitchSettingView(getContext());
            switchSettingView.mo132636a(aVar.f93237b, aVar.f93238c, aVar.f93239d);
            switchSettingView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                /* class com.ss.android.lark.contact.impl.setting.widget.FindMeSettingView.C360711 */

                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    if (FindMeSettingView.this.f93225a != null) {
                        FindMeSettingView.this.f93225a.mo132426a(aVar.f93236a, z);
                    }
                    FindMeSettingView.this.mo132630a(aVar, z);
                }
            });
            arrayList.add(switchSettingView);
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            if (DesktopUtil.m144301a(getContext())) {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams.height = getContext().getResources().getDimensionPixelSize(R.dimen.mine_setting_item_height_desktop);
                if (i == 0 && this.f93226b.size() == 1) {
                    switchSettingView.setBackgroundResource(R.drawable.settings_item_bg_desktop_selector);
                } else if (i == 0) {
                    switchSettingView.setBackgroundResource(R.drawable.settings_item_bg_desktop_upper_selector);
                } else if (i == this.f93226b.size() - 1) {
                    switchSettingView.setBackgroundResource(R.drawable.settings_item_bg_desktop_lower_selector);
                } else {
                    switchSettingView.setBackgroundResource(R.drawable.item_bg_selector_c11);
                }
            }
            if (marginLayoutParams != null) {
                addView(switchSettingView, marginLayoutParams);
            } else {
                addView(switchSettingView);
            }
        }
        this.f93227c = arrayList;
    }

    public void setOnCheckedChangeListener(AbstractC36073a aVar) {
        this.f93225a = aVar;
    }

    /* renamed from: a */
    private void m141463a(List<C36074a> list) {
        this.f93226b.clear();
        this.f93226b.addAll(list);
        m141464b();
    }

    public FindMeSettingView(Context context) {
        super(context);
        m141462a();
    }

    public void setInfo(List<C36074a> list) {
        if (list != null) {
            if (CollectionUtils.isEmpty(this.f93226b)) {
                m141463a(list);
            } else {
                m141465b(list);
            }
        }
    }

    /* renamed from: b */
    private void m141465b(List<C36074a> list) {
        if (list.size() == this.f93226b.size()) {
            for (int i = 0; i < list.size(); i++) {
                this.f93227c.get(i).setInfo(list.get(i));
            }
            this.f93226b = list;
            return;
        }
        removeAllViews();
        m141463a(list);
    }

    public FindMeSettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m141462a();
    }

    /* renamed from: a */
    public void mo132630a(C36074a aVar, boolean z) {
        int i = C360722.f93230a[aVar.f93240e.ordinal()];
        if (i == 1) {
            PrivacyHitPoint.f92909a.mo132208a("email", z);
        } else if (i != 2) {
            PrivacyHitPoint.f92909a.mo132208a("unknown", z);
        } else {
            PrivacyHitPoint.f92909a.mo132208a("mobile", z);
        }
    }

    /* renamed from: a */
    public void mo132631a(String str, boolean z) {
        for (int i = 0; i < this.f93226b.size(); i++) {
            if (TextUtils.equals(this.f93226b.get(i).f93236a, str)) {
                this.f93227c.get(i).setSwitchEnable(z);
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo132632b(String str, boolean z) {
        for (int i = 0; i < this.f93226b.size(); i++) {
            if (TextUtils.equals(this.f93226b.get(i).f93236a, str)) {
                this.f93226b.get(i).f93239d = z;
                this.f93227c.get(i).setChecked(z);
                return;
            }
        }
    }

    public FindMeSettingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m141462a();
    }
}
