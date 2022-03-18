package com.bytedance.ee.bear.sheet.tab.view;

import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.ComponentCallbacks2C2126g;
import com.bytedance.ee.bear.sheet.tab.contract.ISheetTabAdapter;
import com.bytedance.ee.bear.sheet.tab.jsdata.SheetTabItem;
import com.bytedance.ee.bear.sheet.tab.view.C11313a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p703f.C13664a;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13743h;
import com.bytedance.ee.util.p718t.C13749l;
import com.chad.library.adapter.base.AbstractC20916a;
import com.chad.library.adapter.base.C20923c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: com.bytedance.ee.bear.sheet.tab.view.a */
public class C11313a extends AbstractC20916a<SheetTabItem, C11314a> implements ISheetTabAdapter, C13743h.AbstractC13745b<SheetTabItem> {

    /* renamed from: a */
    public C11316b f30422a;

    /* renamed from: b */
    public ISheetTabAdapter.OnSheetTabItemActionListener f30423b;

    /* renamed from: c */
    public boolean f30424c = true;

    public C11313a() {
        super(R.layout.sheet_tab_item, new ArrayList());
    }

    /* renamed from: com.bytedance.ee.bear.sheet.tab.view.a$a */
    public class C11314a extends C20923c {

        /* renamed from: a */
        C11316b f30425a;

        /* renamed from: b */
        public long f30426b;

        /* renamed from: e */
        private void m47029e() {
            if (this.f30425a.f30430a != null && C11313a.this.f30423b != null) {
                C11313a.this.f30423b.mo43316a(this.f30425a.f30430a);
            }
        }

        /* renamed from: a */
        public void mo43422a() {
            if (this.f30425a.f30430a != null) {
                if (this.f30425a.f30430a.getSelected()) {
                    mo43425c();
                } else {
                    mo43424b();
                }
            }
        }

        /* renamed from: b */
        public void mo43424b() {
            if (this.f30425a.f30430a != null && !this.f30425a.f30430a.getSelected()) {
                m47029e();
                m47028d();
            }
        }

        /* renamed from: c */
        public void mo43425c() {
            if (this.f30425a.f30430a != null && C11313a.this.f30423b != null) {
                if (!this.f30425a.f30430a.getSelected()) {
                    C11313a.this.f30423b.mo43316a(this.f30425a.f30430a);
                }
                C11313a.this.f30423b.mo43319b(this.f30425a.f30430a);
            }
        }

        /* renamed from: d */
        private void m47028d() {
            if (this.f30425a.f30430a.isEnabled()) {
                int i = -1;
                if (!(C11313a.this.f30422a == null || C11313a.this.f30422a.f30430a == null)) {
                    C11313a.this.f30422a.f30430a.setSelected(false);
                    i = C11313a.this.mo70673b().indexOf(C11313a.this.f30422a.f30430a);
                }
                this.f30425a.f30430a.setSelected(true);
                C11313a.this.f30422a = this.f30425a;
                int indexOf = C11313a.this.mo70673b().indexOf(this.f30425a.f30430a);
                if (indexOf >= 0) {
                    C13742g.m55705a(new Runnable(indexOf) {
                        /* class com.bytedance.ee.bear.sheet.tab.view.$$Lambda$a$a$bN8K8KpIN4UaI3V3v9ku1_YY3w */
                        public final /* synthetic */ int f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C11313a.C11314a.m269960lambda$bN8K8KpIN4UaI3V3v9ku1_YY3w(C11313a.C11314a.this, this.f$1);
                        }
                    });
                }
                if (i >= 0) {
                    C13742g.m55705a(new Runnable(i) {
                        /* class com.bytedance.ee.bear.sheet.tab.view.$$Lambda$a$a$rkISVt5jw2Q8JUDtJfzucasTlas */
                        public final /* synthetic */ int f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C11313a.C11314a.lambda$rkISVt5jw2Q8JUDtJfzucasTlas(C11313a.C11314a.this, this.f$1);
                        }
                    });
                }
            }
        }

        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m47026a(int i) {
            C11313a.this.notifyItemChanged(i);
        }

        /* access modifiers changed from: public */
        /* renamed from: c */
        private /* synthetic */ void m47027c(int i) {
            C11313a.this.notifyItemChanged(i);
        }

        /* renamed from: a */
        public void mo43423a(SheetTabItem sheetTabItem) {
            this.f30426b = SystemClock.uptimeMillis();
            this.f30425a.mo43429a(sheetTabItem, C11313a.this.f30424c);
            if (sheetTabItem.getSelected()) {
                C11313a.this.f30422a = this.f30425a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C11314a(View view) {
            super(view);
            C11313a.this = r4;
            this.f30425a = new C11316b(view);
            View$OnTouchListenerC11319d dVar = new View$OnTouchListenerC11319d();
            dVar.mo43433a(new GestureDetector(view.getContext(), new GestureDetector.SimpleOnGestureListener() {
                /* class com.bytedance.ee.bear.sheet.tab.view.C11313a.C11314a.C113151 */

                public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                    if (motionEvent.getEventTime() > C11314a.this.f30426b) {
                        C11314a.this.mo43422a();
                        return true;
                    }
                    C13479a.m54772d("SheetTabAdapter", "bindTime is later than eventTime, ignore it...");
                    return true;
                }

                public boolean onDoubleTapEvent(MotionEvent motionEvent) {
                    boolean z;
                    if (motionEvent.getAction() == 1) {
                        if (motionEvent.getEventTime() > C11314a.this.f30426b) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            C11314a.this.mo43425c();
                        } else {
                            C13479a.m54772d("SheetTabAdapter", "bindTime is later than eventTime，ignore it...");
                        }
                    }
                    return true;
                }
            }));
            mo70736a(R.id.sheet_tab_item_layout, dVar);
        }
    }

    /* renamed from: a */
    public void mo43416a(ISheetTabAdapter.OnSheetTabItemActionListener aVar) {
        this.f30423b = aVar;
    }

    /* renamed from: com.bytedance.ee.bear.sheet.tab.view.a$b */
    public static class C11316b {

        /* renamed from: a */
        public SheetTabItem f30430a;

        /* renamed from: b */
        private View f30431b;

        /* renamed from: c */
        private ImageView f30432c;

        /* renamed from: d */
        private ImageView f30433d;

        /* renamed from: e */
        private ImageView f30434e;

        /* renamed from: f */
        private TextView f30435f;

        /* renamed from: a */
        public void mo43428a(SheetTabItem sheetTabItem) {
            this.f30430a = sheetTabItem;
            this.f30431b.setTag(sheetTabItem);
        }

        /* renamed from: b */
        public void mo43431b(boolean z) {
            this.f30435f.setEnabled(z);
        }

        public C11316b(View view) {
            this.f30432c = (ImageView) view.findViewById(R.id.iv_locked_sheet);
            this.f30435f = (TextView) view.findViewById(R.id.tv_sheet_name);
            this.f30433d = (ImageView) view.findViewById(R.id.iv_manage_sheet);
            this.f30431b = view.findViewById(R.id.sheet_tab_item_layout);
            this.f30434e = (ImageView) view.findViewById(R.id.iv_custom_icon);
        }

        /* renamed from: a */
        public void mo43430a(boolean z) {
            float f;
            View view = this.f30431b;
            if (z) {
                f = 10.0f;
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            view.setElevation(f);
            this.f30431b.setSelected(z);
            this.f30432c.setSelected(z);
            this.f30435f.setSelected(z);
            this.f30433d.setSelected(z);
            this.f30434e.setSelected(z);
        }

        /* renamed from: a */
        public void mo43429a(SheetTabItem sheetTabItem, boolean z) {
            int i;
            int i2;
            String str;
            mo43428a(sheetTabItem);
            this.f30435f.setText(sheetTabItem.getName());
            this.f30435f.setMaxWidth((int) (((double) C13749l.m55736a()) * 0.3d));
            ImageView imageView = this.f30432c;
            int i3 = 8;
            int i4 = 0;
            if (sheetTabItem.isLocked()) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            ImageView imageView2 = this.f30433d;
            if (!sheetTabItem.getSelected() || !z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            imageView2.setVisibility(i2);
            if (sheetTabItem.getCustomIcon() != null) {
                SheetTabItem.CustomIcon customIcon = sheetTabItem.getCustomIcon();
                if (customIcon.getType() == 1) {
                    this.f30434e.setImageResource(R.drawable.icon_sheet_thirdsheet_selector);
                } else if (customIcon.getType() == 0 && customIcon.isValidIconUrl()) {
                    ComponentCallbacks2C2126g c = ComponentCallbacks2C2115c.m9151c(this.f30434e.getContext());
                    if (sheetTabItem.getSelected()) {
                        str = customIcon.getSelectedUrl();
                    } else {
                        str = customIcon.getUnselectedUrl();
                    }
                    c.mo10414a(new C13664a(str)).mo10399a(this.f30434e);
                }
                i3 = 0;
            }
            this.f30434e.setVisibility(i3);
            if (i3 == 0) {
                i4 = C13749l.m55738a(2);
            }
            ViewGroup.LayoutParams layoutParams = this.f30432c.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i4;
                this.f30432c.setLayoutParams(layoutParams);
            }
            mo43430a(sheetTabItem.getSelected());
            mo43431b(sheetTabItem.isEnabled());
        }
    }

    @Override // com.chad.library.adapter.base.AbstractC20916a
    /* renamed from: a */
    public void mo43415a(RecyclerView.ViewHolder viewHolder) {
        super.mo43415a(viewHolder);
        if (viewHolder instanceof C11314a) {
            ((C11314a) viewHolder).mo43424b();
        }
    }

    /* renamed from: a */
    public void mo43418a(ArrayList<SheetTabItem> arrayList) {
        C1374g.C1377b a = C1374g.m6298a(new C13743h(mo70673b(), arrayList, this), true);
        mo70690f(arrayList);
        a.mo7412a(this);
    }

    /* renamed from: a */
    public void mo43419a(boolean z) {
        this.f30424c = z;
    }

    /* renamed from: a */
    public void mo16806a(C11314a aVar, SheetTabItem sheetTabItem) {
        aVar.mo43423a(sheetTabItem);
    }

    /* renamed from: b */
    public boolean mo34853b(SheetTabItem sheetTabItem, SheetTabItem sheetTabItem2) {
        return SheetTabItem.contentEquals(sheetTabItem, sheetTabItem2);
    }

    /* renamed from: a */
    public boolean mo34851a(SheetTabItem sheetTabItem, SheetTabItem sheetTabItem2) {
        return Objects.equals(sheetTabItem, sheetTabItem2);
    }
}
