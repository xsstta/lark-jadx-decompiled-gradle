package com.ss.android.lark.create.groupchat.impl.f2f;

import android.content.Context;
import android.view.ViewGroup;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.create.groupchat.dto.ApplicantInfo;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/IF2FCreateGroupContract;", "", "Companion", "IModel", "IView", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.d */
public interface IF2FCreateGroupContract {

    /* renamed from: a */
    public static final Companion f93701a = Companion.f93702a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\nJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/IF2FCreateGroupContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "fetchJoinGroupByCode", "", "code", "", "requestJoinFaceToFaceChat", "setDelegate", "modelDelegate", "Lcom/ss/android/lark/create/groupchat/impl/f2f/IF2FCreateGroupContract$IModel$ModelDelegate;", "ModelDelegate", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.d$b */
    public interface IModel extends com.larksuite.framework.mvp.IModel {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\f\u001a\u00020\u0003H&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/IF2FCreateGroupContract$IModel$ModelDelegate;", "", "onApplicants", "", "applicants", "", "Lcom/ss/android/lark/create/groupchat/dto/ApplicantInfo;", "onError", "errCode", "", "errorMsg", "", "requestFinish", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.d$b$a */
        public interface ModelDelegate {
            /* renamed from: a */
            void mo133898a(int i, String str);

            /* renamed from: a */
            void mo133900a(List<ApplicantInfo> list);

            /* renamed from: c */
            void mo133903c();
        }

        /* renamed from: a */
        void mo133857a();

        /* renamed from: a */
        void mo133861a(ModelDelegate aVar);

        /* renamed from: a */
        void mo133862a(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\u0011J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0004H&J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0006H&J\b\u0010\u000f\u001a\u00020\u0004H&¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/IF2FCreateGroupContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/create/groupchat/impl/f2f/IF2FCreateGroupContract$IView$ViewDelegate;", "defaultError", "", "errorMsg", "", "errGroupReachMemberLimit", "errMatchCodeTooSimple", "onUpdateApplicants", "list", "", "Lcom/ss/android/lark/create/groupchat/dto/ApplicantInfo;", "openGroupChat", "chaId", "requestFinish", "ViewDelegate", "ViewDependency", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.d$c */
    public interface IView extends com.larksuite.framework.mvp.IView<ViewDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/IF2FCreateGroupContract$IView$ViewDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "onJoinGroupButtonClicked", "", "onNumberCodeFilled", "code", "", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.d$c$a */
        public interface ViewDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo133899a(String str);

            /* renamed from: d */
            void mo133904d();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\n\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/IF2FCreateGroupContract$IView$ViewDependency;", "", "context", "Landroid/content/Context;", "currentActivity", "Landroid/app/Activity;", "finishSelf", "", "getRootView", "Landroid/view/ViewGroup;", "getSourceType", "", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.d$c$b */
        public interface ViewDependency {
            /* renamed from: b */
            ViewGroup mo133847b();

            /* renamed from: c */
            Context mo133848c();

            /* renamed from: d */
            void mo133849d();

            /* renamed from: e */
            int mo133850e();
        }

        /* renamed from: a */
        void mo133920a();

        /* renamed from: a */
        void mo133922a(String str);

        /* renamed from: a */
        void mo133923a(List<ApplicantInfo> list);

        /* renamed from: b */
        void mo133924b();

        /* renamed from: c */
        void mo133925c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/IF2FCreateGroupContract$Companion;", "", "()V", "ERR_CHATTER_REACH_LIMIT", "", "ERR_CHATTER_REACH_LIMIT_BY_ADMIN", "ERR_DEFAULT", "ERR_INVALID_FACE_TO_FACE_TOKEN", "ERR_MASK", "ERR_REQUEST_OVER_FREQUENCY", "ERR_UNALLOYED_SIMPLE_CODE", "INVALID_CODE", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.d$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f93702a = new Companion();

        private Companion() {
        }
    }
}
