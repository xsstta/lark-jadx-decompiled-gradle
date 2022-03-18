package com.google.android.datatransport.cct;

import com.google.android.datatransport.runtime.backends.AbstractC21411d;
import com.google.android.datatransport.runtime.backends.AbstractC21416h;
import com.google.android.datatransport.runtime.backends.AbstractC21422m;

public class CctBackendFactory implements AbstractC21411d {
    @Override // com.google.android.datatransport.runtime.backends.AbstractC21411d
    public AbstractC21422m create(AbstractC21416h hVar) {
        return new C21388d(hVar.mo72649a(), hVar.mo72650b(), hVar.mo72651c());
    }
}
