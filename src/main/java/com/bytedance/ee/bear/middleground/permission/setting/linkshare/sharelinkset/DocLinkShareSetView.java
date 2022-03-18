package com.bytedance.ee.bear.middleground.permission.setting.linkshare.sharelinkset;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.middleground.permission.PermFGUtils;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalytic;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.C10039l;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.LinkShareItem;
import com.bytedance.ee.bear.middleground.permission.util.ToCUtil;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IDocPermSetInfo;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.universedesign.SimpleTagTextView;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\rH\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0011H\u0002J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0011H\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0011J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u0011H\u0002J\u0018\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/sharelinkset/DocLinkShareSetView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/IDocPermSetInfo;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "docPermSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "module", "", "enablePermSet", "", "getIconRes", "shareLinkEnable", "getPermSetInfo", "init", "", "onClickView", "removeOrg", "setCanClick", "clickable", "setDivider", "show", "setDocPermSetInfo", "setInfo", "showDivider", "setLinkShareTitleText", "enableShareLink", "updateDocUI", "publicPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocPublicPermission;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DocLinkShareSetView extends ConstraintLayout implements IDocPermSetInfo {

    /* renamed from: a */
    private DocPermSetInfo f27250a;

    /* renamed from: b */
    private String f27251b;

    /* renamed from: c */
    private HashMap f27252c;

    /* renamed from: a */
    private final int m41961a(boolean z) {
        return z ? R.drawable.ud_icon_link_copy_outlined : R.drawable.ud_icon_cancel_link_outlined;
    }

    /* renamed from: a */
    public View mo38423a(int i) {
        if (this.f27252c == null) {
            this.f27252c = new HashMap();
        }
        View view = (View) this.f27252c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f27252c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IDocPermSetInfo
    public void setDivider(boolean z) {
    }

    private final DocPermSetInfo getPermSetInfo() {
        return this.f27250a;
    }

    /* renamed from: b */
    private final boolean m41965b() {
        AccountService.Account f = ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
        if (((AbstractC5586d) KoinJavaComponent.m268613a(AbstractC5586d.class, null, null, 6, null)).mo22259a() || ToCUtil.f26828a.mo37760b(f)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo38424a() {
        ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17295b("/share/linkshare/set/activity").mo17308a(ShareHitPoint.f121869d, getPermSetInfo().mo38825b()).mo17311a("permission_doc_info", getPermSetInfo()).mo17314a("module", this.f27251b).mo17317a();
        PermissionAnalytic.m39422b(getPermSetInfo().mo38827c(), getPermSetInfo().mo38825b(), this.f27251b);
        PermissionAnalyticV2.m39663d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/linkshare/sharelinkset/DocLinkShareSetView$setCanClick$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.sharelinkset.DocLinkShareSetView$a */
    public static final class C10083a extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ DocLinkShareSetView f27253a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10083a(DocLinkShareSetView docLinkShareSetView) {
            this.f27253a = docLinkShareSetView;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            this.f27253a.mo38424a();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DocLinkShareSetView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m41962a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.permission_link_share_layout, this);
        ((ImageView) mo38423a(R.id.linkShareIcon)).setImageResource(m41961a(false));
    }

    private final void setLinkShareTitleText(boolean z) {
        if (z) {
            ((TextView) mo38423a(R.id.linkShareTitle)).setText(R.string.Doc_Share_PublicLinkShareOpen);
        } else {
            ((TextView) mo38423a(R.id.linkShareTitle)).setText(R.string.Doc_Share_PublicLinkShareClose);
        }
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IDocPermSetInfo
    public void setDocPermSetInfo(DocPermSetInfo docPermSetInfo) {
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "docPermSetInfo");
        this.f27250a = docPermSetInfo;
        m41963a(docPermSetInfo.mo38837j(), m41964a(docPermSetInfo));
    }

    /* renamed from: a */
    private final boolean m41964a(DocPermSetInfo docPermSetInfo) {
        if (docPermSetInfo.mo38845r() || ((docPermSetInfo.mo38844q() && docPermSetInfo.ab() && docPermSetInfo.mo38846s()) || (!docPermSetInfo.mo38844q() && docPermSetInfo.mo38846s()))) {
            return true;
        }
        return false;
    }

    private final void setCanClick(boolean z) {
        int i;
        if (z) {
            setOnClickListener(new C10083a(this));
        } else {
            setOnClickListener(null);
        }
        ImageView imageView = (ImageView) mo38423a(R.id.linkShareMore);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "linkShareMore");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo38425a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "module");
        this.f27251b = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DocLinkShareSetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m41963a(IDocPublicPermission iDocPublicPermission, boolean z) {
        setCanClick(z);
        boolean z2 = !iDocPublicPermission.isLinkShareClose();
        ((ImageView) mo38423a(R.id.linkShareIcon)).setImageResource(m41961a(z2));
        LinkShareItem a = C10039l.m41786a(getContext(), C10039l.m41784a(iDocPublicPermission, z, m41965b()));
        Intrinsics.checkExpressionValueIsNotNull(a, "shareItem");
        if (a.getType() == 2) {
            TextView textView = (TextView) mo38423a(R.id.linkShareTitle);
            Intrinsics.checkExpressionValueIsNotNull(textView, "linkShareTitle");
            textView.setText(a.getDescription());
            TextView textView2 = (TextView) mo38423a(R.id.linkShareSubTitle);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "linkShareSubTitle");
            textView2.setVisibility(8);
        } else {
            TextView textView3 = (TextView) mo38423a(R.id.linkShareSubTitle);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "linkShareSubTitle");
            textView3.setVisibility(0);
            TextView textView4 = (TextView) mo38423a(R.id.linkShareSubTitle);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "linkShareSubTitle");
            textView4.setText(a.getDescription());
            setLinkShareTitleText(z2);
        }
        if (!this.f27250a.mo38844q() || !this.f27250a.ab() || !PermFGUtils.m39534c() || !this.f27250a.mo38813V()) {
            SimpleTagTextView simpleTagTextView = (SimpleTagTextView) mo38423a(R.id.linkShareTagView);
            Intrinsics.checkExpressionValueIsNotNull(simpleTagTextView, "linkShareTagView");
            simpleTagTextView.setVisibility(8);
            return;
        }
        SimpleTagTextView simpleTagTextView2 = (SimpleTagTextView) mo38423a(R.id.linkShareTagView);
        Intrinsics.checkExpressionValueIsNotNull(simpleTagTextView2, "linkShareTagView");
        simpleTagTextView2.setVisibility(0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DocLinkShareSetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f27250a = new DocPermSetInfo(null, 0, null, false, null, null, null, false, false, false, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null);
        this.f27251b = "";
        m41962a(context);
    }
}
