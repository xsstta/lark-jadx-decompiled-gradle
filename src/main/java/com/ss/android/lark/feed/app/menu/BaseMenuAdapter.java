package com.ss.android.lark.feed.app.menu;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.feed.app.menu.entity.MenuItem;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseMenuAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    protected List<MenuItem> f96477a = new ArrayList();

    /* renamed from: b */
    protected MenuItem.MenuType f96478b;

    /* renamed from: c */
    protected Context f96479c;

    /* renamed from: d */
    protected AbstractC37634a f96480d;

    /* renamed from: e */
    protected View.OnClickListener f96481e = new View.OnClickListener() {
        /* class com.ss.android.lark.feed.app.menu.BaseMenuAdapter.View$OnClickListenerC376321 */

        public void onClick(View view) {
            if (BaseMenuAdapter.this.f96480d != null) {
                BaseMenuAdapter.this.f96480d.mo138050a(view, ((Integer) view.getTag()).intValue());
            }
        }
    };

    /* renamed from: com.ss.android.lark.feed.app.menu.BaseMenuAdapter$a */
    public interface AbstractC37634a {
        /* renamed from: a */
        void mo138050a(View view, int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f96477a.size();
    }

    public class MenuViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private MenuViewHolder f96484a;

        @Override // butterknife.Unbinder
        public void unbind() {
            MenuViewHolder menuViewHolder = this.f96484a;
            if (menuViewHolder != null) {
                this.f96484a = null;
                menuViewHolder.mLabelTV = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public MenuViewHolder_ViewBinding(MenuViewHolder menuViewHolder, View view) {
            this.f96484a = menuViewHolder;
            menuViewHolder.mLabelTV = (TextView) Utils.findRequiredViewAsType(view, R.id.label, "field 'mLabelTV'", TextView.class);
        }
    }

    /* renamed from: com.ss.android.lark.feed.app.menu.BaseMenuAdapter$2 */
    static /* synthetic */ class C376332 {

        /* renamed from: a */
        static final /* synthetic */ int[] f96483a;

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
                com.ss.android.lark.feed.app.menu.entity.MenuItem$MenuType[] r0 = com.ss.android.lark.feed.app.menu.entity.MenuItem.MenuType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.feed.app.menu.BaseMenuAdapter.C376332.f96483a = r0
                com.ss.android.lark.feed.app.menu.entity.MenuItem$MenuType r1 = com.ss.android.lark.feed.app.menu.entity.MenuItem.MenuType.INBOX     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.feed.app.menu.BaseMenuAdapter.C376332.f96483a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.feed.app.menu.entity.MenuItem$MenuType r1 = com.ss.android.lark.feed.app.menu.entity.MenuItem.MenuType.DONE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.feed.app.menu.BaseMenuAdapter.C376332.f96483a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.feed.app.menu.entity.MenuItem$MenuType r1 = com.ss.android.lark.feed.app.menu.entity.MenuItem.MenuType.FILTER_ALL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.feed.app.menu.BaseMenuAdapter.C376332.f96483a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.feed.app.menu.entity.MenuItem$MenuType r1 = com.ss.android.lark.feed.app.menu.entity.MenuItem.MenuType.FILTER_MESSAGE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.feed.app.menu.BaseMenuAdapter.C376332.f96483a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.feed.app.menu.entity.MenuItem$MenuType r1 = com.ss.android.lark.feed.app.menu.entity.MenuItem.MenuType.FILTER_DOC     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.lark.feed.app.menu.BaseMenuAdapter.C376332.f96483a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.lark.feed.app.menu.entity.MenuItem$MenuType r1 = com.ss.android.lark.feed.app.menu.entity.MenuItem.MenuType.FILTER_SECRET     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.ss.android.lark.feed.app.menu.BaseMenuAdapter.C376332.f96483a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.ss.android.lark.feed.app.menu.entity.MenuItem$MenuType r1 = com.ss.android.lark.feed.app.menu.entity.MenuItem.MenuType.FILTER_CROSS_TENANT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = com.ss.android.lark.feed.app.menu.BaseMenuAdapter.C376332.f96483a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.ss.android.lark.feed.app.menu.entity.MenuItem$MenuType r1 = com.ss.android.lark.feed.app.menu.entity.MenuItem.MenuType.FILTER_THREAD     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.feed.app.menu.BaseMenuAdapter.C376332.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo138045a(AbstractC37634a aVar) {
        this.f96480d = aVar;
    }

    protected static class MenuViewHolder extends RecyclerView.ViewHolder {
        @BindView(6527)
        public TextView mLabelTV;

        MenuViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* renamed from: a */
    public void mo138046a(MenuItem.MenuType menuType) {
        this.f96478b = menuType;
    }

    /* renamed from: a */
    public void mo138047a(List<MenuItem> list) {
        this.f96477a = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo138044a(MenuViewHolder menuViewHolder, MenuItem.MenuType menuType) {
        int i = C376332.f96483a[menuType.ordinal()];
        int i2 = R.drawable.feed_drawer_icon_inbox_bg_selector;
        switch (i) {
            case 2:
                i2 = R.drawable.feed_drawer_icon_done_bg_selector;
                break;
            case 3:
                i2 = R.drawable.feed_drawer_icon_all_bg_selector;
                break;
            case 4:
                i2 = R.drawable.feed_drawer_icon_message_bg_selector;
                break;
            case 5:
                i2 = R.drawable.feed_drawer_icon_doc_bg_selector;
                break;
            case 6:
                i2 = R.drawable.feed_drawer_icon_secret_bg_selector;
                break;
            case 7:
                i2 = R.drawable.feed_drawer_icon_cross_tenant_bg_selector;
                break;
            case 8:
                i2 = R.drawable.feed_drawer_icon_thread_bg_selector;
                break;
        }
        ((ImageView) menuViewHolder.itemView.findViewById(R.id.icon)).setImageResource(i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo138048b(MenuViewHolder menuViewHolder, MenuItem.MenuType menuType) {
        int i;
        switch (C376332.f96483a[menuType.ordinal()]) {
            case 1:
                i = R.string.Lark_Legacy_FeedDrawerInboxLabel;
                break;
            case 2:
                i = R.string.Lark_Legacy_FeedDrawerDoneLabel;
                break;
            case 3:
                i = R.string.Lark_Legacy_SidebarFilterAll;
                break;
            case 4:
                i = R.string.Lark_Legacy_SidebarFilterChat;
                break;
            case 5:
                i = R.string.Lark_Legacy_FeedDrawerDocLabel;
                break;
            case 6:
                i = R.string.Lark_Legacy_SecretChatLabel;
                break;
            case 7:
                i = R.string.Lark_Legacy_SidebarFilterExternal;
                break;
            case 8:
                i = R.string.Lark_Chat_Topic_InFilter;
                break;
            default:
                i = R.string.Lark_Legacy_UnknownDrawer;
                break;
        }
        menuViewHolder.mLabelTV.setText(i);
    }
}
