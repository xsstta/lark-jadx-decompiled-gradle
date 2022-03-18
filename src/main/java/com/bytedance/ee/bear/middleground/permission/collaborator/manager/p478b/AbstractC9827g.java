package com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b;

import com.bytedance.ee.bear.contract.net.AbstractC5204e;
import com.bytedance.ee.bear.middleground.permission.collaborator.AbstractC9636d;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.larksuite.framework.mvp.IModel;
import io.reactivex.AbstractC68307f;

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.g */
public interface AbstractC9827g extends IModel {
    /* renamed from: a */
    AbstractC68307f<IDocPublicPermission> mo37328a(String str, int i);

    /* renamed from: a */
    AbstractC68307f<Boolean> mo37329a(String str, int i, int i2, UserInfo userInfo);

    /* renamed from: a */
    AbstractC68307f<Boolean> mo37330a(String str, int i, UserInfo userInfo);

    /* renamed from: a */
    void mo37331a(String str, int i, int i2, UserInfo userInfo, AbstractC9636d dVar);

    /* renamed from: a */
    void mo37332a(String str, int i, UserInfo userInfo, AbstractC9636d dVar);

    /* renamed from: a */
    void mo37333a(String str, int i, String str2, AbstractC5204e<ShareUserInfoResult> eVar);

    /* renamed from: b */
    AbstractC68307f<Boolean> mo37334b(String str, int i);

    /* renamed from: b */
    void mo37335b(String str, int i, UserInfo userInfo, AbstractC9636d dVar);

    /* renamed from: c */
    AbstractC68307f<IDocUserPermission> mo37336c(String str, int i);
}
