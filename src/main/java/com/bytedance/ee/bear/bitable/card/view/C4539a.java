package com.bytedance.ee.bear.bitable.card.view;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.bitable.card.model.enums.ECardType;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4525a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4535b;
import com.bytedance.ee.bear.bitable.card.viewmodel.C4771b;
import com.bytedance.ee.bear.bitable.common.BitableAnalytic;
import com.bytedance.ee.bear.block.AbstractC4896c;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.doc.C5130a;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.document.documentinfo.DocumentInfo;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.facade.common.AbstractC7720n;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.a */
public class C4539a implements AbstractC4712d {

    /* renamed from: a */
    protected String f13368a = "BitableCardDelegate";

    /* renamed from: b */
    protected final Context f13369b;

    /* renamed from: c */
    private final Fragment f13370c;

    /* renamed from: d */
    private final DocViewModel f13371d;

    /* renamed from: e */
    private final C4771b f13372e;

    /* renamed from: f */
    private final BitableAnalytic f13373f;

    /* renamed from: g */
    private final List<AbstractC7666d> f13374g;

    /* renamed from: h */
    private final List<AbstractC7720n> f13375h;

    @Override // com.bytedance.ee.bear.bitable.card.view.AbstractC4712d
    /* renamed from: g */
    public Fragment mo17874g() {
        return this.f13370c;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.AbstractC4712d
    /* renamed from: i */
    public BitableAnalytic mo17876i() {
        return this.f13373f;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.AbstractC4712d
    /* renamed from: f */
    public FragmentActivity mo17873f() {
        return this.f13370c.getActivity();
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.AbstractC4712d
    /* renamed from: h */
    public View mo17875h() {
        return this.f13370c.getView();
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.AbstractC4712d
    /* renamed from: j */
    public AbstractC5233x mo17877j() {
        return C5234y.m21391b();
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.AbstractC4712d
    /* renamed from: a */
    public void mo17860a() {
        UDToast.show(this.f13369b, (int) R.string.Doc_Block_NotSupportEditField, (int) R.drawable.ud_icon_warning_outlined);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.AbstractC4712d
    /* renamed from: b */
    public void mo17866b() {
        UDToast.show(this.f13369b, (int) R.string.Doc_Block_NotSupportModifyField, (int) R.drawable.ud_icon_warning_outlined);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.AbstractC4712d
    /* renamed from: c */
    public void mo17870c() {
        UDToast.show(this.f13369b, (int) R.string.Doc_Block_NotSupportEditInLandscape, (int) R.drawable.ud_icon_warning_outlined);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.AbstractC4712d
    /* renamed from: d */
    public void mo17871d() {
        UDToast.show(this.f13369b, (int) R.string.Bitable_AdvancedPermission_NoPermissionToEditFieldToast, (int) R.drawable.ud_icon_warning_outlined);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.AbstractC4712d
    /* renamed from: e */
    public void mo17872e() {
        UDToast.show(this.f13369b, (int) R.string.Bitable_AdvancedPermission_UnableToUploadAttachment, (int) R.drawable.ud_icon_warning_outlined);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.AbstractC4712d
    /* renamed from: k */
    public DocumentInfo mo17878k() {
        DocViewModel docViewModel = this.f13371d;
        if (docViewModel != null) {
            return docViewModel.getDocumentInfoData();
        }
        return null;
    }

    /* renamed from: l */
    private String m18846l() {
        String documentType = this.f13371d.getDocumentType();
        if (TextUtils.equals(documentType, C8275a.f22372e.mo32553a())) {
            return "from_parent_sheet";
        }
        if (TextUtils.equals(documentType, C8275a.f22371d.mo32553a())) {
            return "from_parent_docs";
        }
        return "from_parent_bitable";
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.AbstractC4712d
    /* renamed from: b */
    public void mo17867b(AbstractC7666d dVar) {
        this.f13374g.remove(dVar);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.AbstractC4712d
    /* renamed from: a */
    public void mo17861a(AbstractC7666d dVar) {
        if (!this.f13374g.contains(dVar)) {
            this.f13374g.add(dVar);
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.AbstractC4712d
    /* renamed from: b */
    public void mo17868b(AbstractC7720n nVar) {
        this.f13375h.remove(nVar);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.AbstractC4712d
    /* renamed from: a */
    public void mo17862a(AbstractC7720n nVar) {
        if (!this.f13375h.contains(nVar)) {
            this.f13375h.add(nVar);
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.AbstractC4712d
    /* renamed from: a */
    public void mo17863a(String str) {
        CharSequence charSequence;
        DocViewModel docViewModel = this.f13371d;
        if (docViewModel == null || docViewModel.getTitle() == null) {
            charSequence = null;
        } else {
            charSequence = this.f13371d.getTitle().mo5927b();
        }
        ((AbstractC5586d) KoinJavaComponent.m268610a(AbstractC5586d.class)).mo22257a(str, charSequence);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.AbstractC4712d
    /* renamed from: b */
    public void mo17869b(String str) {
        C4535b showingTable = this.f13372e.getShowingTable();
        if (showingTable != null) {
            String decode = Uri.decode(str);
            if (showingTable.mo17773d() == ECardType.JIRA && ((AbstractC4896c) KoinJavaComponent.m268610a(AbstractC4896c.class)).mo19203a(decode)) {
                this.f13373f.mo18682b();
            }
            if (mo17873f() == null || !((AbstractC4896c) KoinJavaComponent.m268610a(AbstractC4896c.class)).mo19204a(decode, mo17873f())) {
                if (C6313i.m25327a().mo25392c(decode)) {
                    if (C6313i.m25327a().mo25389b(decode, this.f13371d.getOriginUrl())) {
                        Context context = this.f13369b;
                        Toast.showFailureText(context, context.getString(R.string.Doc_Doc_LinkToCurrentDoc), 0);
                        return;
                    }
                    decode = C5130a.m20993a(C6313i.m25327a().mo25398f(decode), m18846l());
                }
                ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17292a(decode);
            }
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.AbstractC4712d
    /* renamed from: a */
    public void mo17864a(String str, Map<String, String> map) {
        this.f13373f.mo18677a(str, map);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.AbstractC4712d
    /* renamed from: a */
    public void mo17865a(String[] strArr, C4525a aVar, boolean z) {
        boolean a = C4211a.m17514a().mo16536a("spacekit.mobile.bitable_enable_forward_link_table", true);
        String str = this.f13368a;
        C13479a.m54764b(str, "onLinkForward()... enableForwardLinkTable = " + a);
        if (!a) {
            Toast.showText(this.f13369b, (int) R.string.Doc_Block_NotSupportLinkOpen);
        } else if (this.f13372e.getTableStack().size() < 10) {
            this.f13372e.forwardLinkTable(strArr, aVar);
            this.f13373f.mo18678a("expand", z);
        } else {
            Toast.showText(this.f13369b, (int) R.string.Bitable_Relation_TooManyCardsOpened);
        }
    }

    public C4539a(Fragment fragment, DocViewModel docViewModel, C4771b bVar, BitableAnalytic bitableAnalytic, List<AbstractC7666d> list, List<AbstractC7720n> list2) {
        this.f13370c = fragment;
        this.f13371d = docViewModel;
        this.f13372e = bVar;
        this.f13373f = bitableAnalytic;
        this.f13374g = list;
        this.f13375h = list2;
        this.f13369b = fragment.getContext();
    }
}
