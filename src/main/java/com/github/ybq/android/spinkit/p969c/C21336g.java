package com.github.ybq.android.spinkit.p969c;

import com.github.ybq.android.spinkit.p968b.AbstractC21312f;
import com.github.ybq.android.spinkit.p968b.AbstractC21322g;
import com.huawei.hms.location.LocationRequest;

/* renamed from: com.github.ybq.android.spinkit.c.g */
public class C21336g extends AbstractC21322g {
    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21322g
    /* renamed from: s */
    public AbstractC21312f[] mo72492s() {
        return new AbstractC21312f[]{new C21338i(), new C21338i(), new C21338i()};
    }

    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21322g
    /* renamed from: a */
    public void mo72489a(AbstractC21312f... fVarArr) {
        int i = 0;
        while (i < fVarArr.length) {
            AbstractC21312f fVar = fVarArr[i];
            i++;
            fVar.mo72435g(i * LocationRequest.PRIORITY_HD_ACCURACY);
        }
    }
}
