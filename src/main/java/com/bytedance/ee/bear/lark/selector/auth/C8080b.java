package com.bytedance.ee.bear.lark.selector.auth;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.lark.selector.auth.C8075a;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.DocPermission;
import com.bytedance.lark.pb.space.doc.v1.GetMessageDocPermissionsRequest;
import com.bytedance.lark.pb.space.doc.v1.GetMessageDocPermissionsResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.doc.entity.DocPermPair;
import com.ss.android.lark.doc.entity.DocPermission;
import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.ee.bear.lark.selector.auth.b */
public class C8080b {
    /* renamed from: a */
    private static void m32336a(List<String> list, IGetDataCallback<Map<String, Map<String, List<DocPermission>>>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_MESSAGE_DOC_PERMISSIONS, new GetMessageDocPermissionsRequest.C19259a().mo65716a(new ArrayList(list)), iGetDataCallback, new SdkSender.IParser<Map<String, Map<String, List<DocPermission>>>>() {
            /* class com.bytedance.ee.bear.lark.selector.auth.C8080b.C80832 */

            /* renamed from: a */
            public Map<String, Map<String, List<DocPermission>>> parse(byte[] bArr) throws IOException {
                HashMap hashMap = new HashMap();
                Map<String, GetMessageDocPermissionsResponse.PermissionListInfo> map = GetMessageDocPermissionsResponse.ADAPTER.decode(bArr).message_id2permission_list_info;
                if (map.isEmpty()) {
                    return hashMap;
                }
                for (Map.Entry<String, GetMessageDocPermissionsResponse.PermissionListInfo> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Map<String, GetMessageDocPermissionsResponse.PermissionListInfo.PermissionList> map2 = entry.getValue().doc_url2permission_list;
                    if (!map2.isEmpty()) {
                        HashMap hashMap2 = new HashMap();
                        for (Map.Entry<String, GetMessageDocPermissionsResponse.PermissionListInfo.PermissionList> entry2 : map2.entrySet()) {
                            String key2 = entry2.getKey();
                            List<DocPermission.Permission> list = entry2.getValue().permissions;
                            ArrayList arrayList = new ArrayList();
                            HashSet hashSet = new HashSet();
                            for (DocPermission.Permission permission : list) {
                                if (!hashSet.contains(permission.code)) {
                                    com.ss.android.lark.doc.entity.DocPermission docPermission = new com.ss.android.lark.doc.entity.DocPermission();
                                    docPermission.setPermName(permission.name);
                                    docPermission.setPermCode(permission.code.intValue());
                                    docPermission.setIsSet(true);
                                    arrayList.add(docPermission);
                                    hashSet.add(permission.code);
                                }
                            }
                            hashMap2.put(key2, arrayList);
                        }
                        hashMap.put(key, hashMap2);
                    }
                }
                return hashMap;
            }
        });
    }

    /* renamed from: a */
    public static void m32335a(final Context context, final Map<String, Map<String, DocResult>> map, final AbstractC8084c cVar) {
        m32336a(new ArrayList(map.keySet()), new UIGetDataCallback<Map<String, Map<String, List<com.ss.android.lark.doc.entity.DocPermission>>>>() {
            /* class com.bytedance.ee.bear.lark.selector.auth.C8080b.C80811 */

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
                Log.m165382e("pull doc perm error:" + errorResult.toString());
                AbstractC8084c cVar = cVar;
                if (cVar != null) {
                    cVar.mo31233a();
                }
            }

            /* renamed from: a */
            public void onSuccessed(Map<String, Map<String, List<com.ss.android.lark.doc.entity.DocPermission>>> map) {
                int i;
                boolean z;
                if (map.isEmpty()) {
                    AbstractC8084c cVar = cVar;
                    if (cVar != null) {
                        cVar.mo31234a(new HashMap());
                        return;
                    }
                    return;
                }
                HashMap hashMap = new HashMap();
                for (Map.Entry<String, Map<String, List<com.ss.android.lark.doc.entity.DocPermission>>> entry : map.entrySet()) {
                    Map map2 = (Map) map.get(entry.getKey());
                    for (Map.Entry<String, List<com.ss.android.lark.doc.entity.DocPermission>> entry2 : entry.getValue().entrySet()) {
                        String key = entry2.getKey();
                        List<com.ss.android.lark.doc.entity.DocPermission> value = entry2.getValue();
                        if (!value.isEmpty() && map2.containsKey(key)) {
                            DocResult docResult = (DocResult) map2.get(key);
                            com.ss.android.lark.doc.entity.DocPermission currentDocPerm = docResult.getDocCard().getCurrentDocPerm();
                            if (currentDocPerm != null) {
                                i = currentDocPerm.getPermCode();
                            } else {
                                i = DocPermPair.PermType.READ.getNumber();
                            }
                            for (com.ss.android.lark.doc.entity.DocPermission docPermission : value) {
                                if (docPermission.getPermCode() == i) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                docPermission.setIsSet(z);
                            }
                            docResult.getDocCard().setPermissions(value);
                            hashMap.put(key, docResult);
                        }
                    }
                }
                if (hashMap.isEmpty()) {
                    AbstractC8084c cVar2 = cVar;
                    if (cVar2 != null) {
                        cVar2.mo31234a(new HashMap());
                        return;
                    }
                    return;
                }
                C8075a.m32326a(new ArrayList(hashMap.values())).mo31223a(new C8075a.AbstractC8079a() {
                    /* class com.bytedance.ee.bear.lark.selector.auth.C8080b.C80811.C80821 */

                    @Override // com.bytedance.ee.bear.lark.selector.auth.C8075a.AbstractC8079a
                    /* renamed from: a */
                    public void mo31228a() {
                        if (cVar != null) {
                            cVar.mo31233a();
                        }
                    }

                    @Override // com.bytedance.ee.bear.lark.selector.auth.C8075a.AbstractC8079a
                    /* renamed from: b */
                    public void mo31230b() {
                        if (cVar != null) {
                            cVar.mo31235b();
                        }
                    }

                    @Override // com.bytedance.ee.bear.lark.selector.auth.C8075a.AbstractC8079a
                    /* renamed from: a */
                    public void mo31229a(Map<String, DocPermPair.PermType> map) {
                        if (cVar != null) {
                            HashMap hashMap = new HashMap();
                            for (Map.Entry entry : map.entrySet()) {
                                String str = (String) entry.getKey();
                                Set<String> keySet = ((Map) entry.getValue()).keySet();
                                HashMap hashMap2 = new HashMap();
                                for (String str2 : keySet) {
                                    if (map.containsKey(str2)) {
                                        hashMap2.put(str2, map.get(str2));
                                    }
                                }
                                if (!hashMap2.isEmpty()) {
                                    hashMap.put(str, hashMap2);
                                }
                            }
                            cVar.mo31234a(hashMap);
                        }
                    }
                }).mo31224a((FragmentActivity) context);
            }
        });
    }
}
