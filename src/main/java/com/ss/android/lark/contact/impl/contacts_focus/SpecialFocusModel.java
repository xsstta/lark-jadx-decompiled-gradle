package com.ss.android.lark.contact.impl.contacts_focus;

import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.contact.v1.GetFocusChatterListRequest;
import com.bytedance.lark.pb.contact.v1.GetFocusChatterListResponse;
import com.bytedance.lark.pb.contact.v1.PushFocusChatter;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.contact.impl.contacts_focus.SpecialFocusFragment;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.sdk.SdkSender;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0002J\u001c\u0010\u0011\u001a\u00020\u00062\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00060\u0013J\u0006\u0010\u0014\u001a\u00020\u0006J\n\u0010\u0015\u001a\u00020\n*\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_focus/SpecialFocusModel;", "", "()V", "TAG", "", "getFocusChatterList", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/contact/impl/contacts_focus/SpecialFocusFragment$FocusChatter;", "parseFocusChatterList", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parsePushFocusChatter", "Lcom/bytedance/lark/pb/contact/v1/PushFocusChatter;", "request", "registerFollowdChattersPush", "onFocusedChatterPush", "Lkotlin/Function1;", "unRegisterFollowdChattersPush", "parseChatter2FocusChatter", "Lcom/bytedance/lark/pb/basic/v1/Chatter;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_focus.b */
public final class SpecialFocusModel {

    /* renamed from: a */
    public static final SpecialFocusModel f92038a = new SpecialFocusModel();

    private SpecialFocusModel() {
    }

    /* renamed from: a */
    public final void mo131232a() {
        C53248k.m205912a().mo181696a(Command.PUSH_FOCUS_CHATTER);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/contact/impl/contacts_focus/SpecialFocusFragment$FocusChatter;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_focus.b$a */
    static final class C35584a<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C35584a f92039a = new C35584a();

        C35584a() {
        }

        /* renamed from: a */
        public final List<SpecialFocusFragment.FocusChatter> parse(byte[] bArr) {
            SpecialFocusModel bVar = SpecialFocusModel.f92038a;
            Intrinsics.checkExpressionValueIsNotNull(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            return bVar.mo131231a(bArr);
        }
    }

    /* renamed from: a */
    public final SpecialFocusFragment.FocusChatter mo131230a(Chatter chatter) {
        Intrinsics.checkParameterIsNotNull(chatter, "$this$parseChatter2FocusChatter");
        String str = chatter.id;
        Intrinsics.checkExpressionValueIsNotNull(str, "id");
        String str2 = chatter.avatar_key;
        Intrinsics.checkExpressionValueIsNotNull(str2, "avatar_key");
        String str3 = chatter.name;
        Intrinsics.checkExpressionValueIsNotNull(str3, "name");
        return new SpecialFocusFragment.FocusChatter(str, str2, str3);
    }

    /* renamed from: b */
    public final PushFocusChatter mo131235b(byte[] bArr) {
        try {
            return PushFocusChatter.ADAPTER.decode(bArr);
        } catch (Exception e) {
            Log.m165399w("SpecialFocusModel", e);
            return null;
        }
    }

    /* renamed from: a */
    public final List<SpecialFocusFragment.FocusChatter> mo131231a(byte[] bArr) {
        try {
            ArrayList arrayList = new ArrayList();
            List<Chatter> list = GetFocusChatterListResponse.ADAPTER.decode(bArr).chatters;
            if (list != null) {
                for (T t : list) {
                    SpecialFocusModel bVar = f92038a;
                    Intrinsics.checkExpressionValueIsNotNull(t, "it");
                    arrayList.add(bVar.mo131230a((Chatter) t));
                }
            }
            return arrayList;
        } catch (Exception e) {
            Log.m165399w("SpecialFocusModel", e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo131233a(IGetDataCallback<List<SpecialFocusFragment.FocusChatter>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.asynSendRequestNonWrap(Command.GET_FOCUS_CHATTER_LIST, new GetFocusChatterListRequest.C16244a().mo58197a(SyncDataStrategy.TRY_LOCAL), iGetDataCallback, C35584a.f92039a);
    }

    /* renamed from: a */
    public final void mo131234a(Function1<? super PushFocusChatter, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "onFocusedChatterPush");
        C53248k.m205912a().mo181697a(Command.PUSH_FOCUS_CHATTER, new C35585b(function1));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "request", "", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "", "<anonymous parameter 3>", "onPush"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_focus.b$b */
    static final class C35585b implements C53248k.AbstractC53250a {

        /* renamed from: a */
        final /* synthetic */ Function1 f92040a;

        C35585b(Function1 function1) {
            this.f92040a = function1;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            this.f92040a.invoke(SpecialFocusModel.f92038a.mo131235b(bArr));
        }
    }
}
