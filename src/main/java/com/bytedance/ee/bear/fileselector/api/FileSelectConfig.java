package com.bytedance.ee.bear.fileselector.api;

import android.view.View;
import com.bytedance.ee.bear.fileselector.listener.IBackToPickerViewListener;
import com.bytedance.ee.bear.fileselector.listener.IDialogLifecycle;
import com.bytedance.ee.bear.fileselector.listener.IFileSizeCheckListener;
import com.bytedance.ee.bear.fileselector.listener.IGetContentViewListener;
import com.bytedance.ee.bear.fileselector.listener.IHeightChangeListener;
import com.bytedance.ee.bear.fileselector.listener.OnDismissListener;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import java.io.Serializable;
import java.util.ArrayList;

public class FileSelectConfig implements Serializable {
    public int actionType;
    public boolean adjustHeightByKeyboard;
    public boolean autoDismiss;
    public IBackToPickerViewListener backToPickerViewListener;
    public boolean canDragView;
    public int ccmPickViewHeight;
    public int columnCount;
    public String customSendBtnTips;
    public IDialogLifecycle dialogLifecycle;
    public View dragView;
    public boolean enableExternalSelect;
    public boolean enableImageCompress;
    public IFileSizeCheckListener fileCheckListener;
    public IFileSelectListener fileSelectListener;
    public IGetContentViewListener getContentViewListener;
    public View headView;
    public int headerViewRes;
    public IHeightChangeListener heightChangeListener;
    public int imageCompressType;
    public boolean isConsumeBackPress;
    public boolean isOrigin;
    public int larkAlbumActionType;
    public long maxFileSize;
    public int maxImageCompressSize;
    public int maxImageSize;
    public int maxSelectImageNum;
    public int maxSelectMediaNum;
    public long maxVideoSize;
    public int mediaType;
    public int minCcmPickViewHeight;
    public boolean mixSelect;
    public OnDismissListener onDismissListener;
    public boolean previewEnable;
    public ArrayList<Photo> selectLocalMedias;
    public int selectType;
    public boolean showFilterMenu;
    public boolean showGif;
    public boolean showImage;
    public boolean showOrigin;
    public boolean showTakePhoto;
    public boolean showTakeVideo;
    public boolean showVideo;
    public boolean showWaterMark;
    public boolean singleSelect;
    public int sourceType;
    public boolean updateEditPicInPickerView;
    public boolean useLarkCamera;

    /* renamed from: com.bytedance.ee.bear.fileselector.api.FileSelectConfig$c */
    private static class C7788c<T> extends C7787b<T> {
        private C7788c() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ee.bear.fileselector.api.FileSelectConfig$c<T> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: f */
        public T mo30462f(int i) {
            this.f21080a.maxImageCompressSize = i;
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ee.bear.fileselector.api.FileSelectConfig$c<T> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public T mo30463g(boolean z) {
            this.f21080a.enableImageCompress = z;
            return this;
        }
    }

    /* renamed from: com.bytedance.ee.bear.fileselector.api.FileSelectConfig$a */
    private static class C7786a<T> extends C7788c<T> {
        public C7786a() {
            super();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ee.bear.fileselector.api.FileSelectConfig$a<T> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public T mo30445a(int i) {
            this.f21080a.mediaType = i;
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ee.bear.fileselector.api.FileSelectConfig$a<T> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public T mo30448b(int i) {
            this.f21080a.maxImageSize = i;
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ee.bear.fileselector.api.FileSelectConfig$a<T> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        public T mo30450c(int i) {
            this.f21080a.columnCount = i;
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ee.bear.fileselector.api.FileSelectConfig$a<T> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        public T mo30452d(int i) {
            this.f21080a.maxSelectImageNum = i;
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ee.bear.fileselector.api.FileSelectConfig$a<T> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: e */
        public T mo30454e(boolean z) {
            this.f21080a.showOrigin = z;
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ee.bear.fileselector.api.FileSelectConfig$a<T> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public T mo30446a(long j) {
            this.f21080a.maxVideoSize = j;
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ee.bear.fileselector.api.FileSelectConfig$a<T> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public T mo30449b(boolean z) {
            this.f21080a.showVideo = z;
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ee.bear.fileselector.api.FileSelectConfig$a<T> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        public T mo30451c(boolean z) {
            this.f21080a.useLarkCamera = z;
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ee.bear.fileselector.api.FileSelectConfig$a<T> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        public T mo30453d(boolean z) {
            this.f21080a.showGif = z;
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ee.bear.fileselector.api.FileSelectConfig$a<T> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public T mo30447a(boolean z) {
            this.f21080a.showImage = z;
            return this;
        }
    }

    /* renamed from: com.bytedance.ee.bear.fileselector.api.FileSelectConfig$d */
    public static class C7789d extends C7786a<C7789d> {
        public C7789d() {
            mo30460e(2);
        }

        @Override // com.bytedance.ee.bear.fileselector.api.FileSelectConfig.C7787b
        /* renamed from: a */
        public /* bridge */ /* synthetic */ FileSelectConfig mo30455a() {
            return super.mo30455a();
        }

        @Override // com.bytedance.ee.bear.fileselector.api.FileSelectConfig.C7787b
        /* renamed from: f */
        public /* bridge */ /* synthetic */ void mo30461f(boolean z) {
            super.mo30461f(z);
        }

        /* renamed from: a */
        public C7789d mo30464a(IBackToPickerViewListener aVar) {
            this.f21080a.backToPickerViewListener = aVar;
            return this;
        }

        /* renamed from: g */
        public C7789d mo30467g(int i) {
            this.f21080a.actionType = i;
            return this;
        }

        /* renamed from: h */
        public C7789d mo30468h(int i) {
            this.f21080a.ccmPickViewHeight = i;
            return this;
        }

        /* renamed from: i */
        public C7789d mo30470i(int i) {
            this.f21080a.headerViewRes = i;
            return this;
        }

        /* renamed from: j */
        public C7789d mo30472j(boolean z) {
            this.f21080a.enableExternalSelect = z;
            return this;
        }

        /* renamed from: k */
        public C7789d mo30473k(boolean z) {
            this.f21080a.adjustHeightByKeyboard = z;
            return this;
        }

        /* renamed from: l */
        public C7789d mo30474l(boolean z) {
            this.f21080a.isConsumeBackPress = z;
            return this;
        }

        /* renamed from: m */
        public C7789d mo30475m(boolean z) {
            this.f21080a.autoDismiss = z;
            return this;
        }

        /* renamed from: a */
        public C7789d mo30465a(IDialogLifecycle bVar) {
            this.f21080a.dialogLifecycle = bVar;
            return this;
        }

        /* renamed from: h */
        public C7789d mo30469h(boolean z) {
            this.f21080a.isOrigin = z;
            return this;
        }

        /* renamed from: i */
        public C7789d mo30471i(boolean z) {
            this.f21080a.updateEditPicInPickerView = z;
            return this;
        }

        /* renamed from: a */
        public C7789d mo30466a(IHeightChangeListener eVar) {
            this.f21080a.heightChangeListener = eVar;
            return this;
        }
    }

    /* renamed from: com.bytedance.ee.bear.fileselector.api.FileSelectConfig$e */
    public static class C7790e extends C7787b<C7790e> {
        public C7790e() {
            mo30460e(4);
        }

        @Override // com.bytedance.ee.bear.fileselector.api.FileSelectConfig.C7787b
        /* renamed from: a */
        public /* bridge */ /* synthetic */ FileSelectConfig mo30455a() {
            return super.mo30455a();
        }

        @Override // com.bytedance.ee.bear.fileselector.api.FileSelectConfig.C7787b
        /* renamed from: f */
        public /* bridge */ /* synthetic */ void mo30461f(boolean z) {
            super.mo30461f(z);
        }

        /* renamed from: a */
        public C7790e mo30476a(long j) {
            this.f21080a.maxFileSize = j;
            return this;
        }

        /* renamed from: a */
        public C7790e mo30477a(String str) {
            this.f21080a.customSendBtnTips = str;
            return this;
        }
    }

    /* renamed from: com.bytedance.ee.bear.fileselector.api.FileSelectConfig$f */
    public static class C7791f extends C7786a<C7791f> {
        private C7791f() {
            mo30460e(3);
        }

        @Override // com.bytedance.ee.bear.fileselector.api.FileSelectConfig.C7787b
        /* renamed from: a */
        public FileSelectConfig mo30455a() {
            return new FileSelectConfig();
        }

        @Override // com.bytedance.ee.bear.fileselector.api.FileSelectConfig.C7787b
        /* renamed from: f */
        public /* bridge */ /* synthetic */ void mo30461f(boolean z) {
            super.mo30461f(z);
        }

        /* renamed from: g */
        public C7791f mo30478g(int i) {
            this.f21080a.sourceType = i;
            return this;
        }

        /* renamed from: h */
        public C7791f mo30479h(int i) {
            this.f21080a.larkAlbumActionType = i;
            return this;
        }
    }

    public static C7789d ccmAlbumBuilder() {
        return new C7789d();
    }

    public static C7790e filePickerBuilder() {
        return new C7790e();
    }

    public static C7791f fullScreenAlbumBuilder() {
        return new C7791f();
    }

    public static C7792g larkCamaraBuilder() {
        return new C7792g();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.fileselector.api.FileSelectConfig$b */
    public static class C7787b<T> {

        /* renamed from: a */
        protected FileSelectConfig f21080a = new FileSelectConfig();

        /* renamed from: a */
        public FileSelectConfig mo30455a() {
            return new FileSelectConfig();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ee.bear.fileselector.api.FileSelectConfig$b<T> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public T mo30456a(IFileSizeCheckListener cVar) {
            this.f21080a.fileCheckListener = cVar;
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ee.bear.fileselector.api.FileSelectConfig$b<T> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: e */
        public T mo30460e(int i) {
            this.f21080a.selectType = i;
            return this;
        }

        /* renamed from: f */
        public void mo30461f(boolean z) {
            this.f21080a.canDragView = z;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ee.bear.fileselector.api.FileSelectConfig$b<T> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public T mo30457a(IGetContentViewListener dVar) {
            this.f21080a.getContentViewListener = dVar;
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ee.bear.fileselector.api.FileSelectConfig$b<T> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public T mo30458a(OnDismissListener fVar) {
            this.f21080a.onDismissListener = fVar;
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ee.bear.fileselector.api.FileSelectConfig$b<T> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public T mo30459a(IFileSelectListener aVar) {
            this.f21080a.fileSelectListener = aVar;
            return this;
        }
    }

    /* renamed from: com.bytedance.ee.bear.fileselector.api.FileSelectConfig$g */
    public static class C7792g extends C7788c<C7792g> {
        private C7792g() {
            super();
            mo30460e(1);
        }

        @Override // com.bytedance.ee.bear.fileselector.api.FileSelectConfig.C7787b
        /* renamed from: a */
        public /* bridge */ /* synthetic */ FileSelectConfig mo30455a() {
            return super.mo30455a();
        }

        @Override // com.bytedance.ee.bear.fileselector.api.FileSelectConfig.C7787b
        /* renamed from: f */
        public /* bridge */ /* synthetic */ void mo30461f(boolean z) {
            super.mo30461f(z);
        }

        /* renamed from: a */
        public C7792g mo30480a(boolean z) {
            this.f21080a.showTakeVideo = z;
            return this;
        }
    }

    private FileSelectConfig() {
        this.showImage = true;
        this.showVideo = true;
        this.maxSelectImageNum = 9;
        this.maxSelectMediaNum = 9;
        this.columnCount = 4;
        this.showOrigin = true;
        this.previewEnable = true;
        this.useLarkCamera = true;
        this.enableExternalSelect = true;
        this.updateEditPicInPickerView = true;
        this.selectLocalMedias = new ArrayList<>();
        this.canDragView = false;
        this.isConsumeBackPress = false;
        this.selectType = 0;
        this.imageCompressType = 4;
        this.maxImageCompressSize = 2048;
        this.adjustHeightByKeyboard = false;
        this.enableImageCompress = true;
        this.headerViewRes = -1;
        this.headView = null;
        this.showWaterMark = false;
        this.autoDismiss = true;
        this.showTakePhoto = true;
        this.showTakeVideo = false;
        this.showFilterMenu = true;
        this.customSendBtnTips = "";
    }

    private FileSelectConfig(FileSelectConfig fileSelectConfig) {
        this.showImage = true;
        this.showVideo = true;
        this.maxSelectImageNum = 9;
        this.maxSelectMediaNum = 9;
        this.columnCount = 4;
        this.showOrigin = true;
        this.previewEnable = true;
        this.useLarkCamera = true;
        this.enableExternalSelect = true;
        this.updateEditPicInPickerView = true;
        this.selectLocalMedias = new ArrayList<>();
        this.canDragView = false;
        this.isConsumeBackPress = false;
        this.selectType = 0;
        this.imageCompressType = 4;
        this.maxImageCompressSize = 2048;
        this.adjustHeightByKeyboard = false;
        this.enableImageCompress = true;
        this.headerViewRes = -1;
        this.headView = null;
        this.showWaterMark = false;
        this.autoDismiss = true;
        this.showTakePhoto = true;
        this.showTakeVideo = false;
        this.showFilterMenu = true;
        this.customSendBtnTips = "";
        this.showImage = fileSelectConfig.showImage;
        this.showVideo = fileSelectConfig.showVideo;
        this.mixSelect = fileSelectConfig.mixSelect;
        this.maxSelectImageNum = fileSelectConfig.maxSelectImageNum;
        this.maxSelectMediaNum = fileSelectConfig.maxSelectMediaNum;
        this.columnCount = fileSelectConfig.columnCount;
        this.showGif = fileSelectConfig.showGif;
        this.singleSelect = fileSelectConfig.singleSelect;
        ArrayList<Photo> arrayList = fileSelectConfig.selectLocalMedias;
        if (arrayList != null) {
            this.selectLocalMedias = arrayList;
        }
        this.showOrigin = fileSelectConfig.showOrigin;
        this.isOrigin = fileSelectConfig.isOrigin;
        this.previewEnable = fileSelectConfig.previewEnable;
        this.actionType = fileSelectConfig.actionType;
        this.updateEditPicInPickerView = fileSelectConfig.updateEditPicInPickerView;
        this.useLarkCamera = fileSelectConfig.useLarkCamera;
        this.selectType = fileSelectConfig.selectType;
        this.fileSelectListener = fileSelectConfig.fileSelectListener;
        this.fileCheckListener = fileSelectConfig.fileCheckListener;
        this.heightChangeListener = fileSelectConfig.heightChangeListener;
        this.backToPickerViewListener = fileSelectConfig.backToPickerViewListener;
        this.ccmPickViewHeight = fileSelectConfig.ccmPickViewHeight;
        this.minCcmPickViewHeight = fileSelectConfig.minCcmPickViewHeight;
        this.maxVideoSize = fileSelectConfig.maxVideoSize;
        this.maxImageSize = fileSelectConfig.maxImageSize;
        this.maxFileSize = fileSelectConfig.maxFileSize;
        this.imageCompressType = fileSelectConfig.imageCompressType;
        this.maxImageCompressSize = fileSelectConfig.maxImageCompressSize;
        this.adjustHeightByKeyboard = fileSelectConfig.adjustHeightByKeyboard;
        this.sourceType = fileSelectConfig.sourceType;
        this.mediaType = fileSelectConfig.mediaType;
        this.larkAlbumActionType = fileSelectConfig.larkAlbumActionType;
        this.showTakePhoto = fileSelectConfig.showTakePhoto;
        this.showTakeVideo = fileSelectConfig.showTakeVideo;
        this.canDragView = fileSelectConfig.canDragView;
        this.dragView = fileSelectConfig.dragView;
        this.showWaterMark = fileSelectConfig.showWaterMark;
        this.headerViewRes = fileSelectConfig.headerViewRes;
        this.onDismissListener = fileSelectConfig.onDismissListener;
        this.getContentViewListener = fileSelectConfig.getContentViewListener;
        this.isConsumeBackPress = fileSelectConfig.isConsumeBackPress;
        this.showFilterMenu = fileSelectConfig.showFilterMenu;
        this.customSendBtnTips = fileSelectConfig.customSendBtnTips;
        this.dialogLifecycle = fileSelectConfig.dialogLifecycle;
        this.autoDismiss = fileSelectConfig.autoDismiss;
        this.enableImageCompress = fileSelectConfig.enableImageCompress;
    }
}
