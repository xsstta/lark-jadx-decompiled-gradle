package com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.structure;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a;
import com.bytedance.ee.bear.document.toolbar.editpanels.C6215b;
import com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFCtrlViewModel;
import com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.structure.C7474a;
import com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.structure.Structure;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.facade.common.AbstractC7710h;
import com.bytedance.ee.bear.facade.common.AbstractC7719m;
import com.bytedance.ee.bear.facade.common.AbstractC7720n;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout;
import com.bytedance.ee.util.p718t.C13747j;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.structure.a */
public class C7474a extends DialogInterface$OnCancelListenerC1021b implements AbstractC7666d, AbstractC7720n {

    /* renamed from: e */
    static final /* synthetic */ boolean f20158e = true;

    /* renamed from: c */
    public AbstractC7479b<Structure> f20159c;

    /* renamed from: d */
    public boolean f20160d;

    /* renamed from: f */
    private AbstractC7719m f20161f;

    /* renamed from: g */
    private C7476a f20162g;

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        mo5513b();
        return f20158e;
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.structure.a$a */
    private class C7476a implements AbstractC6214a {

        /* renamed from: b */
        private C1177w<Boolean> f20165b;

        @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
        public String getPanelName() {
            return "catalog";
        }

        @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
        public void requestNotFocus(Context context) {
        }

        @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
        public boolean shouldNotifyVCKeyboardEvent() {
            return false;
        }

        @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
        public LiveData<Boolean> getActive() {
            if (this.f20165b == null) {
                this.f20165b = new C1177w<>();
            }
            return this.f20165b;
        }

        private C7476a() {
        }

        @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
        public int getPanelHeight(Context context) {
            return C7474a.this.mo29186f();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo29187a(boolean z) {
            C1177w wVar = (C1177w) getActive();
            if (wVar.mo5927b() == null || ((Boolean) wVar.mo5927b()).booleanValue() != z) {
                wVar.mo5929b(Boolean.valueOf(z));
            }
        }

        @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
        public void onBecomeActive(C6215b bVar, AbstractC6214a aVar) {
            bVar.requestUpdateWebContentHeight();
        }

        @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
        public void onBecomeInactive(C6215b bVar, AbstractC6214a aVar) {
            bVar.requestUpdateWebContentHeight();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.structure.a$b */
    public class C7477b extends RecyclerView.Adapter<C7478c> {

        /* renamed from: a */
        Structure f20166a;

        /* renamed from: b */
        LayoutInflater f20167b;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            Structure structure = this.f20166a;
            if (structure == null) {
                return 0;
            }
            return structure.getParagraphCount();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo29189a(Structure structure) {
            this.f20166a = structure;
        }

        private C7477b() {
        }

        /* renamed from: a */
        private Structure.Paragraph m29896a(int i) {
            return this.f20166a.getParagraph(i);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m29897a(Structure.Paragraph paragraph, View view) {
            C7474a.this.f20159c.changeCollapseStatus(paragraph.getHash(), paragraph.collapse);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m29898b(Structure.Paragraph paragraph, View view) {
            C7474a.this.f20159c.setActive(paragraph.getHash());
            C7474a.this.f20159c.scrollTo(paragraph.getHash());
            notifyDataSetChanged();
        }

        /* renamed from: a */
        public C7478c onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (this.f20167b == null) {
                this.f20167b = LayoutInflater.from(viewGroup.getContext());
            }
            return new C7478c(this.f20167b.inflate(R.layout.outline_structure_paragraph, viewGroup, false));
        }

        /* renamed from: a */
        public void onBindViewHolder(C7478c cVar, int i) {
            int i2;
            int i3;
            Typeface typeface;
            int i4;
            Structure.Paragraph a = m29896a(i);
            View view = cVar.f20169a;
            View view2 = cVar.f20170b;
            ImageView imageView = cVar.f20171c;
            TextView textView = cVar.f20172d;
            int i5 = 0;
            if (a.showCollapse) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            if (a.collapse) {
                i3 = R.drawable.doc_structure_paragraph_collapse;
            } else {
                i3 = R.drawable.doc_structure_paragraph_expand;
            }
            imageView.setImageResource(i3);
            C13747j.m55728a(imageView, (int) R.color.icon_n3);
            textView.setText(a.title);
            textView.setSelected(false);
            view2.setSelected(false);
            if (a.level == 1) {
                typeface = Typeface.defaultFromStyle(1);
            } else {
                typeface = Typeface.defaultFromStyle(0);
            }
            textView.setTypeface(typeface);
            boolean equals = C7474a.this.f20159c.getActive().equals(a.getHash());
            textView.setSelected(equals);
            view2.setSelected(equals);
            C7474a aVar = C7474a.this;
            if (equals) {
                i4 = R.color.primary_pri_500;
            } else {
                i4 = 0;
            }
            aVar.mo29185a(imageView, i4);
            if (C7474a.this.f20160d) {
                C25649b.m91857a(textView, LarkFont.BODY0);
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            if (imageView.getVisibility() == 0) {
                i5 = C13749l.m55738a(24);
            }
            layoutParams.width = C13749l.m55738a(12) + ((a.level - 1) * C13749l.m55738a(20)) + i5;
            view.setLayoutParams(layoutParams);
            textView.setOnClickListener(new View.OnClickListener(a) {
                /* class com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.structure.$$Lambda$a$b$cixSE9WPG172AvxG8UOeYGNW4rU */
                public final /* synthetic */ Structure.Paragraph f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    C7474a.C7477b.this.m29898b(this.f$1, view);
                }
            });
            view.setOnClickListener(new View.OnClickListener(a) {
                /* class com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.structure.$$Lambda$a$b$AS1rYJX5uVaZSRbac08Ablubxt4 */
                public final /* synthetic */ Structure.Paragraph f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    C7474a.C7477b.this.m29897a((C7474a.C7477b) this.f$1, (Structure.Paragraph) view);
                }
            });
        }
    }

    /* renamed from: f */
    public int mo29186f() {
        return Math.max((int) (((double) C13749l.m55748b()) * 0.63d), AbstractC10550f.AbstractC10551a.m43717b(getActivity()).mo39936j());
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        AbstractC7719m mVar = this.f20161f;
        if (mVar != null) {
            mVar.mo30101b(this);
            this.f20161f = null;
        }
        this.f20162g.mo29187a(false);
    }

    /* renamed from: g */
    private int m29891g() {
        Structure b;
        String active = this.f20159c.getActive();
        if (TextUtils.isEmpty(active) || (b = this.f20159c.getContent().mo5927b()) == null) {
            return -1;
        }
        int paragraphCount = b.getParagraphCount();
        for (int i = 0; i < paragraphCount; i++) {
            if (b.getParagraph(i).getHash().equals(active)) {
                return i;
            }
        }
        return -1;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog v_ = v_();
        if (v_ == null) {
            window = null;
        } else {
            window = v_.getWindow();
        }
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = mo29186f();
            attributes.gravity = 80;
            attributes.softInputMode = 1;
            attributes.flags |= 264;
            attributes.flags &= -3;
            window.setAttributes(attributes);
            window.setWindowAnimations(R.style.AnimationDialog);
            window.setBackgroundDrawableResource(17170445);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.f20162g.mo29187a(false);
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7720n
    public boolean onTouchStartIntercept(MotionEvent motionEvent) {
        float rawY = motionEvent.getRawY();
        View view = getView();
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (rawY >= ((float) iArr[1])) {
            return false;
        }
        mo5513b();
        return f20158e;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.structure.a$c */
    public static class C7478c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public View f20169a;

        /* renamed from: b */
        public View f20170b;

        /* renamed from: c */
        public ImageView f20171c;

        /* renamed from: d */
        public TextView f20172d;

        C7478c(View view) {
            super(view);
            this.f20169a = view.findViewById(R.id.paragraph_icon_layout);
            this.f20171c = (ImageView) view.findViewById(R.id.paragraph_icon);
            this.f20172d = (TextView) view.findViewById(R.id.paragraph_title);
            this.f20170b = view.findViewById(R.id.structure_layout);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (f20158e || activity != null) {
            this.f20159c = (AbstractC7479b) new C1144ai(getParentFragment()).mo6005a(PDFCtrlViewModel.class);
            C6215b bVar = (C6215b) aj.m5366a(activity).mo6005a(C6215b.class);
            C7476a aVar = new C7476a();
            this.f20162g = aVar;
            bVar.registerEditPanel(this, aVar);
            AbstractC10550f.AbstractC10551a.m43717b(activity).mo39924a(bVar);
            this.f20160d = f20158e;
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public void mo29185a(ImageView imageView, int i) {
        ColorStateList colorStateList;
        if (imageView != null) {
            if (i == 0) {
                colorStateList = null;
            } else {
                colorStateList = getResources().getColorStateList(i);
            }
            imageView.setImageTintList(colorStateList);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        CommonActionPanelLayout commonActionPanelLayout = (CommonActionPanelLayout) view.findViewById(R.id.title_layout);
        commonActionPanelLayout.setTitle(getString(R.string.Doc_Doc_More_Structure));
        commonActionPanelLayout.setOnActionListener(new CommonActionPanelLayout.SimpleActionListener() {
            /* class com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.structure.C7474a.C74751 */

            @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener, com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.SimpleActionListener
            /* renamed from: d */
            public void mo18838d() {
                C7474a.this.mo5513b();
            }
        });
        View findViewById = view.findViewById(R.id.ll_no_data);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        C7477b bVar = new C7477b();
        recyclerView.setAdapter(bVar);
        m29890a(this.f20159c.getContent().mo5927b(), recyclerView, findViewById);
        this.f20159c.getContent().mo5923a(this, new AbstractC1178x(recyclerView, findViewById, bVar) {
            /* class com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.structure.$$Lambda$a$fWofUt0jg9yas1txBNk4ZBGdeI */
            public final /* synthetic */ RecyclerView f$1;
            public final /* synthetic */ View f$2;
            public final /* synthetic */ C7474a.C7477b f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C7474a.this.m29889a(this.f$1, this.f$2, this.f$3, (Structure) obj);
            }
        });
        int g = m29891g();
        if (g >= 0) {
            recyclerView.scrollToPosition(g);
        }
        AbstractC7719m mVar = (AbstractC7719m) AbstractC7710h.C7711a.m30833a(getActivity(), AbstractC7719m.class);
        this.f20161f = mVar;
        if (mVar != null) {
            mVar.mo30100a(this);
        }
        this.f20162g.mo29187a(f20158e);
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40644a(v_());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.outline_structure_fragment, viewGroup, false);
    }

    /* renamed from: a */
    private void m29890a(Structure structure, RecyclerView recyclerView, View view) {
        boolean z;
        int i;
        int i2 = 0;
        if (structure == null || structure.paragraphs == null || structure.paragraphs.length <= 0) {
            z = false;
        } else {
            z = f20158e;
        }
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        if (!z) {
            i2 = 8;
        }
        recyclerView.setVisibility(i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29889a(RecyclerView recyclerView, View view, C7477b bVar, Structure structure) {
        m29890a(structure, recyclerView, view);
        bVar.mo29189a(structure);
        bVar.notifyDataSetChanged();
    }
}
