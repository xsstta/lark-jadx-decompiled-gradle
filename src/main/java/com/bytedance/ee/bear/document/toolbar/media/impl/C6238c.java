package com.bytedance.ee.bear.document.toolbar.media.impl;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import com.bytedance.ee.bear.document.C5627ab;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.fileselector.FileSelectorManager;
import com.bytedance.ee.bear.fileselector.api.FileSelectConfig;
import com.bytedance.ee.bear.fileselector.api.FileType;
import com.bytedance.ee.bear.fileselector.api.IFileSelectListener;
import com.bytedance.ee.bear.fileselector.api.SimpleFileSelectListener;
import com.bytedance.ee.bear.fileselector.bean.FileBean;
import com.bytedance.ee.bear.fileselector.listener.IBackToPickerViewListener;
import com.bytedance.ee.bear.fileselector.listener.IFileSizeCheckListener;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: com.bytedance.ee.bear.document.toolbar.media.impl.c */
public class C6238c extends AbstractC1142af {
    private AbstractC6240a mDelegate;

    /* renamed from: com.bytedance.ee.bear.document.toolbar.media.impl.c$a */
    public interface AbstractC6240a {
        /* renamed from: a */
        void mo25177a();

        /* renamed from: a */
        void mo25178a(List<SelectedMediaItem> list);

        /* renamed from: b */
        boolean mo25179b();
    }

    public AbstractC6240a getDelegate() {
        return this.mDelegate;
    }

    private IBackToPickerViewListener getBackToPickerViewListener() {
        return new IBackToPickerViewListener() {
            /* class com.bytedance.ee.bear.document.toolbar.media.impl.$$Lambda$iJnh38zARVMpq5oX0RKNgKb9XK8 */

            @Override // com.bytedance.ee.bear.fileselector.listener.IBackToPickerViewListener
            public final void onBackToPickerView() {
                C6238c.this.cancelFromMediaSelector();
            }
        };
    }

    private IFileSelectListener getImageSelectListener() {
        return new SimpleFileSelectListener() {
            /* class com.bytedance.ee.bear.document.toolbar.media.impl.C6238c.C62391 */

            @Override // com.bytedance.ee.bear.fileselector.api.IFileSelectListener, com.bytedance.ee.bear.fileselector.api.SimpleFileSelectListener
            /* renamed from: a */
            public void mo18019a(List<? extends FileBean> list) {
                ArrayList arrayList = new ArrayList();
                for (FileBean fileBean : list) {
                    arrayList.add(C6238c.this.files2MediaItems(new File(fileBean.getPath()), fileBean));
                }
                C6238c.this.insertMedias(arrayList);
            }
        };
    }

    public void cancelFromMediaSelector() {
        AbstractC6240a aVar = this.mDelegate;
        if (aVar != null) {
            aVar.mo25177a();
        } else {
            C13479a.m54758a("SelectMediaViewModel", "cancelFromMediaSelector(): fail caused by mDelegate is null");
        }
    }

    public boolean shouldShowVideo() {
        AbstractC6240a aVar = this.mDelegate;
        if (aVar != null) {
            return aVar.mo25179b();
        }
        return false;
    }

    public void setDelegate(AbstractC6240a aVar) {
        this.mDelegate = aVar;
    }

    private IFileSizeCheckListener getImageSizeCheckListener(Context context) {
        return new IFileSizeCheckListener(context) {
            /* class com.bytedance.ee.bear.document.toolbar.media.impl.$$Lambda$c$1tnBPY0pKmrfK1hCvoJgyB60w8 */
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.bytedance.ee.bear.fileselector.listener.IFileSizeCheckListener
            public final void onFileOverSize(FileType fileType) {
                C6238c.lambda$getImageSizeCheckListener$0(this.f$0, fileType);
            }
        };
    }

    public void insertMedias(List<SelectedMediaItem> list) {
        AbstractC6240a aVar = this.mDelegate;
        if (aVar != null) {
            aVar.mo25178a(list);
        } else {
            C13479a.m54758a("SelectMediaViewModel", "insertMedias(): fail caused by mDelegate is null");
        }
    }

    public FileSelectConfig.C7789d getDefaultBuilder(FragmentActivity fragmentActivity) {
        return ((FileSelectConfig.C7789d) ((FileSelectConfig.C7789d) ((FileSelectConfig.C7789d) ((FileSelectConfig.C7789d) ((FileSelectConfig.C7789d) ((FileSelectConfig.C7789d) ((FileSelectConfig.C7789d) ((FileSelectConfig.C7789d) ((FileSelectConfig.C7789d) ((FileSelectConfig.C7789d) FileSelectConfig.ccmAlbumBuilder().mo30450c(4)).mo30453d(true)).mo30447a(true)).mo30473k(true).mo30449b(shouldShowVideo())).mo30451c(true)).mo30448b(20971520)).mo30446a(-2147483648L)).mo30463g(true)).mo30459a(getImageSelectListener())).mo30456a(getImageSizeCheckListener(fragmentActivity))).mo30464a(getBackToPickerViewListener());
    }

    static /* synthetic */ void lambda$getImageSizeCheckListener$0(Context context, FileType fileType) {
        if (FileType.VIDEO.name().equals(fileType.name())) {
            Toast.showFailureText(context, (int) R.string.CreationMobile_Upload_Error_File_TooLarge_Tips);
        } else if (FileType.IMAGE.name().equals(fileType.name())) {
            Toast.showFailureText(context, (int) R.string.CreationMobile_Docs_DocCover_ExceedFileSize_Toast);
        } else {
            Toast.showFailureText(context, (int) R.string.CreationMobile_Docs_Operation_Failed_Tips);
        }
    }

    public SelectedMediaItem files2MediaItems(File file, FileBean fileBean) {
        int i;
        int i2;
        String uuid = UUID.randomUUID().toString();
        if (!fileBean.isVideo()) {
            int[] a = C5627ab.m22837a(file);
            int i3 = a[0];
            i = a[1];
            i2 = i3;
        } else {
            i2 = 0;
            i = 0;
        }
        return new SelectedMediaItem(fileBean.getMimeType(), uuid, file.getPath(), i2, i, fileBean.getDuration(), file.length(), file.getName());
    }

    public void showInsertImageSelectorPanel(FragmentActivity fragmentActivity, FileSelectConfig.C7789d dVar, String str) {
        FileSelectorManager.m31232a(fragmentActivity, fragmentActivity.getSupportFragmentManager(), dVar.mo30455a(), str);
    }
}
