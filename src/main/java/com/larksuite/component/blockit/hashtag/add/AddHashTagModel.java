package com.larksuite.component.blockit.hashtag.add;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.component.blockit.entity.BatchTagActionResponse;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.entity.CreateTagAndAddItemResponse;
import com.larksuite.component.blockit.entity.GrantRecord;
import com.larksuite.component.blockit.entity.Role;
import com.larksuite.component.blockit.entity.SearchTagViewResponse;
import com.larksuite.component.blockit.entity.SearchTagsResponse;
import com.larksuite.component.blockit.entity.TagStruct;
import com.larksuite.component.blockit.hashtag.C24077a;
import com.larksuite.component.blockit.hashtag.HashTagViewData;
import com.larksuite.component.blockit.hashtag.add.IAddHashTagContract;
import com.larksuite.component.blockit.p1067b.C24050a;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016J(\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J.\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\fH\u0016J0\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\t2\u001e\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u001a0\fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/larksuite/component/blockit/hashtag/add/AddHashTagModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/larksuite/component/blockit/hashtag/add/IAddHashTagContract$IModel;", "blockEntity", "Lcom/larksuite/component/blockit/entity/BlockEntity;", "(Lcom/larksuite/component/blockit/entity/BlockEntity;)V", "addTag", "", "tagId", "", "context", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "create", "createTag", "tagName", "generateOwnerName", "tag", "Lcom/larksuite/component/blockit/entity/TagStruct;", "searchMentionTags", SearchIntents.EXTRA_QUERY, "userId", "", "Lcom/larksuite/component/blockit/hashtag/HashTagViewData;", "searchTags", "Lkotlin/Pair;", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.blockit.hashtag.add.b */
public final class AddHashTagModel extends BaseModel implements IAddHashTagContract.IModel {

    /* renamed from: a */
    private final BlockEntity f59524a;

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/larksuite/component/blockit/hashtag/add/AddHashTagModel$addTag$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/larksuite/component/blockit/entity/BatchTagActionResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.add.b$a */
    public static final class C24085a implements IGetDataCallback<BatchTagActionResponse> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f59525a;

        C24085a(IGetDataCallback iGetDataCallback) {
            this.f59525a = iGetDataCallback;
        }

        /* renamed from: a */
        public void onSuccess(BatchTagActionResponse batchTagActionResponse) {
            this.f59525a.onSuccess(true);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f59525a.onError(errorResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/larksuite/component/blockit/hashtag/add/AddHashTagModel$createTag$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/larksuite/component/blockit/entity/CreateTagAndAddItemResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.add.b$b */
    public static final class C24086b implements IGetDataCallback<CreateTagAndAddItemResponse> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f59526a;

        C24086b(IGetDataCallback iGetDataCallback) {
            this.f59526a = iGetDataCallback;
        }

        /* renamed from: a */
        public void onSuccess(CreateTagAndAddItemResponse createTagAndAddItemResponse) {
            this.f59526a.onSuccess(true);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f59526a.onError(errorResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/larksuite/component/blockit/hashtag/add/AddHashTagModel$searchMentionTags$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/larksuite/component/blockit/entity/SearchTagViewResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.add.b$c */
    public static final class C24087c implements IGetDataCallback<SearchTagViewResponse> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f59527a;

        C24087c(IGetDataCallback iGetDataCallback) {
            this.f59527a = iGetDataCallback;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f59527a.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(SearchTagViewResponse searchTagViewResponse) {
            ArrayList arrayList = new ArrayList();
            List<SearchTagViewResponse.TagViewStruct> list = null;
            if (!CollectionUtils.isEmpty(searchTagViewResponse != null ? searchTagViewResponse.tagViews : null)) {
                if (searchTagViewResponse != null) {
                    list = searchTagViewResponse.tagViews;
                }
                if (list == null) {
                    Intrinsics.throwNpe();
                }
                for (SearchTagViewResponse.TagViewStruct tagViewStruct : list) {
                    String str = tagViewStruct.id;
                    Intrinsics.checkExpressionValueIsNotNull(str, "tagView.id");
                    String str2 = tagViewStruct.name;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "tagView.name");
                    boolean z = tagViewStruct.isSubscribed;
                    boolean z2 = tagViewStruct.isAvailable;
                    int i = tagViewStruct.permissionType;
                    String str3 = tagViewStruct.teamworkerCount;
                    Intrinsics.checkExpressionValueIsNotNull(str3, "tagView.teamworkerCount");
                    arrayList.add(new HashTagViewData(str, "", str2, z, false, z2, false, null, "", i, str3, false, 2048, null));
                }
            }
            this.f59527a.onSuccess(arrayList);
        }
    }

    public AddHashTagModel(BlockEntity blockEntity) {
        this.f59524a = blockEntity;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/larksuite/component/blockit/hashtag/add/AddHashTagModel$searchTags$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/larksuite/component/blockit/entity/SearchTagsResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.add.b$d */
    public static final class C24088d implements IGetDataCallback<SearchTagsResponse> {

        /* renamed from: a */
        final /* synthetic */ AddHashTagModel f59528a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f59529b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f59529b.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(SearchTagsResponse searchTagsResponse) {
            boolean z;
            ArrayList arrayList = new ArrayList();
            List<TagStruct> list = null;
            if (!CollectionUtils.isEmpty(searchTagsResponse != null ? searchTagsResponse.tags : null)) {
                if (searchTagsResponse != null) {
                    list = searchTagsResponse.tags;
                }
                if (list == null) {
                    Intrinsics.throwNpe();
                }
                for (TagStruct tagStruct : list) {
                    String str = tagStruct.id;
                    Intrinsics.checkExpressionValueIsNotNull(str, "tag.id");
                    String str2 = tagStruct.name;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "tag.name");
                    boolean z2 = tagStruct.subscribed;
                    boolean z3 = tagStruct.hasAdded;
                    boolean z4 = !tagStruct.unavailable;
                    AddHashTagModel bVar = this.f59528a;
                    Intrinsics.checkExpressionValueIsNotNull(tagStruct, "tag");
                    String a = bVar.mo86449a(tagStruct);
                    int i = tagStruct.permissionType;
                    String str3 = tagStruct.teamworkerCount;
                    Intrinsics.checkExpressionValueIsNotNull(str3, "tag.teamworkerCount");
                    arrayList.add(new HashTagViewData(str, "", str2, z2, z3, z4, false, null, a, i, str3, false, 2048, null));
                }
            }
            if (searchTagsResponse != null) {
                z = searchTagsResponse.needCreate;
            } else {
                z = false;
            }
            this.f59529b.onSuccess(new Pair(Boolean.valueOf(z), arrayList));
        }

        C24088d(AddHashTagModel bVar, IGetDataCallback iGetDataCallback) {
            this.f59528a = bVar;
            this.f59529b = iGetDataCallback;
        }
    }

    /* renamed from: a */
    public final String mo86449a(TagStruct tagStruct) {
        String str = "";
        if (!CollectionUtils.isEmpty(tagStruct.owners)) {
            for (GrantRecord grantRecord : tagStruct.owners) {
                if (grantRecord.role == Role.Owner && grantRecord.name != null && !CollectionUtils.isEmpty(grantRecord.name.values())) {
                    str = grantRecord.name.get(C24050a.m87867b());
                    if (TextUtils.isEmpty(str)) {
                        str = (String) CollectionsKt.first(grantRecord.name.values());
                    }
                }
            }
        }
        return str;
    }

    @Override // com.larksuite.component.blockit.hashtag.add.IAddHashTagContract.IModel
    /* renamed from: a */
    public void mo86450a(String str, IGetDataCallback<Pair<Boolean, List<HashTagViewData>>> iGetDataCallback) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C24077a a = C24077a.m87926a();
        BlockEntity blockEntity = this.f59524a;
        if (blockEntity != null) {
            str2 = blockEntity.getBlockID();
        } else {
            str2 = null;
        }
        a.mo86428a(str2, str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new C24088d(this, iGetDataCallback)));
    }

    @Override // com.larksuite.component.blockit.hashtag.add.IAddHashTagContract.IModel
    /* renamed from: b */
    public void mo86452b(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "tagName");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C24077a.m87926a().mo86426a(str, this.f59524a, str2, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new C24086b(iGetDataCallback)));
    }

    @Override // com.larksuite.component.blockit.hashtag.add.IAddHashTagContract.IModel
    /* renamed from: c */
    public void mo86453c(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "tagId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C24077a.m87926a().mo86430b(str, this.f59524a, str2, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new C24085a(iGetDataCallback)));
    }

    @Override // com.larksuite.component.blockit.hashtag.add.IAddHashTagContract.IModel
    /* renamed from: a */
    public void mo86451a(String str, String str2, IGetDataCallback<List<HashTagViewData>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C24077a.m87926a().mo86431b(str2, str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new C24087c(iGetDataCallback)));
    }
}
