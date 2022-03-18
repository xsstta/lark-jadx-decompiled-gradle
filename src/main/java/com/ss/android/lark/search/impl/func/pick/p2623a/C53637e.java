package com.ss.android.lark.search.impl.func.pick.p2623a;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData;
import com.ss.android.lark.search.impl.func.pick.viewdata.PickChatViewData;
import com.ss.android.lark.search.impl.func.pick.viewdata.PickChatterViewData;
import com.ss.android.lark.search.impl.p2592b.p2595c.C53344a;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.search.impl.func.pick.a.e */
public class C53637e {

    /* renamed from: a */
    private static final ISearchModuleDependency f132399a;

    /* renamed from: b */
    private static final ISearchModuleDependency.AbstractC53317e f132400b;

    /* renamed from: c */
    private static final C53636d f132401c = new C53636d();

    static {
        ISearchModuleDependency a = C53258a.m205939a();
        f132399a = a;
        f132400b = a.mo181756f();
    }

    /* renamed from: a */
    public static List<BasePickViewData> m207637a(List<String> list) {
        return f132401c.mo182951a(list);
    }

    /* renamed from: a */
    public static String m207636a(String str) {
        return f132399a.mo181732a(str, 240, 240);
    }

    /* renamed from: b */
    public static List<BasePickViewData> m207639b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        Map<String, Chat> a = f132400b.mo181781a(list);
        if (CollectionUtils.isEmpty(a)) {
            return arrayList;
        }
        for (String str : list) {
            Chat chat = a.get(str);
            if (chat != null) {
                arrayList.add(C53344a.m206459a(chat));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m207638a(final List<PickChatterViewData> list, final IGetDataCallback<String> iGetDataCallback) {
        if (CollectionUtils.isEmpty(list)) {
            iGetDataCallback.onSuccess(new JSONArray().toJSONString());
        } else {
            C57865c.m224574a(new C57865c.AbstractC57873d<String>() {
                /* class com.ss.android.lark.search.impl.func.pick.p2623a.C53637e.C536381 */

                /* renamed from: a */
                public String produce() {
                    JSONArray jSONArray = new JSONArray();
                    for (PickChatterViewData pickChatterViewData : list) {
                        if (pickChatterViewData != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("ownerId", (Object) pickChatterViewData.getId());
                            jSONObject.put("avatarUrl", (Object) C53637e.m207636a(pickChatterViewData.getImageKey()));
                            jSONObject.put("avatarKey", (Object) pickChatterViewData.getImageKey());
                            jSONArray.add(jSONObject);
                        }
                    }
                    return jSONArray.toJSONString();
                }
            }, new C57865c.AbstractC57871b<String>() {
                /* class com.ss.android.lark.search.impl.func.pick.p2623a.C53637e.C536392 */

                /* renamed from: a */
                public void consume(String str) {
                    iGetDataCallback.onSuccess(str);
                }
            });
        }
    }

    /* renamed from: b */
    public static void m207640b(final List<BasePickViewData> list, final IGetDataCallback<String> iGetDataCallback) {
        if (CollectionUtils.isEmpty(list)) {
            iGetDataCallback.onSuccess(new JSONArray().toJSONString());
        } else {
            C57865c.m224574a(new C57865c.AbstractC57873d<String>() {
                /* class com.ss.android.lark.search.impl.func.pick.p2623a.C53637e.C536403 */

                /* renamed from: a */
                public String produce() {
                    JSONArray jSONArray = new JSONArray();
                    for (BasePickViewData basePickViewData : list) {
                        if (basePickViewData != null) {
                            if (basePickViewData instanceof PickChatterViewData) {
                                PickChatterViewData pickChatterViewData = (PickChatterViewData) basePickViewData;
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("chatId", (Object) pickChatterViewData.getP2pChatId());
                                jSONObject.put("chatType", (Object) 0);
                                jSONObject.put("avatarUrl", (Object) C53637e.m207636a(pickChatterViewData.getImageKey()));
                                jSONObject.put("p2pChatterId", (Object) pickChatterViewData.getId());
                                jSONObject.put("avatarKey", (Object) pickChatterViewData.getImageKey());
                                jSONArray.add(jSONObject);
                            } else if (basePickViewData instanceof PickChatViewData) {
                                PickChatViewData pickChatViewData = (PickChatViewData) basePickViewData;
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("chatId", (Object) pickChatViewData.getId());
                                if (pickChatViewData.getChatType() == Chat.Type.P2P) {
                                    jSONObject2.put("chatType", (Object) 0);
                                } else {
                                    jSONObject2.put("chatType", (Object) 1);
                                }
                                jSONObject2.put("avatarUrl", (Object) C53637e.m207636a(pickChatViewData.getImageKey()));
                                jSONObject2.put("p2pChatterId", (Object) pickChatViewData.getP2pChatterId());
                                jSONObject2.put("avatarKey", (Object) pickChatViewData.getImageKey());
                                jSONArray.add(jSONObject2);
                            }
                        }
                    }
                    return jSONArray.toJSONString();
                }
            }, new C57865c.AbstractC57871b<String>() {
                /* class com.ss.android.lark.search.impl.func.pick.p2623a.C53637e.C536414 */

                /* renamed from: a */
                public void consume(String str) {
                    iGetDataCallback.onSuccess(str);
                }
            });
        }
    }
}
