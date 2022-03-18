package com.larksuite.component.blockit;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.entity.BlockExtra;
import com.larksuite.component.blockit.entity.BlockitEnv;
import com.larksuite.component.blockit.service.AbstractC24150c;
import com.larksuite.component.blockit.todo.ITodoBlockViewClickListener;
import com.larksuite.component.openplatform.api.entity.OPContainerBundle;
import com.larksuite.framework.callback.IGetDataCallback;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.blockit.b */
public interface AbstractC24049b {
    void createTodo(Context context, BlockEntity blockEntity, BlockExtra blockExtra);

    Context getContext();

    BlockitEnv getEnv();

    Locale getLocale();

    void getMessengerView(BlockEntity blockEntity, ITodoBlockViewClickListener aVar, IGetDataCallback<View> iGetDataCallback);

    String getSession();

    void mountBlockByOPContainer(ViewGroup viewGroup, BlockEntity blockEntity, OPContainerBundle oPContainerBundle, AbstractC24073e eVar);

    void onEvent(String str, JSONObject jSONObject);

    void openAppLink(Context context, String str);

    void setBlockSync(AbstractC24150c cVar);
}
