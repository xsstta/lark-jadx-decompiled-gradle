package com.larksuite.component.blockit.hashtag.list;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.blockit.entity.BatchGetItemTagsResponse;
import com.larksuite.component.blockit.entity.BatchTagActionResponse;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.entity.GrantRecord4Get;
import com.larksuite.component.blockit.entity.ItemTags;
import com.larksuite.component.blockit.entity.TagInstance;
import com.larksuite.component.blockit.hashtag.C24077a;
import com.larksuite.component.blockit.hashtag.HashTagViewData;
import com.larksuite.component.blockit.hashtag.list.IHashTagListContract;
import com.larksuite.component.blockit.p1067b.C24050a;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J&\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\u0010\u0011\u001a\u00060\u0012R\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\tH\u0002J\u001e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/larksuite/component/blockit/hashtag/list/HashTagListModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/larksuite/component/blockit/hashtag/list/IHashTagListContract$IModel;", "blockEntity", "Lcom/larksuite/component/blockit/entity/BlockEntity;", "contextJson", "", "(Lcom/larksuite/component/blockit/entity/BlockEntity;Ljava/lang/String;)V", "create", "", "deleteTag", "tagId", "tagInstanceId", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/larksuite/component/blockit/hashtag/list/InitData;", "generateOwnerName", "tag", "Lcom/larksuite/component/blockit/entity/TagInstance$BasicTagInfo;", "Lcom/larksuite/component/blockit/entity/TagInstance;", "init", "loadAddedHashTags", "blockId", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.blockit.hashtag.list.b */
public final class HashTagListModel extends BaseModel implements IHashTagListContract.IModel {

    /* renamed from: a */
    private final BlockEntity f59581a;

    /* renamed from: b */
    private final String f59582b;

    /* renamed from: a */
    private final void m88039a() {
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m88039a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/larksuite/component/blockit/hashtag/list/HashTagListModel$deleteTag$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/larksuite/component/blockit/entity/BatchTagActionResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.list.b$a */
    public static final class C24102a implements IGetDataCallback<BatchTagActionResponse> {

        /* renamed from: a */
        final /* synthetic */ HashTagListModel f59583a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f59584b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            IGetDataCallback iGetDataCallback = this.f59584b;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }

        /* renamed from: a */
        public void onSuccess(BatchTagActionResponse batchTagActionResponse) {
            Map<String, ItemTags> map;
            Collection<ItemTags> values;
            ItemTags itemTags = null;
            if (!CollectionUtils.isEmpty(batchTagActionResponse != null ? batchTagActionResponse.latestItemTags : null)) {
                ArrayList arrayList = new ArrayList();
                if (!(batchTagActionResponse == null || (map = batchTagActionResponse.latestItemTags) == null || (values = map.values()) == null)) {
                    itemTags = (ItemTags) CollectionsKt.first(values);
                }
                if (itemTags == null) {
                    Intrinsics.throwNpe();
                }
                for (TagInstance tagInstance : itemTags.tags) {
                    String str = tagInstance.tagInfo.tagId;
                    Intrinsics.checkExpressionValueIsNotNull(str, "tag.tagInfo.tagId");
                    String str2 = tagInstance.instanceId;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "tag.instanceId");
                    String str3 = tagInstance.tagInfo.name;
                    Intrinsics.checkExpressionValueIsNotNull(str3, "tag.tagInfo.name");
                    boolean z = tagInstance.isSubscribed;
                    boolean z2 = tagInstance.viewable;
                    boolean z3 = tagInstance.deletable;
                    String str4 = tagInstance.appLink;
                    HashTagListModel bVar = this.f59583a;
                    TagInstance.BasicTagInfo basicTagInfo = tagInstance.tagInfo;
                    Intrinsics.checkExpressionValueIsNotNull(basicTagInfo, "tag.tagInfo");
                    arrayList.add(new HashTagViewData(str, str2, str3, z, false, z2, z3, str4, bVar.mo86513a(basicTagInfo), 0, null, false, 3584, null));
                }
                IGetDataCallback iGetDataCallback = this.f59584b;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(new InitData(arrayList));
                }
            }
        }

        C24102a(HashTagListModel bVar, IGetDataCallback iGetDataCallback) {
            this.f59583a = bVar;
            this.f59584b = iGetDataCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/larksuite/component/blockit/hashtag/list/HashTagListModel$loadAddedHashTags$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/larksuite/component/blockit/entity/BatchGetItemTagsResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.list.b$b */
    public static final class C24103b implements IGetDataCallback<BatchGetItemTagsResponse> {

        /* renamed from: a */
        final /* synthetic */ HashTagListModel f59585a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f59586b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f59586b.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(BatchGetItemTagsResponse batchGetItemTagsResponse) {
            Map<String, ItemTags> map;
            Collection<ItemTags> values;
            ItemTags itemTags = null;
            if (!CollectionUtils.isEmpty(batchGetItemTagsResponse != null ? batchGetItemTagsResponse.itemsTags : null)) {
                ArrayList arrayList = new ArrayList();
                if (!(batchGetItemTagsResponse == null || (map = batchGetItemTagsResponse.itemsTags) == null || (values = map.values()) == null)) {
                    itemTags = (ItemTags) CollectionsKt.first(values);
                }
                if (itemTags == null) {
                    Intrinsics.throwNpe();
                }
                for (TagInstance tagInstance : itemTags.tags) {
                    String str = tagInstance.tagInfo.tagId;
                    Intrinsics.checkExpressionValueIsNotNull(str, "tag.tagInfo.tagId");
                    String str2 = tagInstance.instanceId;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "tag.instanceId");
                    String str3 = tagInstance.tagInfo.name;
                    Intrinsics.checkExpressionValueIsNotNull(str3, "tag.tagInfo.name");
                    boolean z = tagInstance.isSubscribed;
                    boolean z2 = tagInstance.viewable;
                    boolean z3 = tagInstance.deletable;
                    String str4 = tagInstance.appLink;
                    HashTagListModel bVar = this.f59585a;
                    TagInstance.BasicTagInfo basicTagInfo = tagInstance.tagInfo;
                    Intrinsics.checkExpressionValueIsNotNull(basicTagInfo, "tag.tagInfo");
                    String a = bVar.mo86513a(basicTagInfo);
                    int i = tagInstance.tagInfo.permissionType;
                    String str5 = tagInstance.tagInfo.teamworkerCount;
                    Intrinsics.checkExpressionValueIsNotNull(str5, "tag.tagInfo.teamworkerCount");
                    arrayList.add(new HashTagViewData(str, str2, str3, z, false, z2, z3, str4, a, i, str5, false, 2048, null));
                }
                this.f59586b.onSuccess(new InitData(arrayList));
                return;
            }
            this.f59586b.onSuccess(new InitData(CollectionsKt.emptyList()));
        }

        C24103b(HashTagListModel bVar, IGetDataCallback iGetDataCallback) {
            this.f59585a = bVar;
            this.f59586b = iGetDataCallback;
        }
    }

    /* renamed from: a */
    public final String mo86513a(TagInstance.BasicTagInfo basicTagInfo) {
        String str = "";
        if (!CollectionUtils.isEmpty(basicTagInfo.owners)) {
            for (GrantRecord4Get grantRecord4Get : basicTagInfo.owners) {
                if (grantRecord4Get.name != null && !CollectionUtils.isEmpty(grantRecord4Get.name.values())) {
                    str = grantRecord4Get.name.get(C24050a.m87867b());
                    if (TextUtils.isEmpty(str)) {
                        str = (String) CollectionsKt.first(grantRecord4Get.name.values());
                    }
                }
            }
        }
        return str;
    }

    public HashTagListModel(BlockEntity blockEntity, String str) {
        Intrinsics.checkParameterIsNotNull(blockEntity, "blockEntity");
        this.f59581a = blockEntity;
        this.f59582b = str;
    }

    @Override // com.larksuite.component.blockit.hashtag.list.IHashTagListContract.IModel
    /* renamed from: a */
    public void mo86514a(String str, IGetDataCallback<InitData> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "blockId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C24077a.m87926a().mo86429a(str, true, true, this.f59582b, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new C24103b(this, iGetDataCallback)));
    }

    @Override // com.larksuite.component.blockit.hashtag.list.IHashTagListContract.IModel
    /* renamed from: a */
    public void mo86515a(String str, String str2, IGetDataCallback<InitData> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "tagId");
        Intrinsics.checkParameterIsNotNull(str2, "tagInstanceId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C24077a.m87926a().mo86427a(str, str2, this.f59581a, this.f59582b, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new C24102a(this, iGetDataCallback)));
    }
}
