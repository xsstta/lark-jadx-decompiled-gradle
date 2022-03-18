package com.bytedance.ee.bear.middleground.drive.export;

import com.bytedance.ee.bear.middleground.drive.export.C9361b;
import java.io.Serializable;
import java.util.List;

public interface GetDownloadedRangesCallback extends Serializable {
    boolean onError(int i);

    boolean onSuccess(List<C9361b.C9362a> list);
}
