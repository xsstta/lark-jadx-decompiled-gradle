package com.ss.android.lark.locationmessage.ui.picklocation;

import android.content.Context;
import android.graphics.Bitmap;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.location.dto.LarkLocation;
import com.ss.android.lark.location.dto.LocationImageData;
import com.ss.android.lark.location.dto.POIInfo;
import com.ss.android.lark.location.p2146b.AbstractC41562e;
import com.ss.android.lark.locationmessage.C41597c;
import com.ss.android.lark.locationmessage.ui.picklocation.C41665b;
import com.ss.android.lark.locationmessage.ui.picklocation.LocationView;
import com.ss.android.lark.log.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

/* renamed from: com.ss.android.lark.locationmessage.ui.picklocation.e */
public class C41673e implements C41665b.AbstractC41666a {

    /* renamed from: a */
    public AbstractC41562e f105838a;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f105838a.mo149560c();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f105838a = C41597c.m165069a().mo143916i().mo143932c();
    }

    @Override // com.ss.android.lark.locationmessage.ui.picklocation.C41665b.AbstractC41666a
    /* renamed from: a */
    public void mo149828a(double d, double d2) {
        this.f105838a.mo149554a(d, d2);
    }

    @Override // com.ss.android.lark.locationmessage.ui.picklocation.C41665b.AbstractC41666a
    /* renamed from: a */
    public void mo149832a(Context context, final LocationView.AbstractC41659b bVar) {
        C41597c.m165069a().mo143916i().mo143928a(context, new C41597c.AbstractC41601a() {
            /* class com.ss.android.lark.locationmessage.ui.picklocation.C41673e.C416741 */

            @Override // com.ss.android.lark.locationmessage.C41597c.AbstractC41601a
            /* renamed from: a */
            public void mo149722a(LarkLocation larkLocation) {
                if (larkLocation != null) {
                    C41673e.this.f105838a.mo149554a(larkLocation.getLatitude(), larkLocation.getLongitude());
                    bVar.mo149818a(C41673e.this.f105838a.mo149553a(), C41673e.this.f105838a.mo149559b());
                    return;
                }
                Log.m165383e("LocationModel", "failed to startLocation. location is null.");
                bVar.mo149817a();
            }
        });
    }

    @Override // com.ss.android.lark.locationmessage.ui.picklocation.C41665b.AbstractC41666a
    /* renamed from: a */
    public void mo149833a(Context context, final LocationView.AbstractC41661d dVar) {
        this.f105838a.mo149556a(context, new AbstractC41562e.AbstractC41565c() {
            /* class com.ss.android.lark.locationmessage.ui.picklocation.C41673e.C416752 */

            @Override // com.ss.android.lark.location.p2146b.AbstractC41562e.AbstractC41565c
            /* renamed from: a */
            public void mo149563a(int i) {
                dVar.mo149815a(i);
            }

            @Override // com.ss.android.lark.location.p2146b.AbstractC41562e.AbstractC41565c
            /* renamed from: a */
            public void mo149564a(List<POIInfo> list) {
                dVar.mo149816a(list);
            }
        });
    }

    @Override // com.ss.android.lark.locationmessage.ui.picklocation.C41665b.AbstractC41666a
    /* renamed from: a */
    public void mo149830a(final Context context, final Bitmap bitmap, final LocationView.AbstractC41662e eVar) {
        if (bitmap != null && eVar != null) {
            CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.locationmessage.ui.picklocation.C41673e.RunnableC416774 */

                public void run() {
                    try {
                        if (bitmap == null) {
                            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                                /* class com.ss.android.lark.locationmessage.ui.picklocation.C41673e.RunnableC416774.RunnableC416781 */

                                public void run() {
                                    eVar.mo149810a();
                                }
                            });
                            return;
                        }
                        File file = new File(context.getExternalCacheDir(), "/lark/location/map");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        final String str = file.getPath() + "/snapshot_temp" + ".png";
                        FileOutputStream fileOutputStream = new FileOutputStream(str);
                        final boolean compress = bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                            /* class com.ss.android.lark.locationmessage.ui.picklocation.C41673e.RunnableC416774.RunnableC416792 */

                            public void run() {
                                if (compress) {
                                    LocationImageData locationImageData = new LocationImageData();
                                    locationImageData.setImagePath(str);
                                    locationImageData.setWidth(bitmap.getWidth());
                                    locationImageData.setHeight(bitmap.getHeight());
                                    eVar.mo149811a(locationImageData);
                                    return;
                                }
                                eVar.mo149810a();
                            }
                        });
                    } catch (Exception e) {
                        Log.m165384e("LocationModel", "failed to saveSnapshot", e);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.lark.locationmessage.ui.picklocation.C41665b.AbstractC41666a
    /* renamed from: a */
    public void mo149831a(Context context, POIInfo pOIInfo, AbstractC41562e.AbstractC41564b bVar) {
        this.f105838a.mo149557a(context, pOIInfo, bVar);
    }

    @Override // com.ss.android.lark.locationmessage.ui.picklocation.C41665b.AbstractC41666a
    /* renamed from: a */
    public void mo149834a(Context context, String str, final LocationView.AbstractC41660c cVar) {
        this.f105838a.mo149558a(context, str, new AbstractC41562e.AbstractC41565c() {
            /* class com.ss.android.lark.locationmessage.ui.picklocation.C41673e.C416763 */

            @Override // com.ss.android.lark.location.p2146b.AbstractC41562e.AbstractC41565c
            /* renamed from: a */
            public void mo149563a(int i) {
                cVar.mo149815a(i);
            }

            @Override // com.ss.android.lark.location.p2146b.AbstractC41562e.AbstractC41565c
            /* renamed from: a */
            public void mo149564a(List<POIInfo> list) {
                cVar.mo149816a(list);
            }
        });
    }

    @Override // com.ss.android.lark.locationmessage.ui.picklocation.C41665b.AbstractC41666a
    /* renamed from: a */
    public void mo149829a(Context context, double d, double d2, final LocationView.AbstractC41658a aVar) {
        this.f105838a.mo149555a(context, d, d2, new AbstractC41562e.AbstractC41563a() {
            /* class com.ss.android.lark.locationmessage.ui.picklocation.C41673e.C416805 */

            @Override // com.ss.android.lark.location.p2146b.AbstractC41562e.AbstractC41563a
            /* renamed from: a */
            public void mo149561a(POIInfo pOIInfo) {
                aVar.mo149809a(pOIInfo);
            }
        });
    }
}
