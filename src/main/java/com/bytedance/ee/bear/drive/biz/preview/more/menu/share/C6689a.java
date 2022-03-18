package com.bytedance.ee.bear.drive.biz.preview.more.menu.share;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceFileOpenEntity;
import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import com.bytedance.ee.bear.drive.biz.fileinfo.DriveFileInfoHelper;
import com.bytedance.ee.bear.drive.biz.permission.model.C6522b;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.share.export.AbstractC11003a;
import com.bytedance.ee.bear.share.export.ShareParams;
import com.bytedance.ee.log.C13479a;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.menu.share.a */
public class C6689a {
    /* renamed from: a */
    public static void m26419a(FragmentActivity fragmentActivity, C6937b bVar, C6522b bVar2, DrivePluginHost aVar) {
        if (!(bVar.getOpenEntity() instanceof SpaceFileOpenEntity) || bVar.getFileModel() == null || bVar2 == null) {
            C13479a.m54758a("DriveComponent", "showShareFragment() not SpaceFileOpenEntity or fileModel is null, entity=" + bVar.getOpenEntity());
            return;
        }
        SpaceFileOpenEntity spaceFileOpenEntity = (SpaceFileOpenEntity) bVar.getOpenEntity();
        ((AbstractC11003a) KoinJavaComponent.m268610a(AbstractC11003a.class)).mo41761a(new ShareParams.ShareParamsBuilder(fragmentActivity).source(2).type(C8275a.f22375h.mo32555b()).docName(bVar.getFileModel().mo27322a().mo27358a()).token(bVar.getFileModel().mo27322a().f18785a).url(DriveFileInfoHelper.m25956a(bVar)).originUrl(spaceFileOpenEntity.getOriginUrl()).isOwner(bVar2.mo26061g()).module("drive").isWiki(bVar.isTypeWiki()).subType(bVar.getFileModel().mo27322a().mo27364g()).feedId(spaceFileOpenEntity.getFeedId()).isAtVC(bVar.isVCFollowMode()).isWikiVersionV2(((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21071c(aVar)).build(), spaceFileOpenEntity.getReminderBinder());
        ((AbstractC11003a) KoinJavaComponent.m268610a(AbstractC11003a.class)).mo41764a("file", spaceFileOpenEntity.getFileId());
        ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38968a(null, spaceFileOpenEntity.getFileId(), C8275a.f22375h.mo32555b(), false, bVar.getFileModel().mo27322a().mo27364g(), "share", "ccm_permission_share_view", "", "", "", false, bVar.isVCFollowMode());
    }
}
