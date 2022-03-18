package com.ss.android.appcenter.business.tab.business.view.itemmenu.menu;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.activity.appsort.AppSortActivity;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.net.p1271b.C27720a;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter;
import com.ss.android.appcenter.common.adapter.p1288a.C28112d;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import java.util.ArrayList;

public class ItemMenuAdapter extends LarkRecyclerViewBaseAdapter<C28112d, MenuType> {

    /* renamed from: a */
    public AbstractC27933b f69831a;

    /* renamed from: b */
    private String f69832b;

    /* renamed from: c */
    private ItemInfo f69833c;

    /* renamed from: d */
    private AbstractC27932a f69834d;

    /* renamed from: com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter$a */
    public interface AbstractC27932a {
        /* renamed from: c */
        void mo99508c();
    }

    /* renamed from: com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter$b */
    public interface AbstractC27933b {
        /* renamed from: a */
        void mo99568a();

        /* renamed from: b */
        void mo99569b();

        /* renamed from: c */
        void mo99570c();

        /* renamed from: d */
        void mo99571d();
    }

    public enum MenuType {
        RECOMMEND_DISABLE_REMOVE_FROM_COMMON(R.drawable.ud_icon_no_outlined, R.string.OpenPlatform_AppCenter_RemoveFrqBttn, true),
        RECOMMEND_DISABLE_SORT_IN_COMMON(R.drawable.ud_icon_navigate_outlined, R.string.OpenPlatform_AppCenter_SortAppBttn, true),
        DISABLE_SHARE(R.drawable.ud_icon_share_outlined, R.string.OpenPlatform_Share_WorkplaceAppShareBttn, true),
        WIDGET_DISABLE_SHARE(R.drawable.ud_icon_share_outlined, R.string.OpenPlatform_Share_WorkplaceAppShareBttn, true),
        ADD_TO_COMMON(R.drawable.ud_icon_more_add_outlined, R.string.OpenPlatform_AppCenter_SetFrqBttn, false),
        REMOVE_FROM_COMMON(R.drawable.ud_icon_no_outlined, R.string.OpenPlatform_AppCenter_RemoveFrqBttn, false),
        SORT_IN_COMMON(R.drawable.ud_icon_navigate_outlined, R.string.OpenPlatform_AppCenter_SortAppBttn, false),
        SHARE(R.drawable.ud_icon_share_outlined, R.string.OpenPlatform_Share_WorkplaceAppShareBttn, false);
        
        private boolean mMenuDisable;
        private int mMenuIconRes;
        private int mMenuTextRes;

        public int getMenuIconRes() {
            return this.mMenuIconRes;
        }

        public int getMenuTextRes() {
            return this.mMenuTextRes;
        }

        public boolean isDisable() {
            return this.mMenuDisable;
        }

        private MenuType(int i, int i2, boolean z) {
            this.mMenuIconRes = i;
            this.mMenuTextRes = i2;
            this.mMenuDisable = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter$3 */
    public static /* synthetic */ class C279313 {

        /* renamed from: a */
        static final /* synthetic */ int[] f69839a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter$MenuType[] r0 = com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.MenuType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.C279313.f69839a = r0
                com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter$MenuType r1 = com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.MenuType.RECOMMEND_DISABLE_REMOVE_FROM_COMMON     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.C279313.f69839a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter$MenuType r1 = com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.MenuType.RECOMMEND_DISABLE_SORT_IN_COMMON     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.C279313.f69839a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter$MenuType r1 = com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.MenuType.WIDGET_DISABLE_SHARE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.C279313.f69839a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter$MenuType r1 = com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.MenuType.DISABLE_SHARE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.C279313.f69839a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter$MenuType r1 = com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.MenuType.ADD_TO_COMMON     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.C279313.f69839a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter$MenuType r1 = com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.MenuType.REMOVE_FROM_COMMON     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.C279313.f69839a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter$MenuType r1 = com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.MenuType.SORT_IN_COMMON     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.C279313.f69839a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter$MenuType r1 = com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.MenuType.SHARE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.C279313.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo99560a(ItemInfo itemInfo) {
        this.f69833c = itemInfo;
    }

    /* renamed from: a */
    public void mo99561a(AbstractC27932a aVar) {
        this.f69834d = aVar;
    }

    /* renamed from: a */
    public void mo99562a(AbstractC27933b bVar) {
        this.f69831a = bVar;
    }

    /* renamed from: a */
    public void mo99564a(String str) {
        this.f69832b = str;
    }

    /* renamed from: a */
    public C28112d onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C28112d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.workplace_item_menu_action_layout, viewGroup, false));
    }

    /* renamed from: a */
    private void m101962a(Context context, MenuType menuType) {
        int i = C279313.f69839a[menuType.ordinal()];
        if (i == 1) {
            LKUIToast.show(context, (int) R.drawable.appcenter_show_toast_err, context.getString(R.string.OpenPlatform_Share_RecAppUnfavoriteErrToast));
        } else if (i == 2) {
            LKUIToast.show(context, (int) R.drawable.appcenter_show_toast_err, context.getString(R.string.OpenPlatform_Share_RecAppSortErrToast));
        } else if (i == 3) {
            LKUIToast.show(context, (int) R.drawable.appcenter_show_toast_err, context.getString(R.string.OpenPlatform_Share_WidgetNotShareableToast));
        } else if (i != 4) {
            C28184h.m103248b("ItemMenuAdapter", "onDisableItemClick>>> bad disable type. item:" + menuType);
        } else {
            LKUIToast.show(context, (int) R.drawable.appcenter_show_toast_err, context.getString(R.string.OpenPlatform_Share_NotShareableToast));
        }
    }

    /* renamed from: b */
    private void m101964b(final Context context, MenuType menuType) {
        int i = C279313.f69839a[menuType.ordinal()];
        if (i == 5) {
            AbstractC27933b bVar = this.f69831a;
            if (bVar != null) {
                bVar.mo99568a();
            }
            C27720a.m101369a(this.f69832b, new C27720a.AbstractC27723a() {
                /* class com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.C279291 */

                @Override // com.ss.android.appcenter.business.net.p1271b.C27720a.AbstractC27723a
                /* renamed from: a */
                public void mo98302a(boolean z) {
                    if (z) {
                        Context context = context;
                        LKUIToast.show(context, (int) R.drawable.appcenter_ok_img, context.getString(R.string.OpenPlatform_AppCenter_SetFrqSuccessToast));
                        if (ItemMenuAdapter.this.f69831a != null) {
                            ItemMenuAdapter.this.f69831a.mo99571d();
                        }
                    }
                }
            });
        } else if (i == 6) {
            AbstractC27933b bVar2 = this.f69831a;
            if (bVar2 != null) {
                bVar2.mo99569b();
            }
            C27720a.m101370b(this.f69832b, new C27720a.AbstractC27723a() {
                /* class com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.C279302 */

                @Override // com.ss.android.appcenter.business.net.p1271b.C27720a.AbstractC27723a
                /* renamed from: a */
                public void mo98302a(boolean z) {
                    if (z) {
                        Context context = context;
                        LKUIToast.show(context, (int) R.drawable.appcenter_ok_img, context.getString(R.string.OpenPlatform_AppCenter_RemoveFrqSuccessToast));
                        if (ItemMenuAdapter.this.f69831a != null) {
                            ItemMenuAdapter.this.f69831a.mo99571d();
                        }
                    }
                }
            });
        } else if (i == 7) {
            AbstractC27933b bVar3 = this.f69831a;
            if (bVar3 != null) {
                bVar3.mo99570c();
            }
            AppSortActivity.m101111a(context);
        } else if (i == 8) {
            C28184h.m103250d("ItemMenuAdapter", "onItemClick>>> SHARE itemInfo:" + this.f69833c);
            if (TextUtils.isEmpty(this.f69833c.getAppId())) {
                C28184h.m103248b("ItemMenuAdapter", "onItemClick>>> appId is empty");
                return;
            }
            C27710b.m101293e(this.f69833c.getAppId());
            C27548m.m100547m().mo98216a().mo98155a(context, "opshare_workplace_appcard", this.f69833c.getAppId(), this.f69833c.getIconKey(), this.f69833c.getName(), this.f69833c.getDescription());
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(C28112d dVar, int i) {
        int i2;
        MenuType menuType = (MenuType) getItem(i);
        Context context = dVar.itemView.getContext();
        TextView textView = (TextView) dVar.mo100072a(R.id.tv_menu_text);
        textView.setText(menuType.getMenuTextRes());
        boolean isDisable = menuType.isDisable();
        View a = dVar.mo100072a(R.id.bg_wrapper);
        if (!isDisable) {
            a.setBackgroundResource(R.drawable.workplace_item_menu_press_selector);
        }
        if (isDisable) {
            i2 = R.color.icon_disable;
        } else {
            i2 = R.color.icon_n2;
        }
        dVar.mo100073a(R.id.iv_menu_icon, UDIconUtils.getIconDrawable(context, menuType.getMenuIconRes(), UDColorUtils.getColor(context, i2)));
        if (isDisable) {
            textView.setTextColor(UDColorUtils.getColor(context, R.color.text_disable));
        } else {
            textView.setTextColor(UDColorUtils.getColor(context, R.color.text_title));
        }
        dVar.itemView.setOnClickListener(new View.OnClickListener(isDisable, context, menuType) {
            /* class com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.$$Lambda$ItemMenuAdapter$0o5T9qSDrhndi41JujxrtZvTFBw */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ Context f$2;
            public final /* synthetic */ ItemMenuAdapter.MenuType f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onClick(View view) {
                ItemMenuAdapter.this.m101963a(this.f$1, this.f$2, this.f$3, view);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m101963a(boolean z, Context context, MenuType menuType, View view) {
        if (z) {
            m101962a(context, menuType);
            return;
        }
        m101964b(context, menuType);
        this.f69834d.mo99508c();
    }

    /* renamed from: a */
    public static ItemMenuAdapter m101961a(AbstractC27932a aVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, ItemInfo itemInfo, AbstractC27933b bVar) {
        ItemMenuAdapter itemMenuAdapter = new ItemMenuAdapter();
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(MenuType.RECOMMEND_DISABLE_REMOVE_FROM_COMMON);
            arrayList.add(MenuType.RECOMMEND_DISABLE_SORT_IN_COMMON);
        } else {
            if (z2) {
                arrayList.add(MenuType.REMOVE_FROM_COMMON);
            } else {
                arrayList.add(MenuType.ADD_TO_COMMON);
            }
            if (z4) {
                arrayList.add(MenuType.SORT_IN_COMMON);
            }
        }
        if (z3) {
            arrayList.add(MenuType.WIDGET_DISABLE_SHARE);
        } else if (z5) {
            arrayList.add(MenuType.SHARE);
            C27710b.m101289d(itemInfo.getAppId());
        } else {
            arrayList.add(MenuType.DISABLE_SHARE);
        }
        itemMenuAdapter.mo99564a(str);
        itemMenuAdapter.mo99560a(itemInfo);
        itemMenuAdapter.resetAll(arrayList);
        itemMenuAdapter.mo99561a(aVar);
        itemMenuAdapter.mo99562a(bVar);
        return itemMenuAdapter;
    }
}
