package com.bytedance.ee.bear.drive.view.preview.archive;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.bytedance.ee.bear.AbstractC5239d;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.LocalOpenEntity;
import com.bytedance.ee.bear.drive.biz.plugin.PluginException;
import com.bytedance.ee.bear.drive.biz.preview.vc.C6738g;
import com.bytedance.ee.bear.drive.view.preview.archive.ArchivePreviewView;
import com.bytedance.ee.bear.drive.view.preview.archive.C7222a;
import com.bytedance.ee.bear.drive.view.preview.archive.parser.ArchiveTreeDataLoader;
import com.bytedance.ee.bear.drive.view.preview.archive.view.AbstractC7245a;
import com.bytedance.ee.bear.drive.view.preview.archive.view.AbstractC7246b;
import com.bytedance.ee.bear.drive.view.preview.archive.view.AbstractC7247c;
import com.bytedance.ee.bear.drive.view.preview.archive.view.C7248d;
import com.bytedance.ee.bear.drive.view.preview.archive.view.C7249e;
import com.bytedance.ee.bear.drive.view.preview.archive.view.FileTreeRvView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7557g;
import com.bytedance.ee.bear.drive.view.preview.wrapper.ViewOwner;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13672c;
import com.bytedance.ee.util.p718t.C13737d;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.HashMap;
import org.koin.java.KoinJavaComponent;

public class ArchivePreviewView extends AbsPreviewView implements AbstractC7245a {
    public ArchiveTreeDataLoader mArchiveLoader;
    public FileTreeRvView mFileTreeRvView;

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public View getView() {
        return this.mFileTreeRvView;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public boolean onBackPressed() {
        if (!this.mFileTreeRvView.mo28303d() || !this.mFileTreeRvView.mo28302c()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public void show() {
        trackOpenStart();
        this.mFileTreeRvView.setVisibility(0);
        this.mArchiveLoader.mo28272a(new ArchiveTreeDataLoader.LoadCallback() {
            /* class com.bytedance.ee.bear.drive.view.preview.archive.ArchivePreviewView.C72201 */

            @Override // com.bytedance.ee.bear.drive.view.preview.archive.parser.ArchiveTreeDataLoader.LoadCallback
            /* renamed from: a */
            public void mo28245a(AbstractC7246b bVar) {
                ArchivePreviewView.this.trackOpenSuccess("archive_view");
                ArchivePreviewView.this.mFileTreeRvView.setDataProvider(bVar);
                ArchivePreviewView.this.mFileTreeRvView.setContentItemClickListener(ArchivePreviewView.this);
                ArchivePreviewView.this.mFileTreeRvView.setNavigationItemClickListener(new AbstractC7247c() {
                    /* class com.bytedance.ee.bear.drive.view.preview.archive.$$Lambda$ArchivePreviewView$1$m7wfUOmLvWYMzdJGgjtdcQVY7ZU */

                    @Override // com.bytedance.ee.bear.drive.view.preview.archive.view.AbstractC7247c
                    public final boolean onNavigationItemClick(C7249e eVar, C7248d dVar) {
                        return ArchivePreviewView.C72201.this.m28928a(eVar, dVar);
                    }
                });
            }

            @Override // com.bytedance.ee.bear.drive.view.preview.archive.parser.ArchiveTreeDataLoader.LoadCallback
            /* renamed from: a */
            public void mo28246a(Throwable th) {
                if (th instanceof PluginException) {
                    Log.e("Drive_CFPreviewView", "show() onFailed plugin error, show not support preview");
                    ArchivePreviewView.this.mPreviewViewModel.liveInnerUnsupprtPreview().mo5926a(ArchivePreviewView.this.mFileModel.mo29483d());
                    return;
                }
                ArchivePreviewView.this.trackOpenFailed("archive_view", new Throwable("parse archive tree fail. ", th));
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ boolean m28928a(C7249e eVar, C7248d dVar) {
                if (ArchivePreviewView.this.mPreviewViewModel == null) {
                    return false;
                }
                ArchivePreviewView.this.mPreviewViewModel.liveInnerReportMsg().mo28018a(C7557g.m30300a(31));
                return false;
            }
        });
    }

    private void reportClickEvent(boolean z) {
        if (this.mPreviewViewModel != null) {
            if (z) {
                this.mPreviewViewModel.liveInnerReportMsg().mo28018a(C7557g.m30300a(13));
            } else {
                this.mPreviewViewModel.liveInnerReportMsg().mo28018a(C7557g.m30300a(14));
            }
        }
    }

    private void init(Context context, C7553d dVar) {
        this.mFileTreeRvView = new FileTreeRvView(context);
        this.mArchiveLoader = new ArchiveTreeDataLoader(this.mFileModel);
    }

    public ArchivePreviewView(ViewOwner viewOwner, Context context, C7553d dVar, C6738g gVar) {
        super(viewOwner, context, dVar, gVar);
        init(context, dVar);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.archive.view.AbstractC7245a
    public boolean onContentItemClick(C7249e eVar, final C7248d dVar, boolean z, View view) {
        reportClickEvent(z);
        if (!z) {
            if (this.mArchiveLoader.mo28275b()) {
                if (!C13737d.m55693a(800)) {
                    C13479a.m54764b("Drive_CFPreviewView", "onContentItemClick() isValidClick=false");
                    return true;
                }
                if (this.mArchiveLoader.mo28274a()) {
                    Toast.showFailureText(getView().getContext(), (int) R.string.CreationMobile_Docs_decompress_encrypted);
                } else {
                    this.mFileTreeRvView.mo28300a();
                    this.mArchiveLoader.mo28273a(dVar.f19417e, dVar.f19416d, new ArchiveTreeDataLoader.ExtractCallback() {
                        /* class com.bytedance.ee.bear.drive.view.preview.archive.ArchivePreviewView.C72212 */

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public /* synthetic */ void m28931a() {
                            ArchivePreviewView.this.mFileTreeRvView.mo28301b();
                        }

                        @Override // com.bytedance.ee.bear.drive.view.preview.archive.parser.ArchiveTreeDataLoader.ExtractCallback
                        /* renamed from: a */
                        public void mo28248a(Throwable th) {
                            ArchivePreviewView.this.mFileTreeRvView.mo28301b();
                            Toast.showFailureText(ArchivePreviewView.this.getView().getContext(), (int) R.string.Drive_Drive_File_Preview_Failed);
                            m28932a(Log.getStackTraceString(th), false);
                        }

                        @Override // com.bytedance.ee.bear.drive.view.preview.archive.parser.ArchiveTreeDataLoader.ExtractCallback
                        /* renamed from: a */
                        public void mo28247a(String str) {
                            LocalOpenEntity localOpenEntity = new LocalOpenEntity(ArchivePreviewView.this.mFileModel.mo29496o(), ArchivePreviewView.this.mFileModel.mo29479b(), "", dVar.f19414b, C13672c.m55481b(str), new ArrayList(), str);
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("archive_inner_file", true);
                            localOpenEntity.setExtras(bundle);
                            ((AbstractC5239d) KoinJavaComponent.m268610a(AbstractC5239d.class)).mo21092a(ArchivePreviewView.this.getView().getContext(), localOpenEntity);
                            ArchivePreviewView.this.mFileTreeRvView.post(new Runnable() {
                                /* class com.bytedance.ee.bear.drive.view.preview.archive.$$Lambda$ArchivePreviewView$2$cHt8uhsyweKwpUwoXnolOfqgwsU */

                                public final void run() {
                                    ArchivePreviewView.C72212.this.m28931a();
                                }
                            });
                            m28932a("", true);
                        }

                        /* renamed from: a */
                        private void m28932a(String str, boolean z) {
                            int i;
                            if (ArchivePreviewView.this.mPreviewViewModel != null && dVar != null) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("file_type", C13672c.m55481b(dVar.f19417e));
                                hashMap.put("error_message", str);
                                hashMap.put("is_encrypted", Integer.valueOf(ArchivePreviewView.this.mArchiveLoader.mo28274a() ? 1 : 0));
                                if (z) {
                                    i = 0;
                                } else {
                                    i = -1;
                                }
                                hashMap.put("result", Integer.valueOf(i));
                                ArchivePreviewView.this.mPreviewViewModel.liveInnerReportMsg().mo28018a(C7557g.m30301a(30, hashMap));
                            }
                        }
                    });
                }
                return true;
            } else if (dVar instanceof C7222a.C7223a) {
                Toast.showFailureText(this.mContext, C10539a.m43639a(this.mContext, R.string.Drive_Drive_PreviewUnsupportInArchive, ShareHitPoint.f121869d, C13672c.m55481b(((C7222a.C7223a) dVar).f19358a.getName())), 0);
                return true;
            }
        }
        return false;
    }
}
