package com.larksuite.component.blockit.hashtag;

import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.blockit.entity.BatchGetItemTagsRequest;
import com.larksuite.component.blockit.entity.BatchGetItemTagsResponse;
import com.larksuite.component.blockit.entity.BatchGetItemTagsResponseWrap;
import com.larksuite.component.blockit.entity.BatchTagActionRequest;
import com.larksuite.component.blockit.entity.BatchTagActionResponse;
import com.larksuite.component.blockit.entity.BatchTagActionResponseWrap;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.entity.BlockInfo;
import com.larksuite.component.blockit.entity.CreateTagAndAddItemRequest;
import com.larksuite.component.blockit.entity.CreateTagAndAddItemResponse;
import com.larksuite.component.blockit.entity.CreateTagAndAddItemResponseWrap;
import com.larksuite.component.blockit.entity.SearchTagViewRequest;
import com.larksuite.component.blockit.entity.SearchTagViewResponse;
import com.larksuite.component.blockit.entity.SearchTagViewResponseWrap;
import com.larksuite.component.blockit.entity.SearchTagsRequest;
import com.larksuite.component.blockit.entity.SearchTagsResponse;
import com.larksuite.component.blockit.entity.SearchTagsResponseWrap;
import com.larksuite.component.blockit.entity.TagPermissionType;
import com.larksuite.component.blockit.entity.TagScene;
import com.larksuite.component.blockit.p1067b.C24050a;
import com.larksuite.component.blockit.props.C24137g;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.http.request.AbstractC26011b;
import com.larksuite.framework.http.request.C26010a;
import com.larksuite.framework.http.request.HttpMethod;
import com.larksuite.framework.http.request.RequestBody;
import com.larksuite.framework.http.response.BaseResponse;
import com.larksuite.framework.http.response.ErrorResult;
import com.ss.android.lark.log.Log;
import java.util.Collections;

/* renamed from: com.larksuite.component.blockit.hashtag.a */
public class C24077a {

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.component.blockit.hashtag.a$a */
    public static final class C24084a {

        /* renamed from: a */
        public static final C24077a f59518a = new C24077a();
    }

    /* renamed from: a */
    public static C24077a m87926a() {
        return C24084a.f59518a;
    }

    /* renamed from: b */
    private String m87928b() {
        int i = C240836.f59517a[C24050a.m87868c().ordinal()];
        if (i == 2) {
            return "https://oa.feishu-pre.cn/pano";
        }
        if (i != 3) {
            return "https://oa.feishu-boe.cn/pano";
        }
        return "https://oa.feishu.cn/pano";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.blockit.hashtag.a$6 */
    public static /* synthetic */ class C240836 {

        /* renamed from: a */
        static final /* synthetic */ int[] f59517a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.larksuite.component.blockit.entity.BlockitEnv[] r0 = com.larksuite.component.blockit.entity.BlockitEnv.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.component.blockit.hashtag.C24077a.C240836.f59517a = r0
                com.larksuite.component.blockit.entity.BlockitEnv r1 = com.larksuite.component.blockit.entity.BlockitEnv.STAGING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.component.blockit.hashtag.C24077a.C240836.f59517a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.larksuite.component.blockit.entity.BlockitEnv r1 = com.larksuite.component.blockit.entity.BlockitEnv.PRE_RELEASE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.larksuite.component.blockit.hashtag.C24077a.C240836.f59517a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.larksuite.component.blockit.entity.BlockitEnv r1 = com.larksuite.component.blockit.entity.BlockitEnv.ONLINE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.blockit.hashtag.C24077a.C240836.<clinit>():void");
        }
    }

    /* renamed from: a */
    private void m87927a(final String str, BatchTagActionRequest batchTagActionRequest, final IGetDataCallback<BatchTagActionResponse> iGetDataCallback) {
        Log.m165389i("HashTagService", "batchTagAction: " + str);
        String jSONString = JSONObject.toJSONString(batchTagActionRequest);
        new C26010a(HttpMethod.POST, m87928b() + "/api/BatchTagAction").mo92471a(RequestBody.create("application/json", jSONString)).mo92468a(C24050a.m87869d()).mo92475a(new AbstractC26011b<BaseResponse>() {
            /* class com.larksuite.component.blockit.hashtag.C24077a.C240803 */

            @Override // com.larksuite.framework.http.request.AbstractC26011b
            /* renamed from: a */
            public void mo86433a(ErrorResult errorResult) {
                Log.m165397w("HashTagService", errorResult.toString());
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(new com.larksuite.framework.callback.Entity.ErrorResult(errorResult.getHttpStatusCode(), errorResult.getErrorMessage()));
                }
            }

            /* renamed from: a */
            public void mo86434a(BaseResponse baseResponse) {
                if (baseResponse != null) {
                    try {
                        String message = baseResponse.message();
                        BatchTagActionResponseWrap batchTagActionResponseWrap = (BatchTagActionResponseWrap) JSONObject.parseObject(message, BatchTagActionResponseWrap.class);
                        if (batchTagActionResponseWrap.code == 0) {
                            C24137g.m88164a().mo86648a(str, batchTagActionResponseWrap.data.latestItemTags);
                            IGetDataCallback iGetDataCallback = iGetDataCallback;
                            if (iGetDataCallback != null) {
                                iGetDataCallback.onSuccess(batchTagActionResponseWrap.data);
                                return;
                            }
                            return;
                        }
                        Log.m165397w("HashTagService", "result:" + message);
                        IGetDataCallback iGetDataCallback2 = iGetDataCallback;
                        if (iGetDataCallback2 != null) {
                            iGetDataCallback2.onError(new com.larksuite.framework.callback.Entity.ErrorResult(batchTagActionResponseWrap.code, batchTagActionResponseWrap.msg));
                        }
                    } catch (Exception e) {
                        Log.m165398w("HashTagService", "batchTagAction result:" + ((String) null), e);
                        IGetDataCallback iGetDataCallback3 = iGetDataCallback;
                        if (iGetDataCallback3 != null) {
                            iGetDataCallback3.onError(new com.larksuite.framework.callback.Entity.ErrorResult("Error"));
                        }
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public void mo86431b(String str, String str2, final IGetDataCallback<SearchTagViewResponse> iGetDataCallback) {
        Log.m165389i("HashTagService", "SearchTagView");
        SearchTagViewRequest searchTagViewRequest = new SearchTagViewRequest();
        searchTagViewRequest.userId = str;
        searchTagViewRequest.name = str2;
        searchTagViewRequest.isPreciseSearch = false;
        String jSONString = JSONObject.toJSONString(searchTagViewRequest);
        new C26010a(HttpMethod.POST, m87928b() + "/api/SearchTagView").mo92471a(RequestBody.create("application/json", jSONString)).mo92468a(C24050a.m87869d()).mo92475a(new AbstractC26011b<BaseResponse>() {
            /* class com.larksuite.component.blockit.hashtag.C24077a.C240825 */

            @Override // com.larksuite.framework.http.request.AbstractC26011b
            /* renamed from: a */
            public void mo86433a(ErrorResult errorResult) {
                Log.m165397w("HashTagService", errorResult.toString());
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(new com.larksuite.framework.callback.Entity.ErrorResult(errorResult.getHttpStatusCode(), errorResult.getErrorMessage()));
                }
            }

            /* renamed from: a */
            public void mo86434a(BaseResponse baseResponse) {
                if (baseResponse != null) {
                    try {
                        String message = baseResponse.message();
                        SearchTagViewResponseWrap searchTagViewResponseWrap = (SearchTagViewResponseWrap) JSONObject.parseObject(message, SearchTagViewResponseWrap.class);
                        if (searchTagViewResponseWrap.code == 0) {
                            IGetDataCallback iGetDataCallback = iGetDataCallback;
                            if (iGetDataCallback != null) {
                                iGetDataCallback.onSuccess(searchTagViewResponseWrap.data);
                                return;
                            }
                            return;
                        }
                        Log.m165397w("HashTagService", "result:" + message);
                        IGetDataCallback iGetDataCallback2 = iGetDataCallback;
                        if (iGetDataCallback2 != null) {
                            iGetDataCallback2.onError(new com.larksuite.framework.callback.Entity.ErrorResult(searchTagViewResponseWrap.code, searchTagViewResponseWrap.msg));
                        }
                    } catch (Exception e) {
                        Log.m165398w("HashTagService", "SearchTagView result:" + ((String) null), e);
                        IGetDataCallback iGetDataCallback3 = iGetDataCallback;
                        if (iGetDataCallback3 != null) {
                            iGetDataCallback3.onError(new com.larksuite.framework.callback.Entity.ErrorResult("Error"));
                        }
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo86428a(String str, String str2, final IGetDataCallback<SearchTagsResponse> iGetDataCallback) {
        Log.m165389i("HashTagService", "searchTags uniqueId: " + str);
        SearchTagsRequest searchTagsRequest = new SearchTagsRequest();
        searchTagsRequest.uniqueId = str;
        searchTagsRequest.tagName = str2;
        searchTagsRequest.isPreciseSearch = false;
        String jSONString = JSONObject.toJSONString(searchTagsRequest);
        new C26010a(HttpMethod.POST, m87928b() + "/api/SearchTags").mo92471a(RequestBody.create("application/json", jSONString)).mo92468a(C24050a.m87869d()).mo92475a(new AbstractC26011b<BaseResponse>() {
            /* class com.larksuite.component.blockit.hashtag.C24077a.C240814 */

            @Override // com.larksuite.framework.http.request.AbstractC26011b
            /* renamed from: a */
            public void mo86433a(ErrorResult errorResult) {
                Log.m165397w("HashTagService", errorResult.toString());
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(new com.larksuite.framework.callback.Entity.ErrorResult(errorResult.getHttpStatusCode(), errorResult.getErrorMessage()));
                }
            }

            /* renamed from: a */
            public void mo86434a(BaseResponse baseResponse) {
                if (baseResponse != null) {
                    try {
                        String message = baseResponse.message();
                        SearchTagsResponseWrap searchTagsResponseWrap = (SearchTagsResponseWrap) JSONObject.parseObject(message, SearchTagsResponseWrap.class);
                        if (searchTagsResponseWrap.code == 0) {
                            IGetDataCallback iGetDataCallback = iGetDataCallback;
                            if (iGetDataCallback != null) {
                                iGetDataCallback.onSuccess(searchTagsResponseWrap.data);
                                return;
                            }
                            return;
                        }
                        Log.m165397w("HashTagService", "result:" + message);
                        IGetDataCallback iGetDataCallback2 = iGetDataCallback;
                        if (iGetDataCallback2 != null) {
                            iGetDataCallback2.onError(new com.larksuite.framework.callback.Entity.ErrorResult(searchTagsResponseWrap.code, searchTagsResponseWrap.msg));
                        }
                    } catch (Exception e) {
                        Log.m165398w("HashTagService", "searchTags result:" + ((String) null), e);
                        IGetDataCallback iGetDataCallback3 = iGetDataCallback;
                        if (iGetDataCallback3 != null) {
                            iGetDataCallback3.onError(new com.larksuite.framework.callback.Entity.ErrorResult("Error"));
                        }
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public void mo86430b(String str, BlockEntity blockEntity, String str2, IGetDataCallback<BatchTagActionResponse> iGetDataCallback) {
        Log.m165389i("HashTagService", "addTag:" + str + ":" + blockEntity.getBlockID());
        BatchTagActionRequest.AddTagAction addTagAction = new BatchTagActionRequest.AddTagAction();
        addTagAction.tagId = str;
        addTagAction.tagType = 1;
        BatchTagActionRequest.ItemTagAction itemTagAction = new BatchTagActionRequest.ItemTagAction();
        itemTagAction.uniqId = blockEntity.getBlockID();
        itemTagAction.blockInfo = new BlockInfo(blockEntity);
        itemTagAction.tagsAdding = Collections.singletonList(addTagAction);
        BatchTagActionRequest batchTagActionRequest = new BatchTagActionRequest();
        batchTagActionRequest.itemsAction = Collections.singletonList(itemTagAction);
        batchTagActionRequest.context = str2;
        m87927a(blockEntity.getBlockID(), batchTagActionRequest, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo86426a(String str, final BlockEntity blockEntity, String str2, final IGetDataCallback<CreateTagAndAddItemResponse> iGetDataCallback) {
        Log.m165389i("HashTagService", "createTag id: " + blockEntity.getBlockID());
        CreateTagAndAddItemRequest createTagAndAddItemRequest = new CreateTagAndAddItemRequest();
        createTagAndAddItemRequest.tagName = str;
        createTagAndAddItemRequest.tagType = 1;
        createTagAndAddItemRequest.uniqId = blockEntity.getBlockID();
        createTagAndAddItemRequest.blockInfo = new BlockInfo(blockEntity);
        createTagAndAddItemRequest.context = str2;
        createTagAndAddItemRequest.permissionType = TagPermissionType.Private.value();
        createTagAndAddItemRequest.scene = TagScene.Default.value();
        String jSONString = JSONObject.toJSONString(createTagAndAddItemRequest);
        new C26010a(HttpMethod.POST, m87928b() + "/api/CreateTagAndAddItem").mo92471a(RequestBody.create("application/json", jSONString)).mo92468a(C24050a.m87869d()).mo92475a(new AbstractC26011b<BaseResponse>() {
            /* class com.larksuite.component.blockit.hashtag.C24077a.C240792 */

            @Override // com.larksuite.framework.http.request.AbstractC26011b
            /* renamed from: a */
            public void mo86433a(ErrorResult errorResult) {
                Log.m165397w("HashTagService", errorResult.toString());
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(new com.larksuite.framework.callback.Entity.ErrorResult(errorResult.getHttpStatusCode(), errorResult.getErrorMessage()));
                }
            }

            /* renamed from: a */
            public void mo86434a(BaseResponse baseResponse) {
                if (baseResponse != null) {
                    try {
                        String message = baseResponse.message();
                        CreateTagAndAddItemResponseWrap createTagAndAddItemResponseWrap = (CreateTagAndAddItemResponseWrap) JSONObject.parseObject(message, CreateTagAndAddItemResponseWrap.class);
                        if (createTagAndAddItemResponseWrap.code == 0) {
                            C24137g.m88164a().mo86648a(blockEntity.getBlockID(), Collections.singletonMap(createTagAndAddItemResponseWrap.data.latestItemTags.uniqId, createTagAndAddItemResponseWrap.data.latestItemTags));
                            IGetDataCallback iGetDataCallback = iGetDataCallback;
                            if (iGetDataCallback != null) {
                                iGetDataCallback.onSuccess(createTagAndAddItemResponseWrap.data);
                                return;
                            }
                            return;
                        }
                        Log.m165397w("HashTagService", "result:" + message);
                        IGetDataCallback iGetDataCallback2 = iGetDataCallback;
                        if (iGetDataCallback2 != null) {
                            iGetDataCallback2.onError(new com.larksuite.framework.callback.Entity.ErrorResult(createTagAndAddItemResponseWrap.code, createTagAndAddItemResponseWrap.msg));
                        }
                    } catch (Exception e) {
                        Log.m165398w("HashTagService", "createTag result:" + ((String) null), e);
                        IGetDataCallback iGetDataCallback3 = iGetDataCallback;
                        if (iGetDataCallback3 != null) {
                            iGetDataCallback3.onError(new com.larksuite.framework.callback.Entity.ErrorResult("Error"));
                        }
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo86427a(String str, String str2, BlockEntity blockEntity, String str3, IGetDataCallback<BatchTagActionResponse> iGetDataCallback) {
        Log.m165389i("HashTagService", "deleteTag:" + str + ":" + blockEntity.getBlockID());
        BatchTagActionRequest.RemoveTagAction removeTagAction = new BatchTagActionRequest.RemoveTagAction();
        removeTagAction.tagId = str;
        removeTagAction.tagType = 1;
        removeTagAction.tagInstanceId = str2;
        BatchTagActionRequest.ItemTagAction itemTagAction = new BatchTagActionRequest.ItemTagAction();
        itemTagAction.uniqId = blockEntity.getBlockID();
        itemTagAction.blockInfo = new BlockInfo(blockEntity);
        itemTagAction.tagsRemoving = Collections.singletonList(removeTagAction);
        BatchTagActionRequest batchTagActionRequest = new BatchTagActionRequest();
        batchTagActionRequest.itemsAction = Collections.singletonList(itemTagAction);
        batchTagActionRequest.context = str3;
        m87927a(blockEntity.getBlockID(), batchTagActionRequest, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo86429a(final String str, boolean z, boolean z2, String str2, final IGetDataCallback<BatchGetItemTagsResponse> iGetDataCallback) {
        Log.m165389i("HashTagService", "getTagList blockId: " + str);
        BatchGetItemTagsRequest batchGetItemTagsRequest = new BatchGetItemTagsRequest();
        batchGetItemTagsRequest.fetchDeletePerm = z;
        batchGetItemTagsRequest.fetchSubscribe = z2;
        batchGetItemTagsRequest.uniqIds = Collections.singletonList(str);
        batchGetItemTagsRequest.context = str2;
        batchGetItemTagsRequest.needTeamworkerCount = true;
        String jSONString = JSONObject.toJSONString(batchGetItemTagsRequest);
        new C26010a(HttpMethod.POST, m87928b() + "/api/BatchGetItemTags").mo92471a(RequestBody.create("application/json", jSONString)).mo92468a(C24050a.m87869d()).mo92475a(new AbstractC26011b<BaseResponse>() {
            /* class com.larksuite.component.blockit.hashtag.C24077a.C240781 */

            @Override // com.larksuite.framework.http.request.AbstractC26011b
            /* renamed from: a */
            public void mo86433a(ErrorResult errorResult) {
                Log.m165397w("HashTagService", errorResult.toString());
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(new com.larksuite.framework.callback.Entity.ErrorResult(errorResult.getHttpStatusCode(), errorResult.getErrorMessage()));
                }
            }

            /* renamed from: a */
            public void mo86434a(BaseResponse baseResponse) {
                if (baseResponse != null) {
                    try {
                        String message = baseResponse.message();
                        BatchGetItemTagsResponseWrap batchGetItemTagsResponseWrap = (BatchGetItemTagsResponseWrap) JSONObject.parseObject(message, BatchGetItemTagsResponseWrap.class);
                        if (batchGetItemTagsResponseWrap.code == 0) {
                            C24137g.m88164a().mo86648a(str, batchGetItemTagsResponseWrap.data.itemsTags);
                            IGetDataCallback iGetDataCallback = iGetDataCallback;
                            if (iGetDataCallback != null) {
                                iGetDataCallback.onSuccess(batchGetItemTagsResponseWrap.data);
                                return;
                            }
                            return;
                        }
                        Log.m165397w("HashTagService", "result:" + message);
                        IGetDataCallback iGetDataCallback2 = iGetDataCallback;
                        if (iGetDataCallback2 != null) {
                            iGetDataCallback2.onError(new com.larksuite.framework.callback.Entity.ErrorResult(batchGetItemTagsResponseWrap.code, batchGetItemTagsResponseWrap.msg));
                        }
                    } catch (Exception e) {
                        Log.m165398w("HashTagService", "getTagList result:" + ((String) null), e);
                        IGetDataCallback iGetDataCallback3 = iGetDataCallback;
                        if (iGetDataCallback3 != null) {
                            iGetDataCallback3.onError(new com.larksuite.framework.callback.Entity.ErrorResult("Error"));
                        }
                    }
                }
            }
        });
    }
}
