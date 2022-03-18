package com.ss.android.lark.integrator.blockit;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.entity.BlockTypeID;
import com.larksuite.component.blockit.todo.ITodoBlockViewClickListener;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.calendar_api.ICalendarApi;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57878s;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J:\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J:\u0010\u001e\u001a\u00020\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J2\u0010 \u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/integrator/blockit/MessageBlockUtils;", "", "()V", "CHAT_NAME_FONT_SIZE_DP", "", "KEY_CHAT_ID", "", "KEY_MESSAGE_ID", "coreApi", "Lcom/ss/android/lark/biz/core/api/ICoreApi;", "kotlin.jvm.PlatformType", "imApi", "Lcom/ss/android/lark/biz/im/api/IIMApi;", "buildBlockView", "Landroid/widget/TextView;", "context", "Landroid/content/Context;", "sourceLink", "showText", "chatName", "listener", "Lcom/larksuite/component/blockit/todo/ITodoBlockViewClickListener;", "getBlockViewByChatId", "", "chatId", "entity", "Lcom/larksuite/component/blockit/entity/BlockEntity;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Landroid/view/View;", "getBlockViewByMessageId", "messageId", "getTodoBlockView", "open-platform_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.blockit.b */
public final class MessageBlockUtils {

    /* renamed from: a */
    public static final MessageBlockUtils f100424a = new MessageBlockUtils();

    /* renamed from: b */
    private static final IIMApi f100425b = ((IIMApi) ApiUtils.getApi(IIMApi.class));

    /* renamed from: c */
    private static final ICoreApi f100426c = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

    private MessageBlockUtils() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/integrator/blockit/MessageBlockUtils$getBlockViewByChatId$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "chat", "open-platform_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.blockit.b$b */
    public static final class C39128b implements IGetDataCallback<Chat> {

        /* renamed from: a */
        final /* synthetic */ Context f100433a;

        /* renamed from: b */
        final /* synthetic */ BlockEntity f100434b;

        /* renamed from: c */
        final /* synthetic */ ITodoBlockViewClickListener f100435c;

        /* renamed from: d */
        final /* synthetic */ IGetDataCallback f100436d;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165382e("get chat error");
            this.f100436d.onError(new ErrorResult("getChatById onError"));
        }

        /* renamed from: a */
        public void onSuccess(Chat chat) {
            if (chat != null) {
                String formatTodoTaskViewInChatText = ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getFormatTodoTaskViewInChatText(chat.getName());
                Intrinsics.checkExpressionValueIsNotNull(formatTodoTaskViewInChatText, "ApiUtils.getApi(ICalenda…nChatText(chat.getName())");
                this.f100436d.onSuccess(MessageBlockUtils.f100424a.mo143004a(this.f100433a, this.f100434b.getSourceLink(), formatTodoTaskViewInChatText, chat.getName(), this.f100435c));
                return;
            }
            this.f100436d.onError(new ErrorResult("chat == null"));
        }

        C39128b(Context context, BlockEntity blockEntity, ITodoBlockViewClickListener aVar, IGetDataCallback iGetDataCallback) {
            this.f100433a = context;
            this.f100434b = blockEntity;
            this.f100435c = aVar;
            this.f100436d = iGetDataCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/integrator/blockit/MessageBlockUtils$getBlockViewByMessageId$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/chat/entity/message/Message;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "messagelist", "open-platform_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.blockit.b$c */
    public static final class C39129c implements IGetDataCallback<List<? extends Message>> {

        /* renamed from: a */
        final /* synthetic */ Context f100437a;

        /* renamed from: b */
        final /* synthetic */ BlockEntity f100438b;

        /* renamed from: c */
        final /* synthetic */ ITodoBlockViewClickListener f100439c;

        /* renamed from: d */
        final /* synthetic */ IGetDataCallback f100440d;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165382e("get message error");
            this.f100440d.onError(new ErrorResult("getMessagesByIds onError"));
        }

        /* renamed from: a */
        public void onSuccess(List<? extends Message> list) {
            Intrinsics.checkParameterIsNotNull(list, "messagelist");
            if (CollectionUtils.isNotEmpty(list)) {
                MessageBlockUtils.f100424a.mo143005a(((Message) list.get(0)).getChatId(), this.f100437a, this.f100438b, this.f100439c, this.f100440d);
            } else {
                this.f100440d.onError(new ErrorResult("messagelist == null"));
            }
        }

        C39129c(Context context, BlockEntity blockEntity, ITodoBlockViewClickListener aVar, IGetDataCallback iGetDataCallback) {
            this.f100437a = context;
            this.f100438b = blockEntity;
            this.f100439c = aVar;
            this.f100440d = iGetDataCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/integrator/blockit/MessageBlockUtils$buildBlockView$1$1", "Lcom/ss/android/lark/reaction/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "open-platform_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.blockit.b$a */
    public static final class C39127a extends AbstractView$OnClickListenerC52989b {

        /* renamed from: a */
        final /* synthetic */ SpannableString f100427a;

        /* renamed from: b */
        final /* synthetic */ Context f100428b;

        /* renamed from: c */
        final /* synthetic */ String f100429c;

        /* renamed from: d */
        final /* synthetic */ TextView f100430d;

        /* renamed from: e */
        final /* synthetic */ String f100431e;

        /* renamed from: f */
        final /* synthetic */ ITodoBlockViewClickListener f100432f;

        @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
        /* renamed from: a */
        public void mo122732a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            if (TextUtils.isEmpty(this.f100431e)) {
                Log.m165382e("sourcelink == null");
            }
            ITodoBlockViewClickListener aVar = this.f100432f;
            if (aVar != null) {
                aVar.mo86334a();
            }
            KeyboardUtils.hideKeyboard(view.getContext(), view);
            MessageBlockUtils bVar = MessageBlockUtils.f100424a;
            MessageBlockUtils.f100426c.openAppLinkUrl(this.f100428b, this.f100431e);
        }

        C39127a(SpannableString spannableString, Context context, String str, TextView textView, String str2, ITodoBlockViewClickListener aVar) {
            this.f100427a = spannableString;
            this.f100428b = context;
            this.f100429c = str;
            this.f100430d = textView;
            this.f100431e = str2;
            this.f100432f = aVar;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m154431a(Context context, BlockEntity blockEntity, ITodoBlockViewClickListener aVar, IGetDataCallback<View> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        if (blockEntity == null) {
            Log.m165382e("return by entity == null");
            iGetDataCallback.onError(new ErrorResult("entity == null"));
        } else if (TextUtils.isEmpty(blockEntity.getSourceMeta())) {
            Log.m165382e("return by entity.getSourceMeta() == null");
            iGetDataCallback.onError(new ErrorResult("entity.getSourceMeta() == null"));
        } else {
            String sourceMeta = blockEntity.getSourceMeta();
            Log.m165378d("sourceMeta=" + sourceMeta);
            JSONObject a = C57878s.m224589a(sourceMeta);
            if (TextUtils.equals(BlockTypeID.CHAT.getValue(), blockEntity.getBlockTypeID())) {
                f100424a.mo143005a(a.getString("chat_id"), context, blockEntity, aVar, iGetDataCallback);
            } else if (TextUtils.equals(BlockTypeID.MESSAGE.getValue(), blockEntity.getBlockTypeID())) {
                f100424a.m154432b(a.getString("message_id"), context, blockEntity, aVar, iGetDataCallback);
            }
        }
    }

    /* renamed from: b */
    private final void m154432b(String str, Context context, BlockEntity blockEntity, ITodoBlockViewClickListener aVar, IGetDataCallback<View> iGetDataCallback) {
        if (str != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            f100425b.getMessagesByIds(arrayList, new UIGetDataCallback(new C39129c(context, blockEntity, aVar, iGetDataCallback)));
            return;
        }
        Log.m165382e("messageId == null");
        iGetDataCallback.onError(new ErrorResult("messageId == null"));
    }

    /* renamed from: a */
    public final void mo143005a(String str, Context context, BlockEntity blockEntity, ITodoBlockViewClickListener aVar, IGetDataCallback<View> iGetDataCallback) {
        if (!TextUtils.isEmpty(str)) {
            f100425b.getChatById(str, new UIGetDataCallback(new C39128b(context, blockEntity, aVar, iGetDataCallback)));
            return;
        }
        Log.m165382e("chatId == null");
        iGetDataCallback.onError(new ErrorResult("chatId == null"));
    }

    /* renamed from: a */
    public final TextView mo143004a(Context context, String str, String str2, String str3, ITodoBlockViewClickListener aVar) {
        String str4 = str2;
        SpannableString spannableString = new SpannableString(str4);
        TextView textView = new TextView(context);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(UIUtils.getColor(context, R.color.text_title));
        if (str3 != null) {
            spannableString.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.text_link_normal)), StringsKt.indexOf$default((CharSequence) str4, str3, 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) str4, str3, 0, false, 6, (Object) null) + str3.length(), 33);
            textView.setOnClickListener(new C39127a(spannableString, context, str2, textView, str, aVar));
        }
        textView.setText(spannableString);
        int dp2px = UIHelper.dp2px(2.0f);
        int dp2px2 = UIHelper.dp2px(12.0f);
        textView.setPadding(dp2px2, dp2px, dp2px2, dp2px);
        textView.setMinHeight(UIHelper.dp2px(22.0f));
        textView.setBackgroundResource(R.drawable.bg_block_view_source);
        return textView;
    }
}
