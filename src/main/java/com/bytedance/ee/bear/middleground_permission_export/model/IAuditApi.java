package com.bytedance.ee.bear.middleground_permission_export.model;

import com.bytedance.ee.bear.list.dto.C8275a;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH&J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\tH&JI\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\tH&¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/middleground_permission_export/model/IAuditApi;", "", "doAudit", "", "documentType", "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "operationType", "", "token", "", "appDetail", "containerType", "containerId", "moduleType", "appFileId", "appId", "localFile", "", "thirdPartyAppID", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "middleground-permission-export_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground_permission_export.model.c */
public interface IAuditApi {
    /* renamed from: a */
    void mo37701a(int i, int i2, String str);

    /* renamed from: a */
    void mo37702a(int i, int i2, String str, String str2, Boolean bool, String str3);

    /* renamed from: a */
    void mo37703a(C8275a aVar, int i, String str, int i2, int i3, String str2);
}
