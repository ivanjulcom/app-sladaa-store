package com.sladaa.store.imagepicker;

public interface ImageCompressionListener {
    void onStart();

    void onCompressed(String filePath);
}
