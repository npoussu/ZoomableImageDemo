package com.macrosoft.zoomableimagedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * Main activity of the application. Contains a zoomable image.
 */
class ZoomableImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zoomable_image)
    }
}
