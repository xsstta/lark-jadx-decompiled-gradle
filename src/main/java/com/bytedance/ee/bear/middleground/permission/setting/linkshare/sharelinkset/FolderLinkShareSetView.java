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
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalytic;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.C10039l;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.LinkShareItem;
import com.bytedance.ee.bear.middleground.permission.util.ToCUtil;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.FolderPermSetInfo;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IFolderPermSetInfo;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.PostCard;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\rH\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\rH\u0002J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\rH\u0002J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0011H\u0016J\u001e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\rJ\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\rH\u0002J(\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/sharelinkset/FolderLinkShareSetView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/IFolderPermSetInfo;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isShareRoot", "", "module", "", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/FolderPermSetInfo;", "getIconRes", "shareLinkEnable", "getPermSetInfo", "init", "", "onClickView", "removeOrg", "setCanClick", "clickable", "setFolderPermSetInfo", "folderPermSetInfo", "setInfo", "showDivider", "setLinkShareTitleText", "enableShareLink", "updateFolderUI", "isShareFolderV2", "publicPermission", "canPermSet", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class FolderLinkShareSetView extends ConstraintLayout implements IFolderPermSetInfo {

    /* renamed from: a */
    private FolderPermSetInfo f27254a;

    /* renamed from: b */
    private boolean f27255b;

    /* renamed from: c */
    private String f27256c;

    /* renamed from: d */
    private HashMap f27257d;

    /* renamed from: a */
    private final int m41970a(boolean z) {
        return z ? R.drawable.ud_icon_link_copy_outlined : R.drawable.ud_icon_cancel_link_filled;
    }

    /* renamed from: a */
    public View mo38426a(int i) {
        if (this.f27257d == null) {
            this.f27257d = new HashMap();
        }
        View view = (View) this.f27257d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f27257d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    private final FolderPermSetInfo getPermSetInfo() {
        FolderPermSetInfo folderPermSetInfo = this.f27254a;
        if (folderPermSetInfo != null) {
            return folderPermSetInfo;
        }
        return new FolderPermSetInfo(0, null, null, null, null, null, null, null, null, null, null, null, false, 8191, null);
    }

    /* renamed from: b */
    private final boolean m41973b() {
        AccountService.Account f = ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
        if (((AbstractC5586d) KoinJavaComponent.m268613a(AbstractC5586d.class, null, null, 6, null)).mo22259a() || ToCUtil.f26828a.mo37760b(f)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo38427a() {
        PostCard b = ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17295b("/share/linkshare/set/activity");
        C8275a aVar = C8275a.f22370c;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.FOLDER");
        b.mo17308a(ShareHitPoint.f121869d, aVar.mo32555b()).mo17311a("permission_doc_info", getPermSetInfo()).mo17314a("module", this.f27256c).mo17317a();
        PermissionAnalytic.m39422b(getPermSetInfo().mo38864c(), getPermSetInfo().mo38863b(), this.f27256c);
        PermissionAnalyticV2.m39663d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/linkshare/sharelinkset/FolderLinkShareSetView$setCanClick$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.sharelinkset.FolderLinkShareSetView$a */
    public static final class C10084a extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ FolderLinkShareSetView f27258a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10084a(FolderLinkShareSetView folderLinkShareSetView) {
            this.f27258a = folderLinkShareSetView;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            this.f27258a.mo38427a();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FolderLinkShareSetView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m41971a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.permission_link_share_layout, this);
        ((ImageView) mo38426a(R.id.linkShareIcon)).setImageResource(m41970a(false));
    }

    private final void setLinkShareTitleText(boolean z) {
        if (z) {
            ((TextView) mo38426a(R.id.linkShareTitle)).setText(R.string.Doc_Share_PublicLinkShareOpen);
        } else {
            ((TextView) mo38426a(R.id.linkShareTitle)).setText(R.string.Doc_Share_PublicLinkShareClose);
        }
    }

    private final void setCanClick(boolean z) {
        int i;
        if (z) {
            setOnClickListener(new C10084a(this));
        } else {
            setOnClickListener(null);
        }
        ImageView imageView = (ImageView) mo38426a(R.id.linkShareMore);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "linkShareMore");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IFolderPermSetInfo
    public void setFolderPermSetInfo(FolderPermSetInfo folderPermSetInfo) {
        int i;
        Intrinsics.checkParameterIsNotNull(folderPermSetInfo, "folderPermSetInfo");
        this.f27254a = folderPermSetInfo;
        m41972a(folderPermSetInfo.mo38883s(), folderPermSetInfo.mo38877m(), folderPermSetInfo.mo38884t(), this.f27255b);
        if (folderPermSetInfo.mo38892z()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FolderLinkShareSetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FolderLinkShareSetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f27256c = "";
        m41971a(context);
    }

    /* renamed from: a */
    public final void mo38428a(boolean z, String str, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "module");
        this.f27255b = z;
        this.f27256c = str;
    }

    /* renamed from: a */
    private final void m41972a(boolean z, int i, boolean z2, boolean z3) {
        boolean z4;
        boolean z5 = true;
        if (z) {
            z4 = z2;
        } else if (!z2 || !z3) {
            z4 = false;
        } else {
            z4 = true;
        }
        setCanClick(z4);
        if (i <= ShareFolderPublicPermission.Companion.mo38735a()) {
            z5 = false;
        }
        ((ImageView) mo38426a(R.id.linkShareIcon)).setImageResource(m41970a(z5));
        LinkShareItem c = C10039l.m41788c(getContext(), C10039l.m41783a(i, z2, m41973b(), z));
        Intrinsics.checkExpressionValueIsNotNull(c, "shareItem");
        if (c.getType() == 2) {
            TextView textView = (TextView) mo38426a(R.id.linkShareSubTitle);
            Intrinsics.checkExpressionValueIsNotNull(textView, "linkShareSubTitle");
            textView.setVisibility(8);
            TextView textView2 = (TextView) mo38426a(R.id.linkShareTitle);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "linkShareTitle");
            textView2.setText(c.getDescription());
            return;
        }
        TextView textView3 = (TextView) mo38426a(R.id.linkShareSubTitle);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "linkShareSubTitle");
        textView3.setVisibility(0);
        TextView textView4 = (TextView) mo38426a(R.id.linkShareSubTitle);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "linkShareSubTitle");
        textView4.setText(c.getDescription());
        setLinkShareTitleText(z5);
    }
}
