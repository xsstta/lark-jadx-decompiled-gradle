package com.bytedance.ee.bear.drive.core;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.DefaultOpenEntity;
import com.bytedance.ee.bear.contract.route.parcelable.WikiInfo;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.loader.model.C7090c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;

/* renamed from: com.bytedance.ee.bear.drive.core.b */
public class C6937b extends AbstractC1142af {
    private final Bundle mArgs;
    private int mBizType;
    private final C1177w<String> mFileName;
    private AbstractC6949c mIFileModel;
    private final C1177w<Boolean> mIsHistoryModel;
    private boolean mIsVcModel;
    private BaseOpenEntity mOpenEntity;
    private final C1177w<Integer> mPreviewType;
    private WikiInfo mWikiInfo;

    public Bundle getArgs() {
        return this.mArgs;
    }

    public int getBizType() {
        return this.mBizType;
    }

    public <FM extends AbstractC6946a> AbstractC6949c<FM> getIFileModel() {
        return this.mIFileModel;
    }

    public BaseOpenEntity getOpenEntity() {
        return this.mOpenEntity;
    }

    public WikiInfo getWikiInfo() {
        return this.mWikiInfo;
    }

    public boolean isVCFollowMode() {
        return this.mIsVcModel;
    }

    public LiveData<String> liveFileName() {
        return this.mFileName;
    }

    public LiveData<Boolean> liveHistoryMode() {
        return this.mIsHistoryModel;
    }

    public LiveData<Integer> livePreviewType() {
        return this.mPreviewType;
    }

    public C6937b() {
        this(null);
    }

    public String getFileId() {
        return this.mOpenEntity.getFileId();
    }

    public boolean fromBlockPreview() {
        if (this.mOpenEntity.getPreviewType() == 3) {
            return true;
        }
        return false;
    }

    public <FM extends AbstractC6946a> FM getFileModel() {
        AbstractC6949c cVar = this.mIFileModel;
        if (cVar == null) {
            return null;
        }
        return (FM) cVar.mo27371a();
    }

    public String getFileName() {
        return this.mFileName.mo5927b();
    }

    public boolean isTypeWiki() {
        WikiInfo wikiInfo = this.mWikiInfo;
        if (wikiInfo == null || !wikiInfo.isValid()) {
            return false;
        }
        return true;
    }

    public void enterHistoryMode() {
        C13479a.m54764b("DriveSdk", "enterHistoryMode()");
        this.mIsHistoryModel.mo5926a((Boolean) true);
    }

    public boolean isHistoryMode() {
        if (this.mIsHistoryModel.mo5927b() == null || !this.mIsHistoryModel.mo5927b().booleanValue()) {
            return false;
        }
        return true;
    }

    public boolean isInBlockFullScreenState() {
        if (this.mPreviewType.mo5927b().intValue() == 4) {
            return true;
        }
        return false;
    }

    public boolean isInBlockState() {
        if (this.mPreviewType.mo5927b().intValue() == 3) {
            return true;
        }
        return false;
    }

    public boolean isVCAttachment() {
        Bundle bundle;
        if (this.mOpenEntity.isInVc() || ((bundle = this.mArgs) != null && bundle.getBoolean("vc_follow_attachment"))) {
            return true;
        }
        return false;
    }

    public static C1144ai.AbstractC1146b newFactory(final Bundle bundle) {
        return new C1144ai.AbstractC1146b() {
            /* class com.bytedance.ee.bear.drive.core.C6937b.C69381 */

            @Override // androidx.lifecycle.C1144ai.AbstractC1146b
            public <T extends AbstractC1142af> T create(Class<T> cls) {
                return new C6937b(bundle);
            }
        };
    }

    public void setFileName(String str) {
        this.mFileName.mo5926a(str);
    }

    public <FM extends AbstractC6946a> void setFileModel(FM fm) {
        if (fm == null) {
            C13479a.m54758a("DriveSdk", "setFileModel() is null value");
        } else {
            this.mIFileModel = C7090c.m28237a(fm);
        }
    }

    public C6937b(Bundle bundle) {
        this.mFileName = new C1177w<>();
        this.mIsHistoryModel = new C1177w<>(false);
        this.mPreviewType = new C1177w<>(0);
        this.mArgs = bundle;
        readArgs(bundle);
    }

    public void updatePreviewType(int i) {
        C13479a.m54764b("DriveSdk", "updatePreviewType() value=" + i);
        if (this.mPreviewType.mo5927b().intValue() != i) {
            this.mPreviewType.mo5926a(Integer.valueOf(i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: androidx.lifecycle.w<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    private void readArgs(Bundle bundle) {
        if (bundle == null) {
            C13479a.m54758a("DriveComponent", "readArgs() error, args=null");
            this.mOpenEntity = new DefaultOpenEntity();
            return;
        }
        try {
            BaseOpenEntity baseOpenEntity = (BaseOpenEntity) bundle.getParcelable("extra_drive_sdk_open_entity");
            this.mOpenEntity = baseOpenEntity;
            if (baseOpenEntity != null) {
                if (baseOpenEntity.getBizType() > 0) {
                    this.mBizType = this.mOpenEntity.getBizType();
                    this.mFileName.mo5929b((String) C13657b.m55418a(this.mOpenEntity.getFileName(), ""));
                    this.mIsVcModel = bundle.getBoolean("vc_follow_mode", false);
                    Bundle extras = this.mOpenEntity.getExtras();
                    if (extras != null) {
                        this.mIsHistoryModel.mo5929b(Boolean.valueOf(extras.getBoolean("history", false)));
                    }
                    this.mWikiInfo = (WikiInfo) bundle.getSerializable("wiki_info");
                    this.mPreviewType.mo5929b(Integer.valueOf(this.mOpenEntity.getPreviewType()));
                    C13479a.m54764b("DriveComponent", "readArgs() done mBizType=" + this.mBizType + " mIsVcModel=" + this.mIsVcModel + " mIsHistoryModel=" + this.mIsHistoryModel);
                    return;
                }
            }
            this.mOpenEntity = new DefaultOpenEntity();
        } catch (Exception e) {
            C13479a.m54761a("DriveSdk", e);
        }
    }
}
