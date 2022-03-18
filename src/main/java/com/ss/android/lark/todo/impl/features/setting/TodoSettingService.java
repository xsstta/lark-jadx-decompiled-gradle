package com.ss.android.lark.todo.impl.features.setting;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.todo.v1.GetTodoSettingRequest;
import com.bytedance.lark.pb.todo.v1.GetTodoSettingResponse;
import com.bytedance.lark.pb.todo.v1.TodoListViewSetting;
import com.bytedance.lark.pb.todo.v1.TodoSetting;
import com.bytedance.lark.pb.todo.v1.UpdateTodoSettingRequest;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.sdk.SdkSender;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/setting/TodoSettingService;", "", "()V", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.setting.b */
public final class TodoSettingService {

    /* renamed from: a */
    public static final Companion f141012a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006J\u001c\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\n0\u0006J\u001c\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\n0\u0006¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/setting/TodoSettingService$Companion;", "", "()V", "getTodoSetting", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/todo/v1/TodoSetting;", "updateTodoSetting", "todoSetting", "", "updateTodoViewSetting", "viewSetting", "Lcom/bytedance/lark/pb/todo/v1/TodoListViewSetting;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/todo/v1/TodoSetting;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.setting.b$a$a */
        public static final class C57193a<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C57193a f141013a = new C57193a();

            C57193a() {
            }

            /* renamed from: a */
            public final TodoSetting parse(byte[] bArr) {
                return GetTodoSettingResponse.ADAPTER.decode(bArr).setting;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.setting.b$a$b */
        static final class C57194b<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C57194b f141014a = new C57194b();

            C57194b() {
            }

            /* renamed from: a */
            public final boolean mo194073a(byte[] bArr) {
                return true;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public /* synthetic */ Object parse(byte[] bArr) {
                return Boolean.valueOf(mo194073a(bArr));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.setting.b$a$c */
        static final class C57195c<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C57195c f141015a = new C57195c();

            C57195c() {
            }

            /* renamed from: a */
            public final boolean mo194074a(byte[] bArr) {
                return true;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public /* synthetic */ Object parse(byte[] bArr) {
                return Boolean.valueOf(mo194074a(bArr));
            }
        }

        /* renamed from: a */
        public final void mo194071a(IGetDataCallback<TodoSetting> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            GetTodoSettingRequest.C19559a aVar = new GetTodoSettingRequest.C19559a();
            aVar.mo66438a(SyncDataStrategy.TRY_LOCAL);
            SdkSender.asynSendRequestNonWrap(Command.GET_TODO_SETTING, aVar, iGetDataCallback, C57193a.f141013a);
        }

        /* renamed from: a */
        public final void mo194069a(TodoListViewSetting todoListViewSetting, IGetDataCallback<Boolean> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(todoListViewSetting, "viewSetting");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.UPDATE_TODO_SETTING, new UpdateTodoSettingRequest.C19683a().mo66747a(UpdateTodoSettingRequest.Type.VIEW_SETTING).mo66745a(todoListViewSetting), iGetDataCallback, C57195c.f141015a);
        }

        /* renamed from: a */
        public final void mo194070a(TodoSetting todoSetting, IGetDataCallback<Boolean> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(todoSetting, "todoSetting");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.UPDATE_TODO_SETTING, new UpdateTodoSettingRequest.C19683a().mo66747a(UpdateTodoSettingRequest.Type.TODO_SETTING).mo66746a(todoSetting), iGetDataCallback, C57194b.f141014a);
        }
    }
}
