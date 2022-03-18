package com.ss.android.lark.contact.feat.contact_recommend.mvp.list;

import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.button.LKUIButton;
import com.ss.android.lark.contact.feat.common.ItemCell;
import com.ss.android.lark.contact.feat.contact_recommend.entity.EmptyData;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/list/EmptyItemCell;", "Lcom/ss/android/lark/contact/feat/common/ItemCell;", "Lcom/ss/android/lark/contact/feat/contact_recommend/entity/EmptyData;", "Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/list/EmptyViewHolder;", "callback", "Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/list/EmptyItemCallback;", "(Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/list/EmptyItemCallback;)V", "onBindCellViewHolder", "", "holder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "position", "", "onCreateCellViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.feat.a.b.a.e */
public final class EmptyItemCell extends ItemCell<EmptyData, EmptyViewHolder> {

    /* renamed from: a */
    public final EmptyItemCallback f91533a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/feat/contact_recommend/mvp/list/EmptyItemCell$onBindCellViewHolder$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.feat.a.b.a.e$a */
    public static final class C35417a extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ EmptyItemCell f91534a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35417a(EmptyItemCell eVar) {
            this.f91534a = eVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f91534a.f91533a.mo130666a();
        }
    }

    public EmptyItemCell(EmptyItemCallback dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "callback");
        this.f91533a = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0045, code lost:
        if (r4 != null) goto L_0x0051;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.android.lark.contact.feat.contact_recommend.mvp.list.EmptyViewHolder mo130686a(android.view.ViewGroup r3, int r4) {
        /*
            r2 = this;
            java.lang.String r4 = "parent"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r4)
            android.content.Context r4 = r3.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0 = 2131493954(0x7f0c0442, float:1.8611403E38)
            r1 = 0
            android.view.View r4 = r4.inflate(r0, r3, r1)
            if (r4 == 0) goto L_0x0048
            r0 = 2131298059(0x7f09070b, float:1.821408E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x002e
            r1 = 2131833184(0x7f113160, float:1.9299443E38)
            java.lang.String r1 = com.ss.android.lark.utils.UIHelper.mustacheFormat(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x002e:
            r0 = 2131298058(0x7f09070a, float:1.8214078E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x0045
            r1 = 2131833167(0x7f11314f, float:1.9299408E38)
            java.lang.String r1 = com.ss.android.lark.utils.UIHelper.mustacheFormat(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x0045:
            if (r4 == 0) goto L_0x0048
            goto L_0x0051
        L_0x0048:
            android.view.View r4 = new android.view.View
            android.content.Context r3 = r3.getContext()
            r4.<init>(r3)
        L_0x0051:
            com.ss.android.lark.contact.feat.a.b.a.f r3 = new com.ss.android.lark.contact.feat.a.b.a.f
            r3.<init>(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.contact.feat.contact_recommend.mvp.list.EmptyItemCell.mo130686a(android.view.ViewGroup, int):com.ss.android.lark.contact.feat.a.b.a.f");
    }

    /* renamed from: a */
    public void mo130688a(EmptyViewHolder fVar, EmptyData bVar, int i) {
        Intrinsics.checkParameterIsNotNull(fVar, "holder");
        LKUIButton b = fVar.mo130693b();
        if (b != null) {
            b.setOnClickListener(new C35417a(this));
        }
    }
}
