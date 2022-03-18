package com.bytedance.ee.bear.drive.biz.fileinfo;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceFileOpenEntity;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/fileinfo/DriveFileInfoHelper;", "", "()V", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.fileinfo.a */
public final class DriveFileInfoHelper {

    /* renamed from: a */
    public static final Companion f17860a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final String m25956a(C6937b bVar) {
        return f17860a.mo25851a(bVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/fileinfo/DriveFileInfoHelper$Companion;", "", "()V", "getSpaceFileUrl", "", "viewModel", "Lcom/bytedance/ee/bear/drive/core/DriveViewModel;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.fileinfo.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final String mo25851a(C6937b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "viewModel");
            BaseOpenEntity openEntity = bVar.getOpenEntity();
            if (!(openEntity instanceof SpaceFileOpenEntity)) {
                return "";
            }
            SpaceFileOpenEntity spaceFileOpenEntity = (SpaceFileOpenEntity) openEntity;
            if (!TextUtils.isEmpty(spaceFileOpenEntity.getUrl())) {
                String url = spaceFileOpenEntity.getUrl();
                Intrinsics.checkExpressionValueIsNotNull(url, "openEntity.url");
                return url;
            }
            C13479a.m54775e("DriveComponent", "DriveFileInfoHelper#getSpaceFileUrl() openEntity url is null ,gen by token...");
            String a = C6313i.m25327a().mo25382a("file", spaceFileOpenEntity.getFileId(), spaceFileOpenEntity.getPreviewFrom());
            if (a != null) {
                return a;
            }
            return "";
        }
    }
}
