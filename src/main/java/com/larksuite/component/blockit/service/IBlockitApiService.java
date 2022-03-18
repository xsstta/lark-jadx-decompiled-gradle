package com.larksuite.component.blockit.service;

import com.google.gson.JsonObject;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.framework.callback.IGetDataCallback;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH&J\u001e\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH&¨\u0006\r"}, d2 = {"Lcom/larksuite/component/blockit/service/IBlockitApiService;", "", "createBlockEntity", "", "blockEntity", "Lcom/larksuite/component/blockit/entity/BlockEntity;", "extra", "Lcom/google/gson/JsonObject;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "getBlockByID", "blockId", "", "blockit_entity_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.blockit.service.d */
public interface IBlockitApiService {
    void createBlockEntity(BlockEntity blockEntity, JsonObject jsonObject, IGetDataCallback<BlockEntity> iGetDataCallback);

    void getBlockByID(String str, IGetDataCallback<BlockEntity> iGetDataCallback);
}
