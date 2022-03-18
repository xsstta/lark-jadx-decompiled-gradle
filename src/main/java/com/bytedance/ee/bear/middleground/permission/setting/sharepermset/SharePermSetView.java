package com.bytedance.ee.bear.middleground.permission.setting.sharepermset;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalytic;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IDocPermSetInfo;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u000fH\u0016J.\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0018R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX.¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/sharepermset/SharePermSetView;", "Landroid/widget/RelativeLayout;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/IDocPermSetInfo;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "module", "", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "token", ShareHitPoint.f121869d, "url", "init", "", "onClickView", "setDivider", "show", "", "setDocPermSetInfo", "docPermSetInfo", "setInfo", "showDivider", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class SharePermSetView extends RelativeLayout implements IDocPermSetInfo {

    /* renamed from: a */
    public static final Companion f27308a = new Companion(null);

    /* renamed from: b */
    private String f27309b;

    /* renamed from: c */
    private String f27310c;

    /* renamed from: d */
    private int f27311d;

    /* renamed from: e */
    private DocPermSetInfo f27312e;

    /* renamed from: f */
    private String f27313f;

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IDocPermSetInfo
    public void setDivider(boolean z) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/sharepermset/SharePermSetView$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.sharepermset.SharePermSetView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo38489a() {
        DocPermSetInfo docPermSetInfo = this.f27312e;
        if (docPermSetInfo == null) {
            String str = this.f27309b;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("url");
            }
            String str2 = this.f27310c;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("token");
            }
            docPermSetInfo = new DocPermSetInfo(str, this.f27311d, str2, false, null, null, null, false, false, false, 1016, null);
        }
        ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17295b("/share/doc/permission/set/activity").mo17311a("permission_doc_info", docPermSetInfo).mo17314a("permission_module", "share").mo17317a();
        String str3 = this.f27310c;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("token");
        }
        PermissionAnalytic.m39427c(str3, this.f27311d, this.f27313f);
        PermissionAnalyticV2.m39669e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/sharepermset/SharePermSetView$setDocPermSetInfo$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.sharepermset.SharePermSetView$b */
    public static final class C10113b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ SharePermSetView f27314a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10113b(SharePermSetView sharePermSetView) {
            this.f27314a = sharePermSetView;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            this.f27314a.mo38489a();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SharePermSetView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m42095a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.permission_setting_share_entrance_view, this);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IDocPermSetInfo
    public void setDocPermSetInfo(DocPermSetInfo docPermSetInfo) {
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "docPermSetInfo");
        this.f27312e = docPermSetInfo;
        setOnClickListener(new C10113b(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SharePermSetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharePermSetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f27313f = "";
        m42095a(context);
    }

    /* renamed from: a */
    public final void mo38490a(String str, String str2, int i, String str3, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        Intrinsics.checkParameterIsNotNull(str3, "module");
        this.f27309b = str;
        this.f27310c = str2;
        this.f27311d = i;
        this.f27313f = str3;
    }
}
