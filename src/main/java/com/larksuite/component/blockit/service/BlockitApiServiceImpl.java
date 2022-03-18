package com.larksuite.component.blockit.service;

import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.google.gson.JsonObject;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.framework.callback.IGetDataCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ClaymoreImpl(singleton = false, value = IBlockitApiService.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016J\u001e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016¨\u0006\u000e"}, d2 = {"Lcom/larksuite/component/blockit/service/BlockitApiServiceImpl;", "Lcom/larksuite/component/blockit/service/IBlockitApiService;", "()V", "createBlockEntity", "", "blockEntity", "Lcom/larksuite/component/blockit/entity/BlockEntity;", "extra", "Lcom/google/gson/JsonObject;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "getBlockByID", "blockId", "", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BlockitApiServiceImpl implements IBlockitApiService {
    @Override // com.larksuite.component.blockit.service.IBlockitApiService
    public void getBlockByID(String str, IGetDataCallback<BlockEntity> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "blockId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C24141a.m88173a().mo86654a(str, iGetDataCallback);
    }

    @Override // com.larksuite.component.blockit.service.IBlockitApiService
    public void createBlockEntity(BlockEntity blockEntity, JsonObject jsonObject, IGetDataCallback<BlockEntity> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(blockEntity, "blockEntity");
        Intrinsics.checkParameterIsNotNull(jsonObject, "extra");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C24141a.m88173a().mo86655a(blockEntity, jsonObject, iGetDataCallback);
    }
}
