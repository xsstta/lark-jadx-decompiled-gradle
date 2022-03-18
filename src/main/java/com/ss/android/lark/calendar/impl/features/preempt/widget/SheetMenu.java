package com.ss.android.lark.calendar.impl.features.preempt.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.airbnb.lottie.LottieAnimationView;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.preempt.model.SheetItemData;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.ArrayList;
import java.util.Iterator;

public class SheetMenu extends BaseDialog {

    /* renamed from: a */
    public LottieAnimationView f82493a;

    /* renamed from: b */
    public TextView f82494b;

    /* renamed from: c */
    public AbstractC32254a f82495c;

    /* renamed from: d */
    public SheetItemData f82496d;

    /* renamed from: e */
    public long f82497e;

    /* renamed from: f */
    private RecyclerView f82498f;

    /* renamed from: g */
    private FrameLayout f82499g;

    /* renamed from: h */
    private C32255b f82500h;

    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.widget.SheetMenu$a */
    public interface AbstractC32254a {
        /* renamed from: a */
        void mo117893a();

        /* renamed from: a */
        void mo117894a(SheetItemData bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.widget.SheetMenu$b */
    public static class C32255b extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* renamed from: a */
        public AbstractC32257a f82504a;

        /* renamed from: b */
        private Context f82505b;

        /* renamed from: c */
        private ArrayList<SheetItemData> f82506c = new ArrayList<>();

        /* access modifiers changed from: protected */
        /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.widget.SheetMenu$b$a */
        public interface AbstractC32257a {
            /* renamed from: a */
            void mo117902a(SheetItemData bVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return (long) i;
        }

        /* renamed from: a */
        public ArrayList<SheetItemData> mo117905a() {
            return this.f82506c;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f82506c.size();
        }

        /* renamed from: a */
        public void mo117906a(AbstractC32257a aVar) {
            this.f82504a = aVar;
        }

        /* renamed from: a */
        public SheetItemData mo117904a(int i) {
            return this.f82506c.get(i);
        }

        public C32255b(Context context) {
            this.f82505b = context;
            setHasStableIds(true);
        }

        /* renamed from: a */
        public void mo117907a(ArrayList<SheetItemData> arrayList) {
            this.f82506c = arrayList;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new MenuViewHolder(LayoutInflater.from(this.f82505b).inflate(R.layout.item_preempt_sheet_menu, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            MenuViewHolder menuViewHolder = (MenuViewHolder) viewHolder;
            SheetItemData a = mo117904a(i);
            menuViewHolder.mMenuItemContainer.setTag(a);
            if (a.mo117877d()) {
                menuViewHolder.mMenuIcon.setVisibility(0);
            } else {
                menuViewHolder.mMenuIcon.setVisibility(8);
            }
            menuViewHolder.mMenuItemTv.setText(a.mo117876c());
            menuViewHolder.mMenuItemContainer.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.calendar.impl.features.preempt.widget.SheetMenu.C32255b.View$OnClickListenerC322561 */

                public void onClick(View view) {
                    if (C32255b.this.f82504a != null) {
                        SheetItemData bVar = (SheetItemData) view.getTag();
                        Iterator<SheetItemData> it = C32255b.this.mo117905a().iterator();
                        while (it.hasNext()) {
                            it.next().mo117873a(false);
                        }
                        bVar.mo117873a(true);
                        C32255b.this.f82504a.mo117902a(bVar);
                        C32255b.this.notifyDataSetChanged();
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public void mo117900b() {
        this.f82498f.scrollToPosition(0);
    }

    public void onBackPressed() {
        AbstractC32254a aVar = this.f82495c;
        if (aVar != null) {
            aVar.mo117893a();
        }
        super.onBackPressed();
    }

    public class MenuViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private MenuViewHolder f82503a;

        @Override // butterknife.Unbinder
        public void unbind() {
            MenuViewHolder menuViewHolder = this.f82503a;
            if (menuViewHolder != null) {
                this.f82503a = null;
                menuViewHolder.mMenuContainer = null;
                menuViewHolder.mMenuItemContainer = null;
                menuViewHolder.mMenuItemTv = null;
                menuViewHolder.mMenuIcon = null;
                menuViewHolder.mDivider = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public MenuViewHolder_ViewBinding(MenuViewHolder menuViewHolder, View view) {
            this.f82503a = menuViewHolder;
            menuViewHolder.mMenuContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.itemContainer, "field 'mMenuContainer'", LinearLayout.class);
            menuViewHolder.mMenuItemContainer = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.menuItemContainer, "field 'mMenuItemContainer'", RelativeLayout.class);
            menuViewHolder.mMenuItemTv = (TextView) Utils.findRequiredViewAsType(view, R.id.menuItemTv, "field 'mMenuItemTv'", TextView.class);
            menuViewHolder.mMenuIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.menuItemBtn, "field 'mMenuIcon'", ImageView.class);
            menuViewHolder.mDivider = Utils.findRequiredView(view, R.id.divider, "field 'mDivider'");
        }
    }

    /* renamed from: a */
    public void mo117896a() {
        this.f82493a.setVisibility(8);
        this.f82493a.cancelAnimation();
        this.f82494b.setText(C32634ae.m125182b(R.string.Calendar_Takeover_Action));
    }

    /* renamed from: c */
    private void m123007c() {
        this.f82498f = (RecyclerView) findViewById(R.id.menuList);
        this.f82499g = (FrameLayout) findViewById(R.id.actionContainer);
        this.f82493a = (LottieAnimationView) findViewById(R.id.imRequestLoading);
        this.f82494b = (TextView) findViewById(R.id.actionTv);
        this.f82500h = new C32255b(getContext());
        this.f82498f.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f82498f.setAdapter(this.f82500h);
        this.f82500h.mo117906a(new C32255b.AbstractC32257a() {
            /* class com.ss.android.lark.calendar.impl.features.preempt.widget.SheetMenu.C322521 */

            @Override // com.ss.android.lark.calendar.impl.features.preempt.widget.SheetMenu.C32255b.AbstractC32257a
            /* renamed from: a */
            public void mo117902a(SheetItemData bVar) {
                SheetMenu.this.f82496d = bVar;
                SheetMenu sheetMenu = SheetMenu.this;
                sheetMenu.f82497e = sheetMenu.f82496d.mo117870a();
            }
        });
        this.f82499g.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.preempt.widget.SheetMenu.View$OnClickListenerC322532 */

            public void onClick(View view) {
                if (SheetMenu.this.f82495c != null && SheetMenu.this.f82496d != null) {
                    SheetMenu.this.f82493a.setVisibility(0);
                    SheetMenu.this.f82493a.playAnimation();
                    SheetMenu.this.f82494b.setText(C32634ae.m125182b(R.string.Calendar_Takeover_Takingover));
                    SheetMenu.this.f82495c.mo117894a(SheetMenu.this.f82496d);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo117897a(long j) {
        this.f82497e = j;
    }

    protected static class MenuViewHolder extends RecyclerView.ViewHolder {
        @BindView(9298)
        public View mDivider;
        @BindView(9748)
        public LinearLayout mMenuContainer;
        @BindView(10286)
        public ImageView mMenuIcon;
        @BindView(10287)
        public RelativeLayout mMenuItemContainer;
        @BindView(10288)
        public TextView mMenuItemTv;

        public MenuViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* renamed from: a */
    public void mo117898a(AbstractC32254a aVar) {
        this.f82495c = aVar;
    }

    /* renamed from: a */
    public void mo117899a(ArrayList<SheetItemData> arrayList) {
        ViewGroup.LayoutParams layoutParams = this.f82498f.getLayoutParams();
        if (arrayList.size() > 7) {
            layoutParams.height = C57582a.m223601a(getContext(), 364.0f);
        } else {
            layoutParams.height = C57582a.m223601a(getContext(), (float) (arrayList.size() * 52));
        }
        this.f82498f.setLayoutParams(layoutParams);
        m123006b(arrayList);
        this.f82500h.mo117907a(arrayList);
    }

    /* renamed from: b */
    private void m123006b(ArrayList<SheetItemData> arrayList) {
        if (this.f82497e == 0) {
            Iterator<SheetItemData> it = arrayList.iterator();
            while (it.hasNext()) {
                SheetItemData next = it.next();
                if (next.mo117877d()) {
                    this.f82496d = next;
                    this.f82497e = next.mo117870a();
                    return;
                }
            }
            return;
        }
        Iterator<SheetItemData> it2 = arrayList.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            SheetItemData next2 = it2.next();
            if (next2.mo117870a() == this.f82497e) {
                next2.mo117873a(true);
                z = true;
            } else {
                next2.mo117873a(false);
            }
        }
        if (!z) {
            int size = arrayList.size() - 1;
            arrayList.get(size).mo117873a(true);
            this.f82497e = arrayList.get(size).mo117870a();
        }
    }

    public SheetMenu(Context context, int i) {
        super(context, i);
        setContentView(R.layout.calendar_dialog_preempt_time_menu);
        setCanceledOnTouchOutside(true);
        m123007c();
    }
}
