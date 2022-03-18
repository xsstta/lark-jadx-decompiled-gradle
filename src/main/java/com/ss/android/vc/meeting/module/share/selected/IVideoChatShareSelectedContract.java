package com.ss.android.vc.meeting.module.share.selected;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.mvp.IView;
import com.ss.android.vc.meeting.module.share.VideoChatShareItem;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/selected/IVideoChatShareSelectedContract;", "", "IModel", "IView", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.share.a.a */
public interface IVideoChatShareSelectedContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\tH&R\"\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u00020\u0015X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\r¨\u0006!"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/selected/IVideoChatShareSelectedContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "Lkotlin/collections/ArrayList;", "getData", "()Ljava/util/ArrayList;", "mDeletedGroupCount", "", "getMDeletedGroupCount", "()I", "setMDeletedGroupCount", "(I)V", "mDeleteds", "", "getMDeleteds", "()[Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "setMDeleteds", "([Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;)V", "selectedFromInvite", "", "getSelectedFromInvite", "()Z", "setSelectedFromInvite", "(Z)V", "selectedGroupCount", "getSelectedGroupCount", "setSelectedGroupCount", "deleteData", "", "item", "position", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.a.a$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        void mo217547a(VideoChatShareItem videoChatShareItem, int i);

        /* renamed from: a */
        VideoChatShareItem[] mo217548a();

        /* renamed from: b */
        ArrayList<VideoChatShareItem> mo217549b();

        /* renamed from: c */
        int mo217550c();

        /* renamed from: d */
        int mo217551d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J \u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bH&J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH&¨\u0006\u0011"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/selected/IVideoChatShareSelectedContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/vc/meeting/module/share/selected/IVideoChatShareSelectedContract$IView$Delegate;", "isReachListBottom", "", "isReachListTop", "notifyData", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "Lkotlin/collections/ArrayList;", "updateTitle", "p2pCount", "", "groupCount", "Delegate", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.a.a$b */
    public interface IView extends com.larksuite.framework.mvp.IView<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\tj\b\u0012\u0004\u0012\u00020\u0005`\nH&J\b\u0010\u000b\u001a\u00020\u0007H&J\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH&¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0007H&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/selected/IVideoChatShareSelectedContract$IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "deleteItem", "", "item", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "position", "", "getData", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getDeletedGroupCount", "getDeleteds", "", "()[Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "getGroupCount", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.share.a.a$b$a */
        public interface Delegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo217554a(VideoChatShareItem videoChatShareItem, int i);

            /* renamed from: a */
            VideoChatShareItem[] mo217555a();

            /* renamed from: b */
            int mo217556b();

            /* renamed from: c */
            ArrayList<VideoChatShareItem> mo217557c();

            /* renamed from: d */
            int mo217558d();
        }

        /* renamed from: a */
        void mo217552a(int i, int i2);

        /* renamed from: a */
        void mo217553a(ArrayList<VideoChatShareItem> arrayList);
    }
}
