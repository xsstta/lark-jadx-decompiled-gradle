package com.bytedance.ee.bear.middleground.permission.setting.linkshare.sharelinkset;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.permission.PermBitableShareAnalytic;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.C10039l;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.LinkShareItem;
import com.bytedance.ee.bear.middleground_permission_export.model.form.IBitableSharePublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.BitableSharePermSetInfo;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IBitableSharePermSetInfo;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.PostCard;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0016H\u0002R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/sharelinkset/BitableShareLinkShareSetView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/IBitableSharePermSetInfo;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mBitableSharePermSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;", "getPermSetInfo", "init", "", "onClickView", "setBitableSharePermSetInfo", "bitableSharePermSetInfo", "setCanClick", "clickable", "", "setDivider", "show", "setEnable", "enable", "updateUI", "publicPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/form/IBitableSharePublicPermission;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BitableShareLinkShareSetView extends ConstraintLayout implements IBitableSharePermSetInfo {

    /* renamed from: a */
    private BitableSharePermSetInfo f27246a;

    /* renamed from: b */
    private HashMap f27247b;

    /* renamed from: a */
    public View mo38420a(int i) {
        if (this.f27247b == null) {
            this.f27247b = new HashMap();
        }
        View view = (View) this.f27247b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f27247b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void setDivider(boolean z) {
    }

    private final BitableSharePermSetInfo getPermSetInfo() {
        BitableSharePermSetInfo bitableSharePermSetInfo = this.f27246a;
        if (bitableSharePermSetInfo != null) {
            return bitableSharePermSetInfo;
        }
        return new BitableSharePermSetInfo(null, 0, null, null, null, 31, null);
    }

    /* renamed from: a */
    public final void mo38421a() {
        PostCard b = ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17295b("/share/linkshare/set/activity");
        C8275a aVar = C8275a.f22380m;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.BITABLE_FORM");
        b.mo17308a(ShareHitPoint.f121869d, aVar.mo32555b()).mo17311a("permission_doc_info", getPermSetInfo()).mo17317a();
        PermBitableShareAnalytic.f25618a.mo36523a();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IBitableSharePermSetInfo
    public void setEnable(boolean z) {
        setCanClick(z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/linkshare/sharelinkset/BitableShareLinkShareSetView$setCanClick$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.sharelinkset.BitableShareLinkShareSetView$a */
    public static final class C10081a extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ BitableShareLinkShareSetView f27248a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10081a(BitableShareLinkShareSetView bitableShareLinkShareSetView) {
            this.f27248a = bitableShareLinkShareSetView;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            this.f27248a.mo38421a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/linkshare/sharelinkset/BitableShareLinkShareSetView$setCanClick$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.sharelinkset.BitableShareLinkShareSetView$b */
    public static final class C10082b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ BitableShareLinkShareSetView f27249a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10082b(BitableShareLinkShareSetView bitableShareLinkShareSetView) {
            this.f27249a = bitableShareLinkShareSetView;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            Toast.showText(this.f27249a.getContext(), (int) R.string.Bitable_Form_PleaseTurnOnFormShare);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BitableShareLinkShareSetView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IBitableSharePermSetInfo
    public void setBitableSharePermSetInfo(BitableSharePermSetInfo bitableSharePermSetInfo) {
        Intrinsics.checkParameterIsNotNull(bitableSharePermSetInfo, "bitableSharePermSetInfo");
        this.f27246a = bitableSharePermSetInfo;
        m41956a(bitableSharePermSetInfo.mo38779a(), bitableSharePermSetInfo.mo38785e().isOpen());
    }

    private final void setCanClick(boolean z) {
        if (z) {
            animate().alpha(1.0f).setDuration(150).start();
            setOnClickListener(new C10081a(this));
            return;
        }
        animate().alpha(0.3f).setDuration(150).start();
        setOnClickListener(new C10082b(this));
    }

    /* renamed from: a */
    private final void m41955a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.permission_link_share_layout, this);
        ((ImageView) mo38420a(R.id.linkShareIcon)).setImageResource(R.drawable.ud_icon_setting_outlined);
        TextView textView = (TextView) mo38420a(R.id.linkShareSubTitle);
        Intrinsics.checkExpressionValueIsNotNull(textView, "linkShareSubTitle");
        textView.setVisibility(8);
        ImageView imageView = (ImageView) mo38420a(R.id.linkShareMore);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "linkShareMore");
        imageView.setVisibility(0);
        setDivider(false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BitableShareLinkShareSetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m41956a(IBitableSharePublicPermission iBitableSharePublicPermission, boolean z) {
        setCanClick(z);
        LinkShareItem b = C10039l.m41787b(getContext(), C10039l.m41785a(iBitableSharePublicPermission));
        TextView textView = (TextView) mo38420a(R.id.linkShareTitle);
        Intrinsics.checkExpressionValueIsNotNull(textView, "linkShareTitle");
        Intrinsics.checkExpressionValueIsNotNull(b, "shareItem");
        textView.setText(b.getDescription());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BitableShareLinkShareSetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m41955a(context);
    }
}
