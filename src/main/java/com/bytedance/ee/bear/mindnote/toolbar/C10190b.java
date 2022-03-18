package com.bytedance.ee.bear.mindnote.toolbar;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.doc.toolbar.DocItemId;
import com.bytedance.ee.bear.document.toolbar.AbstractC6208d;
import com.bytedance.ee.bear.document.toolbar.AbstractC6212e;
import com.bytedance.ee.bear.document.toolbar.Item;
import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.bytedance.ee.bear.document.toolbar.media.impl.C6236a;
import com.bytedance.ee.bear.document.toolbar.media.impl.C6238c;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.edit.component.toolbar2.HorizontalOverScrollView;
import com.bytedance.ee.bear.fileselector.FileSelectFragment;
import com.bytedance.ee.bear.fileselector.FileSelectorManager;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import kotlin.jvm.functions.Function0;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.mindnote.toolbar.b */
public class C10190b extends AbstractC6208d<MindNoteToolbar> {

    /* renamed from: g */
    static final /* synthetic */ boolean f27486g = true;

    /* renamed from: h */
    private View f27487h;

    /* renamed from: i */
    private HorizontalOverScrollView f27488i;

    /* renamed from: j */
    private HorizontalOverScrollView.AbstractC7602a f27489j;

    /* renamed from: k */
    private C6238c f27490k;

    /* renamed from: lambda$9ZCV0MRe-qp0xdMc4AmYiY8idgc  reason: not valid java name */
    public static /* synthetic */ void m269875lambda$9ZCV0MReqp0xdMc4AmYiY8idgc(C10190b bVar, int i, int i2) {
        bVar.m42423a(i, i2);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6208d
    /* renamed from: a */
    public void mo25097a(int i) {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ DefinitionParameters m42425c() {
        return new DefinitionParameters(this);
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6208d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f27488i.mo29918b(this.f27489j);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6208d
    /* renamed from: a */
    public void mo25096a() {
        if (mo22140a(getActivity()).getToolbar().mo5927b() == null) {
            super.mo25096a();
        }
    }

    /* renamed from: b */
    private void m42424b() {
        int i = 0;
        int measuredWidth = this.f27488i.getChildAt(0).getMeasuredWidth() - this.f27488i.getMeasuredWidth();
        View view = this.f27487h;
        if (measuredWidth <= this.f27488i.getScrollX()) {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.mindnote.toolbar.b$1 */
    public static /* synthetic */ class C101911 {

        /* renamed from: a */
        static final /* synthetic */ int[] f27491a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 133
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.mindnote.toolbar.C10190b.C101911.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6208d
    /* renamed from: a */
    public int mo22139a(ItemId itemId) {
        return m42422a((MindNoteItemId) itemId);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6208d
    /* renamed from: a */
    public AbstractC6212e mo22140a(FragmentActivity fragmentActivity) {
        return (AbstractC6212e) aj.m5366a(fragmentActivity).mo6005a(C10192c.class);
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6208d
    /* renamed from: c */
    public void mo25104c(ItemId itemId) {
        FragmentActivity activity = getActivity();
        if (DocItemId.insertImage.name().equals(itemId.name())) {
            C6238c cVar = this.f27490k;
            cVar.showInsertImageSelectorPanel(activity, cVar.getDefaultBuilder(activity).mo30475m(false), "MindNoteToolbarFragment");
        } else {
            super.mo25104c(itemId);
        }
        if (activity != null && C13749l.m55763g(activity)) {
            ((C10192c) mo22140a(activity)).setIsShowingSubToolBar(f27486g);
            C10548d.m43696a((Context) activity);
        }
    }

    /* renamed from: a */
    private static int m42422a(MindNoteItemId mindNoteItemId) {
        switch (C101911.f27491a[mindNoteItemId.ordinal()]) {
            case 1:
                return R.drawable.ud_icon_reduce_indentation_outlined;
            case 2:
                return R.drawable.ud_icon_increase_indentation_outlined;
            case 3:
                return R.drawable.ud_icon_todo_outlined;
            case 4:
                return R.drawable.ud_icon_at_outlined;
            case 5:
                return R.drawable.ud_icon_edit_discription_outlined;
            case 6:
                return R.drawable.ud_icon_image_outlined;
            case 7:
                return R.drawable.ud_icon_textstyle_outlined;
            case 8:
                return R.drawable.ud_icon_add_comment_outlined;
            case 9:
                return R.drawable.ud_icon_undo_outlined;
            case 10:
                return R.drawable.ud_icon_redo_outlined;
            case 11:
                return R.drawable.ud_icon_delete_trash_outlined;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6208d
    /* renamed from: b */
    public Class<? extends DialogInterface$OnCancelListenerC1021b> mo22141b(ItemId itemId) {
        if (itemId == MindNoteItemId.mnAttribute) {
            return C10193d.class;
        }
        if (itemId == MindNoteItemId.insertImage) {
            return C6236a.class;
        }
        throw new IllegalStateException("get subToolbarFragmentClass on:" + itemId);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6208d
    /* renamed from: a */
    public void mo25102a(boolean z) {
        super.mo25102a(z);
        ((C10192c) mo22140a(getActivity())).setIsShowingSubToolBar(false);
        FragmentActivity activity = getActivity();
        if (f27486g || activity != null) {
            for (Fragment fragment : activity.getSupportFragmentManager().getFragments()) {
                if (fragment instanceof FileSelectFragment) {
                    FileSelectorManager.m31233a(activity.getSupportFragmentManager(), "MindNoteToolbarFragment");
                }
            }
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    private /* synthetic */ void m42423a(int i, int i2) {
        m42424b();
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6208d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        BearUrl bearUrl;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            bearUrl = (BearUrl) arguments.getParcelable("bear_url");
            str = arguments.getString("origin_bear_url");
        } else {
            str = null;
            bearUrl = null;
        }
        ((C10189a) KoinJavaComponent.m268612a(C10189a.class, null, new Function0() {
            /* class com.bytedance.ee.bear.mindnote.toolbar.$$Lambda$b$D6XLcvca_t3Sx_i_9GzKlGrEGlo */

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C10190b.this.m42425c();
            }
        })).mo38952a("ccm_bottom_toolbar_view", bearUrl, str);
        this.f27490k = (C6238c) aj.m5366a(getActivity()).mo6005a(C6238c.class);
        this.f27487h = view.findViewById(R.id.mark);
        this.f27488i = (HorizontalOverScrollView) view.findViewById(R.id.horizontal_scroll_view);
        $$Lambda$b$9ZCV0MReqp0xdMc4AmYiY8idgc r5 = new HorizontalOverScrollView.AbstractC7602a() {
            /* class com.bytedance.ee.bear.mindnote.toolbar.$$Lambda$b$9ZCV0MReqp0xdMc4AmYiY8idgc */

            @Override // com.bytedance.ee.bear.edit.component.toolbar2.HorizontalOverScrollView.AbstractC7602a
            public final void onScrollChanged(int i, int i2) {
                C10190b.m269875lambda$9ZCV0MReqp0xdMc4AmYiY8idgc(C10190b.this, i, i2);
            }
        };
        this.f27489j = r5;
        this.f27488i.mo29917a(r5);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6208d
    /* renamed from: a */
    public void mo25098a(Item item, View view) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.toolbarItemImg);
        appCompatImageView.setBackgroundTintList(getResources().getColorStateList(R.color.mindnote_toolbar_item_background_tint));
        appCompatImageView.setImageTintList(getResources().getColorStateList(R.color.toolbar_item_tint));
        super.mo25098a(item, view);
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6208d, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.mindnote_toolbar_fragment, viewGroup, false);
    }
}
