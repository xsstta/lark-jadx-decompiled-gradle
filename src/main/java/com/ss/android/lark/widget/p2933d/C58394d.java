package com.ss.android.lark.widget.p2933d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.file.direct.DirectFileAccess;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.cameraview.AbstractC32798i;
import com.ss.android.lark.cameraview.C32771d;
import com.ss.android.lark.cameraview.C32780e;
import com.ss.android.lark.cameraview.blacklist.CameraTypeBlackListManager;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.ao;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.p2933d.C58394d;
import com.ss.android.lark.widget.photo_picker.C58612c;
import com.ss.android.lark.widget.photo_picker.PickerParams;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.gallery.C58732b;
import com.ss.android.lark.widget.photo_picker.p2951f.C58652c;
import com.ss.android.lark.widget.photo_picker_impl.PhotoPickerInit;
import com.ss.android.lark.widget.photo_picker_impl.base.IDependency;
import com.ss.android.lark.widget.photo_picker_impl.bean.TransationData;
import com.ss.android.lark.widget.photo_picker_impl.model.IPhotoDataFactory;
import com.ss.android.lark.widget.photo_picker_impl.model.PhotoModel;
import com.ss.android.lark.widget.photo_picker_impl.view.base.IShowPluginFactory;
import com.ss.android.lark.widget.photo_picker_impl.view.grid.GridComponent;
import com.ss.android.lark.widget.photo_picker_impl.view.grid.GridShowPlugin;
import com.ss.android.lark.widget.photo_picker_impl.view.large.LargeComponent;
import com.ss.android.lark.widget.photo_picker_impl.view.large.LargeShowPlugin;
import com.ss.android.lark.widget.photo_picker_new.grid.GridBottomToolPlugin;
import com.ss.android.lark.widget.photo_picker_new.grid.GridCameraShowPlugin;
import com.ss.android.lark.widget.photo_picker_new.grid.GridImageShowPlugin;
import com.ss.android.lark.widget.photo_picker_new.grid.GridTopToolPlugin;
import com.ss.android.lark.widget.photo_picker_new.large.LargeBottomToolPlugin;
import com.ss.android.lark.widget.photo_picker_new.large.LargeImageShowPlugin;
import com.ss.android.lark.widget.photo_picker_new.large.LargeTopToolPlugin;
import com.ss.android.lark.widget.photo_picker_new.large.LargeVideoShowPlugin;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.d.d */
public class C58394d extends BaseFragment {

    /* renamed from: a */
    List<SelectablePhoto> f143697a = new ArrayList();

    /* renamed from: b */
    public PickerParams f143698b;

    /* renamed from: c */
    private PhotoPickerInit<SelectablePhoto> f143699c;

    /* renamed from: d */
    private C58652c f143700d;

    /* renamed from: a */
    public void mo197703a(boolean z, boolean z2) {
        final FragmentActivity activity = getActivity();
        if (activity != null) {
            C32771d.m125800a(C58612c.m227290a().mo102859d());
            CameraTypeBlackListManager.f84002a.mo120680a(C58612c.m227290a().mo102861e());
            C32771d.m125799a().mo120697a(C58612c.m227290a().mo102863f());
            int i = z ? 257 : z2 ? 258 : 259;
            File a = DirectFileAccess.m95102a(DirectFileAccess.StorageParams.m95112i().mo93404a(this.mContext).mo93406a(DirectFileAccess.StorageLocation.EXTERNAL).mo93405a(DirectFileAccess.PathType.CACHE));
            new File(a, "photo");
            new File(a, "video");
            C32780e a2 = C32780e.m125818a(i, C57881t.m224653y(activity), C57881t.m224654z(activity), this.f143698b.mo198871h());
            getChildFragmentManager().beginTransaction().add(R.id.camera_view_fragment, a2).addToBackStack(null).commit();
            a2.mo120756a(new AbstractC32798i() {
                /* class com.ss.android.lark.widget.p2933d.C58394d.C583994 */

                @Override // com.ss.android.lark.cameraview.AbstractC32798i
                /* renamed from: a */
                public void mo39842a(int i) {
                }

                @Override // com.ss.android.lark.cameraview.AbstractC32798i
                /* renamed from: a */
                public void mo39841a() {
                    C58394d.this.setResult(0);
                    C58394d.this.mo197704b();
                }

                @Override // com.ss.android.lark.cameraview.AbstractC32798i
                /* renamed from: a */
                public void mo39843a(String str) {
                    Intent intent = new Intent();
                    Photo photo = new Photo();
                    photo.setPath(str);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(photo);
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    arrayList2.add(str);
                    intent.putExtra("KEY_SELECTED_MEDIA", arrayList);
                    intent.putStringArrayListExtra("SELECTED_PHOTOS", arrayList2);
                    intent.putExtra("KEEP_ORIGIN_PHOTO", true);
                    intent.putExtra("KEY_FOR_SEND", true);
                    C58394d.this.setResult(-1, intent);
                    C58394d.this.mo197704b();
                }

                @Override // com.ss.android.lark.cameraview.AbstractC32798i
                /* renamed from: a */
                public void mo39844a(final String str, String str2) {
                    C57865c.m224574a(new C57865c.AbstractC57873d<ArrayList<Photo>>() {
                        /* class com.ss.android.lark.widget.p2933d.C58394d.C583994.C584001 */

                        /* renamed from: a */
                        public ArrayList<Photo> produce() {
                            File file = new File(str);
                            ArrayList<Photo> arrayList = new ArrayList<>();
                            int[] iArr = new int[10];
                            ao.m224298a(str, iArr);
                            int[] a = ao.m224310a(iArr);
                            arrayList.add(new Photo(0, str, "video/mp4", (long) iArr[3], a[0], a[1], file.length()));
                            return arrayList;
                        }
                    }, new C57865c.AbstractC57871b<ArrayList<Photo>>() {
                        /* class com.ss.android.lark.widget.p2933d.C58394d.C583994.C584012 */

                        /* renamed from: a */
                        public void consume(ArrayList<Photo> arrayList) {
                            Intent intent = new Intent();
                            intent.putExtra("KEY_SELECTED_MEDIA", arrayList);
                            intent.putExtra("KEY_HAS_VIDEO", true);
                            intent.putExtra("KEY_FOR_SEND", true);
                            C58394d.this.setResult(-1, intent);
                            C58394d.this.mo197704b();
                        }
                    });
                }
            });
        }
    }

    /* renamed from: a */
    public void mo197701a() {
        if (!this.f143699c.mo199560b()) {
            mo197704b();
        }
    }

    /* renamed from: b */
    public void mo197704b() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            finish();
            activity.overridePendingTransition(R.anim.activity_nothing, R.anim.activity_close_to_bottom);
        }
        PhotoPickerInit<SelectablePhoto> aVar = this.f143699c;
        if (aVar != null) {
            aVar.mo199558a();
        }
    }

    /* renamed from: c */
    private boolean m226391c() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return false;
        }
        this.f143698b = PickerParams.m227539b(arguments);
        ArrayList arrayList = (ArrayList) arguments.getSerializable("ORIGINAL_PHOTOS");
        if (arrayList == null) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f143697a.add(m226386a((Photo) it.next()));
        }
        return true;
    }

    /* renamed from: a */
    private SelectablePhoto m226386a(Photo photo) {
        SelectablePhoto fVar = new SelectablePhoto();
        fVar.mo199592a(Integer.valueOf(photo.getId()));
        fVar.mo199593a(photo.getPath());
        fVar.mo199597b(photo.getMimeType());
        fVar.mo199600c((int) photo.getDuration());
        fVar.mo199590a(photo.getWidth());
        fVar.mo199596b(photo.getHeight());
        fVar.mo199591a(photo.getSize());
        return fVar;
    }

    /* renamed from: a */
    private Photo m226387a(SelectablePhoto fVar) {
        return new Photo(fVar.mo199589a().intValue(), fVar.mo199595b(), fVar.mo199599c(), (long) fVar.mo199605g(), fVar.mo199602d(), fVar.mo199603e(), fVar.mo199604f());
    }

    /* renamed from: a */
    private void m226390a(FrameLayout frameLayout) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            final PhotoPickerViewModel eVar = new PhotoPickerViewModel(this.f143698b);
            boolean z = false;
            if ((!this.f143697a.isEmpty() && this.f143697a.get(0).mo199606h()) || this.f143698b.mo198868e()) {
                z = true;
            }
            eVar.mo197727b(z);
            for (SelectablePhoto fVar : this.f143697a) {
                eVar.mo197723a(fVar, true);
            }
            final PhotoModel<SelectablePhoto> fVar2 = new PhotoModel<>(activity, this.f143698b, new IPhotoDataFactory<SelectablePhoto>() {
                /* class com.ss.android.lark.widget.p2933d.C58394d.C583951 */

                /* renamed from: b */
                public SelectablePhoto mo197705a() {
                    return new SelectablePhoto();
                }

                @Override // com.ss.android.lark.widget.photo_picker_impl.model.IPhotoDataFactory
                /* renamed from: a */
                public List<SelectablePhoto> mo197706a(List<SelectablePhoto> list) {
                    return eVar.mo197722a(list);
                }
            });
            this.f143699c = new PhotoPickerInit().mo199552a(frameLayout).mo199553a(activity).mo199555a(new IDependency() {
                /* class com.ss.android.lark.widget.p2933d.C58394d.C584025 */

                @Override // com.ss.android.lark.widget.photo_picker_impl.base.IDependency
                /* renamed from: a */
                public void mo197718a(TransationData dVar) {
                    boolean z;
                    boolean z2;
                    List<SelectablePhoto> list;
                    if (dVar != null) {
                        list = (List) dVar.mo199620a("selectedPhoto");
                        z2 = ((Boolean) dVar.mo199620a("checkedOrigin")).booleanValue();
                        z = ((Boolean) dVar.mo199620a("isVideo")).booleanValue();
                    } else {
                        list = null;
                        z = false;
                        z2 = false;
                    }
                    C58394d.this.mo197702a(false, list, Boolean.valueOf(z2), Boolean.valueOf(z));
                    C58394d.this.mo197704b();
                }
            }).mo199554a(this.f143698b).mo199557a(fVar2);
            IPhotoSelectedChangedListener r13 = new IPhotoSelectedChangedListener() {
                /* class com.ss.android.lark.widget.p2933d.C58394d.C584036 */

                @Override // com.ss.android.lark.widget.photo_picker_new.IPhotoSelectedChangedListener
                /* renamed from: a */
                public void mo197700a(SelectablePhoto fVar, boolean z, boolean z2) {
                    boolean z3;
                    eVar.mo197723a(fVar, z);
                    if (z) {
                        PhotoPickerViewModel eVar = eVar;
                        if (z2 || C58394d.this.f143698b.mo198868e()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        eVar.mo197727b(z3);
                    }
                    fVar2.mo199763g();
                }
            };
            IOnSendClickListener r10 = new IOnSendClickListener() {
                /* class com.ss.android.lark.widget.p2933d.C58394d.C584047 */

                @Override // com.ss.android.lark.widget.photo_picker_new.IOnSendClickListener
                /* renamed from: a */
                public void mo197678a() {
                    C58394d.this.mo197702a(true, eVar.mo197729c(), Boolean.valueOf(eVar.mo197726a()), Boolean.valueOf(eVar.mo197728b()));
                    C58394d.this.mo197704b();
                }
            };
            this.f143699c.mo199556a(m226388a(activity, eVar, fVar2, r13, r10, new IOnPhotoClickListener() {
                /* class com.ss.android.lark.widget.p2933d.C58394d.C584058 */

                @Override // com.ss.android.lark.widget.photo_picker_new.IOnPhotoClickListener
                /* renamed from: a */
                public void mo197630a(SelectablePhoto fVar) {
                    if (fVar != null) {
                        C58394d.this.mo197702a(true, Collections.singletonList(fVar), Boolean.valueOf(eVar.mo197726a()), Boolean.valueOf(eVar.mo197728b()));
                        C58394d.this.mo197704b();
                    }
                }
            }));
            if (this.f143698b.mo198877n()) {
                this.f143699c.mo199556a(m226389a(supportFragmentManager, eVar, fVar2, r13, r10));
            }
            this.f143699c.mo199561c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f143700d = new C58652c(getActivity());
        m226390a((FrameLayout) view);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (m226391c()) {
            return layoutInflater.inflate(R.layout.__picker_activity_take_pic, viewGroup, false);
        }
        mo197704b();
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            if (i2 == -1) {
                this.f143700d.mo198853b();
                String c = this.f143700d.mo198854c();
                Intent intent2 = new Intent();
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(c);
                Photo photo = new Photo();
                photo.setPath(c);
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add(photo);
                intent2.putExtra("KEY_SELECTED_MEDIA", arrayList2);
                intent2.putStringArrayListExtra("SELECTED_PHOTOS", arrayList);
                setResult(-1, intent2);
                mo197704b();
            } else if (i2 == 0) {
                setResult(0);
                mo197704b();
            }
        } else if (i == 2 && intent != null) {
            this.f143699c.mo199559a(i, i2, intent);
        }
    }

    /* renamed from: a */
    public void mo197702a(boolean z, List<SelectablePhoto> list, Boolean bool, Boolean bool2) {
        if (list == null) {
            list = new ArrayList<>();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        for (SelectablePhoto fVar : list) {
            Photo a = m226387a(fVar);
            arrayList.add(a.getPath());
            arrayList2.add(a);
        }
        boolean booleanValue = bool2.booleanValue();
        Intent intent = new Intent();
        intent.putExtra("KEY_SELECTED_MEDIA", new ArrayList(arrayList2));
        intent.putStringArrayListExtra("SELECTED_PHOTOS", arrayList);
        intent.putExtra("KEEP_ORIGIN_PHOTO", bool);
        intent.putExtra("KEY_HAS_VIDEO", booleanValue);
        intent.putExtra("KEY_FOR_SEND", z);
        setResult(-1, intent);
    }

    /* renamed from: a */
    private LargeComponent<SelectablePhoto> m226389a(FragmentManager fragmentManager, final PhotoPickerViewModel eVar, final PhotoModel<SelectablePhoto> fVar, IPhotoSelectedChangedListener cVar, IOnSendClickListener bVar) {
        return new LargeComponent<>(fragmentManager, new IShowPluginFactory<SelectablePhoto, LargeShowPlugin<SelectablePhoto>>() {
            /* class com.ss.android.lark.widget.p2933d.C58394d.C583962 */

            @Override // com.ss.android.lark.widget.photo_picker_impl.view.base.IShowPluginFactory
            /* renamed from: a */
            public int mo197709a() {
                return C58394d.this.f143698b.mo198878o();
            }

            /* renamed from: b */
            public LargeShowPlugin<SelectablePhoto> mo197712a(int i) {
                if (i == 0) {
                    return new LargeVideoShowPlugin(C58394d.this.mContext);
                }
                return new LargeImageShowPlugin(C58394d.this.mContext, C58394d.this.f143698b.mo198879p(), new C58732b.AbstractC58733a() {
                    /* class com.ss.android.lark.widget.p2933d.C58394d.C583962.C583971 */

                    @Override // com.ss.android.lark.widget.photo_picker.gallery.C58732b.AbstractC58733a
                    /* renamed from: a */
                    public void mo197714a(PhotoItem photoItem) {
                    }

                    @Override // com.ss.android.lark.widget.photo_picker.gallery.C58732b.AbstractC58733a
                    /* renamed from: a */
                    public boolean mo197715a(PhotoItem photoItem, float f, float f2) {
                        return false;
                    }
                });
            }

            /* renamed from: a */
            public int mo197711a(int i, SelectablePhoto fVar) {
                if (fVar.mo199606h()) {
                    return 0;
                }
                return 1;
            }
        }, new LargeTopToolPlugin(this.mContext, this.f143698b, cVar), new LargeBottomToolPlugin(this.mContext, this.f143698b.mo198880q(), new LargeBottomToolPlugin.ISupport() {
            /* class com.ss.android.lark.widget.p2933d.C58394d.C583983 */

            @Override // com.ss.android.lark.widget.photo_picker_new.large.LargeBottomToolPlugin.ISupport
            /* renamed from: a */
            public List<SelectablePhoto> mo197681a() {
                return eVar.mo197729c();
            }

            @Override // com.ss.android.lark.widget.photo_picker_new.large.LargeBottomToolPlugin.ISupport
            /* renamed from: c */
            public boolean mo197686c() {
                return eVar.mo197726a();
            }

            @Override // com.ss.android.lark.widget.photo_picker_new.large.LargeBottomToolPlugin.ISupport
            /* renamed from: b */
            public boolean mo197685b() {
                return C58394d.this.f143698b.mo198875l();
            }

            @Override // com.ss.android.lark.widget.photo_picker_new.large.LargeBottomToolPlugin.ISupport
            /* renamed from: a */
            public void mo197684a(boolean z) {
                eVar.mo197725a(z);
            }

            @Override // com.ss.android.lark.widget.photo_picker_new.large.LargeBottomToolPlugin.ISupport
            /* renamed from: a */
            public void mo197683a(String str, String str2) {
                eVar.mo197724a(str, str2);
                fVar.mo199763g();
            }

            @Override // com.ss.android.lark.widget.photo_picker_new.large.LargeBottomToolPlugin.ISupport
            /* renamed from: a */
            public void mo197682a(int i, String str, String str2) {
                C58612c.m227290a().mo102835a(C58394d.this.mContext, C58394d.this, i, str, str2);
            }
        }, cVar, bVar));
    }

    /* renamed from: a */
    private GridComponent<SelectablePhoto> m226388a(final Activity activity, final PhotoPickerViewModel eVar, final PhotoModel<SelectablePhoto> fVar, final IPhotoSelectedChangedListener cVar, IOnSendClickListener bVar, final IOnPhotoClickListener aVar) {
        GridBottomToolPlugin aVar2;
        C584069 r2 = new IShowPluginFactory<SelectablePhoto, GridShowPlugin<SelectablePhoto, ? extends RecyclerView.ViewHolder>>() {
            /* class com.ss.android.lark.widget.p2933d.C58394d.C584069 */

            @Override // com.ss.android.lark.widget.photo_picker_impl.view.base.IShowPluginFactory
            /* renamed from: a */
            public int mo197709a() {
                return C58394d.this.f143698b.mo198878o();
            }

            /* renamed from: b */
            public GridShowPlugin<SelectablePhoto, ? extends RecyclerView.ViewHolder> mo197712a(int i) {
                if (i == 0) {
                    return new GridCameraShowPlugin(new GridCameraShowPlugin.OnCameraClickListener() {
                        /* class com.ss.android.lark.widget.p2933d.C58394d.C584069.C584071 */

                        public void onClick(View view) {
                            C57805b.m224331b(C58394d.this.getActivity(), new C57805b.AbstractC57809a() {
                                /* class com.ss.android.lark.widget.p2933d.C58394d.C584069.C584071.C584081 */

                                /* access modifiers changed from: private */
                                /* renamed from: a */
                                public /* synthetic */ void m226436a(boolean z) {
                                    if (z) {
                                        boolean z2 = true;
                                        if (C58394d.this.f143698b.mo198865b() != 1) {
                                            z2 = false;
                                        }
                                        C58394d.this.mo197703a(false, z2);
                                    }
                                }

                                @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                                public void permissionGranted(boolean z) {
                                    boolean z2;
                                    if (z) {
                                        if (C58394d.this.f143698b.mo198865b() == 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            C58394d.this.mo197703a(true, false);
                                        } else {
                                            C57805b.m224326a(activity, new C57805b.AbstractC57809a() {
                                                /* class com.ss.android.lark.widget.p2933d.$$Lambda$d$9$1$1$SL7Sfb8gKU5iWf0VwAEQ8kqX4w */

                                                @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                                                public final void permissionGranted(boolean z) {
                                                    C58394d.C584069.C584071.C584081.m271089lambda$SL7Sfb8gKU5iWf0VwAEQ8kqX4w(C58394d.C584069.C584071.C584081.this, z);
                                                }
                                            });
                                        }
                                    }
                                }
                            });
                        }
                    });
                }
                return new GridImageShowPlugin(C58394d.this.mContext, C58394d.this.f143698b, cVar, aVar);
            }

            /* renamed from: a */
            public int mo197711a(int i, SelectablePhoto fVar) {
                if (i != 0 || !C58394d.this.f143698b.mo198882s()) {
                    return 1;
                }
                return 0;
            }
        };
        GridTopToolPlugin dVar = new GridTopToolPlugin(activity, new GridTopToolPlugin.ISupport() {
            /* class com.ss.android.lark.widget.p2933d.C58394d.AnonymousClass10 */

            @Override // com.ss.android.lark.widget.photo_picker_new.grid.GridTopToolPlugin.ISupport
            /* renamed from: a */
            public List<SelectablePhoto> mo197665a() {
                return eVar.mo197729c();
            }

            @Override // com.ss.android.lark.widget.photo_picker_new.grid.GridTopToolPlugin.ISupport
            /* renamed from: b */
            public boolean mo197667b() {
                return eVar.mo197726a();
            }

            @Override // com.ss.android.lark.widget.photo_picker_new.grid.GridTopToolPlugin.ISupport
            /* renamed from: c */
            public boolean mo197668c() {
                return eVar.mo197728b();
            }

            @Override // com.ss.android.lark.widget.photo_picker_new.grid.GridTopToolPlugin.ISupport
            /* renamed from: a */
            public void mo197666a(int i, String str) {
                fVar.mo199760a(i, str);
            }
        });
        if (this.f143698b.mo198866c() != 1 || this.f143698b.mo198869f()) {
            aVar2 = new GridBottomToolPlugin(this.f143698b.mo198880q(), new GridBottomToolPlugin.ISupport() {
                /* class com.ss.android.lark.widget.p2933d.C58394d.AnonymousClass12 */

                @Override // com.ss.android.lark.widget.photo_picker_new.grid.GridBottomToolPlugin.ISupport
                /* renamed from: a */
                public List<SelectablePhoto> mo197640a() {
                    return eVar.mo197729c();
                }

                @Override // com.ss.android.lark.widget.photo_picker_new.grid.GridBottomToolPlugin.ISupport
                /* renamed from: c */
                public boolean mo197643c() {
                    return eVar.mo197726a();
                }

                @Override // com.ss.android.lark.widget.photo_picker_new.grid.GridBottomToolPlugin.ISupport
                /* renamed from: b */
                public boolean mo197642b() {
                    return C58394d.this.f143698b.mo198875l();
                }

                @Override // com.ss.android.lark.widget.photo_picker_new.grid.GridBottomToolPlugin.ISupport
                /* renamed from: a */
                public void mo197641a(boolean z) {
                    eVar.mo197725a(z);
                }
            }, bVar);
        } else {
            aVar2 = null;
        }
        return new GridComponent<SelectablePhoto>(r2, dVar, aVar2) {
            /* class com.ss.android.lark.widget.p2933d.C58394d.AnonymousClass11 */

            @Override // com.ss.android.lark.widget.photo_picker_impl.view.grid.GridComponent, com.ss.android.lark.widget.photo_picker_impl.view.base.Component
            /* renamed from: c */
            public boolean mo197708c() {
                TransationData dVar = new TransationData();
                dVar.mo199621a("selectedPhoto", eVar.mo197729c());
                dVar.mo199621a("checkedOrigin", Boolean.valueOf(eVar.mo197726a()));
                dVar.mo199621a("isVideo", Boolean.valueOf(eVar.mo197728b()));
                mo199639a().mo199635a(this, dVar);
                return true;
            }
        };
    }
}
