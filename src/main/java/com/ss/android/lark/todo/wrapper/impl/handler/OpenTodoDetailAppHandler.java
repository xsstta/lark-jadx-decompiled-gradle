package com.ss.android.lark.todo.wrapper.impl.handler;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.wrapper.TodoModuleWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\u000b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/impl/handler/OpenTodoDetailAppHandler;", "Lcom/ss/android/lark/applink/AppLinkHandler;", "wrapper", "Lcom/ss/android/lark/todo/wrapper/TodoModuleWrapper;", "(Lcom/ss/android/lark/todo/wrapper/TodoModuleWrapper;)V", "canOpen", "", "context", "Landroid/content/Context;", "appLink", "Lcom/ss/android/lark/applink/AppLink;", "handle", "needBackToLark", "Companion", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.b.b.b.b */
public final class OpenTodoDetailAppHandler extends AbstractC29186b {

    /* renamed from: a */
    public static final Companion f139209a = new Companion(null);

    /* renamed from: b */
    private final TodoModuleWrapper f139210b;

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/impl/handler/OpenTodoDetailAppHandler$Companion;", "", "()V", "TAG", "", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.b.b.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public OpenTodoDetailAppHandler(TodoModuleWrapper aVar) {
        this.f139210b = aVar;
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        Log.m165389i("OpenTodoDetailAppHandler", "canOpen");
        if (context != null && appLink != null && !TextUtils.isEmpty(appLink.mo103435a())) {
            return true;
        }
        Log.m165383e("OpenTodoDetailAppHandler", "canOpen invalid parameter");
        return false;
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(Context context, AppLink appLink) {
        Log.m165389i("OpenTodoDetailAppHandler", "handle");
        if (context == null || appLink == null || TextUtils.isEmpty(appLink.mo103435a())) {
            Log.m165383e("OpenTodoDetailAppHandler", "handle invalid parameter");
            return false;
        }
        Uri parse = Uri.parse(appLink.mo103435a());
        String queryParameter = parse.getQueryParameter("guid");
        String str = "";
        if (queryParameter == null) {
            queryParameter = str;
        }
        Intrinsics.checkExpressionValueIsNotNull(queryParameter, "uri.getQueryParameter(\"guid\") ?: \"\"");
        String queryParameter2 = parse.getQueryParameter("navigateStyle");
        if (queryParameter2 != null) {
            str = queryParameter2;
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "uri.getQueryParameter(\"navigateStyle\") ?: \"\"");
        String queryParameter3 = parse.getQueryParameter("authscene");
        String queryParameter4 = parse.getQueryParameter("authid");
        if (!TextUtils.isEmpty(queryParameter)) {
            TodoModuleWrapper aVar = this.f139210b;
            if (aVar == null) {
                return true;
            }
            aVar.mo191656a(context, queryParameter, queryParameter3, queryParameter4);
            return true;
        }
        TodoModuleWrapper aVar2 = this.f139210b;
        if (aVar2 == null) {
            return true;
        }
        aVar2.mo191657a(context, Intrinsics.areEqual(str, "push"));
        return true;
    }
}
