package com.ss.android.vc.meeting.module.share;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.mvp.IView;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.share.VideoChatShareModel;
import com.ss.android.vc.meeting.module.share.VideoChatShareView;
import com.ss.android.vc.net.request.AbstractC63598b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/IVideoChatShareContract;", "", "IModel", "IView", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.share.a */
public interface IVideoChatShareContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001&J\b\u0010\u0002\u001a\u00020\u0003H&J6\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J#\u0010\u000f\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&¢\u0006\u0002\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u000eH&J\b\u0010\u001a\u001a\u00020\u000eH&J\b\u0010\u001b\u001a\u00020\u0013H&J\u0018\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH&J\b\u0010\u001d\u001a\u00020\u0003H&J\u0018\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020 H&J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020#H&J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0013H&¨\u0006'"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/IVideoChatShareContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "checkHasMore", "", "commitSelect", "", "selectItems", "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "Lkotlin/collections/ArrayList;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "callback", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "", "deleteSelectedItems", "deletedItems", "", "deletedGroupCount", "", "([Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;I)V", "getFeedList", "num", "listener", "Lcom/ss/android/vc/meeting/module/share/IVideoChatShareContract$IModel$OnFeedLoadedFinishListener;", "getMeetingId", "getSearchKey", "getSelectedGroupCount", "getSelectedItems", "isSearchMode", "search", "key", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareView$ISearchResultCallback;", "setMode", "mode", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareModel$DisplayMode;", "setSelectedGroupCount", "count", "OnFeedLoadedFinishListener", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.a$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/IVideoChatShareContract$IModel$OnFeedLoadedFinishListener;", "", "onFinished", "", "datas", "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "Lkotlin/collections/ArrayList;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.share.a$a$a */
        public interface OnFeedLoadedFinishListener {
            /* renamed from: a */
            void mo217529a(ArrayList<VideoChatShareItem> arrayList);
        }

        /* renamed from: a */
        ArrayList<VideoChatShareItem> mo217502a();

        /* renamed from: a */
        void mo217503a(int i);

        /* renamed from: a */
        void mo217504a(int i, OnFeedLoadedFinishListener aVar);

        /* renamed from: a */
        void mo217505a(VideoChatShareModel.DisplayMode displayMode);

        /* renamed from: a */
        void mo217507a(String str, VideoChatShareView.ISearchResultCallback aVar);

        /* renamed from: a */
        void mo217508a(ArrayList<VideoChatShareItem> arrayList, C61303k kVar, AbstractC63598b<String> bVar);

        /* renamed from: a */
        void mo217511a(VideoChatShareItem[] videoChatShareItemArr, int i);

        /* renamed from: b */
        int mo217512b();

        /* renamed from: c */
        boolean mo217514c();

        /* renamed from: d */
        String mo217515d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dJ\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J \u0010\u000b\u001a\u00020\u00042\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\tH&J\b\u0010\u0012\u001a\u00020\u0004H&J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0016\u0010\u0016\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0018H&J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001cH&¨\u0006\u001e"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/IVideoChatShareContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/vc/meeting/module/share/IVideoChatShareContract$IView$Delegate;", "closeSearch", "", "dismissLoading", "hideKeyBoard", "invalidate", "isReachListBottom", "", "isReachListTop", "resetAll", "feed", "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "Lkotlin/collections/ArrayList;", "setOrientation", "isLandscape", "showLoading", "showSearchEmptyView", "key", "", "showSearchView", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "updateByKeyboard", "keyboardShown", "keyboardheight", "", "Delegate", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.a$b */
    public interface IView extends com.larksuite.framework.mvp.IView<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\u0018\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0005H&J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000bH&J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\rH&¨\u0006\u0018"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/IVideoChatShareContract$IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "checkCanDoLoadMore", "", "commitSelect", "", "selectItems", "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "Lkotlin/collections/ArrayList;", "getMeetingId", "", "getSelectedGroupCount", "", "getSelectedItems", "isSearchMode", "onLoadMoreBegin", "onSearchContentChanged", "content", "setMode", "mode", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareModel$DisplayMode;", "setSelectedGroupCount", "count", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.share.a$b$a */
        public interface Delegate extends IView.IViewDelegate {
            /* renamed from: a */
            ArrayList<VideoChatShareItem> mo217539a();

            /* renamed from: a */
            void mo217540a(int i);

            /* renamed from: a */
            void mo217541a(VideoChatShareModel.DisplayMode displayMode);

            /* renamed from: a */
            void mo217542a(String str);

            /* renamed from: a */
            void mo217543a(ArrayList<VideoChatShareItem> arrayList);

            /* renamed from: b */
            int mo217544b();

            /* renamed from: c */
            boolean mo217545c();

            /* renamed from: d */
            String mo217546d();
        }

        /* renamed from: a */
        void mo217530a();

        /* renamed from: a */
        void mo217531a(String str);

        /* renamed from: a */
        void mo217532a(ArrayList<VideoChatShareItem> arrayList);

        /* renamed from: a */
        void mo217533a(List<VideoChatShareItem> list);

        /* renamed from: a */
        void mo217534a(boolean z);

        /* renamed from: b */
        void mo217535b();

        /* renamed from: c */
        void mo217536c();

        /* renamed from: d */
        void mo217537d();

        /* renamed from: e */
        void mo217538e();
    }
}
