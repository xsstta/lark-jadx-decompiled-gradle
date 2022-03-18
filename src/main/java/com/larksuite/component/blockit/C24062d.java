package com.larksuite.component.blockit;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.i18n.claymore.ClaymoreServiceLoader;
import com.larksuite.component.blockit.entity.ActionType;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.entity.BlockExtra;
import com.larksuite.component.blockit.entity.BlockTypeID;
import com.larksuite.component.blockit.entity.Domain;
import com.larksuite.component.blockit.hashtag.list.HashTagListActivity;
import com.larksuite.component.blockit.p1067b.C24050a;
import com.larksuite.component.blockit.p1068c.C24053a;
import com.larksuite.component.blockit.props.AbstractC24131a;
import com.larksuite.component.blockit.props.C24135e;
import com.larksuite.component.blockit.props.C24137g;
import com.larksuite.component.blockit.service.C24141a;
import com.larksuite.component.blockit.todo.ITodoBlockViewClickListener;
import com.larksuite.component.openplatform.api.entity.OPContainerBundle;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import java.io.Serializable;

/* renamed from: com.larksuite.component.blockit.d */
public class C24062d {

    /* renamed from: a */
    public Context f59478a;

    /* renamed from: b */
    public volatile AbstractC24049b f59479b;

    /* renamed from: com.larksuite.component.blockit.d$a */
    private static final class C24072a {

        /* renamed from: a */
        public static final C24062d f59500a = new C24062d();
    }

    /* renamed from: a */
    public static C24062d m87896a() {
        return C24072a.f59500a;
    }

    /* renamed from: b */
    public void mo86323b() {
        if (this.f59479b == null) {
            synchronized (this) {
                if (this.f59479b == null) {
                    AbstractC24049b bVar = (AbstractC24049b) ClaymoreServiceLoader.loadFirst(AbstractC24049b.class);
                    Log.m165389i("BlockitInstance", "init block: " + bVar);
                    this.f59478a = bVar.getContext();
                    this.f59479b = bVar;
                    C24051c.m87870a().mo86300a(bVar);
                    C24050a.m87866a(bVar);
                    this.f59479b.setBlockSync(C24053a.m87874a());
                }
            }
        }
    }

    /* renamed from: a */
    private Domain m87897a(String str) {
        try {
            return Domain.valueOf(str.split("-")[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo86322a(String str, AbstractC24131a aVar) {
        C24137g.m88164a().mo86647a(str, aVar);
    }

    /* renamed from: a */
    public void mo86319a(final ViewGroup viewGroup, final String str) {
        Domain a = m87897a(str);
        if (Domain.chat.equals(a) || Domain.message.equals(a)) {
            C24141a.m88173a().mo86654a(str, new IGetDataCallback<BlockEntity>() {
                /* class com.larksuite.component.blockit.C24062d.C240631 */

                /* renamed from: a */
                public void onSuccess(BlockEntity blockEntity) {
                    if (blockEntity == null) {
                        blockEntity = new BlockEntity(str);
                    }
                    C24062d.this.f59479b.getMessengerView(blockEntity, null, new IGetDataCallback<View>() {
                        /* class com.larksuite.component.blockit.C24062d.C240631.C240641 */

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                        }

                        /* renamed from: a */
                        public void onSuccess(final View view) {
                            viewGroup.post(new Runnable() {
                                /* class com.larksuite.component.blockit.C24062d.C240631.C240641.RunnableC240651 */

                                public void run() {
                                    viewGroup.addView(view);
                                }
                            });
                        }
                    });
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C24062d.this.f59479b.getMessengerView(new BlockEntity(str), null, new IGetDataCallback<View>() {
                        /* class com.larksuite.component.blockit.C24062d.C240631.C240662 */

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                        }

                        /* renamed from: a */
                        public void onSuccess(final View view) {
                            viewGroup.post(new Runnable() {
                                /* class com.larksuite.component.blockit.C24062d.C240631.C240662.RunnableC240671 */

                                public void run() {
                                    viewGroup.addView(view);
                                }
                            });
                        }
                    });
                }
            });
        }
    }

    /* renamed from: a */
    public void mo86321a(final String str, final ITodoBlockViewClickListener aVar, final IGetDataCallback<View> iGetDataCallback) {
        Domain a = m87897a(str);
        if (!Domain.chat.equals(a) && !Domain.message.equals(a)) {
            iGetDataCallback.onError(new ErrorResult("not supported"));
        }
        C24141a.m88173a().mo86654a(str, new IGetDataCallback<BlockEntity>() {
            /* class com.larksuite.component.blockit.C24062d.C240682 */

            /* renamed from: a */
            public void onSuccess(BlockEntity blockEntity) {
                if (blockEntity == null) {
                    blockEntity = new BlockEntity(str);
                }
                C24062d.this.f59479b.getMessengerView(blockEntity, aVar, new IGetDataCallback<View>() {
                    /* class com.larksuite.component.blockit.C24062d.C240682.C240691 */

                    /* renamed from: a */
                    public void onSuccess(View view) {
                        iGetDataCallback.onSuccess(view);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        iGetDataCallback.onError(errorResult);
                    }
                });
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C24062d.this.f59479b.getMessengerView(new BlockEntity(str), aVar, new IGetDataCallback<View>() {
                    /* class com.larksuite.component.blockit.C24062d.C240682.C240702 */

                    /* renamed from: a */
                    public void onSuccess(View view) {
                        iGetDataCallback.onSuccess(view);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        iGetDataCallback.onError(errorResult);
                    }
                });
            }
        });
    }

    /* renamed from: b */
    public void mo86324b(Domain domain, String str, BlockTypeID blockTypeID, IGetDataCallback<String> iGetDataCallback) {
        C24141a.m88173a().mo86653a(domain, str, blockTypeID, true, iGetDataCallback);
    }

    /* renamed from: a */
    public String mo86316a(Domain domain, String str, BlockTypeID blockTypeID, IGetDataCallback<String> iGetDataCallback) {
        return C24141a.m88173a().mo86653a(domain, str, blockTypeID, true, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo86317a(Context context, ActionType actionType, BlockEntity blockEntity, BlockExtra blockExtra) {
        if (actionType == ActionType.HashTag) {
            Intent putExtra = new Intent(context, HashTagListActivity.class).putExtra("extra.block.entity", blockEntity);
            if (blockExtra != null) {
                putExtra.putExtra("extra.context.json", blockExtra.contextJson);
                putExtra.putExtra("extra.hit_point.params", (Serializable) blockExtra.getHitPointParams());
            }
            context.startActivity(putExtra);
        } else if (actionType == ActionType.Todo) {
            this.f59479b.createTodo(context, blockEntity, blockExtra);
        }
    }

    /* renamed from: a */
    public void mo86318a(final ViewGroup viewGroup, final BlockEntity blockEntity, final OPContainerBundle oPContainerBundle, final AbstractC24073e eVar) {
        if (blockEntity == null) {
            AppBrandLogger.m52830i("BlockitInstance", "mount block sourceEntity null");
            eVar.mo86338a("mount_error", "sourceEntity null");
            return;
        }
        String blockID = blockEntity.getBlockID();
        String blockTypeID = blockEntity.getBlockTypeID();
        if (TextUtils.isEmpty(blockID) && TextUtils.isEmpty(blockTypeID)) {
            AppBrandLogger.m52830i("BlockitInstance", "mount block blockId null");
            eVar.mo86338a("mount_error", "blockID null");
        } else if (TextUtils.isEmpty(blockTypeID)) {
            AppBrandLogger.m52830i("BlockitInstance", "mount block blockTypeId null ", " request blockTypeID");
            C24141a.m88173a().mo86654a(blockID, new IGetDataCallback<BlockEntity>() {
                /* class com.larksuite.component.blockit.C24062d.C240713 */

                /* renamed from: a */
                public void onSuccess(BlockEntity blockEntity) {
                    AppBrandLogger.m52830i("BlockitInstance", "request blockTypeId success " + blockEntity);
                    blockEntity.setAppID(blockEntity.getAppID());
                    C24062d.this.f59479b.mountBlockByOPContainer(viewGroup, blockEntity, oPContainerBundle, eVar);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    AppBrandLogger.m52830i("BlockitInstance", "request blockTypeId onError " + errorResult.getDebugMsg());
                    eVar.mo86338a("mount_error", errorResult.getDisplayMsg());
                }
            });
        } else {
            this.f59479b.mountBlockByOPContainer(viewGroup, blockEntity, oPContainerBundle, eVar);
        }
    }

    /* renamed from: a */
    public void mo86320a(String str, ViewGroup viewGroup, C24135e eVar, BlockExtra blockExtra, AbstractC24131a aVar) {
        C24137g.m88164a().mo86646a(str, viewGroup, eVar, blockExtra, aVar);
    }

    /* renamed from: a */
    public BlockEntity mo86315a(String str, BlockTypeID blockTypeID, String str2, String str3, String str4, String str5, String str6) {
        BlockEntity blockEntity = new BlockEntity(str);
        blockEntity.setBlockTypeID(blockTypeID.getValue());
        blockEntity.setSourceLink(str2);
        blockEntity.setSourceData(str3);
        blockEntity.setSourceMeta(str4);
        blockEntity.setPreview(str5);
        blockEntity.setSummary(str6);
        return blockEntity;
    }
}
