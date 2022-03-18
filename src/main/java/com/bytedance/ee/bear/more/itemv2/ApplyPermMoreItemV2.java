package com.bytedance.ee.bear.more.itemv2;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.C10196b;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.export.WikiMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.CommonMoreItemId;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\u0012B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J\b\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/more/itemv2/ApplyPermMoreItemV2;", "Lcom/bytedance/ee/bear/more/moreprotocol/BaseMoreItem;", "Lcom/bytedance/ee/bear/more/moreprotocol/ITextMoreItem;", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "getIcon", "", "getIconTint", "getId", "", "getTitle", "isSupportType", "", ShareHitPoint.f121869d, "isVisible", "onClick", "", "Companion", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ApplyPermMoreItemV2 extends BaseMoreItem implements ITextMoreItem {
    public static final Companion Companion = new Companion(null);
    private final FragmentActivity activity;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_ccm_edit_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/more/itemv2/ApplyPermMoreItemV2$Companion;", "", "()V", "TAG", "", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.itemv2.ApplyPermMoreItemV2$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return CommonMoreItemId.APPLY_EDIT_PERMISSION.getId();
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Doc_Resource_ApplyEditPerm);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public String getUnableTips() {
        return ITextMoreItem.C10238a.m42706b(this);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        return ITextMoreItem.C10238a.m42705a(this);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean needShowBadge() {
        return ITextMoreItem.C10238a.m42707c(this);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo == null) {
            return false;
        }
        boolean p = moreInfo.mo39049p();
        boolean isSupportType = isSupportType(moreInfo.mo39036e());
        C13479a.m54764b("ApplyPermMoreItemV2", "isCanEdit:" + p + ", isSupportType:" + isSupportType);
        if (p || !isSupportType) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        getHost().mo39166c();
        C10196b.m42464a(getMoreInfo());
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo != null) {
            ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36639b().mo36672a(this.activity, moreInfo.mo39041h(), moreInfo.mo39036e(), moreInfo.mo39043j(), moreInfo.mo39044k(), C8275a.m34050a(moreInfo.mo39036e()));
        }
        if (getMoreInfo() instanceof DocMoreInfo) {
            IMoreInfo moreInfo2 = getMoreInfo();
            if (moreInfo2 != null) {
                DocMoreInfo aVar = (DocMoreInfo) moreInfo2;
                ((AbstractC10194a) KoinJavaComponent.m268613a(AbstractC10194a.class, null, null, 6, null)).mo38968a(getHost().mo39165b().getArguments(), aVar.mo39041h(), aVar.mo39036e(), aVar.mo39009E(), aVar.mo39038f(), "permission_read_without_edit", "ccm_permission_read_without_edit_view", "", "", "", aVar instanceof WikiMoreInfo, aVar.mo39008D());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.more.export.DocMoreInfo");
        }
    }

    public ApplyPermMoreItemV2(FragmentActivity fragmentActivity) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        this.activity = fragmentActivity;
    }

    private final boolean isSupportType(int i) {
        C8275a aVar = C8275a.f22371d;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOC");
        if (i != aVar.mo32555b()) {
            C8275a aVar2 = C8275a.f22378k;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.DOCX");
            if (i != aVar2.mo32555b()) {
                C8275a aVar3 = C8275a.f22372e;
                Intrinsics.checkExpressionValueIsNotNull(aVar3, "DocumentType.SHEET");
                if (i != aVar3.mo32555b()) {
                    C8275a aVar4 = C8275a.f22373f;
                    Intrinsics.checkExpressionValueIsNotNull(aVar4, "DocumentType.BITABLE");
                    if (i != aVar4.mo32555b()) {
                        C8275a aVar5 = C8275a.f22375h;
                        Intrinsics.checkExpressionValueIsNotNull(aVar5, "DocumentType.FILE");
                        if (i != aVar5.mo32555b()) {
                            C8275a aVar6 = C8275a.f22374g;
                            Intrinsics.checkExpressionValueIsNotNull(aVar6, "DocumentType.MINDNOTE");
                            if (i == aVar6.mo32555b()) {
                                return true;
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
