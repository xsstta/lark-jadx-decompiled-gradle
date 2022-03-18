package com.ss.android.lark.keyboard.plugin.tool.photo;

import android.view.View;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PhotoPreviewPickerParam implements Serializable {
    private final int currentPosition;
    private final boolean isKeepOrigin;
    public int mediaType = 3;
    private final int photoCount;
    private final List<Photo> photos;
    private final List<Photo> selectedPhotoPaths;
    private boolean sendMode;
    private final boolean showDeleteButton;
    private final View sourceView;
    private final boolean useTransitionAnim;

    public int getCurrentPosition() {
        return this.currentPosition;
    }

    public int getMediaType() {
        return this.mediaType;
    }

    public int getPhotoCount() {
        return this.photoCount;
    }

    public List<Photo> getPhotos() {
        return this.photos;
    }

    public List<Photo> getSelectedPhotoPaths() {
        return this.selectedPhotoPaths;
    }

    public View getSourceView() {
        return this.sourceView;
    }

    public boolean isKeepOrigin() {
        return this.isKeepOrigin;
    }

    public boolean isSendMode() {
        return this.sendMode;
    }

    public boolean isShowDeleteButton() {
        return this.showDeleteButton;
    }

    public boolean isUseTransitionAnim() {
        return this.useTransitionAnim;
    }

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.PhotoPreviewPickerParam$a */
    public static class C40997a {

        /* renamed from: a */
        private List<Photo> f104301a = new ArrayList();

        /* renamed from: b */
        private int f104302b = 0;

        /* renamed from: c */
        private boolean f104303c = true;

        /* renamed from: d */
        private View f104304d = null;

        /* renamed from: e */
        private boolean f104305e = false;

        /* renamed from: f */
        private int f104306f = 9;

        /* renamed from: g */
        private boolean f104307g = true;

        /* renamed from: h */
        private List<Photo> f104308h = new ArrayList();

        /* renamed from: i */
        private boolean f104309i = true;

        /* renamed from: j */
        private int f104310j = 0;

        /* renamed from: a */
        public PhotoPreviewPickerParam mo147788a() {
            PhotoPreviewPickerParam photoPreviewPickerParam = new PhotoPreviewPickerParam(this.f104301a, this.f104302b, this.f104303c, this.f104304d, this.f104305e, this.f104306f, this.f104307g, this.f104308h, this.f104309i);
            photoPreviewPickerParam.mediaType = this.f104310j;
            return photoPreviewPickerParam;
        }

        /* renamed from: a */
        public C40997a mo147784a(int i) {
            this.f104302b = i;
            return this;
        }

        /* renamed from: b */
        public C40997a mo147789b(int i) {
            this.f104306f = i;
            return this;
        }

        /* renamed from: c */
        public C40997a mo147792c(int i) {
            this.f104310j = i;
            return this;
        }

        /* renamed from: d */
        public C40997a mo147794d(boolean z) {
            this.f104309i = z;
            return this;
        }

        /* renamed from: a */
        public C40997a mo147785a(View view) {
            this.f104304d = view;
            return this;
        }

        /* renamed from: b */
        public C40997a mo147790b(List<Photo> list) {
            this.f104308h = list;
            return this;
        }

        /* renamed from: c */
        public C40997a mo147793c(boolean z) {
            this.f104307g = z;
            return this;
        }

        /* renamed from: a */
        public C40997a mo147786a(List<Photo> list) {
            this.f104301a = list;
            return this;
        }

        /* renamed from: b */
        public C40997a mo147791b(boolean z) {
            this.f104305e = z;
            return this;
        }

        /* renamed from: a */
        public C40997a mo147787a(boolean z) {
            this.f104303c = z;
            return this;
        }
    }

    public PhotoPreviewPickerParam(List<Photo> list, int i, boolean z, View view, boolean z2, int i2, boolean z3, List<Photo> list2, boolean z4) {
        this.photos = list;
        this.currentPosition = i;
        this.showDeleteButton = z;
        this.sourceView = view;
        this.isKeepOrigin = z2;
        this.photoCount = i2;
        this.useTransitionAnim = z3;
        this.selectedPhotoPaths = list2;
        this.sendMode = z4;
    }
}
