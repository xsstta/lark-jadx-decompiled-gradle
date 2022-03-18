package com.ss.android.lark.filedetail.impl.folder.manage.service;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.media.v1.BrowseFolderRequest;
import com.bytedance.lark.pb.media.v1.BrowseFolderResponse;
import com.bytedance.lark.pb.media.v1.DownloadFileScene;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.filedetail.impl.folder.manage.entity.FilePreviewInfo;
import com.ss.android.lark.filedetail.impl.folder.manage.entity.FileType;
import com.ss.android.lark.filedetail.impl.folder.manage.entity.FolderPreviewLoadParams;
import com.ss.android.lark.filedetail.impl.folder.manage.entity.FolderPreviewResponse;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.util.share_preference.UserSP;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/service/FolderService;", "Lcom/ss/android/lark/filedetail/impl/folder/manage/service/IFolderService;", "()V", "getFilePreviewInfo", "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FilePreviewInfo;", "pbFileInfo", "Lcom/bytedance/lark/pb/media/v1/BrowseFolderResponse$SerResp$BrowseInfo;", "path", "", "getFolderBrowseInfo", "", "params", "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FolderPreviewLoadParams;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FolderPreviewResponse;", "getUserFileLayoutType", "", "userId", "parseResponse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "saveUserFileLayoutType", ShareHitPoint.f121869d, "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.a.a */
public final class FolderService implements IFolderService {

    /* renamed from: a */
    public static final FolderService f98159a = new FolderService();

    private FolderService() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FolderPreviewResponse;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.a.a$a */
    static final class C38266a<T> implements SdkSender.IParser<FolderPreviewResponse> {

        /* renamed from: a */
        public static final C38266a f98160a = new C38266a();

        C38266a() {
        }

        /* renamed from: a */
        public final FolderPreviewResponse parse(byte[] bArr) {
            FolderService aVar = FolderService.f98159a;
            Intrinsics.checkExpressionValueIsNotNull(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            return aVar.mo139882a(bArr);
        }
    }

    @Override // com.ss.android.lark.filedetail.impl.folder.manage.service.IFolderService
    /* renamed from: a */
    public int mo139881a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        UserSP userSPById = UserSP.getUserSPById(str);
        Intrinsics.checkExpressionValueIsNotNull(userSPById, "UserSP.getUserSPById(userId)");
        return userSPById.getInt("params_folder_manage_layout_type");
    }

    /* renamed from: a */
    public final FolderPreviewResponse mo139882a(byte[] bArr) throws IOException {
        boolean z;
        String str;
        BrowseFolderResponse decode = BrowseFolderResponse.ADAPTER.decode(bArr);
        if (decode == null) {
            return null;
        }
        List<BrowseFolderResponse.SerResp.BrowseInfo> list = decode.ser_resp.infos;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        List<BrowseFolderResponse.SerResp.BrowseInfo> list2 = decode.ser_resp.infos;
        Map<String, String> map = decode.key2path;
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkExpressionValueIsNotNull(list2, "pbList");
        for (T t : list2) {
            String str2 = t.key;
            String str3 = "";
            if (!(map == null || (str = map.get(str2)) == null)) {
                str3 = str;
            }
            FolderService aVar = f98159a;
            Intrinsics.checkExpressionValueIsNotNull(t, "it");
            arrayList.add(aVar.m150478a(t, str3));
        }
        FolderPreviewResponse cVar = new FolderPreviewResponse();
        cVar.mo140003a(arrayList);
        Long l = decode.ser_resp.all_count;
        Intrinsics.checkExpressionValueIsNotNull(l, "pbResponse.ser_resp.all_count");
        cVar.mo140002a(l.longValue());
        Boolean bool = decode.ser_resp.has_more;
        Intrinsics.checkExpressionValueIsNotNull(bool, "pbResponse.ser_resp.has_more");
        cVar.mo140006a(bool.booleanValue());
        return cVar;
    }

    @Override // com.ss.android.lark.filedetail.impl.folder.manage.service.IFolderService
    /* renamed from: a */
    public void mo139884a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        UserSP userSPById = UserSP.getUserSPById(str);
        Intrinsics.checkExpressionValueIsNotNull(userSPById, "UserSP.getUserSPById(userId)");
        userSPById.putInt("params_folder_manage_layout_type", i);
    }

    @Override // com.ss.android.lark.filedetail.impl.folder.manage.service.IFolderService
    /* renamed from: a */
    public void mo139883a(FolderPreviewLoadParams bVar, IGetDataCallback<FolderPreviewResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(bVar, "params");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.asynSendRequestNonWrap(Command.BROWSE_FOLDER, new BrowseFolderRequest.C18190a().mo63077a(new BrowseFolderRequest.SerReq.C18188a().mo63071a(bVar.mo139987a()).mo63070a(Long.valueOf(bVar.mo139988b())).mo63073b(Long.valueOf(bVar.mo139989c())).mo63069a(BrowseFolderRequest.SerReq.IndexKey.fromValue(bVar.mo139990d())).mo63068a(BrowseFolderRequest.SerReq.Direction.fromValue(bVar.mo139991e())).build()).mo63078a(DownloadFileScene.fromValue(bVar.mo139993f())), iGetDataCallback, C38266a.f98160a);
    }

    /* renamed from: a */
    private final FilePreviewInfo m150478a(BrowseFolderResponse.SerResp.BrowseInfo browseInfo, String str) {
        boolean z;
        String str2 = browseInfo.key;
        FilePreviewInfo.Builder aVar = new FilePreviewInfo.Builder();
        Intrinsics.checkExpressionValueIsNotNull(str2, "key");
        FilePreviewInfo.Builder a = aVar.mo139979a(str2);
        String str3 = browseInfo.name;
        Intrinsics.checkExpressionValueIsNotNull(str3, "pbFileInfo.name");
        FilePreviewInfo.Builder b = a.mo139982b(str3);
        FileType.Companion aVar2 = FileType.Companion;
        BrowseFolderResponse.SerResp.FileType fileType = browseInfo.type;
        Intrinsics.checkExpressionValueIsNotNull(fileType, "pbFileInfo.type");
        FilePreviewInfo.Builder a2 = b.mo139978a(aVar2.mo139965a(fileType.getValue()));
        Long l = browseInfo.size;
        Intrinsics.checkExpressionValueIsNotNull(l, "pbFileInfo.size");
        FilePreviewInfo.Builder a3 = a2.mo139977a(l.longValue());
        Long l2 = browseInfo.create_time;
        Intrinsics.checkExpressionValueIsNotNull(l2, "pbFileInfo.create_time");
        FilePreviewInfo.Builder b2 = a3.mo139981b(l2.longValue());
        Long l3 = browseInfo.owner_id;
        Intrinsics.checkExpressionValueIsNotNull(l3, "pbFileInfo.owner_id");
        FilePreviewInfo.Builder e = b2.mo139983c(l3.longValue()).mo139986e(browseInfo.preview_image_key);
        String str4 = browseInfo.owner_name;
        boolean z2 = false;
        if (str4 == null || str4.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str5 = browseInfo.owner_name;
            Intrinsics.checkExpressionValueIsNotNull(str5, "pbFileInfo.owner_name");
            e.mo139984c(str5);
        }
        String str6 = str;
        if (str6 == null || str6.length() == 0) {
            z2 = true;
        }
        if (!z2) {
            e.mo139985d(str);
        }
        return e.mo139980a();
    }
}
