package com.ss.android.lark.todo.wrapper.impl.handler;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.idependency.IMainModuleDependency;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/impl/handler/OpenTodoFilterAppHandler;", "Lcom/ss/android/lark/applink/AppLinkHandler;", "()V", "canOpen", "", "context", "Landroid/content/Context;", "appLink", "Lcom/ss/android/lark/applink/AppLink;", "handle", "needBackToLark", "Companion", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.b.b.b.c */
public final class OpenTodoFilterAppHandler extends AbstractC29186b {

    /* renamed from: a */
    public static final Companion f139211a = new Companion(null);

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/impl/handler/OpenTodoFilterAppHandler$Companion;", "", "()V", "FILTER_ALL", "", "FILTER_ASSIGN_FROM_ME", "FILTER_ASSIGN_TO_ME", "FILTER_COMPLETED", "FILTER_FOLLOWED", "FILTER_FROM_DOCS", "TAG", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.b.b.b.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        Log.m165389i("OpenTodoFilterAppHandler", "canOpen");
        if (context != null && appLink != null && !TextUtils.isEmpty(appLink.mo103435a())) {
            return true;
        }
        Log.m165383e("OpenTodoFilterAppHandler", "canOpen invalid parameter");
        return false;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(Context context, AppLink appLink) {
        TodoListView.Type type;
        Log.m165389i("OpenTodoFilterAppHandler", "handle");
        if (context == null || appLink == null || TextUtils.isEmpty(appLink.mo103435a())) {
            Log.m165383e("OpenTodoFilterAppHandler", "handle invalid parameter");
            return false;
        }
        String queryParameter = Uri.parse(appLink.mo103435a()).getQueryParameter("tab");
        if (queryParameter == null) {
            queryParameter = "";
        }
        Intrinsics.checkExpressionValueIsNotNull(queryParameter, "uri.getQueryParameter(\"tab\") ?: \"\"");
        IMainModuleDependency mainModuleDependency = TodoDependencyHolder.f139242a.mo191730a().mainModuleDependency();
        switch (queryParameter.hashCode()) {
            case -1990933876:
                if (queryParameter.equals("assign_to_me")) {
                    type = TodoListView.Type.ASSIGN_TO_ME;
                    break;
                }
                type = TodoListView.Type.ALL;
                break;
            case -1466496259:
                if (queryParameter.equals("assign_from_me")) {
                    type = TodoListView.Type.ASSIGN_FROM_ME;
                    break;
                }
                type = TodoListView.Type.ALL;
                break;
            case -1402931637:
                if (queryParameter.equals("completed")) {
                    type = TodoListView.Type.COMPLETED;
                    break;
                }
                type = TodoListView.Type.ALL;
                break;
            case -1244338397:
                if (queryParameter.equals("from_doc")) {
                    type = TodoListView.Type.FROM_DOC;
                    break;
                }
                type = TodoListView.Type.ALL;
                break;
            case 96673:
                if (queryParameter.equals("all")) {
                    type = TodoListView.Type.ALL;
                    break;
                }
                type = TodoListView.Type.ALL;
                break;
            case 301801488:
                if (queryParameter.equals("followed")) {
                    type = TodoListView.Type.FOLLOWED;
                    break;
                }
                type = TodoListView.Type.ALL;
                break;
            default:
                type = TodoListView.Type.ALL;
                break;
        }
        mainModuleDependency.mo145415a(context, type, false);
        return true;
    }
}
