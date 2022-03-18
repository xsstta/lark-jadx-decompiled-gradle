package com.larksuite.component.openplatform.core.container.impl;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.i18n.claymore.ClaymoreServiceLoader;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.larksuite.component.blockit.AbstractC24076f;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.service.IBlockitApiService;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.tt.miniapp.errorcode.ApiCode;

public class SetBlockInfoPlugin extends OPPlugin {
    public AbstractC24076f mICreatorListener;

    /* access modifiers changed from: private */
    public static class RequestContext {
        @JSONField(name = "targetHostID")
        public String containerId;
        @JSONField(name = "targetHost")
        public String host;

        private RequestContext() {
        }
    }

    /* access modifiers changed from: private */
    public static class SetBlockInfoRequest extends C25920a {
        @JSONField(name = "context")
        public RequestContext context;
        @JSONField(name = "blockID")
        public String mBlockID;
        @JSONField(name = "blockTypeID")
        public String mBlockTypeID;
        @JSONField(name = "sourceData")
        public String mSourceData;
        @JSONField(name = "sourceMeta")
        public String mSourceMeta;

        private SetBlockInfoRequest() {
        }
    }

    public SetBlockInfoPlugin(AbstractC24076f fVar) {
        this.mICreatorListener = fVar;
    }

    private void createEntity(SetBlockInfoRequest setBlockInfoRequest, IBlockitApiService dVar, final LKEvent lKEvent) {
        IAppContext appContext = getAppContext();
        RequestContext requestContext = new RequestContext();
        requestContext.host = (String) appContext.getExtra("host");
        requestContext.containerId = (String) appContext.getExtra("containerID");
        setBlockInfoRequest.context = requestContext;
        BlockEntity blockEntity = new BlockEntity("-1");
        blockEntity.setBlockTypeID(setBlockInfoRequest.mBlockTypeID);
        blockEntity.setSourceMeta(setBlockInfoRequest.mSourceMeta);
        blockEntity.setSourceData(setBlockInfoRequest.mSourceData);
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("context", new Gson().toJsonTree(setBlockInfoRequest.context));
        dVar.createBlockEntity(blockEntity, jsonObject, new IGetDataCallback<BlockEntity>() {
            /* class com.larksuite.component.openplatform.core.container.impl.SetBlockInfoPlugin.C244781 */

            /* renamed from: a */
            public void onSuccess(BlockEntity blockEntity) {
                SetBlockInfoPlugin.this.callbackOK(lKEvent);
                SetBlockInfoPlugin.this.mICreatorListener.mo86425a(blockEntity);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                SetBlockInfoPlugin.this.callBackFail(errorResult.getDisplayMsg(), lKEvent);
            }
        });
    }

    @LKPluginFunction(async = true, eventName = {"setBlockInfo"})
    public void setBlockInfo(LKEvent lKEvent, SetBlockInfoRequest setBlockInfoRequest, AbstractC25897h<C25921b> hVar) {
        AppBrandLogger.m52830i("SetBlockInfoPlugin", "setBlockInfo", setBlockInfoRequest);
        IBlockitApiService dVar = (IBlockitApiService) ClaymoreServiceLoader.loadFirst(IBlockitApiService.class);
        if (!TextUtils.isEmpty(setBlockInfoRequest.mBlockID)) {
            requestBlockById(setBlockInfoRequest, dVar, lKEvent, hVar);
        } else if (!TextUtils.isEmpty(setBlockInfoRequest.mBlockTypeID)) {
            createEntity(setBlockInfoRequest, dVar, lKEvent);
        } else {
            getAppContext().getTracingSpan().mo92223e("SetBlockInfoPlugin", "missing blockID or BlockTypeId");
            callbackFail(ApiCode.GENERAL_PARAM, "missing blockID or BlockTypeId", lKEvent);
        }
    }

    private void requestBlockById(SetBlockInfoRequest setBlockInfoRequest, IBlockitApiService dVar, final LKEvent lKEvent, AbstractC25897h<C25921b> hVar) {
        dVar.getBlockByID(setBlockInfoRequest.mBlockID, new IGetDataCallback<BlockEntity>() {
            /* class com.larksuite.component.openplatform.core.container.impl.SetBlockInfoPlugin.C244792 */

            /* renamed from: a */
            public void onSuccess(BlockEntity blockEntity) {
                SetBlockInfoPlugin.this.callbackOK(lKEvent);
                SetBlockInfoPlugin.this.mICreatorListener.mo86425a(blockEntity);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                SetBlockInfoPlugin.this.callBackFail(errorResult.getDisplayMsg(), lKEvent);
            }
        });
    }
}
